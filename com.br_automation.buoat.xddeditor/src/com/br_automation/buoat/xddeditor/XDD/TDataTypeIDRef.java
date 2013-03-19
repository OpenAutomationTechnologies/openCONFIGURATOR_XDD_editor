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
 * <em><b>TData Type ID Ref</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TDataTypeIDRef#getUniqueIDRef
 * <em>Unique ID Ref</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDataTypeIDRef()
 * @model extendedMetaData="name='t_dataTypeIDRef' kind='empty'"
 * @generated
 */
public interface TDataTypeIDRef extends EObject {
    /**
     * Returns the value of the '<em><b>Unique ID Ref</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unique ID Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Unique ID Ref</em>' attribute.
     * @see #setUniqueIDRef(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDataTypeIDRef_UniqueIDRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
     *        extendedMetaData="kind='attribute' name='uniqueIDRef'"
     * @generated
     */
    String getUniqueIDRef();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDataTypeIDRef#getUniqueIDRef
     * <em>Unique ID Ref</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Unique ID Ref</em>' attribute.
     * @see #getUniqueIDRef()
     * @generated
     */
    void setUniqueIDRef(String value);

} // TDataTypeIDRef
