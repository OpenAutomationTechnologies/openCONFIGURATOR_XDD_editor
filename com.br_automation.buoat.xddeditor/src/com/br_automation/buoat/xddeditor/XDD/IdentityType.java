/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.IdentityType#getVendorID <em>Vendor ID</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.IdentityType#getDeviceFamily <em>Device Family</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.IdentityType#getProductID <em>Product ID</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.IdentityType#getVersion <em>Version</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.IdentityType#getBuildDate <em>Build Date</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.IdentityType#getSpecificationRevision <em>Specification Revision</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getIdentityType()
 * @model extendedMetaData="name='identity_._type' kind='elementOnly'"
 * @generated
 */
public interface IdentityType extends EObject {
	/**
	 * Returns the value of the '<em><b>Vendor ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor ID</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor ID</em>' containment reference.
	 * @see #setVendorID(TVendorID)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getIdentityType_VendorID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vendorID' namespace='##targetNamespace'"
	 * @generated
	 */
	TVendorID getVendorID();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.IdentityType#getVendorID <em>Vendor ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor ID</em>' containment reference.
	 * @see #getVendorID()
	 * @generated
	 */
	void setVendorID(TVendorID value);

	/**
	 * Returns the value of the '<em><b>Device Family</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Family</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Family</em>' containment reference.
	 * @see #setDeviceFamily(TDeviceFamily)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getIdentityType_DeviceFamily()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deviceFamily' namespace='##targetNamespace'"
	 * @generated
	 */
	TDeviceFamily getDeviceFamily();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.IdentityType#getDeviceFamily <em>Device Family</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Family</em>' containment reference.
	 * @see #getDeviceFamily()
	 * @generated
	 */
	void setDeviceFamily(TDeviceFamily value);

	/**
	 * Returns the value of the '<em><b>Product ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product ID</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product ID</em>' containment reference.
	 * @see #setProductID(TProductID)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getIdentityType_ProductID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='productID' namespace='##targetNamespace'"
	 * @generated
	 */
	TProductID getProductID();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.IdentityType#getProductID <em>Product ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product ID</em>' containment reference.
	 * @see #getProductID()
	 * @generated
	 */
	void setProductID(TProductID value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference list.
	 * The list contents are of type {@link com.br_automation.buoat.xddeditor.XDD.TVersion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' containment reference list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getIdentityType_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TVersion> getVersion();

	/**
	 * Returns the value of the '<em><b>Build Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Date</em>' attribute.
	 * @see #setBuildDate(XMLGregorianCalendar)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getIdentityType_BuildDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='buildDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getBuildDate();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.IdentityType#getBuildDate <em>Build Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Date</em>' attribute.
	 * @see #getBuildDate()
	 * @generated
	 */
	void setBuildDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Specification Revision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Revision</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Revision</em>' containment reference.
	 * @see #setSpecificationRevision(TSpecificationRevision)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getIdentityType_SpecificationRevision()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specificationRevision' namespace='##targetNamespace'"
	 * @generated
	 */
	TSpecificationRevision getSpecificationRevision();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.IdentityType#getSpecificationRevision <em>Specification Revision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification Revision</em>' containment reference.
	 * @see #getSpecificationRevision()
	 * @generated
	 */
	void setSpecificationRevision(TSpecificationRevision value);

} // IdentityType
