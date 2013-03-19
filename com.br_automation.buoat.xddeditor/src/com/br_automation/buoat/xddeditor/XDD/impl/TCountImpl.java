/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.AccessType1;
import com.br_automation.buoat.xddeditor.XDD.DescriptionRefType;
import com.br_automation.buoat.xddeditor.XDD.DescriptionType;
import com.br_automation.buoat.xddeditor.XDD.LabelRefType;
import com.br_automation.buoat.xddeditor.XDD.LabelType;
import com.br_automation.buoat.xddeditor.XDD.TAllowedValues;
import com.br_automation.buoat.xddeditor.XDD.TCount;
import com.br_automation.buoat.xddeditor.XDD.TValue;
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
 * <em><b>TCount</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TCountImpl#getGroup
 * <em>Group</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TCountImpl#getLabel
 * <em>Label</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TCountImpl#getDescription
 * <em>Description</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TCountImpl#getLabelRef
 * <em>Label Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TCountImpl#getDescriptionRef
 * <em>Description Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TCountImpl#getDefaultValue
 * <em>Default Value</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TCountImpl#getAllowedValues
 * <em>Allowed Values</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TCountImpl#getAccess
 * <em>Access</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TCountImpl#getUniqueID
 * <em>Unique ID</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TCountImpl extends EObjectImpl implements TCount {
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
     * The cached value of the '{@link #getDefaultValue()
     * <em>Default Value</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
    protected TValue defaultValue;

    /**
     * The cached value of the '{@link #getAllowedValues()
     * <em>Allowed Values</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getAllowedValues()
     * @generated
     * @ordered
     */
    protected TAllowedValues allowedValues;

    /**
     * The default value of the '{@link #getAccess() <em>Access</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getAccess()
     * @generated
     * @ordered
     */
    protected static final AccessType1 ACCESS_EDEFAULT = AccessType1.READ;

    /**
     * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getAccess()
     * @generated
     * @ordered
     */
    protected AccessType1 access = ACCESS_EDEFAULT;

    /**
     * This is true if the Access attribute has been set. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean accessESet;

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
    protected TCountImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getTCount();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, XDDPackage.TCOUNT__GROUP);
        }
        return group;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<LabelType> getLabel() {
        return getGroup().list(XDDPackage.eINSTANCE.getTCount_Label());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<DescriptionType> getDescription() {
        return getGroup().list(XDDPackage.eINSTANCE.getTCount_Description());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<LabelRefType> getLabelRef() {
        return getGroup().list(XDDPackage.eINSTANCE.getTCount_LabelRef());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<DescriptionRefType> getDescriptionRef() {
        return getGroup().list(XDDPackage.eINSTANCE.getTCount_DescriptionRef());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TValue getDefaultValue() {
        return defaultValue;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetDefaultValue(TValue newDefaultValue, NotificationChain msgs) {
        TValue oldDefaultValue = defaultValue;
        defaultValue = newDefaultValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TCOUNT__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
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
    public void setDefaultValue(TValue newDefaultValue) {
        if (newDefaultValue != defaultValue) {
            NotificationChain msgs = null;
            if (defaultValue != null)
                msgs = ((InternalEObject) defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TCOUNT__DEFAULT_VALUE, null, msgs);
            if (newDefaultValue != null)
                msgs = ((InternalEObject) newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TCOUNT__DEFAULT_VALUE, null, msgs);
            msgs = basicSetDefaultValue(newDefaultValue, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TCOUNT__DEFAULT_VALUE,
                newDefaultValue, newDefaultValue));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TAllowedValues getAllowedValues() {
        return allowedValues;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetAllowedValues(TAllowedValues newAllowedValues,
        NotificationChain msgs) {
        TAllowedValues oldAllowedValues = allowedValues;
        allowedValues = newAllowedValues;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TCOUNT__ALLOWED_VALUES, oldAllowedValues, newAllowedValues);
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
    public void setAllowedValues(TAllowedValues newAllowedValues) {
        if (newAllowedValues != allowedValues) {
            NotificationChain msgs = null;
            if (allowedValues != null)
                msgs = ((InternalEObject) allowedValues).eInverseRemove(
                    this, EOPPOSITE_FEATURE_BASE - XDDPackage.TCOUNT__ALLOWED_VALUES, null, msgs);
            if (newAllowedValues != null)
                msgs = ((InternalEObject) newAllowedValues).eInverseAdd(
                    this, EOPPOSITE_FEATURE_BASE - XDDPackage.TCOUNT__ALLOWED_VALUES, null, msgs);
            msgs = basicSetAllowedValues(newAllowedValues, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TCOUNT__ALLOWED_VALUES, newAllowedValues, newAllowedValues));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public AccessType1 getAccess() {
        return access;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setAccess(AccessType1 newAccess) {
        AccessType1 oldAccess = access;
        access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
        boolean oldAccessESet = accessESet;
        accessESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TCOUNT__ACCESS,
                oldAccess, access, !oldAccessESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetAccess() {
        AccessType1 oldAccess = access;
        boolean oldAccessESet = accessESet;
        access = ACCESS_EDEFAULT;
        accessESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TCOUNT__ACCESS,
                oldAccess, ACCESS_EDEFAULT, oldAccessESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetAccess() {
        return accessESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TCOUNT__UNIQUE_ID,
                oldUniqueID, uniqueID));
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
            case XDDPackage.TCOUNT__GROUP:
                return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
            case XDDPackage.TCOUNT__LABEL:
                return ((InternalEList<?>) getLabel()).basicRemove(otherEnd, msgs);
            case XDDPackage.TCOUNT__DESCRIPTION:
                return ((InternalEList<?>) getDescription()).basicRemove(otherEnd, msgs);
            case XDDPackage.TCOUNT__LABEL_REF:
                return ((InternalEList<?>) getLabelRef()).basicRemove(otherEnd, msgs);
            case XDDPackage.TCOUNT__DESCRIPTION_REF:
                return ((InternalEList<?>) getDescriptionRef()).basicRemove(otherEnd, msgs);
            case XDDPackage.TCOUNT__DEFAULT_VALUE:
                return basicSetDefaultValue(null, msgs);
            case XDDPackage.TCOUNT__ALLOWED_VALUES:
                return basicSetAllowedValues(null, msgs);
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
            case XDDPackage.TCOUNT__GROUP:
                if (coreType)
                    return getGroup();
                return ((FeatureMap.Internal) getGroup()).getWrapper();
            case XDDPackage.TCOUNT__LABEL:
                return getLabel();
            case XDDPackage.TCOUNT__DESCRIPTION:
                return getDescription();
            case XDDPackage.TCOUNT__LABEL_REF:
                return getLabelRef();
            case XDDPackage.TCOUNT__DESCRIPTION_REF:
                return getDescriptionRef();
            case XDDPackage.TCOUNT__DEFAULT_VALUE:
                return getDefaultValue();
            case XDDPackage.TCOUNT__ALLOWED_VALUES:
                return getAllowedValues();
            case XDDPackage.TCOUNT__ACCESS:
                return getAccess();
            case XDDPackage.TCOUNT__UNIQUE_ID:
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
            case XDDPackage.TCOUNT__GROUP:
                ((FeatureMap.Internal) getGroup()).set(newValue);
                return;
            case XDDPackage.TCOUNT__LABEL:
                getLabel().clear();
                getLabel().addAll((Collection<? extends LabelType>) newValue);
                return;
            case XDDPackage.TCOUNT__DESCRIPTION:
                getDescription().clear();
                getDescription().addAll((Collection<? extends DescriptionType>) newValue);
                return;
            case XDDPackage.TCOUNT__LABEL_REF:
                getLabelRef().clear();
                getLabelRef().addAll((Collection<? extends LabelRefType>) newValue);
                return;
            case XDDPackage.TCOUNT__DESCRIPTION_REF:
                getDescriptionRef().clear();
                getDescriptionRef().addAll((Collection<? extends DescriptionRefType>) newValue);
                return;
            case XDDPackage.TCOUNT__DEFAULT_VALUE:
                setDefaultValue((TValue) newValue);
                return;
            case XDDPackage.TCOUNT__ALLOWED_VALUES:
                setAllowedValues((TAllowedValues) newValue);
                return;
            case XDDPackage.TCOUNT__ACCESS:
                setAccess((AccessType1) newValue);
                return;
            case XDDPackage.TCOUNT__UNIQUE_ID:
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
            case XDDPackage.TCOUNT__GROUP:
                getGroup().clear();
                return;
            case XDDPackage.TCOUNT__LABEL:
                getLabel().clear();
                return;
            case XDDPackage.TCOUNT__DESCRIPTION:
                getDescription().clear();
                return;
            case XDDPackage.TCOUNT__LABEL_REF:
                getLabelRef().clear();
                return;
            case XDDPackage.TCOUNT__DESCRIPTION_REF:
                getDescriptionRef().clear();
                return;
            case XDDPackage.TCOUNT__DEFAULT_VALUE:
                setDefaultValue((TValue) null);
                return;
            case XDDPackage.TCOUNT__ALLOWED_VALUES:
                setAllowedValues((TAllowedValues) null);
                return;
            case XDDPackage.TCOUNT__ACCESS:
                unsetAccess();
                return;
            case XDDPackage.TCOUNT__UNIQUE_ID:
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
            case XDDPackage.TCOUNT__GROUP:
                return group != null && !group.isEmpty();
            case XDDPackage.TCOUNT__LABEL:
                return !getLabel().isEmpty();
            case XDDPackage.TCOUNT__DESCRIPTION:
                return !getDescription().isEmpty();
            case XDDPackage.TCOUNT__LABEL_REF:
                return !getLabelRef().isEmpty();
            case XDDPackage.TCOUNT__DESCRIPTION_REF:
                return !getDescriptionRef().isEmpty();
            case XDDPackage.TCOUNT__DEFAULT_VALUE:
                return defaultValue != null;
            case XDDPackage.TCOUNT__ALLOWED_VALUES:
                return allowedValues != null;
            case XDDPackage.TCOUNT__ACCESS:
                return isSetAccess();
            case XDDPackage.TCOUNT__UNIQUE_ID:
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
        result.append(", access: ");
        if (accessESet)
            result.append(access);
        else
            result.append("<unset>");
        result.append(", uniqueID: ");
        result.append(uniqueID);
        result.append(')');
        return result.toString();
    }

} //TCountImpl
