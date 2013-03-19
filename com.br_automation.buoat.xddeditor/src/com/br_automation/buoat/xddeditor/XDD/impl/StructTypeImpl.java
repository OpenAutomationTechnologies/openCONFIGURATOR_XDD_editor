/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.DescriptionRefType;
import com.br_automation.buoat.xddeditor.XDD.DescriptionType;
import com.br_automation.buoat.xddeditor.XDD.LabelRefType;
import com.br_automation.buoat.xddeditor.XDD.LabelType;
import com.br_automation.buoat.xddeditor.XDD.StructType;
import com.br_automation.buoat.xddeditor.XDD.TVarDeclaration;
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
 * <em><b>Struct Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.StructTypeImpl#getGroup
 * <em>Group</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.StructTypeImpl#getLabel
 * <em>Label</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.StructTypeImpl#getDescription
 * <em>Description</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.StructTypeImpl#getLabelRef
 * <em>Label Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.StructTypeImpl#getDescriptionRef
 * <em>Description Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.StructTypeImpl#getVarDeclaration
 * <em>Var Declaration</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.StructTypeImpl#getName
 * <em>Name</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.StructTypeImpl#getUniqueID
 * <em>Unique ID</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class StructTypeImpl extends EObjectImpl implements StructType {
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
     * The cached value of the '{@link #getVarDeclaration()
     * <em>Var Declaration</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getVarDeclaration()
     * @generated
     * @ordered
     */
    protected EList<TVarDeclaration> varDeclaration;

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
    protected StructTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getStructType();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, XDDPackage.STRUCT_TYPE__GROUP);
        }
        return group;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<LabelType> getLabel() {
        return getGroup().list(XDDPackage.eINSTANCE.getStructType_Label());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<DescriptionType> getDescription() {
        return getGroup().list(XDDPackage.eINSTANCE.getStructType_Description());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<LabelRefType> getLabelRef() {
        return getGroup().list(XDDPackage.eINSTANCE.getStructType_LabelRef());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<DescriptionRefType> getDescriptionRef() {
        return getGroup().list(XDDPackage.eINSTANCE.getStructType_DescriptionRef());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<TVarDeclaration> getVarDeclaration() {
        if (varDeclaration == null) {
            varDeclaration = new EObjectContainmentEList<TVarDeclaration>(TVarDeclaration.class,
                this, XDDPackage.STRUCT_TYPE__VAR_DECLARATION);
        }
        return varDeclaration;
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
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.STRUCT_TYPE__NAME,
                oldName, name));
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
                XDDPackage.STRUCT_TYPE__UNIQUE_ID, oldUniqueID, uniqueID));
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
            case XDDPackage.STRUCT_TYPE__GROUP:
                return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
            case XDDPackage.STRUCT_TYPE__LABEL:
                return ((InternalEList<?>) getLabel()).basicRemove(otherEnd, msgs);
            case XDDPackage.STRUCT_TYPE__DESCRIPTION:
                return ((InternalEList<?>) getDescription()).basicRemove(otherEnd, msgs);
            case XDDPackage.STRUCT_TYPE__LABEL_REF:
                return ((InternalEList<?>) getLabelRef()).basicRemove(otherEnd, msgs);
            case XDDPackage.STRUCT_TYPE__DESCRIPTION_REF:
                return ((InternalEList<?>) getDescriptionRef()).basicRemove(otherEnd, msgs);
            case XDDPackage.STRUCT_TYPE__VAR_DECLARATION:
                return ((InternalEList<?>) getVarDeclaration()).basicRemove(otherEnd, msgs);
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
            case XDDPackage.STRUCT_TYPE__GROUP:
                if (coreType)
                    return getGroup();
                return ((FeatureMap.Internal) getGroup()).getWrapper();
            case XDDPackage.STRUCT_TYPE__LABEL:
                return getLabel();
            case XDDPackage.STRUCT_TYPE__DESCRIPTION:
                return getDescription();
            case XDDPackage.STRUCT_TYPE__LABEL_REF:
                return getLabelRef();
            case XDDPackage.STRUCT_TYPE__DESCRIPTION_REF:
                return getDescriptionRef();
            case XDDPackage.STRUCT_TYPE__VAR_DECLARATION:
                return getVarDeclaration();
            case XDDPackage.STRUCT_TYPE__NAME:
                return getName();
            case XDDPackage.STRUCT_TYPE__UNIQUE_ID:
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
            case XDDPackage.STRUCT_TYPE__GROUP:
                ((FeatureMap.Internal) getGroup()).set(newValue);
                return;
            case XDDPackage.STRUCT_TYPE__LABEL:
                getLabel().clear();
                getLabel().addAll((Collection<? extends LabelType>) newValue);
                return;
            case XDDPackage.STRUCT_TYPE__DESCRIPTION:
                getDescription().clear();
                getDescription().addAll((Collection<? extends DescriptionType>) newValue);
                return;
            case XDDPackage.STRUCT_TYPE__LABEL_REF:
                getLabelRef().clear();
                getLabelRef().addAll((Collection<? extends LabelRefType>) newValue);
                return;
            case XDDPackage.STRUCT_TYPE__DESCRIPTION_REF:
                getDescriptionRef().clear();
                getDescriptionRef().addAll((Collection<? extends DescriptionRefType>) newValue);
                return;
            case XDDPackage.STRUCT_TYPE__VAR_DECLARATION:
                getVarDeclaration().clear();
                getVarDeclaration().addAll((Collection<? extends TVarDeclaration>) newValue);
                return;
            case XDDPackage.STRUCT_TYPE__NAME:
                setName((String) newValue);
                return;
            case XDDPackage.STRUCT_TYPE__UNIQUE_ID:
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
            case XDDPackage.STRUCT_TYPE__GROUP:
                getGroup().clear();
                return;
            case XDDPackage.STRUCT_TYPE__LABEL:
                getLabel().clear();
                return;
            case XDDPackage.STRUCT_TYPE__DESCRIPTION:
                getDescription().clear();
                return;
            case XDDPackage.STRUCT_TYPE__LABEL_REF:
                getLabelRef().clear();
                return;
            case XDDPackage.STRUCT_TYPE__DESCRIPTION_REF:
                getDescriptionRef().clear();
                return;
            case XDDPackage.STRUCT_TYPE__VAR_DECLARATION:
                getVarDeclaration().clear();
                return;
            case XDDPackage.STRUCT_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case XDDPackage.STRUCT_TYPE__UNIQUE_ID:
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
            case XDDPackage.STRUCT_TYPE__GROUP:
                return group != null && !group.isEmpty();
            case XDDPackage.STRUCT_TYPE__LABEL:
                return !getLabel().isEmpty();
            case XDDPackage.STRUCT_TYPE__DESCRIPTION:
                return !getDescription().isEmpty();
            case XDDPackage.STRUCT_TYPE__LABEL_REF:
                return !getLabelRef().isEmpty();
            case XDDPackage.STRUCT_TYPE__DESCRIPTION_REF:
                return !getDescriptionRef().isEmpty();
            case XDDPackage.STRUCT_TYPE__VAR_DECLARATION:
                return varDeclaration != null && !varDeclaration.isEmpty();
            case XDDPackage.STRUCT_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case XDDPackage.STRUCT_TYPE__UNIQUE_ID:
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
        result.append(", uniqueID: ");
        result.append(uniqueID);
        result.append(')');
        return result.toString();
    }

} //StructTypeImpl
