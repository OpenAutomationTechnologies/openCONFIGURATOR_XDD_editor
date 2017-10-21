/**
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.br_automation.buoat.xddeditor.XDD.TConditionalSupport;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TConditional Support</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TConditionalSupportImpl#getParamIDRef <em>Param ID Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TConditionalSupportImpl extends EObjectImpl implements TConditionalSupport {
	/**
	 * The default value of the '{@link #getParamIDRef() <em>Param ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamIDRef()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAM_ID_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParamIDRef() <em>Param ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamIDRef()
	 * @generated
	 * @ordered
	 */
	protected String paramIDRef = PARAM_ID_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TConditionalSupportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XDDPackage.eINSTANCE.getTConditionalSupport();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParamIDRef() {
		return paramIDRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParamIDRef(String newParamIDRef) {
		String oldParamIDRef = paramIDRef;
		paramIDRef = newParamIDRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TCONDITIONAL_SUPPORT__PARAM_ID_REF, oldParamIDRef, paramIDRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XDDPackage.TCONDITIONAL_SUPPORT__PARAM_ID_REF:
				return getParamIDRef();
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
			case XDDPackage.TCONDITIONAL_SUPPORT__PARAM_ID_REF:
				setParamIDRef((String)newValue);
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
			case XDDPackage.TCONDITIONAL_SUPPORT__PARAM_ID_REF:
				setParamIDRef(PARAM_ID_REF_EDEFAULT);
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
			case XDDPackage.TCONDITIONAL_SUPPORT__PARAM_ID_REF:
				return PARAM_ID_REF_EDEFAULT == null ? paramIDRef != null : !PARAM_ID_REF_EDEFAULT.equals(paramIDRef);
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
		result.append(" (paramIDRef: ");
		result.append(paramIDRef);
		result.append(')');
		return result.toString();
	}

} //TConditionalSupportImpl
