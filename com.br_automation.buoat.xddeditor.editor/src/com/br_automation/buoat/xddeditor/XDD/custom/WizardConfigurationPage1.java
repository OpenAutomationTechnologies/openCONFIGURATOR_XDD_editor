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

//Advanced configurationPage for a new XDD Model
public class WizardConfigurationPage1 extends WizardPage {

    CustomXDDWizard Mainwizard;

    private Button btnCnMultiplexFeature;

    private Button btnResponseChaining;
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
     * Create the wizard.
     * 
     * @param string
     */
    public WizardConfigurationPage1(String pageID,
        CustomXDDWizard wizard) {
        super(pageID);
        this.setTitle("Advanced Configuration Page");
        this.setDescription("Type in the data for a new XDD Model");
        this.Mainwizard = wizard;
        this.Mainwizard.wizardTemplatePage.setPageComplete(true);
        this.setPageComplete(true);

    }

    //Metadata getters

    /**
     * Create contents of the wizard.
     * 
     * @param parent
     */
    @Override
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NULL);

        this.setControl(container);

        SimpleDateFormat creationDate = new SimpleDateFormat("yyyy-MM-dd");
        String creationDateStr = creationDate.format(new Date());

        SimpleDateFormat creationTime = new SimpleDateFormat("HH:mm:ssZ");
        String creationTimeStr = creationTime.format(new Date());
        creationTimeStr = creationTimeStr.substring(0, 11) + ":00";

        Group grpMetadata = new Group(container, SWT.NONE);
        grpMetadata.setText("Metadata");
        grpMetadata.setBounds(10, 10, 267, 199);

        Label lblDeviceName = new Label(grpMetadata, SWT.NONE);
        lblDeviceName.setBounds(10, 91, 82, 15);
        lblDeviceName.setText("Device Name:");

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
        this.txtDeviceName.setText("New_Device");

        this.txtCreator = new Text(grpMetadata, SWT.BORDER);
        this.txtCreator.setBounds(98, 64, 101, 21);
        this.txtCreator.setText(System.getProperty("user.name"));

        Label lblCreator = new Label(grpMetadata, SWT.NONE);
        lblCreator.setBounds(10, 67, 55, 15);
        lblCreator.setText("Creator:");

        Label lblCreationTime = new Label(grpMetadata, SWT.NONE);
        lblCreationTime.setBounds(10, 43, 82, 15);
        lblCreationTime.setText("Creation Time:");

        Label lblContentCreationTime = new Label(grpMetadata, SWT.NONE);
        lblContentCreationTime.setBounds(98, 43, 159, 15);
        lblContentCreationTime.setText(creationTimeStr);

        Label lblCreationDate = new Label(grpMetadata, SWT.NONE);
        lblCreationDate.setBounds(10, 22, 82, 15);
        lblCreationDate.setText("Creation Date:");

        Label lblContentCreationDate = new Label(grpMetadata, SWT.NONE);
        lblContentCreationDate.setBounds(98, 22, 154, 15);
        lblContentCreationDate.setText(creationDateStr);

        Label lblFileVersion = new Label(grpMetadata, SWT.NONE);
        lblFileVersion.setBounds(10, 115, 82, 15);
        lblFileVersion.setText("File Version:");

        this.txtFileVersion = new Text(grpMetadata, SWT.BORDER);
        this.txtFileVersion.setText("1.00");
        this.txtFileVersion.setBounds(98, 112, 101, 21);

        Group grpAda = new Group(container, SWT.NONE);
        grpAda.setText("Vendor / Product Information");
        grpAda.setBounds(283, 10, 281, 199);

        Label lblVendorName = new Label(grpAda, SWT.NONE);
        lblVendorName.setBounds(10, 22, 91, 15);
        lblVendorName.setText("Vendor Name:");

        Label lblVendorId = new Label(grpAda, SWT.NONE);
        lblVendorId.setText("Vendor ID:");
        lblVendorId.setBounds(10, 46, 73, 15);

        Label lblProductName = new Label(grpAda, SWT.NONE);
        lblProductName.setText("Product Name:");
        lblProductName.setBounds(10, 70, 91, 15);

        Label lblHardwareVersionNr = new Label(grpAda, SWT.NONE);
        lblHardwareVersionNr.setText("Hardware Version Nr:");
        lblHardwareVersionNr.setBounds(10, 118, 118, 15);

        Label lblSoftwareVersionNr = new Label(grpAda, SWT.NONE);
        lblSoftwareVersionNr.setText("Software Version Nr:");
        lblSoftwareVersionNr.setBounds(10, 142, 118, 15);

        this.txtVendorName = new Text(grpAda, SWT.BORDER);
        this.txtVendorName.setText("Sample_Vendor");
        this.txtVendorName.setBounds(128, 19, 143, 21);

        this.txtVendorID = new Text(grpAda, SWT.BORDER);
        this.txtVendorID.setText("0x00000000");
        this.txtVendorID.setBounds(128, 43, 143, 21);

        this.txtProductName = new Text(grpAda, SWT.BORDER);
        this.txtProductName.setText("Sample_Product_Name");
        this.txtProductName.setBounds(128, 67, 143, 21);

        this.txtHardwareVersNr = new Text(grpAda, SWT.BORDER);
        this.txtHardwareVersNr.setText("1.00");
        this.txtHardwareVersNr.setBounds(128, 115, 143, 21);

        this.txtSoftwareVersNr = new Text(grpAda, SWT.BORDER);
        this.txtSoftwareVersNr.setText("1.00");
        this.txtSoftwareVersNr.setBounds(128, 139, 143, 21);

        Label lblProductID = new Label(grpAda, SWT.NONE);
        lblProductID.setText("Product ID:");
        lblProductID.setBounds(10, 94, 118, 15);

        this.txtProductID = new Text(grpAda, SWT.BORDER);
        this.txtProductID.setText("EPSG-001");
        this.txtProductID.setBounds(128, 91, 143, 21);

        Label lblFirmwareVersionNr = new Label(grpAda, SWT.NONE);
        lblFirmwareVersionNr.setText("Firmware Version Nr:");
        lblFirmwareVersionNr.setBounds(10, 166, 118, 15);

        this.txtFirmwareVersionNr = new Text(grpAda, SWT.BORDER);
        this.txtFirmwareVersionNr.setText("1.00");
        this.txtFirmwareVersionNr.setBounds(128, 163, 143, 21);

        Group grpCnFeatures = new Group(container, SWT.NONE);
        grpCnFeatures.setText("CN Features");
        grpCnFeatures.setBounds(283, 215, 267, 107);

        this.btnCnMultiplexFeature = new Button(grpCnFeatures, SWT.CHECK);
        this.btnCnMultiplexFeature.setToolTipText("Enable / Disable Multiplex Feature");
        this.btnCnMultiplexFeature.setBounds(10, 21, 146, 16);
        this.btnCnMultiplexFeature.setText("DLLCNFeatureMultiplex");

        this.btnResponseChaining = new Button(grpCnFeatures, SWT.CHECK);
        this.btnResponseChaining.setToolTipText("Enable / Disable Response Chaining");
        this.btnResponseChaining.setBounds(10, 43, 146, 16);
        this.btnResponseChaining.setText("DLLCNPResChaining");

        Label lblSoc = new Label(grpCnFeatures, SWT.NONE);
        lblSoc.setToolTipText("Time for the CN to process SoC-Packets\r\n");
        lblSoc.setText("NMTCNSoC2PReq (ns):");
        lblSoc.setBounds(10, 65, 124, 15);

        this.txtNMTCNSoC2PReq = new Text(grpCnFeatures, SWT.BORDER);
        this.txtNMTCNSoC2PReq.setText("25");
        this.txtNMTCNSoC2PReq.setToolTipText("Time for the CN to process SoC-Packets");
        this.txtNMTCNSoC2PReq.setBounds(137, 62, 76, 21);

        Group grpGeneralFeatures = new Group(container, SWT.SHADOW_OUT);
        grpGeneralFeatures.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
        grpGeneralFeatures.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
        grpGeneralFeatures.setText("General Features");
        grpGeneralFeatures.setBounds(10, 215, 267, 107);

        Label lblNmtboottimenotactive = new Label(grpGeneralFeatures, SWT.NONE);
        lblNmtboottimenotactive.setBounds(10, 20, 163, 15);
        lblNmtboottimenotactive.setText("NMTBootTimeNotActive (\u00B5s):");

        Label lblNewLabel_1 = new Label(grpGeneralFeatures, SWT.NONE);
        lblNewLabel_1.setBounds(10, 42, 163, 15);
        lblNewLabel_1.setText("NMTCycleTimeMax (\u00B5s):");

        Label lblNewLabel_2 = new Label(grpGeneralFeatures, SWT.NONE);
        lblNewLabel_2.setBounds(10, 64, 163, 15);
        lblNewLabel_2.setText("NMTCycleTimeMin (\u00B5s):");

        Label lblNewLabel_3 = new Label(grpGeneralFeatures, SWT.NONE);
        lblNewLabel_3.setToolTipText("# of Errors reportet to MN");
        lblNewLabel_3.setBounds(10, 86, 163, 15);
        lblNewLabel_3.setText("NMTErrorEntries (2-13):");

        this.txtNMTBootTimeNotActive = new Text(grpGeneralFeatures, SWT.BORDER);
        this.txtNMTBootTimeNotActive.setText("8000000");
        this.txtNMTBootTimeNotActive.setBounds(179, 14, 76, 21);

        this.txtNMTCycleTimeMax = new Text(grpGeneralFeatures, SWT.BORDER);
        this.txtNMTCycleTimeMax.setText("1000000");
        this.txtNMTCycleTimeMax.setBounds(179, 36, 76, 21);

        this.txtNMTCycleTimeMin = new Text(grpGeneralFeatures, SWT.BORDER);
        this.txtNMTCycleTimeMin.setText("1000");
        this.txtNMTCycleTimeMin.setBounds(179, 58, 76, 21);

        this.txtNMTErrorEntries = new Text(grpGeneralFeatures, SWT.BORDER);
        this.txtNMTErrorEntries.setText("8");
        this.txtNMTErrorEntries.setBounds(179, 80, 76, 21);

    }

    public boolean getCnMultiplexFeature() {
        return this.btnCnMultiplexFeature.getSelection();
    }

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

    //Vendor/Product getters

    public String getFileNameString() {
        return this.Mainwizard.getNewFileCreationPage().getFileName();
    }

    public String getFileVersionString() {
        return this.txtFileVersion.getText();
    }

    public String getFirmwareversString() {
        return this.txtFirmwareVersionNr.getText();
    }

    public String getHardwareversString() {
        return this.txtHardwareVersNr.getText();
    }

    public int getNMTBootTimeNotActive() {
        if (!this.txtNMTBootTimeNotActive.getText().isEmpty()) {
            int value = Integer.parseInt(this.txtNMTBootTimeNotActive.getText());
            return value;
        } else
            return 0;
    }

    public int getNMTCNSoC2PReq() {
        if (!this.txtNMTCNSoC2PReq.getText().isEmpty()) {
            int value = Integer.parseInt(this.txtNMTCNSoC2PReq.getText());
            return value;
        } else
            return 0;
    }

    public int getNMTCycleTimeMax() {
        if (!this.txtNMTCycleTimeMax.getText().isEmpty()) {
            int value = Integer.parseInt(this.txtNMTCycleTimeMax.getText());
            return value;
        } else
            return 0;
    }

    //Feature getters

    public int getNMTCycleTimeMin() {
        if (!this.txtNMTCycleTimeMin.getText().isEmpty()) {
            int value = Integer.parseInt(this.txtNMTCycleTimeMin.getText());
            return value;
        } else
            return 0;
    }

    public int getNMTErrorEntries() {
        if (!this.txtNMTErrorEntries.getText().isEmpty()) {
            int value = Integer.parseInt(this.txtNMTErrorEntries.getText());
            return value;
        } else
            return 0;
    }

    public String getProductIDString() {
        return this.txtProductID.getText();
    }

    public String getProductNameString() {
        return this.txtProductName.getText();
    }

    public boolean getResponseChaining() {
        return this.btnResponseChaining.getSelection();
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

}
