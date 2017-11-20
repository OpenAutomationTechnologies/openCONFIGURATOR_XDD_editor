/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISO15745 Profile Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileType#getProfileHeader <em>Profile Header</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileType#getProfileBody <em>Profile Body</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getISO15745ProfileType()
 * @model extendedMetaData="name='ISO15745Profile_._type' kind='elementOnly'"
 * @generated
 */
public interface ISO15745ProfileType extends EObject {
	/**
	 * Returns the value of the '<em><b>Profile Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Header</em>' containment reference.
	 * @see #setProfileHeader(ProfileHeaderDataType)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getISO15745ProfileType_ProfileHeader()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ProfileHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	ProfileHeaderDataType getProfileHeader();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileType#getProfileHeader <em>Profile Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Header</em>' containment reference.
	 * @see #getProfileHeader()
	 * @generated
	 */
	void setProfileHeader(ProfileHeaderDataType value);

	/**
	 * Returns the value of the '<em><b>Profile Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Body</em>' containment reference.
	 * @see #setProfileBody(ProfileBodyDataType)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getISO15745ProfileType_ProfileBody()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ProfileBody' namespace='##targetNamespace'"
	 * @generated
	 */
	ProfileBodyDataType getProfileBody();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileType#getProfileBody <em>Profile Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Body</em>' containment reference.
	 * @see #getProfileBody()
	 * @generated
	 */
	void setProfileBody(ProfileBodyDataType value);

} // ISO15745ProfileType
