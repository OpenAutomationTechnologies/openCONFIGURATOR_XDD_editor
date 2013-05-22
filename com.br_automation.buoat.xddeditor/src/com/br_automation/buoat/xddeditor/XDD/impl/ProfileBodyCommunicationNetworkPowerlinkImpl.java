/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink;
import com.br_automation.buoat.xddeditor.XDD.ProfileHandleDataType;
import com.br_automation.buoat.xddeditor.XDD.TApplicationLayers;
import com.br_automation.buoat.xddeditor.XDD.TNetworkManagement;
import com.br_automation.buoat.xddeditor.XDD.TTransportLayers;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Profile Body Communication Network Powerlink</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyCommunicationNetworkPowerlinkImpl#getApplicationLayers <em>Application Layers</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyCommunicationNetworkPowerlinkImpl#getTransportLayers <em>Transport Layers</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyCommunicationNetworkPowerlinkImpl#getNetworkManagement <em>Network Management</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyCommunicationNetworkPowerlinkImpl#getExternalProfileHandle <em>External Profile Handle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfileBodyCommunicationNetworkPowerlinkImpl extends ProfileBodyDataTypeImpl implements
    ProfileBodyCommunicationNetworkPowerlink {
    /**
     * The cached value of the '{@link #getApplicationLayers() <em>Application Layers</em>}' containment reference.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getApplicationLayers()
     * @generated
     * @ordered
     */
    protected TApplicationLayers applicationLayers;

    /**
     * The cached value of the '{@link #getTransportLayers() <em>Transport Layers</em>}' containment reference.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getTransportLayers()
     * @generated
     * @ordered
     */
    protected TTransportLayers transportLayers;

    /**
     * The cached value of the '{@link #getNetworkManagement() <em>Network Management</em>}' containment reference.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getNetworkManagement()
     * @generated
     * @ordered
     */
    protected TNetworkManagement networkManagement;

    /**
     * The cached value of the '{@link #getExternalProfileHandle()
     * <em>External Profile Handle</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getExternalProfileHandle()
     * @generated
     * @ordered
     */
    protected EList<ProfileHandleDataType> externalProfileHandle;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ProfileBodyCommunicationNetworkPowerlinkImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public TApplicationLayers getApplicationLayers() {
        return applicationLayers;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetApplicationLayers(TApplicationLayers newApplicationLayers,
        NotificationChain msgs) {
        TApplicationLayers oldApplicationLayers = applicationLayers;
        applicationLayers = newApplicationLayers;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__APPLICATION_LAYERS, oldApplicationLayers, newApplicationLayers);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setApplicationLayers(TApplicationLayers newApplicationLayers) {
        if (newApplicationLayers != applicationLayers) {
            NotificationChain msgs = null;
            if (applicationLayers != null)
                msgs = ((InternalEObject)applicationLayers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__APPLICATION_LAYERS, null, msgs);
            if (newApplicationLayers != null)
                msgs = ((InternalEObject)newApplicationLayers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__APPLICATION_LAYERS, null, msgs);
            msgs = basicSetApplicationLayers(newApplicationLayers, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__APPLICATION_LAYERS, newApplicationLayers, newApplicationLayers));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public TTransportLayers getTransportLayers() {
        return transportLayers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTransportLayers(TTransportLayers newTransportLayers, NotificationChain msgs) {
        TTransportLayers oldTransportLayers = transportLayers;
        transportLayers = newTransportLayers;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__TRANSPORT_LAYERS, oldTransportLayers, newTransportLayers);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTransportLayers(TTransportLayers newTransportLayers) {
        if (newTransportLayers != transportLayers) {
            NotificationChain msgs = null;
            if (transportLayers != null)
                msgs = ((InternalEObject)transportLayers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__TRANSPORT_LAYERS, null, msgs);
            if (newTransportLayers != null)
                msgs = ((InternalEObject)newTransportLayers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__TRANSPORT_LAYERS, null, msgs);
            msgs = basicSetTransportLayers(newTransportLayers, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__TRANSPORT_LAYERS, newTransportLayers, newTransportLayers));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public TNetworkManagement getNetworkManagement() {
        return networkManagement;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNetworkManagement(TNetworkManagement newNetworkManagement,
        NotificationChain msgs) {
        TNetworkManagement oldNetworkManagement = networkManagement;
        networkManagement = newNetworkManagement;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__NETWORK_MANAGEMENT, oldNetworkManagement, newNetworkManagement);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setNetworkManagement(TNetworkManagement newNetworkManagement) {
        if (newNetworkManagement != networkManagement) {
            NotificationChain msgs = null;
            if (networkManagement != null)
                msgs = ((InternalEObject)networkManagement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__NETWORK_MANAGEMENT, null, msgs);
            if (newNetworkManagement != null)
                msgs = ((InternalEObject)newNetworkManagement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__NETWORK_MANAGEMENT, null, msgs);
            msgs = basicSetNetworkManagement(newNetworkManagement, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__NETWORK_MANAGEMENT, newNetworkManagement, newNetworkManagement));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<ProfileHandleDataType> getExternalProfileHandle() {
        if (externalProfileHandle == null) {
            externalProfileHandle = new EObjectContainmentEList<ProfileHandleDataType>(ProfileHandleDataType.class, this, XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__EXTERNAL_PROFILE_HANDLE);
        }
        return externalProfileHandle;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd,
        int featureID,
        NotificationChain msgs) {
        switch (featureID) {
            case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__APPLICATION_LAYERS:
                return basicSetApplicationLayers(null, msgs);
            case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__TRANSPORT_LAYERS:
                return basicSetTransportLayers(null, msgs);
            case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__NETWORK_MANAGEMENT:
                return basicSetNetworkManagement(null, msgs);
            case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__EXTERNAL_PROFILE_HANDLE:
                return ((InternalEList<?>)getExternalProfileHandle()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__APPLICATION_LAYERS:
                return getApplicationLayers();
            case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__TRANSPORT_LAYERS:
                return getTransportLayers();
            case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__NETWORK_MANAGEMENT:
                return getNetworkManagement();
            case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__EXTERNAL_PROFILE_HANDLE:
                return getExternalProfileHandle();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__APPLICATION_LAYERS:
                setApplicationLayers((TApplicationLayers)newValue);
                return;
            case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__TRANSPORT_LAYERS:
                setTransportLayers((TTransportLayers)newValue);
                return;
            case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__NETWORK_MANAGEMENT:
                setNetworkManagement((TNetworkManagement)newValue);
                return;
            case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__EXTERNAL_PROFILE_HANDLE:
                getExternalProfileHandle().clear();
                getExternalProfileHandle().addAll((Collection<? extends ProfileHandleDataType>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__APPLICATION_LAYERS:
                setApplicationLayers((TApplicationLayers)null);
                return;
            case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__TRANSPORT_LAYERS:
                setTransportLayers((TTransportLayers)null);
                return;
            case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__NETWORK_MANAGEMENT:
                setNetworkManagement((TNetworkManagement)null);
                return;
            case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__EXTERNAL_PROFILE_HANDLE:
                getExternalProfileHandle().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__APPLICATION_LAYERS:
                return applicationLayers != null;
            case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__TRANSPORT_LAYERS:
                return transportLayers != null;
            case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__NETWORK_MANAGEMENT:
                return networkManagement != null;
            case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__EXTERNAL_PROFILE_HANDLE:
                return externalProfileHandle != null && !externalProfileHandle.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ProfileBodyCommunicationNetworkPowerlinkImpl
