/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Document Root</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getMixed <em>
 * Mixed</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getXMLNSPrefixMap
 * <em>XMLNS Prefix Map</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getXSISchemaLocation
 * <em>XSI Schema Location</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getISO15745ProfileContainer
 * <em>ISO15745 Profile Container</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
    /**
     * Returns the value of the '<em><b>Mixed</b></em>' attribute list. The list
     * contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mixed</em>' attribute list isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Mixed</em>' attribute list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getDocumentRoot_Mixed()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry"
     *        many="true"
     *        extendedMetaData="kind='elementWildcard' name=':mixed'"
     * @generated
     */
    FeatureMap getMixed();

    /**
     * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map. The key
     * is of type {@link java.lang.String}, and the value is of type
     * {@link java.lang.String}, <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>XMLNS Prefix Map</em>' map.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getDocumentRoot_XMLNSPrefixMap()
     * @model mapType=
     *        "org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
     *        transient="true"
     *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
     * @generated
     */
    EMap<String, String> getXMLNSPrefixMap();

    /**
     * Returns the value of the '<em><b>XSI Schema Location</b></em>' map. The
     * key is of type {@link java.lang.String}, and the value is of type
     * {@link java.lang.String}, <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>XSI Schema Location</em>' map.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getDocumentRoot_XSISchemaLocation()
     * @model mapType=
     *        "org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
     *        transient="true"
     *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
     * @generated
     */
    EMap<String, String> getXSISchemaLocation();

    /**
     * Returns the value of the '<em><b>ISO15745 Profile Container</b></em>'
     * containment reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISO15745 Profile Container</em>' containment
     * reference isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>ISO15745 Profile Container</em>'
     *         containment reference.
     * @see #setISO15745ProfileContainer(ISO15745ProfileContainerType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getDocumentRoot_ISO15745ProfileContainer()
     * @model containment="true" required="true" transient="true"
     *        volatile="true" derived="true" extendedMetaData=
     *        "kind='element' name='ISO15745ProfileContainer' namespace='##targetNamespace'"
     * @generated
     */
    ISO15745ProfileContainerType getISO15745ProfileContainer();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getISO15745ProfileContainer
     * <em>ISO15745 Profile Container</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>ISO15745 Profile Container</em>'
     *            containment reference.
     * @see #getISO15745ProfileContainer()
     * @generated
     */
    void setISO15745ProfileContainer(ISO15745ProfileContainerType value);

} // DocumentRoot
