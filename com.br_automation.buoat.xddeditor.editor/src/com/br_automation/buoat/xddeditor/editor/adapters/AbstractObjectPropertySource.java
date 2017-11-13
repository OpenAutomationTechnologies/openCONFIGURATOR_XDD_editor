/*******************************************************************************
 * @file   AbstractObjectPropertySource.java
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

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.ui.views.properties.ComboBoxPropertyDescriptor;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import com.br_automation.buoat.xddeditor.XDD.wizards.DataTypeRange;
import com.br_automation.buoat.xddeditor.editor.editors.DeviceDescriptionFileEditor;

/**
 * Abstract implementation of property source for POWERLINK Object.
 *
 * @author Sree hari Vignesh
 *
 */
public class AbstractObjectPropertySource {

    private DeviceDescriptionFileEditor editor;

    // Common object IDs
    public static final String OBJ_INDEX_ID = "Obj.IndexId"; //$NON-NLS-1$
    public static final String OBJ_NAME_ID = "Obj.name"; //$NON-NLS-1$
    public static final String OBJ_TYPE_ID = "Obj.objectType"; //$NON-NLS-1$
    public static final String OBJ_DATATYPE_ID = "Obj.dataType"; //$NON-NLS-1$
    public static final String OBJ_LOW_LIMIT_ID = "Obj.lowLimit"; //$NON-NLS-1$
    public static final String OBJ_HIGH_LIMIT_ID = "Obj.highLimit"; //$NON-NLS-1$
    public static final String OBJ_ACCESS_TYPE_ID = "Obj.accessType"; //$NON-NLS-1$
    public static final String OBJ_DEFAULT_VALUE_ID = "Obj.defaultValue"; //$NON-NLS-1$
    public static final String OBJ_ACTUAL_VALUE_READ_ONLY_ID = "Obj.actualValueReadOnly"; //$NON-NLS-1$
    public static final String OBJ_ACTUAL_VALUE_EDITABLE_ID = "Obj.actualValueEditable"; //$NON-NLS-1$
    public static final String OBJ_FORCE_ACTUAL_VALUE_ID = "Obj.forceActualValue"; //$NON-NLS-1$
    public static final String OBJ_DENOTATION_ID = "Obj.denotation"; //$NON-NLS-1$
    public static final String OBJ_PDO_MAPPING_ID = "Obj.PDOmapping"; //$NON-NLS-1$
    public static final String OBJ_OBJFLAGS_ID = "Obj.objFlags"; //$NON-NLS-1$
    public static final String OBJ_UNIQUEIDREF_ID = "Obj.uniqueIDRef"; //$NON-NLS-1$
    public static final String OBJ_ERROR_ID = "Obj.error"; //$NON-NLS-1$

    public static final String OBJ_INDEX_EDITABLE_ID = "Obj.IndexIdEditable"; //$NON-NLS-1$
    public static final String OBJ_NAME_EDITABLE_ID = "Obj.nameEditable"; //$NON-NLS-1$
    public static final String OBJ_TYPE_EDITABLE_ID = "Obj.objectTypeEditable"; //$NON-NLS-1$
    public static final String OBJ_DATATYPE_EDITABLE_ID = "Obj.dataTypeEditable"; //$NON-NLS-1$
    public static final String OBJ_LOW_LIMIT_EDITABLE_ID = "Obj.lowLimitEditable"; //$NON-NLS-1$
    public static final String OBJ_HIGH_LIMIT_EDITABLE_ID = "Obj.highLimitEditable"; //$NON-NLS-1$
    public static final String OBJ_ACCESS_TYPE_EDITABLE_ID = "Obj.accessTypeEditable"; //$NON-NLS-1$
    public static final String OBJ_DEFAULT_VALUE_EDITABLE_ID = "Obj.defaultValueEditable"; //$NON-NLS-1$
    public static final String OBJ_DENOTATION_EDITABLE_ID = "Obj.denotationEditable"; //$NON-NLS-1$
    public static final String OBJ_PDO_MAPPING_EDITABLE_ID = "Obj.PDOmappingEditable"; //$NON-NLS-1$
    public static final String OBJ_OBJFLAGS_EDITABLE_ID = "Obj.objFlagsEditable"; //$NON-NLS-1$

    // Common labels
    private static final String OBJ_INDEX_LABEL = "Object ID"; //$NON-NLS-1$
    private static final String OBJ_NAME_LABEL = "Name";
    private static final String OBJ_TYPE_LABEL = "Object Type";
    private static final String OBJ_DATATYPE_LABEL = "Data Type";
    private static final String OBJ_LOW_LIMIT_LABEL = "Low Limit";
    private static final String OBJ_HIGH_LIMIT_LABEL = "High Limit";
    private static final String OBJ_ACCESS_TYPE_LABEL = "Access Type";
    private static final String OBJ_DEFAULT_VALUE_LABEL = "Default Value";
    private static final String OBJ_ACTUAL_VALUE_LABEL = "Actual Value";
    private static final String OBJ_FORCE_ACTUAL_VALUE_LABEL = "Force Actual Value";
    private static final String OBJ_DENOTATION_LABEL = "Denotation";
    private static final String OBJ_PDO_MAPPING_LABEL = "PDO Mapping";
    private static final String OBJ_OBJFLAGS_LABEL = "Object Flags";
    private static final String OBJ_UNIQUEIDREF_LABEL = "UniqueIDRef";

    public static final int MANUFACTURER_PROFILE_SUB_OBJ_START_INDEX = 0x01;
    public static final int MANUFACTURER_PROFILE_SUB_OBJ_END_INDEX = 0xFE;

    public static final String VALID_OBJECT_INDEX_RANGE = "Enter the object index value within the range (0x1000 to 0x9FFF).";
    public static final String INDEX_OUT_OF_RANGE = "Object index is out of range (0x1000 to 0x9FFF).";
    public static final String OBJECT_ALREADY_EXISTS_ERROR_MESSAGE = "Object index {0} already exists in the file {1}.";
    public static final String ENTER_OBJECT_NAME = "Enter the name of object.";
    public static final String OBJECT_ACCESS_TYPE_INVALID_PDO_MAPPING = "Object with access type {0} does not allow {1} mapping.";
    public static final String LOW_LIMIT_GREATER_HIGH_LIMIT = "Low limit cannot be greater than high limit.";
    public static final String INVALID_VALUE = "The value {0} is invalid.";

    public static final String[] DATA_TYPE_LIST = { "Boolean", "Integer8", "Integer16", "Integer32", "Unsigned8",
            "Unsigned16", "Unsigned32", "Real32", "Visible_String", "Integer24", "Real64", "Integer40", "Integer48",
            "Integer56", "Integer64", "Octet_String", "Unicode_String", "Time_of_Day", "Time_Diff", "Domain",
            "Unsigned24", "Unsigned40", "Unsigned48", "Unsigned56", "Unsigned64", "MAC_ADDRESS", "IP_ADDRESS",
            "NETTIME", StringUtils.EMPTY };

    protected static final String[] OBJECT_TYPES = { "7 - VAR", "8 - ARRAY", "9 - RECORD" };

    protected static final String[] PDO_MAPPING_TYPES = { "No", "Default", "Optional", "TPDO", "RPDO", "" };

    protected static final String[] ACCESS_TYPE_LIST = { "Constant", "Read only", "Write only", "Read/Write", "" };

    private static final String[] YES_NO = { "Yes", "No" };
    protected static final PropertyDescriptor objectIdDescriptor = new PropertyDescriptor(OBJ_INDEX_ID,
            OBJ_INDEX_LABEL);
    protected static final TextPropertyDescriptor editableobjectIdDescriptor = new TextPropertyDescriptor(
            OBJ_INDEX_EDITABLE_ID, OBJ_INDEX_LABEL);
    protected static final PropertyDescriptor nameDescriptor = new PropertyDescriptor(OBJ_NAME_ID, OBJ_NAME_LABEL);
    protected static final PropertyDescriptor objectTypeDescriptor = new PropertyDescriptor(OBJ_TYPE_ID,
            OBJ_TYPE_LABEL);
    protected static final PropertyDescriptor dataTypeDescriptor = new PropertyDescriptor(OBJ_DATATYPE_ID,
            OBJ_DATATYPE_LABEL);
    protected static final PropertyDescriptor lowLimitDescriptor = new PropertyDescriptor(OBJ_LOW_LIMIT_ID,
            OBJ_LOW_LIMIT_LABEL);
    protected static final PropertyDescriptor highLimitDescriptor = new PropertyDescriptor(OBJ_HIGH_LIMIT_ID,
            OBJ_HIGH_LIMIT_LABEL);
    protected static final PropertyDescriptor accessTypeDescriptor = new PropertyDescriptor(OBJ_ACCESS_TYPE_ID,
            OBJ_ACCESS_TYPE_LABEL);

    protected static final String INVALID_DATA_TYPE_VALUE = "Invalid value for data type {0}.";

    protected static final String INVALID_DATA_TYPE_DECIMAL_VALUE = "Datatype {0} accepts only decimal value";

    protected static final PropertyDescriptor defaultValueDescriptor = new PropertyDescriptor(OBJ_DEFAULT_VALUE_ID,
            OBJ_DEFAULT_VALUE_LABEL);
    protected static final PropertyDescriptor actualValueReadOnlyDescriptor = new PropertyDescriptor(
            OBJ_ACTUAL_VALUE_READ_ONLY_ID, OBJ_ACTUAL_VALUE_LABEL);
    protected static final TextPropertyDescriptor actualValueEditableDescriptor = new TextPropertyDescriptor(
            OBJ_ACTUAL_VALUE_EDITABLE_ID, OBJ_ACTUAL_VALUE_LABEL);

    protected static final ComboBoxPropertyDescriptor forceActualValue = new ComboBoxPropertyDescriptor(
            OBJ_FORCE_ACTUAL_VALUE_ID, OBJ_FORCE_ACTUAL_VALUE_LABEL, YES_NO);
    protected static final PropertyDescriptor denotationDescriptor = new PropertyDescriptor(OBJ_DENOTATION_ID,
            OBJ_DENOTATION_LABEL);
    protected static final PropertyDescriptor pdoMappingDescriptor = new PropertyDescriptor(OBJ_PDO_MAPPING_ID,
            OBJ_PDO_MAPPING_LABEL);
    protected static final PropertyDescriptor objFlagsDescriptor = new PropertyDescriptor(OBJ_OBJFLAGS_ID,
            OBJ_OBJFLAGS_LABEL);
    protected static final PropertyDescriptor uniqueIDRefDescriptor = new PropertyDescriptor(OBJ_UNIQUEIDREF_ID,
            OBJ_UNIQUEIDREF_LABEL);

    protected static final PropertyDescriptor objectErrorDescriptor = new PropertyDescriptor(OBJ_ERROR_ID, "Error");

    protected static final TextPropertyDescriptor editNameDescriptor = new TextPropertyDescriptor(OBJ_NAME_EDITABLE_ID,
            OBJ_NAME_LABEL);
    protected static final ComboBoxPropertyDescriptor editObjectTypeDescriptor = new ComboBoxPropertyDescriptor(
            OBJ_TYPE_EDITABLE_ID, OBJ_TYPE_LABEL, OBJECT_TYPES);
    protected static final ComboBoxPropertyDescriptor editDataTypeDescriptor = new ComboBoxPropertyDescriptor(
            OBJ_DATATYPE_EDITABLE_ID, OBJ_DATATYPE_LABEL, DATA_TYPE_LIST);
    protected static final TextPropertyDescriptor editLowLimitDescriptor = new TextPropertyDescriptor(
            OBJ_LOW_LIMIT_EDITABLE_ID, OBJ_LOW_LIMIT_LABEL);
    protected static final TextPropertyDescriptor editHighLimitDescriptor = new TextPropertyDescriptor(
            OBJ_HIGH_LIMIT_EDITABLE_ID, OBJ_HIGH_LIMIT_LABEL);
    protected static final ComboBoxPropertyDescriptor editAccessTypeDescriptor = new ComboBoxPropertyDescriptor(
            OBJ_ACCESS_TYPE_EDITABLE_ID, OBJ_ACCESS_TYPE_LABEL, ACCESS_TYPE_LIST);

    protected static final TextPropertyDescriptor editDefaultValueDescriptor = new TextPropertyDescriptor(
            OBJ_DEFAULT_VALUE_EDITABLE_ID, OBJ_DEFAULT_VALUE_LABEL);

    protected static final TextPropertyDescriptor editDenotationDescriptor = new TextPropertyDescriptor(
            OBJ_DENOTATION_EDITABLE_ID, OBJ_DENOTATION_LABEL);
    protected static final ComboBoxPropertyDescriptor editPdoMappingDescriptor = new ComboBoxPropertyDescriptor(
            OBJ_PDO_MAPPING_EDITABLE_ID, OBJ_PDO_MAPPING_LABEL, PDO_MAPPING_TYPES);
    protected static final TextPropertyDescriptor editbjFlagsDescriptor = new TextPropertyDescriptor(
            OBJ_OBJFLAGS_EDITABLE_ID, OBJ_OBJFLAGS_LABEL);

    public static final String BOOLEAN_OUT_OF_RANGE = "{0} is out of range (0 to 1).";
    public static final String INTEGER8_OUT_OF_RANGE = "{0} is out of range (-128 to 127).";
    public static final String INTEGER16_OUT_OF_RANGE = "{0} is out of range (-32768 to 32767 ).";
    public static final String INTEGER32_OUT_OF_RANGE = "{0}  is out of range (-2147483648 to 2147483647).";
    public static final String UNSIGNED8_OUT_OF_RANGE = "{0} is out of range (0 to 255).";
    public static final String UNSIGNED16_OUT_OF_RANGE = "{0} is out of range (0 to 65,535).";
    public static final String UNSIGNED32_OUT_OF_RANGE = "{0} is out of range (0 to 4,294,967,295).";
    public static final String INTEGER24_OUT_OF_RANGE = "{0}  is out of range (-8,388,608 to 8,388,607).";
    public static final String INTEGER40_OUT_OF_RANGE = "{0}  is out of range (-549,755,813,888 to 549,755,813,887).";
    public static final String INTEGER48_OUT_OF_RANGE = "{0} is out of range (-140,737,488,355,328 to 140,737,488,355,327).";
    public static final String INTEGER56_OUT_OF_RANGE = "{0} is out of range (-36,028,797,018,963,968 to 36,028,797,018,963,967).";
    public static final String INTEGER64_OUT_OF_RANGE = "{0} is out of range (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807).";
    public static final String UNSIGNED24_OUT_OF_RANGE = "{0} is out of range (0 to 16,777,215).";
    public static final String UNSIGNED40_OUT_OF_RANGE = "{0} is out of range (0 to 1,099,511,627,775).";
    public static final String UNSIGNED48_OUT_OF_RANGE = "{0}  is out of range (0 to 281,474,976,710,655).";
    public static final String UNSIGNED56_OUT_OF_RANGE = "{0} is out of range (0 to 72,057,594,037,927,935).";
    public static final String UNSIGNED64_OUT_OF_RANGE = "{0}  out of range (0 to to 2^63 -1).";
    public static final String DOMAIN_OUT_OF_RANGE = "{0}  is out of range (0 to 4,294,967,295).";

    /**
     * @return Instance of device description file editor
     */
    public DeviceDescriptionFileEditor getEditor() {
        return editor;
    }

    /**
     * Get long value of high limit or low limit
     *
     * @param value
     *            String value to be converted
     * @return Long value
     */
    public static Long getValue(String value) {
        Long defaultVal = (long) 0;
        if (value.contains("0x")) {
            value = value.substring(2);
            defaultVal = Long.valueOf(value, 16);
        } else {
            defaultVal = Long.parseLong(value);
        }
        return defaultVal;
    }

    /**
     * Set instance of editor
     *
     * @param editor
     *            Instance of device description file editor
     */
    public void setEditor(DeviceDescriptionFileEditor editor) {
        this.editor = editor;
    }

    public static List<String> getStringDataTypeList() {
        List<String> stringDataTypeList = new ArrayList<String>();
        stringDataTypeList.add("Visible_String");
        stringDataTypeList.add("Octet_String");
        stringDataTypeList.add("Unicode_String");
        stringDataTypeList.add("Time_of_Day");
        stringDataTypeList.add("Time_Diff");
        stringDataTypeList.add("Real32");
        stringDataTypeList.add("Real64");
        stringDataTypeList.add("MAC_ADDRESS");
        stringDataTypeList.add("IP_ADDRESS");
        stringDataTypeList.add("NETTIME");

        return stringDataTypeList;
    }

    /**
     * Get the default or low limit or high limit value entered in the wizard or
     * property page.
     *
     * @param value
     *            Entered value instance
     * @param dataType
     *            Selected data type value
     * @return Long value to be verified
     */
    public static long getValueToBeChecked(String value, String dataType) {
        long valueToBeChecked;
        switch (dataType) {
        case "Visible_String":
        case "Octet_String":
        case "Unicode_String":
        case "Time_of_Day":
        case "Time_Diff":
        case "Real32":
        case "Real64":
        case "MAC_ADDRESS":
        case "IP_ADDRESS":
        case "NETTIME": {
            return 0;
        }
        default: {
            if (value.contains("0x")) {
                value = value.substring(2);
                valueToBeChecked = Long.parseLong(value, 16);
            } else {
                valueToBeChecked = Long.parseLong(value);
            }
            return valueToBeChecked;
        }
        }

    }

    /**
     * Verifies the value with respect to data type
     *
     * @param value
     *            The value to be verified
     * @param label
     *            The attribute to of object or sub object to be verified
     * @param dataType
     *            Name of the selected data type
     * @return Error message
     */
    public static String isValidVal(String value, String label, String dataType) {
        String emptyString = StringUtils.EMPTY;

        if (!value.isEmpty()) {
            long valueToBeChecked;
            try {
                valueToBeChecked = getValueToBeChecked(value, dataType);
            } catch (Exception e) {
                e.printStackTrace();
                return (MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
            }
            switch (dataType) {
            case "Boolean": {
                try {

                    if (valueToBeChecked < DataTypeRange.Boolean_min || valueToBeChecked > DataTypeRange.Boolean_max) {
                        return MessageFormat.format(BOOLEAN_OUT_OF_RANGE, label);
                    } else {
                        return emptyString;
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    return (MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }
            }
            case "Integer8": {
                try {

                    if (valueToBeChecked < DataTypeRange.Integer8_min
                            || valueToBeChecked > DataTypeRange.Integer8_max) {
                        return MessageFormat.format(INTEGER8_OUT_OF_RANGE, label);
                    } else {
                        return emptyString;
                    }
                } catch (NumberFormatException e) {
                    return (MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }
            }
            case "Integer16": {
                try {

                    if (valueToBeChecked < DataTypeRange.Integer16_min
                            || valueToBeChecked > DataTypeRange.Integer16_max) {
                        return MessageFormat.format(INTEGER16_OUT_OF_RANGE, label);

                    } else
                        return emptyString;
                } catch (NumberFormatException e) {
                    return (MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }
            }
            case "Integer32": {
                try {

                    if (valueToBeChecked < DataTypeRange.Integer32_min
                            || valueToBeChecked > DataTypeRange.Integer32_max) {
                        return MessageFormat.format(INTEGER32_OUT_OF_RANGE, label);

                    } else
                        return emptyString;
                } catch (NumberFormatException e) {
                    return MessageFormat.format(INVALID_DATA_TYPE_DECIMAL_VALUE, dataType);
                }
            }

            case "Unsigned8": {
                try {

                    if (valueToBeChecked < DataTypeRange.Unsigned8_min
                            || valueToBeChecked > DataTypeRange.Unsigned8_max) {
                        return MessageFormat.format(UNSIGNED8_OUT_OF_RANGE, label);

                    } else
                        return emptyString;
                } catch (NumberFormatException e) {
                    return MessageFormat.format(INVALID_DATA_TYPE_DECIMAL_VALUE, dataType);
                }
            }
            case "Unsigned16": {
                try {

                    if (valueToBeChecked < DataTypeRange.Unsigned16_min
                            || valueToBeChecked > DataTypeRange.Unsigned16_max) {
                        return MessageFormat.format(UNSIGNED16_OUT_OF_RANGE, label);

                    } else
                        return emptyString;
                } catch (NumberFormatException e) {
                    return (MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }
            }
            case "Unsigned32": {
                try {

                    if (valueToBeChecked < DataTypeRange.Unsigned32_min
                            || valueToBeChecked > DataTypeRange.Unsigned32_max) {
                        return MessageFormat.format(UNSIGNED32_OUT_OF_RANGE, label);

                    } else
                        return emptyString;
                } catch (NumberFormatException e) {
                    return (MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }
            }

            case "Integer24": {
                try {

                    if (valueToBeChecked < DataTypeRange.Integer24_min
                            || valueToBeChecked > DataTypeRange.Integer24_max) {
                        return MessageFormat.format(INTEGER24_OUT_OF_RANGE, label);

                    } else
                        return emptyString;
                } catch (NumberFormatException e) {
                    return (MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }

            }

            case "Integer40": {
                try {
                    if (valueToBeChecked < DataTypeRange.Integer40_min
                            || valueToBeChecked > DataTypeRange.Integer40_max) {
                        return MessageFormat.format(INTEGER40_OUT_OF_RANGE, label);

                    } else
                        return emptyString;
                } catch (NumberFormatException e) {
                    return (MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }

            }

            case "Integer48": {
                try {

                    if (valueToBeChecked < DataTypeRange.Integer48_min
                            || valueToBeChecked > DataTypeRange.Integer48_max) {
                        return MessageFormat.format(INTEGER48_OUT_OF_RANGE, label);

                    } else
                        return emptyString;
                } catch (NumberFormatException e) {
                    return (MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }

            }

            case "Integer56": {
                try {

                    if (valueToBeChecked < DataTypeRange.Integer56_min
                            || valueToBeChecked > DataTypeRange.Integer56_max) {
                        return MessageFormat.format(INTEGER56_OUT_OF_RANGE, label);

                    } else
                        return emptyString;
                } catch (NumberFormatException e) {
                    return MessageFormat.format(INVALID_DATA_TYPE_DECIMAL_VALUE, dataType);
                }

            }

            case "Integer64": {
                try {

                    if (valueToBeChecked <= DataTypeRange.Integer64_min
                            || valueToBeChecked >= DataTypeRange.Integer64_max) {
                        return MessageFormat.format(INTEGER64_OUT_OF_RANGE, label);

                    } else
                        return emptyString;
                } catch (NumberFormatException e) {
                    return MessageFormat.format(INVALID_DATA_TYPE_DECIMAL_VALUE, dataType);
                }

            }

            case "Unsigned24": {
                try {

                    if (valueToBeChecked < DataTypeRange.Unsigned24_min
                            || valueToBeChecked > DataTypeRange.Unsigned24_max) {
                        return MessageFormat.format(UNSIGNED24_OUT_OF_RANGE, label);

                    } else
                        return emptyString;
                } catch (NumberFormatException e) {
                    return (MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }

            }

            case "Unsigned40": {
                try {

                    if (valueToBeChecked < DataTypeRange.Unsigned40_min
                            || valueToBeChecked > DataTypeRange.Unsigned40_max) {
                        return MessageFormat.format(UNSIGNED40_OUT_OF_RANGE, label);

                    } else
                        return emptyString;
                } catch (NumberFormatException e) {
                    return (MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }

            }

            case "Unsigned48": {
                try {

                    if (valueToBeChecked < DataTypeRange.Unsigned48_min
                            || valueToBeChecked > DataTypeRange.Unsigned48_max) {
                        return MessageFormat.format(UNSIGNED48_OUT_OF_RANGE, label);

                    } else
                        return emptyString;
                } catch (NumberFormatException e) {
                    return (MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }

            }

            case "Unsigned56": {
                try {

                    if (valueToBeChecked < DataTypeRange.Unsigned56_min
                            || valueToBeChecked > DataTypeRange.Unsigned56_max) {
                        return MessageFormat.format(UNSIGNED56_OUT_OF_RANGE, label);
                    } else
                        return emptyString;
                } catch (NumberFormatException e) {
                    return (MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }

            }

            case "Unsigned64": {
                try {

                    if (valueToBeChecked < 0 || valueToBeChecked >= Long.MAX_VALUE) {
                        return MessageFormat.format(UNSIGNED64_OUT_OF_RANGE, label);

                    } else
                        return emptyString;
                } catch (NumberFormatException e) {
                    return (MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }

            }

            case "Domain": {
                try {

                    if (valueToBeChecked < DataTypeRange.Unsigned32_min
                            || valueToBeChecked > DataTypeRange.Unsigned32_max) {
                        return MessageFormat.format(DOMAIN_OUT_OF_RANGE, label);

                    } else {
                        return emptyString;
                    }
                } catch (NumberFormatException e) {
                    return (MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }
            }

            case "Real32":
            case "Real64": {
                char[] valueToBeVerified = value.toCharArray();
                int decimalCount = 0;

                for (int i = 0; i < valueToBeVerified.length; i++) {
                    if (valueToBeVerified[i] == '.') {
                        decimalCount = decimalCount + 1;
                    }

                    if (!Character.isDigit(valueToBeVerified[i])) {
                        if (valueToBeVerified[i] == '-') {
                            if (i != 0) {
                                return (MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                            }
                        }
                        if (valueToBeVerified[i] == '.') {
                            if (decimalCount > 1) {
                                return (MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                            }
                        } else {
                            return (MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                        }

                    }
                }

            }
                break;
            case "MAC_ADDRESS": {
                char[] valueToBeVerified = value.toCharArray();
                int lengthOfMacAddress = valueToBeVerified.length;
                if (!value.contains("0x")) {
                    if (lengthOfMacAddress > 17) {
                        return (MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                    }

                    for (int i = 0; i < valueToBeVerified.length; i++) {
                        if (valueToBeVerified[i] == ':') {
                            if (i == 2 || i == 5 || i == 8 || i == 11) {
                                continue;
                            } else {
                                return (MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                            }
                        }

                        if (Character.isLetter(valueToBeVerified[i])) {
                            char charValue = valueToBeVerified[i];
                            if (charValue == 'A' || charValue == 'B' || charValue == 'C' || charValue == 'D'
                                    || charValue == 'E' || charValue == 'F' || charValue == 'a' || charValue == 'b'
                                    || charValue == 'c' || charValue == 'd' || charValue == 'e' || charValue == 'f') {
                                continue;
                            } else {
                                return (MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                            }

                        } else if (!Character.isDigit(valueToBeVerified[i])) {
                            return (MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                        }
                    }
                } else {
                    try {
                        value = value.substring(2);
                        Long macAddress = Long.parseLong(value, 16);
                        if (macAddress < DataTypeRange.Unsigned32_min || macAddress > DataTypeRange.Unsigned32_max) {
                            return MessageFormat.format(UNSIGNED32_OUT_OF_RANGE, label);

                        } else {
                            return emptyString;
                        }
                    } catch (Exception e) {
                        return (MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                    }
                }
            }
                break;

            case "IP_ADDRESS":
                if (!value.contains("0x")) {
                    Pattern timePattern = Pattern.compile("(.+).(.+)");
                    Matcher match = timePattern.matcher(value);
                    if (!match.matches()) {
                        return (MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                    }
                } else {
                    try {
                        value = value.substring(2);
                        Long macAddress = Long.parseLong(value, 16);
                        if (macAddress < DataTypeRange.Unsigned32_min || macAddress > DataTypeRange.Unsigned32_max) {
                            return MessageFormat.format(UNSIGNED32_OUT_OF_RANGE, label);

                        } else {
                            return emptyString;
                        }
                    } catch (Exception e) {
                        return (MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                    }

                }
                break;

            default:
                return emptyString;
            }
        }

        return emptyString;

    }

}
