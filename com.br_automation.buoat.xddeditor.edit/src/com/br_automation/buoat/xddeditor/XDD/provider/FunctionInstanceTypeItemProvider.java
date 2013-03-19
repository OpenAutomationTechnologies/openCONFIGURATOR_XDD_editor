/**
 */
package com.br_automation.buoat.xddeditor.XDD.provider;

import com.br_automation.buoat.xddeditor.XDD.FunctionInstanceType;
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
 * {@link com.br_automation.buoat.xddeditor.XDD.FunctionInstanceType} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class FunctionInstanceTypeItemProvider extends ItemProviderAdapter implements
    IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
    IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public FunctionInstanceTypeItemProvider(AdapterFactory adapterFactory) {
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

            addNamePropertyDescriptor(object);
            addTypeIDRefPropertyDescriptor(object);
            addUniqueIDPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Name feature. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_FunctionInstanceType_name_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_FunctionInstanceType_name_feature",
                "_UI_FunctionInstanceType_type"), XDDPackage.eINSTANCE
                .getFunctionInstanceType_Name(), true, false, false,
            ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Type ID Ref feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addTypeIDRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_FunctionInstanceType_typeIDRef_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_FunctionInstanceType_typeIDRef_feature",
                "_UI_FunctionInstanceType_type"), XDDPackage.eINSTANCE
                .getFunctionInstanceType_TypeIDRef(), true, false, false,
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
            getString("_UI_FunctionInstanceType_uniqueID_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_FunctionInstanceType_uniqueID_feature",
                "_UI_FunctionInstanceType_type"), XDDPackage.eINSTANCE
                .getFunctionInstanceType_UniqueID(), true, false, false,
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
            childrenFeatures.add(XDDPackage.eINSTANCE.getFunctionInstanceType_Group());
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
     * This returns FunctionInstanceType.gif. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator()
            .getImage("full/obj16/FunctionInstanceType"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((FunctionInstanceType) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_FunctionInstanceType_type")
            : getString("_UI_FunctionInstanceType_type") + " " + label;
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

        switch (notification.getFeatureID(FunctionInstanceType.class)) {
            case XDDPackage.FUNCTION_INSTANCE_TYPE__NAME:
            case XDDPackage.FUNCTION_INSTANCE_TYPE__TYPE_ID_REF:
            case XDDPackage.FUNCTION_INSTANCE_TYPE__UNIQUE_ID:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(),
                    false, true));
                return;
            case XDDPackage.FUNCTION_INSTANCE_TYPE__GROUP:
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

        newChildDescriptors.add(createChildParameter(XDDPackage.eINSTANCE
            .getFunctionInstanceType_Group(), FeatureMapUtil.createEntry(
            XDDPackage.eINSTANCE.getFunctionInstanceType_Label(),
            XDDFactory.eINSTANCE.createLabelType())));

        newChildDescriptors.add(createChildParameter(XDDPackage.eINSTANCE
            .getFunctionInstanceType_Group(), FeatureMapUtil.createEntry(
            XDDPackage.eINSTANCE.getFunctionInstanceType_Description(),
            XDDFactory.eINSTANCE.createDescriptionType())));

        newChildDescriptors.add(createChildParameter(XDDPackage.eINSTANCE
            .getFunctionInstanceType_Group(), FeatureMapUtil.createEntry(
            XDDPackage.eINSTANCE.getFunctionInstanceType_LabelRef(),
            XDDFactory.eINSTANCE.createLabelRefType())));

        newChildDescriptors.add(createChildParameter(
            XDDPackage.eINSTANCE.getFunctionInstanceType_Group(),
            FeatureMapUtil.createEntry(
                XDDPackage.eINSTANCE.getFunctionInstanceType_DescriptionRef(),
                XDDFactory.eINSTANCE.createDescriptionRefType())));
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
