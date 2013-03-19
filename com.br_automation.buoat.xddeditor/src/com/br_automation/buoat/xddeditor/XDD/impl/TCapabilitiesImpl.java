/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.CharacteristicsListType;
import com.br_automation.buoat.xddeditor.XDD.StandardComplianceListType;
import com.br_automation.buoat.xddeditor.XDD.TCapabilities;
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
 * <em><b>TCapabilities</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TCapabilitiesImpl#getCharacteristicsList
 * <em>Characteristics List</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TCapabilitiesImpl#getStandardComplianceList
 * <em>Standard Compliance List</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TCapabilitiesImpl extends EObjectImpl implements TCapabilities {
    /**
     * The cached value of the '{@link #getCharacteristicsList()
     * <em>Characteristics List</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getCharacteristicsList()
     * @generated
     * @ordered
     */
    protected EList<CharacteristicsListType> characteristicsList;

    /**
     * The cached value of the '{@link #getStandardComplianceList()
     * <em>Standard Compliance List</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getStandardComplianceList()
     * @generated
     * @ordered
     */
    protected StandardComplianceListType standardComplianceList;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TCapabilitiesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getTCapabilities();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<CharacteristicsListType> getCharacteristicsList() {
        if (characteristicsList == null) {
            characteristicsList = new EObjectContainmentEList<CharacteristicsListType>(
                CharacteristicsListType.class, this, XDDPackage.TCAPABILITIES__CHARACTERISTICS_LIST);
        }
        return characteristicsList;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public StandardComplianceListType getStandardComplianceList() {
        return standardComplianceList;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain
        basicSetStandardComplianceList(StandardComplianceListType newStandardComplianceList,
            NotificationChain msgs) {
        StandardComplianceListType oldStandardComplianceList = standardComplianceList;
        standardComplianceList = newStandardComplianceList;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TCAPABILITIES__STANDARD_COMPLIANCE_LIST, oldStandardComplianceList,
                newStandardComplianceList);
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
    public void setStandardComplianceList(StandardComplianceListType newStandardComplianceList) {
        if (newStandardComplianceList != standardComplianceList) {
            NotificationChain msgs = null;
            if (standardComplianceList != null)
                msgs = ((InternalEObject) standardComplianceList).eInverseRemove(
                    this, EOPPOSITE_FEATURE_BASE
                        - XDDPackage.TCAPABILITIES__STANDARD_COMPLIANCE_LIST, null, msgs);
            if (newStandardComplianceList != null)
                msgs = ((InternalEObject) newStandardComplianceList).eInverseAdd(
                    this, EOPPOSITE_FEATURE_BASE
                        - XDDPackage.TCAPABILITIES__STANDARD_COMPLIANCE_LIST, null, msgs);
            msgs = basicSetStandardComplianceList(newStandardComplianceList, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TCAPABILITIES__STANDARD_COMPLIANCE_LIST, newStandardComplianceList,
                newStandardComplianceList));
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
            case XDDPackage.TCAPABILITIES__CHARACTERISTICS_LIST:
                return ((InternalEList<?>) getCharacteristicsList()).basicRemove(otherEnd, msgs);
            case XDDPackage.TCAPABILITIES__STANDARD_COMPLIANCE_LIST:
                return basicSetStandardComplianceList(null, msgs);
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
            case XDDPackage.TCAPABILITIES__CHARACTERISTICS_LIST:
                return getCharacteristicsList();
            case XDDPackage.TCAPABILITIES__STANDARD_COMPLIANCE_LIST:
                return getStandardComplianceList();
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
            case XDDPackage.TCAPABILITIES__CHARACTERISTICS_LIST:
                getCharacteristicsList().clear();
                getCharacteristicsList().addAll(
                    (Collection<? extends CharacteristicsListType>) newValue);
                return;
            case XDDPackage.TCAPABILITIES__STANDARD_COMPLIANCE_LIST:
                setStandardComplianceList((StandardComplianceListType) newValue);
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
            case XDDPackage.TCAPABILITIES__CHARACTERISTICS_LIST:
                getCharacteristicsList().clear();
                return;
            case XDDPackage.TCAPABILITIES__STANDARD_COMPLIANCE_LIST:
                setStandardComplianceList((StandardComplianceListType) null);
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
            case XDDPackage.TCAPABILITIES__CHARACTERISTICS_LIST:
                return characteristicsList != null && !characteristicsList.isEmpty();
            case XDDPackage.TCAPABILITIES__STANDARD_COMPLIANCE_LIST:
                return standardComplianceList != null;
        }
        return super.eIsSet(featureID);
    }

} //TCapabilitiesImpl
