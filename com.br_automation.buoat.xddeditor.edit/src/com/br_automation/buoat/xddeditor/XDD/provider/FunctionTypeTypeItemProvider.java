/**
 */
package com.br_automation.buoat.xddeditor.XDD.provider;

import com.br_automation.buoat.xddeditor.XDD.FunctionTypeType;
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
 * {@link com.br_automation.buoat.xddeditor.XDD.FunctionTypeType} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class FunctionTypeTypeItemProvider extends ItemProviderAdapter implements
    IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
    IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public FunctionTypeTypeItemProvider(AdapterFactory adapterFactory) {
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
            addPackagePropertyDescriptor(object);
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
            getString("_UI_FunctionTypeType_name_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_FunctionTypeType_name_feature",
                "_UI_FunctionTypeType_type"), XDDPackage.eINSTANCE.getFunctionTypeType_Name(),
            true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Package feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addPackagePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_FunctionTypeType_package_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_FunctionTypeType_package_feature",
                "_UI_FunctionTypeType_type"), XDDPackage.eINSTANCE.getFunctionTypeType_Package(),
            true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
            getString("_UI_FunctionTypeType_uniqueID_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_FunctionTypeType_uniqueID_feature",
                "_UI_FunctionTypeType_type"), XDDPackage.eINSTANCE.getFunctionTypeType_UniqueID(),
            true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
            childrenFeatures.add(XDDPackage.eINSTANCE.getFunctionTypeType_Group());
            childrenFeatures.add(XDDPackage.eINSTANCE.getFunctionTypeType_VersionInfo());
            childrenFeatures.add(XDDPackage.eINSTANCE.getFunctionTypeType_InterfaceList());
            childrenFeatures.add(XDDPackage.eINSTANCE.getFunctionTypeType_FunctionInstanceList());
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
     * This returns FunctionTypeType.gif. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/FunctionTypeType"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((FunctionTypeType) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_FunctionTypeType_type")
            : getString("_UI_FunctionTypeType_type") + " " + label;
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

        switch (notification.getFeatureID(FunctionTypeType.class)) {
            case XDDPackage.FUNCTION_TYPE_TYPE__NAME:
            case XDDPackage.FUNCTION_TYPE_TYPE__PACKAGE:
            case XDDPackage.FUNCTION_TYPE_TYPE__UNIQUE_ID:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(),
                    false, true));
                return;
            case XDDPackage.FUNCTION_TYPE_TYPE__GROUP:
            case XDDPackage.FUNCTION_TYPE_TYPE__VERSION_INFO:
            case XDDPackage.FUNCTION_TYPE_TYPE__INTERFACE_LIST:
            case XDDPackage.FUNCTION_TYPE_TYPE__FUNCTION_INSTANCE_LIST:
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
            .getFunctionTypeType_Group(), FeatureMapUtil.createEntry(
            XDDPackage.eINSTANCE.getFunctionTypeType_Label(),
            XDDFactory.eINSTANCE.createLabelType())));

        newChildDescriptors.add(createChildParameter(XDDPackage.eINSTANCE
            .getFunctionTypeType_Group(), FeatureMapUtil.createEntry(
            XDDPackage.eINSTANCE.getFunctionTypeType_Description(),
            XDDFactory.eINSTANCE.createDescriptionType())));

        newChildDescriptors.add(createChildParameter(XDDPackage.eINSTANCE
            .getFunctionTypeType_Group(), FeatureMapUtil.createEntry(
            XDDPackage.eINSTANCE.getFunctionTypeType_LabelRef(),
            XDDFactory.eINSTANCE.createLabelRefType())));

        newChildDescriptors.add(createChildParameter(XDDPackage.eINSTANCE
            .getFunctionTypeType_Group(), FeatureMapUtil.createEntry(
            XDDPackage.eINSTANCE.getFunctionTypeType_DescriptionRef(),
            XDDFactory.eINSTANCE.createDescriptionRefType())));

        newChildDescriptors.add(createChildParameter(
            XDDPackage.eINSTANCE.getFunctionTypeType_VersionInfo(),
            XDDFactory.eINSTANCE.createVersionInfoType()));

        newChildDescriptors.add(createChildParameter(
            XDDPackage.eINSTANCE.getFunctionTypeType_InterfaceList(),
            XDDFactory.eINSTANCE.createInterfaceListType()));

        newChildDescriptors.add(createChildParameter(
            XDDPackage.eINSTANCE.getFunctionTypeType_FunctionInstanceList(),
            XDDFactory.eINSTANCE.createTFunctionInstanceList()));
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
