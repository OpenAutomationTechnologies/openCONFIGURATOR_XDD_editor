/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Family Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ProductFamilyType#getValue <em>Value</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ProductFamilyType#isReadOnly <em>Read Only</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProductFamilyType()
 * @model extendedMetaData="name='productFamily_._type' kind='simple'"
 * @generated
 */
public interface ProductFamilyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProductFamilyType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ProductFamilyType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #isSetReadOnly()
	 * @see #unsetReadOnly()
	 * @see #setReadOnly(boolean)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProductFamilyType_ReadOnly()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='readOnly'"
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ProductFamilyType#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isSetReadOnly()
	 * @see #unsetReadOnly()
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ProductFamilyType#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReadOnly()
	 * @see #isReadOnly()
	 * @see #setReadOnly(boolean)
	 * @generated
	 */
	void unsetReadOnly();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ProductFamilyType#isReadOnly <em>Read Only</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Read Only</em>' attribute is set.
	 * @see #unsetReadOnly()
	 * @see #isReadOnly()
	 * @see #setReadOnly(boolean)
	 * @generated
	 */
	boolean isSetReadOnly();

} // ProductFamilyType
