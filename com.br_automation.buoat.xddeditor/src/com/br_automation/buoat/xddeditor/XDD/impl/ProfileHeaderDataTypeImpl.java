/**
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import com.br_automation.buoat.xddeditor.XDD.ISO15745ReferenceDataType;
import com.br_automation.buoat.xddeditor.XDD.ProfileClassIDDataType;
import com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile Header Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileHeaderDataTypeImpl#getProfileIdentification <em>Profile Identification</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileHeaderDataTypeImpl#getProfileRevision <em>Profile Revision</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileHeaderDataTypeImpl#getProfileName <em>Profile Name</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileHeaderDataTypeImpl#getProfileSource <em>Profile Source</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileHeaderDataTypeImpl#getProfileClassID <em>Profile Class ID</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileHeaderDataTypeImpl#getProfileDate <em>Profile Date</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileHeaderDataTypeImpl#getAdditionalInformation <em>Additional Information</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileHeaderDataTypeImpl#getISO15745Reference <em>ISO15745 Reference</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileHeaderDataTypeImpl#getIASInterfaceType <em>IAS Interface Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProfileHeaderDataTypeImpl extends EObjectImpl implements ProfileHeaderDataType {
	/**
	 * The default value of the '{@link #getProfileIdentification() <em>Profile Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileIdentification()
	 * @generated
	 * @ordered
	 */
	protected static final String PROFILE_IDENTIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProfileIdentification() <em>Profile Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileIdentification()
	 * @generated
	 * @ordered
	 */
	protected String profileIdentification = PROFILE_IDENTIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProfileRevision() <em>Profile Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileRevision()
	 * @generated
	 * @ordered
	 */
	protected static final String PROFILE_REVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProfileRevision() <em>Profile Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileRevision()
	 * @generated
	 * @ordered
	 */
	protected String profileRevision = PROFILE_REVISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProfileName() <em>Profile Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROFILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProfileName() <em>Profile Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileName()
	 * @generated
	 * @ordered
	 */
	protected String profileName = PROFILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProfileSource() <em>Profile Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileSource()
	 * @generated
	 * @ordered
	 */
	protected static final String PROFILE_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProfileSource() <em>Profile Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileSource()
	 * @generated
	 * @ordered
	 */
	protected String profileSource = PROFILE_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProfileClassID() <em>Profile Class ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileClassID()
	 * @generated
	 * @ordered
	 */
	protected static final ProfileClassIDDataType PROFILE_CLASS_ID_EDEFAULT = ProfileClassIDDataType.AIP;

	/**
	 * The cached value of the '{@link #getProfileClassID() <em>Profile Class ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileClassID()
	 * @generated
	 * @ordered
	 */
	protected ProfileClassIDDataType profileClassID = PROFILE_CLASS_ID_EDEFAULT;

	/**
	 * This is true if the Profile Class ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean profileClassIDESet;

	/**
	 * The default value of the '{@link #getProfileDate() <em>Profile Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar PROFILE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProfileDate() <em>Profile Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar profileDate = PROFILE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalInformation() <em>Additional Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInformation()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_INFORMATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalInformation() <em>Additional Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInformation()
	 * @generated
	 * @ordered
	 */
	protected String additionalInformation = ADDITIONAL_INFORMATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getISO15745Reference() <em>ISO15745 Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISO15745Reference()
	 * @generated
	 * @ordered
	 */
	protected ISO15745ReferenceDataType iSO15745Reference;

	/**
	 * The cached value of the '{@link #getIASInterfaceType() <em>IAS Interface Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIASInterfaceType()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> iASInterfaceType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileHeaderDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XDDPackage.eINSTANCE.getProfileHeaderDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProfileIdentification() {
		return profileIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileIdentification(String newProfileIdentification) {
		String oldProfileIdentification = profileIdentification;
		profileIdentification = newProfileIdentification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_IDENTIFICATION, oldProfileIdentification, profileIdentification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProfileRevision() {
		return profileRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileRevision(String newProfileRevision) {
		String oldProfileRevision = profileRevision;
		profileRevision = newProfileRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_REVISION, oldProfileRevision, profileRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProfileName() {
		return profileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileName(String newProfileName) {
		String oldProfileName = profileName;
		profileName = newProfileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_NAME, oldProfileName, profileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProfileSource() {
		return profileSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileSource(String newProfileSource) {
		String oldProfileSource = profileSource;
		profileSource = newProfileSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_SOURCE, oldProfileSource, profileSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileClassIDDataType getProfileClassID() {
		return profileClassID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileClassID(ProfileClassIDDataType newProfileClassID) {
		ProfileClassIDDataType oldProfileClassID = profileClassID;
		profileClassID = newProfileClassID == null ? PROFILE_CLASS_ID_EDEFAULT : newProfileClassID;
		boolean oldProfileClassIDESet = profileClassIDESet;
		profileClassIDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_CLASS_ID, oldProfileClassID, profileClassID, !oldProfileClassIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProfileClassID() {
		ProfileClassIDDataType oldProfileClassID = profileClassID;
		boolean oldProfileClassIDESet = profileClassIDESet;
		profileClassID = PROFILE_CLASS_ID_EDEFAULT;
		profileClassIDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_CLASS_ID, oldProfileClassID, PROFILE_CLASS_ID_EDEFAULT, oldProfileClassIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProfileClassID() {
		return profileClassIDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getProfileDate() {
		return profileDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileDate(XMLGregorianCalendar newProfileDate) {
		XMLGregorianCalendar oldProfileDate = profileDate;
		profileDate = newProfileDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_DATE, oldProfileDate, profileDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdditionalInformation() {
		return additionalInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalInformation(String newAdditionalInformation) {
		String oldAdditionalInformation = additionalInformation;
		additionalInformation = newAdditionalInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PROFILE_HEADER_DATA_TYPE__ADDITIONAL_INFORMATION, oldAdditionalInformation, additionalInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISO15745ReferenceDataType getISO15745Reference() {
		return iSO15745Reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetISO15745Reference(ISO15745ReferenceDataType newISO15745Reference, NotificationChain msgs) {
		ISO15745ReferenceDataType oldISO15745Reference = iSO15745Reference;
		iSO15745Reference = newISO15745Reference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.PROFILE_HEADER_DATA_TYPE__ISO15745_REFERENCE, oldISO15745Reference, newISO15745Reference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setISO15745Reference(ISO15745ReferenceDataType newISO15745Reference) {
		if (newISO15745Reference != iSO15745Reference) {
			NotificationChain msgs = null;
			if (iSO15745Reference != null)
				msgs = ((InternalEObject)iSO15745Reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.PROFILE_HEADER_DATA_TYPE__ISO15745_REFERENCE, null, msgs);
			if (newISO15745Reference != null)
				msgs = ((InternalEObject)newISO15745Reference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.PROFILE_HEADER_DATA_TYPE__ISO15745_REFERENCE, null, msgs);
			msgs = basicSetISO15745Reference(newISO15745Reference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PROFILE_HEADER_DATA_TYPE__ISO15745_REFERENCE, newISO15745Reference, newISO15745Reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getIASInterfaceType() {
		if (iASInterfaceType == null) {
			iASInterfaceType = new EDataTypeEList<Object>(Object.class, this, XDDPackage.PROFILE_HEADER_DATA_TYPE__IAS_INTERFACE_TYPE);
		}
		return iASInterfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__ISO15745_REFERENCE:
				return basicSetISO15745Reference(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_IDENTIFICATION:
				return getProfileIdentification();
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_REVISION:
				return getProfileRevision();
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_NAME:
				return getProfileName();
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_SOURCE:
				return getProfileSource();
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_CLASS_ID:
				return getProfileClassID();
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_DATE:
				return getProfileDate();
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__ADDITIONAL_INFORMATION:
				return getAdditionalInformation();
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__ISO15745_REFERENCE:
				return getISO15745Reference();
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__IAS_INTERFACE_TYPE:
				return getIASInterfaceType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_IDENTIFICATION:
				setProfileIdentification((String)newValue);
				return;
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_REVISION:
				setProfileRevision((String)newValue);
				return;
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_NAME:
				setProfileName((String)newValue);
				return;
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_SOURCE:
				setProfileSource((String)newValue);
				return;
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_CLASS_ID:
				setProfileClassID((ProfileClassIDDataType)newValue);
				return;
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_DATE:
				setProfileDate((XMLGregorianCalendar)newValue);
				return;
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__ADDITIONAL_INFORMATION:
				setAdditionalInformation((String)newValue);
				return;
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__ISO15745_REFERENCE:
				setISO15745Reference((ISO15745ReferenceDataType)newValue);
				return;
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__IAS_INTERFACE_TYPE:
				getIASInterfaceType().clear();
				getIASInterfaceType().addAll((Collection<? extends Object>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_IDENTIFICATION:
				setProfileIdentification(PROFILE_IDENTIFICATION_EDEFAULT);
				return;
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_REVISION:
				setProfileRevision(PROFILE_REVISION_EDEFAULT);
				return;
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_NAME:
				setProfileName(PROFILE_NAME_EDEFAULT);
				return;
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_SOURCE:
				setProfileSource(PROFILE_SOURCE_EDEFAULT);
				return;
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_CLASS_ID:
				unsetProfileClassID();
				return;
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_DATE:
				setProfileDate(PROFILE_DATE_EDEFAULT);
				return;
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__ADDITIONAL_INFORMATION:
				setAdditionalInformation(ADDITIONAL_INFORMATION_EDEFAULT);
				return;
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__ISO15745_REFERENCE:
				setISO15745Reference((ISO15745ReferenceDataType)null);
				return;
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__IAS_INTERFACE_TYPE:
				getIASInterfaceType().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_IDENTIFICATION:
				return PROFILE_IDENTIFICATION_EDEFAULT == null ? profileIdentification != null : !PROFILE_IDENTIFICATION_EDEFAULT.equals(profileIdentification);
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_REVISION:
				return PROFILE_REVISION_EDEFAULT == null ? profileRevision != null : !PROFILE_REVISION_EDEFAULT.equals(profileRevision);
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_NAME:
				return PROFILE_NAME_EDEFAULT == null ? profileName != null : !PROFILE_NAME_EDEFAULT.equals(profileName);
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_SOURCE:
				return PROFILE_SOURCE_EDEFAULT == null ? profileSource != null : !PROFILE_SOURCE_EDEFAULT.equals(profileSource);
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_CLASS_ID:
				return isSetProfileClassID();
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__PROFILE_DATE:
				return PROFILE_DATE_EDEFAULT == null ? profileDate != null : !PROFILE_DATE_EDEFAULT.equals(profileDate);
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__ADDITIONAL_INFORMATION:
				return ADDITIONAL_INFORMATION_EDEFAULT == null ? additionalInformation != null : !ADDITIONAL_INFORMATION_EDEFAULT.equals(additionalInformation);
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__ISO15745_REFERENCE:
				return iSO15745Reference != null;
			case XDDPackage.PROFILE_HEADER_DATA_TYPE__IAS_INTERFACE_TYPE:
				return iASInterfaceType != null && !iASInterfaceType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (profileIdentification: ");
		result.append(profileIdentification);
		result.append(", profileRevision: ");
		result.append(profileRevision);
		result.append(", profileName: ");
		result.append(profileName);
		result.append(", profileSource: ");
		result.append(profileSource);
		result.append(", profileClassID: ");
		if (profileClassIDESet) result.append(profileClassID); else result.append("<unset>");
		result.append(", profileDate: ");
		result.append(profileDate);
		result.append(", additionalInformation: ");
		result.append(additionalInformation);
		result.append(", iASInterfaceType: ");
		result.append(iASInterfaceType);
		result.append(')');
		return result.toString();
	}

} //ProfileHeaderDataTypeImpl
