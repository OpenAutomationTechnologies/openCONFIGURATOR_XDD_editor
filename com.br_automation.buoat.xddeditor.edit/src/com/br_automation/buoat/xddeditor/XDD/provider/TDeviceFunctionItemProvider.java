/**
 */
package com.br_automation.buoat.xddeditor.XDD.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.br_automation.buoat.xddeditor.XDD.TDeviceFunction;
import com.br_automation.buoat.xddeditor.XDD.XDDFactory;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * This is the item provider adapter for a {@link com.br_automation.buoat.xddeditor.XDD.TDeviceFunction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TDeviceFunctionItemProvider 
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
	public TDeviceFunctionItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDeviceFunction_Capabilities());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDeviceFunction_PicturesList());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDeviceFunction_DictionaryList());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDeviceFunction_ConnectorList());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDeviceFunction_FirmwareList());
			childrenFeatures.add(XDDPackage.eINSTANCE.getTDeviceFunction_ClassificationList());
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
	 * This returns TDeviceFunction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TDeviceFunction"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_TDeviceFunction_type");
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

		switch (notification.getFeatureID(TDeviceFunction.class)) {
			case XDDPackage.TDEVICE_FUNCTION__CAPABILITIES:
			case XDDPackage.TDEVICE_FUNCTION__PICTURES_LIST:
			case XDDPackage.TDEVICE_FUNCTION__DICTIONARY_LIST:
			case XDDPackage.TDEVICE_FUNCTION__CONNECTOR_LIST:
			case XDDPackage.TDEVICE_FUNCTION__FIRMWARE_LIST:
			case XDDPackage.TDEVICE_FUNCTION__CLASSIFICATION_LIST:
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
				(XDDPackage.eINSTANCE.getTDeviceFunction_Capabilities(),
				 XDDFactory.eINSTANCE.createTCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDeviceFunction_PicturesList(),
				 XDDFactory.eINSTANCE.createTPicturesList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDeviceFunction_DictionaryList(),
				 XDDFactory.eINSTANCE.createTDictionaryList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDeviceFunction_ConnectorList(),
				 XDDFactory.eINSTANCE.createTConnectorList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDeviceFunction_FirmwareList(),
				 XDDFactory.eINSTANCE.createTFirmwareList()));

		newChildDescriptors.add
			(createChildParameter
				(XDDPackage.eINSTANCE.getTDeviceFunction_ClassificationList(),
				 XDDFactory.eINSTANCE.createTClassificationList()));
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
