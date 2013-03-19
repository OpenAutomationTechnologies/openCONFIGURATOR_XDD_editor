/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Profile Header Data Type</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getProfileIdentification
 * <em>Profile Identification</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getProfileRevision
 * <em>Profile Revision</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getProfileName
 * <em>Profile Name</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getProfileSource
 * <em>Profile Source</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getProfileClassID
 * <em>Profile Class ID</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getProfileDate
 * <em>Profile Date</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getAdditionalInformation
 * <em>Additional Information</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getISO15745Reference
 * <em>ISO15745 Reference</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getIASInterfaceType
 * <em>IAS Interface Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileHeaderDataType()
 * @model extendedMetaData="name='ProfileHeader_DataType' kind='elementOnly'"
 * @generated
 */
public interface ProfileHeaderDataType extends EObject {
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
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileHeaderDataType_ProfileIdentification()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData=
     *        "kind='element' name='ProfileIdentification' namespace='##targetNamespace'"
     * @generated
     */
    String getProfileIdentification();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getProfileIdentification
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
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileHeaderDataType_ProfileRevision()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData=
     *        "kind='element' name='ProfileRevision' namespace='##targetNamespace'"
     * @generated
     */
    String getProfileRevision();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getProfileRevision
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
     * Returns the value of the '<em><b>Profile Name</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Profile Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Profile Name</em>' attribute.
     * @see #setProfileName(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileHeaderDataType_ProfileName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData=
     *        "kind='element' name='ProfileName' namespace='##targetNamespace'"
     * @generated
     */
    String getProfileName();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getProfileName
     * <em>Profile Name</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Profile Name</em>' attribute.
     * @see #getProfileName()
     * @generated
     */
    void setProfileName(String value);

    /**
     * Returns the value of the '<em><b>Profile Source</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Profile Source</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Profile Source</em>' attribute.
     * @see #setProfileSource(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileHeaderDataType_ProfileSource()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData=
     *        "kind='element' name='ProfileSource' namespace='##targetNamespace'"
     * @generated
     */
    String getProfileSource();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getProfileSource
     * <em>Profile Source</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Profile Source</em>' attribute.
     * @see #getProfileSource()
     * @generated
     */
    void setProfileSource(String value);

    /**
     * Returns the value of the '<em><b>Profile Class ID</b></em>' attribute.
     * The literals are from the enumeration
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileClassIDDataType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Profile Class ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Profile Class ID</em>' attribute.
     * @see com.br_automation.buoat.xddeditor.XDD.ProfileClassIDDataType
     * @see #isSetProfileClassID()
     * @see #unsetProfileClassID()
     * @see #setProfileClassID(ProfileClassIDDataType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileHeaderDataType_ProfileClassID()
     * @model unsettable="true" required="true" extendedMetaData=
     *        "kind='element' name='ProfileClassID' namespace='##targetNamespace'"
     * @generated
     */
    ProfileClassIDDataType getProfileClassID();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getProfileClassID
     * <em>Profile Class ID</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Profile Class ID</em>' attribute.
     * @see com.br_automation.buoat.xddeditor.XDD.ProfileClassIDDataType
     * @see #isSetProfileClassID()
     * @see #unsetProfileClassID()
     * @see #getProfileClassID()
     * @generated
     */
    void setProfileClassID(ProfileClassIDDataType value);

    /**
     * Unsets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getProfileClassID
     * <em>Profile Class ID</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isSetProfileClassID()
     * @see #getProfileClassID()
     * @see #setProfileClassID(ProfileClassIDDataType)
     * @generated
     */
    void unsetProfileClassID();

    /**
     * Returns whether the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getProfileClassID
     * <em>Profile Class ID</em>}' attribute is set. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return whether the value of the '<em>Profile Class ID</em>' attribute is
     *         set.
     * @see #unsetProfileClassID()
     * @see #getProfileClassID()
     * @see #setProfileClassID(ProfileClassIDDataType)
     * @generated
     */
    boolean isSetProfileClassID();

    /**
     * Returns the value of the '<em><b>Profile Date</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Profile Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Profile Date</em>' attribute.
     * @see #setProfileDate(XMLGregorianCalendar)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileHeaderDataType_ProfileDate()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Date" extendedMetaData=
     *        "kind='element' name='ProfileDate' namespace='##targetNamespace'"
     * @generated
     */
    XMLGregorianCalendar getProfileDate();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getProfileDate
     * <em>Profile Date</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Profile Date</em>' attribute.
     * @see #getProfileDate()
     * @generated
     */
    void setProfileDate(XMLGregorianCalendar value);

    /**
     * Returns the value of the '<em><b>Additional Information</b></em>'
     * attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Additional Information</em>' attribute isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Additional Information</em>' attribute.
     * @see #setAdditionalInformation(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileHeaderDataType_AdditionalInformation()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" extendedMetaData=
     *        "kind='element' name='AdditionalInformation' namespace='##targetNamespace'"
     * @generated
     */
    String getAdditionalInformation();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getAdditionalInformation
     * <em>Additional Information</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Additional Information</em>'
     *            attribute.
     * @see #getAdditionalInformation()
     * @generated
     */
    void setAdditionalInformation(String value);

    /**
     * Returns the value of the '<em><b>ISO15745 Reference</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISO15745 Reference</em>' containment reference
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>ISO15745 Reference</em>' containment
     *         reference.
     * @see #setISO15745Reference(ISO15745ReferenceDataType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileHeaderDataType_ISO15745Reference()
     * @model containment="true" required="true" extendedMetaData=
     *        "kind='element' name='ISO15745Reference' namespace='##targetNamespace'"
     * @generated
     */
    ISO15745ReferenceDataType getISO15745Reference();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getISO15745Reference
     * <em>ISO15745 Reference</em>}' containment reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>ISO15745 Reference</em>' containment
     *            reference.
     * @see #getISO15745Reference()
     * @generated
     */
    void setISO15745Reference(ISO15745ReferenceDataType value);

    /**
     * Returns the value of the '<em><b>IAS Interface Type</b></em>' attribute
     * list. The list contents are of type {@link java.lang.Object}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>IAS Interface Type</em>' attribute list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>IAS Interface Type</em>' attribute list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileHeaderDataType_IASInterfaceType()
     * @model unique="false"
     *        dataType="com.br_automation.buoat.xddeditor.XDD.IASInterfaceDataType"
     *        extendedMetaData=
     *        "kind='element' name='IASInterfaceType' namespace='##targetNamespace'"
     * @generated
     */
    EList<Object> getIASInterfaceType();

} // ProfileHeaderDataType
