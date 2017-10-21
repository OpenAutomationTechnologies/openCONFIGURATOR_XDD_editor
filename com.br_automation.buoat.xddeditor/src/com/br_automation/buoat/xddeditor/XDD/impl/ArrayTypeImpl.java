/**
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import com.br_automation.buoat.xddeditor.XDD.ArrayType;
import com.br_automation.buoat.xddeditor.XDD.DescriptionRefType;
import com.br_automation.buoat.xddeditor.XDD.DescriptionType;
import com.br_automation.buoat.xddeditor.XDD.LabelRefType;
import com.br_automation.buoat.xddeditor.XDD.LabelType;
import com.br_automation.buoat.xddeditor.XDD.TDataTypeIDRef;
import com.br_automation.buoat.xddeditor.XDD.TSubrange;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ArrayTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ArrayTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ArrayTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ArrayTypeImpl#getLabelRef <em>Label Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ArrayTypeImpl#getDescriptionRef <em>Description Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ArrayTypeImpl#getSubrange <em>Subrange</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ArrayTypeImpl#getBOOL <em>BOOL</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ArrayTypeImpl#getBITSTRING <em>BITSTRING</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ArrayTypeImpl#getBYTE <em>BYTE</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ArrayTypeImpl#getCHAR <em>CHAR</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ArrayTypeImpl#getWORD <em>WORD</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ArrayTypeImpl#getDWORD <em>DWORD</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ArrayTypeImpl#getLWORD <em>LWORD</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ArrayTypeImpl#getSINT <em>SINT</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ArrayTypeImpl#getINT <em>INT</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ArrayTypeImpl#getDINT <em>DINT</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ArrayTypeImpl#getLINT <em>LINT</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ArrayTypeImpl#getUSINT <em>USINT</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ArrayTypeImpl#getUINT <em>UINT</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ArrayTypeImpl#getUDINT <em>UDINT</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ArrayTypeImpl#getULINT <em>ULINT</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ArrayTypeImpl#getREAL <em>REAL</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ArrayTypeImpl#getLREAL <em>LREAL</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ArrayTypeImpl#getSTRING <em>STRING</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ArrayTypeImpl#getWSTRING <em>WSTRING</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ArrayTypeImpl#getDataTypeIDRef <em>Data Type ID Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ArrayTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.ArrayTypeImpl#getUniqueID <em>Unique ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayTypeImpl extends EObjectImpl implements ArrayType {
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
	 * The cached value of the '{@link #getSubrange() <em>Subrange</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubrange()
	 * @generated
	 * @ordered
	 */
	protected EList<TSubrange> subrange;

	/**
	 * The cached value of the '{@link #getBOOL() <em>BOOL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBOOL()
	 * @generated
	 * @ordered
	 */
	protected EObject bOOL;

	/**
	 * The cached value of the '{@link #getBITSTRING() <em>BITSTRING</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBITSTRING()
	 * @generated
	 * @ordered
	 */
	protected EObject bITSTRING;

	/**
	 * The cached value of the '{@link #getBYTE() <em>BYTE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBYTE()
	 * @generated
	 * @ordered
	 */
	protected EObject bYTE;

	/**
	 * The cached value of the '{@link #getCHAR() <em>CHAR</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCHAR()
	 * @generated
	 * @ordered
	 */
	protected EObject cHAR;

	/**
	 * The cached value of the '{@link #getWORD() <em>WORD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWORD()
	 * @generated
	 * @ordered
	 */
	protected EObject wORD;

	/**
	 * The cached value of the '{@link #getDWORD() <em>DWORD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDWORD()
	 * @generated
	 * @ordered
	 */
	protected EObject dWORD;

	/**
	 * The cached value of the '{@link #getLWORD() <em>LWORD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLWORD()
	 * @generated
	 * @ordered
	 */
	protected EObject lWORD;

	/**
	 * The cached value of the '{@link #getSINT() <em>SINT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSINT()
	 * @generated
	 * @ordered
	 */
	protected EObject sINT;

	/**
	 * The cached value of the '{@link #getINT() <em>INT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINT()
	 * @generated
	 * @ordered
	 */
	protected EObject iNT;

	/**
	 * The cached value of the '{@link #getDINT() <em>DINT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDINT()
	 * @generated
	 * @ordered
	 */
	protected EObject dINT;

	/**
	 * The cached value of the '{@link #getLINT() <em>LINT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLINT()
	 * @generated
	 * @ordered
	 */
	protected EObject lINT;

	/**
	 * The cached value of the '{@link #getUSINT() <em>USINT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUSINT()
	 * @generated
	 * @ordered
	 */
	protected EObject uSINT;

	/**
	 * The cached value of the '{@link #getUINT() <em>UINT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUINT()
	 * @generated
	 * @ordered
	 */
	protected EObject uINT;

	/**
	 * The cached value of the '{@link #getUDINT() <em>UDINT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUDINT()
	 * @generated
	 * @ordered
	 */
	protected EObject uDINT;

	/**
	 * The cached value of the '{@link #getULINT() <em>ULINT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getULINT()
	 * @generated
	 * @ordered
	 */
	protected EObject uLINT;

	/**
	 * The cached value of the '{@link #getREAL() <em>REAL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getREAL()
	 * @generated
	 * @ordered
	 */
	protected EObject rEAL;

	/**
	 * The cached value of the '{@link #getLREAL() <em>LREAL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLREAL()
	 * @generated
	 * @ordered
	 */
	protected EObject lREAL;

	/**
	 * The cached value of the '{@link #getSTRING() <em>STRING</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTRING()
	 * @generated
	 * @ordered
	 */
	protected EObject sTRING;

	/**
	 * The cached value of the '{@link #getWSTRING() <em>WSTRING</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWSTRING()
	 * @generated
	 * @ordered
	 */
	protected EObject wSTRING;

	/**
	 * The cached value of the '{@link #getDataTypeIDRef() <em>Data Type ID Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypeIDRef()
	 * @generated
	 * @ordered
	 */
	protected TDataTypeIDRef dataTypeIDRef;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUniqueID() <em>Unique ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueID()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniqueID() <em>Unique ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueID()
	 * @generated
	 * @ordered
	 */
	protected String uniqueID = UNIQUE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XDDPackage.eINSTANCE.getArrayType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, XDDPackage.ARRAY_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LabelType> getLabel() {
		return getGroup().list(XDDPackage.eINSTANCE.getArrayType_Label());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		return getGroup().list(XDDPackage.eINSTANCE.getArrayType_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LabelRefType> getLabelRef() {
		return getGroup().list(XDDPackage.eINSTANCE.getArrayType_LabelRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionRefType> getDescriptionRef() {
		return getGroup().list(XDDPackage.eINSTANCE.getArrayType_DescriptionRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TSubrange> getSubrange() {
		if (subrange == null) {
			subrange = new EObjectContainmentEList<TSubrange>(TSubrange.class, this, XDDPackage.ARRAY_TYPE__SUBRANGE);
		}
		return subrange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getBOOL() {
		return bOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBOOL(EObject newBOOL, NotificationChain msgs) {
		EObject oldBOOL = bOOL;
		bOOL = newBOOL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__BOOL, oldBOOL, newBOOL);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBOOL(EObject newBOOL) {
		if (newBOOL != bOOL) {
			NotificationChain msgs = null;
			if (bOOL != null)
				msgs = ((InternalEObject)bOOL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__BOOL, null, msgs);
			if (newBOOL != null)
				msgs = ((InternalEObject)newBOOL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__BOOL, null, msgs);
			msgs = basicSetBOOL(newBOOL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__BOOL, newBOOL, newBOOL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getBITSTRING() {
		return bITSTRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBITSTRING(EObject newBITSTRING, NotificationChain msgs) {
		EObject oldBITSTRING = bITSTRING;
		bITSTRING = newBITSTRING;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__BITSTRING, oldBITSTRING, newBITSTRING);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBITSTRING(EObject newBITSTRING) {
		if (newBITSTRING != bITSTRING) {
			NotificationChain msgs = null;
			if (bITSTRING != null)
				msgs = ((InternalEObject)bITSTRING).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__BITSTRING, null, msgs);
			if (newBITSTRING != null)
				msgs = ((InternalEObject)newBITSTRING).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__BITSTRING, null, msgs);
			msgs = basicSetBITSTRING(newBITSTRING, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__BITSTRING, newBITSTRING, newBITSTRING));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getBYTE() {
		return bYTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBYTE(EObject newBYTE, NotificationChain msgs) {
		EObject oldBYTE = bYTE;
		bYTE = newBYTE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__BYTE, oldBYTE, newBYTE);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBYTE(EObject newBYTE) {
		if (newBYTE != bYTE) {
			NotificationChain msgs = null;
			if (bYTE != null)
				msgs = ((InternalEObject)bYTE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__BYTE, null, msgs);
			if (newBYTE != null)
				msgs = ((InternalEObject)newBYTE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__BYTE, null, msgs);
			msgs = basicSetBYTE(newBYTE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__BYTE, newBYTE, newBYTE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getCHAR() {
		return cHAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCHAR(EObject newCHAR, NotificationChain msgs) {
		EObject oldCHAR = cHAR;
		cHAR = newCHAR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__CHAR, oldCHAR, newCHAR);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCHAR(EObject newCHAR) {
		if (newCHAR != cHAR) {
			NotificationChain msgs = null;
			if (cHAR != null)
				msgs = ((InternalEObject)cHAR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__CHAR, null, msgs);
			if (newCHAR != null)
				msgs = ((InternalEObject)newCHAR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__CHAR, null, msgs);
			msgs = basicSetCHAR(newCHAR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__CHAR, newCHAR, newCHAR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getWORD() {
		return wORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWORD(EObject newWORD, NotificationChain msgs) {
		EObject oldWORD = wORD;
		wORD = newWORD;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__WORD, oldWORD, newWORD);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWORD(EObject newWORD) {
		if (newWORD != wORD) {
			NotificationChain msgs = null;
			if (wORD != null)
				msgs = ((InternalEObject)wORD).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__WORD, null, msgs);
			if (newWORD != null)
				msgs = ((InternalEObject)newWORD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__WORD, null, msgs);
			msgs = basicSetWORD(newWORD, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__WORD, newWORD, newWORD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getDWORD() {
		return dWORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDWORD(EObject newDWORD, NotificationChain msgs) {
		EObject oldDWORD = dWORD;
		dWORD = newDWORD;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__DWORD, oldDWORD, newDWORD);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDWORD(EObject newDWORD) {
		if (newDWORD != dWORD) {
			NotificationChain msgs = null;
			if (dWORD != null)
				msgs = ((InternalEObject)dWORD).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__DWORD, null, msgs);
			if (newDWORD != null)
				msgs = ((InternalEObject)newDWORD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__DWORD, null, msgs);
			msgs = basicSetDWORD(newDWORD, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__DWORD, newDWORD, newDWORD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getLWORD() {
		return lWORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLWORD(EObject newLWORD, NotificationChain msgs) {
		EObject oldLWORD = lWORD;
		lWORD = newLWORD;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__LWORD, oldLWORD, newLWORD);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLWORD(EObject newLWORD) {
		if (newLWORD != lWORD) {
			NotificationChain msgs = null;
			if (lWORD != null)
				msgs = ((InternalEObject)lWORD).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__LWORD, null, msgs);
			if (newLWORD != null)
				msgs = ((InternalEObject)newLWORD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__LWORD, null, msgs);
			msgs = basicSetLWORD(newLWORD, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__LWORD, newLWORD, newLWORD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getSINT() {
		return sINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSINT(EObject newSINT, NotificationChain msgs) {
		EObject oldSINT = sINT;
		sINT = newSINT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__SINT, oldSINT, newSINT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSINT(EObject newSINT) {
		if (newSINT != sINT) {
			NotificationChain msgs = null;
			if (sINT != null)
				msgs = ((InternalEObject)sINT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__SINT, null, msgs);
			if (newSINT != null)
				msgs = ((InternalEObject)newSINT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__SINT, null, msgs);
			msgs = basicSetSINT(newSINT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__SINT, newSINT, newSINT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getINT() {
		return iNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetINT(EObject newINT, NotificationChain msgs) {
		EObject oldINT = iNT;
		iNT = newINT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__INT, oldINT, newINT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setINT(EObject newINT) {
		if (newINT != iNT) {
			NotificationChain msgs = null;
			if (iNT != null)
				msgs = ((InternalEObject)iNT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__INT, null, msgs);
			if (newINT != null)
				msgs = ((InternalEObject)newINT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__INT, null, msgs);
			msgs = basicSetINT(newINT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__INT, newINT, newINT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getDINT() {
		return dINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDINT(EObject newDINT, NotificationChain msgs) {
		EObject oldDINT = dINT;
		dINT = newDINT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__DINT, oldDINT, newDINT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDINT(EObject newDINT) {
		if (newDINT != dINT) {
			NotificationChain msgs = null;
			if (dINT != null)
				msgs = ((InternalEObject)dINT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__DINT, null, msgs);
			if (newDINT != null)
				msgs = ((InternalEObject)newDINT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__DINT, null, msgs);
			msgs = basicSetDINT(newDINT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__DINT, newDINT, newDINT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getLINT() {
		return lINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLINT(EObject newLINT, NotificationChain msgs) {
		EObject oldLINT = lINT;
		lINT = newLINT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__LINT, oldLINT, newLINT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLINT(EObject newLINT) {
		if (newLINT != lINT) {
			NotificationChain msgs = null;
			if (lINT != null)
				msgs = ((InternalEObject)lINT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__LINT, null, msgs);
			if (newLINT != null)
				msgs = ((InternalEObject)newLINT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__LINT, null, msgs);
			msgs = basicSetLINT(newLINT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__LINT, newLINT, newLINT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getUSINT() {
		return uSINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUSINT(EObject newUSINT, NotificationChain msgs) {
		EObject oldUSINT = uSINT;
		uSINT = newUSINT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__USINT, oldUSINT, newUSINT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUSINT(EObject newUSINT) {
		if (newUSINT != uSINT) {
			NotificationChain msgs = null;
			if (uSINT != null)
				msgs = ((InternalEObject)uSINT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__USINT, null, msgs);
			if (newUSINT != null)
				msgs = ((InternalEObject)newUSINT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__USINT, null, msgs);
			msgs = basicSetUSINT(newUSINT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__USINT, newUSINT, newUSINT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getUINT() {
		return uINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUINT(EObject newUINT, NotificationChain msgs) {
		EObject oldUINT = uINT;
		uINT = newUINT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__UINT, oldUINT, newUINT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUINT(EObject newUINT) {
		if (newUINT != uINT) {
			NotificationChain msgs = null;
			if (uINT != null)
				msgs = ((InternalEObject)uINT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__UINT, null, msgs);
			if (newUINT != null)
				msgs = ((InternalEObject)newUINT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__UINT, null, msgs);
			msgs = basicSetUINT(newUINT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__UINT, newUINT, newUINT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getUDINT() {
		return uDINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUDINT(EObject newUDINT, NotificationChain msgs) {
		EObject oldUDINT = uDINT;
		uDINT = newUDINT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__UDINT, oldUDINT, newUDINT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUDINT(EObject newUDINT) {
		if (newUDINT != uDINT) {
			NotificationChain msgs = null;
			if (uDINT != null)
				msgs = ((InternalEObject)uDINT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__UDINT, null, msgs);
			if (newUDINT != null)
				msgs = ((InternalEObject)newUDINT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__UDINT, null, msgs);
			msgs = basicSetUDINT(newUDINT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__UDINT, newUDINT, newUDINT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getULINT() {
		return uLINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetULINT(EObject newULINT, NotificationChain msgs) {
		EObject oldULINT = uLINT;
		uLINT = newULINT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__ULINT, oldULINT, newULINT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setULINT(EObject newULINT) {
		if (newULINT != uLINT) {
			NotificationChain msgs = null;
			if (uLINT != null)
				msgs = ((InternalEObject)uLINT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__ULINT, null, msgs);
			if (newULINT != null)
				msgs = ((InternalEObject)newULINT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__ULINT, null, msgs);
			msgs = basicSetULINT(newULINT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__ULINT, newULINT, newULINT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getREAL() {
		return rEAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetREAL(EObject newREAL, NotificationChain msgs) {
		EObject oldREAL = rEAL;
		rEAL = newREAL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__REAL, oldREAL, newREAL);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setREAL(EObject newREAL) {
		if (newREAL != rEAL) {
			NotificationChain msgs = null;
			if (rEAL != null)
				msgs = ((InternalEObject)rEAL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__REAL, null, msgs);
			if (newREAL != null)
				msgs = ((InternalEObject)newREAL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__REAL, null, msgs);
			msgs = basicSetREAL(newREAL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__REAL, newREAL, newREAL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getLREAL() {
		return lREAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLREAL(EObject newLREAL, NotificationChain msgs) {
		EObject oldLREAL = lREAL;
		lREAL = newLREAL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__LREAL, oldLREAL, newLREAL);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLREAL(EObject newLREAL) {
		if (newLREAL != lREAL) {
			NotificationChain msgs = null;
			if (lREAL != null)
				msgs = ((InternalEObject)lREAL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__LREAL, null, msgs);
			if (newLREAL != null)
				msgs = ((InternalEObject)newLREAL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__LREAL, null, msgs);
			msgs = basicSetLREAL(newLREAL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__LREAL, newLREAL, newLREAL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getSTRING() {
		return sTRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSTRING(EObject newSTRING, NotificationChain msgs) {
		EObject oldSTRING = sTRING;
		sTRING = newSTRING;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__STRING, oldSTRING, newSTRING);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTRING(EObject newSTRING) {
		if (newSTRING != sTRING) {
			NotificationChain msgs = null;
			if (sTRING != null)
				msgs = ((InternalEObject)sTRING).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__STRING, null, msgs);
			if (newSTRING != null)
				msgs = ((InternalEObject)newSTRING).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__STRING, null, msgs);
			msgs = basicSetSTRING(newSTRING, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__STRING, newSTRING, newSTRING));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getWSTRING() {
		return wSTRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWSTRING(EObject newWSTRING, NotificationChain msgs) {
		EObject oldWSTRING = wSTRING;
		wSTRING = newWSTRING;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__WSTRING, oldWSTRING, newWSTRING);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWSTRING(EObject newWSTRING) {
		if (newWSTRING != wSTRING) {
			NotificationChain msgs = null;
			if (wSTRING != null)
				msgs = ((InternalEObject)wSTRING).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__WSTRING, null, msgs);
			if (newWSTRING != null)
				msgs = ((InternalEObject)newWSTRING).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__WSTRING, null, msgs);
			msgs = basicSetWSTRING(newWSTRING, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__WSTRING, newWSTRING, newWSTRING));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDataTypeIDRef getDataTypeIDRef() {
		return dataTypeIDRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataTypeIDRef(TDataTypeIDRef newDataTypeIDRef, NotificationChain msgs) {
		TDataTypeIDRef oldDataTypeIDRef = dataTypeIDRef;
		dataTypeIDRef = newDataTypeIDRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__DATA_TYPE_ID_REF, oldDataTypeIDRef, newDataTypeIDRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataTypeIDRef(TDataTypeIDRef newDataTypeIDRef) {
		if (newDataTypeIDRef != dataTypeIDRef) {
			NotificationChain msgs = null;
			if (dataTypeIDRef != null)
				msgs = ((InternalEObject)dataTypeIDRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__DATA_TYPE_ID_REF, null, msgs);
			if (newDataTypeIDRef != null)
				msgs = ((InternalEObject)newDataTypeIDRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDDPackage.ARRAY_TYPE__DATA_TYPE_ID_REF, null, msgs);
			msgs = basicSetDataTypeIDRef(newDataTypeIDRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__DATA_TYPE_ID_REF, newDataTypeIDRef, newDataTypeIDRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUniqueID() {
		return uniqueID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueID(String newUniqueID) {
		String oldUniqueID = uniqueID;
		uniqueID = newUniqueID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.ARRAY_TYPE__UNIQUE_ID, oldUniqueID, uniqueID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XDDPackage.ARRAY_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XDDPackage.ARRAY_TYPE__LABEL:
				return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
			case XDDPackage.ARRAY_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case XDDPackage.ARRAY_TYPE__LABEL_REF:
				return ((InternalEList<?>)getLabelRef()).basicRemove(otherEnd, msgs);
			case XDDPackage.ARRAY_TYPE__DESCRIPTION_REF:
				return ((InternalEList<?>)getDescriptionRef()).basicRemove(otherEnd, msgs);
			case XDDPackage.ARRAY_TYPE__SUBRANGE:
				return ((InternalEList<?>)getSubrange()).basicRemove(otherEnd, msgs);
			case XDDPackage.ARRAY_TYPE__BOOL:
				return basicSetBOOL(null, msgs);
			case XDDPackage.ARRAY_TYPE__BITSTRING:
				return basicSetBITSTRING(null, msgs);
			case XDDPackage.ARRAY_TYPE__BYTE:
				return basicSetBYTE(null, msgs);
			case XDDPackage.ARRAY_TYPE__CHAR:
				return basicSetCHAR(null, msgs);
			case XDDPackage.ARRAY_TYPE__WORD:
				return basicSetWORD(null, msgs);
			case XDDPackage.ARRAY_TYPE__DWORD:
				return basicSetDWORD(null, msgs);
			case XDDPackage.ARRAY_TYPE__LWORD:
				return basicSetLWORD(null, msgs);
			case XDDPackage.ARRAY_TYPE__SINT:
				return basicSetSINT(null, msgs);
			case XDDPackage.ARRAY_TYPE__INT:
				return basicSetINT(null, msgs);
			case XDDPackage.ARRAY_TYPE__DINT:
				return basicSetDINT(null, msgs);
			case XDDPackage.ARRAY_TYPE__LINT:
				return basicSetLINT(null, msgs);
			case XDDPackage.ARRAY_TYPE__USINT:
				return basicSetUSINT(null, msgs);
			case XDDPackage.ARRAY_TYPE__UINT:
				return basicSetUINT(null, msgs);
			case XDDPackage.ARRAY_TYPE__UDINT:
				return basicSetUDINT(null, msgs);
			case XDDPackage.ARRAY_TYPE__ULINT:
				return basicSetULINT(null, msgs);
			case XDDPackage.ARRAY_TYPE__REAL:
				return basicSetREAL(null, msgs);
			case XDDPackage.ARRAY_TYPE__LREAL:
				return basicSetLREAL(null, msgs);
			case XDDPackage.ARRAY_TYPE__STRING:
				return basicSetSTRING(null, msgs);
			case XDDPackage.ARRAY_TYPE__WSTRING:
				return basicSetWSTRING(null, msgs);
			case XDDPackage.ARRAY_TYPE__DATA_TYPE_ID_REF:
				return basicSetDataTypeIDRef(null, msgs);
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
			case XDDPackage.ARRAY_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XDDPackage.ARRAY_TYPE__LABEL:
				return getLabel();
			case XDDPackage.ARRAY_TYPE__DESCRIPTION:
				return getDescription();
			case XDDPackage.ARRAY_TYPE__LABEL_REF:
				return getLabelRef();
			case XDDPackage.ARRAY_TYPE__DESCRIPTION_REF:
				return getDescriptionRef();
			case XDDPackage.ARRAY_TYPE__SUBRANGE:
				return getSubrange();
			case XDDPackage.ARRAY_TYPE__BOOL:
				return getBOOL();
			case XDDPackage.ARRAY_TYPE__BITSTRING:
				return getBITSTRING();
			case XDDPackage.ARRAY_TYPE__BYTE:
				return getBYTE();
			case XDDPackage.ARRAY_TYPE__CHAR:
				return getCHAR();
			case XDDPackage.ARRAY_TYPE__WORD:
				return getWORD();
			case XDDPackage.ARRAY_TYPE__DWORD:
				return getDWORD();
			case XDDPackage.ARRAY_TYPE__LWORD:
				return getLWORD();
			case XDDPackage.ARRAY_TYPE__SINT:
				return getSINT();
			case XDDPackage.ARRAY_TYPE__INT:
				return getINT();
			case XDDPackage.ARRAY_TYPE__DINT:
				return getDINT();
			case XDDPackage.ARRAY_TYPE__LINT:
				return getLINT();
			case XDDPackage.ARRAY_TYPE__USINT:
				return getUSINT();
			case XDDPackage.ARRAY_TYPE__UINT:
				return getUINT();
			case XDDPackage.ARRAY_TYPE__UDINT:
				return getUDINT();
			case XDDPackage.ARRAY_TYPE__ULINT:
				return getULINT();
			case XDDPackage.ARRAY_TYPE__REAL:
				return getREAL();
			case XDDPackage.ARRAY_TYPE__LREAL:
				return getLREAL();
			case XDDPackage.ARRAY_TYPE__STRING:
				return getSTRING();
			case XDDPackage.ARRAY_TYPE__WSTRING:
				return getWSTRING();
			case XDDPackage.ARRAY_TYPE__DATA_TYPE_ID_REF:
				return getDataTypeIDRef();
			case XDDPackage.ARRAY_TYPE__NAME:
				return getName();
			case XDDPackage.ARRAY_TYPE__UNIQUE_ID:
				return getUniqueID();
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
			case XDDPackage.ARRAY_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XDDPackage.ARRAY_TYPE__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection<? extends LabelType>)newValue);
				return;
			case XDDPackage.ARRAY_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case XDDPackage.ARRAY_TYPE__LABEL_REF:
				getLabelRef().clear();
				getLabelRef().addAll((Collection<? extends LabelRefType>)newValue);
				return;
			case XDDPackage.ARRAY_TYPE__DESCRIPTION_REF:
				getDescriptionRef().clear();
				getDescriptionRef().addAll((Collection<? extends DescriptionRefType>)newValue);
				return;
			case XDDPackage.ARRAY_TYPE__SUBRANGE:
				getSubrange().clear();
				getSubrange().addAll((Collection<? extends TSubrange>)newValue);
				return;
			case XDDPackage.ARRAY_TYPE__BOOL:
				setBOOL((EObject)newValue);
				return;
			case XDDPackage.ARRAY_TYPE__BITSTRING:
				setBITSTRING((EObject)newValue);
				return;
			case XDDPackage.ARRAY_TYPE__BYTE:
				setBYTE((EObject)newValue);
				return;
			case XDDPackage.ARRAY_TYPE__CHAR:
				setCHAR((EObject)newValue);
				return;
			case XDDPackage.ARRAY_TYPE__WORD:
				setWORD((EObject)newValue);
				return;
			case XDDPackage.ARRAY_TYPE__DWORD:
				setDWORD((EObject)newValue);
				return;
			case XDDPackage.ARRAY_TYPE__LWORD:
				setLWORD((EObject)newValue);
				return;
			case XDDPackage.ARRAY_TYPE__SINT:
				setSINT((EObject)newValue);
				return;
			case XDDPackage.ARRAY_TYPE__INT:
				setINT((EObject)newValue);
				return;
			case XDDPackage.ARRAY_TYPE__DINT:
				setDINT((EObject)newValue);
				return;
			case XDDPackage.ARRAY_TYPE__LINT:
				setLINT((EObject)newValue);
				return;
			case XDDPackage.ARRAY_TYPE__USINT:
				setUSINT((EObject)newValue);
				return;
			case XDDPackage.ARRAY_TYPE__UINT:
				setUINT((EObject)newValue);
				return;
			case XDDPackage.ARRAY_TYPE__UDINT:
				setUDINT((EObject)newValue);
				return;
			case XDDPackage.ARRAY_TYPE__ULINT:
				setULINT((EObject)newValue);
				return;
			case XDDPackage.ARRAY_TYPE__REAL:
				setREAL((EObject)newValue);
				return;
			case XDDPackage.ARRAY_TYPE__LREAL:
				setLREAL((EObject)newValue);
				return;
			case XDDPackage.ARRAY_TYPE__STRING:
				setSTRING((EObject)newValue);
				return;
			case XDDPackage.ARRAY_TYPE__WSTRING:
				setWSTRING((EObject)newValue);
				return;
			case XDDPackage.ARRAY_TYPE__DATA_TYPE_ID_REF:
				setDataTypeIDRef((TDataTypeIDRef)newValue);
				return;
			case XDDPackage.ARRAY_TYPE__NAME:
				setName((String)newValue);
				return;
			case XDDPackage.ARRAY_TYPE__UNIQUE_ID:
				setUniqueID((String)newValue);
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
			case XDDPackage.ARRAY_TYPE__GROUP:
				getGroup().clear();
				return;
			case XDDPackage.ARRAY_TYPE__LABEL:
				getLabel().clear();
				return;
			case XDDPackage.ARRAY_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case XDDPackage.ARRAY_TYPE__LABEL_REF:
				getLabelRef().clear();
				return;
			case XDDPackage.ARRAY_TYPE__DESCRIPTION_REF:
				getDescriptionRef().clear();
				return;
			case XDDPackage.ARRAY_TYPE__SUBRANGE:
				getSubrange().clear();
				return;
			case XDDPackage.ARRAY_TYPE__BOOL:
				setBOOL((EObject)null);
				return;
			case XDDPackage.ARRAY_TYPE__BITSTRING:
				setBITSTRING((EObject)null);
				return;
			case XDDPackage.ARRAY_TYPE__BYTE:
				setBYTE((EObject)null);
				return;
			case XDDPackage.ARRAY_TYPE__CHAR:
				setCHAR((EObject)null);
				return;
			case XDDPackage.ARRAY_TYPE__WORD:
				setWORD((EObject)null);
				return;
			case XDDPackage.ARRAY_TYPE__DWORD:
				setDWORD((EObject)null);
				return;
			case XDDPackage.ARRAY_TYPE__LWORD:
				setLWORD((EObject)null);
				return;
			case XDDPackage.ARRAY_TYPE__SINT:
				setSINT((EObject)null);
				return;
			case XDDPackage.ARRAY_TYPE__INT:
				setINT((EObject)null);
				return;
			case XDDPackage.ARRAY_TYPE__DINT:
				setDINT((EObject)null);
				return;
			case XDDPackage.ARRAY_TYPE__LINT:
				setLINT((EObject)null);
				return;
			case XDDPackage.ARRAY_TYPE__USINT:
				setUSINT((EObject)null);
				return;
			case XDDPackage.ARRAY_TYPE__UINT:
				setUINT((EObject)null);
				return;
			case XDDPackage.ARRAY_TYPE__UDINT:
				setUDINT((EObject)null);
				return;
			case XDDPackage.ARRAY_TYPE__ULINT:
				setULINT((EObject)null);
				return;
			case XDDPackage.ARRAY_TYPE__REAL:
				setREAL((EObject)null);
				return;
			case XDDPackage.ARRAY_TYPE__LREAL:
				setLREAL((EObject)null);
				return;
			case XDDPackage.ARRAY_TYPE__STRING:
				setSTRING((EObject)null);
				return;
			case XDDPackage.ARRAY_TYPE__WSTRING:
				setWSTRING((EObject)null);
				return;
			case XDDPackage.ARRAY_TYPE__DATA_TYPE_ID_REF:
				setDataTypeIDRef((TDataTypeIDRef)null);
				return;
			case XDDPackage.ARRAY_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XDDPackage.ARRAY_TYPE__UNIQUE_ID:
				setUniqueID(UNIQUE_ID_EDEFAULT);
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
			case XDDPackage.ARRAY_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case XDDPackage.ARRAY_TYPE__LABEL:
				return !getLabel().isEmpty();
			case XDDPackage.ARRAY_TYPE__DESCRIPTION:
				return !getDescription().isEmpty();
			case XDDPackage.ARRAY_TYPE__LABEL_REF:
				return !getLabelRef().isEmpty();
			case XDDPackage.ARRAY_TYPE__DESCRIPTION_REF:
				return !getDescriptionRef().isEmpty();
			case XDDPackage.ARRAY_TYPE__SUBRANGE:
				return subrange != null && !subrange.isEmpty();
			case XDDPackage.ARRAY_TYPE__BOOL:
				return bOOL != null;
			case XDDPackage.ARRAY_TYPE__BITSTRING:
				return bITSTRING != null;
			case XDDPackage.ARRAY_TYPE__BYTE:
				return bYTE != null;
			case XDDPackage.ARRAY_TYPE__CHAR:
				return cHAR != null;
			case XDDPackage.ARRAY_TYPE__WORD:
				return wORD != null;
			case XDDPackage.ARRAY_TYPE__DWORD:
				return dWORD != null;
			case XDDPackage.ARRAY_TYPE__LWORD:
				return lWORD != null;
			case XDDPackage.ARRAY_TYPE__SINT:
				return sINT != null;
			case XDDPackage.ARRAY_TYPE__INT:
				return iNT != null;
			case XDDPackage.ARRAY_TYPE__DINT:
				return dINT != null;
			case XDDPackage.ARRAY_TYPE__LINT:
				return lINT != null;
			case XDDPackage.ARRAY_TYPE__USINT:
				return uSINT != null;
			case XDDPackage.ARRAY_TYPE__UINT:
				return uINT != null;
			case XDDPackage.ARRAY_TYPE__UDINT:
				return uDINT != null;
			case XDDPackage.ARRAY_TYPE__ULINT:
				return uLINT != null;
			case XDDPackage.ARRAY_TYPE__REAL:
				return rEAL != null;
			case XDDPackage.ARRAY_TYPE__LREAL:
				return lREAL != null;
			case XDDPackage.ARRAY_TYPE__STRING:
				return sTRING != null;
			case XDDPackage.ARRAY_TYPE__WSTRING:
				return wSTRING != null;
			case XDDPackage.ARRAY_TYPE__DATA_TYPE_ID_REF:
				return dataTypeIDRef != null;
			case XDDPackage.ARRAY_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XDDPackage.ARRAY_TYPE__UNIQUE_ID:
				return UNIQUE_ID_EDEFAULT == null ? uniqueID != null : !UNIQUE_ID_EDEFAULT.equals(uniqueID);
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
		result.append(", name: ");
		result.append(name);
		result.append(", uniqueID: ");
		result.append(uniqueID);
		result.append(')');
		return result.toString();
	}

} //ArrayTypeImpl
