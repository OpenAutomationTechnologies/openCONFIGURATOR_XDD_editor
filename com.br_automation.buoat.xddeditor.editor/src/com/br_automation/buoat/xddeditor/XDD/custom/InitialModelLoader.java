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

public class InitialModelLoader {

    WizardConfigurationPage1 userConf;

    public DocumentRoot loadXDD(WizardTemplatePage wizardTemplatePage,
        WizardConfigurationPage1 wizardConfigurationPage1) {
        URL resourcepath;
        userConf = wizardConfigurationPage1;

        //create encoding Map
        Map<Object, Object> options = new HashMap<Object, Object>();
        options.put(XMLResource.OPTION_ENCODING, "UTF-8");

        //get new Resource
        ResourceSet resSet = new ResourceSetImpl();
        resSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
            .put("xdd", new XDDResourceFactoryImpl());

        //check which Template is used (static etc.)
        if (wizardTemplatePage.getLoadEmpty())
            return createEmptyModel();

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

        if (wizardTemplatePage.getConfigurationWizardStatus())
            appendUserData(root);
        else
            appendMetaData(root);
        return root;

    }//loadXDD

    //Creates empty Standard-Model
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
    }//createEmtpyModel

    //Appends the userdata from WizardConfigurationPage1
    private DocumentRoot appendUserData(DocumentRoot root) {

        EList<ISO15745ProfileType> profiles = root.getISO15745ProfileContainer()
            .getISO15745Profile();

        ISO15745ProfileType profile1 = profiles.get(0);
        ISO15745ProfileType profile2 = profiles.get(1);

        ProfileHeaderDataType header1 = profile1.getProfileHeader();
        header1
            .setProfileIdentification("Powerlink_" + userConf.getDeviceNameString() + "_Profile");
        header1.setProfileName(userConf.getDeviceNameString() + " Profile");
        XDDUtilities.setCreator(userConf.getCreatorString());
        //Setzen der Body-Werte im Profil 1
        ProfileBodyDataType body1 = profile1.getProfileBody();
        body1.setFileCreationDate(userConf.getCreationDateXML());
        body1.setFileCreationTime(userConf.getCreationTimeXML());
        body1.setFileCreator(userConf.getCreatorString());
        body1.setFileName(userConf.getFileNameString());
        body1.setFileModificationDate(userConf.getCreationDateXML());
        body1.setFileModificationTime(userConf.getCreationTimeXML());
        body1.setFileModifiedBy(userConf.getCreatorString());
        body1.setFileVersion(userConf.getFileVersionString());

        //Setzen der Vendor-Werte im Body 1
        EList<EObject> bodyContents = body1.eContents();
        EObject obj1 = bodyContents.get(0);
        TDeviceIdentity Identity = (TDeviceIdentity) obj1;
        Identity.getVendorName().setValue(userConf.getVendorNameString());
        Identity.getVendorID().setValue(userConf.getVendorIDString());
        Identity.getProductName().setValue(userConf.getProductNameString());
        Identity.getVersion().get(0).setValue(userConf.getHardwareversString());
        Identity.getVersion().get(1).setValue(userConf.getSoftwareversString());
        Identity.getVersion().add(XDDFactory.eINSTANCE.createTVersion());
        TVersion fwVersion = Identity.getVersion().get(2);
        fwVersion.setVersionType(VersionTypeType.HW);
        fwVersion.setReadOnly(true);
        fwVersion.setValue(userConf.getFirmwareversString());

        //Set unsetted Value of ProductID of template
        Identity.setProductID(XDDFactory.eINSTANCE.createTProductID());
        Identity.getProductID().setValue(userConf.getProductIDString());

        //Setzen der Body-Werte im Profil 2
        ProfileBodyDataType body2 = profile2.getProfileBody();
        body2.setFileCreationDate(userConf.getCreationDateXML());
        body2.setFileCreationTime(userConf.getCreationTimeXML());
        body2.setFileCreator(userConf.getCreatorString());
        body2.setFileName(userConf.getFileNameString());
        body2.setFileModificationDate(userConf.getCreationDateXML());
        body2.setFileModificationTime(userConf.getCreationTimeXML());
        body2.setFileModifiedBy(userConf.getCreatorString());
        body2.setFileVersion(userConf.getFileVersionString());

        //Setzen der Vendor.ID im Communication Body
        EList<EObject> bodyContents2 = body2.eContents();
        TApplicationLayers apllayers = (TApplicationLayers) bodyContents2.get(0);
        IdentityType identity2 = apllayers.getIdentity();
        identity2.getVendorID().setValue(userConf.getVendorIDString());
        identity2.setProductID(XDDFactory.eINSTANCE.createTProductID());
        identity2.getProductID().setValue(userConf.getProductIDString());

        //Setzen der General Features aus dem Wizard
        TNetworkManagement tnmg = (TNetworkManagement) body2.eContents().get(2);
        TGeneralFeatures generalFeatures = tnmg.getGeneralFeatures();
        generalFeatures.setNMTBootTimeNotActive(userConf.getNMTBootTimeNotActive());
        generalFeatures.setNMTCycleTimeMax(userConf.getNMTCycleTimeMax());
        generalFeatures.setNMTCycleTimeMin(userConf.getNMTCycleTimeMin());
        generalFeatures.setNMTErrorEntries(userConf.getNMTErrorEntries());
        generalFeatures.setDLLFeatureMN(false);

        //Setzen der CN Features aus dem Wizard
        TCNFeatures cnFeatures = tnmg.getCNFeatures();

        cnFeatures.setDLLCNFeatureMultiplex(userConf.getCnMultiplexFeature());
        if (userConf.getCnMultiplexFeature())
            XDDUtilities.setMultiplexFeature(true, root);

        cnFeatures.setDLLCNPResChaining(userConf.getResponseChaining());
        cnFeatures.setNMTCNSoC2PReq(userConf.getNMTCNSoC2PReq());

        return root;

    }//appendUserData

    //appends reduced data when not using the advanced wizard
    private DocumentRoot appendMetaData(DocumentRoot root) {

        EList<ISO15745ProfileType> profiles = root.getISO15745ProfileContainer()
            .getISO15745Profile();

        ISO15745ProfileType profile1 = profiles.get(0);
        ISO15745ProfileType profile2 = profiles.get(1);

        ProfileHeaderDataType header1 = profile1.getProfileHeader();
        header1
            .setProfileIdentification("Powerlink_" + userConf.getDeviceNameString() + "_Profile");
        header1.setProfileName(userConf.getDeviceNameString() + " Profile");

        //Setzen der Body-Werte im Profil 1
        ProfileBodyDataType body1 = profile1.getProfileBody();
        body1.setFileCreationDate(userConf.getCreationDateXML());
        body1.setFileCreationTime(userConf.getCreationTimeXML());
        body1.setFileCreator(userConf.getCreatorString());
        body1.setFileName(userConf.getFileNameString());
        body1.setFileModificationDate(userConf.getCreationDateXML());
        body1.setFileModificationTime(userConf.getCreationTimeXML());
        body1.setFileVersion(userConf.getFileVersionString());

        //Setzen der Body-Werte im Profil 2
        ProfileBodyDataType body2 = profile2.getProfileBody();
        body2.setFileCreationDate(userConf.getCreationDateXML());
        body2.setFileCreationTime(userConf.getCreationTimeXML());
        body2.setFileCreator(userConf.getCreatorString());
        body2.setFileName(userConf.getFileNameString());
        body2.setFileModificationDate(userConf.getCreationDateXML());
        body2.setFileModificationTime(userConf.getCreationTimeXML());
        body2.setFileVersion(userConf.getFileNameString());

        //For further Saves -> Give Utilites the creatorname

        return root;

    }//appendMetaData

}