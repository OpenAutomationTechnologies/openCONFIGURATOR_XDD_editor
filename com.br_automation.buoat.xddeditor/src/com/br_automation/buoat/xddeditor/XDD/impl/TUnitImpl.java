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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import com.br_automation.buoat.xddeditor.XDD.DescriptionRefType;
import com.br_automation.buoat.xddeditor.XDD.DescriptionType;
import com.br_automation.buoat.xddeditor.XDD.LabelRefType;
import com.br_automation.buoat.xddeditor.XDD.LabelType;
import com.br_automation.buoat.xddeditor.XDD.TUnit;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TUnit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TUnitImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TUnitImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TUnitImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TUnitImpl#getLabelRef <em>Label Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TUnitImpl#getDescriptionRef <em>Description Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TUnitImpl#getMultiplier <em>Multiplier</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TUnitImpl#getUnitURI <em>Unit URI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TUnitImpl extends EObjectImpl implements TUnit {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplier()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplier()
	 * @generated
	 * @ordered
	 */
	protected String multiplier = MULTIPLIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitURI() <em>Unit URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitURI()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitURI() <em>Unit URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitURI()
	 * @generated
	 * @ordered
	 */
	protected String unitURI = UNIT_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XDDPackage.eINSTANCE.getTUnit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, XDDPackage.TUNIT__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LabelType> getLabel() {
		return getGroup().list(XDDPackage.eINSTANCE.getTUnit_Label());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		return getGroup().list(XDDPackage.eINSTANCE.getTUnit_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LabelRefType> getLabelRef() {
		return getGroup().list(XDDPackage.eINSTANCE.getTUnit_LabelRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionRefType> getDescriptionRef() {
		return getGroup().list(XDDPackage.eINSTANCE.getTUnit_DescriptionRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiplier() {
		return multiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplier(String newMultiplier) {
		String oldMultiplier = multiplier;
		multiplier = newMultiplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TUNIT__MULTIPLIER, oldMultiplier, multiplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnitURI() {
		return unitURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitURI(String newUnitURI) {
		String oldUnitURI = unitURI;
		unitURI = newUnitURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TUNIT__UNIT_URI, oldUnitURI, unitURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XDDPackage.TUNIT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XDDPackage.TUNIT__LABEL:
				return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
			case XDDPackage.TUNIT__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case XDDPackage.TUNIT__LABEL_REF:
				return ((InternalEList<?>)getLabelRef()).basicRemove(otherEnd, msgs);
			case XDDPackage.TUNIT__DESCRIPTION_REF:
				return ((InternalEList<?>)getDescriptionRef()).basicRemove(otherEnd, msgs);
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
			case XDDPackage.TUNIT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XDDPackage.TUNIT__LABEL:
				return getLabel();
			case XDDPackage.TUNIT__DESCRIPTION:
				return getDescription();
			case XDDPackage.TUNIT__LABEL_REF:
				return getLabelRef();
			case XDDPackage.TUNIT__DESCRIPTION_REF:
				return getDescriptionRef();
			case XDDPackage.TUNIT__MULTIPLIER:
				return getMultiplier();
			case XDDPackage.TUNIT__UNIT_URI:
				return getUnitURI();
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
			case XDDPackage.TUNIT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XDDPackage.TUNIT__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection<? extends LabelType>)newValue);
				return;
			case XDDPackage.TUNIT__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case XDDPackage.TUNIT__LABEL_REF:
				getLabelRef().clear();
				getLabelRef().addAll((Collection<? extends LabelRefType>)newValue);
				return;
			case XDDPackage.TUNIT__DESCRIPTION_REF:
				getDescriptionRef().clear();
				getDescriptionRef().addAll((Collection<? extends DescriptionRefType>)newValue);
				return;
			case XDDPackage.TUNIT__MULTIPLIER:
				setMultiplier((String)newValue);
				return;
			case XDDPackage.TUNIT__UNIT_URI:
				setUnitURI((String)newValue);
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
			case XDDPackage.TUNIT__GROUP:
				getGroup().clear();
				return;
			case XDDPackage.TUNIT__LABEL:
				getLabel().clear();
				return;
			case XDDPackage.TUNIT__DESCRIPTION:
				getDescription().clear();
				return;
			case XDDPackage.TUNIT__LABEL_REF:
				getLabelRef().clear();
				return;
			case XDDPackage.TUNIT__DESCRIPTION_REF:
				getDescriptionRef().clear();
				return;
			case XDDPackage.TUNIT__MULTIPLIER:
				setMultiplier(MULTIPLIER_EDEFAULT);
				return;
			case XDDPackage.TUNIT__UNIT_URI:
				setUnitURI(UNIT_URI_EDEFAULT);
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
			case XDDPackage.TUNIT__GROUP:
				return group != null && !group.isEmpty();
			case XDDPackage.TUNIT__LABEL:
				return !getLabel().isEmpty();
			case XDDPackage.TUNIT__DESCRIPTION:
				return !getDescription().isEmpty();
			case XDDPackage.TUNIT__LABEL_REF:
				return !getLabelRef().isEmpty();
			case XDDPackage.TUNIT__DESCRIPTION_REF:
				return !getDescriptionRef().isEmpty();
			case XDDPackage.TUNIT__MULTIPLIER:
				return MULTIPLIER_EDEFAULT == null ? multiplier != null : !MULTIPLIER_EDEFAULT.equals(multiplier);
			case XDDPackage.TUNIT__UNIT_URI:
				return UNIT_URI_EDEFAULT == null ? unitURI != null : !UNIT_URI_EDEFAULT.equals(unitURI);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", multiplier: ");
		result.append(multiplier);
		result.append(", unitURI: ");
		result.append(unitURI);
		result.append(')');
		return result.toString();
	}

} //TUnitImpl
