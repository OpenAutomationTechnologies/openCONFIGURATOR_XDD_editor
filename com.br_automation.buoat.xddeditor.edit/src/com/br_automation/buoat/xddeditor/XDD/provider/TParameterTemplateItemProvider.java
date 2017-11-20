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

import com.br_automation.buoat.xddeditor.XDD.AccessType;
import com.br_automation.buoat.xddeditor.XDD.TParameterTemplate;
import com.br_automation.buoat.xddeditor.XDD.XDDFactory;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * This is the item provider adapter for a {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TParameterTemplateItemProvider 
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
	public TParameterTemplateItemProvider(AdapterFactory adapterFactory) {
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

			addAccessPropertyDescriptor(object);
			addAccessListPropertyDescriptor(object);
			addMultiplierPropertyDescriptor(object);
			addOffsetPropertyDescriptor(object);
			addPersistentPropertyDescriptor(object);
			addSupportPropertyDescriptor(object);
			addTemplateIDRefPropertyDescriptor(object);
			addUniqueIDPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Access feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TParameterTemplate_access_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TParameterTemplate_access_feature", "_UI_TParameterTemplate_type"),
				 XDDPackage.eINSTANCE.getTParameterTemplate_Access(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Access List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccessListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TParameterTemplate_accessList_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TParameterTemplate_accessList_feature", "_UI_TParameterTemplate_type"),
				 XDDPackage.eINSTANCE.getTParameterTemplate_AccessList(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Multiplier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultiplierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TParameterTemplate_multiplier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TParameterTemplate_multiplier_feature", "_UI_TParameterTemplate_type"),
				 XDDPackage.eINSTANCE.getTParameterTemplate_Multiplier(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Offset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TParameterTemplate_offset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TParameterTemplate_offset_feature", "_UI_TParameterTemplate_type"),
				 XDDPackage.eINSTANCE.getTParameterTemplate_Offset(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Persistent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPersistentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TParameterTemplate_persistent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TParameterTemplate_persistent_feature", "_UI_TParameterTemplate_type"),
				 XDDPackage.eINSTANCE.getTParameterTemplate_Persistent(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Support feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TParameterTemplate_support_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TParameterTemplate_support_feature", "_UI_TParameterTemplate_type"),
				 XDDPackage.eINSTANCE.getTParameterTemplate_Support(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Template ID Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTemplateIDRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TParameterTemplate_templateIDRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TParameterTemplate_templateIDRef_feature", "_UI_TParameterTemplate_type"),
				 XDDPackage.eINSTANCE.getTParameterTemplate_TemplateIDRef(),
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
				 getString("_UI_TParameterTemplate_uniqueID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TParameterTemplate_uniqueID_feature", "_UI_TParameterTemplate_type"),
				 XDDPackage.eINSTANCE.getTParameterTemplate_UniqueID(),
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
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterTemplate_Group());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterTemplate_WORD());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterTemplate_SINT());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterTemplate_INT());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterTemplate_DINT());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterTemplate_LINT());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterTemplate_USINT());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterTemplate_UINT());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterTemplate_REAL());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterTemplate_STRING());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterTemplate_DataTypeIDRef());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterTemplate_ConditionalSupport());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterTemplate_ActualValue());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterTemplate_DefaultValue());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterTemplate_SubstituteValue());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterTemplate_AllowedValues());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterTemplate_Unit());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterTemplate_Property());
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
	 * This returns TParameterTemplate.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TParameterTemplate"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		AccessType labelValue = ((TParameterTemplate)object).getAccess();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_TParameterTemplate_type") :
			getString("_UI_TParameterTemplate_type") + " " + label;
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

		switch (notification.getFeatureID(TParameterTemplate.class)) {
			case XDDPackage.TPARAMETER_TEMPLATE__ACCESS:
			case XDDPackage.TPARAMETER_TEMPLATE__ACCESS_LIST:
			case XDDPackage.TPARAMETER_TEMPLATE__MULTIPLIER:
			case XDDPackage.TPARAMETER_TEMPLATE__OFFSET:
			case XDDPackage.TPARAMETER_TEMPLATE__PERSISTENT:
			case XDDPackage.TPARAMETER_TEMPLATE__SUPPORT:
			case XDDPackage.TPARAMETER_TEMPLATE__TEMPLATE_ID_REF:
			case XDDPackage.TPARAMETER_TEMPLATE__UNIQUE_ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case XDDPackage.TPARAMETER_TEMPLATE__GROUP:
			case XDDPackage.TPARAMETER_TEMPLATE__BOOL:
			case XDDPackage.TPARAMETER_TEMPLATE__BITSTRING:
			case XDDPackage.TPARAMETER_TEMPLATE__BYTE:
			case XDDPackage.TPARAMETER_TEMPLATE__CHAR:
			case XDDPackage.TPARAMETER_TEMPLATE__WORD:
			case XDDPackage.TPARAMETER_TEMPLATE__DWORD:
			case XDDPackage.TPARAMETER_TEMPLATE__LWORD:
			case XDDPackage.TPARAMETER_TEMPLATE__SINT:
			case XDDPackage.TPARAMETER_TEMPLATE__INT:
			case XDDPackage.TPARAMETER_TEMPLATE__DINT:
			case XDDPackage.TPARAMETER_TEMPLATE__LINT:
			case XDDPackage.TPARAMETER_TEMPLATE__USINT:
			case XDDPackage.TPARAMETER_TEMPLATE__UINT:
			case XDDPackage.TPARAMETER_TEMPLATE__UDINT:
			case XDDPackage.TPARAMETER_TEMPLATE__ULINT:
			case XDDPackage.TPARAMETER_TEMPLATE__REAL:
			case XDDPackage.TPARAMETER_TEMPLATE__LREAL:
			case XDDPackage.TPARAMETER_TEMPLATE__STRING:
			case XDDPackage.TPARAMETER_TEMPLATE__WSTRING:
			case XDDPackage.TPARAMETER_TEMPLATE__DATA_TYPE_ID_REF:
			case XDDPackage.TPARAMETER_TEMPLATE__CONDITIONAL_SUPPORT:
			case XDDPackage.TPARAMETER_TEMPLATE__ACTUAL_VALUE:
			case XDDPackage.TPARAMETER_TEMPLATE__DEFAULT_VALUE:
			case XDDPackage.TPARAMETER_TEMPLATE__SUBSTITUTE_VALUE:
			case XDDPackage.TPARAMETER_TEMPLATE__ALLOWED_VALUES:
			case XDDPackage.TPARAMETER_TEMPLATE__UNIT:
			case XDDPackage.TPARAMETER_TEMPLATE__PROPERTY:
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
				(XDDPackage.eINSTANCE.getTParameterTemplate_Group(),
				 FeatureMapUtil.createEntry
					(XDDPackage.eINSTANCE.getTParameterTemplate_Label(),
					 XDDFactory.eINSTANCE.createLabelType())));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_Group(),
				 FeatureMapUtil.createEntry
					(XDDPackage.eINSTANCE.getTParameterTemplate_Description(),
					 XDDFactory.eINSTANCE.createDescriptionType())));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_Group(),
				 FeatureMapUtil.createEntry
					(XDDPackage.eINSTANCE.getTParameterTemplate_LabelRef(),
					 XDDFactory.eINSTANCE.createLabelRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_Group(),
				 FeatureMapUtil.createEntry
					(XDDPackage.eINSTANCE.getTParameterTemplate_DescriptionRef(),
					 XDDFactory.eINSTANCE.createDescriptionRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BOOL(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_BYTE(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_CHAR(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WORD(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DWORD(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LWORD(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SINT(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_INT(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DINT(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LINT(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_USINT(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UINT(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_UDINT(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ULINT(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_REAL(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_LREAL(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_STRING(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createErrorBitDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createErrorConstantDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createProfileBodyCommunicationNetworkPowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createProfileBodyDevicePowerlink()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createProfileHandleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createProfileHeaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTAllowedValuesTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTApplicationLayers()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTClassificationList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTCNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTCombinedState()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTCount()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTDataTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTDenotation()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTDeviceCommissioning()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTDeviceIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTDiagnostic()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTDynamicChannel()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTFunctionInstanceList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTFunctionTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTGeneralFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTIndicatorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTLED()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTMNFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTNetworkManagement()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTObject()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTParameterGroupList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTParameterTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTProperty()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTRange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTSubrange()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTTemplateList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTVarDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DataTypeIDRef(),
				 XDDFactory.eINSTANCE.createTDataTypeIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ConditionalSupport(),
				 XDDFactory.eINSTANCE.createTConditionalSupport()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_ActualValue(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_DefaultValue(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_SubstituteValue(),
				 XDDFactory.eINSTANCE.createTValue()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_AllowedValues(),
				 XDDFactory.eINSTANCE.createTAllowedValues()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_Unit(),
				 XDDFactory.eINSTANCE.createTUnit()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterTemplate_Property(),
				 XDDFactory.eINSTANCE.createTProperty()));
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
			childFeature == XDDPackage.eINSTANCE.getTParameterTemplate_BOOL() ||
			childFeature == XDDPackage.eINSTANCE.getTParameterTemplate_BITSTRING() ||
			childFeature == XDDPackage.eINSTANCE.getTParameterTemplate_BYTE() ||
			childFeature == XDDPackage.eINSTANCE.getTParameterTemplate_CHAR() ||
			childFeature == XDDPackage.eINSTANCE.getTParameterTemplate_WORD() ||
			childFeature == XDDPackage.eINSTANCE.getTParameterTemplate_DWORD() ||
			childFeature == XDDPackage.eINSTANCE.getTParameterTemplate_LWORD() ||
			childFeature == XDDPackage.eINSTANCE.getTParameterTemplate_SINT() ||
			childFeature == XDDPackage.eINSTANCE.getTParameterTemplate_INT() ||
			childFeature == XDDPackage.eINSTANCE.getTParameterTemplate_DINT() ||
			childFeature == XDDPackage.eINSTANCE.getTParameterTemplate_LINT() ||
			childFeature == XDDPackage.eINSTANCE.getTParameterTemplate_USINT() ||
			childFeature == XDDPackage.eINSTANCE.getTParameterTemplate_UINT() ||
			childFeature == XDDPackage.eINSTANCE.getTParameterTemplate_UDINT() ||
			childFeature == XDDPackage.eINSTANCE.getTParameterTemplate_ULINT() ||
			childFeature == XDDPackage.eINSTANCE.getTParameterTemplate_REAL() ||
			childFeature == XDDPackage.eINSTANCE.getTParameterTemplate_LREAL() ||
			childFeature == XDDPackage.eINSTANCE.getTParameterTemplate_STRING() ||
			childFeature == XDDPackage.eINSTANCE.getTParameterTemplate_WSTRING() ||
			childFeature == XDDPackage.eINSTANCE.getTParameterTemplate_AllowedValues() ||
			childFeature == XDDPackage.eINSTANCE.getTParameterTemplate_ConditionalSupport() ||
			childFeature == XDDPackage.eINSTANCE.getTParameterTemplate_DataTypeIDRef() ||
			childFeature == XDDPackage.eINSTANCE.getTParameterTemplate_Property() ||
			childFeature == XDDPackage.eINSTANCE.getTParameterTemplate_Unit() ||
			childFeature == XDDPackage.eINSTANCE.getTParameterTemplate_ActualValue() ||
			childFeature == XDDPackage.eINSTANCE.getTParameterTemplate_DefaultValue() ||
			childFeature == XDDPackage.eINSTANCE.getTParameterTemplate_SubstituteValue();

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
