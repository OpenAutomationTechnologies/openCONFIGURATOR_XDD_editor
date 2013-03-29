package com.br_automation.buoat.xddeditor.XDD.custom;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

/**
 * @briefAdvanced configurationPage for a new XDD Model
 * @author Joris Lückenga
 * @since 19.3.2013
 */
public class WizardConfigurationPage1 extends WizardPage {

    private Button btnCnMultiplexFeature;
    private Button btnResponseChaining;

    private CustomXDDWizard mainwizard;
    //Metadata
    private Text txtCreator;
    private Text txtDeviceName;
    private Text txtFileVersion;
    private Text txtFirmwareVersionNr;
    private Text txtHardwareVersNr;
    private Text txtNMTBootTimeNotActive;
    //Feature-Settings
    private Text txtNMTCNSoC2PReq;
    private Text txtNMTCycleTimeMax;
    private Text txtNMTCycleTimeMin;
    private Text txtNMTErrorEntries;
    private Text txtProductID;
    private Text txtProductName;
    private Text txtSoftwareVersNr;
    private Text txtVendorID;
    //Product/Vendor variables
    private Text txtVendorName;

    /**
     * @brief Constructor of WizardConf.Page1
     * @param pageID
     *            ID of the page
     * @param wizard
     *            the parent-wizard
     */
    public WizardConfigurationPage1(String pageID,
        CustomXDDWizard wizard) {
        super(pageID);
        this.setTitle(Messages.wizardConfigurationPage1_adv_conf_page_title);
        this.setDescription(Messages.wizardConfigurationPage1_type_in_data_new_model_subheadline);
        this.mainwizard = wizard;
        this.mainwizard.getWizardTemplatePage().setPageComplete(true);
        this.setPageComplete(true);
    }

    //Metadata getters

    /**
     * Create contents of the wizard.
     * 
     * @param parent
     *            composite
     */
    @Override
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NULL);
        this.setControl(container);
        SimpleDateFormat creationDate = new SimpleDateFormat("yyyy-MM-dd"); //$NON-NLS-1$
        String creationDateStr = creationDate.format(new Date());

        SimpleDateFormat creationTime = new SimpleDateFormat("HH:mm:ssZ"); //$NON-NLS-1$
        String creationTimeStr = creationTime.format(new Date());
        creationTimeStr = creationTimeStr.substring(0, 11) + ":00"; //$NON-NLS-1$

        Group grpMetadata = new Group(container, SWT.NONE);
        grpMetadata.setText(Messages.wizardConfigurationPage1_metadata_lbl);
        grpMetadata.setBounds(10, 10, 267, 199);

        Label lblDeviceName = new Label(grpMetadata, SWT.NONE);
        lblDeviceName.setBounds(10, 91, 82, 15);
        lblDeviceName.setText(Messages.wizardConfigurationPage1_device_name_lbl);

        this.txtDeviceName = new Text(grpMetadata, SWT.BORDER);
        this.txtDeviceName.setBounds(98, 88, 101, 21);
        this.txtDeviceName.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                if (WizardConfigurationPage1.this.txtDeviceName.getText().isEmpty())
                    WizardConfigurationPage1.this.setPageComplete(false);
                else
                    WizardConfigurationPage1.this.setPageComplete(true);
            }
        });
        this.txtDeviceName.setText("New_Device"); //$NON-NLS-1$

        this.txtCreator = new Text(grpMetadata, SWT.BORDER);
        this.txtCreator.setBounds(98, 64, 101, 21);
        this.txtCreator.setText(System.getProperty("user.name")); //$NON-NLS-1$

        Label lblCreator = new Label(grpMetadata, SWT.NONE);
        lblCreator.setBounds(10, 67, 55, 15);
        lblCreator.setText(Messages.wizardConfigurationPage1_creator_lbl);

        Label lblCreationTime = new Label(grpMetadata, SWT.NONE);
        lblCreationTime.setBounds(10, 43, 82, 15);
        lblCreationTime.setText(Messages.wizardConfigurationPage1_creation_time_lbl);

        Label lblContentCreationTime = new Label(grpMetadata, SWT.NONE);
        lblContentCreationTime.setBounds(98, 43, 159, 15);
        lblContentCreationTime.setText(creationTimeStr);

        Label lblCreationDate = new Label(grpMetadata, SWT.NONE);
        lblCreationDate.setBounds(10, 22, 82, 15);
        lblCreationDate.setText(Messages.wizardConfigurationPage1_creation_date_lbl);

        Label lblContentCreationDate = new Label(grpMetadata, SWT.NONE);
        lblContentCreationDate.setBounds(98, 22, 154, 15);
        lblContentCreationDate.setText(creationDateStr);

        Label lblFileVersion = new Label(grpMetadata, SWT.NONE);
        lblFileVersion.setBounds(10, 115, 82, 15);
        lblFileVersion.setText(Messages.wizardConfigurationPage1_file_version_lbl);

        this.txtFileVersion = new Text(grpMetadata, SWT.BORDER);
        this.txtFileVersion.setText("1.00"); // NOPMD by lueckengaj on 29.03.13 11:31 //$NON-NLS-1$
        this.txtFileVersion.setBounds(98, 112, 101, 21);

        Group grpAda = new Group(container, SWT.NONE);
        grpAda.setText(Messages.wizardConfigurationPage1_vendor_prod_info_lbl);
        grpAda.setBounds(283, 10, 281, 199);

        Label lblVendorName = new Label(grpAda, SWT.NONE);
        lblVendorName.setBounds(10, 22, 91, 15);
        lblVendorName.setText(Messages.wizardConfigurationPage1_verndor_name_lbl);

        Label lblVendorId = new Label(grpAda, SWT.NONE);
        lblVendorId.setText(Messages.wizardConfigurationPage1_verndor_id_lbl);
        lblVendorId.setBounds(10, 46, 73, 15);

        Label lblProductName = new Label(grpAda, SWT.NONE);
        lblProductName.setText(Messages.wizardConfigurationPage1_product_name_lbl);
        lblProductName.setBounds(10, 70, 91, 15);

        Label lblHardwareVersionNr = new Label(grpAda, SWT.NONE);
        lblHardwareVersionNr.setText(Messages.wizardConfigurationPage1_hardware_vers_nr_lbl);
        lblHardwareVersionNr.setBounds(10, 118, 118, 15);

        Label lblSoftwareVersionNr = new Label(grpAda, SWT.NONE);
        lblSoftwareVersionNr.setText(Messages.wizardConfigurationPage1_software_version_nr_lbl);
        lblSoftwareVersionNr.setBounds(10, 142, 118, 15);

        this.txtVendorName = new Text(grpAda, SWT.BORDER);
        this.txtVendorName.setText("Sample_Vendor"); //$NON-NLS-1$
        this.txtVendorName.setBounds(128, 19, 143, 21);

        this.txtVendorID = new Text(grpAda, SWT.BORDER);
        this.txtVendorID.setText("0x00000000"); //$NON-NLS-1$
        this.txtVendorID.setBounds(128, 43, 143, 21);

        this.txtProductName = new Text(grpAda, SWT.BORDER);
        this.txtProductName.setText("Sample_Product_Name"); //$NON-NLS-1$
        this.txtProductName.setBounds(128, 67, 143, 21);

        this.txtHardwareVersNr = new Text(grpAda, SWT.BORDER);
        this.txtHardwareVersNr.setText("1.00"); //$NON-NLS-1$
        this.txtHardwareVersNr.setBounds(128, 115, 143, 21);

        this.txtSoftwareVersNr = new Text(grpAda, SWT.BORDER);
        this.txtSoftwareVersNr.setText("1.00"); //$NON-NLS-1$
        this.txtSoftwareVersNr.setBounds(128, 139, 143, 21);

        Label lblProductID = new Label(grpAda, SWT.NONE);
        lblProductID.setText("Product ID:"); //$NON-NLS-1$
        lblProductID.setBounds(10, 94, 118, 15);

        this.txtProductID = new Text(grpAda, SWT.BORDER);
        this.txtProductID.setText("EPSG-001"); //$NON-NLS-1$
        this.txtProductID.setBounds(128, 91, 143, 21);

        Label lblFirmwareVersionNr = new Label(grpAda, SWT.NONE);
        lblFirmwareVersionNr.setText(Messages.wizardConfigurationPage1_firmversion_nr_lbl);
        lblFirmwareVersionNr.setBounds(10, 166, 118, 15);

        this.txtFirmwareVersionNr = new Text(grpAda, SWT.BORDER);
        this.txtFirmwareVersionNr.setText("1.00"); //$NON-NLS-1$
        this.txtFirmwareVersionNr.setBounds(128, 163, 143, 21);

        Group grpCnFeatures = new Group(container, SWT.NONE);
        grpCnFeatures.setText("CN Features"); //$NON-NLS-1$
        grpCnFeatures.setBounds(283, 215, 267, 107);

        this.btnCnMultiplexFeature = new Button(grpCnFeatures, SWT.CHECK);
        this.btnCnMultiplexFeature
            .setToolTipText(Messages.wizardConfigurationPage1_multiplex_feature_tooltip);
        this.btnCnMultiplexFeature.setBounds(10, 21, 146, 16);
        this.btnCnMultiplexFeature.setText("DLLCNFeatureMultiplex"); //$NON-NLS-1$

        this.btnResponseChaining = new Button(grpCnFeatures, SWT.CHECK);
        this.btnResponseChaining
            .setToolTipText(Messages.wizardConfigurationPage1_Response_chaining_tooltip);
        this.btnResponseChaining.setBounds(10, 43, 146, 16);
        this.btnResponseChaining.setText("DLLCNPResChaining"); //$NON-NLS-1$

        Label lblSoc = new Label(grpCnFeatures, SWT.NONE);
        lblSoc.setToolTipText(Messages.wizardConfigurationPage1_Time_for_cn_to_process_Soc_tooltip);
        lblSoc.setText("NMTCNSoC2PReq (ns):"); //$NON-NLS-1$
        lblSoc.setBounds(10, 65, 124, 15);

        this.txtNMTCNSoC2PReq = new Text(grpCnFeatures, SWT.BORDER);
        this.txtNMTCNSoC2PReq.setText("25"); //$NON-NLS-1$
        this.txtNMTCNSoC2PReq
            .setToolTipText(Messages.wizardConfigurationPage1_time_for_CN_tro_process_SoC_tooltip);
        this.txtNMTCNSoC2PReq.setBounds(137, 62, 76, 21);

        Group grpGeneralFeatures = new Group(container, SWT.SHADOW_OUT);
        grpGeneralFeatures.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL)); //$NON-NLS-1$
        grpGeneralFeatures.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
        grpGeneralFeatures.setText(Messages.wizardConfigurationPage1_general_features);
        grpGeneralFeatures.setBounds(10, 215, 267, 107);

        Label lblNmtboottimenotactive = new Label(grpGeneralFeatures, SWT.NONE);
        lblNmtboottimenotactive.setBounds(10, 20, 163, 15);
        lblNmtboottimenotactive.setText("NMTBootTimeNotActive (\u00B5s):"); //$NON-NLS-1$

        Label lblNewLabel1 = new Label(grpGeneralFeatures, SWT.NONE);
        lblNewLabel1.setBounds(10, 42, 163, 15);
        lblNewLabel1.setText("NMTCycleTimeMax (\u00B5s):"); //$NON-NLS-1$

        Label lblNewLabel2 = new Label(grpGeneralFeatures, SWT.NONE);
        lblNewLabel2.setBounds(10, 64, 163, 15);
        lblNewLabel2.setText("NMTCycleTimeMin (\u00B5s):"); //$NON-NLS-1$

        Label lblNewLabel3 = new Label(grpGeneralFeatures, SWT.NONE);
        lblNewLabel3.setToolTipText(Messages.wizardConfigurationPage1_nr_of_Errors_reported_to_MN);
        lblNewLabel3.setBounds(10, 86, 163, 15);
        lblNewLabel3.setText("NMTErrorEntries (2-13):"); //$NON-NLS-1$

        this.txtNMTBootTimeNotActive = new Text(grpGeneralFeatures, SWT.BORDER);
        this.txtNMTBootTimeNotActive.setText("8000000"); //$NON-NLS-1$
        this.txtNMTBootTimeNotActive.setBounds(179, 14, 76, 21);

        this.txtNMTCycleTimeMax = new Text(grpGeneralFeatures, SWT.BORDER);
        this.txtNMTCycleTimeMax.setText("1000000"); //$NON-NLS-1$
        this.txtNMTCycleTimeMax.setBounds(179, 36, 76, 21);

        this.txtNMTCycleTimeMin = new Text(grpGeneralFeatures, SWT.BORDER);
        this.txtNMTCycleTimeMin.setText("1000"); //$NON-NLS-1$
        this.txtNMTCycleTimeMin.setBounds(179, 58, 76, 21);

        this.txtNMTErrorEntries = new Text(grpGeneralFeatures, SWT.BORDER);
        this.txtNMTErrorEntries.setText("8"); //$NON-NLS-1$
        this.txtNMTErrorEntries.setBounds(179, 80, 76, 21);
    } //createControl

    public XMLGregorianCalendar getCreationDateXML() {
        return XDDUtilities.getXMLDate();
    }

    public XMLGregorianCalendar getCreationTimeXML() {
        return XDDUtilities.getXMLTime();
    }

    public String getCreatorString() {
        return this.txtCreator.getText();
    }

    public String getDeviceNameString() {
        return this.txtDeviceName.getText();
    }

    public String getFileNameString() {
        return this.mainwizard.getNewFileCreationPage().getFileName();
    }

    //Vendor/Product getters

    public String getFileVersionString() {
        return this.txtFileVersion.getText();
    }

    public String getFirmwareversString() {
        return this.txtFirmwareVersionNr.getText();
    }

    public String getHardwareversString() {
        return this.txtHardwareVersNr.getText();
    }

    /**
     * @brief gets the BootTime from Textfield
     * @return returns the BootTime as int-Value
     */
    public int getNMTBootTimeNotActive() {
        if (!this.txtNMTBootTimeNotActive.getText().isEmpty()) {
            return Integer.parseInt(this.txtNMTBootTimeNotActive.getText());
        } else
            return 0;
    }

    /**
     * @brief gets the SoC2PReqTime from Textfield
     * @return returns the SoC2PReq Time as int-Value
     */
    public int getNMTCNSoC2PReq() {
        if (!this.txtNMTCNSoC2PReq.getText().isEmpty()) {
            return Integer.parseInt(this.txtNMTCNSoC2PReq.getText());
        } else
            return 0;
    }

    /**
     * @brief gets the NMTCycle Time from Textfield
     * @return returns the NMTCycle Time as int-Value
     */
    public int getNMTCycleTimeMax() {
        if (!this.txtNMTCycleTimeMax.getText().isEmpty()) {
            return Integer.parseInt(this.txtNMTCycleTimeMax.getText());
        } else
            return 0;
    }

    /**
     * @brief gets the CycleTimeMin from Textfield
     * @return returns the CycleTimeMin Time as int-Value
     */
    public int getNMTCycleTimeMin() {
        if (!this.txtNMTCycleTimeMin.getText().isEmpty()) {
            return Integer.parseInt(this.txtNMTCycleTimeMin.getText());

        } else
            return 0;
    }

    /**
     * @brief gets the ErrorEntries from Textfield
     * @return returns the ErrorEntries as int-Value
     */
    public int getNMTErrorEntries() {
        if (!this.txtNMTErrorEntries.getText().isEmpty()) {
            return Integer.parseInt(this.txtNMTErrorEntries.getText());
        } else
            return 0;
    }

    public String getProductIDString() {
        return this.txtProductID.getText();
    }

    public String getProductNameString() {
        return this.txtProductName.getText();
    }

    public String getSoftwareversString() {
        return this.txtSoftwareVersNr.getText();
    }

    public String getVendorIDString() {
        return this.txtVendorID.getText();
    }

    public String getVendorNameString() {
        return this.txtVendorName.getText();
    }

    public boolean isCnMultiplexFeature() {
        return this.btnCnMultiplexFeature.getSelection();
    }

    public boolean isResponseChaining() {
        return this.btnResponseChaining.getSelection();
    }
} //WizardConfigurationPage1