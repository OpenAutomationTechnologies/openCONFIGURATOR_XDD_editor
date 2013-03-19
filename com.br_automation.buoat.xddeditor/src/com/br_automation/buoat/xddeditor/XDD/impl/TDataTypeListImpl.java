/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.ArrayType;
import com.br_automation.buoat.xddeditor.XDD.DerivedType;
import com.br_automation.buoat.xddeditor.XDD.EnumType;
import com.br_automation.buoat.xddeditor.XDD.StructType;
import com.br_automation.buoat.xddeditor.XDD.TDataTypeList;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>TData Type List</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDataTypeListImpl#getGroup
 * <em>Group</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDataTypeListImpl#getArray
 * <em>Array</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDataTypeListImpl#getStruct
 * <em>Struct</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDataTypeListImpl#getEnum
 * <em>Enum</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDataTypeListImpl#getDerived
 * <em>Derived</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TDataTypeListImpl extends EObjectImpl implements TDataTypeList {
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
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TDataTypeListImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getTDataTypeList();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, XDDPackage.TDATA_TYPE_LIST__GROUP);
        }
        return group;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<ArrayType> getArray() {
        return getGroup().list(XDDPackage.eINSTANCE.getTDataTypeList_Array());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<StructType> getStruct() {
        return getGroup().list(XDDPackage.eINSTANCE.getTDataTypeList_Struct());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<EnumType> getEnum() {
        return getGroup().list(XDDPackage.eINSTANCE.getTDataTypeList_Enum());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<DerivedType> getDerived() {
        return getGroup().list(XDDPackage.eINSTANCE.getTDataTypeList_Derived());
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
            case XDDPackage.TDATA_TYPE_LIST__GROUP:
                return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
            case XDDPackage.TDATA_TYPE_LIST__ARRAY:
                return ((InternalEList<?>) getArray()).basicRemove(otherEnd, msgs);
            case XDDPackage.TDATA_TYPE_LIST__STRUCT:
                return ((InternalEList<?>) getStruct()).basicRemove(otherEnd, msgs);
            case XDDPackage.TDATA_TYPE_LIST__ENUM:
                return ((InternalEList<?>) getEnum()).basicRemove(otherEnd, msgs);
            case XDDPackage.TDATA_TYPE_LIST__DERIVED:
                return ((InternalEList<?>) getDerived()).basicRemove(otherEnd, msgs);
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
            case XDDPackage.TDATA_TYPE_LIST__GROUP:
                if (coreType)
                    return getGroup();
                return ((FeatureMap.Internal) getGroup()).getWrapper();
            case XDDPackage.TDATA_TYPE_LIST__ARRAY:
                return getArray();
            case XDDPackage.TDATA_TYPE_LIST__STRUCT:
                return getStruct();
            case XDDPackage.TDATA_TYPE_LIST__ENUM:
                return getEnum();
            case XDDPackage.TDATA_TYPE_LIST__DERIVED:
                return getDerived();
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
            case XDDPackage.TDATA_TYPE_LIST__GROUP:
                ((FeatureMap.Internal) getGroup()).set(newValue);
                return;
            case XDDPackage.TDATA_TYPE_LIST__ARRAY:
                getArray().clear();
                getArray().addAll((Collection<? extends ArrayType>) newValue);
                return;
            case XDDPackage.TDATA_TYPE_LIST__STRUCT:
                getStruct().clear();
                getStruct().addAll((Collection<? extends StructType>) newValue);
                return;
            case XDDPackage.TDATA_TYPE_LIST__ENUM:
                getEnum().clear();
                getEnum().addAll((Collection<? extends EnumType>) newValue);
                return;
            case XDDPackage.TDATA_TYPE_LIST__DERIVED:
                getDerived().clear();
                getDerived().addAll((Collection<? extends DerivedType>) newValue);
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
            case XDDPackage.TDATA_TYPE_LIST__GROUP:
                getGroup().clear();
                return;
            case XDDPackage.TDATA_TYPE_LIST__ARRAY:
                getArray().clear();
                return;
            case XDDPackage.TDATA_TYPE_LIST__STRUCT:
                getStruct().clear();
                return;
            case XDDPackage.TDATA_TYPE_LIST__ENUM:
                getEnum().clear();
                return;
            case XDDPackage.TDATA_TYPE_LIST__DERIVED:
                getDerived().clear();
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
            case XDDPackage.TDATA_TYPE_LIST__GROUP:
                return group != null && !group.isEmpty();
            case XDDPackage.TDATA_TYPE_LIST__ARRAY:
                return !getArray().isEmpty();
            case XDDPackage.TDATA_TYPE_LIST__STRUCT:
                return !getStruct().isEmpty();
            case XDDPackage.TDATA_TYPE_LIST__ENUM:
                return !getEnum().isEmpty();
            case XDDPackage.TDATA_TYPE_LIST__DERIVED:
                return !getDerived().isEmpty();
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
        result.append(')');
        return result.toString();
    }

} //TDataTypeListImpl
