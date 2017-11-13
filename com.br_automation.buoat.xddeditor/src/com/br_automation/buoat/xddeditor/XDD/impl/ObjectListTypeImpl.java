/**
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.br_automation.buoat.xddeditor.XDD.ObjectListType;
import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ObjectListTypeImpl#getObject <em>Object</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ObjectListTypeImpl#getMandatoryObjects <em>Mandatory Objects</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ObjectListTypeImpl#getManufacturerObjects <em>Manufacturer Objects</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ObjectListTypeImpl#getOptionalObjects <em>Optional Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectListTypeImpl extends EObjectImpl implements ObjectListType {
	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected EList<TObject> object;

	/**
	 * The default value of the '{@link #getMandatoryObjects() <em>Mandatory Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryObjects()
	 * @generated
	 * @ordered
	 */
	protected static final long MANDATORY_OBJECTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMandatoryObjects() <em>Mandatory Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryObjects()
	 * @generated
	 * @ordered
	 */
	protected long mandatoryObjects = MANDATORY_OBJECTS_EDEFAULT;

	/**
	 * This is true if the Mandatory Objects attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mandatoryObjectsESet;

	/**
	 * The default value of the '{@link #getManufacturerObjects() <em>Manufacturer Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturerObjects()
	 * @generated
	 * @ordered
	 */
	protected static final long MANUFACTURER_OBJECTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getManufacturerObjects() <em>Manufacturer Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturerObjects()
	 * @generated
	 * @ordered
	 */
	protected long manufacturerObjects = MANUFACTURER_OBJECTS_EDEFAULT;

	/**
	 * This is true if the Manufacturer Objects attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean manufacturerObjectsESet;

	/**
	 * The default value of the '{@link #getOptionalObjects() <em>Optional Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalObjects()
	 * @generated
	 * @ordered
	 */
	protected static final long OPTIONAL_OBJECTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getOptionalObjects() <em>Optional Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalObjects()
	 * @generated
	 * @ordered
	 */
	protected long optionalObjects = OPTIONAL_OBJECTS_EDEFAULT;

	/**
	 * This is true if the Optional Objects attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean optionalObjectsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XDDPackage.eINSTANCE.getObjectListType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TObject> getObject() {
		if (object == null) {
			object = new EObjectContainmentEList<TObject>(TObject.class, this, XDDPackage.OBJECT_LIST_TYPE__OBJECT);
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMandatoryObjects() {
		return mandatoryObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandatoryObjects(long newMandatoryObjects) {
		long oldMandatoryObjects = mandatoryObjects;
		mandatoryObjects = newMandatoryObjects;
		boolean oldMandatoryObjectsESet = mandatoryObjectsESet;
		mandatoryObjectsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.OBJECT_LIST_TYPE__MANDATORY_OBJECTS, oldMandatoryObjects, mandatoryObjects, !oldMandatoryObjectsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMandatoryObjects() {
		long oldMandatoryObjects = mandatoryObjects;
		boolean oldMandatoryObjectsESet = mandatoryObjectsESet;
		mandatoryObjects = MANDATORY_OBJECTS_EDEFAULT;
		mandatoryObjectsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.OBJECT_LIST_TYPE__MANDATORY_OBJECTS, oldMandatoryObjects, MANDATORY_OBJECTS_EDEFAULT, oldMandatoryObjectsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMandatoryObjects() {
		return mandatoryObjectsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getManufacturerObjects() {
		return manufacturerObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturerObjects(long newManufacturerObjects) {
		long oldManufacturerObjects = manufacturerObjects;
		manufacturerObjects = newManufacturerObjects;
		boolean oldManufacturerObjectsESet = manufacturerObjectsESet;
		manufacturerObjectsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.OBJECT_LIST_TYPE__MANUFACTURER_OBJECTS, oldManufacturerObjects, manufacturerObjects, !oldManufacturerObjectsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetManufacturerObjects() {
		long oldManufacturerObjects = manufacturerObjects;
		boolean oldManufacturerObjectsESet = manufacturerObjectsESet;
		manufacturerObjects = MANUFACTURER_OBJECTS_EDEFAULT;
		manufacturerObjectsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.OBJECT_LIST_TYPE__MANUFACTURER_OBJECTS, oldManufacturerObjects, MANUFACTURER_OBJECTS_EDEFAULT, oldManufacturerObjectsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetManufacturerObjects() {
		return manufacturerObjectsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getOptionalObjects() {
		return optionalObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionalObjects(long newOptionalObjects) {
		long oldOptionalObjects = optionalObjects;
		optionalObjects = newOptionalObjects;
		boolean oldOptionalObjectsESet = optionalObjectsESet;
		optionalObjectsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.OBJECT_LIST_TYPE__OPTIONAL_OBJECTS, oldOptionalObjects, optionalObjects, !oldOptionalObjectsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOptionalObjects() {
		long oldOptionalObjects = optionalObjects;
		boolean oldOptionalObjectsESet = optionalObjectsESet;
		optionalObjects = OPTIONAL_OBJECTS_EDEFAULT;
		optionalObjectsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.OBJECT_LIST_TYPE__OPTIONAL_OBJECTS, oldOptionalObjects, OPTIONAL_OBJECTS_EDEFAULT, oldOptionalObjectsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOptionalObjects() {
		return optionalObjectsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XDDPackage.OBJECT_LIST_TYPE__OBJECT:
				return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
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
			case XDDPackage.OBJECT_LIST_TYPE__OBJECT:
				return getObject();
			case XDDPackage.OBJECT_LIST_TYPE__MANDATORY_OBJECTS:
				return getMandatoryObjects();
			case XDDPackage.OBJECT_LIST_TYPE__MANUFACTURER_OBJECTS:
				return getManufacturerObjects();
			case XDDPackage.OBJECT_LIST_TYPE__OPTIONAL_OBJECTS:
				return getOptionalObjects();
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
			case XDDPackage.OBJECT_LIST_TYPE__OBJECT:
				getObject().clear();
				getObject().addAll((Collection<? extends TObject>)newValue);
				return;
			case XDDPackage.OBJECT_LIST_TYPE__MANDATORY_OBJECTS:
				setMandatoryObjects((Long)newValue);
				return;
			case XDDPackage.OBJECT_LIST_TYPE__MANUFACTURER_OBJECTS:
				setManufacturerObjects((Long)newValue);
				return;
			case XDDPackage.OBJECT_LIST_TYPE__OPTIONAL_OBJECTS:
				setOptionalObjects((Long)newValue);
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
			case XDDPackage.OBJECT_LIST_TYPE__OBJECT:
				getObject().clear();
				return;
			case XDDPackage.OBJECT_LIST_TYPE__MANDATORY_OBJECTS:
				unsetMandatoryObjects();
				return;
			case XDDPackage.OBJECT_LIST_TYPE__MANUFACTURER_OBJECTS:
				unsetManufacturerObjects();
				return;
			case XDDPackage.OBJECT_LIST_TYPE__OPTIONAL_OBJECTS:
				unsetOptionalObjects();
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
			case XDDPackage.OBJECT_LIST_TYPE__OBJECT:
				return object != null && !object.isEmpty();
			case XDDPackage.OBJECT_LIST_TYPE__MANDATORY_OBJECTS:
				return isSetMandatoryObjects();
			case XDDPackage.OBJECT_LIST_TYPE__MANUFACTURER_OBJECTS:
				return isSetManufacturerObjects();
			case XDDPackage.OBJECT_LIST_TYPE__OPTIONAL_OBJECTS:
				return isSetOptionalObjects();
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
		result.append(" (mandatoryObjects: ");
		if (mandatoryObjectsESet) result.append(mandatoryObjects); else result.append("<unset>");
		result.append(", manufacturerObjects: ");
		if (manufacturerObjectsESet) result.append(manufacturerObjects); else result.append("<unset>");
		result.append(", optionalObjects: ");
		if (optionalObjectsESet) result.append(optionalObjects); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ObjectListTypeImpl
