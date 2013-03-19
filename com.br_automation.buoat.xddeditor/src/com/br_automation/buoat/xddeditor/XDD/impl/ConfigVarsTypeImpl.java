/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.ConfigVarsType;
import com.br_automation.buoat.xddeditor.XDD.TVarDeclaration;
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
 * <em><b>Config Vars Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ConfigVarsTypeImpl#getVarDeclaration
 * <em>Var Declaration</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ConfigVarsTypeImpl extends EObjectImpl implements ConfigVarsType {
    /**
     * The cached value of the '{@link #getVarDeclaration()
     * <em>Var Declaration</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getVarDeclaration()
     * @generated
     * @ordered
     */
    protected EList<TVarDeclaration> varDeclaration;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ConfigVarsTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getConfigVarsType();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<TVarDeclaration> getVarDeclaration() {
        if (varDeclaration == null) {
            varDeclaration = new EObjectContainmentEList<TVarDeclaration>(TVarDeclaration.class,
                this, XDDPackage.CONFIG_VARS_TYPE__VAR_DECLARATION);
        }
        return varDeclaration;
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
            case XDDPackage.CONFIG_VARS_TYPE__VAR_DECLARATION:
                return ((InternalEList<?>) getVarDeclaration()).basicRemove(otherEnd, msgs);
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
            case XDDPackage.CONFIG_VARS_TYPE__VAR_DECLARATION:
                return getVarDeclaration();
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
            case XDDPackage.CONFIG_VARS_TYPE__VAR_DECLARATION:
                getVarDeclaration().clear();
                getVarDeclaration().addAll((Collection<? extends TVarDeclaration>) newValue);
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
            case XDDPackage.CONFIG_VARS_TYPE__VAR_DECLARATION:
                getVarDeclaration().clear();
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
            case XDDPackage.CONFIG_VARS_TYPE__VAR_DECLARATION:
                return varDeclaration != null && !varDeclaration.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ConfigVarsTypeImpl
