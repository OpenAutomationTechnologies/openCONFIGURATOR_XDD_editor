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
 * <em><b>TVariable Ref</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TVariableRef#getInstanceIDRef
 * <em>Instance ID Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TVariableRef#getVariableIDRef
 * <em>Variable ID Ref</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TVariableRef#getMemberRef
 * <em>Member Ref</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TVariableRef#getPosition
 * <em>Position</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTVariableRef()
 * @model extendedMetaData="name='t_variableRef' kind='elementOnly'"
 * @generated
 */
public interface TVariableRef extends EObject {
    /**
     * Returns the value of the '<em><b>Instance ID Ref</b></em>' containment
     * reference list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.InstanceIDRefType}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instance ID Ref</em>' containment reference
     * list isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Instance ID Ref</em>' containment reference
     *         list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTVariableRef_InstanceIDRef()
     * @model containment="true" required="true" extendedMetaData=
     *        "kind='element' name='instanceIDRef' namespace='##targetNamespace'"
     * @generated
     */
    EList<InstanceIDRefType> getInstanceIDRef();

    /**
     * Returns the value of the '<em><b>Variable ID Ref</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variable ID Ref</em>' containment reference
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Variable ID Ref</em>' containment
     *         reference.
     * @see #setVariableIDRef(VariableIDRefType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTVariableRef_VariableIDRef()
     * @model containment="true" required="true" extendedMetaData=
     *        "kind='element' name='variableIDRef' namespace='##targetNamespace'"
     * @generated
     */
    VariableIDRefType getVariableIDRef();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TVariableRef#getVariableIDRef
     * <em>Variable ID Ref</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Variable ID Ref</em>' containment
     *            reference.
     * @see #getVariableIDRef()
     * @generated
     */
    void setVariableIDRef(VariableIDRefType value);

    /**
     * Returns the value of the '<em><b>Member Ref</b></em>' containment
     * reference list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.MemberRefType}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Member Ref</em>' containment reference list
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Member Ref</em>' containment reference
     *         list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTVariableRef_MemberRef()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='memberRef' namespace='##targetNamespace'"
     * @generated
     */
    EList<MemberRefType> getMemberRef();

    /**
     * Returns the value of the '<em><b>Position</b></em>' attribute. The
     * default value is <code>"1"</code>. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Position</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Position</em>' attribute.
     * @see #isSetPosition()
     * @see #unsetPosition()
     * @see #setPosition(short)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTVariableRef_Position()
     * @model default="1" unsettable="true"
     *        dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte"
     *        extendedMetaData="kind='attribute' name='position'"
     * @generated
     */
    short getPosition();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TVariableRef#getPosition
     * <em>Position</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Position</em>' attribute.
     * @see #isSetPosition()
     * @see #unsetPosition()
     * @see #getPosition()
     * @generated
     */
    void setPosition(short value);

    /**
     * Unsets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TVariableRef#getPosition
     * <em>Position</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #isSetPosition()
     * @see #getPosition()
     * @see #setPosition(short)
     * @generated
     */
    void unsetPosition();

    /**
     * Returns whether the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TVariableRef#getPosition
     * <em>Position</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return whether the value of the '<em>Position</em>' attribute is set.
     * @see #unsetPosition()
     * @see #getPosition()
     * @see #setPosition(short)
     * @generated
     */
    boolean isSetPosition();

} // TVariableRef
