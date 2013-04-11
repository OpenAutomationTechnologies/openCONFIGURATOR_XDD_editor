/**
 * @since 19.3.2013
 * @author Joris Lückenga, Bernecker + Rainer Industrie Elektronik Ges.m.b.H.
 */

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
 * @brief Provides methods to create an Initial model based on data configured
 *        in the Wizard.
 * 
 *        Gets the user-input from the CustomXDDWizard-Pages and adds the needed
 *        objects to the root. Also adds the correct time,user etc.
 * 
 * @author Joris Lückenga
 */
public class InitialModelLoader {

    private WizardConfigurationPage1 wizardConfigurationPage1;

    /**
     * @brief Loads a new model based on configuration in the Wizard.
     * @param wizardTemplatePage
     *            The first configuration page.
     * @param wizardConfigurationPage1
     *            The advanced wizard page with userdata.
     * @return DocumentRoot With appended data.
     */
    public static DocumentRoot loadXDD(WizardTemplatePage wizardTemplatePage,
        WizardConfigurationPage1 wizardConfigurationPage1) {
        URL resourcepath;

        //create encoding Map
        Map<Object, Object> options = new HashMap<Object, Object>();
        options.put(XMLResource.OPTION_ENCODING, "UTF-8");

        //get new Resource
        ResourceSet resSet = new ResourceSetImpl();
        resSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
            .put("xdd", new XDDResourceFactoryImpl());

        //check which Template is used (static etc.)
        if (wizardTemplatePage.getLoadEmpty())
            return InitialModelLoader.getEmptyModel();
        else {
            String choice = wizardTemplatePage.getTemplateCombo().getText();

            if (choice.contentEquals("Default device"))
                resourcepath = wizardConfigurationPage1.getClass().getResource(
                    "/resources/default_template.xdd");

            else if (choice.contentEquals("Default extended device"))
                resourcepath = wizardConfigurationPage1.getClass().getResource(
                    "/resources/default_template_extended.xdd");

            else
                resourcepath = wizardConfigurationPage1.getClass().getResource(
                    "/resources/default_template_static.xdd");
        }

        URI fileuri = URI.createURI(resourcepath.toString());
        Resource resource = resSet.getResource(fileuri, true);
        DocumentRoot root = (DocumentRoot) resource.getContents().get(0);

        if (wizardTemplatePage.isConfigurationWizardStatus())
            InitialModelLoader.appendUserData(root, wizardConfigurationPage1);
        else
            InitialModelLoader.appendMetaData(root, wizardConfigurationPage1);
        return root;
    } //loadXDD

    /**
     * @brief Appends reduced data when advanced wizard is not used.
     * @param root
     *            DocumentRoot of the new Resource.
     * @return DocumentRoot with appended meta-data gathered from the system.
     */
    private static DocumentRoot appendMetaData(DocumentRoot root,
        WizardConfigurationPage1 wizardConfigurationPage1) {

        EList<ISO15745ProfileType> profiles = root.getISO15745ProfileContainer()
            .getISO15745Profile();
        ISO15745ProfileType profile1 = profiles.get(0);
        ISO15745ProfileType profile2 = profiles.get(1);
        ProfileHeaderDataType header1 = profile1.getProfileHeader();
        header1.setProfileIdentification("Powerlink_"
            + wizardConfigurationPage1.getDeviceNameString() + "_Profile");
        header1.setProfileName(wizardConfigurationPage1.getDeviceNameString() + " Profile");

        //Setzen der Body-Werte im Profil 1
        ProfileBodyDataType body1 = profile1.getProfileBody();
        body1.setFileCreationDate(wizardConfigurationPage1.getCreationDateXML());
        body1.setFileCreationTime(wizardConfigurationPage1.getCreationTimeXML());
        body1.setFileCreator(wizardConfigurationPage1.getCreatorString());
        body1.setFileName(wizardConfigurationPage1.getFileNameString());
        body1.setFileModificationDate(wizardConfigurationPage1.getCreationDateXML());
        body1.setFileModificationTime(wizardConfigurationPage1.getCreationTimeXML());
        body1.setFileVersion(wizardConfigurationPage1.getFileVersionString());

        //Setzen der Body-Werte im Profil 2
        ProfileBodyDataType body2 = profile2.getProfileBody();
        body2.setFileCreationDate(wizardConfigurationPage1.getCreationDateXML());
        body2.setFileCreationTime(wizardConfigurationPage1.getCreationTimeXML());
        body2.setFileCreator(wizardConfigurationPage1.getCreatorString());
        body2.setFileName(wizardConfigurationPage1.getFileNameString());
        body2.setFileModificationDate(wizardConfigurationPage1.getCreationDateXML());
        body2.setFileModificationTime(wizardConfigurationPage1.getCreationTimeXML());
        body2.setFileVersion(wizardConfigurationPage1.getFileNameString());

        //For further Saves -> Give Utilites the creatorname
        return root;
    } //appendMetaData

    /**
     * @brief Appends the userdata from WizardConfigurationPage1.
     * @param root
     *            DocumentRoot of the new Resource.
     * @return DocumentRoot with appended userdata from
     *         WizardConfigurationPage.
     */
    private static DocumentRoot appendUserData(DocumentRoot root,
        WizardConfigurationPage1 wizardConfigurationPage1) {

        EList<ISO15745ProfileType> profiles = root.getISO15745ProfileContainer()
            .getISO15745Profile();
        ISO15745ProfileType profile1 = profiles.get(0);
        ISO15745ProfileType profile2 = profiles.get(1);

        ProfileHeaderDataType header1 = profile1.getProfileHeader();
        header1.setProfileIdentification("Powerlink_"
            + wizardConfigurationPage1.getDeviceNameString() + "_Profile");
        header1.setProfileName(wizardConfigurationPage1.getDeviceNameString() + " Profile");
        XDDUtilities.setCreator(wizardConfigurationPage1.getCreatorString());
        //Setzen der Body-Werte im Profil 1
        ProfileBodyDataType body1 = profile1.getProfileBody();
        body1.setFileCreationDate(wizardConfigurationPage1.getCreationDateXML());
        body1.setFileCreationTime(wizardConfigurationPage1.getCreationTimeXML());
        body1.setFileCreator(wizardConfigurationPage1.getCreatorString());
        body1.setFileName(wizardConfigurationPage1.getFileNameString());
        body1.setFileModificationDate(wizardConfigurationPage1.getCreationDateXML());
        body1.setFileModificationTime(wizardConfigurationPage1.getCreationTimeXML());
        body1.setFileModifiedBy(wizardConfigurationPage1.getCreatorString());
        body1.setFileVersion(wizardConfigurationPage1.getFileVersionString());

        //Setzen der Vendor-Werte im Body 1
        EList<EObject> bodyContents = body1.eContents();
        EObject identity = bodyContents.get(0);
        TDeviceIdentity tDeviceIdentity = (TDeviceIdentity) identity;
        tDeviceIdentity.getVendorName().setValue(wizardConfigurationPage1.getVendorNameString());
        tDeviceIdentity.getVendorID().setValue(wizardConfigurationPage1.getVendorIDString());
        tDeviceIdentity.getProductName().setValue(wizardConfigurationPage1.getProductNameString());
        tDeviceIdentity.getVersion().get(0)
            .setValue(wizardConfigurationPage1.getHardwareversString());
        tDeviceIdentity.getVersion().get(1)
            .setValue(wizardConfigurationPage1.getSoftwareversString());
        tDeviceIdentity.getVersion().add(XDDFactory.eINSTANCE.createTVersion());
        TVersion fwVersion = tDeviceIdentity.getVersion().get(2);
        fwVersion.setVersionType(VersionTypeType.HW);
        fwVersion.setReadOnly(true);
        fwVersion.setValue(wizardConfigurationPage1.getFirmwareversString());

        //Set unsetted Value of ProductID of template
        tDeviceIdentity.setProductID(XDDFactory.eINSTANCE.createTProductID());
        tDeviceIdentity.getProductID().setValue(wizardConfigurationPage1.getProductIDString());

        //Setzen der Body-Werte im Profil 2
        ProfileBodyDataType body2 = profile2.getProfileBody();
        body2.setFileCreationDate(wizardConfigurationPage1.getCreationDateXML());
        body2.setFileCreationTime(wizardConfigurationPage1.getCreationTimeXML());
        body2.setFileCreator(wizardConfigurationPage1.getCreatorString());
        body2.setFileName(wizardConfigurationPage1.getFileNameString());
        body2.setFileModificationDate(wizardConfigurationPage1.getCreationDateXML());
        body2.setFileModificationTime(wizardConfigurationPage1.getCreationTimeXML());
        body2.setFileModifiedBy(wizardConfigurationPage1.getCreatorString());
        body2.setFileVersion(wizardConfigurationPage1.getFileVersionString());

        //Setzen der Vendor.ID im Communication Body
        EList<EObject> bodyContents2 = body2.eContents();
        TApplicationLayers apllayers = (TApplicationLayers) bodyContents2.get(0);
        IdentityType identity2 = apllayers.getIdentity();
        identity2.getVendorID().setValue(wizardConfigurationPage1.getVendorIDString());
        identity2.setProductID(XDDFactory.eINSTANCE.createTProductID());
        identity2.getProductID().setValue(wizardConfigurationPage1.getProductIDString());

        //Setzen der General Features aus dem Wizard
        TNetworkManagement tnmg = (TNetworkManagement) body2.eContents().get(2);
        TGeneralFeatures generalFeatures = tnmg.getGeneralFeatures();
        generalFeatures.setNMTBootTimeNotActive(wizardConfigurationPage1.getNMTBootTimeNotActive());
        generalFeatures.setNMTCycleTimeMax(wizardConfigurationPage1.getNMTCycleTimeMax());
        generalFeatures.setNMTCycleTimeMin(wizardConfigurationPage1.getNMTCycleTimeMin());
        generalFeatures.setNMTErrorEntries(wizardConfigurationPage1.getNMTErrorEntries());
        generalFeatures.setDLLFeatureMN(false);

        //Setzen der CN Features aus dem Wizard
        TCNFeatures cnFeatures = tnmg.getCNFeatures();

        cnFeatures.setDLLCNFeatureMultiplex(wizardConfigurationPage1.isCnMultiplexFeature());
        if (wizardConfigurationPage1.isCnMultiplexFeature())
            XDDUtilities.setMultiplexFeature(true, root);

        cnFeatures.setDLLCNPResChaining(wizardConfigurationPage1.isResponseChaining());
        cnFeatures.setNMTCNSoC2PReq(wizardConfigurationPage1.getNMTCNSoC2PReq());

        return root;
    } //appendUserData

    /**
     * @brief Creates empty Standard-Model.
     * @return An empty model of an XDD-File.
     */
    private static DocumentRoot getEmptyModel() {
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
    }

} //InitialModelLoader
