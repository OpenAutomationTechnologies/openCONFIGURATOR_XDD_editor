/**
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TGeneral Features</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isCFMConfigManager <em>CFM Config Manager</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isDLLErrBadPhysMode <em>DLL Err Bad Phys Mode</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isDLLErrMacBuffer <em>DLL Err Mac Buffer</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isDLLFeatureCN <em>DLL Feature CN</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isDLLFeatureMN <em>DLL Feature MN</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isDLLMultiplePReqPRes <em>DLL Multiple PReq PRes</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#getNMTBootTimeNotActive <em>NMT Boot Time Not Active</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#getNMTCycleTimeGranularity <em>NMT Cycle Time Granularity</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#getNMTCycleTimeMax <em>NMT Cycle Time Max</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#getNMTCycleTimeMin <em>NMT Cycle Time Min</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#getNMTEmergencyQueueSize <em>NMT Emergency Queue Size</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#getNMTErrorEntries <em>NMT Error Entries</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isNMTExtNmtCmds <em>NMT Ext Nmt Cmds</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isNMTFlushArpEntry <em>NMT Flush Arp Entry</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isNMTIsochronous <em>NMT Isochronous</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#getNMTMaxCNNodeID <em>NMT Max CN Node ID</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#getNMTMaxCNNumber <em>NMT Max CN Number</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#getNMTMaxHeartbeats <em>NMT Max Heartbeats</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#getNMTMinRedCycleTime <em>NMT Min Red Cycle Time</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isNMTNetHostNameSet <em>NMT Net Host Name Set</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isNMTNodeIDByHW <em>NMT Node ID By HW</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isNMTNodeIDBySW <em>NMT Node ID By SW</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#getNMTProductCode <em>NMT Product Code</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isNMTPublishActiveNodes <em>NMT Publish Active Nodes</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isNMTPublishConfigNodes <em>NMT Publish Config Nodes</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isNMTPublishEmergencyNew <em>NMT Publish Emergency New</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isNMTPublishNodeState <em>NMT Publish Node State</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isNMTPublishOperational <em>NMT Publish Operational</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isNMTPublishPreOp1 <em>NMT Publish Pre Op1</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isNMTPublishPreOp2 <em>NMT Publish Pre Op2</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isNMTPublishReadyToOp <em>NMT Publish Ready To Op</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isNMTPublishStopped <em>NMT Publish Stopped</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isNMTPublishTime <em>NMT Publish Time</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#getNMTRevisionNo <em>NMT Revision No</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isNWLForward <em>NWL Forward</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isNWLICMPSupport <em>NWLICMP Support</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isNWLIPSupport <em>NWLIP Support</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isPDODynamicMapping <em>PDO Dynamic Mapping</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#getPDOGranularity <em>PDO Granularity</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#getPDOMaxDescrMem <em>PDO Max Descr Mem</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#getPDORPDOChannelObjects <em>PDORPDO Channel Objects</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#getPDORPDOChannels <em>PDORPDO Channels</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#getPDORPDOCycleDataLim <em>PDORPDO Cycle Data Lim</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#getPDORPDOOverallObjects <em>PDORPDO Overall Objects</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isPDOSelfReceipt <em>PDO Self Receipt</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#getPDOTPDOChannelObjects <em>PDOTPDO Channel Objects</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#getPDOTPDOCycleDataLim <em>PDOTPDO Cycle Data Lim</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#getPDOTPDOOverallObjects <em>PDOTPDO Overall Objects</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#getPHYExtEPLPorts <em>PHY Ext EPL Ports</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#getPHYHubDelay <em>PHY Hub Delay</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isPHYHubIntegrated <em>PHY Hub Integrated</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#getPHYHubJitter <em>PHY Hub Jitter</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isRT1RT1SecuritySupport <em>RT1RT1 Security Support</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isRT1RT1Support <em>RT1RT1 Support</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isRT2RT2Support <em>RT2RT2 Support</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isSDOClient <em>SDO Client</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isSDOCmdFileRead <em>SDO Cmd File Read</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isSDOCmdFileWrite <em>SDO Cmd File Write</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isSDOCmdLinkName <em>SDO Cmd Link Name</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isSDOCmdReadAllByIndex <em>SDO Cmd Read All By Index</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isSDOCmdReadByName <em>SDO Cmd Read By Name</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isSDOCmdReadMultParam <em>SDO Cmd Read Mult Param</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isSDOCmdWriteAllByIndex <em>SDO Cmd Write All By Index</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isSDOCmdWriteByName <em>SDO Cmd Write By Name</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isSDOCmdWriteMultParam <em>SDO Cmd Write Mult Param</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#getSDOMaxConnections <em>SDO Max Connections</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#getSDOMaxParallelConnections <em>SDO Max Parallel Connections</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#getSDOSeqLayerTxHistorySize <em>SDO Seq Layer Tx History Size</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isSDOServer <em>SDO Server</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isSDOSupportASnd <em>SDO Support ASnd</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isSDOSupportPDO <em>SDO Support PDO</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl#isSDOSupportUdpIp <em>SDO Support Udp Ip</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TGeneralFeaturesImpl extends EObjectImpl implements TGeneralFeatures {
	/**
	 * The default value of the '{@link #isCFMConfigManager() <em>CFM Config Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCFMConfigManager()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CFM_CONFIG_MANAGER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCFMConfigManager() <em>CFM Config Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCFMConfigManager()
	 * @generated
	 * @ordered
	 */
	protected boolean cFMConfigManager = CFM_CONFIG_MANAGER_EDEFAULT;

	/**
	 * This is true if the CFM Config Manager attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cFMConfigManagerESet;

	/**
	 * The default value of the '{@link #isDLLErrBadPhysMode() <em>DLL Err Bad Phys Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDLLErrBadPhysMode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DLL_ERR_BAD_PHYS_MODE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDLLErrBadPhysMode() <em>DLL Err Bad Phys Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDLLErrBadPhysMode()
	 * @generated
	 * @ordered
	 */
	protected boolean dLLErrBadPhysMode = DLL_ERR_BAD_PHYS_MODE_EDEFAULT;

	/**
	 * This is true if the DLL Err Bad Phys Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dLLErrBadPhysModeESet;

	/**
	 * The default value of the '{@link #isDLLErrMacBuffer() <em>DLL Err Mac Buffer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDLLErrMacBuffer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DLL_ERR_MAC_BUFFER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDLLErrMacBuffer() <em>DLL Err Mac Buffer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDLLErrMacBuffer()
	 * @generated
	 * @ordered
	 */
	protected boolean dLLErrMacBuffer = DLL_ERR_MAC_BUFFER_EDEFAULT;

	/**
	 * This is true if the DLL Err Mac Buffer attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dLLErrMacBufferESet;

	/**
	 * The default value of the '{@link #isDLLFeatureCN() <em>DLL Feature CN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDLLFeatureCN()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DLL_FEATURE_CN_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDLLFeatureCN() <em>DLL Feature CN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDLLFeatureCN()
	 * @generated
	 * @ordered
	 */
	protected boolean dLLFeatureCN = DLL_FEATURE_CN_EDEFAULT;

	/**
	 * This is true if the DLL Feature CN attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dLLFeatureCNESet;

	/**
	 * The default value of the '{@link #isDLLFeatureMN() <em>DLL Feature MN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDLLFeatureMN()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DLL_FEATURE_MN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDLLFeatureMN() <em>DLL Feature MN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDLLFeatureMN()
	 * @generated
	 * @ordered
	 */
	protected boolean dLLFeatureMN = DLL_FEATURE_MN_EDEFAULT;

	/**
	 * This is true if the DLL Feature MN attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dLLFeatureMNESet;

	/**
	 * The default value of the '{@link #isDLLMultiplePReqPRes() <em>DLL Multiple PReq PRes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDLLMultiplePReqPRes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DLL_MULTIPLE_PREQ_PRES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDLLMultiplePReqPRes() <em>DLL Multiple PReq PRes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDLLMultiplePReqPRes()
	 * @generated
	 * @ordered
	 */
	protected boolean dLLMultiplePReqPRes = DLL_MULTIPLE_PREQ_PRES_EDEFAULT;

	/**
	 * This is true if the DLL Multiple PReq PRes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dLLMultiplePReqPResESet;

	/**
	 * The default value of the '{@link #getNMTBootTimeNotActive() <em>NMT Boot Time Not Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTBootTimeNotActive()
	 * @generated
	 * @ordered
	 */
	protected static final long NMT_BOOT_TIME_NOT_ACTIVE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNMTBootTimeNotActive() <em>NMT Boot Time Not Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTBootTimeNotActive()
	 * @generated
	 * @ordered
	 */
	protected long nMTBootTimeNotActive = NMT_BOOT_TIME_NOT_ACTIVE_EDEFAULT;

	/**
	 * This is true if the NMT Boot Time Not Active attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTBootTimeNotActiveESet;

	/**
	 * The default value of the '{@link #getNMTCycleTimeGranularity() <em>NMT Cycle Time Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTCycleTimeGranularity()
	 * @generated
	 * @ordered
	 */
	protected static final long NMT_CYCLE_TIME_GRANULARITY_EDEFAULT = 1L;

	/**
	 * The cached value of the '{@link #getNMTCycleTimeGranularity() <em>NMT Cycle Time Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTCycleTimeGranularity()
	 * @generated
	 * @ordered
	 */
	protected long nMTCycleTimeGranularity = NMT_CYCLE_TIME_GRANULARITY_EDEFAULT;

	/**
	 * This is true if the NMT Cycle Time Granularity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTCycleTimeGranularityESet;

	/**
	 * The default value of the '{@link #getNMTCycleTimeMax() <em>NMT Cycle Time Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTCycleTimeMax()
	 * @generated
	 * @ordered
	 */
	protected static final long NMT_CYCLE_TIME_MAX_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNMTCycleTimeMax() <em>NMT Cycle Time Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTCycleTimeMax()
	 * @generated
	 * @ordered
	 */
	protected long nMTCycleTimeMax = NMT_CYCLE_TIME_MAX_EDEFAULT;

	/**
	 * This is true if the NMT Cycle Time Max attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTCycleTimeMaxESet;

	/**
	 * The default value of the '{@link #getNMTCycleTimeMin() <em>NMT Cycle Time Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTCycleTimeMin()
	 * @generated
	 * @ordered
	 */
	protected static final long NMT_CYCLE_TIME_MIN_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNMTCycleTimeMin() <em>NMT Cycle Time Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTCycleTimeMin()
	 * @generated
	 * @ordered
	 */
	protected long nMTCycleTimeMin = NMT_CYCLE_TIME_MIN_EDEFAULT;

	/**
	 * This is true if the NMT Cycle Time Min attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTCycleTimeMinESet;

	/**
	 * The default value of the '{@link #getNMTEmergencyQueueSize() <em>NMT Emergency Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTEmergencyQueueSize()
	 * @generated
	 * @ordered
	 */
	protected static final long NMT_EMERGENCY_QUEUE_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNMTEmergencyQueueSize() <em>NMT Emergency Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTEmergencyQueueSize()
	 * @generated
	 * @ordered
	 */
	protected long nMTEmergencyQueueSize = NMT_EMERGENCY_QUEUE_SIZE_EDEFAULT;

	/**
	 * This is true if the NMT Emergency Queue Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTEmergencyQueueSizeESet;

	/**
	 * The default value of the '{@link #getNMTErrorEntries() <em>NMT Error Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTErrorEntries()
	 * @generated
	 * @ordered
	 */
	protected static final long NMT_ERROR_ENTRIES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNMTErrorEntries() <em>NMT Error Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTErrorEntries()
	 * @generated
	 * @ordered
	 */
	protected long nMTErrorEntries = NMT_ERROR_ENTRIES_EDEFAULT;

	/**
	 * This is true if the NMT Error Entries attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTErrorEntriesESet;

	/**
	 * The default value of the '{@link #isNMTExtNmtCmds() <em>NMT Ext Nmt Cmds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTExtNmtCmds()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NMT_EXT_NMT_CMDS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNMTExtNmtCmds() <em>NMT Ext Nmt Cmds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTExtNmtCmds()
	 * @generated
	 * @ordered
	 */
	protected boolean nMTExtNmtCmds = NMT_EXT_NMT_CMDS_EDEFAULT;

	/**
	 * This is true if the NMT Ext Nmt Cmds attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTExtNmtCmdsESet;

	/**
	 * The default value of the '{@link #isNMTFlushArpEntry() <em>NMT Flush Arp Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTFlushArpEntry()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NMT_FLUSH_ARP_ENTRY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNMTFlushArpEntry() <em>NMT Flush Arp Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTFlushArpEntry()
	 * @generated
	 * @ordered
	 */
	protected boolean nMTFlushArpEntry = NMT_FLUSH_ARP_ENTRY_EDEFAULT;

	/**
	 * This is true if the NMT Flush Arp Entry attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTFlushArpEntryESet;

	/**
	 * The default value of the '{@link #isNMTIsochronous() <em>NMT Isochronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTIsochronous()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NMT_ISOCHRONOUS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isNMTIsochronous() <em>NMT Isochronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTIsochronous()
	 * @generated
	 * @ordered
	 */
	protected boolean nMTIsochronous = NMT_ISOCHRONOUS_EDEFAULT;

	/**
	 * This is true if the NMT Isochronous attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTIsochronousESet;

	/**
	 * The default value of the '{@link #getNMTMaxCNNodeID() <em>NMT Max CN Node ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTMaxCNNodeID()
	 * @generated
	 * @ordered
	 */
	protected static final short NMT_MAX_CN_NODE_ID_EDEFAULT = 239;

	/**
	 * The cached value of the '{@link #getNMTMaxCNNodeID() <em>NMT Max CN Node ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTMaxCNNodeID()
	 * @generated
	 * @ordered
	 */
	protected short nMTMaxCNNodeID = NMT_MAX_CN_NODE_ID_EDEFAULT;

	/**
	 * This is true if the NMT Max CN Node ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTMaxCNNodeIDESet;

	/**
	 * The default value of the '{@link #getNMTMaxCNNumber() <em>NMT Max CN Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTMaxCNNumber()
	 * @generated
	 * @ordered
	 */
	protected static final short NMT_MAX_CN_NUMBER_EDEFAULT = 239;

	/**
	 * The cached value of the '{@link #getNMTMaxCNNumber() <em>NMT Max CN Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTMaxCNNumber()
	 * @generated
	 * @ordered
	 */
	protected short nMTMaxCNNumber = NMT_MAX_CN_NUMBER_EDEFAULT;

	/**
	 * This is true if the NMT Max CN Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTMaxCNNumberESet;

	/**
	 * The default value of the '{@link #getNMTMaxHeartbeats() <em>NMT Max Heartbeats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTMaxHeartbeats()
	 * @generated
	 * @ordered
	 */
	protected static final short NMT_MAX_HEARTBEATS_EDEFAULT = 254;

	/**
	 * The cached value of the '{@link #getNMTMaxHeartbeats() <em>NMT Max Heartbeats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTMaxHeartbeats()
	 * @generated
	 * @ordered
	 */
	protected short nMTMaxHeartbeats = NMT_MAX_HEARTBEATS_EDEFAULT;

	/**
	 * This is true if the NMT Max Heartbeats attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTMaxHeartbeatsESet;

	/**
	 * The default value of the '{@link #getNMTMinRedCycleTime() <em>NMT Min Red Cycle Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTMinRedCycleTime()
	 * @generated
	 * @ordered
	 */
	protected static final long NMT_MIN_RED_CYCLE_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNMTMinRedCycleTime() <em>NMT Min Red Cycle Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTMinRedCycleTime()
	 * @generated
	 * @ordered
	 */
	protected long nMTMinRedCycleTime = NMT_MIN_RED_CYCLE_TIME_EDEFAULT;

	/**
	 * This is true if the NMT Min Red Cycle Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTMinRedCycleTimeESet;

	/**
	 * The default value of the '{@link #isNMTNetHostNameSet() <em>NMT Net Host Name Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTNetHostNameSet()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NMT_NET_HOST_NAME_SET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNMTNetHostNameSet() <em>NMT Net Host Name Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTNetHostNameSet()
	 * @generated
	 * @ordered
	 */
	protected boolean nMTNetHostNameSet = NMT_NET_HOST_NAME_SET_EDEFAULT;

	/**
	 * This is true if the NMT Net Host Name Set attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTNetHostNameSetESet;

	/**
	 * The default value of the '{@link #isNMTNodeIDByHW() <em>NMT Node ID By HW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTNodeIDByHW()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NMT_NODE_ID_BY_HW_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isNMTNodeIDByHW() <em>NMT Node ID By HW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTNodeIDByHW()
	 * @generated
	 * @ordered
	 */
	protected boolean nMTNodeIDByHW = NMT_NODE_ID_BY_HW_EDEFAULT;

	/**
	 * This is true if the NMT Node ID By HW attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTNodeIDByHWESet;

	/**
	 * The default value of the '{@link #isNMTNodeIDBySW() <em>NMT Node ID By SW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTNodeIDBySW()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NMT_NODE_ID_BY_SW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNMTNodeIDBySW() <em>NMT Node ID By SW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTNodeIDBySW()
	 * @generated
	 * @ordered
	 */
	protected boolean nMTNodeIDBySW = NMT_NODE_ID_BY_SW_EDEFAULT;

	/**
	 * This is true if the NMT Node ID By SW attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTNodeIDBySWESet;

	/**
	 * The default value of the '{@link #getNMTProductCode() <em>NMT Product Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTProductCode()
	 * @generated
	 * @ordered
	 */
	protected static final long NMT_PRODUCT_CODE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNMTProductCode() <em>NMT Product Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTProductCode()
	 * @generated
	 * @ordered
	 */
	protected long nMTProductCode = NMT_PRODUCT_CODE_EDEFAULT;

	/**
	 * This is true if the NMT Product Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTProductCodeESet;

	/**
	 * The default value of the '{@link #isNMTPublishActiveNodes() <em>NMT Publish Active Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTPublishActiveNodes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NMT_PUBLISH_ACTIVE_NODES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNMTPublishActiveNodes() <em>NMT Publish Active Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTPublishActiveNodes()
	 * @generated
	 * @ordered
	 */
	protected boolean nMTPublishActiveNodes = NMT_PUBLISH_ACTIVE_NODES_EDEFAULT;

	/**
	 * This is true if the NMT Publish Active Nodes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTPublishActiveNodesESet;

	/**
	 * The default value of the '{@link #isNMTPublishConfigNodes() <em>NMT Publish Config Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTPublishConfigNodes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NMT_PUBLISH_CONFIG_NODES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNMTPublishConfigNodes() <em>NMT Publish Config Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTPublishConfigNodes()
	 * @generated
	 * @ordered
	 */
	protected boolean nMTPublishConfigNodes = NMT_PUBLISH_CONFIG_NODES_EDEFAULT;

	/**
	 * This is true if the NMT Publish Config Nodes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTPublishConfigNodesESet;

	/**
	 * The default value of the '{@link #isNMTPublishEmergencyNew() <em>NMT Publish Emergency New</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTPublishEmergencyNew()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NMT_PUBLISH_EMERGENCY_NEW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNMTPublishEmergencyNew() <em>NMT Publish Emergency New</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTPublishEmergencyNew()
	 * @generated
	 * @ordered
	 */
	protected boolean nMTPublishEmergencyNew = NMT_PUBLISH_EMERGENCY_NEW_EDEFAULT;

	/**
	 * This is true if the NMT Publish Emergency New attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTPublishEmergencyNewESet;

	/**
	 * The default value of the '{@link #isNMTPublishNodeState() <em>NMT Publish Node State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTPublishNodeState()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NMT_PUBLISH_NODE_STATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNMTPublishNodeState() <em>NMT Publish Node State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTPublishNodeState()
	 * @generated
	 * @ordered
	 */
	protected boolean nMTPublishNodeState = NMT_PUBLISH_NODE_STATE_EDEFAULT;

	/**
	 * This is true if the NMT Publish Node State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTPublishNodeStateESet;

	/**
	 * The default value of the '{@link #isNMTPublishOperational() <em>NMT Publish Operational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTPublishOperational()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NMT_PUBLISH_OPERATIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNMTPublishOperational() <em>NMT Publish Operational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTPublishOperational()
	 * @generated
	 * @ordered
	 */
	protected boolean nMTPublishOperational = NMT_PUBLISH_OPERATIONAL_EDEFAULT;

	/**
	 * This is true if the NMT Publish Operational attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTPublishOperationalESet;

	/**
	 * The default value of the '{@link #isNMTPublishPreOp1() <em>NMT Publish Pre Op1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTPublishPreOp1()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NMT_PUBLISH_PRE_OP1_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNMTPublishPreOp1() <em>NMT Publish Pre Op1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTPublishPreOp1()
	 * @generated
	 * @ordered
	 */
	protected boolean nMTPublishPreOp1 = NMT_PUBLISH_PRE_OP1_EDEFAULT;

	/**
	 * This is true if the NMT Publish Pre Op1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTPublishPreOp1ESet;

	/**
	 * The default value of the '{@link #isNMTPublishPreOp2() <em>NMT Publish Pre Op2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTPublishPreOp2()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NMT_PUBLISH_PRE_OP2_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNMTPublishPreOp2() <em>NMT Publish Pre Op2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTPublishPreOp2()
	 * @generated
	 * @ordered
	 */
	protected boolean nMTPublishPreOp2 = NMT_PUBLISH_PRE_OP2_EDEFAULT;

	/**
	 * This is true if the NMT Publish Pre Op2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTPublishPreOp2ESet;

	/**
	 * The default value of the '{@link #isNMTPublishReadyToOp() <em>NMT Publish Ready To Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTPublishReadyToOp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NMT_PUBLISH_READY_TO_OP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNMTPublishReadyToOp() <em>NMT Publish Ready To Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTPublishReadyToOp()
	 * @generated
	 * @ordered
	 */
	protected boolean nMTPublishReadyToOp = NMT_PUBLISH_READY_TO_OP_EDEFAULT;

	/**
	 * This is true if the NMT Publish Ready To Op attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTPublishReadyToOpESet;

	/**
	 * The default value of the '{@link #isNMTPublishStopped() <em>NMT Publish Stopped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTPublishStopped()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NMT_PUBLISH_STOPPED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNMTPublishStopped() <em>NMT Publish Stopped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTPublishStopped()
	 * @generated
	 * @ordered
	 */
	protected boolean nMTPublishStopped = NMT_PUBLISH_STOPPED_EDEFAULT;

	/**
	 * This is true if the NMT Publish Stopped attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTPublishStoppedESet;

	/**
	 * The default value of the '{@link #isNMTPublishTime() <em>NMT Publish Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTPublishTime()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NMT_PUBLISH_TIME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNMTPublishTime() <em>NMT Publish Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNMTPublishTime()
	 * @generated
	 * @ordered
	 */
	protected boolean nMTPublishTime = NMT_PUBLISH_TIME_EDEFAULT;

	/**
	 * This is true if the NMT Publish Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTPublishTimeESet;

	/**
	 * The default value of the '{@link #getNMTRevisionNo() <em>NMT Revision No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTRevisionNo()
	 * @generated
	 * @ordered
	 */
	protected static final long NMT_REVISION_NO_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNMTRevisionNo() <em>NMT Revision No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNMTRevisionNo()
	 * @generated
	 * @ordered
	 */
	protected long nMTRevisionNo = NMT_REVISION_NO_EDEFAULT;

	/**
	 * This is true if the NMT Revision No attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nMTRevisionNoESet;

	/**
	 * The default value of the '{@link #isNWLForward() <em>NWL Forward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNWLForward()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NWL_FORWARD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNWLForward() <em>NWL Forward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNWLForward()
	 * @generated
	 * @ordered
	 */
	protected boolean nWLForward = NWL_FORWARD_EDEFAULT;

	/**
	 * This is true if the NWL Forward attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nWLForwardESet;

	/**
	 * The default value of the '{@link #isNWLICMPSupport() <em>NWLICMP Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNWLICMPSupport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NWLICMP_SUPPORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNWLICMPSupport() <em>NWLICMP Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNWLICMPSupport()
	 * @generated
	 * @ordered
	 */
	protected boolean nWLICMPSupport = NWLICMP_SUPPORT_EDEFAULT;

	/**
	 * This is true if the NWLICMP Support attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nWLICMPSupportESet;

	/**
	 * The default value of the '{@link #isNWLIPSupport() <em>NWLIP Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNWLIPSupport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NWLIP_SUPPORT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isNWLIPSupport() <em>NWLIP Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNWLIPSupport()
	 * @generated
	 * @ordered
	 */
	protected boolean nWLIPSupport = NWLIP_SUPPORT_EDEFAULT;

	/**
	 * This is true if the NWLIP Support attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nWLIPSupportESet;

	/**
	 * The default value of the '{@link #isPDODynamicMapping() <em>PDO Dynamic Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPDODynamicMapping()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PDO_DYNAMIC_MAPPING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isPDODynamicMapping() <em>PDO Dynamic Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPDODynamicMapping()
	 * @generated
	 * @ordered
	 */
	protected boolean pDODynamicMapping = PDO_DYNAMIC_MAPPING_EDEFAULT;

	/**
	 * This is true if the PDO Dynamic Mapping attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pDODynamicMappingESet;

	/**
	 * The default value of the '{@link #getPDOGranularity() <em>PDO Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDOGranularity()
	 * @generated
	 * @ordered
	 */
	protected static final short PDO_GRANULARITY_EDEFAULT = 8;

	/**
	 * The cached value of the '{@link #getPDOGranularity() <em>PDO Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDOGranularity()
	 * @generated
	 * @ordered
	 */
	protected short pDOGranularity = PDO_GRANULARITY_EDEFAULT;

	/**
	 * This is true if the PDO Granularity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pDOGranularityESet;

	/**
	 * The default value of the '{@link #getPDOMaxDescrMem() <em>PDO Max Descr Mem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDOMaxDescrMem()
	 * @generated
	 * @ordered
	 */
	protected static final long PDO_MAX_DESCR_MEM_EDEFAULT = 4294967295L;

	/**
	 * The cached value of the '{@link #getPDOMaxDescrMem() <em>PDO Max Descr Mem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDOMaxDescrMem()
	 * @generated
	 * @ordered
	 */
	protected long pDOMaxDescrMem = PDO_MAX_DESCR_MEM_EDEFAULT;

	/**
	 * This is true if the PDO Max Descr Mem attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pDOMaxDescrMemESet;

	/**
	 * The default value of the '{@link #getPDORPDOChannelObjects() <em>PDORPDO Channel Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDORPDOChannelObjects()
	 * @generated
	 * @ordered
	 */
	protected static final short PDORPDO_CHANNEL_OBJECTS_EDEFAULT = 254;

	/**
	 * The cached value of the '{@link #getPDORPDOChannelObjects() <em>PDORPDO Channel Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDORPDOChannelObjects()
	 * @generated
	 * @ordered
	 */
	protected short pDORPDOChannelObjects = PDORPDO_CHANNEL_OBJECTS_EDEFAULT;

	/**
	 * This is true if the PDORPDO Channel Objects attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pDORPDOChannelObjectsESet;

	/**
	 * The default value of the '{@link #getPDORPDOChannels() <em>PDORPDO Channels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDORPDOChannels()
	 * @generated
	 * @ordered
	 */
	protected static final int PDORPDO_CHANNELS_EDEFAULT = 256;

	/**
	 * The cached value of the '{@link #getPDORPDOChannels() <em>PDORPDO Channels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDORPDOChannels()
	 * @generated
	 * @ordered
	 */
	protected int pDORPDOChannels = PDORPDO_CHANNELS_EDEFAULT;

	/**
	 * This is true if the PDORPDO Channels attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pDORPDOChannelsESet;

	/**
	 * The default value of the '{@link #getPDORPDOCycleDataLim() <em>PDORPDO Cycle Data Lim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDORPDOCycleDataLim()
	 * @generated
	 * @ordered
	 */
	protected static final long PDORPDO_CYCLE_DATA_LIM_EDEFAULT = 4294967295L;

	/**
	 * The cached value of the '{@link #getPDORPDOCycleDataLim() <em>PDORPDO Cycle Data Lim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDORPDOCycleDataLim()
	 * @generated
	 * @ordered
	 */
	protected long pDORPDOCycleDataLim = PDORPDO_CYCLE_DATA_LIM_EDEFAULT;

	/**
	 * This is true if the PDORPDO Cycle Data Lim attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pDORPDOCycleDataLimESet;

	/**
	 * The default value of the '{@link #getPDORPDOOverallObjects() <em>PDORPDO Overall Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDORPDOOverallObjects()
	 * @generated
	 * @ordered
	 */
	protected static final int PDORPDO_OVERALL_OBJECTS_EDEFAULT = 65535;

	/**
	 * The cached value of the '{@link #getPDORPDOOverallObjects() <em>PDORPDO Overall Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDORPDOOverallObjects()
	 * @generated
	 * @ordered
	 */
	protected int pDORPDOOverallObjects = PDORPDO_OVERALL_OBJECTS_EDEFAULT;

	/**
	 * This is true if the PDORPDO Overall Objects attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pDORPDOOverallObjectsESet;

	/**
	 * The default value of the '{@link #isPDOSelfReceipt() <em>PDO Self Receipt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPDOSelfReceipt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PDO_SELF_RECEIPT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPDOSelfReceipt() <em>PDO Self Receipt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPDOSelfReceipt()
	 * @generated
	 * @ordered
	 */
	protected boolean pDOSelfReceipt = PDO_SELF_RECEIPT_EDEFAULT;

	/**
	 * This is true if the PDO Self Receipt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pDOSelfReceiptESet;

	/**
	 * The default value of the '{@link #getPDOTPDOChannelObjects() <em>PDOTPDO Channel Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDOTPDOChannelObjects()
	 * @generated
	 * @ordered
	 */
	protected static final short PDOTPDO_CHANNEL_OBJECTS_EDEFAULT = 254;

	/**
	 * The cached value of the '{@link #getPDOTPDOChannelObjects() <em>PDOTPDO Channel Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDOTPDOChannelObjects()
	 * @generated
	 * @ordered
	 */
	protected short pDOTPDOChannelObjects = PDOTPDO_CHANNEL_OBJECTS_EDEFAULT;

	/**
	 * This is true if the PDOTPDO Channel Objects attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pDOTPDOChannelObjectsESet;

	/**
	 * The default value of the '{@link #getPDOTPDOCycleDataLim() <em>PDOTPDO Cycle Data Lim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDOTPDOCycleDataLim()
	 * @generated
	 * @ordered
	 */
	protected static final long PDOTPDO_CYCLE_DATA_LIM_EDEFAULT = 4294967295L;

	/**
	 * The cached value of the '{@link #getPDOTPDOCycleDataLim() <em>PDOTPDO Cycle Data Lim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDOTPDOCycleDataLim()
	 * @generated
	 * @ordered
	 */
	protected long pDOTPDOCycleDataLim = PDOTPDO_CYCLE_DATA_LIM_EDEFAULT;

	/**
	 * This is true if the PDOTPDO Cycle Data Lim attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pDOTPDOCycleDataLimESet;

	/**
	 * The default value of the '{@link #getPDOTPDOOverallObjects() <em>PDOTPDO Overall Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDOTPDOOverallObjects()
	 * @generated
	 * @ordered
	 */
	protected static final int PDOTPDO_OVERALL_OBJECTS_EDEFAULT = 65535;

	/**
	 * The cached value of the '{@link #getPDOTPDOOverallObjects() <em>PDOTPDO Overall Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDOTPDOOverallObjects()
	 * @generated
	 * @ordered
	 */
	protected int pDOTPDOOverallObjects = PDOTPDO_OVERALL_OBJECTS_EDEFAULT;

	/**
	 * This is true if the PDOTPDO Overall Objects attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pDOTPDOOverallObjectsESet;

	/**
	 * The default value of the '{@link #getPHYExtEPLPorts() <em>PHY Ext EPL Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPHYExtEPLPorts()
	 * @generated
	 * @ordered
	 */
	protected static final short PHY_EXT_EPL_PORTS_EDEFAULT = 2;

	/**
	 * The cached value of the '{@link #getPHYExtEPLPorts() <em>PHY Ext EPL Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPHYExtEPLPorts()
	 * @generated
	 * @ordered
	 */
	protected short pHYExtEPLPorts = PHY_EXT_EPL_PORTS_EDEFAULT;

	/**
	 * This is true if the PHY Ext EPL Ports attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pHYExtEPLPortsESet;

	/**
	 * The default value of the '{@link #getPHYHubDelay() <em>PHY Hub Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPHYHubDelay()
	 * @generated
	 * @ordered
	 */
	protected static final long PHY_HUB_DELAY_EDEFAULT = 460L;

	/**
	 * The cached value of the '{@link #getPHYHubDelay() <em>PHY Hub Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPHYHubDelay()
	 * @generated
	 * @ordered
	 */
	protected long pHYHubDelay = PHY_HUB_DELAY_EDEFAULT;

	/**
	 * This is true if the PHY Hub Delay attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pHYHubDelayESet;

	/**
	 * The default value of the '{@link #isPHYHubIntegrated() <em>PHY Hub Integrated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPHYHubIntegrated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PHY_HUB_INTEGRATED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isPHYHubIntegrated() <em>PHY Hub Integrated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPHYHubIntegrated()
	 * @generated
	 * @ordered
	 */
	protected boolean pHYHubIntegrated = PHY_HUB_INTEGRATED_EDEFAULT;

	/**
	 * This is true if the PHY Hub Integrated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pHYHubIntegratedESet;

	/**
	 * The default value of the '{@link #getPHYHubJitter() <em>PHY Hub Jitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPHYHubJitter()
	 * @generated
	 * @ordered
	 */
	protected static final long PHY_HUB_JITTER_EDEFAULT = 70L;

	/**
	 * The cached value of the '{@link #getPHYHubJitter() <em>PHY Hub Jitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPHYHubJitter()
	 * @generated
	 * @ordered
	 */
	protected long pHYHubJitter = PHY_HUB_JITTER_EDEFAULT;

	/**
	 * This is true if the PHY Hub Jitter attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pHYHubJitterESet;

	/**
	 * The default value of the '{@link #isRT1RT1SecuritySupport() <em>RT1RT1 Security Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRT1RT1SecuritySupport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RT1RT1_SECURITY_SUPPORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRT1RT1SecuritySupport() <em>RT1RT1 Security Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRT1RT1SecuritySupport()
	 * @generated
	 * @ordered
	 */
	protected boolean rT1RT1SecuritySupport = RT1RT1_SECURITY_SUPPORT_EDEFAULT;

	/**
	 * This is true if the RT1RT1 Security Support attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rT1RT1SecuritySupportESet;

	/**
	 * The default value of the '{@link #isRT1RT1Support() <em>RT1RT1 Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRT1RT1Support()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RT1RT1_SUPPORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRT1RT1Support() <em>RT1RT1 Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRT1RT1Support()
	 * @generated
	 * @ordered
	 */
	protected boolean rT1RT1Support = RT1RT1_SUPPORT_EDEFAULT;

	/**
	 * This is true if the RT1RT1 Support attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rT1RT1SupportESet;

	/**
	 * The default value of the '{@link #isRT2RT2Support() <em>RT2RT2 Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRT2RT2Support()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RT2RT2_SUPPORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRT2RT2Support() <em>RT2RT2 Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRT2RT2Support()
	 * @generated
	 * @ordered
	 */
	protected boolean rT2RT2Support = RT2RT2_SUPPORT_EDEFAULT;

	/**
	 * This is true if the RT2RT2 Support attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rT2RT2SupportESet;

	/**
	 * The default value of the '{@link #isSDOClient() <em>SDO Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSDOClient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SDO_CLIENT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSDOClient() <em>SDO Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSDOClient()
	 * @generated
	 * @ordered
	 */
	protected boolean sDOClient = SDO_CLIENT_EDEFAULT;

	/**
	 * This is true if the SDO Client attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sDOClientESet;

	/**
	 * The default value of the '{@link #isSDOCmdFileRead() <em>SDO Cmd File Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSDOCmdFileRead()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SDO_CMD_FILE_READ_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSDOCmdFileRead() <em>SDO Cmd File Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSDOCmdFileRead()
	 * @generated
	 * @ordered
	 */
	protected boolean sDOCmdFileRead = SDO_CMD_FILE_READ_EDEFAULT;

	/**
	 * This is true if the SDO Cmd File Read attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sDOCmdFileReadESet;

	/**
	 * The default value of the '{@link #isSDOCmdFileWrite() <em>SDO Cmd File Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSDOCmdFileWrite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SDO_CMD_FILE_WRITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSDOCmdFileWrite() <em>SDO Cmd File Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSDOCmdFileWrite()
	 * @generated
	 * @ordered
	 */
	protected boolean sDOCmdFileWrite = SDO_CMD_FILE_WRITE_EDEFAULT;

	/**
	 * This is true if the SDO Cmd File Write attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sDOCmdFileWriteESet;

	/**
	 * The default value of the '{@link #isSDOCmdLinkName() <em>SDO Cmd Link Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSDOCmdLinkName()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SDO_CMD_LINK_NAME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSDOCmdLinkName() <em>SDO Cmd Link Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSDOCmdLinkName()
	 * @generated
	 * @ordered
	 */
	protected boolean sDOCmdLinkName = SDO_CMD_LINK_NAME_EDEFAULT;

	/**
	 * This is true if the SDO Cmd Link Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sDOCmdLinkNameESet;

	/**
	 * The default value of the '{@link #isSDOCmdReadAllByIndex() <em>SDO Cmd Read All By Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSDOCmdReadAllByIndex()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SDO_CMD_READ_ALL_BY_INDEX_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSDOCmdReadAllByIndex() <em>SDO Cmd Read All By Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSDOCmdReadAllByIndex()
	 * @generated
	 * @ordered
	 */
	protected boolean sDOCmdReadAllByIndex = SDO_CMD_READ_ALL_BY_INDEX_EDEFAULT;

	/**
	 * This is true if the SDO Cmd Read All By Index attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sDOCmdReadAllByIndexESet;

	/**
	 * The default value of the '{@link #isSDOCmdReadByName() <em>SDO Cmd Read By Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSDOCmdReadByName()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SDO_CMD_READ_BY_NAME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSDOCmdReadByName() <em>SDO Cmd Read By Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSDOCmdReadByName()
	 * @generated
	 * @ordered
	 */
	protected boolean sDOCmdReadByName = SDO_CMD_READ_BY_NAME_EDEFAULT;

	/**
	 * This is true if the SDO Cmd Read By Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sDOCmdReadByNameESet;

	/**
	 * The default value of the '{@link #isSDOCmdReadMultParam() <em>SDO Cmd Read Mult Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSDOCmdReadMultParam()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SDO_CMD_READ_MULT_PARAM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSDOCmdReadMultParam() <em>SDO Cmd Read Mult Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSDOCmdReadMultParam()
	 * @generated
	 * @ordered
	 */
	protected boolean sDOCmdReadMultParam = SDO_CMD_READ_MULT_PARAM_EDEFAULT;

	/**
	 * This is true if the SDO Cmd Read Mult Param attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sDOCmdReadMultParamESet;

	/**
	 * The default value of the '{@link #isSDOCmdWriteAllByIndex() <em>SDO Cmd Write All By Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSDOCmdWriteAllByIndex()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SDO_CMD_WRITE_ALL_BY_INDEX_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSDOCmdWriteAllByIndex() <em>SDO Cmd Write All By Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSDOCmdWriteAllByIndex()
	 * @generated
	 * @ordered
	 */
	protected boolean sDOCmdWriteAllByIndex = SDO_CMD_WRITE_ALL_BY_INDEX_EDEFAULT;

	/**
	 * This is true if the SDO Cmd Write All By Index attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sDOCmdWriteAllByIndexESet;

	/**
	 * The default value of the '{@link #isSDOCmdWriteByName() <em>SDO Cmd Write By Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSDOCmdWriteByName()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SDO_CMD_WRITE_BY_NAME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSDOCmdWriteByName() <em>SDO Cmd Write By Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSDOCmdWriteByName()
	 * @generated
	 * @ordered
	 */
	protected boolean sDOCmdWriteByName = SDO_CMD_WRITE_BY_NAME_EDEFAULT;

	/**
	 * This is true if the SDO Cmd Write By Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sDOCmdWriteByNameESet;

	/**
	 * The default value of the '{@link #isSDOCmdWriteMultParam() <em>SDO Cmd Write Mult Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSDOCmdWriteMultParam()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SDO_CMD_WRITE_MULT_PARAM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSDOCmdWriteMultParam() <em>SDO Cmd Write Mult Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSDOCmdWriteMultParam()
	 * @generated
	 * @ordered
	 */
	protected boolean sDOCmdWriteMultParam = SDO_CMD_WRITE_MULT_PARAM_EDEFAULT;

	/**
	 * This is true if the SDO Cmd Write Mult Param attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sDOCmdWriteMultParamESet;

	/**
	 * The default value of the '{@link #getSDOMaxConnections() <em>SDO Max Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDOMaxConnections()
	 * @generated
	 * @ordered
	 */
	protected static final long SDO_MAX_CONNECTIONS_EDEFAULT = 1L;

	/**
	 * The cached value of the '{@link #getSDOMaxConnections() <em>SDO Max Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDOMaxConnections()
	 * @generated
	 * @ordered
	 */
	protected long sDOMaxConnections = SDO_MAX_CONNECTIONS_EDEFAULT;

	/**
	 * This is true if the SDO Max Connections attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sDOMaxConnectionsESet;

	/**
	 * The default value of the '{@link #getSDOMaxParallelConnections() <em>SDO Max Parallel Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDOMaxParallelConnections()
	 * @generated
	 * @ordered
	 */
	protected static final long SDO_MAX_PARALLEL_CONNECTIONS_EDEFAULT = 1L;

	/**
	 * The cached value of the '{@link #getSDOMaxParallelConnections() <em>SDO Max Parallel Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDOMaxParallelConnections()
	 * @generated
	 * @ordered
	 */
	protected long sDOMaxParallelConnections = SDO_MAX_PARALLEL_CONNECTIONS_EDEFAULT;

	/**
	 * This is true if the SDO Max Parallel Connections attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sDOMaxParallelConnectionsESet;

	/**
	 * The default value of the '{@link #getSDOSeqLayerTxHistorySize() <em>SDO Seq Layer Tx History Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDOSeqLayerTxHistorySize()
	 * @generated
	 * @ordered
	 */
	protected static final int SDO_SEQ_LAYER_TX_HISTORY_SIZE_EDEFAULT = 5;

	/**
	 * The cached value of the '{@link #getSDOSeqLayerTxHistorySize() <em>SDO Seq Layer Tx History Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDOSeqLayerTxHistorySize()
	 * @generated
	 * @ordered
	 */
	protected int sDOSeqLayerTxHistorySize = SDO_SEQ_LAYER_TX_HISTORY_SIZE_EDEFAULT;

	/**
	 * This is true if the SDO Seq Layer Tx History Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sDOSeqLayerTxHistorySizeESet;

	/**
	 * The default value of the '{@link #isSDOServer() <em>SDO Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSDOServer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SDO_SERVER_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSDOServer() <em>SDO Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSDOServer()
	 * @generated
	 * @ordered
	 */
	protected boolean sDOServer = SDO_SERVER_EDEFAULT;

	/**
	 * This is true if the SDO Server attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sDOServerESet;

	/**
	 * The default value of the '{@link #isSDOSupportASnd() <em>SDO Support ASnd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSDOSupportASnd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SDO_SUPPORT_ASND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSDOSupportASnd() <em>SDO Support ASnd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSDOSupportASnd()
	 * @generated
	 * @ordered
	 */
	protected boolean sDOSupportASnd = SDO_SUPPORT_ASND_EDEFAULT;

	/**
	 * This is true if the SDO Support ASnd attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sDOSupportASndESet;

	/**
	 * The default value of the '{@link #isSDOSupportPDO() <em>SDO Support PDO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSDOSupportPDO()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SDO_SUPPORT_PDO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSDOSupportPDO() <em>SDO Support PDO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSDOSupportPDO()
	 * @generated
	 * @ordered
	 */
	protected boolean sDOSupportPDO = SDO_SUPPORT_PDO_EDEFAULT;

	/**
	 * This is true if the SDO Support PDO attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sDOSupportPDOESet;

	/**
	 * The default value of the '{@link #isSDOSupportUdpIp() <em>SDO Support Udp Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSDOSupportUdpIp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SDO_SUPPORT_UDP_IP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSDOSupportUdpIp() <em>SDO Support Udp Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSDOSupportUdpIp()
	 * @generated
	 * @ordered
	 */
	protected boolean sDOSupportUdpIp = SDO_SUPPORT_UDP_IP_EDEFAULT;

	/**
	 * This is true if the SDO Support Udp Ip attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sDOSupportUdpIpESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TGeneralFeaturesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XDDPackage.eINSTANCE.getTGeneralFeatures();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCFMConfigManager() {
		return cFMConfigManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCFMConfigManager(boolean newCFMConfigManager) {
		boolean oldCFMConfigManager = cFMConfigManager;
		cFMConfigManager = newCFMConfigManager;
		boolean oldCFMConfigManagerESet = cFMConfigManagerESet;
		cFMConfigManagerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__CFM_CONFIG_MANAGER, oldCFMConfigManager, cFMConfigManager, !oldCFMConfigManagerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCFMConfigManager() {
		boolean oldCFMConfigManager = cFMConfigManager;
		boolean oldCFMConfigManagerESet = cFMConfigManagerESet;
		cFMConfigManager = CFM_CONFIG_MANAGER_EDEFAULT;
		cFMConfigManagerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__CFM_CONFIG_MANAGER, oldCFMConfigManager, CFM_CONFIG_MANAGER_EDEFAULT, oldCFMConfigManagerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCFMConfigManager() {
		return cFMConfigManagerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDLLErrBadPhysMode() {
		return dLLErrBadPhysMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDLLErrBadPhysMode(boolean newDLLErrBadPhysMode) {
		boolean oldDLLErrBadPhysMode = dLLErrBadPhysMode;
		dLLErrBadPhysMode = newDLLErrBadPhysMode;
		boolean oldDLLErrBadPhysModeESet = dLLErrBadPhysModeESet;
		dLLErrBadPhysModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__DLL_ERR_BAD_PHYS_MODE, oldDLLErrBadPhysMode, dLLErrBadPhysMode, !oldDLLErrBadPhysModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDLLErrBadPhysMode() {
		boolean oldDLLErrBadPhysMode = dLLErrBadPhysMode;
		boolean oldDLLErrBadPhysModeESet = dLLErrBadPhysModeESet;
		dLLErrBadPhysMode = DLL_ERR_BAD_PHYS_MODE_EDEFAULT;
		dLLErrBadPhysModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__DLL_ERR_BAD_PHYS_MODE, oldDLLErrBadPhysMode, DLL_ERR_BAD_PHYS_MODE_EDEFAULT, oldDLLErrBadPhysModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDLLErrBadPhysMode() {
		return dLLErrBadPhysModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDLLErrMacBuffer() {
		return dLLErrMacBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDLLErrMacBuffer(boolean newDLLErrMacBuffer) {
		boolean oldDLLErrMacBuffer = dLLErrMacBuffer;
		dLLErrMacBuffer = newDLLErrMacBuffer;
		boolean oldDLLErrMacBufferESet = dLLErrMacBufferESet;
		dLLErrMacBufferESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__DLL_ERR_MAC_BUFFER, oldDLLErrMacBuffer, dLLErrMacBuffer, !oldDLLErrMacBufferESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDLLErrMacBuffer() {
		boolean oldDLLErrMacBuffer = dLLErrMacBuffer;
		boolean oldDLLErrMacBufferESet = dLLErrMacBufferESet;
		dLLErrMacBuffer = DLL_ERR_MAC_BUFFER_EDEFAULT;
		dLLErrMacBufferESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__DLL_ERR_MAC_BUFFER, oldDLLErrMacBuffer, DLL_ERR_MAC_BUFFER_EDEFAULT, oldDLLErrMacBufferESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDLLErrMacBuffer() {
		return dLLErrMacBufferESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDLLFeatureCN() {
		return dLLFeatureCN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDLLFeatureCN(boolean newDLLFeatureCN) {
		boolean oldDLLFeatureCN = dLLFeatureCN;
		dLLFeatureCN = newDLLFeatureCN;
		boolean oldDLLFeatureCNESet = dLLFeatureCNESet;
		dLLFeatureCNESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__DLL_FEATURE_CN, oldDLLFeatureCN, dLLFeatureCN, !oldDLLFeatureCNESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDLLFeatureCN() {
		boolean oldDLLFeatureCN = dLLFeatureCN;
		boolean oldDLLFeatureCNESet = dLLFeatureCNESet;
		dLLFeatureCN = DLL_FEATURE_CN_EDEFAULT;
		dLLFeatureCNESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__DLL_FEATURE_CN, oldDLLFeatureCN, DLL_FEATURE_CN_EDEFAULT, oldDLLFeatureCNESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDLLFeatureCN() {
		return dLLFeatureCNESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDLLFeatureMN() {
		return dLLFeatureMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDLLFeatureMN(boolean newDLLFeatureMN) {
		boolean oldDLLFeatureMN = dLLFeatureMN;
		dLLFeatureMN = newDLLFeatureMN;
		boolean oldDLLFeatureMNESet = dLLFeatureMNESet;
		dLLFeatureMNESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__DLL_FEATURE_MN, oldDLLFeatureMN, dLLFeatureMN, !oldDLLFeatureMNESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDLLFeatureMN() {
		boolean oldDLLFeatureMN = dLLFeatureMN;
		boolean oldDLLFeatureMNESet = dLLFeatureMNESet;
		dLLFeatureMN = DLL_FEATURE_MN_EDEFAULT;
		dLLFeatureMNESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__DLL_FEATURE_MN, oldDLLFeatureMN, DLL_FEATURE_MN_EDEFAULT, oldDLLFeatureMNESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDLLFeatureMN() {
		return dLLFeatureMNESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDLLMultiplePReqPRes() {
		return dLLMultiplePReqPRes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDLLMultiplePReqPRes(boolean newDLLMultiplePReqPRes) {
		boolean oldDLLMultiplePReqPRes = dLLMultiplePReqPRes;
		dLLMultiplePReqPRes = newDLLMultiplePReqPRes;
		boolean oldDLLMultiplePReqPResESet = dLLMultiplePReqPResESet;
		dLLMultiplePReqPResESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__DLL_MULTIPLE_PREQ_PRES, oldDLLMultiplePReqPRes, dLLMultiplePReqPRes, !oldDLLMultiplePReqPResESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDLLMultiplePReqPRes() {
		boolean oldDLLMultiplePReqPRes = dLLMultiplePReqPRes;
		boolean oldDLLMultiplePReqPResESet = dLLMultiplePReqPResESet;
		dLLMultiplePReqPRes = DLL_MULTIPLE_PREQ_PRES_EDEFAULT;
		dLLMultiplePReqPResESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__DLL_MULTIPLE_PREQ_PRES, oldDLLMultiplePReqPRes, DLL_MULTIPLE_PREQ_PRES_EDEFAULT, oldDLLMultiplePReqPResESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDLLMultiplePReqPRes() {
		return dLLMultiplePReqPResESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNMTBootTimeNotActive() {
		return nMTBootTimeNotActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTBootTimeNotActive(long newNMTBootTimeNotActive) {
		long oldNMTBootTimeNotActive = nMTBootTimeNotActive;
		nMTBootTimeNotActive = newNMTBootTimeNotActive;
		boolean oldNMTBootTimeNotActiveESet = nMTBootTimeNotActiveESet;
		nMTBootTimeNotActiveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NMT_BOOT_TIME_NOT_ACTIVE, oldNMTBootTimeNotActive, nMTBootTimeNotActive, !oldNMTBootTimeNotActiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTBootTimeNotActive() {
		long oldNMTBootTimeNotActive = nMTBootTimeNotActive;
		boolean oldNMTBootTimeNotActiveESet = nMTBootTimeNotActiveESet;
		nMTBootTimeNotActive = NMT_BOOT_TIME_NOT_ACTIVE_EDEFAULT;
		nMTBootTimeNotActiveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NMT_BOOT_TIME_NOT_ACTIVE, oldNMTBootTimeNotActive, NMT_BOOT_TIME_NOT_ACTIVE_EDEFAULT, oldNMTBootTimeNotActiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTBootTimeNotActive() {
		return nMTBootTimeNotActiveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNMTCycleTimeGranularity() {
		return nMTCycleTimeGranularity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTCycleTimeGranularity(long newNMTCycleTimeGranularity) {
		long oldNMTCycleTimeGranularity = nMTCycleTimeGranularity;
		nMTCycleTimeGranularity = newNMTCycleTimeGranularity;
		boolean oldNMTCycleTimeGranularityESet = nMTCycleTimeGranularityESet;
		nMTCycleTimeGranularityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NMT_CYCLE_TIME_GRANULARITY, oldNMTCycleTimeGranularity, nMTCycleTimeGranularity, !oldNMTCycleTimeGranularityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTCycleTimeGranularity() {
		long oldNMTCycleTimeGranularity = nMTCycleTimeGranularity;
		boolean oldNMTCycleTimeGranularityESet = nMTCycleTimeGranularityESet;
		nMTCycleTimeGranularity = NMT_CYCLE_TIME_GRANULARITY_EDEFAULT;
		nMTCycleTimeGranularityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NMT_CYCLE_TIME_GRANULARITY, oldNMTCycleTimeGranularity, NMT_CYCLE_TIME_GRANULARITY_EDEFAULT, oldNMTCycleTimeGranularityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTCycleTimeGranularity() {
		return nMTCycleTimeGranularityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNMTCycleTimeMax() {
		return nMTCycleTimeMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTCycleTimeMax(long newNMTCycleTimeMax) {
		long oldNMTCycleTimeMax = nMTCycleTimeMax;
		nMTCycleTimeMax = newNMTCycleTimeMax;
		boolean oldNMTCycleTimeMaxESet = nMTCycleTimeMaxESet;
		nMTCycleTimeMaxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NMT_CYCLE_TIME_MAX, oldNMTCycleTimeMax, nMTCycleTimeMax, !oldNMTCycleTimeMaxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTCycleTimeMax() {
		long oldNMTCycleTimeMax = nMTCycleTimeMax;
		boolean oldNMTCycleTimeMaxESet = nMTCycleTimeMaxESet;
		nMTCycleTimeMax = NMT_CYCLE_TIME_MAX_EDEFAULT;
		nMTCycleTimeMaxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NMT_CYCLE_TIME_MAX, oldNMTCycleTimeMax, NMT_CYCLE_TIME_MAX_EDEFAULT, oldNMTCycleTimeMaxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTCycleTimeMax() {
		return nMTCycleTimeMaxESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNMTCycleTimeMin() {
		return nMTCycleTimeMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTCycleTimeMin(long newNMTCycleTimeMin) {
		long oldNMTCycleTimeMin = nMTCycleTimeMin;
		nMTCycleTimeMin = newNMTCycleTimeMin;
		boolean oldNMTCycleTimeMinESet = nMTCycleTimeMinESet;
		nMTCycleTimeMinESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NMT_CYCLE_TIME_MIN, oldNMTCycleTimeMin, nMTCycleTimeMin, !oldNMTCycleTimeMinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTCycleTimeMin() {
		long oldNMTCycleTimeMin = nMTCycleTimeMin;
		boolean oldNMTCycleTimeMinESet = nMTCycleTimeMinESet;
		nMTCycleTimeMin = NMT_CYCLE_TIME_MIN_EDEFAULT;
		nMTCycleTimeMinESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NMT_CYCLE_TIME_MIN, oldNMTCycleTimeMin, NMT_CYCLE_TIME_MIN_EDEFAULT, oldNMTCycleTimeMinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTCycleTimeMin() {
		return nMTCycleTimeMinESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNMTEmergencyQueueSize() {
		return nMTEmergencyQueueSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTEmergencyQueueSize(long newNMTEmergencyQueueSize) {
		long oldNMTEmergencyQueueSize = nMTEmergencyQueueSize;
		nMTEmergencyQueueSize = newNMTEmergencyQueueSize;
		boolean oldNMTEmergencyQueueSizeESet = nMTEmergencyQueueSizeESet;
		nMTEmergencyQueueSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NMT_EMERGENCY_QUEUE_SIZE, oldNMTEmergencyQueueSize, nMTEmergencyQueueSize, !oldNMTEmergencyQueueSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTEmergencyQueueSize() {
		long oldNMTEmergencyQueueSize = nMTEmergencyQueueSize;
		boolean oldNMTEmergencyQueueSizeESet = nMTEmergencyQueueSizeESet;
		nMTEmergencyQueueSize = NMT_EMERGENCY_QUEUE_SIZE_EDEFAULT;
		nMTEmergencyQueueSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NMT_EMERGENCY_QUEUE_SIZE, oldNMTEmergencyQueueSize, NMT_EMERGENCY_QUEUE_SIZE_EDEFAULT, oldNMTEmergencyQueueSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTEmergencyQueueSize() {
		return nMTEmergencyQueueSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNMTErrorEntries() {
		return nMTErrorEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTErrorEntries(long newNMTErrorEntries) {
		long oldNMTErrorEntries = nMTErrorEntries;
		nMTErrorEntries = newNMTErrorEntries;
		boolean oldNMTErrorEntriesESet = nMTErrorEntriesESet;
		nMTErrorEntriesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NMT_ERROR_ENTRIES, oldNMTErrorEntries, nMTErrorEntries, !oldNMTErrorEntriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTErrorEntries() {
		long oldNMTErrorEntries = nMTErrorEntries;
		boolean oldNMTErrorEntriesESet = nMTErrorEntriesESet;
		nMTErrorEntries = NMT_ERROR_ENTRIES_EDEFAULT;
		nMTErrorEntriesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NMT_ERROR_ENTRIES, oldNMTErrorEntries, NMT_ERROR_ENTRIES_EDEFAULT, oldNMTErrorEntriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTErrorEntries() {
		return nMTErrorEntriesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNMTExtNmtCmds() {
		return nMTExtNmtCmds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTExtNmtCmds(boolean newNMTExtNmtCmds) {
		boolean oldNMTExtNmtCmds = nMTExtNmtCmds;
		nMTExtNmtCmds = newNMTExtNmtCmds;
		boolean oldNMTExtNmtCmdsESet = nMTExtNmtCmdsESet;
		nMTExtNmtCmdsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NMT_EXT_NMT_CMDS, oldNMTExtNmtCmds, nMTExtNmtCmds, !oldNMTExtNmtCmdsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTExtNmtCmds() {
		boolean oldNMTExtNmtCmds = nMTExtNmtCmds;
		boolean oldNMTExtNmtCmdsESet = nMTExtNmtCmdsESet;
		nMTExtNmtCmds = NMT_EXT_NMT_CMDS_EDEFAULT;
		nMTExtNmtCmdsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NMT_EXT_NMT_CMDS, oldNMTExtNmtCmds, NMT_EXT_NMT_CMDS_EDEFAULT, oldNMTExtNmtCmdsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTExtNmtCmds() {
		return nMTExtNmtCmdsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNMTFlushArpEntry() {
		return nMTFlushArpEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTFlushArpEntry(boolean newNMTFlushArpEntry) {
		boolean oldNMTFlushArpEntry = nMTFlushArpEntry;
		nMTFlushArpEntry = newNMTFlushArpEntry;
		boolean oldNMTFlushArpEntryESet = nMTFlushArpEntryESet;
		nMTFlushArpEntryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NMT_FLUSH_ARP_ENTRY, oldNMTFlushArpEntry, nMTFlushArpEntry, !oldNMTFlushArpEntryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTFlushArpEntry() {
		boolean oldNMTFlushArpEntry = nMTFlushArpEntry;
		boolean oldNMTFlushArpEntryESet = nMTFlushArpEntryESet;
		nMTFlushArpEntry = NMT_FLUSH_ARP_ENTRY_EDEFAULT;
		nMTFlushArpEntryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NMT_FLUSH_ARP_ENTRY, oldNMTFlushArpEntry, NMT_FLUSH_ARP_ENTRY_EDEFAULT, oldNMTFlushArpEntryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTFlushArpEntry() {
		return nMTFlushArpEntryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNMTIsochronous() {
		return nMTIsochronous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTIsochronous(boolean newNMTIsochronous) {
		boolean oldNMTIsochronous = nMTIsochronous;
		nMTIsochronous = newNMTIsochronous;
		boolean oldNMTIsochronousESet = nMTIsochronousESet;
		nMTIsochronousESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NMT_ISOCHRONOUS, oldNMTIsochronous, nMTIsochronous, !oldNMTIsochronousESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTIsochronous() {
		boolean oldNMTIsochronous = nMTIsochronous;
		boolean oldNMTIsochronousESet = nMTIsochronousESet;
		nMTIsochronous = NMT_ISOCHRONOUS_EDEFAULT;
		nMTIsochronousESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NMT_ISOCHRONOUS, oldNMTIsochronous, NMT_ISOCHRONOUS_EDEFAULT, oldNMTIsochronousESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTIsochronous() {
		return nMTIsochronousESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getNMTMaxCNNodeID() {
		return nMTMaxCNNodeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTMaxCNNodeID(short newNMTMaxCNNodeID) {
		short oldNMTMaxCNNodeID = nMTMaxCNNodeID;
		nMTMaxCNNodeID = newNMTMaxCNNodeID;
		boolean oldNMTMaxCNNodeIDESet = nMTMaxCNNodeIDESet;
		nMTMaxCNNodeIDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NMT_MAX_CN_NODE_ID, oldNMTMaxCNNodeID, nMTMaxCNNodeID, !oldNMTMaxCNNodeIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTMaxCNNodeID() {
		short oldNMTMaxCNNodeID = nMTMaxCNNodeID;
		boolean oldNMTMaxCNNodeIDESet = nMTMaxCNNodeIDESet;
		nMTMaxCNNodeID = NMT_MAX_CN_NODE_ID_EDEFAULT;
		nMTMaxCNNodeIDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NMT_MAX_CN_NODE_ID, oldNMTMaxCNNodeID, NMT_MAX_CN_NODE_ID_EDEFAULT, oldNMTMaxCNNodeIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTMaxCNNodeID() {
		return nMTMaxCNNodeIDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getNMTMaxCNNumber() {
		return nMTMaxCNNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTMaxCNNumber(short newNMTMaxCNNumber) {
		short oldNMTMaxCNNumber = nMTMaxCNNumber;
		nMTMaxCNNumber = newNMTMaxCNNumber;
		boolean oldNMTMaxCNNumberESet = nMTMaxCNNumberESet;
		nMTMaxCNNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NMT_MAX_CN_NUMBER, oldNMTMaxCNNumber, nMTMaxCNNumber, !oldNMTMaxCNNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTMaxCNNumber() {
		short oldNMTMaxCNNumber = nMTMaxCNNumber;
		boolean oldNMTMaxCNNumberESet = nMTMaxCNNumberESet;
		nMTMaxCNNumber = NMT_MAX_CN_NUMBER_EDEFAULT;
		nMTMaxCNNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NMT_MAX_CN_NUMBER, oldNMTMaxCNNumber, NMT_MAX_CN_NUMBER_EDEFAULT, oldNMTMaxCNNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTMaxCNNumber() {
		return nMTMaxCNNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getNMTMaxHeartbeats() {
		return nMTMaxHeartbeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTMaxHeartbeats(short newNMTMaxHeartbeats) {
		short oldNMTMaxHeartbeats = nMTMaxHeartbeats;
		nMTMaxHeartbeats = newNMTMaxHeartbeats;
		boolean oldNMTMaxHeartbeatsESet = nMTMaxHeartbeatsESet;
		nMTMaxHeartbeatsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NMT_MAX_HEARTBEATS, oldNMTMaxHeartbeats, nMTMaxHeartbeats, !oldNMTMaxHeartbeatsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTMaxHeartbeats() {
		short oldNMTMaxHeartbeats = nMTMaxHeartbeats;
		boolean oldNMTMaxHeartbeatsESet = nMTMaxHeartbeatsESet;
		nMTMaxHeartbeats = NMT_MAX_HEARTBEATS_EDEFAULT;
		nMTMaxHeartbeatsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NMT_MAX_HEARTBEATS, oldNMTMaxHeartbeats, NMT_MAX_HEARTBEATS_EDEFAULT, oldNMTMaxHeartbeatsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTMaxHeartbeats() {
		return nMTMaxHeartbeatsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNMTMinRedCycleTime() {
		return nMTMinRedCycleTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTMinRedCycleTime(long newNMTMinRedCycleTime) {
		long oldNMTMinRedCycleTime = nMTMinRedCycleTime;
		nMTMinRedCycleTime = newNMTMinRedCycleTime;
		boolean oldNMTMinRedCycleTimeESet = nMTMinRedCycleTimeESet;
		nMTMinRedCycleTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NMT_MIN_RED_CYCLE_TIME, oldNMTMinRedCycleTime, nMTMinRedCycleTime, !oldNMTMinRedCycleTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTMinRedCycleTime() {
		long oldNMTMinRedCycleTime = nMTMinRedCycleTime;
		boolean oldNMTMinRedCycleTimeESet = nMTMinRedCycleTimeESet;
		nMTMinRedCycleTime = NMT_MIN_RED_CYCLE_TIME_EDEFAULT;
		nMTMinRedCycleTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NMT_MIN_RED_CYCLE_TIME, oldNMTMinRedCycleTime, NMT_MIN_RED_CYCLE_TIME_EDEFAULT, oldNMTMinRedCycleTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTMinRedCycleTime() {
		return nMTMinRedCycleTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNMTNetHostNameSet() {
		return nMTNetHostNameSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTNetHostNameSet(boolean newNMTNetHostNameSet) {
		boolean oldNMTNetHostNameSet = nMTNetHostNameSet;
		nMTNetHostNameSet = newNMTNetHostNameSet;
		boolean oldNMTNetHostNameSetESet = nMTNetHostNameSetESet;
		nMTNetHostNameSetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NMT_NET_HOST_NAME_SET, oldNMTNetHostNameSet, nMTNetHostNameSet, !oldNMTNetHostNameSetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTNetHostNameSet() {
		boolean oldNMTNetHostNameSet = nMTNetHostNameSet;
		boolean oldNMTNetHostNameSetESet = nMTNetHostNameSetESet;
		nMTNetHostNameSet = NMT_NET_HOST_NAME_SET_EDEFAULT;
		nMTNetHostNameSetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NMT_NET_HOST_NAME_SET, oldNMTNetHostNameSet, NMT_NET_HOST_NAME_SET_EDEFAULT, oldNMTNetHostNameSetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTNetHostNameSet() {
		return nMTNetHostNameSetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNMTNodeIDByHW() {
		return nMTNodeIDByHW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTNodeIDByHW(boolean newNMTNodeIDByHW) {
		boolean oldNMTNodeIDByHW = nMTNodeIDByHW;
		nMTNodeIDByHW = newNMTNodeIDByHW;
		boolean oldNMTNodeIDByHWESet = nMTNodeIDByHWESet;
		nMTNodeIDByHWESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NMT_NODE_ID_BY_HW, oldNMTNodeIDByHW, nMTNodeIDByHW, !oldNMTNodeIDByHWESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTNodeIDByHW() {
		boolean oldNMTNodeIDByHW = nMTNodeIDByHW;
		boolean oldNMTNodeIDByHWESet = nMTNodeIDByHWESet;
		nMTNodeIDByHW = NMT_NODE_ID_BY_HW_EDEFAULT;
		nMTNodeIDByHWESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NMT_NODE_ID_BY_HW, oldNMTNodeIDByHW, NMT_NODE_ID_BY_HW_EDEFAULT, oldNMTNodeIDByHWESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTNodeIDByHW() {
		return nMTNodeIDByHWESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNMTNodeIDBySW() {
		return nMTNodeIDBySW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTNodeIDBySW(boolean newNMTNodeIDBySW) {
		boolean oldNMTNodeIDBySW = nMTNodeIDBySW;
		nMTNodeIDBySW = newNMTNodeIDBySW;
		boolean oldNMTNodeIDBySWESet = nMTNodeIDBySWESet;
		nMTNodeIDBySWESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NMT_NODE_ID_BY_SW, oldNMTNodeIDBySW, nMTNodeIDBySW, !oldNMTNodeIDBySWESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTNodeIDBySW() {
		boolean oldNMTNodeIDBySW = nMTNodeIDBySW;
		boolean oldNMTNodeIDBySWESet = nMTNodeIDBySWESet;
		nMTNodeIDBySW = NMT_NODE_ID_BY_SW_EDEFAULT;
		nMTNodeIDBySWESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NMT_NODE_ID_BY_SW, oldNMTNodeIDBySW, NMT_NODE_ID_BY_SW_EDEFAULT, oldNMTNodeIDBySWESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTNodeIDBySW() {
		return nMTNodeIDBySWESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNMTProductCode() {
		return nMTProductCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTProductCode(long newNMTProductCode) {
		long oldNMTProductCode = nMTProductCode;
		nMTProductCode = newNMTProductCode;
		boolean oldNMTProductCodeESet = nMTProductCodeESet;
		nMTProductCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NMT_PRODUCT_CODE, oldNMTProductCode, nMTProductCode, !oldNMTProductCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTProductCode() {
		long oldNMTProductCode = nMTProductCode;
		boolean oldNMTProductCodeESet = nMTProductCodeESet;
		nMTProductCode = NMT_PRODUCT_CODE_EDEFAULT;
		nMTProductCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NMT_PRODUCT_CODE, oldNMTProductCode, NMT_PRODUCT_CODE_EDEFAULT, oldNMTProductCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTProductCode() {
		return nMTProductCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNMTPublishActiveNodes() {
		return nMTPublishActiveNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTPublishActiveNodes(boolean newNMTPublishActiveNodes) {
		boolean oldNMTPublishActiveNodes = nMTPublishActiveNodes;
		nMTPublishActiveNodes = newNMTPublishActiveNodes;
		boolean oldNMTPublishActiveNodesESet = nMTPublishActiveNodesESet;
		nMTPublishActiveNodesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_ACTIVE_NODES, oldNMTPublishActiveNodes, nMTPublishActiveNodes, !oldNMTPublishActiveNodesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTPublishActiveNodes() {
		boolean oldNMTPublishActiveNodes = nMTPublishActiveNodes;
		boolean oldNMTPublishActiveNodesESet = nMTPublishActiveNodesESet;
		nMTPublishActiveNodes = NMT_PUBLISH_ACTIVE_NODES_EDEFAULT;
		nMTPublishActiveNodesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_ACTIVE_NODES, oldNMTPublishActiveNodes, NMT_PUBLISH_ACTIVE_NODES_EDEFAULT, oldNMTPublishActiveNodesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTPublishActiveNodes() {
		return nMTPublishActiveNodesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNMTPublishConfigNodes() {
		return nMTPublishConfigNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTPublishConfigNodes(boolean newNMTPublishConfigNodes) {
		boolean oldNMTPublishConfigNodes = nMTPublishConfigNodes;
		nMTPublishConfigNodes = newNMTPublishConfigNodes;
		boolean oldNMTPublishConfigNodesESet = nMTPublishConfigNodesESet;
		nMTPublishConfigNodesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_CONFIG_NODES, oldNMTPublishConfigNodes, nMTPublishConfigNodes, !oldNMTPublishConfigNodesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTPublishConfigNodes() {
		boolean oldNMTPublishConfigNodes = nMTPublishConfigNodes;
		boolean oldNMTPublishConfigNodesESet = nMTPublishConfigNodesESet;
		nMTPublishConfigNodes = NMT_PUBLISH_CONFIG_NODES_EDEFAULT;
		nMTPublishConfigNodesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_CONFIG_NODES, oldNMTPublishConfigNodes, NMT_PUBLISH_CONFIG_NODES_EDEFAULT, oldNMTPublishConfigNodesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTPublishConfigNodes() {
		return nMTPublishConfigNodesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNMTPublishEmergencyNew() {
		return nMTPublishEmergencyNew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTPublishEmergencyNew(boolean newNMTPublishEmergencyNew) {
		boolean oldNMTPublishEmergencyNew = nMTPublishEmergencyNew;
		nMTPublishEmergencyNew = newNMTPublishEmergencyNew;
		boolean oldNMTPublishEmergencyNewESet = nMTPublishEmergencyNewESet;
		nMTPublishEmergencyNewESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_EMERGENCY_NEW, oldNMTPublishEmergencyNew, nMTPublishEmergencyNew, !oldNMTPublishEmergencyNewESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTPublishEmergencyNew() {
		boolean oldNMTPublishEmergencyNew = nMTPublishEmergencyNew;
		boolean oldNMTPublishEmergencyNewESet = nMTPublishEmergencyNewESet;
		nMTPublishEmergencyNew = NMT_PUBLISH_EMERGENCY_NEW_EDEFAULT;
		nMTPublishEmergencyNewESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_EMERGENCY_NEW, oldNMTPublishEmergencyNew, NMT_PUBLISH_EMERGENCY_NEW_EDEFAULT, oldNMTPublishEmergencyNewESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTPublishEmergencyNew() {
		return nMTPublishEmergencyNewESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNMTPublishNodeState() {
		return nMTPublishNodeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTPublishNodeState(boolean newNMTPublishNodeState) {
		boolean oldNMTPublishNodeState = nMTPublishNodeState;
		nMTPublishNodeState = newNMTPublishNodeState;
		boolean oldNMTPublishNodeStateESet = nMTPublishNodeStateESet;
		nMTPublishNodeStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_NODE_STATE, oldNMTPublishNodeState, nMTPublishNodeState, !oldNMTPublishNodeStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTPublishNodeState() {
		boolean oldNMTPublishNodeState = nMTPublishNodeState;
		boolean oldNMTPublishNodeStateESet = nMTPublishNodeStateESet;
		nMTPublishNodeState = NMT_PUBLISH_NODE_STATE_EDEFAULT;
		nMTPublishNodeStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_NODE_STATE, oldNMTPublishNodeState, NMT_PUBLISH_NODE_STATE_EDEFAULT, oldNMTPublishNodeStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTPublishNodeState() {
		return nMTPublishNodeStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNMTPublishOperational() {
		return nMTPublishOperational;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTPublishOperational(boolean newNMTPublishOperational) {
		boolean oldNMTPublishOperational = nMTPublishOperational;
		nMTPublishOperational = newNMTPublishOperational;
		boolean oldNMTPublishOperationalESet = nMTPublishOperationalESet;
		nMTPublishOperationalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_OPERATIONAL, oldNMTPublishOperational, nMTPublishOperational, !oldNMTPublishOperationalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTPublishOperational() {
		boolean oldNMTPublishOperational = nMTPublishOperational;
		boolean oldNMTPublishOperationalESet = nMTPublishOperationalESet;
		nMTPublishOperational = NMT_PUBLISH_OPERATIONAL_EDEFAULT;
		nMTPublishOperationalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_OPERATIONAL, oldNMTPublishOperational, NMT_PUBLISH_OPERATIONAL_EDEFAULT, oldNMTPublishOperationalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTPublishOperational() {
		return nMTPublishOperationalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNMTPublishPreOp1() {
		return nMTPublishPreOp1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTPublishPreOp1(boolean newNMTPublishPreOp1) {
		boolean oldNMTPublishPreOp1 = nMTPublishPreOp1;
		nMTPublishPreOp1 = newNMTPublishPreOp1;
		boolean oldNMTPublishPreOp1ESet = nMTPublishPreOp1ESet;
		nMTPublishPreOp1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_PRE_OP1, oldNMTPublishPreOp1, nMTPublishPreOp1, !oldNMTPublishPreOp1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTPublishPreOp1() {
		boolean oldNMTPublishPreOp1 = nMTPublishPreOp1;
		boolean oldNMTPublishPreOp1ESet = nMTPublishPreOp1ESet;
		nMTPublishPreOp1 = NMT_PUBLISH_PRE_OP1_EDEFAULT;
		nMTPublishPreOp1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_PRE_OP1, oldNMTPublishPreOp1, NMT_PUBLISH_PRE_OP1_EDEFAULT, oldNMTPublishPreOp1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTPublishPreOp1() {
		return nMTPublishPreOp1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNMTPublishPreOp2() {
		return nMTPublishPreOp2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTPublishPreOp2(boolean newNMTPublishPreOp2) {
		boolean oldNMTPublishPreOp2 = nMTPublishPreOp2;
		nMTPublishPreOp2 = newNMTPublishPreOp2;
		boolean oldNMTPublishPreOp2ESet = nMTPublishPreOp2ESet;
		nMTPublishPreOp2ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_PRE_OP2, oldNMTPublishPreOp2, nMTPublishPreOp2, !oldNMTPublishPreOp2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTPublishPreOp2() {
		boolean oldNMTPublishPreOp2 = nMTPublishPreOp2;
		boolean oldNMTPublishPreOp2ESet = nMTPublishPreOp2ESet;
		nMTPublishPreOp2 = NMT_PUBLISH_PRE_OP2_EDEFAULT;
		nMTPublishPreOp2ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_PRE_OP2, oldNMTPublishPreOp2, NMT_PUBLISH_PRE_OP2_EDEFAULT, oldNMTPublishPreOp2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTPublishPreOp2() {
		return nMTPublishPreOp2ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNMTPublishReadyToOp() {
		return nMTPublishReadyToOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTPublishReadyToOp(boolean newNMTPublishReadyToOp) {
		boolean oldNMTPublishReadyToOp = nMTPublishReadyToOp;
		nMTPublishReadyToOp = newNMTPublishReadyToOp;
		boolean oldNMTPublishReadyToOpESet = nMTPublishReadyToOpESet;
		nMTPublishReadyToOpESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_READY_TO_OP, oldNMTPublishReadyToOp, nMTPublishReadyToOp, !oldNMTPublishReadyToOpESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTPublishReadyToOp() {
		boolean oldNMTPublishReadyToOp = nMTPublishReadyToOp;
		boolean oldNMTPublishReadyToOpESet = nMTPublishReadyToOpESet;
		nMTPublishReadyToOp = NMT_PUBLISH_READY_TO_OP_EDEFAULT;
		nMTPublishReadyToOpESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_READY_TO_OP, oldNMTPublishReadyToOp, NMT_PUBLISH_READY_TO_OP_EDEFAULT, oldNMTPublishReadyToOpESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTPublishReadyToOp() {
		return nMTPublishReadyToOpESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNMTPublishStopped() {
		return nMTPublishStopped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTPublishStopped(boolean newNMTPublishStopped) {
		boolean oldNMTPublishStopped = nMTPublishStopped;
		nMTPublishStopped = newNMTPublishStopped;
		boolean oldNMTPublishStoppedESet = nMTPublishStoppedESet;
		nMTPublishStoppedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_STOPPED, oldNMTPublishStopped, nMTPublishStopped, !oldNMTPublishStoppedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTPublishStopped() {
		boolean oldNMTPublishStopped = nMTPublishStopped;
		boolean oldNMTPublishStoppedESet = nMTPublishStoppedESet;
		nMTPublishStopped = NMT_PUBLISH_STOPPED_EDEFAULT;
		nMTPublishStoppedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_STOPPED, oldNMTPublishStopped, NMT_PUBLISH_STOPPED_EDEFAULT, oldNMTPublishStoppedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTPublishStopped() {
		return nMTPublishStoppedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNMTPublishTime() {
		return nMTPublishTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTPublishTime(boolean newNMTPublishTime) {
		boolean oldNMTPublishTime = nMTPublishTime;
		nMTPublishTime = newNMTPublishTime;
		boolean oldNMTPublishTimeESet = nMTPublishTimeESet;
		nMTPublishTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_TIME, oldNMTPublishTime, nMTPublishTime, !oldNMTPublishTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTPublishTime() {
		boolean oldNMTPublishTime = nMTPublishTime;
		boolean oldNMTPublishTimeESet = nMTPublishTimeESet;
		nMTPublishTime = NMT_PUBLISH_TIME_EDEFAULT;
		nMTPublishTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_TIME, oldNMTPublishTime, NMT_PUBLISH_TIME_EDEFAULT, oldNMTPublishTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTPublishTime() {
		return nMTPublishTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNMTRevisionNo() {
		return nMTRevisionNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNMTRevisionNo(long newNMTRevisionNo) {
		long oldNMTRevisionNo = nMTRevisionNo;
		nMTRevisionNo = newNMTRevisionNo;
		boolean oldNMTRevisionNoESet = nMTRevisionNoESet;
		nMTRevisionNoESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NMT_REVISION_NO, oldNMTRevisionNo, nMTRevisionNo, !oldNMTRevisionNoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNMTRevisionNo() {
		long oldNMTRevisionNo = nMTRevisionNo;
		boolean oldNMTRevisionNoESet = nMTRevisionNoESet;
		nMTRevisionNo = NMT_REVISION_NO_EDEFAULT;
		nMTRevisionNoESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NMT_REVISION_NO, oldNMTRevisionNo, NMT_REVISION_NO_EDEFAULT, oldNMTRevisionNoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNMTRevisionNo() {
		return nMTRevisionNoESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNWLForward() {
		return nWLForward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNWLForward(boolean newNWLForward) {
		boolean oldNWLForward = nWLForward;
		nWLForward = newNWLForward;
		boolean oldNWLForwardESet = nWLForwardESet;
		nWLForwardESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NWL_FORWARD, oldNWLForward, nWLForward, !oldNWLForwardESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNWLForward() {
		boolean oldNWLForward = nWLForward;
		boolean oldNWLForwardESet = nWLForwardESet;
		nWLForward = NWL_FORWARD_EDEFAULT;
		nWLForwardESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NWL_FORWARD, oldNWLForward, NWL_FORWARD_EDEFAULT, oldNWLForwardESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNWLForward() {
		return nWLForwardESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNWLICMPSupport() {
		return nWLICMPSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNWLICMPSupport(boolean newNWLICMPSupport) {
		boolean oldNWLICMPSupport = nWLICMPSupport;
		nWLICMPSupport = newNWLICMPSupport;
		boolean oldNWLICMPSupportESet = nWLICMPSupportESet;
		nWLICMPSupportESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NWLICMP_SUPPORT, oldNWLICMPSupport, nWLICMPSupport, !oldNWLICMPSupportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNWLICMPSupport() {
		boolean oldNWLICMPSupport = nWLICMPSupport;
		boolean oldNWLICMPSupportESet = nWLICMPSupportESet;
		nWLICMPSupport = NWLICMP_SUPPORT_EDEFAULT;
		nWLICMPSupportESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NWLICMP_SUPPORT, oldNWLICMPSupport, NWLICMP_SUPPORT_EDEFAULT, oldNWLICMPSupportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNWLICMPSupport() {
		return nWLICMPSupportESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNWLIPSupport() {
		return nWLIPSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNWLIPSupport(boolean newNWLIPSupport) {
		boolean oldNWLIPSupport = nWLIPSupport;
		nWLIPSupport = newNWLIPSupport;
		boolean oldNWLIPSupportESet = nWLIPSupportESet;
		nWLIPSupportESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__NWLIP_SUPPORT, oldNWLIPSupport, nWLIPSupport, !oldNWLIPSupportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNWLIPSupport() {
		boolean oldNWLIPSupport = nWLIPSupport;
		boolean oldNWLIPSupportESet = nWLIPSupportESet;
		nWLIPSupport = NWLIP_SUPPORT_EDEFAULT;
		nWLIPSupportESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__NWLIP_SUPPORT, oldNWLIPSupport, NWLIP_SUPPORT_EDEFAULT, oldNWLIPSupportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNWLIPSupport() {
		return nWLIPSupportESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPDODynamicMapping() {
		return pDODynamicMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDODynamicMapping(boolean newPDODynamicMapping) {
		boolean oldPDODynamicMapping = pDODynamicMapping;
		pDODynamicMapping = newPDODynamicMapping;
		boolean oldPDODynamicMappingESet = pDODynamicMappingESet;
		pDODynamicMappingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__PDO_DYNAMIC_MAPPING, oldPDODynamicMapping, pDODynamicMapping, !oldPDODynamicMappingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPDODynamicMapping() {
		boolean oldPDODynamicMapping = pDODynamicMapping;
		boolean oldPDODynamicMappingESet = pDODynamicMappingESet;
		pDODynamicMapping = PDO_DYNAMIC_MAPPING_EDEFAULT;
		pDODynamicMappingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__PDO_DYNAMIC_MAPPING, oldPDODynamicMapping, PDO_DYNAMIC_MAPPING_EDEFAULT, oldPDODynamicMappingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPDODynamicMapping() {
		return pDODynamicMappingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getPDOGranularity() {
		return pDOGranularity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDOGranularity(short newPDOGranularity) {
		short oldPDOGranularity = pDOGranularity;
		pDOGranularity = newPDOGranularity;
		boolean oldPDOGranularityESet = pDOGranularityESet;
		pDOGranularityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__PDO_GRANULARITY, oldPDOGranularity, pDOGranularity, !oldPDOGranularityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPDOGranularity() {
		short oldPDOGranularity = pDOGranularity;
		boolean oldPDOGranularityESet = pDOGranularityESet;
		pDOGranularity = PDO_GRANULARITY_EDEFAULT;
		pDOGranularityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__PDO_GRANULARITY, oldPDOGranularity, PDO_GRANULARITY_EDEFAULT, oldPDOGranularityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPDOGranularity() {
		return pDOGranularityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPDOMaxDescrMem() {
		return pDOMaxDescrMem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDOMaxDescrMem(long newPDOMaxDescrMem) {
		long oldPDOMaxDescrMem = pDOMaxDescrMem;
		pDOMaxDescrMem = newPDOMaxDescrMem;
		boolean oldPDOMaxDescrMemESet = pDOMaxDescrMemESet;
		pDOMaxDescrMemESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__PDO_MAX_DESCR_MEM, oldPDOMaxDescrMem, pDOMaxDescrMem, !oldPDOMaxDescrMemESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPDOMaxDescrMem() {
		long oldPDOMaxDescrMem = pDOMaxDescrMem;
		boolean oldPDOMaxDescrMemESet = pDOMaxDescrMemESet;
		pDOMaxDescrMem = PDO_MAX_DESCR_MEM_EDEFAULT;
		pDOMaxDescrMemESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__PDO_MAX_DESCR_MEM, oldPDOMaxDescrMem, PDO_MAX_DESCR_MEM_EDEFAULT, oldPDOMaxDescrMemESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPDOMaxDescrMem() {
		return pDOMaxDescrMemESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getPDORPDOChannelObjects() {
		return pDORPDOChannelObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDORPDOChannelObjects(short newPDORPDOChannelObjects) {
		short oldPDORPDOChannelObjects = pDORPDOChannelObjects;
		pDORPDOChannelObjects = newPDORPDOChannelObjects;
		boolean oldPDORPDOChannelObjectsESet = pDORPDOChannelObjectsESet;
		pDORPDOChannelObjectsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__PDORPDO_CHANNEL_OBJECTS, oldPDORPDOChannelObjects, pDORPDOChannelObjects, !oldPDORPDOChannelObjectsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPDORPDOChannelObjects() {
		short oldPDORPDOChannelObjects = pDORPDOChannelObjects;
		boolean oldPDORPDOChannelObjectsESet = pDORPDOChannelObjectsESet;
		pDORPDOChannelObjects = PDORPDO_CHANNEL_OBJECTS_EDEFAULT;
		pDORPDOChannelObjectsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__PDORPDO_CHANNEL_OBJECTS, oldPDORPDOChannelObjects, PDORPDO_CHANNEL_OBJECTS_EDEFAULT, oldPDORPDOChannelObjectsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPDORPDOChannelObjects() {
		return pDORPDOChannelObjectsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPDORPDOChannels() {
		return pDORPDOChannels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDORPDOChannels(int newPDORPDOChannels) {
		int oldPDORPDOChannels = pDORPDOChannels;
		pDORPDOChannels = newPDORPDOChannels;
		boolean oldPDORPDOChannelsESet = pDORPDOChannelsESet;
		pDORPDOChannelsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__PDORPDO_CHANNELS, oldPDORPDOChannels, pDORPDOChannels, !oldPDORPDOChannelsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPDORPDOChannels() {
		int oldPDORPDOChannels = pDORPDOChannels;
		boolean oldPDORPDOChannelsESet = pDORPDOChannelsESet;
		pDORPDOChannels = PDORPDO_CHANNELS_EDEFAULT;
		pDORPDOChannelsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__PDORPDO_CHANNELS, oldPDORPDOChannels, PDORPDO_CHANNELS_EDEFAULT, oldPDORPDOChannelsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPDORPDOChannels() {
		return pDORPDOChannelsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPDORPDOCycleDataLim() {
		return pDORPDOCycleDataLim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDORPDOCycleDataLim(long newPDORPDOCycleDataLim) {
		long oldPDORPDOCycleDataLim = pDORPDOCycleDataLim;
		pDORPDOCycleDataLim = newPDORPDOCycleDataLim;
		boolean oldPDORPDOCycleDataLimESet = pDORPDOCycleDataLimESet;
		pDORPDOCycleDataLimESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__PDORPDO_CYCLE_DATA_LIM, oldPDORPDOCycleDataLim, pDORPDOCycleDataLim, !oldPDORPDOCycleDataLimESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPDORPDOCycleDataLim() {
		long oldPDORPDOCycleDataLim = pDORPDOCycleDataLim;
		boolean oldPDORPDOCycleDataLimESet = pDORPDOCycleDataLimESet;
		pDORPDOCycleDataLim = PDORPDO_CYCLE_DATA_LIM_EDEFAULT;
		pDORPDOCycleDataLimESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__PDORPDO_CYCLE_DATA_LIM, oldPDORPDOCycleDataLim, PDORPDO_CYCLE_DATA_LIM_EDEFAULT, oldPDORPDOCycleDataLimESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPDORPDOCycleDataLim() {
		return pDORPDOCycleDataLimESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPDORPDOOverallObjects() {
		return pDORPDOOverallObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDORPDOOverallObjects(int newPDORPDOOverallObjects) {
		int oldPDORPDOOverallObjects = pDORPDOOverallObjects;
		pDORPDOOverallObjects = newPDORPDOOverallObjects;
		boolean oldPDORPDOOverallObjectsESet = pDORPDOOverallObjectsESet;
		pDORPDOOverallObjectsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__PDORPDO_OVERALL_OBJECTS, oldPDORPDOOverallObjects, pDORPDOOverallObjects, !oldPDORPDOOverallObjectsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPDORPDOOverallObjects() {
		int oldPDORPDOOverallObjects = pDORPDOOverallObjects;
		boolean oldPDORPDOOverallObjectsESet = pDORPDOOverallObjectsESet;
		pDORPDOOverallObjects = PDORPDO_OVERALL_OBJECTS_EDEFAULT;
		pDORPDOOverallObjectsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__PDORPDO_OVERALL_OBJECTS, oldPDORPDOOverallObjects, PDORPDO_OVERALL_OBJECTS_EDEFAULT, oldPDORPDOOverallObjectsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPDORPDOOverallObjects() {
		return pDORPDOOverallObjectsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPDOSelfReceipt() {
		return pDOSelfReceipt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDOSelfReceipt(boolean newPDOSelfReceipt) {
		boolean oldPDOSelfReceipt = pDOSelfReceipt;
		pDOSelfReceipt = newPDOSelfReceipt;
		boolean oldPDOSelfReceiptESet = pDOSelfReceiptESet;
		pDOSelfReceiptESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__PDO_SELF_RECEIPT, oldPDOSelfReceipt, pDOSelfReceipt, !oldPDOSelfReceiptESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPDOSelfReceipt() {
		boolean oldPDOSelfReceipt = pDOSelfReceipt;
		boolean oldPDOSelfReceiptESet = pDOSelfReceiptESet;
		pDOSelfReceipt = PDO_SELF_RECEIPT_EDEFAULT;
		pDOSelfReceiptESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__PDO_SELF_RECEIPT, oldPDOSelfReceipt, PDO_SELF_RECEIPT_EDEFAULT, oldPDOSelfReceiptESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPDOSelfReceipt() {
		return pDOSelfReceiptESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getPDOTPDOChannelObjects() {
		return pDOTPDOChannelObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDOTPDOChannelObjects(short newPDOTPDOChannelObjects) {
		short oldPDOTPDOChannelObjects = pDOTPDOChannelObjects;
		pDOTPDOChannelObjects = newPDOTPDOChannelObjects;
		boolean oldPDOTPDOChannelObjectsESet = pDOTPDOChannelObjectsESet;
		pDOTPDOChannelObjectsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__PDOTPDO_CHANNEL_OBJECTS, oldPDOTPDOChannelObjects, pDOTPDOChannelObjects, !oldPDOTPDOChannelObjectsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPDOTPDOChannelObjects() {
		short oldPDOTPDOChannelObjects = pDOTPDOChannelObjects;
		boolean oldPDOTPDOChannelObjectsESet = pDOTPDOChannelObjectsESet;
		pDOTPDOChannelObjects = PDOTPDO_CHANNEL_OBJECTS_EDEFAULT;
		pDOTPDOChannelObjectsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__PDOTPDO_CHANNEL_OBJECTS, oldPDOTPDOChannelObjects, PDOTPDO_CHANNEL_OBJECTS_EDEFAULT, oldPDOTPDOChannelObjectsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPDOTPDOChannelObjects() {
		return pDOTPDOChannelObjectsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPDOTPDOCycleDataLim() {
		return pDOTPDOCycleDataLim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDOTPDOCycleDataLim(long newPDOTPDOCycleDataLim) {
		long oldPDOTPDOCycleDataLim = pDOTPDOCycleDataLim;
		pDOTPDOCycleDataLim = newPDOTPDOCycleDataLim;
		boolean oldPDOTPDOCycleDataLimESet = pDOTPDOCycleDataLimESet;
		pDOTPDOCycleDataLimESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__PDOTPDO_CYCLE_DATA_LIM, oldPDOTPDOCycleDataLim, pDOTPDOCycleDataLim, !oldPDOTPDOCycleDataLimESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPDOTPDOCycleDataLim() {
		long oldPDOTPDOCycleDataLim = pDOTPDOCycleDataLim;
		boolean oldPDOTPDOCycleDataLimESet = pDOTPDOCycleDataLimESet;
		pDOTPDOCycleDataLim = PDOTPDO_CYCLE_DATA_LIM_EDEFAULT;
		pDOTPDOCycleDataLimESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__PDOTPDO_CYCLE_DATA_LIM, oldPDOTPDOCycleDataLim, PDOTPDO_CYCLE_DATA_LIM_EDEFAULT, oldPDOTPDOCycleDataLimESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPDOTPDOCycleDataLim() {
		return pDOTPDOCycleDataLimESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPDOTPDOOverallObjects() {
		return pDOTPDOOverallObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDOTPDOOverallObjects(int newPDOTPDOOverallObjects) {
		int oldPDOTPDOOverallObjects = pDOTPDOOverallObjects;
		pDOTPDOOverallObjects = newPDOTPDOOverallObjects;
		boolean oldPDOTPDOOverallObjectsESet = pDOTPDOOverallObjectsESet;
		pDOTPDOOverallObjectsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__PDOTPDO_OVERALL_OBJECTS, oldPDOTPDOOverallObjects, pDOTPDOOverallObjects, !oldPDOTPDOOverallObjectsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPDOTPDOOverallObjects() {
		int oldPDOTPDOOverallObjects = pDOTPDOOverallObjects;
		boolean oldPDOTPDOOverallObjectsESet = pDOTPDOOverallObjectsESet;
		pDOTPDOOverallObjects = PDOTPDO_OVERALL_OBJECTS_EDEFAULT;
		pDOTPDOOverallObjectsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__PDOTPDO_OVERALL_OBJECTS, oldPDOTPDOOverallObjects, PDOTPDO_OVERALL_OBJECTS_EDEFAULT, oldPDOTPDOOverallObjectsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPDOTPDOOverallObjects() {
		return pDOTPDOOverallObjectsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getPHYExtEPLPorts() {
		return pHYExtEPLPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPHYExtEPLPorts(short newPHYExtEPLPorts) {
		short oldPHYExtEPLPorts = pHYExtEPLPorts;
		pHYExtEPLPorts = newPHYExtEPLPorts;
		boolean oldPHYExtEPLPortsESet = pHYExtEPLPortsESet;
		pHYExtEPLPortsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__PHY_EXT_EPL_PORTS, oldPHYExtEPLPorts, pHYExtEPLPorts, !oldPHYExtEPLPortsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPHYExtEPLPorts() {
		short oldPHYExtEPLPorts = pHYExtEPLPorts;
		boolean oldPHYExtEPLPortsESet = pHYExtEPLPortsESet;
		pHYExtEPLPorts = PHY_EXT_EPL_PORTS_EDEFAULT;
		pHYExtEPLPortsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__PHY_EXT_EPL_PORTS, oldPHYExtEPLPorts, PHY_EXT_EPL_PORTS_EDEFAULT, oldPHYExtEPLPortsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPHYExtEPLPorts() {
		return pHYExtEPLPortsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPHYHubDelay() {
		return pHYHubDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPHYHubDelay(long newPHYHubDelay) {
		long oldPHYHubDelay = pHYHubDelay;
		pHYHubDelay = newPHYHubDelay;
		boolean oldPHYHubDelayESet = pHYHubDelayESet;
		pHYHubDelayESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__PHY_HUB_DELAY, oldPHYHubDelay, pHYHubDelay, !oldPHYHubDelayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPHYHubDelay() {
		long oldPHYHubDelay = pHYHubDelay;
		boolean oldPHYHubDelayESet = pHYHubDelayESet;
		pHYHubDelay = PHY_HUB_DELAY_EDEFAULT;
		pHYHubDelayESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__PHY_HUB_DELAY, oldPHYHubDelay, PHY_HUB_DELAY_EDEFAULT, oldPHYHubDelayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPHYHubDelay() {
		return pHYHubDelayESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPHYHubIntegrated() {
		return pHYHubIntegrated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPHYHubIntegrated(boolean newPHYHubIntegrated) {
		boolean oldPHYHubIntegrated = pHYHubIntegrated;
		pHYHubIntegrated = newPHYHubIntegrated;
		boolean oldPHYHubIntegratedESet = pHYHubIntegratedESet;
		pHYHubIntegratedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__PHY_HUB_INTEGRATED, oldPHYHubIntegrated, pHYHubIntegrated, !oldPHYHubIntegratedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPHYHubIntegrated() {
		boolean oldPHYHubIntegrated = pHYHubIntegrated;
		boolean oldPHYHubIntegratedESet = pHYHubIntegratedESet;
		pHYHubIntegrated = PHY_HUB_INTEGRATED_EDEFAULT;
		pHYHubIntegratedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__PHY_HUB_INTEGRATED, oldPHYHubIntegrated, PHY_HUB_INTEGRATED_EDEFAULT, oldPHYHubIntegratedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPHYHubIntegrated() {
		return pHYHubIntegratedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPHYHubJitter() {
		return pHYHubJitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPHYHubJitter(long newPHYHubJitter) {
		long oldPHYHubJitter = pHYHubJitter;
		pHYHubJitter = newPHYHubJitter;
		boolean oldPHYHubJitterESet = pHYHubJitterESet;
		pHYHubJitterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__PHY_HUB_JITTER, oldPHYHubJitter, pHYHubJitter, !oldPHYHubJitterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPHYHubJitter() {
		long oldPHYHubJitter = pHYHubJitter;
		boolean oldPHYHubJitterESet = pHYHubJitterESet;
		pHYHubJitter = PHY_HUB_JITTER_EDEFAULT;
		pHYHubJitterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__PHY_HUB_JITTER, oldPHYHubJitter, PHY_HUB_JITTER_EDEFAULT, oldPHYHubJitterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPHYHubJitter() {
		return pHYHubJitterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRT1RT1SecuritySupport() {
		return rT1RT1SecuritySupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRT1RT1SecuritySupport(boolean newRT1RT1SecuritySupport) {
		boolean oldRT1RT1SecuritySupport = rT1RT1SecuritySupport;
		rT1RT1SecuritySupport = newRT1RT1SecuritySupport;
		boolean oldRT1RT1SecuritySupportESet = rT1RT1SecuritySupportESet;
		rT1RT1SecuritySupportESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__RT1RT1_SECURITY_SUPPORT, oldRT1RT1SecuritySupport, rT1RT1SecuritySupport, !oldRT1RT1SecuritySupportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRT1RT1SecuritySupport() {
		boolean oldRT1RT1SecuritySupport = rT1RT1SecuritySupport;
		boolean oldRT1RT1SecuritySupportESet = rT1RT1SecuritySupportESet;
		rT1RT1SecuritySupport = RT1RT1_SECURITY_SUPPORT_EDEFAULT;
		rT1RT1SecuritySupportESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__RT1RT1_SECURITY_SUPPORT, oldRT1RT1SecuritySupport, RT1RT1_SECURITY_SUPPORT_EDEFAULT, oldRT1RT1SecuritySupportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRT1RT1SecuritySupport() {
		return rT1RT1SecuritySupportESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRT1RT1Support() {
		return rT1RT1Support;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRT1RT1Support(boolean newRT1RT1Support) {
		boolean oldRT1RT1Support = rT1RT1Support;
		rT1RT1Support = newRT1RT1Support;
		boolean oldRT1RT1SupportESet = rT1RT1SupportESet;
		rT1RT1SupportESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__RT1RT1_SUPPORT, oldRT1RT1Support, rT1RT1Support, !oldRT1RT1SupportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRT1RT1Support() {
		boolean oldRT1RT1Support = rT1RT1Support;
		boolean oldRT1RT1SupportESet = rT1RT1SupportESet;
		rT1RT1Support = RT1RT1_SUPPORT_EDEFAULT;
		rT1RT1SupportESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__RT1RT1_SUPPORT, oldRT1RT1Support, RT1RT1_SUPPORT_EDEFAULT, oldRT1RT1SupportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRT1RT1Support() {
		return rT1RT1SupportESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRT2RT2Support() {
		return rT2RT2Support;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRT2RT2Support(boolean newRT2RT2Support) {
		boolean oldRT2RT2Support = rT2RT2Support;
		rT2RT2Support = newRT2RT2Support;
		boolean oldRT2RT2SupportESet = rT2RT2SupportESet;
		rT2RT2SupportESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__RT2RT2_SUPPORT, oldRT2RT2Support, rT2RT2Support, !oldRT2RT2SupportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRT2RT2Support() {
		boolean oldRT2RT2Support = rT2RT2Support;
		boolean oldRT2RT2SupportESet = rT2RT2SupportESet;
		rT2RT2Support = RT2RT2_SUPPORT_EDEFAULT;
		rT2RT2SupportESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__RT2RT2_SUPPORT, oldRT2RT2Support, RT2RT2_SUPPORT_EDEFAULT, oldRT2RT2SupportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRT2RT2Support() {
		return rT2RT2SupportESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSDOClient() {
		return sDOClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSDOClient(boolean newSDOClient) {
		boolean oldSDOClient = sDOClient;
		sDOClient = newSDOClient;
		boolean oldSDOClientESet = sDOClientESet;
		sDOClientESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__SDO_CLIENT, oldSDOClient, sDOClient, !oldSDOClientESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSDOClient() {
		boolean oldSDOClient = sDOClient;
		boolean oldSDOClientESet = sDOClientESet;
		sDOClient = SDO_CLIENT_EDEFAULT;
		sDOClientESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__SDO_CLIENT, oldSDOClient, SDO_CLIENT_EDEFAULT, oldSDOClientESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSDOClient() {
		return sDOClientESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSDOCmdFileRead() {
		return sDOCmdFileRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSDOCmdFileRead(boolean newSDOCmdFileRead) {
		boolean oldSDOCmdFileRead = sDOCmdFileRead;
		sDOCmdFileRead = newSDOCmdFileRead;
		boolean oldSDOCmdFileReadESet = sDOCmdFileReadESet;
		sDOCmdFileReadESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__SDO_CMD_FILE_READ, oldSDOCmdFileRead, sDOCmdFileRead, !oldSDOCmdFileReadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSDOCmdFileRead() {
		boolean oldSDOCmdFileRead = sDOCmdFileRead;
		boolean oldSDOCmdFileReadESet = sDOCmdFileReadESet;
		sDOCmdFileRead = SDO_CMD_FILE_READ_EDEFAULT;
		sDOCmdFileReadESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__SDO_CMD_FILE_READ, oldSDOCmdFileRead, SDO_CMD_FILE_READ_EDEFAULT, oldSDOCmdFileReadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSDOCmdFileRead() {
		return sDOCmdFileReadESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSDOCmdFileWrite() {
		return sDOCmdFileWrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSDOCmdFileWrite(boolean newSDOCmdFileWrite) {
		boolean oldSDOCmdFileWrite = sDOCmdFileWrite;
		sDOCmdFileWrite = newSDOCmdFileWrite;
		boolean oldSDOCmdFileWriteESet = sDOCmdFileWriteESet;
		sDOCmdFileWriteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__SDO_CMD_FILE_WRITE, oldSDOCmdFileWrite, sDOCmdFileWrite, !oldSDOCmdFileWriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSDOCmdFileWrite() {
		boolean oldSDOCmdFileWrite = sDOCmdFileWrite;
		boolean oldSDOCmdFileWriteESet = sDOCmdFileWriteESet;
		sDOCmdFileWrite = SDO_CMD_FILE_WRITE_EDEFAULT;
		sDOCmdFileWriteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__SDO_CMD_FILE_WRITE, oldSDOCmdFileWrite, SDO_CMD_FILE_WRITE_EDEFAULT, oldSDOCmdFileWriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSDOCmdFileWrite() {
		return sDOCmdFileWriteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSDOCmdLinkName() {
		return sDOCmdLinkName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSDOCmdLinkName(boolean newSDOCmdLinkName) {
		boolean oldSDOCmdLinkName = sDOCmdLinkName;
		sDOCmdLinkName = newSDOCmdLinkName;
		boolean oldSDOCmdLinkNameESet = sDOCmdLinkNameESet;
		sDOCmdLinkNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__SDO_CMD_LINK_NAME, oldSDOCmdLinkName, sDOCmdLinkName, !oldSDOCmdLinkNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSDOCmdLinkName() {
		boolean oldSDOCmdLinkName = sDOCmdLinkName;
		boolean oldSDOCmdLinkNameESet = sDOCmdLinkNameESet;
		sDOCmdLinkName = SDO_CMD_LINK_NAME_EDEFAULT;
		sDOCmdLinkNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__SDO_CMD_LINK_NAME, oldSDOCmdLinkName, SDO_CMD_LINK_NAME_EDEFAULT, oldSDOCmdLinkNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSDOCmdLinkName() {
		return sDOCmdLinkNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSDOCmdReadAllByIndex() {
		return sDOCmdReadAllByIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSDOCmdReadAllByIndex(boolean newSDOCmdReadAllByIndex) {
		boolean oldSDOCmdReadAllByIndex = sDOCmdReadAllByIndex;
		sDOCmdReadAllByIndex = newSDOCmdReadAllByIndex;
		boolean oldSDOCmdReadAllByIndexESet = sDOCmdReadAllByIndexESet;
		sDOCmdReadAllByIndexESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__SDO_CMD_READ_ALL_BY_INDEX, oldSDOCmdReadAllByIndex, sDOCmdReadAllByIndex, !oldSDOCmdReadAllByIndexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSDOCmdReadAllByIndex() {
		boolean oldSDOCmdReadAllByIndex = sDOCmdReadAllByIndex;
		boolean oldSDOCmdReadAllByIndexESet = sDOCmdReadAllByIndexESet;
		sDOCmdReadAllByIndex = SDO_CMD_READ_ALL_BY_INDEX_EDEFAULT;
		sDOCmdReadAllByIndexESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__SDO_CMD_READ_ALL_BY_INDEX, oldSDOCmdReadAllByIndex, SDO_CMD_READ_ALL_BY_INDEX_EDEFAULT, oldSDOCmdReadAllByIndexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSDOCmdReadAllByIndex() {
		return sDOCmdReadAllByIndexESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSDOCmdReadByName() {
		return sDOCmdReadByName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSDOCmdReadByName(boolean newSDOCmdReadByName) {
		boolean oldSDOCmdReadByName = sDOCmdReadByName;
		sDOCmdReadByName = newSDOCmdReadByName;
		boolean oldSDOCmdReadByNameESet = sDOCmdReadByNameESet;
		sDOCmdReadByNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__SDO_CMD_READ_BY_NAME, oldSDOCmdReadByName, sDOCmdReadByName, !oldSDOCmdReadByNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSDOCmdReadByName() {
		boolean oldSDOCmdReadByName = sDOCmdReadByName;
		boolean oldSDOCmdReadByNameESet = sDOCmdReadByNameESet;
		sDOCmdReadByName = SDO_CMD_READ_BY_NAME_EDEFAULT;
		sDOCmdReadByNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__SDO_CMD_READ_BY_NAME, oldSDOCmdReadByName, SDO_CMD_READ_BY_NAME_EDEFAULT, oldSDOCmdReadByNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSDOCmdReadByName() {
		return sDOCmdReadByNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSDOCmdReadMultParam() {
		return sDOCmdReadMultParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSDOCmdReadMultParam(boolean newSDOCmdReadMultParam) {
		boolean oldSDOCmdReadMultParam = sDOCmdReadMultParam;
		sDOCmdReadMultParam = newSDOCmdReadMultParam;
		boolean oldSDOCmdReadMultParamESet = sDOCmdReadMultParamESet;
		sDOCmdReadMultParamESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__SDO_CMD_READ_MULT_PARAM, oldSDOCmdReadMultParam, sDOCmdReadMultParam, !oldSDOCmdReadMultParamESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSDOCmdReadMultParam() {
		boolean oldSDOCmdReadMultParam = sDOCmdReadMultParam;
		boolean oldSDOCmdReadMultParamESet = sDOCmdReadMultParamESet;
		sDOCmdReadMultParam = SDO_CMD_READ_MULT_PARAM_EDEFAULT;
		sDOCmdReadMultParamESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__SDO_CMD_READ_MULT_PARAM, oldSDOCmdReadMultParam, SDO_CMD_READ_MULT_PARAM_EDEFAULT, oldSDOCmdReadMultParamESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSDOCmdReadMultParam() {
		return sDOCmdReadMultParamESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSDOCmdWriteAllByIndex() {
		return sDOCmdWriteAllByIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSDOCmdWriteAllByIndex(boolean newSDOCmdWriteAllByIndex) {
		boolean oldSDOCmdWriteAllByIndex = sDOCmdWriteAllByIndex;
		sDOCmdWriteAllByIndex = newSDOCmdWriteAllByIndex;
		boolean oldSDOCmdWriteAllByIndexESet = sDOCmdWriteAllByIndexESet;
		sDOCmdWriteAllByIndexESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__SDO_CMD_WRITE_ALL_BY_INDEX, oldSDOCmdWriteAllByIndex, sDOCmdWriteAllByIndex, !oldSDOCmdWriteAllByIndexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSDOCmdWriteAllByIndex() {
		boolean oldSDOCmdWriteAllByIndex = sDOCmdWriteAllByIndex;
		boolean oldSDOCmdWriteAllByIndexESet = sDOCmdWriteAllByIndexESet;
		sDOCmdWriteAllByIndex = SDO_CMD_WRITE_ALL_BY_INDEX_EDEFAULT;
		sDOCmdWriteAllByIndexESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__SDO_CMD_WRITE_ALL_BY_INDEX, oldSDOCmdWriteAllByIndex, SDO_CMD_WRITE_ALL_BY_INDEX_EDEFAULT, oldSDOCmdWriteAllByIndexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSDOCmdWriteAllByIndex() {
		return sDOCmdWriteAllByIndexESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSDOCmdWriteByName() {
		return sDOCmdWriteByName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSDOCmdWriteByName(boolean newSDOCmdWriteByName) {
		boolean oldSDOCmdWriteByName = sDOCmdWriteByName;
		sDOCmdWriteByName = newSDOCmdWriteByName;
		boolean oldSDOCmdWriteByNameESet = sDOCmdWriteByNameESet;
		sDOCmdWriteByNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__SDO_CMD_WRITE_BY_NAME, oldSDOCmdWriteByName, sDOCmdWriteByName, !oldSDOCmdWriteByNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSDOCmdWriteByName() {
		boolean oldSDOCmdWriteByName = sDOCmdWriteByName;
		boolean oldSDOCmdWriteByNameESet = sDOCmdWriteByNameESet;
		sDOCmdWriteByName = SDO_CMD_WRITE_BY_NAME_EDEFAULT;
		sDOCmdWriteByNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__SDO_CMD_WRITE_BY_NAME, oldSDOCmdWriteByName, SDO_CMD_WRITE_BY_NAME_EDEFAULT, oldSDOCmdWriteByNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSDOCmdWriteByName() {
		return sDOCmdWriteByNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSDOCmdWriteMultParam() {
		return sDOCmdWriteMultParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSDOCmdWriteMultParam(boolean newSDOCmdWriteMultParam) {
		boolean oldSDOCmdWriteMultParam = sDOCmdWriteMultParam;
		sDOCmdWriteMultParam = newSDOCmdWriteMultParam;
		boolean oldSDOCmdWriteMultParamESet = sDOCmdWriteMultParamESet;
		sDOCmdWriteMultParamESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__SDO_CMD_WRITE_MULT_PARAM, oldSDOCmdWriteMultParam, sDOCmdWriteMultParam, !oldSDOCmdWriteMultParamESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSDOCmdWriteMultParam() {
		boolean oldSDOCmdWriteMultParam = sDOCmdWriteMultParam;
		boolean oldSDOCmdWriteMultParamESet = sDOCmdWriteMultParamESet;
		sDOCmdWriteMultParam = SDO_CMD_WRITE_MULT_PARAM_EDEFAULT;
		sDOCmdWriteMultParamESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__SDO_CMD_WRITE_MULT_PARAM, oldSDOCmdWriteMultParam, SDO_CMD_WRITE_MULT_PARAM_EDEFAULT, oldSDOCmdWriteMultParamESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSDOCmdWriteMultParam() {
		return sDOCmdWriteMultParamESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSDOMaxConnections() {
		return sDOMaxConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSDOMaxConnections(long newSDOMaxConnections) {
		long oldSDOMaxConnections = sDOMaxConnections;
		sDOMaxConnections = newSDOMaxConnections;
		boolean oldSDOMaxConnectionsESet = sDOMaxConnectionsESet;
		sDOMaxConnectionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__SDO_MAX_CONNECTIONS, oldSDOMaxConnections, sDOMaxConnections, !oldSDOMaxConnectionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSDOMaxConnections() {
		long oldSDOMaxConnections = sDOMaxConnections;
		boolean oldSDOMaxConnectionsESet = sDOMaxConnectionsESet;
		sDOMaxConnections = SDO_MAX_CONNECTIONS_EDEFAULT;
		sDOMaxConnectionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__SDO_MAX_CONNECTIONS, oldSDOMaxConnections, SDO_MAX_CONNECTIONS_EDEFAULT, oldSDOMaxConnectionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSDOMaxConnections() {
		return sDOMaxConnectionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSDOMaxParallelConnections() {
		return sDOMaxParallelConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSDOMaxParallelConnections(long newSDOMaxParallelConnections) {
		long oldSDOMaxParallelConnections = sDOMaxParallelConnections;
		sDOMaxParallelConnections = newSDOMaxParallelConnections;
		boolean oldSDOMaxParallelConnectionsESet = sDOMaxParallelConnectionsESet;
		sDOMaxParallelConnectionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__SDO_MAX_PARALLEL_CONNECTIONS, oldSDOMaxParallelConnections, sDOMaxParallelConnections, !oldSDOMaxParallelConnectionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSDOMaxParallelConnections() {
		long oldSDOMaxParallelConnections = sDOMaxParallelConnections;
		boolean oldSDOMaxParallelConnectionsESet = sDOMaxParallelConnectionsESet;
		sDOMaxParallelConnections = SDO_MAX_PARALLEL_CONNECTIONS_EDEFAULT;
		sDOMaxParallelConnectionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__SDO_MAX_PARALLEL_CONNECTIONS, oldSDOMaxParallelConnections, SDO_MAX_PARALLEL_CONNECTIONS_EDEFAULT, oldSDOMaxParallelConnectionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSDOMaxParallelConnections() {
		return sDOMaxParallelConnectionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSDOSeqLayerTxHistorySize() {
		return sDOSeqLayerTxHistorySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSDOSeqLayerTxHistorySize(int newSDOSeqLayerTxHistorySize) {
		int oldSDOSeqLayerTxHistorySize = sDOSeqLayerTxHistorySize;
		sDOSeqLayerTxHistorySize = newSDOSeqLayerTxHistorySize;
		boolean oldSDOSeqLayerTxHistorySizeESet = sDOSeqLayerTxHistorySizeESet;
		sDOSeqLayerTxHistorySizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__SDO_SEQ_LAYER_TX_HISTORY_SIZE, oldSDOSeqLayerTxHistorySize, sDOSeqLayerTxHistorySize, !oldSDOSeqLayerTxHistorySizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSDOSeqLayerTxHistorySize() {
		int oldSDOSeqLayerTxHistorySize = sDOSeqLayerTxHistorySize;
		boolean oldSDOSeqLayerTxHistorySizeESet = sDOSeqLayerTxHistorySizeESet;
		sDOSeqLayerTxHistorySize = SDO_SEQ_LAYER_TX_HISTORY_SIZE_EDEFAULT;
		sDOSeqLayerTxHistorySizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__SDO_SEQ_LAYER_TX_HISTORY_SIZE, oldSDOSeqLayerTxHistorySize, SDO_SEQ_LAYER_TX_HISTORY_SIZE_EDEFAULT, oldSDOSeqLayerTxHistorySizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSDOSeqLayerTxHistorySize() {
		return sDOSeqLayerTxHistorySizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSDOServer() {
		return sDOServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSDOServer(boolean newSDOServer) {
		boolean oldSDOServer = sDOServer;
		sDOServer = newSDOServer;
		boolean oldSDOServerESet = sDOServerESet;
		sDOServerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__SDO_SERVER, oldSDOServer, sDOServer, !oldSDOServerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSDOServer() {
		boolean oldSDOServer = sDOServer;
		boolean oldSDOServerESet = sDOServerESet;
		sDOServer = SDO_SERVER_EDEFAULT;
		sDOServerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__SDO_SERVER, oldSDOServer, SDO_SERVER_EDEFAULT, oldSDOServerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSDOServer() {
		return sDOServerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSDOSupportASnd() {
		return sDOSupportASnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSDOSupportASnd(boolean newSDOSupportASnd) {
		boolean oldSDOSupportASnd = sDOSupportASnd;
		sDOSupportASnd = newSDOSupportASnd;
		boolean oldSDOSupportASndESet = sDOSupportASndESet;
		sDOSupportASndESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__SDO_SUPPORT_ASND, oldSDOSupportASnd, sDOSupportASnd, !oldSDOSupportASndESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSDOSupportASnd() {
		boolean oldSDOSupportASnd = sDOSupportASnd;
		boolean oldSDOSupportASndESet = sDOSupportASndESet;
		sDOSupportASnd = SDO_SUPPORT_ASND_EDEFAULT;
		sDOSupportASndESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__SDO_SUPPORT_ASND, oldSDOSupportASnd, SDO_SUPPORT_ASND_EDEFAULT, oldSDOSupportASndESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSDOSupportASnd() {
		return sDOSupportASndESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSDOSupportPDO() {
		return sDOSupportPDO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSDOSupportPDO(boolean newSDOSupportPDO) {
		boolean oldSDOSupportPDO = sDOSupportPDO;
		sDOSupportPDO = newSDOSupportPDO;
		boolean oldSDOSupportPDOESet = sDOSupportPDOESet;
		sDOSupportPDOESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__SDO_SUPPORT_PDO, oldSDOSupportPDO, sDOSupportPDO, !oldSDOSupportPDOESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSDOSupportPDO() {
		boolean oldSDOSupportPDO = sDOSupportPDO;
		boolean oldSDOSupportPDOESet = sDOSupportPDOESet;
		sDOSupportPDO = SDO_SUPPORT_PDO_EDEFAULT;
		sDOSupportPDOESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__SDO_SUPPORT_PDO, oldSDOSupportPDO, SDO_SUPPORT_PDO_EDEFAULT, oldSDOSupportPDOESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSDOSupportPDO() {
		return sDOSupportPDOESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSDOSupportUdpIp() {
		return sDOSupportUdpIp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSDOSupportUdpIp(boolean newSDOSupportUdpIp) {
		boolean oldSDOSupportUdpIp = sDOSupportUdpIp;
		sDOSupportUdpIp = newSDOSupportUdpIp;
		boolean oldSDOSupportUdpIpESet = sDOSupportUdpIpESet;
		sDOSupportUdpIpESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TGENERAL_FEATURES__SDO_SUPPORT_UDP_IP, oldSDOSupportUdpIp, sDOSupportUdpIp, !oldSDOSupportUdpIpESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSDOSupportUdpIp() {
		boolean oldSDOSupportUdpIp = sDOSupportUdpIp;
		boolean oldSDOSupportUdpIpESet = sDOSupportUdpIpESet;
		sDOSupportUdpIp = SDO_SUPPORT_UDP_IP_EDEFAULT;
		sDOSupportUdpIpESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TGENERAL_FEATURES__SDO_SUPPORT_UDP_IP, oldSDOSupportUdpIp, SDO_SUPPORT_UDP_IP_EDEFAULT, oldSDOSupportUdpIpESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSDOSupportUdpIp() {
		return sDOSupportUdpIpESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XDDPackage.TGENERAL_FEATURES__CFM_CONFIG_MANAGER:
				return isCFMConfigManager();
			case XDDPackage.TGENERAL_FEATURES__DLL_ERR_BAD_PHYS_MODE:
				return isDLLErrBadPhysMode();
			case XDDPackage.TGENERAL_FEATURES__DLL_ERR_MAC_BUFFER:
				return isDLLErrMacBuffer();
			case XDDPackage.TGENERAL_FEATURES__DLL_FEATURE_CN:
				return isDLLFeatureCN();
			case XDDPackage.TGENERAL_FEATURES__DLL_FEATURE_MN:
				return isDLLFeatureMN();
			case XDDPackage.TGENERAL_FEATURES__DLL_MULTIPLE_PREQ_PRES:
				return isDLLMultiplePReqPRes();
			case XDDPackage.TGENERAL_FEATURES__NMT_BOOT_TIME_NOT_ACTIVE:
				return getNMTBootTimeNotActive();
			case XDDPackage.TGENERAL_FEATURES__NMT_CYCLE_TIME_GRANULARITY:
				return getNMTCycleTimeGranularity();
			case XDDPackage.TGENERAL_FEATURES__NMT_CYCLE_TIME_MAX:
				return getNMTCycleTimeMax();
			case XDDPackage.TGENERAL_FEATURES__NMT_CYCLE_TIME_MIN:
				return getNMTCycleTimeMin();
			case XDDPackage.TGENERAL_FEATURES__NMT_EMERGENCY_QUEUE_SIZE:
				return getNMTEmergencyQueueSize();
			case XDDPackage.TGENERAL_FEATURES__NMT_ERROR_ENTRIES:
				return getNMTErrorEntries();
			case XDDPackage.TGENERAL_FEATURES__NMT_EXT_NMT_CMDS:
				return isNMTExtNmtCmds();
			case XDDPackage.TGENERAL_FEATURES__NMT_FLUSH_ARP_ENTRY:
				return isNMTFlushArpEntry();
			case XDDPackage.TGENERAL_FEATURES__NMT_ISOCHRONOUS:
				return isNMTIsochronous();
			case XDDPackage.TGENERAL_FEATURES__NMT_MAX_CN_NODE_ID:
				return getNMTMaxCNNodeID();
			case XDDPackage.TGENERAL_FEATURES__NMT_MAX_CN_NUMBER:
				return getNMTMaxCNNumber();
			case XDDPackage.TGENERAL_FEATURES__NMT_MAX_HEARTBEATS:
				return getNMTMaxHeartbeats();
			case XDDPackage.TGENERAL_FEATURES__NMT_MIN_RED_CYCLE_TIME:
				return getNMTMinRedCycleTime();
			case XDDPackage.TGENERAL_FEATURES__NMT_NET_HOST_NAME_SET:
				return isNMTNetHostNameSet();
			case XDDPackage.TGENERAL_FEATURES__NMT_NODE_ID_BY_HW:
				return isNMTNodeIDByHW();
			case XDDPackage.TGENERAL_FEATURES__NMT_NODE_ID_BY_SW:
				return isNMTNodeIDBySW();
			case XDDPackage.TGENERAL_FEATURES__NMT_PRODUCT_CODE:
				return getNMTProductCode();
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_ACTIVE_NODES:
				return isNMTPublishActiveNodes();
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_CONFIG_NODES:
				return isNMTPublishConfigNodes();
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_EMERGENCY_NEW:
				return isNMTPublishEmergencyNew();
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_NODE_STATE:
				return isNMTPublishNodeState();
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_OPERATIONAL:
				return isNMTPublishOperational();
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_PRE_OP1:
				return isNMTPublishPreOp1();
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_PRE_OP2:
				return isNMTPublishPreOp2();
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_READY_TO_OP:
				return isNMTPublishReadyToOp();
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_STOPPED:
				return isNMTPublishStopped();
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_TIME:
				return isNMTPublishTime();
			case XDDPackage.TGENERAL_FEATURES__NMT_REVISION_NO:
				return getNMTRevisionNo();
			case XDDPackage.TGENERAL_FEATURES__NWL_FORWARD:
				return isNWLForward();
			case XDDPackage.TGENERAL_FEATURES__NWLICMP_SUPPORT:
				return isNWLICMPSupport();
			case XDDPackage.TGENERAL_FEATURES__NWLIP_SUPPORT:
				return isNWLIPSupport();
			case XDDPackage.TGENERAL_FEATURES__PDO_DYNAMIC_MAPPING:
				return isPDODynamicMapping();
			case XDDPackage.TGENERAL_FEATURES__PDO_GRANULARITY:
				return getPDOGranularity();
			case XDDPackage.TGENERAL_FEATURES__PDO_MAX_DESCR_MEM:
				return getPDOMaxDescrMem();
			case XDDPackage.TGENERAL_FEATURES__PDORPDO_CHANNEL_OBJECTS:
				return getPDORPDOChannelObjects();
			case XDDPackage.TGENERAL_FEATURES__PDORPDO_CHANNELS:
				return getPDORPDOChannels();
			case XDDPackage.TGENERAL_FEATURES__PDORPDO_CYCLE_DATA_LIM:
				return getPDORPDOCycleDataLim();
			case XDDPackage.TGENERAL_FEATURES__PDORPDO_OVERALL_OBJECTS:
				return getPDORPDOOverallObjects();
			case XDDPackage.TGENERAL_FEATURES__PDO_SELF_RECEIPT:
				return isPDOSelfReceipt();
			case XDDPackage.TGENERAL_FEATURES__PDOTPDO_CHANNEL_OBJECTS:
				return getPDOTPDOChannelObjects();
			case XDDPackage.TGENERAL_FEATURES__PDOTPDO_CYCLE_DATA_LIM:
				return getPDOTPDOCycleDataLim();
			case XDDPackage.TGENERAL_FEATURES__PDOTPDO_OVERALL_OBJECTS:
				return getPDOTPDOOverallObjects();
			case XDDPackage.TGENERAL_FEATURES__PHY_EXT_EPL_PORTS:
				return getPHYExtEPLPorts();
			case XDDPackage.TGENERAL_FEATURES__PHY_HUB_DELAY:
				return getPHYHubDelay();
			case XDDPackage.TGENERAL_FEATURES__PHY_HUB_INTEGRATED:
				return isPHYHubIntegrated();
			case XDDPackage.TGENERAL_FEATURES__PHY_HUB_JITTER:
				return getPHYHubJitter();
			case XDDPackage.TGENERAL_FEATURES__RT1RT1_SECURITY_SUPPORT:
				return isRT1RT1SecuritySupport();
			case XDDPackage.TGENERAL_FEATURES__RT1RT1_SUPPORT:
				return isRT1RT1Support();
			case XDDPackage.TGENERAL_FEATURES__RT2RT2_SUPPORT:
				return isRT2RT2Support();
			case XDDPackage.TGENERAL_FEATURES__SDO_CLIENT:
				return isSDOClient();
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_FILE_READ:
				return isSDOCmdFileRead();
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_FILE_WRITE:
				return isSDOCmdFileWrite();
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_LINK_NAME:
				return isSDOCmdLinkName();
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_READ_ALL_BY_INDEX:
				return isSDOCmdReadAllByIndex();
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_READ_BY_NAME:
				return isSDOCmdReadByName();
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_READ_MULT_PARAM:
				return isSDOCmdReadMultParam();
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_WRITE_ALL_BY_INDEX:
				return isSDOCmdWriteAllByIndex();
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_WRITE_BY_NAME:
				return isSDOCmdWriteByName();
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_WRITE_MULT_PARAM:
				return isSDOCmdWriteMultParam();
			case XDDPackage.TGENERAL_FEATURES__SDO_MAX_CONNECTIONS:
				return getSDOMaxConnections();
			case XDDPackage.TGENERAL_FEATURES__SDO_MAX_PARALLEL_CONNECTIONS:
				return getSDOMaxParallelConnections();
			case XDDPackage.TGENERAL_FEATURES__SDO_SEQ_LAYER_TX_HISTORY_SIZE:
				return getSDOSeqLayerTxHistorySize();
			case XDDPackage.TGENERAL_FEATURES__SDO_SERVER:
				return isSDOServer();
			case XDDPackage.TGENERAL_FEATURES__SDO_SUPPORT_ASND:
				return isSDOSupportASnd();
			case XDDPackage.TGENERAL_FEATURES__SDO_SUPPORT_PDO:
				return isSDOSupportPDO();
			case XDDPackage.TGENERAL_FEATURES__SDO_SUPPORT_UDP_IP:
				return isSDOSupportUdpIp();
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
			case XDDPackage.TGENERAL_FEATURES__CFM_CONFIG_MANAGER:
				setCFMConfigManager((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__DLL_ERR_BAD_PHYS_MODE:
				setDLLErrBadPhysMode((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__DLL_ERR_MAC_BUFFER:
				setDLLErrMacBuffer((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__DLL_FEATURE_CN:
				setDLLFeatureCN((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__DLL_FEATURE_MN:
				setDLLFeatureMN((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__DLL_MULTIPLE_PREQ_PRES:
				setDLLMultiplePReqPRes((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_BOOT_TIME_NOT_ACTIVE:
				setNMTBootTimeNotActive((Long)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_CYCLE_TIME_GRANULARITY:
				setNMTCycleTimeGranularity((Long)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_CYCLE_TIME_MAX:
				setNMTCycleTimeMax((Long)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_CYCLE_TIME_MIN:
				setNMTCycleTimeMin((Long)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_EMERGENCY_QUEUE_SIZE:
				setNMTEmergencyQueueSize((Long)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_ERROR_ENTRIES:
				setNMTErrorEntries((Long)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_EXT_NMT_CMDS:
				setNMTExtNmtCmds((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_FLUSH_ARP_ENTRY:
				setNMTFlushArpEntry((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_ISOCHRONOUS:
				setNMTIsochronous((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_MAX_CN_NODE_ID:
				setNMTMaxCNNodeID((Short)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_MAX_CN_NUMBER:
				setNMTMaxCNNumber((Short)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_MAX_HEARTBEATS:
				setNMTMaxHeartbeats((Short)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_MIN_RED_CYCLE_TIME:
				setNMTMinRedCycleTime((Long)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_NET_HOST_NAME_SET:
				setNMTNetHostNameSet((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_NODE_ID_BY_HW:
				setNMTNodeIDByHW((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_NODE_ID_BY_SW:
				setNMTNodeIDBySW((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_PRODUCT_CODE:
				setNMTProductCode((Long)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_ACTIVE_NODES:
				setNMTPublishActiveNodes((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_CONFIG_NODES:
				setNMTPublishConfigNodes((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_EMERGENCY_NEW:
				setNMTPublishEmergencyNew((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_NODE_STATE:
				setNMTPublishNodeState((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_OPERATIONAL:
				setNMTPublishOperational((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_PRE_OP1:
				setNMTPublishPreOp1((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_PRE_OP2:
				setNMTPublishPreOp2((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_READY_TO_OP:
				setNMTPublishReadyToOp((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_STOPPED:
				setNMTPublishStopped((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_TIME:
				setNMTPublishTime((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_REVISION_NO:
				setNMTRevisionNo((Long)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NWL_FORWARD:
				setNWLForward((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NWLICMP_SUPPORT:
				setNWLICMPSupport((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__NWLIP_SUPPORT:
				setNWLIPSupport((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__PDO_DYNAMIC_MAPPING:
				setPDODynamicMapping((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__PDO_GRANULARITY:
				setPDOGranularity((Short)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__PDO_MAX_DESCR_MEM:
				setPDOMaxDescrMem((Long)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__PDORPDO_CHANNEL_OBJECTS:
				setPDORPDOChannelObjects((Short)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__PDORPDO_CHANNELS:
				setPDORPDOChannels((Integer)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__PDORPDO_CYCLE_DATA_LIM:
				setPDORPDOCycleDataLim((Long)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__PDORPDO_OVERALL_OBJECTS:
				setPDORPDOOverallObjects((Integer)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__PDO_SELF_RECEIPT:
				setPDOSelfReceipt((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__PDOTPDO_CHANNEL_OBJECTS:
				setPDOTPDOChannelObjects((Short)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__PDOTPDO_CYCLE_DATA_LIM:
				setPDOTPDOCycleDataLim((Long)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__PDOTPDO_OVERALL_OBJECTS:
				setPDOTPDOOverallObjects((Integer)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__PHY_EXT_EPL_PORTS:
				setPHYExtEPLPorts((Short)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__PHY_HUB_DELAY:
				setPHYHubDelay((Long)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__PHY_HUB_INTEGRATED:
				setPHYHubIntegrated((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__PHY_HUB_JITTER:
				setPHYHubJitter((Long)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__RT1RT1_SECURITY_SUPPORT:
				setRT1RT1SecuritySupport((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__RT1RT1_SUPPORT:
				setRT1RT1Support((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__RT2RT2_SUPPORT:
				setRT2RT2Support((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_CLIENT:
				setSDOClient((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_FILE_READ:
				setSDOCmdFileRead((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_FILE_WRITE:
				setSDOCmdFileWrite((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_LINK_NAME:
				setSDOCmdLinkName((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_READ_ALL_BY_INDEX:
				setSDOCmdReadAllByIndex((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_READ_BY_NAME:
				setSDOCmdReadByName((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_READ_MULT_PARAM:
				setSDOCmdReadMultParam((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_WRITE_ALL_BY_INDEX:
				setSDOCmdWriteAllByIndex((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_WRITE_BY_NAME:
				setSDOCmdWriteByName((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_WRITE_MULT_PARAM:
				setSDOCmdWriteMultParam((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_MAX_CONNECTIONS:
				setSDOMaxConnections((Long)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_MAX_PARALLEL_CONNECTIONS:
				setSDOMaxParallelConnections((Long)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_SEQ_LAYER_TX_HISTORY_SIZE:
				setSDOSeqLayerTxHistorySize((Integer)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_SERVER:
				setSDOServer((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_SUPPORT_ASND:
				setSDOSupportASnd((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_SUPPORT_PDO:
				setSDOSupportPDO((Boolean)newValue);
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_SUPPORT_UDP_IP:
				setSDOSupportUdpIp((Boolean)newValue);
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
			case XDDPackage.TGENERAL_FEATURES__CFM_CONFIG_MANAGER:
				unsetCFMConfigManager();
				return;
			case XDDPackage.TGENERAL_FEATURES__DLL_ERR_BAD_PHYS_MODE:
				unsetDLLErrBadPhysMode();
				return;
			case XDDPackage.TGENERAL_FEATURES__DLL_ERR_MAC_BUFFER:
				unsetDLLErrMacBuffer();
				return;
			case XDDPackage.TGENERAL_FEATURES__DLL_FEATURE_CN:
				unsetDLLFeatureCN();
				return;
			case XDDPackage.TGENERAL_FEATURES__DLL_FEATURE_MN:
				unsetDLLFeatureMN();
				return;
			case XDDPackage.TGENERAL_FEATURES__DLL_MULTIPLE_PREQ_PRES:
				unsetDLLMultiplePReqPRes();
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_BOOT_TIME_NOT_ACTIVE:
				unsetNMTBootTimeNotActive();
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_CYCLE_TIME_GRANULARITY:
				unsetNMTCycleTimeGranularity();
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_CYCLE_TIME_MAX:
				unsetNMTCycleTimeMax();
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_CYCLE_TIME_MIN:
				unsetNMTCycleTimeMin();
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_EMERGENCY_QUEUE_SIZE:
				unsetNMTEmergencyQueueSize();
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_ERROR_ENTRIES:
				unsetNMTErrorEntries();
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_EXT_NMT_CMDS:
				unsetNMTExtNmtCmds();
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_FLUSH_ARP_ENTRY:
				unsetNMTFlushArpEntry();
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_ISOCHRONOUS:
				unsetNMTIsochronous();
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_MAX_CN_NODE_ID:
				unsetNMTMaxCNNodeID();
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_MAX_CN_NUMBER:
				unsetNMTMaxCNNumber();
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_MAX_HEARTBEATS:
				unsetNMTMaxHeartbeats();
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_MIN_RED_CYCLE_TIME:
				unsetNMTMinRedCycleTime();
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_NET_HOST_NAME_SET:
				unsetNMTNetHostNameSet();
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_NODE_ID_BY_HW:
				unsetNMTNodeIDByHW();
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_NODE_ID_BY_SW:
				unsetNMTNodeIDBySW();
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_PRODUCT_CODE:
				unsetNMTProductCode();
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_ACTIVE_NODES:
				unsetNMTPublishActiveNodes();
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_CONFIG_NODES:
				unsetNMTPublishConfigNodes();
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_EMERGENCY_NEW:
				unsetNMTPublishEmergencyNew();
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_NODE_STATE:
				unsetNMTPublishNodeState();
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_OPERATIONAL:
				unsetNMTPublishOperational();
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_PRE_OP1:
				unsetNMTPublishPreOp1();
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_PRE_OP2:
				unsetNMTPublishPreOp2();
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_READY_TO_OP:
				unsetNMTPublishReadyToOp();
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_STOPPED:
				unsetNMTPublishStopped();
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_TIME:
				unsetNMTPublishTime();
				return;
			case XDDPackage.TGENERAL_FEATURES__NMT_REVISION_NO:
				unsetNMTRevisionNo();
				return;
			case XDDPackage.TGENERAL_FEATURES__NWL_FORWARD:
				unsetNWLForward();
				return;
			case XDDPackage.TGENERAL_FEATURES__NWLICMP_SUPPORT:
				unsetNWLICMPSupport();
				return;
			case XDDPackage.TGENERAL_FEATURES__NWLIP_SUPPORT:
				unsetNWLIPSupport();
				return;
			case XDDPackage.TGENERAL_FEATURES__PDO_DYNAMIC_MAPPING:
				unsetPDODynamicMapping();
				return;
			case XDDPackage.TGENERAL_FEATURES__PDO_GRANULARITY:
				unsetPDOGranularity();
				return;
			case XDDPackage.TGENERAL_FEATURES__PDO_MAX_DESCR_MEM:
				unsetPDOMaxDescrMem();
				return;
			case XDDPackage.TGENERAL_FEATURES__PDORPDO_CHANNEL_OBJECTS:
				unsetPDORPDOChannelObjects();
				return;
			case XDDPackage.TGENERAL_FEATURES__PDORPDO_CHANNELS:
				unsetPDORPDOChannels();
				return;
			case XDDPackage.TGENERAL_FEATURES__PDORPDO_CYCLE_DATA_LIM:
				unsetPDORPDOCycleDataLim();
				return;
			case XDDPackage.TGENERAL_FEATURES__PDORPDO_OVERALL_OBJECTS:
				unsetPDORPDOOverallObjects();
				return;
			case XDDPackage.TGENERAL_FEATURES__PDO_SELF_RECEIPT:
				unsetPDOSelfReceipt();
				return;
			case XDDPackage.TGENERAL_FEATURES__PDOTPDO_CHANNEL_OBJECTS:
				unsetPDOTPDOChannelObjects();
				return;
			case XDDPackage.TGENERAL_FEATURES__PDOTPDO_CYCLE_DATA_LIM:
				unsetPDOTPDOCycleDataLim();
				return;
			case XDDPackage.TGENERAL_FEATURES__PDOTPDO_OVERALL_OBJECTS:
				unsetPDOTPDOOverallObjects();
				return;
			case XDDPackage.TGENERAL_FEATURES__PHY_EXT_EPL_PORTS:
				unsetPHYExtEPLPorts();
				return;
			case XDDPackage.TGENERAL_FEATURES__PHY_HUB_DELAY:
				unsetPHYHubDelay();
				return;
			case XDDPackage.TGENERAL_FEATURES__PHY_HUB_INTEGRATED:
				unsetPHYHubIntegrated();
				return;
			case XDDPackage.TGENERAL_FEATURES__PHY_HUB_JITTER:
				unsetPHYHubJitter();
				return;
			case XDDPackage.TGENERAL_FEATURES__RT1RT1_SECURITY_SUPPORT:
				unsetRT1RT1SecuritySupport();
				return;
			case XDDPackage.TGENERAL_FEATURES__RT1RT1_SUPPORT:
				unsetRT1RT1Support();
				return;
			case XDDPackage.TGENERAL_FEATURES__RT2RT2_SUPPORT:
				unsetRT2RT2Support();
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_CLIENT:
				unsetSDOClient();
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_FILE_READ:
				unsetSDOCmdFileRead();
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_FILE_WRITE:
				unsetSDOCmdFileWrite();
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_LINK_NAME:
				unsetSDOCmdLinkName();
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_READ_ALL_BY_INDEX:
				unsetSDOCmdReadAllByIndex();
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_READ_BY_NAME:
				unsetSDOCmdReadByName();
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_READ_MULT_PARAM:
				unsetSDOCmdReadMultParam();
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_WRITE_ALL_BY_INDEX:
				unsetSDOCmdWriteAllByIndex();
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_WRITE_BY_NAME:
				unsetSDOCmdWriteByName();
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_WRITE_MULT_PARAM:
				unsetSDOCmdWriteMultParam();
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_MAX_CONNECTIONS:
				unsetSDOMaxConnections();
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_MAX_PARALLEL_CONNECTIONS:
				unsetSDOMaxParallelConnections();
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_SEQ_LAYER_TX_HISTORY_SIZE:
				unsetSDOSeqLayerTxHistorySize();
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_SERVER:
				unsetSDOServer();
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_SUPPORT_ASND:
				unsetSDOSupportASnd();
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_SUPPORT_PDO:
				unsetSDOSupportPDO();
				return;
			case XDDPackage.TGENERAL_FEATURES__SDO_SUPPORT_UDP_IP:
				unsetSDOSupportUdpIp();
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
			case XDDPackage.TGENERAL_FEATURES__CFM_CONFIG_MANAGER:
				return isSetCFMConfigManager();
			case XDDPackage.TGENERAL_FEATURES__DLL_ERR_BAD_PHYS_MODE:
				return isSetDLLErrBadPhysMode();
			case XDDPackage.TGENERAL_FEATURES__DLL_ERR_MAC_BUFFER:
				return isSetDLLErrMacBuffer();
			case XDDPackage.TGENERAL_FEATURES__DLL_FEATURE_CN:
				return isSetDLLFeatureCN();
			case XDDPackage.TGENERAL_FEATURES__DLL_FEATURE_MN:
				return isSetDLLFeatureMN();
			case XDDPackage.TGENERAL_FEATURES__DLL_MULTIPLE_PREQ_PRES:
				return isSetDLLMultiplePReqPRes();
			case XDDPackage.TGENERAL_FEATURES__NMT_BOOT_TIME_NOT_ACTIVE:
				return isSetNMTBootTimeNotActive();
			case XDDPackage.TGENERAL_FEATURES__NMT_CYCLE_TIME_GRANULARITY:
				return isSetNMTCycleTimeGranularity();
			case XDDPackage.TGENERAL_FEATURES__NMT_CYCLE_TIME_MAX:
				return isSetNMTCycleTimeMax();
			case XDDPackage.TGENERAL_FEATURES__NMT_CYCLE_TIME_MIN:
				return isSetNMTCycleTimeMin();
			case XDDPackage.TGENERAL_FEATURES__NMT_EMERGENCY_QUEUE_SIZE:
				return isSetNMTEmergencyQueueSize();
			case XDDPackage.TGENERAL_FEATURES__NMT_ERROR_ENTRIES:
				return isSetNMTErrorEntries();
			case XDDPackage.TGENERAL_FEATURES__NMT_EXT_NMT_CMDS:
				return isSetNMTExtNmtCmds();
			case XDDPackage.TGENERAL_FEATURES__NMT_FLUSH_ARP_ENTRY:
				return isSetNMTFlushArpEntry();
			case XDDPackage.TGENERAL_FEATURES__NMT_ISOCHRONOUS:
				return isSetNMTIsochronous();
			case XDDPackage.TGENERAL_FEATURES__NMT_MAX_CN_NODE_ID:
				return isSetNMTMaxCNNodeID();
			case XDDPackage.TGENERAL_FEATURES__NMT_MAX_CN_NUMBER:
				return isSetNMTMaxCNNumber();
			case XDDPackage.TGENERAL_FEATURES__NMT_MAX_HEARTBEATS:
				return isSetNMTMaxHeartbeats();
			case XDDPackage.TGENERAL_FEATURES__NMT_MIN_RED_CYCLE_TIME:
				return isSetNMTMinRedCycleTime();
			case XDDPackage.TGENERAL_FEATURES__NMT_NET_HOST_NAME_SET:
				return isSetNMTNetHostNameSet();
			case XDDPackage.TGENERAL_FEATURES__NMT_NODE_ID_BY_HW:
				return isSetNMTNodeIDByHW();
			case XDDPackage.TGENERAL_FEATURES__NMT_NODE_ID_BY_SW:
				return isSetNMTNodeIDBySW();
			case XDDPackage.TGENERAL_FEATURES__NMT_PRODUCT_CODE:
				return isSetNMTProductCode();
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_ACTIVE_NODES:
				return isSetNMTPublishActiveNodes();
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_CONFIG_NODES:
				return isSetNMTPublishConfigNodes();
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_EMERGENCY_NEW:
				return isSetNMTPublishEmergencyNew();
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_NODE_STATE:
				return isSetNMTPublishNodeState();
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_OPERATIONAL:
				return isSetNMTPublishOperational();
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_PRE_OP1:
				return isSetNMTPublishPreOp1();
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_PRE_OP2:
				return isSetNMTPublishPreOp2();
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_READY_TO_OP:
				return isSetNMTPublishReadyToOp();
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_STOPPED:
				return isSetNMTPublishStopped();
			case XDDPackage.TGENERAL_FEATURES__NMT_PUBLISH_TIME:
				return isSetNMTPublishTime();
			case XDDPackage.TGENERAL_FEATURES__NMT_REVISION_NO:
				return isSetNMTRevisionNo();
			case XDDPackage.TGENERAL_FEATURES__NWL_FORWARD:
				return isSetNWLForward();
			case XDDPackage.TGENERAL_FEATURES__NWLICMP_SUPPORT:
				return isSetNWLICMPSupport();
			case XDDPackage.TGENERAL_FEATURES__NWLIP_SUPPORT:
				return isSetNWLIPSupport();
			case XDDPackage.TGENERAL_FEATURES__PDO_DYNAMIC_MAPPING:
				return isSetPDODynamicMapping();
			case XDDPackage.TGENERAL_FEATURES__PDO_GRANULARITY:
				return isSetPDOGranularity();
			case XDDPackage.TGENERAL_FEATURES__PDO_MAX_DESCR_MEM:
				return isSetPDOMaxDescrMem();
			case XDDPackage.TGENERAL_FEATURES__PDORPDO_CHANNEL_OBJECTS:
				return isSetPDORPDOChannelObjects();
			case XDDPackage.TGENERAL_FEATURES__PDORPDO_CHANNELS:
				return isSetPDORPDOChannels();
			case XDDPackage.TGENERAL_FEATURES__PDORPDO_CYCLE_DATA_LIM:
				return isSetPDORPDOCycleDataLim();
			case XDDPackage.TGENERAL_FEATURES__PDORPDO_OVERALL_OBJECTS:
				return isSetPDORPDOOverallObjects();
			case XDDPackage.TGENERAL_FEATURES__PDO_SELF_RECEIPT:
				return isSetPDOSelfReceipt();
			case XDDPackage.TGENERAL_FEATURES__PDOTPDO_CHANNEL_OBJECTS:
				return isSetPDOTPDOChannelObjects();
			case XDDPackage.TGENERAL_FEATURES__PDOTPDO_CYCLE_DATA_LIM:
				return isSetPDOTPDOCycleDataLim();
			case XDDPackage.TGENERAL_FEATURES__PDOTPDO_OVERALL_OBJECTS:
				return isSetPDOTPDOOverallObjects();
			case XDDPackage.TGENERAL_FEATURES__PHY_EXT_EPL_PORTS:
				return isSetPHYExtEPLPorts();
			case XDDPackage.TGENERAL_FEATURES__PHY_HUB_DELAY:
				return isSetPHYHubDelay();
			case XDDPackage.TGENERAL_FEATURES__PHY_HUB_INTEGRATED:
				return isSetPHYHubIntegrated();
			case XDDPackage.TGENERAL_FEATURES__PHY_HUB_JITTER:
				return isSetPHYHubJitter();
			case XDDPackage.TGENERAL_FEATURES__RT1RT1_SECURITY_SUPPORT:
				return isSetRT1RT1SecuritySupport();
			case XDDPackage.TGENERAL_FEATURES__RT1RT1_SUPPORT:
				return isSetRT1RT1Support();
			case XDDPackage.TGENERAL_FEATURES__RT2RT2_SUPPORT:
				return isSetRT2RT2Support();
			case XDDPackage.TGENERAL_FEATURES__SDO_CLIENT:
				return isSetSDOClient();
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_FILE_READ:
				return isSetSDOCmdFileRead();
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_FILE_WRITE:
				return isSetSDOCmdFileWrite();
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_LINK_NAME:
				return isSetSDOCmdLinkName();
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_READ_ALL_BY_INDEX:
				return isSetSDOCmdReadAllByIndex();
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_READ_BY_NAME:
				return isSetSDOCmdReadByName();
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_READ_MULT_PARAM:
				return isSetSDOCmdReadMultParam();
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_WRITE_ALL_BY_INDEX:
				return isSetSDOCmdWriteAllByIndex();
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_WRITE_BY_NAME:
				return isSetSDOCmdWriteByName();
			case XDDPackage.TGENERAL_FEATURES__SDO_CMD_WRITE_MULT_PARAM:
				return isSetSDOCmdWriteMultParam();
			case XDDPackage.TGENERAL_FEATURES__SDO_MAX_CONNECTIONS:
				return isSetSDOMaxConnections();
			case XDDPackage.TGENERAL_FEATURES__SDO_MAX_PARALLEL_CONNECTIONS:
				return isSetSDOMaxParallelConnections();
			case XDDPackage.TGENERAL_FEATURES__SDO_SEQ_LAYER_TX_HISTORY_SIZE:
				return isSetSDOSeqLayerTxHistorySize();
			case XDDPackage.TGENERAL_FEATURES__SDO_SERVER:
				return isSetSDOServer();
			case XDDPackage.TGENERAL_FEATURES__SDO_SUPPORT_ASND:
				return isSetSDOSupportASnd();
			case XDDPackage.TGENERAL_FEATURES__SDO_SUPPORT_PDO:
				return isSetSDOSupportPDO();
			case XDDPackage.TGENERAL_FEATURES__SDO_SUPPORT_UDP_IP:
				return isSetSDOSupportUdpIp();
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
		result.append(" (cFMConfigManager: ");
		if (cFMConfigManagerESet) result.append(cFMConfigManager); else result.append("<unset>");
		result.append(", dLLErrBadPhysMode: ");
		if (dLLErrBadPhysModeESet) result.append(dLLErrBadPhysMode); else result.append("<unset>");
		result.append(", dLLErrMacBuffer: ");
		if (dLLErrMacBufferESet) result.append(dLLErrMacBuffer); else result.append("<unset>");
		result.append(", dLLFeatureCN: ");
		if (dLLFeatureCNESet) result.append(dLLFeatureCN); else result.append("<unset>");
		result.append(", dLLFeatureMN: ");
		if (dLLFeatureMNESet) result.append(dLLFeatureMN); else result.append("<unset>");
		result.append(", dLLMultiplePReqPRes: ");
		if (dLLMultiplePReqPResESet) result.append(dLLMultiplePReqPRes); else result.append("<unset>");
		result.append(", nMTBootTimeNotActive: ");
		if (nMTBootTimeNotActiveESet) result.append(nMTBootTimeNotActive); else result.append("<unset>");
		result.append(", nMTCycleTimeGranularity: ");
		if (nMTCycleTimeGranularityESet) result.append(nMTCycleTimeGranularity); else result.append("<unset>");
		result.append(", nMTCycleTimeMax: ");
		if (nMTCycleTimeMaxESet) result.append(nMTCycleTimeMax); else result.append("<unset>");
		result.append(", nMTCycleTimeMin: ");
		if (nMTCycleTimeMinESet) result.append(nMTCycleTimeMin); else result.append("<unset>");
		result.append(", nMTEmergencyQueueSize: ");
		if (nMTEmergencyQueueSizeESet) result.append(nMTEmergencyQueueSize); else result.append("<unset>");
		result.append(", nMTErrorEntries: ");
		if (nMTErrorEntriesESet) result.append(nMTErrorEntries); else result.append("<unset>");
		result.append(", nMTExtNmtCmds: ");
		if (nMTExtNmtCmdsESet) result.append(nMTExtNmtCmds); else result.append("<unset>");
		result.append(", nMTFlushArpEntry: ");
		if (nMTFlushArpEntryESet) result.append(nMTFlushArpEntry); else result.append("<unset>");
		result.append(", nMTIsochronous: ");
		if (nMTIsochronousESet) result.append(nMTIsochronous); else result.append("<unset>");
		result.append(", nMTMaxCNNodeID: ");
		if (nMTMaxCNNodeIDESet) result.append(nMTMaxCNNodeID); else result.append("<unset>");
		result.append(", nMTMaxCNNumber: ");
		if (nMTMaxCNNumberESet) result.append(nMTMaxCNNumber); else result.append("<unset>");
		result.append(", nMTMaxHeartbeats: ");
		if (nMTMaxHeartbeatsESet) result.append(nMTMaxHeartbeats); else result.append("<unset>");
		result.append(", nMTMinRedCycleTime: ");
		if (nMTMinRedCycleTimeESet) result.append(nMTMinRedCycleTime); else result.append("<unset>");
		result.append(", nMTNetHostNameSet: ");
		if (nMTNetHostNameSetESet) result.append(nMTNetHostNameSet); else result.append("<unset>");
		result.append(", nMTNodeIDByHW: ");
		if (nMTNodeIDByHWESet) result.append(nMTNodeIDByHW); else result.append("<unset>");
		result.append(", nMTNodeIDBySW: ");
		if (nMTNodeIDBySWESet) result.append(nMTNodeIDBySW); else result.append("<unset>");
		result.append(", nMTProductCode: ");
		if (nMTProductCodeESet) result.append(nMTProductCode); else result.append("<unset>");
		result.append(", nMTPublishActiveNodes: ");
		if (nMTPublishActiveNodesESet) result.append(nMTPublishActiveNodes); else result.append("<unset>");
		result.append(", nMTPublishConfigNodes: ");
		if (nMTPublishConfigNodesESet) result.append(nMTPublishConfigNodes); else result.append("<unset>");
		result.append(", nMTPublishEmergencyNew: ");
		if (nMTPublishEmergencyNewESet) result.append(nMTPublishEmergencyNew); else result.append("<unset>");
		result.append(", nMTPublishNodeState: ");
		if (nMTPublishNodeStateESet) result.append(nMTPublishNodeState); else result.append("<unset>");
		result.append(", nMTPublishOperational: ");
		if (nMTPublishOperationalESet) result.append(nMTPublishOperational); else result.append("<unset>");
		result.append(", nMTPublishPreOp1: ");
		if (nMTPublishPreOp1ESet) result.append(nMTPublishPreOp1); else result.append("<unset>");
		result.append(", nMTPublishPreOp2: ");
		if (nMTPublishPreOp2ESet) result.append(nMTPublishPreOp2); else result.append("<unset>");
		result.append(", nMTPublishReadyToOp: ");
		if (nMTPublishReadyToOpESet) result.append(nMTPublishReadyToOp); else result.append("<unset>");
		result.append(", nMTPublishStopped: ");
		if (nMTPublishStoppedESet) result.append(nMTPublishStopped); else result.append("<unset>");
		result.append(", nMTPublishTime: ");
		if (nMTPublishTimeESet) result.append(nMTPublishTime); else result.append("<unset>");
		result.append(", nMTRevisionNo: ");
		if (nMTRevisionNoESet) result.append(nMTRevisionNo); else result.append("<unset>");
		result.append(", nWLForward: ");
		if (nWLForwardESet) result.append(nWLForward); else result.append("<unset>");
		result.append(", nWLICMPSupport: ");
		if (nWLICMPSupportESet) result.append(nWLICMPSupport); else result.append("<unset>");
		result.append(", nWLIPSupport: ");
		if (nWLIPSupportESet) result.append(nWLIPSupport); else result.append("<unset>");
		result.append(", pDODynamicMapping: ");
		if (pDODynamicMappingESet) result.append(pDODynamicMapping); else result.append("<unset>");
		result.append(", pDOGranularity: ");
		if (pDOGranularityESet) result.append(pDOGranularity); else result.append("<unset>");
		result.append(", pDOMaxDescrMem: ");
		if (pDOMaxDescrMemESet) result.append(pDOMaxDescrMem); else result.append("<unset>");
		result.append(", pDORPDOChannelObjects: ");
		if (pDORPDOChannelObjectsESet) result.append(pDORPDOChannelObjects); else result.append("<unset>");
		result.append(", pDORPDOChannels: ");
		if (pDORPDOChannelsESet) result.append(pDORPDOChannels); else result.append("<unset>");
		result.append(", pDORPDOCycleDataLim: ");
		if (pDORPDOCycleDataLimESet) result.append(pDORPDOCycleDataLim); else result.append("<unset>");
		result.append(", pDORPDOOverallObjects: ");
		if (pDORPDOOverallObjectsESet) result.append(pDORPDOOverallObjects); else result.append("<unset>");
		result.append(", pDOSelfReceipt: ");
		if (pDOSelfReceiptESet) result.append(pDOSelfReceipt); else result.append("<unset>");
		result.append(", pDOTPDOChannelObjects: ");
		if (pDOTPDOChannelObjectsESet) result.append(pDOTPDOChannelObjects); else result.append("<unset>");
		result.append(", pDOTPDOCycleDataLim: ");
		if (pDOTPDOCycleDataLimESet) result.append(pDOTPDOCycleDataLim); else result.append("<unset>");
		result.append(", pDOTPDOOverallObjects: ");
		if (pDOTPDOOverallObjectsESet) result.append(pDOTPDOOverallObjects); else result.append("<unset>");
		result.append(", pHYExtEPLPorts: ");
		if (pHYExtEPLPortsESet) result.append(pHYExtEPLPorts); else result.append("<unset>");
		result.append(", pHYHubDelay: ");
		if (pHYHubDelayESet) result.append(pHYHubDelay); else result.append("<unset>");
		result.append(", pHYHubIntegrated: ");
		if (pHYHubIntegratedESet) result.append(pHYHubIntegrated); else result.append("<unset>");
		result.append(", pHYHubJitter: ");
		if (pHYHubJitterESet) result.append(pHYHubJitter); else result.append("<unset>");
		result.append(", rT1RT1SecuritySupport: ");
		if (rT1RT1SecuritySupportESet) result.append(rT1RT1SecuritySupport); else result.append("<unset>");
		result.append(", rT1RT1Support: ");
		if (rT1RT1SupportESet) result.append(rT1RT1Support); else result.append("<unset>");
		result.append(", rT2RT2Support: ");
		if (rT2RT2SupportESet) result.append(rT2RT2Support); else result.append("<unset>");
		result.append(", sDOClient: ");
		if (sDOClientESet) result.append(sDOClient); else result.append("<unset>");
		result.append(", sDOCmdFileRead: ");
		if (sDOCmdFileReadESet) result.append(sDOCmdFileRead); else result.append("<unset>");
		result.append(", sDOCmdFileWrite: ");
		if (sDOCmdFileWriteESet) result.append(sDOCmdFileWrite); else result.append("<unset>");
		result.append(", sDOCmdLinkName: ");
		if (sDOCmdLinkNameESet) result.append(sDOCmdLinkName); else result.append("<unset>");
		result.append(", sDOCmdReadAllByIndex: ");
		if (sDOCmdReadAllByIndexESet) result.append(sDOCmdReadAllByIndex); else result.append("<unset>");
		result.append(", sDOCmdReadByName: ");
		if (sDOCmdReadByNameESet) result.append(sDOCmdReadByName); else result.append("<unset>");
		result.append(", sDOCmdReadMultParam: ");
		if (sDOCmdReadMultParamESet) result.append(sDOCmdReadMultParam); else result.append("<unset>");
		result.append(", sDOCmdWriteAllByIndex: ");
		if (sDOCmdWriteAllByIndexESet) result.append(sDOCmdWriteAllByIndex); else result.append("<unset>");
		result.append(", sDOCmdWriteByName: ");
		if (sDOCmdWriteByNameESet) result.append(sDOCmdWriteByName); else result.append("<unset>");
		result.append(", sDOCmdWriteMultParam: ");
		if (sDOCmdWriteMultParamESet) result.append(sDOCmdWriteMultParam); else result.append("<unset>");
		result.append(", sDOMaxConnections: ");
		if (sDOMaxConnectionsESet) result.append(sDOMaxConnections); else result.append("<unset>");
		result.append(", sDOMaxParallelConnections: ");
		if (sDOMaxParallelConnectionsESet) result.append(sDOMaxParallelConnections); else result.append("<unset>");
		result.append(", sDOSeqLayerTxHistorySize: ");
		if (sDOSeqLayerTxHistorySizeESet) result.append(sDOSeqLayerTxHistorySize); else result.append("<unset>");
		result.append(", sDOServer: ");
		if (sDOServerESet) result.append(sDOServer); else result.append("<unset>");
		result.append(", sDOSupportASnd: ");
		if (sDOSupportASndESet) result.append(sDOSupportASnd); else result.append("<unset>");
		result.append(", sDOSupportPDO: ");
		if (sDOSupportPDOESet) result.append(sDOSupportPDO); else result.append("<unset>");
		result.append(", sDOSupportUdpIp: ");
		if (sDOSupportUdpIpESet) result.append(sDOSupportUdpIp); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TGeneralFeaturesImpl
