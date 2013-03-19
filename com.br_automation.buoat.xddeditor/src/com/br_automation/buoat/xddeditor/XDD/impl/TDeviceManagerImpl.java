/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.TDeviceManager;
import com.br_automation.buoat.xddeditor.XDD.TIndicatorList;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>TDevice Manager</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceManagerImpl#getIndicatorList
 * <em>Indicator List</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TDeviceManagerImpl extends EObjectImpl implements TDeviceManager {
    /**
     * The cached value of the '{@link #getIndicatorList()
     * <em>Indicator List</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getIndicatorList()
     * @generated
     * @ordered
     */
    protected TIndicatorList indicatorList;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TDeviceManagerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getTDeviceManager();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TIndicatorList getIndicatorList() {
        return indicatorList;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetIndicatorList(TIndicatorList newIndicatorList,
        NotificationChain msgs) {
        TIndicatorList oldIndicatorList = indicatorList;
        indicatorList = newIndicatorList;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDEVICE_MANAGER__INDICATOR_LIST, oldIndicatorList, newIndicatorList);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setIndicatorList(TIndicatorList newIndicatorList) {
        if (newIndicatorList != indicatorList) {
            NotificationChain msgs = null;
            if (indicatorList != null)
                msgs = ((InternalEObject) indicatorList).eInverseRemove(
                    this, EOPPOSITE_FEATURE_BASE - XDDPackage.TDEVICE_MANAGER__INDICATOR_LIST,
                    null, msgs);
            if (newIndicatorList != null)
                msgs = ((InternalEObject) newIndicatorList).eInverseAdd(
                    this, EOPPOSITE_FEATURE_BASE - XDDPackage.TDEVICE_MANAGER__INDICATOR_LIST,
                    null, msgs);
            msgs = basicSetIndicatorList(newIndicatorList, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDEVICE_MANAGER__INDICATOR_LIST, newIndicatorList, newIndicatorList));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd,
        int featureID,
        NotificationChain msgs) {
        switch (featureID) {
            case XDDPackage.TDEVICE_MANAGER__INDICATOR_LIST:
                return basicSetIndicatorList(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XDDPackage.TDEVICE_MANAGER__INDICATOR_LIST:
                return getIndicatorList();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case XDDPackage.TDEVICE_MANAGER__INDICATOR_LIST:
                setIndicatorList((TIndicatorList) newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case XDDPackage.TDEVICE_MANAGER__INDICATOR_LIST:
                setIndicatorList((TIndicatorList) null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case XDDPackage.TDEVICE_MANAGER__INDICATOR_LIST:
                return indicatorList != null;
        }
        return super.eIsSet(featureID);
    }

} //TDeviceManagerImpl
