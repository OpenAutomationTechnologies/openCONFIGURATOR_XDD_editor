/**
 */
package FwSchema.provider;


import FwSchema.FirmwareType;
import FwSchema.FwSchemaPackage;

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
 * This is the item provider adapter for a {@link FwSchema.FirmwareType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FirmwareTypeItemProvider 
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
    public FirmwareTypeItemProvider(AdapterFactory adapterFactory) {
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

            addApplSwDatePropertyDescriptor(object);
            addApplSwTimePropertyDescriptor(object);
            addBootOffsHiPropertyDescriptor(object);
            addChkPropertyDescriptor(object);
            addDatePropertyDescriptor(object);
            addDevPropertyDescriptor(object);
            addFctPropertyDescriptor(object);
            addKeepXmlHeaderPropertyDescriptor(object);
            addLenPropertyDescriptor(object);
            addMatPropertyDescriptor(object);
            addRemPropertyDescriptor(object);
            addUsePropertyDescriptor(object);
            addVarPropertyDescriptor(object);
            addVenPropertyDescriptor(object);
            addVerPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Appl Sw Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addApplSwDatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_FirmwareType_applSwDate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FirmwareType_applSwDate_feature", "_UI_FirmwareType_type"),
                 FwSchemaPackage.Literals.FIRMWARE_TYPE__APPL_SW_DATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Appl Sw Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addApplSwTimePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_FirmwareType_applSwTime_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FirmwareType_applSwTime_feature", "_UI_FirmwareType_type"),
                 FwSchemaPackage.Literals.FIRMWARE_TYPE__APPL_SW_TIME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Boot Offs Hi feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBootOffsHiPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_FirmwareType_bootOffsHi_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FirmwareType_bootOffsHi_feature", "_UI_FirmwareType_type"),
                 FwSchemaPackage.Literals.FIRMWARE_TYPE__BOOT_OFFS_HI,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Chk feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addChkPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_FirmwareType_chk_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FirmwareType_chk_feature", "_UI_FirmwareType_type"),
                 FwSchemaPackage.Literals.FIRMWARE_TYPE__CHK,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_FirmwareType_date_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FirmwareType_date_feature", "_UI_FirmwareType_type"),
                 FwSchemaPackage.Literals.FIRMWARE_TYPE__DATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Dev feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDevPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_FirmwareType_dev_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FirmwareType_dev_feature", "_UI_FirmwareType_type"),
                 FwSchemaPackage.Literals.FIRMWARE_TYPE__DEV,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Fct feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFctPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_FirmwareType_fct_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FirmwareType_fct_feature", "_UI_FirmwareType_type"),
                 FwSchemaPackage.Literals.FIRMWARE_TYPE__FCT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Keep Xml Header feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKeepXmlHeaderPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_FirmwareType_keepXmlHeader_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FirmwareType_keepXmlHeader_feature", "_UI_FirmwareType_type"),
                 FwSchemaPackage.Literals.FIRMWARE_TYPE__KEEP_XML_HEADER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Len feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLenPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_FirmwareType_len_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FirmwareType_len_feature", "_UI_FirmwareType_type"),
                 FwSchemaPackage.Literals.FIRMWARE_TYPE__LEN,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Mat feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMatPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_FirmwareType_mat_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FirmwareType_mat_feature", "_UI_FirmwareType_type"),
                 FwSchemaPackage.Literals.FIRMWARE_TYPE__MAT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Rem feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRemPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_FirmwareType_rem_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FirmwareType_rem_feature", "_UI_FirmwareType_type"),
                 FwSchemaPackage.Literals.FIRMWARE_TYPE__REM,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Use feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUsePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_FirmwareType_use_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FirmwareType_use_feature", "_UI_FirmwareType_type"),
                 FwSchemaPackage.Literals.FIRMWARE_TYPE__USE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Var feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVarPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_FirmwareType_var_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FirmwareType_var_feature", "_UI_FirmwareType_type"),
                 FwSchemaPackage.Literals.FIRMWARE_TYPE__VAR,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Ven feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVenPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_FirmwareType_ven_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FirmwareType_ven_feature", "_UI_FirmwareType_type"),
                 FwSchemaPackage.Literals.FIRMWARE_TYPE__VEN,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Ver feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVerPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_FirmwareType_ver_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FirmwareType_ver_feature", "_UI_FirmwareType_type"),
                 FwSchemaPackage.Literals.FIRMWARE_TYPE__VER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns FirmwareType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/FirmwareType"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        FirmwareType firmwareType = (FirmwareType)object;
        return getString("_UI_FirmwareType_type") + " " + firmwareType.getApplSwDate();
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

        switch (notification.getFeatureID(FirmwareType.class)) {
            case FwSchemaPackage.FIRMWARE_TYPE__APPL_SW_DATE:
            case FwSchemaPackage.FIRMWARE_TYPE__APPL_SW_TIME:
            case FwSchemaPackage.FIRMWARE_TYPE__BOOT_OFFS_HI:
            case FwSchemaPackage.FIRMWARE_TYPE__CHK:
            case FwSchemaPackage.FIRMWARE_TYPE__DATE:
            case FwSchemaPackage.FIRMWARE_TYPE__DEV:
            case FwSchemaPackage.FIRMWARE_TYPE__FCT:
            case FwSchemaPackage.FIRMWARE_TYPE__KEEP_XML_HEADER:
            case FwSchemaPackage.FIRMWARE_TYPE__LEN:
            case FwSchemaPackage.FIRMWARE_TYPE__MAT:
            case FwSchemaPackage.FIRMWARE_TYPE__REM:
            case FwSchemaPackage.FIRMWARE_TYPE__USE:
            case FwSchemaPackage.FIRMWARE_TYPE__VAR:
            case FwSchemaPackage.FIRMWARE_TYPE__VEN:
            case FwSchemaPackage.FIRMWARE_TYPE__VER:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return FirmwareEditPlugin.INSTANCE;
    }

}
