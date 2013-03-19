/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>TDynamic Channel</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getAccessType
 * <em>Access Type</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getAddressOffset
 * <em>Address Offset</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getBitAlignment
 * <em>Bit Alignment</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getDataType
 * <em>Data Type</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getEndIndex
 * <em>End Index</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getMaxNumber
 * <em>Max Number</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getStartIndex
 * <em>Start Index</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDynamicChannel()
 * @model extendedMetaData="name='t_dynamicChannel' kind='empty'"
 * @generated
 */
public interface TDynamicChannel extends EObject {
    /**
     * Returns the value of the '<em><b>Access Type</b></em>' attribute. The
     * literals are from the enumeration
     * {@link com.br_automation.buoat.xddeditor.XDD.AccessTypeType}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Access Type</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Access Type</em>' attribute.
     * @see com.br_automation.buoat.xddeditor.XDD.AccessTypeType
     * @see #isSetAccessType()
     * @see #unsetAccessType()
     * @see #setAccessType(AccessTypeType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDynamicChannel_AccessType()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='accessType'"
     * @generated
     */
    AccessTypeType getAccessType();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getAccessType
     * <em>Access Type</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Access Type</em>' attribute.
     * @see com.br_automation.buoat.xddeditor.XDD.AccessTypeType
     * @see #isSetAccessType()
     * @see #unsetAccessType()
     * @see #getAccessType()
     * @generated
     */
    void setAccessType(AccessTypeType value);

    /**
     * Unsets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getAccessType
     * <em>Access Type</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isSetAccessType()
     * @see #getAccessType()
     * @see #setAccessType(AccessTypeType)
     * @generated
     */
    void unsetAccessType();

    /**
     * Returns whether the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getAccessType
     * <em>Access Type</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return whether the value of the '<em>Access Type</em>' attribute is set.
     * @see #unsetAccessType()
     * @see #getAccessType()
     * @see #setAccessType(AccessTypeType)
     * @generated
     */
    boolean isSetAccessType();

    /**
     * Returns the value of the '<em><b>Address Offset</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Address Offset</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Address Offset</em>' attribute.
     * @see #setAddressOffset(byte[])
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDynamicChannel_AddressOffset()
     * @model dataType="org.eclipse.emf.ecore.xml.type.HexBinary"
     *        required="true"
     *        extendedMetaData="kind='attribute' name='addressOffset'"
     * @generated
     */
    byte[] getAddressOffset();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getAddressOffset
     * <em>Address Offset</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Address Offset</em>' attribute.
     * @see #getAddressOffset()
     * @generated
     */
    void setAddressOffset(byte[] value);

    /**
     * Returns the value of the '<em><b>Bit Alignment</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bit Alignment</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Bit Alignment</em>' attribute.
     * @see #isSetBitAlignment()
     * @see #unsetBitAlignment()
     * @see #setBitAlignment(short)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDynamicChannel_BitAlignment()
     * @model unsettable="true"
     *        dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte"
     *        extendedMetaData="kind='attribute' name='bitAlignment'"
     * @generated
     */
    short getBitAlignment();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getBitAlignment
     * <em>Bit Alignment</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Bit Alignment</em>' attribute.
     * @see #isSetBitAlignment()
     * @see #unsetBitAlignment()
     * @see #getBitAlignment()
     * @generated
     */
    void setBitAlignment(short value);

    /**
     * Unsets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getBitAlignment
     * <em>Bit Alignment</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isSetBitAlignment()
     * @see #getBitAlignment()
     * @see #setBitAlignment(short)
     * @generated
     */
    void unsetBitAlignment();

    /**
     * Returns whether the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getBitAlignment
     * <em>Bit Alignment</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return whether the value of the '<em>Bit Alignment</em>' attribute is
     *         set.
     * @see #unsetBitAlignment()
     * @see #getBitAlignment()
     * @see #setBitAlignment(short)
     * @generated
     */
    boolean isSetBitAlignment();

    /**
     * Returns the value of the '<em><b>Data Type</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Type</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Data Type</em>' attribute.
     * @see #setDataType(byte[])
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDynamicChannel_DataType()
     * @model dataType="org.eclipse.emf.ecore.xml.type.HexBinary"
     *        required="true"
     *        extendedMetaData="kind='attribute' name='dataType'"
     * @generated
     */
    byte[] getDataType();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getDataType
     * <em>Data Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Data Type</em>' attribute.
     * @see #getDataType()
     * @generated
     */
    void setDataType(byte[] value);

    /**
     * Returns the value of the '<em><b>End Index</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Index</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>End Index</em>' attribute.
     * @see #setEndIndex(byte[])
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDynamicChannel_EndIndex()
     * @model dataType="org.eclipse.emf.ecore.xml.type.HexBinary"
     *        required="true"
     *        extendedMetaData="kind='attribute' name='endIndex'"
     * @generated
     */
    byte[] getEndIndex();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getEndIndex
     * <em>End Index</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>End Index</em>' attribute.
     * @see #getEndIndex()
     * @generated
     */
    void setEndIndex(byte[] value);

    /**
     * Returns the value of the '<em><b>Max Number</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Number</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Max Number</em>' attribute.
     * @see #isSetMaxNumber()
     * @see #unsetMaxNumber()
     * @see #setMaxNumber(long)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDynamicChannel_MaxNumber()
     * @model unsettable="true"
     *        dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
     *        required="true"
     *        extendedMetaData="kind='attribute' name='maxNumber'"
     * @generated
     */
    long getMaxNumber();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getMaxNumber
     * <em>Max Number</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Max Number</em>' attribute.
     * @see #isSetMaxNumber()
     * @see #unsetMaxNumber()
     * @see #getMaxNumber()
     * @generated
     */
    void setMaxNumber(long value);

    /**
     * Unsets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getMaxNumber
     * <em>Max Number</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isSetMaxNumber()
     * @see #getMaxNumber()
     * @see #setMaxNumber(long)
     * @generated
     */
    void unsetMaxNumber();

    /**
     * Returns whether the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getMaxNumber
     * <em>Max Number</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return whether the value of the '<em>Max Number</em>' attribute is set.
     * @see #unsetMaxNumber()
     * @see #getMaxNumber()
     * @see #setMaxNumber(long)
     * @generated
     */
    boolean isSetMaxNumber();

    /**
     * Returns the value of the '<em><b>Start Index</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start Index</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Start Index</em>' attribute.
     * @see #setStartIndex(byte[])
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDynamicChannel_StartIndex()
     * @model dataType="org.eclipse.emf.ecore.xml.type.HexBinary"
     *        required="true"
     *        extendedMetaData="kind='attribute' name='startIndex'"
     * @generated
     */
    byte[] getStartIndex();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getStartIndex
     * <em>Start Index</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Start Index</em>' attribute.
     * @see #getStartIndex()
     * @generated
     */
    void setStartIndex(byte[] value);

} // TDynamicChannel
