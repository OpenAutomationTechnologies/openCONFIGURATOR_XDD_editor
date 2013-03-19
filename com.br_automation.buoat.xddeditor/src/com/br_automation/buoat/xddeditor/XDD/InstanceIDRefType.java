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
 * <em><b>Instance ID Ref Type</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.InstanceIDRefType#getUniqueIDRef
 * <em>Unique ID Ref</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getInstanceIDRefType()
 * @model extendedMetaData="name='instanceIDRef_._type' kind='empty'"
 * @generated
 */
public interface InstanceIDRefType extends EObject {
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
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getInstanceIDRefType_UniqueIDRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
     *        extendedMetaData="kind='attribute' name='uniqueIDRef'"
     * @generated
     */
    String getUniqueIDRef();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.InstanceIDRefType#getUniqueIDRef
     * <em>Unique ID Ref</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Unique ID Ref</em>' attribute.
     * @see #getUniqueIDRef()
     * @generated
     */
    void setUniqueIDRef(String value);

} // InstanceIDRefType
