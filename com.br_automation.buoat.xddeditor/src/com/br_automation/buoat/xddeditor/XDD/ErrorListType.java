/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ErrorListType#getError <em>Error</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getErrorListType()
 * @model extendedMetaData="name='ErrorList_._type' kind='elementOnly'"
 * @generated
 */
public interface ErrorListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Error</b></em>' containment reference list.
	 * The list contents are of type {@link com.br_automation.buoat.xddeditor.XDD.ErrorConstantDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' containment reference list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getErrorListType_Error()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Error' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ErrorConstantDataType> getError();

} // ErrorListType
