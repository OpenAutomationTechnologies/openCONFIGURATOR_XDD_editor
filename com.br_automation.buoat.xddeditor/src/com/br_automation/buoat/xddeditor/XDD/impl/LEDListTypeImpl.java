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

import com.br_automation.buoat.xddeditor.XDD.LEDListType;
import com.br_automation.buoat.xddeditor.XDD.TCombinedState;
import com.br_automation.buoat.xddeditor.XDD.TLED;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LED List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.LEDListTypeImpl#getLED <em>LED</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.LEDListTypeImpl#getCombinedState <em>Combined State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LEDListTypeImpl extends EObjectImpl implements LEDListType {
	/**
	 * The cached value of the '{@link #getLED() <em>LED</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLED()
	 * @generated
	 * @ordered
	 */
	protected EList<TLED> lED;

	/**
	 * The cached value of the '{@link #getCombinedState() <em>Combined State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinedState()
	 * @generated
	 * @ordered
	 */
	protected EList<TCombinedState> combinedState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEDListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XDDPackage.eINSTANCE.getLEDListType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TLED> getLED() {
		if (lED == null) {
			lED = new EObjectContainmentEList<TLED>(TLED.class, this, XDDPackage.LED_LIST_TYPE__LED);
		}
		return lED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCombinedState> getCombinedState() {
		if (combinedState == null) {
			combinedState = new EObjectContainmentEList<TCombinedState>(TCombinedState.class, this, XDDPackage.LED_LIST_TYPE__COMBINED_STATE);
		}
		return combinedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XDDPackage.LED_LIST_TYPE__LED:
				return ((InternalEList<?>)getLED()).basicRemove(otherEnd, msgs);
			case XDDPackage.LED_LIST_TYPE__COMBINED_STATE:
				return ((InternalEList<?>)getCombinedState()).basicRemove(otherEnd, msgs);
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
			case XDDPackage.LED_LIST_TYPE__LED:
				return getLED();
			case XDDPackage.LED_LIST_TYPE__COMBINED_STATE:
				return getCombinedState();
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
			case XDDPackage.LED_LIST_TYPE__LED:
				getLED().clear();
				getLED().addAll((Collection<? extends TLED>)newValue);
				return;
			case XDDPackage.LED_LIST_TYPE__COMBINED_STATE:
				getCombinedState().clear();
				getCombinedState().addAll((Collection<? extends TCombinedState>)newValue);
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
			case XDDPackage.LED_LIST_TYPE__LED:
				getLED().clear();
				return;
			case XDDPackage.LED_LIST_TYPE__COMBINED_STATE:
				getCombinedState().clear();
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
			case XDDPackage.LED_LIST_TYPE__LED:
				return lED != null && !lED.isEmpty();
			case XDDPackage.LED_LIST_TYPE__COMBINED_STATE:
				return combinedState != null && !combinedState.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LEDListTypeImpl
