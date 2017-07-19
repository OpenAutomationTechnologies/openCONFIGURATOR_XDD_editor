/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TParameter Group List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroupList#getParameterGroup <em>Parameter Group</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterGroupList()
 * @model extendedMetaData="name='t_parameterGroupList' kind='elementOnly'"
 * @generated
 */
public interface TParameterGroupList extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter Group</b></em>' containment reference list.
	 * The list contents are of type {@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Group</em>' containment reference list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterGroupList_ParameterGroup()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='parameterGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TParameterGroup> getParameterGroup();

} // TParameterGroupList
