/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import java.util.Arrays;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.br_automation.buoat.xddeditor.XDD.SubObjectType;
import com.br_automation.buoat.xddeditor.XDD.TObjectAccessType;
import com.br_automation.buoat.xddeditor.XDD.TObjectPDOMapping;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Sub Object Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.SubObjectTypeImpl#getAccessType
 * <em>Access Type</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.SubObjectTypeImpl#getActualValue
 * <em>Actual Value</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.SubObjectTypeImpl#getDataType
 * <em>Data Type</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.SubObjectTypeImpl#getDefaultValue
 * <em>Default Value</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.SubObjectTypeImpl#getDenotation
 * <em>Denotation</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.SubObjectTypeImpl#getHighLimit
 * <em>High Limit</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.SubObjectTypeImpl#getLowLimit
 * <em>Low Limit</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.SubObjectTypeImpl#getName
 * <em>Name</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.SubObjectTypeImpl#getObjectType
 * <em>Object Type</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.SubObjectTypeImpl#getObjFlags
 * <em>Obj Flags</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.SubObjectTypeImpl#getPDOmapping
 * <em>PDOmapping</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.SubObjectTypeImpl#getSubIndex
 * <em>Sub Index</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.SubObjectTypeImpl#getUniqueIDRef
 * <em>Unique ID Ref</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class SubObjectTypeImpl extends EObjectImpl implements SubObjectType {
    /**
     * The default value of the '{@link #getAccessType() <em>Access Type</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getAccessType()
     * @generated
     * @ordered
     */
    protected static final TObjectAccessType ACCESS_TYPE_EDEFAULT = TObjectAccessType.RO;

    /**
     * The cached value of the '{@link #getAccessType() <em>Access Type</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getAccessType()
     * @generated
     * @ordered
     */
    protected TObjectAccessType accessType = ACCESS_TYPE_EDEFAULT;

    /**
     * This is true if the Access Type attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean accessTypeESet;

    /**
     * The default value of the '{@link #getActualValue() <em>Actual Value</em>}
     * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getActualValue()
     * @generated
     * @ordered
     */
    protected static final String ACTUAL_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getActualValue() <em>Actual Value</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getActualValue()
     * @generated
     * @ordered
     */
    protected String actualValue = ACTUAL_VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getDataType() <em>Data Type</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getDataType()
     * @generated
     * @ordered
     */
    protected static final byte[] DATA_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDataType() <em>Data Type</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getDataType()
     * @generated
     * @ordered
     */
    protected byte[] dataType = DATA_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getDefaultValue()
     * <em>Default Value</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
    protected static final String DEFAULT_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDefaultValue()
     * <em>Default Value</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
    protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getDenotation() <em>Denotation</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getDenotation()
     * @generated
     * @ordered
     */
    protected static final String DENOTATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDenotation() <em>Denotation</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getDenotation()
     * @generated
     * @ordered
     */
    protected String denotation = DENOTATION_EDEFAULT;

    /**
     * The default value of the '{@link #getHighLimit() <em>High Limit</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getHighLimit()
     * @generated
     * @ordered
     */
    protected static final String HIGH_LIMIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHighLimit() <em>High Limit</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getHighLimit()
     * @generated
     * @ordered
     */
    protected String highLimit = HIGH_LIMIT_EDEFAULT;

    /**
     * The default value of the '{@link #getLowLimit() <em>Low Limit</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLowLimit()
     * @generated
     * @ordered
     */
    protected static final String LOW_LIMIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLowLimit() <em>Low Limit</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLowLimit()
     * @generated
     * @ordered
     */
    protected String lowLimit = LOW_LIMIT_EDEFAULT;

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
     * The default value of the '{@link #getObjectType() <em>Object Type</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getObjectType()
     * @generated
     * @ordered
     */
    protected static final short OBJECT_TYPE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getObjectType() <em>Object Type</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getObjectType()
     * @generated
     * @ordered
     */
    protected short objectType = OBJECT_TYPE_EDEFAULT;

    /**
     * This is true if the Object Type attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean objectTypeESet;

    /**
     * The default value of the '{@link #getObjFlags() <em>Obj Flags</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getObjFlags()
     * @generated
     * @ordered
     */
    protected static final byte[] OBJ_FLAGS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getObjFlags() <em>Obj Flags</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getObjFlags()
     * @generated
     * @ordered
     */
    protected byte[] objFlags = OBJ_FLAGS_EDEFAULT;

    /**
     * The default value of the '{@link #getPDOmapping() <em>PDOmapping</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getPDOmapping()
     * @generated
     * @ordered
     */
    protected static final TObjectPDOMapping PD_OMAPPING_EDEFAULT = TObjectPDOMapping.NO;

    /**
     * The cached value of the '{@link #getPDOmapping() <em>PDOmapping</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getPDOmapping()
     * @generated
     * @ordered
     */
    protected TObjectPDOMapping pDOmapping = PD_OMAPPING_EDEFAULT;

    /**
     * This is true if the PDOmapping attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean pDOmappingESet;

    /**
     * The default value of the '{@link #getSubIndex() <em>Sub Index</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSubIndex()
     * @generated
     * @ordered
     */
    protected static final byte[] SUB_INDEX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSubIndex() <em>Sub Index</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSubIndex()
     * @generated
     * @ordered
     */
    protected byte[] subIndex = SUB_INDEX_EDEFAULT;

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
    protected SubObjectTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getSubObjectType();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TObjectAccessType getAccessType() {
        return accessType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setAccessType(TObjectAccessType newAccessType) {
        TObjectAccessType oldAccessType = accessType;
        accessType = newAccessType == null ? ACCESS_TYPE_EDEFAULT : newAccessType;
        boolean oldAccessTypeESet = accessTypeESet;
        accessTypeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.SUB_OBJECT_TYPE__ACCESS_TYPE, oldAccessType, accessType,
                !oldAccessTypeESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetAccessType() {
        TObjectAccessType oldAccessType = accessType;
        boolean oldAccessTypeESet = accessTypeESet;
        accessType = ACCESS_TYPE_EDEFAULT;
        accessTypeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.SUB_OBJECT_TYPE__ACCESS_TYPE, oldAccessType, ACCESS_TYPE_EDEFAULT,
                oldAccessTypeESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetAccessType() {
        return accessTypeESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getActualValue() {
        return actualValue;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setActualValue(String newActualValue) {
        String oldActualValue = actualValue;
        actualValue = newActualValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.SUB_OBJECT_TYPE__ACTUAL_VALUE, oldActualValue, actualValue));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public byte[] getDataType() {
        return dataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setDataType(byte[] newDataType) {
        byte[] oldDataType = dataType;
        dataType = newDataType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.SUB_OBJECT_TYPE__DATA_TYPE, oldDataType, dataType));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setDefaultValue(String newDefaultValue) {
        String oldDefaultValue = defaultValue;
        defaultValue = newDefaultValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.SUB_OBJECT_TYPE__DEFAULT_VALUE, oldDefaultValue, defaultValue));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getDenotation() {
        return denotation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setDenotation(String newDenotation) {
        String oldDenotation = denotation;
        denotation = newDenotation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.SUB_OBJECT_TYPE__DENOTATION, oldDenotation, denotation));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getHighLimit() {
        return highLimit;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setHighLimit(String newHighLimit) {
        String oldHighLimit = highLimit;
        highLimit = newHighLimit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.SUB_OBJECT_TYPE__HIGH_LIMIT, oldHighLimit, highLimit));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getLowLimit() {
        return lowLimit;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setLowLimit(String newLowLimit) {
        String oldLowLimit = lowLimit;
        lowLimit = newLowLimit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.SUB_OBJECT_TYPE__LOW_LIMIT, oldLowLimit, lowLimit));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.SUB_OBJECT_TYPE__NAME,
                oldName, name));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public short getObjectType() {
        return objectType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setObjectType(short newObjectType) {
        short oldObjectType = objectType;
        objectType = newObjectType;
        boolean oldObjectTypeESet = objectTypeESet;
        objectTypeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.SUB_OBJECT_TYPE__OBJECT_TYPE, oldObjectType, objectType,
                !oldObjectTypeESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetObjectType() {
        short oldObjectType = objectType;
        boolean oldObjectTypeESet = objectTypeESet;
        objectType = OBJECT_TYPE_EDEFAULT;
        objectTypeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.SUB_OBJECT_TYPE__OBJECT_TYPE, oldObjectType, OBJECT_TYPE_EDEFAULT,
                oldObjectTypeESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetObjectType() {
        return objectTypeESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public byte[] getObjFlags() {
        return objFlags;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setObjFlags(byte[] newObjFlags) {
        byte[] oldObjFlags = objFlags;
        objFlags = newObjFlags;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.SUB_OBJECT_TYPE__OBJ_FLAGS, oldObjFlags, objFlags));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TObjectPDOMapping getPDOmapping() {
        return pDOmapping;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setPDOmapping(TObjectPDOMapping newPDOmapping) {
        TObjectPDOMapping oldPDOmapping = pDOmapping;
        pDOmapping = newPDOmapping == null ? PD_OMAPPING_EDEFAULT : newPDOmapping;
        boolean oldPDOmappingESet = pDOmappingESet;
        pDOmappingESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.SUB_OBJECT_TYPE__PD_OMAPPING, oldPDOmapping, pDOmapping,
                !oldPDOmappingESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetPDOmapping() {
        TObjectPDOMapping oldPDOmapping = pDOmapping;
        boolean oldPDOmappingESet = pDOmappingESet;
        pDOmapping = PD_OMAPPING_EDEFAULT;
        pDOmappingESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.SUB_OBJECT_TYPE__PD_OMAPPING, oldPDOmapping, PD_OMAPPING_EDEFAULT,
                oldPDOmappingESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetPDOmapping() {
        return pDOmappingESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public byte[] getSubIndex() {
        return subIndex;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public void setSubIndex(byte[] newSubIndex) {
        byte[] oldSubIndex = subIndex;
        subIndex = newSubIndex;
        //j.l: Only notify adapters when index is changed.
    	// BEGIN
        if (!Arrays.equals(oldSubIndex, newSubIndex) && eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.SUB_OBJECT_TYPE__SUB_INDEX, oldSubIndex, subIndex));
     	// j.l.: END 
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
                XDDPackage.SUB_OBJECT_TYPE__UNIQUE_ID_REF, oldUniqueIDRef, uniqueIDRef));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XDDPackage.SUB_OBJECT_TYPE__ACCESS_TYPE:
                return getAccessType();
            case XDDPackage.SUB_OBJECT_TYPE__ACTUAL_VALUE:
                return getActualValue();
            case XDDPackage.SUB_OBJECT_TYPE__DATA_TYPE:
                return getDataType();
            case XDDPackage.SUB_OBJECT_TYPE__DEFAULT_VALUE:
                return getDefaultValue();
            case XDDPackage.SUB_OBJECT_TYPE__DENOTATION:
                return getDenotation();
            case XDDPackage.SUB_OBJECT_TYPE__HIGH_LIMIT:
                return getHighLimit();
            case XDDPackage.SUB_OBJECT_TYPE__LOW_LIMIT:
                return getLowLimit();
            case XDDPackage.SUB_OBJECT_TYPE__NAME:
                return getName();
            case XDDPackage.SUB_OBJECT_TYPE__OBJECT_TYPE:
                return getObjectType();
            case XDDPackage.SUB_OBJECT_TYPE__OBJ_FLAGS:
                return getObjFlags();
            case XDDPackage.SUB_OBJECT_TYPE__PD_OMAPPING:
                return getPDOmapping();
            case XDDPackage.SUB_OBJECT_TYPE__SUB_INDEX:
                return getSubIndex();
            case XDDPackage.SUB_OBJECT_TYPE__UNIQUE_ID_REF:
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
            case XDDPackage.SUB_OBJECT_TYPE__ACCESS_TYPE:
                setAccessType((TObjectAccessType) newValue);
                return;
            case XDDPackage.SUB_OBJECT_TYPE__ACTUAL_VALUE:
                setActualValue((String) newValue);
                return;
            case XDDPackage.SUB_OBJECT_TYPE__DATA_TYPE:
                setDataType((byte[]) newValue);
                return;
            case XDDPackage.SUB_OBJECT_TYPE__DEFAULT_VALUE:
                setDefaultValue((String) newValue);
                return;
            case XDDPackage.SUB_OBJECT_TYPE__DENOTATION:
                setDenotation((String) newValue);
                return;
            case XDDPackage.SUB_OBJECT_TYPE__HIGH_LIMIT:
                setHighLimit((String) newValue);
                return;
            case XDDPackage.SUB_OBJECT_TYPE__LOW_LIMIT:
                setLowLimit((String) newValue);
                return;
            case XDDPackage.SUB_OBJECT_TYPE__NAME:
                setName((String) newValue);
                return;
            case XDDPackage.SUB_OBJECT_TYPE__OBJECT_TYPE:
                setObjectType((Short) newValue);
                return;
            case XDDPackage.SUB_OBJECT_TYPE__OBJ_FLAGS:
                setObjFlags((byte[]) newValue);
                return;
            case XDDPackage.SUB_OBJECT_TYPE__PD_OMAPPING:
                setPDOmapping((TObjectPDOMapping) newValue);
                return;
            case XDDPackage.SUB_OBJECT_TYPE__SUB_INDEX:
                setSubIndex((byte[]) newValue);
                return;
            case XDDPackage.SUB_OBJECT_TYPE__UNIQUE_ID_REF:
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
            case XDDPackage.SUB_OBJECT_TYPE__ACCESS_TYPE:
                unsetAccessType();
                return;
            case XDDPackage.SUB_OBJECT_TYPE__ACTUAL_VALUE:
                setActualValue(ACTUAL_VALUE_EDEFAULT);
                return;
            case XDDPackage.SUB_OBJECT_TYPE__DATA_TYPE:
                setDataType(DATA_TYPE_EDEFAULT);
                return;
            case XDDPackage.SUB_OBJECT_TYPE__DEFAULT_VALUE:
                setDefaultValue(DEFAULT_VALUE_EDEFAULT);
                return;
            case XDDPackage.SUB_OBJECT_TYPE__DENOTATION:
                setDenotation(DENOTATION_EDEFAULT);
                return;
            case XDDPackage.SUB_OBJECT_TYPE__HIGH_LIMIT:
                setHighLimit(HIGH_LIMIT_EDEFAULT);
                return;
            case XDDPackage.SUB_OBJECT_TYPE__LOW_LIMIT:
                setLowLimit(LOW_LIMIT_EDEFAULT);
                return;
            case XDDPackage.SUB_OBJECT_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case XDDPackage.SUB_OBJECT_TYPE__OBJECT_TYPE:
                unsetObjectType();
                return;
            case XDDPackage.SUB_OBJECT_TYPE__OBJ_FLAGS:
                setObjFlags(OBJ_FLAGS_EDEFAULT);
                return;
            case XDDPackage.SUB_OBJECT_TYPE__PD_OMAPPING:
                unsetPDOmapping();
                return;
            case XDDPackage.SUB_OBJECT_TYPE__SUB_INDEX:
                setSubIndex(SUB_INDEX_EDEFAULT);
                return;
            case XDDPackage.SUB_OBJECT_TYPE__UNIQUE_ID_REF:
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
            case XDDPackage.SUB_OBJECT_TYPE__ACCESS_TYPE:
                return isSetAccessType();
            case XDDPackage.SUB_OBJECT_TYPE__ACTUAL_VALUE:
                return ACTUAL_VALUE_EDEFAULT == null ? actualValue != null : !ACTUAL_VALUE_EDEFAULT
                    .equals(actualValue);
            case XDDPackage.SUB_OBJECT_TYPE__DATA_TYPE:
                return DATA_TYPE_EDEFAULT == null ? dataType != null : !DATA_TYPE_EDEFAULT
                    .equals(dataType);
            case XDDPackage.SUB_OBJECT_TYPE__DEFAULT_VALUE:
                return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null
                    : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
            case XDDPackage.SUB_OBJECT_TYPE__DENOTATION:
                return DENOTATION_EDEFAULT == null ? denotation != null : !DENOTATION_EDEFAULT
                    .equals(denotation);
            case XDDPackage.SUB_OBJECT_TYPE__HIGH_LIMIT:
                return HIGH_LIMIT_EDEFAULT == null ? highLimit != null : !HIGH_LIMIT_EDEFAULT
                    .equals(highLimit);
            case XDDPackage.SUB_OBJECT_TYPE__LOW_LIMIT:
                return LOW_LIMIT_EDEFAULT == null ? lowLimit != null : !LOW_LIMIT_EDEFAULT
                    .equals(lowLimit);
            case XDDPackage.SUB_OBJECT_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case XDDPackage.SUB_OBJECT_TYPE__OBJECT_TYPE:
                return isSetObjectType();
            case XDDPackage.SUB_OBJECT_TYPE__OBJ_FLAGS:
                return OBJ_FLAGS_EDEFAULT == null ? objFlags != null : !OBJ_FLAGS_EDEFAULT
                    .equals(objFlags);
            case XDDPackage.SUB_OBJECT_TYPE__PD_OMAPPING:
                return isSetPDOmapping();
            case XDDPackage.SUB_OBJECT_TYPE__SUB_INDEX:
                return SUB_INDEX_EDEFAULT == null ? subIndex != null : !SUB_INDEX_EDEFAULT
                    .equals(subIndex);
            case XDDPackage.SUB_OBJECT_TYPE__UNIQUE_ID_REF:
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
        result.append(" (accessType: ");
        if (accessTypeESet)
            result.append(accessType);
        else
            result.append("<unset>");
        result.append(", actualValue: ");
        result.append(actualValue);
        result.append(", dataType: ");
        result.append(dataType);
        result.append(", defaultValue: ");
        result.append(defaultValue);
        result.append(", denotation: ");
        result.append(denotation);
        result.append(", highLimit: ");
        result.append(highLimit);
        result.append(", lowLimit: ");
        result.append(lowLimit);
        result.append(", name: ");
        result.append(name);
        result.append(", objectType: ");
        if (objectTypeESet)
            result.append(objectType);
        else
            result.append("<unset>");
        result.append(", objFlags: ");
        result.append(objFlags);
        result.append(", pDOmapping: ");
        if (pDOmappingESet)
            result.append(pDOmapping);
        else
            result.append("<unset>");
        result.append(", subIndex: ");
        result.append(subIndex);
        result.append(", uniqueIDRef: ");
        result.append(uniqueIDRef);
        result.append(')');
        return result.toString();
    }

} //SubObjectTypeImpl
