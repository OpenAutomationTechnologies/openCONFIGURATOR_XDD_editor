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
 * <em><b>Characteristics List Type</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.CharacteristicsListType#getCategory
 * <em>Category</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.CharacteristicsListType#getCharacteristic
 * <em>Characteristic</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getCharacteristicsListType()
 * @model 
 *        extendedMetaData="name='characteristicsList_._type' kind='elementOnly'"
 * @generated
 */
public interface CharacteristicsListType extends EObject {
    /**
     * Returns the value of the '<em><b>Category</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Category</em>' containment reference isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Category</em>' containment reference.
     * @see #setCategory(CategoryType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getCharacteristicsListType_Category()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='category' namespace='##targetNamespace'"
     * @generated
     */
    CategoryType getCategory();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.CharacteristicsListType#getCategory
     * <em>Category</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Category</em>' containment
     *            reference.
     * @see #getCategory()
     * @generated
     */
    void setCategory(CategoryType value);

    /**
     * Returns the value of the '<em><b>Characteristic</b></em>' containment
     * reference list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.CharacteristicType}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Characteristic</em>' containment reference
     * list isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Characteristic</em>' containment reference
     *         list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getCharacteristicsListType_Characteristic()
     * @model containment="true" required="true" extendedMetaData=
     *        "kind='element' name='characteristic' namespace='##targetNamespace'"
     * @generated
     */
    EList<CharacteristicType> getCharacteristic();

} // CharacteristicsListType
