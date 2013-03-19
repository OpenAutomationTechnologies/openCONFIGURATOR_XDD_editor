/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.ConfigVarsType;
import com.br_automation.buoat.xddeditor.XDD.InputVarsType;
import com.br_automation.buoat.xddeditor.XDD.InterfaceListType;
import com.br_automation.buoat.xddeditor.XDD.OutputVarsType;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Interface List Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.InterfaceListTypeImpl#getInputVars
 * <em>Input Vars</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.InterfaceListTypeImpl#getOutputVars
 * <em>Output Vars</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.InterfaceListTypeImpl#getConfigVars
 * <em>Config Vars</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class InterfaceListTypeImpl extends EObjectImpl implements InterfaceListType {
    /**
     * The cached value of the '{@link #getInputVars() <em>Input Vars</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getInputVars()
     * @generated
     * @ordered
     */
    protected InputVarsType inputVars;

    /**
     * The cached value of the '{@link #getOutputVars() <em>Output Vars</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getOutputVars()
     * @generated
     * @ordered
     */
    protected OutputVarsType outputVars;

    /**
     * The cached value of the '{@link #getConfigVars() <em>Config Vars</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getConfigVars()
     * @generated
     * @ordered
     */
    protected ConfigVarsType configVars;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected InterfaceListTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getInterfaceListType();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public InputVarsType getInputVars() {
        return inputVars;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetInputVars(InputVarsType newInputVars, NotificationChain msgs) {
        InputVarsType oldInputVars = inputVars;
        inputVars = newInputVars;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.INTERFACE_LIST_TYPE__INPUT_VARS, oldInputVars, newInputVars);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setInputVars(InputVarsType newInputVars) {
        if (newInputVars != inputVars) {
            NotificationChain msgs = null;
            if (inputVars != null)
                msgs = ((InternalEObject) inputVars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.INTERFACE_LIST_TYPE__INPUT_VARS, null, msgs);
            if (newInputVars != null)
                msgs = ((InternalEObject) newInputVars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.INTERFACE_LIST_TYPE__INPUT_VARS, null, msgs);
            msgs = basicSetInputVars(newInputVars, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.INTERFACE_LIST_TYPE__INPUT_VARS, newInputVars, newInputVars));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public OutputVarsType getOutputVars() {
        return outputVars;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain
        basicSetOutputVars(OutputVarsType newOutputVars, NotificationChain msgs) {
        OutputVarsType oldOutputVars = outputVars;
        outputVars = newOutputVars;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.INTERFACE_LIST_TYPE__OUTPUT_VARS, oldOutputVars, newOutputVars);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setOutputVars(OutputVarsType newOutputVars) {
        if (newOutputVars != outputVars) {
            NotificationChain msgs = null;
            if (outputVars != null)
                msgs = ((InternalEObject) outputVars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.INTERFACE_LIST_TYPE__OUTPUT_VARS, null, msgs);
            if (newOutputVars != null)
                msgs = ((InternalEObject) newOutputVars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.INTERFACE_LIST_TYPE__OUTPUT_VARS, null, msgs);
            msgs = basicSetOutputVars(newOutputVars, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.INTERFACE_LIST_TYPE__OUTPUT_VARS, newOutputVars, newOutputVars));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ConfigVarsType getConfigVars() {
        return configVars;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain
        basicSetConfigVars(ConfigVarsType newConfigVars, NotificationChain msgs) {
        ConfigVarsType oldConfigVars = configVars;
        configVars = newConfigVars;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.INTERFACE_LIST_TYPE__CONFIG_VARS, oldConfigVars, newConfigVars);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setConfigVars(ConfigVarsType newConfigVars) {
        if (newConfigVars != configVars) {
            NotificationChain msgs = null;
            if (configVars != null)
                msgs = ((InternalEObject) configVars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.INTERFACE_LIST_TYPE__CONFIG_VARS, null, msgs);
            if (newConfigVars != null)
                msgs = ((InternalEObject) newConfigVars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.INTERFACE_LIST_TYPE__CONFIG_VARS, null, msgs);
            msgs = basicSetConfigVars(newConfigVars, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.INTERFACE_LIST_TYPE__CONFIG_VARS, newConfigVars, newConfigVars));
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
            case XDDPackage.INTERFACE_LIST_TYPE__INPUT_VARS:
                return basicSetInputVars(null, msgs);
            case XDDPackage.INTERFACE_LIST_TYPE__OUTPUT_VARS:
                return basicSetOutputVars(null, msgs);
            case XDDPackage.INTERFACE_LIST_TYPE__CONFIG_VARS:
                return basicSetConfigVars(null, msgs);
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
            case XDDPackage.INTERFACE_LIST_TYPE__INPUT_VARS:
                return getInputVars();
            case XDDPackage.INTERFACE_LIST_TYPE__OUTPUT_VARS:
                return getOutputVars();
            case XDDPackage.INTERFACE_LIST_TYPE__CONFIG_VARS:
                return getConfigVars();
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
            case XDDPackage.INTERFACE_LIST_TYPE__INPUT_VARS:
                setInputVars((InputVarsType) newValue);
                return;
            case XDDPackage.INTERFACE_LIST_TYPE__OUTPUT_VARS:
                setOutputVars((OutputVarsType) newValue);
                return;
            case XDDPackage.INTERFACE_LIST_TYPE__CONFIG_VARS:
                setConfigVars((ConfigVarsType) newValue);
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
            case XDDPackage.INTERFACE_LIST_TYPE__INPUT_VARS:
                setInputVars((InputVarsType) null);
                return;
            case XDDPackage.INTERFACE_LIST_TYPE__OUTPUT_VARS:
                setOutputVars((OutputVarsType) null);
                return;
            case XDDPackage.INTERFACE_LIST_TYPE__CONFIG_VARS:
                setConfigVars((ConfigVarsType) null);
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
            case XDDPackage.INTERFACE_LIST_TYPE__INPUT_VARS:
                return inputVars != null;
            case XDDPackage.INTERFACE_LIST_TYPE__OUTPUT_VARS:
                return outputVars != null;
            case XDDPackage.INTERFACE_LIST_TYPE__CONFIG_VARS:
                return configVars != null;
        }
        return super.eIsSet(featureID);
    }

} //InterfaceListTypeImpl
