/*******************************************************************************
 * @file   AddSubObjectWizardPage.java
 *
 * @author Jenifer Anthonysamy, Kalycito Infotech Private Limited.
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

package com.br_automation.buoat.xddeditor.XDD.wizards;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.DatatypeConverter;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.eclipse.emf.query.conditions.eobjects.EObjectTypeRelationCondition;
import org.eclipse.emf.query.statements.FROM;
import org.eclipse.emf.query.statements.IQueryResult;
import org.eclipse.emf.query.statements.SELECT;
import org.eclipse.emf.query.statements.WHERE;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

import com.br_automation.buoat.xddeditor.XDD.SubObjectType;
import com.br_automation.buoat.xddeditor.XDD.TObjectAccessType;
import com.br_automation.buoat.xddeditor.XDD.TObjectPDOMapping;
import com.br_automation.buoat.xddeditor.XDD.custom.Messages;
import com.br_automation.buoat.xddeditor.XDD.impl.TObjectImpl;
import com.br_automation.buoat.xddeditor.XDD.resources.IPowerlinkConstants;
import com.br_automation.buoat.xddeditor.XDD.validation.NameVerifyListener;
import com.br_automation.buoat.xddeditor.editor.adapters.AbstractObjectPropertySource;
import com.br_automation.buoat.xddeditor.editor.editors.DeviceDescriptionFileEditor;

/**
 * Class to create a wizard page to add sub-object
 *
 * @author Jenifer Anthonysamy
 *
 */
public class AddSubObjectWizardPage extends WizardPage {

    private Text txtLowLimit;
    private Text txtHighLimit;
    private Text txtObjName;
    private Text txtObjIndex;
    private Text txtDefaultValue;
    private Text txtSubObjIndex;
    private Text txtSubObjName;

    private Combo comboSubObjType;
    private Combo comboAccessType;
    private Combo comboDataType;
    private Combo comboPdoMapping;

    private String subLowLimit = StringUtils.EMPTY;
    private String subHighLimit = StringUtils.EMPTY;
    private String subDefaultValue = StringUtils.EMPTY;
    private String subAccessType = StringUtils.EMPTY;
    private String subDataType = StringUtils.EMPTY;
    private String subPdoMapping = StringUtils.EMPTY;
    private String subObjIndex = StringUtils.EMPTY;
    private String subObjName = StringUtils.EMPTY;
    private String subObjectType = StringUtils.EMPTY;
    private String validDataType = StringUtils.EMPTY;

    private Short idx;

    private TObjectImpl selObj;

    private DeviceDescriptionFileEditor editor;

    /**
     * Name verify listener
     */
    private NameVerifyListener nameVerifyListener = new NameVerifyListener();

    public static final int MANUFACTURER_PROFILE_SUB_OBJ_START_INDEX = 0x01;
    public static final int MANUFACTURER_PROFILE_SUB_OBJ_END_INDEX = 0xFE;

    private static final String[] DATA_TYPE_LIST = new String[] { "Boolean", "Integer8", "Integer16", "Integer32",
            "Unsigned8", "Unsigned16", "Unsigned32", "Real32", "Visible_String", "Integer24", "Real64", "Integer40",
            "Integer48", "Integer56", "Integer64", "Octet_String", "Unicode_String", "Time_of_Day", "Time_Diff",
            "Domain", "Unsigned24", "Unsigned40", "Unsigned48", "Unsigned56", "Unsigned64", "MAC_ADDRESS", "IP_ADDRESS",
            "NETTIME" };

    private static final String[] PDO_MAPPING_TYPES = new String[] { "No", "Default", "Optional", "TPDO", "RPDO" };

    private static final String[] ACCESS_TYPE_LIST = new String[] { "Constant", "Read only", "Write only",
            "Read/Write" };

    private static final String[] OBJECT_TYPES = new String[] { "7 - VAR", "8 - ARRAY", "9 - RECORD" };

    private static final String INVALID_VALUE = "Invalid value.";

    protected static final String INVALID_DATA_TYPE_VALUE = "Invalid value for data type {0}.";

    public static final String ENTER_VALID_SUB_OBJECT_INDEX = "Enter the hexadecimal sub-object index value within the range (0x01 to 0xFE).";
    public static final String SUB_OBJECT_INDEX_OUT_OF_RANGE = "Sub-object index is out of range (0x01 to 0xFE).";
    public static final String SUB_OBJECT_ALREADY_EXISTS_ERROR_MESSAGE = "Sub-object index {0} already exists in the file {1}.";
    public static final String ENTER_SUB_OBJECT_NAME = "Enter the name of Sub-object.";
    public static final String SUB_OBJECT_ACCESS_TYPE_INVALID_PDO_MAPPING = "Sub-object with access type {0} does not allow {1}.";
    public static final String SELECT_VALID_DATA_TYPE = "Since the object type of object index  {0} is {1}. Please select the data type as {2}.";
    public static final String LOW_LIMIT_GREATER_THAN_HIGH_LIMIT = "Low limit cannot be greater than high limit.";
    public static final String DEFAULT_VALUE_GREATER_THAN_HIGH_LIMIT = "Default value {0} exceeds the high limit value {1}.";
    public static final String DEFAULT_VALUE_LESSER_THAN_HIGH_LIMIT = "Default value {0} cannot be lesser than low limit value {1}.";
    public static final String INVALID_PDO_MAPPING_ERROR_MESSAGE = "Sub-object with access type {0} does not allow {1}.";
    public static final String LOW_LIMIT_GREATER_HIGH_LIMIT = "Low limit cannot be greater than high limit.";

    /**
     * Constructor to initialize the document instance.
     *
     * @param pageID
     *            ID of the wizard page.
     * @param documentRoot
     *            the instance of device description file document.
     * @param editor
     *            the instance of editor.
     */
    public AddSubObjectWizardPage(String pageID, TObjectImpl selectedObj, DeviceDescriptionFileEditor editor) {
        super(pageID);
        this.editor = editor;
        this.setTitle(Messages.addSubObjectWizardPage_adv_conf_page_title);
        this.setDescription(Messages.addSubObjectWizardPage_type_in_data_new_model_subheadline);
        this.setPageComplete(true);
        selObj = (TObjectImpl) selectedObj;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.
     * widgets.Composite)
     */
    @Override
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NULL);
        this.setControl(container);

        Group grpAddObjectAdvancedOptions = new Group(container, SWT.SHADOW_OUT);
        grpAddObjectAdvancedOptions.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL)); //$NON-NLS-1$
        grpAddObjectAdvancedOptions.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
        grpAddObjectAdvancedOptions.setText(Messages.addSubObjectWizardPage_advanced_options);
        grpAddObjectAdvancedOptions.setBounds(278, 10, 286, 194);

        Label lblLowLimit = new Label(grpAddObjectAdvancedOptions, SWT.NONE);
        lblLowLimit.setBounds(10, 136, 120, 21);
        lblLowLimit.setText(Messages.addSubObjectWizardPage_lblLow_limit); // $NON-NLS-1$

        Label lblHighLimit = new Label(grpAddObjectAdvancedOptions, SWT.NONE);
        lblHighLimit.setBounds(10, 164, 81, 15);
        lblHighLimit.setText(Messages.addSubObjectWizardPage_lblHigh_limit); // $NON-NLS-1$

        Label lblDataType = new Label(grpAddObjectAdvancedOptions, SWT.NONE);
        lblDataType.setBounds(10, 22, 120, 21);
        lblDataType.setText(Messages.addSubObjectWizardPage_lblDataType);

        this.txtLowLimit = new Text(grpAddObjectAdvancedOptions, SWT.BORDER);
        this.txtLowLimit.setText(Messages.addObjectWizardPage_txtLowLimit); // $NON-NLS-1$
        this.txtLowLimit.setBounds(136, 136, 140, 23);
        this.txtLowLimit.addModifyListener(txtLowLimitModifyListener);

        this.txtHighLimit = new Text(grpAddObjectAdvancedOptions, SWT.BORDER);
        this.txtHighLimit.setText(Messages.addObjectWizardPage_txtHighLimit); // $NON-NLS-1$
        this.txtHighLimit.setBounds(136, 164, 140, 21);
        this.txtHighLimit.addModifyListener(txtHighLimitModifyListener);

        Label lblAccessType = new Label(grpAddObjectAdvancedOptions, SWT.NONE);
        lblAccessType.setText(Messages.addSubObjectWizardPage_lblAccess_type);
        lblAccessType.setBounds(10, 51, 120, 21);

        comboAccessType = new Combo(grpAddObjectAdvancedOptions, SWT.NONE | SWT.READ_ONLY);
        comboAccessType.setItems(ACCESS_TYPE_LIST);
        comboAccessType.setBounds(136, 51, 140, 25);
        comboAccessType.select(0);
        comboAccessType.setText(ACCESS_TYPE_LIST[0]);
        comboAccessType.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                subAccessType = comboAccessType.getText();
                if (!isPdoMappingValueValid(subPdoMapping)) {
                    setErrorMessage(
                            MessageFormat.format(INVALID_PDO_MAPPING_ERROR_MESSAGE, subAccessType, subPdoMapping));
                    setPageComplete(false);
                } else {
                    setErrorMessage(null);
                    setPageComplete(true);
                }
            }
        });

        txtDefaultValue = new Text(grpAddObjectAdvancedOptions, SWT.BORDER);
        txtDefaultValue.setText(Messages.addObjectWizardPage_txtDefaultValue);
        txtDefaultValue.setBounds(136, 107, 140, 23);
        txtDefaultValue.addModifyListener(txtdefaultValueModifyListener);
        Label lblDefaultValue = new Label(grpAddObjectAdvancedOptions, SWT.NONE);
        lblDefaultValue.setText(Messages.addSubObjectWizardPage_lblDefault_value);
        lblDefaultValue.setBounds(10, 107, 120, 21);

        Label lblPdoMapping = new Label(grpAddObjectAdvancedOptions, SWT.NONE);
        lblPdoMapping.setText(Messages.addSubObjectWizardPage_lblPdo_mapping);
        lblPdoMapping.setBounds(10, 80, 120, 21);

        comboPdoMapping = new Combo(grpAddObjectAdvancedOptions, SWT.NONE | SWT.READ_ONLY);
        comboPdoMapping.setItems(PDO_MAPPING_TYPES);
        comboPdoMapping.setBounds(136, 78, 140, 23);
        comboPdoMapping.select(0);
        comboPdoMapping.setText(PDO_MAPPING_TYPES[0]);
        comboPdoMapping.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                subPdoMapping = comboPdoMapping.getText();
                if (!isPdoMappingValueValid(subPdoMapping)) {
                    setErrorMessage(
                            MessageFormat.format(INVALID_PDO_MAPPING_ERROR_MESSAGE, subAccessType, subPdoMapping));
                    setPageComplete(false);
                } else {
                    setErrorMessage(null);
                    setPageComplete(true);
                }
            }
        });

        Group grpObjDetails = new Group(container, SWT.NONE);
        grpObjDetails.setBounds(10, 10, 262, 96);
        grpObjDetails.setText(Messages.addSubObjectWizardPage_object_details);

        Label lblObjIndex = new Label(grpObjDetails, SWT.NONE);
        lblObjIndex.setBounds(10, 22, 91, 15);
        lblObjIndex.setText(Messages.addSubObjectWizardPage_lblObject_index);

        Label lblObjName = new Label(grpObjDetails, SWT.NONE);
        lblObjName.setText(Messages.addSubObjectWizardPage_lblObject_name);
        lblObjName.setBounds(10, 46, 78, 15);

        Label lblObjType = new Label(grpObjDetails, SWT.NONE);
        lblObjType.setText(Messages.addObjectWizardPage_lblObject_type);
        lblObjType.setBounds(10, 70, 91, 23);

        this.txtObjIndex = new Text(grpObjDetails, SWT.READ_ONLY | SWT.BORDER);
        String ObjIndex = DatatypeConverter.printHexBinary(selObj.getIndex());
        this.txtObjIndex.setText(ObjIndex); // $NON-NLS-1$
        this.txtObjIndex.setBounds(115, 19, 140, 21);

        this.txtObjName = new Text(grpObjDetails, SWT.READ_ONLY | SWT.BORDER);
        this.txtObjName.setText(selObj.getName());
        this.txtObjName.setBounds(115, 43, 140, 21);

        Combo comboObjType = new Combo(grpObjDetails, SWT.READ_ONLY | SWT.BORDER);
        comboObjType.setItems(OBJECT_TYPES);
        comboObjType.setBounds(115, 67, 140, 21);
        comboObjType.setEnabled(false);
        Short objType = selObj.getObjectType();
        if (objType == 7)
            idx = 0;
        else if (objType == 8)
            idx = 1;
        else if (objType == 9)
            idx = 2;
        comboObjType.select(idx);

        Group grpSubObjDetails = new Group(container, SWT.NONE);
        grpSubObjDetails.setText(Messages.addSubObjectWizardPage_subobject_details);
        grpSubObjDetails.setBounds(10, 115, 262, 96);

        Label lblSubObjIndex = new Label(grpSubObjDetails, SWT.NONE);
        lblSubObjIndex.setText(Messages.addSubObjectWizardPage_lblSubObject_index);
        lblSubObjIndex.setBounds(10, 22, 91, 15);

        Label lblSubObjName = new Label(grpSubObjDetails, SWT.NONE);
        lblSubObjName.setText(Messages.addSubObjectWizardPage_lblSubObject_name);
        lblSubObjName.setBounds(10, 46, 99, 15);

        Label lblSubObjType = new Label(grpSubObjDetails, SWT.NONE);
        lblSubObjType.setText(Messages.addSubObjectWizardPage_lblSubObject_type);
        lblSubObjType.setBounds(10, 70, 91, 23);

        txtSubObjIndex = new Text(grpSubObjDetails, SWT.BORDER);
        txtSubObjIndex.setText(Messages.addSubObjectWizardPage_txtObject_index);
        txtSubObjIndex.setBounds(115, 19, 140, 21);
        txtSubObjIndex.addModifyListener(txtSubObjeIndexModifyListener);
        txtSubObjIndex.addVerifyListener(nameVerifyListener);

        txtSubObjName = new Text(grpSubObjDetails, SWT.BORDER);
        txtSubObjName.setText(Messages.addSubObjectWizardPage_txtObject_name);
        txtSubObjName.setBounds(115, 43, 140, 21);
        txtSubObjName.addModifyListener(txtSubObjectNameModifyListener);

        comboSubObjType = new Combo(grpSubObjDetails, SWT.NONE | SWT.READ_ONLY);
        comboSubObjType.setItems(IPowerlinkConstants.OBJECT_TYPES);
        comboSubObjType.setBounds(115, 67, 140, 23);
        comboSubObjType.select(0);
        comboSubObjType.setText(IPowerlinkConstants.OBJECT_TYPES[0]);
        comboSubObjType.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                subObjectType = comboSubObjType.getText();
            }
        });

        comboDataType = new Combo(grpAddObjectAdvancedOptions, SWT.NONE | SWT.READ_ONLY);
        comboDataType.setItems(DATA_TYPE_LIST);
        comboDataType.setBounds(136, 22, 140, 25);
        comboDataType.select(0);
        subDataType = comboDataType.getText();
        comboDataType.setText(DATA_TYPE_LIST[0]);
        if (subDataType.contentEquals("Boolean")) {
            txtDefaultValue.setEnabled(false);
            txtHighLimit.setEnabled(false);
            txtLowLimit.setEnabled(false);
        } else {
            txtDefaultValue.setEnabled(true);
            txtHighLimit.setEnabled(true);
            txtLowLimit.setEnabled(true);
        }
        comboDataType.addSelectionListener(dataTypeSelectionListener);

    } // createControl

    private ModifyListener txtLowLimitModifyListener = new ModifyListener() {

        @Override
        public void modifyText(ModifyEvent e) {
            setErrorMessage(null);
            setPageComplete(true);
            if (subDataType.equalsIgnoreCase(DATA_TYPE_LIST[0])) {
                txtLowLimit.setEnabled(false);
            } else {
                subLowLimit = txtLowLimit.getText();
                if (!isValueValid(subLowLimit)) {
                    setErrorMessage(INVALID_VALUE);
                    setPageComplete(false);
                }

            }

            getWizard().getContainer().updateButtons();

        }
    };

    private SelectionListener dataTypeSelectionListener = new SelectionAdapter() {

        @Override
        public void widgetSelected(SelectionEvent e) {
            subDataType = comboDataType.getText();
            if (subDataType.contentEquals("Boolean")) {
                txtDefaultValue.setEnabled(false);
                txtHighLimit.setEnabled(false);
                txtLowLimit.setEnabled(false);
            } else {
                txtDefaultValue.setEnabled(true);
                txtHighLimit.setEnabled(true);
                txtLowLimit.setEnabled(true);
            }

            String defaultVal = txtDefaultValue.getText();
            txtDefaultValue.setText(defaultVal);
            String highLimit = txtHighLimit.getText();
            txtHighLimit.setText(highLimit);
            String lowLimit = txtLowLimit.getText();
            txtLowLimit.setText(lowLimit);
        }
    };

    private ModifyListener txtHighLimitModifyListener = new ModifyListener() {

        @Override
        public void modifyText(ModifyEvent e) {
            setErrorMessage(null);
            setPageComplete(true);
            if (subDataType.equalsIgnoreCase(DATA_TYPE_LIST[0])) {
                txtHighLimit.setEnabled(false);
            } else {
                subHighLimit = txtHighLimit.getText();
                if (!isValueValid(subHighLimit)) {
                    setErrorMessage(INVALID_VALUE);
                    setPageComplete(false);
                }
            }
            getWizard().getContainer().updateButtons();

        }
    };

    private ModifyListener txtSubObjectNameModifyListener = new ModifyListener() {

        @Override
        public void modifyText(ModifyEvent e) {
            setErrorMessage(null);
            setPageComplete(true);
            subObjName = txtSubObjName.getText();

            if (!isValueValid(subObjName)) {
                setErrorMessage(INVALID_VALUE);
                setPageComplete(false);
            }

            getWizard().getContainer().updateButtons();

        }
    };

    private ModifyListener txtSubObjeIndexModifyListener = new ModifyListener() {

        @Override
        public void modifyText(ModifyEvent e) {
            setErrorMessage(null);
            setPageComplete(true);
            subObjIndex = txtSubObjIndex.getText();
            getWizard().getContainer().updateButtons();

        }
    };

    private ModifyListener txtdefaultValueModifyListener = new ModifyListener() {

        @Override
        public void modifyText(ModifyEvent e) {
            setErrorMessage(null);
            setPageComplete(true);
            if (subDataType.equalsIgnoreCase("Boolean")) {
                txtDefaultValue.setEnabled(false);
            } else {
                subDefaultValue = txtDefaultValue.getText();
                if (!isValueValid(subDefaultValue)) {
                    setErrorMessage(INVALID_VALUE);
                    setPageComplete(false);
                }

            }
            getWizard().getContainer().updateButtons();

        }
    };

    /**
     * @return Low limit value from wizard
     */
    public String getTxtLowLimit() {
        return subLowLimit;
    }

    /**
     * @return High limit value from wizard
     */
    public String getTxtHighLimit() {
        return subHighLimit;
    }

    /**
     * Get name of object type
     *
     * @param objectType
     *            Object type value
     * @return Name of object type
     */
    public String getObjectType(short objectType) {
        if (objectType == 7) {
            return IPowerlinkConstants.OBJECT_TYPES[0];
        } else if (objectType == 8) {
            return IPowerlinkConstants.OBJECT_TYPES[1];
        } else if (objectType == 9) {
            return IPowerlinkConstants.OBJECT_TYPES[2];
        }
        return StringUtils.EMPTY;
    }

    /**
     * @return Value of Sub-object type
     */
    public short getSubObjectType() {

        if (subObjectType.isEmpty()) {
            subObjectType = comboSubObjType.getText();
        }
        if (subObjectType.equalsIgnoreCase(IPowerlinkConstants.OBJECT_TYPES[0])) {
            return 7;
        }
        if (subObjectType.equalsIgnoreCase(IPowerlinkConstants.OBJECT_TYPES[1])) {
            return 8;
        }
        if (subObjectType.equalsIgnoreCase(IPowerlinkConstants.OBJECT_TYPES[2])) {
            return 9;
        }
        return 0;
    }

    /**
     * @return Default value from wizard
     */
    public String getTxtDefaultValue() {
        return subDefaultValue;
    }

    /**
     * @return High limit value from wizard
     */
    public String getHighLimit() {
        subHighLimit = "0x" + subHighLimit;
        return subHighLimit;
    }

    /**
     * @return Low limit value from wizard
     */
    public String getLowLimit() {
        subLowLimit = "0x" + subLowLimit;
        return subLowLimit;
    }

    /**
     * @return Sub-object index value from wizard
     */
    public String getTxtSubObjIndex() {
        return subObjIndex;
    }

    /**
     * @return Sub-object name from wizard
     */
    public String getTxtSubObjName() {
        return subObjName;
    }

    /**
     * @return Byte value of data type
     */
    public byte[] getDataType() {
        if (!subDataType.isEmpty()) {
            subDataType = comboDataType.getText();
        }
        return DatatypeConverter.parseHexBinary(getDataTypeVal(subDataType));
    }

    /**
     * @return TObjectPdomapping value from wizard
     */
    public TObjectPDOMapping getPdoMapping() {

        subPdoMapping = comboPdoMapping.getText();
        if (subPdoMapping.isEmpty()) {
            subPdoMapping = comboPdoMapping.getText();
        }
        if (subPdoMapping.equalsIgnoreCase("No")) {
            return TObjectPDOMapping.NO;
        }
        if (subPdoMapping.equalsIgnoreCase("Default")) {
            return TObjectPDOMapping.DEFAULT;
        }
        if (subPdoMapping.equalsIgnoreCase("Optional")) {
            return TObjectPDOMapping.OPTIONAL;
        }
        if (subPdoMapping.equalsIgnoreCase("TPDO")) {
            return TObjectPDOMapping.TPDO;
        }
        if (subPdoMapping.equalsIgnoreCase("RPDO")) {
            return TObjectPDOMapping.RPDO;
        }
        return TObjectPDOMapping.DEFAULT;
    }

    /**
     * @return TObjectAccesstype value from wizard
     */
    public TObjectAccessType getAccessType() {
        if (subAccessType.isEmpty()) {
            subAccessType = comboAccessType.getText();
        }

        if (subAccessType.equalsIgnoreCase("Constant")) {
            return TObjectAccessType.CONST;
        }
        if (subAccessType.equalsIgnoreCase("Read only")) {
            return TObjectAccessType.RO;
        }
        if (subAccessType.equalsIgnoreCase("Write only")) {
            return TObjectAccessType.WO;
        }
        if (subAccessType.equalsIgnoreCase("Read/Write")) {
            return TObjectAccessType.RW;
        }
        return TObjectAccessType.CONST;
    }

    /**
     * Gets the data type of IEC value
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

    private boolean isValueValid(String value) {
        if (!value.isEmpty()) {
            try {
                if (value.contains("0x")) {
                    value = value.substring(2);
                    Integer val = Integer.parseInt(value, 16);
                    if (val < 0) {
                        return false;
                    }
                    if (val < 255) {
                        return false;
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                setErrorMessage(INVALID_VALUE);
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isPageComplete() {

        boolean pageComplete = true;

        if (validateObjectModel()) {
            pageComplete = true;
        } else {
            pageComplete = false;
        }

        return pageComplete;
    }

    private boolean validateObjectModel() {
        String index = getTxtSubObjIndex();
        String defaultVal = getTxtDefaultValue();
        String lowLimit = getTxtLowLimit();
        String highLimit = getTxtHighLimit();
        String dataType = getDataTypeVal(comboDataType.getText());
        String objIndex = DatatypeConverter.printHexBinary(selObj.getIndex());
        String pdoMapping = comboPdoMapping.getText();
        String accessType = comboAccessType.getText();
        comboSubObjType.select(0);
        comboSubObjType.setEnabled(false);
        String dataTypeVal = comboDataType.getText();

        if (selObj.getDataType() != null) {
            if (selObj.getObjectType() == 8) {
                String objDataType = DatatypeConverter.printHexBinary(selObj.getDataType());

                int typeIndex = comboDataType.indexOf(getDataType(objDataType));
                comboDataType.select(typeIndex);
                comboDataType.setEnabled(false);
                comboSubObjType.select(0);
                comboSubObjType.setEnabled(false);
            }
        }

        setErrorMessage(null);
        if (index.isEmpty()) {
            setErrorMessage(ENTER_VALID_SUB_OBJECT_INDEX);
            return false;
        }

        if (index.contains("0x")) {
            if (index.length() > 4) {
                setErrorMessage(ENTER_VALID_SUB_OBJECT_INDEX);
                return false;
            }
        } else {
            if (index.length() > 2) {
                setErrorMessage(ENTER_VALID_SUB_OBJECT_INDEX);
                return false;
            }
        }

        if (!isSubObjectIndexValid(index)) {
            setErrorMessage(SUB_OBJECT_INDEX_OUT_OF_RANGE);
            return false;
        }

        if (!isValidDataType(dataType)) {
            String objectType = getObjectType(selObj.getObjectType());
            String dataTypeValue = getDataType(validDataType);
            setErrorMessage(MessageFormat.format(SELECT_VALID_DATA_TYPE, objIndex, objectType, dataTypeValue));
            return false;
        }

        if (!isSubObjectIndexAvailable(index)) {
            setErrorMessage(MessageFormat.format(SUB_OBJECT_ALREADY_EXISTS_ERROR_MESSAGE, index,
                    editor.getActiveEditor().getTitle()));
            return false;
        }

        String objName = getTxtSubObjName();
        if (objName.isEmpty()) {
            setErrorMessage(ENTER_SUB_OBJECT_NAME);
            return false;
        }

        if (!isPdoMappingValueValid(pdoMapping)) {
            setErrorMessage(MessageFormat.format(SUB_OBJECT_ACCESS_TYPE_INVALID_PDO_MAPPING, accessType, pdoMapping));
            return false;
        }

        txtDefaultValue.setEnabled(true);
        txtHighLimit.setEnabled(true);
        txtLowLimit.setEnabled(true);

        if (!defaultVal.isEmpty()) {
            String errorMessage = AbstractObjectPropertySource.isValidVal(defaultVal, "'Default value'", dataTypeVal);
            if (!errorMessage.isEmpty()) {
                setErrorMessage(errorMessage);
                return false;
            } else {
                setErrorMessage(null);
            }
        }

        if (!lowLimit.isEmpty()) {
            String errorMessage = AbstractObjectPropertySource.isValidVal(lowLimit, "'Low limit'", dataTypeVal);
            if (!errorMessage.isEmpty()) {
                setErrorMessage(errorMessage);
                return false;
            } else {
                setErrorMessage(null);
            }
        }

        if (!highLimit.isEmpty()) {
            String errorMessage = AbstractObjectPropertySource.isValidVal(highLimit, "'High limit'", dataTypeVal);
            if (!errorMessage.isEmpty()) {
                setErrorMessage(errorMessage);
                return false;
            } else {
                setErrorMessage(null);
            }
        }

        if ((!highLimit.isEmpty()) && (!lowLimit.isEmpty())) {
            if (Integer.parseInt(lowLimit) > Integer.parseInt(highLimit)) {
                setErrorMessage(LOW_LIMIT_GREATER_THAN_HIGH_LIMIT);
                return false;
            }
        }

        if (!highLimit.isEmpty() && (!defaultVal.isEmpty())) {
            Integer highlimitVal = Integer.valueOf(highLimit);
            Integer defaultValue = Integer.valueOf(defaultVal);
            if (defaultValue > highlimitVal) {
                setErrorMessage(
                        MessageFormat.format(DEFAULT_VALUE_GREATER_THAN_HIGH_LIMIT, defaultValue, highlimitVal));
                return false;
            }
        }

        if (!lowLimit.isEmpty() && (!defaultVal.isEmpty())) {
            Integer lowLimitVal = Integer.valueOf(lowLimit);
            Integer defaultValue = Integer.valueOf(defaultVal);
            if (defaultValue < lowLimitVal) {
                setErrorMessage(MessageFormat.format(DEFAULT_VALUE_GREATER_THAN_HIGH_LIMIT, defaultValue, lowLimitVal));
                return false;
            }
        }
        return true;
    }

    private boolean isValidDataType(String dataTypeVal) {
        try {
            if (selObj.getObjectType() == 8) {
                List<SubObjectType> subObjList = selObj.getSubObject();
                for (SubObjectType subObj : subObjList) {
                    String subIndex = DatatypeConverter.printHexBinary(subObj.getSubIndex());
                    if (subIndex.equalsIgnoreCase("01")) {
                        validDataType = DatatypeConverter.printHexBinary(subObj.getDataType());

                        if (validDataType.equalsIgnoreCase(dataTypeVal)) {
                            return true;
                        }
                        return false;
                    }
                }
                return true;
            }

            return true;
        } catch (NumberFormatException e) {

            return false;
        }
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
    protected boolean isPdoMappingValueValid(String pdoMappingValue) {

        TObjectAccessType accessType = getAccessType();
        switch (pdoMappingValue) {
        case "No":
            break;
        case "Default":
            break;
        case "Optional":
            if (accessType == TObjectAccessType.CONST) {
                return false;
            }
            break;
        case "TPDO":
            if (accessType == TObjectAccessType.CONST) {
                return false;
            }
            if (accessType == TObjectAccessType.RW) {
                return false;
            }
            break;
        case "RPDO":
            if (accessType == TObjectAccessType.CONST) {
                return false;
            }
            if (accessType == TObjectAccessType.RO) {
                return false;
            }
            break;
        default:
            break;

        }

        return true;
    }

    private boolean isSubObjectIndexValid(String text) {
        if (!text.isEmpty()) {
            try {
                if (text.contains("0x")) {
                    text = text.substring(2);
                    Integer val = Integer.parseInt(text, 16);
                    if ((val < MANUFACTURER_PROFILE_SUB_OBJ_START_INDEX)
                            || (val > MANUFACTURER_PROFILE_SUB_OBJ_END_INDEX)) {
                        return false;
                    }
                } else {
                    Integer val = Integer.parseInt(text, 16);
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

    private boolean isSubObjectIndexAvailable(String objIndex) {

        List<SubObjectType> subObjectList = selObj.getSubObject();

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

    @SuppressWarnings("unchecked")
    public static <T extends EObject> List<T> findESubObjects(TObjectImpl root, EClass eClass) {
        EObjectCondition condition = new EObjectTypeRelationCondition(eClass);
        SELECT statement = new SELECT(new FROM(root.eContents()), new WHERE(condition));
        IQueryResult results = statement.execute();

        EObject[] foundObjects = results.toArray(new EObject[] {});
        List<T> foundObjectsList = new ArrayList<T>();
        for (EObject object : foundObjects)
            foundObjectsList.add((T) object);

        return foundObjectsList;
    }

    /**
     * @return Byte array of sub object index
     */
    public byte[] getSubIndex() {
        String index = getTxtSubObjIndex();
        if (!index.isEmpty()) {
            if (index.contains("0x")) {
                index = index.substring(2);
                if (index.length() == 1) {
                    index = "0" + index;
                }
                return DatatypeConverter.parseHexBinary(index);
            } else {

                if (index.length() == 1) {
                    index = "0" + index;
                }

                return DatatypeConverter.parseHexBinary(index);

            }
        }
        return new byte[0];
    }

} // AddSubObjectWizardPage
