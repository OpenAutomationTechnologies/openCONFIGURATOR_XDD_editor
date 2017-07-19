/**
 */
package com.br_automation.buoat.xddeditor.XDD.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;

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

import com.br_automation.buoat.xddeditor.XDD.TDataTypes;
import com.br_automation.buoat.xddeditor.XDD.XDDFactory;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * This is the item provider adapter for a {@link com.br_automation.buoat.xddeditor.XDD.TDataTypes} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TDataTypesItemProvider 
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
	public TDataTypesItemProvider(AdapterFactory adapterFactory) {
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

			addDataTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Data Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TDataTypes_dataType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TDataTypes_dataType_feature", "_UI_TDataTypes_type"),
				 XDDPackage.eINSTANCE.getTDataTypes_DataType(),
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
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Boolean());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Integer8());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Integer16());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Integer32());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Integer24());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Integer40());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Integer48());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Integer56());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Integer64());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Real32());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Real64());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_VisibleString());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_OctetString());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Domain());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_NETTIME());
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
	 * This returns TDataTypes.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TDataTypes"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		byte[] labelValue = ((TDataTypes)object).getDataType();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_TDataTypes_type") :
			getString("_UI_TDataTypes_type") + " " + label;
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

		switch (notification.getFeatureID(TDataTypes.class)) {
			case XDDPackage.TDATA_TYPES__DATA_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case XDDPackage.TDATA_TYPES__BOOLEAN:
			case XDDPackage.TDATA_TYPES__INTEGER8:
			case XDDPackage.TDATA_TYPES__INTEGER16:
			case XDDPackage.TDATA_TYPES__INTEGER32:
			case XDDPackage.TDATA_TYPES__INTEGER24:
			case XDDPackage.TDATA_TYPES__INTEGER40:
			case XDDPackage.TDATA_TYPES__INTEGER48:
			case XDDPackage.TDATA_TYPES__INTEGER56:
			case XDDPackage.TDATA_TYPES__INTEGER64:
			case XDDPackage.TDATA_TYPES__UNSIGNED8:
			case XDDPackage.TDATA_TYPES__UNSIGNED16:
			case XDDPackage.TDATA_TYPES__UNSIGNED32:
			case XDDPackage.TDATA_TYPES__UNSIGNED24:
			case XDDPackage.TDATA_TYPES__UNSIGNED40:
			case XDDPackage.TDATA_TYPES__UNSIGNED48:
			case XDDPackage.TDATA_TYPES__UNSIGNED56:
			case XDDPackage.TDATA_TYPES__UNSIGNED64:
			case XDDPackage.TDATA_TYPES__REAL32:
			case XDDPackage.TDATA_TYPES__REAL64:
			case XDDPackage.TDATA_TYPES__VISIBLE_STRING:
			case XDDPackage.TDATA_TYPES__OCTET_STRING:
			case XDDPackage.TDATA_TYPES__UNICODE_STRING:
			case XDDPackage.TDATA_TYPES__TIME_OF_DAY:
			case XDDPackage.TDATA_TYPES__TIME_DIFF:
			case XDDPackage.TDATA_TYPES__DOMAIN:
			case XDDPackage.TDATA_TYPES__MACADDRESS:
			case XDDPackage.TDATA_TYPES__IPADDRESS:
			case XDDPackage.TDATA_TYPES__NETTIME:
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
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real32(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Real64(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_Domain(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));
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
			childFeature == XDDPackage.eINSTANCE.getTDataTypes_Boolean() ||
			childFeature == XDDPackage.eINSTANCE.getTDataTypes_Integer8() ||
			childFeature == XDDPackage.eINSTANCE.getTDataTypes_Integer16() ||
			childFeature == XDDPackage.eINSTANCE.getTDataTypes_Integer32() ||
			childFeature == XDDPackage.eINSTANCE.getTDataTypes_Integer24() ||
			childFeature == XDDPackage.eINSTANCE.getTDataTypes_Integer40() ||
			childFeature == XDDPackage.eINSTANCE.getTDataTypes_Integer48() ||
			childFeature == XDDPackage.eINSTANCE.getTDataTypes_Integer56() ||
			childFeature == XDDPackage.eINSTANCE.getTDataTypes_Integer64() ||
			childFeature == XDDPackage.eINSTANCE.getTDataTypes_Unsigned8() ||
			childFeature == XDDPackage.eINSTANCE.getTDataTypes_Unsigned16() ||
			childFeature == XDDPackage.eINSTANCE.getTDataTypes_Unsigned32() ||
			childFeature == XDDPackage.eINSTANCE.getTDataTypes_Unsigned24() ||
			childFeature == XDDPackage.eINSTANCE.getTDataTypes_Unsigned40() ||
			childFeature == XDDPackage.eINSTANCE.getTDataTypes_Unsigned48() ||
			childFeature == XDDPackage.eINSTANCE.getTDataTypes_Unsigned56() ||
			childFeature == XDDPackage.eINSTANCE.getTDataTypes_Unsigned64() ||
			childFeature == XDDPackage.eINSTANCE.getTDataTypes_Real32() ||
			childFeature == XDDPackage.eINSTANCE.getTDataTypes_Real64() ||
			childFeature == XDDPackage.eINSTANCE.getTDataTypes_VisibleString() ||
			childFeature == XDDPackage.eINSTANCE.getTDataTypes_OctetString() ||
			childFeature == XDDPackage.eINSTANCE.getTDataTypes_UnicodeString() ||
			childFeature == XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay() ||
			childFeature == XDDPackage.eINSTANCE.getTDataTypes_TimeDiff() ||
			childFeature == XDDPackage.eINSTANCE.getTDataTypes_Domain() ||
			childFeature == XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS() ||
			childFeature == XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS() ||
			childFeature == XDDPackage.eINSTANCE.getTDataTypes_NETTIME();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
