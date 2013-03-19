/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.LEDstateRefType;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>LE Dstate Ref Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.LEDstateRefTypeImpl#getStateIDRef
 * <em>State ID Ref</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class LEDstateRefTypeImpl extends EObjectImpl implements LEDstateRefType {
    /**
     * The default value of the '{@link #getStateIDRef() <em>State ID Ref</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getStateIDRef()
     * @generated
     * @ordered
     */
    protected static final String STATE_ID_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStateIDRef() <em>State ID Ref</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getStateIDRef()
     * @generated
     * @ordered
     */
    protected String stateIDRef = STATE_ID_REF_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected LEDstateRefTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getLEDstateRefType();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getStateIDRef() {
        return stateIDRef;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setStateIDRef(String newStateIDRef) {
        String oldStateIDRef = stateIDRef;
        stateIDRef = newStateIDRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.LE_DSTATE_REF_TYPE__STATE_ID_REF, oldStateIDRef, stateIDRef));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XDDPackage.LE_DSTATE_REF_TYPE__STATE_ID_REF:
                return getStateIDRef();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case XDDPackage.LE_DSTATE_REF_TYPE__STATE_ID_REF:
                setStateIDRef((String) newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case XDDPackage.LE_DSTATE_REF_TYPE__STATE_ID_REF:
                setStateIDRef(STATE_ID_REF_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case XDDPackage.LE_DSTATE_REF_TYPE__STATE_ID_REF:
                return STATE_ID_REF_EDEFAULT == null ? stateIDRef != null : !STATE_ID_REF_EDEFAULT
                    .equals(stateIDRef);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (stateIDRef: ");
        result.append(stateIDRef);
        result.append(')');
        return result.toString();
    }

} //LEDstateRefTypeImpl
