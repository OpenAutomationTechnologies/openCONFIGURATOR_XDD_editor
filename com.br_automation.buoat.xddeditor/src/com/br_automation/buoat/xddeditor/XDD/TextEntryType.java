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
 * <em><b>Text Entry Type</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TextEntryType#getValue <em>
 * Value</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TextEntryType#getTextID <em>
 * Text ID</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTextEntryType()
 * @model extendedMetaData="name='textEntry_._type' kind='simple'"
 * @generated
 */
public interface TextEntryType extends EObject {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTextEntryType_Value()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="name=':0' kind='simple'"
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TextEntryType#getValue
     * <em>Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

    /**
     * Returns the value of the '<em><b>Text ID</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * 
     * The unique identifier of the text entry that is referenced by the
     * according entry in the POWERLINK XML file.
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Text ID</em>' attribute.
     * @see #setTextID(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTextEntryType_TextID()
     * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
     *        required="true" extendedMetaData="kind='attribute' name='textID'"
     * @generated
     */
    String getTextID();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TextEntryType#getTextID
     * <em>Text ID</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Text ID</em>' attribute.
     * @see #getTextID()
     * @generated
     */
    void setTextID(String value);

} // TextEntryType
