/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.TCapabilities;
import com.br_automation.buoat.xddeditor.XDD.TDeviceFunction;
import com.br_automation.buoat.xddeditor.XDD.TDictionaryList;
import com.br_automation.buoat.xddeditor.XDD.TPicturesList;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>TDevice Function</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceFunctionImpl#getCapabilities
 * <em>Capabilities</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceFunctionImpl#getPicturesList
 * <em>Pictures List</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceFunctionImpl#getDictionaryList
 * <em>Dictionary List</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TDeviceFunctionImpl extends EObjectImpl implements TDeviceFunction {
    /**
     * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}
     * ' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getCapabilities()
     * @generated
     * @ordered
     */
    protected TCapabilities capabilities;

    /**
     * The cached value of the '{@link #getPicturesList()
     * <em>Pictures List</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getPicturesList()
     * @generated
     * @ordered
     */
    protected TPicturesList picturesList;

    /**
     * The cached value of the '{@link #getDictionaryList()
     * <em>Dictionary List</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getDictionaryList()
     * @generated
     * @ordered
     */
    protected TDictionaryList dictionaryList;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TDeviceFunctionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getTDeviceFunction();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TCapabilities getCapabilities() {
        return capabilities;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetCapabilities(TCapabilities newCapabilities,
        NotificationChain msgs) {
        TCapabilities oldCapabilities = capabilities;
        capabilities = newCapabilities;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDEVICE_FUNCTION__CAPABILITIES, oldCapabilities, newCapabilities);
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
    public void setCapabilities(TCapabilities newCapabilities) {
        if (newCapabilities != capabilities) {
            NotificationChain msgs = null;
            if (capabilities != null)
                msgs = ((InternalEObject) capabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TDEVICE_FUNCTION__CAPABILITIES, null, msgs);
            if (newCapabilities != null)
                msgs = ((InternalEObject) newCapabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TDEVICE_FUNCTION__CAPABILITIES, null, msgs);
            msgs = basicSetCapabilities(newCapabilities, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDEVICE_FUNCTION__CAPABILITIES, newCapabilities, newCapabilities));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TPicturesList getPicturesList() {
        return picturesList;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetPicturesList(TPicturesList newPicturesList,
        NotificationChain msgs) {
        TPicturesList oldPicturesList = picturesList;
        picturesList = newPicturesList;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDEVICE_FUNCTION__PICTURES_LIST, oldPicturesList, newPicturesList);
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
    public void setPicturesList(TPicturesList newPicturesList) {
        if (newPicturesList != picturesList) {
            NotificationChain msgs = null;
            if (picturesList != null)
                msgs = ((InternalEObject) picturesList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TDEVICE_FUNCTION__PICTURES_LIST, null, msgs);
            if (newPicturesList != null)
                msgs = ((InternalEObject) newPicturesList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TDEVICE_FUNCTION__PICTURES_LIST, null, msgs);
            msgs = basicSetPicturesList(newPicturesList, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDEVICE_FUNCTION__PICTURES_LIST, newPicturesList, newPicturesList));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TDictionaryList getDictionaryList() {
        return dictionaryList;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetDictionaryList(TDictionaryList newDictionaryList,
        NotificationChain msgs) {
        TDictionaryList oldDictionaryList = dictionaryList;
        dictionaryList = newDictionaryList;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDEVICE_FUNCTION__DICTIONARY_LIST, oldDictionaryList, newDictionaryList);
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
    public void setDictionaryList(TDictionaryList newDictionaryList) {
        if (newDictionaryList != dictionaryList) {
            NotificationChain msgs = null;
            if (dictionaryList != null)
                msgs = ((InternalEObject) dictionaryList).eInverseRemove(
                    this, EOPPOSITE_FEATURE_BASE - XDDPackage.TDEVICE_FUNCTION__DICTIONARY_LIST,
                    null, msgs);
            if (newDictionaryList != null)
                msgs = ((InternalEObject) newDictionaryList).eInverseAdd(
                    this, EOPPOSITE_FEATURE_BASE - XDDPackage.TDEVICE_FUNCTION__DICTIONARY_LIST,
                    null, msgs);
            msgs = basicSetDictionaryList(newDictionaryList, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDEVICE_FUNCTION__DICTIONARY_LIST, newDictionaryList, newDictionaryList));
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
            case XDDPackage.TDEVICE_FUNCTION__CAPABILITIES:
                return basicSetCapabilities(null, msgs);
            case XDDPackage.TDEVICE_FUNCTION__PICTURES_LIST:
                return basicSetPicturesList(null, msgs);
            case XDDPackage.TDEVICE_FUNCTION__DICTIONARY_LIST:
                return basicSetDictionaryList(null, msgs);
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
            case XDDPackage.TDEVICE_FUNCTION__CAPABILITIES:
                return getCapabilities();
            case XDDPackage.TDEVICE_FUNCTION__PICTURES_LIST:
                return getPicturesList();
            case XDDPackage.TDEVICE_FUNCTION__DICTIONARY_LIST:
                return getDictionaryList();
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
            case XDDPackage.TDEVICE_FUNCTION__CAPABILITIES:
                setCapabilities((TCapabilities) newValue);
                return;
            case XDDPackage.TDEVICE_FUNCTION__PICTURES_LIST:
                setPicturesList((TPicturesList) newValue);
                return;
            case XDDPackage.TDEVICE_FUNCTION__DICTIONARY_LIST:
                setDictionaryList((TDictionaryList) newValue);
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
            case XDDPackage.TDEVICE_FUNCTION__CAPABILITIES:
                setCapabilities((TCapabilities) null);
                return;
            case XDDPackage.TDEVICE_FUNCTION__PICTURES_LIST:
                setPicturesList((TPicturesList) null);
                return;
            case XDDPackage.TDEVICE_FUNCTION__DICTIONARY_LIST:
                setDictionaryList((TDictionaryList) null);
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
            case XDDPackage.TDEVICE_FUNCTION__CAPABILITIES:
                return capabilities != null;
            case XDDPackage.TDEVICE_FUNCTION__PICTURES_LIST:
                return picturesList != null;
            case XDDPackage.TDEVICE_FUNCTION__DICTIONARY_LIST:
                return dictionaryList != null;
        }
        return super.eIsSet(featureID);
    }

} //TDeviceFunctionImpl
