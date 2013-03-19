/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.DescriptionRefType;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Description Ref Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.DescriptionRefTypeImpl#getValue
 * <em>Value</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.DescriptionRefTypeImpl#getDictID
 * <em>Dict ID</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.DescriptionRefTypeImpl#getTextID
 * <em>Text ID</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DescriptionRefTypeImpl extends EObjectImpl implements DescriptionRefType {
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
     * The default value of the '{@link #getDictID() <em>Dict ID</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getDictID()
     * @generated
     * @ordered
     */
    protected static final String DICT_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDictID() <em>Dict ID</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getDictID()
     * @generated
     * @ordered
     */
    protected String dictID = DICT_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getTextID() <em>Text ID</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getTextID()
     * @generated
     * @ordered
     */
    protected static final String TEXT_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTextID() <em>Text ID</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getTextID()
     * @generated
     * @ordered
     */
    protected String textID = TEXT_ID_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected DescriptionRefTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getDescriptionRefType();
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
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.DESCRIPTION_REF_TYPE__VALUE, oldValue, value));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getDictID() {
        return dictID;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setDictID(String newDictID) {
        String oldDictID = dictID;
        dictID = newDictID;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.DESCRIPTION_REF_TYPE__DICT_ID, oldDictID, dictID));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getTextID() {
        return textID;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setTextID(String newTextID) {
        String oldTextID = textID;
        textID = newTextID;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.DESCRIPTION_REF_TYPE__TEXT_ID, oldTextID, textID));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XDDPackage.DESCRIPTION_REF_TYPE__VALUE:
                return getValue();
            case XDDPackage.DESCRIPTION_REF_TYPE__DICT_ID:
                return getDictID();
            case XDDPackage.DESCRIPTION_REF_TYPE__TEXT_ID:
                return getTextID();
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
            case XDDPackage.DESCRIPTION_REF_TYPE__VALUE:
                setValue((String) newValue);
                return;
            case XDDPackage.DESCRIPTION_REF_TYPE__DICT_ID:
                setDictID((String) newValue);
                return;
            case XDDPackage.DESCRIPTION_REF_TYPE__TEXT_ID:
                setTextID((String) newValue);
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
            case XDDPackage.DESCRIPTION_REF_TYPE__VALUE:
                setValue(VALUE_EDEFAULT);
                return;
            case XDDPackage.DESCRIPTION_REF_TYPE__DICT_ID:
                setDictID(DICT_ID_EDEFAULT);
                return;
            case XDDPackage.DESCRIPTION_REF_TYPE__TEXT_ID:
                setTextID(TEXT_ID_EDEFAULT);
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
            case XDDPackage.DESCRIPTION_REF_TYPE__VALUE:
                return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
            case XDDPackage.DESCRIPTION_REF_TYPE__DICT_ID:
                return DICT_ID_EDEFAULT == null ? dictID != null : !DICT_ID_EDEFAULT.equals(dictID);
            case XDDPackage.DESCRIPTION_REF_TYPE__TEXT_ID:
                return TEXT_ID_EDEFAULT == null ? textID != null : !TEXT_ID_EDEFAULT.equals(textID);
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
        result.append(", dictID: ");
        result.append(dictID);
        result.append(", textID: ");
        result.append(textID);
        result.append(')');
        return result.toString();
    }

} //DescriptionRefTypeImpl
