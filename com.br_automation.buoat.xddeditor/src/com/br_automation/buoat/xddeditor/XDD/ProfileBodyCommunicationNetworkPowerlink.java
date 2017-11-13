/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile Body Communication Network Powerlink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink#getApplicationLayers <em>Application Layers</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink#getTransportLayers <em>Transport Layers</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink#getNetworkManagement <em>Network Management</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink#getExternalProfileHandle <em>External Profile Handle</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink#getSpecificationVersion <em>Specification Version</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileBodyCommunicationNetworkPowerlink()
 * @model extendedMetaData="name='ProfileBody_CommunicationNetwork_Powerlink' kind='elementOnly'"
 * @generated
 */
public interface ProfileBodyCommunicationNetworkPowerlink extends ProfileBodyDataType {
	/**
	 * Returns the value of the '<em><b>Application Layers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The ApplicationLayers element represents POWERLINK application layer,
	 *             e.g. gives detailed information about a devices object dictionary.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Application Layers</em>' containment reference.
	 * @see #setApplicationLayers(TApplicationLayers)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileBodyCommunicationNetworkPowerlink_ApplicationLayers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ApplicationLayers' namespace='##targetNamespace'"
	 * @generated
	 */
	TApplicationLayers getApplicationLayers();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink#getApplicationLayers <em>Application Layers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Layers</em>' containment reference.
	 * @see #getApplicationLayers()
	 * @generated
	 */
	void setApplicationLayers(TApplicationLayers value);

	/**
	 * Returns the value of the '<em><b>Transport Layers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The TransportLayers element is present for compatibility to the
	 *             CANopen XML device description. For POWERLINK this element is
	 *             empty.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transport Layers</em>' containment reference.
	 * @see #setTransportLayers(EObject)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileBodyCommunicationNetworkPowerlink_TransportLayers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TransportLayers' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getTransportLayers();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink#getTransportLayers <em>Transport Layers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Layers</em>' containment reference.
	 * @see #getTransportLayers()
	 * @generated
	 */
	void setTransportLayers(EObject value);

	/**
	 * Returns the value of the '<em><b>Network Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The NetworkManagement element is used to store specific device
	 *             features and diagnostic capabilities.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network Management</em>' containment reference.
	 * @see #setNetworkManagement(TNetworkManagement)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileBodyCommunicationNetworkPowerlink_NetworkManagement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NetworkManagement' namespace='##targetNamespace'"
	 * @generated
	 */
	TNetworkManagement getNetworkManagement();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink#getNetworkManagement <em>Network Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Management</em>' containment reference.
	 * @see #getNetworkManagement()
	 * @generated
	 */
	void setNetworkManagement(TNetworkManagement value);

	/**
	 * Returns the value of the '<em><b>External Profile Handle</b></em>' containment reference list.
	 * The list contents are of type {@link com.br_automation.buoat.xddeditor.XDD.ProfileHandleDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Profile Handle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Profile Handle</em>' containment reference list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileBodyCommunicationNetworkPowerlink_ExternalProfileHandle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExternalProfileHandle' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProfileHandleDataType> getExternalProfileHandle();

	/**
	 * Returns the value of the '<em><b>Specification Version</b></em>' attribute.
	 * The default value is <code>"1.1.0"</code>.
	 * The literals are from the enumeration {@link com.br_automation.buoat.xddeditor.XDD.TSpecificationVersion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Version</em>' attribute.
	 * @see com.br_automation.buoat.xddeditor.XDD.TSpecificationVersion
	 * @see #isSetSpecificationVersion()
	 * @see #unsetSpecificationVersion()
	 * @see #setSpecificationVersion(TSpecificationVersion)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileBodyCommunicationNetworkPowerlink_SpecificationVersion()
	 * @model default="1.1.0" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='specificationVersion'"
	 * @generated
	 */
	TSpecificationVersion getSpecificationVersion();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink#getSpecificationVersion <em>Specification Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification Version</em>' attribute.
	 * @see com.br_automation.buoat.xddeditor.XDD.TSpecificationVersion
	 * @see #isSetSpecificationVersion()
	 * @see #unsetSpecificationVersion()
	 * @see #getSpecificationVersion()
	 * @generated
	 */
	void setSpecificationVersion(TSpecificationVersion value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink#getSpecificationVersion <em>Specification Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecificationVersion()
	 * @see #getSpecificationVersion()
	 * @see #setSpecificationVersion(TSpecificationVersion)
	 * @generated
	 */
	void unsetSpecificationVersion();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink#getSpecificationVersion <em>Specification Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Specification Version</em>' attribute is set.
	 * @see #unsetSpecificationVersion()
	 * @see #getSpecificationVersion()
	 * @see #setSpecificationVersion(TSpecificationVersion)
	 * @generated
	 */
	boolean isSetSpecificationVersion();

} // ProfileBodyCommunicationNetworkPowerlink
