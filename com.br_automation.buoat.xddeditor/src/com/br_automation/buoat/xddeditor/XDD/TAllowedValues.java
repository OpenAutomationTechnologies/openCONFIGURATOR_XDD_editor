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
 * <em><b>TAllowed Values</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TAllowedValues#getValue <em>
 * Value</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TAllowedValues#getRange <em>
 * Range</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TAllowedValues#getTemplateIDRef
 * <em>Template ID Ref</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTAllowedValues()
 * @model extendedMetaData="name='t_allowedValues' kind='elementOnly'"
 * @generated
 */
public interface TAllowedValues extends EObject {
    /**
     * Returns the value of the '<em><b>Value</b></em>' containment reference
     * list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.TValue}. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Value</em>' containment reference list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Value</em>' containment reference list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTAllowedValues_Value()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='value' namespace='##targetNamespace'"
     * @generated
     */
    EList<TValue> getValue();

    /**
     * Returns the value of the '<em><b>Range</b></em>' containment reference
     * list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.TRange}. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Range</em>' containment reference list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Range</em>' containment reference list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTAllowedValues_Range()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='range' namespace='##targetNamespace'"
     * @generated
     */
    EList<TRange> getRange();

    /**
     * Returns the value of the '<em><b>Template ID Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Template ID Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Template ID Ref</em>' attribute.
     * @see #setTemplateIDRef(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTAllowedValues_TemplateIDRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
     *        extendedMetaData="kind='attribute' name='templateIDRef'"
     * @generated
     */
    String getTemplateIDRef();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TAllowedValues#getTemplateIDRef
     * <em>Template ID Ref</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Template ID Ref</em>' attribute.
     * @see #getTemplateIDRef()
     * @generated
     */
    void setTemplateIDRef(String value);

} // TAllowedValues
