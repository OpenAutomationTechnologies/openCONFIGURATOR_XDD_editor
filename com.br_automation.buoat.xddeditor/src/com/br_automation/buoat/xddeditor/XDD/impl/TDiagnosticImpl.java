/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.ErrorListType;
import com.br_automation.buoat.xddeditor.XDD.StaticErrorBitFieldType;
import com.br_automation.buoat.xddeditor.XDD.TDiagnostic;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>TDiagnostic</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDiagnosticImpl#getGroup
 * <em>Group</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDiagnosticImpl#getErrorList
 * <em>Error List</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDiagnosticImpl#getStaticErrorBitField
 * <em>Static Error Bit Field</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TDiagnosticImpl extends EObjectImpl implements TDiagnostic {
    /**
     * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap group;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TDiagnosticImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getTDiagnostic();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, XDDPackage.TDIAGNOSTIC__GROUP);
        }
        return group;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<ErrorListType> getErrorList() {
        return getGroup().list(XDDPackage.eINSTANCE.getTDiagnostic_ErrorList());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<StaticErrorBitFieldType> getStaticErrorBitField() {
        return getGroup().list(XDDPackage.eINSTANCE.getTDiagnostic_StaticErrorBitField());
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
            case XDDPackage.TDIAGNOSTIC__GROUP:
                return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
            case XDDPackage.TDIAGNOSTIC__ERROR_LIST:
                return ((InternalEList<?>) getErrorList()).basicRemove(otherEnd, msgs);
            case XDDPackage.TDIAGNOSTIC__STATIC_ERROR_BIT_FIELD:
                return ((InternalEList<?>) getStaticErrorBitField()).basicRemove(otherEnd, msgs);
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
            case XDDPackage.TDIAGNOSTIC__GROUP:
                if (coreType)
                    return getGroup();
                return ((FeatureMap.Internal) getGroup()).getWrapper();
            case XDDPackage.TDIAGNOSTIC__ERROR_LIST:
                return getErrorList();
            case XDDPackage.TDIAGNOSTIC__STATIC_ERROR_BIT_FIELD:
                return getStaticErrorBitField();
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
            case XDDPackage.TDIAGNOSTIC__GROUP:
                ((FeatureMap.Internal) getGroup()).set(newValue);
                return;
            case XDDPackage.TDIAGNOSTIC__ERROR_LIST:
                getErrorList().clear();
                getErrorList().addAll((Collection<? extends ErrorListType>) newValue);
                return;
            case XDDPackage.TDIAGNOSTIC__STATIC_ERROR_BIT_FIELD:
                getStaticErrorBitField().clear();
                getStaticErrorBitField().addAll(
                    (Collection<? extends StaticErrorBitFieldType>) newValue);
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
            case XDDPackage.TDIAGNOSTIC__GROUP:
                getGroup().clear();
                return;
            case XDDPackage.TDIAGNOSTIC__ERROR_LIST:
                getErrorList().clear();
                return;
            case XDDPackage.TDIAGNOSTIC__STATIC_ERROR_BIT_FIELD:
                getStaticErrorBitField().clear();
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
            case XDDPackage.TDIAGNOSTIC__GROUP:
                return group != null && !group.isEmpty();
            case XDDPackage.TDIAGNOSTIC__ERROR_LIST:
                return !getErrorList().isEmpty();
            case XDDPackage.TDIAGNOSTIC__STATIC_ERROR_BIT_FIELD:
                return !getStaticErrorBitField().isEmpty();
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
        result.append(" (group: ");
        result.append(group);
        result.append(')');
        return result.toString();
    }

} //TDiagnosticImpl
