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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import com.br_automation.buoat.xddeditor.XDD.AddInfoType;
import com.br_automation.buoat.xddeditor.XDD.DescriptionRefType;
import com.br_automation.buoat.xddeditor.XDD.DescriptionType;
import com.br_automation.buoat.xddeditor.XDD.LabelRefType;
import com.br_automation.buoat.xddeditor.XDD.LabelType;
import com.br_automation.buoat.xddeditor.XDD.ValueType;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Info Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.AddInfoTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.AddInfoTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.AddInfoTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.AddInfoTypeImpl#getLabelRef <em>Label Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.AddInfoTypeImpl#getDescriptionRef <em>Description Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.AddInfoTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.AddInfoTypeImpl#getBitOffset <em>Bit Offset</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.AddInfoTypeImpl#getLen <em>Len</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.AddInfoTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddInfoTypeImpl extends EObjectImpl implements AddInfoType {
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
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueType> value;

	/**
	 * The default value of the '{@link #getBitOffset() <em>Bit Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitOffset()
	 * @generated
	 * @ordered
	 */
	protected static final short BIT_OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBitOffset() <em>Bit Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitOffset()
	 * @generated
	 * @ordered
	 */
	protected short bitOffset = BIT_OFFSET_EDEFAULT;

	/**
	 * This is true if the Bit Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bitOffsetESet;

	/**
	 * The default value of the '{@link #getLen() <em>Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLen()
	 * @generated
	 * @ordered
	 */
	protected static final short LEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLen() <em>Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLen()
	 * @generated
	 * @ordered
	 */
	protected short len = LEN_EDEFAULT;

	/**
	 * This is true if the Len attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lenESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddInfoTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XDDPackage.eINSTANCE.getAddInfoType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, XDDPackage.ADD_INFO_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LabelType> getLabel() {
		return getGroup().list(XDDPackage.eINSTANCE.getAddInfoType_Label());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		return getGroup().list(XDDPackage.eINSTANCE.getAddInfoType_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LabelRefType> getLabelRef() {
		return getGroup().list(XDDPackage.eINSTANCE.getAddInfoType_LabelRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionRefType> getDescriptionRef() {
		return getGroup().list(XDDPackage.eINSTANCE.getAddInfoType_DescriptionRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueType> getValue() {
		if (value == null) {
			value = new EObjectContainmentEList<ValueType>(ValueType.class, this, XDDPackage.ADD_INFO_TYPE__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getBitOffset() {
		return bitOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitOffset(short newBitOffset) {
		short oldBitOffset = bitOffset;
		bitOffset = newBitOffset;
		boolean oldBitOffsetESet = bitOffsetESet;
		bitOffsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.ADD_INFO_TYPE__BIT_OFFSET, oldBitOffset, bitOffset, !oldBitOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBitOffset() {
		short oldBitOffset = bitOffset;
		boolean oldBitOffsetESet = bitOffsetESet;
		bitOffset = BIT_OFFSET_EDEFAULT;
		bitOffsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.ADD_INFO_TYPE__BIT_OFFSET, oldBitOffset, BIT_OFFSET_EDEFAULT, oldBitOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBitOffset() {
		return bitOffsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getLen() {
		return len;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLen(short newLen) {
		short oldLen = len;
		len = newLen;
		boolean oldLenESet = lenESet;
		lenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.ADD_INFO_TYPE__LEN, oldLen, len, !oldLenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLen() {
		short oldLen = len;
		boolean oldLenESet = lenESet;
		len = LEN_EDEFAULT;
		lenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.ADD_INFO_TYPE__LEN, oldLen, LEN_EDEFAULT, oldLenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLen() {
		return lenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.ADD_INFO_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XDDPackage.ADD_INFO_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XDDPackage.ADD_INFO_TYPE__LABEL:
				return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
			case XDDPackage.ADD_INFO_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case XDDPackage.ADD_INFO_TYPE__LABEL_REF:
				return ((InternalEList<?>)getLabelRef()).basicRemove(otherEnd, msgs);
			case XDDPackage.ADD_INFO_TYPE__DESCRIPTION_REF:
				return ((InternalEList<?>)getDescriptionRef()).basicRemove(otherEnd, msgs);
			case XDDPackage.ADD_INFO_TYPE__VALUE:
				return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
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
			case XDDPackage.ADD_INFO_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XDDPackage.ADD_INFO_TYPE__LABEL:
				return getLabel();
			case XDDPackage.ADD_INFO_TYPE__DESCRIPTION:
				return getDescription();
			case XDDPackage.ADD_INFO_TYPE__LABEL_REF:
				return getLabelRef();
			case XDDPackage.ADD_INFO_TYPE__DESCRIPTION_REF:
				return getDescriptionRef();
			case XDDPackage.ADD_INFO_TYPE__VALUE:
				return getValue();
			case XDDPackage.ADD_INFO_TYPE__BIT_OFFSET:
				return getBitOffset();
			case XDDPackage.ADD_INFO_TYPE__LEN:
				return getLen();
			case XDDPackage.ADD_INFO_TYPE__NAME:
				return getName();
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
			case XDDPackage.ADD_INFO_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XDDPackage.ADD_INFO_TYPE__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection<? extends LabelType>)newValue);
				return;
			case XDDPackage.ADD_INFO_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case XDDPackage.ADD_INFO_TYPE__LABEL_REF:
				getLabelRef().clear();
				getLabelRef().addAll((Collection<? extends LabelRefType>)newValue);
				return;
			case XDDPackage.ADD_INFO_TYPE__DESCRIPTION_REF:
				getDescriptionRef().clear();
				getDescriptionRef().addAll((Collection<? extends DescriptionRefType>)newValue);
				return;
			case XDDPackage.ADD_INFO_TYPE__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends ValueType>)newValue);
				return;
			case XDDPackage.ADD_INFO_TYPE__BIT_OFFSET:
				setBitOffset((Short)newValue);
				return;
			case XDDPackage.ADD_INFO_TYPE__LEN:
				setLen((Short)newValue);
				return;
			case XDDPackage.ADD_INFO_TYPE__NAME:
				setName((String)newValue);
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
			case XDDPackage.ADD_INFO_TYPE__GROUP:
				getGroup().clear();
				return;
			case XDDPackage.ADD_INFO_TYPE__LABEL:
				getLabel().clear();
				return;
			case XDDPackage.ADD_INFO_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case XDDPackage.ADD_INFO_TYPE__LABEL_REF:
				getLabelRef().clear();
				return;
			case XDDPackage.ADD_INFO_TYPE__DESCRIPTION_REF:
				getDescriptionRef().clear();
				return;
			case XDDPackage.ADD_INFO_TYPE__VALUE:
				getValue().clear();
				return;
			case XDDPackage.ADD_INFO_TYPE__BIT_OFFSET:
				unsetBitOffset();
				return;
			case XDDPackage.ADD_INFO_TYPE__LEN:
				unsetLen();
				return;
			case XDDPackage.ADD_INFO_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case XDDPackage.ADD_INFO_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case XDDPackage.ADD_INFO_TYPE__LABEL:
				return !getLabel().isEmpty();
			case XDDPackage.ADD_INFO_TYPE__DESCRIPTION:
				return !getDescription().isEmpty();
			case XDDPackage.ADD_INFO_TYPE__LABEL_REF:
				return !getLabelRef().isEmpty();
			case XDDPackage.ADD_INFO_TYPE__DESCRIPTION_REF:
				return !getDescriptionRef().isEmpty();
			case XDDPackage.ADD_INFO_TYPE__VALUE:
				return value != null && !value.isEmpty();
			case XDDPackage.ADD_INFO_TYPE__BIT_OFFSET:
				return isSetBitOffset();
			case XDDPackage.ADD_INFO_TYPE__LEN:
				return isSetLen();
			case XDDPackage.ADD_INFO_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(", bitOffset: ");
		if (bitOffsetESet) result.append(bitOffset); else result.append("<unset>");
		result.append(", len: ");
		if (lenESet) result.append(len); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AddInfoTypeImpl
