/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Profile Handle Data Type</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileHandleDataType#getProfileIdentification
 * <em>Profile Identification</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileHandleDataType#getProfileRevision
 * <em>Profile Revision</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileHandleDataType#getProfileLocation
 * <em>Profile Location</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileHandleDataType()
 * @model extendedMetaData="name='ProfileHandle_DataType' kind='elementOnly'"
 * @generated
 */
public interface ProfileHandleDataType extends EObject {
    /**
     * Returns the value of the '<em><b>Profile Identification</b></em>'
     * attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Profile Identification</em>' attribute isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Profile Identification</em>' attribute.
     * @see #setProfileIdentification(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileHandleDataType_ProfileIdentification()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData=
     *        "kind='element' name='ProfileIdentification' namespace='##targetNamespace'"
     * @generated
     */
    String getProfileIdentification();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileHandleDataType#getProfileIdentification
     * <em>Profile Identification</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Profile Identification</em>'
     *            attribute.
     * @see #getProfileIdentification()
     * @generated
     */
    void setProfileIdentification(String value);

    /**
     * Returns the value of the '<em><b>Profile Revision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Profile Revision</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Profile Revision</em>' attribute.
     * @see #setProfileRevision(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileHandleDataType_ProfileRevision()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData=
     *        "kind='element' name='ProfileRevision' namespace='##targetNamespace'"
     * @generated
     */
    String getProfileRevision();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileHandleDataType#getProfileRevision
     * <em>Profile Revision</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Profile Revision</em>' attribute.
     * @see #getProfileRevision()
     * @generated
     */
    void setProfileRevision(String value);

    /**
     * Returns the value of the '<em><b>Profile Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Profile Location</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Profile Location</em>' attribute.
     * @see #setProfileLocation(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileHandleDataType_ProfileLocation()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" extendedMetaData=
     *        "kind='element' name='ProfileLocation' namespace='##targetNamespace'"
     * @generated
     */
    String getProfileLocation();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileHandleDataType#getProfileLocation
     * <em>Profile Location</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Profile Location</em>' attribute.
     * @see #getProfileLocation()
     * @generated
     */
    void setProfileLocation(String value);

} // ProfileHandleDataType
