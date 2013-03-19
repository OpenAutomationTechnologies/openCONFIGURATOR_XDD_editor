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
 * <em><b>Interface List Type</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.InterfaceListType#getInputVars
 * <em>Input Vars</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.InterfaceListType#getOutputVars
 * <em>Output Vars</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.InterfaceListType#getConfigVars
 * <em>Config Vars</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getInterfaceListType()
 * @model extendedMetaData="name='interfaceList_._type' kind='elementOnly'"
 * @generated
 */
public interface InterfaceListType extends EObject {
    /**
     * Returns the value of the '<em><b>Input Vars</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input Vars</em>' containment reference isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Input Vars</em>' containment reference.
     * @see #setInputVars(InputVarsType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getInterfaceListType_InputVars()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='inputVars' namespace='##targetNamespace'"
     * @generated
     */
    InputVarsType getInputVars();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.InterfaceListType#getInputVars
     * <em>Input Vars</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Input Vars</em>' containment
     *            reference.
     * @see #getInputVars()
     * @generated
     */
    void setInputVars(InputVarsType value);

    /**
     * Returns the value of the '<em><b>Output Vars</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output Vars</em>' containment reference isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Output Vars</em>' containment reference.
     * @see #setOutputVars(OutputVarsType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getInterfaceListType_OutputVars()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='outputVars' namespace='##targetNamespace'"
     * @generated
     */
    OutputVarsType getOutputVars();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.InterfaceListType#getOutputVars
     * <em>Output Vars</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Output Vars</em>' containment
     *            reference.
     * @see #getOutputVars()
     * @generated
     */
    void setOutputVars(OutputVarsType value);

    /**
     * Returns the value of the '<em><b>Config Vars</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Config Vars</em>' containment reference isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Config Vars</em>' containment reference.
     * @see #setConfigVars(ConfigVarsType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getInterfaceListType_ConfigVars()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='configVars' namespace='##targetNamespace'"
     * @generated
     */
    ConfigVarsType getConfigVars();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.InterfaceListType#getConfigVars
     * <em>Config Vars</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Config Vars</em>' containment
     *            reference.
     * @see #getConfigVars()
     * @generated
     */
    void setConfigVars(ConfigVarsType value);

} // InterfaceListType
