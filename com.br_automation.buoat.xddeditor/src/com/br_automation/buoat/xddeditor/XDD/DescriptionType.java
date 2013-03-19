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
 * <em><b>Description Type</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.DescriptionType#getValue
 * <em>Value</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.DescriptionType#getLang <em>
 * Lang</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.DescriptionType#getURI <em>
 * URI</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getDescriptionType()
 * @model extendedMetaData="name='description_._type' kind='simple'"
 * @generated
 */
public interface DescriptionType extends EObject {
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
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getDescriptionType_Value()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="name=':0' kind='simple'"
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.DescriptionType#getValue
     * <em>Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

    /**
     * Returns the value of the '<em><b>Lang</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * 
     * This attribute references the language used for the descriptive
     * information. This attribute consists of a combination of a language code
     * (as defined in ISO 639-2) plus an optional dash character plus an
     * optional country code (as defined in ISO 3166-1), ex: en-us, de, fr.
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Lang</em>' attribute.
     * @see #setLang(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getDescriptionType_Lang()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Language" required="true"
     *        extendedMetaData="kind='attribute' name='lang'"
     * @generated
     */
    String getLang();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.DescriptionType#getLang
     * <em>Lang</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Lang</em>' attribute.
     * @see #getLang()
     * @generated
     */
    void setLang(String value);

    /**
     * Returns the value of the '<em><b>URI</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * 
     * Optional link to further descriptive information.
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>URI</em>' attribute.
     * @see #setURI(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getDescriptionType_URI()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='URI'"
     * @generated
     */
    String getURI();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.DescriptionType#getURI
     * <em>URI</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>URI</em>' attribute.
     * @see #getURI()
     * @generated
     */
    void setURI(String value);

} // DescriptionType
