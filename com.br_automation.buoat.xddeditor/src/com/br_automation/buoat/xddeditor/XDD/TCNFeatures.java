/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCN Features</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#isDLLCNFeatureMultiplex <em>DLLCN Feature Multiplex</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#isDLLCNPResChaining <em>DLLCNP Res Chaining</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#isNMTCNDNA <em>NMTCNDNA</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#getNMTCNMaxAInv <em>NMTCN Max AInv</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#getNMTCNPreOp2ToReady2Op <em>NMTCN Pre Op2 To Ready2 Op</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#getNMTCNSetNodeNumberTime <em>NMTCN Set Node Number Time</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#getNMTCNSoC2PReq <em>NMTCN So C2P Req</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTCNFeatures()
 * @model extendedMetaData="name='t_CNFeatures' kind='empty'"
 * @generated
 */
public interface TCNFeatures extends EObject {
	/**
	 * Returns the value of the '<em><b>DLLCN Feature Multiplex</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DLLCN Feature Multiplex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DLLCN Feature Multiplex</em>' attribute.
	 * @see #isSetDLLCNFeatureMultiplex()
	 * @see #unsetDLLCNFeatureMultiplex()
	 * @see #setDLLCNFeatureMultiplex(boolean)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTCNFeatures_DLLCNFeatureMultiplex()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='DLLCNFeatureMultiplex'"
	 * @generated
	 */
	boolean isDLLCNFeatureMultiplex();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#isDLLCNFeatureMultiplex <em>DLLCN Feature Multiplex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DLLCN Feature Multiplex</em>' attribute.
	 * @see #isSetDLLCNFeatureMultiplex()
	 * @see #unsetDLLCNFeatureMultiplex()
	 * @see #isDLLCNFeatureMultiplex()
	 * @generated
	 */
	void setDLLCNFeatureMultiplex(boolean value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#isDLLCNFeatureMultiplex <em>DLLCN Feature Multiplex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDLLCNFeatureMultiplex()
	 * @see #isDLLCNFeatureMultiplex()
	 * @see #setDLLCNFeatureMultiplex(boolean)
	 * @generated
	 */
	void unsetDLLCNFeatureMultiplex();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#isDLLCNFeatureMultiplex <em>DLLCN Feature Multiplex</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>DLLCN Feature Multiplex</em>' attribute is set.
	 * @see #unsetDLLCNFeatureMultiplex()
	 * @see #isDLLCNFeatureMultiplex()
	 * @see #setDLLCNFeatureMultiplex(boolean)
	 * @generated
	 */
	boolean isSetDLLCNFeatureMultiplex();

	/**
	 * Returns the value of the '<em><b>DLLCNP Res Chaining</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DLLCNP Res Chaining</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DLLCNP Res Chaining</em>' attribute.
	 * @see #isSetDLLCNPResChaining()
	 * @see #unsetDLLCNPResChaining()
	 * @see #setDLLCNPResChaining(boolean)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTCNFeatures_DLLCNPResChaining()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='DLLCNPResChaining'"
	 * @generated
	 */
	boolean isDLLCNPResChaining();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#isDLLCNPResChaining <em>DLLCNP Res Chaining</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DLLCNP Res Chaining</em>' attribute.
	 * @see #isSetDLLCNPResChaining()
	 * @see #unsetDLLCNPResChaining()
	 * @see #isDLLCNPResChaining()
	 * @generated
	 */
	void setDLLCNPResChaining(boolean value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#isDLLCNPResChaining <em>DLLCNP Res Chaining</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDLLCNPResChaining()
	 * @see #isDLLCNPResChaining()
	 * @see #setDLLCNPResChaining(boolean)
	 * @generated
	 */
	void unsetDLLCNPResChaining();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#isDLLCNPResChaining <em>DLLCNP Res Chaining</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>DLLCNP Res Chaining</em>' attribute is set.
	 * @see #unsetDLLCNPResChaining()
	 * @see #isDLLCNPResChaining()
	 * @see #setDLLCNPResChaining(boolean)
	 * @generated
	 */
	boolean isSetDLLCNPResChaining();

	/**
	 * Returns the value of the '<em><b>NMTCNDNA</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NMTCNDNA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NMTCNDNA</em>' attribute.
	 * @see #isSetNMTCNDNA()
	 * @see #unsetNMTCNDNA()
	 * @see #setNMTCNDNA(boolean)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTCNFeatures_NMTCNDNA()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='NMTCNDNA'"
	 * @generated
	 */
	boolean isNMTCNDNA();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#isNMTCNDNA <em>NMTCNDNA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NMTCNDNA</em>' attribute.
	 * @see #isSetNMTCNDNA()
	 * @see #unsetNMTCNDNA()
	 * @see #isNMTCNDNA()
	 * @generated
	 */
	void setNMTCNDNA(boolean value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#isNMTCNDNA <em>NMTCNDNA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNMTCNDNA()
	 * @see #isNMTCNDNA()
	 * @see #setNMTCNDNA(boolean)
	 * @generated
	 */
	void unsetNMTCNDNA();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#isNMTCNDNA <em>NMTCNDNA</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NMTCNDNA</em>' attribute is set.
	 * @see #unsetNMTCNDNA()
	 * @see #isNMTCNDNA()
	 * @see #setNMTCNDNA(boolean)
	 * @generated
	 */
	boolean isSetNMTCNDNA();

	/**
	 * Returns the value of the '<em><b>NMTCN Max AInv</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NMTCN Max AInv</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NMTCN Max AInv</em>' attribute.
	 * @see #isSetNMTCNMaxAInv()
	 * @see #unsetNMTCNMaxAInv()
	 * @see #setNMTCNMaxAInv(long)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTCNFeatures_NMTCNMaxAInv()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='NMTCNMaxAInv'"
	 * @generated
	 */
	long getNMTCNMaxAInv();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#getNMTCNMaxAInv <em>NMTCN Max AInv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NMTCN Max AInv</em>' attribute.
	 * @see #isSetNMTCNMaxAInv()
	 * @see #unsetNMTCNMaxAInv()
	 * @see #getNMTCNMaxAInv()
	 * @generated
	 */
	void setNMTCNMaxAInv(long value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#getNMTCNMaxAInv <em>NMTCN Max AInv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNMTCNMaxAInv()
	 * @see #getNMTCNMaxAInv()
	 * @see #setNMTCNMaxAInv(long)
	 * @generated
	 */
	void unsetNMTCNMaxAInv();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#getNMTCNMaxAInv <em>NMTCN Max AInv</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NMTCN Max AInv</em>' attribute is set.
	 * @see #unsetNMTCNMaxAInv()
	 * @see #getNMTCNMaxAInv()
	 * @see #setNMTCNMaxAInv(long)
	 * @generated
	 */
	boolean isSetNMTCNMaxAInv();

	/**
	 * Returns the value of the '<em><b>NMTCN Pre Op2 To Ready2 Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NMTCN Pre Op2 To Ready2 Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NMTCN Pre Op2 To Ready2 Op</em>' attribute.
	 * @see #isSetNMTCNPreOp2ToReady2Op()
	 * @see #unsetNMTCNPreOp2ToReady2Op()
	 * @see #setNMTCNPreOp2ToReady2Op(long)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTCNFeatures_NMTCNPreOp2ToReady2Op()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='NMTCNPreOp2ToReady2Op'"
	 * @generated
	 */
	long getNMTCNPreOp2ToReady2Op();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#getNMTCNPreOp2ToReady2Op <em>NMTCN Pre Op2 To Ready2 Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NMTCN Pre Op2 To Ready2 Op</em>' attribute.
	 * @see #isSetNMTCNPreOp2ToReady2Op()
	 * @see #unsetNMTCNPreOp2ToReady2Op()
	 * @see #getNMTCNPreOp2ToReady2Op()
	 * @generated
	 */
	void setNMTCNPreOp2ToReady2Op(long value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#getNMTCNPreOp2ToReady2Op <em>NMTCN Pre Op2 To Ready2 Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNMTCNPreOp2ToReady2Op()
	 * @see #getNMTCNPreOp2ToReady2Op()
	 * @see #setNMTCNPreOp2ToReady2Op(long)
	 * @generated
	 */
	void unsetNMTCNPreOp2ToReady2Op();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#getNMTCNPreOp2ToReady2Op <em>NMTCN Pre Op2 To Ready2 Op</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NMTCN Pre Op2 To Ready2 Op</em>' attribute is set.
	 * @see #unsetNMTCNPreOp2ToReady2Op()
	 * @see #getNMTCNPreOp2ToReady2Op()
	 * @see #setNMTCNPreOp2ToReady2Op(long)
	 * @generated
	 */
	boolean isSetNMTCNPreOp2ToReady2Op();

	/**
	 * Returns the value of the '<em><b>NMTCN Set Node Number Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NMTCN Set Node Number Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NMTCN Set Node Number Time</em>' attribute.
	 * @see #isSetNMTCNSetNodeNumberTime()
	 * @see #unsetNMTCNSetNodeNumberTime()
	 * @see #setNMTCNSetNodeNumberTime(long)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTCNFeatures_NMTCNSetNodeNumberTime()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='NMTCNSetNodeNumberTime'"
	 * @generated
	 */
	long getNMTCNSetNodeNumberTime();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#getNMTCNSetNodeNumberTime <em>NMTCN Set Node Number Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NMTCN Set Node Number Time</em>' attribute.
	 * @see #isSetNMTCNSetNodeNumberTime()
	 * @see #unsetNMTCNSetNodeNumberTime()
	 * @see #getNMTCNSetNodeNumberTime()
	 * @generated
	 */
	void setNMTCNSetNodeNumberTime(long value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#getNMTCNSetNodeNumberTime <em>NMTCN Set Node Number Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNMTCNSetNodeNumberTime()
	 * @see #getNMTCNSetNodeNumberTime()
	 * @see #setNMTCNSetNodeNumberTime(long)
	 * @generated
	 */
	void unsetNMTCNSetNodeNumberTime();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#getNMTCNSetNodeNumberTime <em>NMTCN Set Node Number Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NMTCN Set Node Number Time</em>' attribute is set.
	 * @see #unsetNMTCNSetNodeNumberTime()
	 * @see #getNMTCNSetNodeNumberTime()
	 * @see #setNMTCNSetNodeNumberTime(long)
	 * @generated
	 */
	boolean isSetNMTCNSetNodeNumberTime();

	/**
	 * Returns the value of the '<em><b>NMTCN So C2P Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NMTCN So C2P Req</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NMTCN So C2P Req</em>' attribute.
	 * @see #isSetNMTCNSoC2PReq()
	 * @see #unsetNMTCNSoC2PReq()
	 * @see #setNMTCNSoC2PReq(long)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTCNFeatures_NMTCNSoC2PReq()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
	 *        extendedMetaData="kind='attribute' name='NMTCNSoC2PReq'"
	 * @generated
	 */
	long getNMTCNSoC2PReq();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#getNMTCNSoC2PReq <em>NMTCN So C2P Req</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NMTCN So C2P Req</em>' attribute.
	 * @see #isSetNMTCNSoC2PReq()
	 * @see #unsetNMTCNSoC2PReq()
	 * @see #getNMTCNSoC2PReq()
	 * @generated
	 */
	void setNMTCNSoC2PReq(long value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#getNMTCNSoC2PReq <em>NMTCN So C2P Req</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNMTCNSoC2PReq()
	 * @see #getNMTCNSoC2PReq()
	 * @see #setNMTCNSoC2PReq(long)
	 * @generated
	 */
	void unsetNMTCNSoC2PReq();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#getNMTCNSoC2PReq <em>NMTCN So C2P Req</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NMTCN So C2P Req</em>' attribute is set.
	 * @see #unsetNMTCNSoC2PReq()
	 * @see #getNMTCNSoC2PReq()
	 * @see #setNMTCNSoC2PReq(long)
	 * @generated
	 */
	boolean isSetNMTCNSoC2PReq();

} // TCNFeatures
