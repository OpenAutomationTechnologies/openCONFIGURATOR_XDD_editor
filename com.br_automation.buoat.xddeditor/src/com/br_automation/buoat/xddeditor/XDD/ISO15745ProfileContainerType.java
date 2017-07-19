/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISO15745 Profile Container Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileContainerType#getISO15745Profile <em>ISO15745 Profile</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getISO15745ProfileContainerType()
 * @model extendedMetaData="name='ISO15745ProfileContainer_._type' kind='elementOnly'"
 * @generated
 */
public interface ISO15745ProfileContainerType extends EObject {
	/**
	 * Returns the value of the '<em><b>ISO15745 Profile</b></em>' containment reference list.
	 * The list contents are of type {@link com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ISO15745 Profile</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ISO15745 Profile</em>' containment reference list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getISO15745ProfileContainerType_ISO15745Profile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ISO15745Profile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ISO15745ProfileType> getISO15745Profile();

} // ISO15745ProfileContainerType
