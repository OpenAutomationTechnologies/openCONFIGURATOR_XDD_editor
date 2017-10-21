/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ParameterRefType#getActualValue <em>Actual Value</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ParameterRefType#getBitOffset <em>Bit Offset</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ParameterRefType#isLocked <em>Locked</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ParameterRefType#getUniqueIDRef <em>Unique ID Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ParameterRefType#isVisible <em>Visible</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getParameterRefType()
 * @model extendedMetaData="name='parameterRef_._type' kind='empty'"
 * @generated
 */
public interface ParameterRefType extends EObject {
	/**
	 * Returns the value of the '<em><b>Actual Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Value</em>' attribute.
	 * @see #setActualValue(String)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getParameterRefType_ActualValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='actualValue'"
	 * @generated
	 */
	String getActualValue();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ParameterRefType#getActualValue <em>Actual Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Value</em>' attribute.
	 * @see #getActualValue()
	 * @generated
	 */
	void setActualValue(String value);

	/**
	 * Returns the value of the '<em><b>Bit Offset</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bit Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Offset</em>' attribute.
	 * @see #isSetBitOffset()
	 * @see #unsetBitOffset()
	 * @see #setBitOffset(BigInteger)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getParameterRefType_BitOffset()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='bitOffset'"
	 * @generated
	 */
	BigInteger getBitOffset();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ParameterRefType#getBitOffset <em>Bit Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Offset</em>' attribute.
	 * @see #isSetBitOffset()
	 * @see #unsetBitOffset()
	 * @see #getBitOffset()
	 * @generated
	 */
	void setBitOffset(BigInteger value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ParameterRefType#getBitOffset <em>Bit Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBitOffset()
	 * @see #getBitOffset()
	 * @see #setBitOffset(BigInteger)
	 * @generated
	 */
	void unsetBitOffset();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ParameterRefType#getBitOffset <em>Bit Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bit Offset</em>' attribute is set.
	 * @see #unsetBitOffset()
	 * @see #getBitOffset()
	 * @see #setBitOffset(BigInteger)
	 * @generated
	 */
	boolean isSetBitOffset();

	/**
	 * Returns the value of the '<em><b>Locked</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locked</em>' attribute.
	 * @see #isSetLocked()
	 * @see #unsetLocked()
	 * @see #setLocked(boolean)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getParameterRefType_Locked()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='locked'"
	 * @generated
	 */
	boolean isLocked();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ParameterRefType#isLocked <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locked</em>' attribute.
	 * @see #isSetLocked()
	 * @see #unsetLocked()
	 * @see #isLocked()
	 * @generated
	 */
	void setLocked(boolean value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ParameterRefType#isLocked <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocked()
	 * @see #isLocked()
	 * @see #setLocked(boolean)
	 * @generated
	 */
	void unsetLocked();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ParameterRefType#isLocked <em>Locked</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Locked</em>' attribute is set.
	 * @see #unsetLocked()
	 * @see #isLocked()
	 * @see #setLocked(boolean)
	 * @generated
	 */
	boolean isSetLocked();

	/**
	 * Returns the value of the '<em><b>Unique ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique ID Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique ID Ref</em>' attribute.
	 * @see #setUniqueIDRef(String)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getParameterRefType_UniqueIDRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='uniqueIDRef'"
	 * @generated
	 */
	String getUniqueIDRef();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ParameterRefType#getUniqueIDRef <em>Unique ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique ID Ref</em>' attribute.
	 * @see #getUniqueIDRef()
	 * @generated
	 */
	void setUniqueIDRef(String value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #isSetVisible()
	 * @see #unsetVisible()
	 * @see #setVisible(boolean)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getParameterRefType_Visible()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='visible'"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ParameterRefType#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isSetVisible()
	 * @see #unsetVisible()
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ParameterRefType#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisible()
	 * @see #isVisible()
	 * @see #setVisible(boolean)
	 * @generated
	 */
	void unsetVisible();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ParameterRefType#isVisible <em>Visible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visible</em>' attribute is set.
	 * @see #unsetVisible()
	 * @see #isVisible()
	 * @see #setVisible(boolean)
	 * @generated
	 */
	boolean isSetVisible();

} // ParameterRefType
