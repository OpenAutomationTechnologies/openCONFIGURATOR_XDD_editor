/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.TApplicationProcess;
import com.br_automation.buoat.xddeditor.XDD.TDataTypeList;
import com.br_automation.buoat.xddeditor.XDD.TFunctionInstanceList;
import com.br_automation.buoat.xddeditor.XDD.TFunctionTypeList;
import com.br_automation.buoat.xddeditor.XDD.TParameterGroupList;
import com.br_automation.buoat.xddeditor.XDD.TParameterList;
import com.br_automation.buoat.xddeditor.XDD.TTemplateList;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>TApplication Process</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TApplicationProcessImpl#getDataTypeList
 * <em>Data Type List</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TApplicationProcessImpl#getFunctionTypeList
 * <em>Function Type List</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TApplicationProcessImpl#getFunctionInstanceList
 * <em>Function Instance List</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TApplicationProcessImpl#getTemplateList
 * <em>Template List</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TApplicationProcessImpl#getParameterList
 * <em>Parameter List</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TApplicationProcessImpl#getParameterGroupList
 * <em>Parameter Group List</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TApplicationProcessImpl extends EObjectImpl implements TApplicationProcess {
    /**
     * The cached value of the '{@link #getDataTypeList()
     * <em>Data Type List</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getDataTypeList()
     * @generated
     * @ordered
     */
    protected TDataTypeList dataTypeList;

    /**
     * The cached value of the '{@link #getFunctionTypeList()
     * <em>Function Type List</em>}' containment reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getFunctionTypeList()
     * @generated
     * @ordered
     */
    protected TFunctionTypeList functionTypeList;

    /**
     * The cached value of the '{@link #getFunctionInstanceList()
     * <em>Function Instance List</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getFunctionInstanceList()
     * @generated
     * @ordered
     */
    protected TFunctionInstanceList functionInstanceList;

    /**
     * The cached value of the '{@link #getTemplateList()
     * <em>Template List</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getTemplateList()
     * @generated
     * @ordered
     */
    protected TTemplateList templateList;

    /**
     * The cached value of the '{@link #getParameterList()
     * <em>Parameter List</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getParameterList()
     * @generated
     * @ordered
     */
    protected TParameterList parameterList;

    /**
     * The cached value of the '{@link #getParameterGroupList()
     * <em>Parameter Group List</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getParameterGroupList()
     * @generated
     * @ordered
     */
    protected TParameterGroupList parameterGroupList;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TApplicationProcessImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getTApplicationProcess();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TDataTypeList getDataTypeList() {
        return dataTypeList;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetDataTypeList(TDataTypeList newDataTypeList,
        NotificationChain msgs) {
        TDataTypeList oldDataTypeList = dataTypeList;
        dataTypeList = newDataTypeList;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TAPPLICATION_PROCESS__DATA_TYPE_LIST, oldDataTypeList, newDataTypeList);
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
    public void setDataTypeList(TDataTypeList newDataTypeList) {
        if (newDataTypeList != dataTypeList) {
            NotificationChain msgs = null;
            if (dataTypeList != null)
                msgs = ((InternalEObject) dataTypeList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TAPPLICATION_PROCESS__DATA_TYPE_LIST, null, msgs);
            if (newDataTypeList != null)
                msgs = ((InternalEObject) newDataTypeList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TAPPLICATION_PROCESS__DATA_TYPE_LIST, null, msgs);
            msgs = basicSetDataTypeList(newDataTypeList, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TAPPLICATION_PROCESS__DATA_TYPE_LIST, newDataTypeList, newDataTypeList));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TFunctionTypeList getFunctionTypeList() {
        return functionTypeList;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetFunctionTypeList(TFunctionTypeList newFunctionTypeList,
        NotificationChain msgs) {
        TFunctionTypeList oldFunctionTypeList = functionTypeList;
        functionTypeList = newFunctionTypeList;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TAPPLICATION_PROCESS__FUNCTION_TYPE_LIST, oldFunctionTypeList,
                newFunctionTypeList);
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
    public void setFunctionTypeList(TFunctionTypeList newFunctionTypeList) {
        if (newFunctionTypeList != functionTypeList) {
            NotificationChain msgs = null;
            if (functionTypeList != null)
                msgs = ((InternalEObject) functionTypeList).eInverseRemove(
                    this, EOPPOSITE_FEATURE_BASE
                        - XDDPackage.TAPPLICATION_PROCESS__FUNCTION_TYPE_LIST, null, msgs);
            if (newFunctionTypeList != null)
                msgs = ((InternalEObject) newFunctionTypeList).eInverseAdd(
                    this, EOPPOSITE_FEATURE_BASE
                        - XDDPackage.TAPPLICATION_PROCESS__FUNCTION_TYPE_LIST, null, msgs);
            msgs = basicSetFunctionTypeList(newFunctionTypeList, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TAPPLICATION_PROCESS__FUNCTION_TYPE_LIST, newFunctionTypeList,
                newFunctionTypeList));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TFunctionInstanceList getFunctionInstanceList() {
        return functionInstanceList;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain
        basicSetFunctionInstanceList(TFunctionInstanceList newFunctionInstanceList,
            NotificationChain msgs) {
        TFunctionInstanceList oldFunctionInstanceList = functionInstanceList;
        functionInstanceList = newFunctionInstanceList;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TAPPLICATION_PROCESS__FUNCTION_INSTANCE_LIST, oldFunctionInstanceList,
                newFunctionInstanceList);
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
    public void setFunctionInstanceList(TFunctionInstanceList newFunctionInstanceList) {
        if (newFunctionInstanceList != functionInstanceList) {
            NotificationChain msgs = null;
            if (functionInstanceList != null)
                msgs = ((InternalEObject) functionInstanceList).eInverseRemove(
                    this, EOPPOSITE_FEATURE_BASE
                        - XDDPackage.TAPPLICATION_PROCESS__FUNCTION_INSTANCE_LIST, null, msgs);
            if (newFunctionInstanceList != null)
                msgs = ((InternalEObject) newFunctionInstanceList).eInverseAdd(
                    this, EOPPOSITE_FEATURE_BASE
                        - XDDPackage.TAPPLICATION_PROCESS__FUNCTION_INSTANCE_LIST, null, msgs);
            msgs = basicSetFunctionInstanceList(newFunctionInstanceList, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TAPPLICATION_PROCESS__FUNCTION_INSTANCE_LIST, newFunctionInstanceList,
                newFunctionInstanceList));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TTemplateList getTemplateList() {
        return templateList;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetTemplateList(TTemplateList newTemplateList,
        NotificationChain msgs) {
        TTemplateList oldTemplateList = templateList;
        templateList = newTemplateList;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TAPPLICATION_PROCESS__TEMPLATE_LIST, oldTemplateList, newTemplateList);
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
    public void setTemplateList(TTemplateList newTemplateList) {
        if (newTemplateList != templateList) {
            NotificationChain msgs = null;
            if (templateList != null)
                msgs = ((InternalEObject) templateList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TAPPLICATION_PROCESS__TEMPLATE_LIST, null, msgs);
            if (newTemplateList != null)
                msgs = ((InternalEObject) newTemplateList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TAPPLICATION_PROCESS__TEMPLATE_LIST, null, msgs);
            msgs = basicSetTemplateList(newTemplateList, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TAPPLICATION_PROCESS__TEMPLATE_LIST, newTemplateList, newTemplateList));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TParameterList getParameterList() {
        return parameterList;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetParameterList(TParameterList newParameterList,
        NotificationChain msgs) {
        TParameterList oldParameterList = parameterList;
        parameterList = newParameterList;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TAPPLICATION_PROCESS__PARAMETER_LIST, oldParameterList, newParameterList);
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
    public void setParameterList(TParameterList newParameterList) {
        if (newParameterList != parameterList) {
            NotificationChain msgs = null;
            if (parameterList != null)
                msgs = ((InternalEObject) parameterList).eInverseRemove(
                    this, EOPPOSITE_FEATURE_BASE - XDDPackage.TAPPLICATION_PROCESS__PARAMETER_LIST,
                    null, msgs);
            if (newParameterList != null)
                msgs = ((InternalEObject) newParameterList).eInverseAdd(
                    this, EOPPOSITE_FEATURE_BASE - XDDPackage.TAPPLICATION_PROCESS__PARAMETER_LIST,
                    null, msgs);
            msgs = basicSetParameterList(newParameterList, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TAPPLICATION_PROCESS__PARAMETER_LIST, newParameterList, newParameterList));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TParameterGroupList getParameterGroupList() {
        return parameterGroupList;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetParameterGroupList(TParameterGroupList newParameterGroupList,
        NotificationChain msgs) {
        TParameterGroupList oldParameterGroupList = parameterGroupList;
        parameterGroupList = newParameterGroupList;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TAPPLICATION_PROCESS__PARAMETER_GROUP_LIST, oldParameterGroupList,
                newParameterGroupList);
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
    public void setParameterGroupList(TParameterGroupList newParameterGroupList) {
        if (newParameterGroupList != parameterGroupList) {
            NotificationChain msgs = null;
            if (parameterGroupList != null)
                msgs = ((InternalEObject) parameterGroupList).eInverseRemove(
                    this, EOPPOSITE_FEATURE_BASE
                        - XDDPackage.TAPPLICATION_PROCESS__PARAMETER_GROUP_LIST, null, msgs);
            if (newParameterGroupList != null)
                msgs = ((InternalEObject) newParameterGroupList).eInverseAdd(
                    this, EOPPOSITE_FEATURE_BASE
                        - XDDPackage.TAPPLICATION_PROCESS__PARAMETER_GROUP_LIST, null, msgs);
            msgs = basicSetParameterGroupList(newParameterGroupList, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TAPPLICATION_PROCESS__PARAMETER_GROUP_LIST, newParameterGroupList,
                newParameterGroupList));
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
            case XDDPackage.TAPPLICATION_PROCESS__DATA_TYPE_LIST:
                return basicSetDataTypeList(null, msgs);
            case XDDPackage.TAPPLICATION_PROCESS__FUNCTION_TYPE_LIST:
                return basicSetFunctionTypeList(null, msgs);
            case XDDPackage.TAPPLICATION_PROCESS__FUNCTION_INSTANCE_LIST:
                return basicSetFunctionInstanceList(null, msgs);
            case XDDPackage.TAPPLICATION_PROCESS__TEMPLATE_LIST:
                return basicSetTemplateList(null, msgs);
            case XDDPackage.TAPPLICATION_PROCESS__PARAMETER_LIST:
                return basicSetParameterList(null, msgs);
            case XDDPackage.TAPPLICATION_PROCESS__PARAMETER_GROUP_LIST:
                return basicSetParameterGroupList(null, msgs);
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
            case XDDPackage.TAPPLICATION_PROCESS__DATA_TYPE_LIST:
                return getDataTypeList();
            case XDDPackage.TAPPLICATION_PROCESS__FUNCTION_TYPE_LIST:
                return getFunctionTypeList();
            case XDDPackage.TAPPLICATION_PROCESS__FUNCTION_INSTANCE_LIST:
                return getFunctionInstanceList();
            case XDDPackage.TAPPLICATION_PROCESS__TEMPLATE_LIST:
                return getTemplateList();
            case XDDPackage.TAPPLICATION_PROCESS__PARAMETER_LIST:
                return getParameterList();
            case XDDPackage.TAPPLICATION_PROCESS__PARAMETER_GROUP_LIST:
                return getParameterGroupList();
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
            case XDDPackage.TAPPLICATION_PROCESS__DATA_TYPE_LIST:
                setDataTypeList((TDataTypeList) newValue);
                return;
            case XDDPackage.TAPPLICATION_PROCESS__FUNCTION_TYPE_LIST:
                setFunctionTypeList((TFunctionTypeList) newValue);
                return;
            case XDDPackage.TAPPLICATION_PROCESS__FUNCTION_INSTANCE_LIST:
                setFunctionInstanceList((TFunctionInstanceList) newValue);
                return;
            case XDDPackage.TAPPLICATION_PROCESS__TEMPLATE_LIST:
                setTemplateList((TTemplateList) newValue);
                return;
            case XDDPackage.TAPPLICATION_PROCESS__PARAMETER_LIST:
                setParameterList((TParameterList) newValue);
                return;
            case XDDPackage.TAPPLICATION_PROCESS__PARAMETER_GROUP_LIST:
                setParameterGroupList((TParameterGroupList) newValue);
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
            case XDDPackage.TAPPLICATION_PROCESS__DATA_TYPE_LIST:
                setDataTypeList((TDataTypeList) null);
                return;
            case XDDPackage.TAPPLICATION_PROCESS__FUNCTION_TYPE_LIST:
                setFunctionTypeList((TFunctionTypeList) null);
                return;
            case XDDPackage.TAPPLICATION_PROCESS__FUNCTION_INSTANCE_LIST:
                setFunctionInstanceList((TFunctionInstanceList) null);
                return;
            case XDDPackage.TAPPLICATION_PROCESS__TEMPLATE_LIST:
                setTemplateList((TTemplateList) null);
                return;
            case XDDPackage.TAPPLICATION_PROCESS__PARAMETER_LIST:
                setParameterList((TParameterList) null);
                return;
            case XDDPackage.TAPPLICATION_PROCESS__PARAMETER_GROUP_LIST:
                setParameterGroupList((TParameterGroupList) null);
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
            case XDDPackage.TAPPLICATION_PROCESS__DATA_TYPE_LIST:
                return dataTypeList != null;
            case XDDPackage.TAPPLICATION_PROCESS__FUNCTION_TYPE_LIST:
                return functionTypeList != null;
            case XDDPackage.TAPPLICATION_PROCESS__FUNCTION_INSTANCE_LIST:
                return functionInstanceList != null;
            case XDDPackage.TAPPLICATION_PROCESS__TEMPLATE_LIST:
                return templateList != null;
            case XDDPackage.TAPPLICATION_PROCESS__PARAMETER_LIST:
                return parameterList != null;
            case XDDPackage.TAPPLICATION_PROCESS__PARAMETER_GROUP_LIST:
                return parameterGroupList != null;
        }
        return super.eIsSet(featureID);
    }

} //TApplicationProcessImpl
