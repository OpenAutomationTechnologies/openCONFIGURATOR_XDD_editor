/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TFirmware List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TFirmwareList#getFirmware <em>Firmware</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTFirmwareList()
 * @model extendedMetaData="name='t_firmwareList' kind='elementOnly'"
 * @generated
 */
public interface TFirmwareList extends EObject {
	/**
	 * Returns the value of the '<em><b>Firmware</b></em>' containment reference list.
	 * The list contents are of type {@link com.br_automation.buoat.xddeditor.XDD.FirmwareType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firmware</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firmware</em>' containment reference list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTFirmwareList_Firmware()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='firmware' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FirmwareType> getFirmware();

} // TFirmwareList
