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

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.DatatypeConverter;
import javax.xml.datatype.XMLGregorianCalendar;

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
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

import com.br_automation.buoat.xddeditor.XDD.SubObjectType;
import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.TObjectAccessType;
import com.br_automation.buoat.xddeditor.XDD.TObjectPDOMapping;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;
import com.br_automation.buoat.xddeditor.XDD.custom.CustomXDDWizard;
import com.br_automation.buoat.xddeditor.XDD.custom.Messages;
import com.br_automation.buoat.xddeditor.XDD.custom.XDDUtilities;
import com.br_automation.buoat.xddeditor.XDD.impl.SubObjectTypeImpl;
import com.br_automation.buoat.xddeditor.XDD.impl.TObjectImpl;

/**
 * Class to create a wizard page to add sub object
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

    private Short idx;

    private TObjectImpl selObj;

    public static final int MANUFACTURER_PROFILE_START_INDEX = 0x2000;
    public static final int MANUFACTURER_PROFILE_END_INDEX = 0x5FFF;

    public static final int MANUFACTURER_PROFILE_SUB_OBJ_START_INDEX = 0x00;
    public static final int MANUFACTURER_PROFILE_SUB_OBJ_END_INDEX = 0xFF;

    /**
     * @param pageID
     *            ID of the page.
     * @param wizard
     *            the parent-wizard.
     */
    public AddSubObjectWizardPage(String pageID, TObjectImpl selectedObj) {
        super(pageID);
        this.setTitle(Messages.addSubObjectWizardPage_adv_conf_page_title);
        this.setDescription(Messages.addSubObjectWizardPage_type_in_data_new_model_subheadline);
        this.setPageComplete(true);
        selObj = (TObjectImpl) selectedObj;
    }

    /**
     * @see WizardPage#createControl(Composite)
     */
    @Override
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NULL);
        this.setControl(container);

        SimpleDateFormat creationTime = new SimpleDateFormat("HH:mm:ssZ"); //$NON-NLS-1$
        String creationTimeStr = creationTime.format(new Date());
        creationTimeStr = creationTimeStr.substring(0, 11) + ":00";

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
        this.txtLowLimit.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                setErrorMessage(null);
                setPageComplete(true);
                if (subDataType == "Boolean") {
                    txtLowLimit.setEnabled(false);
                } else {
                    subLowLimit = txtLowLimit.getText();
                    if (!isValueValid(subLowLimit)) {
                        setErrorMessage("Invalid value.");
                        setPageComplete(false);
                    }

                }

                getWizard().getContainer().updateButtons();
            }

        });

        this.txtHighLimit = new Text(grpAddObjectAdvancedOptions, SWT.BORDER);
        this.txtHighLimit.setText(Messages.addObjectWizardPage_txtHighLimit); // $NON-NLS-1$
        this.txtHighLimit.setBounds(136, 164, 140, 21);
        this.txtHighLimit.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                setErrorMessage(null);
                setPageComplete(true);
                if (subDataType == "Boolean") {
                    txtHighLimit.setEnabled(false);
                } else {
                    subHighLimit = txtHighLimit.getText();
                    if (!isValueValid(subHighLimit)) {
                        setErrorMessage("Invalid value.");
                        setPageComplete(false);
                    }
                }
                getWizard().getContainer().updateButtons();
            }

        });

        Label lblAccessType = new Label(grpAddObjectAdvancedOptions, SWT.NONE);
        lblAccessType.setText(Messages.addSubObjectWizardPage_lblAccess_type);
        lblAccessType.setBounds(10, 51, 120, 21);

        comboAccessType = new Combo(grpAddObjectAdvancedOptions, SWT.NONE | SWT.READ_ONLY);
        comboAccessType.setItems(new String[] { "Constant", "Read only", "Write only", "Read write" });
        comboAccessType.setBounds(136, 51, 140, 25);
        comboAccessType.select(0);
        comboAccessType.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                subAccessType = comboAccessType.getText();
            }
        });

        comboDataType = new Combo(grpAddObjectAdvancedOptions, SWT.NONE | SWT.READ_ONLY);
        comboDataType.setItems(new String[] { "Boolean", "Integer8", "Integer16", "Integer32", "Unsigned8",
                "Unsigned16", "Unsigned32", "Real32", "Visible_String", "Integer24", "Real64", "Integer40", "Integer48",
                "Integer56", "Integer64", "Octet_String", "Unicode_String", "Time_of_Day", "Time_Diff", "Domain",
                "Unsigned24", "Unsigned40", "Unsigned48", "Unsigned56", "Unsigned64", "MAC_ADDRESS", "IP_ADDRESS",
                "NETTIME" });
        comboDataType.setBounds(136, 22, 140, 25);
        comboDataType.select(0);
        comboDataType.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                subDataType = comboDataType.getText();
            }
        });

        txtDefaultValue = new Text(grpAddObjectAdvancedOptions, SWT.BORDER);
        txtDefaultValue.setText(Messages.addObjectWizardPage_txtDefaultValue);
        txtDefaultValue.setBounds(136, 107, 140, 23);
        txtDefaultValue.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                setErrorMessage(null);
                setPageComplete(true);
                if (subDataType == "Boolean") {
                    txtDefaultValue.setEnabled(false);
                } else {
                    subDefaultValue = txtDefaultValue.getText();
                    if (!isValueValid(subDefaultValue)) {
                        setErrorMessage("Invalid value.");
                        setPageComplete(false);
                    }

                }
                getWizard().getContainer().updateButtons();
            }

        });
        Label lblDefaultValue = new Label(grpAddObjectAdvancedOptions, SWT.NONE);
        lblDefaultValue.setText(Messages.addSubObjectWizardPage_lblDefault_value);
        lblDefaultValue.setBounds(10, 107, 120, 21);

        Label lblPdoMapping = new Label(grpAddObjectAdvancedOptions, SWT.NONE);
        lblPdoMapping.setText(Messages.addSubObjectWizardPage_lblPdo_mapping);
        lblPdoMapping.setBounds(10, 80, 120, 21);

        comboPdoMapping = new Combo(grpAddObjectAdvancedOptions, SWT.NONE | SWT.READ_ONLY);
        comboPdoMapping.setItems(new String[] { "Non-mappable", "Mapped by default", "Mapped optionally",
                "Trasmit process data objects", "Receive process data objects" });
        comboPdoMapping.setBounds(136, 78, 140, 23);
        comboPdoMapping.select(0);
        comboPdoMapping.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                subPdoMapping = comboPdoMapping.getText();
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
        comboObjType.setItems(new String[] { "7- VAR", "8 - ARRAY", "9 - RECORD" });
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
        txtSubObjIndex.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                setErrorMessage(null);
                setPageComplete(true);
                subObjIndex = txtSubObjIndex.getText();
                getWizard().getContainer().updateButtons();
            }

        });

        txtSubObjName = new Text(grpSubObjDetails, SWT.BORDER);
        txtSubObjName.setText(Messages.addSubObjectWizardPage_txtObject_name);
        txtSubObjName.setBounds(115, 43, 140, 21);
        txtSubObjName.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                setErrorMessage(null);
                setPageComplete(true);
                subObjName = txtSubObjName.getText();

                if (!isValueValid(subObjName)) {
                    setErrorMessage("Invalid value.");
                    setPageComplete(false);
                }

                getWizard().getContainer().updateButtons();
            }

        });

        comboSubObjType = new Combo(grpSubObjDetails, SWT.NONE | SWT.READ_ONLY);
        comboSubObjType.setItems(new String[] { "7- VAR", "8 - ARRAY", "9 - RECORD" });
        comboSubObjType.setBounds(115, 67, 140, 23);
        comboSubObjType.select(0);
        comboSubObjType.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                subObjectType = comboSubObjType.getText();
            }
        });
    } // createControl

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

    public String getTxtLowLimit() {
        return subLowLimit;
    }

    public String getTxtHighLimit() {
        return subHighLimit;
    }

    public short getSubObjectType() {

        if (subObjectType == null) {
            subObjectType = comboSubObjType.getText();
        }
        if (subObjectType.equalsIgnoreCase("Variable")) {
            return 7;
        }
        if (subObjectType.equalsIgnoreCase("Array")) {
            return 8;
        }
        if (subObjectType.equalsIgnoreCase("Record")) {
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
        if (subDataType == null) {
            subDataType = comboDataType.getText();
        }
        if (!subDataType.isEmpty()) {

            return DatatypeConverter.parseHexBinary(getDatTypeValue(subDataType));
        }
        return null;
    }

    public TObjectPDOMapping getPdoMapping() {

        subPdoMapping = comboPdoMapping.getText();
        if (subPdoMapping == null) {
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
        if (subPdoMapping.equalsIgnoreCase("Trasmit process data objects")) {
            return TObjectPDOMapping.TPDO;
        }
        if (subPdoMapping.equalsIgnoreCase("Receive process data objects")) {
            return TObjectPDOMapping.RPDO;
        }
        return TObjectPDOMapping.DEFAULT;
    }

    public TObjectAccessType getAccessType() {
        if (subAccessType == null) {
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

    public XMLGregorianCalendar getCreationDateXML() {
        return XDDUtilities.getXMLDate();
    }

    public XMLGregorianCalendar getCreationTimeXML() {
        return XDDUtilities.getXMLTime();
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
                setErrorMessage("Invalid value.");
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
        setErrorMessage(null);
        if (index.isEmpty()) {
            setErrorMessage("Enter the hexadecimal sub object index value within the range (0x00 to 0xFF).");
            return false;
        }
        if (!isValueHex(index)) {
            setErrorMessage("Enter Sub Object value in hexadecimal format");
            return false;
        }
        if (!isObjectIndexValid(index)) {
            setErrorMessage("The index does not match the limit of user defined sub objects.");
            return false;
        }
        if (!isObjectIndexAvailable(index)) {
            setErrorMessage("The Sub Object index '" + index + "' is already taken.");
            return false;
        }

        String objName = getTxtSubObjName();
        if (objName.isEmpty()) {
            setErrorMessage("Enter the name of object.");
            return false;
        }
        if (!isValidVal(defaultVal, "Default value")) {
            return false;
        }
        if (!isValidVal(lowLimit, "low value")) {
            return false;
        }
        if (!isValidVal(highLimit, "high value")) {
            return false;
        }
        if (Integer.parseInt(lowLimit) > Integer.parseInt(highLimit)) {
            setErrorMessage("low value should not be greater than high value");
            return false;
        }
        return true;
    }

    private boolean isValidDefaultVal(String defVal) {
        try {
            Integer val = Integer.parseInt(defVal);
            return true;
        } catch (NumberFormatException e) {
            // TODO: handle exception
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
                    // TODO: handle exception
                    setErrorMessage(dataType + " accepts only decimal value");
                }
            }
            case "Integer8": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Integer8_min || llimit > DataTypeRange.Integer8_max) {
                        setErrorMessage("Entered " + str + " is improper to the " + dataType + " range (-256 - 255).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {
                    // TODO: handle exception
                    setErrorMessage(dataType + " accepts only decimal value");
                }
            }
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
                    // TODO: handle exception
                    setErrorMessage(dataType + " accepts only decimal value");
                }
            }
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
                    // TODO: handle exception
                    setErrorMessage(dataType + " accepts only decimal value");
                }
            }
            case "Unsigned8": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned8_min || llimit > DataTypeRange.Unsigned8_max) {
                        setErrorMessage("Entered " + str + " is improper to the " + dataType + " range (0 - 255).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {
                    // TODO: handle exception
                    setErrorMessage(dataType + " accepts only decimal value");
                }
            }
            case "Unsigned16": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned16_min || llimit > DataTypeRange.Unsigned16_max) {
                        setErrorMessage("Entered " + str + " is improper to the " + dataType + " range (0 - 65,535).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {
                    // TODO: handle exception
                    setErrorMessage(dataType + " accepts only decimal value");
                }
            }
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
                    // TODO: handle exception
                    setErrorMessage(dataType + " accepts only decimal value");
                }
            }
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
                    // TODO: handle exception
                    setErrorMessage(dataType + " accepts only decimal value");
                }
            }
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
                    // TODO: handle exception
                    setErrorMessage(dataType + " accepts only decimal value");
                }

            }
            case "Visible_String": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned16_min || llimit > DataTypeRange.Unsigned16_max) {
                        setErrorMessage("Entered " + str + " is improper to the " + dataType + " range (0 - 65,535).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {
                    // TODO: handle exception
                    setErrorMessage(dataType + " accepts only decimal value");
                }

            }
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
                    // TODO: handle exception
                    setErrorMessage(dataType + " accepts only decimal value");
                }

            }
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
                    // TODO: handle exception
                    setErrorMessage(dataType + " accepts only decimal value");
                }

            }
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
                    // TODO: handle exception
                    setErrorMessage(dataType + " accepts only decimal value");
                }

            }
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
                    // TODO: handle exception
                    setErrorMessage(dataType + " accepts only decimal value");
                }

            }
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
                    // TODO: handle exception
                    setErrorMessage(dataType + " accepts only decimal value");
                }

            }
            case "Octet_String": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned8_min || llimit > DataTypeRange.Unsigned8_max) {
                        setErrorMessage("Entered " + str + " is improper to the " + dataType + " range (0 - 255).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {
                    // TODO: handle exception
                    setErrorMessage(dataType + " accepts only decimal value");
                }
            }
            case "Unicode_String": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < DataTypeRange.Unsigned16_min || llimit > DataTypeRange.Unsigned16_max) {
                        setErrorMessage("Entered " + str + " is improper to the " + dataType + " range (0 - 65,535).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {
                    // TODO: handle exception
                    setErrorMessage(dataType + " accepts only decimal value");
                }
            }
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
                    // TODO: handle exception
                    setErrorMessage(dataType + " accepts only decimal value");
                }

            }
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
                    // TODO: handle exception
                    setErrorMessage(dataType + " accepts only decimal value");
                }

            }
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
                    // TODO: handle exception
                    setErrorMessage(dataType + " accepts only decimal value");
                }
            }
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
                    // TODO: handle exception
                    setErrorMessage(dataType + " accepts only decimal value");
                }

            }
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
                    // TODO: handle exception
                    setErrorMessage(dataType + " accepts only decimal value");
                }

            }
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
                    // TODO: handle exception
                    setErrorMessage(dataType + " accepts only decimal value");
                }

            }
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
                    // TODO: handle exception
                    setErrorMessage(dataType + " accepts only decimal value");
                }

            }
            case "Unsigned64": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < 0 || llimit > 1) {
                        setErrorMessage("Entered " + str + " is improper to the " + dataType + " range (-).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {
                    // TODO: handle exception
                    setErrorMessage(dataType + " accepts only decimal value");
                }

            }
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
                    // TODO: handle exception
                    setErrorMessage(dataType + " accepts only decimal value");
                }

            }
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
                    // TODO: handle exception
                    setErrorMessage(dataType + " accepts only decimal value");
                }
            }
            case "NETTIME": {
                try {
                    llimit = Long.parseLong(highLowLimit);
                    if (llimit < 0 || llimit > 1) {
                        setErrorMessage("Entered " + str + " is improper to the " + dataType + " range (-).");
                        return false;
                    } else
                        return true;
                } catch (NumberFormatException e) {
                    // TODO: handle exception
                    setErrorMessage(dataType + " accepts only decimal value");
                }

            }
            default:
                return true;
            }
        } else {
            return false;
        }
    }

    private boolean isValueHex(String text) {
        if (text.contains("0x")) {
            return true;
        }
        return false;
    }

    private boolean isObjectIndexValid(String text) {
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
                    Integer val = Integer.valueOf(text);
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

    private boolean isObjectIndexAvailable(String objIndex) {

        List<SubObjectType> subObjectList = selObj.getSubObject();

        for (SubObjectType subObject : subObjectList) {
            byte[] index = subObject.getSubIndex();
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
                return DatatypeConverter.parseHexBinary(index);
            }
            // else{
            // //Integer.toHexString(Integer.parseInt(index));
            // System.out.println(index);
            // index = index.toString();
            // return DatatypeConverter.parseHexBinary(index);
        }
        return null;
    }

    /**
     * @return The NMTBootTimeNotActive time setted in the wizard as
     *         integer-value.
     */

    public Integer getNMTBootTimeNotActive() {
        if (!this.txtLowLimit.getText().isEmpty())
            return Integer.parseInt(this.txtLowLimit.getText());
        return null;
    }


    /**
     * @return The NMTCycleTimeMax setted in the wizard as integer-value.
     */
    public Integer getNMTCycleTimeMax() {
        if (!this.txtHighLimit.getText().isEmpty())
            return Integer.parseInt(this.txtHighLimit.getText());
        return null;
    }
} // AddSubObjectWizardPage
