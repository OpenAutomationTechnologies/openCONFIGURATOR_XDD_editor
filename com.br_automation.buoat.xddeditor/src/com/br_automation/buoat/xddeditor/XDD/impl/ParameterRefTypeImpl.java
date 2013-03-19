/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.ParameterRefType;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Parameter Ref Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterRefTypeImpl#getUniqueIDRef
 * <em>Unique ID Ref</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ParameterRefTypeImpl extends EObjectImpl implements ParameterRefType {
    /**
     * The default value of the '{@link #getUniqueIDRef()
     * <em>Unique ID Ref</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getUniqueIDRef()
     * @generated
     * @ordered
     */
    protected static final String UNIQUE_ID_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUniqueIDRef() <em>Unique ID Ref</em>}
     * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getUniqueIDRef()
     * @generated
     * @ordered
     */
    protected String uniqueIDRef = UNIQUE_ID_REF_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ParameterRefTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getParameterRefType();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getUniqueIDRef() {
        return uniqueIDRef;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setUniqueIDRef(String newUniqueIDRef) {
        String oldUniqueIDRef = uniqueIDRef;
        uniqueIDRef = newUniqueIDRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_REF_TYPE__UNIQUE_ID_REF, oldUniqueIDRef, uniqueIDRef));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XDDPackage.PARAMETER_REF_TYPE__UNIQUE_ID_REF:
                return getUniqueIDRef();
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
            case XDDPackage.PARAMETER_REF_TYPE__UNIQUE_ID_REF:
                setUniqueIDRef((String) newValue);
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
            case XDDPackage.PARAMETER_REF_TYPE__UNIQUE_ID_REF:
                setUniqueIDRef(UNIQUE_ID_REF_EDEFAULT);
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
            case XDDPackage.PARAMETER_REF_TYPE__UNIQUE_ID_REF:
                return UNIQUE_ID_REF_EDEFAULT == null ? uniqueIDRef != null
                    : !UNIQUE_ID_REF_EDEFAULT.equals(uniqueIDRef);
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
        result.append(" (uniqueIDRef: ");
        result.append(uniqueIDRef);
        result.append(')');
        return result.toString();
    }

} //ParameterRefTypeImpl
