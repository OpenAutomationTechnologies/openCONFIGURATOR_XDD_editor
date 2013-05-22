/**
 */
package com.br_automation.buoat.xddeditor.XDD.provider;

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

import com.br_automation.buoat.xddeditor.XDD.TApplicationLayers;
import com.br_automation.buoat.xddeditor.XDD.XDDFactory;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * This is the item provider adapter for a
 * {@link com.br_automation.buoat.xddeditor.XDD.TApplicationLayers} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class TApplicationLayersItemProvider extends ItemProviderAdapter implements
    IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
    IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TApplicationLayersItemProvider(AdapterFactory adapterFactory) {
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

            addCommunicationEntityTypePropertyDescriptor(object);
            addConformanceClassPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Communication Entity Type
     * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addCommunicationEntityTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_TApplicationLayers_communicationEntityType_feature"),
            getString(
                "_UI_PropertyDescriptor_description",
                "_UI_TApplicationLayers_communicationEntityType_feature",
                "_UI_TApplicationLayers_type"), XDDPackage.eINSTANCE
                .getTApplicationLayers_CommunicationEntityType(), true, false, false,
            ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Conformance Class feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addConformanceClassPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_TApplicationLayers_conformanceClass_feature"),
            getString(
                "_UI_PropertyDescriptor_description",
                "_UI_TApplicationLayers_conformanceClass_feature", "_UI_TApplicationLayers_type"),
            XDDPackage.eINSTANCE.getTApplicationLayers_ConformanceClass(), true, false, false,
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
            childrenFeatures.add(XDDPackage.eINSTANCE.getTApplicationLayers_Identity());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTApplicationLayers_DataTypeList());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTApplicationLayers_ObjectList());
            childrenFeatures.add(XDDPackage.eINSTANCE.getTApplicationLayers_DynamicChannels());
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
     * This returns TApplicationLayers.gif. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/TApplicationLayers"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public String getText(Object object) {
        List labelValue = ((TApplicationLayers) object).getCommunicationEntityType();
        String label = labelValue == null ? null : labelValue.toString();
        // j.l.: Removes  to match the XML-Object name given in XDD-File or 
        
        // BEGIN
        return label == null || label.length() == 0 ? getString("_UI_TApplicationLayers_type")
            : getString("_UI_TApplicationLayers_type");
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

        switch (notification.getFeatureID(TApplicationLayers.class)) {
            case XDDPackage.TAPPLICATION_LAYERS__COMMUNICATION_ENTITY_TYPE:
            case XDDPackage.TAPPLICATION_LAYERS__CONFORMANCE_CLASS:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(),
                    false, true));
                return;
            case XDDPackage.TAPPLICATION_LAYERS__IDENTITY:
            case XDDPackage.TAPPLICATION_LAYERS__DATA_TYPE_LIST:
            case XDDPackage.TAPPLICATION_LAYERS__OBJECT_LIST:
            case XDDPackage.TAPPLICATION_LAYERS__DYNAMIC_CHANNELS:
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
            XDDPackage.eINSTANCE.getTApplicationLayers_Identity(),
            XDDFactory.eINSTANCE.createIdentityType()));

        newChildDescriptors.add(createChildParameter(
            XDDPackage.eINSTANCE.getTApplicationLayers_DataTypeList(),
            XDDFactory.eINSTANCE.createDataTypeListType()));

        newChildDescriptors.add(createChildParameter(
            XDDPackage.eINSTANCE.getTApplicationLayers_ObjectList(),
            XDDFactory.eINSTANCE.createObjectListType()));

        newChildDescriptors.add(createChildParameter(
            XDDPackage.eINSTANCE.getTApplicationLayers_DynamicChannels(),
            XDDFactory.eINSTANCE.createDynamicChannelsType()));
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
