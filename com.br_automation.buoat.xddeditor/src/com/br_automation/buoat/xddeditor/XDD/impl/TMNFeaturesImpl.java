/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.TMNFeatures;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>TMN Features</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TMNFeaturesImpl#isDLLErrMNMultipleMN
 * <em>DLL Err MN Multiple MN</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TMNFeaturesImpl#isDLLMNFeatureMultiplex
 * <em>DLLMN Feature Multiplex</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TMNFeaturesImpl#isDLLMNFeaturePResTx
 * <em>DLLMN Feature PRes Tx</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TMNFeaturesImpl#isDLLMNPResChaining
 * <em>DLLMNP Res Chaining</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TMNFeaturesImpl#getNMTMNASnd2SoC
 * <em>NMTMNA Snd2 So C</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TMNFeaturesImpl#isNMTMNBasicEthernet
 * <em>NMTMN Basic Ethernet</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TMNFeaturesImpl#getNMTMNMultiplCycMax
 * <em>NMTMN Multipl Cyc Max</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TMNFeaturesImpl#getNMTMNPRes2PReq
 * <em>NMTMNP Res2 PReq</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TMNFeaturesImpl#getNMTMNPRes2PRes
 * <em>NMTMNP Res2 PRes</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TMNFeaturesImpl#getNMTMNPResRx2SoA
 * <em>NMTMNP Res Rx2 So A</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TMNFeaturesImpl#getNMTMNPResTx2SoA
 * <em>NMTMNP Res Tx2 So A</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TMNFeaturesImpl#getNMTMNSoA2ASndTx
 * <em>NMTMN So A2A Snd Tx</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TMNFeaturesImpl#getNMTMNSoC2PReq
 * <em>NMTMN So C2P Req</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TMNFeaturesImpl#isNMTNetTime
 * <em>NMT Net Time</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TMNFeaturesImpl#isNMTNetTimeIsRealTime
 * <em>NMT Net Time Is Real Time</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TMNFeaturesImpl#isNMTRelativeTime
 * <em>NMT Relative Time</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TMNFeaturesImpl#isNMTSimpleBoot
 * <em>NMT Simple Boot</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.TMNFeaturesImpl#getPDOTPDOChannels
 * <em>PDOTPDO Channels</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TMNFeaturesImpl extends EObjectImpl implements TMNFeatures {
    /**
     * The default value of the '{@link #isDLLErrMNMultipleMN()
     * <em>DLL Err MN Multiple MN</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isDLLErrMNMultipleMN()
     * @generated
     * @ordered
     */
    protected static final boolean DLL_ERR_MN_MULTIPLE_MN_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isDLLErrMNMultipleMN()
     * <em>DLL Err MN Multiple MN</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isDLLErrMNMultipleMN()
     * @generated
     * @ordered
     */
    protected boolean dLLErrMNMultipleMN = DLL_ERR_MN_MULTIPLE_MN_EDEFAULT;

    /**
     * This is true if the DLL Err MN Multiple MN attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean dLLErrMNMultipleMNESet;

    /**
     * The default value of the '{@link #isDLLMNFeatureMultiplex()
     * <em>DLLMN Feature Multiplex</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #isDLLMNFeatureMultiplex()
     * @generated
     * @ordered
     */
    protected static final boolean DLLMN_FEATURE_MULTIPLEX_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isDLLMNFeatureMultiplex()
     * <em>DLLMN Feature Multiplex</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #isDLLMNFeatureMultiplex()
     * @generated
     * @ordered
     */
    protected boolean dLLMNFeatureMultiplex = DLLMN_FEATURE_MULTIPLEX_EDEFAULT;

    /**
     * This is true if the DLLMN Feature Multiplex attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean dLLMNFeatureMultiplexESet;

    /**
     * The default value of the '{@link #isDLLMNFeaturePResTx()
     * <em>DLLMN Feature PRes Tx</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isDLLMNFeaturePResTx()
     * @generated
     * @ordered
     */
    protected static final boolean DLLMN_FEATURE_PRES_TX_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isDLLMNFeaturePResTx()
     * <em>DLLMN Feature PRes Tx</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isDLLMNFeaturePResTx()
     * @generated
     * @ordered
     */
    protected boolean dLLMNFeaturePResTx = DLLMN_FEATURE_PRES_TX_EDEFAULT;

    /**
     * This is true if the DLLMN Feature PRes Tx attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean dLLMNFeaturePResTxESet;

    /**
     * The default value of the '{@link #isDLLMNPResChaining()
     * <em>DLLMNP Res Chaining</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isDLLMNPResChaining()
     * @generated
     * @ordered
     */
    protected static final boolean DLLMNP_RES_CHAINING_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isDLLMNPResChaining()
     * <em>DLLMNP Res Chaining</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isDLLMNPResChaining()
     * @generated
     * @ordered
     */
    protected boolean dLLMNPResChaining = DLLMNP_RES_CHAINING_EDEFAULT;

    /**
     * This is true if the DLLMNP Res Chaining attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean dLLMNPResChainingESet;

    /**
     * The default value of the '{@link #getNMTMNASnd2SoC()
     * <em>NMTMNA Snd2 So C</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getNMTMNASnd2SoC()
     * @generated
     * @ordered
     */
    protected static final long NMTMNA_SND2_SO_C_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getNMTMNASnd2SoC()
     * <em>NMTMNA Snd2 So C</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getNMTMNASnd2SoC()
     * @generated
     * @ordered
     */
    protected long nMTMNASnd2SoC = NMTMNA_SND2_SO_C_EDEFAULT;

    /**
     * This is true if the NMTMNA Snd2 So C attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean nMTMNASnd2SoCESet;

    /**
     * The default value of the '{@link #isNMTMNBasicEthernet()
     * <em>NMTMN Basic Ethernet</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isNMTMNBasicEthernet()
     * @generated
     * @ordered
     */
    protected static final boolean NMTMN_BASIC_ETHERNET_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isNMTMNBasicEthernet()
     * <em>NMTMN Basic Ethernet</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isNMTMNBasicEthernet()
     * @generated
     * @ordered
     */
    protected boolean nMTMNBasicEthernet = NMTMN_BASIC_ETHERNET_EDEFAULT;

    /**
     * This is true if the NMTMN Basic Ethernet attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean nMTMNBasicEthernetESet;

    /**
     * The default value of the '{@link #getNMTMNMultiplCycMax()
     * <em>NMTMN Multipl Cyc Max</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getNMTMNMultiplCycMax()
     * @generated
     * @ordered
     */
    protected static final short NMTMN_MULTIPL_CYC_MAX_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getNMTMNMultiplCycMax()
     * <em>NMTMN Multipl Cyc Max</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getNMTMNMultiplCycMax()
     * @generated
     * @ordered
     */
    protected short nMTMNMultiplCycMax = NMTMN_MULTIPL_CYC_MAX_EDEFAULT;

    /**
     * This is true if the NMTMN Multipl Cyc Max attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean nMTMNMultiplCycMaxESet;

    /**
     * The default value of the '{@link #getNMTMNPRes2PReq()
     * <em>NMTMNP Res2 PReq</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getNMTMNPRes2PReq()
     * @generated
     * @ordered
     */
    protected static final long NMTMNP_RES2_PREQ_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getNMTMNPRes2PReq()
     * <em>NMTMNP Res2 PReq</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getNMTMNPRes2PReq()
     * @generated
     * @ordered
     */
    protected long nMTMNPRes2PReq = NMTMNP_RES2_PREQ_EDEFAULT;

    /**
     * This is true if the NMTMNP Res2 PReq attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean nMTMNPRes2PReqESet;

    /**
     * The default value of the '{@link #getNMTMNPRes2PRes()
     * <em>NMTMNP Res2 PRes</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getNMTMNPRes2PRes()
     * @generated
     * @ordered
     */
    protected static final long NMTMNP_RES2_PRES_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getNMTMNPRes2PRes()
     * <em>NMTMNP Res2 PRes</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getNMTMNPRes2PRes()
     * @generated
     * @ordered
     */
    protected long nMTMNPRes2PRes = NMTMNP_RES2_PRES_EDEFAULT;

    /**
     * This is true if the NMTMNP Res2 PRes attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean nMTMNPRes2PResESet;

    /**
     * The default value of the '{@link #getNMTMNPResRx2SoA()
     * <em>NMTMNP Res Rx2 So A</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getNMTMNPResRx2SoA()
     * @generated
     * @ordered
     */
    protected static final long NMTMNP_RES_RX2_SO_A_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getNMTMNPResRx2SoA()
     * <em>NMTMNP Res Rx2 So A</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getNMTMNPResRx2SoA()
     * @generated
     * @ordered
     */
    protected long nMTMNPResRx2SoA = NMTMNP_RES_RX2_SO_A_EDEFAULT;

    /**
     * This is true if the NMTMNP Res Rx2 So A attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean nMTMNPResRx2SoAESet;

    /**
     * The default value of the '{@link #getNMTMNPResTx2SoA()
     * <em>NMTMNP Res Tx2 So A</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getNMTMNPResTx2SoA()
     * @generated
     * @ordered
     */
    protected static final long NMTMNP_RES_TX2_SO_A_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getNMTMNPResTx2SoA()
     * <em>NMTMNP Res Tx2 So A</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getNMTMNPResTx2SoA()
     * @generated
     * @ordered
     */
    protected long nMTMNPResTx2SoA = NMTMNP_RES_TX2_SO_A_EDEFAULT;

    /**
     * This is true if the NMTMNP Res Tx2 So A attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean nMTMNPResTx2SoAESet;

    /**
     * The default value of the '{@link #getNMTMNSoA2ASndTx()
     * <em>NMTMN So A2A Snd Tx</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getNMTMNSoA2ASndTx()
     * @generated
     * @ordered
     */
    protected static final long NMTMN_SO_A2A_SND_TX_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getNMTMNSoA2ASndTx()
     * <em>NMTMN So A2A Snd Tx</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getNMTMNSoA2ASndTx()
     * @generated
     * @ordered
     */
    protected long nMTMNSoA2ASndTx = NMTMN_SO_A2A_SND_TX_EDEFAULT;

    /**
     * This is true if the NMTMN So A2A Snd Tx attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean nMTMNSoA2ASndTxESet;

    /**
     * The default value of the '{@link #getNMTMNSoC2PReq()
     * <em>NMTMN So C2P Req</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getNMTMNSoC2PReq()
     * @generated
     * @ordered
     */
    protected static final long NMTMN_SO_C2P_REQ_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getNMTMNSoC2PReq()
     * <em>NMTMN So C2P Req</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getNMTMNSoC2PReq()
     * @generated
     * @ordered
     */
    protected long nMTMNSoC2PReq = NMTMN_SO_C2P_REQ_EDEFAULT;

    /**
     * This is true if the NMTMN So C2P Req attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean nMTMNSoC2PReqESet;

    /**
     * The default value of the '{@link #isNMTNetTime() <em>NMT Net Time</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #isNMTNetTime()
     * @generated
     * @ordered
     */
    protected static final boolean NMT_NET_TIME_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isNMTNetTime() <em>NMT Net Time</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #isNMTNetTime()
     * @generated
     * @ordered
     */
    protected boolean nMTNetTime = NMT_NET_TIME_EDEFAULT;

    /**
     * This is true if the NMT Net Time attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean nMTNetTimeESet;

    /**
     * The default value of the '{@link #isNMTNetTimeIsRealTime()
     * <em>NMT Net Time Is Real Time</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #isNMTNetTimeIsRealTime()
     * @generated
     * @ordered
     */
    protected static final boolean NMT_NET_TIME_IS_REAL_TIME_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isNMTNetTimeIsRealTime()
     * <em>NMT Net Time Is Real Time</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #isNMTNetTimeIsRealTime()
     * @generated
     * @ordered
     */
    protected boolean nMTNetTimeIsRealTime = NMT_NET_TIME_IS_REAL_TIME_EDEFAULT;

    /**
     * This is true if the NMT Net Time Is Real Time attribute has been set.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean nMTNetTimeIsRealTimeESet;

    /**
     * The default value of the '{@link #isNMTRelativeTime()
     * <em>NMT Relative Time</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isNMTRelativeTime()
     * @generated
     * @ordered
     */
    protected static final boolean NMT_RELATIVE_TIME_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isNMTRelativeTime()
     * <em>NMT Relative Time</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isNMTRelativeTime()
     * @generated
     * @ordered
     */
    protected boolean nMTRelativeTime = NMT_RELATIVE_TIME_EDEFAULT;

    /**
     * This is true if the NMT Relative Time attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean nMTRelativeTimeESet;

    /**
     * The default value of the '{@link #isNMTSimpleBoot()
     * <em>NMT Simple Boot</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isNMTSimpleBoot()
     * @generated
     * @ordered
     */
    protected static final boolean NMT_SIMPLE_BOOT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isNMTSimpleBoot()
     * <em>NMT Simple Boot</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isNMTSimpleBoot()
     * @generated
     * @ordered
     */
    protected boolean nMTSimpleBoot = NMT_SIMPLE_BOOT_EDEFAULT;

    /**
     * This is true if the NMT Simple Boot attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean nMTSimpleBootESet;

    /**
     * The default value of the '{@link #getPDOTPDOChannels()
     * <em>PDOTPDO Channels</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getPDOTPDOChannels()
     * @generated
     * @ordered
     */
    protected static final int PDOTPDO_CHANNELS_EDEFAULT = 256;

    /**
     * The cached value of the '{@link #getPDOTPDOChannels()
     * <em>PDOTPDO Channels</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getPDOTPDOChannels()
     * @generated
     * @ordered
     */
    protected int pDOTPDOChannels = PDOTPDO_CHANNELS_EDEFAULT;

    /**
     * This is true if the PDOTPDO Channels attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean pDOTPDOChannelsESet;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TMNFeaturesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getTMNFeatures();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isDLLErrMNMultipleMN() {
        return dLLErrMNMultipleMN;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setDLLErrMNMultipleMN(boolean newDLLErrMNMultipleMN) {
        boolean oldDLLErrMNMultipleMN = dLLErrMNMultipleMN;
        dLLErrMNMultipleMN = newDLLErrMNMultipleMN;
        boolean oldDLLErrMNMultipleMNESet = dLLErrMNMultipleMNESet;
        dLLErrMNMultipleMNESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TMN_FEATURES__DLL_ERR_MN_MULTIPLE_MN, oldDLLErrMNMultipleMN,
                dLLErrMNMultipleMN, !oldDLLErrMNMultipleMNESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetDLLErrMNMultipleMN() {
        boolean oldDLLErrMNMultipleMN = dLLErrMNMultipleMN;
        boolean oldDLLErrMNMultipleMNESet = dLLErrMNMultipleMNESet;
        dLLErrMNMultipleMN = DLL_ERR_MN_MULTIPLE_MN_EDEFAULT;
        dLLErrMNMultipleMNESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.TMN_FEATURES__DLL_ERR_MN_MULTIPLE_MN, oldDLLErrMNMultipleMN,
                DLL_ERR_MN_MULTIPLE_MN_EDEFAULT, oldDLLErrMNMultipleMNESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetDLLErrMNMultipleMN() {
        return dLLErrMNMultipleMNESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isDLLMNFeatureMultiplex() {
        return dLLMNFeatureMultiplex;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setDLLMNFeatureMultiplex(boolean newDLLMNFeatureMultiplex) {
        boolean oldDLLMNFeatureMultiplex = dLLMNFeatureMultiplex;
        dLLMNFeatureMultiplex = newDLLMNFeatureMultiplex;
        boolean oldDLLMNFeatureMultiplexESet = dLLMNFeatureMultiplexESet;
        dLLMNFeatureMultiplexESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TMN_FEATURES__DLLMN_FEATURE_MULTIPLEX, oldDLLMNFeatureMultiplex,
                dLLMNFeatureMultiplex, !oldDLLMNFeatureMultiplexESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetDLLMNFeatureMultiplex() {
        boolean oldDLLMNFeatureMultiplex = dLLMNFeatureMultiplex;
        boolean oldDLLMNFeatureMultiplexESet = dLLMNFeatureMultiplexESet;
        dLLMNFeatureMultiplex = DLLMN_FEATURE_MULTIPLEX_EDEFAULT;
        dLLMNFeatureMultiplexESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.TMN_FEATURES__DLLMN_FEATURE_MULTIPLEX, oldDLLMNFeatureMultiplex,
                DLLMN_FEATURE_MULTIPLEX_EDEFAULT, oldDLLMNFeatureMultiplexESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetDLLMNFeatureMultiplex() {
        return dLLMNFeatureMultiplexESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isDLLMNFeaturePResTx() {
        return dLLMNFeaturePResTx;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setDLLMNFeaturePResTx(boolean newDLLMNFeaturePResTx) {
        boolean oldDLLMNFeaturePResTx = dLLMNFeaturePResTx;
        dLLMNFeaturePResTx = newDLLMNFeaturePResTx;
        boolean oldDLLMNFeaturePResTxESet = dLLMNFeaturePResTxESet;
        dLLMNFeaturePResTxESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TMN_FEATURES__DLLMN_FEATURE_PRES_TX, oldDLLMNFeaturePResTx,
                dLLMNFeaturePResTx, !oldDLLMNFeaturePResTxESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetDLLMNFeaturePResTx() {
        boolean oldDLLMNFeaturePResTx = dLLMNFeaturePResTx;
        boolean oldDLLMNFeaturePResTxESet = dLLMNFeaturePResTxESet;
        dLLMNFeaturePResTx = DLLMN_FEATURE_PRES_TX_EDEFAULT;
        dLLMNFeaturePResTxESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.TMN_FEATURES__DLLMN_FEATURE_PRES_TX, oldDLLMNFeaturePResTx,
                DLLMN_FEATURE_PRES_TX_EDEFAULT, oldDLLMNFeaturePResTxESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetDLLMNFeaturePResTx() {
        return dLLMNFeaturePResTxESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isDLLMNPResChaining() {
        return dLLMNPResChaining;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setDLLMNPResChaining(boolean newDLLMNPResChaining) {
        boolean oldDLLMNPResChaining = dLLMNPResChaining;
        dLLMNPResChaining = newDLLMNPResChaining;
        boolean oldDLLMNPResChainingESet = dLLMNPResChainingESet;
        dLLMNPResChainingESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TMN_FEATURES__DLLMNP_RES_CHAINING, oldDLLMNPResChaining,
                dLLMNPResChaining, !oldDLLMNPResChainingESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetDLLMNPResChaining() {
        boolean oldDLLMNPResChaining = dLLMNPResChaining;
        boolean oldDLLMNPResChainingESet = dLLMNPResChainingESet;
        dLLMNPResChaining = DLLMNP_RES_CHAINING_EDEFAULT;
        dLLMNPResChainingESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.TMN_FEATURES__DLLMNP_RES_CHAINING, oldDLLMNPResChaining,
                DLLMNP_RES_CHAINING_EDEFAULT, oldDLLMNPResChainingESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetDLLMNPResChaining() {
        return dLLMNPResChainingESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public long getNMTMNASnd2SoC() {
        return nMTMNASnd2SoC;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setNMTMNASnd2SoC(long newNMTMNASnd2SoC) {
        long oldNMTMNASnd2SoC = nMTMNASnd2SoC;
        nMTMNASnd2SoC = newNMTMNASnd2SoC;
        boolean oldNMTMNASnd2SoCESet = nMTMNASnd2SoCESet;
        nMTMNASnd2SoCESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TMN_FEATURES__NMTMNA_SND2_SO_C, oldNMTMNASnd2SoC, nMTMNASnd2SoC,
                !oldNMTMNASnd2SoCESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetNMTMNASnd2SoC() {
        long oldNMTMNASnd2SoC = nMTMNASnd2SoC;
        boolean oldNMTMNASnd2SoCESet = nMTMNASnd2SoCESet;
        nMTMNASnd2SoC = NMTMNA_SND2_SO_C_EDEFAULT;
        nMTMNASnd2SoCESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.TMN_FEATURES__NMTMNA_SND2_SO_C, oldNMTMNASnd2SoC,
                NMTMNA_SND2_SO_C_EDEFAULT, oldNMTMNASnd2SoCESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetNMTMNASnd2SoC() {
        return nMTMNASnd2SoCESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isNMTMNBasicEthernet() {
        return nMTMNBasicEthernet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setNMTMNBasicEthernet(boolean newNMTMNBasicEthernet) {
        boolean oldNMTMNBasicEthernet = nMTMNBasicEthernet;
        nMTMNBasicEthernet = newNMTMNBasicEthernet;
        boolean oldNMTMNBasicEthernetESet = nMTMNBasicEthernetESet;
        nMTMNBasicEthernetESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TMN_FEATURES__NMTMN_BASIC_ETHERNET, oldNMTMNBasicEthernet,
                nMTMNBasicEthernet, !oldNMTMNBasicEthernetESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetNMTMNBasicEthernet() {
        boolean oldNMTMNBasicEthernet = nMTMNBasicEthernet;
        boolean oldNMTMNBasicEthernetESet = nMTMNBasicEthernetESet;
        nMTMNBasicEthernet = NMTMN_BASIC_ETHERNET_EDEFAULT;
        nMTMNBasicEthernetESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.TMN_FEATURES__NMTMN_BASIC_ETHERNET, oldNMTMNBasicEthernet,
                NMTMN_BASIC_ETHERNET_EDEFAULT, oldNMTMNBasicEthernetESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetNMTMNBasicEthernet() {
        return nMTMNBasicEthernetESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public short getNMTMNMultiplCycMax() {
        return nMTMNMultiplCycMax;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setNMTMNMultiplCycMax(short newNMTMNMultiplCycMax) {
        short oldNMTMNMultiplCycMax = nMTMNMultiplCycMax;
        nMTMNMultiplCycMax = newNMTMNMultiplCycMax;
        boolean oldNMTMNMultiplCycMaxESet = nMTMNMultiplCycMaxESet;
        nMTMNMultiplCycMaxESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TMN_FEATURES__NMTMN_MULTIPL_CYC_MAX, oldNMTMNMultiplCycMax,
                nMTMNMultiplCycMax, !oldNMTMNMultiplCycMaxESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetNMTMNMultiplCycMax() {
        short oldNMTMNMultiplCycMax = nMTMNMultiplCycMax;
        boolean oldNMTMNMultiplCycMaxESet = nMTMNMultiplCycMaxESet;
        nMTMNMultiplCycMax = NMTMN_MULTIPL_CYC_MAX_EDEFAULT;
        nMTMNMultiplCycMaxESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.TMN_FEATURES__NMTMN_MULTIPL_CYC_MAX, oldNMTMNMultiplCycMax,
                NMTMN_MULTIPL_CYC_MAX_EDEFAULT, oldNMTMNMultiplCycMaxESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetNMTMNMultiplCycMax() {
        return nMTMNMultiplCycMaxESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public long getNMTMNPRes2PReq() {
        return nMTMNPRes2PReq;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setNMTMNPRes2PReq(long newNMTMNPRes2PReq) {
        long oldNMTMNPRes2PReq = nMTMNPRes2PReq;
        nMTMNPRes2PReq = newNMTMNPRes2PReq;
        boolean oldNMTMNPRes2PReqESet = nMTMNPRes2PReqESet;
        nMTMNPRes2PReqESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TMN_FEATURES__NMTMNP_RES2_PREQ, oldNMTMNPRes2PReq, nMTMNPRes2PReq,
                !oldNMTMNPRes2PReqESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetNMTMNPRes2PReq() {
        long oldNMTMNPRes2PReq = nMTMNPRes2PReq;
        boolean oldNMTMNPRes2PReqESet = nMTMNPRes2PReqESet;
        nMTMNPRes2PReq = NMTMNP_RES2_PREQ_EDEFAULT;
        nMTMNPRes2PReqESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.TMN_FEATURES__NMTMNP_RES2_PREQ, oldNMTMNPRes2PReq,
                NMTMNP_RES2_PREQ_EDEFAULT, oldNMTMNPRes2PReqESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetNMTMNPRes2PReq() {
        return nMTMNPRes2PReqESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public long getNMTMNPRes2PRes() {
        return nMTMNPRes2PRes;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setNMTMNPRes2PRes(long newNMTMNPRes2PRes) {
        long oldNMTMNPRes2PRes = nMTMNPRes2PRes;
        nMTMNPRes2PRes = newNMTMNPRes2PRes;
        boolean oldNMTMNPRes2PResESet = nMTMNPRes2PResESet;
        nMTMNPRes2PResESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TMN_FEATURES__NMTMNP_RES2_PRES, oldNMTMNPRes2PRes, nMTMNPRes2PRes,
                !oldNMTMNPRes2PResESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetNMTMNPRes2PRes() {
        long oldNMTMNPRes2PRes = nMTMNPRes2PRes;
        boolean oldNMTMNPRes2PResESet = nMTMNPRes2PResESet;
        nMTMNPRes2PRes = NMTMNP_RES2_PRES_EDEFAULT;
        nMTMNPRes2PResESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.TMN_FEATURES__NMTMNP_RES2_PRES, oldNMTMNPRes2PRes,
                NMTMNP_RES2_PRES_EDEFAULT, oldNMTMNPRes2PResESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetNMTMNPRes2PRes() {
        return nMTMNPRes2PResESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public long getNMTMNPResRx2SoA() {
        return nMTMNPResRx2SoA;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setNMTMNPResRx2SoA(long newNMTMNPResRx2SoA) {
        long oldNMTMNPResRx2SoA = nMTMNPResRx2SoA;
        nMTMNPResRx2SoA = newNMTMNPResRx2SoA;
        boolean oldNMTMNPResRx2SoAESet = nMTMNPResRx2SoAESet;
        nMTMNPResRx2SoAESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TMN_FEATURES__NMTMNP_RES_RX2_SO_A, oldNMTMNPResRx2SoA, nMTMNPResRx2SoA,
                !oldNMTMNPResRx2SoAESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetNMTMNPResRx2SoA() {
        long oldNMTMNPResRx2SoA = nMTMNPResRx2SoA;
        boolean oldNMTMNPResRx2SoAESet = nMTMNPResRx2SoAESet;
        nMTMNPResRx2SoA = NMTMNP_RES_RX2_SO_A_EDEFAULT;
        nMTMNPResRx2SoAESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.TMN_FEATURES__NMTMNP_RES_RX2_SO_A, oldNMTMNPResRx2SoA,
                NMTMNP_RES_RX2_SO_A_EDEFAULT, oldNMTMNPResRx2SoAESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetNMTMNPResRx2SoA() {
        return nMTMNPResRx2SoAESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public long getNMTMNPResTx2SoA() {
        return nMTMNPResTx2SoA;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setNMTMNPResTx2SoA(long newNMTMNPResTx2SoA) {
        long oldNMTMNPResTx2SoA = nMTMNPResTx2SoA;
        nMTMNPResTx2SoA = newNMTMNPResTx2SoA;
        boolean oldNMTMNPResTx2SoAESet = nMTMNPResTx2SoAESet;
        nMTMNPResTx2SoAESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TMN_FEATURES__NMTMNP_RES_TX2_SO_A, oldNMTMNPResTx2SoA, nMTMNPResTx2SoA,
                !oldNMTMNPResTx2SoAESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetNMTMNPResTx2SoA() {
        long oldNMTMNPResTx2SoA = nMTMNPResTx2SoA;
        boolean oldNMTMNPResTx2SoAESet = nMTMNPResTx2SoAESet;
        nMTMNPResTx2SoA = NMTMNP_RES_TX2_SO_A_EDEFAULT;
        nMTMNPResTx2SoAESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.TMN_FEATURES__NMTMNP_RES_TX2_SO_A, oldNMTMNPResTx2SoA,
                NMTMNP_RES_TX2_SO_A_EDEFAULT, oldNMTMNPResTx2SoAESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetNMTMNPResTx2SoA() {
        return nMTMNPResTx2SoAESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public long getNMTMNSoA2ASndTx() {
        return nMTMNSoA2ASndTx;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setNMTMNSoA2ASndTx(long newNMTMNSoA2ASndTx) {
        long oldNMTMNSoA2ASndTx = nMTMNSoA2ASndTx;
        nMTMNSoA2ASndTx = newNMTMNSoA2ASndTx;
        boolean oldNMTMNSoA2ASndTxESet = nMTMNSoA2ASndTxESet;
        nMTMNSoA2ASndTxESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TMN_FEATURES__NMTMN_SO_A2A_SND_TX, oldNMTMNSoA2ASndTx, nMTMNSoA2ASndTx,
                !oldNMTMNSoA2ASndTxESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetNMTMNSoA2ASndTx() {
        long oldNMTMNSoA2ASndTx = nMTMNSoA2ASndTx;
        boolean oldNMTMNSoA2ASndTxESet = nMTMNSoA2ASndTxESet;
        nMTMNSoA2ASndTx = NMTMN_SO_A2A_SND_TX_EDEFAULT;
        nMTMNSoA2ASndTxESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.TMN_FEATURES__NMTMN_SO_A2A_SND_TX, oldNMTMNSoA2ASndTx,
                NMTMN_SO_A2A_SND_TX_EDEFAULT, oldNMTMNSoA2ASndTxESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetNMTMNSoA2ASndTx() {
        return nMTMNSoA2ASndTxESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public long getNMTMNSoC2PReq() {
        return nMTMNSoC2PReq;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setNMTMNSoC2PReq(long newNMTMNSoC2PReq) {
        long oldNMTMNSoC2PReq = nMTMNSoC2PReq;
        nMTMNSoC2PReq = newNMTMNSoC2PReq;
        boolean oldNMTMNSoC2PReqESet = nMTMNSoC2PReqESet;
        nMTMNSoC2PReqESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TMN_FEATURES__NMTMN_SO_C2P_REQ, oldNMTMNSoC2PReq, nMTMNSoC2PReq,
                !oldNMTMNSoC2PReqESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetNMTMNSoC2PReq() {
        long oldNMTMNSoC2PReq = nMTMNSoC2PReq;
        boolean oldNMTMNSoC2PReqESet = nMTMNSoC2PReqESet;
        nMTMNSoC2PReq = NMTMN_SO_C2P_REQ_EDEFAULT;
        nMTMNSoC2PReqESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.TMN_FEATURES__NMTMN_SO_C2P_REQ, oldNMTMNSoC2PReq,
                NMTMN_SO_C2P_REQ_EDEFAULT, oldNMTMNSoC2PReqESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetNMTMNSoC2PReq() {
        return nMTMNSoC2PReqESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isNMTNetTime() {
        return nMTNetTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setNMTNetTime(boolean newNMTNetTime) {
        boolean oldNMTNetTime = nMTNetTime;
        nMTNetTime = newNMTNetTime;
        boolean oldNMTNetTimeESet = nMTNetTimeESet;
        nMTNetTimeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TMN_FEATURES__NMT_NET_TIME, oldNMTNetTime, nMTNetTime,
                !oldNMTNetTimeESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetNMTNetTime() {
        boolean oldNMTNetTime = nMTNetTime;
        boolean oldNMTNetTimeESet = nMTNetTimeESet;
        nMTNetTime = NMT_NET_TIME_EDEFAULT;
        nMTNetTimeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.TMN_FEATURES__NMT_NET_TIME, oldNMTNetTime, NMT_NET_TIME_EDEFAULT,
                oldNMTNetTimeESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetNMTNetTime() {
        return nMTNetTimeESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isNMTNetTimeIsRealTime() {
        return nMTNetTimeIsRealTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setNMTNetTimeIsRealTime(boolean newNMTNetTimeIsRealTime) {
        boolean oldNMTNetTimeIsRealTime = nMTNetTimeIsRealTime;
        nMTNetTimeIsRealTime = newNMTNetTimeIsRealTime;
        boolean oldNMTNetTimeIsRealTimeESet = nMTNetTimeIsRealTimeESet;
        nMTNetTimeIsRealTimeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TMN_FEATURES__NMT_NET_TIME_IS_REAL_TIME, oldNMTNetTimeIsRealTime,
                nMTNetTimeIsRealTime, !oldNMTNetTimeIsRealTimeESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetNMTNetTimeIsRealTime() {
        boolean oldNMTNetTimeIsRealTime = nMTNetTimeIsRealTime;
        boolean oldNMTNetTimeIsRealTimeESet = nMTNetTimeIsRealTimeESet;
        nMTNetTimeIsRealTime = NMT_NET_TIME_IS_REAL_TIME_EDEFAULT;
        nMTNetTimeIsRealTimeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.TMN_FEATURES__NMT_NET_TIME_IS_REAL_TIME, oldNMTNetTimeIsRealTime,
                NMT_NET_TIME_IS_REAL_TIME_EDEFAULT, oldNMTNetTimeIsRealTimeESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetNMTNetTimeIsRealTime() {
        return nMTNetTimeIsRealTimeESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isNMTRelativeTime() {
        return nMTRelativeTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setNMTRelativeTime(boolean newNMTRelativeTime) {
        boolean oldNMTRelativeTime = nMTRelativeTime;
        nMTRelativeTime = newNMTRelativeTime;
        boolean oldNMTRelativeTimeESet = nMTRelativeTimeESet;
        nMTRelativeTimeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TMN_FEATURES__NMT_RELATIVE_TIME, oldNMTRelativeTime, nMTRelativeTime,
                !oldNMTRelativeTimeESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetNMTRelativeTime() {
        boolean oldNMTRelativeTime = nMTRelativeTime;
        boolean oldNMTRelativeTimeESet = nMTRelativeTimeESet;
        nMTRelativeTime = NMT_RELATIVE_TIME_EDEFAULT;
        nMTRelativeTimeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.TMN_FEATURES__NMT_RELATIVE_TIME, oldNMTRelativeTime,
                NMT_RELATIVE_TIME_EDEFAULT, oldNMTRelativeTimeESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetNMTRelativeTime() {
        return nMTRelativeTimeESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isNMTSimpleBoot() {
        return nMTSimpleBoot;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setNMTSimpleBoot(boolean newNMTSimpleBoot) {
        boolean oldNMTSimpleBoot = nMTSimpleBoot;
        nMTSimpleBoot = newNMTSimpleBoot;
        boolean oldNMTSimpleBootESet = nMTSimpleBootESet;
        nMTSimpleBootESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TMN_FEATURES__NMT_SIMPLE_BOOT, oldNMTSimpleBoot, nMTSimpleBoot,
                !oldNMTSimpleBootESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetNMTSimpleBoot() {
        boolean oldNMTSimpleBoot = nMTSimpleBoot;
        boolean oldNMTSimpleBootESet = nMTSimpleBootESet;
        nMTSimpleBoot = NMT_SIMPLE_BOOT_EDEFAULT;
        nMTSimpleBootESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.TMN_FEATURES__NMT_SIMPLE_BOOT, oldNMTSimpleBoot,
                NMT_SIMPLE_BOOT_EDEFAULT, oldNMTSimpleBootESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetNMTSimpleBoot() {
        return nMTSimpleBootESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public int getPDOTPDOChannels() {
        return pDOTPDOChannels;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setPDOTPDOChannels(int newPDOTPDOChannels) {
        int oldPDOTPDOChannels = pDOTPDOChannels;
        pDOTPDOChannels = newPDOTPDOChannels;
        boolean oldPDOTPDOChannelsESet = pDOTPDOChannelsESet;
        pDOTPDOChannelsESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.TMN_FEATURES__PDOTPDO_CHANNELS, oldPDOTPDOChannels, pDOTPDOChannels,
                !oldPDOTPDOChannelsESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetPDOTPDOChannels() {
        int oldPDOTPDOChannels = pDOTPDOChannels;
        boolean oldPDOTPDOChannelsESet = pDOTPDOChannelsESet;
        pDOTPDOChannels = PDOTPDO_CHANNELS_EDEFAULT;
        pDOTPDOChannelsESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.TMN_FEATURES__PDOTPDO_CHANNELS, oldPDOTPDOChannels,
                PDOTPDO_CHANNELS_EDEFAULT, oldPDOTPDOChannelsESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetPDOTPDOChannels() {
        return pDOTPDOChannelsESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XDDPackage.TMN_FEATURES__DLL_ERR_MN_MULTIPLE_MN:
                return isDLLErrMNMultipleMN();
            case XDDPackage.TMN_FEATURES__DLLMN_FEATURE_MULTIPLEX:
                return isDLLMNFeatureMultiplex();
            case XDDPackage.TMN_FEATURES__DLLMN_FEATURE_PRES_TX:
                return isDLLMNFeaturePResTx();
            case XDDPackage.TMN_FEATURES__DLLMNP_RES_CHAINING:
                return isDLLMNPResChaining();
            case XDDPackage.TMN_FEATURES__NMTMNA_SND2_SO_C:
                return getNMTMNASnd2SoC();
            case XDDPackage.TMN_FEATURES__NMTMN_BASIC_ETHERNET:
                return isNMTMNBasicEthernet();
            case XDDPackage.TMN_FEATURES__NMTMN_MULTIPL_CYC_MAX:
                return getNMTMNMultiplCycMax();
            case XDDPackage.TMN_FEATURES__NMTMNP_RES2_PREQ:
                return getNMTMNPRes2PReq();
            case XDDPackage.TMN_FEATURES__NMTMNP_RES2_PRES:
                return getNMTMNPRes2PRes();
            case XDDPackage.TMN_FEATURES__NMTMNP_RES_RX2_SO_A:
                return getNMTMNPResRx2SoA();
            case XDDPackage.TMN_FEATURES__NMTMNP_RES_TX2_SO_A:
                return getNMTMNPResTx2SoA();
            case XDDPackage.TMN_FEATURES__NMTMN_SO_A2A_SND_TX:
                return getNMTMNSoA2ASndTx();
            case XDDPackage.TMN_FEATURES__NMTMN_SO_C2P_REQ:
                return getNMTMNSoC2PReq();
            case XDDPackage.TMN_FEATURES__NMT_NET_TIME:
                return isNMTNetTime();
            case XDDPackage.TMN_FEATURES__NMT_NET_TIME_IS_REAL_TIME:
                return isNMTNetTimeIsRealTime();
            case XDDPackage.TMN_FEATURES__NMT_RELATIVE_TIME:
                return isNMTRelativeTime();
            case XDDPackage.TMN_FEATURES__NMT_SIMPLE_BOOT:
                return isNMTSimpleBoot();
            case XDDPackage.TMN_FEATURES__PDOTPDO_CHANNELS:
                return getPDOTPDOChannels();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case XDDPackage.TMN_FEATURES__DLL_ERR_MN_MULTIPLE_MN:
                setDLLErrMNMultipleMN((Boolean) newValue);
                return;
            case XDDPackage.TMN_FEATURES__DLLMN_FEATURE_MULTIPLEX:
                setDLLMNFeatureMultiplex((Boolean) newValue);
                return;
            case XDDPackage.TMN_FEATURES__DLLMN_FEATURE_PRES_TX:
                setDLLMNFeaturePResTx((Boolean) newValue);
                return;
            case XDDPackage.TMN_FEATURES__DLLMNP_RES_CHAINING:
                setDLLMNPResChaining((Boolean) newValue);
                return;
            case XDDPackage.TMN_FEATURES__NMTMNA_SND2_SO_C:
                setNMTMNASnd2SoC((Long) newValue);
                return;
            case XDDPackage.TMN_FEATURES__NMTMN_BASIC_ETHERNET:
                setNMTMNBasicEthernet((Boolean) newValue);
                return;
            case XDDPackage.TMN_FEATURES__NMTMN_MULTIPL_CYC_MAX:
                setNMTMNMultiplCycMax((Short) newValue);
                return;
            case XDDPackage.TMN_FEATURES__NMTMNP_RES2_PREQ:
                setNMTMNPRes2PReq((Long) newValue);
                return;
            case XDDPackage.TMN_FEATURES__NMTMNP_RES2_PRES:
                setNMTMNPRes2PRes((Long) newValue);
                return;
            case XDDPackage.TMN_FEATURES__NMTMNP_RES_RX2_SO_A:
                setNMTMNPResRx2SoA((Long) newValue);
                return;
            case XDDPackage.TMN_FEATURES__NMTMNP_RES_TX2_SO_A:
                setNMTMNPResTx2SoA((Long) newValue);
                return;
            case XDDPackage.TMN_FEATURES__NMTMN_SO_A2A_SND_TX:
                setNMTMNSoA2ASndTx((Long) newValue);
                return;
            case XDDPackage.TMN_FEATURES__NMTMN_SO_C2P_REQ:
                setNMTMNSoC2PReq((Long) newValue);
                return;
            case XDDPackage.TMN_FEATURES__NMT_NET_TIME:
                setNMTNetTime((Boolean) newValue);
                return;
            case XDDPackage.TMN_FEATURES__NMT_NET_TIME_IS_REAL_TIME:
                setNMTNetTimeIsRealTime((Boolean) newValue);
                return;
            case XDDPackage.TMN_FEATURES__NMT_RELATIVE_TIME:
                setNMTRelativeTime((Boolean) newValue);
                return;
            case XDDPackage.TMN_FEATURES__NMT_SIMPLE_BOOT:
                setNMTSimpleBoot((Boolean) newValue);
                return;
            case XDDPackage.TMN_FEATURES__PDOTPDO_CHANNELS:
                setPDOTPDOChannels((Integer) newValue);
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
            case XDDPackage.TMN_FEATURES__DLL_ERR_MN_MULTIPLE_MN:
                unsetDLLErrMNMultipleMN();
                return;
            case XDDPackage.TMN_FEATURES__DLLMN_FEATURE_MULTIPLEX:
                unsetDLLMNFeatureMultiplex();
                return;
            case XDDPackage.TMN_FEATURES__DLLMN_FEATURE_PRES_TX:
                unsetDLLMNFeaturePResTx();
                return;
            case XDDPackage.TMN_FEATURES__DLLMNP_RES_CHAINING:
                unsetDLLMNPResChaining();
                return;
            case XDDPackage.TMN_FEATURES__NMTMNA_SND2_SO_C:
                unsetNMTMNASnd2SoC();
                return;
            case XDDPackage.TMN_FEATURES__NMTMN_BASIC_ETHERNET:
                unsetNMTMNBasicEthernet();
                return;
            case XDDPackage.TMN_FEATURES__NMTMN_MULTIPL_CYC_MAX:
                unsetNMTMNMultiplCycMax();
                return;
            case XDDPackage.TMN_FEATURES__NMTMNP_RES2_PREQ:
                unsetNMTMNPRes2PReq();
                return;
            case XDDPackage.TMN_FEATURES__NMTMNP_RES2_PRES:
                unsetNMTMNPRes2PRes();
                return;
            case XDDPackage.TMN_FEATURES__NMTMNP_RES_RX2_SO_A:
                unsetNMTMNPResRx2SoA();
                return;
            case XDDPackage.TMN_FEATURES__NMTMNP_RES_TX2_SO_A:
                unsetNMTMNPResTx2SoA();
                return;
            case XDDPackage.TMN_FEATURES__NMTMN_SO_A2A_SND_TX:
                unsetNMTMNSoA2ASndTx();
                return;
            case XDDPackage.TMN_FEATURES__NMTMN_SO_C2P_REQ:
                unsetNMTMNSoC2PReq();
                return;
            case XDDPackage.TMN_FEATURES__NMT_NET_TIME:
                unsetNMTNetTime();
                return;
            case XDDPackage.TMN_FEATURES__NMT_NET_TIME_IS_REAL_TIME:
                unsetNMTNetTimeIsRealTime();
                return;
            case XDDPackage.TMN_FEATURES__NMT_RELATIVE_TIME:
                unsetNMTRelativeTime();
                return;
            case XDDPackage.TMN_FEATURES__NMT_SIMPLE_BOOT:
                unsetNMTSimpleBoot();
                return;
            case XDDPackage.TMN_FEATURES__PDOTPDO_CHANNELS:
                unsetPDOTPDOChannels();
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
            case XDDPackage.TMN_FEATURES__DLL_ERR_MN_MULTIPLE_MN:
                return isSetDLLErrMNMultipleMN();
            case XDDPackage.TMN_FEATURES__DLLMN_FEATURE_MULTIPLEX:
                return isSetDLLMNFeatureMultiplex();
            case XDDPackage.TMN_FEATURES__DLLMN_FEATURE_PRES_TX:
                return isSetDLLMNFeaturePResTx();
            case XDDPackage.TMN_FEATURES__DLLMNP_RES_CHAINING:
                return isSetDLLMNPResChaining();
            case XDDPackage.TMN_FEATURES__NMTMNA_SND2_SO_C:
                return isSetNMTMNASnd2SoC();
            case XDDPackage.TMN_FEATURES__NMTMN_BASIC_ETHERNET:
                return isSetNMTMNBasicEthernet();
            case XDDPackage.TMN_FEATURES__NMTMN_MULTIPL_CYC_MAX:
                return isSetNMTMNMultiplCycMax();
            case XDDPackage.TMN_FEATURES__NMTMNP_RES2_PREQ:
                return isSetNMTMNPRes2PReq();
            case XDDPackage.TMN_FEATURES__NMTMNP_RES2_PRES:
                return isSetNMTMNPRes2PRes();
            case XDDPackage.TMN_FEATURES__NMTMNP_RES_RX2_SO_A:
                return isSetNMTMNPResRx2SoA();
            case XDDPackage.TMN_FEATURES__NMTMNP_RES_TX2_SO_A:
                return isSetNMTMNPResTx2SoA();
            case XDDPackage.TMN_FEATURES__NMTMN_SO_A2A_SND_TX:
                return isSetNMTMNSoA2ASndTx();
            case XDDPackage.TMN_FEATURES__NMTMN_SO_C2P_REQ:
                return isSetNMTMNSoC2PReq();
            case XDDPackage.TMN_FEATURES__NMT_NET_TIME:
                return isSetNMTNetTime();
            case XDDPackage.TMN_FEATURES__NMT_NET_TIME_IS_REAL_TIME:
                return isSetNMTNetTimeIsRealTime();
            case XDDPackage.TMN_FEATURES__NMT_RELATIVE_TIME:
                return isSetNMTRelativeTime();
            case XDDPackage.TMN_FEATURES__NMT_SIMPLE_BOOT:
                return isSetNMTSimpleBoot();
            case XDDPackage.TMN_FEATURES__PDOTPDO_CHANNELS:
                return isSetPDOTPDOChannels();
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
        result.append(" (dLLErrMNMultipleMN: ");
        if (dLLErrMNMultipleMNESet)
            result.append(dLLErrMNMultipleMN);
        else
            result.append("<unset>");
        result.append(", dLLMNFeatureMultiplex: ");
        if (dLLMNFeatureMultiplexESet)
            result.append(dLLMNFeatureMultiplex);
        else
            result.append("<unset>");
        result.append(", dLLMNFeaturePResTx: ");
        if (dLLMNFeaturePResTxESet)
            result.append(dLLMNFeaturePResTx);
        else
            result.append("<unset>");
        result.append(", dLLMNPResChaining: ");
        if (dLLMNPResChainingESet)
            result.append(dLLMNPResChaining);
        else
            result.append("<unset>");
        result.append(", nMTMNASnd2SoC: ");
        if (nMTMNASnd2SoCESet)
            result.append(nMTMNASnd2SoC);
        else
            result.append("<unset>");
        result.append(", nMTMNBasicEthernet: ");
        if (nMTMNBasicEthernetESet)
            result.append(nMTMNBasicEthernet);
        else
            result.append("<unset>");
        result.append(", nMTMNMultiplCycMax: ");
        if (nMTMNMultiplCycMaxESet)
            result.append(nMTMNMultiplCycMax);
        else
            result.append("<unset>");
        result.append(", nMTMNPRes2PReq: ");
        if (nMTMNPRes2PReqESet)
            result.append(nMTMNPRes2PReq);
        else
            result.append("<unset>");
        result.append(", nMTMNPRes2PRes: ");
        if (nMTMNPRes2PResESet)
            result.append(nMTMNPRes2PRes);
        else
            result.append("<unset>");
        result.append(", nMTMNPResRx2SoA: ");
        if (nMTMNPResRx2SoAESet)
            result.append(nMTMNPResRx2SoA);
        else
            result.append("<unset>");
        result.append(", nMTMNPResTx2SoA: ");
        if (nMTMNPResTx2SoAESet)
            result.append(nMTMNPResTx2SoA);
        else
            result.append("<unset>");
        result.append(", nMTMNSoA2ASndTx: ");
        if (nMTMNSoA2ASndTxESet)
            result.append(nMTMNSoA2ASndTx);
        else
            result.append("<unset>");
        result.append(", nMTMNSoC2PReq: ");
        if (nMTMNSoC2PReqESet)
            result.append(nMTMNSoC2PReq);
        else
            result.append("<unset>");
        result.append(", nMTNetTime: ");
        if (nMTNetTimeESet)
            result.append(nMTNetTime);
        else
            result.append("<unset>");
        result.append(", nMTNetTimeIsRealTime: ");
        if (nMTNetTimeIsRealTimeESet)
            result.append(nMTNetTimeIsRealTime);
        else
            result.append("<unset>");
        result.append(", nMTRelativeTime: ");
        if (nMTRelativeTimeESet)
            result.append(nMTRelativeTime);
        else
            result.append("<unset>");
        result.append(", nMTSimpleBoot: ");
        if (nMTSimpleBootESet)
            result.append(nMTSimpleBoot);
        else
            result.append("<unset>");
        result.append(", pDOTPDOChannels: ");
        if (pDOTPDOChannelsESet)
            result.append(pDOTPDOChannels);
        else
            result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //TMNFeaturesImpl
