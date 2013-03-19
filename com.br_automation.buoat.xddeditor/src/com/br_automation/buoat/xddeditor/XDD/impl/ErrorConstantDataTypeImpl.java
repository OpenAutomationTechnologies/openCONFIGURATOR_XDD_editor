/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.AddInfoType;
import com.br_automation.buoat.xddeditor.XDD.DescriptionRefType;
import com.br_automation.buoat.xddeditor.XDD.DescriptionType;
import com.br_automation.buoat.xddeditor.XDD.ErrorConstantDataType;
import com.br_automation.buoat.xddeditor.XDD.LabelRefType;
import com.br_automation.buoat.xddeditor.XDD.LabelType;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

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

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Error Constant Data Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ErrorConstantDataTypeImpl#getGroup
 * <em>Group</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ErrorConstantDataTypeImpl#getLabel
 * <em>Label</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ErrorConstantDataTypeImpl#getDescription
 * <em>Description</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ErrorConstantDataTypeImpl#getLabelRef
 * <em>Label Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ErrorConstantDataTypeImpl#getDescriptionRef
 * <em>Description Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ErrorConstantDataTypeImpl#getAddInfo
 * <em>Add Info</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ErrorConstantDataTypeImpl#getName
 * <em>Name</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ErrorConstantDataTypeImpl#getValue
 * <em>Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ErrorConstantDataTypeImpl extends EObjectImpl implements ErrorConstantDataType {
    /**
     * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap group;

    /**
     * The cached value of the '{@link #getAddInfo() <em>Add Info</em>}'
     * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getAddInfo()
     * @generated
     * @ordered
     */
    protected EList<AddInfoType> addInfo;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final String VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected String value = VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ErrorConstantDataTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getErrorConstantDataType();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, XDDPackage.ERROR_CONSTANT_DATA_TYPE__GROUP);
        }
        return group;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<LabelType> getLabel() {
        return getGroup().list(XDDPackage.eINSTANCE.getErrorConstantDataType_Label());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<DescriptionType> getDescription() {
        return getGroup().list(XDDPackage.eINSTANCE.getErrorConstantDataType_Description());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<LabelRefType> getLabelRef() {
        return getGroup().list(XDDPackage.eINSTANCE.getErrorConstantDataType_LabelRef());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<DescriptionRefType> getDescriptionRef() {
        return getGroup().list(XDDPackage.eINSTANCE.getErrorConstantDataType_DescriptionRef());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<AddInfoType> getAddInfo() {
        if (addInfo == null) {
            addInfo = new EObjectContainmentEList<AddInfoType>(AddInfoType.class, this,
                XDDPackage.ERROR_CONSTANT_DATA_TYPE__ADD_INFO);
        }
        return addInfo;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.ERROR_CONSTANT_DATA_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setValue(String newValue) {
        String oldValue = value;
        value = newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.ERROR_CONSTANT_DATA_TYPE__VALUE, oldValue, value));
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
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__GROUP:
                return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__LABEL:
                return ((InternalEList<?>) getLabel()).basicRemove(otherEnd, msgs);
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__DESCRIPTION:
                return ((InternalEList<?>) getDescription()).basicRemove(otherEnd, msgs);
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__LABEL_REF:
                return ((InternalEList<?>) getLabelRef()).basicRemove(otherEnd, msgs);
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__DESCRIPTION_REF:
                return ((InternalEList<?>) getDescriptionRef()).basicRemove(otherEnd, msgs);
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__ADD_INFO:
                return ((InternalEList<?>) getAddInfo()).basicRemove(otherEnd, msgs);
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
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__GROUP:
                if (coreType)
                    return getGroup();
                return ((FeatureMap.Internal) getGroup()).getWrapper();
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__LABEL:
                return getLabel();
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__DESCRIPTION:
                return getDescription();
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__LABEL_REF:
                return getLabelRef();
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__DESCRIPTION_REF:
                return getDescriptionRef();
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__ADD_INFO:
                return getAddInfo();
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__NAME:
                return getName();
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__VALUE:
                return getValue();
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
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__GROUP:
                ((FeatureMap.Internal) getGroup()).set(newValue);
                return;
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__LABEL:
                getLabel().clear();
                getLabel().addAll((Collection<? extends LabelType>) newValue);
                return;
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__DESCRIPTION:
                getDescription().clear();
                getDescription().addAll((Collection<? extends DescriptionType>) newValue);
                return;
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__LABEL_REF:
                getLabelRef().clear();
                getLabelRef().addAll((Collection<? extends LabelRefType>) newValue);
                return;
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__DESCRIPTION_REF:
                getDescriptionRef().clear();
                getDescriptionRef().addAll((Collection<? extends DescriptionRefType>) newValue);
                return;
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__ADD_INFO:
                getAddInfo().clear();
                getAddInfo().addAll((Collection<? extends AddInfoType>) newValue);
                return;
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__NAME:
                setName((String) newValue);
                return;
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__VALUE:
                setValue((String) newValue);
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
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__GROUP:
                getGroup().clear();
                return;
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__LABEL:
                getLabel().clear();
                return;
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__DESCRIPTION:
                getDescription().clear();
                return;
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__LABEL_REF:
                getLabelRef().clear();
                return;
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__DESCRIPTION_REF:
                getDescriptionRef().clear();
                return;
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__ADD_INFO:
                getAddInfo().clear();
                return;
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__VALUE:
                setValue(VALUE_EDEFAULT);
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
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__GROUP:
                return group != null && !group.isEmpty();
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__LABEL:
                return !getLabel().isEmpty();
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__DESCRIPTION:
                return !getDescription().isEmpty();
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__LABEL_REF:
                return !getLabelRef().isEmpty();
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__DESCRIPTION_REF:
                return !getDescriptionRef().isEmpty();
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__ADD_INFO:
                return addInfo != null && !addInfo.isEmpty();
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE__VALUE:
                return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
        result.append(" (group: ");
        result.append(group);
        result.append(", name: ");
        result.append(name);
        result.append(", value: ");
        result.append(value);
        result.append(')');
        return result.toString();
    }

} //ErrorConstantDataTypeImpl
