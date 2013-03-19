/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.CharacteristicContentType;
import com.br_automation.buoat.xddeditor.XDD.CharacteristicNameType;
import com.br_automation.buoat.xddeditor.XDD.CharacteristicType;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Characteristic Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.CharacteristicTypeImpl#getCharacteristicName
 * <em>Characteristic Name</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.CharacteristicTypeImpl#getCharacteristicContent
 * <em>Characteristic Content</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CharacteristicTypeImpl extends EObjectImpl implements CharacteristicType {
    /**
     * The cached value of the '{@link #getCharacteristicName()
     * <em>Characteristic Name</em>}' containment reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getCharacteristicName()
     * @generated
     * @ordered
     */
    protected CharacteristicNameType characteristicName;

    /**
     * The cached value of the '{@link #getCharacteristicContent()
     * <em>Characteristic Content</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getCharacteristicContent()
     * @generated
     * @ordered
     */
    protected EList<CharacteristicContentType> characteristicContent;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected CharacteristicTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getCharacteristicType();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public CharacteristicNameType getCharacteristicName() {
        return characteristicName;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain
        basicSetCharacteristicName(CharacteristicNameType newCharacteristicName,
            NotificationChain msgs) {
        CharacteristicNameType oldCharacteristicName = characteristicName;
        characteristicName = newCharacteristicName;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.CHARACTERISTIC_TYPE__CHARACTERISTIC_NAME, oldCharacteristicName,
                newCharacteristicName);
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
    public void setCharacteristicName(CharacteristicNameType newCharacteristicName) {
        if (newCharacteristicName != characteristicName) {
            NotificationChain msgs = null;
            if (characteristicName != null)
                msgs = ((InternalEObject) characteristicName).eInverseRemove(
                    this, EOPPOSITE_FEATURE_BASE
                        - XDDPackage.CHARACTERISTIC_TYPE__CHARACTERISTIC_NAME, null, msgs);
            if (newCharacteristicName != null)
                msgs = ((InternalEObject) newCharacteristicName).eInverseAdd(
                    this, EOPPOSITE_FEATURE_BASE
                        - XDDPackage.CHARACTERISTIC_TYPE__CHARACTERISTIC_NAME, null, msgs);
            msgs = basicSetCharacteristicName(newCharacteristicName, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.CHARACTERISTIC_TYPE__CHARACTERISTIC_NAME, newCharacteristicName,
                newCharacteristicName));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<CharacteristicContentType> getCharacteristicContent() {
        if (characteristicContent == null) {
            characteristicContent = new EObjectContainmentEList<CharacteristicContentType>(
                CharacteristicContentType.class, this,
                XDDPackage.CHARACTERISTIC_TYPE__CHARACTERISTIC_CONTENT);
        }
        return characteristicContent;
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
            case XDDPackage.CHARACTERISTIC_TYPE__CHARACTERISTIC_NAME:
                return basicSetCharacteristicName(null, msgs);
            case XDDPackage.CHARACTERISTIC_TYPE__CHARACTERISTIC_CONTENT:
                return ((InternalEList<?>) getCharacteristicContent()).basicRemove(otherEnd, msgs);
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
            case XDDPackage.CHARACTERISTIC_TYPE__CHARACTERISTIC_NAME:
                return getCharacteristicName();
            case XDDPackage.CHARACTERISTIC_TYPE__CHARACTERISTIC_CONTENT:
                return getCharacteristicContent();
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
            case XDDPackage.CHARACTERISTIC_TYPE__CHARACTERISTIC_NAME:
                setCharacteristicName((CharacteristicNameType) newValue);
                return;
            case XDDPackage.CHARACTERISTIC_TYPE__CHARACTERISTIC_CONTENT:
                getCharacteristicContent().clear();
                getCharacteristicContent().addAll(
                    (Collection<? extends CharacteristicContentType>) newValue);
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
            case XDDPackage.CHARACTERISTIC_TYPE__CHARACTERISTIC_NAME:
                setCharacteristicName((CharacteristicNameType) null);
                return;
            case XDDPackage.CHARACTERISTIC_TYPE__CHARACTERISTIC_CONTENT:
                getCharacteristicContent().clear();
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
            case XDDPackage.CHARACTERISTIC_TYPE__CHARACTERISTIC_NAME:
                return characteristicName != null;
            case XDDPackage.CHARACTERISTIC_TYPE__CHARACTERISTIC_CONTENT:
                return characteristicContent != null && !characteristicContent.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //CharacteristicTypeImpl
