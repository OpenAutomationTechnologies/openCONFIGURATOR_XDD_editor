/**
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.br_automation.buoat.xddeditor.XDD.ErrorBitDataType;
import com.br_automation.buoat.xddeditor.XDD.StaticErrorBitFieldType;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Error Bit Field Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.StaticErrorBitFieldTypeImpl#getErrorBit <em>Error Bit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaticErrorBitFieldTypeImpl extends EObjectImpl implements StaticErrorBitFieldType {
	/**
	 * The cached value of the '{@link #getErrorBit() <em>Error Bit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorBit()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorBitDataType> errorBit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticErrorBitFieldTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XDDPackage.eINSTANCE.getStaticErrorBitFieldType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErrorBitDataType> getErrorBit() {
		if (errorBit == null) {
			errorBit = new EObjectContainmentEList<ErrorBitDataType>(ErrorBitDataType.class, this, XDDPackage.STATIC_ERROR_BIT_FIELD_TYPE__ERROR_BIT);
		}
		return errorBit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XDDPackage.STATIC_ERROR_BIT_FIELD_TYPE__ERROR_BIT:
				return ((InternalEList<?>)getErrorBit()).basicRemove(otherEnd, msgs);
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
			case XDDPackage.STATIC_ERROR_BIT_FIELD_TYPE__ERROR_BIT:
				return getErrorBit();
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
			case XDDPackage.STATIC_ERROR_BIT_FIELD_TYPE__ERROR_BIT:
				getErrorBit().clear();
				getErrorBit().addAll((Collection<? extends ErrorBitDataType>)newValue);
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
			case XDDPackage.STATIC_ERROR_BIT_FIELD_TYPE__ERROR_BIT:
				getErrorBit().clear();
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
			case XDDPackage.STATIC_ERROR_BIT_FIELD_TYPE__ERROR_BIT:
				return errorBit != null && !errorBit.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StaticErrorBitFieldTypeImpl
