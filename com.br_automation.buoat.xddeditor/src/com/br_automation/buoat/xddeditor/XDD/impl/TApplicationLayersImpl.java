/**
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import com.br_automation.buoat.xddeditor.XDD.DataTypeListType;
import com.br_automation.buoat.xddeditor.XDD.DynamicChannelsType;
import com.br_automation.buoat.xddeditor.XDD.IdentityType;
import com.br_automation.buoat.xddeditor.XDD.ObjectListType;
import com.br_automation.buoat.xddeditor.XDD.TApplicationLayers;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TApplication Layers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TApplicationLayersImpl#getIdentity <em>Identity</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TApplicationLayersImpl#getDataTypeList <em>Data Type List</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TApplicationLayersImpl#getObjectList <em>Object List</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TApplicationLayersImpl#getDynamicChannels <em>Dynamic Channels</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TApplicationLayersImpl#getCommunicationEntityType <em>Communication Entity Type</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TApplicationLayersImpl#getConformanceClass <em>Conformance Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TApplicationLayersImpl extends EObjectImpl implements TApplicationLayers {
	/**
	 * The cached value of the '{@link #getIdentity() <em>Identity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentity()
	 * @generated
	 * @ordered
	 */
	protected IdentityType identity;

	/**
	 * The cached value of the '{@link #getDataTypeList() <em>Data Type List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypeList()
	 * @generated
	 * @ordered
	 */
	protected DataTypeListType dataTypeList;

	/**
	 * The cached value of the '{@link #getObjectList() <em>Object List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectList()
	 * @generated
	 * @ordered
	 */
	protected ObjectListType objectList;

	/**
	 * The cached value of the '{@link #getDynamicChannels() <em>Dynamic Channels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicChannels()
	 * @generated
	 * @ordered
	 */
	protected DynamicChannelsType dynamicChannels;

	/**
	 * The default value of the '{@link #getCommunicationEntityType() <em>Communication Entity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationEntityType()
	 * @generated
	 * @ordered
	 */
	@SuppressWarnings("unchecked")
	protected static final List<String> COMMUNICATION_ENTITY_TYPE_EDEFAULT = (List)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getNMTOKENS(), "slave");

	/**
	 * The cached value of the '{@link #getCommunicationEntityType() <em>Communication Entity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationEntityType()
	 * @generated
	 * @ordered
	 */
	protected List<String> communicationEntityType = COMMUNICATION_ENTITY_TYPE_EDEFAULT;

	/**
	 * This is true if the Communication Entity Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean communicationEntityTypeESet;

	/**
	 * The default value of the '{@link #getConformanceClass() <em>Conformance Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformanceClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFORMANCE_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConformanceClass() <em>Conformance Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformanceClass()
	 * @generated
	 * @ordered
	 */
	protected String conformanceClass = CONFORMANCE_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TApplicationLayersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XDDPackage.eINSTANCE.getTApplicationLayers();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityType getIdentity() {
		return identity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentity(IdentityType newIdentity, NotificationChain msgs) {
		IdentityType oldIdentity = identity;
		identity = newIdentity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.TAPPLICATION_LAYERS__IDENTITY, oldIdentity, newIdentity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentity(IdentityType newIdentity) {
		if (newIdentity != identity) {
			NotificationChain msgs = null;
			if (identity != null)
				msgs = ((InternalEObject)identity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.TAPPLICATION_LAYERS__IDENTITY, null, msgs);
			if (newIdentity != null)
				msgs = ((InternalEObject)newIdentity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.TAPPLICATION_LAYERS__IDENTITY, null, msgs);
			msgs = basicSetIdentity(newIdentity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TAPPLICATION_LAYERS__IDENTITY, newIdentity, newIdentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeListType getDataTypeList() {
		return dataTypeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataTypeList(DataTypeListType newDataTypeList, NotificationChain msgs) {
		DataTypeListType oldDataTypeList = dataTypeList;
		dataTypeList = newDataTypeList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.TAPPLICATION_LAYERS__DATA_TYPE_LIST, oldDataTypeList, newDataTypeList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataTypeList(DataTypeListType newDataTypeList) {
		if (newDataTypeList != dataTypeList) {
			NotificationChain msgs = null;
			if (dataTypeList != null)
				msgs = ((InternalEObject)dataTypeList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.TAPPLICATION_LAYERS__DATA_TYPE_LIST, null, msgs);
			if (newDataTypeList != null)
				msgs = ((InternalEObject)newDataTypeList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.TAPPLICATION_LAYERS__DATA_TYPE_LIST, null, msgs);
			msgs = basicSetDataTypeList(newDataTypeList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TAPPLICATION_LAYERS__DATA_TYPE_LIST, newDataTypeList, newDataTypeList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectListType getObjectList() {
		return objectList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectList(ObjectListType newObjectList, NotificationChain msgs) {
		ObjectListType oldObjectList = objectList;
		objectList = newObjectList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.TAPPLICATION_LAYERS__OBJECT_LIST, oldObjectList, newObjectList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectList(ObjectListType newObjectList) {
		if (newObjectList != objectList) {
			NotificationChain msgs = null;
			if (objectList != null)
				msgs = ((InternalEObject)objectList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.TAPPLICATION_LAYERS__OBJECT_LIST, null, msgs);
			if (newObjectList != null)
				msgs = ((InternalEObject)newObjectList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.TAPPLICATION_LAYERS__OBJECT_LIST, null, msgs);
			msgs = basicSetObjectList(newObjectList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TAPPLICATION_LAYERS__OBJECT_LIST, newObjectList, newObjectList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicChannelsType getDynamicChannels() {
		return dynamicChannels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDynamicChannels(DynamicChannelsType newDynamicChannels, NotificationChain msgs) {
		DynamicChannelsType oldDynamicChannels = dynamicChannels;
		dynamicChannels = newDynamicChannels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.TAPPLICATION_LAYERS__DYNAMIC_CHANNELS, oldDynamicChannels, newDynamicChannels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicChannels(DynamicChannelsType newDynamicChannels) {
		if (newDynamicChannels != dynamicChannels) {
			NotificationChain msgs = null;
			if (dynamicChannels != null)
				msgs = ((InternalEObject)dynamicChannels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.TAPPLICATION_LAYERS__DYNAMIC_CHANNELS, null, msgs);
			if (newDynamicChannels != null)
				msgs = ((InternalEObject)newDynamicChannels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.TAPPLICATION_LAYERS__DYNAMIC_CHANNELS, null, msgs);
			msgs = basicSetDynamicChannels(newDynamicChannels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TAPPLICATION_LAYERS__DYNAMIC_CHANNELS, newDynamicChannels, newDynamicChannels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getCommunicationEntityType() {
		return communicationEntityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationEntityType(List<String> newCommunicationEntityType) {
		List<String> oldCommunicationEntityType = communicationEntityType;
		communicationEntityType = newCommunicationEntityType;
		boolean oldCommunicationEntityTypeESet = communicationEntityTypeESet;
		communicationEntityTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TAPPLICATION_LAYERS__COMMUNICATION_ENTITY_TYPE, oldCommunicationEntityType, communicationEntityType, !oldCommunicationEntityTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCommunicationEntityType() {
		List<String> oldCommunicationEntityType = communicationEntityType;
		boolean oldCommunicationEntityTypeESet = communicationEntityTypeESet;
		communicationEntityType = COMMUNICATION_ENTITY_TYPE_EDEFAULT;
		communicationEntityTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TAPPLICATION_LAYERS__COMMUNICATION_ENTITY_TYPE, oldCommunicationEntityType, COMMUNICATION_ENTITY_TYPE_EDEFAULT, oldCommunicationEntityTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCommunicationEntityType() {
		return communicationEntityTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConformanceClass() {
		return conformanceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConformanceClass(String newConformanceClass) {
		String oldConformanceClass = conformanceClass;
		conformanceClass = newConformanceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TAPPLICATION_LAYERS__CONFORMANCE_CLASS, oldConformanceClass, conformanceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XDDPackage.TAPPLICATION_LAYERS__IDENTITY:
				return basicSetIdentity(null, msgs);
			case XDDPackage.TAPPLICATION_LAYERS__DATA_TYPE_LIST:
				return basicSetDataTypeList(null, msgs);
			case XDDPackage.TAPPLICATION_LAYERS__OBJECT_LIST:
				return basicSetObjectList(null, msgs);
			case XDDPackage.TAPPLICATION_LAYERS__DYNAMIC_CHANNELS:
				return basicSetDynamicChannels(null, msgs);
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
			case XDDPackage.TAPPLICATION_LAYERS__IDENTITY:
				return getIdentity();
			case XDDPackage.TAPPLICATION_LAYERS__DATA_TYPE_LIST:
				return getDataTypeList();
			case XDDPackage.TAPPLICATION_LAYERS__OBJECT_LIST:
				return getObjectList();
			case XDDPackage.TAPPLICATION_LAYERS__DYNAMIC_CHANNELS:
				return getDynamicChannels();
			case XDDPackage.TAPPLICATION_LAYERS__COMMUNICATION_ENTITY_TYPE:
				return getCommunicationEntityType();
			case XDDPackage.TAPPLICATION_LAYERS__CONFORMANCE_CLASS:
				return getConformanceClass();
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
			case XDDPackage.TAPPLICATION_LAYERS__IDENTITY:
				setIdentity((IdentityType)newValue);
				return;
			case XDDPackage.TAPPLICATION_LAYERS__DATA_TYPE_LIST:
				setDataTypeList((DataTypeListType)newValue);
				return;
			case XDDPackage.TAPPLICATION_LAYERS__OBJECT_LIST:
				setObjectList((ObjectListType)newValue);
				return;
			case XDDPackage.TAPPLICATION_LAYERS__DYNAMIC_CHANNELS:
				setDynamicChannels((DynamicChannelsType)newValue);
				return;
			case XDDPackage.TAPPLICATION_LAYERS__COMMUNICATION_ENTITY_TYPE:
				setCommunicationEntityType((List<String>)newValue);
				return;
			case XDDPackage.TAPPLICATION_LAYERS__CONFORMANCE_CLASS:
				setConformanceClass((String)newValue);
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
			case XDDPackage.TAPPLICATION_LAYERS__IDENTITY:
				setIdentity((IdentityType)null);
				return;
			case XDDPackage.TAPPLICATION_LAYERS__DATA_TYPE_LIST:
				setDataTypeList((DataTypeListType)null);
				return;
			case XDDPackage.TAPPLICATION_LAYERS__OBJECT_LIST:
				setObjectList((ObjectListType)null);
				return;
			case XDDPackage.TAPPLICATION_LAYERS__DYNAMIC_CHANNELS:
				setDynamicChannels((DynamicChannelsType)null);
				return;
			case XDDPackage.TAPPLICATION_LAYERS__COMMUNICATION_ENTITY_TYPE:
				unsetCommunicationEntityType();
				return;
			case XDDPackage.TAPPLICATION_LAYERS__CONFORMANCE_CLASS:
				setConformanceClass(CONFORMANCE_CLASS_EDEFAULT);
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
			case XDDPackage.TAPPLICATION_LAYERS__IDENTITY:
				return identity != null;
			case XDDPackage.TAPPLICATION_LAYERS__DATA_TYPE_LIST:
				return dataTypeList != null;
			case XDDPackage.TAPPLICATION_LAYERS__OBJECT_LIST:
				return objectList != null;
			case XDDPackage.TAPPLICATION_LAYERS__DYNAMIC_CHANNELS:
				return dynamicChannels != null;
			case XDDPackage.TAPPLICATION_LAYERS__COMMUNICATION_ENTITY_TYPE:
				return isSetCommunicationEntityType();
			case XDDPackage.TAPPLICATION_LAYERS__CONFORMANCE_CLASS:
				return CONFORMANCE_CLASS_EDEFAULT == null ? conformanceClass != null : !CONFORMANCE_CLASS_EDEFAULT.equals(conformanceClass);
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
		result.append(" (communicationEntityType: ");
		if (communicationEntityTypeESet) result.append(communicationEntityType); else result.append("<unset>");
		result.append(", conformanceClass: ");
		result.append(conformanceClass);
		result.append(')');
		return result.toString();
	}

} //TApplicationLayersImpl
