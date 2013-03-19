/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.TCNFeatures;
import com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning;
import com.br_automation.buoat.xddeditor.XDD.TDiagnostic;
import com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures;
import com.br_automation.buoat.xddeditor.XDD.TMNFeatures;
import com.br_automation.buoat.xddeditor.XDD.TNetworkManagement;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>TNetwork Management</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TNetworkManagementImpl#getGeneralFeatures
 * <em>General Features</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TNetworkManagementImpl#getMNFeatures
 * <em>MN Features</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TNetworkManagementImpl#getCNFeatures
 * <em>CN Features</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TNetworkManagementImpl#getDeviceCommissioning
 * <em>Device Commissioning</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TNetworkManagementImpl#getDiagnostic
 * <em>Diagnostic</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TNetworkManagementImpl extends EObjectImpl implements TNetworkManagement {
    /**
     * The cached value of the '{@link #getGeneralFeatures()
     * <em>General Features</em>}' containment reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getGeneralFeatures()
     * @generated
     * @ordered
     */
    protected TGeneralFeatures generalFeatures;

    /**
     * The cached value of the '{@link #getMNFeatures() <em>MN Features</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getMNFeatures()
     * @generated
     * @ordered
     */
    protected TMNFeatures mNFeatures;

    /**
     * The cached value of the '{@link #getCNFeatures() <em>CN Features</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getCNFeatures()
     * @generated
     * @ordered
     */
    protected TCNFeatures cNFeatures;

    /**
     * The cached value of the '{@link #getDeviceCommissioning()
     * <em>Device Commissioning</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getDeviceCommissioning()
     * @generated
     * @ordered
     */
    protected TDeviceCommissioning deviceCommissioning;

    /**
     * The cached value of the '{@link #getDiagnostic() <em>Diagnostic</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getDiagnostic()
     * @generated
     * @ordered
     */
    protected TDiagnostic diagnostic;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TNetworkManagementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getTNetworkManagement();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TGeneralFeatures getGeneralFeatures() {
        return generalFeatures;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetGeneralFeatures(TGeneralFeatures newGeneralFeatures,
        NotificationChain msgs) {
        TGeneralFeatures oldGeneralFeatures = generalFeatures;
        generalFeatures = newGeneralFeatures;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TNETWORK_MANAGEMENT__GENERAL_FEATURES, oldGeneralFeatures,
                newGeneralFeatures);
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
    public void setGeneralFeatures(TGeneralFeatures newGeneralFeatures) {
        if (newGeneralFeatures != generalFeatures) {
            NotificationChain msgs = null;
            if (generalFeatures != null)
                msgs = ((InternalEObject) generalFeatures).eInverseRemove(
                    this,
                    EOPPOSITE_FEATURE_BASE - XDDPackage.TNETWORK_MANAGEMENT__GENERAL_FEATURES,
                    null, msgs);
            if (newGeneralFeatures != null)
                msgs = ((InternalEObject) newGeneralFeatures).eInverseAdd(
                    this,
                    EOPPOSITE_FEATURE_BASE - XDDPackage.TNETWORK_MANAGEMENT__GENERAL_FEATURES,
                    null, msgs);
            msgs = basicSetGeneralFeatures(newGeneralFeatures, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TNETWORK_MANAGEMENT__GENERAL_FEATURES, newGeneralFeatures,
                newGeneralFeatures));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TMNFeatures getMNFeatures() {
        return mNFeatures;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetMNFeatures(TMNFeatures newMNFeatures, NotificationChain msgs) {
        TMNFeatures oldMNFeatures = mNFeatures;
        mNFeatures = newMNFeatures;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TNETWORK_MANAGEMENT__MN_FEATURES, oldMNFeatures, newMNFeatures);
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
    public void setMNFeatures(TMNFeatures newMNFeatures) {
        if (newMNFeatures != mNFeatures) {
            NotificationChain msgs = null;
            if (mNFeatures != null)
                msgs = ((InternalEObject) mNFeatures).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TNETWORK_MANAGEMENT__MN_FEATURES, null, msgs);
            if (newMNFeatures != null)
                msgs = ((InternalEObject) newMNFeatures).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TNETWORK_MANAGEMENT__MN_FEATURES, null, msgs);
            msgs = basicSetMNFeatures(newMNFeatures, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TNETWORK_MANAGEMENT__MN_FEATURES, newMNFeatures, newMNFeatures));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TCNFeatures getCNFeatures() {
        return cNFeatures;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetCNFeatures(TCNFeatures newCNFeatures, NotificationChain msgs) {
        TCNFeatures oldCNFeatures = cNFeatures;
        cNFeatures = newCNFeatures;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TNETWORK_MANAGEMENT__CN_FEATURES, oldCNFeatures, newCNFeatures);
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
    public void setCNFeatures(TCNFeatures newCNFeatures) {
        if (newCNFeatures != cNFeatures) {
            NotificationChain msgs = null;
            if (cNFeatures != null)
                msgs = ((InternalEObject) cNFeatures).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TNETWORK_MANAGEMENT__CN_FEATURES, null, msgs);
            if (newCNFeatures != null)
                msgs = ((InternalEObject) newCNFeatures).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TNETWORK_MANAGEMENT__CN_FEATURES, null, msgs);
            msgs = basicSetCNFeatures(newCNFeatures, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TNETWORK_MANAGEMENT__CN_FEATURES, newCNFeatures, newCNFeatures));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TDeviceCommissioning getDeviceCommissioning() {
        return deviceCommissioning;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain
        basicSetDeviceCommissioning(TDeviceCommissioning newDeviceCommissioning,
            NotificationChain msgs) {
        TDeviceCommissioning oldDeviceCommissioning = deviceCommissioning;
        deviceCommissioning = newDeviceCommissioning;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TNETWORK_MANAGEMENT__DEVICE_COMMISSIONING, oldDeviceCommissioning,
                newDeviceCommissioning);
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
    public void setDeviceCommissioning(TDeviceCommissioning newDeviceCommissioning) {
        if (newDeviceCommissioning != deviceCommissioning) {
            NotificationChain msgs = null;
            if (deviceCommissioning != null)
                msgs = ((InternalEObject) deviceCommissioning).eInverseRemove(
                    this, EOPPOSITE_FEATURE_BASE
                        - XDDPackage.TNETWORK_MANAGEMENT__DEVICE_COMMISSIONING, null, msgs);
            if (newDeviceCommissioning != null)
                msgs = ((InternalEObject) newDeviceCommissioning).eInverseAdd(
                    this, EOPPOSITE_FEATURE_BASE
                        - XDDPackage.TNETWORK_MANAGEMENT__DEVICE_COMMISSIONING, null, msgs);
            msgs = basicSetDeviceCommissioning(newDeviceCommissioning, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TNETWORK_MANAGEMENT__DEVICE_COMMISSIONING, newDeviceCommissioning,
                newDeviceCommissioning));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TDiagnostic getDiagnostic() {
        return diagnostic;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetDiagnostic(TDiagnostic newDiagnostic, NotificationChain msgs) {
        TDiagnostic oldDiagnostic = diagnostic;
        diagnostic = newDiagnostic;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TNETWORK_MANAGEMENT__DIAGNOSTIC, oldDiagnostic, newDiagnostic);
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
    public void setDiagnostic(TDiagnostic newDiagnostic) {
        if (newDiagnostic != diagnostic) {
            NotificationChain msgs = null;
            if (diagnostic != null)
                msgs = ((InternalEObject) diagnostic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TNETWORK_MANAGEMENT__DIAGNOSTIC, null, msgs);
            if (newDiagnostic != null)
                msgs = ((InternalEObject) newDiagnostic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TNETWORK_MANAGEMENT__DIAGNOSTIC, null, msgs);
            msgs = basicSetDiagnostic(newDiagnostic, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TNETWORK_MANAGEMENT__DIAGNOSTIC, newDiagnostic, newDiagnostic));
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
            case XDDPackage.TNETWORK_MANAGEMENT__GENERAL_FEATURES:
                return basicSetGeneralFeatures(null, msgs);
            case XDDPackage.TNETWORK_MANAGEMENT__MN_FEATURES:
                return basicSetMNFeatures(null, msgs);
            case XDDPackage.TNETWORK_MANAGEMENT__CN_FEATURES:
                return basicSetCNFeatures(null, msgs);
            case XDDPackage.TNETWORK_MANAGEMENT__DEVICE_COMMISSIONING:
                return basicSetDeviceCommissioning(null, msgs);
            case XDDPackage.TNETWORK_MANAGEMENT__DIAGNOSTIC:
                return basicSetDiagnostic(null, msgs);
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
            case XDDPackage.TNETWORK_MANAGEMENT__GENERAL_FEATURES:
                return getGeneralFeatures();
            case XDDPackage.TNETWORK_MANAGEMENT__MN_FEATURES:
                return getMNFeatures();
            case XDDPackage.TNETWORK_MANAGEMENT__CN_FEATURES:
                return getCNFeatures();
            case XDDPackage.TNETWORK_MANAGEMENT__DEVICE_COMMISSIONING:
                return getDeviceCommissioning();
            case XDDPackage.TNETWORK_MANAGEMENT__DIAGNOSTIC:
                return getDiagnostic();
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
            case XDDPackage.TNETWORK_MANAGEMENT__GENERAL_FEATURES:
                setGeneralFeatures((TGeneralFeatures) newValue);
                return;
            case XDDPackage.TNETWORK_MANAGEMENT__MN_FEATURES:
                setMNFeatures((TMNFeatures) newValue);
                return;
            case XDDPackage.TNETWORK_MANAGEMENT__CN_FEATURES:
                setCNFeatures((TCNFeatures) newValue);
                return;
            case XDDPackage.TNETWORK_MANAGEMENT__DEVICE_COMMISSIONING:
                setDeviceCommissioning((TDeviceCommissioning) newValue);
                return;
            case XDDPackage.TNETWORK_MANAGEMENT__DIAGNOSTIC:
                setDiagnostic((TDiagnostic) newValue);
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
            case XDDPackage.TNETWORK_MANAGEMENT__GENERAL_FEATURES:
                setGeneralFeatures((TGeneralFeatures) null);
                return;
            case XDDPackage.TNETWORK_MANAGEMENT__MN_FEATURES:
                setMNFeatures((TMNFeatures) null);
                return;
            case XDDPackage.TNETWORK_MANAGEMENT__CN_FEATURES:
                setCNFeatures((TCNFeatures) null);
                return;
            case XDDPackage.TNETWORK_MANAGEMENT__DEVICE_COMMISSIONING:
                setDeviceCommissioning((TDeviceCommissioning) null);
                return;
            case XDDPackage.TNETWORK_MANAGEMENT__DIAGNOSTIC:
                setDiagnostic((TDiagnostic) null);
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
            case XDDPackage.TNETWORK_MANAGEMENT__GENERAL_FEATURES:
                return generalFeatures != null;
            case XDDPackage.TNETWORK_MANAGEMENT__MN_FEATURES:
                return mNFeatures != null;
            case XDDPackage.TNETWORK_MANAGEMENT__CN_FEATURES:
                return cNFeatures != null;
            case XDDPackage.TNETWORK_MANAGEMENT__DEVICE_COMMISSIONING:
                return deviceCommissioning != null;
            case XDDPackage.TNETWORK_MANAGEMENT__DIAGNOSTIC:
                return diagnostic != null;
        }
        return super.eIsSet(featureID);
    }

} //TNetworkManagementImpl
