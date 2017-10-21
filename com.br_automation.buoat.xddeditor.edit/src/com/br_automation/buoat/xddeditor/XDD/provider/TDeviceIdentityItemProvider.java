/**
 */
package com.br_automation.buoat.xddeditor.XDD.provider;


import java.util.Collection;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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

import com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity;
import com.br_automation.buoat.xddeditor.XDD.XDDFactory;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * This is the item provider adapter for a {@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TDeviceIdentityItemProvider 
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
	public TDeviceIdentityItemProvider(AdapterFactory adapterFactory) {
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

			addBuildDatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Build Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBuildDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TDeviceIdentity_buildDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TDeviceIdentity_buildDate_feature", "_UI_TDeviceIdentity_type"),
				 XDDPackage.eINSTANCE.getTDeviceIdentity_BuildDate(),
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
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDeviceIdentity_VendorName());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDeviceIdentity_VendorID());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDeviceIdentity_VendorText());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDeviceIdentity_DeviceFamily());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDeviceIdentity_ProductFamily());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDeviceIdentity_ProductName());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDeviceIdentity_ProductID());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDeviceIdentity_ProductText());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDeviceIdentity_OrderNumber());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDeviceIdentity_Version());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDeviceIdentity_SpecificationRevision());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDeviceIdentity_InstanceName());
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
	 * This returns TDeviceIdentity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TDeviceIdentity"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		XMLGregorianCalendar labelValue = ((TDeviceIdentity)object).getBuildDate();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_TDeviceIdentity_type") :
			getString("_UI_TDeviceIdentity_type") + " " + label;
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

		switch (notification.getFeatureID(TDeviceIdentity.class)) {
			case XDDPackage.TDEVICE_IDENTITY__BUILD_DATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case XDDPackage.TDEVICE_IDENTITY__VENDOR_NAME:
			case XDDPackage.TDEVICE_IDENTITY__VENDOR_ID:
			case XDDPackage.TDEVICE_IDENTITY__VENDOR_TEXT:
			case XDDPackage.TDEVICE_IDENTITY__DEVICE_FAMILY:
			case XDDPackage.TDEVICE_IDENTITY__PRODUCT_FAMILY:
			case XDDPackage.TDEVICE_IDENTITY__PRODUCT_NAME:
			case XDDPackage.TDEVICE_IDENTITY__PRODUCT_ID:
			case XDDPackage.TDEVICE_IDENTITY__PRODUCT_TEXT:
			case XDDPackage.TDEVICE_IDENTITY__ORDER_NUMBER:
			case XDDPackage.TDEVICE_IDENTITY__VERSION:
			case XDDPackage.TDEVICE_IDENTITY__SPECIFICATION_REVISION:
			case XDDPackage.TDEVICE_IDENTITY__INSTANCE_NAME:
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
				(XDDPackage.eINSTANCE.getTDeviceIdentity_VendorName(),
				 XDDFactory.eINSTANCE.createVendorNameType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDeviceIdentity_VendorID(),
				 XDDFactory.eINSTANCE.createTVendorID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDeviceIdentity_VendorText(),
				 XDDFactory.eINSTANCE.createVendorTextType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDeviceIdentity_DeviceFamily(),
				 XDDFactory.eINSTANCE.createTDeviceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDeviceIdentity_ProductFamily(),
				 XDDFactory.eINSTANCE.createProductFamilyType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDeviceIdentity_ProductName(),
				 XDDFactory.eINSTANCE.createProductNameType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDeviceIdentity_ProductID(),
				 XDDFactory.eINSTANCE.createTProductID()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDeviceIdentity_ProductText(),
				 XDDFactory.eINSTANCE.createProductTextType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDeviceIdentity_OrderNumber(),
				 XDDFactory.eINSTANCE.createOrderNumberType()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDeviceIdentity_Version(),
				 XDDFactory.eINSTANCE.createTVersion()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDeviceIdentity_SpecificationRevision(),
				 XDDFactory.eINSTANCE.createTSpecificationRevision()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDeviceIdentity_InstanceName(),
				 XDDFactory.eINSTANCE.createInstanceNameType()));
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
