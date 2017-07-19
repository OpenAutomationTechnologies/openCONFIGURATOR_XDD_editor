/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TIndicator List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TIndicatorList#getLEDList <em>LED List</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTIndicatorList()
 * @model extendedMetaData="name='t_indicatorList' kind='elementOnly'"
 * @generated
 */
public interface TIndicatorList extends EObject {
	/**
	 * Returns the value of the '<em><b>LED List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LED List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LED List</em>' containment reference.
	 * @see #setLEDList(LEDListType)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTIndicatorList_LEDList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LEDList' namespace='##targetNamespace'"
	 * @generated
	 */
	LEDListType getLEDList();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TIndicatorList#getLEDList <em>LED List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LED List</em>' containment reference.
	 * @see #getLEDList()
	 * @generated
	 */
	void setLEDList(LEDListType value);

} // TIndicatorList
