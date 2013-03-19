/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.DescriptionRefType;
import com.br_automation.buoat.xddeditor.XDD.DescriptionType;
import com.br_automation.buoat.xddeditor.XDD.FunctionTypeType;
import com.br_automation.buoat.xddeditor.XDD.InterfaceListType;
import com.br_automation.buoat.xddeditor.XDD.LabelRefType;
import com.br_automation.buoat.xddeditor.XDD.LabelType;
import com.br_automation.buoat.xddeditor.XDD.TFunctionInstanceList;
import com.br_automation.buoat.xddeditor.XDD.VersionInfoType;
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
 * <em><b>Function Type Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.FunctionTypeTypeImpl#getGroup
 * <em>Group</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.FunctionTypeTypeImpl#getLabel
 * <em>Label</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.FunctionTypeTypeImpl#getDescription
 * <em>Description</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.FunctionTypeTypeImpl#getLabelRef
 * <em>Label Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.FunctionTypeTypeImpl#getDescriptionRef
 * <em>Description Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.FunctionTypeTypeImpl#getVersionInfo
 * <em>Version Info</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.FunctionTypeTypeImpl#getInterfaceList
 * <em>Interface List</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.FunctionTypeTypeImpl#getFunctionInstanceList
 * <em>Function Instance List</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.FunctionTypeTypeImpl#getName
 * <em>Name</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.FunctionTypeTypeImpl#getPackage
 * <em>Package</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.FunctionTypeTypeImpl#getUniqueID
 * <em>Unique ID</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class FunctionTypeTypeImpl extends EObjectImpl implements FunctionTypeType {
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
     * The cached value of the '{@link #getVersionInfo() <em>Version Info</em>}'
     * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getVersionInfo()
     * @generated
     * @ordered
     */
    protected EList<VersionInfoType> versionInfo;

    /**
     * The cached value of the '{@link #getInterfaceList()
     * <em>Interface List</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getInterfaceList()
     * @generated
     * @ordered
     */
    protected InterfaceListType interfaceList;

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
     * The default value of the '{@link #getPackage() <em>Package</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getPackage()
     * @generated
     * @ordered
     */
    protected static final String PACKAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPackage() <em>Package</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getPackage()
     * @generated
     * @ordered
     */
    protected String package_ = PACKAGE_EDEFAULT;

    /**
     * The default value of the '{@link #getUniqueID() <em>Unique ID</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getUniqueID()
     * @generated
     * @ordered
     */
    protected static final String UNIQUE_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUniqueID() <em>Unique ID</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getUniqueID()
     * @generated
     * @ordered
     */
    protected String uniqueID = UNIQUE_ID_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected FunctionTypeTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getFunctionTypeType();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, XDDPackage.FUNCTION_TYPE_TYPE__GROUP);
        }
        return group;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<LabelType> getLabel() {
        return getGroup().list(XDDPackage.eINSTANCE.getFunctionTypeType_Label());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<DescriptionType> getDescription() {
        return getGroup().list(XDDPackage.eINSTANCE.getFunctionTypeType_Description());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<LabelRefType> getLabelRef() {
        return getGroup().list(XDDPackage.eINSTANCE.getFunctionTypeType_LabelRef());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<DescriptionRefType> getDescriptionRef() {
        return getGroup().list(XDDPackage.eINSTANCE.getFunctionTypeType_DescriptionRef());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<VersionInfoType> getVersionInfo() {
        if (versionInfo == null) {
            versionInfo = new EObjectContainmentEList<VersionInfoType>(VersionInfoType.class, this,
                XDDPackage.FUNCTION_TYPE_TYPE__VERSION_INFO);
        }
        return versionInfo;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public InterfaceListType getInterfaceList() {
        return interfaceList;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetInterfaceList(InterfaceListType newInterfaceList,
        NotificationChain msgs) {
        InterfaceListType oldInterfaceList = interfaceList;
        interfaceList = newInterfaceList;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.FUNCTION_TYPE_TYPE__INTERFACE_LIST, oldInterfaceList, newInterfaceList);
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
    public void setInterfaceList(InterfaceListType newInterfaceList) {
        if (newInterfaceList != interfaceList) {
            NotificationChain msgs = null;
            if (interfaceList != null)
                msgs = ((InternalEObject) interfaceList).eInverseRemove(
                    this, EOPPOSITE_FEATURE_BASE - XDDPackage.FUNCTION_TYPE_TYPE__INTERFACE_LIST,
                    null, msgs);
            if (newInterfaceList != null)
                msgs = ((InternalEObject) newInterfaceList).eInverseAdd(
                    this, EOPPOSITE_FEATURE_BASE - XDDPackage.FUNCTION_TYPE_TYPE__INTERFACE_LIST,
                    null, msgs);
            msgs = basicSetInterfaceList(newInterfaceList, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.FUNCTION_TYPE_TYPE__INTERFACE_LIST, newInterfaceList, newInterfaceList));
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
                XDDPackage.FUNCTION_TYPE_TYPE__FUNCTION_INSTANCE_LIST, oldFunctionInstanceList,
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
                        - XDDPackage.FUNCTION_TYPE_TYPE__FUNCTION_INSTANCE_LIST, null, msgs);
            if (newFunctionInstanceList != null)
                msgs = ((InternalEObject) newFunctionInstanceList).eInverseAdd(
                    this, EOPPOSITE_FEATURE_BASE
                        - XDDPackage.FUNCTION_TYPE_TYPE__FUNCTION_INSTANCE_LIST, null, msgs);
            msgs = basicSetFunctionInstanceList(newFunctionInstanceList, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.FUNCTION_TYPE_TYPE__FUNCTION_INSTANCE_LIST, newFunctionInstanceList,
                newFunctionInstanceList));
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
                XDDPackage.FUNCTION_TYPE_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getPackage() {
        return package_;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setPackage(String newPackage) {
        String oldPackage = package_;
        package_ = newPackage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.FUNCTION_TYPE_TYPE__PACKAGE, oldPackage, package_));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getUniqueID() {
        return uniqueID;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setUniqueID(String newUniqueID) {
        String oldUniqueID = uniqueID;
        uniqueID = newUniqueID;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.FUNCTION_TYPE_TYPE__UNIQUE_ID, oldUniqueID, uniqueID));
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
            case XDDPackage.FUNCTION_TYPE_TYPE__GROUP:
                return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
            case XDDPackage.FUNCTION_TYPE_TYPE__LABEL:
                return ((InternalEList<?>) getLabel()).basicRemove(otherEnd, msgs);
            case XDDPackage.FUNCTION_TYPE_TYPE__DESCRIPTION:
                return ((InternalEList<?>) getDescription()).basicRemove(otherEnd, msgs);
            case XDDPackage.FUNCTION_TYPE_TYPE__LABEL_REF:
                return ((InternalEList<?>) getLabelRef()).basicRemove(otherEnd, msgs);
            case XDDPackage.FUNCTION_TYPE_TYPE__DESCRIPTION_REF:
                return ((InternalEList<?>) getDescriptionRef()).basicRemove(otherEnd, msgs);
            case XDDPackage.FUNCTION_TYPE_TYPE__VERSION_INFO:
                return ((InternalEList<?>) getVersionInfo()).basicRemove(otherEnd, msgs);
            case XDDPackage.FUNCTION_TYPE_TYPE__INTERFACE_LIST:
                return basicSetInterfaceList(null, msgs);
            case XDDPackage.FUNCTION_TYPE_TYPE__FUNCTION_INSTANCE_LIST:
                return basicSetFunctionInstanceList(null, msgs);
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
            case XDDPackage.FUNCTION_TYPE_TYPE__GROUP:
                if (coreType)
                    return getGroup();
                return ((FeatureMap.Internal) getGroup()).getWrapper();
            case XDDPackage.FUNCTION_TYPE_TYPE__LABEL:
                return getLabel();
            case XDDPackage.FUNCTION_TYPE_TYPE__DESCRIPTION:
                return getDescription();
            case XDDPackage.FUNCTION_TYPE_TYPE__LABEL_REF:
                return getLabelRef();
            case XDDPackage.FUNCTION_TYPE_TYPE__DESCRIPTION_REF:
                return getDescriptionRef();
            case XDDPackage.FUNCTION_TYPE_TYPE__VERSION_INFO:
                return getVersionInfo();
            case XDDPackage.FUNCTION_TYPE_TYPE__INTERFACE_LIST:
                return getInterfaceList();
            case XDDPackage.FUNCTION_TYPE_TYPE__FUNCTION_INSTANCE_LIST:
                return getFunctionInstanceList();
            case XDDPackage.FUNCTION_TYPE_TYPE__NAME:
                return getName();
            case XDDPackage.FUNCTION_TYPE_TYPE__PACKAGE:
                return getPackage();
            case XDDPackage.FUNCTION_TYPE_TYPE__UNIQUE_ID:
                return getUniqueID();
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
            case XDDPackage.FUNCTION_TYPE_TYPE__GROUP:
                ((FeatureMap.Internal) getGroup()).set(newValue);
                return;
            case XDDPackage.FUNCTION_TYPE_TYPE__LABEL:
                getLabel().clear();
                getLabel().addAll((Collection<? extends LabelType>) newValue);
                return;
            case XDDPackage.FUNCTION_TYPE_TYPE__DESCRIPTION:
                getDescription().clear();
                getDescription().addAll((Collection<? extends DescriptionType>) newValue);
                return;
            case XDDPackage.FUNCTION_TYPE_TYPE__LABEL_REF:
                getLabelRef().clear();
                getLabelRef().addAll((Collection<? extends LabelRefType>) newValue);
                return;
            case XDDPackage.FUNCTION_TYPE_TYPE__DESCRIPTION_REF:
                getDescriptionRef().clear();
                getDescriptionRef().addAll((Collection<? extends DescriptionRefType>) newValue);
                return;
            case XDDPackage.FUNCTION_TYPE_TYPE__VERSION_INFO:
                getVersionInfo().clear();
                getVersionInfo().addAll((Collection<? extends VersionInfoType>) newValue);
                return;
            case XDDPackage.FUNCTION_TYPE_TYPE__INTERFACE_LIST:
                setInterfaceList((InterfaceListType) newValue);
                return;
            case XDDPackage.FUNCTION_TYPE_TYPE__FUNCTION_INSTANCE_LIST:
                setFunctionInstanceList((TFunctionInstanceList) newValue);
                return;
            case XDDPackage.FUNCTION_TYPE_TYPE__NAME:
                setName((String) newValue);
                return;
            case XDDPackage.FUNCTION_TYPE_TYPE__PACKAGE:
                setPackage((String) newValue);
                return;
            case XDDPackage.FUNCTION_TYPE_TYPE__UNIQUE_ID:
                setUniqueID((String) newValue);
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
            case XDDPackage.FUNCTION_TYPE_TYPE__GROUP:
                getGroup().clear();
                return;
            case XDDPackage.FUNCTION_TYPE_TYPE__LABEL:
                getLabel().clear();
                return;
            case XDDPackage.FUNCTION_TYPE_TYPE__DESCRIPTION:
                getDescription().clear();
                return;
            case XDDPackage.FUNCTION_TYPE_TYPE__LABEL_REF:
                getLabelRef().clear();
                return;
            case XDDPackage.FUNCTION_TYPE_TYPE__DESCRIPTION_REF:
                getDescriptionRef().clear();
                return;
            case XDDPackage.FUNCTION_TYPE_TYPE__VERSION_INFO:
                getVersionInfo().clear();
                return;
            case XDDPackage.FUNCTION_TYPE_TYPE__INTERFACE_LIST:
                setInterfaceList((InterfaceListType) null);
                return;
            case XDDPackage.FUNCTION_TYPE_TYPE__FUNCTION_INSTANCE_LIST:
                setFunctionInstanceList((TFunctionInstanceList) null);
                return;
            case XDDPackage.FUNCTION_TYPE_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case XDDPackage.FUNCTION_TYPE_TYPE__PACKAGE:
                setPackage(PACKAGE_EDEFAULT);
                return;
            case XDDPackage.FUNCTION_TYPE_TYPE__UNIQUE_ID:
                setUniqueID(UNIQUE_ID_EDEFAULT);
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
            case XDDPackage.FUNCTION_TYPE_TYPE__GROUP:
                return group != null && !group.isEmpty();
            case XDDPackage.FUNCTION_TYPE_TYPE__LABEL:
                return !getLabel().isEmpty();
            case XDDPackage.FUNCTION_TYPE_TYPE__DESCRIPTION:
                return !getDescription().isEmpty();
            case XDDPackage.FUNCTION_TYPE_TYPE__LABEL_REF:
                return !getLabelRef().isEmpty();
            case XDDPackage.FUNCTION_TYPE_TYPE__DESCRIPTION_REF:
                return !getDescriptionRef().isEmpty();
            case XDDPackage.FUNCTION_TYPE_TYPE__VERSION_INFO:
                return versionInfo != null && !versionInfo.isEmpty();
            case XDDPackage.FUNCTION_TYPE_TYPE__INTERFACE_LIST:
                return interfaceList != null;
            case XDDPackage.FUNCTION_TYPE_TYPE__FUNCTION_INSTANCE_LIST:
                return functionInstanceList != null;
            case XDDPackage.FUNCTION_TYPE_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case XDDPackage.FUNCTION_TYPE_TYPE__PACKAGE:
                return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT
                    .equals(package_);
            case XDDPackage.FUNCTION_TYPE_TYPE__UNIQUE_ID:
                return UNIQUE_ID_EDEFAULT == null ? uniqueID != null : !UNIQUE_ID_EDEFAULT
                    .equals(uniqueID);
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
        result.append(", package: ");
        result.append(package_);
        result.append(", uniqueID: ");
        result.append(uniqueID);
        result.append(')');
        return result.toString();
    }

} //FunctionTypeTypeImpl
