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
import com.br_automation.buoat.xddeditor.XDD.TDeviceFamily;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDevice Family</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceFamilyImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceFamilyImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceFamilyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceFamilyImpl#getLabelRef <em>Label Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceFamilyImpl#getDescriptionRef <em>Description Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceFamilyImpl#isReadOnly <em>Read Only</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TDeviceFamilyImpl extends EObjectImpl implements TDeviceFamily {
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
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * This is true if the Read Only attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean readOnlyESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TDeviceFamilyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XDDPackage.eINSTANCE.getTDeviceFamily();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, XDDPackage.TDEVICE_FAMILY__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LabelType> getLabel() {
		return getGroup().list(XDDPackage.eINSTANCE.getTDeviceFamily_Label());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		return getGroup().list(XDDPackage.eINSTANCE.getTDeviceFamily_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LabelRefType> getLabelRef() {
		return getGroup().list(XDDPackage.eINSTANCE.getTDeviceFamily_LabelRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionRefType> getDescriptionRef() {
		return getGroup().list(XDDPackage.eINSTANCE.getTDeviceFamily_DescriptionRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		boolean oldReadOnlyESet = readOnlyESet;
		readOnlyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TDEVICE_FAMILY__READ_ONLY, oldReadOnly, readOnly, !oldReadOnlyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReadOnly() {
		boolean oldReadOnly = readOnly;
		boolean oldReadOnlyESet = readOnlyESet;
		readOnly = READ_ONLY_EDEFAULT;
		readOnlyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TDEVICE_FAMILY__READ_ONLY, oldReadOnly, READ_ONLY_EDEFAULT, oldReadOnlyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReadOnly() {
		return readOnlyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XDDPackage.TDEVICE_FAMILY__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XDDPackage.TDEVICE_FAMILY__LABEL:
				return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
			case XDDPackage.TDEVICE_FAMILY__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case XDDPackage.TDEVICE_FAMILY__LABEL_REF:
				return ((InternalEList<?>)getLabelRef()).basicRemove(otherEnd, msgs);
			case XDDPackage.TDEVICE_FAMILY__DESCRIPTION_REF:
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
			case XDDPackage.TDEVICE_FAMILY__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XDDPackage.TDEVICE_FAMILY__LABEL:
				return getLabel();
			case XDDPackage.TDEVICE_FAMILY__DESCRIPTION:
				return getDescription();
			case XDDPackage.TDEVICE_FAMILY__LABEL_REF:
				return getLabelRef();
			case XDDPackage.TDEVICE_FAMILY__DESCRIPTION_REF:
				return getDescriptionRef();
			case XDDPackage.TDEVICE_FAMILY__READ_ONLY:
				return isReadOnly();
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
			case XDDPackage.TDEVICE_FAMILY__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XDDPackage.TDEVICE_FAMILY__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection<? extends LabelType>)newValue);
				return;
			case XDDPackage.TDEVICE_FAMILY__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case XDDPackage.TDEVICE_FAMILY__LABEL_REF:
				getLabelRef().clear();
				getLabelRef().addAll((Collection<? extends LabelRefType>)newValue);
				return;
			case XDDPackage.TDEVICE_FAMILY__DESCRIPTION_REF:
				getDescriptionRef().clear();
				getDescriptionRef().addAll((Collection<? extends DescriptionRefType>)newValue);
				return;
			case XDDPackage.TDEVICE_FAMILY__READ_ONLY:
				setReadOnly((Boolean)newValue);
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
			case XDDPackage.TDEVICE_FAMILY__GROUP:
				getGroup().clear();
				return;
			case XDDPackage.TDEVICE_FAMILY__LABEL:
				getLabel().clear();
				return;
			case XDDPackage.TDEVICE_FAMILY__DESCRIPTION:
				getDescription().clear();
				return;
			case XDDPackage.TDEVICE_FAMILY__LABEL_REF:
				getLabelRef().clear();
				return;
			case XDDPackage.TDEVICE_FAMILY__DESCRIPTION_REF:
				getDescriptionRef().clear();
				return;
			case XDDPackage.TDEVICE_FAMILY__READ_ONLY:
				unsetReadOnly();
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
			case XDDPackage.TDEVICE_FAMILY__GROUP:
				return group != null && !group.isEmpty();
			case XDDPackage.TDEVICE_FAMILY__LABEL:
				return !getLabel().isEmpty();
			case XDDPackage.TDEVICE_FAMILY__DESCRIPTION:
				return !getDescription().isEmpty();
			case XDDPackage.TDEVICE_FAMILY__LABEL_REF:
				return !getLabelRef().isEmpty();
			case XDDPackage.TDEVICE_FAMILY__DESCRIPTION_REF:
				return !getDescriptionRef().isEmpty();
			case XDDPackage.TDEVICE_FAMILY__READ_ONLY:
				return isSetReadOnly();
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
		result.append(", readOnly: ");
		if (readOnlyESet) result.append(readOnly); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TDeviceFamilyImpl
