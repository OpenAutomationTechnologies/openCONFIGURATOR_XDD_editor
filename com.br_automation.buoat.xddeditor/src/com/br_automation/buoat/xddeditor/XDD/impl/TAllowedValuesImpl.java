/**
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

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

import com.br_automation.buoat.xddeditor.XDD.TAllowedValues;
import com.br_automation.buoat.xddeditor.XDD.TRange;
import com.br_automation.buoat.xddeditor.XDD.TValue;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TAllowed Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TAllowedValuesImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TAllowedValuesImpl#getRange <em>Range</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TAllowedValuesImpl#getTemplateIDRef <em>Template ID Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TAllowedValuesImpl extends EObjectImpl implements TAllowedValues {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<TValue> value;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected EList<TRange> range;

	/**
	 * The default value of the '{@link #getTemplateIDRef() <em>Template ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateIDRef()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_ID_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateIDRef() <em>Template ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateIDRef()
	 * @generated
	 * @ordered
	 */
	protected String templateIDRef = TEMPLATE_ID_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TAllowedValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XDDPackage.eINSTANCE.getTAllowedValues();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TValue> getValue() {
		if (value == null) {
			value = new EObjectContainmentEList<TValue>(TValue.class, this, XDDPackage.TALLOWED_VALUES__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TRange> getRange() {
		if (range == null) {
			range = new EObjectContainmentEList<TRange>(TRange.class, this, XDDPackage.TALLOWED_VALUES__RANGE);
		}
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplateIDRef() {
		return templateIDRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateIDRef(String newTemplateIDRef) {
		String oldTemplateIDRef = templateIDRef;
		templateIDRef = newTemplateIDRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TALLOWED_VALUES__TEMPLATE_ID_REF, oldTemplateIDRef, templateIDRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XDDPackage.TALLOWED_VALUES__VALUE:
				return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
			case XDDPackage.TALLOWED_VALUES__RANGE:
				return ((InternalEList<?>)getRange()).basicRemove(otherEnd, msgs);
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
			case XDDPackage.TALLOWED_VALUES__VALUE:
				return getValue();
			case XDDPackage.TALLOWED_VALUES__RANGE:
				return getRange();
			case XDDPackage.TALLOWED_VALUES__TEMPLATE_ID_REF:
				return getTemplateIDRef();
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
			case XDDPackage.TALLOWED_VALUES__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends TValue>)newValue);
				return;
			case XDDPackage.TALLOWED_VALUES__RANGE:
				getRange().clear();
				getRange().addAll((Collection<? extends TRange>)newValue);
				return;
			case XDDPackage.TALLOWED_VALUES__TEMPLATE_ID_REF:
				setTemplateIDRef((String)newValue);
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
			case XDDPackage.TALLOWED_VALUES__VALUE:
				getValue().clear();
				return;
			case XDDPackage.TALLOWED_VALUES__RANGE:
				getRange().clear();
				return;
			case XDDPackage.TALLOWED_VALUES__TEMPLATE_ID_REF:
				setTemplateIDRef(TEMPLATE_ID_REF_EDEFAULT);
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
			case XDDPackage.TALLOWED_VALUES__VALUE:
				return value != null && !value.isEmpty();
			case XDDPackage.TALLOWED_VALUES__RANGE:
				return range != null && !range.isEmpty();
			case XDDPackage.TALLOWED_VALUES__TEMPLATE_ID_REF:
				return TEMPLATE_ID_REF_EDEFAULT == null ? templateIDRef != null : !TEMPLATE_ID_REF_EDEFAULT.equals(templateIDRef);
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
		result.append(" (templateIDRef: ");
		result.append(templateIDRef);
		result.append(')');
		return result.toString();
	}

} //TAllowedValuesImpl
