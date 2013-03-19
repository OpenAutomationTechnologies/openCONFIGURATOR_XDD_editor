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
 * <em><b>TConditional Support</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TConditionalSupport#getParamIDRef
 * <em>Param ID Ref</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTConditionalSupport()
 * @model extendedMetaData="name='t_conditionalSupport' kind='empty'"
 * @generated
 */
public interface TConditionalSupport extends EObject {
    /**
     * Returns the value of the '<em><b>Param ID Ref</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Param ID Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Param ID Ref</em>' attribute.
     * @see #setParamIDRef(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTConditionalSupport_ParamIDRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
     *        extendedMetaData="kind='attribute' name='paramIDRef'"
     * @generated
     */
    String getParamIDRef();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TConditionalSupport#getParamIDRef
     * <em>Param ID Ref</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Param ID Ref</em>' attribute.
     * @see #getParamIDRef()
     * @generated
     */
    void setParamIDRef(String value);

} // TConditionalSupport
