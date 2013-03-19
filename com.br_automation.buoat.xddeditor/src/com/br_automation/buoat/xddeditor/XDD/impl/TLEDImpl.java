/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.DescriptionRefType;
import com.br_automation.buoat.xddeditor.XDD.DescriptionType;
import com.br_automation.buoat.xddeditor.XDD.LEDcolorsType;
import com.br_automation.buoat.xddeditor.XDD.LEDstateType;
import com.br_automation.buoat.xddeditor.XDD.LEDtypeType;
import com.br_automation.buoat.xddeditor.XDD.LabelRefType;
import com.br_automation.buoat.xddeditor.XDD.LabelType;
import com.br_automation.buoat.xddeditor.XDD.TLED;
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
 * <em><b>TLED</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TLEDImpl#getGroup <em>
 * Group</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TLEDImpl#getLabel <em>
 * Label</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TLEDImpl#getDescription
 * <em>Description</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TLEDImpl#getLabelRef
 * <em>Label Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TLEDImpl#getDescriptionRef
 * <em>Description Ref</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TLEDImpl#getLEDstate
 * <em>LE Dstate</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TLEDImpl#getLEDcolors
 * <em>LE Dcolors</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TLEDImpl#getLEDtype
 * <em>LE Dtype</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TLEDImpl extends EObjectImpl implements TLED {
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
     * The cached value of the '{@link #getLEDstate() <em>LE Dstate</em>}'
     * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLEDstate()
     * @generated
     * @ordered
     */
    protected EList<LEDstateType> lEDstate;

    /**
     * The default value of the '{@link #getLEDcolors() <em>LE Dcolors</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLEDcolors()
     * @generated
     * @ordered
     */
    protected static final LEDcolorsType LE_DCOLORS_EDEFAULT = LEDcolorsType.MONOCOLOR;

    /**
     * The cached value of the '{@link #getLEDcolors() <em>LE Dcolors</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLEDcolors()
     * @generated
     * @ordered
     */
    protected LEDcolorsType lEDcolors = LE_DCOLORS_EDEFAULT;

    /**
     * This is true if the LE Dcolors attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean lEDcolorsESet;

    /**
     * The default value of the '{@link #getLEDtype() <em>LE Dtype</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLEDtype()
     * @generated
     * @ordered
     */
    protected static final LEDtypeType LE_DTYPE_EDEFAULT = LEDtypeType.IO;

    /**
     * The cached value of the '{@link #getLEDtype() <em>LE Dtype</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLEDtype()
     * @generated
     * @ordered
     */
    protected LEDtypeType lEDtype = LE_DTYPE_EDEFAULT;

    /**
     * This is true if the LE Dtype attribute has been set. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean lEDtypeESet;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TLEDImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getTLED();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, XDDPackage.TLED__GROUP);
        }
        return group;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<LabelType> getLabel() {
        return getGroup().list(XDDPackage.eINSTANCE.getTLED_Label());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<DescriptionType> getDescription() {
        return getGroup().list(XDDPackage.eINSTANCE.getTLED_Description());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<LabelRefType> getLabelRef() {
        return getGroup().list(XDDPackage.eINSTANCE.getTLED_LabelRef());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<DescriptionRefType> getDescriptionRef() {
        return getGroup().list(XDDPackage.eINSTANCE.getTLED_DescriptionRef());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<LEDstateType> getLEDstate() {
        if (lEDstate == null) {
            lEDstate = new EObjectContainmentEList<LEDstateType>(LEDstateType.class, this,
                XDDPackage.TLED__LE_DSTATE);
        }
        return lEDstate;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public LEDcolorsType getLEDcolors() {
        return lEDcolors;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setLEDcolors(LEDcolorsType newLEDcolors) {
        LEDcolorsType oldLEDcolors = lEDcolors;
        lEDcolors = newLEDcolors == null ? LE_DCOLORS_EDEFAULT : newLEDcolors;
        boolean oldLEDcolorsESet = lEDcolorsESet;
        lEDcolorsESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TLED__LE_DCOLORS,
                oldLEDcolors, lEDcolors, !oldLEDcolorsESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetLEDcolors() {
        LEDcolorsType oldLEDcolors = lEDcolors;
        boolean oldLEDcolorsESet = lEDcolorsESet;
        lEDcolors = LE_DCOLORS_EDEFAULT;
        lEDcolorsESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TLED__LE_DCOLORS,
                oldLEDcolors, LE_DCOLORS_EDEFAULT, oldLEDcolorsESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetLEDcolors() {
        return lEDcolorsESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public LEDtypeType getLEDtype() {
        return lEDtype;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setLEDtype(LEDtypeType newLEDtype) {
        LEDtypeType oldLEDtype = lEDtype;
        lEDtype = newLEDtype == null ? LE_DTYPE_EDEFAULT : newLEDtype;
        boolean oldLEDtypeESet = lEDtypeESet;
        lEDtypeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TLED__LE_DTYPE,
                oldLEDtype, lEDtype, !oldLEDtypeESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetLEDtype() {
        LEDtypeType oldLEDtype = lEDtype;
        boolean oldLEDtypeESet = lEDtypeESet;
        lEDtype = LE_DTYPE_EDEFAULT;
        lEDtypeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TLED__LE_DTYPE,
                oldLEDtype, LE_DTYPE_EDEFAULT, oldLEDtypeESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetLEDtype() {
        return lEDtypeESet;
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
            case XDDPackage.TLED__GROUP:
                return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
            case XDDPackage.TLED__LABEL:
                return ((InternalEList<?>) getLabel()).basicRemove(otherEnd, msgs);
            case XDDPackage.TLED__DESCRIPTION:
                return ((InternalEList<?>) getDescription()).basicRemove(otherEnd, msgs);
            case XDDPackage.TLED__LABEL_REF:
                return ((InternalEList<?>) getLabelRef()).basicRemove(otherEnd, msgs);
            case XDDPackage.TLED__DESCRIPTION_REF:
                return ((InternalEList<?>) getDescriptionRef()).basicRemove(otherEnd, msgs);
            case XDDPackage.TLED__LE_DSTATE:
                return ((InternalEList<?>) getLEDstate()).basicRemove(otherEnd, msgs);
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
            case XDDPackage.TLED__GROUP:
                if (coreType)
                    return getGroup();
                return ((FeatureMap.Internal) getGroup()).getWrapper();
            case XDDPackage.TLED__LABEL:
                return getLabel();
            case XDDPackage.TLED__DESCRIPTION:
                return getDescription();
            case XDDPackage.TLED__LABEL_REF:
                return getLabelRef();
            case XDDPackage.TLED__DESCRIPTION_REF:
                return getDescriptionRef();
            case XDDPackage.TLED__LE_DSTATE:
                return getLEDstate();
            case XDDPackage.TLED__LE_DCOLORS:
                return getLEDcolors();
            case XDDPackage.TLED__LE_DTYPE:
                return getLEDtype();
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
            case XDDPackage.TLED__GROUP:
                ((FeatureMap.Internal) getGroup()).set(newValue);
                return;
            case XDDPackage.TLED__LABEL:
                getLabel().clear();
                getLabel().addAll((Collection<? extends LabelType>) newValue);
                return;
            case XDDPackage.TLED__DESCRIPTION:
                getDescription().clear();
                getDescription().addAll((Collection<? extends DescriptionType>) newValue);
                return;
            case XDDPackage.TLED__LABEL_REF:
                getLabelRef().clear();
                getLabelRef().addAll((Collection<? extends LabelRefType>) newValue);
                return;
            case XDDPackage.TLED__DESCRIPTION_REF:
                getDescriptionRef().clear();
                getDescriptionRef().addAll((Collection<? extends DescriptionRefType>) newValue);
                return;
            case XDDPackage.TLED__LE_DSTATE:
                getLEDstate().clear();
                getLEDstate().addAll((Collection<? extends LEDstateType>) newValue);
                return;
            case XDDPackage.TLED__LE_DCOLORS:
                setLEDcolors((LEDcolorsType) newValue);
                return;
            case XDDPackage.TLED__LE_DTYPE:
                setLEDtype((LEDtypeType) newValue);
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
            case XDDPackage.TLED__GROUP:
                getGroup().clear();
                return;
            case XDDPackage.TLED__LABEL:
                getLabel().clear();
                return;
            case XDDPackage.TLED__DESCRIPTION:
                getDescription().clear();
                return;
            case XDDPackage.TLED__LABEL_REF:
                getLabelRef().clear();
                return;
            case XDDPackage.TLED__DESCRIPTION_REF:
                getDescriptionRef().clear();
                return;
            case XDDPackage.TLED__LE_DSTATE:
                getLEDstate().clear();
                return;
            case XDDPackage.TLED__LE_DCOLORS:
                unsetLEDcolors();
                return;
            case XDDPackage.TLED__LE_DTYPE:
                unsetLEDtype();
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
            case XDDPackage.TLED__GROUP:
                return group != null && !group.isEmpty();
            case XDDPackage.TLED__LABEL:
                return !getLabel().isEmpty();
            case XDDPackage.TLED__DESCRIPTION:
                return !getDescription().isEmpty();
            case XDDPackage.TLED__LABEL_REF:
                return !getLabelRef().isEmpty();
            case XDDPackage.TLED__DESCRIPTION_REF:
                return !getDescriptionRef().isEmpty();
            case XDDPackage.TLED__LE_DSTATE:
                return lEDstate != null && !lEDstate.isEmpty();
            case XDDPackage.TLED__LE_DCOLORS:
                return isSetLEDcolors();
            case XDDPackage.TLED__LE_DTYPE:
                return isSetLEDtype();
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
        result.append(", lEDcolors: ");
        if (lEDcolorsESet)
            result.append(lEDcolors);
        else
            result.append("<unset>");
        result.append(", lEDtype: ");
        if (lEDtypeESet)
            result.append(lEDtype);
        else
            result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //TLEDImpl
