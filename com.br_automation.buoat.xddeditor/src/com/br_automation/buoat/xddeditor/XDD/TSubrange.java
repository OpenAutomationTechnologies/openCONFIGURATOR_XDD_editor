/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TSubrange</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TSubrange#getLowerLimit <em>Lower Limit</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TSubrange#getUpperLimit <em>Upper Limit</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTSubrange()
 * @model extendedMetaData="name='t_subrange' kind='empty'"
 * @generated
 */
public interface TSubrange extends EObject {
	/**
	 * Returns the value of the '<em><b>Lower Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Limit</em>' attribute.
	 * @see #setLowerLimit(BigInteger)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTSubrange_LowerLimit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='lowerLimit'"
	 * @generated
	 */
	BigInteger getLowerLimit();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TSubrange#getLowerLimit <em>Lower Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Limit</em>' attribute.
	 * @see #getLowerLimit()
	 * @generated
	 */
	void setLowerLimit(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Upper Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Limit</em>' attribute.
	 * @see #setUpperLimit(BigInteger)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTSubrange_UpperLimit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='upperLimit'"
	 * @generated
	 */
	BigInteger getUpperLimit();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TSubrange#getUpperLimit <em>Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Limit</em>' attribute.
	 * @see #getUpperLimit()
	 * @generated
	 */
	void setUpperLimit(BigInteger value);

} // TSubrange
