/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.DataTypeListType;
import com.br_automation.buoat.xddeditor.XDD.TDataTypes;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Data Type List Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.DataTypeListTypeImpl#getDefType
 * <em>Def Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DataTypeListTypeImpl extends EObjectImpl implements DataTypeListType {
    /**
     * The cached value of the '{@link #getDefType() <em>Def Type</em>}'
     * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getDefType()
     * @generated
     * @ordered
     */
    protected EList<TDataTypes> defType;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected DataTypeListTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getDataTypeListType();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<TDataTypes> getDefType() {
        if (defType == null) {
            defType = new EObjectContainmentEList<TDataTypes>(TDataTypes.class, this,
                XDDPackage.DATA_TYPE_LIST_TYPE__DEF_TYPE);
        }
        return defType;
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
            case XDDPackage.DATA_TYPE_LIST_TYPE__DEF_TYPE:
                return ((InternalEList<?>) getDefType()).basicRemove(otherEnd, msgs);
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
            case XDDPackage.DATA_TYPE_LIST_TYPE__DEF_TYPE:
                return getDefType();
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
            case XDDPackage.DATA_TYPE_LIST_TYPE__DEF_TYPE:
                getDefType().clear();
                getDefType().addAll((Collection<? extends TDataTypes>) newValue);
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
            case XDDPackage.DATA_TYPE_LIST_TYPE__DEF_TYPE:
                getDefType().clear();
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
            case XDDPackage.DATA_TYPE_LIST_TYPE__DEF_TYPE:
                return defType != null && !defType.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //DataTypeListTypeImpl
