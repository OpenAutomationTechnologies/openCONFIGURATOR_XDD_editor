/**
 */
package com.br_automation.buoat.xddeditor.XDD.provider;


import java.math.BigInteger;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

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

import com.br_automation.buoat.xddeditor.XDD.TParameterGroup;
import com.br_automation.buoat.xddeditor.XDD.XDDFactory;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * This is the item provider adapter for a {@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TParameterGroupItemProvider 
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
	public TParameterGroupItemProvider(AdapterFactory adapterFactory) {
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

			addBitOffsetPropertyDescriptor(object);
			addConditionalUniqueIDRefPropertyDescriptor(object);
			addConditionalValuePropertyDescriptor(object);
			addConfigParameterPropertyDescriptor(object);
			addGroupLevelVisiblePropertyDescriptor(object);
			addKindOfAccessPropertyDescriptor(object);
			addUniqueIDPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Bit Offset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBitOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TParameterGroup_bitOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TParameterGroup_bitOffset_feature", "_UI_TParameterGroup_type"),
				 XDDPackage.eINSTANCE.getTParameterGroup_BitOffset(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Conditional Unique ID Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConditionalUniqueIDRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TParameterGroup_conditionalUniqueIDRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TParameterGroup_conditionalUniqueIDRef_feature", "_UI_TParameterGroup_type"),
				 XDDPackage.eINSTANCE.getTParameterGroup_ConditionalUniqueIDRef(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Conditional Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConditionalValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TParameterGroup_conditionalValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TParameterGroup_conditionalValue_feature", "_UI_TParameterGroup_type"),
				 XDDPackage.eINSTANCE.getTParameterGroup_ConditionalValue(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Config Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConfigParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TParameterGroup_configParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TParameterGroup_configParameter_feature", "_UI_TParameterGroup_type"),
				 XDDPackage.eINSTANCE.getTParameterGroup_ConfigParameter(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Group Level Visible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroupLevelVisiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TParameterGroup_groupLevelVisible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TParameterGroup_groupLevelVisible_feature", "_UI_TParameterGroup_type"),
				 XDDPackage.eINSTANCE.getTParameterGroup_GroupLevelVisible(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Kind Of Access feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKindOfAccessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TParameterGroup_kindOfAccess_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TParameterGroup_kindOfAccess_feature", "_UI_TParameterGroup_type"),
				 XDDPackage.eINSTANCE.getTParameterGroup_KindOfAccess(),
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
				 getString("_UI_TParameterGroup_uniqueID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TParameterGroup_uniqueID_feature", "_UI_TParameterGroup_type"),
				 XDDPackage.eINSTANCE.getTParameterGroup_UniqueID(),
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
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterGroup_Group());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterGroup_Group1());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterGroup_ParameterGroup());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTParameterGroup_ParameterRef());
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
	 * This returns TParameterGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TParameterGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		BigInteger labelValue = ((TParameterGroup)object).getBitOffset();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_TParameterGroup_type") :
			getString("_UI_TParameterGroup_type") + " " + label;
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

		switch (notification.getFeatureID(TParameterGroup.class)) {
			case XDDPackage.TPARAMETER_GROUP__BIT_OFFSET:
			case XDDPackage.TPARAMETER_GROUP__CONDITIONAL_UNIQUE_ID_REF:
			case XDDPackage.TPARAMETER_GROUP__CONDITIONAL_VALUE:
			case XDDPackage.TPARAMETER_GROUP__CONFIG_PARAMETER:
			case XDDPackage.TPARAMETER_GROUP__GROUP_LEVEL_VISIBLE:
			case XDDPackage.TPARAMETER_GROUP__KIND_OF_ACCESS:
			case XDDPackage.TPARAMETER_GROUP__UNIQUE_ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case XDDPackage.TPARAMETER_GROUP__GROUP:
			case XDDPackage.TPARAMETER_GROUP__GROUP1:
			case XDDPackage.TPARAMETER_GROUP__PARAMETER_GROUP:
			case XDDPackage.TPARAMETER_GROUP__PARAMETER_REF:
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
				(XDDPackage.eINSTANCE.getTParameterGroup_Group(),
				 FeatureMapUtil.createEntry
					(XDDPackage.eINSTANCE.getTParameterGroup_Label(),
					 XDDFactory.eINSTANCE.createLabelType())));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterGroup_Group(),
				 FeatureMapUtil.createEntry
					(XDDPackage.eINSTANCE.getTParameterGroup_Description(),
					 XDDFactory.eINSTANCE.createDescriptionType())));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterGroup_Group(),
				 FeatureMapUtil.createEntry
					(XDDPackage.eINSTANCE.getTParameterGroup_LabelRef(),
					 XDDFactory.eINSTANCE.createLabelRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterGroup_Group(),
				 FeatureMapUtil.createEntry
					(XDDPackage.eINSTANCE.getTParameterGroup_DescriptionRef(),
					 XDDFactory.eINSTANCE.createDescriptionRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterGroup_Group1(),
				 FeatureMapUtil.createEntry
					(XDDPackage.eINSTANCE.getTParameterGroup_ParameterGroup(),
					 XDDFactory.eINSTANCE.createTParameterGroup())));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterGroup_Group1(),
				 FeatureMapUtil.createEntry
					(XDDPackage.eINSTANCE.getTParameterGroup_ParameterRef(),
					 XDDFactory.eINSTANCE.createParameterRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterGroup_ParameterGroup(),
				 XDDFactory.eINSTANCE.createTParameterGroup()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTParameterGroup_ParameterRef(),
				 XDDFactory.eINSTANCE.createParameterRefType()));
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
			childFeature == XDDPackage.eINSTANCE.getTParameterGroup_ParameterGroup() ||
			childFeature == XDDPackage.eINSTANCE.getTParameterGroup_ParameterRef();

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
