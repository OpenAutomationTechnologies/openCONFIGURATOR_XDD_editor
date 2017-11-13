/**
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import java.math.BigInteger;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import com.br_automation.buoat.xddeditor.XDD.DescriptionRefType;
import com.br_automation.buoat.xddeditor.XDD.DescriptionType;
import com.br_automation.buoat.xddeditor.XDD.FirmwareType;
import com.br_automation.buoat.xddeditor.XDD.LabelRefType;
import com.br_automation.buoat.xddeditor.XDD.LabelType;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Firmware Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.FirmwareTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.FirmwareTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.FirmwareTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.FirmwareTypeImpl#getLabelRef <em>Label Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.FirmwareTypeImpl#getDescriptionRef <em>Description Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.FirmwareTypeImpl#getBuildDate <em>Build Date</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.FirmwareTypeImpl#getDeviceRevisionNumber <em>Device Revision Number</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.FirmwareTypeImpl#getURI <em>URI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FirmwareTypeImpl extends EObjectImpl implements FirmwareType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

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
	 * The default value of the '{@link #getDeviceRevisionNumber() <em>Device Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DEVICE_REVISION_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceRevisionNumber() <em>Device Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected BigInteger deviceRevisionNumber = DEVICE_REVISION_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected String uRI = URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FirmwareTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XDDPackage.eINSTANCE.getFirmwareType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, XDDPackage.FIRMWARE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LabelType> getLabel() {
		return getGroup().list(XDDPackage.eINSTANCE.getFirmwareType_Label());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		return getGroup().list(XDDPackage.eINSTANCE.getFirmwareType_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LabelRefType> getLabelRef() {
		return getGroup().list(XDDPackage.eINSTANCE.getFirmwareType_LabelRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionRefType> getDescriptionRef() {
		return getGroup().list(XDDPackage.eINSTANCE.getFirmwareType_DescriptionRef());
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
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.FIRMWARE_TYPE__BUILD_DATE, oldBuildDate, buildDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDeviceRevisionNumber() {
		return deviceRevisionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceRevisionNumber(BigInteger newDeviceRevisionNumber) {
		BigInteger oldDeviceRevisionNumber = deviceRevisionNumber;
		deviceRevisionNumber = newDeviceRevisionNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.FIRMWARE_TYPE__DEVICE_REVISION_NUMBER, oldDeviceRevisionNumber, deviceRevisionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getURI() {
		return uRI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURI(String newURI) {
		String oldURI = uRI;
		uRI = newURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.FIRMWARE_TYPE__URI, oldURI, uRI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XDDPackage.FIRMWARE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XDDPackage.FIRMWARE_TYPE__LABEL:
				return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
			case XDDPackage.FIRMWARE_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case XDDPackage.FIRMWARE_TYPE__LABEL_REF:
				return ((InternalEList<?>)getLabelRef()).basicRemove(otherEnd, msgs);
			case XDDPackage.FIRMWARE_TYPE__DESCRIPTION_REF:
				return ((InternalEList<?>)getDescriptionRef()).basicRemove(otherEnd, msgs);
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
			case XDDPackage.FIRMWARE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XDDPackage.FIRMWARE_TYPE__LABEL:
				return getLabel();
			case XDDPackage.FIRMWARE_TYPE__DESCRIPTION:
				return getDescription();
			case XDDPackage.FIRMWARE_TYPE__LABEL_REF:
				return getLabelRef();
			case XDDPackage.FIRMWARE_TYPE__DESCRIPTION_REF:
				return getDescriptionRef();
			case XDDPackage.FIRMWARE_TYPE__BUILD_DATE:
				return getBuildDate();
			case XDDPackage.FIRMWARE_TYPE__DEVICE_REVISION_NUMBER:
				return getDeviceRevisionNumber();
			case XDDPackage.FIRMWARE_TYPE__URI:
				return getURI();
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
			case XDDPackage.FIRMWARE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XDDPackage.FIRMWARE_TYPE__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection<? extends LabelType>)newValue);
				return;
			case XDDPackage.FIRMWARE_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case XDDPackage.FIRMWARE_TYPE__LABEL_REF:
				getLabelRef().clear();
				getLabelRef().addAll((Collection<? extends LabelRefType>)newValue);
				return;
			case XDDPackage.FIRMWARE_TYPE__DESCRIPTION_REF:
				getDescriptionRef().clear();
				getDescriptionRef().addAll((Collection<? extends DescriptionRefType>)newValue);
				return;
			case XDDPackage.FIRMWARE_TYPE__BUILD_DATE:
				setBuildDate((XMLGregorianCalendar)newValue);
				return;
			case XDDPackage.FIRMWARE_TYPE__DEVICE_REVISION_NUMBER:
				setDeviceRevisionNumber((BigInteger)newValue);
				return;
			case XDDPackage.FIRMWARE_TYPE__URI:
				setURI((String)newValue);
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
			case XDDPackage.FIRMWARE_TYPE__GROUP:
				getGroup().clear();
				return;
			case XDDPackage.FIRMWARE_TYPE__LABEL:
				getLabel().clear();
				return;
			case XDDPackage.FIRMWARE_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case XDDPackage.FIRMWARE_TYPE__LABEL_REF:
				getLabelRef().clear();
				return;
			case XDDPackage.FIRMWARE_TYPE__DESCRIPTION_REF:
				getDescriptionRef().clear();
				return;
			case XDDPackage.FIRMWARE_TYPE__BUILD_DATE:
				setBuildDate(BUILD_DATE_EDEFAULT);
				return;
			case XDDPackage.FIRMWARE_TYPE__DEVICE_REVISION_NUMBER:
				setDeviceRevisionNumber(DEVICE_REVISION_NUMBER_EDEFAULT);
				return;
			case XDDPackage.FIRMWARE_TYPE__URI:
				setURI(URI_EDEFAULT);
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
			case XDDPackage.FIRMWARE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case XDDPackage.FIRMWARE_TYPE__LABEL:
				return !getLabel().isEmpty();
			case XDDPackage.FIRMWARE_TYPE__DESCRIPTION:
				return !getDescription().isEmpty();
			case XDDPackage.FIRMWARE_TYPE__LABEL_REF:
				return !getLabelRef().isEmpty();
			case XDDPackage.FIRMWARE_TYPE__DESCRIPTION_REF:
				return !getDescriptionRef().isEmpty();
			case XDDPackage.FIRMWARE_TYPE__BUILD_DATE:
				return BUILD_DATE_EDEFAULT == null ? buildDate != null : !BUILD_DATE_EDEFAULT.equals(buildDate);
			case XDDPackage.FIRMWARE_TYPE__DEVICE_REVISION_NUMBER:
				return DEVICE_REVISION_NUMBER_EDEFAULT == null ? deviceRevisionNumber != null : !DEVICE_REVISION_NUMBER_EDEFAULT.equals(deviceRevisionNumber);
			case XDDPackage.FIRMWARE_TYPE__URI:
				return URI_EDEFAULT == null ? uRI != null : !URI_EDEFAULT.equals(uRI);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", buildDate: ");
		result.append(buildDate);
		result.append(", deviceRevisionNumber: ");
		result.append(deviceRevisionNumber);
		result.append(", uRI: ");
		result.append(uRI);
		result.append(')');
		return result.toString();
	}

} //FirmwareTypeImpl
