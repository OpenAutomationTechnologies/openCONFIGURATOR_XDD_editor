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
 * <em><b>TAllowed Values Template</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TAllowedValuesTemplate#getValue
 * <em>Value</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TAllowedValuesTemplate#getRange
 * <em>Range</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TAllowedValuesTemplate#getUniqueID
 * <em>Unique ID</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTAllowedValuesTemplate()
 * @model extendedMetaData="name='t_allowedValuesTemplate' kind='elementOnly'"
 * @generated
 */
public interface TAllowedValuesTemplate extends EObject {
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
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTAllowedValuesTemplate_Value()
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
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTAllowedValuesTemplate_Range()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='range' namespace='##targetNamespace'"
     * @generated
     */
    EList<TRange> getRange();

    /**
     * Returns the value of the '<em><b>Unique ID</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unique ID</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Unique ID</em>' attribute.
     * @see #setUniqueID(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTAllowedValuesTemplate_UniqueID()
     * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
     *        required="true"
     *        extendedMetaData="kind='attribute' name='uniqueID'"
     * @generated
     */
    String getUniqueID();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TAllowedValuesTemplate#getUniqueID
     * <em>Unique ID</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Unique ID</em>' attribute.
     * @see #getUniqueID()
     * @generated
     */
    void setUniqueID(String value);

} // TAllowedValuesTemplate
