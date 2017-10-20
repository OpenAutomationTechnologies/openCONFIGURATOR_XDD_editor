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

import org.apache.commons.lang3.StringUtils;
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

    public DeviceDescriptionFileEditor getEditor() {
        return editor;
    }

    public void setEditor(DeviceDescriptionFileEditor editor) {
        this.editor = editor;
    }

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

    public static String isValidVal(String value, String label, String dataType) {
        String emptyString = StringUtils.EMPTY;

        if (!value.isEmpty()) {
            long valueToBeChecked;
            try {
                valueToBeChecked = getValueToBeChecked(value, dataType);
            } catch (Exception e) {
                return (MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
            }
            switch (dataType) {
            case "Boolean": {
                try {

                    if (valueToBeChecked < DataTypeRange.Boolean_min || valueToBeChecked > DataTypeRange.Boolean_max) {
                        return label + " is out of range (0 to 1).";
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
                        return (label + " is out of range (-256 to 255).");
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
                        return (label + " is out of range (-65,536 to 65,535 ).");

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
                        return (label + " is out of range (-4,294,967,296 to 4,294,967,295).");

                    } else
                        return emptyString;
                } catch (NumberFormatException e) {
                    return ("Datatype '" + dataType + " accepts only decimal value");
                }
            }

            case "Unsigned8": {
                try {

                    if (valueToBeChecked < DataTypeRange.Unsigned8_min
                            || valueToBeChecked > DataTypeRange.Unsigned8_max) {
                        return (label + " is out of range (0 to 255).");

                    } else
                        return emptyString;
                } catch (NumberFormatException e) {
                    return ("Datatype '" + dataType + " accepts only decimal value");
                }
            }
            case "Unsigned16": {
                try {

                    if (valueToBeChecked < DataTypeRange.Unsigned16_min
                            || valueToBeChecked > DataTypeRange.Unsigned16_max) {
                        return (label + " is out of range (0 to 65,535).");

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
                        return (label + " is out of range (0 to 4,294,967,295).");

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
                        return (label + " is out of range (8,388,608 to 8,388,607).");

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
                        return (label + " is out of range (-549,755,813,888 to 549,755,813,887).");

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
                        return (label + " is out of range (-140,737,488,355,328 to 140,737,488,355,327).");

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
                        return (label + " is out of range (-36,028,797,018,963,968 to 36,028,797,018,963,967).");

                    } else
                        return emptyString;
                } catch (NumberFormatException e) {
                    return ("Datatype '" + dataType + " accepts only decimal value");
                }

            }

            case "Integer64": {
                try {

                    if (valueToBeChecked <= DataTypeRange.Integer64_min
                            || valueToBeChecked >= DataTypeRange.Integer64_max) {
                        return (label + " is out of range (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807).");

                    } else
                        return emptyString;
                } catch (NumberFormatException e) {
                    return ("Datatype '" + dataType + " accepts only decimal value");
                }

            }

            case "Unsigned24": {
                try {

                    if (valueToBeChecked < DataTypeRange.Unsigned24_min
                            || valueToBeChecked > DataTypeRange.Unsigned24_max) {
                        return (label + " is out of range (0 to 16,777,215).");

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
                        return (label + " is out of range (0 to 1,099,511,627,775).");

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
                        return (label + " is out of range (0 to 281,474,976,710,655).");

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
                        return (label + " is out of range (0 to 72,057,594,037,927,935).");

                    } else
                        return emptyString;
                } catch (NumberFormatException e) {
                    return (MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }

            }

            case "Unsigned64": {
                try {

                    if (valueToBeChecked < 0 || valueToBeChecked >= Long.MAX_VALUE) {
                        return (label + " out of range (0 to " + Long.MAX_VALUE + ").");

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
                        return (label + " is out of range (0 to 4,294,967,295).");

                    } else
                        return emptyString;
                } catch (NumberFormatException e) {
                    return (MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }
            }

            default:
                return emptyString;
            }
        }

        return emptyString;

    }

}
