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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

    private Short idx;

    private TObjectImpl selObj;

    private DeviceDescriptionFileEditor editor;

    /**
     * Name verify listener
     */
    private NameVerifyListener nameVerifyListener = new NameVerifyListener();

    public static final int MANUFACTURER_PROFILE_START_INDEX = 0x2000;
    public static final int MANUFACTURER_PROFILE_END_INDEX = 0x5FFF;

    public static final int MANUFACTURER_PROFILE_SUB_OBJ_START_INDEX = 0x01;
    public static final int MANUFACTURER_PROFILE_SUB_OBJ_END_INDEX = 0xFE;

    private static final String[] DATA_TYPE_LIST = new String[] { "Boolean", "Integer8", "Integer16", "Integer32",
            "Unsigned8", "Unsigned16", "Unsigned32", "Real32", "Visible_String", "Integer24", "Real64", "Integer40",
            "Integer48", "Integer56", "Integer64", "Octet_String", "Unicode_String", "Time_of_Day", "Time_Diff",
            "Domain", "Unsigned24", "Unsigned40", "Unsigned48", "Unsigned56", "Unsigned64", "MAC_ADDRESS", "IP_ADDRESS",
            "NETTIME" };

    private static final String[] PDO_MAPPING_TYPES = new String[] { "Non-mappable", "Mapped by default",
            "Mapped optionally", "Transmit process data objects", "Receive process data objects" };

    private static final String[] ACCESS_TYPE_LIST = new String[] { "Constant", "Read only", "Write only",
            "Read write" };

    private static final String[] OBJECT_TYPES = new String[] { "7 - VAR", "8 - ARRAY", "9 - RECORD" };

    private static final String INVALID_VALUE = "Invalid value.";

    protected static final String INVALID_DATA_TYPE_VALUE = "Invalid value for data type {0}.";

    /**
     * Constructor to initialize the document instance.
     *
     * @param pageName
     *            Name of the wizard page.
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
                    setErrorMessage("Sub-object with access type '" + subAccessType + "' does not allow '"
                            + subPdoMapping + "'.");
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
                    setErrorMessage("Sub-object with access type '" + subAccessType + "' does not allow '"
                            + subPdoMapping + "'.");
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

        // comboObjType.

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
            if (subDataType == DATA_TYPE_LIST[0]) {
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
            if (subDataType == DATA_TYPE_LIST[0]) {
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
            if (subDataType == "Boolean") {
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

    public String getTxtLowLimit() {
        return subLowLimit;
    }

    public String getTxtHighLimit() {
        return subHighLimit;
    }

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

    public String getTxtDefaultValue() {
        return subDefaultValue;
    }

    public String getHighLimit() {
        subHighLimit = "0x" + subHighLimit;
        return subHighLimit;
    }

    public String getLowLimit() {
        subLowLimit = "0x" + subLowLimit;
        return subLowLimit;
    }

    public String getTxtSubObjIndex() {
        return subObjIndex;
    }

    public String getTxtSubObjName() {
        return subObjName;
    }

    public byte[] getDataType() {
        if (!subDataType.isEmpty()) {
            subDataType = comboDataType.getText();
        }
        System.err.println("Data type.." + subDataType);
        return DatatypeConverter.parseHexBinary(getDatTypeValue(subDataType));
    }

    public TObjectPDOMapping getPdoMapping() {

        subPdoMapping = comboPdoMapping.getText();
        if (subPdoMapping.isEmpty()) {
            subPdoMapping = comboPdoMapping.getText();
        }
        if (subPdoMapping.equalsIgnoreCase("Non-mappable")) {
            return TObjectPDOMapping.NO;
        }
        if (subPdoMapping.equalsIgnoreCase("Mapped by default")) {
            return TObjectPDOMapping.DEFAULT;
        }
        if (subPdoMapping.equalsIgnoreCase("Mapped optionally")) {
            return TObjectPDOMapping.OPTIONAL;
        }
        if (subPdoMapping.equalsIgnoreCase("Transmit process data objects")) {
            return TObjectPDOMapping.TPDO;
        }
        if (subPdoMapping.equalsIgnoreCase("Receive process data objects")) {
            return TObjectPDOMapping.RPDO;
        }
        return TObjectPDOMapping.DEFAULT;
    }

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
        if (subAccessType.equalsIgnoreCase("Read write")) {
            return TObjectAccessType.RW;
        }
        return TObjectAccessType.CONST;
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

    public String getDatTypeValue(String dataType) {
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
                    if (val < 0 && val < 255) {
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

        boolean pageComplete = (super.isPageComplete());

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
        String dataType = getDatTypeValue(comboDataType.getText());
        String objIndex = DatatypeConverter.printHexBinary(selObj.getIndex());
        String pdoMapping = comboPdoMapping.getText();
        String accessType = comboAccessType.getText();
        comboSubObjType.select(0);
        comboSubObjType.setEnabled(false);

        if (selObj.getDataType() != null) {
            if (selObj.getObjectType() == 8) {
                String objDataType = DatatypeConverter.printHexBinary(selObj.getDataType());

                int typeIndex = comboDataType.indexOf(getDataTypeValue(objDataType));
                comboDataType.select(typeIndex);
                comboDataType.setEnabled(false);
                comboSubObjType.select(0);
                comboSubObjType.setEnabled(false);
            }
        }

        setErrorMessage(null);
        if (index.isEmpty()) {
            setErrorMessage("Enter the hexadecimal sub-object index value within the range (0x01 to 0xFE).");
            return false;
        }

        if (index.contains("0x")) {
            if (index.length() > 4) {
                setErrorMessage("Enter the hexadecimal sub-object index value within the range (0x01 to 0xFE).");
                return false;
            }
        } else {
            if (index.length() > 2) {
                setErrorMessage("Enter the sub-object index value within the range (0x01 to 0xFE).");
                return false;
            }
        }

        if (!isSubObjectIndexValid(index)) {
            setErrorMessage("Sub-object index is out of range (0x01 to 0xFE).");
            return false;
        }

        if (!isValidDataType(dataType)) {
            setErrorMessage("Since the object type of object index  '" + objIndex + "' is '"
                    + getObjectType(selObj.getObjectType()) + "'. Please select the data type as '"
                    + getDataTypeValue(validDataType) + "'.");
            return false;
        }

        if (!isObjectIndexAvailable(index)) {
            setErrorMessage("Sub-object index '" + index + "' already exists in the file '"
                    + editor.getActiveEditor().getTitle() + "'.");
            return false;
        }

        String objName = getTxtSubObjName();
        if (objName.isEmpty()) {
            setErrorMessage("Enter the name of sub-object.");
            return false;
        }

        if (!isPdoMappingValueValid(pdoMapping)) {
            setErrorMessage("Sub-object with access type '" + accessType + "' does not allow '" + pdoMapping + "'.");
            return false;
        }

        txtDefaultValue.setEnabled(true);
        txtHighLimit.setEnabled(true);
        txtLowLimit.setEnabled(true);

        if (!defaultVal.isEmpty()) {
            if (!isValidVal(defaultVal, "'Default value'")) {
                return false;
            }
        }

        if (!lowLimit.isEmpty()) {
            if (!isValidVal(lowLimit, "'Low limit")) {
                return false;
            }
        }

        if (!highLimit.isEmpty()) {
            if (!isValidVal(highLimit, "'High limit'")) {
                return false;
            }
        }

        if ((!highLimit.isEmpty()) && (!lowLimit.isEmpty())) {
            if (Integer.parseInt(lowLimit) > Integer.parseInt(highLimit)) {
                setErrorMessage("Low limit cannot be greater than high limit.");
                return false;
            }
        }

        if (!highLimit.isEmpty() && (!defaultVal.isEmpty())) {
            Integer highlimitVal = Integer.valueOf(highLimit);
            Integer defaultValue = Integer.valueOf(defaultVal);
            if (defaultValue > highlimitVal) {
                setErrorMessage(
                        "Default value '" + defaultValue + "' exceeds the high limit value '" + highlimitVal + "'.");
                return false;
            }
        }

        if (!lowLimit.isEmpty() && (!defaultVal.isEmpty())) {
            Integer lowLimitVal = Integer.valueOf(lowLimit);
            Integer defaultValue = Integer.valueOf(defaultVal);
            if (defaultValue < lowLimitVal) {
                setErrorMessage("Default value '" + defaultValue + "' cannot be lesser than low limit value '"
                        + lowLimitVal + "'.");
                return false;
            }
        }
        return true;
    }

    private String validDataType = StringUtils.EMPTY;

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
        case "Non-mappable":
            break;
        case "Mapped by default":
            break;
        case "Mapped optionally":
            if (accessType == TObjectAccessType.CONST) {
                return false;
            }
            break;
        case "Transmit process data objects":
            if (accessType == TObjectAccessType.CONST) {
                return false;
            }
            if (accessType == TObjectAccessType.RW) {
                return false;
            }
            break;
        case "Receive process data objects":
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

    private boolean isValidDefaultVal(String defVal) {
        try {
            Integer val = Integer.parseInt(defVal);
            return true;
        } catch (NumberFormatException e) {

            return false;
        }
    }

    private boolean isValidVal(String highLowLimit, String str) {
        String dataType = comboDataType.getText();
        if (!highLowLimit.isEmpty()) {
            long llimit;
            switch (dataType) {
            case "Boolean": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Boolean_min || llimit > DataTypeRange.Boolean_max) {
                        setErrorMessage("Entered " + str + " is improper to the " + dataType + " range (0 - 1).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {

                    setErrorMessage(MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }
            }
                break;
            case "Integer8": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Integer8_min || llimit > DataTypeRange.Integer8_max) {
                        setErrorMessage("Entered " + str + " is improper to the " + dataType + " range (-256 - 255).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {

                    setErrorMessage(MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }
            }
                break;
            case "Integer16": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Integer16_min || llimit > DataTypeRange.Integer16_max) {
                        setErrorMessage(
                                "Entered " + str + " is improper to the " + dataType + " range (-65,536 - 65,535 ).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {

                    setErrorMessage(MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }
            }
                break;
            case "Integer32": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Integer32_min || llimit > DataTypeRange.Integer32_max) {
                        setErrorMessage("Entered " + str + " is improper to the " + dataType
                                + " range (-4,294,967,296 - 4,294,967,295).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {

                    setErrorMessage(MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }
            }
                break;
            case "Unsigned8": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned8_min || llimit > DataTypeRange.Unsigned8_max) {
                        setErrorMessage("Entered " + str + " is improper to the " + dataType + " range (0 - 255).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {

                    setErrorMessage(MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }
            }
                break;
            case "Unsigned16": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned16_min || llimit > DataTypeRange.Unsigned16_max) {
                        setErrorMessage("Entered " + str + " is improper to the " + dataType + " range (0 - 65,535).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {

                    setErrorMessage(MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }
            }
                break;
            case "Unsigned32": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned32_min || llimit > DataTypeRange.Unsigned32_max) {
                        setErrorMessage(
                                "Entered " + str + " is improper to the " + dataType + " range (0 - 4,294,967,295).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {

                    setErrorMessage(MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }
            }
                break;
            case "Real32": {
                try {
                    Double limit = Double.parseDouble(highLowLimit);
                    if (limit < DataTypeRange.Real32_min || limit > DataTypeRange.Real32_max) {
                        setErrorMessage(
                                "Entered " + str + " is improper to the " + dataType + " range (1.2E-38 - 3.4E+38).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {

                    setErrorMessage(MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }
            }
                break;
            case "Real64": {
                try {
                    Double limit = Double.parseDouble(highLowLimit);
                    if (limit < DataTypeRange.Real64_min || limit > DataTypeRange.Real64_max) {
                        setErrorMessage(
                                "Entered " + str + " is improper to the " + dataType + " range (2.3E-308 - 1.7E+308).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {

                    setErrorMessage(MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }

            }
                break;
            case "Visible_String": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned16_min || llimit > DataTypeRange.Unsigned16_max) {
                        setErrorMessage("Entered " + str + " is improper to the " + dataType + " range (0 - 65,535).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {

                    setErrorMessage(MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }

            }
                break;
            case "Integer24": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Integer24_min || llimit > DataTypeRange.Integer24_max) {
                        setErrorMessage("Entered " + str + " is improper to the " + dataType
                                + " range (8,388,608 - 8,388,607).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {

                    setErrorMessage(MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }

            }
                break;
            case "Integer40": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Integer40_min || llimit > DataTypeRange.Integer40_max) {
                        setErrorMessage("Entered " + str + " is improper to the " + dataType
                                + " range (-549,755,813,888 - 549,755,813,887).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {

                    setErrorMessage(MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }

            }
                break;
            case "Integer48": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Integer48_min || llimit > DataTypeRange.Integer48_max) {
                        setErrorMessage("Entered " + str + " is improper to the " + dataType
                                + " range (-140,737,488,355,328 - 140,737,488,355,327).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {

                    setErrorMessage(MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }

            }
                break;
            case "Integer56": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Integer56_min || llimit > DataTypeRange.Integer56_max) {
                        setErrorMessage("Entered " + str + " is improper to the " + dataType
                                + " range (-36,028,797,018,963,968 - 36,028,797,018,963,967).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {

                    setErrorMessage(MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }

            }
                break;
            case "Integer64": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Integer64_min || llimit > DataTypeRange.Integer64_max) {
                        setErrorMessage("Entered " + str + " is improper to the " + dataType
                                + " range (-9,223,372,036,854,775,808 - 9,223,372,036,854,775,807).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {

                    setErrorMessage(MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }

            }
                break;
            case "Octet_String": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned8_min || llimit > DataTypeRange.Unsigned8_max) {
                        setErrorMessage("Entered " + str + " is improper to the " + dataType + " range (0 - 255).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {

                    setErrorMessage(MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }
            }
                break;
            case "Unicode_String": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned16_min || llimit > DataTypeRange.Unsigned16_max) {
                        setErrorMessage("Entered " + str + " is improper to the " + dataType + " range (0 - 65,535).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {

                    setErrorMessage(MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }
            }
                break;
            case "Time_of_Day": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned48_min || llimit > DataTypeRange.Unsigned48_max) {
                        setErrorMessage("Entered " + str + " is improper to the " + dataType
                                + " range (0 - 281,474,976,710,655).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {

                    setErrorMessage(MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }

            }
                break;
            case "Time_Diff": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned48_min || llimit > DataTypeRange.Unsigned48_max) {
                        setErrorMessage("Entered " + str + " is improper to the " + dataType
                                + " range (0 - 281,474,976,710,655).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {

                    setErrorMessage(MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }

            }
                break;
            case "Domain": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned32_min || llimit > DataTypeRange.Unsigned32_max) {
                        setErrorMessage(
                                "Entered " + str + " is improper to the " + dataType + " range (0 - 4,294,967,295).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {

                    setErrorMessage(MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }
            }
                break;
            case "Unsigned24": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned24_min || llimit > DataTypeRange.Unsigned24_max) {
                        setErrorMessage(
                                "Entered " + str + " is improper to the " + dataType + " range (0 - 16,777,215).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {

                    setErrorMessage(MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }

            }
                break;
            case "Unsigned40": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned40_min || llimit > DataTypeRange.Unsigned40_max) {
                        setErrorMessage("Entered " + str + " is improper to the " + dataType
                                + " range (0 - 1,099,511,627,775).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {

                    setErrorMessage(MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }

            }
                break;
            case "Unsigned48": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned48_min || llimit > DataTypeRange.Unsigned48_max) {
                        setErrorMessage("Entered " + str + " is improper to the " + dataType
                                + " range (0 - 281,474,976,710,655).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {

                    setErrorMessage(MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }

            }
                break;
            case "Unsigned56": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned56_min || llimit > DataTypeRange.Unsigned56_max) {
                        setErrorMessage("Entered " + str + " is improper to the " + dataType
                                + " range (0 - 72,057,594,037,927,935).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {

                    setErrorMessage(MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }

            }
                break;
            case "Unsigned64": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < 0 || llimit > 1) {
                        setErrorMessage("Entered " + str + " is improper to the " + dataType + " range (-).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {

                    setErrorMessage(MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }

            }
                break;
            case "MAC_ADDRESS": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned48_min || llimit > DataTypeRange.Unsigned48_max) {
                        setErrorMessage("Entered " + str + " is improper to the " + dataType
                                + " range (0 - 281,474,976,710,655).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {

                    setErrorMessage(MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }

            }
                break;
            case "IP_ADDRESS": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned32_min || llimit > DataTypeRange.Unsigned32_max) {
                        setErrorMessage(
                                "Entered " + str + " is improper to the " + dataType + " range (0 - 4,294,967,295).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {

                    setErrorMessage(MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }
            }
                break;
            case "NETTIME": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < 0 || llimit > 1) {
                        setErrorMessage("Entered " + str + " is improper to the " + dataType + " range (-).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {

                    setErrorMessage(MessageFormat.format(INVALID_DATA_TYPE_VALUE, dataType));
                }

            }
                break;
            default:
                return true;
            }
        } else {
            return false;
        }
        return false;
    }

    private boolean isValueHex(String text) {
        if (text.contains("0x")) {
            return true;
        }
        return false;
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

    private int newSubIndex;

    private String nextValidSubIndex() {
        List<SubObjectType> subObjList = selObj.getSubObject();
        int greaterSubIndex = 0;
        for (SubObjectType subObj : subObjList) {
            String availableSubIndex = DatatypeConverter.printHexBinary(subObj.getSubIndex());
            greaterSubIndex = Integer.parseInt(availableSubIndex, 16);

        }

        if (greaterSubIndex != 0) {

            newSubIndex = greaterSubIndex + 1;

            return String.valueOf(newSubIndex);

        }
        return "00";
    }

    private boolean isSubObjectIndexIncremental(String indexText) {

        List<SubObjectType> subObjList = selObj.getSubObject();
        int greaterSubIndex = 0;
        for (SubObjectType subObj : subObjList) {
            String availableSubIndex = DatatypeConverter.printHexBinary(subObj.getSubIndex());
            greaterSubIndex = Integer.parseInt(availableSubIndex, 16);

        }

        if (greaterSubIndex != 0) {
            if (indexText.contains("0x")) {
                indexText = indexText.substring(2);
            }
            int enteredText = Integer.parseInt(indexText, 16);
            newSubIndex = greaterSubIndex + 1;
            if (enteredText != newSubIndex) {
                return false;
            }
        }
        return true;
    }

    private boolean isObjectIndexAvailable(String objIndex) {

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
        return null;
    }

} // AddSubObjectWizardPage
