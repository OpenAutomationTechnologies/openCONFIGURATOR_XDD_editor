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

import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.XDDFactory;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * This is the item provider adapter for a
 * {@link com.br_automation.buoat.xddeditor.XDD.TObject} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class TObjectItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
    IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
    IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TObjectItemProvider(AdapterFactory adapterFactory) {
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
            addIndexPropertyDescriptor(object);
            addLowLimitPropertyDescriptor(object);
            addNamePropertyDescriptor(object);
            addObjectTypePropertyDescriptor(object);
            addObjFlagsPropertyDescriptor(object);
            addPDOmappingPropertyDescriptor(object);
            addSubNumberPropertyDescriptor(object);
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
            getString("_UI_TObject_accessType_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_TObject_accessType_feature",
                "_UI_TObject_type"), XDDPackage.eINSTANCE.getTObject_AccessType(), true, false,
            false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
            getString("_UI_TObject_actualValue_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_TObject_actualValue_feature",
                "_UI_TObject_type"), XDDPackage.eINSTANCE.getTObject_ActualValue(), true, false,
            false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
            getString("_UI_TObject_dataType_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_TObject_dataType_feature",
                "_UI_TObject_type"), XDDPackage.eINSTANCE.getTObject_DataType(), true, false,
            false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
            getString("_UI_TObject_defaultValue_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_TObject_defaultValue_feature",
                "_UI_TObject_type"), XDDPackage.eINSTANCE.getTObject_DefaultValue(), true, false,
            false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
            getString("_UI_TObject_denotation_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_TObject_denotation_feature",
                "_UI_TObject_type"), XDDPackage.eINSTANCE.getTObject_Denotation(), true, false,
            false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
            getString("_UI_TObject_highLimit_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_TObject_highLimit_feature",
                "_UI_TObject_type"), XDDPackage.eINSTANCE.getTObject_HighLimit(), true, false,
            false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Index feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addIndexPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_TObject_index_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_TObject_index_feature",
                "_UI_TObject_type"), XDDPackage.eINSTANCE.getTObject_Index(), true, false, false,
            ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
            getString("_UI_TObject_lowLimit_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_TObject_lowLimit_feature",
                "_UI_TObject_type"), XDDPackage.eINSTANCE.getTObject_LowLimit(), true, false,
            false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
            getString("_UI_TObject_name_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_TObject_name_feature",
                "_UI_TObject_type"), XDDPackage.eINSTANCE.getTObject_Name(), true, false, false,
            ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
            getString("_UI_TObject_objectType_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_TObject_objectType_feature",
                "_UI_TObject_type"), XDDPackage.eINSTANCE.getTObject_ObjectType(), true, false,
            false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
            getString("_UI_TObject_objFlags_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_TObject_objFlags_feature",
                "_UI_TObject_type"), XDDPackage.eINSTANCE.getTObject_ObjFlags(), true, false,
            false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
            getString("_UI_TObject_pDOmapping_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_TObject_pDOmapping_feature",
                "_UI_TObject_type"), XDDPackage.eINSTANCE.getTObject_PDOmapping(), true, false,
            false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Sub Number feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addSubNumberPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_TObject_subNumber_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_TObject_subNumber_feature",
                "_UI_TObject_type"), XDDPackage.eINSTANCE.getTObject_SubNumber(), true, false,
            false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
            getString("_UI_TObject_uniqueIDRef_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_TObject_uniqueIDRef_feature",
                "_UI_TObject_type"), XDDPackage.eINSTANCE.getTObject_UniqueIDRef(), true, false,
            false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
            childrenFeatures.add(XDDPackage.eINSTANCE.getTObject_SubObject());
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
     * This returns TObject.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/TObject"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public String getText(Object object) {
        // j.l.: Modify label of element in UI.
        // BEGIN
        String label = " ";
        String index = " ";

            if(((TObject) object).getIndex() != null) 
                index = "0x" + new BigInteger(((TObject) object).getIndex()).toString(16).toUpperCase();
            if(((TObject) object).getName() != null)
               label = ((TObject) object).getName();

        return (this.getString("_UI_TObject_type") + " ( " + index + " - " + label + " )");
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

        switch (notification.getFeatureID(TObject.class)) {
            case XDDPackage.TOBJECT__ACCESS_TYPE:
            case XDDPackage.TOBJECT__ACTUAL_VALUE:
            case XDDPackage.TOBJECT__DATA_TYPE:
            case XDDPackage.TOBJECT__DEFAULT_VALUE:
            case XDDPackage.TOBJECT__DENOTATION:
            case XDDPackage.TOBJECT__HIGH_LIMIT:
            case XDDPackage.TOBJECT__INDEX:
            case XDDPackage.TOBJECT__LOW_LIMIT:
            case XDDPackage.TOBJECT__NAME:
            case XDDPackage.TOBJECT__OBJECT_TYPE:
            case XDDPackage.TOBJECT__OBJ_FLAGS:
            case XDDPackage.TOBJECT__PD_OMAPPING:
            case XDDPackage.TOBJECT__SUB_NUMBER:
            case XDDPackage.TOBJECT__UNIQUE_ID_REF:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(),
                    false, true));
                return;
            case XDDPackage.TOBJECT__SUB_OBJECT:
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

        newChildDescriptors
            .add(createChildParameter(
                XDDPackage.eINSTANCE.getTObject_SubObject(),
                XDDFactory.eINSTANCE.createSubObjectType()));
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
