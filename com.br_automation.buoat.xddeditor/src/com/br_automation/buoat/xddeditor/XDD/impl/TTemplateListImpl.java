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

import com.br_automation.buoat.xddeditor.XDD.TAllowedValuesTemplate;
import com.br_automation.buoat.xddeditor.XDD.TParameterTemplate;
import com.br_automation.buoat.xddeditor.XDD.TTemplateList;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TTemplate List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TTemplateListImpl#getParameterTemplate <em>Parameter Template</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TTemplateListImpl#getAllowedValuesTemplate <em>Allowed Values Template</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TTemplateListImpl extends EObjectImpl implements TTemplateList {
	/**
	 * The cached value of the '{@link #getParameterTemplate() <em>Parameter Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<TParameterTemplate> parameterTemplate;

	/**
	 * The cached value of the '{@link #getAllowedValuesTemplate() <em>Allowed Values Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedValuesTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<TAllowedValuesTemplate> allowedValuesTemplate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TTemplateListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XDDPackage.eINSTANCE.getTTemplateList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TParameterTemplate> getParameterTemplate() {
		if (parameterTemplate == null) {
			parameterTemplate = new EObjectContainmentEList<TParameterTemplate>(TParameterTemplate.class, this, XDDPackage.TTEMPLATE_LIST__PARAMETER_TEMPLATE);
		}
		return parameterTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TAllowedValuesTemplate> getAllowedValuesTemplate() {
		if (allowedValuesTemplate == null) {
			allowedValuesTemplate = new EObjectContainmentEList<TAllowedValuesTemplate>(TAllowedValuesTemplate.class, this, XDDPackage.TTEMPLATE_LIST__ALLOWED_VALUES_TEMPLATE);
		}
		return allowedValuesTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XDDPackage.TTEMPLATE_LIST__PARAMETER_TEMPLATE:
				return ((InternalEList<?>)getParameterTemplate()).basicRemove(otherEnd, msgs);
			case XDDPackage.TTEMPLATE_LIST__ALLOWED_VALUES_TEMPLATE:
				return ((InternalEList<?>)getAllowedValuesTemplate()).basicRemove(otherEnd, msgs);
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
			case XDDPackage.TTEMPLATE_LIST__PARAMETER_TEMPLATE:
				return getParameterTemplate();
			case XDDPackage.TTEMPLATE_LIST__ALLOWED_VALUES_TEMPLATE:
				return getAllowedValuesTemplate();
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
			case XDDPackage.TTEMPLATE_LIST__PARAMETER_TEMPLATE:
				getParameterTemplate().clear();
				getParameterTemplate().addAll((Collection<? extends TParameterTemplate>)newValue);
				return;
			case XDDPackage.TTEMPLATE_LIST__ALLOWED_VALUES_TEMPLATE:
				getAllowedValuesTemplate().clear();
				getAllowedValuesTemplate().addAll((Collection<? extends TAllowedValuesTemplate>)newValue);
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
			case XDDPackage.TTEMPLATE_LIST__PARAMETER_TEMPLATE:
				getParameterTemplate().clear();
				return;
			case XDDPackage.TTEMPLATE_LIST__ALLOWED_VALUES_TEMPLATE:
				getAllowedValuesTemplate().clear();
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
			case XDDPackage.TTEMPLATE_LIST__PARAMETER_TEMPLATE:
				return parameterTemplate != null && !parameterTemplate.isEmpty();
			case XDDPackage.TTEMPLATE_LIST__ALLOWED_VALUES_TEMPLATE:
				return allowedValuesTemplate != null && !allowedValuesTemplate.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TTemplateListImpl
