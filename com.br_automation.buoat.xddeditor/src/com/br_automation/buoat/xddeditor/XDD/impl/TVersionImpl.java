/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.TVersion;
import com.br_automation.buoat.xddeditor.XDD.VersionTypeType;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>TVersion</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TVersionImpl#getValue
 * <em>Value</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TVersionImpl#isReadOnly
 * <em>Read Only</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TVersionImpl#getVersionType
 * <em>Version Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TVersionImpl extends EObjectImpl implements TVersion {
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
     * The default value of the '{@link #isReadOnly() <em>Read Only</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #isReadOnly()
     * @generated
     * @ordered
     */
    protected static final boolean READ_ONLY_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #isReadOnly()
     * @generated
     * @ordered
     */
    protected boolean readOnly = READ_ONLY_EDEFAULT;

    /**
     * This is true if the Read Only attribute has been set. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean readOnlyESet;

    /**
     * The default value of the '{@link #getVersionType() <em>Version Type</em>}
     * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getVersionType()
     * @generated
     * @ordered
     */
    protected static final VersionTypeType VERSION_TYPE_EDEFAULT = VersionTypeType.SW;

    /**
     * The cached value of the '{@link #getVersionType() <em>Version Type</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getVersionType()
     * @generated
     * @ordered
     */
    protected VersionTypeType versionType = VERSION_TYPE_EDEFAULT;

    /**
     * This is true if the Version Type attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean versionTypeESet;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TVersionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getTVersion();
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
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TVERSION__VALUE,
                oldValue, value));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isReadOnly() {
        return readOnly;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setReadOnly(boolean newReadOnly) {
        boolean oldReadOnly = readOnly;
        readOnly = newReadOnly;
        boolean oldReadOnlyESet = readOnlyESet;
        readOnlyESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TVERSION__READ_ONLY,
                oldReadOnly, readOnly, !oldReadOnlyESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetReadOnly() {
        boolean oldReadOnly = readOnly;
        boolean oldReadOnlyESet = readOnlyESet;
        readOnly = READ_ONLY_EDEFAULT;
        readOnlyESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TVERSION__READ_ONLY,
                oldReadOnly, READ_ONLY_EDEFAULT, oldReadOnlyESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetReadOnly() {
        return readOnlyESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public VersionTypeType getVersionType() {
        return versionType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setVersionType(VersionTypeType newVersionType) {
        VersionTypeType oldVersionType = versionType;
        versionType = newVersionType == null ? VERSION_TYPE_EDEFAULT : newVersionType;
        boolean oldVersionTypeESet = versionTypeESet;
        versionTypeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TVERSION__VERSION_TYPE, oldVersionType, versionType, !oldVersionTypeESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetVersionType() {
        VersionTypeType oldVersionType = versionType;
        boolean oldVersionTypeESet = versionTypeESet;
        versionType = VERSION_TYPE_EDEFAULT;
        versionTypeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.TVERSION__VERSION_TYPE, oldVersionType, VERSION_TYPE_EDEFAULT,
                oldVersionTypeESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetVersionType() {
        return versionTypeESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XDDPackage.TVERSION__VALUE:
                return getValue();
            case XDDPackage.TVERSION__READ_ONLY:
                return isReadOnly();
            case XDDPackage.TVERSION__VERSION_TYPE:
                return getVersionType();
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
            case XDDPackage.TVERSION__VALUE:
                setValue((String) newValue);
                return;
            case XDDPackage.TVERSION__READ_ONLY:
                setReadOnly((Boolean) newValue);
                return;
            case XDDPackage.TVERSION__VERSION_TYPE:
                setVersionType((VersionTypeType) newValue);
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
            case XDDPackage.TVERSION__VALUE:
                setValue(VALUE_EDEFAULT);
                return;
            case XDDPackage.TVERSION__READ_ONLY:
                unsetReadOnly();
                return;
            case XDDPackage.TVERSION__VERSION_TYPE:
                unsetVersionType();
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
            case XDDPackage.TVERSION__VALUE:
                return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
            case XDDPackage.TVERSION__READ_ONLY:
                return isSetReadOnly();
            case XDDPackage.TVERSION__VERSION_TYPE:
                return isSetVersionType();
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
        result.append(" (value: ");
        result.append(value);
        result.append(", readOnly: ");
        if (readOnlyESet)
            result.append(readOnly);
        else
            result.append("<unset>");
        result.append(", versionType: ");
        if (versionTypeESet)
            result.append(versionType);
        else
            result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //TVersionImpl
