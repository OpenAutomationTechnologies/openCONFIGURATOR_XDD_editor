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
 * <em><b>Label Ref Type</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.LabelRefType#getValue <em>
 * Value</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.LabelRefType#getDictID <em>
 * Dict ID</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.LabelRefType#getTextID <em>
 * Text ID</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getLabelRefType()
 * @model extendedMetaData="name='labelRef_._type' kind='simple'"
 * @generated
 */
public interface LabelRefType extends EObject {
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
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getLabelRefType_Value()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="name=':0' kind='simple'"
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.LabelRefType#getValue
     * <em>Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

    /**
     * Returns the value of the '<em><b>Dict ID</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * 
     * This attribute references a single element inside the dictionaryList
     * element. The dictionary element contains a link to the external text
     * resource file.
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Dict ID</em>' attribute.
     * @see #setDictID(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getLabelRefType_DictID()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
     *        extendedMetaData="kind='attribute' name='dictID'"
     * @generated
     */
    String getDictID();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.LabelRefType#getDictID
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
     * Returns the value of the '<em><b>Text ID</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * 
     * This attribute references a chracter sequence inside the external text
     * resource file by pattern matching.
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Text ID</em>' attribute.
     * @see #setTextID(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getLabelRefType_TextID()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
     *        extendedMetaData="kind='attribute' name='textID'"
     * @generated
     */
    String getTextID();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.LabelRefType#getTextID
     * <em>Text ID</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Text ID</em>' attribute.
     * @see #getTextID()
     * @generated
     */
    void setTextID(String value);

} // LabelRefType
