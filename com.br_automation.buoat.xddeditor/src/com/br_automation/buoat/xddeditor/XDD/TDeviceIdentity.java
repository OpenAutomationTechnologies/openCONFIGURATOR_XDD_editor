/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>TDevice Identity</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getVendorName
 * <em>Vendor Name</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getVendorID
 * <em>Vendor ID</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getVendorText
 * <em>Vendor Text</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getDeviceFamily
 * <em>Device Family</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getProductFamily
 * <em>Product Family</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getProductName
 * <em>Product Name</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getProductID
 * <em>Product ID</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getProductText
 * <em>Product Text</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getOrderNumber
 * <em>Order Number</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getVersion
 * <em>Version</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getBuildDate
 * <em>Build Date</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getSpecificationRevision
 * <em>Specification Revision</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getInstanceName
 * <em>Instance Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceIdentity()
 * @model extendedMetaData="name='t_DeviceIdentity' kind='elementOnly'"
 * @generated
 */
public interface TDeviceIdentity extends EObject {
    /**
     * Returns the value of the '<em><b>Vendor Name</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vendor Name</em>' containment reference isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Vendor Name</em>' containment reference.
     * @see #setVendorName(VendorNameType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceIdentity_VendorName()
     * @model containment="true" required="true" extendedMetaData=
     *        "kind='element' name='vendorName' namespace='##targetNamespace'"
     * @generated
     */
    VendorNameType getVendorName();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getVendorName
     * <em>Vendor Name</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Vendor Name</em>' containment
     *            reference.
     * @see #getVendorName()
     * @generated
     */
    void setVendorName(VendorNameType value);

    /**
     * Returns the value of the '<em><b>Vendor ID</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vendor ID</em>' containment reference isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Vendor ID</em>' containment reference.
     * @see #setVendorID(TVendorID)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceIdentity_VendorID()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='vendorID' namespace='##targetNamespace'"
     * @generated
     */
    TVendorID getVendorID();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getVendorID
     * <em>Vendor ID</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Vendor ID</em>' containment
     *            reference.
     * @see #getVendorID()
     * @generated
     */
    void setVendorID(TVendorID value);

    /**
     * Returns the value of the '<em><b>Vendor Text</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vendor Text</em>' containment reference isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Vendor Text</em>' containment reference.
     * @see #setVendorText(VendorTextType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceIdentity_VendorText()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='vendorText' namespace='##targetNamespace'"
     * @generated
     */
    VendorTextType getVendorText();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getVendorText
     * <em>Vendor Text</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Vendor Text</em>' containment
     *            reference.
     * @see #getVendorText()
     * @generated
     */
    void setVendorText(VendorTextType value);

    /**
     * Returns the value of the '<em><b>Device Family</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Device Family</em>' containment reference
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Device Family</em>' containment reference.
     * @see #setDeviceFamily(TDeviceFamily)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceIdentity_DeviceFamily()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='deviceFamily' namespace='##targetNamespace'"
     * @generated
     */
    TDeviceFamily getDeviceFamily();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getDeviceFamily
     * <em>Device Family</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Device Family</em>' containment
     *            reference.
     * @see #getDeviceFamily()
     * @generated
     */
    void setDeviceFamily(TDeviceFamily value);

    /**
     * Returns the value of the '<em><b>Product Family</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Product Family</em>' containment reference
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Product Family</em>' containment reference.
     * @see #setProductFamily(ProductFamilyType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceIdentity_ProductFamily()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='productFamily' namespace='##targetNamespace'"
     * @generated
     */
    ProductFamilyType getProductFamily();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getProductFamily
     * <em>Product Family</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Product Family</em>' containment
     *            reference.
     * @see #getProductFamily()
     * @generated
     */
    void setProductFamily(ProductFamilyType value);

    /**
     * Returns the value of the '<em><b>Product Name</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Product Name</em>' containment reference isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Product Name</em>' containment reference.
     * @see #setProductName(ProductNameType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceIdentity_ProductName()
     * @model containment="true" required="true" extendedMetaData=
     *        "kind='element' name='productName' namespace='##targetNamespace'"
     * @generated
     */
    ProductNameType getProductName();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getProductName
     * <em>Product Name</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Product Name</em>' containment
     *            reference.
     * @see #getProductName()
     * @generated
     */
    void setProductName(ProductNameType value);

    /**
     * Returns the value of the '<em><b>Product ID</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Product ID</em>' containment reference isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Product ID</em>' containment reference.
     * @see #setProductID(TProductID)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceIdentity_ProductID()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='productID' namespace='##targetNamespace'"
     * @generated
     */
    TProductID getProductID();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getProductID
     * <em>Product ID</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Product ID</em>' containment
     *            reference.
     * @see #getProductID()
     * @generated
     */
    void setProductID(TProductID value);

    /**
     * Returns the value of the '<em><b>Product Text</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Product Text</em>' containment reference isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Product Text</em>' containment reference.
     * @see #setProductText(ProductTextType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceIdentity_ProductText()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='productText' namespace='##targetNamespace'"
     * @generated
     */
    ProductTextType getProductText();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getProductText
     * <em>Product Text</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Product Text</em>' containment
     *            reference.
     * @see #getProductText()
     * @generated
     */
    void setProductText(ProductTextType value);

    /**
     * Returns the value of the '<em><b>Order Number</b></em>' containment
     * reference list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.OrderNumberType}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Order Number</em>' containment reference list
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Order Number</em>' containment reference
     *         list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceIdentity_OrderNumber()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='orderNumber' namespace='##targetNamespace'"
     * @generated
     */
    EList<OrderNumberType> getOrderNumber();

    /**
     * Returns the value of the '<em><b>Version</b></em>' containment reference
     * list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.TVersion}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Version</em>' containment reference list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Version</em>' containment reference list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceIdentity_Version()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='version' namespace='##targetNamespace'"
     * @generated
     */
    EList<TVersion> getVersion();

    /**
     * Returns the value of the '<em><b>Build Date</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Build Date</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Build Date</em>' attribute.
     * @see #setBuildDate(XMLGregorianCalendar)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceIdentity_BuildDate()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Date" extendedMetaData=
     *        "kind='element' name='buildDate' namespace='##targetNamespace'"
     * @generated
     */
    XMLGregorianCalendar getBuildDate();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getBuildDate
     * <em>Build Date</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Build Date</em>' attribute.
     * @see #getBuildDate()
     * @generated
     */
    void setBuildDate(XMLGregorianCalendar value);

    /**
     * Returns the value of the '<em><b>Specification Revision</b></em>'
     * containment reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Specification Revision</em>' containment
     * reference isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Specification Revision</em>' containment
     *         reference.
     * @see #setSpecificationRevision(TSpecificationRevision)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceIdentity_SpecificationRevision()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='specificationRevision' namespace='##targetNamespace'"
     * @generated
     */
    TSpecificationRevision getSpecificationRevision();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getSpecificationRevision
     * <em>Specification Revision</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Specification Revision</em>'
     *            containment reference.
     * @see #getSpecificationRevision()
     * @generated
     */
    void setSpecificationRevision(TSpecificationRevision value);

    /**
     * Returns the value of the '<em><b>Instance Name</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instance Name</em>' containment reference
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Instance Name</em>' containment reference.
     * @see #setInstanceName(InstanceNameType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceIdentity_InstanceName()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='instanceName' namespace='##targetNamespace'"
     * @generated
     */
    InstanceNameType getInstanceName();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getInstanceName
     * <em>Instance Name</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Instance Name</em>' containment
     *            reference.
     * @see #getInstanceName()
     * @generated
     */
    void setInstanceName(InstanceNameType value);

} // TDeviceIdentity
