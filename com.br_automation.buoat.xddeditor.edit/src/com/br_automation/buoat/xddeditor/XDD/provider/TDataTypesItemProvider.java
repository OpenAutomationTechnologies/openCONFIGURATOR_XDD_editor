/**
 */
package com.br_automation.buoat.xddeditor.XDD.provider;

import com.br_automation.buoat.xddeditor.XDD.TDataTypes;
import com.br_automation.buoat.xddeditor.XDD.XDDFactory;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;

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
 * {@link com.br_automation.buoat.xddeditor.XDD.TDataTypes} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class TDataTypesItemProvider extends ItemProviderAdapter implements
    IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
    IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TDataTypesItemProvider(AdapterFactory adapterFactory) {
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

            addDataTypePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Data Type feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addDataTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TDataTypes_dataType_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TDataTypes_dataType_feature", "_UI_TDataTypes_type"),
                 XDDPackage.eINSTANCE.getTDataTypes_DataType(),
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
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Boolean());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Integer8());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Integer16());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Integer32());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Integer24());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Integer40());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Integer48());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Integer56());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Integer64());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Unsigned8());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Unsigned16());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Unsigned32());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Unsigned24());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Unsigned40());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Unsigned48());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Unsigned56());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Unsigned64());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Real32());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Real64());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_VisibleString());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_OctetString());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_UnicodeString());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_TimeDiff());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_Domain());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTDataTypes_NETTIME());
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns TDataTypes.gif. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/TDataTypes"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public String getText(Object object) {
   	    // j.l.: Modify label of element in UI.
        // BEGIN
        return ((TDataTypes) object).eContainingFeature().getName();
        //END
      
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(TDataTypes.class)) {
            case XDDPackage.TDATA_TYPES__DATA_TYPE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case XDDPackage.TDATA_TYPES__BOOLEAN:
            case XDDPackage.TDATA_TYPES__INTEGER8:
            case XDDPackage.TDATA_TYPES__INTEGER16:
            case XDDPackage.TDATA_TYPES__INTEGER32:
            case XDDPackage.TDATA_TYPES__INTEGER24:
            case XDDPackage.TDATA_TYPES__INTEGER40:
            case XDDPackage.TDATA_TYPES__INTEGER48:
            case XDDPackage.TDATA_TYPES__INTEGER56:
            case XDDPackage.TDATA_TYPES__INTEGER64:
            case XDDPackage.TDATA_TYPES__UNSIGNED8:
            case XDDPackage.TDATA_TYPES__UNSIGNED16:
            case XDDPackage.TDATA_TYPES__UNSIGNED32:
            case XDDPackage.TDATA_TYPES__UNSIGNED24:
            case XDDPackage.TDATA_TYPES__UNSIGNED40:
            case XDDPackage.TDATA_TYPES__UNSIGNED48:
            case XDDPackage.TDATA_TYPES__UNSIGNED56:
            case XDDPackage.TDATA_TYPES__UNSIGNED64:
            case XDDPackage.TDATA_TYPES__REAL32:
            case XDDPackage.TDATA_TYPES__REAL64:
            case XDDPackage.TDATA_TYPES__VISIBLE_STRING:
            case XDDPackage.TDATA_TYPES__OCTET_STRING:
            case XDDPackage.TDATA_TYPES__UNICODE_STRING:
            case XDDPackage.TDATA_TYPES__TIME_OF_DAY:
            case XDDPackage.TDATA_TYPES__TIME_DIFF:
            case XDDPackage.TDATA_TYPES__DOMAIN:
            case XDDPackage.TDATA_TYPES__MACADDRESS:
            case XDDPackage.TDATA_TYPES__IPADDRESS:
            case XDDPackage.TDATA_TYPES__NETTIME:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getTDataTypes_Boolean(),
                 XDDFactory.eINSTANCE.createTDataTypes()));

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getTDataTypes_Integer8(),
                 XDDFactory.eINSTANCE.createTDataTypes()));

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getTDataTypes_Integer16(),
                 XDDFactory.eINSTANCE.createTDataTypes()));

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getTDataTypes_Integer32(),
                 XDDFactory.eINSTANCE.createTDataTypes()));

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getTDataTypes_Integer24(),
                 XDDFactory.eINSTANCE.createTDataTypes()));

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getTDataTypes_Integer40(),
                 XDDFactory.eINSTANCE.createTDataTypes()));

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getTDataTypes_Integer48(),
                 XDDFactory.eINSTANCE.createTDataTypes()));

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getTDataTypes_Integer56(),
                 XDDFactory.eINSTANCE.createTDataTypes()));

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getTDataTypes_Integer64(),
                 XDDFactory.eINSTANCE.createTDataTypes()));

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getTDataTypes_Unsigned8(),
                 XDDFactory.eINSTANCE.createTDataTypes()));

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getTDataTypes_Unsigned16(),
                 XDDFactory.eINSTANCE.createTDataTypes()));

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getTDataTypes_Unsigned32(),
                 XDDFactory.eINSTANCE.createTDataTypes()));

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getTDataTypes_Unsigned24(),
                 XDDFactory.eINSTANCE.createTDataTypes()));

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getTDataTypes_Unsigned40(),
                 XDDFactory.eINSTANCE.createTDataTypes()));

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getTDataTypes_Unsigned48(),
                 XDDFactory.eINSTANCE.createTDataTypes()));

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getTDataTypes_Unsigned56(),
                 XDDFactory.eINSTANCE.createTDataTypes()));

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getTDataTypes_Unsigned64(),
                 XDDFactory.eINSTANCE.createTDataTypes()));

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getTDataTypes_Real32(),
                 XDDFactory.eINSTANCE.createTDataTypes()));

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getTDataTypes_Real64(),
                 XDDFactory.eINSTANCE.createTDataTypes()));

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getTDataTypes_VisibleString(),
                 XDDFactory.eINSTANCE.createTDataTypes()));

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getTDataTypes_OctetString(),
                 XDDFactory.eINSTANCE.createTDataTypes()));

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getTDataTypes_UnicodeString(),
                 XDDFactory.eINSTANCE.createTDataTypes()));

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay(),
                 XDDFactory.eINSTANCE.createTDataTypes()));

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getTDataTypes_TimeDiff(),
                 XDDFactory.eINSTANCE.createTDataTypes()));

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getTDataTypes_Domain(),
                 XDDFactory.eINSTANCE.createTDataTypes()));

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS(),
                 XDDFactory.eINSTANCE.createTDataTypes()));

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS(),
                 XDDFactory.eINSTANCE.createTDataTypes()));

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getTDataTypes_NETTIME(),
                 XDDFactory.eINSTANCE.createTDataTypes()));
    }

    /**
     * This returns the label text for
     * {@link org.eclipse.emf.edit.command.CreateChildCommand}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public String getCreateChildText(Object owner,
        Object feature,
        Object child,
        Collection<?> selection) {
        Object childFeature = feature;
        Object childObject = child;

        boolean qualify =
            childFeature == XDDPackage.eINSTANCE.getTDataTypes_Boolean() ||
            childFeature == XDDPackage.eINSTANCE.getTDataTypes_Integer8() ||
            childFeature == XDDPackage.eINSTANCE.getTDataTypes_Integer16() ||
            childFeature == XDDPackage.eINSTANCE.getTDataTypes_Integer32() ||
            childFeature == XDDPackage.eINSTANCE.getTDataTypes_Integer24() ||
            childFeature == XDDPackage.eINSTANCE.getTDataTypes_Integer40() ||
            childFeature == XDDPackage.eINSTANCE.getTDataTypes_Integer48() ||
            childFeature == XDDPackage.eINSTANCE.getTDataTypes_Integer56() ||
            childFeature == XDDPackage.eINSTANCE.getTDataTypes_Integer64() ||
            childFeature == XDDPackage.eINSTANCE.getTDataTypes_Unsigned8() ||
            childFeature == XDDPackage.eINSTANCE.getTDataTypes_Unsigned16() ||
            childFeature == XDDPackage.eINSTANCE.getTDataTypes_Unsigned32() ||
            childFeature == XDDPackage.eINSTANCE.getTDataTypes_Unsigned24() ||
            childFeature == XDDPackage.eINSTANCE.getTDataTypes_Unsigned40() ||
            childFeature == XDDPackage.eINSTANCE.getTDataTypes_Unsigned48() ||
            childFeature == XDDPackage.eINSTANCE.getTDataTypes_Unsigned56() ||
            childFeature == XDDPackage.eINSTANCE.getTDataTypes_Unsigned64() ||
            childFeature == XDDPackage.eINSTANCE.getTDataTypes_Real32() ||
            childFeature == XDDPackage.eINSTANCE.getTDataTypes_Real64() ||
            childFeature == XDDPackage.eINSTANCE.getTDataTypes_VisibleString() ||
            childFeature == XDDPackage.eINSTANCE.getTDataTypes_OctetString() ||
            childFeature == XDDPackage.eINSTANCE.getTDataTypes_UnicodeString() ||
            childFeature == XDDPackage.eINSTANCE.getTDataTypes_TimeOfDay() ||
            childFeature == XDDPackage.eINSTANCE.getTDataTypes_TimeDiff() ||
            childFeature == XDDPackage.eINSTANCE.getTDataTypes_Domain() ||
            childFeature == XDDPackage.eINSTANCE.getTDataTypes_MACADDRESS() ||
            childFeature == XDDPackage.eINSTANCE.getTDataTypes_IPADDRESS() ||
            childFeature == XDDPackage.eINSTANCE.getTDataTypes_NETTIME();

        if (qualify) {
            return getString
                ("_UI_CreateChild_text2",
                 new Object[] { "", getFeatureText(childFeature),"" });
        }
        return super.getCreateChildText(owner, feature, child, selection);
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
