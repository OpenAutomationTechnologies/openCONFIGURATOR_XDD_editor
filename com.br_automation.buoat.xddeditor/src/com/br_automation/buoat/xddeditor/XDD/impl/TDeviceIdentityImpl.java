/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.InstanceNameType;
import com.br_automation.buoat.xddeditor.XDD.OrderNumberType;
import com.br_automation.buoat.xddeditor.XDD.ProductFamilyType;
import com.br_automation.buoat.xddeditor.XDD.ProductNameType;
import com.br_automation.buoat.xddeditor.XDD.ProductTextType;
import com.br_automation.buoat.xddeditor.XDD.TDeviceFamily;
import com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity;
import com.br_automation.buoat.xddeditor.XDD.TProductID;
import com.br_automation.buoat.xddeditor.XDD.TSpecificationRevision;
import com.br_automation.buoat.xddeditor.XDD.TVendorID;
import com.br_automation.buoat.xddeditor.XDD.TVersion;
import com.br_automation.buoat.xddeditor.XDD.VendorNameType;
import com.br_automation.buoat.xddeditor.XDD.VendorTextType;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>TDevice Identity</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceIdentityImpl#getVendorName
 * <em>Vendor Name</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceIdentityImpl#getVendorID
 * <em>Vendor ID</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceIdentityImpl#getVendorText
 * <em>Vendor Text</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceIdentityImpl#getDeviceFamily
 * <em>Device Family</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceIdentityImpl#getProductFamily
 * <em>Product Family</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceIdentityImpl#getProductName
 * <em>Product Name</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceIdentityImpl#getProductID
 * <em>Product ID</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceIdentityImpl#getProductText
 * <em>Product Text</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceIdentityImpl#getOrderNumber
 * <em>Order Number</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceIdentityImpl#getVersion
 * <em>Version</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceIdentityImpl#getBuildDate
 * <em>Build Date</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceIdentityImpl#getSpecificationRevision
 * <em>Specification Revision</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceIdentityImpl#getInstanceName
 * <em>Instance Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TDeviceIdentityImpl extends EObjectImpl implements TDeviceIdentity {
    /**
     * The cached value of the '{@link #getVendorName() <em>Vendor Name</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getVendorName()
     * @generated
     * @ordered
     */
    protected VendorNameType vendorName;

    /**
     * The cached value of the '{@link #getVendorID() <em>Vendor ID</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getVendorID()
     * @generated
     * @ordered
     */
    protected TVendorID vendorID;

    /**
     * The cached value of the '{@link #getVendorText() <em>Vendor Text</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getVendorText()
     * @generated
     * @ordered
     */
    protected VendorTextType vendorText;

    /**
     * The cached value of the '{@link #getDeviceFamily()
     * <em>Device Family</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getDeviceFamily()
     * @generated
     * @ordered
     */
    protected TDeviceFamily deviceFamily;

    /**
     * The cached value of the '{@link #getProductFamily()
     * <em>Product Family</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getProductFamily()
     * @generated
     * @ordered
     */
    protected ProductFamilyType productFamily;

    /**
     * The cached value of the '{@link #getProductName() <em>Product Name</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getProductName()
     * @generated
     * @ordered
     */
    protected ProductNameType productName;

    /**
     * The cached value of the '{@link #getProductID() <em>Product ID</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getProductID()
     * @generated
     * @ordered
     */
    protected TProductID productID;

    /**
     * The cached value of the '{@link #getProductText() <em>Product Text</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getProductText()
     * @generated
     * @ordered
     */
    protected ProductTextType productText;

    /**
     * The cached value of the '{@link #getOrderNumber() <em>Order Number</em>}'
     * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getOrderNumber()
     * @generated
     * @ordered
     */
    protected EList<OrderNumberType> orderNumber;

    /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}'
     * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected EList<TVersion> version;

    /**
     * The default value of the '{@link #getBuildDate() <em>Build Date</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getBuildDate()
     * @generated
     * @ordered
     */
    protected static final XMLGregorianCalendar BUILD_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBuildDate() <em>Build Date</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getBuildDate()
     * @generated
     * @ordered
     */
    protected XMLGregorianCalendar buildDate = BUILD_DATE_EDEFAULT;

    /**
     * The cached value of the '{@link #getSpecificationRevision()
     * <em>Specification Revision</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSpecificationRevision()
     * @generated
     * @ordered
     */
    protected TSpecificationRevision specificationRevision;

    /**
     * The cached value of the '{@link #getInstanceName()
     * <em>Instance Name</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getInstanceName()
     * @generated
     * @ordered
     */
    protected InstanceNameType instanceName;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TDeviceIdentityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getTDeviceIdentity();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public VendorNameType getVendorName() {
        return vendorName;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain
        basicSetVendorName(VendorNameType newVendorName, NotificationChain msgs) {
        VendorNameType oldVendorName = vendorName;
        vendorName = newVendorName;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDEVICE_IDENTITY__VENDOR_NAME, oldVendorName, newVendorName);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setVendorName(VendorNameType newVendorName) {
        if (newVendorName != vendorName) {
            NotificationChain msgs = null;
            if (vendorName != null)
                msgs = ((InternalEObject) vendorName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TDEVICE_IDENTITY__VENDOR_NAME, null, msgs);
            if (newVendorName != null)
                msgs = ((InternalEObject) newVendorName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TDEVICE_IDENTITY__VENDOR_NAME, null, msgs);
            msgs = basicSetVendorName(newVendorName, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDEVICE_IDENTITY__VENDOR_NAME, newVendorName, newVendorName));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TVendorID getVendorID() {
        return vendorID;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetVendorID(TVendorID newVendorID, NotificationChain msgs) {
        TVendorID oldVendorID = vendorID;
        vendorID = newVendorID;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDEVICE_IDENTITY__VENDOR_ID, oldVendorID, newVendorID);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setVendorID(TVendorID newVendorID) {
        if (newVendorID != vendorID) {
            NotificationChain msgs = null;
            if (vendorID != null)
                msgs = ((InternalEObject) vendorID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TDEVICE_IDENTITY__VENDOR_ID, null, msgs);
            if (newVendorID != null)
                msgs = ((InternalEObject) newVendorID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TDEVICE_IDENTITY__VENDOR_ID, null, msgs);
            msgs = basicSetVendorID(newVendorID, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDEVICE_IDENTITY__VENDOR_ID, newVendorID, newVendorID));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public VendorTextType getVendorText() {
        return vendorText;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain
        basicSetVendorText(VendorTextType newVendorText, NotificationChain msgs) {
        VendorTextType oldVendorText = vendorText;
        vendorText = newVendorText;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDEVICE_IDENTITY__VENDOR_TEXT, oldVendorText, newVendorText);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setVendorText(VendorTextType newVendorText) {
        if (newVendorText != vendorText) {
            NotificationChain msgs = null;
            if (vendorText != null)
                msgs = ((InternalEObject) vendorText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TDEVICE_IDENTITY__VENDOR_TEXT, null, msgs);
            if (newVendorText != null)
                msgs = ((InternalEObject) newVendorText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TDEVICE_IDENTITY__VENDOR_TEXT, null, msgs);
            msgs = basicSetVendorText(newVendorText, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDEVICE_IDENTITY__VENDOR_TEXT, newVendorText, newVendorText));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TDeviceFamily getDeviceFamily() {
        return deviceFamily;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetDeviceFamily(TDeviceFamily newDeviceFamily,
        NotificationChain msgs) {
        TDeviceFamily oldDeviceFamily = deviceFamily;
        deviceFamily = newDeviceFamily;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDEVICE_IDENTITY__DEVICE_FAMILY, oldDeviceFamily, newDeviceFamily);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setDeviceFamily(TDeviceFamily newDeviceFamily) {
        if (newDeviceFamily != deviceFamily) {
            NotificationChain msgs = null;
            if (deviceFamily != null)
                msgs = ((InternalEObject) deviceFamily).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TDEVICE_IDENTITY__DEVICE_FAMILY, null, msgs);
            if (newDeviceFamily != null)
                msgs = ((InternalEObject) newDeviceFamily).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TDEVICE_IDENTITY__DEVICE_FAMILY, null, msgs);
            msgs = basicSetDeviceFamily(newDeviceFamily, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDEVICE_IDENTITY__DEVICE_FAMILY, newDeviceFamily, newDeviceFamily));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ProductFamilyType getProductFamily() {
        return productFamily;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetProductFamily(ProductFamilyType newProductFamily,
        NotificationChain msgs) {
        ProductFamilyType oldProductFamily = productFamily;
        productFamily = newProductFamily;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDEVICE_IDENTITY__PRODUCT_FAMILY, oldProductFamily, newProductFamily);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setProductFamily(ProductFamilyType newProductFamily) {
        if (newProductFamily != productFamily) {
            NotificationChain msgs = null;
            if (productFamily != null)
                msgs = ((InternalEObject) productFamily).eInverseRemove(
                    this, EOPPOSITE_FEATURE_BASE - XDDPackage.TDEVICE_IDENTITY__PRODUCT_FAMILY,
                    null, msgs);
            if (newProductFamily != null)
                msgs = ((InternalEObject) newProductFamily).eInverseAdd(
                    this, EOPPOSITE_FEATURE_BASE - XDDPackage.TDEVICE_IDENTITY__PRODUCT_FAMILY,
                    null, msgs);
            msgs = basicSetProductFamily(newProductFamily, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDEVICE_IDENTITY__PRODUCT_FAMILY, newProductFamily, newProductFamily));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ProductNameType getProductName() {
        return productName;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetProductName(ProductNameType newProductName,
        NotificationChain msgs) {
        ProductNameType oldProductName = productName;
        productName = newProductName;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDEVICE_IDENTITY__PRODUCT_NAME, oldProductName, newProductName);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setProductName(ProductNameType newProductName) {
        if (newProductName != productName) {
            NotificationChain msgs = null;
            if (productName != null)
                msgs = ((InternalEObject) productName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TDEVICE_IDENTITY__PRODUCT_NAME, null, msgs);
            if (newProductName != null)
                msgs = ((InternalEObject) newProductName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TDEVICE_IDENTITY__PRODUCT_NAME, null, msgs);
            msgs = basicSetProductName(newProductName, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDEVICE_IDENTITY__PRODUCT_NAME, newProductName, newProductName));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TProductID getProductID() {
        return productID;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetProductID(TProductID newProductID, NotificationChain msgs) {
        TProductID oldProductID = productID;
        productID = newProductID;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDEVICE_IDENTITY__PRODUCT_ID, oldProductID, newProductID);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setProductID(TProductID newProductID) {
        if (newProductID != productID) {
            NotificationChain msgs = null;
            if (productID != null)
                msgs = ((InternalEObject) productID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TDEVICE_IDENTITY__PRODUCT_ID, null, msgs);
            if (newProductID != null)
                msgs = ((InternalEObject) newProductID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TDEVICE_IDENTITY__PRODUCT_ID, null, msgs);
            msgs = basicSetProductID(newProductID, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDEVICE_IDENTITY__PRODUCT_ID, newProductID, newProductID));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ProductTextType getProductText() {
        return productText;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetProductText(ProductTextType newProductText,
        NotificationChain msgs) {
        ProductTextType oldProductText = productText;
        productText = newProductText;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDEVICE_IDENTITY__PRODUCT_TEXT, oldProductText, newProductText);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setProductText(ProductTextType newProductText) {
        if (newProductText != productText) {
            NotificationChain msgs = null;
            if (productText != null)
                msgs = ((InternalEObject) productText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TDEVICE_IDENTITY__PRODUCT_TEXT, null, msgs);
            if (newProductText != null)
                msgs = ((InternalEObject) newProductText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TDEVICE_IDENTITY__PRODUCT_TEXT, null, msgs);
            msgs = basicSetProductText(newProductText, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDEVICE_IDENTITY__PRODUCT_TEXT, newProductText, newProductText));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<OrderNumberType> getOrderNumber() {
        if (orderNumber == null) {
            orderNumber = new EObjectContainmentEList<OrderNumberType>(OrderNumberType.class, this,
                XDDPackage.TDEVICE_IDENTITY__ORDER_NUMBER);
        }
        return orderNumber;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<TVersion> getVersion() {
        if (version == null) {
            version = new EObjectContainmentEList<TVersion>(TVersion.class, this,
                XDDPackage.TDEVICE_IDENTITY__VERSION);
        }
        return version;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public XMLGregorianCalendar getBuildDate() {
        return buildDate;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setBuildDate(XMLGregorianCalendar newBuildDate) {
        XMLGregorianCalendar oldBuildDate = buildDate;
        buildDate = newBuildDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDEVICE_IDENTITY__BUILD_DATE, oldBuildDate, buildDate));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TSpecificationRevision getSpecificationRevision() {
        return specificationRevision;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain
        basicSetSpecificationRevision(TSpecificationRevision newSpecificationRevision,
            NotificationChain msgs) {
        TSpecificationRevision oldSpecificationRevision = specificationRevision;
        specificationRevision = newSpecificationRevision;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDEVICE_IDENTITY__SPECIFICATION_REVISION, oldSpecificationRevision,
                newSpecificationRevision);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setSpecificationRevision(TSpecificationRevision newSpecificationRevision) {
        if (newSpecificationRevision != specificationRevision) {
            NotificationChain msgs = null;
            if (specificationRevision != null)
                msgs = ((InternalEObject) specificationRevision).eInverseRemove(
                    this, EOPPOSITE_FEATURE_BASE
                        - XDDPackage.TDEVICE_IDENTITY__SPECIFICATION_REVISION, null, msgs);
            if (newSpecificationRevision != null)
                msgs = ((InternalEObject) newSpecificationRevision).eInverseAdd(
                    this, EOPPOSITE_FEATURE_BASE
                        - XDDPackage.TDEVICE_IDENTITY__SPECIFICATION_REVISION, null, msgs);
            msgs = basicSetSpecificationRevision(newSpecificationRevision, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDEVICE_IDENTITY__SPECIFICATION_REVISION, newSpecificationRevision,
                newSpecificationRevision));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public InstanceNameType getInstanceName() {
        return instanceName;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetInstanceName(InstanceNameType newInstanceName,
        NotificationChain msgs) {
        InstanceNameType oldInstanceName = instanceName;
        instanceName = newInstanceName;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDEVICE_IDENTITY__INSTANCE_NAME, oldInstanceName, newInstanceName);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setInstanceName(InstanceNameType newInstanceName) {
        if (newInstanceName != instanceName) {
            NotificationChain msgs = null;
            if (instanceName != null)
                msgs = ((InternalEObject) instanceName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TDEVICE_IDENTITY__INSTANCE_NAME, null, msgs);
            if (newInstanceName != null)
                msgs = ((InternalEObject) newInstanceName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.TDEVICE_IDENTITY__INSTANCE_NAME, null, msgs);
            msgs = basicSetInstanceName(newInstanceName, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TDEVICE_IDENTITY__INSTANCE_NAME, newInstanceName, newInstanceName));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd,
        int featureID,
        NotificationChain msgs) {
        switch (featureID) {
            case XDDPackage.TDEVICE_IDENTITY__VENDOR_NAME:
                return basicSetVendorName(null, msgs);
            case XDDPackage.TDEVICE_IDENTITY__VENDOR_ID:
                return basicSetVendorID(null, msgs);
            case XDDPackage.TDEVICE_IDENTITY__VENDOR_TEXT:
                return basicSetVendorText(null, msgs);
            case XDDPackage.TDEVICE_IDENTITY__DEVICE_FAMILY:
                return basicSetDeviceFamily(null, msgs);
            case XDDPackage.TDEVICE_IDENTITY__PRODUCT_FAMILY:
                return basicSetProductFamily(null, msgs);
            case XDDPackage.TDEVICE_IDENTITY__PRODUCT_NAME:
                return basicSetProductName(null, msgs);
            case XDDPackage.TDEVICE_IDENTITY__PRODUCT_ID:
                return basicSetProductID(null, msgs);
            case XDDPackage.TDEVICE_IDENTITY__PRODUCT_TEXT:
                return basicSetProductText(null, msgs);
            case XDDPackage.TDEVICE_IDENTITY__ORDER_NUMBER:
                return ((InternalEList<?>) getOrderNumber()).basicRemove(otherEnd, msgs);
            case XDDPackage.TDEVICE_IDENTITY__VERSION:
                return ((InternalEList<?>) getVersion()).basicRemove(otherEnd, msgs);
            case XDDPackage.TDEVICE_IDENTITY__SPECIFICATION_REVISION:
                return basicSetSpecificationRevision(null, msgs);
            case XDDPackage.TDEVICE_IDENTITY__INSTANCE_NAME:
                return basicSetInstanceName(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XDDPackage.TDEVICE_IDENTITY__VENDOR_NAME:
                return getVendorName();
            case XDDPackage.TDEVICE_IDENTITY__VENDOR_ID:
                return getVendorID();
            case XDDPackage.TDEVICE_IDENTITY__VENDOR_TEXT:
                return getVendorText();
            case XDDPackage.TDEVICE_IDENTITY__DEVICE_FAMILY:
                return getDeviceFamily();
            case XDDPackage.TDEVICE_IDENTITY__PRODUCT_FAMILY:
                return getProductFamily();
            case XDDPackage.TDEVICE_IDENTITY__PRODUCT_NAME:
                return getProductName();
            case XDDPackage.TDEVICE_IDENTITY__PRODUCT_ID:
                return getProductID();
            case XDDPackage.TDEVICE_IDENTITY__PRODUCT_TEXT:
                return getProductText();
            case XDDPackage.TDEVICE_IDENTITY__ORDER_NUMBER:
                return getOrderNumber();
            case XDDPackage.TDEVICE_IDENTITY__VERSION:
                return getVersion();
            case XDDPackage.TDEVICE_IDENTITY__BUILD_DATE:
                return getBuildDate();
            case XDDPackage.TDEVICE_IDENTITY__SPECIFICATION_REVISION:
                return getSpecificationRevision();
            case XDDPackage.TDEVICE_IDENTITY__INSTANCE_NAME:
                return getInstanceName();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case XDDPackage.TDEVICE_IDENTITY__VENDOR_NAME:
                setVendorName((VendorNameType) newValue);
                return;
            case XDDPackage.TDEVICE_IDENTITY__VENDOR_ID:
                setVendorID((TVendorID) newValue);
                return;
            case XDDPackage.TDEVICE_IDENTITY__VENDOR_TEXT:
                setVendorText((VendorTextType) newValue);
                return;
            case XDDPackage.TDEVICE_IDENTITY__DEVICE_FAMILY:
                setDeviceFamily((TDeviceFamily) newValue);
                return;
            case XDDPackage.TDEVICE_IDENTITY__PRODUCT_FAMILY:
                setProductFamily((ProductFamilyType) newValue);
                return;
            case XDDPackage.TDEVICE_IDENTITY__PRODUCT_NAME:
                setProductName((ProductNameType) newValue);
                return;
            case XDDPackage.TDEVICE_IDENTITY__PRODUCT_ID:
                setProductID((TProductID) newValue);
                return;
            case XDDPackage.TDEVICE_IDENTITY__PRODUCT_TEXT:
                setProductText((ProductTextType) newValue);
                return;
            case XDDPackage.TDEVICE_IDENTITY__ORDER_NUMBER:
                getOrderNumber().clear();
                getOrderNumber().addAll((Collection<? extends OrderNumberType>) newValue);
                return;
            case XDDPackage.TDEVICE_IDENTITY__VERSION:
                getVersion().clear();
                getVersion().addAll((Collection<? extends TVersion>) newValue);
                return;
            case XDDPackage.TDEVICE_IDENTITY__BUILD_DATE:
                setBuildDate((XMLGregorianCalendar) newValue);
                return;
            case XDDPackage.TDEVICE_IDENTITY__SPECIFICATION_REVISION:
                setSpecificationRevision((TSpecificationRevision) newValue);
                return;
            case XDDPackage.TDEVICE_IDENTITY__INSTANCE_NAME:
                setInstanceName((InstanceNameType) newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case XDDPackage.TDEVICE_IDENTITY__VENDOR_NAME:
                setVendorName((VendorNameType) null);
                return;
            case XDDPackage.TDEVICE_IDENTITY__VENDOR_ID:
                setVendorID((TVendorID) null);
                return;
            case XDDPackage.TDEVICE_IDENTITY__VENDOR_TEXT:
                setVendorText((VendorTextType) null);
                return;
            case XDDPackage.TDEVICE_IDENTITY__DEVICE_FAMILY:
                setDeviceFamily((TDeviceFamily) null);
                return;
            case XDDPackage.TDEVICE_IDENTITY__PRODUCT_FAMILY:
                setProductFamily((ProductFamilyType) null);
                return;
            case XDDPackage.TDEVICE_IDENTITY__PRODUCT_NAME:
                setProductName((ProductNameType) null);
                return;
            case XDDPackage.TDEVICE_IDENTITY__PRODUCT_ID:
                setProductID((TProductID) null);
                return;
            case XDDPackage.TDEVICE_IDENTITY__PRODUCT_TEXT:
                setProductText((ProductTextType) null);
                return;
            case XDDPackage.TDEVICE_IDENTITY__ORDER_NUMBER:
                getOrderNumber().clear();
                return;
            case XDDPackage.TDEVICE_IDENTITY__VERSION:
                getVersion().clear();
                return;
            case XDDPackage.TDEVICE_IDENTITY__BUILD_DATE:
                setBuildDate(BUILD_DATE_EDEFAULT);
                return;
            case XDDPackage.TDEVICE_IDENTITY__SPECIFICATION_REVISION:
                setSpecificationRevision((TSpecificationRevision) null);
                return;
            case XDDPackage.TDEVICE_IDENTITY__INSTANCE_NAME:
                setInstanceName((InstanceNameType) null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case XDDPackage.TDEVICE_IDENTITY__VENDOR_NAME:
                return vendorName != null;
            case XDDPackage.TDEVICE_IDENTITY__VENDOR_ID:
                return vendorID != null;
            case XDDPackage.TDEVICE_IDENTITY__VENDOR_TEXT:
                return vendorText != null;
            case XDDPackage.TDEVICE_IDENTITY__DEVICE_FAMILY:
                return deviceFamily != null;
            case XDDPackage.TDEVICE_IDENTITY__PRODUCT_FAMILY:
                return productFamily != null;
            case XDDPackage.TDEVICE_IDENTITY__PRODUCT_NAME:
                return productName != null;
            case XDDPackage.TDEVICE_IDENTITY__PRODUCT_ID:
                return productID != null;
            case XDDPackage.TDEVICE_IDENTITY__PRODUCT_TEXT:
                return productText != null;
            case XDDPackage.TDEVICE_IDENTITY__ORDER_NUMBER:
                return orderNumber != null && !orderNumber.isEmpty();
            case XDDPackage.TDEVICE_IDENTITY__VERSION:
                return version != null && !version.isEmpty();
            case XDDPackage.TDEVICE_IDENTITY__BUILD_DATE:
                return BUILD_DATE_EDEFAULT == null ? buildDate != null : !BUILD_DATE_EDEFAULT
                    .equals(buildDate);
            case XDDPackage.TDEVICE_IDENTITY__SPECIFICATION_REVISION:
                return specificationRevision != null;
            case XDDPackage.TDEVICE_IDENTITY__INSTANCE_NAME:
                return instanceName != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (buildDate: ");
        result.append(buildDate);
        result.append(')');
        return result.toString();
    }

} //TDeviceIdentityImpl
