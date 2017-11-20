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

import com.br_automation.buoat.xddeditor.XDD.TMNFeatures;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * This is the item provider adapter for a {@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TMNFeaturesItemProvider 
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
	public TMNFeaturesItemProvider(AdapterFactory adapterFactory) {
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

			addDLLErrMNMultipleMNPropertyDescriptor(object);
			addDLLMNFeatureMultiplexPropertyDescriptor(object);
			addDLLMNFeaturePResTxPropertyDescriptor(object);
			addDLLMNPResChainingPropertyDescriptor(object);
			addDLLMNRingRedundancyPropertyDescriptor(object);
			addNMTMNASnd2SoCPropertyDescriptor(object);
			addNMTMNBasicEthernetPropertyDescriptor(object);
			addNMTMNDNAPropertyDescriptor(object);
			addNMTMNMaxAsynchronousSlotsPropertyDescriptor(object);
			addNMTMNMultiplCycMaxPropertyDescriptor(object);
			addNMTMNPRes2PReqPropertyDescriptor(object);
			addNMTMNPRes2PResPropertyDescriptor(object);
			addNMTMNPResRx2SoAPropertyDescriptor(object);
			addNMTMNPResTx2SoAPropertyDescriptor(object);
			addNMTMNRedundancyPropertyDescriptor(object);
			addNMTMNSoA2ASndTxPropertyDescriptor(object);
			addNMTMNSoC2PReqPropertyDescriptor(object);
			addNMTNetTimePropertyDescriptor(object);
			addNMTNetTimeIsRealTimePropertyDescriptor(object);
			addNMTRelativeTimePropertyDescriptor(object);
			addNMTServiceUdpIpPropertyDescriptor(object);
			addNMTSimpleBootPropertyDescriptor(object);
			addPDOTPDOChannelsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the DLL Err MN Multiple MN feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDLLErrMNMultipleMNPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TMNFeatures_dLLErrMNMultipleMN_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TMNFeatures_dLLErrMNMultipleMN_feature", "_UI_TMNFeatures_type"),
				 XDDPackage.eINSTANCE.getTMNFeatures_DLLErrMNMultipleMN(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the DLLMN Feature Multiplex feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDLLMNFeatureMultiplexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TMNFeatures_dLLMNFeatureMultiplex_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TMNFeatures_dLLMNFeatureMultiplex_feature", "_UI_TMNFeatures_type"),
				 XDDPackage.eINSTANCE.getTMNFeatures_DLLMNFeatureMultiplex(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the DLLMN Feature PRes Tx feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDLLMNFeaturePResTxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TMNFeatures_dLLMNFeaturePResTx_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TMNFeatures_dLLMNFeaturePResTx_feature", "_UI_TMNFeatures_type"),
				 XDDPackage.eINSTANCE.getTMNFeatures_DLLMNFeaturePResTx(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the DLLMNP Res Chaining feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDLLMNPResChainingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TMNFeatures_dLLMNPResChaining_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TMNFeatures_dLLMNPResChaining_feature", "_UI_TMNFeatures_type"),
				 XDDPackage.eINSTANCE.getTMNFeatures_DLLMNPResChaining(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the DLLMN Ring Redundancy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDLLMNRingRedundancyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TMNFeatures_dLLMNRingRedundancy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TMNFeatures_dLLMNRingRedundancy_feature", "_UI_TMNFeatures_type"),
				 XDDPackage.eINSTANCE.getTMNFeatures_DLLMNRingRedundancy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMTMNA Snd2 So C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTMNASnd2SoCPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TMNFeatures_nMTMNASnd2SoC_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TMNFeatures_nMTMNASnd2SoC_feature", "_UI_TMNFeatures_type"),
				 XDDPackage.eINSTANCE.getTMNFeatures_NMTMNASnd2SoC(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMTMN Basic Ethernet feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTMNBasicEthernetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TMNFeatures_nMTMNBasicEthernet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TMNFeatures_nMTMNBasicEthernet_feature", "_UI_TMNFeatures_type"),
				 XDDPackage.eINSTANCE.getTMNFeatures_NMTMNBasicEthernet(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMTMNDNA feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTMNDNAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TMNFeatures_nMTMNDNA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TMNFeatures_nMTMNDNA_feature", "_UI_TMNFeatures_type"),
				 XDDPackage.eINSTANCE.getTMNFeatures_NMTMNDNA(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMTMN Max Asynchronous Slots feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTMNMaxAsynchronousSlotsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TMNFeatures_nMTMNMaxAsynchronousSlots_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TMNFeatures_nMTMNMaxAsynchronousSlots_feature", "_UI_TMNFeatures_type"),
				 XDDPackage.eINSTANCE.getTMNFeatures_NMTMNMaxAsynchronousSlots(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMTMN Multipl Cyc Max feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTMNMultiplCycMaxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TMNFeatures_nMTMNMultiplCycMax_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TMNFeatures_nMTMNMultiplCycMax_feature", "_UI_TMNFeatures_type"),
				 XDDPackage.eINSTANCE.getTMNFeatures_NMTMNMultiplCycMax(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMTMNP Res2 PReq feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTMNPRes2PReqPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TMNFeatures_nMTMNPRes2PReq_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TMNFeatures_nMTMNPRes2PReq_feature", "_UI_TMNFeatures_type"),
				 XDDPackage.eINSTANCE.getTMNFeatures_NMTMNPRes2PReq(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMTMNP Res2 PRes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTMNPRes2PResPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TMNFeatures_nMTMNPRes2PRes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TMNFeatures_nMTMNPRes2PRes_feature", "_UI_TMNFeatures_type"),
				 XDDPackage.eINSTANCE.getTMNFeatures_NMTMNPRes2PRes(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMTMNP Res Rx2 So A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTMNPResRx2SoAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TMNFeatures_nMTMNPResRx2SoA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TMNFeatures_nMTMNPResRx2SoA_feature", "_UI_TMNFeatures_type"),
				 XDDPackage.eINSTANCE.getTMNFeatures_NMTMNPResRx2SoA(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMTMNP Res Tx2 So A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTMNPResTx2SoAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TMNFeatures_nMTMNPResTx2SoA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TMNFeatures_nMTMNPResTx2SoA_feature", "_UI_TMNFeatures_type"),
				 XDDPackage.eINSTANCE.getTMNFeatures_NMTMNPResTx2SoA(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMTMN Redundancy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTMNRedundancyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TMNFeatures_nMTMNRedundancy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TMNFeatures_nMTMNRedundancy_feature", "_UI_TMNFeatures_type"),
				 XDDPackage.eINSTANCE.getTMNFeatures_NMTMNRedundancy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMTMN So A2A Snd Tx feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTMNSoA2ASndTxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TMNFeatures_nMTMNSoA2ASndTx_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TMNFeatures_nMTMNSoA2ASndTx_feature", "_UI_TMNFeatures_type"),
				 XDDPackage.eINSTANCE.getTMNFeatures_NMTMNSoA2ASndTx(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMTMN So C2P Req feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTMNSoC2PReqPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TMNFeatures_nMTMNSoC2PReq_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TMNFeatures_nMTMNSoC2PReq_feature", "_UI_TMNFeatures_type"),
				 XDDPackage.eINSTANCE.getTMNFeatures_NMTMNSoC2PReq(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Net Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTNetTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TMNFeatures_nMTNetTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TMNFeatures_nMTNetTime_feature", "_UI_TMNFeatures_type"),
				 XDDPackage.eINSTANCE.getTMNFeatures_NMTNetTime(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Net Time Is Real Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTNetTimeIsRealTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TMNFeatures_nMTNetTimeIsRealTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TMNFeatures_nMTNetTimeIsRealTime_feature", "_UI_TMNFeatures_type"),
				 XDDPackage.eINSTANCE.getTMNFeatures_NMTNetTimeIsRealTime(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Relative Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTRelativeTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TMNFeatures_nMTRelativeTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TMNFeatures_nMTRelativeTime_feature", "_UI_TMNFeatures_type"),
				 XDDPackage.eINSTANCE.getTMNFeatures_NMTRelativeTime(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Service Udp Ip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTServiceUdpIpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TMNFeatures_nMTServiceUdpIp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TMNFeatures_nMTServiceUdpIp_feature", "_UI_TMNFeatures_type"),
				 XDDPackage.eINSTANCE.getTMNFeatures_NMTServiceUdpIp(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NMT Simple Boot feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNMTSimpleBootPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TMNFeatures_nMTSimpleBoot_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TMNFeatures_nMTSimpleBoot_feature", "_UI_TMNFeatures_type"),
				 XDDPackage.eINSTANCE.getTMNFeatures_NMTSimpleBoot(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the PDOTPDO Channels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPDOTPDOChannelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TMNFeatures_pDOTPDOChannels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TMNFeatures_pDOTPDOChannels_feature", "_UI_TMNFeatures_type"),
				 XDDPackage.eINSTANCE.getTMNFeatures_PDOTPDOChannels(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns TMNFeatures.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TMNFeatures"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		TMNFeatures tmnFeatures = (TMNFeatures)object;
		return getString("_UI_TMNFeatures_type") + " " + tmnFeatures.isDLLErrMNMultipleMN();
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

		switch (notification.getFeatureID(TMNFeatures.class)) {
			case XDDPackage.TMN_FEATURES__DLL_ERR_MN_MULTIPLE_MN:
			case XDDPackage.TMN_FEATURES__DLLMN_FEATURE_MULTIPLEX:
			case XDDPackage.TMN_FEATURES__DLLMN_FEATURE_PRES_TX:
			case XDDPackage.TMN_FEATURES__DLLMNP_RES_CHAINING:
			case XDDPackage.TMN_FEATURES__DLLMN_RING_REDUNDANCY:
			case XDDPackage.TMN_FEATURES__NMTMNA_SND2_SO_C:
			case XDDPackage.TMN_FEATURES__NMTMN_BASIC_ETHERNET:
			case XDDPackage.TMN_FEATURES__NMTMNDNA:
			case XDDPackage.TMN_FEATURES__NMTMN_MAX_ASYNCHRONOUS_SLOTS:
			case XDDPackage.TMN_FEATURES__NMTMN_MULTIPL_CYC_MAX:
			case XDDPackage.TMN_FEATURES__NMTMNP_RES2_PREQ:
			case XDDPackage.TMN_FEATURES__NMTMNP_RES2_PRES:
			case XDDPackage.TMN_FEATURES__NMTMNP_RES_RX2_SO_A:
			case XDDPackage.TMN_FEATURES__NMTMNP_RES_TX2_SO_A:
			case XDDPackage.TMN_FEATURES__NMTMN_REDUNDANCY:
			case XDDPackage.TMN_FEATURES__NMTMN_SO_A2A_SND_TX:
			case XDDPackage.TMN_FEATURES__NMTMN_SO_C2P_REQ:
			case XDDPackage.TMN_FEATURES__NMT_NET_TIME:
			case XDDPackage.TMN_FEATURES__NMT_NET_TIME_IS_REAL_TIME:
			case XDDPackage.TMN_FEATURES__NMT_RELATIVE_TIME:
			case XDDPackage.TMN_FEATURES__NMT_SERVICE_UDP_IP:
			case XDDPackage.TMN_FEATURES__NMT_SIMPLE_BOOT:
			case XDDPackage.TMN_FEATURES__PDOTPDO_CHANNELS:
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
