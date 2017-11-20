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

import com.br_automation.buoat.xddeditor.XDD.DynamicChannelsType;
import com.br_automation.buoat.xddeditor.XDD.TDynamicChannel;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Channels Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.DynamicChannelsTypeImpl#getDynamicChannel <em>Dynamic Channel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicChannelsTypeImpl extends EObjectImpl implements DynamicChannelsType {
	/**
	 * The cached value of the '{@link #getDynamicChannel() <em>Dynamic Channel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicChannel()
	 * @generated
	 * @ordered
	 */
	protected EList<TDynamicChannel> dynamicChannel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicChannelsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XDDPackage.eINSTANCE.getDynamicChannelsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TDynamicChannel> getDynamicChannel() {
		if (dynamicChannel == null) {
			dynamicChannel = new EObjectContainmentEList<TDynamicChannel>(TDynamicChannel.class, this, XDDPackage.DYNAMIC_CHANNELS_TYPE__DYNAMIC_CHANNEL);
		}
		return dynamicChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XDDPackage.DYNAMIC_CHANNELS_TYPE__DYNAMIC_CHANNEL:
				return ((InternalEList<?>)getDynamicChannel()).basicRemove(otherEnd, msgs);
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
			case XDDPackage.DYNAMIC_CHANNELS_TYPE__DYNAMIC_CHANNEL:
				return getDynamicChannel();
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
			case XDDPackage.DYNAMIC_CHANNELS_TYPE__DYNAMIC_CHANNEL:
				getDynamicChannel().clear();
				getDynamicChannel().addAll((Collection<? extends TDynamicChannel>)newValue);
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
			case XDDPackage.DYNAMIC_CHANNELS_TYPE__DYNAMIC_CHANNEL:
				getDynamicChannel().clear();
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
			case XDDPackage.DYNAMIC_CHANNELS_TYPE__DYNAMIC_CHANNEL:
				return dynamicChannel != null && !dynamicChannel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DynamicChannelsTypeImpl
