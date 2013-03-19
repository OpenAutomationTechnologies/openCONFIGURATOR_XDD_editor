/**
 */
package com.br_automation.buoat.xddeditor.XDD.provider;

import com.br_automation.buoat.xddeditor.XDD.AccessType1;
import com.br_automation.buoat.xddeditor.XDD.TCount;
import com.br_automation.buoat.xddeditor.XDD.XDDFactory;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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

/**
 * This is the item provider adapter for a
 * {@link com.br_automation.buoat.xddeditor.XDD.TCount} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class TCountItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
    IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
    IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TCountItemProvider(AdapterFactory adapterFactory) {
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

            addAccessPropertyDescriptor(object);
            addUniqueIDPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Access feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addAccessPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_TCount_access_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_TCount_access_feature",
                "_UI_TCount_type"), XDDPackage.eINSTANCE.getTCount_Access(), true, false, false,
            ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Unique ID feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addUniqueIDPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_TCount_uniqueID_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_TCount_uniqueID_feature",
                "_UI_TCount_type"), XDDPackage.eINSTANCE.getTCount_UniqueID(), true, false, false,
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
            childrenFeatures.add(XDDPackage.eINSTANCE.getTCount_Group());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTCount_DefaultValue());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTCount_AllowedValues());
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
     * This returns TCount.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/TCount"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getText(Object object) {
        AccessType1 labelValue = ((TCount) object).getAccess();
        String label = labelValue == null ? null : labelValue.toString();
        return label == null || label.length() == 0 ? getString("_UI_TCount_type")
            : getString("_UI_TCount_type") + " " + label;
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

        switch (notification.getFeatureID(TCount.class)) {
            case XDDPackage.TCOUNT__ACCESS:
            case XDDPackage.TCOUNT__UNIQUE_ID:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(),
                    false, true));
                return;
            case XDDPackage.TCOUNT__GROUP:
            case XDDPackage.TCOUNT__DEFAULT_VALUE:
            case XDDPackage.TCOUNT__ALLOWED_VALUES:
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
            XDDPackage.eINSTANCE.getTCount_Group(),
            FeatureMapUtil.createEntry(
                XDDPackage.eINSTANCE.getTCount_Label(), XDDFactory.eINSTANCE.createLabelType())));

        newChildDescriptors.add(createChildParameter(
            XDDPackage.eINSTANCE.getTCount_Group(), FeatureMapUtil.createEntry(
                XDDPackage.eINSTANCE.getTCount_Description(),
                XDDFactory.eINSTANCE.createDescriptionType())));

        newChildDescriptors.add(createChildParameter(
            XDDPackage.eINSTANCE.getTCount_Group(), FeatureMapUtil.createEntry(
                XDDPackage.eINSTANCE.getTCount_LabelRef(),
                XDDFactory.eINSTANCE.createLabelRefType())));

        newChildDescriptors.add(createChildParameter(
            XDDPackage.eINSTANCE.getTCount_Group(), FeatureMapUtil.createEntry(
                XDDPackage.eINSTANCE.getTCount_DescriptionRef(),
                XDDFactory.eINSTANCE.createDescriptionRefType())));

        newChildDescriptors.add(createChildParameter(
            XDDPackage.eINSTANCE.getTCount_DefaultValue(), XDDFactory.eINSTANCE.createTValue()));

        newChildDescriptors.add(createChildParameter(
            XDDPackage.eINSTANCE.getTCount_AllowedValues(),
            XDDFactory.eINSTANCE.createTAllowedValues()));
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
