/**
 */
package com.br_automation.buoat.xddeditor.XDD.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink;
import com.br_automation.buoat.xddeditor.XDD.XDDFactory;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * This is the item provider adapter for a {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProfileBodyCommunicationNetworkPowerlinkItemProvider extends ProfileBodyDataTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileBodyCommunicationNetworkPowerlinkItemProvider(AdapterFactory adapterFactory) {
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

			addSpecificationVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Specification Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecificationVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProfileBodyCommunicationNetworkPowerlink_specificationVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProfileBodyCommunicationNetworkPowerlink_specificationVersion_feature", "_UI_ProfileBodyCommunicationNetworkPowerlink_type"),
				 XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_SpecificationVersion(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_ApplicationLayers());
			childrenFeatures.add(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers());
			childrenFeatures.add(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_NetworkManagement());
			childrenFeatures.add(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_ExternalProfileHandle());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ProfileBodyCommunicationNetworkPowerlink.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProfileBodyCommunicationNetworkPowerlink"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ProfileBodyCommunicationNetworkPowerlink)object).getFileName();
		return label == null || label.length() == 0 ?
			getString("_UI_ProfileBodyCommunicationNetworkPowerlink_type") :
			getString("_UI_ProfileBodyCommunicationNetworkPowerlink_type") + " " + label;
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

		switch (notification.getFeatureID(ProfileBodyCommunicationNetworkPowerlink.class)) {
			case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__SPECIFICATION_VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__APPLICATION_LAYERS:
			case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__TRANSPORT_LAYERS:
			case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__NETWORK_MANAGEMENT:
			case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__EXTERNAL_PROFILE_HANDLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_ApplicationLayers(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_NetworkManagement(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_ExternalProfileHandle(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_ApplicationLayers() ||
			childFeature == XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers() ||
			childFeature == XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_ExternalProfileHandle() ||
			childFeature == XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_NetworkManagement();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
