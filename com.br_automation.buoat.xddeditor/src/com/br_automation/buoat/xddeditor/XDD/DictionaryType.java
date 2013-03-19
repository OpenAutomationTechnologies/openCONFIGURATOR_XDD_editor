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
 * <em><b>Dictionary Type</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.DictionaryType#getFile <em>
 * File</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.DictionaryType#getDictID
 * <em>Dict ID</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.DictionaryType#getLang <em>
 * Lang</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getDictionaryType()
 * @model extendedMetaData="name='dictionary_._type' kind='elementOnly'"
 * @generated
 */
public interface DictionaryType extends EObject {
    /**
     * Returns the value of the '<em><b>File</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>File</em>' containment reference.
     * @see #setFile(FileType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getDictionaryType_File()
     * @model containment="true" required="true" extendedMetaData=
     *        "kind='element' name='file' namespace='##targetNamespace'"
     * @generated
     */
    FileType getFile();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.DictionaryType#getFile
     * <em>File</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>File</em>' containment reference.
     * @see #getFile()
     * @generated
     */
    void setFile(FileType value);

    /**
     * Returns the value of the '<em><b>Dict ID</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dict ID</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Dict ID</em>' attribute.
     * @see #setDictID(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getDictionaryType_DictID()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Token" required="true"
     *        extendedMetaData="kind='attribute' name='dictID'"
     * @generated
     */
    String getDictID();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.DictionaryType#getDictID
     * <em>Dict ID</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Dict ID</em>' attribute.
     * @see #getDictID()
     * @generated
     */
    void setDictID(String value);

    /**
     * Returns the value of the '<em><b>Lang</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lang</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Lang</em>' attribute.
     * @see #setLang(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getDictionaryType_Lang()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Language" required="true"
     *        extendedMetaData="kind='attribute' name='lang'"
     * @generated
     */
    String getLang();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.DictionaryType#getLang
     * <em>Lang</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Lang</em>' attribute.
     * @see #getLang()
     * @generated
     */
    void setLang(String value);

} // DictionaryType
