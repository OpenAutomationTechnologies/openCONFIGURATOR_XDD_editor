/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISO15745 Reference Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ISO15745ReferenceDataType#getISO15745Part <em>ISO15745 Part</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ISO15745ReferenceDataType#getISO15745Edition <em>ISO15745 Edition</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ISO15745ReferenceDataType#getProfileTechnology <em>Profile Technology</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getISO15745ReferenceDataType()
 * @model extendedMetaData="name='ISO15745Reference_DataType' kind='elementOnly'"
 * @generated
 */
public interface ISO15745ReferenceDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>ISO15745 Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ISO15745 Part</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ISO15745 Part</em>' attribute.
	 * @see #setISO15745Part(BigInteger)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getISO15745ReferenceDataType_ISO15745Part()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
	 *        extendedMetaData="kind='element' name='ISO15745Part' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getISO15745Part();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ISO15745ReferenceDataType#getISO15745Part <em>ISO15745 Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ISO15745 Part</em>' attribute.
	 * @see #getISO15745Part()
	 * @generated
	 */
	void setISO15745Part(BigInteger value);

	/**
	 * Returns the value of the '<em><b>ISO15745 Edition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ISO15745 Edition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ISO15745 Edition</em>' attribute.
	 * @see #setISO15745Edition(BigInteger)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getISO15745ReferenceDataType_ISO15745Edition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
	 *        extendedMetaData="kind='element' name='ISO15745Edition' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getISO15745Edition();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ISO15745ReferenceDataType#getISO15745Edition <em>ISO15745 Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ISO15745 Edition</em>' attribute.
	 * @see #getISO15745Edition()
	 * @generated
	 */
	void setISO15745Edition(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Profile Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Technology</em>' attribute.
	 * @see #setProfileTechnology(String)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getISO15745ReferenceDataType_ProfileTechnology()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='ProfileTechnology' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProfileTechnology();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ISO15745ReferenceDataType#getProfileTechnology <em>Profile Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Technology</em>' attribute.
	 * @see #getProfileTechnology()
	 * @generated
	 */
	void setProfileTechnology(String value);

} // ISO15745ReferenceDataType
