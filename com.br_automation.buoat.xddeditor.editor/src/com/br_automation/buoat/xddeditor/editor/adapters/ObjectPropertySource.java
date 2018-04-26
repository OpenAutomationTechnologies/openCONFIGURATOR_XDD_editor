/*******************************************************************************
 * @file   ObjectPropertySource.java
 *
 * @author Sree Hari Vignesh, Kalycito Infotech Private Limited.
 *
 * @copyright (c) 2018, Kalycito Infotech Private Limited
 *                    All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *   * Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *   * Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *   * Neither the name of the copyright holders nor the
 *     names of its contributors may be used to endorse or promote products
 *     derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL COPYRIGHT HOLDERS BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *******************************************************************************/

package com.br_automation.buoat.xddeditor.editor.adapters;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.xml.bind.DatatypeConverter;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ICellEditorValidator;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.SubObjectType;
import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.TObjectAccessType;
import com.br_automation.buoat.xddeditor.XDD.TObjectPDOMapping;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;
import com.br_automation.buoat.xddeditor.XDD.custom.XDDUtilities;
import com.br_automation.buoat.xddeditor.XDD.impl.TObjectImpl;
import com.br_automation.buoat.xddeditor.XDD.resources.IPowerlinkConstants;
import com.br_automation.buoat.xddeditor.editor.editors.DeviceDescriptionFileEditor;

/**
 * Describes the properties for a POWERLINK object.
 *
 * @see setObjectData
 * @author Sree Hari Vignesh
 *
 */
public class ObjectPropertySource extends AbstractObjectPropertySource implements IPropertySource {

    private TObjectImpl plkObject;

    public static final String INVALID_OBJECT_TYPE = "Object type cannot be '7 - VAR' for object {0} with sub-objects.";
    public static final String INVALID_ARRAY_OBJECT_TYPE = "Object type cannot be '8 - ARRAY' for object {0} with sub-objects.";
    private static final String EMPTY_OBJECT_NAME = "Object name cannot be empty.";
    private static final String INVALID_OBJECT_NAME = "Invalid object name.";
    private static final String DEFAULT_VALUE_EXCEEDS_HIGH_LIMIT = "Default value {0} exceeds the high limit value {1}.";
    private static final String DEFAULT_VALUE_LESS_THAN_LOW_LIMIT = "Default value {0} cannot be lesser than low limit value {1}.";
    public static final String INVALID_CONST_OPTIONAL_MAPPING = "Object with access type 'const' does not allow optional mapping.";
    public static final String INVALID_CONST_TPDO_MAPPING = "Object with access type 'const' does not allow TPDO mapping.";
    public static final String INVALID_CONST_RPDO_MAPPING = "Object with access type 'const' does not allow RPDO mapping.";
    public static final String INVALID_WO_TPDO_MAPPING = "Object with access type 'wo' does not allow TPDO mapping.";
    public static final String INVALID_RO_RPDO_MAPPING = "Object with access type 'ro' does not allow RPDO mapping.";
    public static final String NO_CHANGE_IN_DATA_TYPE = "No change in data type.";
    public boolean OBJECT_DATATYPE_CHANGE_WARNING = false;
    public boolean OBJECT_TYPE_CHANGE_WARNING = false;

    /**
     * Constructor to initialize the property descriptors for object
     *
     * @param plkObject
     *            Instance of POWERLINK object
     */
    public ObjectPropertySource(final TObjectImpl plkObject) {

        setObjectData(plkObject);

        objectIdDescriptor.setCategory(IPropertySourceSupport.INITIAL_VALUE_CATEGORY);
        editableobjectIdDescriptor.setCategory(IPropertySourceSupport.INITIAL_VALUE_CATEGORY);
        editableobjectIdDescriptor.setValidator(new ICellEditorValidator() {

            @Override
            public String isValid(Object value) {

                return handleObjectIndexValue(value);
            }
        });

        nameDescriptor.setCategory(IPropertySourceSupport.INITIAL_VALUE_CATEGORY);
        editNameDescriptor.setCategory(IPropertySourceSupport.INITIAL_VALUE_CATEGORY);
        editNameDescriptor.setValidator(new ICellEditorValidator() {

            @Override
            public String isValid(Object value) {

                return handleObjectName(value);
            }
        });

        objectTypeDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);
        editObjectTypeDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);
        editObjectTypeDescriptor.setValidator(new ICellEditorValidator() {

            @Override
            public String isValid(Object value) {

                return handleObjectType(value);
            }

        });

        dataTypeDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);
        editDataTypeDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);
        editDataTypeDescriptor.setValidator(new ICellEditorValidator() {

            @Override
            public String isValid(Object value) {

                return handleDataType(value);
            }
        });

        lowLimitDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);
        editLowLimitDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);
        editLowLimitDescriptor.setValidator(new ICellEditorValidator() {

            @Override
            public String isValid(Object value) {

                return handleLowLimitValue(value);
            }
        });

        highLimitDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);
        editHighLimitDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);
        editHighLimitDescriptor.setValidator(new ICellEditorValidator() {

            @Override
            public String isValid(Object value) {

                return handleHighLimitValue(value);
            }
        });

        accessTypeDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);
        editAccessTypeDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);
        editAccessTypeDescriptor.setValidator(new ICellEditorValidator() {

            @Override
            public String isValid(Object value) {

                return handleAccessTypeValue(value);
            }

        });

        defaultValueDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);
        editDefaultValueDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);
        editDefaultValueDescriptor.setValidator(new ICellEditorValidator() {

            @Override
            public String isValid(Object value) {

                return handleDefaultValue(value);
            }
        });

        actualValueReadOnlyDescriptor.setCategory(IPropertySourceSupport.INITIAL_VALUE_CATEGORY);
        actualValueEditableDescriptor.setCategory(IPropertySourceSupport.INITIAL_VALUE_CATEGORY);

        denotationDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);
        editDenotationDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);

        pdoMappingDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);
        editPdoMappingDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);
        editPdoMappingDescriptor.setValidator(new ICellEditorValidator() {

            @Override
            public String isValid(Object value) {

                return handlePdoMappingValue(value);
            }
        });

        objFlagsDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);

        uniqueIDRefDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);

        objectErrorDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);

    }

    private String handleAccessTypeValue(Object value) {
        if (value instanceof Integer) {
            String accessTypeVlaue = ACCESS_TYPE_LIST[(int) value];
            TObjectPDOMapping pdoMapping = plkObject.getPDOmapping();
            switch (accessTypeVlaue) {
            case "Constant":
                if (pdoMapping == TObjectPDOMapping.TPDO) {
                    return INVALID_CONST_TPDO_MAPPING;
                }

                if (pdoMapping == TObjectPDOMapping.RPDO) {
                    return INVALID_CONST_RPDO_MAPPING;
                }
                break;
            case "Read only":
                if (pdoMapping == TObjectPDOMapping.RPDO) {
                    return INVALID_RO_RPDO_MAPPING;
                }
                break;
            case "Write only":
                if (pdoMapping == TObjectPDOMapping.TPDO) {
                    return INVALID_WO_TPDO_MAPPING;
                }
                break;
            case "Read/Write":
                break;
            default:
                break;

            }
        }
        return StringUtils.EMPTY;
    }

    private String handleObjectType(Object value) {
        if (value instanceof Integer) {
            String objectType = IPowerlinkConstants.OBJECT_TYPES[(int) value];

            switch (objectType) {
            case "7 - VAR":
                if ((plkObject != null) && !plkObject.getSubObject().isEmpty() && !OBJECT_TYPE_CHANGE_WARNING) {
                    OBJECT_TYPE_CHANGE_WARNING = true;
                    MessageDialog dialog = new MessageDialog(null, "Warning", null,
                            "Object type cannot be changed to VAR.\n" + plkObject.getName()
                                    + " Object contains sub-indices. "
                                    + "It shall be changed only after deleting the sub-indices.",
                            MessageDialog.WARNING, new String[] { "Close" }, 1);
                    dialog.open();
                    OBJECT_TYPE_CHANGE_WARNING = false;
                    return MessageFormat.format(INVALID_OBJECT_TYPE, plkObject.getName());
                }
                break;
            case "8 - ARRAY":
                HashSet<String> dataTypeList = new HashSet<String>();
                if (!plkObject.getSubObject().isEmpty()) {

                    for (SubObjectType subObj : plkObject.getSubObject()) {
                        String subIndex = DatatypeConverter.printHexBinary(subObj.getSubIndex());

                        if (!subIndex.equalsIgnoreCase("00")) {
                            String dataType = DatatypeConverter.printHexBinary(subObj.getDataType());
                            dataTypeList.add(dataType);
                        }
                    }

                }
                if (dataTypeList.size() > 1) {
                    return MessageFormat.format(INVALID_ARRAY_OBJECT_TYPE, plkObject.getName());
                }
                break;
            case "9 - RECORD":
                break;

            default:
                break;

            }
        }
        return StringUtils.EMPTY;
    }

    /**
     * Validates the selection of data type to reset the values of object
     *
     * @param value
     *            Data type value to be verified
     * @return Error statement
     */
    protected String handleDataType(Object value) {
        if (value instanceof Integer) {
            if ((int) value < 29) {
                String val = DATA_TYPE_LIST[(int) value];
                String oldDataType = StringUtils.EMPTY;
                String dataTypeVal = StringUtils.EMPTY;
                if (plkObject.getDataType() != null) {
                    oldDataType = DatatypeConverter.printHexBinary(plkObject.getDataType());
                    dataTypeVal = getDataType(oldDataType);
                }
                if (!val.isEmpty()) {

                    if (!dataTypeVal.equalsIgnoreCase(val) && !OBJECT_DATATYPE_CHANGE_WARNING) {

                        MessageDialog dialog = new MessageDialog(null, "Change Data Type?", null,
                                "Changing the data type will remove the current values in 'Default value' , 'Low lmit' and 'High Limit'. \n\nAre you sure you want to change?",
                                MessageDialog.WARNING, new String[] { "Yes", "No" }, 1);
                        OBJECT_DATATYPE_CHANGE_WARNING = true;

                        int result = dialog.open();
                        if (result == 0) {
                            OBJECT_DATATYPE_CHANGE_WARNING = false;
                            return null;
                        } else {
                            OBJECT_DATATYPE_CHANGE_WARNING = false;
                            return NO_CHANGE_IN_DATA_TYPE;
                        }
                    }
                }
            }
        }
        return null;
    }

    /**
     * Validates the name of given object in property page
     *
     * @param name
     *            The neme of Object
     * @return proper error message
     */
    protected String handleObjectName(Object name) {
        if (name instanceof String) {
            String nodeName = ((String) name);
            if (nodeName.isEmpty()) {
                return EMPTY_OBJECT_NAME;
            }

            if (nodeName.charAt(0) == ' ') {
                return INVALID_OBJECT_NAME;
            }

        }
        return null;
    }

    private void addObjectPropertyDescriptors(List<IPropertyDescriptor> propertyList) {

        if (plkObject.getIndex() != null) {
            String index = DatatypeConverter.printHexBinary(plkObject.getIndex());
            Integer objectId = Integer.parseInt(index, 16);
            if ((objectId >= IPowerlinkConstants.COMMUNICATION_PROFILE_START_INDEX)
                    && (objectId <= IPowerlinkConstants.STANDARDISED_DEVICE_PROFILE_END_INDEX)) {
                propertyList.add(editableobjectIdDescriptor);
                propertyList.add(editNameDescriptor);
                propertyList.add(editObjectTypeDescriptor);
                propertyList.add(editDataTypeDescriptor);
                if ((plkObject.getObjectType() != OBJECT_TYPE_ARRAY)
                        && (plkObject.getObjectType() != OBJECT_TYPE_RECORD) && (plkObject.getDataType() != null)) {
                    propertyList.add(editLowLimitDescriptor);
                    propertyList.add(editHighLimitDescriptor);
                    propertyList.add(editDefaultValueDescriptor);
                } else {
                    propertyList.remove(editLowLimitDescriptor);
                    propertyList.remove(editHighLimitDescriptor);
                    propertyList.remove(editDefaultValueDescriptor);

                }
                propertyList.add(editAccessTypeDescriptor);
                propertyList.add(editPdoMappingDescriptor);
            } else {
                propertyList.add(objectIdDescriptor);
                propertyList.add(nameDescriptor);
                propertyList.add(objectTypeDescriptor);
                propertyList.add(dataTypeDescriptor);
                if ((plkObject.getObjectType() != OBJECT_TYPE_ARRAY)
                        && (plkObject.getObjectType() != OBJECT_TYPE_RECORD) && (plkObject.getDataType() != null)) {
                    propertyList.add(lowLimitDescriptor);
                    propertyList.add(highLimitDescriptor);
                    propertyList.add(defaultValueDescriptor);
                } else {
                    propertyList.remove(lowLimitDescriptor);
                    propertyList.remove(highLimitDescriptor);
                    propertyList.remove(defaultValueDescriptor);
                }
                propertyList.add(accessTypeDescriptor);
                propertyList.add(pdoMappingDescriptor);
            }
        }

    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.ui.views.properties.IPropertySource#getEditableValue()
     */
    @Override
    public Object getEditableValue() {
        return plkObject;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyDescriptors()
     */
    @Override
    public IPropertyDescriptor[] getPropertyDescriptors() {
        List<IPropertyDescriptor> propertyList = new ArrayList<>();
        addObjectPropertyDescriptors(propertyList);

        IPropertyDescriptor[] propertyDescriptorArray = {};
        propertyDescriptorArray = propertyList.toArray(propertyDescriptorArray);
        return propertyDescriptorArray;
    }

    /**
     * Handles the low limit value modifications.
     *
     * @param value
     *            The value to be set.
     * @return Returns a string indicating whether the given value is valid; null
     *         means valid, and non-null means invalid, with the result being the
     *         error message to display to the end user.
     */
    protected String handleLowLimitValue(Object value) {
        String lowLimit = (String) value;
        String highLimit = plkObject.getHighLimit();
        String dataType = StringUtils.EMPTY;
        try {
            if (plkObject.getDataType() != null) {
                String dataTypeVal = DatatypeConverter.printHexBinary(plkObject.getDataType());
                dataType = getDataType(dataTypeVal);
            }

            if (plkObject.getDefaultValue() != null && !plkObject.getDefaultValue().isEmpty()) {
                String defaultValue = plkObject.getDefaultValue();
                Long defaultVal = getValue(defaultValue);
                if (!lowLimit.isEmpty()) {
                    Long lowlimitVal = getValue(lowLimit);

                    if (defaultVal < lowlimitVal) {
                        return MessageFormat.format(DEFAULT_VALUE_LESS_THAN_LOW_LIMIT, defaultVal, lowlimitVal);
                    }
                }
            }

            if (!getStringDataTypeList().contains(dataType)) {
                if (highLimit != null) {
                    if ((!highLimit.isEmpty()) && (!lowLimit.isEmpty())) {
                        Long highLimitVal = getValue(highLimit);
                        Long lowlimitVal = getValue(lowLimit);

                        if (lowlimitVal > highLimitVal) {
                            return LOW_LIMIT_GREATER_HIGH_LIMIT;

                        }
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return MessageFormat.format(INVALID_VALUE, lowLimit);
        }

        return AbstractObjectPropertySource.isValidVal(lowLimit, OBJ_LOW_LIMIT_LABEL, dataType);
    }

    private boolean isObjectIndexAvailable(String objIndex) {
        List<TObject> tObjects = XDDUtilities.findEObjects(getDocumentRoot(), XDDPackage.eINSTANCE.getTObject());

        for (TObject object : tObjects) {
            byte[] index = object.getIndex();
            String indexValue = DatatypeConverter.printHexBinary(index);
            if (objIndex.contains("0x")) {
                objIndex = objIndex.substring(2);
            }
            if (indexValue.equalsIgnoreCase(objIndex)) {
                return false;
            }
        }
        return true;
    }

    private boolean isObjectIndexValid(String text) {
        if (!text.isEmpty()) {
            try {
                if (text.contains("0x")) {
                    text = text.substring(2);
                    Long val = Long.parseLong(text, 16);
                    if ((val < IPowerlinkConstants.COMMUNICATION_PROFILE_START_INDEX)
                            || (val > IPowerlinkConstants.STANDARDISED_DEVICE_PROFILE_END_INDEX)) {
                        return false;
                    }
                } else {
                    Long val = Long.parseLong(text, 16);
                    if ((val < IPowerlinkConstants.COMMUNICATION_PROFILE_START_INDEX)
                            || (val > IPowerlinkConstants.COMMUNICATION_PROFILE_START_INDEX)) {
                        return false;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }

    /**
     * Handles the object index value modifications.
     *
     * @param value
     *            The value to be set.
     * @return Returns a string indicating whether the given value is valid; null
     *         means valid, and non-null means invalid, with the result being the
     *         error message to display to the end user.
     */
    protected String handleObjectIndexValue(Object value) {
        String index = (String) value;
        String indexVal = StringUtils.EMPTY;
        if (plkObject.getIndex() != null) {
            indexVal = DatatypeConverter.printHexBinary(plkObject.getIndex());
            indexVal = "0x" + indexVal;
        }
        if (!indexVal.equalsIgnoreCase(index)) {
            if (!isObjectIndexAvailable(index)) {
                return MessageFormat.format(OBJECT_ALREADY_EXISTS_ERROR_MESSAGE, index);
            }
        }

        if (!isObjectIndexValid(index)) {
            return VALID_OBJECT_INDEX_RANGE;

        }

        return StringUtils.EMPTY;
    }

    /**
     * Handles the high limit value modifications.
     *
     * @param value
     *            The value to be set.
     * @return Returns a string indicating whether the given value is valid; null
     *         means valid, and non-null means invalid, with the result being the
     *         error message to display to the end user.
     */
    protected String handleHighLimitValue(Object value) {
        String highLimit = (String) value;
        String lowLimit = plkObject.getLowLimit();
        String dataType = StringUtils.EMPTY;
        if (plkObject.getDataType() != null) {
            String dataTypeVal = DatatypeConverter.printHexBinary(plkObject.getDataType());
            dataType = getDataType(dataTypeVal);
        }
        try {

            if (plkObject.getDefaultValue() != null && !plkObject.getDefaultValue().isEmpty()) {
                String defaultValue = plkObject.getDefaultValue();
                Long defaultVal = getValue(defaultValue);
                if (!highLimit.isEmpty()) {
                    Long highLimitVal = getValue(highLimit);

                    if (defaultVal > highLimitVal) {
                        return MessageFormat.format(DEFAULT_VALUE_EXCEEDS_HIGH_LIMIT, defaultVal, highLimitVal);
                    }
                }
            }

            if (!getStringDataTypeList().contains(dataType)) {
                if (lowLimit != null) {

                    if ((!highLimit.isEmpty()) && (!lowLimit.isEmpty())) {
                        Long highLimitVal = getValue(highLimit);
                        Long lowlimitVal = getValue(lowLimit);

                        if (highLimitVal < lowlimitVal) {
                            return LOW_LIMIT_GREATER_HIGH_LIMIT;
                        }
                    }
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            return MessageFormat.format(INVALID_VALUE, highLimit);
        }

        return isValidVal(highLimit, OBJ_HIGH_LIMIT_LABEL, dataType);

    }

    private boolean isValueValid(String value) {
        if (!value.isEmpty()) {
            try {
                if (value.contains("0x")) {
                    value = value.substring(2);
                    Long val = Long.valueOf(value, 16);
                    if (val < 0) {
                        return false;
                    }
                } else {

                    if (value.equalsIgnoreCase("-")) {
                        return false;
                    }
                    if (value.equalsIgnoreCase(" ")) {
                        return false;
                    }

                }
            } catch (Exception ex) {
                ex.printStackTrace();

                return false;
            }
        }
        return true;
    }

    /**
     * Handles the default value modifications.
     *
     * @param value
     *            The value to be set.
     * @return Returns a string indicating whether the given value is valid; null
     *         means valid, and non-null means invalid, with the result being the
     *         error message to display to the end user.
     */
    protected String handleDefaultValue(Object value) {

        String defaultVal = StringUtils.EMPTY;
        String dataType = StringUtils.EMPTY;
        if (plkObject.getDataType() != null) {
            String dataTypeVal = DatatypeConverter.printHexBinary(plkObject.getDataType());
            dataType = getDataType(dataTypeVal);
        }
        try {
            defaultVal = (String) value;
            if (!defaultVal.isEmpty()) {
                if (!isValueValid(defaultVal)) {
                    return MessageFormat.format(INVALID_VALUE, defaultVal);
                }

                if (!getStringDataTypeList().contains(dataType)) {
                    Long defaultValue = getValue(defaultVal);

                    if (plkObject.getHighLimit() != null) {
                        if (!plkObject.getHighLimit().isEmpty()) {
                            Long highlimitVal = getValue(plkObject.getHighLimit());
                            if (defaultValue > highlimitVal) {
                                return MessageFormat.format(DEFAULT_VALUE_EXCEEDS_HIGH_LIMIT, defaultValue,
                                        highlimitVal);
                            }
                        }
                    }

                    if (plkObject.getLowLimit() != null) {
                        if (!plkObject.getLowLimit().isEmpty()) {
                            Long lowLimitVal = getValue(plkObject.getLowLimit());
                            if (defaultValue < lowLimitVal) {
                                return MessageFormat.format(DEFAULT_VALUE_LESS_THAN_LOW_LIMIT, defaultValue,
                                        lowLimitVal);
                            }
                        }
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return MessageFormat.format(INVALID_VALUE, defaultVal);
        }
        return isValidVal(defaultVal, OBJ_DEFAULT_VALUE_LABEL, dataType);
    }

    /**
     * Handles the PDO mapping value modifications.
     *
     * @param value
     *            The value to be set.
     * @return Returns a string indicating whether the given value is valid; null
     *         means valid, and non-null means invalid, with the result being the
     *         error message to display to the end user.
     */
    protected String handlePdoMappingValue(Object value) {
        if (value instanceof Integer) {
            String pdoMappingValue = PDO_MAPPING_TYPES[(int) value];
            TObjectAccessType accessType = plkObject.getAccessType();
            switch (pdoMappingValue) {
            case "No":
                break;
            case "Default":
                break;
            case "Optional":
                if (accessType == TObjectAccessType.CONST) {
                    return MessageFormat.format(OBJECT_ACCESS_TYPE_INVALID_PDO_MAPPING, accessType.getName(),
                            pdoMappingValue);
                }
                break;
            case "TPDO":
                if (accessType == TObjectAccessType.CONST) {
                    return MessageFormat.format(OBJECT_ACCESS_TYPE_INVALID_PDO_MAPPING, accessType.getName(),
                            pdoMappingValue);
                }
                if (accessType == TObjectAccessType.WO) {
                    return MessageFormat.format(OBJECT_ACCESS_TYPE_INVALID_PDO_MAPPING, accessType.getName(),
                            pdoMappingValue);
                }
                break;
            case "RPDO":
                if (accessType == TObjectAccessType.CONST) {
                    return MessageFormat.format(OBJECT_ACCESS_TYPE_INVALID_PDO_MAPPING, accessType.getName(),
                            pdoMappingValue);
                }
                if (accessType == TObjectAccessType.RO) {
                    return MessageFormat.format(OBJECT_ACCESS_TYPE_INVALID_PDO_MAPPING, accessType.getName(),
                            pdoMappingValue);
                }
                break;
            default:
                break;

            }
        }
        return StringUtils.EMPTY;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyValue(java.
     * lang.Object)
     */
    @Override
    public Object getPropertyValue(Object id) {
        Object retObj = null;
        if (id instanceof String) {
            String objectId = (String) id;
            switch (objectId) {
            case OBJ_INDEX_ID:
            case OBJ_INDEX_EDITABLE_ID:
                if (plkObject.getIndex() != null) {
                    String index = DatatypeConverter.printHexBinary(plkObject.getIndex());
                    index = "0x" + index;
                    retObj = index;
                }

                break;
            case OBJ_NAME_ID:
            case OBJ_NAME_EDITABLE_ID:
                retObj = plkObject.getName();
                break;

            case OBJ_TYPE_EDITABLE_ID:
                if (plkObject.getObjectType() != 0) {
                    String objectType = String.valueOf(plkObject.getObjectType());
                    for (int i = 0; i < IPowerlinkConstants.OBJECT_TYPES.length; i++) {
                        if (objectType.equalsIgnoreCase("7")) {
                            return Integer.valueOf(0);

                        }
                        if (objectType.equalsIgnoreCase("8")) {
                            return Integer.valueOf(1);
                        }
                        if (objectType.equalsIgnoreCase("9")) {
                            return Integer.valueOf(2);
                        }
                    }
                }
                break;
            case OBJ_TYPE_ID:
                if (plkObject.getObjectType() != 0) {
                    String objectType = String.valueOf(plkObject.getObjectType());
                    if (objectType.equalsIgnoreCase("7")) {
                        retObj = IPowerlinkConstants.OBJECT_TYPES[0];
                    } else if (objectType.equalsIgnoreCase("8")) {
                        retObj = IPowerlinkConstants.OBJECT_TYPES[1];
                    } else if (objectType.equalsIgnoreCase("9")) {
                        retObj = IPowerlinkConstants.OBJECT_TYPES[2];
                    }
                }
                break;
            case OBJ_DATATYPE_ID:
                if (plkObject.getDataType() != null) {
                    String dataType = DatatypeConverter.printHexBinary(plkObject.getDataType());
                    String dataTypeVal = getDataType(dataType);
                    retObj = dataTypeVal;
                } else {
                    retObj = StringUtils.EMPTY;
                }
                break;
            case OBJ_DATATYPE_EDITABLE_ID:
                if (plkObject.getDataType() != null) {
                    String dataType = DatatypeConverter.printHexBinary(plkObject.getDataType());
                    String dataTypeVal = getDataType(dataType);
                    if (!dataType.isEmpty()) {
                        for (int i = 0; i < DATA_TYPE_LIST.length; i++) {
                            if (DATA_TYPE_LIST[i].equals(dataTypeVal)) {

                                retObj = Integer.valueOf(i);
                                return retObj;
                            }
                        }
                    }
                } else {
                    retObj = Integer.valueOf(29);
                }
                break;
            case OBJ_LOW_LIMIT_ID:
            case OBJ_LOW_LIMIT_EDITABLE_ID:
                if (plkObject.getLowLimit() != null) {
                    String lowLimit = plkObject.getLowLimit();
                    retObj = lowLimit;
                } else {
                    retObj = StringUtils.EMPTY;
                }
                break;
            case OBJ_HIGH_LIMIT_ID:
            case OBJ_HIGH_LIMIT_EDITABLE_ID:
                if (plkObject.getHighLimit() != null) {
                    String highLimit = plkObject.getHighLimit();
                    retObj = highLimit;
                } else {
                    retObj = StringUtils.EMPTY;
                }
                break;
            case OBJ_ACCESS_TYPE_ID:
                if (plkObject.getAccessType() != null) {
                    retObj = plkObject.getAccessType().getName();
                } else {
                    retObj = StringUtils.EMPTY;
                }
                break;
            case OBJ_ACCESS_TYPE_EDITABLE_ID:
                if (plkObject.getAccessType() != null) {
                    String accessType = plkObject.getAccessType().getName();
                    if (accessType.equalsIgnoreCase("Const")) {
                        retObj = Integer.valueOf(0);
                    }
                    if (accessType.equalsIgnoreCase("ro")) {
                        retObj = Integer.valueOf(1);
                    }
                    if (accessType.equalsIgnoreCase("wo")) {
                        retObj = Integer.valueOf(2);
                    }
                    if (accessType.equalsIgnoreCase("rw")) {
                        retObj = Integer.valueOf(3);
                    }
                } else {
                    retObj = Integer.valueOf(4);
                }
                break;
            case OBJ_DEFAULT_VALUE_ID:
            case OBJ_DEFAULT_VALUE_EDITABLE_ID:
                if (plkObject.getDefaultValue() != null) {
                    String defaultValue = plkObject.getDefaultValue();
                    retObj = defaultValue;
                } else {
                    retObj = StringUtils.EMPTY;
                }
                break;
            case OBJ_DENOTATION_ID:
            case OBJ_DENOTATION_EDITABLE_ID:
                if (plkObject.getDenotation() != null) {
                    retObj = plkObject.getDenotation();
                } else {
                    retObj = StringUtils.EMPTY;
                }
                break;
            case OBJ_PDO_MAPPING_ID:
                if (plkObject.getPDOmapping() != null) {
                    retObj = plkObject.getPDOmapping().getName();
                } else {
                    retObj = StringUtils.EMPTY;
                }
                break;
            case OBJ_PDO_MAPPING_EDITABLE_ID:
                if (plkObject.getPDOmapping() != null) {
                    String pdoMapping = plkObject.getPDOmapping().getName();
                    if (pdoMapping.equalsIgnoreCase("no")) {
                        retObj = Integer.valueOf(0);

                    } else if (pdoMapping.equalsIgnoreCase("default")) {
                        retObj = Integer.valueOf(1);
                    } else if (pdoMapping.equalsIgnoreCase("optional")) {
                        retObj = Integer.valueOf(2);
                    } else if (pdoMapping.equalsIgnoreCase("tpdo")) {
                        retObj = Integer.valueOf(3);
                    } else if (pdoMapping.equalsIgnoreCase("rpdo")) {
                        retObj = Integer.valueOf(4);
                    }
                } else {
                    retObj = Integer.valueOf(5);
                }
                break;
            case OBJ_OBJFLAGS_ID:
            case OBJ_OBJFLAGS_EDITABLE_ID:
                if (plkObject.getObjFlags() != null) {
                    retObj = plkObject.getObjFlags();
                } else {
                    retObj = StringUtils.EMPTY;
                }
                break;
            default:
                break;
            }
        }
        return retObj;
    }

    /**
     * Verifies the object belonging to module.
     *
     * @return <true> if it is a module object, <false> if it is a object of node.
     */
    public boolean isModuleObject() {
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.ui.views.properties.IPropertySource#isPropertySet(java.lang.
     * Object)
     */
    @Override
    public boolean isPropertySet(Object id) {
        return true;
    }

    /**
     * Gets the value of IEC data type
     *
     * @param dataType
     *            Value of selected data type
     * @return IEC value of data type
     */
    public String getDataTypeVal(String dataType) {
        switch (dataType) {
        case "Boolean":
            return "0001";
        case "Integer8":
            return "0002";
        case "Integer16":
            return "0003";
        case "Integer32":
            return "0004";
        case "Unsigned8":
            return "0005";
        case "Unsigned16":
            return "0006";
        case "Unsigned32":
            return "0007";
        case "Real32":
            return "0008";
        case "Visible_String":
            return "0009";
        case "Integer24":
            return "0010";
        case "Real64":
            return "0011";
        case "Integer40":
            return "0012";
        case "Integer48":
            return "0013";
        case "Integer56":
            return "0014";
        case "Integer64":
            return "0015";
        case "Octet_String":
            return "000A";
        case "Unicode_String":
            return "000B";
        case "Time_of_Day":
            return "000C";
        case "Time_Diff":
            return "000D";
        case "Domain":
            return "000F";
        case "Unsigned24":
            return "0016";
        case "Unsigned40":
            return "0018";
        case "Unsigned48":
            return "0019";
        case "Unsigned56":
            return "001A";
        case "Unsigned64":
            return "001B";
        case "MAC_ADDRESS":
            return "0401";
        case "IP_ADDRESS":
            return "0402";
        case "NETTIME":
            return "0403";

        default:
            return "0000";
        }

    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.ui.views.properties.IPropertySource#resetPropertyValue(java.
     * lang.Object)
     */
    @Override
    public void resetPropertyValue(Object id) {
        // TODO: Implement reset default value property.
    }

    /**
     * Sets the POWERLINK object instance
     *
     * @param adaptableObject
     *            Instance of PowerlinkObject
     */
    public void setObjectData(TObjectImpl adaptableObject) {
        plkObject = adaptableObject;

    }

    /**
     * Gets the data type of IEC value
     *
     * @param dataType
     *            Value of selected data type
     * @return Data type of IEC value
     */
    public String getDataType(String dataType) {
        switch (dataType) {

        case "0001":
            return "Boolean";

        case "0002":
            return "Integer8";

        case "0003":
            return "Integer16";

        case "0004":
            return "Integer32";

        case "0005":
            return "Unsigned8";

        case "0006":
            return "Unsigned16";

        case "0007":
            return "Unsigned32";

        case "0008":
            return "Real32";

        case "0009":
            return "Visible_String";

        case "0010":
            return "Integer24";

        case "0011":
            return "Real64";

        case "0012":
            return "Integer40";

        case "0013":
            return "Integer48";

        case "0014":
            return "Integer56";

        case "0015":
            return "Integer64";

        case "000A":
            return "Octet_String";

        case "000B":
            return "Unicode_String";

        case "000C":
            return "Time_of_Day";

        case "000D":
            return "Time_Diff";

        case "000F":
            return "Domain";

        case "0016":
            return "Unsigned24";

        case "0018":
            return "Unsigned40";

        case "0019":
            return "Unsigned48";

        case "001A":
            return "Unsigned56";

        case "001B":
            return "Unsigned64";

        case "0401":
            return "MAC_ADDRESS";

        case "0402":
            return "IP_ADDRESS";

        case "0403":
            return "NETTIME";
        default:
            return StringUtils.EMPTY;
        }

    }

    /**
     * Get the value of given object type
     *
     * @param objectTypeText
     *            Name of object type
     * @return numeric value of object type
     */
    public short getObjectType(String objectTypeText) {

        if (objectTypeText.equalsIgnoreCase(IPowerlinkConstants.OBJECT_TYPES[0])) {
            return 7;
        }
        if (objectTypeText.equalsIgnoreCase(IPowerlinkConstants.OBJECT_TYPES[1])) {
            return 8;
        }

        if (objectTypeText.equalsIgnoreCase(IPowerlinkConstants.OBJECT_TYPES[2])) {
            return 9;
        }
        return 0;
    }

    /**
     * Get the TObjectaccess type of given value
     *
     * @param accessType
     *            Name of selected access type
     * @return TObjectAcess type value
     */
    public TObjectAccessType getAccessType(String accessType) {

        if (accessType.equalsIgnoreCase("Constant")) {
            return TObjectAccessType.CONST;
        }
        if (accessType.equalsIgnoreCase("Read only")) {
            return TObjectAccessType.RO;
        }
        if (accessType.equalsIgnoreCase("Write only")) {
            return TObjectAccessType.WO;
        }
        if (accessType.equalsIgnoreCase("Read/Write")) {
            return TObjectAccessType.RW;
        }
        return TObjectAccessType.CONST;
    }

    /**
     * Get the TObject PDO mapping value based on selected PDO mapping in property
     * page
     *
     * @param pdoMapping
     *            Value of PDO
     * @return TObjectPDOMapping
     */
    public TObjectPDOMapping getPdoMapping(String pdoMapping) {

        if (pdoMapping.equalsIgnoreCase("No")) {
            return TObjectPDOMapping.NO;
        }
        if (pdoMapping.equalsIgnoreCase("Default")) {
            return TObjectPDOMapping.DEFAULT;
        }
        if (pdoMapping.equalsIgnoreCase("Optional")) {
            return TObjectPDOMapping.OPTIONAL;
        }
        if (pdoMapping.equalsIgnoreCase("TPDO")) {
            return TObjectPDOMapping.TPDO;
        }
        if (pdoMapping.equalsIgnoreCase("RPDO")) {
            return TObjectPDOMapping.RPDO;
        }
        return TObjectPDOMapping.DEFAULT;
    }

    /**
     * Reset the datatype of all the sub-Objects with the new modified datatype
     *
     * @param dataType
     */
    private void resetDataType(byte[] dataType) {
        if (plkObject != null && plkObject.getSubObject().size() > INITIAL_SUB_INDEX_VALUE) {
            for (SubObjectType subObj : plkObject.getSubObject()) {
                int subObjindex = Integer.parseInt(DatatypeConverter.printHexBinary(subObj.getSubIndex()), 16);
                if (subObjindex != NUMBER_OF_ENTRIES_SUBINDEX_VALUE) {
                    subObj.setDataType(dataType);
                }
            }
        }
    }

    /**
     * Reset the High limit, Low limit, and Default value of all the sub-Objects
     */
    private void resetSubObjValue() {
        if (plkObject != null && plkObject.getSubObject().size() > INITIAL_SUB_INDEX_VALUE) {
            for (SubObjectType subObj : plkObject.getSubObject()) {
                int subObjindex = Integer.parseInt(DatatypeConverter.printHexBinary(subObj.getSubIndex()), 16);
                if (subObjindex != NUMBER_OF_ENTRIES_SUBINDEX_VALUE) {
                    subObj.setDefaultValue(null);
                    subObj.setLowLimit(null);
                    subObj.setHighLimit(null);
                }
            }
        }
    }

    /**
     * Sets the value to the Object Properties
     */
    @Override
    public void setPropertyValue(Object id, Object value) {

        try {
            if (id instanceof String) {
                String objectId = (String) id;

                switch (objectId) {
                case OBJ_INDEX_EDITABLE_ID:
                    String index = (String) value;
                    if (!index.isEmpty()) {
                        if (index.contains("0x")) {
                            index = index.substring(2);
                            plkObject.setIndex(DatatypeConverter.parseHexBinary(index));
                        } else {
                            plkObject.setIndex(DatatypeConverter.parseHexBinary(index));
                        }
                    }
                    break;
                case OBJ_NAME_EDITABLE_ID:
                    String objValue = (String) value;
                    plkObject.setName(objValue);
                    break;
                case OBJ_TYPE_EDITABLE_ID:
                    if (value instanceof Integer && !OBJECT_TYPE_CHANGE_WARNING) {
                        String val = IPowerlinkConstants.OBJECT_TYPES[(int) value];
                        short objectType = getObjectType(val);
                        plkObject.setObjectType(objectType);
                    }
                    break;
                case OBJ_DATATYPE_EDITABLE_ID:
                    if (value instanceof Integer && !OBJECT_DATATYPE_CHANGE_WARNING) {
                        String val = DATA_TYPE_LIST[(int) value];
                        short objectType = plkObject.getObjectType();
                        if (!val.isEmpty()) {
                            byte[] dataType = DatatypeConverter.parseHexBinary(getDataTypeVal(val));
                            plkObject.setDataType(dataType);
                            if (objectType == OBJECT_TYPE_ARRAY) {
                                resetDataType(dataType);
                                resetSubObjValue();
                            }
                        } else {
                            plkObject.setDataType(null);
                        }
                        /**
                         * To remove the Lowlimit, Highlimit, Default attribute in the XDD file
                         */
                        plkObject.setLowLimit(null);
                        plkObject.setHighLimit(null);
                        plkObject.setDefaultValue(null);
                    }
                    break;
                case OBJ_LOW_LIMIT_EDITABLE_ID:
                    plkObject.setLowLimit((String) value);
                    if (!isValueNullOrEmpty(plkObject.getLowLimit())) {
                        plkObject.setLowLimit(null);
                    }
                    break;
                case OBJ_HIGH_LIMIT_EDITABLE_ID:
                    plkObject.setHighLimit((String) value);
                    if (!isValueNullOrEmpty(plkObject.getHighLimit())) {
                        plkObject.setHighLimit(null);
                    }
                    break;
                case OBJ_ACCESS_TYPE_EDITABLE_ID:
                    if (value instanceof Integer) {
                        String val = ACCESS_TYPE_LIST[(int) value];
                        TObjectAccessType accessType = getAccessType(val);
                        plkObject.setAccessType(accessType);
                    }
                    break;
                case OBJ_DEFAULT_VALUE_EDITABLE_ID:
                    plkObject.setDefaultValue((String) value);
                    if (!isValueNullOrEmpty(plkObject.getDefaultValue())) {
                        plkObject.setDefaultValue(null);
                    }
                    break;
                case OBJ_DENOTATION_EDITABLE_ID:
                    plkObject.setDenotation((String) value);
                    break;
                case OBJ_PDO_MAPPING_EDITABLE_ID:
                    if (value instanceof Integer) {
                        String val = PDO_MAPPING_TYPES[(int) value];
                        TObjectPDOMapping pdoMapping = getPdoMapping(val);
                        plkObject.setPDOmapping(pdoMapping);
                    }
                    break;

                default:
                    // others are not editable.
                    break;
                }
                updateDocument(getDocumentRoot());

                Display.getDefault().asyncExec(new Runnable() {

                    @Override
                    public void run() {
                        IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
                                .getActiveEditor();
                        if (editorPart instanceof DeviceDescriptionFileEditor) {
                            DeviceDescriptionFileEditor edit = (DeviceDescriptionFileEditor) editorPart;
                            edit.getobjectDictionaryEditorpage().handleRefresh();
                        }

                    }

                });

            }

        } catch (RuntimeException e) {
            // RunTimeException is caught whenever an exception is caught during
            // run time to avoid unnecessary caught of exceptions.
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * @return The instance of document root
     */
    public DocumentRoot getDocumentRoot() {

        IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();

        IEditorInput input = editorPart.getEditorInput();

        IFileEditorInput fileInput = (IFileEditorInput) input;
        IFile projectFile = fileInput.getFile();

        DocumentRoot root = null;
        try {

            URL url = projectFile.getLocationURI().toURL();
            root = XDDUtilities.loadXDD(url);

        } catch (MalformedURLException e1) {
            e1.printStackTrace();
        }
        return root;
    }

    /**
     * Updates the object into XDD file
     *
     * @param documentRoot
     *            Instance of document root
     * @return <code>True</code> if document is updated, <code>False</code>
     *         otherwise
     */
    public boolean updateDocument(DocumentRoot documentRoot) {

        // Create a resource for this file.
        Resource resource = plkObject.eResource();

        // Add the initial model object to the contents.
        EObject rootObject = documentRoot;
        if (rootObject != null)
            resource.getContents().add(rootObject);

        // Save the contents of the resource to the file system
        Map<Object, Object> options = new HashMap<Object, Object>();
        options.put(XMLResource.OPTION_ENCODING, "UTF-8");
        try {
            resource.save(options);
            return true;
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        return false;
    }
}
