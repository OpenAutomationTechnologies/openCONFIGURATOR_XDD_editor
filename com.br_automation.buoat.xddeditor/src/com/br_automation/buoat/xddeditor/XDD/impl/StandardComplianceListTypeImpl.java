/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.CompliantWithType;
import com.br_automation.buoat.xddeditor.XDD.StandardComplianceListType;
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
 * <em><b>Standard Compliance List Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.StandardComplianceListTypeImpl#getCompliantWith
 * <em>Compliant With</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class StandardComplianceListTypeImpl extends EObjectImpl implements
    StandardComplianceListType {
    /**
     * The cached value of the '{@link #getCompliantWith()
     * <em>Compliant With</em>}' containment reference list. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getCompliantWith()
     * @generated
     * @ordered
     */
    protected EList<CompliantWithType> compliantWith;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected StandardComplianceListTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getStandardComplianceListType();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<CompliantWithType> getCompliantWith() {
        if (compliantWith == null) {
            compliantWith = new EObjectContainmentEList<CompliantWithType>(CompliantWithType.class,
                this, XDDPackage.STANDARD_COMPLIANCE_LIST_TYPE__COMPLIANT_WITH);
        }
        return compliantWith;
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
            case XDDPackage.STANDARD_COMPLIANCE_LIST_TYPE__COMPLIANT_WITH:
                return ((InternalEList<?>) getCompliantWith()).basicRemove(otherEnd, msgs);
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
            case XDDPackage.STANDARD_COMPLIANCE_LIST_TYPE__COMPLIANT_WITH:
                return getCompliantWith();
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
            case XDDPackage.STANDARD_COMPLIANCE_LIST_TYPE__COMPLIANT_WITH:
                getCompliantWith().clear();
                getCompliantWith().addAll((Collection<? extends CompliantWithType>) newValue);
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
            case XDDPackage.STANDARD_COMPLIANCE_LIST_TYPE__COMPLIANT_WITH:
                getCompliantWith().clear();
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
            case XDDPackage.STANDARD_COMPLIANCE_LIST_TYPE__COMPLIANT_WITH:
                return compliantWith != null && !compliantWith.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //StandardComplianceListTypeImpl
