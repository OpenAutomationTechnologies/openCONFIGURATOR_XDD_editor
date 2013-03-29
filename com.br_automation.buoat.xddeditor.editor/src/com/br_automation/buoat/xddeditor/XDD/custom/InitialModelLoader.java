package com.br_automation.buoat.xddeditor.XDD.custom;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileContainerType;
import com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileType;
import com.br_automation.buoat.xddeditor.XDD.IdentityType;
import com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType;
import com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType;
import com.br_automation.buoat.xddeditor.XDD.TApplicationLayers;
import com.br_automation.buoat.xddeditor.XDD.TCNFeatures;
import com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity;
import com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures;
import com.br_automation.buoat.xddeditor.XDD.TNetworkManagement;
import com.br_automation.buoat.xddeditor.XDD.TVersion;
import com.br_automation.buoat.xddeditor.XDD.VersionTypeType;
import com.br_automation.buoat.xddeditor.XDD.XDDFactory;
import com.br_automation.buoat.xddeditor.XDD.util.XDDResourceFactoryImpl;

/**
 * @author Joris Lückenga
 * @brief Creates Initial model based on data configured in the Wizard
 * @since 19.3.2013
 * */
public class InitialModelLoader {

    private WizardConfigurationPage1 userConf;

    /**
     * @brief loads a new model based on configuration in the Wizard
     * @param wizardTemplatePage
     *            the first configuration Page
     * @param wizardConfigurationPage1
     *            the advanced Wizardpage with userdata
     * @return DocumentRoot root with appended data
     */
    public DocumentRoot loadXDD(WizardTemplatePage wizardTemplatePage,
        WizardConfigurationPage1 wizardConfigurationPage1) {
        URL resourcepath;
        this.userConf = wizardConfigurationPage1;

        //create encoding Map
        Map<Object, Object> options = new HashMap<Object, Object>();
        options.put(XMLResource.OPTION_ENCODING, "UTF-8");

        //get new Resource
        ResourceSet resSet = new ResourceSetImpl();
        resSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
            .put("xdd", new XDDResourceFactoryImpl());

        //check which Template is used (static etc.)
        if (wizardTemplatePage.getLoadEmpty())
            return this.createEmptyModel();
        else {
            String choice = wizardTemplatePage.getTemplateCombo().getText();

            if (choice.contentEquals("Default device"))
                resourcepath = this.getClass().getResource("/resources/default_template.xdd");

            else if (choice.contentEquals("Default extended device"))
                resourcepath = this.getClass().getResource(
                    "/resources/default_template_extended.xdd");

            else
                resourcepath = this.getClass()
                    .getResource("/resources/default_template_static.xdd");
        }

        URI fileuri = URI.createURI(resourcepath.toString());
        Resource resource = resSet.getResource(fileuri, true);
        DocumentRoot root = (DocumentRoot) resource.getContents().get(0);

        if (wizardTemplatePage.isConfigurationWizardStatus())
            this.appendUserData(root);
        else
            this.appendMetaData(root);
        return root;
    } //loadXDD

    /**
     * @brief appends reduced data when not using the advanced wizard
     * @param root
     *            DocumentRoot of the new Resource
     * @return DocumentRoot with appended Metadata gathered from the System
     */
    private DocumentRoot appendMetaData(DocumentRoot root) {

        EList<ISO15745ProfileType> profiles = root.getISO15745ProfileContainer()
            .getISO15745Profile();
        ISO15745ProfileType profile1 = profiles.get(0);
        ISO15745ProfileType profile2 = profiles.get(1);
        ProfileHeaderDataType header1 = profile1.getProfileHeader();
        header1.setProfileIdentification("Powerlink_" + this.userConf.getDeviceNameString()
            + "_Profile");
        header1.setProfileName(this.userConf.getDeviceNameString() + " Profile");

        //Setzen der Body-Werte im Profil 1
        ProfileBodyDataType body1 = profile1.getProfileBody();
        body1.setFileCreationDate(this.userConf.getCreationDateXML());
        body1.setFileCreationTime(this.userConf.getCreationTimeXML());
        body1.setFileCreator(this.userConf.getCreatorString());
        body1.setFileName(this.userConf.getFileNameString());
        body1.setFileModificationDate(this.userConf.getCreationDateXML());
        body1.setFileModificationTime(this.userConf.getCreationTimeXML());
        body1.setFileVersion(this.userConf.getFileVersionString());

        //Setzen der Body-Werte im Profil 2
        ProfileBodyDataType body2 = profile2.getProfileBody();
        body2.setFileCreationDate(this.userConf.getCreationDateXML());
        body2.setFileCreationTime(this.userConf.getCreationTimeXML());
        body2.setFileCreator(this.userConf.getCreatorString());
        body2.setFileName(this.userConf.getFileNameString());
        body2.setFileModificationDate(this.userConf.getCreationDateXML());
        body2.setFileModificationTime(this.userConf.getCreationTimeXML());
        body2.setFileVersion(this.userConf.getFileNameString());

        //For further Saves -> Give Utilites the creatorname
        return root;
    } //appendMetaData

    /**
     * @brief Appends the userdata from WizardConfigurationPage1
     * @param root
     *            DocumentRoot of the new Resource
     * @return DocumentRoot with appended User Data from WizardConfigurationPage
     */
    private DocumentRoot appendUserData(DocumentRoot root) {

        EList<ISO15745ProfileType> profiles = root.getISO15745ProfileContainer()
            .getISO15745Profile();
        ISO15745ProfileType profile1 = profiles.get(0);
        ISO15745ProfileType profile2 = profiles.get(1);

        ProfileHeaderDataType header1 = profile1.getProfileHeader();
        header1.setProfileIdentification("Powerlink_" + this.userConf.getDeviceNameString()
            + "_Profile");
        header1.setProfileName(this.userConf.getDeviceNameString() + " Profile");
        XDDUtilities.setCreator(this.userConf.getCreatorString());
        //Setzen der Body-Werte im Profil 1
        ProfileBodyDataType body1 = profile1.getProfileBody();
        body1.setFileCreationDate(this.userConf.getCreationDateXML());
        body1.setFileCreationTime(this.userConf.getCreationTimeXML());
        body1.setFileCreator(this.userConf.getCreatorString());
        body1.setFileName(this.userConf.getFileNameString());
        body1.setFileModificationDate(this.userConf.getCreationDateXML());
        body1.setFileModificationTime(this.userConf.getCreationTimeXML());
        body1.setFileModifiedBy(this.userConf.getCreatorString());
        body1.setFileVersion(this.userConf.getFileVersionString());

        //Setzen der Vendor-Werte im Body 1
        EList<EObject> bodyContents = body1.eContents();
        EObject identity = bodyContents.get(0);
        TDeviceIdentity tDeviceIdentity = (TDeviceIdentity) identity;
        tDeviceIdentity.getVendorName().setValue(this.userConf.getVendorNameString());
        tDeviceIdentity.getVendorID().setValue(this.userConf.getVendorIDString());
        tDeviceIdentity.getProductName().setValue(this.userConf.getProductNameString());
        tDeviceIdentity.getVersion().get(0).setValue(this.userConf.getHardwareversString());
        tDeviceIdentity.getVersion().get(1).setValue(this.userConf.getSoftwareversString());
        tDeviceIdentity.getVersion().add(XDDFactory.eINSTANCE.createTVersion());
        TVersion fwVersion = tDeviceIdentity.getVersion().get(2);
        fwVersion.setVersionType(VersionTypeType.HW);
        fwVersion.setReadOnly(true);
        fwVersion.setValue(this.userConf.getFirmwareversString());

        //Set unsetted Value of ProductID of template
        tDeviceIdentity.setProductID(XDDFactory.eINSTANCE.createTProductID());
        tDeviceIdentity.getProductID().setValue(this.userConf.getProductIDString());

        //Setzen der Body-Werte im Profil 2
        ProfileBodyDataType body2 = profile2.getProfileBody();
        body2.setFileCreationDate(this.userConf.getCreationDateXML());
        body2.setFileCreationTime(this.userConf.getCreationTimeXML());
        body2.setFileCreator(this.userConf.getCreatorString());
        body2.setFileName(this.userConf.getFileNameString());
        body2.setFileModificationDate(this.userConf.getCreationDateXML());
        body2.setFileModificationTime(this.userConf.getCreationTimeXML());
        body2.setFileModifiedBy(this.userConf.getCreatorString());
        body2.setFileVersion(this.userConf.getFileVersionString());

        //Setzen der Vendor.ID im Communication Body
        EList<EObject> bodyContents2 = body2.eContents();
        TApplicationLayers apllayers = (TApplicationLayers) bodyContents2.get(0);
        IdentityType identity2 = apllayers.getIdentity();
        identity2.getVendorID().setValue(this.userConf.getVendorIDString());
        identity2.setProductID(XDDFactory.eINSTANCE.createTProductID());
        identity2.getProductID().setValue(this.userConf.getProductIDString());

        //Setzen der General Features aus dem Wizard
        TNetworkManagement tnmg = (TNetworkManagement) body2.eContents().get(2);
        TGeneralFeatures generalFeatures = tnmg.getGeneralFeatures();
        generalFeatures.setNMTBootTimeNotActive(this.userConf.getNMTBootTimeNotActive());
        generalFeatures.setNMTCycleTimeMax(this.userConf.getNMTCycleTimeMax());
        generalFeatures.setNMTCycleTimeMin(this.userConf.getNMTCycleTimeMin());
        generalFeatures.setNMTErrorEntries(this.userConf.getNMTErrorEntries());
        generalFeatures.setDLLFeatureMN(false);

        //Setzen der CN Features aus dem Wizard
        TCNFeatures cnFeatures = tnmg.getCNFeatures();

        cnFeatures.setDLLCNFeatureMultiplex(this.userConf.isCnMultiplexFeature());
        if (this.userConf.isCnMultiplexFeature())
            XDDUtilities.setMultiplexFeature(true, root);

        cnFeatures.setDLLCNPResChaining(this.userConf.isResponseChaining());
        cnFeatures.setNMTCNSoC2PReq(this.userConf.getNMTCNSoC2PReq());

        return root;
    } //appendUserData

    /**
     * @brief Creates empty Standard-Model
     * @return DocumentRoot the Root with initial, empty model
     */
    private DocumentRoot createEmptyModel() {
        DocumentRoot root = XDDFactory.eINSTANCE.createDocumentRoot();
        ISO15745ProfileContainerType container = XDDFactory.eINSTANCE
            .createISO15745ProfileContainerType();
        ISO15745ProfileType profile = XDDFactory.eINSTANCE.createISO15745ProfileType();
        root.setISO15745ProfileContainer(container);
        root.getISO15745ProfileContainer().getISO15745Profile().add(profile);
        profile.setProfileBody(XDDFactory.eINSTANCE
            .createProfileBodyCommunicationNetworkPowerlink());
        profile.setProfileHeader(XDDFactory.eINSTANCE.createProfileHeaderDataType());
        return root;
    } //createEmtpyModel
}
