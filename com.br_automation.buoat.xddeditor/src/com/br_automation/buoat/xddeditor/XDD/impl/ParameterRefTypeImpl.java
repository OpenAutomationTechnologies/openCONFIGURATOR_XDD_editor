/**
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.br_automation.buoat.xddeditor.XDD.ParameterRefType;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterRefTypeImpl#getActualValue <em>Actual Value</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterRefTypeImpl#getBitOffset <em>Bit Offset</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterRefTypeImpl#isLocked <em>Locked</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterRefTypeImpl#getUniqueIDRef <em>Unique ID Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterRefTypeImpl#isVisible <em>Visible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterRefTypeImpl extends EObjectImpl implements ParameterRefType {
	/**
	 * The default value of the '{@link #getActualValue() <em>Actual Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualValue()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTUAL_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualValue() <em>Actual Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualValue()
	 * @generated
	 * @ordered
	 */
	protected String actualValue = ACTUAL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBitOffset() <em>Bit Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitOffset()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BIT_OFFSET_EDEFAULT = new BigInteger("0");

	/**
	 * The cached value of the '{@link #getBitOffset() <em>Bit Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitOffset()
	 * @generated
	 * @ordered
	 */
	protected BigInteger bitOffset = BIT_OFFSET_EDEFAULT;

	/**
	 * This is true if the Bit Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bitOffsetESet;

	/**
	 * The default value of the '{@link #isLocked() <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLocked() <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocked()
	 * @generated
	 * @ordered
	 */
	protected boolean locked = LOCKED_EDEFAULT;

	/**
	 * This is true if the Locked attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lockedESet;

	/**
	 * The default value of the '{@link #getUniqueIDRef() <em>Unique ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueIDRef()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_ID_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniqueIDRef() <em>Unique ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueIDRef()
	 * @generated
	 * @ordered
	 */
	protected String uniqueIDRef = UNIQUE_ID_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * This is true if the Visible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visibleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterRefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XDDPackage.eINSTANCE.getParameterRefType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActualValue() {
		return actualValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualValue(String newActualValue) {
		String oldActualValue = actualValue;
		actualValue = newActualValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PARAMETER_REF_TYPE__ACTUAL_VALUE, oldActualValue, actualValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getBitOffset() {
		return bitOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitOffset(BigInteger newBitOffset) {
		BigInteger oldBitOffset = bitOffset;
		bitOffset = newBitOffset;
		boolean oldBitOffsetESet = bitOffsetESet;
		bitOffsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PARAMETER_REF_TYPE__BIT_OFFSET, oldBitOffset, bitOffset, !oldBitOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBitOffset() {
		BigInteger oldBitOffset = bitOffset;
		boolean oldBitOffsetESet = bitOffsetESet;
		bitOffset = BIT_OFFSET_EDEFAULT;
		bitOffsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.PARAMETER_REF_TYPE__BIT_OFFSET, oldBitOffset, BIT_OFFSET_EDEFAULT, oldBitOffsetESet));
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
	public boolean isLocked() {
		return locked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocked(boolean newLocked) {
		boolean oldLocked = locked;
		locked = newLocked;
		boolean oldLockedESet = lockedESet;
		lockedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PARAMETER_REF_TYPE__LOCKED, oldLocked, locked, !oldLockedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLocked() {
		boolean oldLocked = locked;
		boolean oldLockedESet = lockedESet;
		locked = LOCKED_EDEFAULT;
		lockedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.PARAMETER_REF_TYPE__LOCKED, oldLocked, LOCKED_EDEFAULT, oldLockedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLocked() {
		return lockedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUniqueIDRef() {
		return uniqueIDRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueIDRef(String newUniqueIDRef) {
		String oldUniqueIDRef = uniqueIDRef;
		uniqueIDRef = newUniqueIDRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PARAMETER_REF_TYPE__UNIQUE_ID_REF, oldUniqueIDRef, uniqueIDRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		boolean oldVisibleESet = visibleESet;
		visibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PARAMETER_REF_TYPE__VISIBLE, oldVisible, visible, !oldVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisible() {
		boolean oldVisible = visible;
		boolean oldVisibleESet = visibleESet;
		visible = VISIBLE_EDEFAULT;
		visibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.PARAMETER_REF_TYPE__VISIBLE, oldVisible, VISIBLE_EDEFAULT, oldVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisible() {
		return visibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XDDPackage.PARAMETER_REF_TYPE__ACTUAL_VALUE:
				return getActualValue();
			case XDDPackage.PARAMETER_REF_TYPE__BIT_OFFSET:
				return getBitOffset();
			case XDDPackage.PARAMETER_REF_TYPE__LOCKED:
				return isLocked();
			case XDDPackage.PARAMETER_REF_TYPE__UNIQUE_ID_REF:
				return getUniqueIDRef();
			case XDDPackage.PARAMETER_REF_TYPE__VISIBLE:
				return isVisible();
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
			case XDDPackage.PARAMETER_REF_TYPE__ACTUAL_VALUE:
				setActualValue((String)newValue);
				return;
			case XDDPackage.PARAMETER_REF_TYPE__BIT_OFFSET:
				setBitOffset((BigInteger)newValue);
				return;
			case XDDPackage.PARAMETER_REF_TYPE__LOCKED:
				setLocked((Boolean)newValue);
				return;
			case XDDPackage.PARAMETER_REF_TYPE__UNIQUE_ID_REF:
				setUniqueIDRef((String)newValue);
				return;
			case XDDPackage.PARAMETER_REF_TYPE__VISIBLE:
				setVisible((Boolean)newValue);
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
			case XDDPackage.PARAMETER_REF_TYPE__ACTUAL_VALUE:
				setActualValue(ACTUAL_VALUE_EDEFAULT);
				return;
			case XDDPackage.PARAMETER_REF_TYPE__BIT_OFFSET:
				unsetBitOffset();
				return;
			case XDDPackage.PARAMETER_REF_TYPE__LOCKED:
				unsetLocked();
				return;
			case XDDPackage.PARAMETER_REF_TYPE__UNIQUE_ID_REF:
				setUniqueIDRef(UNIQUE_ID_REF_EDEFAULT);
				return;
			case XDDPackage.PARAMETER_REF_TYPE__VISIBLE:
				unsetVisible();
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
			case XDDPackage.PARAMETER_REF_TYPE__ACTUAL_VALUE:
				return ACTUAL_VALUE_EDEFAULT == null ? actualValue != null : !ACTUAL_VALUE_EDEFAULT.equals(actualValue);
			case XDDPackage.PARAMETER_REF_TYPE__BIT_OFFSET:
				return isSetBitOffset();
			case XDDPackage.PARAMETER_REF_TYPE__LOCKED:
				return isSetLocked();
			case XDDPackage.PARAMETER_REF_TYPE__UNIQUE_ID_REF:
				return UNIQUE_ID_REF_EDEFAULT == null ? uniqueIDRef != null : !UNIQUE_ID_REF_EDEFAULT.equals(uniqueIDRef);
			case XDDPackage.PARAMETER_REF_TYPE__VISIBLE:
				return isSetVisible();
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
		result.append(" (actualValue: ");
		result.append(actualValue);
		result.append(", bitOffset: ");
		if (bitOffsetESet) result.append(bitOffset); else result.append("<unset>");
		result.append(", locked: ");
		if (lockedESet) result.append(locked); else result.append("<unset>");
		result.append(", uniqueIDRef: ");
		result.append(uniqueIDRef);
		result.append(", visible: ");
		if (visibleESet) result.append(visible); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ParameterRefTypeImpl
