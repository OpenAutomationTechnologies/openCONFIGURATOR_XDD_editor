/**
 */
package com.br_automation.buoat.xddeditor.XDD.provider;

import com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink;
import com.br_automation.buoat.xddeditor.XDD.XDDFactory;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class ProfileBodyCommunicationNetworkPowerlinkItemProvider extends
    ProfileBodyDataTypeItemProvider implements IEditingDomainItemProvider,
    IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
    IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ProfileBodyCommunicationNetworkPowerlinkItemProvider(AdapterFactory adapterFactory) {
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

        }
        return itemPropertyDescriptors;
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
            childrenFeatures.add(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_ApplicationLayers());
            childrenFeatures.add(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers());
            childrenFeatures.add(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_NetworkManagement());
            childrenFeatures.add(XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_ExternalProfileHandle());
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
     * This returns ProfileBodyCommunicationNetworkPowerlink.gif. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ProfileBodyCommunicationNetworkPowerlink"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public String getText(Object object) {
        String label = ((ProfileBodyCommunicationNetworkPowerlink) object).getFileName();
		// j.l.: Modify label of element in UI.
        // BEGIN
        return label == null || label.length() == 0 ? getString("_UI_ProfileBodyCommunicationNetworkPowerlink_type")
            : getString("_UI_ProfileBodyCommunicationNetworkPowerlink_type");
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

        switch (notification.getFeatureID(ProfileBodyCommunicationNetworkPowerlink.class)) {
            case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__APPLICATION_LAYERS:
            case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__TRANSPORT_LAYERS:
            case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__NETWORK_MANAGEMENT:
            case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__EXTERNAL_PROFILE_HANDLE:
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
                (XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_ApplicationLayers(),
                 XDDFactory.eINSTANCE.createTApplicationLayers()));

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_TransportLayers(),
                 XDDFactory.eINSTANCE.createTTransportLayers()));

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_NetworkManagement(),
                 XDDFactory.eINSTANCE.createTNetworkManagement()));

        newChildDescriptors.add
            (createChildParameter
                (XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink_ExternalProfileHandle(),
                 XDDFactory.eINSTANCE.createProfileHandleDataType()));
    }

}
