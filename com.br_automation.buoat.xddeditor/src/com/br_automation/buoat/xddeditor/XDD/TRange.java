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
 * <em><b>TRange</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TRange#getMinValue <em>Min
 * Value</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TRange#getMaxValue <em>Max
 * Value</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TRange#getStep <em>Step
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTRange()
 * @model extendedMetaData="name='t_range' kind='elementOnly'"
 * @generated
 */
public interface TRange extends EObject {
    /**
     * Returns the value of the '<em><b>Min Value</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Value</em>' containment reference isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Min Value</em>' containment reference.
     * @see #setMinValue(MinValueType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTRange_MinValue()
     * @model containment="true" required="true" extendedMetaData=
     *        "kind='element' name='minValue' namespace='##targetNamespace'"
     * @generated
     */
    MinValueType getMinValue();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TRange#getMinValue
     * <em>Min Value</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Min Value</em>' containment
     *            reference.
     * @see #getMinValue()
     * @generated
     */
    void setMinValue(MinValueType value);

    /**
     * Returns the value of the '<em><b>Max Value</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Value</em>' containment reference isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Max Value</em>' containment reference.
     * @see #setMaxValue(MaxValueType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTRange_MaxValue()
     * @model containment="true" required="true" extendedMetaData=
     *        "kind='element' name='maxValue' namespace='##targetNamespace'"
     * @generated
     */
    MaxValueType getMaxValue();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TRange#getMaxValue
     * <em>Max Value</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Max Value</em>' containment
     *            reference.
     * @see #getMaxValue()
     * @generated
     */
    void setMaxValue(MaxValueType value);

    /**
     * Returns the value of the '<em><b>Step</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Step</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Step</em>' containment reference.
     * @see #setStep(StepType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTRange_Step()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='step' namespace='##targetNamespace'"
     * @generated
     */
    StepType getStep();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TRange#getStep
     * <em>Step</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Step</em>' containment reference.
     * @see #getStep()
     * @generated
     */
    void setStep(StepType value);

} // TRange
