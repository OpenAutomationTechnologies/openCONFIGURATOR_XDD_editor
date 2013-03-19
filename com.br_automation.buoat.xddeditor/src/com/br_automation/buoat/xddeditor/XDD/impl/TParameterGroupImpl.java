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
import com.br_automation.buoat.xddeditor.XDD.ParameterRefType;
import com.br_automation.buoat.xddeditor.XDD.TParameterGroup;
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
 * <em><b>TParameter Group</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TParameterGroupImpl#getGroup
 * <em>Group</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TParameterGroupImpl#getLabel
 * <em>Label</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TParameterGroupImpl#getDescription
 * <em>Description</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TParameterGroupImpl#getLabelRef
 * <em>Label Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TParameterGroupImpl#getDescriptionRef
 * <em>Description Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TParameterGroupImpl#getParameterGroup
 * <em>Parameter Group</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TParameterGroupImpl#getParameterRef
 * <em>Parameter Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TParameterGroupImpl#getKindOfAccess
 * <em>Kind Of Access</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TParameterGroupImpl#getUniqueID
 * <em>Unique ID</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TParameterGroupImpl extends EObjectImpl implements TParameterGroup {
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
     * The cached value of the '{@link #getParameterGroup()
     * <em>Parameter Group</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getParameterGroup()
     * @generated
     * @ordered
     */
    protected EList<TParameterGroup> parameterGroup;

    /**
     * The cached value of the '{@link #getParameterRef()
     * <em>Parameter Ref</em>}' containment reference list. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getParameterRef()
     * @generated
     * @ordered
     */
    protected EList<ParameterRefType> parameterRef;

    /**
     * The default value of the '{@link #getKindOfAccess()
     * <em>Kind Of Access</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getKindOfAccess()
     * @generated
     * @ordered
     */
    protected static final String KIND_OF_ACCESS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKindOfAccess()
     * <em>Kind Of Access</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getKindOfAccess()
     * @generated
     * @ordered
     */
    protected String kindOfAccess = KIND_OF_ACCESS_EDEFAULT;

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
    protected TParameterGroupImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getTParameterGroup();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, XDDPackage.TPARAMETER_GROUP__GROUP);
        }
        return group;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<LabelType> getLabel() {
        return getGroup().list(XDDPackage.eINSTANCE.getTParameterGroup_Label());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<DescriptionType> getDescription() {
        return getGroup().list(XDDPackage.eINSTANCE.getTParameterGroup_Description());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<LabelRefType> getLabelRef() {
        return getGroup().list(XDDPackage.eINSTANCE.getTParameterGroup_LabelRef());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<DescriptionRefType> getDescriptionRef() {
        return getGroup().list(XDDPackage.eINSTANCE.getTParameterGroup_DescriptionRef());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<TParameterGroup> getParameterGroup() {
        if (parameterGroup == null) {
            parameterGroup = new EObjectContainmentEList<TParameterGroup>(TParameterGroup.class,
                this, XDDPackage.TPARAMETER_GROUP__PARAMETER_GROUP);
        }
        return parameterGroup;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<ParameterRefType> getParameterRef() {
        if (parameterRef == null) {
            parameterRef = new EObjectContainmentEList<ParameterRefType>(ParameterRefType.class,
                this, XDDPackage.TPARAMETER_GROUP__PARAMETER_REF);
        }
        return parameterRef;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getKindOfAccess() {
        return kindOfAccess;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setKindOfAccess(String newKindOfAccess) {
        String oldKindOfAccess = kindOfAccess;
        kindOfAccess = newKindOfAccess;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TPARAMETER_GROUP__KIND_OF_ACCESS, oldKindOfAccess, kindOfAccess));
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
                XDDPackage.TPARAMETER_GROUP__UNIQUE_ID, oldUniqueID, uniqueID));
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
            case XDDPackage.TPARAMETER_GROUP__GROUP:
                return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
            case XDDPackage.TPARAMETER_GROUP__LABEL:
                return ((InternalEList<?>) getLabel()).basicRemove(otherEnd, msgs);
            case XDDPackage.TPARAMETER_GROUP__DESCRIPTION:
                return ((InternalEList<?>) getDescription()).basicRemove(otherEnd, msgs);
            case XDDPackage.TPARAMETER_GROUP__LABEL_REF:
                return ((InternalEList<?>) getLabelRef()).basicRemove(otherEnd, msgs);
            case XDDPackage.TPARAMETER_GROUP__DESCRIPTION_REF:
                return ((InternalEList<?>) getDescriptionRef()).basicRemove(otherEnd, msgs);
            case XDDPackage.TPARAMETER_GROUP__PARAMETER_GROUP:
                return ((InternalEList<?>) getParameterGroup()).basicRemove(otherEnd, msgs);
            case XDDPackage.TPARAMETER_GROUP__PARAMETER_REF:
                return ((InternalEList<?>) getParameterRef()).basicRemove(otherEnd, msgs);
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
            case XDDPackage.TPARAMETER_GROUP__GROUP:
                if (coreType)
                    return getGroup();
                return ((FeatureMap.Internal) getGroup()).getWrapper();
            case XDDPackage.TPARAMETER_GROUP__LABEL:
                return getLabel();
            case XDDPackage.TPARAMETER_GROUP__DESCRIPTION:
                return getDescription();
            case XDDPackage.TPARAMETER_GROUP__LABEL_REF:
                return getLabelRef();
            case XDDPackage.TPARAMETER_GROUP__DESCRIPTION_REF:
                return getDescriptionRef();
            case XDDPackage.TPARAMETER_GROUP__PARAMETER_GROUP:
                return getParameterGroup();
            case XDDPackage.TPARAMETER_GROUP__PARAMETER_REF:
                return getParameterRef();
            case XDDPackage.TPARAMETER_GROUP__KIND_OF_ACCESS:
                return getKindOfAccess();
            case XDDPackage.TPARAMETER_GROUP__UNIQUE_ID:
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
            case XDDPackage.TPARAMETER_GROUP__GROUP:
                ((FeatureMap.Internal) getGroup()).set(newValue);
                return;
            case XDDPackage.TPARAMETER_GROUP__LABEL:
                getLabel().clear();
                getLabel().addAll((Collection<? extends LabelType>) newValue);
                return;
            case XDDPackage.TPARAMETER_GROUP__DESCRIPTION:
                getDescription().clear();
                getDescription().addAll((Collection<? extends DescriptionType>) newValue);
                return;
            case XDDPackage.TPARAMETER_GROUP__LABEL_REF:
                getLabelRef().clear();
                getLabelRef().addAll((Collection<? extends LabelRefType>) newValue);
                return;
            case XDDPackage.TPARAMETER_GROUP__DESCRIPTION_REF:
                getDescriptionRef().clear();
                getDescriptionRef().addAll((Collection<? extends DescriptionRefType>) newValue);
                return;
            case XDDPackage.TPARAMETER_GROUP__PARAMETER_GROUP:
                getParameterGroup().clear();
                getParameterGroup().addAll((Collection<? extends TParameterGroup>) newValue);
                return;
            case XDDPackage.TPARAMETER_GROUP__PARAMETER_REF:
                getParameterRef().clear();
                getParameterRef().addAll((Collection<? extends ParameterRefType>) newValue);
                return;
            case XDDPackage.TPARAMETER_GROUP__KIND_OF_ACCESS:
                setKindOfAccess((String) newValue);
                return;
            case XDDPackage.TPARAMETER_GROUP__UNIQUE_ID:
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
            case XDDPackage.TPARAMETER_GROUP__GROUP:
                getGroup().clear();
                return;
            case XDDPackage.TPARAMETER_GROUP__LABEL:
                getLabel().clear();
                return;
            case XDDPackage.TPARAMETER_GROUP__DESCRIPTION:
                getDescription().clear();
                return;
            case XDDPackage.TPARAMETER_GROUP__LABEL_REF:
                getLabelRef().clear();
                return;
            case XDDPackage.TPARAMETER_GROUP__DESCRIPTION_REF:
                getDescriptionRef().clear();
                return;
            case XDDPackage.TPARAMETER_GROUP__PARAMETER_GROUP:
                getParameterGroup().clear();
                return;
            case XDDPackage.TPARAMETER_GROUP__PARAMETER_REF:
                getParameterRef().clear();
                return;
            case XDDPackage.TPARAMETER_GROUP__KIND_OF_ACCESS:
                setKindOfAccess(KIND_OF_ACCESS_EDEFAULT);
                return;
            case XDDPackage.TPARAMETER_GROUP__UNIQUE_ID:
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
            case XDDPackage.TPARAMETER_GROUP__GROUP:
                return group != null && !group.isEmpty();
            case XDDPackage.TPARAMETER_GROUP__LABEL:
                return !getLabel().isEmpty();
            case XDDPackage.TPARAMETER_GROUP__DESCRIPTION:
                return !getDescription().isEmpty();
            case XDDPackage.TPARAMETER_GROUP__LABEL_REF:
                return !getLabelRef().isEmpty();
            case XDDPackage.TPARAMETER_GROUP__DESCRIPTION_REF:
                return !getDescriptionRef().isEmpty();
            case XDDPackage.TPARAMETER_GROUP__PARAMETER_GROUP:
                return parameterGroup != null && !parameterGroup.isEmpty();
            case XDDPackage.TPARAMETER_GROUP__PARAMETER_REF:
                return parameterRef != null && !parameterRef.isEmpty();
            case XDDPackage.TPARAMETER_GROUP__KIND_OF_ACCESS:
                return KIND_OF_ACCESS_EDEFAULT == null ? kindOfAccess != null
                    : !KIND_OF_ACCESS_EDEFAULT.equals(kindOfAccess);
            case XDDPackage.TPARAMETER_GROUP__UNIQUE_ID:
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
        result.append(", kindOfAccess: ");
        result.append(kindOfAccess);
        result.append(", uniqueID: ");
        result.append(uniqueID);
        result.append(')');
        return result.toString();
    }

} //TParameterGroupImpl
