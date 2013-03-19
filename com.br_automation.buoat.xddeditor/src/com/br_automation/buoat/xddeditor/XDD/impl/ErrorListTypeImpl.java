/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.ErrorConstantDataType;
import com.br_automation.buoat.xddeditor.XDD.ErrorListType;
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
 * <em><b>Error List Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ErrorListTypeImpl#getError
 * <em>Error</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ErrorListTypeImpl extends EObjectImpl implements ErrorListType {
    /**
     * The cached value of the '{@link #getError() <em>Error</em>}' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getError()
     * @generated
     * @ordered
     */
    protected EList<ErrorConstantDataType> error;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ErrorListTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getErrorListType();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<ErrorConstantDataType> getError() {
        if (error == null) {
            error = new EObjectContainmentEList<ErrorConstantDataType>(ErrorConstantDataType.class,
                this, XDDPackage.ERROR_LIST_TYPE__ERROR);
        }
        return error;
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
            case XDDPackage.ERROR_LIST_TYPE__ERROR:
                return ((InternalEList<?>) getError()).basicRemove(otherEnd, msgs);
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
            case XDDPackage.ERROR_LIST_TYPE__ERROR:
                return getError();
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
            case XDDPackage.ERROR_LIST_TYPE__ERROR:
                getError().clear();
                getError().addAll((Collection<? extends ErrorConstantDataType>) newValue);
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
            case XDDPackage.ERROR_LIST_TYPE__ERROR:
                getError().clear();
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
            case XDDPackage.ERROR_LIST_TYPE__ERROR:
                return error != null && !error.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ErrorListTypeImpl
