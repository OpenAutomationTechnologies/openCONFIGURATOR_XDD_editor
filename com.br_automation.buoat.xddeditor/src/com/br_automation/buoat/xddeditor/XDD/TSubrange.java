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
 * <em><b>TSubrange</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TSubrange#getLowerLimit <em>
 * Lower Limit</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TSubrange#getUpperLimit <em>
 * Upper Limit</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTSubrange()
 * @model extendedMetaData="name='t_subrange' kind='empty'"
 * @generated
 */
public interface TSubrange extends EObject {
    /**
     * Returns the value of the '<em><b>Lower Limit</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lower Limit</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Lower Limit</em>' attribute.
     * @see #isSetLowerLimit()
     * @see #unsetLowerLimit()
     * @see #setLowerLimit(long)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTSubrange_LowerLimit()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
     *        required="true"
     *        extendedMetaData="kind='attribute' name='lowerLimit'"
     * @generated
     */
    long getLowerLimit();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TSubrange#getLowerLimit
     * <em>Lower Limit</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Lower Limit</em>' attribute.
     * @see #isSetLowerLimit()
     * @see #unsetLowerLimit()
     * @see #getLowerLimit()
     * @generated
     */
    void setLowerLimit(long value);

    /**
     * Unsets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TSubrange#getLowerLimit
     * <em>Lower Limit</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isSetLowerLimit()
     * @see #getLowerLimit()
     * @see #setLowerLimit(long)
     * @generated
     */
    void unsetLowerLimit();

    /**
     * Returns whether the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TSubrange#getLowerLimit
     * <em>Lower Limit</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return whether the value of the '<em>Lower Limit</em>' attribute is set.
     * @see #unsetLowerLimit()
     * @see #getLowerLimit()
     * @see #setLowerLimit(long)
     * @generated
     */
    boolean isSetLowerLimit();

    /**
     * Returns the value of the '<em><b>Upper Limit</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Upper Limit</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Upper Limit</em>' attribute.
     * @see #isSetUpperLimit()
     * @see #unsetUpperLimit()
     * @see #setUpperLimit(long)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTSubrange_UpperLimit()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
     *        required="true"
     *        extendedMetaData="kind='attribute' name='upperLimit'"
     * @generated
     */
    long getUpperLimit();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TSubrange#getUpperLimit
     * <em>Upper Limit</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Upper Limit</em>' attribute.
     * @see #isSetUpperLimit()
     * @see #unsetUpperLimit()
     * @see #getUpperLimit()
     * @generated
     */
    void setUpperLimit(long value);

    /**
     * Unsets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TSubrange#getUpperLimit
     * <em>Upper Limit</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isSetUpperLimit()
     * @see #getUpperLimit()
     * @see #setUpperLimit(long)
     * @generated
     */
    void unsetUpperLimit();

    /**
     * Returns whether the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TSubrange#getUpperLimit
     * <em>Upper Limit</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return whether the value of the '<em>Upper Limit</em>' attribute is set.
     * @see #unsetUpperLimit()
     * @see #getUpperLimit()
     * @see #setUpperLimit(long)
     * @generated
     */
    boolean isSetUpperLimit();

} // TSubrange
