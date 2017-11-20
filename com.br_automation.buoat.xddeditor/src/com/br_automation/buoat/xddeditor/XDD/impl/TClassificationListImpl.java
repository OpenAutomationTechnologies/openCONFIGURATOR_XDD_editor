/**
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import com.br_automation.buoat.xddeditor.XDD.ClassificationType;
import com.br_automation.buoat.xddeditor.XDD.TClassificationList;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TClassification List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TClassificationListImpl#getClassification <em>Classification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TClassificationListImpl extends EObjectImpl implements TClassificationList {
	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassificationType> classification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TClassificationListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XDDPackage.eINSTANCE.getTClassificationList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassificationType> getClassification() {
		if (classification == null) {
			classification = new EDataTypeEList<ClassificationType>(ClassificationType.class, this, XDDPackage.TCLASSIFICATION_LIST__CLASSIFICATION);
		}
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XDDPackage.TCLASSIFICATION_LIST__CLASSIFICATION:
				return getClassification();
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
			case XDDPackage.TCLASSIFICATION_LIST__CLASSIFICATION:
				getClassification().clear();
				getClassification().addAll((Collection<? extends ClassificationType>)newValue);
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
			case XDDPackage.TCLASSIFICATION_LIST__CLASSIFICATION:
				getClassification().clear();
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
			case XDDPackage.TCLASSIFICATION_LIST__CLASSIFICATION:
				return classification != null && !classification.isEmpty();
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
		result.append(" (classification: ");
		result.append(classification);
		result.append(')');
		return result.toString();
	}

} //TClassificationListImpl
