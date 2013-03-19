/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.InstanceIDRefType;
import com.br_automation.buoat.xddeditor.XDD.MemberRefType;
import com.br_automation.buoat.xddeditor.XDD.TVariableRef;
import com.br_automation.buoat.xddeditor.XDD.VariableIDRefType;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>TVariable Ref</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TVariableRefImpl#getInstanceIDRef
 * <em>Instance ID Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TVariableRefImpl#getVariableIDRef
 * <em>Variable ID Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TVariableRefImpl#getMemberRef
 * <em>Member Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TVariableRefImpl#getPosition
 * <em>Position</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TVariableRefImpl extends EObjectImpl implements TVariableRef {
    /**
     * The cached value of the '{@link #getInstanceIDRef()
     * <em>Instance ID Ref</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getInstanceIDRef()
     * @generated
     * @ordered
     */
    protected EList<InstanceIDRefType> instanceIDRef;

    /**
     * The cached value of the '{@link #getVariableIDRef()
     * <em>Variable ID Ref</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getVariableIDRef()
     * @generated
     * @ordered
     */
    protected VariableIDRefType variableIDRef;

    /**
     * The cached value of the '{@link #getMemberRef() <em>Member Ref</em>}'
     * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getMemberRef()
     * @generated
     * @ordered
     */
    protected EList<MemberRefType> memberRef;

    /**
     * The default value of the '{@link #getPosition() <em>Position</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getPosition()
     * @generated
     * @ordered
     */
    protected static final short POSITION_EDEFAULT = 1;

    /**
     * The cached value of the '{@link #getPosition() <em>Position</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getPosition()
     * @generated
     * @ordered
     */
    protected short position = POSITION_EDEFAULT;

    /**
     * This is true if the Position attribute has been set. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean positionESet;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TVariableRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getTVariableRef();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<InstanceIDRefType> getInstanceIDRef() {
        if (instanceIDRef == null) {
            instanceIDRef = new EObjectContainmentEList<InstanceIDRefType>(InstanceIDRefType.class,
                this, XDDPackage.TVARIABLE_REF__INSTANCE_ID_REF);
        }
        return instanceIDRef;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public VariableIDRefType getVariableIDRef() {
        return variableIDRef;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetVariableIDRef(VariableIDRefType newVariableIDRef,
        NotificationChain msgs) {
        VariableIDRefType oldVariableIDRef = variableIDRef;
        variableIDRef = newVariableIDRef;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TVARIABLE_REF__VARIABLE_ID_REF, oldVariableIDRef, newVariableIDRef);
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
    public void setVariableIDRef(VariableIDRefType newVariableIDRef) {
        if (newVariableIDRef != variableIDRef) {
            NotificationChain msgs = null;
            if (variableIDRef != null)
                msgs = ((InternalEObject) variableIDRef).eInverseRemove(
                    this, EOPPOSITE_FEATURE_BASE - XDDPackage.TVARIABLE_REF__VARIABLE_ID_REF, null,
                    msgs);
            if (newVariableIDRef != null)
                msgs = ((InternalEObject) newVariableIDRef).eInverseAdd(
                    this, EOPPOSITE_FEATURE_BASE - XDDPackage.TVARIABLE_REF__VARIABLE_ID_REF, null,
                    msgs);
            msgs = basicSetVariableIDRef(newVariableIDRef, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TVARIABLE_REF__VARIABLE_ID_REF, newVariableIDRef, newVariableIDRef));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<MemberRefType> getMemberRef() {
        if (memberRef == null) {
            memberRef = new EObjectContainmentEList<MemberRefType>(MemberRefType.class, this,
                XDDPackage.TVARIABLE_REF__MEMBER_REF);
        }
        return memberRef;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public short getPosition() {
        return position;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setPosition(short newPosition) {
        short oldPosition = position;
        position = newPosition;
        boolean oldPositionESet = positionESet;
        positionESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TVARIABLE_REF__POSITION, oldPosition, position, !oldPositionESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetPosition() {
        short oldPosition = position;
        boolean oldPositionESet = positionESet;
        position = POSITION_EDEFAULT;
        positionESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.TVARIABLE_REF__POSITION, oldPosition, POSITION_EDEFAULT, oldPositionESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetPosition() {
        return positionESet;
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
            case XDDPackage.TVARIABLE_REF__INSTANCE_ID_REF:
                return ((InternalEList<?>) getInstanceIDRef()).basicRemove(otherEnd, msgs);
            case XDDPackage.TVARIABLE_REF__VARIABLE_ID_REF:
                return basicSetVariableIDRef(null, msgs);
            case XDDPackage.TVARIABLE_REF__MEMBER_REF:
                return ((InternalEList<?>) getMemberRef()).basicRemove(otherEnd, msgs);
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
            case XDDPackage.TVARIABLE_REF__INSTANCE_ID_REF:
                return getInstanceIDRef();
            case XDDPackage.TVARIABLE_REF__VARIABLE_ID_REF:
                return getVariableIDRef();
            case XDDPackage.TVARIABLE_REF__MEMBER_REF:
                return getMemberRef();
            case XDDPackage.TVARIABLE_REF__POSITION:
                return getPosition();
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
            case XDDPackage.TVARIABLE_REF__INSTANCE_ID_REF:
                getInstanceIDRef().clear();
                getInstanceIDRef().addAll((Collection<? extends InstanceIDRefType>) newValue);
                return;
            case XDDPackage.TVARIABLE_REF__VARIABLE_ID_REF:
                setVariableIDRef((VariableIDRefType) newValue);
                return;
            case XDDPackage.TVARIABLE_REF__MEMBER_REF:
                getMemberRef().clear();
                getMemberRef().addAll((Collection<? extends MemberRefType>) newValue);
                return;
            case XDDPackage.TVARIABLE_REF__POSITION:
                setPosition((Short) newValue);
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
            case XDDPackage.TVARIABLE_REF__INSTANCE_ID_REF:
                getInstanceIDRef().clear();
                return;
            case XDDPackage.TVARIABLE_REF__VARIABLE_ID_REF:
                setVariableIDRef((VariableIDRefType) null);
                return;
            case XDDPackage.TVARIABLE_REF__MEMBER_REF:
                getMemberRef().clear();
                return;
            case XDDPackage.TVARIABLE_REF__POSITION:
                unsetPosition();
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
            case XDDPackage.TVARIABLE_REF__INSTANCE_ID_REF:
                return instanceIDRef != null && !instanceIDRef.isEmpty();
            case XDDPackage.TVARIABLE_REF__VARIABLE_ID_REF:
                return variableIDRef != null;
            case XDDPackage.TVARIABLE_REF__MEMBER_REF:
                return memberRef != null && !memberRef.isEmpty();
            case XDDPackage.TVARIABLE_REF__POSITION:
                return isSetPosition();
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
        result.append(" (position: ");
        if (positionESet)
            result.append(position);
        else
            result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //TVariableRefImpl
