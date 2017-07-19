/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.MemberRefType#getIndex <em>Index</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.MemberRefType#getUniqueIDRef <em>Unique ID Ref</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getMemberRefType()
 * @model extendedMetaData="name='memberRef_._type' kind='empty'"
 * @generated
 */
public interface MemberRefType extends EObject {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #isSetIndex()
	 * @see #unsetIndex()
	 * @see #setIndex(long)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getMemberRefType_Index()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='attribute' name='index'"
	 * @generated
	 */
	long getIndex();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.MemberRefType#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #isSetIndex()
	 * @see #unsetIndex()
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(long value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.MemberRefType#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndex()
	 * @see #getIndex()
	 * @see #setIndex(long)
	 * @generated
	 */
	void unsetIndex();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.MemberRefType#getIndex <em>Index</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Index</em>' attribute is set.
	 * @see #unsetIndex()
	 * @see #getIndex()
	 * @see #setIndex(long)
	 * @generated
	 */
	boolean isSetIndex();

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
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getMemberRefType_UniqueIDRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='uniqueIDRef'"
	 * @generated
	 */
	String getUniqueIDRef();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.MemberRefType#getUniqueIDRef <em>Unique ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique ID Ref</em>' attribute.
	 * @see #getUniqueIDRef()
	 * @generated
	 */
	void setUniqueIDRef(String value);

} // MemberRefType
