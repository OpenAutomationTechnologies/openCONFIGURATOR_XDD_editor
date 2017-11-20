/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TConnector List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TConnectorList#getConnector <em>Connector</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTConnectorList()
 * @model extendedMetaData="name='t_connectorList' kind='elementOnly'"
 * @generated
 */
public interface TConnectorList extends EObject {
	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference list.
	 * The list contents are of type {@link com.br_automation.buoat.xddeditor.XDD.ConnectorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTConnectorList_Connector()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='connector' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConnectorType> getConnector();

} // TConnectorList
