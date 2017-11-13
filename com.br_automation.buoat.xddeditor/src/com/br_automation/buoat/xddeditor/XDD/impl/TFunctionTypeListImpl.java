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

import com.br_automation.buoat.xddeditor.XDD.FunctionTypeType;
import com.br_automation.buoat.xddeditor.XDD.TFunctionTypeList;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TFunction Type List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TFunctionTypeListImpl#getFunctionType <em>Function Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TFunctionTypeListImpl extends EObjectImpl implements TFunctionTypeList {
	/**
	 * The cached value of the '{@link #getFunctionType() <em>Function Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionType()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionTypeType> functionType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TFunctionTypeListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XDDPackage.eINSTANCE.getTFunctionTypeList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionTypeType> getFunctionType() {
		if (functionType == null) {
			functionType = new EObjectContainmentEList<FunctionTypeType>(FunctionTypeType.class, this, XDDPackage.TFUNCTION_TYPE_LIST__FUNCTION_TYPE);
		}
		return functionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XDDPackage.TFUNCTION_TYPE_LIST__FUNCTION_TYPE:
				return ((InternalEList<?>)getFunctionType()).basicRemove(otherEnd, msgs);
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
			case XDDPackage.TFUNCTION_TYPE_LIST__FUNCTION_TYPE:
				return getFunctionType();
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
			case XDDPackage.TFUNCTION_TYPE_LIST__FUNCTION_TYPE:
				getFunctionType().clear();
				getFunctionType().addAll((Collection<? extends FunctionTypeType>)newValue);
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
			case XDDPackage.TFUNCTION_TYPE_LIST__FUNCTION_TYPE:
				getFunctionType().clear();
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
			case XDDPackage.TFUNCTION_TYPE_LIST__FUNCTION_TYPE:
				return functionType != null && !functionType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TFunctionTypeListImpl
