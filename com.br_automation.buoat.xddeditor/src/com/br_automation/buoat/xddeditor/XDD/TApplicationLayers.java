/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>TApplication Layers</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TApplicationLayers#getIdentity
 * <em>Identity</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TApplicationLayers#getDataTypeList
 * <em>Data Type List</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TApplicationLayers#getObjectList
 * <em>Object List</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TApplicationLayers#getDynamicChannels
 * <em>Dynamic Channels</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TApplicationLayers#getCommunicationEntityType
 * <em>Communication Entity Type</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TApplicationLayers#getConformanceClass
 * <em>Conformance Class</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTApplicationLayers()
 * @model extendedMetaData="name='t_ApplicationLayers' kind='elementOnly'"
 * @generated
 */
public interface TApplicationLayers extends EObject {
    /**
     * Returns the value of the '<em><b>Identity</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Identity</em>' containment reference isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Identity</em>' containment reference.
     * @see #setIdentity(IdentityType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTApplicationLayers_Identity()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='identity' namespace='##targetNamespace'"
     * @generated
     */
    IdentityType getIdentity();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TApplicationLayers#getIdentity
     * <em>Identity</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Identity</em>' containment
     *            reference.
     * @see #getIdentity()
     * @generated
     */
    void setIdentity(IdentityType value);

    /**
     * Returns the value of the '<em><b>Data Type List</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Type List</em>' containment reference
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Data Type List</em>' containment reference.
     * @see #setDataTypeList(DataTypeListType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTApplicationLayers_DataTypeList()
     * @model containment="true" required="true" extendedMetaData=
     *        "kind='element' name='DataTypeList' namespace='##targetNamespace'"
     * @generated
     */
    DataTypeListType getDataTypeList();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TApplicationLayers#getDataTypeList
     * <em>Data Type List</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Data Type List</em>' containment
     *            reference.
     * @see #getDataTypeList()
     * @generated
     */
    void setDataTypeList(DataTypeListType value);

    /**
     * Returns the value of the '<em><b>Object List</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Object List</em>' containment reference isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Object List</em>' containment reference.
     * @see #setObjectList(ObjectListType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTApplicationLayers_ObjectList()
     * @model containment="true" required="true" extendedMetaData=
     *        "kind='element' name='ObjectList' namespace='##targetNamespace'"
     * @generated
     */
    ObjectListType getObjectList();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TApplicationLayers#getObjectList
     * <em>Object List</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Object List</em>' containment
     *            reference.
     * @see #getObjectList()
     * @generated
     */
    void setObjectList(ObjectListType value);

    /**
     * Returns the value of the '<em><b>Dynamic Channels</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dynamic Channels</em>' containment reference
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Dynamic Channels</em>' containment
     *         reference.
     * @see #setDynamicChannels(DynamicChannelsType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTApplicationLayers_DynamicChannels()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='dynamicChannels' namespace='##targetNamespace'"
     * @generated
     */
    DynamicChannelsType getDynamicChannels();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TApplicationLayers#getDynamicChannels
     * <em>Dynamic Channels</em>}' containment reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Dynamic Channels</em>' containment
     *            reference.
     * @see #getDynamicChannels()
     * @generated
     */
    void setDynamicChannels(DynamicChannelsType value);

    /**
     * Returns the value of the '<em><b>Communication Entity Type</b></em>'
     * attribute. The default value is <code>"slave"</code>. <!-- begin-user-doc
     * --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * 
     * Shall not be used. Provided for compatibility to CANopen.
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Communication Entity Type</em>' attribute.
     * @see #isSetCommunicationEntityType()
     * @see #unsetCommunicationEntityType()
     * @see #setCommunicationEntityType(List)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTApplicationLayers_CommunicationEntityType()
     * @model default="slave" unsettable="true"
     *        dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
     *        extendedMetaData="kind='attribute' name='communicationEntityType'"
     * @generated
     */
    List<String> getCommunicationEntityType();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TApplicationLayers#getCommunicationEntityType
     * <em>Communication Entity Type</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Communication Entity Type</em>'
     *            attribute.
     * @see #isSetCommunicationEntityType()
     * @see #unsetCommunicationEntityType()
     * @see #getCommunicationEntityType()
     * @generated
     */
    void setCommunicationEntityType(List<String> value);

    /**
     * Unsets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TApplicationLayers#getCommunicationEntityType
     * <em>Communication Entity Type</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #isSetCommunicationEntityType()
     * @see #getCommunicationEntityType()
     * @see #setCommunicationEntityType(List)
     * @generated
     */
    void unsetCommunicationEntityType();

    /**
     * Returns whether the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TApplicationLayers#getCommunicationEntityType
     * <em>Communication Entity Type</em>}' attribute is set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return whether the value of the '<em>Communication Entity Type</em>'
     *         attribute is set.
     * @see #unsetCommunicationEntityType()
     * @see #getCommunicationEntityType()
     * @see #setCommunicationEntityType(List)
     * @generated
     */
    boolean isSetCommunicationEntityType();

    /**
     * Returns the value of the '<em><b>Conformance Class</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * 
     * Conformance class of the device type. Using that attribute it is possible
     * to classify the device according to the supported services of the
     * communication protocol.
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Conformance Class</em>' attribute.
     * @see #setConformanceClass(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTApplicationLayers_ConformanceClass()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='conformanceClass'"
     * @generated
     */
    String getConformanceClass();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TApplicationLayers#getConformanceClass
     * <em>Conformance Class</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Conformance Class</em>' attribute.
     * @see #getConformanceClass()
     * @generated
     */
    void setConformanceClass(String value);

} // TApplicationLayers
