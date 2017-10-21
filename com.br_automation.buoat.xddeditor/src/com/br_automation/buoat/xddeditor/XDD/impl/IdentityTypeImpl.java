/**
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

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

import com.br_automation.buoat.xddeditor.XDD.IdentityType;
import com.br_automation.buoat.xddeditor.XDD.TDeviceFamily;
import com.br_automation.buoat.xddeditor.XDD.TProductID;
import com.br_automation.buoat.xddeditor.XDD.TSpecificationRevision;
import com.br_automation.buoat.xddeditor.XDD.TVendorID;
import com.br_automation.buoat.xddeditor.XDD.TVersion;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.IdentityTypeImpl#getVendorID <em>Vendor ID</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.IdentityTypeImpl#getDeviceFamily <em>Device Family</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.IdentityTypeImpl#getProductID <em>Product ID</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.IdentityTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.IdentityTypeImpl#getBuildDate <em>Build Date</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.IdentityTypeImpl#getSpecificationRevision <em>Specification Revision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentityTypeImpl extends EObjectImpl implements IdentityType {
	/**
	 * The cached value of the '{@link #getVendorID() <em>Vendor ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorID()
	 * @generated
	 * @ordered
	 */
	protected TVendorID vendorID;

	/**
	 * The cached value of the '{@link #getDeviceFamily() <em>Device Family</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceFamily()
	 * @generated
	 * @ordered
	 */
	protected TDeviceFamily deviceFamily;

	/**
	 * The cached value of the '{@link #getProductID() <em>Product ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductID()
	 * @generated
	 * @ordered
	 */
	protected TProductID productID;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected EList<TVersion> version;

	/**
	 * The default value of the '{@link #getBuildDate() <em>Build Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar BUILD_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuildDate() <em>Build Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar buildDate = BUILD_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecificationRevision() <em>Specification Revision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationRevision()
	 * @generated
	 * @ordered
	 */
	protected TSpecificationRevision specificationRevision;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XDDPackage.eINSTANCE.getIdentityType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVendorID getVendorID() {
		return vendorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVendorID(TVendorID newVendorID, NotificationChain msgs) {
		TVendorID oldVendorID = vendorID;
		vendorID = newVendorID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.IDENTITY_TYPE__VENDOR_ID, oldVendorID, newVendorID);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendorID(TVendorID newVendorID) {
		if (newVendorID != vendorID) {
			NotificationChain msgs = null;
			if (vendorID != null)
				msgs = ((InternalEObject)vendorID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.IDENTITY_TYPE__VENDOR_ID, null, msgs);
			if (newVendorID != null)
				msgs = ((InternalEObject)newVendorID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.IDENTITY_TYPE__VENDOR_ID, null, msgs);
			msgs = basicSetVendorID(newVendorID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.IDENTITY_TYPE__VENDOR_ID, newVendorID, newVendorID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDeviceFamily getDeviceFamily() {
		return deviceFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceFamily(TDeviceFamily newDeviceFamily, NotificationChain msgs) {
		TDeviceFamily oldDeviceFamily = deviceFamily;
		deviceFamily = newDeviceFamily;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.IDENTITY_TYPE__DEVICE_FAMILY, oldDeviceFamily, newDeviceFamily);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceFamily(TDeviceFamily newDeviceFamily) {
		if (newDeviceFamily != deviceFamily) {
			NotificationChain msgs = null;
			if (deviceFamily != null)
				msgs = ((InternalEObject)deviceFamily).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.IDENTITY_TYPE__DEVICE_FAMILY, null, msgs);
			if (newDeviceFamily != null)
				msgs = ((InternalEObject)newDeviceFamily).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.IDENTITY_TYPE__DEVICE_FAMILY, null, msgs);
			msgs = basicSetDeviceFamily(newDeviceFamily, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.IDENTITY_TYPE__DEVICE_FAMILY, newDeviceFamily, newDeviceFamily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TProductID getProductID() {
		return productID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductID(TProductID newProductID, NotificationChain msgs) {
		TProductID oldProductID = productID;
		productID = newProductID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.IDENTITY_TYPE__PRODUCT_ID, oldProductID, newProductID);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductID(TProductID newProductID) {
		if (newProductID != productID) {
			NotificationChain msgs = null;
			if (productID != null)
				msgs = ((InternalEObject)productID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.IDENTITY_TYPE__PRODUCT_ID, null, msgs);
			if (newProductID != null)
				msgs = ((InternalEObject)newProductID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.IDENTITY_TYPE__PRODUCT_ID, null, msgs);
			msgs = basicSetProductID(newProductID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.IDENTITY_TYPE__PRODUCT_ID, newProductID, newProductID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TVersion> getVersion() {
		if (version == null) {
			version = new EObjectContainmentEList<TVersion>(TVersion.class, this, XDDPackage.IDENTITY_TYPE__VERSION);
		}
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getBuildDate() {
		return buildDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildDate(XMLGregorianCalendar newBuildDate) {
		XMLGregorianCalendar oldBuildDate = buildDate;
		buildDate = newBuildDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.IDENTITY_TYPE__BUILD_DATE, oldBuildDate, buildDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSpecificationRevision getSpecificationRevision() {
		return specificationRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecificationRevision(TSpecificationRevision newSpecificationRevision, NotificationChain msgs) {
		TSpecificationRevision oldSpecificationRevision = specificationRevision;
		specificationRevision = newSpecificationRevision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.IDENTITY_TYPE__SPECIFICATION_REVISION, oldSpecificationRevision, newSpecificationRevision);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificationRevision(TSpecificationRevision newSpecificationRevision) {
		if (newSpecificationRevision != specificationRevision) {
			NotificationChain msgs = null;
			if (specificationRevision != null)
				msgs = ((InternalEObject)specificationRevision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.IDENTITY_TYPE__SPECIFICATION_REVISION, null, msgs);
			if (newSpecificationRevision != null)
				msgs = ((InternalEObject)newSpecificationRevision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.IDENTITY_TYPE__SPECIFICATION_REVISION, null, msgs);
			msgs = basicSetSpecificationRevision(newSpecificationRevision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.IDENTITY_TYPE__SPECIFICATION_REVISION, newSpecificationRevision, newSpecificationRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XDDPackage.IDENTITY_TYPE__VENDOR_ID:
				return basicSetVendorID(null, msgs);
			case XDDPackage.IDENTITY_TYPE__DEVICE_FAMILY:
				return basicSetDeviceFamily(null, msgs);
			case XDDPackage.IDENTITY_TYPE__PRODUCT_ID:
				return basicSetProductID(null, msgs);
			case XDDPackage.IDENTITY_TYPE__VERSION:
				return ((InternalEList<?>)getVersion()).basicRemove(otherEnd, msgs);
			case XDDPackage.IDENTITY_TYPE__SPECIFICATION_REVISION:
				return basicSetSpecificationRevision(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XDDPackage.IDENTITY_TYPE__VENDOR_ID:
				return getVendorID();
			case XDDPackage.IDENTITY_TYPE__DEVICE_FAMILY:
				return getDeviceFamily();
			case XDDPackage.IDENTITY_TYPE__PRODUCT_ID:
				return getProductID();
			case XDDPackage.IDENTITY_TYPE__VERSION:
				return getVersion();
			case XDDPackage.IDENTITY_TYPE__BUILD_DATE:
				return getBuildDate();
			case XDDPackage.IDENTITY_TYPE__SPECIFICATION_REVISION:
				return getSpecificationRevision();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XDDPackage.IDENTITY_TYPE__VENDOR_ID:
				setVendorID((TVendorID)newValue);
				return;
			case XDDPackage.IDENTITY_TYPE__DEVICE_FAMILY:
				setDeviceFamily((TDeviceFamily)newValue);
				return;
			case XDDPackage.IDENTITY_TYPE__PRODUCT_ID:
				setProductID((TProductID)newValue);
				return;
			case XDDPackage.IDENTITY_TYPE__VERSION:
				getVersion().clear();
				getVersion().addAll((Collection<? extends TVersion>)newValue);
				return;
			case XDDPackage.IDENTITY_TYPE__BUILD_DATE:
				setBuildDate((XMLGregorianCalendar)newValue);
				return;
			case XDDPackage.IDENTITY_TYPE__SPECIFICATION_REVISION:
				setSpecificationRevision((TSpecificationRevision)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XDDPackage.IDENTITY_TYPE__VENDOR_ID:
				setVendorID((TVendorID)null);
				return;
			case XDDPackage.IDENTITY_TYPE__DEVICE_FAMILY:
				setDeviceFamily((TDeviceFamily)null);
				return;
			case XDDPackage.IDENTITY_TYPE__PRODUCT_ID:
				setProductID((TProductID)null);
				return;
			case XDDPackage.IDENTITY_TYPE__VERSION:
				getVersion().clear();
				return;
			case XDDPackage.IDENTITY_TYPE__BUILD_DATE:
				setBuildDate(BUILD_DATE_EDEFAULT);
				return;
			case XDDPackage.IDENTITY_TYPE__SPECIFICATION_REVISION:
				setSpecificationRevision((TSpecificationRevision)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XDDPackage.IDENTITY_TYPE__VENDOR_ID:
				return vendorID != null;
			case XDDPackage.IDENTITY_TYPE__DEVICE_FAMILY:
				return deviceFamily != null;
			case XDDPackage.IDENTITY_TYPE__PRODUCT_ID:
				return productID != null;
			case XDDPackage.IDENTITY_TYPE__VERSION:
				return version != null && !version.isEmpty();
			case XDDPackage.IDENTITY_TYPE__BUILD_DATE:
				return BUILD_DATE_EDEFAULT == null ? buildDate != null : !BUILD_DATE_EDEFAULT.equals(buildDate);
			case XDDPackage.IDENTITY_TYPE__SPECIFICATION_REVISION:
				return specificationRevision != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (buildDate: ");
		result.append(buildDate);
		result.append(')');
		return result.toString();
	}

} //IdentityTypeImpl
