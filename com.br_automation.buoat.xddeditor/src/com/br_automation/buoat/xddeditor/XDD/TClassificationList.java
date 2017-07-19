/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TClassification List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TClassificationList#getClassification <em>Classification</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTClassificationList()
 * @model extendedMetaData="name='t_classificationList' kind='elementOnly'"
 * @generated
 */
public interface TClassificationList extends EObject {
	/**
	 * Returns the value of the '<em><b>Classification</b></em>' attribute list.
	 * The list contents are of type {@link com.br_automation.buoat.xddeditor.XDD.ClassificationType}.
	 * The literals are from the enumeration {@link com.br_automation.buoat.xddeditor.XDD.ClassificationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' attribute list.
	 * @see com.br_automation.buoat.xddeditor.XDD.ClassificationType
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTClassificationList_Classification()
	 * @model unique="false" required="true"
	 *        extendedMetaData="kind='element' name='classification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClassificationType> getClassification();

} // TClassificationList
