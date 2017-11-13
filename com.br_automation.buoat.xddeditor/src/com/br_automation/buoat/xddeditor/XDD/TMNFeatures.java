/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMN Features</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isDLLErrMNMultipleMN <em>DLL Err MN Multiple MN</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isDLLMNFeatureMultiplex <em>DLLMN Feature Multiplex</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isDLLMNFeaturePResTx <em>DLLMN Feature PRes Tx</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isDLLMNPResChaining <em>DLLMNP Res Chaining</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isDLLMNRingRedundancy <em>DLLMN Ring Redundancy</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNASnd2SoC <em>NMTMNA Snd2 So C</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTMNBasicEthernet <em>NMTMN Basic Ethernet</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTMNDNA <em>NMTMNDNA</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNMaxAsynchronousSlots <em>NMTMN Max Asynchronous Slots</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNMultiplCycMax <em>NMTMN Multipl Cyc Max</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNPRes2PReq <em>NMTMNP Res2 PReq</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNPRes2PRes <em>NMTMNP Res2 PRes</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNPResRx2SoA <em>NMTMNP Res Rx2 So A</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNPResTx2SoA <em>NMTMNP Res Tx2 So A</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTMNRedundancy <em>NMTMN Redundancy</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNSoA2ASndTx <em>NMTMN So A2A Snd Tx</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNSoC2PReq <em>NMTMN So C2P Req</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTNetTime <em>NMT Net Time</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTNetTimeIsRealTime <em>NMT Net Time Is Real Time</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTRelativeTime <em>NMT Relative Time</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTServiceUdpIp <em>NMT Service Udp Ip</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTSimpleBoot <em>NMT Simple Boot</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getPDOTPDOChannels <em>PDOTPDO Channels</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTMNFeatures()
 * @model extendedMetaData="name='t_MNFeatures' kind='empty'"
 * @generated
 */
public interface TMNFeatures extends EObject {
	/**
	 * Returns the value of the '<em><b>DLL Err MN Multiple MN</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DLL Err MN Multiple MN</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DLL Err MN Multiple MN</em>' attribute.
	 * @see #isSetDLLErrMNMultipleMN()
	 * @see #unsetDLLErrMNMultipleMN()
	 * @see #setDLLErrMNMultipleMN(boolean)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTMNFeatures_DLLErrMNMultipleMN()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='DLLErrMNMultipleMN'"
	 * @generated
	 */
	boolean isDLLErrMNMultipleMN();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isDLLErrMNMultipleMN <em>DLL Err MN Multiple MN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DLL Err MN Multiple MN</em>' attribute.
	 * @see #isSetDLLErrMNMultipleMN()
	 * @see #unsetDLLErrMNMultipleMN()
	 * @see #isDLLErrMNMultipleMN()
	 * @generated
	 */
	void setDLLErrMNMultipleMN(boolean value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isDLLErrMNMultipleMN <em>DLL Err MN Multiple MN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDLLErrMNMultipleMN()
	 * @see #isDLLErrMNMultipleMN()
	 * @see #setDLLErrMNMultipleMN(boolean)
	 * @generated
	 */
	void unsetDLLErrMNMultipleMN();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isDLLErrMNMultipleMN <em>DLL Err MN Multiple MN</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>DLL Err MN Multiple MN</em>' attribute is set.
	 * @see #unsetDLLErrMNMultipleMN()
	 * @see #isDLLErrMNMultipleMN()
	 * @see #setDLLErrMNMultipleMN(boolean)
	 * @generated
	 */
	boolean isSetDLLErrMNMultipleMN();

	/**
	 * Returns the value of the '<em><b>DLLMN Feature Multiplex</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DLLMN Feature Multiplex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DLLMN Feature Multiplex</em>' attribute.
	 * @see #isSetDLLMNFeatureMultiplex()
	 * @see #unsetDLLMNFeatureMultiplex()
	 * @see #setDLLMNFeatureMultiplex(boolean)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTMNFeatures_DLLMNFeatureMultiplex()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='DLLMNFeatureMultiplex'"
	 * @generated
	 */
	boolean isDLLMNFeatureMultiplex();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isDLLMNFeatureMultiplex <em>DLLMN Feature Multiplex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DLLMN Feature Multiplex</em>' attribute.
	 * @see #isSetDLLMNFeatureMultiplex()
	 * @see #unsetDLLMNFeatureMultiplex()
	 * @see #isDLLMNFeatureMultiplex()
	 * @generated
	 */
	void setDLLMNFeatureMultiplex(boolean value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isDLLMNFeatureMultiplex <em>DLLMN Feature Multiplex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDLLMNFeatureMultiplex()
	 * @see #isDLLMNFeatureMultiplex()
	 * @see #setDLLMNFeatureMultiplex(boolean)
	 * @generated
	 */
	void unsetDLLMNFeatureMultiplex();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isDLLMNFeatureMultiplex <em>DLLMN Feature Multiplex</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>DLLMN Feature Multiplex</em>' attribute is set.
	 * @see #unsetDLLMNFeatureMultiplex()
	 * @see #isDLLMNFeatureMultiplex()
	 * @see #setDLLMNFeatureMultiplex(boolean)
	 * @generated
	 */
	boolean isSetDLLMNFeatureMultiplex();

	/**
	 * Returns the value of the '<em><b>DLLMN Feature PRes Tx</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DLLMN Feature PRes Tx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DLLMN Feature PRes Tx</em>' attribute.
	 * @see #isSetDLLMNFeaturePResTx()
	 * @see #unsetDLLMNFeaturePResTx()
	 * @see #setDLLMNFeaturePResTx(boolean)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTMNFeatures_DLLMNFeaturePResTx()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='DLLMNFeaturePResTx'"
	 * @generated
	 */
	boolean isDLLMNFeaturePResTx();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isDLLMNFeaturePResTx <em>DLLMN Feature PRes Tx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DLLMN Feature PRes Tx</em>' attribute.
	 * @see #isSetDLLMNFeaturePResTx()
	 * @see #unsetDLLMNFeaturePResTx()
	 * @see #isDLLMNFeaturePResTx()
	 * @generated
	 */
	void setDLLMNFeaturePResTx(boolean value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isDLLMNFeaturePResTx <em>DLLMN Feature PRes Tx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDLLMNFeaturePResTx()
	 * @see #isDLLMNFeaturePResTx()
	 * @see #setDLLMNFeaturePResTx(boolean)
	 * @generated
	 */
	void unsetDLLMNFeaturePResTx();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isDLLMNFeaturePResTx <em>DLLMN Feature PRes Tx</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>DLLMN Feature PRes Tx</em>' attribute is set.
	 * @see #unsetDLLMNFeaturePResTx()
	 * @see #isDLLMNFeaturePResTx()
	 * @see #setDLLMNFeaturePResTx(boolean)
	 * @generated
	 */
	boolean isSetDLLMNFeaturePResTx();

	/**
	 * Returns the value of the '<em><b>DLLMNP Res Chaining</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DLLMNP Res Chaining</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DLLMNP Res Chaining</em>' attribute.
	 * @see #isSetDLLMNPResChaining()
	 * @see #unsetDLLMNPResChaining()
	 * @see #setDLLMNPResChaining(boolean)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTMNFeatures_DLLMNPResChaining()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='DLLMNPResChaining'"
	 * @generated
	 */
	boolean isDLLMNPResChaining();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isDLLMNPResChaining <em>DLLMNP Res Chaining</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DLLMNP Res Chaining</em>' attribute.
	 * @see #isSetDLLMNPResChaining()
	 * @see #unsetDLLMNPResChaining()
	 * @see #isDLLMNPResChaining()
	 * @generated
	 */
	void setDLLMNPResChaining(boolean value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isDLLMNPResChaining <em>DLLMNP Res Chaining</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDLLMNPResChaining()
	 * @see #isDLLMNPResChaining()
	 * @see #setDLLMNPResChaining(boolean)
	 * @generated
	 */
	void unsetDLLMNPResChaining();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isDLLMNPResChaining <em>DLLMNP Res Chaining</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>DLLMNP Res Chaining</em>' attribute is set.
	 * @see #unsetDLLMNPResChaining()
	 * @see #isDLLMNPResChaining()
	 * @see #setDLLMNPResChaining(boolean)
	 * @generated
	 */
	boolean isSetDLLMNPResChaining();

	/**
	 * Returns the value of the '<em><b>DLLMN Ring Redundancy</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DLLMN Ring Redundancy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DLLMN Ring Redundancy</em>' attribute.
	 * @see #isSetDLLMNRingRedundancy()
	 * @see #unsetDLLMNRingRedundancy()
	 * @see #setDLLMNRingRedundancy(boolean)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTMNFeatures_DLLMNRingRedundancy()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='DLLMNRingRedundancy'"
	 * @generated
	 */
	boolean isDLLMNRingRedundancy();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isDLLMNRingRedundancy <em>DLLMN Ring Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DLLMN Ring Redundancy</em>' attribute.
	 * @see #isSetDLLMNRingRedundancy()
	 * @see #unsetDLLMNRingRedundancy()
	 * @see #isDLLMNRingRedundancy()
	 * @generated
	 */
	void setDLLMNRingRedundancy(boolean value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isDLLMNRingRedundancy <em>DLLMN Ring Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDLLMNRingRedundancy()
	 * @see #isDLLMNRingRedundancy()
	 * @see #setDLLMNRingRedundancy(boolean)
	 * @generated
	 */
	void unsetDLLMNRingRedundancy();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isDLLMNRingRedundancy <em>DLLMN Ring Redundancy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>DLLMN Ring Redundancy</em>' attribute is set.
	 * @see #unsetDLLMNRingRedundancy()
	 * @see #isDLLMNRingRedundancy()
	 * @see #setDLLMNRingRedundancy(boolean)
	 * @generated
	 */
	boolean isSetDLLMNRingRedundancy();

	/**
	 * Returns the value of the '<em><b>NMTMNA Snd2 So C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NMTMNA Snd2 So C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NMTMNA Snd2 So C</em>' attribute.
	 * @see #isSetNMTMNASnd2SoC()
	 * @see #unsetNMTMNASnd2SoC()
	 * @see #setNMTMNASnd2SoC(long)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTMNFeatures_NMTMNASnd2SoC()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
	 *        extendedMetaData="kind='attribute' name='NMTMNASnd2SoC'"
	 * @generated
	 */
	long getNMTMNASnd2SoC();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNASnd2SoC <em>NMTMNA Snd2 So C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NMTMNA Snd2 So C</em>' attribute.
	 * @see #isSetNMTMNASnd2SoC()
	 * @see #unsetNMTMNASnd2SoC()
	 * @see #getNMTMNASnd2SoC()
	 * @generated
	 */
	void setNMTMNASnd2SoC(long value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNASnd2SoC <em>NMTMNA Snd2 So C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNMTMNASnd2SoC()
	 * @see #getNMTMNASnd2SoC()
	 * @see #setNMTMNASnd2SoC(long)
	 * @generated
	 */
	void unsetNMTMNASnd2SoC();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNASnd2SoC <em>NMTMNA Snd2 So C</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NMTMNA Snd2 So C</em>' attribute is set.
	 * @see #unsetNMTMNASnd2SoC()
	 * @see #getNMTMNASnd2SoC()
	 * @see #setNMTMNASnd2SoC(long)
	 * @generated
	 */
	boolean isSetNMTMNASnd2SoC();

	/**
	 * Returns the value of the '<em><b>NMTMN Basic Ethernet</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NMTMN Basic Ethernet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NMTMN Basic Ethernet</em>' attribute.
	 * @see #isSetNMTMNBasicEthernet()
	 * @see #unsetNMTMNBasicEthernet()
	 * @see #setNMTMNBasicEthernet(boolean)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTMNFeatures_NMTMNBasicEthernet()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='NMTMNBasicEthernet'"
	 * @generated
	 */
	boolean isNMTMNBasicEthernet();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTMNBasicEthernet <em>NMTMN Basic Ethernet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NMTMN Basic Ethernet</em>' attribute.
	 * @see #isSetNMTMNBasicEthernet()
	 * @see #unsetNMTMNBasicEthernet()
	 * @see #isNMTMNBasicEthernet()
	 * @generated
	 */
	void setNMTMNBasicEthernet(boolean value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTMNBasicEthernet <em>NMTMN Basic Ethernet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNMTMNBasicEthernet()
	 * @see #isNMTMNBasicEthernet()
	 * @see #setNMTMNBasicEthernet(boolean)
	 * @generated
	 */
	void unsetNMTMNBasicEthernet();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTMNBasicEthernet <em>NMTMN Basic Ethernet</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NMTMN Basic Ethernet</em>' attribute is set.
	 * @see #unsetNMTMNBasicEthernet()
	 * @see #isNMTMNBasicEthernet()
	 * @see #setNMTMNBasicEthernet(boolean)
	 * @generated
	 */
	boolean isSetNMTMNBasicEthernet();

	/**
	 * Returns the value of the '<em><b>NMTMNDNA</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NMTMNDNA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NMTMNDNA</em>' attribute.
	 * @see #isSetNMTMNDNA()
	 * @see #unsetNMTMNDNA()
	 * @see #setNMTMNDNA(boolean)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTMNFeatures_NMTMNDNA()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='NMTMNDNA'"
	 * @generated
	 */
	boolean isNMTMNDNA();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTMNDNA <em>NMTMNDNA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NMTMNDNA</em>' attribute.
	 * @see #isSetNMTMNDNA()
	 * @see #unsetNMTMNDNA()
	 * @see #isNMTMNDNA()
	 * @generated
	 */
	void setNMTMNDNA(boolean value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTMNDNA <em>NMTMNDNA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNMTMNDNA()
	 * @see #isNMTMNDNA()
	 * @see #setNMTMNDNA(boolean)
	 * @generated
	 */
	void unsetNMTMNDNA();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTMNDNA <em>NMTMNDNA</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NMTMNDNA</em>' attribute is set.
	 * @see #unsetNMTMNDNA()
	 * @see #isNMTMNDNA()
	 * @see #setNMTMNDNA(boolean)
	 * @generated
	 */
	boolean isSetNMTMNDNA();

	/**
	 * Returns the value of the '<em><b>NMTMN Max Asynchronous Slots</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NMTMN Max Asynchronous Slots</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NMTMN Max Asynchronous Slots</em>' attribute.
	 * @see #isSetNMTMNMaxAsynchronousSlots()
	 * @see #unsetNMTMNMaxAsynchronousSlots()
	 * @see #setNMTMNMaxAsynchronousSlots(short)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTMNFeatures_NMTMNMaxAsynchronousSlots()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte"
	 *        extendedMetaData="kind='attribute' name='NMTMNMaxAsynchronousSlots'"
	 * @generated
	 */
	short getNMTMNMaxAsynchronousSlots();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNMaxAsynchronousSlots <em>NMTMN Max Asynchronous Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NMTMN Max Asynchronous Slots</em>' attribute.
	 * @see #isSetNMTMNMaxAsynchronousSlots()
	 * @see #unsetNMTMNMaxAsynchronousSlots()
	 * @see #getNMTMNMaxAsynchronousSlots()
	 * @generated
	 */
	void setNMTMNMaxAsynchronousSlots(short value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNMaxAsynchronousSlots <em>NMTMN Max Asynchronous Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNMTMNMaxAsynchronousSlots()
	 * @see #getNMTMNMaxAsynchronousSlots()
	 * @see #setNMTMNMaxAsynchronousSlots(short)
	 * @generated
	 */
	void unsetNMTMNMaxAsynchronousSlots();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNMaxAsynchronousSlots <em>NMTMN Max Asynchronous Slots</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NMTMN Max Asynchronous Slots</em>' attribute is set.
	 * @see #unsetNMTMNMaxAsynchronousSlots()
	 * @see #getNMTMNMaxAsynchronousSlots()
	 * @see #setNMTMNMaxAsynchronousSlots(short)
	 * @generated
	 */
	boolean isSetNMTMNMaxAsynchronousSlots();

	/**
	 * Returns the value of the '<em><b>NMTMN Multipl Cyc Max</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NMTMN Multipl Cyc Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NMTMN Multipl Cyc Max</em>' attribute.
	 * @see #isSetNMTMNMultiplCycMax()
	 * @see #unsetNMTMNMultiplCycMax()
	 * @see #setNMTMNMultiplCycMax(short)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTMNFeatures_NMTMNMultiplCycMax()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte"
	 *        extendedMetaData="kind='attribute' name='NMTMNMultiplCycMax'"
	 * @generated
	 */
	short getNMTMNMultiplCycMax();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNMultiplCycMax <em>NMTMN Multipl Cyc Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NMTMN Multipl Cyc Max</em>' attribute.
	 * @see #isSetNMTMNMultiplCycMax()
	 * @see #unsetNMTMNMultiplCycMax()
	 * @see #getNMTMNMultiplCycMax()
	 * @generated
	 */
	void setNMTMNMultiplCycMax(short value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNMultiplCycMax <em>NMTMN Multipl Cyc Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNMTMNMultiplCycMax()
	 * @see #getNMTMNMultiplCycMax()
	 * @see #setNMTMNMultiplCycMax(short)
	 * @generated
	 */
	void unsetNMTMNMultiplCycMax();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNMultiplCycMax <em>NMTMN Multipl Cyc Max</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NMTMN Multipl Cyc Max</em>' attribute is set.
	 * @see #unsetNMTMNMultiplCycMax()
	 * @see #getNMTMNMultiplCycMax()
	 * @see #setNMTMNMultiplCycMax(short)
	 * @generated
	 */
	boolean isSetNMTMNMultiplCycMax();

	/**
	 * Returns the value of the '<em><b>NMTMNP Res2 PReq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NMTMNP Res2 PReq</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NMTMNP Res2 PReq</em>' attribute.
	 * @see #isSetNMTMNPRes2PReq()
	 * @see #unsetNMTMNPRes2PReq()
	 * @see #setNMTMNPRes2PReq(long)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTMNFeatures_NMTMNPRes2PReq()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
	 *        extendedMetaData="kind='attribute' name='NMTMNPRes2PReq'"
	 * @generated
	 */
	long getNMTMNPRes2PReq();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNPRes2PReq <em>NMTMNP Res2 PReq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NMTMNP Res2 PReq</em>' attribute.
	 * @see #isSetNMTMNPRes2PReq()
	 * @see #unsetNMTMNPRes2PReq()
	 * @see #getNMTMNPRes2PReq()
	 * @generated
	 */
	void setNMTMNPRes2PReq(long value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNPRes2PReq <em>NMTMNP Res2 PReq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNMTMNPRes2PReq()
	 * @see #getNMTMNPRes2PReq()
	 * @see #setNMTMNPRes2PReq(long)
	 * @generated
	 */
	void unsetNMTMNPRes2PReq();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNPRes2PReq <em>NMTMNP Res2 PReq</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NMTMNP Res2 PReq</em>' attribute is set.
	 * @see #unsetNMTMNPRes2PReq()
	 * @see #getNMTMNPRes2PReq()
	 * @see #setNMTMNPRes2PReq(long)
	 * @generated
	 */
	boolean isSetNMTMNPRes2PReq();

	/**
	 * Returns the value of the '<em><b>NMTMNP Res2 PRes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NMTMNP Res2 PRes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NMTMNP Res2 PRes</em>' attribute.
	 * @see #isSetNMTMNPRes2PRes()
	 * @see #unsetNMTMNPRes2PRes()
	 * @see #setNMTMNPRes2PRes(long)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTMNFeatures_NMTMNPRes2PRes()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
	 *        extendedMetaData="kind='attribute' name='NMTMNPRes2PRes'"
	 * @generated
	 */
	long getNMTMNPRes2PRes();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNPRes2PRes <em>NMTMNP Res2 PRes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NMTMNP Res2 PRes</em>' attribute.
	 * @see #isSetNMTMNPRes2PRes()
	 * @see #unsetNMTMNPRes2PRes()
	 * @see #getNMTMNPRes2PRes()
	 * @generated
	 */
	void setNMTMNPRes2PRes(long value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNPRes2PRes <em>NMTMNP Res2 PRes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNMTMNPRes2PRes()
	 * @see #getNMTMNPRes2PRes()
	 * @see #setNMTMNPRes2PRes(long)
	 * @generated
	 */
	void unsetNMTMNPRes2PRes();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNPRes2PRes <em>NMTMNP Res2 PRes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NMTMNP Res2 PRes</em>' attribute is set.
	 * @see #unsetNMTMNPRes2PRes()
	 * @see #getNMTMNPRes2PRes()
	 * @see #setNMTMNPRes2PRes(long)
	 * @generated
	 */
	boolean isSetNMTMNPRes2PRes();

	/**
	 * Returns the value of the '<em><b>NMTMNP Res Rx2 So A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NMTMNP Res Rx2 So A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NMTMNP Res Rx2 So A</em>' attribute.
	 * @see #isSetNMTMNPResRx2SoA()
	 * @see #unsetNMTMNPResRx2SoA()
	 * @see #setNMTMNPResRx2SoA(long)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTMNFeatures_NMTMNPResRx2SoA()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
	 *        extendedMetaData="kind='attribute' name='NMTMNPResRx2SoA'"
	 * @generated
	 */
	long getNMTMNPResRx2SoA();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNPResRx2SoA <em>NMTMNP Res Rx2 So A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NMTMNP Res Rx2 So A</em>' attribute.
	 * @see #isSetNMTMNPResRx2SoA()
	 * @see #unsetNMTMNPResRx2SoA()
	 * @see #getNMTMNPResRx2SoA()
	 * @generated
	 */
	void setNMTMNPResRx2SoA(long value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNPResRx2SoA <em>NMTMNP Res Rx2 So A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNMTMNPResRx2SoA()
	 * @see #getNMTMNPResRx2SoA()
	 * @see #setNMTMNPResRx2SoA(long)
	 * @generated
	 */
	void unsetNMTMNPResRx2SoA();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNPResRx2SoA <em>NMTMNP Res Rx2 So A</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NMTMNP Res Rx2 So A</em>' attribute is set.
	 * @see #unsetNMTMNPResRx2SoA()
	 * @see #getNMTMNPResRx2SoA()
	 * @see #setNMTMNPResRx2SoA(long)
	 * @generated
	 */
	boolean isSetNMTMNPResRx2SoA();

	/**
	 * Returns the value of the '<em><b>NMTMNP Res Tx2 So A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NMTMNP Res Tx2 So A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NMTMNP Res Tx2 So A</em>' attribute.
	 * @see #isSetNMTMNPResTx2SoA()
	 * @see #unsetNMTMNPResTx2SoA()
	 * @see #setNMTMNPResTx2SoA(long)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTMNFeatures_NMTMNPResTx2SoA()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
	 *        extendedMetaData="kind='attribute' name='NMTMNPResTx2SoA'"
	 * @generated
	 */
	long getNMTMNPResTx2SoA();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNPResTx2SoA <em>NMTMNP Res Tx2 So A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NMTMNP Res Tx2 So A</em>' attribute.
	 * @see #isSetNMTMNPResTx2SoA()
	 * @see #unsetNMTMNPResTx2SoA()
	 * @see #getNMTMNPResTx2SoA()
	 * @generated
	 */
	void setNMTMNPResTx2SoA(long value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNPResTx2SoA <em>NMTMNP Res Tx2 So A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNMTMNPResTx2SoA()
	 * @see #getNMTMNPResTx2SoA()
	 * @see #setNMTMNPResTx2SoA(long)
	 * @generated
	 */
	void unsetNMTMNPResTx2SoA();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNPResTx2SoA <em>NMTMNP Res Tx2 So A</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NMTMNP Res Tx2 So A</em>' attribute is set.
	 * @see #unsetNMTMNPResTx2SoA()
	 * @see #getNMTMNPResTx2SoA()
	 * @see #setNMTMNPResTx2SoA(long)
	 * @generated
	 */
	boolean isSetNMTMNPResTx2SoA();

	/**
	 * Returns the value of the '<em><b>NMTMN Redundancy</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NMTMN Redundancy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NMTMN Redundancy</em>' attribute.
	 * @see #isSetNMTMNRedundancy()
	 * @see #unsetNMTMNRedundancy()
	 * @see #setNMTMNRedundancy(boolean)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTMNFeatures_NMTMNRedundancy()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='NMTMNRedundancy'"
	 * @generated
	 */
	boolean isNMTMNRedundancy();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTMNRedundancy <em>NMTMN Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NMTMN Redundancy</em>' attribute.
	 * @see #isSetNMTMNRedundancy()
	 * @see #unsetNMTMNRedundancy()
	 * @see #isNMTMNRedundancy()
	 * @generated
	 */
	void setNMTMNRedundancy(boolean value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTMNRedundancy <em>NMTMN Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNMTMNRedundancy()
	 * @see #isNMTMNRedundancy()
	 * @see #setNMTMNRedundancy(boolean)
	 * @generated
	 */
	void unsetNMTMNRedundancy();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTMNRedundancy <em>NMTMN Redundancy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NMTMN Redundancy</em>' attribute is set.
	 * @see #unsetNMTMNRedundancy()
	 * @see #isNMTMNRedundancy()
	 * @see #setNMTMNRedundancy(boolean)
	 * @generated
	 */
	boolean isSetNMTMNRedundancy();

	/**
	 * Returns the value of the '<em><b>NMTMN So A2A Snd Tx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NMTMN So A2A Snd Tx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NMTMN So A2A Snd Tx</em>' attribute.
	 * @see #isSetNMTMNSoA2ASndTx()
	 * @see #unsetNMTMNSoA2ASndTx()
	 * @see #setNMTMNSoA2ASndTx(long)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTMNFeatures_NMTMNSoA2ASndTx()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
	 *        extendedMetaData="kind='attribute' name='NMTMNSoA2ASndTx'"
	 * @generated
	 */
	long getNMTMNSoA2ASndTx();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNSoA2ASndTx <em>NMTMN So A2A Snd Tx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NMTMN So A2A Snd Tx</em>' attribute.
	 * @see #isSetNMTMNSoA2ASndTx()
	 * @see #unsetNMTMNSoA2ASndTx()
	 * @see #getNMTMNSoA2ASndTx()
	 * @generated
	 */
	void setNMTMNSoA2ASndTx(long value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNSoA2ASndTx <em>NMTMN So A2A Snd Tx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNMTMNSoA2ASndTx()
	 * @see #getNMTMNSoA2ASndTx()
	 * @see #setNMTMNSoA2ASndTx(long)
	 * @generated
	 */
	void unsetNMTMNSoA2ASndTx();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNSoA2ASndTx <em>NMTMN So A2A Snd Tx</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NMTMN So A2A Snd Tx</em>' attribute is set.
	 * @see #unsetNMTMNSoA2ASndTx()
	 * @see #getNMTMNSoA2ASndTx()
	 * @see #setNMTMNSoA2ASndTx(long)
	 * @generated
	 */
	boolean isSetNMTMNSoA2ASndTx();

	/**
	 * Returns the value of the '<em><b>NMTMN So C2P Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NMTMN So C2P Req</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NMTMN So C2P Req</em>' attribute.
	 * @see #isSetNMTMNSoC2PReq()
	 * @see #unsetNMTMNSoC2PReq()
	 * @see #setNMTMNSoC2PReq(long)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTMNFeatures_NMTMNSoC2PReq()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
	 *        extendedMetaData="kind='attribute' name='NMTMNSoC2PReq'"
	 * @generated
	 */
	long getNMTMNSoC2PReq();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNSoC2PReq <em>NMTMN So C2P Req</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NMTMN So C2P Req</em>' attribute.
	 * @see #isSetNMTMNSoC2PReq()
	 * @see #unsetNMTMNSoC2PReq()
	 * @see #getNMTMNSoC2PReq()
	 * @generated
	 */
	void setNMTMNSoC2PReq(long value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNSoC2PReq <em>NMTMN So C2P Req</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNMTMNSoC2PReq()
	 * @see #getNMTMNSoC2PReq()
	 * @see #setNMTMNSoC2PReq(long)
	 * @generated
	 */
	void unsetNMTMNSoC2PReq();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNSoC2PReq <em>NMTMN So C2P Req</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NMTMN So C2P Req</em>' attribute is set.
	 * @see #unsetNMTMNSoC2PReq()
	 * @see #getNMTMNSoC2PReq()
	 * @see #setNMTMNSoC2PReq(long)
	 * @generated
	 */
	boolean isSetNMTMNSoC2PReq();

	/**
	 * Returns the value of the '<em><b>NMT Net Time</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NMT Net Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NMT Net Time</em>' attribute.
	 * @see #isSetNMTNetTime()
	 * @see #unsetNMTNetTime()
	 * @see #setNMTNetTime(boolean)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTMNFeatures_NMTNetTime()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='NMTNetTime'"
	 * @generated
	 */
	boolean isNMTNetTime();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTNetTime <em>NMT Net Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NMT Net Time</em>' attribute.
	 * @see #isSetNMTNetTime()
	 * @see #unsetNMTNetTime()
	 * @see #isNMTNetTime()
	 * @generated
	 */
	void setNMTNetTime(boolean value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTNetTime <em>NMT Net Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNMTNetTime()
	 * @see #isNMTNetTime()
	 * @see #setNMTNetTime(boolean)
	 * @generated
	 */
	void unsetNMTNetTime();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTNetTime <em>NMT Net Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NMT Net Time</em>' attribute is set.
	 * @see #unsetNMTNetTime()
	 * @see #isNMTNetTime()
	 * @see #setNMTNetTime(boolean)
	 * @generated
	 */
	boolean isSetNMTNetTime();

	/**
	 * Returns the value of the '<em><b>NMT Net Time Is Real Time</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NMT Net Time Is Real Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NMT Net Time Is Real Time</em>' attribute.
	 * @see #isSetNMTNetTimeIsRealTime()
	 * @see #unsetNMTNetTimeIsRealTime()
	 * @see #setNMTNetTimeIsRealTime(boolean)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTMNFeatures_NMTNetTimeIsRealTime()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='NMTNetTimeIsRealTime'"
	 * @generated
	 */
	boolean isNMTNetTimeIsRealTime();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTNetTimeIsRealTime <em>NMT Net Time Is Real Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NMT Net Time Is Real Time</em>' attribute.
	 * @see #isSetNMTNetTimeIsRealTime()
	 * @see #unsetNMTNetTimeIsRealTime()
	 * @see #isNMTNetTimeIsRealTime()
	 * @generated
	 */
	void setNMTNetTimeIsRealTime(boolean value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTNetTimeIsRealTime <em>NMT Net Time Is Real Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNMTNetTimeIsRealTime()
	 * @see #isNMTNetTimeIsRealTime()
	 * @see #setNMTNetTimeIsRealTime(boolean)
	 * @generated
	 */
	void unsetNMTNetTimeIsRealTime();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTNetTimeIsRealTime <em>NMT Net Time Is Real Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NMT Net Time Is Real Time</em>' attribute is set.
	 * @see #unsetNMTNetTimeIsRealTime()
	 * @see #isNMTNetTimeIsRealTime()
	 * @see #setNMTNetTimeIsRealTime(boolean)
	 * @generated
	 */
	boolean isSetNMTNetTimeIsRealTime();

	/**
	 * Returns the value of the '<em><b>NMT Relative Time</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NMT Relative Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NMT Relative Time</em>' attribute.
	 * @see #isSetNMTRelativeTime()
	 * @see #unsetNMTRelativeTime()
	 * @see #setNMTRelativeTime(boolean)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTMNFeatures_NMTRelativeTime()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='NMTRelativeTime'"
	 * @generated
	 */
	boolean isNMTRelativeTime();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTRelativeTime <em>NMT Relative Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NMT Relative Time</em>' attribute.
	 * @see #isSetNMTRelativeTime()
	 * @see #unsetNMTRelativeTime()
	 * @see #isNMTRelativeTime()
	 * @generated
	 */
	void setNMTRelativeTime(boolean value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTRelativeTime <em>NMT Relative Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNMTRelativeTime()
	 * @see #isNMTRelativeTime()
	 * @see #setNMTRelativeTime(boolean)
	 * @generated
	 */
	void unsetNMTRelativeTime();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTRelativeTime <em>NMT Relative Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NMT Relative Time</em>' attribute is set.
	 * @see #unsetNMTRelativeTime()
	 * @see #isNMTRelativeTime()
	 * @see #setNMTRelativeTime(boolean)
	 * @generated
	 */
	boolean isSetNMTRelativeTime();

	/**
	 * Returns the value of the '<em><b>NMT Service Udp Ip</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NMT Service Udp Ip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NMT Service Udp Ip</em>' attribute.
	 * @see #isSetNMTServiceUdpIp()
	 * @see #unsetNMTServiceUdpIp()
	 * @see #setNMTServiceUdpIp(boolean)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTMNFeatures_NMTServiceUdpIp()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='NMTServiceUdpIp'"
	 * @generated
	 */
	boolean isNMTServiceUdpIp();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTServiceUdpIp <em>NMT Service Udp Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NMT Service Udp Ip</em>' attribute.
	 * @see #isSetNMTServiceUdpIp()
	 * @see #unsetNMTServiceUdpIp()
	 * @see #isNMTServiceUdpIp()
	 * @generated
	 */
	void setNMTServiceUdpIp(boolean value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTServiceUdpIp <em>NMT Service Udp Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNMTServiceUdpIp()
	 * @see #isNMTServiceUdpIp()
	 * @see #setNMTServiceUdpIp(boolean)
	 * @generated
	 */
	void unsetNMTServiceUdpIp();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTServiceUdpIp <em>NMT Service Udp Ip</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NMT Service Udp Ip</em>' attribute is set.
	 * @see #unsetNMTServiceUdpIp()
	 * @see #isNMTServiceUdpIp()
	 * @see #setNMTServiceUdpIp(boolean)
	 * @generated
	 */
	boolean isSetNMTServiceUdpIp();

	/**
	 * Returns the value of the '<em><b>NMT Simple Boot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NMT Simple Boot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NMT Simple Boot</em>' attribute.
	 * @see #isSetNMTSimpleBoot()
	 * @see #unsetNMTSimpleBoot()
	 * @see #setNMTSimpleBoot(boolean)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTMNFeatures_NMTSimpleBoot()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='NMTSimpleBoot'"
	 * @generated
	 */
	boolean isNMTSimpleBoot();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTSimpleBoot <em>NMT Simple Boot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NMT Simple Boot</em>' attribute.
	 * @see #isSetNMTSimpleBoot()
	 * @see #unsetNMTSimpleBoot()
	 * @see #isNMTSimpleBoot()
	 * @generated
	 */
	void setNMTSimpleBoot(boolean value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTSimpleBoot <em>NMT Simple Boot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNMTSimpleBoot()
	 * @see #isNMTSimpleBoot()
	 * @see #setNMTSimpleBoot(boolean)
	 * @generated
	 */
	void unsetNMTSimpleBoot();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTSimpleBoot <em>NMT Simple Boot</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NMT Simple Boot</em>' attribute is set.
	 * @see #unsetNMTSimpleBoot()
	 * @see #isNMTSimpleBoot()
	 * @see #setNMTSimpleBoot(boolean)
	 * @generated
	 */
	boolean isSetNMTSimpleBoot();

	/**
	 * Returns the value of the '<em><b>PDOTPDO Channels</b></em>' attribute.
	 * The default value is <code>"256"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDOTPDO Channels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDOTPDO Channels</em>' attribute.
	 * @see #isSetPDOTPDOChannels()
	 * @see #unsetPDOTPDOChannels()
	 * @see #setPDOTPDOChannels(int)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTMNFeatures_PDOTPDOChannels()
	 * @model default="256" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedShort"
	 *        extendedMetaData="kind='attribute' name='PDOTPDOChannels'"
	 * @generated
	 */
	int getPDOTPDOChannels();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getPDOTPDOChannels <em>PDOTPDO Channels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PDOTPDO Channels</em>' attribute.
	 * @see #isSetPDOTPDOChannels()
	 * @see #unsetPDOTPDOChannels()
	 * @see #getPDOTPDOChannels()
	 * @generated
	 */
	void setPDOTPDOChannels(int value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getPDOTPDOChannels <em>PDOTPDO Channels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPDOTPDOChannels()
	 * @see #getPDOTPDOChannels()
	 * @see #setPDOTPDOChannels(int)
	 * @generated
	 */
	void unsetPDOTPDOChannels();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getPDOTPDOChannels <em>PDOTPDO Channels</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>PDOTPDO Channels</em>' attribute is set.
	 * @see #unsetPDOTPDOChannels()
	 * @see #getPDOTPDOChannels()
	 * @see #setPDOTPDOChannels(int)
	 * @generated
	 */
	boolean isSetPDOTPDOChannels();

} // TMNFeatures
