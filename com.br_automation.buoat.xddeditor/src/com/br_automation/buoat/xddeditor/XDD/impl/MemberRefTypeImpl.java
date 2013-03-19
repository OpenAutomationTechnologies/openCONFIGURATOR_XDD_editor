/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.MemberRefType;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Member Ref Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.MemberRefTypeImpl#getIndex
 * <em>Index</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.MemberRefTypeImpl#getUniqueIDRef
 * <em>Unique ID Ref</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MemberRefTypeImpl extends EObjectImpl implements MemberRefType {
    /**
     * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getIndex()
     * @generated
     * @ordered
     */
    protected static final long INDEX_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getIndex()
     * @generated
     * @ordered
     */
    protected long index = INDEX_EDEFAULT;

    /**
     * This is true if the Index attribute has been set. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean indexESet;

    /**
     * The default value of the '{@link #getUniqueIDRef()
     * <em>Unique ID Ref</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getUniqueIDRef()
     * @generated
     * @ordered
     */
    protected static final String UNIQUE_ID_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUniqueIDRef() <em>Unique ID Ref</em>}
     * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getUniqueIDRef()
     * @generated
     * @ordered
     */
    protected String uniqueIDRef = UNIQUE_ID_REF_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected MemberRefTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getMemberRefType();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public long getIndex() {
        return index;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setIndex(long newIndex) {
        long oldIndex = index;
        index = newIndex;
        boolean oldIndexESet = indexESet;
        indexESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.MEMBER_REF_TYPE__INDEX, oldIndex, index, !oldIndexESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetIndex() {
        long oldIndex = index;
        boolean oldIndexESet = indexESet;
        index = INDEX_EDEFAULT;
        indexESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.MEMBER_REF_TYPE__INDEX, oldIndex, INDEX_EDEFAULT, oldIndexESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetIndex() {
        return indexESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getUniqueIDRef() {
        return uniqueIDRef;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setUniqueIDRef(String newUniqueIDRef) {
        String oldUniqueIDRef = uniqueIDRef;
        uniqueIDRef = newUniqueIDRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.MEMBER_REF_TYPE__UNIQUE_ID_REF, oldUniqueIDRef, uniqueIDRef));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XDDPackage.MEMBER_REF_TYPE__INDEX:
                return getIndex();
            case XDDPackage.MEMBER_REF_TYPE__UNIQUE_ID_REF:
                return getUniqueIDRef();
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
            case XDDPackage.MEMBER_REF_TYPE__INDEX:
                setIndex((Long) newValue);
                return;
            case XDDPackage.MEMBER_REF_TYPE__UNIQUE_ID_REF:
                setUniqueIDRef((String) newValue);
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
            case XDDPackage.MEMBER_REF_TYPE__INDEX:
                unsetIndex();
                return;
            case XDDPackage.MEMBER_REF_TYPE__UNIQUE_ID_REF:
                setUniqueIDRef(UNIQUE_ID_REF_EDEFAULT);
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
            case XDDPackage.MEMBER_REF_TYPE__INDEX:
                return isSetIndex();
            case XDDPackage.MEMBER_REF_TYPE__UNIQUE_ID_REF:
                return UNIQUE_ID_REF_EDEFAULT == null ? uniqueIDRef != null
                    : !UNIQUE_ID_REF_EDEFAULT.equals(uniqueIDRef);
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
        result.append(" (index: ");
        if (indexESet)
            result.append(index);
        else
            result.append("<unset>");
        result.append(", uniqueIDRef: ");
        result.append(uniqueIDRef);
        result.append(')');
        return result.toString();
    }

} //MemberRefTypeImpl
