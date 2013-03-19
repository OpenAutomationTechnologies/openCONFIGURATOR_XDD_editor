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
 * <em><b>Data Type List Type</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.DataTypeListType#getDefType
 * <em>Def Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getDataTypeListType()
 * @model extendedMetaData="name='DataTypeList_._type' kind='elementOnly'"
 * @generated
 */
public interface DataTypeListType extends EObject {
    /**
     * Returns the value of the '<em><b>Def Type</b></em>' containment reference
     * list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.TDataTypes}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Def Type</em>' containment reference list
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Def Type</em>' containment reference list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getDataTypeListType_DefType()
     * @model containment="true" required="true" extendedMetaData=
     *        "kind='element' name='defType' namespace='##targetNamespace'"
     * @generated
     */
    EList<TDataTypes> getDefType();

} // DataTypeListType
