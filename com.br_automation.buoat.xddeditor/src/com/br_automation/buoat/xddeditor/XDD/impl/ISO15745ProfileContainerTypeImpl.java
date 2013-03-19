/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileContainerType;
import com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileType;
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
 * <em><b>ISO15745 Profile Container Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ISO15745ProfileContainerTypeImpl#getISO15745Profile
 * <em>ISO15745 Profile</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ISO15745ProfileContainerTypeImpl extends EObjectImpl implements
    ISO15745ProfileContainerType {
    /**
     * The cached value of the '{@link #getISO15745Profile()
     * <em>ISO15745 Profile</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getISO15745Profile()
     * @generated
     * @ordered
     */
    protected EList<ISO15745ProfileType> iSO15745Profile;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ISO15745ProfileContainerTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getISO15745ProfileContainerType();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<ISO15745ProfileType> getISO15745Profile() {
        if (iSO15745Profile == null) {
            iSO15745Profile = new EObjectContainmentEList<ISO15745ProfileType>(
                ISO15745ProfileType.class, this,
                XDDPackage.ISO15745_PROFILE_CONTAINER_TYPE__ISO15745_PROFILE);
        }
        return iSO15745Profile;
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
            case XDDPackage.ISO15745_PROFILE_CONTAINER_TYPE__ISO15745_PROFILE:
                return ((InternalEList<?>) getISO15745Profile()).basicRemove(otherEnd, msgs);
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
            case XDDPackage.ISO15745_PROFILE_CONTAINER_TYPE__ISO15745_PROFILE:
                return getISO15745Profile();
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
            case XDDPackage.ISO15745_PROFILE_CONTAINER_TYPE__ISO15745_PROFILE:
                getISO15745Profile().clear();
                getISO15745Profile().addAll((Collection<? extends ISO15745ProfileType>) newValue);
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
            case XDDPackage.ISO15745_PROFILE_CONTAINER_TYPE__ISO15745_PROFILE:
                getISO15745Profile().clear();
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
            case XDDPackage.ISO15745_PROFILE_CONTAINER_TYPE__ISO15745_PROFILE:
                return iSO15745Profile != null && !iSO15745Profile.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ISO15745ProfileContainerTypeImpl
