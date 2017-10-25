/*******************************************************************************
 * @file   AddObjectWizardPage.java
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
import java.util.List;

import javax.xml.bind.DatatypeConverter;

import org.apache.commons.lang3.StringUtils;
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

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.TObjectAccessType;
import com.br_automation.buoat.xddeditor.XDD.TObjectPDOMapping;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;
import com.br_automation.buoat.xddeditor.XDD.custom.Messages;
import com.br_automation.buoat.xddeditor.XDD.custom.XDDUtilities;
import com.br_automation.buoat.xddeditor.XDD.resources.IPowerlinkConstants;
import com.br_automation.buoat.xddeditor.XDD.validation.NameVerifyListener;
import com.br_automation.buoat.xddeditor.editor.adapters.AbstractObjectPropertySource;
import com.br_automation.buoat.xddeditor.editor.editors.DeviceDescriptionFileEditor;

/**
 * Wizard page to add user defined objects
 *
 * @author Jenifer Anthonysamy
 */
public class AddObjectWizardPage extends WizardPage {
    private Text txtLowLimit;
    private Text txtHighLimit;
    private Text txtObjectNameText;
    private Text txtObjectIndexText;
    private Text txtDefaultValue;

    private DeviceDescriptionFileEditor editor;

    private DocumentRoot documentRoot;

    public static final int MANUFACTURER_PROFILE_START_INDEX = 0x1000;
    public static final int MANUFACTURER_PROFILE_END_INDEX = 0x9FFF;

    public static final String DIALOG_DESCRIPTION = "Configure the attributes for the new object.";
    public static final String DIALOG_PAGE_LABEL = "Object";

    public static final String VALID_OBJECT_INDEX_RANGE = "Enter the object index value within the range (0x1000 to 0x9FFF).";
    public static final String INDEX_OUT_OF_RANGE = "Object index is out of range (0x1000 to 0x9FFF).";
    public static final String OBJECT_ALREADY_EXISTS_ERROR_MESSAGE = "Object index {0} already exists in the file {1}.";
    public static final String ENTER_OBJECT_NAME = "Enter the name of object.";
    public static final String OBJECT_ACCESS_TYPE_INVALID_PDO_MAPPING = "Object with access type {0} does not allow {1}.";
    private String objectTypeText = StringUtils.EMPTY;

    private static final String DEFAULT_VALUE_EXCEEDS_HIGH_LIMIT = "Default value {0} exceeds the high limit value {1}.";
    private static final String DEFAULT_VALUE_LESS_THAN_LOW_LIMIT = "Default value {0} cannot be lesser than low limit value {1}.";

    private static final String[] ACCESS_TYPE_LIST = new String[] { "Constant", "Read only", "Write only",
            "Read/Write" };

    public static final String INVALID_PDO_MAPPING_ERROR_MESSAGE = "Object with access type {0} does not allow {1}.";
    public static final String LOW_LIMIT_GREATER_HIGH_LIMIT = "Low limit cannot be greater than high limit.";

    /**
     * Name verify listener
     */
    private NameVerifyListener nameVerifyListener = new NameVerifyListener();

    private Combo comboAccessType;

    private Combo comboDataType;

    private Combo comboPdoMapping;

    private Combo comboObjectType;

    private String accessType;

    private String pdoMapping;

    private String lowLimit = StringUtils.EMPTY;

    private String highLimit = StringUtils.EMPTY;

    private String objIndex = StringUtils.EMPTY;

    private String defaultValue = StringUtils.EMPTY;

    private String objName = StringUtils.EMPTY;

    private String dataType;

    protected static final String INVALID_DATA_TYPE_VALUE = "Invalid value for data type {0}.";

    private static final String[] DATA_TYPE_LIST = new String[] { "Boolean", "Integer8", "Integer16", "Integer32",
            "Unsigned8", "Unsigned16", "Unsigned32", "Real32", "Visible_String", "Integer24", "Real64", "Integer40",
            "Integer48", "Integer56", "Integer64", "Octet_String", "Unicode_String", "Time_of_Day", "Time_Diff",
            "Domain", "Unsigned24", "Unsigned40", "Unsigned48", "Unsigned56", "Unsigned64", "MAC_ADDRESS", "IP_ADDRESS",
            "NETTIME" };

    private static final String[] OBJECT_TYPES = new String[] { "7 - VAR", "8 - ARRAY", "9 - RECORD" };

    private static final String[] PDO_MAPPING_TYPES = new String[] { "No", "Default", "Optional", "TPDO", "RPDO" };

    private static final String INVALID_VALUE = "Invalid value.";

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
    protected AddObjectWizardPage(String pageName, DocumentRoot documentRoot, DeviceDescriptionFileEditor editor) {
        super(pageName);
        this.documentRoot = documentRoot;
        this.editor = editor;
        setTitle(DIALOG_PAGE_LABEL);
        setDescription(DIALOG_DESCRIPTION);

    }

    private boolean isValueValid(String value) {
        if (!value.isEmpty()) {
            try {
                if (value.contains("0x")) {
                    value = value.substring(2);
                    if (value.isEmpty()) {
                        return false;
                    }
                    Integer val = Integer.parseInt(value, 16);

                    if (val < 0) {
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

    /**
     * Create control for wizard page
     */
    @Override
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NULL);
        this.setControl(container);

        Group grpAddObjectAdvancedOptions = new Group(container, SWT.SHADOW_OUT);
        grpAddObjectAdvancedOptions.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL)); //$NON-NLS-1$
        grpAddObjectAdvancedOptions.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
        grpAddObjectAdvancedOptions.setText(Messages.addObjectWizardPage_advanced_options);
        grpAddObjectAdvancedOptions.setBounds(278, 10, 286, 221);

        Label lblLowLimit = new Label(grpAddObjectAdvancedOptions, SWT.NONE);
        lblLowLimit.setBounds(10, 136, 119, 21);
        lblLowLimit.setText(Messages.addObjectWizardPage_lblLow_limit); // $NON-NLS-1$

        Label lblHighLimit = new Label(grpAddObjectAdvancedOptions, SWT.NONE);
        lblHighLimit.setBounds(10, 164, 119, 21);
        lblHighLimit.setText(Messages.addObjectWizardPage_lblHigh_limit); // $NON-NLS-1$

        Label lblDataType = new Label(grpAddObjectAdvancedOptions, SWT.NONE);
        lblDataType.setBounds(10, 22, 119, 21);
        lblDataType.setText(Messages.addObjectWizardPage_lblDataType);

        txtLowLimit = new Text(grpAddObjectAdvancedOptions, SWT.BORDER);
        txtLowLimit.setText(Messages.addObjectWizardPage_txtLowLimit); // $NON-NLS-1$
        txtLowLimit.setBounds(136, 136, 140, 23);
        txtLowLimit.addModifyListener(txtLowLimitModifyListener);

        txtHighLimit = new Text(grpAddObjectAdvancedOptions, SWT.BORDER);
        txtHighLimit.setText(Messages.addObjectWizardPage_txtHighLimit); // $NON-NLS-1$
        txtHighLimit.setBounds(136, 164, 140, 23);
        txtHighLimit.addModifyListener(txthighLimitModifyListener);

        Label lblAccessType = new Label(grpAddObjectAdvancedOptions, SWT.NONE);
        lblAccessType.setText(Messages.addObjectWizardPage_lblAccess_type);
        lblAccessType.setBounds(10, 51, 119, 21);

        comboAccessType = new Combo(grpAddObjectAdvancedOptions, SWT.NONE | SWT.READ_ONLY);
        comboAccessType.setItems(ACCESS_TYPE_LIST);
        comboAccessType.setBounds(136, 51, 140, 25);
        comboAccessType.select(0);
        comboAccessType.setText(ACCESS_TYPE_LIST[0]);
        comboAccessType.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                accessType = comboAccessType.getText();
                if (!isPdoMappingValueValid(pdoMapping)) {
                    setErrorMessage(MessageFormat.format(INVALID_PDO_MAPPING_ERROR_MESSAGE, accessType, pdoMapping));
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
        lblDefaultValue.setText(Messages.addObjectWizardPage_lblDefault_value);
        lblDefaultValue.setBounds(10, 107, 120, 21);

        Label lblPdoMapping = new Label(grpAddObjectAdvancedOptions, SWT.NONE);
        lblPdoMapping.setText(Messages.addObjectWizardPage_lblPdo_mapping);
        lblPdoMapping.setBounds(10, 80, 120, 21);

        comboPdoMapping = new Combo(grpAddObjectAdvancedOptions, SWT.NONE | SWT.READ_ONLY);
        comboPdoMapping.setItems(PDO_MAPPING_TYPES);
        comboPdoMapping.setBounds(136, 78, 140, 23);
        comboPdoMapping.select(0);
        comboPdoMapping.setText(PDO_MAPPING_TYPES[0]);
        comboPdoMapping.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                pdoMapping = comboPdoMapping.getText();
                if (!isPdoMappingValueValid(pdoMapping)) {
                    setErrorMessage(MessageFormat.format(INVALID_PDO_MAPPING_ERROR_MESSAGE, accessType, pdoMapping));
                    setPageComplete(false);
                } else {
                    setErrorMessage(null);
                    setPageComplete(true);
                }
            }
        });

        Group grpAddObjectBasicOptions = new Group(container, SWT.NONE);
        grpAddObjectBasicOptions.setBounds(10, 10, 262, 96);
        grpAddObjectBasicOptions.setText(Messages.addObjectWizardPage_basic_options);

        Label lblObjectIndex = new Label(grpAddObjectBasicOptions, SWT.NONE);
        lblObjectIndex.setBounds(10, 22, 93, 21);
        lblObjectIndex.setText(Messages.addObjectWizardPage_lblObject_index);

        Label lblObjectName = new Label(grpAddObjectBasicOptions, SWT.NONE);
        lblObjectName.setText(Messages.addObjectWizardPage_lblObject_name);
        lblObjectName.setBounds(10, 46, 93, 21);

        Label lblObjectType = new Label(grpAddObjectBasicOptions, SWT.NONE);
        lblObjectType.setText(Messages.addObjectWizardPage_lblObject_type);
        lblObjectType.setBounds(10, 70, 91, 23);

        txtObjectIndexText = new Text(grpAddObjectBasicOptions, SWT.BORDER);
        txtObjectIndexText.setText(Messages.addObjectWizardPage_txtObject_index); // $NON-NLS-1$
        txtObjectIndexText.setBounds(107, 19, 140, 21);
        txtObjectIndexText.setFocus();
        txtObjectIndexText.addModifyListener(objectIndexModifyListener);
        txtObjectIndexText.addVerifyListener(nameVerifyListener);

        txtObjectNameText = new Text(grpAddObjectBasicOptions, SWT.BORDER);
        txtObjectNameText.setText(Messages.addObjectWizardPage_txtObject_name);
        txtObjectNameText.setBounds(107, 43, 140, 21);
        txtObjectNameText.addModifyListener(objectNameModifyListener);

        comboObjectType = new Combo(grpAddObjectBasicOptions, SWT.NONE | SWT.READ_ONLY);
        comboObjectType.setItems(OBJECT_TYPES);
        comboObjectType.setBounds(107, 67, 140, 21);
        comboObjectType.select(0);
        comboObjectType.setText(OBJECT_TYPES[0]);
        comboObjectType.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                objectTypeText = comboObjectType.getText();
            }
        });

        comboDataType = new Combo(grpAddObjectAdvancedOptions, SWT.NONE | SWT.READ_ONLY);
        comboDataType.setItems(DATA_TYPE_LIST);
        comboDataType.setBounds(136, 22, 140, 25);
        comboDataType.select(0);
        comboDataType.setText(DATA_TYPE_LIST[0]);
        dataType = comboDataType.getText();
        if (dataType.contentEquals("Boolean")) {
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

    private SelectionListener dataTypeSelectionListener = new SelectionAdapter() {

        @Override
        public void widgetSelected(SelectionEvent e) {
            dataType = comboDataType.getText();

            txtDefaultValue.addModifyListener(txtdefaultValueModifyListener);

            txtHighLimit.addModifyListener(txthighLimitModifyListener);

            txtLowLimit.addModifyListener(txtLowLimitModifyListener);

            String defaultVal = getTxtDefaultValue();
            if (!defaultVal.isEmpty()) {
                String errorMessage = AbstractObjectPropertySource.isValidVal(defaultVal, "Default value", dataType);
                if (!errorMessage.isEmpty()) {
                    setPageComplete(false);
                    setErrorMessage(errorMessage);
                } else {
                    setPageComplete(true);
                    setErrorMessage(null);
                }
            }
            String lowLimit = getTxtLowLimit();
            if (!lowLimit.isEmpty()) {
                String errorMessage = AbstractObjectPropertySource.isValidVal(lowLimit, "Low limit", dataType);
                if (!errorMessage.isEmpty()) {
                    setPageComplete(false);
                    setErrorMessage(errorMessage);
                } else {
                    setPageComplete(true);
                    setErrorMessage(null);
                }
            }
            String highLimit = getTxtHighLimit();
            if (!highLimit.isEmpty()) {
                String errorMessage = AbstractObjectPropertySource.isValidVal(highLimit, "High limit", dataType);
                if (!AbstractObjectPropertySource.isValidVal(highLimit, "high value", dataType).isEmpty()) {
                    setPageComplete(false);
                    setErrorMessage(errorMessage);
                } else {
                    setPageComplete(true);
                    setErrorMessage(null);
                }
            }
            if ((!highLimit.isEmpty()) && (!lowLimit.isEmpty()))
                if (Integer.parseInt(lowLimit) > Integer.parseInt(highLimit)) {
                    setErrorMessage(LOW_LIMIT_GREATER_HIGH_LIMIT);
                    setPageComplete(false);
                }

        }
    };

    private ModifyListener txtLowLimitModifyListener = new ModifyListener() {

        @Override
        public void modifyText(ModifyEvent e) {
            setErrorMessage(null);
            setPageComplete(true);
            lowLimit = txtLowLimit.getText();
            if (!isValueValid(lowLimit)) {
                setErrorMessage(INVALID_VALUE);
                setPageComplete(false);
            }

            getWizard().getContainer().updateButtons();

        }
    };

    private ModifyListener objectNameModifyListener = new ModifyListener() {

        @Override
        public void modifyText(ModifyEvent e) {
            setErrorMessage(null);
            setPageComplete(true);
            objName = txtObjectNameText.getText();
            if (!isValueValid(objName)) {
                setErrorMessage(INVALID_VALUE);
                setPageComplete(false);
            }
            getWizard().getContainer().updateButtons();

        }
    };

    private ModifyListener objectIndexModifyListener = new ModifyListener() {

        @Override
        public void modifyText(ModifyEvent e) {
            setErrorMessage(null);
            setPageComplete(true);
            objIndex = txtObjectIndexText.getText();

            getWizard().getContainer().updateButtons();

        }
    };

    private ModifyListener txthighLimitModifyListener = new ModifyListener() {

        @Override
        public void modifyText(ModifyEvent e) {
            setErrorMessage(null);
            setPageComplete(true);
            highLimit = txtHighLimit.getText();
            if (!isValueValid(highLimit)) {
                setErrorMessage(INVALID_VALUE);
                setPageComplete(false);
            }
            getWizard().getContainer().updateButtons();

        }
    };

    private ModifyListener txtdefaultValueModifyListener = new ModifyListener() {

        @Override
        public void modifyText(ModifyEvent e) {
            comboDataType.addSelectionListener(dataTypeSelectionListener);
            setErrorMessage(null);
            setPageComplete(true);
            defaultValue = txtDefaultValue.getText();
            if (!isValueValid(defaultValue)) {
                setErrorMessage(INVALID_VALUE);
                setPageComplete(false);
            }
            getWizard().getContainer().updateButtons();
        }
    };

    private boolean isObjectIndexValid(String text) {
        if (!text.isEmpty()) {
            try {
                if (text.contains("0x")) {
                    text = text.substring(2);
                    Integer val = Integer.parseInt(text, 16);
                    if ((val < MANUFACTURER_PROFILE_START_INDEX) || (val > MANUFACTURER_PROFILE_END_INDEX)) {
                        return false;
                    }
                } else {
                    Integer val = Integer.parseInt(text, 16);
                    if ((val < MANUFACTURER_PROFILE_START_INDEX) || (val > MANUFACTURER_PROFILE_END_INDEX)) {
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
     * @return TObjectAccess type value of object
     */
    public TObjectAccessType getAccessType() {
        if (accessType == null) {
            accessType = comboAccessType.getText();
        }

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
     * @return Low limit value
     */
    public String getTxtLowLimit() {
        return lowLimit;
    }

    /**
     * @return High limit value
     */
    public String getTxtHighLimit() {
        return highLimit;
    }

    /**
     * @return Object name value
     */
    public String getTxtObjectNameText() {
        return objName;
    }

    /**
     * @return Object index value
     */
    public String getTxtObjectIndexText() {
        return objIndex;
    }

    /**
     * @return Default value of object
     */
    public String getTxtDefaultValue() {
        return defaultValue;
    }

    private boolean validateObjectModel() {
        String index = getTxtObjectIndexText();
        String pdoMappingVal = comboPdoMapping.getText();
        String accessTypeVal = comboAccessType.getText();
        String dataType = comboDataType.getText();

        setErrorMessage(null);
        if (index.isEmpty()) {
            setErrorMessage(VALID_OBJECT_INDEX_RANGE);
            return false;
        }

        if (!isValueValid(objIndex)) {
            setErrorMessage(INVALID_VALUE);
            return false;
        }
        if (!isObjectIndexValid(objIndex)) {
            setErrorMessage(INDEX_OUT_OF_RANGE);
            return false;
        }
        if (index.contains("0x")) {
            if (index.length() > 6) {
                setErrorMessage(VALID_OBJECT_INDEX_RANGE);
                return false;
            }
        } else {
            if (index.length() > 4) {
                setErrorMessage(VALID_OBJECT_INDEX_RANGE);
                return false;
            }
        }

        if (!isObjectIndexAvailable(objIndex)) {
            setErrorMessage(MessageFormat.format(OBJECT_ALREADY_EXISTS_ERROR_MESSAGE, objIndex,
                    editor.getActiveEditor().getTitle()));
            return false;
        }

        String objName = getTxtObjectNameText();
        if (objName.isEmpty()) {
            setErrorMessage(ENTER_OBJECT_NAME);
            return false;
        }

        if (!isPdoMappingValueValid(pdoMappingVal)) {
            setErrorMessage(MessageFormat.format(OBJECT_ACCESS_TYPE_INVALID_PDO_MAPPING, accessTypeVal, pdoMapping));
            return false;
        }

        txtDefaultValue.setEnabled(true);
        txtHighLimit.setEnabled(true);
        txtLowLimit.setEnabled(true);

        String defaultVal = getTxtDefaultValue();

        if (!defaultVal.isEmpty()) {
            String errorMessage = AbstractObjectPropertySource.isValidVal(defaultVal, "Default value", dataType);
            if (!errorMessage.isEmpty()) {
                setErrorMessage(errorMessage);
                return false;
            } else {
                setErrorMessage(null);
            }
        }

        if (!AbstractObjectPropertySource.getStringDataTypeList().contains(dataType)) {
        String lowLimit = getTxtLowLimit();
        if (!lowLimit.isEmpty()) {
            String errorMessage = AbstractObjectPropertySource.isValidVal(lowLimit, "Low limit", dataType);
            if (!errorMessage.isEmpty()) {
                setErrorMessage(errorMessage);
                return false;
            } else {
                setErrorMessage(null);
            }
        }
        String highLimit = getTxtHighLimit();
        if (!highLimit.isEmpty()) {
            String errorMessage = AbstractObjectPropertySource.isValidVal(highLimit, "High limit", dataType);
            if (!errorMessage.isEmpty()) {
                setErrorMessage(errorMessage);
                return false;
            } else {
                setErrorMessage(null);
            }
        }
        if ((!highLimit.isEmpty()) && (!lowLimit.isEmpty())) {
            if (Integer.parseInt(lowLimit) > Integer.parseInt(highLimit)) {
                setErrorMessage(LOW_LIMIT_GREATER_HIGH_LIMIT);
                return false;
            }
        }

        if (!highLimit.isEmpty() && (!defaultVal.isEmpty())) {
            Integer highlimitVal = Integer.valueOf(highLimit);
            Integer defaultValue = Integer.valueOf(defaultVal);
            if (defaultValue > highlimitVal) {
                setErrorMessage(MessageFormat.format(DEFAULT_VALUE_EXCEEDS_HIGH_LIMIT, defaultValue, highlimitVal));
                return false;
            }
        }

        if (!lowLimit.isEmpty() && (!defaultVal.isEmpty())) {
            Integer lowLimitVal = Integer.valueOf(lowLimit);
            Integer defaultValue = Integer.valueOf(defaultVal);
            if (defaultValue < lowLimitVal) {
                setErrorMessage(MessageFormat.format(DEFAULT_VALUE_LESS_THAN_LOW_LIMIT, defaultValue, lowLimitVal));
                return false;
            }
        }
        }

        return true;
    }

    private boolean isObjectIndexAvailable(String objIndex) {
        List<TObject> tObjects = XDDUtilities.findEObjects(documentRoot, XDDPackage.eINSTANCE.getTObject());

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

    /**
     * Checks for error in the page
     *
     * @return page complete status.
     */
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

    /**
     * @return Actual value of object
     */
    public String getActualValue() {
        return StringUtils.EMPTY;
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

    /**
     * @return Byte array of data type
     */
    public byte[] getDataType() {
        if (dataType == null) {
            dataType = comboDataType.getText();
        }

        if (!dataType.isEmpty()) {

            return DatatypeConverter.parseHexBinary(getDataTypeValue(dataType));
        }
        return new byte[] { 0 };

    }

    /**
     * @return Default value of object
     */
    public String getDefaultValue() {
        String defaultValue = getTxtDefaultValue();
        if (!defaultValue.isEmpty()) {
            return defaultValue;
        }
        return StringUtils.EMPTY;
    }

    /**
     * @return Denotation value of object
     */
    public String getDenotation() {

        return StringUtils.EMPTY;
    }

    /**
     * @return High Limit value of object
     */
    public String getHighLimit() {
        String highLimit = getTxtHighLimit();
        if (!highLimit.isEmpty()) {
            return highLimit;
        }
        return StringUtils.EMPTY;
    }

    /**
     * @return Low Limit value of object
     */
    public String getLowLimit() {
        String lowLimit = getTxtLowLimit();
        if (!lowLimit.isEmpty()) {
            return lowLimit;
        }
        return StringUtils.EMPTY;
    }

    /**
     * @return byte array of object index
     */
    public byte[] getIndex() {
        String index = getTxtObjectIndexText();
        if (!index.isEmpty()) {
            if (index.contains("0x")) {
                index = index.substring(2);
                return DatatypeConverter.parseHexBinary(index);
            } else {
                return DatatypeConverter.parseHexBinary(index);
            }
        }
        return new byte[] { 0 };
    }

    /**
     * @return Object type value
     */
    public short getObjectType() {

        if (objectTypeText.isEmpty()) {
            objectTypeText = comboObjectType.getText();
        }

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
     * @return TPDOMapping value from XDD file
     */
    public TObjectPDOMapping getPdoMapping() {

        if (pdoMapping == null) {
            pdoMapping = comboPdoMapping.getText();
        }

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
     * Verifies the valid PDOMapping
     *
     * @param pdoMappingValue
     *            value to be verified.
     * @return Returns <code>true</code> if the value is valid,
     *         <code>false</code> otherwise.
     */
    protected boolean isPdoMappingValueValid(String pdoMappingValue) {
        TObjectAccessType accessType = getAccessType();
        if (pdoMappingValue != null) {
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
                if (accessType == TObjectAccessType.WO) {
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
        }

        return true;
    }

    /**
     * @return Object name
     */
    public String getObjectName() {

        return objName;
    }
}// AddObjectWizardPage
