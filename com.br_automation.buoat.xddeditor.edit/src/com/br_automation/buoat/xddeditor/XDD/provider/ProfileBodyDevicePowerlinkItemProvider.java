/**
 */
package com.br_automation.buoat.xddeditor.XDD.provider;

import com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink;
import com.br_automation.buoat.xddeditor.XDD.XDDFactory;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ProfileBodyDevicePowerlinkItemProvider extends ProfileBodyDataTypeItemProvider
    implements IEditingDomainItemProvider, IStructuredItemContentProvider,
    ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ProfileBodyDevicePowerlinkItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addDeviceClassPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Device Class feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addDeviceClassPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_ProfileBodyDevicePowerlink_deviceClass_feature"),
            getString(
                "_UI_PropertyDescriptor_description",
                "_UI_ProfileBodyDevicePowerlink_deviceClass_feature",
                "_UI_ProfileBodyDevicePowerlink_type"), XDDPackage.eINSTANCE
                .getProfileBodyDevicePowerlink_DeviceClass(), true, false, false,
            ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to
     * deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand},
     * {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in
     * {@link #createCommand}. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(XDDPackage.eINSTANCE
                .getProfileBodyDevicePowerlink_DeviceIdentity());
            childrenFeatures
                .add(XDDPackage.eINSTANCE.getProfileBodyDevicePowerlink_DeviceManager());
            childrenFeatures.add(XDDPackage.eINSTANCE
                .getProfileBodyDevicePowerlink_DeviceFunction());
            childrenFeatures.add(XDDPackage.eINSTANCE
                .getProfileBodyDevicePowerlink_ApplicationProcess());
            childrenFeatures.add(XDDPackage.eINSTANCE
                .getProfileBodyDevicePowerlink_ExternalProfileHandle());
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns ProfileBodyDevicePowerlink.gif. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(
            object, getResourceLocator().getImage("full/obj16/ProfileBodyDevicePowerlink"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((ProfileBodyDevicePowerlink) object).getFileName();
        return label == null || label.length() == 0 ? getString("_UI_ProfileBodyDevicePowerlink_type")
            : getString("_UI_ProfileBodyDevicePowerlink_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to
     * update any cached children and by creating a viewer notification, which
     * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(ProfileBodyDevicePowerlink.class)) {
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_CLASS:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(),
                    false, true));
                return;
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_IDENTITY:
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_MANAGER:
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_FUNCTION:
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__APPLICATION_PROCESS:
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__EXTERNAL_PROFILE_HANDLE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(),
                    true, false));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
     * describing the children that can be created under this object. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected void
        collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add(createChildParameter(
            XDDPackage.eINSTANCE.getProfileBodyDevicePowerlink_DeviceIdentity(),
            XDDFactory.eINSTANCE.createTDeviceIdentity()));

        newChildDescriptors.add(createChildParameter(
            XDDPackage.eINSTANCE.getProfileBodyDevicePowerlink_DeviceManager(),
            XDDFactory.eINSTANCE.createTDeviceManager()));

        newChildDescriptors.add(createChildParameter(
            XDDPackage.eINSTANCE.getProfileBodyDevicePowerlink_DeviceFunction(),
            XDDFactory.eINSTANCE.createTDeviceFunction()));

        newChildDescriptors.add(createChildParameter(
            XDDPackage.eINSTANCE.getProfileBodyDevicePowerlink_ApplicationProcess(),
            XDDFactory.eINSTANCE.createTApplicationProcess()));

        newChildDescriptors.add(createChildParameter(
            XDDPackage.eINSTANCE.getProfileBodyDevicePowerlink_ExternalProfileHandle(),
            XDDFactory.eINSTANCE.createProfileHandleDataType()));
    }

}
