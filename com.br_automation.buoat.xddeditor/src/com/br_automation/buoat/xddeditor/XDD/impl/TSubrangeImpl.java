/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.TSubrange;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>TSubrange</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TSubrangeImpl#getLowerLimit
 * <em>Lower Limit</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TSubrangeImpl#getUpperLimit
 * <em>Upper Limit</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TSubrangeImpl extends EObjectImpl implements TSubrange {
    /**
     * The default value of the '{@link #getLowerLimit() <em>Lower Limit</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLowerLimit()
     * @generated
     * @ordered
     */
    protected static final long LOWER_LIMIT_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getLowerLimit() <em>Lower Limit</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLowerLimit()
     * @generated
     * @ordered
     */
    protected long lowerLimit = LOWER_LIMIT_EDEFAULT;

    /**
     * This is true if the Lower Limit attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean lowerLimitESet;

    /**
     * The default value of the '{@link #getUpperLimit() <em>Upper Limit</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getUpperLimit()
     * @generated
     * @ordered
     */
    protected static final long UPPER_LIMIT_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getUpperLimit() <em>Upper Limit</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getUpperLimit()
     * @generated
     * @ordered
     */
    protected long upperLimit = UPPER_LIMIT_EDEFAULT;

    /**
     * This is true if the Upper Limit attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean upperLimitESet;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TSubrangeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getTSubrange();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public long getLowerLimit() {
        return lowerLimit;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setLowerLimit(long newLowerLimit) {
        long oldLowerLimit = lowerLimit;
        lowerLimit = newLowerLimit;
        boolean oldLowerLimitESet = lowerLimitESet;
        lowerLimitESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TSUBRANGE__LOWER_LIMIT, oldLowerLimit, lowerLimit, !oldLowerLimitESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetLowerLimit() {
        long oldLowerLimit = lowerLimit;
        boolean oldLowerLimitESet = lowerLimitESet;
        lowerLimit = LOWER_LIMIT_EDEFAULT;
        lowerLimitESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.TSUBRANGE__LOWER_LIMIT, oldLowerLimit, LOWER_LIMIT_EDEFAULT,
                oldLowerLimitESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetLowerLimit() {
        return lowerLimitESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public long getUpperLimit() {
        return upperLimit;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setUpperLimit(long newUpperLimit) {
        long oldUpperLimit = upperLimit;
        upperLimit = newUpperLimit;
        boolean oldUpperLimitESet = upperLimitESet;
        upperLimitESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TSUBRANGE__UPPER_LIMIT, oldUpperLimit, upperLimit, !oldUpperLimitESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetUpperLimit() {
        long oldUpperLimit = upperLimit;
        boolean oldUpperLimitESet = upperLimitESet;
        upperLimit = UPPER_LIMIT_EDEFAULT;
        upperLimitESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.TSUBRANGE__UPPER_LIMIT, oldUpperLimit, UPPER_LIMIT_EDEFAULT,
                oldUpperLimitESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetUpperLimit() {
        return upperLimitESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XDDPackage.TSUBRANGE__LOWER_LIMIT:
                return getLowerLimit();
            case XDDPackage.TSUBRANGE__UPPER_LIMIT:
                return getUpperLimit();
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
            case XDDPackage.TSUBRANGE__LOWER_LIMIT:
                setLowerLimit((Long) newValue);
                return;
            case XDDPackage.TSUBRANGE__UPPER_LIMIT:
                setUpperLimit((Long) newValue);
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
            case XDDPackage.TSUBRANGE__LOWER_LIMIT:
                unsetLowerLimit();
                return;
            case XDDPackage.TSUBRANGE__UPPER_LIMIT:
                unsetUpperLimit();
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
            case XDDPackage.TSUBRANGE__LOWER_LIMIT:
                return isSetLowerLimit();
            case XDDPackage.TSUBRANGE__UPPER_LIMIT:
                return isSetUpperLimit();
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
        result.append(" (lowerLimit: ");
        if (lowerLimitESet)
            result.append(lowerLimit);
        else
            result.append("<unset>");
        result.append(", upperLimit: ");
        if (upperLimitESet)
            result.append(upperLimit);
        else
            result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //TSubrangeImpl
