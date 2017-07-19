/**
 */
package com.br_automation.buoat.xddeditor.XDD.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

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

import com.br_automation.buoat.xddeditor.XDD.EnumType;
import com.br_automation.buoat.xddeditor.XDD.XDDFactory;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * This is the item provider adapter for a {@link com.br_automation.buoat.xddeditor.XDD.EnumType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumTypeItemProvider 
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
	public EnumTypeItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addSizePropertyDescriptor(object);
			addUniqueIDPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EnumType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EnumType_name_feature", "_UI_EnumType_type"),
				 XDDPackage.eINSTANCE.getEnumType_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EnumType_size_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EnumType_size_feature", "_UI_EnumType_type"),
				 XDDPackage.eINSTANCE.getEnumType_Size(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unique ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUniqueIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EnumType_uniqueID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EnumType_uniqueID_feature", "_UI_EnumType_type"),
				 XDDPackage.eINSTANCE.getEnumType_UniqueID(),
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
			childrenFeatures.add(XDDPackage.eINSTANCE.getEnumType_Group());
			childrenFeatures.add(XDDPackage.eINSTANCE.getEnumType_EnumValue());
			childrenFeatures.add(XDDPackage.eINSTANCE.getEnumType_BOOL());
			childrenFeatures.add(XDDPackage.eINSTANCE.getEnumType_BITSTRING());
			childrenFeatures.add(XDDPackage.eINSTANCE.getEnumType_BYTE());
			childrenFeatures.add(XDDPackage.eINSTANCE.getEnumType_CHAR());
			childrenFeatures.add(XDDPackage.eINSTANCE.getEnumType_WORD());
			childrenFeatures.add(XDDPackage.eINSTANCE.getEnumType_DWORD());
			childrenFeatures.add(XDDPackage.eINSTANCE.getEnumType_LWORD());
			childrenFeatures.add(XDDPackage.eINSTANCE.getEnumType_SINT());
			childrenFeatures.add(XDDPackage.eINSTANCE.getEnumType_INT());
			childrenFeatures.add(XDDPackage.eINSTANCE.getEnumType_DINT());
			childrenFeatures.add(XDDPackage.eINSTANCE.getEnumType_LINT());
			childrenFeatures.add(XDDPackage.eINSTANCE.getEnumType_USINT());
			childrenFeatures.add(XDDPackage.eINSTANCE.getEnumType_UINT());
			childrenFeatures.add(XDDPackage.eINSTANCE.getEnumType_UDINT());
			childrenFeatures.add(XDDPackage.eINSTANCE.getEnumType_ULINT());
			childrenFeatures.add(XDDPackage.eINSTANCE.getEnumType_REAL());
			childrenFeatures.add(XDDPackage.eINSTANCE.getEnumType_LREAL());
			childrenFeatures.add(XDDPackage.eINSTANCE.getEnumType_STRING());
			childrenFeatures.add(XDDPackage.eINSTANCE.getEnumType_WSTRING());
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
	 * This returns EnumType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EnumType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EnumType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EnumType_type") :
			getString("_UI_EnumType_type") + " " + label;
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

		switch (notification.getFeatureID(EnumType.class)) {
			case XDDPackage.ENUM_TYPE__NAME:
			case XDDPackage.ENUM_TYPE__SIZE:
			case XDDPackage.ENUM_TYPE__UNIQUE_ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case XDDPackage.ENUM_TYPE__GROUP:
			case XDDPackage.ENUM_TYPE__ENUM_VALUE:
			case XDDPackage.ENUM_TYPE__BOOL:
			case XDDPackage.ENUM_TYPE__BITSTRING:
			case XDDPackage.ENUM_TYPE__BYTE:
			case XDDPackage.ENUM_TYPE__CHAR:
			case XDDPackage.ENUM_TYPE__WORD:
			case XDDPackage.ENUM_TYPE__DWORD:
			case XDDPackage.ENUM_TYPE__LWORD:
			case XDDPackage.ENUM_TYPE__SINT:
			case XDDPackage.ENUM_TYPE__INT:
			case XDDPackage.ENUM_TYPE__DINT:
			case XDDPackage.ENUM_TYPE__LINT:
			case XDDPackage.ENUM_TYPE__USINT:
			case XDDPackage.ENUM_TYPE__UINT:
			case XDDPackage.ENUM_TYPE__UDINT:
			case XDDPackage.ENUM_TYPE__ULINT:
			case XDDPackage.ENUM_TYPE__REAL:
			case XDDPackage.ENUM_TYPE__LREAL:
			case XDDPackage.ENUM_TYPE__STRING:
			case XDDPackage.ENUM_TYPE__WSTRING:
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
				(XDDPackage.eINSTANCE.getEnumType_Group(),
				 FeatureMapUtil.createEntry
					(XDDPackage.eINSTANCE.getEnumType_Label(),
					 XDDFactory.eINSTANCE.createLabelType())));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_Group(),
				 FeatureMapUtil.createEntry
					(XDDPackage.eINSTANCE.getEnumType_Description(),
					 XDDFactory.eINSTANCE.createDescriptionType())));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_Group(),
				 FeatureMapUtil.createEntry
					(XDDPackage.eINSTANCE.getEnumType_LabelRef(),
					 XDDFactory.eINSTANCE.createLabelRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_Group(),
				 FeatureMapUtil.createEntry
					(XDDPackage.eINSTANCE.getEnumType_DescriptionRef(),
					 XDDFactory.eINSTANCE.createDescriptionRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_EnumValue(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BOOL(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BITSTRING(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_BYTE(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_CHAR(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WORD(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DWORD(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LWORD(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_SINT(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_INT(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_DINT(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LINT(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_USINT(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UINT(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_UDINT(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_ULINT(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_REAL(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_LREAL(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_STRING(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getEnumType_WSTRING(),
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

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify =
			childFeature == XDDPackage.eINSTANCE.getEnumType_EnumValue() ||
			childFeature == XDDPackage.eINSTANCE.getEnumType_BOOL() ||
			childFeature == XDDPackage.eINSTANCE.getEnumType_BITSTRING() ||
			childFeature == XDDPackage.eINSTANCE.getEnumType_BYTE() ||
			childFeature == XDDPackage.eINSTANCE.getEnumType_CHAR() ||
			childFeature == XDDPackage.eINSTANCE.getEnumType_WORD() ||
			childFeature == XDDPackage.eINSTANCE.getEnumType_DWORD() ||
			childFeature == XDDPackage.eINSTANCE.getEnumType_LWORD() ||
			childFeature == XDDPackage.eINSTANCE.getEnumType_SINT() ||
			childFeature == XDDPackage.eINSTANCE.getEnumType_INT() ||
			childFeature == XDDPackage.eINSTANCE.getEnumType_DINT() ||
			childFeature == XDDPackage.eINSTANCE.getEnumType_LINT() ||
			childFeature == XDDPackage.eINSTANCE.getEnumType_USINT() ||
			childFeature == XDDPackage.eINSTANCE.getEnumType_UINT() ||
			childFeature == XDDPackage.eINSTANCE.getEnumType_UDINT() ||
			childFeature == XDDPackage.eINSTANCE.getEnumType_ULINT() ||
			childFeature == XDDPackage.eINSTANCE.getEnumType_REAL() ||
			childFeature == XDDPackage.eINSTANCE.getEnumType_LREAL() ||
			childFeature == XDDPackage.eINSTANCE.getEnumType_STRING() ||
			childFeature == XDDPackage.eINSTANCE.getEnumType_WSTRING();

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
