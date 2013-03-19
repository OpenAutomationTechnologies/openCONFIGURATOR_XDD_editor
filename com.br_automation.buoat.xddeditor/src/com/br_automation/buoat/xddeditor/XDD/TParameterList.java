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
 * <em><b>TParameter List</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterList#getParameter
 * <em>Parameter</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterList()
 * @model extendedMetaData="name='t_parameterList' kind='elementOnly'"
 * @generated
 */
public interface TParameterList extends EObject {
    /**
     * Returns the value of the '<em><b>Parameter</b></em>' containment
     * reference list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.ParameterType}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameter</em>' containment reference list
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Parameter</em>' containment reference list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterList_Parameter()
     * @model containment="true" required="true" extendedMetaData=
     *        "kind='element' name='parameter' namespace='##targetNamespace'"
     * @generated
     */
    EList<ParameterType> getParameter();

} // TParameterList
