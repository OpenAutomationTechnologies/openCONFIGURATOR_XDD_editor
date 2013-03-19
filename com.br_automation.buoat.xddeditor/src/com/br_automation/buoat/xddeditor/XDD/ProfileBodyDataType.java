/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Profile Body Data Type</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileCreationDate
 * <em>File Creation Date</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileCreationTime
 * <em>File Creation Time</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileCreator
 * <em>File Creator</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileModificationDate
 * <em>File Modification Date</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileModificationTime
 * <em>File Modification Time</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileModifiedBy
 * <em>File Modified By</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileName
 * <em>File Name</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileVersion
 * <em>File Version</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFormatName
 * <em>Format Name</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFormatVersion
 * <em>Format Version</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getSupportedLanguages
 * <em>Supported Languages</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileBodyDataType()
 * @model abstract="true"
 *        extendedMetaData="name='ProfileBody_DataType' kind='empty'"
 * @generated
 */
public interface ProfileBodyDataType extends EObject {
    /**
     * Returns the value of the '<em><b>File Creation Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File Creation Date</em>' attribute isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>File Creation Date</em>' attribute.
     * @see #setFileCreationDate(XMLGregorianCalendar)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileBodyDataType_FileCreationDate()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
     *        extendedMetaData="kind='attribute' name='fileCreationDate'"
     * @generated
     */
    XMLGregorianCalendar getFileCreationDate();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileCreationDate
     * <em>File Creation Date</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>File Creation Date</em>' attribute.
     * @see #getFileCreationDate()
     * @generated
     */
    void setFileCreationDate(XMLGregorianCalendar value);

    /**
     * Returns the value of the '<em><b>File Creation Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File Creation Time</em>' attribute isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>File Creation Time</em>' attribute.
     * @see #setFileCreationTime(XMLGregorianCalendar)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileBodyDataType_FileCreationTime()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Time"
     *        extendedMetaData="kind='attribute' name='fileCreationTime'"
     * @generated
     */
    XMLGregorianCalendar getFileCreationTime();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileCreationTime
     * <em>File Creation Time</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>File Creation Time</em>' attribute.
     * @see #getFileCreationTime()
     * @generated
     */
    void setFileCreationTime(XMLGregorianCalendar value);

    /**
     * Returns the value of the '<em><b>File Creator</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File Creator</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>File Creator</em>' attribute.
     * @see #setFileCreator(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileBodyDataType_FileCreator()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='fileCreator'"
     * @generated
     */
    String getFileCreator();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileCreator
     * <em>File Creator</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>File Creator</em>' attribute.
     * @see #getFileCreator()
     * @generated
     */
    void setFileCreator(String value);

    /**
     * Returns the value of the '<em><b>File Modification Date</b></em>'
     * attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File Modification Date</em>' attribute isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>File Modification Date</em>' attribute.
     * @see #setFileModificationDate(XMLGregorianCalendar)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileBodyDataType_FileModificationDate()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
     *        extendedMetaData="kind='attribute' name='fileModificationDate'"
     * @generated
     */
    XMLGregorianCalendar getFileModificationDate();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileModificationDate
     * <em>File Modification Date</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>File Modification Date</em>'
     *            attribute.
     * @see #getFileModificationDate()
     * @generated
     */
    void setFileModificationDate(XMLGregorianCalendar value);

    /**
     * Returns the value of the '<em><b>File Modification Time</b></em>'
     * attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File Modification Time</em>' attribute isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>File Modification Time</em>' attribute.
     * @see #setFileModificationTime(XMLGregorianCalendar)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileBodyDataType_FileModificationTime()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Time"
     *        extendedMetaData="kind='attribute' name='fileModificationTime'"
     * @generated
     */
    XMLGregorianCalendar getFileModificationTime();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileModificationTime
     * <em>File Modification Time</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>File Modification Time</em>'
     *            attribute.
     * @see #getFileModificationTime()
     * @generated
     */
    void setFileModificationTime(XMLGregorianCalendar value);

    /**
     * Returns the value of the '<em><b>File Modified By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File Modified By</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>File Modified By</em>' attribute.
     * @see #setFileModifiedBy(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileBodyDataType_FileModifiedBy()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='fileModifiedBy'"
     * @generated
     */
    String getFileModifiedBy();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileModifiedBy
     * <em>File Modified By</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>File Modified By</em>' attribute.
     * @see #getFileModifiedBy()
     * @generated
     */
    void setFileModifiedBy(String value);

    /**
     * Returns the value of the '<em><b>File Name</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File Name</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>File Name</em>' attribute.
     * @see #setFileName(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileBodyDataType_FileName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='fileName'"
     * @generated
     */
    String getFileName();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileName
     * <em>File Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>File Name</em>' attribute.
     * @see #getFileName()
     * @generated
     */
    void setFileName(String value);

    /**
     * Returns the value of the '<em><b>File Version</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>File Version</em>' attribute.
     * @see #setFileVersion(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileBodyDataType_FileVersion()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='fileVersion'"
     * @generated
     */
    String getFileVersion();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileVersion
     * <em>File Version</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>File Version</em>' attribute.
     * @see #getFileVersion()
     * @generated
     */
    void setFileVersion(String value);

    /**
     * Returns the value of the '<em><b>Format Name</b></em>' attribute. The
     * default value is <code>"DDXML"</code>. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Format Name</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Format Name</em>' attribute.
     * @see #isSetFormatName()
     * @see #unsetFormatName()
     * @see #setFormatName(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileBodyDataType_FormatName()
     * @model default="DDXML" unsettable="true"
     *        dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='formatName'"
     * @generated
     */
    String getFormatName();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFormatName
     * <em>Format Name</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Format Name</em>' attribute.
     * @see #isSetFormatName()
     * @see #unsetFormatName()
     * @see #getFormatName()
     * @generated
     */
    void setFormatName(String value);

    /**
     * Unsets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFormatName
     * <em>Format Name</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isSetFormatName()
     * @see #getFormatName()
     * @see #setFormatName(String)
     * @generated
     */
    void unsetFormatName();

    /**
     * Returns whether the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFormatName
     * <em>Format Name</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return whether the value of the '<em>Format Name</em>' attribute is set.
     * @see #unsetFormatName()
     * @see #getFormatName()
     * @see #setFormatName(String)
     * @generated
     */
    boolean isSetFormatName();

    /**
     * Returns the value of the '<em><b>Format Version</b></em>' attribute. The
     * default value is <code>"2.0"</code>. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Format Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Format Version</em>' attribute.
     * @see #isSetFormatVersion()
     * @see #unsetFormatVersion()
     * @see #setFormatVersion(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileBodyDataType_FormatVersion()
     * @model default="2.0" unsettable="true"
     *        dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='formatVersion'"
     * @generated
     */
    String getFormatVersion();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFormatVersion
     * <em>Format Version</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Format Version</em>' attribute.
     * @see #isSetFormatVersion()
     * @see #unsetFormatVersion()
     * @see #getFormatVersion()
     * @generated
     */
    void setFormatVersion(String value);

    /**
     * Unsets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFormatVersion
     * <em>Format Version</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isSetFormatVersion()
     * @see #getFormatVersion()
     * @see #setFormatVersion(String)
     * @generated
     */
    void unsetFormatVersion();

    /**
     * Returns whether the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFormatVersion
     * <em>Format Version</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return whether the value of the '<em>Format Version</em>' attribute is
     *         set.
     * @see #unsetFormatVersion()
     * @see #getFormatVersion()
     * @see #setFormatVersion(String)
     * @generated
     */
    boolean isSetFormatVersion();

    /**
     * Returns the value of the '<em><b>Supported Languages</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Supported Languages</em>' attribute isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Supported Languages</em>' attribute.
     * @see #setSupportedLanguages(List)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileBodyDataType_SupportedLanguages()
     * @model 
     *        dataType="com.br_automation.buoat.xddeditor.XDD.SupportedLanguagesType"
     *        many="false"
     *        extendedMetaData="kind='attribute' name='supportedLanguages'"
     * @generated
     */
    List<String> getSupportedLanguages();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getSupportedLanguages
     * <em>Supported Languages</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Supported Languages</em>' attribute.
     * @see #getSupportedLanguages()
     * @generated
     */
    void setSupportedLanguages(List<String> value);

} // ProfileBodyDataType
