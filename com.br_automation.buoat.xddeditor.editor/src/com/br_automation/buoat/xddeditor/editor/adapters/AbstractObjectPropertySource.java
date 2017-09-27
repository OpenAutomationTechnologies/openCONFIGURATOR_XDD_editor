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

import org.eclipse.ui.views.properties.ComboBoxPropertyDescriptor;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

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

    protected static final String[] DATA_TYPE_LIST = { "Boolean", "Integer8", "Integer16", "Integer32", "Unsigned8",
            "Unsigned16", "Unsigned32", "Real32", "Visible_String", "Integer24", "Real64", "Integer40", "Integer48",
            "Integer56", "Integer64", "Octet_String", "Unicode_String", "Time_of_Day", "Time_Diff", "Domain",
            "Unsigned24", "Unsigned40", "Unsigned48", "Unsigned56", "Unsigned64", "MAC_ADDRESS", "IP_ADDRESS",
            "NETTIME", "" };

    protected static final String[] OBJECT_TYPES = { "7 - VAR", "8 - ARRAY", "9 - RECORD" };

    protected static final String[] PDO_MAPPING_TYPES = { "Non-mappable", "Mapped by default", "Mapped optionally",
            "Transmit process data objects", "Receive process data objects", "" };

    protected static final String[] ACCESS_TYPE_LIST = { "Constant", "Read only", "Write only", "Read write", "" };

    private static final String[] YES_NO = { "Yes", "No" };
    protected PropertyDescriptor objectIdDescriptor = new PropertyDescriptor(OBJ_INDEX_ID, OBJ_INDEX_LABEL);
    protected TextPropertyDescriptor editableobjectIdDescriptor = new TextPropertyDescriptor(OBJ_INDEX_EDITABLE_ID,
            OBJ_INDEX_LABEL);
    protected PropertyDescriptor nameDescriptor = new PropertyDescriptor(OBJ_NAME_ID, OBJ_NAME_LABEL);
    protected PropertyDescriptor objectTypeDescriptor = new PropertyDescriptor(OBJ_TYPE_ID, OBJ_TYPE_LABEL);
    protected PropertyDescriptor dataTypeDescriptor = new PropertyDescriptor(OBJ_DATATYPE_ID, OBJ_DATATYPE_LABEL);
    protected PropertyDescriptor lowLimitDescriptor = new PropertyDescriptor(OBJ_LOW_LIMIT_ID, OBJ_LOW_LIMIT_LABEL);
    protected PropertyDescriptor highLimitDescriptor = new PropertyDescriptor(OBJ_HIGH_LIMIT_ID, OBJ_HIGH_LIMIT_LABEL);
    protected PropertyDescriptor accessTypeDescriptor = new PropertyDescriptor(OBJ_ACCESS_TYPE_ID,
            OBJ_ACCESS_TYPE_LABEL);

    protected static final String INVALID_DATA_TYPE_VALUE = "Invalid value for data type {0}.";

    protected PropertyDescriptor defaultValueDescriptor = new PropertyDescriptor(OBJ_DEFAULT_VALUE_ID,
            OBJ_DEFAULT_VALUE_LABEL);
    protected PropertyDescriptor actualValueReadOnlyDescriptor = new PropertyDescriptor(OBJ_ACTUAL_VALUE_READ_ONLY_ID,
            OBJ_ACTUAL_VALUE_LABEL);
    protected TextPropertyDescriptor actualValueEditableDescriptor = new TextPropertyDescriptor(
            OBJ_ACTUAL_VALUE_EDITABLE_ID, OBJ_ACTUAL_VALUE_LABEL);

    protected ComboBoxPropertyDescriptor forceActualValue = new ComboBoxPropertyDescriptor(OBJ_FORCE_ACTUAL_VALUE_ID,
            OBJ_FORCE_ACTUAL_VALUE_LABEL, YES_NO);
    protected PropertyDescriptor denotationDescriptor = new PropertyDescriptor(OBJ_DENOTATION_ID, OBJ_DENOTATION_LABEL);
    protected PropertyDescriptor pdoMappingDescriptor = new PropertyDescriptor(OBJ_PDO_MAPPING_ID,
            OBJ_PDO_MAPPING_LABEL);
    protected PropertyDescriptor objFlagsDescriptor = new PropertyDescriptor(OBJ_OBJFLAGS_ID, OBJ_OBJFLAGS_LABEL);
    protected PropertyDescriptor uniqueIDRefDescriptor = new PropertyDescriptor(OBJ_UNIQUEIDREF_ID,
            OBJ_UNIQUEIDREF_LABEL);

    protected PropertyDescriptor objectErrorDescriptor = new PropertyDescriptor(OBJ_ERROR_ID, "Error");

    protected TextPropertyDescriptor editNameDescriptor = new TextPropertyDescriptor(OBJ_NAME_EDITABLE_ID,
            OBJ_NAME_LABEL);
    protected ComboBoxPropertyDescriptor editObjectTypeDescriptor = new ComboBoxPropertyDescriptor(OBJ_TYPE_EDITABLE_ID,
            OBJ_TYPE_LABEL, OBJECT_TYPES);
    protected ComboBoxPropertyDescriptor editDataTypeDescriptor = new ComboBoxPropertyDescriptor(
            OBJ_DATATYPE_EDITABLE_ID, OBJ_DATATYPE_LABEL, DATA_TYPE_LIST);
    protected TextPropertyDescriptor editLowLimitDescriptor = new TextPropertyDescriptor(OBJ_LOW_LIMIT_EDITABLE_ID,
            OBJ_LOW_LIMIT_LABEL);
    protected TextPropertyDescriptor editHighLimitDescriptor = new TextPropertyDescriptor(OBJ_HIGH_LIMIT_EDITABLE_ID,
            OBJ_HIGH_LIMIT_LABEL);
    protected ComboBoxPropertyDescriptor editAccessTypeDescriptor = new ComboBoxPropertyDescriptor(
            OBJ_ACCESS_TYPE_EDITABLE_ID, OBJ_ACCESS_TYPE_LABEL, ACCESS_TYPE_LIST);

    protected TextPropertyDescriptor editDefaultValueDescriptor = new TextPropertyDescriptor(
            OBJ_DEFAULT_VALUE_EDITABLE_ID, OBJ_DEFAULT_VALUE_LABEL);

    protected TextPropertyDescriptor editDenotationDescriptor = new TextPropertyDescriptor(OBJ_DENOTATION_EDITABLE_ID,
            OBJ_DENOTATION_LABEL);
    protected ComboBoxPropertyDescriptor editPdoMappingDescriptor = new ComboBoxPropertyDescriptor(
            OBJ_PDO_MAPPING_EDITABLE_ID, OBJ_PDO_MAPPING_LABEL, PDO_MAPPING_TYPES);
    protected TextPropertyDescriptor editbjFlagsDescriptor = new TextPropertyDescriptor(OBJ_OBJFLAGS_EDITABLE_ID,
            OBJ_OBJFLAGS_LABEL);

    public DeviceDescriptionFileEditor getEditor() {
        return editor;
    }

    public void setEditor(DeviceDescriptionFileEditor editor) {
        this.editor = editor;
    }

}
