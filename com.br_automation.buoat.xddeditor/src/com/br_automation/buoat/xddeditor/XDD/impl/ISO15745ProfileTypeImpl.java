/**
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileType;
import com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType;
import com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ISO15745 Profile Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ISO15745ProfileTypeImpl#getProfileHeader <em>Profile Header</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ISO15745ProfileTypeImpl#getProfileBody <em>Profile Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISO15745ProfileTypeImpl extends EObjectImpl implements ISO15745ProfileType {
	/**
	 * The cached value of the '{@link #getProfileHeader() <em>Profile Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileHeader()
	 * @generated
	 * @ordered
	 */
	protected ProfileHeaderDataType profileHeader;

	/**
	 * The cached value of the '{@link #getProfileBody() <em>Profile Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileBody()
	 * @generated
	 * @ordered
	 */
	protected ProfileBodyDataType profileBody;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISO15745ProfileTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XDDPackage.eINSTANCE.getISO15745ProfileType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileHeaderDataType getProfileHeader() {
		return profileHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfileHeader(ProfileHeaderDataType newProfileHeader, NotificationChain msgs) {
		ProfileHeaderDataType oldProfileHeader = profileHeader;
		profileHeader = newProfileHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.ISO15745_PROFILE_TYPE__PROFILE_HEADER, oldProfileHeader, newProfileHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileHeader(ProfileHeaderDataType newProfileHeader) {
		if (newProfileHeader != profileHeader) {
			NotificationChain msgs = null;
			if (profileHeader != null)
				msgs = ((InternalEObject)profileHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ISO15745_PROFILE_TYPE__PROFILE_HEADER, null, msgs);
			if (newProfileHeader != null)
				msgs = ((InternalEObject)newProfileHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ISO15745_PROFILE_TYPE__PROFILE_HEADER, null, msgs);
			msgs = basicSetProfileHeader(newProfileHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.ISO15745_PROFILE_TYPE__PROFILE_HEADER, newProfileHeader, newProfileHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileBodyDataType getProfileBody() {
		return profileBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfileBody(ProfileBodyDataType newProfileBody, NotificationChain msgs) {
		ProfileBodyDataType oldProfileBody = profileBody;
		profileBody = newProfileBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.ISO15745_PROFILE_TYPE__PROFILE_BODY, oldProfileBody, newProfileBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileBody(ProfileBodyDataType newProfileBody) {
		if (newProfileBody != profileBody) {
			NotificationChain msgs = null;
			if (profileBody != null)
				msgs = ((InternalEObject)profileBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ISO15745_PROFILE_TYPE__PROFILE_BODY, null, msgs);
			if (newProfileBody != null)
				msgs = ((InternalEObject)newProfileBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ISO15745_PROFILE_TYPE__PROFILE_BODY, null, msgs);
			msgs = basicSetProfileBody(newProfileBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.ISO15745_PROFILE_TYPE__PROFILE_BODY, newProfileBody, newProfileBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XDDPackage.ISO15745_PROFILE_TYPE__PROFILE_HEADER:
				return basicSetProfileHeader(null, msgs);
			case XDDPackage.ISO15745_PROFILE_TYPE__PROFILE_BODY:
				return basicSetProfileBody(null, msgs);
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
			case XDDPackage.ISO15745_PROFILE_TYPE__PROFILE_HEADER:
				return getProfileHeader();
			case XDDPackage.ISO15745_PROFILE_TYPE__PROFILE_BODY:
				return getProfileBody();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XDDPackage.ISO15745_PROFILE_TYPE__PROFILE_HEADER:
				setProfileHeader((ProfileHeaderDataType)newValue);
				return;
			case XDDPackage.ISO15745_PROFILE_TYPE__PROFILE_BODY:
				setProfileBody((ProfileBodyDataType)newValue);
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
			case XDDPackage.ISO15745_PROFILE_TYPE__PROFILE_HEADER:
				setProfileHeader((ProfileHeaderDataType)null);
				return;
			case XDDPackage.ISO15745_PROFILE_TYPE__PROFILE_BODY:
				setProfileBody((ProfileBodyDataType)null);
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
			case XDDPackage.ISO15745_PROFILE_TYPE__PROFILE_HEADER:
				return profileHeader != null;
			case XDDPackage.ISO15745_PROFILE_TYPE__PROFILE_BODY:
				return profileBody != null;
		}
		return super.eIsSet(featureID);
	}

} //ISO15745ProfileTypeImpl
