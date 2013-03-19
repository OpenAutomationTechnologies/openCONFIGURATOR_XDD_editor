/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.ConnectionType;
import com.br_automation.buoat.xddeditor.XDD.FunctionInstanceType;
import com.br_automation.buoat.xddeditor.XDD.TFunctionInstanceList;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>TFunction Instance List</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TFunctionInstanceListImpl#getFunctionInstance
 * <em>Function Instance</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TFunctionInstanceListImpl#getConnection
 * <em>Connection</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TFunctionInstanceListImpl extends EObjectImpl implements TFunctionInstanceList {
    /**
     * The cached value of the '{@link #getFunctionInstance()
     * <em>Function Instance</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getFunctionInstance()
     * @generated
     * @ordered
     */
    protected EList<FunctionInstanceType> functionInstance;

    /**
     * The cached value of the '{@link #getConnection() <em>Connection</em>}'
     * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getConnection()
     * @generated
     * @ordered
     */
    protected EList<ConnectionType> connection;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TFunctionInstanceListImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getTFunctionInstanceList();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<FunctionInstanceType> getFunctionInstance() {
        if (functionInstance == null) {
            functionInstance = new EObjectContainmentEList<FunctionInstanceType>(
                FunctionInstanceType.class, this,
                XDDPackage.TFUNCTION_INSTANCE_LIST__FUNCTION_INSTANCE);
        }
        return functionInstance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<ConnectionType> getConnection() {
        if (connection == null) {
            connection = new EObjectContainmentEList<ConnectionType>(ConnectionType.class, this,
                XDDPackage.TFUNCTION_INSTANCE_LIST__CONNECTION);
        }
        return connection;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd,
        int featureID,
        NotificationChain msgs) {
        switch (featureID) {
            case XDDPackage.TFUNCTION_INSTANCE_LIST__FUNCTION_INSTANCE:
                return ((InternalEList<?>) getFunctionInstance()).basicRemove(otherEnd, msgs);
            case XDDPackage.TFUNCTION_INSTANCE_LIST__CONNECTION:
                return ((InternalEList<?>) getConnection()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XDDPackage.TFUNCTION_INSTANCE_LIST__FUNCTION_INSTANCE:
                return getFunctionInstance();
            case XDDPackage.TFUNCTION_INSTANCE_LIST__CONNECTION:
                return getConnection();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case XDDPackage.TFUNCTION_INSTANCE_LIST__FUNCTION_INSTANCE:
                getFunctionInstance().clear();
                getFunctionInstance().addAll((Collection<? extends FunctionInstanceType>) newValue);
                return;
            case XDDPackage.TFUNCTION_INSTANCE_LIST__CONNECTION:
                getConnection().clear();
                getConnection().addAll((Collection<? extends ConnectionType>) newValue);
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
            case XDDPackage.TFUNCTION_INSTANCE_LIST__FUNCTION_INSTANCE:
                getFunctionInstance().clear();
                return;
            case XDDPackage.TFUNCTION_INSTANCE_LIST__CONNECTION:
                getConnection().clear();
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
            case XDDPackage.TFUNCTION_INSTANCE_LIST__FUNCTION_INSTANCE:
                return functionInstance != null && !functionInstance.isEmpty();
            case XDDPackage.TFUNCTION_INSTANCE_LIST__CONNECTION:
                return connection != null && !connection.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //TFunctionInstanceListImpl
