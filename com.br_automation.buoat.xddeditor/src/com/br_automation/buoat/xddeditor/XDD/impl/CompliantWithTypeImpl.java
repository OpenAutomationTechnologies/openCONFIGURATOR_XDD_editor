/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.CompliantWithType;
import com.br_automation.buoat.xddeditor.XDD.DescriptionRefType;
import com.br_automation.buoat.xddeditor.XDD.DescriptionType;
import com.br_automation.buoat.xddeditor.XDD.LabelRefType;
import com.br_automation.buoat.xddeditor.XDD.LabelType;
import com.br_automation.buoat.xddeditor.XDD.RangeType;
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
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Compliant With Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.CompliantWithTypeImpl#getGroup
 * <em>Group</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.CompliantWithTypeImpl#getLabel
 * <em>Label</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.CompliantWithTypeImpl#getDescription
 * <em>Description</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.CompliantWithTypeImpl#getLabelRef
 * <em>Label Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.CompliantWithTypeImpl#getDescriptionRef
 * <em>Description Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.CompliantWithTypeImpl#getName
 * <em>Name</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.CompliantWithTypeImpl#getRange
 * <em>Range</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CompliantWithTypeImpl extends EObjectImpl implements CompliantWithType {
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
     * The default value of the '{@link #getRange() <em>Range</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getRange()
     * @generated
     * @ordered
     */
    protected static final RangeType RANGE_EDEFAULT = RangeType.INTERNATIONAL;

    /**
     * The cached value of the '{@link #getRange() <em>Range</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getRange()
     * @generated
     * @ordered
     */
    protected RangeType range = RANGE_EDEFAULT;

    /**
     * This is true if the Range attribute has been set. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean rangeESet;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected CompliantWithTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getCompliantWithType();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, XDDPackage.COMPLIANT_WITH_TYPE__GROUP);
        }
        return group;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<LabelType> getLabel() {
        return getGroup().list(XDDPackage.eINSTANCE.getCompliantWithType_Label());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<DescriptionType> getDescription() {
        return getGroup().list(XDDPackage.eINSTANCE.getCompliantWithType_Description());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<LabelRefType> getLabelRef() {
        return getGroup().list(XDDPackage.eINSTANCE.getCompliantWithType_LabelRef());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<DescriptionRefType> getDescriptionRef() {
        return getGroup().list(XDDPackage.eINSTANCE.getCompliantWithType_DescriptionRef());
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
                XDDPackage.COMPLIANT_WITH_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public RangeType getRange() {
        return range;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setRange(RangeType newRange) {
        RangeType oldRange = range;
        range = newRange == null ? RANGE_EDEFAULT : newRange;
        boolean oldRangeESet = rangeESet;
        rangeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.COMPLIANT_WITH_TYPE__RANGE, oldRange, range, !oldRangeESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetRange() {
        RangeType oldRange = range;
        boolean oldRangeESet = rangeESet;
        range = RANGE_EDEFAULT;
        rangeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.COMPLIANT_WITH_TYPE__RANGE, oldRange, RANGE_EDEFAULT, oldRangeESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetRange() {
        return rangeESet;
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
            case XDDPackage.COMPLIANT_WITH_TYPE__GROUP:
                return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
            case XDDPackage.COMPLIANT_WITH_TYPE__LABEL:
                return ((InternalEList<?>) getLabel()).basicRemove(otherEnd, msgs);
            case XDDPackage.COMPLIANT_WITH_TYPE__DESCRIPTION:
                return ((InternalEList<?>) getDescription()).basicRemove(otherEnd, msgs);
            case XDDPackage.COMPLIANT_WITH_TYPE__LABEL_REF:
                return ((InternalEList<?>) getLabelRef()).basicRemove(otherEnd, msgs);
            case XDDPackage.COMPLIANT_WITH_TYPE__DESCRIPTION_REF:
                return ((InternalEList<?>) getDescriptionRef()).basicRemove(otherEnd, msgs);
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
            case XDDPackage.COMPLIANT_WITH_TYPE__GROUP:
                if (coreType)
                    return getGroup();
                return ((FeatureMap.Internal) getGroup()).getWrapper();
            case XDDPackage.COMPLIANT_WITH_TYPE__LABEL:
                return getLabel();
            case XDDPackage.COMPLIANT_WITH_TYPE__DESCRIPTION:
                return getDescription();
            case XDDPackage.COMPLIANT_WITH_TYPE__LABEL_REF:
                return getLabelRef();
            case XDDPackage.COMPLIANT_WITH_TYPE__DESCRIPTION_REF:
                return getDescriptionRef();
            case XDDPackage.COMPLIANT_WITH_TYPE__NAME:
                return getName();
            case XDDPackage.COMPLIANT_WITH_TYPE__RANGE:
                return getRange();
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
            case XDDPackage.COMPLIANT_WITH_TYPE__GROUP:
                ((FeatureMap.Internal) getGroup()).set(newValue);
                return;
            case XDDPackage.COMPLIANT_WITH_TYPE__LABEL:
                getLabel().clear();
                getLabel().addAll((Collection<? extends LabelType>) newValue);
                return;
            case XDDPackage.COMPLIANT_WITH_TYPE__DESCRIPTION:
                getDescription().clear();
                getDescription().addAll((Collection<? extends DescriptionType>) newValue);
                return;
            case XDDPackage.COMPLIANT_WITH_TYPE__LABEL_REF:
                getLabelRef().clear();
                getLabelRef().addAll((Collection<? extends LabelRefType>) newValue);
                return;
            case XDDPackage.COMPLIANT_WITH_TYPE__DESCRIPTION_REF:
                getDescriptionRef().clear();
                getDescriptionRef().addAll((Collection<? extends DescriptionRefType>) newValue);
                return;
            case XDDPackage.COMPLIANT_WITH_TYPE__NAME:
                setName((String) newValue);
                return;
            case XDDPackage.COMPLIANT_WITH_TYPE__RANGE:
                setRange((RangeType) newValue);
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
            case XDDPackage.COMPLIANT_WITH_TYPE__GROUP:
                getGroup().clear();
                return;
            case XDDPackage.COMPLIANT_WITH_TYPE__LABEL:
                getLabel().clear();
                return;
            case XDDPackage.COMPLIANT_WITH_TYPE__DESCRIPTION:
                getDescription().clear();
                return;
            case XDDPackage.COMPLIANT_WITH_TYPE__LABEL_REF:
                getLabelRef().clear();
                return;
            case XDDPackage.COMPLIANT_WITH_TYPE__DESCRIPTION_REF:
                getDescriptionRef().clear();
                return;
            case XDDPackage.COMPLIANT_WITH_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case XDDPackage.COMPLIANT_WITH_TYPE__RANGE:
                unsetRange();
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
            case XDDPackage.COMPLIANT_WITH_TYPE__GROUP:
                return group != null && !group.isEmpty();
            case XDDPackage.COMPLIANT_WITH_TYPE__LABEL:
                return !getLabel().isEmpty();
            case XDDPackage.COMPLIANT_WITH_TYPE__DESCRIPTION:
                return !getDescription().isEmpty();
            case XDDPackage.COMPLIANT_WITH_TYPE__LABEL_REF:
                return !getLabelRef().isEmpty();
            case XDDPackage.COMPLIANT_WITH_TYPE__DESCRIPTION_REF:
                return !getDescriptionRef().isEmpty();
            case XDDPackage.COMPLIANT_WITH_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case XDDPackage.COMPLIANT_WITH_TYPE__RANGE:
                return isSetRange();
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
        result.append(", range: ");
        if (rangeESet)
            result.append(range);
        else
            result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //CompliantWithTypeImpl
