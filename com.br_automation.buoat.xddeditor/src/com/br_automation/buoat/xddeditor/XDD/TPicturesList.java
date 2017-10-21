/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TPictures List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TPicturesList#getPicture <em>Picture</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTPicturesList()
 * @model extendedMetaData="name='t_picturesList' kind='elementOnly'"
 * @generated
 */
public interface TPicturesList extends EObject {
	/**
	 * Returns the value of the '<em><b>Picture</b></em>' containment reference list.
	 * The list contents are of type {@link com.br_automation.buoat.xddeditor.XDD.PictureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Picture</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picture</em>' containment reference list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTPicturesList_Picture()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='picture' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PictureType> getPicture();

} // TPicturesList
