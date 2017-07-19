/**
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.br_automation.buoat.xddeditor.XDD.TCNFeatures;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TCN Features</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TCNFeaturesImpl#isDLLCNFeatureMultiplex <em>DLLCN Feature Multiplex</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TCNFeaturesImpl#isDLLCNPResChaining <em>DLLCNP Res Chaining</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TCNFeaturesImpl#isNMTCNDNA <em>NMTCNDNA</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TCNFeaturesImpl#getNMTCNMaxAInv <em>NMTCN Max AInv</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TCNFeaturesImpl#getNMTCNPreOp2ToReady2Op <em>NMTCN Pre Op2 To Ready2 Op</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TCNFeaturesImpl#getNMTCNSetNodeNumberTime <em>NMTCN Set Node Number Time</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TCNFeaturesImpl#getNMTCNSoC2PReq <em>NMTCN So C2P Req</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TCNFeaturesImpl extends EObjectImpl implements TCNFeatures {
	/**
	 * The default value of the '{@link #isDLLCNFeatureMultiplex() <em>DLLCN Feature Multiplex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDLLCNFeatureMultiplex()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DLLCN_FEATURE_MULTIPLEX_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDLLCNFeatureMultiplex() <em>DLLCN Feature Multiplex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDLLCNFeatureMultiplex()
	 * @generated
	 * @ordered
	 */
	protected boolean dLLCNFeatureMultiplex = DLLCN_FEATURE_MULTIPLEX_EDEFAULT;

	/**
	 * This is true if the DLLCN Feature Multiplex attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dLLCNFeatureMultiplexESet;

	/**
	 * The default value of the '{@link #isDLLCNPResChaining() <em>DLLCNP Res Chaining</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDLLCNPResChaining()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DLLCNP_RES_CHAINING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDLLCNPResChaining() <em>DLLCNP Res Chaining</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDLLCNPResChaining()
	 * @generated
	 * @ordered
	 */
	protected boolean dLLCNPResChaining = DLLCNP_RES_CHAINING_EDEFAULT;

	/**
	 * This is true if the DLLCNP Res Chaining attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dLLCNPResChainingESet;

	/**
	 * The default value of the '{@link #isNMTCNDNA() <em>NMTCNDNA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTCNDNA()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NMTCNDNA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNMTCNDNA() <em>NMTCNDNA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTCNDNA()
	 * @generated
	 * @ordered
	 */
	protected boolean nMTCNDNA = NMTCNDNA_EDEFAULT;

	/**
	 * This is true if the NMTCNDNA attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTCNDNAESet;

	/**
	 * The default value of the '{@link #getNMTCNMaxAInv() <em>NMTCN Max AInv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTCNMaxAInv()
	 * @generated
	 * @ordered
	 */
	protected static final long NMTCN_MAX_AINV_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNMTCNMaxAInv() <em>NMTCN Max AInv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTCNMaxAInv()
	 * @generated
	 * @ordered
	 */
	protected long nMTCNMaxAInv = NMTCN_MAX_AINV_EDEFAULT;

	/**
	 * This is true if the NMTCN Max AInv attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTCNMaxAInvESet;

	/**
	 * The default value of the '{@link #getNMTCNPreOp2ToReady2Op() <em>NMTCN Pre Op2 To Ready2 Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTCNPreOp2ToReady2Op()
	 * @generated
	 * @ordered
	 */
	protected static final long NMTCN_PRE_OP2_TO_READY2_OP_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNMTCNPreOp2ToReady2Op() <em>NMTCN Pre Op2 To Ready2 Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTCNPreOp2ToReady2Op()
	 * @generated
	 * @ordered
	 */
	protected long nMTCNPreOp2ToReady2Op = NMTCN_PRE_OP2_TO_READY2_OP_EDEFAULT;

	/**
	 * This is true if the NMTCN Pre Op2 To Ready2 Op attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTCNPreOp2ToReady2OpESet;

	/**
	 * The default value of the '{@link #getNMTCNSetNodeNumberTime() <em>NMTCN Set Node Number Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTCNSetNodeNumberTime()
	 * @generated
	 * @ordered
	 */
	protected static final long NMTCN_SET_NODE_NUMBER_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNMTCNSetNodeNumberTime() <em>NMTCN Set Node Number Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTCNSetNodeNumberTime()
	 * @generated
	 * @ordered
	 */
	protected long nMTCNSetNodeNumberTime = NMTCN_SET_NODE_NUMBER_TIME_EDEFAULT;

	/**
	 * This is true if the NMTCN Set Node Number Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTCNSetNodeNumberTimeESet;

	/**
	 * The default value of the '{@link #getNMTCNSoC2PReq() <em>NMTCN So C2P Req</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTCNSoC2PReq()
	 * @generated
	 * @ordered
	 */
	protected static final long NMTCN_SO_C2P_REQ_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNMTCNSoC2PReq() <em>NMTCN So C2P Req</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTCNSoC2PReq()
	 * @generated
	 * @ordered
	 */
	protected long nMTCNSoC2PReq = NMTCN_SO_C2P_REQ_EDEFAULT;

	/**
	 * This is true if the NMTCN So C2P Req attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTCNSoC2PReqESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCNFeaturesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XDDPackage.eINSTANCE.getTCNFeatures();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDLLCNFeatureMultiplex() {
		return dLLCNFeatureMultiplex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDLLCNFeatureMultiplex(boolean newDLLCNFeatureMultiplex) {
		boolean oldDLLCNFeatureMultiplex = dLLCNFeatureMultiplex;
		dLLCNFeatureMultiplex = newDLLCNFeatureMultiplex;
		boolean oldDLLCNFeatureMultiplexESet = dLLCNFeatureMultiplexESet;
		dLLCNFeatureMultiplexESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TCN_FEATURES__DLLCN_FEATURE_MULTIPLEX, oldDLLCNFeatureMultiplex, dLLCNFeatureMultiplex, !oldDLLCNFeatureMultiplexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDLLCNFeatureMultiplex() {
		boolean oldDLLCNFeatureMultiplex = dLLCNFeatureMultiplex;
		boolean oldDLLCNFeatureMultiplexESet = dLLCNFeatureMultiplexESet;
		dLLCNFeatureMultiplex = DLLCN_FEATURE_MULTIPLEX_EDEFAULT;
		dLLCNFeatureMultiplexESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TCN_FEATURES__DLLCN_FEATURE_MULTIPLEX, oldDLLCNFeatureMultiplex, DLLCN_FEATURE_MULTIPLEX_EDEFAULT, oldDLLCNFeatureMultiplexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDLLCNFeatureMultiplex() {
		return dLLCNFeatureMultiplexESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDLLCNPResChaining() {
		return dLLCNPResChaining;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDLLCNPResChaining(boolean newDLLCNPResChaining) {
		boolean oldDLLCNPResChaining = dLLCNPResChaining;
		dLLCNPResChaining = newDLLCNPResChaining;
		boolean oldDLLCNPResChainingESet = dLLCNPResChainingESet;
		dLLCNPResChainingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TCN_FEATURES__DLLCNP_RES_CHAINING, oldDLLCNPResChaining, dLLCNPResChaining, !oldDLLCNPResChainingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDLLCNPResChaining() {
		boolean oldDLLCNPResChaining = dLLCNPResChaining;
		boolean oldDLLCNPResChainingESet = dLLCNPResChainingESet;
		dLLCNPResChaining = DLLCNP_RES_CHAINING_EDEFAULT;
		dLLCNPResChainingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TCN_FEATURES__DLLCNP_RES_CHAINING, oldDLLCNPResChaining, DLLCNP_RES_CHAINING_EDEFAULT, oldDLLCNPResChainingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDLLCNPResChaining() {
		return dLLCNPResChainingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNMTCNDNA() {
		return nMTCNDNA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTCNDNA(boolean newNMTCNDNA) {
		boolean oldNMTCNDNA = nMTCNDNA;
		nMTCNDNA = newNMTCNDNA;
		boolean oldNMTCNDNAESet = nMTCNDNAESet;
		nMTCNDNAESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TCN_FEATURES__NMTCNDNA, oldNMTCNDNA, nMTCNDNA, !oldNMTCNDNAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTCNDNA() {
		boolean oldNMTCNDNA = nMTCNDNA;
		boolean oldNMTCNDNAESet = nMTCNDNAESet;
		nMTCNDNA = NMTCNDNA_EDEFAULT;
		nMTCNDNAESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TCN_FEATURES__NMTCNDNA, oldNMTCNDNA, NMTCNDNA_EDEFAULT, oldNMTCNDNAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTCNDNA() {
		return nMTCNDNAESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNMTCNMaxAInv() {
		return nMTCNMaxAInv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTCNMaxAInv(long newNMTCNMaxAInv) {
		long oldNMTCNMaxAInv = nMTCNMaxAInv;
		nMTCNMaxAInv = newNMTCNMaxAInv;
		boolean oldNMTCNMaxAInvESet = nMTCNMaxAInvESet;
		nMTCNMaxAInvESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TCN_FEATURES__NMTCN_MAX_AINV, oldNMTCNMaxAInv, nMTCNMaxAInv, !oldNMTCNMaxAInvESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTCNMaxAInv() {
		long oldNMTCNMaxAInv = nMTCNMaxAInv;
		boolean oldNMTCNMaxAInvESet = nMTCNMaxAInvESet;
		nMTCNMaxAInv = NMTCN_MAX_AINV_EDEFAULT;
		nMTCNMaxAInvESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TCN_FEATURES__NMTCN_MAX_AINV, oldNMTCNMaxAInv, NMTCN_MAX_AINV_EDEFAULT, oldNMTCNMaxAInvESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTCNMaxAInv() {
		return nMTCNMaxAInvESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNMTCNPreOp2ToReady2Op() {
		return nMTCNPreOp2ToReady2Op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTCNPreOp2ToReady2Op(long newNMTCNPreOp2ToReady2Op) {
		long oldNMTCNPreOp2ToReady2Op = nMTCNPreOp2ToReady2Op;
		nMTCNPreOp2ToReady2Op = newNMTCNPreOp2ToReady2Op;
		boolean oldNMTCNPreOp2ToReady2OpESet = nMTCNPreOp2ToReady2OpESet;
		nMTCNPreOp2ToReady2OpESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TCN_FEATURES__NMTCN_PRE_OP2_TO_READY2_OP, oldNMTCNPreOp2ToReady2Op, nMTCNPreOp2ToReady2Op, !oldNMTCNPreOp2ToReady2OpESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTCNPreOp2ToReady2Op() {
		long oldNMTCNPreOp2ToReady2Op = nMTCNPreOp2ToReady2Op;
		boolean oldNMTCNPreOp2ToReady2OpESet = nMTCNPreOp2ToReady2OpESet;
		nMTCNPreOp2ToReady2Op = NMTCN_PRE_OP2_TO_READY2_OP_EDEFAULT;
		nMTCNPreOp2ToReady2OpESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TCN_FEATURES__NMTCN_PRE_OP2_TO_READY2_OP, oldNMTCNPreOp2ToReady2Op, NMTCN_PRE_OP2_TO_READY2_OP_EDEFAULT, oldNMTCNPreOp2ToReady2OpESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTCNPreOp2ToReady2Op() {
		return nMTCNPreOp2ToReady2OpESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNMTCNSetNodeNumberTime() {
		return nMTCNSetNodeNumberTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTCNSetNodeNumberTime(long newNMTCNSetNodeNumberTime) {
		long oldNMTCNSetNodeNumberTime = nMTCNSetNodeNumberTime;
		nMTCNSetNodeNumberTime = newNMTCNSetNodeNumberTime;
		boolean oldNMTCNSetNodeNumberTimeESet = nMTCNSetNodeNumberTimeESet;
		nMTCNSetNodeNumberTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TCN_FEATURES__NMTCN_SET_NODE_NUMBER_TIME, oldNMTCNSetNodeNumberTime, nMTCNSetNodeNumberTime, !oldNMTCNSetNodeNumberTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTCNSetNodeNumberTime() {
		long oldNMTCNSetNodeNumberTime = nMTCNSetNodeNumberTime;
		boolean oldNMTCNSetNodeNumberTimeESet = nMTCNSetNodeNumberTimeESet;
		nMTCNSetNodeNumberTime = NMTCN_SET_NODE_NUMBER_TIME_EDEFAULT;
		nMTCNSetNodeNumberTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TCN_FEATURES__NMTCN_SET_NODE_NUMBER_TIME, oldNMTCNSetNodeNumberTime, NMTCN_SET_NODE_NUMBER_TIME_EDEFAULT, oldNMTCNSetNodeNumberTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTCNSetNodeNumberTime() {
		return nMTCNSetNodeNumberTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNMTCNSoC2PReq() {
		return nMTCNSoC2PReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTCNSoC2PReq(long newNMTCNSoC2PReq) {
		long oldNMTCNSoC2PReq = nMTCNSoC2PReq;
		nMTCNSoC2PReq = newNMTCNSoC2PReq;
		boolean oldNMTCNSoC2PReqESet = nMTCNSoC2PReqESet;
		nMTCNSoC2PReqESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TCN_FEATURES__NMTCN_SO_C2P_REQ, oldNMTCNSoC2PReq, nMTCNSoC2PReq, !oldNMTCNSoC2PReqESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTCNSoC2PReq() {
		long oldNMTCNSoC2PReq = nMTCNSoC2PReq;
		boolean oldNMTCNSoC2PReqESet = nMTCNSoC2PReqESet;
		nMTCNSoC2PReq = NMTCN_SO_C2P_REQ_EDEFAULT;
		nMTCNSoC2PReqESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TCN_FEATURES__NMTCN_SO_C2P_REQ, oldNMTCNSoC2PReq, NMTCN_SO_C2P_REQ_EDEFAULT, oldNMTCNSoC2PReqESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTCNSoC2PReq() {
		return nMTCNSoC2PReqESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XDDPackage.TCN_FEATURES__DLLCN_FEATURE_MULTIPLEX:
				return isDLLCNFeatureMultiplex();
			case XDDPackage.TCN_FEATURES__DLLCNP_RES_CHAINING:
				return isDLLCNPResChaining();
			case XDDPackage.TCN_FEATURES__NMTCNDNA:
				return isNMTCNDNA();
			case XDDPackage.TCN_FEATURES__NMTCN_MAX_AINV:
				return getNMTCNMaxAInv();
			case XDDPackage.TCN_FEATURES__NMTCN_PRE_OP2_TO_READY2_OP:
				return getNMTCNPreOp2ToReady2Op();
			case XDDPackage.TCN_FEATURES__NMTCN_SET_NODE_NUMBER_TIME:
				return getNMTCNSetNodeNumberTime();
			case XDDPackage.TCN_FEATURES__NMTCN_SO_C2P_REQ:
				return getNMTCNSoC2PReq();
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
			case XDDPackage.TCN_FEATURES__DLLCN_FEATURE_MULTIPLEX:
				setDLLCNFeatureMultiplex((Boolean)newValue);
				return;
			case XDDPackage.TCN_FEATURES__DLLCNP_RES_CHAINING:
				setDLLCNPResChaining((Boolean)newValue);
				return;
			case XDDPackage.TCN_FEATURES__NMTCNDNA:
				setNMTCNDNA((Boolean)newValue);
				return;
			case XDDPackage.TCN_FEATURES__NMTCN_MAX_AINV:
				setNMTCNMaxAInv((Long)newValue);
				return;
			case XDDPackage.TCN_FEATURES__NMTCN_PRE_OP2_TO_READY2_OP:
				setNMTCNPreOp2ToReady2Op((Long)newValue);
				return;
			case XDDPackage.TCN_FEATURES__NMTCN_SET_NODE_NUMBER_TIME:
				setNMTCNSetNodeNumberTime((Long)newValue);
				return;
			case XDDPackage.TCN_FEATURES__NMTCN_SO_C2P_REQ:
				setNMTCNSoC2PReq((Long)newValue);
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
			case XDDPackage.TCN_FEATURES__DLLCN_FEATURE_MULTIPLEX:
				unsetDLLCNFeatureMultiplex();
				return;
			case XDDPackage.TCN_FEATURES__DLLCNP_RES_CHAINING:
				unsetDLLCNPResChaining();
				return;
			case XDDPackage.TCN_FEATURES__NMTCNDNA:
				unsetNMTCNDNA();
				return;
			case XDDPackage.TCN_FEATURES__NMTCN_MAX_AINV:
				unsetNMTCNMaxAInv();
				return;
			case XDDPackage.TCN_FEATURES__NMTCN_PRE_OP2_TO_READY2_OP:
				unsetNMTCNPreOp2ToReady2Op();
				return;
			case XDDPackage.TCN_FEATURES__NMTCN_SET_NODE_NUMBER_TIME:
				unsetNMTCNSetNodeNumberTime();
				return;
			case XDDPackage.TCN_FEATURES__NMTCN_SO_C2P_REQ:
				unsetNMTCNSoC2PReq();
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
			case XDDPackage.TCN_FEATURES__DLLCN_FEATURE_MULTIPLEX:
				return isSetDLLCNFeatureMultiplex();
			case XDDPackage.TCN_FEATURES__DLLCNP_RES_CHAINING:
				return isSetDLLCNPResChaining();
			case XDDPackage.TCN_FEATURES__NMTCNDNA:
				return isSetNMTCNDNA();
			case XDDPackage.TCN_FEATURES__NMTCN_MAX_AINV:
				return isSetNMTCNMaxAInv();
			case XDDPackage.TCN_FEATURES__NMTCN_PRE_OP2_TO_READY2_OP:
				return isSetNMTCNPreOp2ToReady2Op();
			case XDDPackage.TCN_FEATURES__NMTCN_SET_NODE_NUMBER_TIME:
				return isSetNMTCNSetNodeNumberTime();
			case XDDPackage.TCN_FEATURES__NMTCN_SO_C2P_REQ:
				return isSetNMTCNSoC2PReq();
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
		result.append(" (dLLCNFeatureMultiplex: ");
		if (dLLCNFeatureMultiplexESet) result.append(dLLCNFeatureMultiplex); else result.append("<unset>");
		result.append(", dLLCNPResChaining: ");
		if (dLLCNPResChainingESet) result.append(dLLCNPResChaining); else result.append("<unset>");
		result.append(", nMTCNDNA: ");
		if (nMTCNDNAESet) result.append(nMTCNDNA); else result.append("<unset>");
		result.append(", nMTCNMaxAInv: ");
		if (nMTCNMaxAInvESet) result.append(nMTCNMaxAInv); else result.append("<unset>");
		result.append(", nMTCNPreOp2ToReady2Op: ");
		if (nMTCNPreOp2ToReady2OpESet) result.append(nMTCNPreOp2ToReady2Op); else result.append("<unset>");
		result.append(", nMTCNSetNodeNumberTime: ");
		if (nMTCNSetNodeNumberTimeESet) result.append(nMTCNSetNodeNumberTime); else result.append("<unset>");
		result.append(", nMTCNSoC2PReq: ");
		if (nMTCNSoC2PReqESet) result.append(nMTCNSoC2PReq); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TCNFeaturesImpl
