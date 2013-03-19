/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.MaxValueType;
import com.br_automation.buoat.xddeditor.XDD.MinValueType;
import com.br_automation.buoat.xddeditor.XDD.StepType;
import com.br_automation.buoat.xddeditor.XDD.TRange;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>TRange</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TRangeImpl#getMinValue
 * <em>Min Value</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TRangeImpl#getMaxValue
 * <em>Max Value</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TRangeImpl#getStep <em>
 * Step</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TRangeImpl extends EObjectImpl implements TRange {
    /**
     * The cached value of the '{@link #getMinValue() <em>Min Value</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getMinValue()
     * @generated
     * @ordered
     */
    protected MinValueType minValue;

    /**
     * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getMaxValue()
     * @generated
     * @ordered
     */
    protected MaxValueType maxValue;

    /**
     * The cached value of the '{@link #getStep() <em>Step</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getStep()
     * @generated
     * @ordered
     */
    protected StepType step;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TRangeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getTRange();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public MinValueType getMinValue() {
        return minValue;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetMinValue(MinValueType newMinValue, NotificationChain msgs) {
        MinValueType oldMinValue = minValue;
        minValue = newMinValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TRANGE__MIN_VALUE, oldMinValue, newMinValue);
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
    public void setMinValue(MinValueType newMinValue) {
        if (newMinValue != minValue) {
            NotificationChain msgs = null;
            if (minValue != null)
                msgs = ((InternalEObject) minValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TRANGE__MIN_VALUE, null, msgs);
            if (newMinValue != null)
                msgs = ((InternalEObject) newMinValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TRANGE__MIN_VALUE, null, msgs);
            msgs = basicSetMinValue(newMinValue, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TRANGE__MIN_VALUE,
                newMinValue, newMinValue));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public MaxValueType getMaxValue() {
        return maxValue;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetMaxValue(MaxValueType newMaxValue, NotificationChain msgs) {
        MaxValueType oldMaxValue = maxValue;
        maxValue = newMaxValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TRANGE__MAX_VALUE, oldMaxValue, newMaxValue);
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
    public void setMaxValue(MaxValueType newMaxValue) {
        if (newMaxValue != maxValue) {
            NotificationChain msgs = null;
            if (maxValue != null)
                msgs = ((InternalEObject) maxValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TRANGE__MAX_VALUE, null, msgs);
            if (newMaxValue != null)
                msgs = ((InternalEObject) newMaxValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TRANGE__MAX_VALUE, null, msgs);
            msgs = basicSetMaxValue(newMaxValue, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TRANGE__MAX_VALUE,
                newMaxValue, newMaxValue));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public StepType getStep() {
        return step;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetStep(StepType newStep, NotificationChain msgs) {
        StepType oldStep = step;
        step = newStep;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TRANGE__STEP, oldStep, newStep);
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
    public void setStep(StepType newStep) {
        if (newStep != step) {
            NotificationChain msgs = null;
            if (step != null)
                msgs = ((InternalEObject) step).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TRANGE__STEP, null, msgs);
            if (newStep != null)
                msgs = ((InternalEObject) newStep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TRANGE__STEP, null, msgs);
            msgs = basicSetStep(newStep, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TRANGE__STEP, newStep,
                newStep));
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
            case XDDPackage.TRANGE__MIN_VALUE:
                return basicSetMinValue(null, msgs);
            case XDDPackage.TRANGE__MAX_VALUE:
                return basicSetMaxValue(null, msgs);
            case XDDPackage.TRANGE__STEP:
                return basicSetStep(null, msgs);
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
            case XDDPackage.TRANGE__MIN_VALUE:
                return getMinValue();
            case XDDPackage.TRANGE__MAX_VALUE:
                return getMaxValue();
            case XDDPackage.TRANGE__STEP:
                return getStep();
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
            case XDDPackage.TRANGE__MIN_VALUE:
                setMinValue((MinValueType) newValue);
                return;
            case XDDPackage.TRANGE__MAX_VALUE:
                setMaxValue((MaxValueType) newValue);
                return;
            case XDDPackage.TRANGE__STEP:
                setStep((StepType) newValue);
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
            case XDDPackage.TRANGE__MIN_VALUE:
                setMinValue((MinValueType) null);
                return;
            case XDDPackage.TRANGE__MAX_VALUE:
                setMaxValue((MaxValueType) null);
                return;
            case XDDPackage.TRANGE__STEP:
                setStep((StepType) null);
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
            case XDDPackage.TRANGE__MIN_VALUE:
                return minValue != null;
            case XDDPackage.TRANGE__MAX_VALUE:
                return maxValue != null;
            case XDDPackage.TRANGE__STEP:
                return step != null;
        }
        return super.eIsSet(featureID);
    }

} //TRangeImpl
