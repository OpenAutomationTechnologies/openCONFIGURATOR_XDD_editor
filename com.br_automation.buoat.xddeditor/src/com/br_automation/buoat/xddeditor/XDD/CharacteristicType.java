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
 * <em><b>Characteristic Type</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.CharacteristicType#getCharacteristicName
 * <em>Characteristic Name</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.CharacteristicType#getCharacteristicContent
 * <em>Characteristic Content</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getCharacteristicType()
 * @model extendedMetaData="name='characteristic_._type' kind='elementOnly'"
 * @generated
 */
public interface CharacteristicType extends EObject {
    /**
     * Returns the value of the '<em><b>Characteristic Name</b></em>'
     * containment reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Characteristic Name</em>' containment
     * reference isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Characteristic Name</em>' containment
     *         reference.
     * @see #setCharacteristicName(CharacteristicNameType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getCharacteristicType_CharacteristicName()
     * @model containment="true" required="true" extendedMetaData=
     *        "kind='element' name='characteristicName' namespace='##targetNamespace'"
     * @generated
     */
    CharacteristicNameType getCharacteristicName();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.CharacteristicType#getCharacteristicName
     * <em>Characteristic Name</em>}' containment reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Characteristic Name</em>'
     *            containment reference.
     * @see #getCharacteristicName()
     * @generated
     */
    void setCharacteristicName(CharacteristicNameType value);

    /**
     * Returns the value of the '<em><b>Characteristic Content</b></em>'
     * containment reference list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.CharacteristicContentType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Characteristic Content</em>' containment
     * reference list isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Characteristic Content</em>' containment
     *         reference list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getCharacteristicType_CharacteristicContent()
     * @model containment="true" required="true" extendedMetaData=
     *        "kind='element' name='characteristicContent' namespace='##targetNamespace'"
     * @generated
     */
    EList<CharacteristicContentType> getCharacteristicContent();

} // CharacteristicType
