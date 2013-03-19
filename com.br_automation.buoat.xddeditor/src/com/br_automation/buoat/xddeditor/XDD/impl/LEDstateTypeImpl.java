/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.DescriptionRefType;
import com.br_automation.buoat.xddeditor.XDD.DescriptionType;
import com.br_automation.buoat.xddeditor.XDD.LEDcolorType;
import com.br_automation.buoat.xddeditor.XDD.LEDstateType;
import com.br_automation.buoat.xddeditor.XDD.LabelRefType;
import com.br_automation.buoat.xddeditor.XDD.LabelType;
import com.br_automation.buoat.xddeditor.XDD.StateType;
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
 * <em><b>LE Dstate Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.LEDstateTypeImpl#getGroup
 * <em>Group</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.LEDstateTypeImpl#getLabel
 * <em>Label</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.LEDstateTypeImpl#getDescription
 * <em>Description</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.LEDstateTypeImpl#getLabelRef
 * <em>Label Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.LEDstateTypeImpl#getDescriptionRef
 * <em>Description Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.LEDstateTypeImpl#getFlashingPeriod
 * <em>Flashing Period</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.LEDstateTypeImpl#getImpulsWidth
 * <em>Impuls Width</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.LEDstateTypeImpl#getLEDcolor
 * <em>LE Dcolor</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.LEDstateTypeImpl#getNumberOfImpulses
 * <em>Number Of Impulses</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.LEDstateTypeImpl#getState
 * <em>State</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.LEDstateTypeImpl#getUniqueID
 * <em>Unique ID</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class LEDstateTypeImpl extends EObjectImpl implements LEDstateType {
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
     * The default value of the '{@link #getFlashingPeriod()
     * <em>Flashing Period</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getFlashingPeriod()
     * @generated
     * @ordered
     */
    protected static final long FLASHING_PERIOD_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getFlashingPeriod()
     * <em>Flashing Period</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getFlashingPeriod()
     * @generated
     * @ordered
     */
    protected long flashingPeriod = FLASHING_PERIOD_EDEFAULT;

    /**
     * This is true if the Flashing Period attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean flashingPeriodESet;

    /**
     * The default value of the '{@link #getImpulsWidth() <em>Impuls Width</em>}
     * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getImpulsWidth()
     * @generated
     * @ordered
     */
    protected static final short IMPULS_WIDTH_EDEFAULT = 50;

    /**
     * The cached value of the '{@link #getImpulsWidth() <em>Impuls Width</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getImpulsWidth()
     * @generated
     * @ordered
     */
    protected short impulsWidth = IMPULS_WIDTH_EDEFAULT;

    /**
     * This is true if the Impuls Width attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean impulsWidthESet;

    /**
     * The default value of the '{@link #getLEDcolor() <em>LE Dcolor</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLEDcolor()
     * @generated
     * @ordered
     */
    protected static final LEDcolorType LE_DCOLOR_EDEFAULT = LEDcolorType.GREEN;

    /**
     * The cached value of the '{@link #getLEDcolor() <em>LE Dcolor</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLEDcolor()
     * @generated
     * @ordered
     */
    protected LEDcolorType lEDcolor = LE_DCOLOR_EDEFAULT;

    /**
     * This is true if the LE Dcolor attribute has been set. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean lEDcolorESet;

    /**
     * The default value of the '{@link #getNumberOfImpulses()
     * <em>Number Of Impulses</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getNumberOfImpulses()
     * @generated
     * @ordered
     */
    protected static final short NUMBER_OF_IMPULSES_EDEFAULT = 1;

    /**
     * The cached value of the '{@link #getNumberOfImpulses()
     * <em>Number Of Impulses</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getNumberOfImpulses()
     * @generated
     * @ordered
     */
    protected short numberOfImpulses = NUMBER_OF_IMPULSES_EDEFAULT;

    /**
     * This is true if the Number Of Impulses attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean numberOfImpulsesESet;

    /**
     * The default value of the '{@link #getState() <em>State</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getState()
     * @generated
     * @ordered
     */
    protected static final StateType STATE_EDEFAULT = StateType.ON;

    /**
     * The cached value of the '{@link #getState() <em>State</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getState()
     * @generated
     * @ordered
     */
    protected StateType state = STATE_EDEFAULT;

    /**
     * This is true if the State attribute has been set. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean stateESet;

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
    protected LEDstateTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getLEDstateType();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, XDDPackage.LE_DSTATE_TYPE__GROUP);
        }
        return group;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<LabelType> getLabel() {
        return getGroup().list(XDDPackage.eINSTANCE.getLEDstateType_Label());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<DescriptionType> getDescription() {
        return getGroup().list(XDDPackage.eINSTANCE.getLEDstateType_Description());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<LabelRefType> getLabelRef() {
        return getGroup().list(XDDPackage.eINSTANCE.getLEDstateType_LabelRef());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<DescriptionRefType> getDescriptionRef() {
        return getGroup().list(XDDPackage.eINSTANCE.getLEDstateType_DescriptionRef());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public long getFlashingPeriod() {
        return flashingPeriod;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setFlashingPeriod(long newFlashingPeriod) {
        long oldFlashingPeriod = flashingPeriod;
        flashingPeriod = newFlashingPeriod;
        boolean oldFlashingPeriodESet = flashingPeriodESet;
        flashingPeriodESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.LE_DSTATE_TYPE__FLASHING_PERIOD, oldFlashingPeriod, flashingPeriod,
                !oldFlashingPeriodESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetFlashingPeriod() {
        long oldFlashingPeriod = flashingPeriod;
        boolean oldFlashingPeriodESet = flashingPeriodESet;
        flashingPeriod = FLASHING_PERIOD_EDEFAULT;
        flashingPeriodESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.LE_DSTATE_TYPE__FLASHING_PERIOD, oldFlashingPeriod,
                FLASHING_PERIOD_EDEFAULT, oldFlashingPeriodESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetFlashingPeriod() {
        return flashingPeriodESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public short getImpulsWidth() {
        return impulsWidth;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setImpulsWidth(short newImpulsWidth) {
        short oldImpulsWidth = impulsWidth;
        impulsWidth = newImpulsWidth;
        boolean oldImpulsWidthESet = impulsWidthESet;
        impulsWidthESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.LE_DSTATE_TYPE__IMPULS_WIDTH, oldImpulsWidth, impulsWidth,
                !oldImpulsWidthESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetImpulsWidth() {
        short oldImpulsWidth = impulsWidth;
        boolean oldImpulsWidthESet = impulsWidthESet;
        impulsWidth = IMPULS_WIDTH_EDEFAULT;
        impulsWidthESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.LE_DSTATE_TYPE__IMPULS_WIDTH, oldImpulsWidth, IMPULS_WIDTH_EDEFAULT,
                oldImpulsWidthESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetImpulsWidth() {
        return impulsWidthESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public LEDcolorType getLEDcolor() {
        return lEDcolor;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setLEDcolor(LEDcolorType newLEDcolor) {
        LEDcolorType oldLEDcolor = lEDcolor;
        lEDcolor = newLEDcolor == null ? LE_DCOLOR_EDEFAULT : newLEDcolor;
        boolean oldLEDcolorESet = lEDcolorESet;
        lEDcolorESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.LE_DSTATE_TYPE__LE_DCOLOR, oldLEDcolor, lEDcolor, !oldLEDcolorESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetLEDcolor() {
        LEDcolorType oldLEDcolor = lEDcolor;
        boolean oldLEDcolorESet = lEDcolorESet;
        lEDcolor = LE_DCOLOR_EDEFAULT;
        lEDcolorESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.LE_DSTATE_TYPE__LE_DCOLOR, oldLEDcolor, LE_DCOLOR_EDEFAULT,
                oldLEDcolorESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetLEDcolor() {
        return lEDcolorESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public short getNumberOfImpulses() {
        return numberOfImpulses;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setNumberOfImpulses(short newNumberOfImpulses) {
        short oldNumberOfImpulses = numberOfImpulses;
        numberOfImpulses = newNumberOfImpulses;
        boolean oldNumberOfImpulsesESet = numberOfImpulsesESet;
        numberOfImpulsesESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.LE_DSTATE_TYPE__NUMBER_OF_IMPULSES, oldNumberOfImpulses,
                numberOfImpulses, !oldNumberOfImpulsesESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetNumberOfImpulses() {
        short oldNumberOfImpulses = numberOfImpulses;
        boolean oldNumberOfImpulsesESet = numberOfImpulsesESet;
        numberOfImpulses = NUMBER_OF_IMPULSES_EDEFAULT;
        numberOfImpulsesESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.LE_DSTATE_TYPE__NUMBER_OF_IMPULSES, oldNumberOfImpulses,
                NUMBER_OF_IMPULSES_EDEFAULT, oldNumberOfImpulsesESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetNumberOfImpulses() {
        return numberOfImpulsesESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public StateType getState() {
        return state;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setState(StateType newState) {
        StateType oldState = state;
        state = newState == null ? STATE_EDEFAULT : newState;
        boolean oldStateESet = stateESet;
        stateESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.LE_DSTATE_TYPE__STATE,
                oldState, state, !oldStateESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetState() {
        StateType oldState = state;
        boolean oldStateESet = stateESet;
        state = STATE_EDEFAULT;
        stateESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.LE_DSTATE_TYPE__STATE, oldState, STATE_EDEFAULT, oldStateESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetState() {
        return stateESet;
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
                XDDPackage.LE_DSTATE_TYPE__UNIQUE_ID, oldUniqueID, uniqueID));
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
            case XDDPackage.LE_DSTATE_TYPE__GROUP:
                return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
            case XDDPackage.LE_DSTATE_TYPE__LABEL:
                return ((InternalEList<?>) getLabel()).basicRemove(otherEnd, msgs);
            case XDDPackage.LE_DSTATE_TYPE__DESCRIPTION:
                return ((InternalEList<?>) getDescription()).basicRemove(otherEnd, msgs);
            case XDDPackage.LE_DSTATE_TYPE__LABEL_REF:
                return ((InternalEList<?>) getLabelRef()).basicRemove(otherEnd, msgs);
            case XDDPackage.LE_DSTATE_TYPE__DESCRIPTION_REF:
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
            case XDDPackage.LE_DSTATE_TYPE__GROUP:
                if (coreType)
                    return getGroup();
                return ((FeatureMap.Internal) getGroup()).getWrapper();
            case XDDPackage.LE_DSTATE_TYPE__LABEL:
                return getLabel();
            case XDDPackage.LE_DSTATE_TYPE__DESCRIPTION:
                return getDescription();
            case XDDPackage.LE_DSTATE_TYPE__LABEL_REF:
                return getLabelRef();
            case XDDPackage.LE_DSTATE_TYPE__DESCRIPTION_REF:
                return getDescriptionRef();
            case XDDPackage.LE_DSTATE_TYPE__FLASHING_PERIOD:
                return getFlashingPeriod();
            case XDDPackage.LE_DSTATE_TYPE__IMPULS_WIDTH:
                return getImpulsWidth();
            case XDDPackage.LE_DSTATE_TYPE__LE_DCOLOR:
                return getLEDcolor();
            case XDDPackage.LE_DSTATE_TYPE__NUMBER_OF_IMPULSES:
                return getNumberOfImpulses();
            case XDDPackage.LE_DSTATE_TYPE__STATE:
                return getState();
            case XDDPackage.LE_DSTATE_TYPE__UNIQUE_ID:
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
            case XDDPackage.LE_DSTATE_TYPE__GROUP:
                ((FeatureMap.Internal) getGroup()).set(newValue);
                return;
            case XDDPackage.LE_DSTATE_TYPE__LABEL:
                getLabel().clear();
                getLabel().addAll((Collection<? extends LabelType>) newValue);
                return;
            case XDDPackage.LE_DSTATE_TYPE__DESCRIPTION:
                getDescription().clear();
                getDescription().addAll((Collection<? extends DescriptionType>) newValue);
                return;
            case XDDPackage.LE_DSTATE_TYPE__LABEL_REF:
                getLabelRef().clear();
                getLabelRef().addAll((Collection<? extends LabelRefType>) newValue);
                return;
            case XDDPackage.LE_DSTATE_TYPE__DESCRIPTION_REF:
                getDescriptionRef().clear();
                getDescriptionRef().addAll((Collection<? extends DescriptionRefType>) newValue);
                return;
            case XDDPackage.LE_DSTATE_TYPE__FLASHING_PERIOD:
                setFlashingPeriod((Long) newValue);
                return;
            case XDDPackage.LE_DSTATE_TYPE__IMPULS_WIDTH:
                setImpulsWidth((Short) newValue);
                return;
            case XDDPackage.LE_DSTATE_TYPE__LE_DCOLOR:
                setLEDcolor((LEDcolorType) newValue);
                return;
            case XDDPackage.LE_DSTATE_TYPE__NUMBER_OF_IMPULSES:
                setNumberOfImpulses((Short) newValue);
                return;
            case XDDPackage.LE_DSTATE_TYPE__STATE:
                setState((StateType) newValue);
                return;
            case XDDPackage.LE_DSTATE_TYPE__UNIQUE_ID:
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
            case XDDPackage.LE_DSTATE_TYPE__GROUP:
                getGroup().clear();
                return;
            case XDDPackage.LE_DSTATE_TYPE__LABEL:
                getLabel().clear();
                return;
            case XDDPackage.LE_DSTATE_TYPE__DESCRIPTION:
                getDescription().clear();
                return;
            case XDDPackage.LE_DSTATE_TYPE__LABEL_REF:
                getLabelRef().clear();
                return;
            case XDDPackage.LE_DSTATE_TYPE__DESCRIPTION_REF:
                getDescriptionRef().clear();
                return;
            case XDDPackage.LE_DSTATE_TYPE__FLASHING_PERIOD:
                unsetFlashingPeriod();
                return;
            case XDDPackage.LE_DSTATE_TYPE__IMPULS_WIDTH:
                unsetImpulsWidth();
                return;
            case XDDPackage.LE_DSTATE_TYPE__LE_DCOLOR:
                unsetLEDcolor();
                return;
            case XDDPackage.LE_DSTATE_TYPE__NUMBER_OF_IMPULSES:
                unsetNumberOfImpulses();
                return;
            case XDDPackage.LE_DSTATE_TYPE__STATE:
                unsetState();
                return;
            case XDDPackage.LE_DSTATE_TYPE__UNIQUE_ID:
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
            case XDDPackage.LE_DSTATE_TYPE__GROUP:
                return group != null && !group.isEmpty();
            case XDDPackage.LE_DSTATE_TYPE__LABEL:
                return !getLabel().isEmpty();
            case XDDPackage.LE_DSTATE_TYPE__DESCRIPTION:
                return !getDescription().isEmpty();
            case XDDPackage.LE_DSTATE_TYPE__LABEL_REF:
                return !getLabelRef().isEmpty();
            case XDDPackage.LE_DSTATE_TYPE__DESCRIPTION_REF:
                return !getDescriptionRef().isEmpty();
            case XDDPackage.LE_DSTATE_TYPE__FLASHING_PERIOD:
                return isSetFlashingPeriod();
            case XDDPackage.LE_DSTATE_TYPE__IMPULS_WIDTH:
                return isSetImpulsWidth();
            case XDDPackage.LE_DSTATE_TYPE__LE_DCOLOR:
                return isSetLEDcolor();
            case XDDPackage.LE_DSTATE_TYPE__NUMBER_OF_IMPULSES:
                return isSetNumberOfImpulses();
            case XDDPackage.LE_DSTATE_TYPE__STATE:
                return isSetState();
            case XDDPackage.LE_DSTATE_TYPE__UNIQUE_ID:
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
        result.append(", flashingPeriod: ");
        if (flashingPeriodESet)
            result.append(flashingPeriod);
        else
            result.append("<unset>");
        result.append(", impulsWidth: ");
        if (impulsWidthESet)
            result.append(impulsWidth);
        else
            result.append("<unset>");
        result.append(", lEDcolor: ");
        if (lEDcolorESet)
            result.append(lEDcolor);
        else
            result.append("<unset>");
        result.append(", numberOfImpulses: ");
        if (numberOfImpulsesESet)
            result.append(numberOfImpulses);
        else
            result.append("<unset>");
        result.append(", state: ");
        if (stateESet)
            result.append(state);
        else
            result.append("<unset>");
        result.append(", uniqueID: ");
        result.append(uniqueID);
        result.append(')');
        return result.toString();
    }

} //LEDstateTypeImpl
