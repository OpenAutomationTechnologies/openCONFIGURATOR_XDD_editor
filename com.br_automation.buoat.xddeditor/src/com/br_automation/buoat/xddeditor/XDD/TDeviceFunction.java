/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TDevice Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFunction#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFunction#getPicturesList <em>Pictures List</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFunction#getDictionaryList <em>Dictionary List</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFunction#getConnectorList <em>Connector List</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFunction#getFirmwareList <em>Firmware List</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFunction#getClassificationList <em>Classification List</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceFunction()
 * @model extendedMetaData="name='t_DeviceFunction' kind='elementOnly'"
 * @generated
 */
public interface TDeviceFunction extends EObject {
	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capabilities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference.
	 * @see #setCapabilities(TCapabilities)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceFunction_Capabilities()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='capabilities' namespace='##targetNamespace'"
	 * @generated
	 */
	TCapabilities getCapabilities();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFunction#getCapabilities <em>Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capabilities</em>' containment reference.
	 * @see #getCapabilities()
	 * @generated
	 */
	void setCapabilities(TCapabilities value);

	/**
	 * Returns the value of the '<em><b>Pictures List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pictures List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pictures List</em>' containment reference.
	 * @see #setPicturesList(TPicturesList)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceFunction_PicturesList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='picturesList' namespace='##targetNamespace'"
	 * @generated
	 */
	TPicturesList getPicturesList();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFunction#getPicturesList <em>Pictures List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pictures List</em>' containment reference.
	 * @see #getPicturesList()
	 * @generated
	 */
	void setPicturesList(TPicturesList value);

	/**
	 * Returns the value of the '<em><b>Dictionary List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dictionary List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dictionary List</em>' containment reference.
	 * @see #setDictionaryList(TDictionaryList)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceFunction_DictionaryList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dictionaryList' namespace='##targetNamespace'"
	 * @generated
	 */
	TDictionaryList getDictionaryList();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFunction#getDictionaryList <em>Dictionary List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dictionary List</em>' containment reference.
	 * @see #getDictionaryList()
	 * @generated
	 */
	void setDictionaryList(TDictionaryList value);

	/**
	 * Returns the value of the '<em><b>Connector List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector List</em>' containment reference.
	 * @see #setConnectorList(TConnectorList)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceFunction_ConnectorList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='connectorList' namespace='##targetNamespace'"
	 * @generated
	 */
	TConnectorList getConnectorList();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFunction#getConnectorList <em>Connector List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector List</em>' containment reference.
	 * @see #getConnectorList()
	 * @generated
	 */
	void setConnectorList(TConnectorList value);

	/**
	 * Returns the value of the '<em><b>Firmware List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firmware List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firmware List</em>' containment reference.
	 * @see #setFirmwareList(TFirmwareList)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceFunction_FirmwareList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='firmwareList' namespace='##targetNamespace'"
	 * @generated
	 */
	TFirmwareList getFirmwareList();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFunction#getFirmwareList <em>Firmware List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firmware List</em>' containment reference.
	 * @see #getFirmwareList()
	 * @generated
	 */
	void setFirmwareList(TFirmwareList value);

	/**
	 * Returns the value of the '<em><b>Classification List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification List</em>' containment reference.
	 * @see #setClassificationList(TClassificationList)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceFunction_ClassificationList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='classificationList' namespace='##targetNamespace'"
	 * @generated
	 */
	TClassificationList getClassificationList();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFunction#getClassificationList <em>Classification List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification List</em>' containment reference.
	 * @see #getClassificationList()
	 * @generated
	 */
	void setClassificationList(TClassificationList value);

} // TDeviceFunction
