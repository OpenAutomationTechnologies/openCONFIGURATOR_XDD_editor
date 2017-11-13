/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getClassification <em>Classification</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getConnector <em>Connector</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getFirmware <em>Firmware</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getISO15745Profile <em>ISO15745 Profile</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getISO15745ProfileContainer <em>ISO15745 Profile Container</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getTextResource <em>Text Resource</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' attribute.
	 * The literals are from the enumeration {@link com.br_automation.buoat.xddeditor.XDD.ClassificationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' attribute.
	 * @see com.br_automation.buoat.xddeditor.XDD.ClassificationType
	 * @see #setClassification(ClassificationType)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getDocumentRoot_Classification()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='classification' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationType getClassification();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getClassification <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' attribute.
	 * @see com.br_automation.buoat.xddeditor.XDD.ClassificationType
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(ClassificationType value);

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference.
	 * @see #setConnector(ConnectorType)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getDocumentRoot_Connector()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='connector' namespace='##targetNamespace'"
	 * @generated
	 */
	ConnectorType getConnector();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getConnector <em>Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' containment reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(ConnectorType value);

	/**
	 * Returns the value of the '<em><b>Firmware</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firmware</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firmware</em>' containment reference.
	 * @see #setFirmware(FirmwareType)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getDocumentRoot_Firmware()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='firmware' namespace='##targetNamespace'"
	 * @generated
	 */
	FirmwareType getFirmware();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getFirmware <em>Firmware</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firmware</em>' containment reference.
	 * @see #getFirmware()
	 * @generated
	 */
	void setFirmware(FirmwareType value);

	/**
	 * Returns the value of the '<em><b>ISO15745 Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ISO15745 Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ISO15745 Profile</em>' containment reference.
	 * @see #setISO15745Profile(ISO15745ProfileType)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getDocumentRoot_ISO15745Profile()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ISO15745Profile' namespace='##targetNamespace'"
	 * @generated
	 */
	ISO15745ProfileType getISO15745Profile();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getISO15745Profile <em>ISO15745 Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ISO15745 Profile</em>' containment reference.
	 * @see #getISO15745Profile()
	 * @generated
	 */
	void setISO15745Profile(ISO15745ProfileType value);

	/**
	 * Returns the value of the '<em><b>ISO15745 Profile Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ISO15745 Profile Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ISO15745 Profile Container</em>' containment reference.
	 * @see #setISO15745ProfileContainer(ISO15745ProfileContainerType)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getDocumentRoot_ISO15745ProfileContainer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ISO15745ProfileContainer' namespace='##targetNamespace'"
	 * @generated
	 */
	ISO15745ProfileContainerType getISO15745ProfileContainer();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getISO15745ProfileContainer <em>ISO15745 Profile Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ISO15745 Profile Container</em>' containment reference.
	 * @see #getISO15745ProfileContainer()
	 * @generated
	 */
	void setISO15745ProfileContainer(ISO15745ProfileContainerType value);

	/**
	 * Returns the value of the '<em><b>Text Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         This element shall be the document element of a text resource file.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Resource</em>' containment reference.
	 * @see #setTextResource(TextResourceType)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getDocumentRoot_TextResource()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='textResource' namespace='##targetNamespace'"
	 * @generated
	 */
	TextResourceType getTextResource();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getTextResource <em>Text Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Resource</em>' containment reference.
	 * @see #getTextResource()
	 * @generated
	 */
	void setTextResource(TextResourceType value);

} // DocumentRoot
