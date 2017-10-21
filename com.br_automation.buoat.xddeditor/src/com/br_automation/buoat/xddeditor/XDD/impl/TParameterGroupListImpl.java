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

import com.br_automation.buoat.xddeditor.XDD.TParameterGroup;
import com.br_automation.buoat.xddeditor.XDD.TParameterGroupList;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TParameter Group List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TParameterGroupListImpl#getParameterGroup <em>Parameter Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TParameterGroupListImpl extends EObjectImpl implements TParameterGroupList {
	/**
	 * The cached value of the '{@link #getParameterGroup() <em>Parameter Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<TParameterGroup> parameterGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TParameterGroupListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XDDPackage.eINSTANCE.getTParameterGroupList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TParameterGroup> getParameterGroup() {
		if (parameterGroup == null) {
			parameterGroup = new EObjectContainmentEList<TParameterGroup>(TParameterGroup.class, this, XDDPackage.TPARAMETER_GROUP_LIST__PARAMETER_GROUP);
		}
		return parameterGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XDDPackage.TPARAMETER_GROUP_LIST__PARAMETER_GROUP:
				return ((InternalEList<?>)getParameterGroup()).basicRemove(otherEnd, msgs);
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
			case XDDPackage.TPARAMETER_GROUP_LIST__PARAMETER_GROUP:
				return getParameterGroup();
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
			case XDDPackage.TPARAMETER_GROUP_LIST__PARAMETER_GROUP:
				getParameterGroup().clear();
				getParameterGroup().addAll((Collection<? extends TParameterGroup>)newValue);
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
			case XDDPackage.TPARAMETER_GROUP_LIST__PARAMETER_GROUP:
				getParameterGroup().clear();
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
			case XDDPackage.TPARAMETER_GROUP_LIST__PARAMETER_GROUP:
				return parameterGroup != null && !parameterGroup.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TParameterGroupListImpl
