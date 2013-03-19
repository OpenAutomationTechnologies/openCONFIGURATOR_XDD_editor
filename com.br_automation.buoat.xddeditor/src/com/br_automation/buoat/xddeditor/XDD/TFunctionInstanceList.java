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
 * <em><b>TFunction Instance List</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TFunctionInstanceList#getFunctionInstance
 * <em>Function Instance</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TFunctionInstanceList#getConnection
 * <em>Connection</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTFunctionInstanceList()
 * @model extendedMetaData="name='t_functionInstanceList' kind='elementOnly'"
 * @generated
 */
public interface TFunctionInstanceList extends EObject {
    /**
     * Returns the value of the '<em><b>Function Instance</b></em>' containment
     * reference list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.FunctionInstanceType}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Function Instance</em>' containment reference
     * list isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Function Instance</em>' containment
     *         reference list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTFunctionInstanceList_FunctionInstance()
     * @model containment="true" required="true" extendedMetaData=
     *        "kind='element' name='functionInstance' namespace='##targetNamespace'"
     * @generated
     */
    EList<FunctionInstanceType> getFunctionInstance();

    /**
     * Returns the value of the '<em><b>Connection</b></em>' containment
     * reference list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.ConnectionType}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connection</em>' containment reference list
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Connection</em>' containment reference
     *         list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTFunctionInstanceList_Connection()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='connection' namespace='##targetNamespace'"
     * @generated
     */
    EList<ConnectionType> getConnection();

} // TFunctionInstanceList
