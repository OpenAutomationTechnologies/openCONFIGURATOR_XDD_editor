/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.DeviceClassType;
import com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink;
import com.br_automation.buoat.xddeditor.XDD.ProfileHandleDataType;
import com.br_automation.buoat.xddeditor.XDD.TApplicationProcess;
import com.br_automation.buoat.xddeditor.XDD.TDeviceFunction;
import com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity;
import com.br_automation.buoat.xddeditor.XDD.TDeviceManager;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Profile Body Device Powerlink</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyDevicePowerlinkImpl#getDeviceIdentity
 * <em>Device Identity</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyDevicePowerlinkImpl#getDeviceManager
 * <em>Device Manager</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyDevicePowerlinkImpl#getDeviceFunction
 * <em>Device Function</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyDevicePowerlinkImpl#getApplicationProcess
 * <em>Application Process</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyDevicePowerlinkImpl#getExternalProfileHandle
 * <em>External Profile Handle</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyDevicePowerlinkImpl#getDeviceClass
 * <em>Device Class</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ProfileBodyDevicePowerlinkImpl extends ProfileBodyDataTypeImpl implements
    ProfileBodyDevicePowerlink {
    /**
     * The cached value of the '{@link #getDeviceIdentity()
     * <em>Device Identity</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getDeviceIdentity()
     * @generated
     * @ordered
     */
    protected TDeviceIdentity deviceIdentity;

    /**
     * The cached value of the '{@link #getDeviceManager()
     * <em>Device Manager</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getDeviceManager()
     * @generated
     * @ordered
     */
    protected TDeviceManager deviceManager;

    /**
     * The cached value of the '{@link #getDeviceFunction()
     * <em>Device Function</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getDeviceFunction()
     * @generated
     * @ordered
     */
    protected EList<TDeviceFunction> deviceFunction;

    /**
     * The cached value of the '{@link #getApplicationProcess()
     * <em>Application Process</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getApplicationProcess()
     * @generated
     * @ordered
     */
    protected EList<TApplicationProcess> applicationProcess;

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
     * The default value of the '{@link #getDeviceClass() <em>Device Class</em>}
     * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getDeviceClass()
     * @generated
     * @ordered
     */
    protected static final DeviceClassType DEVICE_CLASS_EDEFAULT = DeviceClassType.COMPACT;

    /**
     * The cached value of the '{@link #getDeviceClass() <em>Device Class</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getDeviceClass()
     * @generated
     * @ordered
     */
    protected DeviceClassType deviceClass = DEVICE_CLASS_EDEFAULT;

    /**
     * This is true if the Device Class attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean deviceClassESet;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ProfileBodyDevicePowerlinkImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getProfileBodyDevicePowerlink();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TDeviceIdentity getDeviceIdentity() {
        return deviceIdentity;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetDeviceIdentity(TDeviceIdentity newDeviceIdentity,
        NotificationChain msgs) {
        TDeviceIdentity oldDeviceIdentity = deviceIdentity;
        deviceIdentity = newDeviceIdentity;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_IDENTITY, oldDeviceIdentity,
                newDeviceIdentity);
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
    public void setDeviceIdentity(TDeviceIdentity newDeviceIdentity) {
        if (newDeviceIdentity != deviceIdentity) {
            NotificationChain msgs = null;
            if (deviceIdentity != null)
                msgs = ((InternalEObject) deviceIdentity).eInverseRemove(
                    this, EOPPOSITE_FEATURE_BASE
                        - XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_IDENTITY, null, msgs);
            if (newDeviceIdentity != null)
                msgs = ((InternalEObject) newDeviceIdentity).eInverseAdd(
                    this, EOPPOSITE_FEATURE_BASE
                        - XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_IDENTITY, null, msgs);
            msgs = basicSetDeviceIdentity(newDeviceIdentity, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_IDENTITY, newDeviceIdentity,
                newDeviceIdentity));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TDeviceManager getDeviceManager() {
        return deviceManager;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetDeviceManager(TDeviceManager newDeviceManager,
        NotificationChain msgs) {
        TDeviceManager oldDeviceManager = deviceManager;
        deviceManager = newDeviceManager;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_MANAGER, oldDeviceManager,
                newDeviceManager);
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
    public void setDeviceManager(TDeviceManager newDeviceManager) {
        if (newDeviceManager != deviceManager) {
            NotificationChain msgs = null;
            if (deviceManager != null)
                msgs = ((InternalEObject) deviceManager).eInverseRemove(
                    this, EOPPOSITE_FEATURE_BASE
                        - XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_MANAGER, null, msgs);
            if (newDeviceManager != null)
                msgs = ((InternalEObject) newDeviceManager).eInverseAdd(
                    this, EOPPOSITE_FEATURE_BASE
                        - XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_MANAGER, null, msgs);
            msgs = basicSetDeviceManager(newDeviceManager, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_MANAGER, newDeviceManager,
                newDeviceManager));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<TDeviceFunction> getDeviceFunction() {
        if (deviceFunction == null) {
            deviceFunction = new EObjectContainmentEList<TDeviceFunction>(TDeviceFunction.class,
                this, XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_FUNCTION);
        }
        return deviceFunction;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<TApplicationProcess> getApplicationProcess() {
        if (applicationProcess == null) {
            applicationProcess = new EObjectContainmentEList<TApplicationProcess>(
                TApplicationProcess.class, this,
                XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__APPLICATION_PROCESS);
        }
        return applicationProcess;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<ProfileHandleDataType> getExternalProfileHandle() {
        if (externalProfileHandle == null) {
            externalProfileHandle = new EObjectContainmentEList<ProfileHandleDataType>(
                ProfileHandleDataType.class, this,
                XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__EXTERNAL_PROFILE_HANDLE);
        }
        return externalProfileHandle;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public DeviceClassType getDeviceClass() {
        return deviceClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setDeviceClass(DeviceClassType newDeviceClass) {
        DeviceClassType oldDeviceClass = deviceClass;
        deviceClass = newDeviceClass == null ? DEVICE_CLASS_EDEFAULT : newDeviceClass;
        boolean oldDeviceClassESet = deviceClassESet;
        deviceClassESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_CLASS, oldDeviceClass,
                deviceClass, !oldDeviceClassESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetDeviceClass() {
        DeviceClassType oldDeviceClass = deviceClass;
        boolean oldDeviceClassESet = deviceClassESet;
        deviceClass = DEVICE_CLASS_EDEFAULT;
        deviceClassESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_CLASS, oldDeviceClass,
                DEVICE_CLASS_EDEFAULT, oldDeviceClassESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetDeviceClass() {
        return deviceClassESet;
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
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_IDENTITY:
                return basicSetDeviceIdentity(null, msgs);
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_MANAGER:
                return basicSetDeviceManager(null, msgs);
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_FUNCTION:
                return ((InternalEList<?>) getDeviceFunction()).basicRemove(otherEnd, msgs);
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__APPLICATION_PROCESS:
                return ((InternalEList<?>) getApplicationProcess()).basicRemove(otherEnd, msgs);
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__EXTERNAL_PROFILE_HANDLE:
                return ((InternalEList<?>) getExternalProfileHandle()).basicRemove(otherEnd, msgs);
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
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_IDENTITY:
                return getDeviceIdentity();
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_MANAGER:
                return getDeviceManager();
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_FUNCTION:
                return getDeviceFunction();
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__APPLICATION_PROCESS:
                return getApplicationProcess();
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__EXTERNAL_PROFILE_HANDLE:
                return getExternalProfileHandle();
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_CLASS:
                return getDeviceClass();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_IDENTITY:
                setDeviceIdentity((TDeviceIdentity) newValue);
                return;
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_MANAGER:
                setDeviceManager((TDeviceManager) newValue);
                return;
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_FUNCTION:
                getDeviceFunction().clear();
                getDeviceFunction().addAll((Collection<? extends TDeviceFunction>) newValue);
                return;
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__APPLICATION_PROCESS:
                getApplicationProcess().clear();
                getApplicationProcess()
                    .addAll((Collection<? extends TApplicationProcess>) newValue);
                return;
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__EXTERNAL_PROFILE_HANDLE:
                getExternalProfileHandle().clear();
                getExternalProfileHandle().addAll(
                    (Collection<? extends ProfileHandleDataType>) newValue);
                return;
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_CLASS:
                setDeviceClass((DeviceClassType) newValue);
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
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_IDENTITY:
                setDeviceIdentity((TDeviceIdentity) null);
                return;
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_MANAGER:
                setDeviceManager((TDeviceManager) null);
                return;
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_FUNCTION:
                getDeviceFunction().clear();
                return;
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__APPLICATION_PROCESS:
                getApplicationProcess().clear();
                return;
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__EXTERNAL_PROFILE_HANDLE:
                getExternalProfileHandle().clear();
                return;
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_CLASS:
                unsetDeviceClass();
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
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_IDENTITY:
                return deviceIdentity != null;
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_MANAGER:
                return deviceManager != null;
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_FUNCTION:
                return deviceFunction != null && !deviceFunction.isEmpty();
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__APPLICATION_PROCESS:
                return applicationProcess != null && !applicationProcess.isEmpty();
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__EXTERNAL_PROFILE_HANDLE:
                return externalProfileHandle != null && !externalProfileHandle.isEmpty();
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK__DEVICE_CLASS:
                return isSetDeviceClass();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (deviceClass: ");
        if (deviceClassESet)
            result.append(deviceClass);
        else
            result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ProfileBodyDevicePowerlinkImpl
