/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ObjectListType#getObject <em>Object</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ObjectListType#getMandatoryObjects <em>Mandatory Objects</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ObjectListType#getManufacturerObjects <em>Manufacturer Objects</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ObjectListType#getOptionalObjects <em>Optional Objects</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getObjectListType()
 * @model extendedMetaData="name='ObjectList_._type' kind='elementOnly'"
 * @generated
 */
public interface ObjectListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference list.
	 * The list contents are of type {@link com.br_automation.buoat.xddeditor.XDD.TObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getObjectListType_Object()
	 * @model containment="true" required="true" upper="65535"
	 *        extendedMetaData="kind='element' name='Object' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TObject> getObject();

	/**
	 * Returns the value of the '<em><b>Mandatory Objects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory Objects</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Objects</em>' attribute.
	 * @see #isSetMandatoryObjects()
	 * @see #unsetMandatoryObjects()
	 * @see #setMandatoryObjects(long)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getObjectListType_MandatoryObjects()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='mandatoryObjects'"
	 * @generated
	 */
	long getMandatoryObjects();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ObjectListType#getMandatoryObjects <em>Mandatory Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory Objects</em>' attribute.
	 * @see #isSetMandatoryObjects()
	 * @see #unsetMandatoryObjects()
	 * @see #getMandatoryObjects()
	 * @generated
	 */
	void setMandatoryObjects(long value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ObjectListType#getMandatoryObjects <em>Mandatory Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMandatoryObjects()
	 * @see #getMandatoryObjects()
	 * @see #setMandatoryObjects(long)
	 * @generated
	 */
	void unsetMandatoryObjects();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ObjectListType#getMandatoryObjects <em>Mandatory Objects</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mandatory Objects</em>' attribute is set.
	 * @see #unsetMandatoryObjects()
	 * @see #getMandatoryObjects()
	 * @see #setMandatoryObjects(long)
	 * @generated
	 */
	boolean isSetMandatoryObjects();

	/**
	 * Returns the value of the '<em><b>Manufacturer Objects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacturer Objects</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturer Objects</em>' attribute.
	 * @see #isSetManufacturerObjects()
	 * @see #unsetManufacturerObjects()
	 * @see #setManufacturerObjects(long)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getObjectListType_ManufacturerObjects()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='manufacturerObjects'"
	 * @generated
	 */
	long getManufacturerObjects();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ObjectListType#getManufacturerObjects <em>Manufacturer Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer Objects</em>' attribute.
	 * @see #isSetManufacturerObjects()
	 * @see #unsetManufacturerObjects()
	 * @see #getManufacturerObjects()
	 * @generated
	 */
	void setManufacturerObjects(long value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ObjectListType#getManufacturerObjects <em>Manufacturer Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetManufacturerObjects()
	 * @see #getManufacturerObjects()
	 * @see #setManufacturerObjects(long)
	 * @generated
	 */
	void unsetManufacturerObjects();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ObjectListType#getManufacturerObjects <em>Manufacturer Objects</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Manufacturer Objects</em>' attribute is set.
	 * @see #unsetManufacturerObjects()
	 * @see #getManufacturerObjects()
	 * @see #setManufacturerObjects(long)
	 * @generated
	 */
	boolean isSetManufacturerObjects();

	/**
	 * Returns the value of the '<em><b>Optional Objects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional Objects</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Objects</em>' attribute.
	 * @see #isSetOptionalObjects()
	 * @see #unsetOptionalObjects()
	 * @see #setOptionalObjects(long)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getObjectListType_OptionalObjects()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='optionalObjects'"
	 * @generated
	 */
	long getOptionalObjects();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ObjectListType#getOptionalObjects <em>Optional Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional Objects</em>' attribute.
	 * @see #isSetOptionalObjects()
	 * @see #unsetOptionalObjects()
	 * @see #getOptionalObjects()
	 * @generated
	 */
	void setOptionalObjects(long value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ObjectListType#getOptionalObjects <em>Optional Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOptionalObjects()
	 * @see #getOptionalObjects()
	 * @see #setOptionalObjects(long)
	 * @generated
	 */
	void unsetOptionalObjects();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ObjectListType#getOptionalObjects <em>Optional Objects</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Optional Objects</em>' attribute is set.
	 * @see #unsetOptionalObjects()
	 * @see #getOptionalObjects()
	 * @see #setOptionalObjects(long)
	 * @generated
	 */
	boolean isSetOptionalObjects();

} // ObjectListType
