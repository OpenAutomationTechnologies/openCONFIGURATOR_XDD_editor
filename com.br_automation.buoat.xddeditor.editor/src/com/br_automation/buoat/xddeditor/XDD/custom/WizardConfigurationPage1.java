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

    /**
     * Create the wizard.
     * 
     * @param string
     */
    public WizardConfigurationPage1(String pageID,
        CustomXDDWizard wizard) {
        super(pageID);
        setTitle("Advanced Configuration Page");
        setDescription("Type in the data for a new XDD Model");
        Mainwizard = wizard;
        Mainwizard.wizardTemplatePage.setPageComplete(true);
        setPageComplete(true);

    }

    CustomXDDWizard Mainwizard;

    //Metadata
    private Text txtCreator;
    private Text txtDeviceName;
    private Text txtFileVersion;

    //Product/Vendor variables
    private Text txtVendorName;
    private Text txtVendorID;
    private Text txtProductName;
    private Text txtHardwareVersNr;
    private Text txtSoftwareVersNr;
    private Text txtProductID;

    //Feature-Settings
    private Text txtNMTCNSoC2PReq;
    private Text txtNMTBootTimeNotActive;
    private Text txtNMTCycleTimeMax;
    private Text txtNMTCycleTimeMin;
    private Text txtNMTErrorEntries;
    private Button btnResponseChaining;
    private Button btnCnMultiplexFeature;
    private Text txtFirmwareVersionNr;

    //Metadata getters

    public XMLGregorianCalendar getCreationTimeXML() {
        return XDDUtilities.getXMLTime();
    }

    public XMLGregorianCalendar getCreationDateXML() {
        return XDDUtilities.getXMLDate();
    }

    public String getFileNameString() {
        return Mainwizard.newFileCreationPage.getFileName();
    }

    public String getCreatorString() {
        return txtCreator.getText();
    }

    public String getDeviceNameString() {
        return txtDeviceName.getText();
    }

    public String getFileVersionString() {
        return txtFileVersion.getText();
    }

    //Vendor/Product getters

    public String getVendorNameString() {
        return txtVendorName.getText();
    }

    public String getVendorIDString() {
        return txtVendorID.getText();
    }

    public String getProductNameString() {
        return txtProductName.getText();
    }

    public String getHardwareversString() {
        return txtHardwareVersNr.getText();
    }

    public String getSoftwareversString() {
        return txtSoftwareVersNr.getText();
    }

    public String getProductIDString() {
        return txtProductID.getText();
    }

    public String getFirmwareversString() {
        return txtFirmwareVersionNr.getText();
    }

    //Feature getters

    public boolean getResponseChaining() {
        return btnResponseChaining.getSelection();
    }

    public boolean getCnMultiplexFeature() {
        return btnCnMultiplexFeature.getSelection();
    }

    public int getNMTCNSoC2PReq() {
        if (!txtNMTCNSoC2PReq.getText().isEmpty()) {
            int value = Integer.parseInt(txtNMTCNSoC2PReq.getText());
            return value;
        } else
            return 0;
    }

    public int getNMTBootTimeNotActive() {
        if (!txtNMTBootTimeNotActive.getText().isEmpty()) {
            int value = Integer.parseInt(txtNMTBootTimeNotActive.getText());
            return value;
        } else
            return 0;
    }

    public int getNMTCycleTimeMax() {
        if (!txtNMTCycleTimeMax.getText().isEmpty()) {
            int value = Integer.parseInt(txtNMTCycleTimeMax.getText());
            return value;
        } else
            return 0;
    }

    public int getNMTCycleTimeMin() {
        if (!txtNMTCycleTimeMin.getText().isEmpty()) {
            int value = Integer.parseInt(txtNMTCycleTimeMin.getText());
            return value;
        } else
            return 0;
    }

    public int getNMTErrorEntries() {
        if (!txtNMTErrorEntries.getText().isEmpty()) {
            int value = Integer.parseInt(txtNMTErrorEntries.getText());
            return value;
        } else
            return 0;
    }

    /**
     * Create contents of the wizard.
     * 
     * @param parent
     */
    @Override
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NULL);

        setControl(container);

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

        txtDeviceName = new Text(grpMetadata, SWT.BORDER);
        txtDeviceName.setBounds(98, 88, 101, 21);
        txtDeviceName.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                if (txtDeviceName.getText().isEmpty())
                    setPageComplete(false);
                else
                    setPageComplete(true);
            }
        });
        txtDeviceName.setText("New_Device");

        txtCreator = new Text(grpMetadata, SWT.BORDER);
        txtCreator.setBounds(98, 64, 101, 21);
        txtCreator.setText(System.getProperty("user.name"));

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

        txtFileVersion = new Text(grpMetadata, SWT.BORDER);
        txtFileVersion.setText("1.00");
        txtFileVersion.setBounds(98, 112, 101, 21);

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

        txtVendorName = new Text(grpAda, SWT.BORDER);
        txtVendorName.setText("Sample_Vendor");
        txtVendorName.setBounds(128, 19, 143, 21);

        txtVendorID = new Text(grpAda, SWT.BORDER);
        txtVendorID.setText("0x00000000");
        txtVendorID.setBounds(128, 43, 143, 21);

        txtProductName = new Text(grpAda, SWT.BORDER);
        txtProductName.setText("Sample_Product_Name");
        txtProductName.setBounds(128, 67, 143, 21);

        txtHardwareVersNr = new Text(grpAda, SWT.BORDER);
        txtHardwareVersNr.setText("1.00");
        txtHardwareVersNr.setBounds(128, 115, 143, 21);

        txtSoftwareVersNr = new Text(grpAda, SWT.BORDER);
        txtSoftwareVersNr.setText("1.00");
        txtSoftwareVersNr.setBounds(128, 139, 143, 21);

        Label lblProductID = new Label(grpAda, SWT.NONE);
        lblProductID.setText("Product ID:");
        lblProductID.setBounds(10, 94, 118, 15);

        txtProductID = new Text(grpAda, SWT.BORDER);
        txtProductID.setText("EPSG-001");
        txtProductID.setBounds(128, 91, 143, 21);

        Label lblFirmwareVersionNr = new Label(grpAda, SWT.NONE);
        lblFirmwareVersionNr.setText("Firmware Version Nr:");
        lblFirmwareVersionNr.setBounds(10, 166, 118, 15);

        txtFirmwareVersionNr = new Text(grpAda, SWT.BORDER);
        txtFirmwareVersionNr.setText("1.00");
        txtFirmwareVersionNr.setBounds(128, 163, 143, 21);

        Group grpCnFeatures = new Group(container, SWT.NONE);
        grpCnFeatures.setText("CN Features");
        grpCnFeatures.setBounds(283, 215, 267, 107);

        btnCnMultiplexFeature = new Button(grpCnFeatures, SWT.CHECK);
        btnCnMultiplexFeature.setToolTipText("Enable / Disable Multiplex Feature");
        btnCnMultiplexFeature.setBounds(10, 21, 146, 16);
        btnCnMultiplexFeature.setText("DLLCNFeatureMultiplex");

        btnResponseChaining = new Button(grpCnFeatures, SWT.CHECK);
        btnResponseChaining.setToolTipText("Enable / Disable Response Chaining");
        btnResponseChaining.setBounds(10, 43, 146, 16);
        btnResponseChaining.setText("DLLCNPResChaining");

        Label lblSoc = new Label(grpCnFeatures, SWT.NONE);
        lblSoc.setToolTipText("Time for the CN to process SoC-Packets\r\n");
        lblSoc.setText("NMTCNSoC2PReq (ns):");
        lblSoc.setBounds(10, 65, 124, 15);

        txtNMTCNSoC2PReq = new Text(grpCnFeatures, SWT.BORDER);
        txtNMTCNSoC2PReq.setText("25");
        txtNMTCNSoC2PReq.setToolTipText("Time for the CN to process SoC-Packets");
        txtNMTCNSoC2PReq.setBounds(137, 62, 76, 21);

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

        txtNMTBootTimeNotActive = new Text(grpGeneralFeatures, SWT.BORDER);
        txtNMTBootTimeNotActive.setText("8000000");
        txtNMTBootTimeNotActive.setBounds(179, 14, 76, 21);

        txtNMTCycleTimeMax = new Text(grpGeneralFeatures, SWT.BORDER);
        txtNMTCycleTimeMax.setText("1000000");
        txtNMTCycleTimeMax.setBounds(179, 36, 76, 21);

        txtNMTCycleTimeMin = new Text(grpGeneralFeatures, SWT.BORDER);
        txtNMTCycleTimeMin.setText("1000");
        txtNMTCycleTimeMin.setBounds(179, 58, 76, 21);

        txtNMTErrorEntries = new Text(grpGeneralFeatures, SWT.BORDER);
        txtNMTErrorEntries.setText("8");
        txtNMTErrorEntries.setBounds(179, 80, 76, 21);

    }

}
