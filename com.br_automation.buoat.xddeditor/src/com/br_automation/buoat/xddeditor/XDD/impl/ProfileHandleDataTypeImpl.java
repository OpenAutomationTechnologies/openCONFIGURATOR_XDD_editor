/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.ProfileHandleDataType;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Profile Handle Data Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileHandleDataTypeImpl#getProfileIdentification
 * <em>Profile Identification</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileHandleDataTypeImpl#getProfileRevision
 * <em>Profile Revision</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileHandleDataTypeImpl#getProfileLocation
 * <em>Profile Location</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ProfileHandleDataTypeImpl extends EObjectImpl implements ProfileHandleDataType {
    /**
     * The default value of the '{@link #getProfileIdentification()
     * <em>Profile Identification</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getProfileIdentification()
     * @generated
     * @ordered
     */
    protected static final String PROFILE_IDENTIFICATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProfileIdentification()
     * <em>Profile Identification</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getProfileIdentification()
     * @generated
     * @ordered
     */
    protected String profileIdentification = PROFILE_IDENTIFICATION_EDEFAULT;

    /**
     * The default value of the '{@link #getProfileRevision()
     * <em>Profile Revision</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getProfileRevision()
     * @generated
     * @ordered
     */
    protected static final String PROFILE_REVISION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProfileRevision()
     * <em>Profile Revision</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getProfileRevision()
     * @generated
     * @ordered
     */
    protected String profileRevision = PROFILE_REVISION_EDEFAULT;

    /**
     * The default value of the '{@link #getProfileLocation()
     * <em>Profile Location</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getProfileLocation()
     * @generated
     * @ordered
     */
    protected static final String PROFILE_LOCATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProfileLocation()
     * <em>Profile Location</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getProfileLocation()
     * @generated
     * @ordered
     */
    protected String profileLocation = PROFILE_LOCATION_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ProfileHandleDataTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getProfileHandleDataType();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getProfileIdentification() {
        return profileIdentification;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setProfileIdentification(String newProfileIdentification) {
        String oldProfileIdentification = profileIdentification;
        profileIdentification = newProfileIdentification;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.PROFILE_HANDLE_DATA_TYPE__PROFILE_IDENTIFICATION,
                oldProfileIdentification, profileIdentification));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getProfileRevision() {
        return profileRevision;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setProfileRevision(String newProfileRevision) {
        String oldProfileRevision = profileRevision;
        profileRevision = newProfileRevision;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.PROFILE_HANDLE_DATA_TYPE__PROFILE_REVISION, oldProfileRevision,
                profileRevision));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getProfileLocation() {
        return profileLocation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setProfileLocation(String newProfileLocation) {
        String oldProfileLocation = profileLocation;
        profileLocation = newProfileLocation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.PROFILE_HANDLE_DATA_TYPE__PROFILE_LOCATION, oldProfileLocation,
                profileLocation));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XDDPackage.PROFILE_HANDLE_DATA_TYPE__PROFILE_IDENTIFICATION:
                return getProfileIdentification();
            case XDDPackage.PROFILE_HANDLE_DATA_TYPE__PROFILE_REVISION:
                return getProfileRevision();
            case XDDPackage.PROFILE_HANDLE_DATA_TYPE__PROFILE_LOCATION:
                return getProfileLocation();
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
            case XDDPackage.PROFILE_HANDLE_DATA_TYPE__PROFILE_IDENTIFICATION:
                setProfileIdentification((String) newValue);
                return;
            case XDDPackage.PROFILE_HANDLE_DATA_TYPE__PROFILE_REVISION:
                setProfileRevision((String) newValue);
                return;
            case XDDPackage.PROFILE_HANDLE_DATA_TYPE__PROFILE_LOCATION:
                setProfileLocation((String) newValue);
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
            case XDDPackage.PROFILE_HANDLE_DATA_TYPE__PROFILE_IDENTIFICATION:
                setProfileIdentification(PROFILE_IDENTIFICATION_EDEFAULT);
                return;
            case XDDPackage.PROFILE_HANDLE_DATA_TYPE__PROFILE_REVISION:
                setProfileRevision(PROFILE_REVISION_EDEFAULT);
                return;
            case XDDPackage.PROFILE_HANDLE_DATA_TYPE__PROFILE_LOCATION:
                setProfileLocation(PROFILE_LOCATION_EDEFAULT);
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
            case XDDPackage.PROFILE_HANDLE_DATA_TYPE__PROFILE_IDENTIFICATION:
                return PROFILE_IDENTIFICATION_EDEFAULT == null ? profileIdentification != null
                    : !PROFILE_IDENTIFICATION_EDEFAULT.equals(profileIdentification);
            case XDDPackage.PROFILE_HANDLE_DATA_TYPE__PROFILE_REVISION:
                return PROFILE_REVISION_EDEFAULT == null ? profileRevision != null
                    : !PROFILE_REVISION_EDEFAULT.equals(profileRevision);
            case XDDPackage.PROFILE_HANDLE_DATA_TYPE__PROFILE_LOCATION:
                return PROFILE_LOCATION_EDEFAULT == null ? profileLocation != null
                    : !PROFILE_LOCATION_EDEFAULT.equals(profileLocation);
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
        result.append(" (profileIdentification: ");
        result.append(profileIdentification);
        result.append(", profileRevision: ");
        result.append(profileRevision);
        result.append(", profileLocation: ");
        result.append(profileLocation);
        result.append(')');
        return result.toString();
    }

} //ProfileHandleDataTypeImpl
