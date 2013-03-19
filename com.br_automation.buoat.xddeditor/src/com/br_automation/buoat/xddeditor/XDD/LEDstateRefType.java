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
 * <em><b>LE Dstate Ref Type</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.LEDstateRefType#getStateIDRef
 * <em>State ID Ref</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getLEDstateRefType()
 * @model extendedMetaData="name='LEDstateRef_._type' kind='empty'"
 * @generated
 */
public interface LEDstateRefType extends EObject {
    /**
     * Returns the value of the '<em><b>State ID Ref</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>State ID Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>State ID Ref</em>' attribute.
     * @see #setStateIDRef(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getLEDstateRefType_StateIDRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
     *        extendedMetaData="kind='attribute' name='stateIDRef'"
     * @generated
     */
    String getStateIDRef();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.LEDstateRefType#getStateIDRef
     * <em>State ID Ref</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>State ID Ref</em>' attribute.
     * @see #getStateIDRef()
     * @generated
     */
    void setStateIDRef(String value);

} // LEDstateRefType
