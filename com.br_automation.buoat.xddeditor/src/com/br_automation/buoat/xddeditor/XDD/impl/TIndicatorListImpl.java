/**
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.br_automation.buoat.xddeditor.XDD.LEDListType;
import com.br_automation.buoat.xddeditor.XDD.TIndicatorList;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TIndicator List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TIndicatorListImpl#getLEDList <em>LED List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TIndicatorListImpl extends EObjectImpl implements TIndicatorList {
	/**
	 * The cached value of the '{@link #getLEDList() <em>LED List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLEDList()
	 * @generated
	 * @ordered
	 */
	protected LEDListType lEDList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TIndicatorListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XDDPackage.eINSTANCE.getTIndicatorList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEDListType getLEDList() {
		return lEDList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLEDList(LEDListType newLEDList, NotificationChain msgs) {
		LEDListType oldLEDList = lEDList;
		lEDList = newLEDList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.TINDICATOR_LIST__LED_LIST, oldLEDList, newLEDList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLEDList(LEDListType newLEDList) {
		if (newLEDList != lEDList) {
			NotificationChain msgs = null;
			if (lEDList != null)
				msgs = ((InternalEObject)lEDList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.TINDICATOR_LIST__LED_LIST, null, msgs);
			if (newLEDList != null)
				msgs = ((InternalEObject)newLEDList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.TINDICATOR_LIST__LED_LIST, null, msgs);
			msgs = basicSetLEDList(newLEDList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TINDICATOR_LIST__LED_LIST, newLEDList, newLEDList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XDDPackage.TINDICATOR_LIST__LED_LIST:
				return basicSetLEDList(null, msgs);
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
			case XDDPackage.TINDICATOR_LIST__LED_LIST:
				return getLEDList();
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
			case XDDPackage.TINDICATOR_LIST__LED_LIST:
				setLEDList((LEDListType)newValue);
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
			case XDDPackage.TINDICATOR_LIST__LED_LIST:
				setLEDList((LEDListType)null);
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
			case XDDPackage.TINDICATOR_LIST__LED_LIST:
				return lEDList != null;
		}
		return super.eIsSet(featureID);
	}

} //TIndicatorListImpl
