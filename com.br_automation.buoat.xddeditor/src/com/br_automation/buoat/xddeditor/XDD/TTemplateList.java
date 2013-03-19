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
 * <em><b>TTemplate List</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TTemplateList#getParameterTemplate
 * <em>Parameter Template</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TTemplateList#getAllowedValuesTemplate
 * <em>Allowed Values Template</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTTemplateList()
 * @model extendedMetaData="name='t_templateList' kind='elementOnly'"
 * @generated
 */
public interface TTemplateList extends EObject {
    /**
     * Returns the value of the '<em><b>Parameter Template</b></em>' containment
     * reference list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameter Template</em>' containment reference
     * list isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Parameter Template</em>' containment
     *         reference list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTTemplateList_ParameterTemplate()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='parameterTemplate' namespace='##targetNamespace'"
     * @generated
     */
    EList<TParameterTemplate> getParameterTemplate();

    /**
     * Returns the value of the '<em><b>Allowed Values Template</b></em>'
     * containment reference list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.TAllowedValuesTemplate}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Allowed Values Template</em>' containment
     * reference list isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Allowed Values Template</em>' containment
     *         reference list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTTemplateList_AllowedValuesTemplate()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='allowedValuesTemplate' namespace='##targetNamespace'"
     * @generated
     */
    EList<TAllowedValuesTemplate> getAllowedValuesTemplate();

} // TTemplateList
