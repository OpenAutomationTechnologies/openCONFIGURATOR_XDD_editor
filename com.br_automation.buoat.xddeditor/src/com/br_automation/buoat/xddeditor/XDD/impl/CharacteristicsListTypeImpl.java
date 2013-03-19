/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.CategoryType;
import com.br_automation.buoat.xddeditor.XDD.CharacteristicType;
import com.br_automation.buoat.xddeditor.XDD.CharacteristicsListType;
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
 * <em><b>Characteristics List Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.CharacteristicsListTypeImpl#getCategory
 * <em>Category</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.CharacteristicsListTypeImpl#getCharacteristic
 * <em>Characteristic</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CharacteristicsListTypeImpl extends EObjectImpl implements CharacteristicsListType {
    /**
     * The cached value of the '{@link #getCategory() <em>Category</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getCategory()
     * @generated
     * @ordered
     */
    protected CategoryType category;

    /**
     * The cached value of the '{@link #getCharacteristic()
     * <em>Characteristic</em>}' containment reference list. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getCharacteristic()
     * @generated
     * @ordered
     */
    protected EList<CharacteristicType> characteristic;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected CharacteristicsListTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getCharacteristicsListType();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public CategoryType getCategory() {
        return category;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetCategory(CategoryType newCategory, NotificationChain msgs) {
        CategoryType oldCategory = category;
        category = newCategory;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.CHARACTERISTICS_LIST_TYPE__CATEGORY, oldCategory, newCategory);
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
    public void setCategory(CategoryType newCategory) {
        if (newCategory != category) {
            NotificationChain msgs = null;
            if (category != null)
                msgs = ((InternalEObject) category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.CHARACTERISTICS_LIST_TYPE__CATEGORY, null, msgs);
            if (newCategory != null)
                msgs = ((InternalEObject) newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.CHARACTERISTICS_LIST_TYPE__CATEGORY, null, msgs);
            msgs = basicSetCategory(newCategory, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.CHARACTERISTICS_LIST_TYPE__CATEGORY, newCategory, newCategory));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<CharacteristicType> getCharacteristic() {
        if (characteristic == null) {
            characteristic = new EObjectContainmentEList<CharacteristicType>(
                CharacteristicType.class, this,
                XDDPackage.CHARACTERISTICS_LIST_TYPE__CHARACTERISTIC);
        }
        return characteristic;
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
            case XDDPackage.CHARACTERISTICS_LIST_TYPE__CATEGORY:
                return basicSetCategory(null, msgs);
            case XDDPackage.CHARACTERISTICS_LIST_TYPE__CHARACTERISTIC:
                return ((InternalEList<?>) getCharacteristic()).basicRemove(otherEnd, msgs);
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
            case XDDPackage.CHARACTERISTICS_LIST_TYPE__CATEGORY:
                return getCategory();
            case XDDPackage.CHARACTERISTICS_LIST_TYPE__CHARACTERISTIC:
                return getCharacteristic();
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
            case XDDPackage.CHARACTERISTICS_LIST_TYPE__CATEGORY:
                setCategory((CategoryType) newValue);
                return;
            case XDDPackage.CHARACTERISTICS_LIST_TYPE__CHARACTERISTIC:
                getCharacteristic().clear();
                getCharacteristic().addAll((Collection<? extends CharacteristicType>) newValue);
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
            case XDDPackage.CHARACTERISTICS_LIST_TYPE__CATEGORY:
                setCategory((CategoryType) null);
                return;
            case XDDPackage.CHARACTERISTICS_LIST_TYPE__CHARACTERISTIC:
                getCharacteristic().clear();
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
            case XDDPackage.CHARACTERISTICS_LIST_TYPE__CATEGORY:
                return category != null;
            case XDDPackage.CHARACTERISTICS_LIST_TYPE__CHARACTERISTIC:
                return characteristic != null && !characteristic.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //CharacteristicsListTypeImpl
