/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Text Resource Type</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TextResourceType#getTextEntry
 * <em>Text Entry</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TextResourceType#getLang
 * <em>Lang</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTextResourceType()
 * @model extendedMetaData="name='textResource_._type' kind='elementOnly'"
 * @generated
 */
public interface TextResourceType extends EObject {
    /**
     * Returns the value of the '<em><b>Text Entry</b></em>' containment
     * reference list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.TextEntryType}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * 
     * This element shall store a single text.
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Text Entry</em>' containment reference
     *         list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTextResourceType_TextEntry()
     * @model containment="true" required="true" extendedMetaData=
     *        "kind='element' name='textEntry' namespace='##targetNamespace'"
     * @generated
     */
    EList<TextEntryType> getTextEntry();

    /**
     * Returns the value of the '<em><b>Lang</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * 
     * Defines the language used in the text resource file.
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Lang</em>' attribute.
     * @see #setLang(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTextResourceType_Lang()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Language" required="true"
     *        extendedMetaData="kind='attribute' name='lang'"
     * @generated
     */
    String getLang();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TextResourceType#getLang
     * <em>Lang</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Lang</em>' attribute.
     * @see #getLang()
     * @generated
     */
    void setLang(String value);

} // TextResourceType
