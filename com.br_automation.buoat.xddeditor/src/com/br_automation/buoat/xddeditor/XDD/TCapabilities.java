/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCapabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TCapabilities#getCharacteristicsList <em>Characteristics List</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TCapabilities#getStandardComplianceList <em>Standard Compliance List</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTCapabilities()
 * @model extendedMetaData="name='t_capabilities' kind='elementOnly'"
 * @generated
 */
public interface TCapabilities extends EObject {
	/**
	 * Returns the value of the '<em><b>Characteristics List</b></em>' containment reference list.
	 * The list contents are of type {@link com.br_automation.buoat.xddeditor.XDD.CharacteristicsListType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristics List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristics List</em>' containment reference list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTCapabilities_CharacteristicsList()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='characteristicsList' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CharacteristicsListType> getCharacteristicsList();

	/**
	 * Returns the value of the '<em><b>Standard Compliance List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Compliance List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Compliance List</em>' containment reference.
	 * @see #setStandardComplianceList(StandardComplianceListType)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTCapabilities_StandardComplianceList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='standardComplianceList' namespace='##targetNamespace'"
	 * @generated
	 */
	StandardComplianceListType getStandardComplianceList();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TCapabilities#getStandardComplianceList <em>Standard Compliance List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Compliance List</em>' containment reference.
	 * @see #getStandardComplianceList()
	 * @generated
	 */
	void setStandardComplianceList(StandardComplianceListType value);

} // TCapabilities
