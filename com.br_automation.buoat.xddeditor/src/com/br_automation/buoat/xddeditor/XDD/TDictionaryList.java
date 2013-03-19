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
 * <em><b>TDictionary List</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TDictionaryList#getDictionary
 * <em>Dictionary</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDictionaryList()
 * @model extendedMetaData="name='t_dictionaryList' kind='elementOnly'"
 * @generated
 */
public interface TDictionaryList extends EObject {
    /**
     * Returns the value of the '<em><b>Dictionary</b></em>' containment
     * reference list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.DictionaryType}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dictionary</em>' containment reference list
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Dictionary</em>' containment reference
     *         list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDictionaryList_Dictionary()
     * @model containment="true" required="true" extendedMetaData=
     *        "kind='element' name='dictionary' namespace='##targetNamespace'"
     * @generated
     */
    EList<DictionaryType> getDictionary();

} // TDictionaryList
