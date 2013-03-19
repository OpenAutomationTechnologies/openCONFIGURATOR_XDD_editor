/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.ISO15745ReferenceDataType;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>ISO15745 Reference Data Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ISO15745ReferenceDataTypeImpl#getISO15745Part
 * <em>ISO15745 Part</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ISO15745ReferenceDataTypeImpl#getISO15745Edition
 * <em>ISO15745 Edition</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ISO15745ReferenceDataTypeImpl#getProfileTechnology
 * <em>Profile Technology</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ISO15745ReferenceDataTypeImpl extends EObjectImpl implements ISO15745ReferenceDataType {
    /**
     * The default value of the '{@link #getISO15745Part()
     * <em>ISO15745 Part</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getISO15745Part()
     * @generated
     * @ordered
     */
    protected static final BigInteger ISO15745_PART_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getISO15745Part()
     * <em>ISO15745 Part</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getISO15745Part()
     * @generated
     * @ordered
     */
    protected BigInteger iSO15745Part = ISO15745_PART_EDEFAULT;

    /**
     * The default value of the '{@link #getISO15745Edition()
     * <em>ISO15745 Edition</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getISO15745Edition()
     * @generated
     * @ordered
     */
    protected static final BigInteger ISO15745_EDITION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getISO15745Edition()
     * <em>ISO15745 Edition</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getISO15745Edition()
     * @generated
     * @ordered
     */
    protected BigInteger iSO15745Edition = ISO15745_EDITION_EDEFAULT;

    /**
     * The default value of the '{@link #getProfileTechnology()
     * <em>Profile Technology</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getProfileTechnology()
     * @generated
     * @ordered
     */
    protected static final String PROFILE_TECHNOLOGY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProfileTechnology()
     * <em>Profile Technology</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getProfileTechnology()
     * @generated
     * @ordered
     */
    protected String profileTechnology = PROFILE_TECHNOLOGY_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ISO15745ReferenceDataTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getISO15745ReferenceDataType();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public BigInteger getISO15745Part() {
        return iSO15745Part;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setISO15745Part(BigInteger newISO15745Part) {
        BigInteger oldISO15745Part = iSO15745Part;
        iSO15745Part = newISO15745Part;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.ISO15745_REFERENCE_DATA_TYPE__ISO15745_PART, oldISO15745Part,
                iSO15745Part));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public BigInteger getISO15745Edition() {
        return iSO15745Edition;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setISO15745Edition(BigInteger newISO15745Edition) {
        BigInteger oldISO15745Edition = iSO15745Edition;
        iSO15745Edition = newISO15745Edition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.ISO15745_REFERENCE_DATA_TYPE__ISO15745_EDITION, oldISO15745Edition,
                iSO15745Edition));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getProfileTechnology() {
        return profileTechnology;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setProfileTechnology(String newProfileTechnology) {
        String oldProfileTechnology = profileTechnology;
        profileTechnology = newProfileTechnology;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.ISO15745_REFERENCE_DATA_TYPE__PROFILE_TECHNOLOGY, oldProfileTechnology,
                profileTechnology));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XDDPackage.ISO15745_REFERENCE_DATA_TYPE__ISO15745_PART:
                return getISO15745Part();
            case XDDPackage.ISO15745_REFERENCE_DATA_TYPE__ISO15745_EDITION:
                return getISO15745Edition();
            case XDDPackage.ISO15745_REFERENCE_DATA_TYPE__PROFILE_TECHNOLOGY:
                return getProfileTechnology();
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
            case XDDPackage.ISO15745_REFERENCE_DATA_TYPE__ISO15745_PART:
                setISO15745Part((BigInteger) newValue);
                return;
            case XDDPackage.ISO15745_REFERENCE_DATA_TYPE__ISO15745_EDITION:
                setISO15745Edition((BigInteger) newValue);
                return;
            case XDDPackage.ISO15745_REFERENCE_DATA_TYPE__PROFILE_TECHNOLOGY:
                setProfileTechnology((String) newValue);
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
            case XDDPackage.ISO15745_REFERENCE_DATA_TYPE__ISO15745_PART:
                setISO15745Part(ISO15745_PART_EDEFAULT);
                return;
            case XDDPackage.ISO15745_REFERENCE_DATA_TYPE__ISO15745_EDITION:
                setISO15745Edition(ISO15745_EDITION_EDEFAULT);
                return;
            case XDDPackage.ISO15745_REFERENCE_DATA_TYPE__PROFILE_TECHNOLOGY:
                setProfileTechnology(PROFILE_TECHNOLOGY_EDEFAULT);
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
            case XDDPackage.ISO15745_REFERENCE_DATA_TYPE__ISO15745_PART:
                return ISO15745_PART_EDEFAULT == null ? iSO15745Part != null
                    : !ISO15745_PART_EDEFAULT.equals(iSO15745Part);
            case XDDPackage.ISO15745_REFERENCE_DATA_TYPE__ISO15745_EDITION:
                return ISO15745_EDITION_EDEFAULT == null ? iSO15745Edition != null
                    : !ISO15745_EDITION_EDEFAULT.equals(iSO15745Edition);
            case XDDPackage.ISO15745_REFERENCE_DATA_TYPE__PROFILE_TECHNOLOGY:
                return PROFILE_TECHNOLOGY_EDEFAULT == null ? profileTechnology != null
                    : !PROFILE_TECHNOLOGY_EDEFAULT.equals(profileTechnology);
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
        result.append(" (iSO15745Part: ");
        result.append(iSO15745Part);
        result.append(", iSO15745Edition: ");
        result.append(iSO15745Edition);
        result.append(", profileTechnology: ");
        result.append(profileTechnology);
        result.append(')');
        return result.toString();
    }

} //ISO15745ReferenceDataTypeImpl
