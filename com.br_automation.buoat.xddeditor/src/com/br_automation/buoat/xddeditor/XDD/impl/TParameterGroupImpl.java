/**
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import java.math.BigInteger;

import java.util.Collection;

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
import com.br_automation.buoat.xddeditor.XDD.LabelRefType;
import com.br_automation.buoat.xddeditor.XDD.LabelType;
import com.br_automation.buoat.xddeditor.XDD.ParameterRefType;
import com.br_automation.buoat.xddeditor.XDD.TParameterGroup;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TParameter Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TParameterGroupImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TParameterGroupImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TParameterGroupImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TParameterGroupImpl#getLabelRef <em>Label Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TParameterGroupImpl#getDescriptionRef <em>Description Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TParameterGroupImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TParameterGroupImpl#getParameterGroup <em>Parameter Group</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TParameterGroupImpl#getParameterRef <em>Parameter Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TParameterGroupImpl#getBitOffset <em>Bit Offset</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TParameterGroupImpl#getConditionalUniqueIDRef <em>Conditional Unique ID Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TParameterGroupImpl#getConditionalValue <em>Conditional Value</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TParameterGroupImpl#isConfigParameter <em>Config Parameter</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TParameterGroupImpl#isGroupLevelVisible <em>Group Level Visible</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TParameterGroupImpl#getKindOfAccess <em>Kind Of Access</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TParameterGroupImpl#getUniqueID <em>Unique ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TParameterGroupImpl extends EObjectImpl implements TParameterGroup {
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
	 * The cached value of the '{@link #getGroup1() <em>Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group1;

	/**
	 * The default value of the '{@link #getBitOffset() <em>Bit Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitOffset()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BIT_OFFSET_EDEFAULT = new BigInteger("0");

	/**
	 * The cached value of the '{@link #getBitOffset() <em>Bit Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitOffset()
	 * @generated
	 * @ordered
	 */
	protected BigInteger bitOffset = BIT_OFFSET_EDEFAULT;

	/**
	 * This is true if the Bit Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bitOffsetESet;

	/**
	 * The default value of the '{@link #getConditionalUniqueIDRef() <em>Conditional Unique ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalUniqueIDRef()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITIONAL_UNIQUE_ID_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionalUniqueIDRef() <em>Conditional Unique ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalUniqueIDRef()
	 * @generated
	 * @ordered
	 */
	protected String conditionalUniqueIDRef = CONDITIONAL_UNIQUE_ID_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getConditionalValue() <em>Conditional Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalValue()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITIONAL_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionalValue() <em>Conditional Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalValue()
	 * @generated
	 * @ordered
	 */
	protected String conditionalValue = CONDITIONAL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isConfigParameter() <em>Config Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConfigParameter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONFIG_PARAMETER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConfigParameter() <em>Config Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConfigParameter()
	 * @generated
	 * @ordered
	 */
	protected boolean configParameter = CONFIG_PARAMETER_EDEFAULT;

	/**
	 * This is true if the Config Parameter attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean configParameterESet;

	/**
	 * The default value of the '{@link #isGroupLevelVisible() <em>Group Level Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGroupLevelVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GROUP_LEVEL_VISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGroupLevelVisible() <em>Group Level Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGroupLevelVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean groupLevelVisible = GROUP_LEVEL_VISIBLE_EDEFAULT;

	/**
	 * This is true if the Group Level Visible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean groupLevelVisibleESet;

	/**
	 * The default value of the '{@link #getKindOfAccess() <em>Kind Of Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindOfAccess()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_OF_ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKindOfAccess() <em>Kind Of Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindOfAccess()
	 * @generated
	 * @ordered
	 */
	protected String kindOfAccess = KIND_OF_ACCESS_EDEFAULT;

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
	protected TParameterGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XDDPackage.eINSTANCE.getTParameterGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, XDDPackage.TPARAMETER_GROUP__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LabelType> getLabel() {
		return getGroup().list(XDDPackage.eINSTANCE.getTParameterGroup_Label());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		return getGroup().list(XDDPackage.eINSTANCE.getTParameterGroup_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LabelRefType> getLabelRef() {
		return getGroup().list(XDDPackage.eINSTANCE.getTParameterGroup_LabelRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionRefType> getDescriptionRef() {
		return getGroup().list(XDDPackage.eINSTANCE.getTParameterGroup_DescriptionRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup1() {
		if (group1 == null) {
			group1 = new BasicFeatureMap(this, XDDPackage.TPARAMETER_GROUP__GROUP1);
		}
		return group1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TParameterGroup> getParameterGroup() {
		return getGroup1().list(XDDPackage.eINSTANCE.getTParameterGroup_ParameterGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterRefType> getParameterRef() {
		return getGroup1().list(XDDPackage.eINSTANCE.getTParameterGroup_ParameterRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getBitOffset() {
		return bitOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitOffset(BigInteger newBitOffset) {
		BigInteger oldBitOffset = bitOffset;
		bitOffset = newBitOffset;
		boolean oldBitOffsetESet = bitOffsetESet;
		bitOffsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TPARAMETER_GROUP__BIT_OFFSET, oldBitOffset, bitOffset, !oldBitOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBitOffset() {
		BigInteger oldBitOffset = bitOffset;
		boolean oldBitOffsetESet = bitOffsetESet;
		bitOffset = BIT_OFFSET_EDEFAULT;
		bitOffsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TPARAMETER_GROUP__BIT_OFFSET, oldBitOffset, BIT_OFFSET_EDEFAULT, oldBitOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBitOffset() {
		return bitOffsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionalUniqueIDRef() {
		return conditionalUniqueIDRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionalUniqueIDRef(String newConditionalUniqueIDRef) {
		String oldConditionalUniqueIDRef = conditionalUniqueIDRef;
		conditionalUniqueIDRef = newConditionalUniqueIDRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TPARAMETER_GROUP__CONDITIONAL_UNIQUE_ID_REF, oldConditionalUniqueIDRef, conditionalUniqueIDRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionalValue() {
		return conditionalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionalValue(String newConditionalValue) {
		String oldConditionalValue = conditionalValue;
		conditionalValue = newConditionalValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TPARAMETER_GROUP__CONDITIONAL_VALUE, oldConditionalValue, conditionalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConfigParameter() {
		return configParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigParameter(boolean newConfigParameter) {
		boolean oldConfigParameter = configParameter;
		configParameter = newConfigParameter;
		boolean oldConfigParameterESet = configParameterESet;
		configParameterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TPARAMETER_GROUP__CONFIG_PARAMETER, oldConfigParameter, configParameter, !oldConfigParameterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConfigParameter() {
		boolean oldConfigParameter = configParameter;
		boolean oldConfigParameterESet = configParameterESet;
		configParameter = CONFIG_PARAMETER_EDEFAULT;
		configParameterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TPARAMETER_GROUP__CONFIG_PARAMETER, oldConfigParameter, CONFIG_PARAMETER_EDEFAULT, oldConfigParameterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConfigParameter() {
		return configParameterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGroupLevelVisible() {
		return groupLevelVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupLevelVisible(boolean newGroupLevelVisible) {
		boolean oldGroupLevelVisible = groupLevelVisible;
		groupLevelVisible = newGroupLevelVisible;
		boolean oldGroupLevelVisibleESet = groupLevelVisibleESet;
		groupLevelVisibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TPARAMETER_GROUP__GROUP_LEVEL_VISIBLE, oldGroupLevelVisible, groupLevelVisible, !oldGroupLevelVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGroupLevelVisible() {
		boolean oldGroupLevelVisible = groupLevelVisible;
		boolean oldGroupLevelVisibleESet = groupLevelVisibleESet;
		groupLevelVisible = GROUP_LEVEL_VISIBLE_EDEFAULT;
		groupLevelVisibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TPARAMETER_GROUP__GROUP_LEVEL_VISIBLE, oldGroupLevelVisible, GROUP_LEVEL_VISIBLE_EDEFAULT, oldGroupLevelVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGroupLevelVisible() {
		return groupLevelVisibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKindOfAccess() {
		return kindOfAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKindOfAccess(String newKindOfAccess) {
		String oldKindOfAccess = kindOfAccess;
		kindOfAccess = newKindOfAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TPARAMETER_GROUP__KIND_OF_ACCESS, oldKindOfAccess, kindOfAccess));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TPARAMETER_GROUP__UNIQUE_ID, oldUniqueID, uniqueID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XDDPackage.TPARAMETER_GROUP__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XDDPackage.TPARAMETER_GROUP__LABEL:
				return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
			case XDDPackage.TPARAMETER_GROUP__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case XDDPackage.TPARAMETER_GROUP__LABEL_REF:
				return ((InternalEList<?>)getLabelRef()).basicRemove(otherEnd, msgs);
			case XDDPackage.TPARAMETER_GROUP__DESCRIPTION_REF:
				return ((InternalEList<?>)getDescriptionRef()).basicRemove(otherEnd, msgs);
			case XDDPackage.TPARAMETER_GROUP__GROUP1:
				return ((InternalEList<?>)getGroup1()).basicRemove(otherEnd, msgs);
			case XDDPackage.TPARAMETER_GROUP__PARAMETER_GROUP:
				return ((InternalEList<?>)getParameterGroup()).basicRemove(otherEnd, msgs);
			case XDDPackage.TPARAMETER_GROUP__PARAMETER_REF:
				return ((InternalEList<?>)getParameterRef()).basicRemove(otherEnd, msgs);
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
			case XDDPackage.TPARAMETER_GROUP__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XDDPackage.TPARAMETER_GROUP__LABEL:
				return getLabel();
			case XDDPackage.TPARAMETER_GROUP__DESCRIPTION:
				return getDescription();
			case XDDPackage.TPARAMETER_GROUP__LABEL_REF:
				return getLabelRef();
			case XDDPackage.TPARAMETER_GROUP__DESCRIPTION_REF:
				return getDescriptionRef();
			case XDDPackage.TPARAMETER_GROUP__GROUP1:
				if (coreType) return getGroup1();
				return ((FeatureMap.Internal)getGroup1()).getWrapper();
			case XDDPackage.TPARAMETER_GROUP__PARAMETER_GROUP:
				return getParameterGroup();
			case XDDPackage.TPARAMETER_GROUP__PARAMETER_REF:
				return getParameterRef();
			case XDDPackage.TPARAMETER_GROUP__BIT_OFFSET:
				return getBitOffset();
			case XDDPackage.TPARAMETER_GROUP__CONDITIONAL_UNIQUE_ID_REF:
				return getConditionalUniqueIDRef();
			case XDDPackage.TPARAMETER_GROUP__CONDITIONAL_VALUE:
				return getConditionalValue();
			case XDDPackage.TPARAMETER_GROUP__CONFIG_PARAMETER:
				return isConfigParameter();
			case XDDPackage.TPARAMETER_GROUP__GROUP_LEVEL_VISIBLE:
				return isGroupLevelVisible();
			case XDDPackage.TPARAMETER_GROUP__KIND_OF_ACCESS:
				return getKindOfAccess();
			case XDDPackage.TPARAMETER_GROUP__UNIQUE_ID:
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
			case XDDPackage.TPARAMETER_GROUP__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XDDPackage.TPARAMETER_GROUP__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection<? extends LabelType>)newValue);
				return;
			case XDDPackage.TPARAMETER_GROUP__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case XDDPackage.TPARAMETER_GROUP__LABEL_REF:
				getLabelRef().clear();
				getLabelRef().addAll((Collection<? extends LabelRefType>)newValue);
				return;
			case XDDPackage.TPARAMETER_GROUP__DESCRIPTION_REF:
				getDescriptionRef().clear();
				getDescriptionRef().addAll((Collection<? extends DescriptionRefType>)newValue);
				return;
			case XDDPackage.TPARAMETER_GROUP__GROUP1:
				((FeatureMap.Internal)getGroup1()).set(newValue);
				return;
			case XDDPackage.TPARAMETER_GROUP__PARAMETER_GROUP:
				getParameterGroup().clear();
				getParameterGroup().addAll((Collection<? extends TParameterGroup>)newValue);
				return;
			case XDDPackage.TPARAMETER_GROUP__PARAMETER_REF:
				getParameterRef().clear();
				getParameterRef().addAll((Collection<? extends ParameterRefType>)newValue);
				return;
			case XDDPackage.TPARAMETER_GROUP__BIT_OFFSET:
				setBitOffset((BigInteger)newValue);
				return;
			case XDDPackage.TPARAMETER_GROUP__CONDITIONAL_UNIQUE_ID_REF:
				setConditionalUniqueIDRef((String)newValue);
				return;
			case XDDPackage.TPARAMETER_GROUP__CONDITIONAL_VALUE:
				setConditionalValue((String)newValue);
				return;
			case XDDPackage.TPARAMETER_GROUP__CONFIG_PARAMETER:
				setConfigParameter((Boolean)newValue);
				return;
			case XDDPackage.TPARAMETER_GROUP__GROUP_LEVEL_VISIBLE:
				setGroupLevelVisible((Boolean)newValue);
				return;
			case XDDPackage.TPARAMETER_GROUP__KIND_OF_ACCESS:
				setKindOfAccess((String)newValue);
				return;
			case XDDPackage.TPARAMETER_GROUP__UNIQUE_ID:
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
			case XDDPackage.TPARAMETER_GROUP__GROUP:
				getGroup().clear();
				return;
			case XDDPackage.TPARAMETER_GROUP__LABEL:
				getLabel().clear();
				return;
			case XDDPackage.TPARAMETER_GROUP__DESCRIPTION:
				getDescription().clear();
				return;
			case XDDPackage.TPARAMETER_GROUP__LABEL_REF:
				getLabelRef().clear();
				return;
			case XDDPackage.TPARAMETER_GROUP__DESCRIPTION_REF:
				getDescriptionRef().clear();
				return;
			case XDDPackage.TPARAMETER_GROUP__GROUP1:
				getGroup1().clear();
				return;
			case XDDPackage.TPARAMETER_GROUP__PARAMETER_GROUP:
				getParameterGroup().clear();
				return;
			case XDDPackage.TPARAMETER_GROUP__PARAMETER_REF:
				getParameterRef().clear();
				return;
			case XDDPackage.TPARAMETER_GROUP__BIT_OFFSET:
				unsetBitOffset();
				return;
			case XDDPackage.TPARAMETER_GROUP__CONDITIONAL_UNIQUE_ID_REF:
				setConditionalUniqueIDRef(CONDITIONAL_UNIQUE_ID_REF_EDEFAULT);
				return;
			case XDDPackage.TPARAMETER_GROUP__CONDITIONAL_VALUE:
				setConditionalValue(CONDITIONAL_VALUE_EDEFAULT);
				return;
			case XDDPackage.TPARAMETER_GROUP__CONFIG_PARAMETER:
				unsetConfigParameter();
				return;
			case XDDPackage.TPARAMETER_GROUP__GROUP_LEVEL_VISIBLE:
				unsetGroupLevelVisible();
				return;
			case XDDPackage.TPARAMETER_GROUP__KIND_OF_ACCESS:
				setKindOfAccess(KIND_OF_ACCESS_EDEFAULT);
				return;
			case XDDPackage.TPARAMETER_GROUP__UNIQUE_ID:
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
			case XDDPackage.TPARAMETER_GROUP__GROUP:
				return group != null && !group.isEmpty();
			case XDDPackage.TPARAMETER_GROUP__LABEL:
				return !getLabel().isEmpty();
			case XDDPackage.TPARAMETER_GROUP__DESCRIPTION:
				return !getDescription().isEmpty();
			case XDDPackage.TPARAMETER_GROUP__LABEL_REF:
				return !getLabelRef().isEmpty();
			case XDDPackage.TPARAMETER_GROUP__DESCRIPTION_REF:
				return !getDescriptionRef().isEmpty();
			case XDDPackage.TPARAMETER_GROUP__GROUP1:
				return group1 != null && !group1.isEmpty();
			case XDDPackage.TPARAMETER_GROUP__PARAMETER_GROUP:
				return !getParameterGroup().isEmpty();
			case XDDPackage.TPARAMETER_GROUP__PARAMETER_REF:
				return !getParameterRef().isEmpty();
			case XDDPackage.TPARAMETER_GROUP__BIT_OFFSET:
				return isSetBitOffset();
			case XDDPackage.TPARAMETER_GROUP__CONDITIONAL_UNIQUE_ID_REF:
				return CONDITIONAL_UNIQUE_ID_REF_EDEFAULT == null ? conditionalUniqueIDRef != null : !CONDITIONAL_UNIQUE_ID_REF_EDEFAULT.equals(conditionalUniqueIDRef);
			case XDDPackage.TPARAMETER_GROUP__CONDITIONAL_VALUE:
				return CONDITIONAL_VALUE_EDEFAULT == null ? conditionalValue != null : !CONDITIONAL_VALUE_EDEFAULT.equals(conditionalValue);
			case XDDPackage.TPARAMETER_GROUP__CONFIG_PARAMETER:
				return isSetConfigParameter();
			case XDDPackage.TPARAMETER_GROUP__GROUP_LEVEL_VISIBLE:
				return isSetGroupLevelVisible();
			case XDDPackage.TPARAMETER_GROUP__KIND_OF_ACCESS:
				return KIND_OF_ACCESS_EDEFAULT == null ? kindOfAccess != null : !KIND_OF_ACCESS_EDEFAULT.equals(kindOfAccess);
			case XDDPackage.TPARAMETER_GROUP__UNIQUE_ID:
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
		result.append(", group1: ");
		result.append(group1);
		result.append(", bitOffset: ");
		if (bitOffsetESet) result.append(bitOffset); else result.append("<unset>");
		result.append(", conditionalUniqueIDRef: ");
		result.append(conditionalUniqueIDRef);
		result.append(", conditionalValue: ");
		result.append(conditionalValue);
		result.append(", configParameter: ");
		if (configParameterESet) result.append(configParameter); else result.append("<unset>");
		result.append(", groupLevelVisible: ");
		if (groupLevelVisibleESet) result.append(groupLevelVisible); else result.append("<unset>");
		result.append(", kindOfAccess: ");
		result.append(kindOfAccess);
		result.append(", uniqueID: ");
		result.append(uniqueID);
		result.append(')');
		return result.toString();
	}

} //TParameterGroupImpl
