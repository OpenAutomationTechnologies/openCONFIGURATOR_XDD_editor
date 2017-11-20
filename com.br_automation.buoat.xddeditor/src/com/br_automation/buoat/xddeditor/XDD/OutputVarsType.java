/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Vars Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.OutputVarsType#getVarDeclaration <em>Var Declaration</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getOutputVarsType()
 * @model extendedMetaData="name='outputVars_._type' kind='elementOnly'"
 * @generated
 */
public interface OutputVarsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Var Declaration</b></em>' containment reference list.
	 * The list contents are of type {@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Declaration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Declaration</em>' containment reference list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getOutputVarsType_VarDeclaration()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='varDeclaration' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TVarDeclaration> getVarDeclaration();

} // OutputVarsType
