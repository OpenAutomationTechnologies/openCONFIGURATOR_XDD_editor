/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Error Bit Field Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.StaticErrorBitFieldType#getErrorBit <em>Error Bit</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getStaticErrorBitFieldType()
 * @model extendedMetaData="name='StaticErrorBitField_._type' kind='elementOnly'"
 * @generated
 */
public interface StaticErrorBitFieldType extends EObject {
	/**
	 * Returns the value of the '<em><b>Error Bit</b></em>' containment reference list.
	 * The list contents are of type {@link com.br_automation.buoat.xddeditor.XDD.ErrorBitDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Bit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Bit</em>' containment reference list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getStaticErrorBitFieldType_ErrorBit()
	 * @model containment="true" required="true" upper="64"
	 *        extendedMetaData="kind='element' name='ErrorBit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ErrorBitDataType> getErrorBit();

} // StaticErrorBitFieldType
