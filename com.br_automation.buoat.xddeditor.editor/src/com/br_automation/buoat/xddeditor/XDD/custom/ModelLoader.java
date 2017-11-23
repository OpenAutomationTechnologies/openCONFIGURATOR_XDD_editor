/**
 * @since 19.3.2013
 * @author Joris Lückenga, B&R Industrial Automation GmbH
 *
 *  @copyright (c) 2017, B&R Industrial Automation GmbH
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

package com.br_automation.buoat.xddeditor.XDD.custom;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileType;
import com.br_automation.buoat.xddeditor.XDD.IdentityType;
import com.br_automation.buoat.xddeditor.XDD.ObjectListType;
import com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType;
import com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType;
import com.br_automation.buoat.xddeditor.XDD.TApplicationLayers;
import com.br_automation.buoat.xddeditor.XDD.TCNFeatures;
import com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity;
import com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures;
import com.br_automation.buoat.xddeditor.XDD.TNetworkManagement;
import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.TVersion;
import com.br_automation.buoat.xddeditor.XDD.VersionTypeType;
import com.br_automation.buoat.xddeditor.XDD.XDDFactory;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * @brief Provides methods to create an initial model based on data configured
 *        in the Wizard.
 *
 *        Gets the user-input from the CustomXDDWizard-Pages and adds the needed
 *        objects to the root. Also adds the correct time,user etc.
 *
 * @author Joris Lückenga
 */
public final class ModelLoader {

    /**
     * @brief ModelLoader provides only static methods.
     */
    private ModelLoader() {
    }

    /**
     * @brief Loads a new model based on the configuration in the Wizard.
     * @param wizardTemplatePage
     *            The first configuration page.
     * @param wizardConfigurationPage1
     *            The advanced wizard page with user data.
     * @return DocumentRoot with appended data.
     */
    public static DocumentRoot createXDDFromWizardData(WizardTemplatePage wizardTemplatePage,
            WizardConfigurationPage wizardConfigurationPage) {
        // check which Template is used (static etc.)
        String resourceName;

        String choice = wizardTemplatePage.getTemplateCombo().getText();
        if (choice.contentEquals("Default device")) //$NON-NLS-1$
            resourceName = Messages.modelLoader_resourceTemplate_XDDdefault;
        else if (choice.contentEquals("Default extended device")) //$NON-NLS-1$
            resourceName = Messages.modelLoader_resourceTemplate_XDDextended;
        else
            resourceName = Messages.modelLoader_resourceTemplate_XDDstatic;

        DocumentRoot root = XDDUtilities.loadXDD(ModelLoader.class.getResource(resourceName));

        if (wizardTemplatePage.isConfigurationWizardStatus())
            ModelLoader.appendUserData(root, wizardConfigurationPage);
        else
            ModelLoader.appendMetaData(root, wizardConfigurationPage);
        return root;
    } // createXDDFromWizardData

    /**
     * @brief Add/Remove objects required for IP-Support.
     *
     * @param status
     *            <code>True</code> to add objects, <code>false</code>
     *            otherwise. <code>False</code> is not implemented yet.
     * @param root
     *            The DocumentRoot where IP-Support objects should be set.
     */
    public static void setIPSupportObjects(boolean status, DocumentRoot root) {
        // Get all iPSupportIndices
        List<Integer> ipSupportObjects = new ArrayList<Integer>();
        ipSupportObjects.add(EPLGeneralConstants.NWL_HOSTNAME_VSTR);
        ipSupportObjects.add(EPLGeneralConstants.NWL_IPGROUP_TYPE);
        for (int i = EPLGeneralConstants.NWL_IPADDRTABLE_REC_MIN; i <= EPLGeneralConstants.NWL_IPADDRTABLE_REC_MAX; i++)
            ipSupportObjects.add(i);
        if (status) {
            List<TObject> objectsToAdd = XDDUtilities.getTObjectsFromResource(
                    ModelLoader.class.getResource(Messages.modelLoader_resourceTemplate_ipSupportObjects),
                    ipSupportObjects);
            // Add Objects to Resource
            XDDUtilities.addTObjects(objectsToAdd, root);
        }

        List<TGeneralFeatures> generalFeatures = XDDUtilities.findEObjects(root,
                XDDPackage.eINSTANCE.getTGeneralFeatures());
        if (!generalFeatures.isEmpty()) {
            generalFeatures.get(0).setNWLIPSupport(status);
        }
    }

    /**
     * @brief Add/Remove objects required for Multi-ASnd
     *
     * @param status
     *            <code>True</code> to add objects, <code>false</code>
     *            otherwise. <code>False</code> is not implemented yet.
     * @param root
     *            The DocumentRoot where Multi-ASnd objects should be set.
     */
    public static void setMultipleASndObjects(boolean status, DocumentRoot root) {

        List<Integer> multipleASndObjectIndices = new ArrayList<Integer>();
        multipleASndObjectIndices.add(EPLGeneralConstants.NMT_MNCYCLETIMING_REC);
        multipleASndObjectIndices.add(EPLGeneralConstants.NMT_NODEASSIGNMENT_AU32);
        multipleASndObjectIndices.add(EPLGeneralConstants.NMT_FEATUREFLAGS_U32);

        if (status) {
            List<TObject> objectsToAdd = XDDUtilities.getTObjectsFromResource(
                    ModelLoader.class.getResource(Messages.modelLoader_resourceTemplate_multiASndObjects),
                    multipleASndObjectIndices);
            // Set Objects to Resource
            XDDUtilities.addTObjects(objectsToAdd, root);
            // SET Properties in FeatureFlags & TCNFeatures/GeneralFeatures
            XDDUtilities.setFeatureFlag(status, EPLGeneralConstants.FF_OFFSET_MULTIPLE_ASND, root);
        }
    }

    /**
     * @brief Add/Remove objects required for Multiplexing-feature
     *
     * @param status
     *            <code>True</code> to add objects, <code>false</code>
     *            otherwise. <code>False</code> is not implemented yet.
     * @param root
     *            The DocumentRoot where Multiplexing-feature objects should be
     *            set.
     */
    public static void setMultiplexFeatureObjects(boolean status, DocumentRoot root) {
        List<TCNFeatures> tCNfeaturesList = XDDUtilities.findEObjects(root, XDDPackage.eINSTANCE.getTCNFeatures());
        List<ObjectListType> objectsList = XDDUtilities.findEObjects(root, XDDPackage.eINSTANCE.getObjectListType());

        if (objectsList.isEmpty() || tCNfeaturesList.isEmpty())
            return;

        TCNFeatures cnFeatures = tCNfeaturesList.get(0);
        cnFeatures.setDLLCNFeatureMultiplex(status);
        EList<TObject> objects = objectsList.get(0).getObject();

        for (TObject tObject : objects)
            if (EPLGeneralConstants.NMT_FEATUREFLAGS_U32 == new BigInteger(tObject.getIndex()) // NOPMD
                                                                                                // by
                                                                                                // lueckengaj
                                                                                                // on
                                                                                                // 18.04.13
                                                                                                // 09:23
                    .intValue())
                if (status)
                    tObject.setDefaultValue("0x" //$NON-NLS-1$
                            + Long.toHexString((Long.decode(tObject.getDefaultValue()) | 512)));
                else
                    tObject.setDefaultValue("0x" //$NON-NLS-1$
                            + Long.toHexString((Long.decode(tObject.getDefaultValue()) & ~512)));

        List<Integer> multiplexFeatureObjects = new ArrayList<Integer>(3);
        multiplexFeatureObjects.add(EPLGeneralConstants.NMT_ISOCHSLOTASSIGN_AU8);
        multiplexFeatureObjects.add(EPLGeneralConstants.NMT_MULTIPLCYCLEASSIGN_AU8);
        multiplexFeatureObjects.add(EPLGeneralConstants.NMT_CYCLETIMING_REC);
        multiplexFeatureObjects.add(EPLGeneralConstants.NMT_FEATUREFLAGS_U32);
        multiplexFeatureObjects.add(EPLGeneralConstants.NMT_NODEASSIGNMENT_AU32);

        if (status) {
            // Get Needed Objects for Multiplex Support
            List<TObject> objectsToAdd = XDDUtilities.getTObjectsFromResource(
                    ModelLoader.class.getResource(Messages.modelLoader_resourceTemplate_multiplexFeatureObjects),
                    multiplexFeatureObjects);
            // Set Objects to Resource
            XDDUtilities.addTObjects(objectsToAdd, root);
        }

    }

    /**
     * @brief Add/Remove objects required for PRes-Chaining feature
     *
     * @param status
     *            <code>True</code> to add objects, <code>false</code>
     *            otherwise. <code>False</code> is not implemented yet.
     * @param root
     *            The DocumentRoot where PRes-Chaining objects should be set.
     */
    public static void setPResChainingObjects(boolean status, DocumentRoot root) {

        List<Integer> prespChainingObjects = new ArrayList<Integer>();
        prespChainingObjects.add(EPLGeneralConstants.NMT_RELATIVELATENCYDIFF_AU32);
        prespChainingObjects.add(EPLGeneralConstants.NMT_CYCLETIMING_REC);
        prespChainingObjects.add(EPLGeneralConstants.NMT_NODEASSIGNMENT_AU32);
        prespChainingObjects.add(EPLGeneralConstants.NMT_FEATUREFLAGS_U32);

        if (status) {
            List<TObject> objectsToAdd = XDDUtilities.getTObjectsFromResource(
                    ModelLoader.class.getResource(Messages.modelLoader_resourceTemplate_prespChainingObjects),
                    prespChainingObjects);
            // Set Objects to Resource
            XDDUtilities.addTObjects(objectsToAdd, root);
            // Set Properties in FeatureFlags, TCN- / General Features
            XDDUtilities.setFeatureFlag(status, 18, root);
        }
    }

    /**
     * @brief Appends reduced data when advanced wizard is not used.
     * @param root
     *            DocumentRoot of the new Resource.
     * @param wizardConfigurationPage
     *            Instance of the WizardConfigurationPage fetch user-input.
     * @return DocumentRoot with appended meta-data gathered from the system.
     */
    private static DocumentRoot appendMetaData(DocumentRoot root, WizardConfigurationPage wizardConfigurationPage) {

        EList<ISO15745ProfileType> profiles = root.getISO15745ProfileContainer().getISO15745Profile();
        ISO15745ProfileType profile1 = profiles.get(0);
        ISO15745ProfileType profile2 = profiles.get(1);
        ProfileHeaderDataType header1 = profile1.getProfileHeader();
        header1.setProfileIdentification("Powerlink_" //$NON-NLS-1$
                + wizardConfigurationPage.getDeviceNameString() + "_Profile"); //$NON-NLS-1$
        header1.setProfileName(wizardConfigurationPage.getDeviceNameString() + " Profile"); //$NON-NLS-1$

        // Setzen der Body-Werte im Profil 1
        ProfileBodyDataType body1 = profile1.getProfileBody();
        body1.setFileCreationDate(wizardConfigurationPage.getCreationDateXML());
        body1.setFileCreationTime(wizardConfigurationPage.getCreationTimeXML());
        body1.setFileCreator(wizardConfigurationPage.getCreatorString());
        body1.setFileName(wizardConfigurationPage.getFileNameString());
        body1.setFileModificationDate(wizardConfigurationPage.getCreationDateXML());
        body1.setFileModificationTime(wizardConfigurationPage.getCreationTimeXML());
        body1.setFileVersion(wizardConfigurationPage.getFileVersionString());

        // Setzen der Body-Werte im Profil 2
        ProfileBodyDataType body2 = profile2.getProfileBody();
        body2.setFileCreationDate(wizardConfigurationPage.getCreationDateXML());
        body2.setFileCreationTime(wizardConfigurationPage.getCreationTimeXML());
        body2.setFileCreator(wizardConfigurationPage.getCreatorString());
        body2.setFileName(wizardConfigurationPage.getFileNameString());
        body2.setFileModificationDate(wizardConfigurationPage.getCreationDateXML());
        body2.setFileModificationTime(wizardConfigurationPage.getCreationTimeXML());
        body2.setFileVersion(wizardConfigurationPage.getFileNameString());

        // For further Saves -> Give Utilites the creator name
        XDDUtilities.setCreator(wizardConfigurationPage.getCreatorString());

        return root;
    }

    /**
     * @brief Appends the userdata from WizardConfigurationPage1.
     * @param root
     *            DocumentRoot of the new Resource.
     * @param wizardConfigurationPage
     *            Instance of the WizardConfigurationPage fetch user-input.
     * @return DocumentRoot with appended userdata from WizardConfigurationPage.
     */
    private static DocumentRoot appendUserData(DocumentRoot root, WizardConfigurationPage wizardConfigurationPage) {

        EList<ISO15745ProfileType> profiles = root.getISO15745ProfileContainer().getISO15745Profile();
        ISO15745ProfileType profile1 = profiles.get(0);
        ISO15745ProfileType profile2 = profiles.get(1);

        ProfileHeaderDataType header1 = profile1.getProfileHeader();
        header1.setProfileIdentification("Powerlink_" //$NON-NLS-1$
                + wizardConfigurationPage.getDeviceNameString() + "_Profile"); //$NON-NLS-1$
        header1.setProfileName(wizardConfigurationPage.getDeviceNameString() + " Profile"); //$NON-NLS-1$
        XDDUtilities.setCreator(wizardConfigurationPage.getCreatorString());
        // Setzen der Body-Werte im Profil 1
        ProfileBodyDataType body1 = profile1.getProfileBody();
        body1.setFileCreationDate(wizardConfigurationPage.getCreationDateXML());
        body1.setFileCreationTime(wizardConfigurationPage.getCreationTimeXML());
        body1.setFileCreator(wizardConfigurationPage.getCreatorString());
        body1.setFileName(wizardConfigurationPage.getFileNameString());
        body1.setFileModificationDate(wizardConfigurationPage.getCreationDateXML());
        body1.setFileModificationTime(wizardConfigurationPage.getCreationTimeXML());
        body1.setFileModifiedBy(wizardConfigurationPage.getCreatorString());
        body1.setFileVersion(wizardConfigurationPage.getFileVersionString());

        // Setzen der Vendor-Werte im Body 1
        EList<EObject> bodyContents = body1.eContents();
        EObject identity = bodyContents.get(0);
        TDeviceIdentity tDeviceIdentity = (TDeviceIdentity) identity;
        tDeviceIdentity.getVendorName().setValue(wizardConfigurationPage.getVendorNameString());
        tDeviceIdentity.getVendorID().setValue(wizardConfigurationPage.getVendorIDString());
        tDeviceIdentity.getProductName().setValue(wizardConfigurationPage.getProductNameString());
        tDeviceIdentity.getVersion().get(0).setValue(wizardConfigurationPage.getHardwareversString());
        tDeviceIdentity.getVersion().get(1).setValue(wizardConfigurationPage.getSoftwareversString());
        tDeviceIdentity.getVersion().add(XDDFactory.eINSTANCE.createTVersion());
        TVersion fwVersion = tDeviceIdentity.getVersion().get(2);
        fwVersion.setVersionType(VersionTypeType.FW);
        fwVersion.setReadOnly(true);
        fwVersion.setValue(wizardConfigurationPage.getFirmwareversString());

        // Set unsetted Value of ProductID of template
        tDeviceIdentity.setProductID(XDDFactory.eINSTANCE.createTProductID());
        tDeviceIdentity.getProductID().setValue(wizardConfigurationPage.getProductIDString());

        // Setzen der Body-Werte im Profil 2
        ProfileBodyDataType body2 = profile2.getProfileBody();
        body2.setFileCreationDate(wizardConfigurationPage.getCreationDateXML());
        body2.setFileCreationTime(wizardConfigurationPage.getCreationTimeXML());
        body2.setFileCreator(wizardConfigurationPage.getCreatorString());
        body2.setFileName(wizardConfigurationPage.getFileNameString());
        body2.setFileModificationDate(wizardConfigurationPage.getCreationDateXML());
        body2.setFileModificationTime(wizardConfigurationPage.getCreationTimeXML());
        body2.setFileModifiedBy(wizardConfigurationPage.getCreatorString());
        body2.setFileVersion(wizardConfigurationPage.getFileVersionString());

        // Setzen der Vendor.ID im Communication Body
        EList<EObject> bodyContents2 = body2.eContents();
        TApplicationLayers apllayers = (TApplicationLayers) bodyContents2.get(0);
        IdentityType identity2 = apllayers.getIdentity();
        identity2.getVendorID().setValue(wizardConfigurationPage.getVendorIDString());
        identity2.setProductID(XDDFactory.eINSTANCE.createTProductID());
        identity2.getProductID().setValue(wizardConfigurationPage.getProductIDString());

        // Setzen der General Features aus dem Wizard
        TNetworkManagement tnmg = (TNetworkManagement) body2.eContents().get(2);
        TGeneralFeatures generalFeatures = tnmg.getGeneralFeatures();
        generalFeatures.setNMTBootTimeNotActive(wizardConfigurationPage.getNMTBootTimeNotActive());
        generalFeatures.setNMTCycleTimeMax(wizardConfigurationPage.getNMTCycleTimeMax());
        generalFeatures.setNMTCycleTimeMin(wizardConfigurationPage.getNMTCycleTimeMin());
        generalFeatures.setNMTErrorEntries(wizardConfigurationPage.getNMTErrorEntries());
        generalFeatures.setDLLFeatureMN(false);

        // Setzen der CN Features aus dem Wizard
        TCNFeatures cnFeatures = tnmg.getCNFeatures();
        cnFeatures.setDLLCNPResChaining(wizardConfigurationPage.isResponseChaining());
        cnFeatures.setNMTCNSoC2PReq(wizardConfigurationPage.getNMTCNSoC2PReq());

        cnFeatures.setDLLCNFeatureMultiplex(wizardConfigurationPage.isCnMultiplexFeature());
        if (wizardConfigurationPage.isCnMultiplexFeature()) {
            ModelLoader.setMultiplexFeatureObjects(true, root);
        }
        if (wizardConfigurationPage.isIpSupport()) {
            ModelLoader.setIPSupportObjects(true, root);
            generalFeatures.setNWLForward(true);
        } else {
            generalFeatures.setNWLIPSupport(false);
            generalFeatures.setNWLForward(false);
        }
        if (wizardConfigurationPage.isResponseChaining()) {
            ModelLoader.setPResChainingObjects(true, root);
        }

        return root;
    }

} // InitialModelLoader
