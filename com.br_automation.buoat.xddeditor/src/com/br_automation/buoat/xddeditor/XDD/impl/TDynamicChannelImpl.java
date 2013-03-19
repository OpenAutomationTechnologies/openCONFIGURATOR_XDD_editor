/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.AccessTypeType;
import com.br_automation.buoat.xddeditor.XDD.TDynamicChannel;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>TDynamic Channel</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDynamicChannelImpl#getAccessType
 * <em>Access Type</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDynamicChannelImpl#getAddressOffset
 * <em>Address Offset</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDynamicChannelImpl#getBitAlignment
 * <em>Bit Alignment</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDynamicChannelImpl#getDataType
 * <em>Data Type</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDynamicChannelImpl#getEndIndex
 * <em>End Index</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDynamicChannelImpl#getMaxNumber
 * <em>Max Number</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDynamicChannelImpl#getStartIndex
 * <em>Start Index</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TDynamicChannelImpl extends EObjectImpl implements TDynamicChannel {
    /**
     * The default value of the '{@link #getAccessType() <em>Access Type</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getAccessType()
     * @generated
     * @ordered
     */
    protected static final AccessTypeType ACCESS_TYPE_EDEFAULT = AccessTypeType.READ_ONLY;

    /**
     * The cached value of the '{@link #getAccessType() <em>Access Type</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getAccessType()
     * @generated
     * @ordered
     */
    protected AccessTypeType accessType = ACCESS_TYPE_EDEFAULT;

    /**
     * This is true if the Access Type attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean accessTypeESet;

    /**
     * The default value of the '{@link #getAddressOffset()
     * <em>Address Offset</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getAddressOffset()
     * @generated
     * @ordered
     */
    protected static final byte[] ADDRESS_OFFSET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAddressOffset()
     * <em>Address Offset</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getAddressOffset()
     * @generated
     * @ordered
     */
    protected byte[] addressOffset = ADDRESS_OFFSET_EDEFAULT;

    /**
     * The default value of the '{@link #getBitAlignment()
     * <em>Bit Alignment</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getBitAlignment()
     * @generated
     * @ordered
     */
    protected static final short BIT_ALIGNMENT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getBitAlignment()
     * <em>Bit Alignment</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getBitAlignment()
     * @generated
     * @ordered
     */
    protected short bitAlignment = BIT_ALIGNMENT_EDEFAULT;

    /**
     * This is true if the Bit Alignment attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean bitAlignmentESet;

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
     * The default value of the '{@link #getEndIndex() <em>End Index</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getEndIndex()
     * @generated
     * @ordered
     */
    protected static final byte[] END_INDEX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEndIndex() <em>End Index</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getEndIndex()
     * @generated
     * @ordered
     */
    protected byte[] endIndex = END_INDEX_EDEFAULT;

    /**
     * The default value of the '{@link #getMaxNumber() <em>Max Number</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getMaxNumber()
     * @generated
     * @ordered
     */
    protected static final long MAX_NUMBER_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getMaxNumber() <em>Max Number</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getMaxNumber()
     * @generated
     * @ordered
     */
    protected long maxNumber = MAX_NUMBER_EDEFAULT;

    /**
     * This is true if the Max Number attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean maxNumberESet;

    /**
     * The default value of the '{@link #getStartIndex() <em>Start Index</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getStartIndex()
     * @generated
     * @ordered
     */
    protected static final byte[] START_INDEX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStartIndex() <em>Start Index</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getStartIndex()
     * @generated
     * @ordered
     */
    protected byte[] startIndex = START_INDEX_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TDynamicChannelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getTDynamicChannel();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public AccessTypeType getAccessType() {
        return accessType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setAccessType(AccessTypeType newAccessType) {
        AccessTypeType oldAccessType = accessType;
        accessType = newAccessType == null ? ACCESS_TYPE_EDEFAULT : newAccessType;
        boolean oldAccessTypeESet = accessTypeESet;
        accessTypeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDYNAMIC_CHANNEL__ACCESS_TYPE, oldAccessType, accessType,
                !oldAccessTypeESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetAccessType() {
        AccessTypeType oldAccessType = accessType;
        boolean oldAccessTypeESet = accessTypeESet;
        accessType = ACCESS_TYPE_EDEFAULT;
        accessTypeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.TDYNAMIC_CHANNEL__ACCESS_TYPE, oldAccessType, ACCESS_TYPE_EDEFAULT,
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
    public byte[] getAddressOffset() {
        return addressOffset;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setAddressOffset(byte[] newAddressOffset) {
        byte[] oldAddressOffset = addressOffset;
        addressOffset = newAddressOffset;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDYNAMIC_CHANNEL__ADDRESS_OFFSET, oldAddressOffset, addressOffset));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public short getBitAlignment() {
        return bitAlignment;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setBitAlignment(short newBitAlignment) {
        short oldBitAlignment = bitAlignment;
        bitAlignment = newBitAlignment;
        boolean oldBitAlignmentESet = bitAlignmentESet;
        bitAlignmentESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDYNAMIC_CHANNEL__BIT_ALIGNMENT, oldBitAlignment, bitAlignment,
                !oldBitAlignmentESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetBitAlignment() {
        short oldBitAlignment = bitAlignment;
        boolean oldBitAlignmentESet = bitAlignmentESet;
        bitAlignment = BIT_ALIGNMENT_EDEFAULT;
        bitAlignmentESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.TDYNAMIC_CHANNEL__BIT_ALIGNMENT, oldBitAlignment,
                BIT_ALIGNMENT_EDEFAULT, oldBitAlignmentESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetBitAlignment() {
        return bitAlignmentESet;
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
                XDDPackage.TDYNAMIC_CHANNEL__DATA_TYPE, oldDataType, dataType));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public byte[] getEndIndex() {
        return endIndex;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setEndIndex(byte[] newEndIndex) {
        byte[] oldEndIndex = endIndex;
        endIndex = newEndIndex;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDYNAMIC_CHANNEL__END_INDEX, oldEndIndex, endIndex));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public long getMaxNumber() {
        return maxNumber;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setMaxNumber(long newMaxNumber) {
        long oldMaxNumber = maxNumber;
        maxNumber = newMaxNumber;
        boolean oldMaxNumberESet = maxNumberESet;
        maxNumberESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDYNAMIC_CHANNEL__MAX_NUMBER, oldMaxNumber, maxNumber, !oldMaxNumberESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetMaxNumber() {
        long oldMaxNumber = maxNumber;
        boolean oldMaxNumberESet = maxNumberESet;
        maxNumber = MAX_NUMBER_EDEFAULT;
        maxNumberESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.TDYNAMIC_CHANNEL__MAX_NUMBER, oldMaxNumber, MAX_NUMBER_EDEFAULT,
                oldMaxNumberESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetMaxNumber() {
        return maxNumberESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public byte[] getStartIndex() {
        return startIndex;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setStartIndex(byte[] newStartIndex) {
        byte[] oldStartIndex = startIndex;
        startIndex = newStartIndex;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDYNAMIC_CHANNEL__START_INDEX, oldStartIndex, startIndex));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XDDPackage.TDYNAMIC_CHANNEL__ACCESS_TYPE:
                return getAccessType();
            case XDDPackage.TDYNAMIC_CHANNEL__ADDRESS_OFFSET:
                return getAddressOffset();
            case XDDPackage.TDYNAMIC_CHANNEL__BIT_ALIGNMENT:
                return getBitAlignment();
            case XDDPackage.TDYNAMIC_CHANNEL__DATA_TYPE:
                return getDataType();
            case XDDPackage.TDYNAMIC_CHANNEL__END_INDEX:
                return getEndIndex();
            case XDDPackage.TDYNAMIC_CHANNEL__MAX_NUMBER:
                return getMaxNumber();
            case XDDPackage.TDYNAMIC_CHANNEL__START_INDEX:
                return getStartIndex();
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
            case XDDPackage.TDYNAMIC_CHANNEL__ACCESS_TYPE:
                setAccessType((AccessTypeType) newValue);
                return;
            case XDDPackage.TDYNAMIC_CHANNEL__ADDRESS_OFFSET:
                setAddressOffset((byte[]) newValue);
                return;
            case XDDPackage.TDYNAMIC_CHANNEL__BIT_ALIGNMENT:
                setBitAlignment((Short) newValue);
                return;
            case XDDPackage.TDYNAMIC_CHANNEL__DATA_TYPE:
                setDataType((byte[]) newValue);
                return;
            case XDDPackage.TDYNAMIC_CHANNEL__END_INDEX:
                setEndIndex((byte[]) newValue);
                return;
            case XDDPackage.TDYNAMIC_CHANNEL__MAX_NUMBER:
                setMaxNumber((Long) newValue);
                return;
            case XDDPackage.TDYNAMIC_CHANNEL__START_INDEX:
                setStartIndex((byte[]) newValue);
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
            case XDDPackage.TDYNAMIC_CHANNEL__ACCESS_TYPE:
                unsetAccessType();
                return;
            case XDDPackage.TDYNAMIC_CHANNEL__ADDRESS_OFFSET:
                setAddressOffset(ADDRESS_OFFSET_EDEFAULT);
                return;
            case XDDPackage.TDYNAMIC_CHANNEL__BIT_ALIGNMENT:
                unsetBitAlignment();
                return;
            case XDDPackage.TDYNAMIC_CHANNEL__DATA_TYPE:
                setDataType(DATA_TYPE_EDEFAULT);
                return;
            case XDDPackage.TDYNAMIC_CHANNEL__END_INDEX:
                setEndIndex(END_INDEX_EDEFAULT);
                return;
            case XDDPackage.TDYNAMIC_CHANNEL__MAX_NUMBER:
                unsetMaxNumber();
                return;
            case XDDPackage.TDYNAMIC_CHANNEL__START_INDEX:
                setStartIndex(START_INDEX_EDEFAULT);
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
            case XDDPackage.TDYNAMIC_CHANNEL__ACCESS_TYPE:
                return isSetAccessType();
            case XDDPackage.TDYNAMIC_CHANNEL__ADDRESS_OFFSET:
                return ADDRESS_OFFSET_EDEFAULT == null ? addressOffset != null
                    : !ADDRESS_OFFSET_EDEFAULT.equals(addressOffset);
            case XDDPackage.TDYNAMIC_CHANNEL__BIT_ALIGNMENT:
                return isSetBitAlignment();
            case XDDPackage.TDYNAMIC_CHANNEL__DATA_TYPE:
                return DATA_TYPE_EDEFAULT == null ? dataType != null : !DATA_TYPE_EDEFAULT
                    .equals(dataType);
            case XDDPackage.TDYNAMIC_CHANNEL__END_INDEX:
                return END_INDEX_EDEFAULT == null ? endIndex != null : !END_INDEX_EDEFAULT
                    .equals(endIndex);
            case XDDPackage.TDYNAMIC_CHANNEL__MAX_NUMBER:
                return isSetMaxNumber();
            case XDDPackage.TDYNAMIC_CHANNEL__START_INDEX:
                return START_INDEX_EDEFAULT == null ? startIndex != null : !START_INDEX_EDEFAULT
                    .equals(startIndex);
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
        result.append(", addressOffset: ");
        result.append(addressOffset);
        result.append(", bitAlignment: ");
        if (bitAlignmentESet)
            result.append(bitAlignment);
        else
            result.append("<unset>");
        result.append(", dataType: ");
        result.append(dataType);
        result.append(", endIndex: ");
        result.append(endIndex);
        result.append(", maxNumber: ");
        if (maxNumberESet)
            result.append(maxNumber);
        else
            result.append("<unset>");
        result.append(", startIndex: ");
        result.append(startIndex);
        result.append(')');
        return result.toString();
    }

} //TDynamicChannelImpl
