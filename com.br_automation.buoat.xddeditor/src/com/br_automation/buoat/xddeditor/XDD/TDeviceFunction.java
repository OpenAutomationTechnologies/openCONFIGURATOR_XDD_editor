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
 * <em><b>TDevice Function</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceFunction#getCapabilities
 * <em>Capabilities</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceFunction#getPicturesList
 * <em>Pictures List</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceFunction#getDictionaryList
 * <em>Dictionary List</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceFunction()
 * @model extendedMetaData="name='t_DeviceFunction' kind='elementOnly'"
 * @generated
 */
public interface TDeviceFunction extends EObject {
    /**
     * Returns the value of the '<em><b>Capabilities</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capabilities</em>' containment reference isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Capabilities</em>' containment reference.
     * @see #setCapabilities(TCapabilities)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceFunction_Capabilities()
     * @model containment="true" required="true" extendedMetaData=
     *        "kind='element' name='capabilities' namespace='##targetNamespace'"
     * @generated
     */
    TCapabilities getCapabilities();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceFunction#getCapabilities
     * <em>Capabilities</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Capabilities</em>' containment
     *            reference.
     * @see #getCapabilities()
     * @generated
     */
    void setCapabilities(TCapabilities value);

    /**
     * Returns the value of the '<em><b>Pictures List</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pictures List</em>' containment reference
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Pictures List</em>' containment reference.
     * @see #setPicturesList(TPicturesList)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceFunction_PicturesList()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='picturesList' namespace='##targetNamespace'"
     * @generated
     */
    TPicturesList getPicturesList();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceFunction#getPicturesList
     * <em>Pictures List</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Pictures List</em>' containment
     *            reference.
     * @see #getPicturesList()
     * @generated
     */
    void setPicturesList(TPicturesList value);

    /**
     * Returns the value of the '<em><b>Dictionary List</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dictionary List</em>' containment reference
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Dictionary List</em>' containment
     *         reference.
     * @see #setDictionaryList(TDictionaryList)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceFunction_DictionaryList()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='dictionaryList' namespace='##targetNamespace'"
     * @generated
     */
    TDictionaryList getDictionaryList();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceFunction#getDictionaryList
     * <em>Dictionary List</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Dictionary List</em>' containment
     *            reference.
     * @see #getDictionaryList()
     * @generated
     */
    void setDictionaryList(TDictionaryList value);

} // TDeviceFunction
