/**
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import com.br_automation.buoat.xddeditor.XDD.ClassificationType;
import com.br_automation.buoat.xddeditor.XDD.ConnectorType;
import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.FirmwareType;
import com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileContainerType;
import com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileType;
import com.br_automation.buoat.xddeditor.XDD.TextResourceType;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.DocumentRootImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.DocumentRootImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.DocumentRootImpl#getFirmware <em>Firmware</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.DocumentRootImpl#getISO15745Profile <em>ISO15745 Profile</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.DocumentRootImpl#getISO15745ProfileContainer <em>ISO15745 Profile Container</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.DocumentRootImpl#getTextResource <em>Text Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getClassification() <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected static final ClassificationType CLASSIFICATION_EDEFAULT = ClassificationType.CONTROLLER;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XDDPackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XDDPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, XDDPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, XDDPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationType getClassification() {
		return (ClassificationType)getMixed().get(XDDPackage.eINSTANCE.getDocumentRoot_Classification(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassification(ClassificationType newClassification) {
		((FeatureMap.Internal)getMixed()).set(XDDPackage.eINSTANCE.getDocumentRoot_Classification(), newClassification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorType getConnector() {
		return (ConnectorType)getMixed().get(XDDPackage.eINSTANCE.getDocumentRoot_Connector(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnector(ConnectorType newConnector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XDDPackage.eINSTANCE.getDocumentRoot_Connector(), newConnector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(ConnectorType newConnector) {
		((FeatureMap.Internal)getMixed()).set(XDDPackage.eINSTANCE.getDocumentRoot_Connector(), newConnector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirmwareType getFirmware() {
		return (FirmwareType)getMixed().get(XDDPackage.eINSTANCE.getDocumentRoot_Firmware(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirmware(FirmwareType newFirmware, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XDDPackage.eINSTANCE.getDocumentRoot_Firmware(), newFirmware, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirmware(FirmwareType newFirmware) {
		((FeatureMap.Internal)getMixed()).set(XDDPackage.eINSTANCE.getDocumentRoot_Firmware(), newFirmware);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISO15745ProfileType getISO15745Profile() {
		return (ISO15745ProfileType)getMixed().get(XDDPackage.eINSTANCE.getDocumentRoot_ISO15745Profile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetISO15745Profile(ISO15745ProfileType newISO15745Profile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XDDPackage.eINSTANCE.getDocumentRoot_ISO15745Profile(), newISO15745Profile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setISO15745Profile(ISO15745ProfileType newISO15745Profile) {
		((FeatureMap.Internal)getMixed()).set(XDDPackage.eINSTANCE.getDocumentRoot_ISO15745Profile(), newISO15745Profile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISO15745ProfileContainerType getISO15745ProfileContainer() {
		return (ISO15745ProfileContainerType)getMixed().get(XDDPackage.eINSTANCE.getDocumentRoot_ISO15745ProfileContainer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetISO15745ProfileContainer(ISO15745ProfileContainerType newISO15745ProfileContainer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XDDPackage.eINSTANCE.getDocumentRoot_ISO15745ProfileContainer(), newISO15745ProfileContainer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setISO15745ProfileContainer(ISO15745ProfileContainerType newISO15745ProfileContainer) {
		((FeatureMap.Internal)getMixed()).set(XDDPackage.eINSTANCE.getDocumentRoot_ISO15745ProfileContainer(), newISO15745ProfileContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextResourceType getTextResource() {
		return (TextResourceType)getMixed().get(XDDPackage.eINSTANCE.getDocumentRoot_TextResource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextResource(TextResourceType newTextResource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XDDPackage.eINSTANCE.getDocumentRoot_TextResource(), newTextResource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextResource(TextResourceType newTextResource) {
		((FeatureMap.Internal)getMixed()).set(XDDPackage.eINSTANCE.getDocumentRoot_TextResource(), newTextResource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XDDPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XDDPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case XDDPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case XDDPackage.DOCUMENT_ROOT__CONNECTOR:
				return basicSetConnector(null, msgs);
			case XDDPackage.DOCUMENT_ROOT__FIRMWARE:
				return basicSetFirmware(null, msgs);
			case XDDPackage.DOCUMENT_ROOT__ISO15745_PROFILE:
				return basicSetISO15745Profile(null, msgs);
			case XDDPackage.DOCUMENT_ROOT__ISO15745_PROFILE_CONTAINER:
				return basicSetISO15745ProfileContainer(null, msgs);
			case XDDPackage.DOCUMENT_ROOT__TEXT_RESOURCE:
				return basicSetTextResource(null, msgs);
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
			case XDDPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XDDPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case XDDPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case XDDPackage.DOCUMENT_ROOT__CLASSIFICATION:
				return getClassification();
			case XDDPackage.DOCUMENT_ROOT__CONNECTOR:
				return getConnector();
			case XDDPackage.DOCUMENT_ROOT__FIRMWARE:
				return getFirmware();
			case XDDPackage.DOCUMENT_ROOT__ISO15745_PROFILE:
				return getISO15745Profile();
			case XDDPackage.DOCUMENT_ROOT__ISO15745_PROFILE_CONTAINER:
				return getISO15745ProfileContainer();
			case XDDPackage.DOCUMENT_ROOT__TEXT_RESOURCE:
				return getTextResource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XDDPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XDDPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case XDDPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case XDDPackage.DOCUMENT_ROOT__CLASSIFICATION:
				setClassification((ClassificationType)newValue);
				return;
			case XDDPackage.DOCUMENT_ROOT__CONNECTOR:
				setConnector((ConnectorType)newValue);
				return;
			case XDDPackage.DOCUMENT_ROOT__FIRMWARE:
				setFirmware((FirmwareType)newValue);
				return;
			case XDDPackage.DOCUMENT_ROOT__ISO15745_PROFILE:
				setISO15745Profile((ISO15745ProfileType)newValue);
				return;
			case XDDPackage.DOCUMENT_ROOT__ISO15745_PROFILE_CONTAINER:
				setISO15745ProfileContainer((ISO15745ProfileContainerType)newValue);
				return;
			case XDDPackage.DOCUMENT_ROOT__TEXT_RESOURCE:
				setTextResource((TextResourceType)newValue);
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
			case XDDPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case XDDPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case XDDPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case XDDPackage.DOCUMENT_ROOT__CLASSIFICATION:
				setClassification(CLASSIFICATION_EDEFAULT);
				return;
			case XDDPackage.DOCUMENT_ROOT__CONNECTOR:
				setConnector((ConnectorType)null);
				return;
			case XDDPackage.DOCUMENT_ROOT__FIRMWARE:
				setFirmware((FirmwareType)null);
				return;
			case XDDPackage.DOCUMENT_ROOT__ISO15745_PROFILE:
				setISO15745Profile((ISO15745ProfileType)null);
				return;
			case XDDPackage.DOCUMENT_ROOT__ISO15745_PROFILE_CONTAINER:
				setISO15745ProfileContainer((ISO15745ProfileContainerType)null);
				return;
			case XDDPackage.DOCUMENT_ROOT__TEXT_RESOURCE:
				setTextResource((TextResourceType)null);
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
			case XDDPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XDDPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case XDDPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case XDDPackage.DOCUMENT_ROOT__CLASSIFICATION:
				return getClassification() != CLASSIFICATION_EDEFAULT;
			case XDDPackage.DOCUMENT_ROOT__CONNECTOR:
				return getConnector() != null;
			case XDDPackage.DOCUMENT_ROOT__FIRMWARE:
				return getFirmware() != null;
			case XDDPackage.DOCUMENT_ROOT__ISO15745_PROFILE:
				return getISO15745Profile() != null;
			case XDDPackage.DOCUMENT_ROOT__ISO15745_PROFILE_CONTAINER:
				return getISO15745ProfileContainer() != null;
			case XDDPackage.DOCUMENT_ROOT__TEXT_RESOURCE:
				return getTextResource() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
