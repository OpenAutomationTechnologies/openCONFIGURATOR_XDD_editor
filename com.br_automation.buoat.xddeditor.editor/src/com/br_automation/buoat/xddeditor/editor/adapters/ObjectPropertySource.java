/*******************************************************************************
 * @file   ObjectPropertySource.java
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

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.DatatypeConverter;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.viewers.ICellEditorValidator;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySheetEntry;
import org.eclipse.ui.views.properties.IPropertySource;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.TObjectAccessType;
import com.br_automation.buoat.xddeditor.XDD.TObjectPDOMapping;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;
import com.br_automation.buoat.xddeditor.XDD.custom.XDDUtilities;
import com.br_automation.buoat.xddeditor.XDD.impl.TObjectImpl;
import com.br_automation.buoat.xddeditor.XDD.resources.IPowerlinkConstants;
import com.br_automation.buoat.xddeditor.XDD.wizards.DataTypeRange;

/**
 * Describes the properties for a POWERLINK object.
 *
 * @see setObjectData
 * @author Sree Hari Vignesh
 *
 */
public class ObjectPropertySource extends AbstractObjectPropertySource implements IPropertySource {

    private static final String[] EXPERT_FILTER_FLAG = { IPropertySheetEntry.FILTER_ID_EXPERT };
    private TObjectImpl plkObject;

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

        dataTypeDescriptor.setCategory(IPropertySourceSupport.INITIAL_VALUE_CATEGORY);
        editDataTypeDescriptor.setCategory(IPropertySourceSupport.INITIAL_VALUE_CATEGORY);

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

        defaultValueDescriptor.setCategory(IPropertySourceSupport.INITIAL_VALUE_CATEGORY);
        editDefaultValueDescriptor.setCategory(IPropertySourceSupport.INITIAL_VALUE_CATEGORY);
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

    protected String handleObjectName(Object name) {
        if (name instanceof String) {
            String nodeName = ((String) name);
            if (nodeName.isEmpty()) {
                return "Object name cannot be empty.";
            }

            if (nodeName.charAt(0) == ' ') {
                return "Invalid object name";
            }

        } else {
            System.err.println("handleObjectName: Invalid value type:" + name);
        }
        return null;
    }

    private void addObjectPropertyDescriptors(List<IPropertyDescriptor> propertyList) {

        if (plkObject.getIndex() != null) {
            String index = DatatypeConverter.printHexBinary(plkObject.getIndex());
            Integer objectId = Integer.parseInt(index, 16);
            if ((objectId >= IPowerlinkConstants.MANUFACTURER_PROFILE_START_INDEX)
                    && (objectId <= IPowerlinkConstants.MANUFACTURER_PROFILE_END_INDEX)) {
                propertyList.add(editableobjectIdDescriptor);
                propertyList.add(editNameDescriptor);
                propertyList.add(editObjectTypeDescriptor);
                propertyList.add(dataTypeDescriptor);
                propertyList.add(editLowLimitDescriptor);
                propertyList.add(editHighLimitDescriptor);
                propertyList.add(editAccessTypeDescriptor);
                propertyList.add(editDefaultValueDescriptor);
                propertyList.add(editPdoMappingDescriptor);
            } else {
                propertyList.add(objectIdDescriptor);
                propertyList.add(nameDescriptor);
                propertyList.add(objectTypeDescriptor);
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
        return plkObject;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.ui.views.properties.IPropertySource#getPropertyDescriptors()
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
     * @return Returns a string indicating whether the given value is valid;
     *         null means valid, and non-null means invalid, with the result
     *         being the error message to display to the end user.
     */
    protected String handleLowLimitValue(Object value) {
        String lowLimit = (String) value;
        String highLimit = plkObject.getHighLimit();
        try {
            if (highLimit != null) {
                if ((!highLimit.isEmpty()) && (!lowLimit.isEmpty()))
                    if (Integer.parseInt(lowLimit) > Integer.parseInt(highLimit)) {
                        return "Low limit cannot be greater than high limit.";

                    }
            }
        } catch (NumberFormatException ex) {
            return "The value '" + lowLimit + "' is invalid.";
        }

        return isValidVal(lowLimit, "low value");
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
                    Integer val = Integer.parseInt(text, 16);
                    if ((val < IPowerlinkConstants.MANUFACTURER_PROFILE_START_INDEX)
                            || (val > IPowerlinkConstants.MANUFACTURER_PROFILE_END_INDEX)) {
                        return false;
                    }
                } else {
                    Integer val = Integer.parseInt(text, 16);
                    if ((val < IPowerlinkConstants.MANUFACTURER_PROFILE_START_INDEX)
                            || (val > IPowerlinkConstants.MANUFACTURER_PROFILE_END_INDEX)) {
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
     * @return Returns a string indicating whether the given value is valid;
     *         null means valid, and non-null means invalid, with the result
     *         being the error message to display to the end user.
     */
    protected String handleObjectIndexValue(Object value) {
        String index = (String) value;
        if (!isObjectIndexAvailable(index)) {
            return "Object index '" + index + "' already available.";
        }

        if (!isObjectIndexValid(index)) {
            return "Enter the object index value within the range (0x2000 to 0x5FFF).";

        }

        return StringUtils.EMPTY;
    }

    /**
     * Handles the high limit value modifications.
     *
     * @param value
     *            The value to be set.
     * @return Returns a string indicating whether the given value is valid;
     *         null means valid, and non-null means invalid, with the result
     *         being the error message to display to the end user.
     */
    protected String handleHighLimitValue(Object value) {
        String highLimit = (String) value;
        String lowLimit = plkObject.getHighLimit();
        try {
            if (lowLimit != null) {
                if ((!highLimit.isEmpty()) && (!lowLimit.isEmpty()))
                    if (Integer.parseInt(highLimit) > Integer.parseInt(lowLimit)) {
                        return "Low limit cannot be greater than high limit.";

                    }
            }
        } catch (NumberFormatException ex) {
            return "The value '" + highLimit + "' is invalid.";
        }

        return isValidVal(highLimit, "high value");

    }

    private boolean isValueValid(String value) {
        if (!value.isEmpty()) {
            try {
                if (value.contains("0x")) {
                    value = value.substring(2);
                    Integer val = Integer.valueOf(value);
                    if (val < 0) {
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
     * @return Returns a string indicating whether the given value is valid;
     *         null means valid, and non-null means invalid, with the result
     *         being the error message to display to the end user.
     */
    protected String handleDefaultValue(Object value) {

        String defaultVal = StringUtils.EMPTY;
        try {
            defaultVal = (String) value;
            if (!isValueValid(defaultVal)) {
                return "The value '" + defaultVal + "' is invalid.";
            }
        } catch (NumberFormatException ex) {
            return "The value '" + defaultVal + "' is invalid.";
        }
        return isValidVal(defaultVal, "Default value");
    }

    /**
     * Handles the PDO mapping value modifications.
     *
     * @param value
     *            The value to be set.
     * @return Returns a string indicating whether the given value is valid;
     *         null means valid, and non-null means invalid, with the result
     *         being the error message to display to the end user.
     */
    protected String handlePdoMappingValue(Object value) {
        if (value instanceof Integer) {
            String pdoMappingValue = PDO_MAPPING_TYPES[(int) value];
            TObjectAccessType accessType = plkObject.getAccessType();
            switch (pdoMappingValue) {
            case "Non-mappable":
                break;
            case "Mapped by default":
                break;
            case "Mapped optionally":
                break;
            case "Transmit process data objects":
                if (accessType == TObjectAccessType.CONST) {
                    return "Sub-object with access type 'const' does not allow TPDO mapping";
                }
                if (accessType == TObjectAccessType.RW) {
                    return "Sub-object with access type 'rw' does not allow TPDO mapping";
                }
                break;
            case "Receive process data objects":
                if (accessType == TObjectAccessType.CONST) {
                    return "Sub-object with access type 'const' does not allow RPDO mapping";
                }
                if (accessType == TObjectAccessType.RO) {
                    return "Sub-object with access type 'ro' does not allow TPDO mapping";
                }
                break;
            default:
                break;

            }
        }
        return StringUtils.EMPTY;
    }

    private String isValidVal(String highLowLimit, String str) {

        String dataTypeVal = DatatypeConverter.printHexBinary(plkObject.getDataType());
        String dataType = getDataTypeValue(dataTypeVal);
        if (!highLowLimit.isEmpty()) {
            long llimit;
            switch (dataType) {
            case "Boolean": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Boolean_min || llimit > DataTypeRange.Boolean_max) {
                        return "Entered " + str + " is improper to the " + dataType + " range (0 - 1).";

                    }
                } catch (NumberFormatException e) {

                    return "Datatype '" + dataType + "' accepts only decimal value";
                }
            }
                break;
            case "Integer8": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Integer8_min || llimit > DataTypeRange.Integer8_max) {
                        return "Entered " + str + " is improper to the " + dataType + " range (-256 - 255).";

                    }

                } catch (NumberFormatException e) {

                    return "Datatype '" + dataType + "' accepts only decimal value";
                }
            }
                break;
            case "Integer16": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Integer16_min || llimit > DataTypeRange.Integer16_max) {
                        return "Entered " + str + " is improper to the " + dataType + " range (-65,536 - 65,535 ).";

                    }

                } catch (NumberFormatException e) {

                    return "Datatype '" + dataType + "' accepts only decimal value";
                }
            }
                break;
            case "Integer32": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Integer32_min || llimit > DataTypeRange.Integer32_max) {
                        return "Entered " + str + " is improper to the " + dataType
                                + " range (-4,294,967,296 - 4,294,967,295).";

                    }

                } catch (NumberFormatException e) {

                    return dataType + " accepts only decimal value";
                }
            }
                break;
            case "Unsigned8": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned8_min || llimit > DataTypeRange.Unsigned8_max) {
                        return "Entered " + str + " is improper to the " + dataType + " range (0 - 255).";

                    }

                } catch (NumberFormatException e) {

                    return dataType + " accepts only decimal value";
                }
            }
                break;
            case "Unsigned16": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned16_min || llimit > DataTypeRange.Unsigned16_max) {
                        return "Entered " + str + " is improper to the " + dataType + " range (0 - 65,535).";

                    }

                } catch (NumberFormatException e) {

                    return dataType + " accepts only decimal value";
                }
            }
                break;
            case "Unsigned32": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned32_min || llimit > DataTypeRange.Unsigned32_max) {
                        return "Entered " + str + " is improper to the " + dataType + " range (0 - 4,294,967,295).";

                    }

                } catch (NumberFormatException e) {

                    return dataType + " accepts only decimal value";
                }
            }
                break;
            case "Real32": {
                try {
                    Double limit = Double.parseDouble(highLowLimit);
                    if (limit < DataTypeRange.Real32_min || limit > DataTypeRange.Real32_max) {
                        return "Entered " + str + " is improper to the " + dataType + " range (1.2E-38 - 3.4E+38).";

                    }

                } catch (NumberFormatException e) {

                    return dataType + " accepts only decimal value";
                }
            }
                break;
            case "Real64": {
                try {
                    Double limit = Double.parseDouble(highLowLimit);
                    if (limit < DataTypeRange.Real64_min || limit > DataTypeRange.Real64_max) {
                        return "Entered " + str + " is improper to the " + dataType + " range (2.3E-308 - 1.7E+308).";

                    }

                } catch (NumberFormatException e) {

                    return dataType + " accepts only decimal value";
                }

            }
                break;
            case "Visible_String": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned16_min || llimit > DataTypeRange.Unsigned16_max) {
                        return "Entered " + str + " is improper to the " + dataType + " range (0 - 65,535).";

                    }

                } catch (NumberFormatException e) {

                    return dataType + " accepts only decimal value";
                }

            }
                break;
            case "Integer24": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Integer24_min || llimit > DataTypeRange.Integer24_max) {
                        return "Entered " + str + " is improper to the " + dataType + " range (8,388,608 - 8,388,607).";

                    }

                } catch (NumberFormatException e) {

                    return dataType + " accepts only decimal value";
                }

            }
                break;
            case "Integer40": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Integer40_min || llimit > DataTypeRange.Integer40_max) {
                        return "Entered " + str + " is improper to the " + dataType
                                + " range (-549,755,813,888 - 549,755,813,887).";

                    }

                } catch (NumberFormatException e) {

                    return dataType + " accepts only decimal value";
                }

            }
                break;
            case "Integer48": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Integer48_min || llimit > DataTypeRange.Integer48_max) {
                        return "Entered " + str + " is improper to the " + dataType
                                + " range (-140,737,488,355,328 - 140,737,488,355,327).";

                    }

                } catch (NumberFormatException e) {

                    return dataType + " accepts only decimal value";
                }

            }
                break;
            case "Integer56": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Integer56_min || llimit > DataTypeRange.Integer56_max) {
                        return "Entered " + str + " is improper to the " + dataType
                                + " range (-36,028,797,018,963,968 - 36,028,797,018,963,967).";

                    }

                } catch (NumberFormatException e) {

                    return dataType + " accepts only decimal value";
                }

            }
                break;
            case "Integer64": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Integer64_min || llimit > DataTypeRange.Integer64_max) {
                        return "Entered " + str + " is improper to the " + dataType
                                + " range (-9,223,372,036,854,775,808 - 9,223,372,036,854,775,807).";

                    }

                } catch (NumberFormatException e) {

                    return dataType + " accepts only decimal value";
                }

            }
                break;
            case "Octet_String": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned8_min || llimit > DataTypeRange.Unsigned8_max) {
                        return "Entered " + str + " is improper to the " + dataType + " range (0 - 255).";

                    }

                } catch (NumberFormatException e) {

                    return dataType + " accepts only decimal value";
                }
            }
                break;
            case "Unicode_String": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned16_min || llimit > DataTypeRange.Unsigned16_max) {
                        return "Entered " + str + " is improper to the " + dataType + " range (0 - 65,535).";

                    }

                } catch (NumberFormatException e) {

                    return dataType + " accepts only decimal value";
                }
            }
                break;
            case "Time_of_Day": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned48_min || llimit > DataTypeRange.Unsigned48_max) {
                        return "Entered " + str + " is improper to the " + dataType
                                + " range (0 - 281,474,976,710,655).";

                    }

                } catch (NumberFormatException e) {

                    return dataType + " accepts only decimal value";
                }

            }
                break;
            case "Time_Diff": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned48_min || llimit > DataTypeRange.Unsigned48_max) {
                        return "Entered " + str + " is improper to the " + dataType
                                + " range (0 - 281,474,976,710,655).";

                    }

                } catch (NumberFormatException e) {

                    return dataType + " accepts only decimal value";
                }

            }
                break;
            case "Domain": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned32_min || llimit > DataTypeRange.Unsigned32_max) {
                        return "Entered " + str + " is improper to the " + dataType + " range (0 - 4,294,967,295).";

                    }

                } catch (NumberFormatException e) {

                    return dataType + " accepts only decimal value";
                }
            }
                break;
            case "Unsigned24": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned24_min || llimit > DataTypeRange.Unsigned24_max) {
                        return "Entered " + str + " is improper to the " + dataType + " range (0 - 16,777,215).";

                    }

                } catch (NumberFormatException e) {

                    return dataType + " accepts only decimal value";
                }

            }
                break;
            case "Unsigned40": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned40_min || llimit > DataTypeRange.Unsigned40_max) {
                        return "Entered " + str + " is improper to the " + dataType + " range (0 - 1,099,511,627,775).";

                    }

                } catch (NumberFormatException e) {

                    return dataType + " accepts only decimal value";
                }

            }
                break;
            case "Unsigned48": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned48_min || llimit > DataTypeRange.Unsigned48_max) {
                        return "Entered " + str + " is improper to the " + dataType
                                + " range (0 - 281,474,976,710,655).";

                    }

                } catch (NumberFormatException e) {

                    return dataType + " accepts only decimal value";
                }

            }
                break;
            case "Unsigned56": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned56_min || llimit > DataTypeRange.Unsigned56_max) {
                        return "Entered " + str + " is improper to the " + dataType
                                + " range (0 - 72,057,594,037,927,935).";

                    }

                } catch (NumberFormatException e) {

                    return dataType + " accepts only decimal value";
                }

            }
                break;
            case "Unsigned64": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < 0 || llimit > 1) {
                        return "Entered " + str + " is improper to the " + dataType + " range (-).";

                    }

                } catch (NumberFormatException e) {

                    return dataType + " accepts only decimal value";
                }

            }
                break;
            case "MAC_ADDRESS": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned48_min || llimit > DataTypeRange.Unsigned48_max) {
                        return "Entered " + str + " is improper to the " + dataType
                                + " range (0 - 281,474,976,710,655).";

                    }

                } catch (NumberFormatException e) {

                    return dataType + " accepts only decimal value";
                }

            }
                break;
            case "IP_ADDRESS": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned32_min || llimit > DataTypeRange.Unsigned32_max) {
                        return "Entered " + str + " is improper to the " + dataType + " range (0 - 4,294,967,295).";

                    }

                } catch (NumberFormatException e) {

                    return dataType + " accepts only decimal value";
                }
            }
                break;
            case "NETTIME": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < 0 || llimit > 1) {
                        return "Entered " + str + " is improper to the " + dataType + " range (-).";

                    }

                } catch (NumberFormatException e) {

                    return dataType + " accepts only decimal value";
                }

            }
            default:
                break;
            }
        }
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.ui.views.properties.IPropertySource#getPropertyValue(java.
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
                    String dataTypeVal = getDataTypeValue(dataType);
                    retObj = dataTypeVal;
                } else {
                    retObj = StringUtils.EMPTY;
                }
                break;
            case OBJ_DATATYPE_EDITABLE_ID:
                if (plkObject.getDataType() != null) {
                    String dataType = DatatypeConverter.printHexBinary(plkObject.getDataType());
                    String dataTypeVal = getDataTypeValue(dataType);
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
                    if (lowLimit.contains("0x")) {
                        lowLimit = String.valueOf(Long.decode(lowLimit));
                    }
                    retObj = lowLimit;
                } else {
                    retObj = StringUtils.EMPTY;
                }
                break;
            case OBJ_HIGH_LIMIT_ID:
            case OBJ_HIGH_LIMIT_EDITABLE_ID:
                if (plkObject.getHighLimit() != null) {
                    String highLimit = plkObject.getHighLimit();
                    if (highLimit.contains("0x")) {
                        highLimit = String.valueOf(Long.decode(highLimit));
                    }
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
                    if (defaultValue.contains("0x")) {
                        defaultValue = String.valueOf(Long.decode(defaultValue));
                    }
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
     * @return <true> if it is a module object, <false> if it is a object of
     *         node.
     */
    public boolean isModuleObject() {
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.ui.views.properties.IPropertySource#isPropertySet(java.lang.
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
    public String getDataType(String dataType) {
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
     * @see
     * org.eclipse.ui.views.properties.IPropertySource#resetPropertyValue(java.
     * lang.Object)
     */
    @Override
    public void resetPropertyValue(Object id) {
       //TODO: Implement reset default value property.
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
     * Gets the value of IEC data type
     *
     * @param dataType
     *            Value of selected data type
     * @return IEC value of data type
     */
    public String getDataTypeValue(String dataType) {
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
        if (accessType.equalsIgnoreCase("Read write")) {
            return TObjectAccessType.RW;
        }
        return TObjectAccessType.CONST;
    }

    public TObjectPDOMapping getPdoMapping(String pdoMapping) {

        if (pdoMapping.equalsIgnoreCase("Non-mappable")) {
            return TObjectPDOMapping.NO;
        }
        if (pdoMapping.equalsIgnoreCase("Mapped by default")) {
            return TObjectPDOMapping.DEFAULT;
        }
        if (pdoMapping.equalsIgnoreCase("Mapped optionally")) {
            return TObjectPDOMapping.OPTIONAL;
        }
        if (pdoMapping.equalsIgnoreCase("Transmit process data objects")) {
            return TObjectPDOMapping.TPDO;
        }
        if (pdoMapping.equalsIgnoreCase("Receive process data objects")) {
            return TObjectPDOMapping.RPDO;
        }
        return TObjectPDOMapping.DEFAULT;
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
                    if (value instanceof Integer) {
                        String val = IPowerlinkConstants.OBJECT_TYPES[(int) value];
                        short objectType = getObjectType(val);
                        plkObject.setObjectType(objectType);
                    }
                    break;
                case OBJ_DATATYPE_EDITABLE_ID:
                    if (value instanceof Integer) {
                        String val = DATA_TYPE_LIST[(int) value];
                        byte[] dataType = DatatypeConverter.parseHexBinary(getDataType(val));
                        plkObject.setDataType(dataType);
                    }
                    break;
                case OBJ_LOW_LIMIT_EDITABLE_ID:
                    plkObject.setLowLimit((String) value);
                    break;
                case OBJ_HIGH_LIMIT_EDITABLE_ID:
                    plkObject.setHighLimit((String) value);
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
                for (IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
                    project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
                }

            }

        } catch (RuntimeException e) {
            // RunTimeException is caught whenever an exception is caught during
            // run time to avoid unnecessary caught of exceptions.
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public DocumentRoot getDocumentRoot() {
        URI uri = plkObject.eResource().getURI();
        DocumentRoot root = null;
        try {
            String devicePath = uri.devicePath();
            File xddFile = new File(devicePath);
            URL url = xddFile.toURL();
            root = XDDUtilities.loadXDD(url);

        } catch (MalformedURLException e1) {
            e1.printStackTrace();
        }
        return root;
    }

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
