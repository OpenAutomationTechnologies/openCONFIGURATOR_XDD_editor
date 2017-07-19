/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TFunction Type List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TFunctionTypeList#getFunctionType <em>Function Type</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTFunctionTypeList()
 * @model extendedMetaData="name='t_functionTypeList' kind='elementOnly'"
 * @generated
 */
public interface TFunctionTypeList extends EObject {
	/**
	 * Returns the value of the '<em><b>Function Type</b></em>' containment reference list.
	 * The list contents are of type {@link com.br_automation.buoat.xddeditor.XDD.FunctionTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Type</em>' containment reference list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTFunctionTypeList_FunctionType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='functionType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FunctionTypeType> getFunctionType();

} // TFunctionTypeList
