/**
 */
package com.br_automation.buoat.xddeditor.XDD.provider;

import com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType;
import com.br_automation.buoat.xddeditor.XDD.XDDFactory;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import java.util.Collection;
import java.util.List;

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

/**
 * This is the item provider adapter for a
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ProfileHeaderDataTypeItemProvider extends ItemProviderAdapter implements
    IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
    IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ProfileHeaderDataTypeItemProvider(AdapterFactory adapterFactory) {
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

            addProfileIdentificationPropertyDescriptor(object);
            addProfileRevisionPropertyDescriptor(object);
            addProfileNamePropertyDescriptor(object);
            addProfileSourcePropertyDescriptor(object);
            addProfileClassIDPropertyDescriptor(object);
            addProfileDatePropertyDescriptor(object);
            addAdditionalInformationPropertyDescriptor(object);
            addIASInterfaceTypePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Profile Identification feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addProfileIdentificationPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_ProfileHeaderDataType_profileIdentification_feature"),
            getString(
                "_UI_PropertyDescriptor_description",
                "_UI_ProfileHeaderDataType_profileIdentification_feature",
                "_UI_ProfileHeaderDataType_type"), XDDPackage.eINSTANCE
                .getProfileHeaderDataType_ProfileIdentification(), true, false, false,
            ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Profile Revision feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addProfileRevisionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_ProfileHeaderDataType_profileRevision_feature"),
            getString(
                "_UI_PropertyDescriptor_description",
                "_UI_ProfileHeaderDataType_profileRevision_feature",
                "_UI_ProfileHeaderDataType_type"), XDDPackage.eINSTANCE
                .getProfileHeaderDataType_ProfileRevision(), true, false, false,
            ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Profile Name feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addProfileNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_ProfileHeaderDataType_profileName_feature"),
            getString(
                "_UI_PropertyDescriptor_description",
                "_UI_ProfileHeaderDataType_profileName_feature", "_UI_ProfileHeaderDataType_type"),
            XDDPackage.eINSTANCE.getProfileHeaderDataType_ProfileName(), true, false, false,
            ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Profile Source feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addProfileSourcePropertyDescriptor(Object object) {
        itemPropertyDescriptors
            .add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_ProfileHeaderDataType_profileSource_feature"),
                getString(
                    "_UI_PropertyDescriptor_description",
                    "_UI_ProfileHeaderDataType_profileSource_feature",
                    "_UI_ProfileHeaderDataType_type"), XDDPackage.eINSTANCE
                    .getProfileHeaderDataType_ProfileSource(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Profile Class ID feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addProfileClassIDPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_ProfileHeaderDataType_profileClassID_feature"),
            getString(
                "_UI_PropertyDescriptor_description",
                "_UI_ProfileHeaderDataType_profileClassID_feature",
                "_UI_ProfileHeaderDataType_type"), XDDPackage.eINSTANCE
                .getProfileHeaderDataType_ProfileClassID(), true, false, false,
            ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Profile Date feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addProfileDatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_ProfileHeaderDataType_profileDate_feature"),
            getString(
                "_UI_PropertyDescriptor_description",
                "_UI_ProfileHeaderDataType_profileDate_feature", "_UI_ProfileHeaderDataType_type"),
            XDDPackage.eINSTANCE.getProfileHeaderDataType_ProfileDate(), true, false, false,
            ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Additional Information feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addAdditionalInformationPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_ProfileHeaderDataType_additionalInformation_feature"),
            getString(
                "_UI_PropertyDescriptor_description",
                "_UI_ProfileHeaderDataType_additionalInformation_feature",
                "_UI_ProfileHeaderDataType_type"), XDDPackage.eINSTANCE
                .getProfileHeaderDataType_AdditionalInformation(), true, false, false,
            ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the IAS Interface Type feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addIASInterfaceTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_ProfileHeaderDataType_iASInterfaceType_feature"),
            getString(
                "_UI_PropertyDescriptor_description",
                "_UI_ProfileHeaderDataType_iASInterfaceType_feature",
                "_UI_ProfileHeaderDataType_type"), XDDPackage.eINSTANCE
                .getProfileHeaderDataType_IASInterfaceType(), true, false, false,
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
            childrenFeatures.add(XDDPackage.eINSTANCE.getProfileHeaderDataType_ISO15745Reference());
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
     * This returns ProfileHeaderDataType.gif. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(
            object, getResourceLocator().getImage("full/obj16/ProfileHeaderDataType"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public String getText(Object object) {
        String label = ((ProfileHeaderDataType) object).getProfileName();
        // j.l.: Modify label of element in UI.
        // BEGIN
        return label == null || label.length() == 0 ? getString("_UI_ProfileHeaderDataType_type")
            : getString("_UI_ProfileHeaderDataType_type");
        //END
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

        switch (notification.getFeatureID(ProfileHeaderDataType.class)) {
            case XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_IDENTIFICATION:
            case XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_REVISION:
            case XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_NAME:
            case XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_SOURCE:
            case XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_CLASS_ID:
            case XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_DATE:
            case XDDPackage.PROFILE_HEADER_DATA_TYPE__ADDITIONAL_INFORMATION:
            case XDDPackage.PROFILE_HEADER_DATA_TYPE__IAS_INTERFACE_TYPE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(),
                    false, true));
                return;
            case XDDPackage.PROFILE_HEADER_DATA_TYPE__ISO15745_REFERENCE:
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
            XDDPackage.eINSTANCE.getProfileHeaderDataType_ISO15745Reference(),
            XDDFactory.eINSTANCE.createISO15745ReferenceDataType()));
    }

    /**
     * Return the resource locator for this item provider's resources. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return XDDEditPlugin.INSTANCE;
    }

}
