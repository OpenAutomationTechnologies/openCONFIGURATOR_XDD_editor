/**
 */
package com.br_automation.buoat.xddeditor.XDD.provider;

import com.br_automation.buoat.xddeditor.XDD.SubObjectType;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
 * {@link com.br_automation.buoat.xddeditor.XDD.SubObjectType} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SubObjectTypeItemProvider extends ItemProviderAdapter implements
    IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
    IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public SubObjectTypeItemProvider(AdapterFactory adapterFactory) {
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

            addAccessTypePropertyDescriptor(object);
            addActualValuePropertyDescriptor(object);
            addDataTypePropertyDescriptor(object);
            addDefaultValuePropertyDescriptor(object);
            addDenotationPropertyDescriptor(object);
            addHighLimitPropertyDescriptor(object);
            addLowLimitPropertyDescriptor(object);
            addNamePropertyDescriptor(object);
            addObjectTypePropertyDescriptor(object);
            addObjFlagsPropertyDescriptor(object);
            addPDOmappingPropertyDescriptor(object);
            addSubIndexPropertyDescriptor(object);
            addUniqueIDRefPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Access Type feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addAccessTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_SubObjectType_accessType_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_SubObjectType_accessType_feature",
                "_UI_SubObjectType_type"), XDDPackage.eINSTANCE.getSubObjectType_AccessType(),
            true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Actual Value feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addActualValuePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_SubObjectType_actualValue_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_SubObjectType_actualValue_feature",
                "_UI_SubObjectType_type"), XDDPackage.eINSTANCE.getSubObjectType_ActualValue(),
            true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Data Type feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addDataTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_SubObjectType_dataType_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_SubObjectType_dataType_feature",
                "_UI_SubObjectType_type"), XDDPackage.eINSTANCE.getSubObjectType_DataType(), true,
            false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Default Value feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addDefaultValuePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_SubObjectType_defaultValue_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_SubObjectType_defaultValue_feature",
                "_UI_SubObjectType_type"), XDDPackage.eINSTANCE.getSubObjectType_DefaultValue(),
            true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Denotation feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addDenotationPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_SubObjectType_denotation_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_SubObjectType_denotation_feature",
                "_UI_SubObjectType_type"), XDDPackage.eINSTANCE.getSubObjectType_Denotation(),
            true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the High Limit feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addHighLimitPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_SubObjectType_highLimit_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_SubObjectType_highLimit_feature",
                "_UI_SubObjectType_type"), XDDPackage.eINSTANCE.getSubObjectType_HighLimit(), true,
            false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Low Limit feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addLowLimitPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_SubObjectType_lowLimit_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_SubObjectType_lowLimit_feature",
                "_UI_SubObjectType_type"), XDDPackage.eINSTANCE.getSubObjectType_LowLimit(), true,
            false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
            getString("_UI_SubObjectType_name_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_SubObjectType_name_feature",
                "_UI_SubObjectType_type"), XDDPackage.eINSTANCE.getSubObjectType_Name(), true,
            false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Object Type feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addObjectTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_SubObjectType_objectType_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_SubObjectType_objectType_feature",
                "_UI_SubObjectType_type"), XDDPackage.eINSTANCE.getSubObjectType_ObjectType(),
            true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Obj Flags feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addObjFlagsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_SubObjectType_objFlags_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_SubObjectType_objFlags_feature",
                "_UI_SubObjectType_type"), XDDPackage.eINSTANCE.getSubObjectType_ObjFlags(), true,
            false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the PD Omapping feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addPDOmappingPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_SubObjectType_pDOmapping_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_SubObjectType_pDOmapping_feature",
                "_UI_SubObjectType_type"), XDDPackage.eINSTANCE.getSubObjectType_PDOmapping(),
            true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Sub Index feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addSubIndexPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_SubObjectType_subIndex_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_SubObjectType_subIndex_feature",
                "_UI_SubObjectType_type"), XDDPackage.eINSTANCE.getSubObjectType_SubIndex(), true,
            false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Unique ID Ref feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addUniqueIDRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_SubObjectType_uniqueIDRef_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_SubObjectType_uniqueIDRef_feature",
                "_UI_SubObjectType_type"), XDDPackage.eINSTANCE.getSubObjectType_UniqueIDRef(),
            true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This returns SubObjectType.gif. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/SubObjectType"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((SubObjectType) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_SubObjectType_type")
            : getString("_UI_SubObjectType_type") + " " + label;
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

        switch (notification.getFeatureID(SubObjectType.class)) {
            case XDDPackage.SUB_OBJECT_TYPE__ACCESS_TYPE:
            case XDDPackage.SUB_OBJECT_TYPE__ACTUAL_VALUE:
            case XDDPackage.SUB_OBJECT_TYPE__DATA_TYPE:
            case XDDPackage.SUB_OBJECT_TYPE__DEFAULT_VALUE:
            case XDDPackage.SUB_OBJECT_TYPE__DENOTATION:
            case XDDPackage.SUB_OBJECT_TYPE__HIGH_LIMIT:
            case XDDPackage.SUB_OBJECT_TYPE__LOW_LIMIT:
            case XDDPackage.SUB_OBJECT_TYPE__NAME:
            case XDDPackage.SUB_OBJECT_TYPE__OBJECT_TYPE:
            case XDDPackage.SUB_OBJECT_TYPE__OBJ_FLAGS:
            case XDDPackage.SUB_OBJECT_TYPE__PD_OMAPPING:
            case XDDPackage.SUB_OBJECT_TYPE__SUB_INDEX:
            case XDDPackage.SUB_OBJECT_TYPE__UNIQUE_ID_REF:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(),
                    false, true));
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
