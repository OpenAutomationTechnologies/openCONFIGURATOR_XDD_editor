/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Compliance List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.StandardComplianceListType#getCompliantWith <em>Compliant With</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getStandardComplianceListType()
 * @model extendedMetaData="name='standardComplianceList_._type' kind='elementOnly'"
 * @generated
 */
public interface StandardComplianceListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Compliant With</b></em>' containment reference list.
	 * The list contents are of type {@link com.br_automation.buoat.xddeditor.XDD.CompliantWithType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compliant With</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compliant With</em>' containment reference list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getStandardComplianceListType_CompliantWith()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='compliantWith' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CompliantWithType> getCompliantWith();

} // StandardComplianceListType
