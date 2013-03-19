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

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Version Info Type</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getGroup
 * <em>Group</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getLabel
 * <em>Label</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getDescription
 * <em>Description</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getLabelRef
 * <em>Label Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getDescriptionRef
 * <em>Description Ref</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getAuthor
 * <em>Author</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getDate <em>
 * Date</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getOrganization
 * <em>Organization</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getVersion
 * <em>Version</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getVersionInfoType()
 * @model extendedMetaData="name='versionInfo_._type' kind='elementOnly'"
 * @generated
 */
public interface VersionInfoType extends EObject {
    /**
     * Returns the value of the '<em><b>Group</b></em>' attribute list. The list
     * contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group</em>' attribute list isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Group</em>' attribute list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getVersionInfoType_Group()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry"
     *        many="true" extendedMetaData="kind='group' name='group:0'"
     * @generated
     */
    FeatureMap getGroup();

    /**
     * Returns the value of the '<em><b>Label</b></em>' containment reference
     * list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.LabelType}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * 
     * This element allows storage of the identifying name inside the XML file
     * itself.
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Label</em>' containment reference list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getVersionInfoType_Label()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData=
     *        "kind='element' name='label' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<LabelType> getLabel();

    /**
     * Returns the value of the '<em><b>Description</b></em>' containment
     * reference list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.DescriptionType}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * 
     * This element allows storage of descriptive information inside the XML
     * file itself.
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Description</em>' containment reference
     *         list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getVersionInfoType_Description()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData=
     *        "kind='element' name='description' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<DescriptionType> getDescription();

    /**
     * Returns the value of the '<em><b>Label Ref</b></em>' containment
     * reference list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.LabelRefType}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * 
     * This element allows storage of identifying names inside an external text
     * resource file.
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Label Ref</em>' containment reference list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getVersionInfoType_LabelRef()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData=
     *        "kind='element' name='labelRef' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<LabelRefType> getLabelRef();

    /**
     * Returns the value of the '<em><b>Description Ref</b></em>' containment
     * reference list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.DescriptionRefType}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * 
     * This element allows storage of reference descriptive texts inside an
     * external text resource file.
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Description Ref</em>' containment reference
     *         list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getVersionInfoType_DescriptionRef()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData=
     *        "kind='element' name='descriptionRef' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<DescriptionRefType> getDescriptionRef();

    /**
     * Returns the value of the '<em><b>Author</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Author</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Author</em>' attribute.
     * @see #setAuthor(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getVersionInfoType_Author()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='author'"
     * @generated
     */
    String getAuthor();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getAuthor
     * <em>Author</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Author</em>' attribute.
     * @see #getAuthor()
     * @generated
     */
    void setAuthor(String value);

    /**
     * Returns the value of the '<em><b>Date</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Date</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Date</em>' attribute.
     * @see #setDate(XMLGregorianCalendar)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getVersionInfoType_Date()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
     *        extendedMetaData="kind='attribute' name='date'"
     * @generated
     */
    XMLGregorianCalendar getDate();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getDate
     * <em>Date</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Date</em>' attribute.
     * @see #getDate()
     * @generated
     */
    void setDate(XMLGregorianCalendar value);

    /**
     * Returns the value of the '<em><b>Organization</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Organization</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Organization</em>' attribute.
     * @see #setOrganization(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getVersionInfoType_Organization()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='organization'"
     * @generated
     */
    String getOrganization();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getOrganization
     * <em>Organization</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Organization</em>' attribute.
     * @see #getOrganization()
     * @generated
     */
    void setOrganization(String value);

    /**
     * Returns the value of the '<em><b>Version</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Version</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Version</em>' attribute.
     * @see #setVersion(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getVersionInfoType_Version()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='version'"
     * @generated
     */
    String getVersion();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getVersion
     * <em>Version</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Version</em>' attribute.
     * @see #getVersion()
     * @generated
     */
    void setVersion(String value);

} // VersionInfoType
