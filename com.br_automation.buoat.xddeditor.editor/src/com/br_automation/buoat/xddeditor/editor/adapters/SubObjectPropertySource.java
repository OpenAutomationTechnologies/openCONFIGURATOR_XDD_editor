/*******************************************************************************
 * @file   SubObjectPropertySource.java
 *
 * @author Sree Hari Vignesh, Kalycito Infotech Private Limited.
 *
 * @copyright (c) 2017, Kalycito Infotech Private Limited
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
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.SubObjectType;
import com.br_automation.buoat.xddeditor.XDD.TObjectAccessType;
import com.br_automation.buoat.xddeditor.XDD.TObjectPDOMapping;
import com.br_automation.buoat.xddeditor.XDD.custom.XDDUtilities;
import com.br_automation.buoat.xddeditor.XDD.impl.TObjectImpl;
import com.br_automation.buoat.xddeditor.XDD.resources.IPowerlinkConstants;
import com.br_automation.buoat.xddeditor.editor.editors.DeviceDescriptionFileEditor;

/**
 * Describes the properties for a POWERLINK sub-object.
 *
 * @see setObjectData
 *
 * @author Sree Hari Vignesh
 *
 */
public class SubObjectPropertySource extends AbstractObjectPropertySource implements IPropertySource {

    public static final String OBJ_SUB_INDEX_ID = "Obj.SubIndexId"; //$NON-NLS-1$
    public static final String OBJ_EDITABLE_SUB_INDEX_ID = "Obj.SubIndexId.Editable"; //$NON-NLS-1$
    public static final String OBJ_SUB_INDEX_LABEL = "Sub-Object ID"; //$NON-NLS-1$
    public static final String SUB_OBJECT_CANNOT_BE_EMPTY = "Sub-object name cannot be empty.";
    public static final String INVALID_OBJECT_NAME = "Invalid object name";
    private static final String DEFAULT_VALUE_EXCEEDS_HIGH_LIMIT = "Default value {0} exceeds the high limit value {1}.";
    private static final String DEFAULT_VALUE_LESS_THAN_LOW_LIMIT = "Default value {0} cannot be lesser than low limit value {1}.";
    private static final String INVALID_SUB_OBJECT_INDEX = "Invalid sub-object index {0}.";
    private static final String SUB_OBJECT_INDEX_ALREADY_EXISTS = "Sub-object index {0} already exists.";
    private static final String VALID_SUB_OBJECT_INDEX = "Enter the sub-object index value within the range (0x01 to 0xFE).";

    public static final String INVALID_CONST_OPTIONAL_MAPPING = "Sub-object with access type 'const' does not allow optional mapping";
    public static final String INVALID_CONST_TPDO_MAPPING = "Sub-object with access type 'const' does not allow TPDO mapping";
    public static final String INVALID_CONST_RPDO_MAPPING = "Sub-object with access type 'const' does not allow RPDO mapping";
    public static final String INVALID_WO_TPDO_MAPPING = "Sub-object with access type 'wo' does not allow TPDO mapping";
    public static final String INVALID_RO_RPDO_MAPPING = "Sub-object with access type 'ro' does not allow RPDO mapping";
    public static final String NO_CHANGE_IN_DATA_TYPE = "No change in data type.";
    public static final String WARNING_ARRAY = "Changing the data type will remove the current values in 'Default value', 'Low limit' and 'High Limit' of all sub-objects in the array.\n\nAre you sure you want to change?";
    public static final String WARNING_NON_ARRAY = "Changing the data type will remove the current values in 'Default value', 'Low limit' and 'High Limit'.\n\nAre you sure you want to change?";
    public boolean SUBOBJECT_DATATYPE_CHANGE_WARNING = false;

    private static final PropertyDescriptor subObjectIdDescriptor = new PropertyDescriptor(OBJ_SUB_INDEX_ID,
            OBJ_SUB_INDEX_LABEL);
    private static final TextPropertyDescriptor subObjectIdEditableDescriptor = new TextPropertyDescriptor(
            OBJ_EDITABLE_SUB_INDEX_ID, OBJ_SUB_INDEX_LABEL);

    static {
        subObjectIdDescriptor.setCategory(IPropertySourceSupport.INITIAL_VALUE_CATEGORY);
        subObjectIdEditableDescriptor.setCategory(IPropertySourceSupport.INITIAL_VALUE_CATEGORY);
    }

    private SubObjectType plkSubObject;
    private TObjectImpl plkObject;

    /**
     * Constructor that describes the property descriptors of POWERLINK sub-object.
     *
     * @param plkSubObject
     *            Instance of PowerlinkSubobject
     */
    public SubObjectPropertySource(final SubObjectType plkSubObject) {
        setSubObjectData(plkSubObject);

        objectIdDescriptor.setCategory(IPropertySourceSupport.INITIAL_VALUE_CATEGORY);
        subObjectIdEditableDescriptor.setValidator(new ICellEditorValidator() {

            @Override
            public String isValid(Object value) {

                return handleSubObjectIndexValue(value);
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

        dataTypeDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);
        editSubObjDataTypeDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);
        editSubObjDataTypeDescriptor.setValidator(new ICellEditorValidator() {

            @Override
            public String isValid(Object value) {

                return handleDataType(value);
            }
        });

        lowLimitDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);
        editSubObjLowLimitDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);
        editSubObjLowLimitDescriptor.setValidator(new ICellEditorValidator() {

            @Override
            public String isValid(Object value) {

                return handleLowLimitValue(value);
            }
        });

        highLimitDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);
        editSubObjHighLimitDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);
        editSubObjHighLimitDescriptor.setValidator(new ICellEditorValidator() {

            @Override
            public String isValid(Object value) {

                return handleHighLimitValue(value);
            }
        });

        accessTypeDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);
        editSubObjAccessTypeDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);
        editSubObjAccessTypeDescriptor.setValidator(new ICellEditorValidator() {

            @Override
            public String isValid(Object value) {

                return handleAccessTypeValue(value);
            }

        });

        defaultValueDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);
        editSubObjDefaultValueDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);
        editSubObjDefaultValueDescriptor.setValidator(new ICellEditorValidator() {

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
        editSubObjPdoMappingDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);
        editSubObjPdoMappingDescriptor.setValidator(new ICellEditorValidator() {

            @Override
            public String isValid(Object value) {

                return handlePdoMappingValue(value);
            }
        });

        objFlagsDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);

        uniqueIDRefDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);

        objectErrorDescriptor.setCategory(IPropertySourceSupport.OBJECT_ATTRIBUTES_CATEGORY);
    }

    /**
     * Validates the selection of data type to reset the values of sub-object
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
                if (plkSubObject.getDataType() != null) {
                    oldDataType = DatatypeConverter.printHexBinary(plkSubObject.getDataType());
                    dataTypeVal = getDataType(oldDataType);
                }
                if (!val.isEmpty()) {

                    if (!dataTypeVal.equalsIgnoreCase(val) && !SUBOBJECT_DATATYPE_CHANGE_WARNING) {
                        String warning = StringUtils.EMPTY;
                        if (plkObject.getObjectType() == OBJECT_TYPE_ARRAY) {
                            warning = WARNING_ARRAY;
                        } else {
                            warning = WARNING_NON_ARRAY;
                        }
                        SUBOBJECT_DATATYPE_CHANGE_WARNING = true;
                        MessageDialog dialog = new MessageDialog(null, "Change Data Type?", null, warning,
                                MessageDialog.WARNING, new String[] { "Yes", "No" }, 1);
                        int result = dialog.open();
                        if (result == 0) {
                            SUBOBJECT_DATATYPE_CHANGE_WARNING = false;
                            return null;
                        } else {
                            SUBOBJECT_DATATYPE_CHANGE_WARNING = false;
                            return NO_CHANGE_IN_DATA_TYPE;
                        }
                    }
                }
            }
        }
        return null;
    }

    /**
     * Validate the object name
     *
     * @param name
     *            Name of object to be validated
     * @return Error message
     */
    protected String handleObjectName(Object name) {
        if (name instanceof String) {
            String nodeName = ((String) name);
            if (nodeName.isEmpty()) {
                return SUB_OBJECT_CANNOT_BE_EMPTY;
            }

            if (nodeName.charAt(0) == ' ') {
                return INVALID_OBJECT_NAME;
            }

        }
        return null;
    }

    private void addSubObjectPropertyDescriptors(List<IPropertyDescriptor> propertyList) {

        propertyList.add(objectIdDescriptor);
        if (plkSubObject.getSubIndex() != null) {
            String index = DatatypeConverter.printHexBinary(plkSubObject.getSubIndex());
            Integer subObjeIndexVal = Integer.valueOf(index, 16);
            if (subObjeIndexVal != 0) {
                propertyList.add(subObjectIdEditableDescriptor);
            } else {
                propertyList.add(subObjectIdDescriptor);
            }
        }
        propertyList.add(objectTypeDescriptor);
        plkObject = (TObjectImpl) plkSubObject.eContainer();
        if (plkObject.getIndex() != null) {
            String index = DatatypeConverter.printHexBinary(plkObject.getIndex());
            Integer objectId = Integer.parseInt(index, 16);
            if ((objectId >= IPowerlinkConstants.COMMUNICATION_PROFILE_START_INDEX)
                    && (objectId <= IPowerlinkConstants.STANDARDISED_DEVICE_PROFILE_END_INDEX)) {
                propertyList.add(editNameDescriptor);
                if (plkSubObject.getName().equalsIgnoreCase(NUMBER_OF_ENTRIES)) {
                    propertyList.remove(editNameDescriptor);
                    propertyList.add(nameDescriptor);
                }
                int subObjIndex = Integer.parseInt(DatatypeConverter.printHexBinary(plkSubObject.getSubIndex()), 16);
                if (plkObject.getDataType() != null || subObjIndex == 0) {
                    if (plkObject.getObjectType() == OBJECT_TYPE_ARRAY
                            || (plkObject.getObjectType() == OBJECT_TYPE_RECORD
                                    && plkSubObject.getName().equalsIgnoreCase(NUMBER_OF_ENTRIES))) {
                        propertyList.add(dataTypeDescriptor);
                    } else {
                        propertyList.add(editSubObjDataTypeDescriptor);
                    }
                } else {
                    propertyList.add(editSubObjDataTypeDescriptor);
                }

                propertyList.add(editSubObjLowLimitDescriptor);
                propertyList.add(editSubObjHighLimitDescriptor);
                propertyList.add(editSubObjAccessTypeDescriptor);
                propertyList.add(editSubObjDefaultValueDescriptor);
                propertyList.add(editSubObjPdoMappingDescriptor);

            } else {
                propertyList.add(nameDescriptor);
                propertyList.add(dataTypeDescriptor);
                propertyList.add(lowLimitDescriptor);
                propertyList.add(highLimitDescriptor);
                propertyList.add(accessTypeDescriptor);
                propertyList.add(defaultValueDescriptor);
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
        return plkSubObject;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyDescriptors()
     */
    @Override
    public IPropertyDescriptor[] getPropertyDescriptors() {
        List<IPropertyDescriptor> propertyList = new ArrayList<>();
        addSubObjectPropertyDescriptors(propertyList);

        IPropertyDescriptor[] propertyDescriptorArray = {};
        propertyDescriptorArray = propertyList.toArray(propertyDescriptorArray);
        return propertyDescriptorArray;
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
                if (plkObject.getIndex() != null) {
                    String index = DatatypeConverter.printHexBinary(plkObject.getIndex());
                    index = "0x" + index;
                    retObj = index;
                }

                break;
            case OBJ_SUB_INDEX_ID:
            case OBJ_EDITABLE_SUB_INDEX_ID:
                if (plkSubObject.getSubIndex() != null) {
                    String index = DatatypeConverter.printHexBinary(plkSubObject.getSubIndex());
                    index = "0x" + index;
                    retObj = index;
                }

                break;
            case OBJ_NAME_ID:
            case OBJ_NAME_EDITABLE_ID:
                retObj = plkSubObject.getName();
                break;

            case OBJ_TYPE_EDITABLE_ID:
                if (plkSubObject.getObjectType() != 0) {
                    String objectType = String.valueOf(plkSubObject.getObjectType());
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
                if (plkSubObject.getObjectType() != 0) {
                    String objectType = String.valueOf(plkSubObject.getObjectType());
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
                if (plkSubObject.getDataType() != null) {
                    String dataType = DatatypeConverter.printHexBinary(plkSubObject.getDataType());
                    String dataTypeVal = getDataType(dataType);
                    retObj = dataTypeVal;
                } else {
                    retObj = StringUtils.EMPTY;
                }
                break;
            case SUB_OBJ_DATATYPE_EDITABLE_ID:
                if (plkSubObject.getDataType() != null) {
                    String dataType = DatatypeConverter.printHexBinary(plkSubObject.getDataType());
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
            case SUB_OBJ_LOW_LIMIT_EDITABLE_ID:
                if (plkSubObject.getLowLimit() != null) {
                    String lowLimit = plkSubObject.getLowLimit();
                    retObj = lowLimit;
                } else {
                    retObj = StringUtils.EMPTY;
                }
                break;
            case OBJ_HIGH_LIMIT_ID:
            case SUB_OBJ_HIGH_LIMIT_EDITABLE_ID:
                if (plkSubObject.getHighLimit() != null) {
                    String highLimit = plkSubObject.getHighLimit();
                    retObj = highLimit;
                } else {
                    retObj = StringUtils.EMPTY;
                }
                break;
            case OBJ_ACCESS_TYPE_ID:
                if (plkSubObject.getAccessType() != null) {
                    retObj = plkSubObject.getAccessType().getName();
                } else {
                    retObj = StringUtils.EMPTY;
                }
                break;
            case SUB_OBJ_ACCESS_TYPE_EDITABLE_ID:
                if (plkSubObject.getAccessType() != null) {
                    String accessType = plkSubObject.getAccessType().getName();
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
            case SUB_OBJ_DEFAULT_VALUE_EDITABLE_ID:
                if (plkSubObject.getDefaultValue() != null) {
                    String defaultValue = plkSubObject.getDefaultValue();
                    retObj = defaultValue;
                } else {
                    retObj = StringUtils.EMPTY;
                }
                break;
            case OBJ_DENOTATION_ID:
            case OBJ_DENOTATION_EDITABLE_ID:
                if (plkSubObject.getDenotation() != null) {
                    retObj = plkSubObject.getDenotation();
                } else {
                    retObj = StringUtils.EMPTY;
                }
                break;
            case OBJ_PDO_MAPPING_ID:
                if (plkSubObject.getPDOmapping() != null) {
                    retObj = plkSubObject.getPDOmapping().getName();
                } else {
                    retObj = StringUtils.EMPTY;
                }
                break;
            case SUB_OBJ_PDO_MAPPING_EDITABLE_ID:
                if (plkSubObject.getPDOmapping() != null) {
                    String pdoMapping = plkSubObject.getPDOmapping().getName();
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
                if (plkSubObject.getObjFlags() != null) {
                    retObj = plkSubObject.getObjFlags();
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
     *
     * Gets the data type of the IEC value
     *
     * @param dataType
     *            Value of selected data type
     * @return data type of IEC value
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
            return "0000";
        }

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
        String highLimit = plkSubObject.getHighLimit();
        String dataTypeVal = DatatypeConverter.printHexBinary(plkSubObject.getDataType());
        String dataType = getDataType(dataTypeVal);
        try {

            if (plkSubObject.getDefaultValue() != null && !plkSubObject.getDefaultValue().isEmpty()) {
                String defaultValue = plkSubObject.getDefaultValue();
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

        return isValidVal(lowLimit, OBJ_LOW_LIMIT_LABEL, dataType);
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
            TObjectAccessType accessType = plkSubObject.getAccessType();
            switch (pdoMappingValue) {
            case "No":
                break;
            case "Default":
                break;
            case "Optional":
                if (accessType == TObjectAccessType.CONST) {
                    return INVALID_CONST_OPTIONAL_MAPPING;
                }
                break;
            case "TPDO":
                if (accessType == TObjectAccessType.CONST) {
                    return INVALID_CONST_TPDO_MAPPING;
                }
                if (accessType == TObjectAccessType.WO) {
                    return INVALID_WO_TPDO_MAPPING;
                }
                break;
            case "RPDO":
                if (accessType == TObjectAccessType.CONST) {
                    return INVALID_CONST_RPDO_MAPPING;
                }
                if (accessType == TObjectAccessType.RO) {
                    return INVALID_RO_RPDO_MAPPING;
                }
                break;
            default:
                break;

            }
        }
        return StringUtils.EMPTY;
    }

    private String handleAccessTypeValue(Object value) {
        if (value instanceof Integer) {
            String accessTypeVlaue = ACCESS_TYPE_LIST[(int) value];
            TObjectPDOMapping pdoMapping = plkSubObject.getPDOmapping();
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
        String lowLimit = plkSubObject.getLowLimit();
        String dataTypeVal = DatatypeConverter.printHexBinary(plkSubObject.getDataType());
        String dataType = getDataType(dataTypeVal);
        try {

            if (plkSubObject.getDefaultValue() != null && !plkSubObject.getDefaultValue().isEmpty()) {
                String defaultValue = plkSubObject.getDefaultValue();
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

                        if (lowlimitVal > highLimitVal) {
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
        if (plkSubObject.getDataType() != null) {
            String dataTypeVal = DatatypeConverter.printHexBinary(plkSubObject.getDataType());
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

                    if (plkSubObject.getHighLimit() != null) {
                        if (!plkSubObject.getHighLimit().isEmpty()) {
                            Long highlimitVal = getValue(plkSubObject.getHighLimit());
                            if (defaultValue > highlimitVal) {
                                return MessageFormat.format(DEFAULT_VALUE_EXCEEDS_HIGH_LIMIT, defaultValue,
                                        highlimitVal);
                            }
                        }
                    }

                    if (plkSubObject.getLowLimit() != null) {
                        if (!plkSubObject.getLowLimit().isEmpty()) {
                            Long lowLimitVal = getValue(plkSubObject.getLowLimit());
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
     * Get TObject PDO mapping value
     *
     * @param pdoMapping
     *            PDO mapping value
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

    private boolean isSubObjectIndexAvailable(String objIndex) {

        List<SubObjectType> subObjectList = plkObject.getSubObject();

        if (!subObjectList.isEmpty()) {
            for (SubObjectType subObject : subObjectList) {
                byte[] index = subObject.getSubIndex();
                String indexValue = DatatypeConverter.printHexBinary(index);
                if (objIndex.contains("0x")) {
                    objIndex = objIndex.substring(2);
                }
                if (objIndex.length() == 1) {
                    objIndex = "0" + objIndex;
                }
                if (indexValue.equalsIgnoreCase(objIndex)) {
                    return false;
                }

            }
        }
        return true;
    }

    private boolean isSubObjectIndexValid(String text) {
        if (!text.isEmpty()) {
            try {
                if (text.contains("0x")) {
                    text = text.substring(2);
                    Long val = Long.parseLong(text, 16);
                    if ((val < MANUFACTURER_PROFILE_SUB_OBJ_START_INDEX)
                            || (val > MANUFACTURER_PROFILE_SUB_OBJ_END_INDEX)) {
                        return false;
                    }
                } else {
                    Long val = Long.parseLong(text, 16);
                    if ((val < MANUFACTURER_PROFILE_SUB_OBJ_START_INDEX)
                            || (val > MANUFACTURER_PROFILE_SUB_OBJ_END_INDEX)) {
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
     * Handles the Sub object index value modifications.
     *
     * @param value
     *            The value to be set.
     * @return Returns a string indicating whether the given value is valid; null
     *         means valid, and non-null means invalid, with the result being the
     *         error message to display to the end user.
     */
    protected String handleSubObjectIndexValue(Object value) {
        String index = (String) value;
        String indexVal = StringUtils.EMPTY;
        if (plkSubObject.getSubIndex() != null) {
            indexVal = DatatypeConverter.printHexBinary(plkSubObject.getSubIndex());
            indexVal = "0x" + indexVal;
        }

        if (index.length() > 4) {
            return MessageFormat.format(INVALID_SUB_OBJECT_INDEX, indexVal);
        }

        if (!indexVal.equalsIgnoreCase(index)) {
            if (!isSubObjectIndexAvailable(index)) {
                return MessageFormat.format(SUB_OBJECT_INDEX_ALREADY_EXISTS, index);
            }
        }

        if (!isSubObjectIndexValid(index)) {
            return VALID_SUB_OBJECT_INDEX;

        }

        return StringUtils.EMPTY;
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
     * sets the value to the Sub-Object Properties
     */
    @Override
    public void setPropertyValue(Object id, Object value) {
        try {

            if (id instanceof String) {
                String objectId = (String) id;

                switch (objectId) {
                case OBJ_EDITABLE_SUB_INDEX_ID:
                    String index = (String) value;
                    if (!index.isEmpty()) {
                        if (index.contains("0x")) {
                            index = index.substring(2);
                            plkSubObject.setSubIndex(DatatypeConverter.parseHexBinary(index));
                        } else {
                            plkSubObject.setSubIndex(DatatypeConverter.parseHexBinary(index));
                        }
                    }
                    break;
                case OBJ_NAME_EDITABLE_ID:
                    String objValue = (String) value;
                    plkSubObject.setName(objValue);
                    break;
                case OBJ_TYPE_EDITABLE_ID:
                    if (value instanceof Integer) {
                        String val = IPowerlinkConstants.OBJECT_TYPES[(int) value];
                        short objectType = getObjectType(val);
                        plkSubObject.setObjectType(objectType);
                    }
                    break;
                case SUB_OBJ_DATATYPE_EDITABLE_ID:
                    if (value instanceof Integer && !SUBOBJECT_DATATYPE_CHANGE_WARNING) {
                        byte[] oldDataType = plkSubObject.getDataType();
                        String val = DATA_TYPE_LIST[(int) value];
                        short objectType = plkObject.getObjectType();
                        if (!val.isEmpty()) {
                            byte[] dataType = DatatypeConverter.parseHexBinary(getDataTypeVal(val));
                            plkSubObject.setDataType(dataType);
                            if (objectType == OBJECT_TYPE_ARRAY) {
                                resetDataType(dataType);
                                resetSubObjValue();
                            }
                        } else {
                            plkSubObject.setDataType(null);
                            if (objectType == OBJECT_TYPE_ARRAY) {
                                plkSubObject.setDataType(oldDataType);
                            }
                        }
                        plkSubObject.setLowLimit(null);
                        plkSubObject.setHighLimit(null);
                        plkSubObject.setDefaultValue(null);
                    }
                    break;
                case SUB_OBJ_LOW_LIMIT_EDITABLE_ID:
                    plkSubObject.setLowLimit((String) value);
                    if (!isValueNullOrEmpty(plkSubObject.getLowLimit())) {
                        plkSubObject.setLowLimit(null);
                    }
                    break;
                case SUB_OBJ_HIGH_LIMIT_EDITABLE_ID:
                    plkSubObject.setHighLimit((String) value);
                    if (!isValueNullOrEmpty(plkSubObject.getHighLimit())) {
                        plkSubObject.setHighLimit(null);
                    }
                    break;
                case SUB_OBJ_ACCESS_TYPE_EDITABLE_ID:
                    if (value instanceof Integer) {
                        String val = ACCESS_TYPE_LIST[(int) value];
                        TObjectAccessType accessType = getAccessType(val);
                        plkSubObject.setAccessType(accessType);
                    }
                    break;
                case SUB_OBJ_DEFAULT_VALUE_EDITABLE_ID:
                    plkSubObject.setDefaultValue((String) value);
                    if (!isValueNullOrEmpty(plkSubObject.getDefaultValue())) {
                        plkSubObject.setDefaultValue(null);
                    }
                    break;
                case OBJ_DENOTATION_EDITABLE_ID:
                    plkSubObject.setDenotation((String) value);
                    break;
                case SUB_OBJ_PDO_MAPPING_EDITABLE_ID:
                    if (value instanceof Integer) {
                        String val = PDO_MAPPING_TYPES[(int) value];
                        TObjectPDOMapping pdoMapping = getPdoMapping(val);
                        plkSubObject.setPDOmapping(pdoMapping);
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
     * Verifies whether the entered value is updated in XDD file
     *
     * @param documentRoot
     *            Instance of XDD file
     * @return <code>True</code> If value is updated in document, <code>False</code>
     *         otherwise.
     */
    public boolean updateDocument(DocumentRoot documentRoot) {

        // Create a resource for this file.
        Resource resource = plkSubObject.eResource();

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

    /**
     * Sets the Instance of PowerlinkSubobject
     *
     * @param adaptableObject
     *            Instance of PowerlinkSubobject.
     */
    public void setSubObjectData(SubObjectType adaptableObject) {
        plkSubObject = adaptableObject;
    }
}
