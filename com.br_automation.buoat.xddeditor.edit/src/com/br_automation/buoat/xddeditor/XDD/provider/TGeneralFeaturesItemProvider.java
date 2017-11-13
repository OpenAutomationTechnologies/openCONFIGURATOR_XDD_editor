/**
 */
package com.br_automation.buoat.xddeditor.XDD.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * This is the item provider adapter for a {@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TGeneralFeaturesItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TGeneralFeaturesItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addCFMConfigManagerPropertyDescriptor(object);
			addDLLErrBadPhysModePropertyDescriptor(object);
			addDLLErrMacBufferPropertyDescriptor(object);
			addDLLFeatureCNPropertyDescriptor(object);
			addDLLFeatureMNPropertyDescriptor(object);
			addDLLMultiplePReqPResPropertyDescriptor(object);
			addNMTBootTimeNotActivePropertyDescriptor(object);
			addNMTCycleTimeGranularityPropertyDescriptor(object);
			addNMTCycleTimeMaxPropertyDescriptor(object);
			addNMTCycleTimeMinPropertyDescriptor(object);
			addNMTEmergencyQueueSizePropertyDescriptor(object);
			addNMTErrorEntriesPropertyDescriptor(object);
			addNMTExtNmtCmdsPropertyDescriptor(object);
			addNMTFlushArpEntryPropertyDescriptor(object);
			addNMTIsochronousPropertyDescriptor(object);
			addNMTMaxCNNodeIDPropertyDescriptor(object);
			addNMTMaxCNNumberPropertyDescriptor(object);
			addNMTMaxHeartbeatsPropertyDescriptor(object);
			addNMTMinRedCycleTimePropertyDescriptor(object);
			addNMTNetHostNameSetPropertyDescriptor(object);
			addNMTNodeIDByHWPropertyDescriptor(object);
			addNMTNodeIDBySWPropertyDescriptor(object);
			addNMTProductCodePropertyDescriptor(object);
			addNMTPublishActiveNodesPropertyDescriptor(object);
			addNMTPublishConfigNodesPropertyDescriptor(object);
			addNMTPublishEmergencyNewPropertyDescriptor(object);
			addNMTPublishNodeStatePropertyDescriptor(object);
			addNMTPublishOperationalPropertyDescriptor(object);
			addNMTPublishPreOp1PropertyDescriptor(object);
			addNMTPublishPreOp2PropertyDescriptor(object);
			addNMTPublishReadyToOpPropertyDescriptor(object);
			addNMTPublishStoppedPropertyDescriptor(object);
			addNMTPublishTimePropertyDescriptor(object);
			addNMTRevisionNoPropertyDescriptor(object);
			addNWLForwardPropertyDescriptor(object);
			addNWLICMPSupportPropertyDescriptor(object);
			addNWLIPSupportPropertyDescriptor(object);
			addPDODynamicMappingPropertyDescriptor(object);
			addPDOGranularityPropertyDescriptor(object);
			addPDOMaxDescrMemPropertyDescriptor(object);
			addPDORPDOChannelObjectsPropertyDescriptor(object);
			addPDORPDOChannelsPropertyDescriptor(object);
			addPDORPDOCycleDataLimPropertyDescriptor(object);
			addPDORPDOOverallObjectsPropertyDescriptor(object);
			addPDOSelfReceiptPropertyDescriptor(object);
			addPDOTPDOChannelObjectsPropertyDescriptor(object);
			addPDOTPDOCycleDataLimPropertyDescriptor(object);
			addPDOTPDOOverallObjectsPropertyDescriptor(object);
			addPHYExtEPLPortsPropertyDescriptor(object);
			addPHYHubDelayPropertyDescriptor(object);
			addPHYHubIntegratedPropertyDescriptor(object);
			addPHYHubJitterPropertyDescriptor(object);
			addRT1RT1SecuritySupportPropertyDescriptor(object);
			addRT1RT1SupportPropertyDescriptor(object);
			addRT2RT2SupportPropertyDescriptor(object);
			addSDOClientPropertyDescriptor(object);
			addSDOCmdFileReadPropertyDescriptor(object);
			addSDOCmdFileWritePropertyDescriptor(object);
			addSDOCmdLinkNamePropertyDescriptor(object);
			addSDOCmdReadAllByIndexPropertyDescriptor(object);
			addSDOCmdReadByNamePropertyDescriptor(object);
			addSDOCmdReadMultParamPropertyDescriptor(object);
			addSDOCmdWriteAllByIndexPropertyDescriptor(object);
			addSDOCmdWriteByNamePropertyDescriptor(object);
			addSDOCmdWriteMultParamPropertyDescriptor(object);
			addSDOMaxConnectionsPropertyDescriptor(object);
			addSDOMaxParallelConnectionsPropertyDescriptor(object);
			addSDOSeqLayerTxHistorySizePropertyDescriptor(object);
			addSDOServerPropertyDescriptor(object);
			addSDOSupportASndPropertyDescriptor(object);
			addSDOSupportPDOPropertyDescriptor(object);
			addSDOSupportUdpIpPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the CFM Config Manager feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCFMConfigManagerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_cFMConfigManager_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_cFMConfigManager_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_CFMConfigManager(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the DLL Err Bad Phys Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDLLErrBadPhysModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_dLLErrBadPhysMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_dLLErrBadPhysMode_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_DLLErrBadPhysMode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the DLL Err Mac Buffer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDLLErrMacBufferPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_dLLErrMacBuffer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_dLLErrMacBuffer_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_DLLErrMacBuffer(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the DLL Feature CN feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDLLFeatureCNPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_dLLFeatureCN_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_dLLFeatureCN_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_DLLFeatureCN(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the DLL Feature MN feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDLLFeatureMNPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_dLLFeatureMN_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_dLLFeatureMN_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_DLLFeatureMN(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the DLL Multiple PReq PRes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDLLMultiplePReqPResPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_dLLMultiplePReqPRes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_dLLMultiplePReqPRes_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_DLLMultiplePReqPRes(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Boot Time Not Active feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTBootTimeNotActivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nMTBootTimeNotActive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nMTBootTimeNotActive_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NMTBootTimeNotActive(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Cycle Time Granularity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTCycleTimeGranularityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nMTCycleTimeGranularity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nMTCycleTimeGranularity_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NMTCycleTimeGranularity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Cycle Time Max feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTCycleTimeMaxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nMTCycleTimeMax_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nMTCycleTimeMax_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NMTCycleTimeMax(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Cycle Time Min feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTCycleTimeMinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nMTCycleTimeMin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nMTCycleTimeMin_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NMTCycleTimeMin(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Emergency Queue Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTEmergencyQueueSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nMTEmergencyQueueSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nMTEmergencyQueueSize_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NMTEmergencyQueueSize(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Error Entries feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTErrorEntriesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nMTErrorEntries_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nMTErrorEntries_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NMTErrorEntries(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Ext Nmt Cmds feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTExtNmtCmdsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nMTExtNmtCmds_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nMTExtNmtCmds_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NMTExtNmtCmds(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Flush Arp Entry feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTFlushArpEntryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nMTFlushArpEntry_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nMTFlushArpEntry_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NMTFlushArpEntry(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Isochronous feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTIsochronousPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nMTIsochronous_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nMTIsochronous_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NMTIsochronous(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Max CN Node ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTMaxCNNodeIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nMTMaxCNNodeID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nMTMaxCNNodeID_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NMTMaxCNNodeID(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Max CN Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTMaxCNNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nMTMaxCNNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nMTMaxCNNumber_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NMTMaxCNNumber(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Max Heartbeats feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTMaxHeartbeatsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nMTMaxHeartbeats_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nMTMaxHeartbeats_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NMTMaxHeartbeats(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Min Red Cycle Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTMinRedCycleTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nMTMinRedCycleTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nMTMinRedCycleTime_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NMTMinRedCycleTime(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Net Host Name Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTNetHostNameSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nMTNetHostNameSet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nMTNetHostNameSet_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NMTNetHostNameSet(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Node ID By HW feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTNodeIDByHWPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nMTNodeIDByHW_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nMTNodeIDByHW_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NMTNodeIDByHW(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Node ID By SW feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTNodeIDBySWPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nMTNodeIDBySW_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nMTNodeIDBySW_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NMTNodeIDBySW(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Product Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTProductCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nMTProductCode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nMTProductCode_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NMTProductCode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Publish Active Nodes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTPublishActiveNodesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nMTPublishActiveNodes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nMTPublishActiveNodes_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NMTPublishActiveNodes(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Publish Config Nodes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTPublishConfigNodesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nMTPublishConfigNodes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nMTPublishConfigNodes_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NMTPublishConfigNodes(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Publish Emergency New feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTPublishEmergencyNewPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nMTPublishEmergencyNew_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nMTPublishEmergencyNew_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NMTPublishEmergencyNew(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Publish Node State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTPublishNodeStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nMTPublishNodeState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nMTPublishNodeState_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NMTPublishNodeState(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Publish Operational feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTPublishOperationalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nMTPublishOperational_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nMTPublishOperational_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NMTPublishOperational(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Publish Pre Op1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTPublishPreOp1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nMTPublishPreOp1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nMTPublishPreOp1_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NMTPublishPreOp1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Publish Pre Op2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTPublishPreOp2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nMTPublishPreOp2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nMTPublishPreOp2_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NMTPublishPreOp2(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Publish Ready To Op feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTPublishReadyToOpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nMTPublishReadyToOp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nMTPublishReadyToOp_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NMTPublishReadyToOp(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Publish Stopped feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTPublishStoppedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nMTPublishStopped_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nMTPublishStopped_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NMTPublishStopped(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Publish Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTPublishTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nMTPublishTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nMTPublishTime_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NMTPublishTime(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Revision No feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTRevisionNoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nMTRevisionNo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nMTRevisionNo_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NMTRevisionNo(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NWL Forward feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNWLForwardPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nWLForward_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nWLForward_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NWLForward(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NWLICMP Support feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNWLICMPSupportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nWLICMPSupport_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nWLICMPSupport_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NWLICMPSupport(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NWLIP Support feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNWLIPSupportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_nWLIPSupport_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_nWLIPSupport_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_NWLIPSupport(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the PDO Dynamic Mapping feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPDODynamicMappingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_pDODynamicMapping_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_pDODynamicMapping_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_PDODynamicMapping(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the PDO Granularity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPDOGranularityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_pDOGranularity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_pDOGranularity_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_PDOGranularity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the PDO Max Descr Mem feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPDOMaxDescrMemPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_pDOMaxDescrMem_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_pDOMaxDescrMem_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_PDOMaxDescrMem(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the PDORPDO Channel Objects feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPDORPDOChannelObjectsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_pDORPDOChannelObjects_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_pDORPDOChannelObjects_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_PDORPDOChannelObjects(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the PDORPDO Channels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPDORPDOChannelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_pDORPDOChannels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_pDORPDOChannels_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_PDORPDOChannels(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the PDORPDO Cycle Data Lim feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPDORPDOCycleDataLimPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_pDORPDOCycleDataLim_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_pDORPDOCycleDataLim_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_PDORPDOCycleDataLim(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the PDORPDO Overall Objects feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPDORPDOOverallObjectsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_pDORPDOOverallObjects_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_pDORPDOOverallObjects_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_PDORPDOOverallObjects(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the PDO Self Receipt feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPDOSelfReceiptPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_pDOSelfReceipt_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_pDOSelfReceipt_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_PDOSelfReceipt(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the PDOTPDO Channel Objects feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPDOTPDOChannelObjectsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_pDOTPDOChannelObjects_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_pDOTPDOChannelObjects_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_PDOTPDOChannelObjects(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the PDOTPDO Cycle Data Lim feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPDOTPDOCycleDataLimPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_pDOTPDOCycleDataLim_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_pDOTPDOCycleDataLim_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_PDOTPDOCycleDataLim(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the PDOTPDO Overall Objects feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPDOTPDOOverallObjectsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_pDOTPDOOverallObjects_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_pDOTPDOOverallObjects_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_PDOTPDOOverallObjects(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the PHY Ext EPL Ports feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPHYExtEPLPortsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_pHYExtEPLPorts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_pHYExtEPLPorts_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_PHYExtEPLPorts(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the PHY Hub Delay feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPHYHubDelayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_pHYHubDelay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_pHYHubDelay_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_PHYHubDelay(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the PHY Hub Integrated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPHYHubIntegratedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_pHYHubIntegrated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_pHYHubIntegrated_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_PHYHubIntegrated(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the PHY Hub Jitter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPHYHubJitterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_pHYHubJitter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_pHYHubJitter_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_PHYHubJitter(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the RT1RT1 Security Support feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRT1RT1SecuritySupportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_rT1RT1SecuritySupport_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_rT1RT1SecuritySupport_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_RT1RT1SecuritySupport(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the RT1RT1 Support feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRT1RT1SupportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_rT1RT1Support_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_rT1RT1Support_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_RT1RT1Support(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the RT2RT2 Support feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRT2RT2SupportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_rT2RT2Support_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_rT2RT2Support_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_RT2RT2Support(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the SDO Client feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSDOClientPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_sDOClient_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_sDOClient_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_SDOClient(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the SDO Cmd File Read feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSDOCmdFileReadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_sDOCmdFileRead_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_sDOCmdFileRead_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_SDOCmdFileRead(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the SDO Cmd File Write feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSDOCmdFileWritePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_sDOCmdFileWrite_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_sDOCmdFileWrite_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_SDOCmdFileWrite(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the SDO Cmd Link Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSDOCmdLinkNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_sDOCmdLinkName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_sDOCmdLinkName_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_SDOCmdLinkName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the SDO Cmd Read All By Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSDOCmdReadAllByIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_sDOCmdReadAllByIndex_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_sDOCmdReadAllByIndex_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_SDOCmdReadAllByIndex(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the SDO Cmd Read By Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSDOCmdReadByNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_sDOCmdReadByName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_sDOCmdReadByName_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_SDOCmdReadByName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the SDO Cmd Read Mult Param feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSDOCmdReadMultParamPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_sDOCmdReadMultParam_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_sDOCmdReadMultParam_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_SDOCmdReadMultParam(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the SDO Cmd Write All By Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSDOCmdWriteAllByIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_sDOCmdWriteAllByIndex_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_sDOCmdWriteAllByIndex_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_SDOCmdWriteAllByIndex(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the SDO Cmd Write By Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSDOCmdWriteByNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_sDOCmdWriteByName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_sDOCmdWriteByName_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_SDOCmdWriteByName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the SDO Cmd Write Mult Param feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSDOCmdWriteMultParamPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_sDOCmdWriteMultParam_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_sDOCmdWriteMultParam_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_SDOCmdWriteMultParam(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the SDO Max Connections feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSDOMaxConnectionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_sDOMaxConnections_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_sDOMaxConnections_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_SDOMaxConnections(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the SDO Max Parallel Connections feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSDOMaxParallelConnectionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_sDOMaxParallelConnections_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_sDOMaxParallelConnections_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_SDOMaxParallelConnections(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the SDO Seq Layer Tx History Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSDOSeqLayerTxHistorySizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_sDOSeqLayerTxHistorySize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_sDOSeqLayerTxHistorySize_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_SDOSeqLayerTxHistorySize(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the SDO Server feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSDOServerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_sDOServer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_sDOServer_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_SDOServer(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the SDO Support ASnd feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSDOSupportASndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_sDOSupportASnd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_sDOSupportASnd_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_SDOSupportASnd(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the SDO Support PDO feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSDOSupportPDOPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_sDOSupportPDO_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_sDOSupportPDO_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_SDOSupportPDO(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the SDO Support Udp Ip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSDOSupportUdpIpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGeneralFeatures_sDOSupportUdpIp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGeneralFeatures_sDOSupportUdpIp_feature", "_UI_TGeneralFeatures_type"),
				 XDDPackage.eINSTANCE.getTGeneralFeatures_SDOSupportUdpIp(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns TGeneralFeatures.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TGeneralFeatures"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		TGeneralFeatures tGeneralFeatures = (TGeneralFeatures)object;
		return getString("_UI_TGeneralFeatures_type") + " " + tGeneralFeatures.isSDOCmdLinkName();
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TGeneralFeatures.class)) {
			case XDDPackage.TGENERAL_FEATURES__CFM_CONFIG_MANAGER:
			case XDDPackage.TGENERAL_FEATURES__DLL_ERR_BAD_PHYS_MODE:
			case XDDPackage.TGENERAL_FEATURES__DLL_ERR_MAC_BUFFER:
			case XDDPackage.TGENERAL_FEATURES__DLL_FEATURE_CN:
			case XDDPackage.TGENERAL_FEATURES__DLL_FEATURE_MN:
			case XDDPackage.TGENERAL_FEATURES__DLL_MULTIPLE_PREQ_PRES:
			case XDDPackage.TGENERAL_FEATURES__NMT_BOOT_TIME_NOT_ACTIVE:
			case XDDPackage.TGENERAL_FEATURES__NMT_CYCLE_TIME_GRANULARITY:
			case XDDPackage.TGENERAL_FEATURES__NMT_CYCLE_TIME_MAX:
			case XDDPackage.TGENERAL_FEATURES__NMT_CYCLE_TIME_MIN:
			case XDDPackage.TGENERAL_FEATURES__NMT_EMERGENCY_QUEUE_SIZE:
			case XDDPackage.TGENERAL_FEATURES__NMT_ERROR_ENTRIES:
			case XDDPackage.TGENERAL_FEATURES__NMT_EXT_NMT_CMDS:
			case XDDPackage.TGENERAL_FEATURES__NMT_FLUSH_ARP_ENTRY:
			case XDDPackage.TGENERAL_FEATURES__NMT_ISOCHRONOUS:
			case XDDPackage.TGENERAL_FEATURES__NMT_MAX_CN_NODE_ID:
			case XDDPackage.TGENERAL_FEATURES__NMT_MAX_CN_NUMBER:
			case XDDPackage.TGENERAL_FEATURES__NMT_MAX_HEARTBEATS:
			case XDDPackage.TGENERAL_FEATURES__NMT_MIN_RED_CYCLE_TIME:
			case XDDPackage.TGENERAL_FEATURES__NMT_NET_HOST_NAME_SET:
			case XDDPackage.TGENERAL_FEATURES__NMT_NODE_ID_BY_HW:
			case XDDPackage.TGENERAL_FEATURES__NMT_NODE_ID_BY_SW:
			case XDDPackage.TGENERAL_FEATURES__NMT_PRODUCT_CODE:
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_ACTIVE_NODES:
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_CONFIG_NODES:
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_EMERGENCY_NEW:
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_NODE_STATE:
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_OPERATIONAL:
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_PRE_OP1:
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_PRE_OP2:
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_READY_TO_OP:
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_STOPPED:
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_TIME:
			case XDDPackage.TGENERAL_FEATURES__NMT_REVISION_NO:
			case XDDPackage.TGENERAL_FEATURES__NWL_FORWARD:
			case XDDPackage.TGENERAL_FEATURES__NWLICMP_SUPPORT:
			case XDDPackage.TGENERAL_FEATURES__NWLIP_SUPPORT:
			case XDDPackage.TGENERAL_FEATURES__PDO_DYNAMIC_MAPPING:
			case XDDPackage.TGENERAL_FEATURES__PDO_GRANULARITY:
			case XDDPackage.TGENERAL_FEATURES__PDO_MAX_DESCR_MEM:
			case XDDPackage.TGENERAL_FEATURES__PDORPDO_CHANNEL_OBJECTS:
			case XDDPackage.TGENERAL_FEATURES__PDORPDO_CHANNELS:
			case XDDPackage.TGENERAL_FEATURES__PDORPDO_CYCLE_DATA_LIM:
			case XDDPackage.TGENERAL_FEATURES__PDORPDO_OVERALL_OBJECTS:
			case XDDPackage.TGENERAL_FEATURES__PDO_SELF_RECEIPT:
			case XDDPackage.TGENERAL_FEATURES__PDOTPDO_CHANNEL_OBJECTS:
			case XDDPackage.TGENERAL_FEATURES__PDOTPDO_CYCLE_DATA_LIM:
			case XDDPackage.TGENERAL_FEATURES__PDOTPDO_OVERALL_OBJECTS:
			case XDDPackage.TGENERAL_FEATURES__PHY_EXT_EPL_PORTS:
			case XDDPackage.TGENERAL_FEATURES__PHY_HUB_DELAY:
			case XDDPackage.TGENERAL_FEATURES__PHY_HUB_INTEGRATED:
			case XDDPackage.TGENERAL_FEATURES__PHY_HUB_JITTER:
			case XDDPackage.TGENERAL_FEATURES__RT1RT1_SECURITY_SUPPORT:
			case XDDPackage.TGENERAL_FEATURES__RT1RT1_SUPPORT:
			case XDDPackage.TGENERAL_FEATURES__RT2RT2_SUPPORT:
			case XDDPackage.TGENERAL_FEATURES__SDO_CLIENT:
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_FILE_READ:
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_FILE_WRITE:
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_LINK_NAME:
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_READ_ALL_BY_INDEX:
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_READ_BY_NAME:
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_READ_MULT_PARAM:
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_WRITE_ALL_BY_INDEX:
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_WRITE_BY_NAME:
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_WRITE_MULT_PARAM:
			case XDDPackage.TGENERAL_FEATURES__SDO_MAX_CONNECTIONS:
			case XDDPackage.TGENERAL_FEATURES__SDO_MAX_PARALLEL_CONNECTIONS:
			case XDDPackage.TGENERAL_FEATURES__SDO_SEQ_LAYER_TX_HISTORY_SIZE:
			case XDDPackage.TGENERAL_FEATURES__SDO_SERVER:
			case XDDPackage.TGENERAL_FEATURES__SDO_SUPPORT_ASND:
			case XDDPackage.TGENERAL_FEATURES__SDO_SUPPORT_PDO:
			case XDDPackage.TGENERAL_FEATURES__SDO_SUPPORT_UDP_IP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return XDDEditPlugin.INSTANCE;
	}

}
