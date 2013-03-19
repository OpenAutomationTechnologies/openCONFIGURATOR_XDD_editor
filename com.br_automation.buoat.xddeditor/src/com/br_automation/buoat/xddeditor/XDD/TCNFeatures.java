/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>TCN Features</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#isDLLCNFeatureMultiplex
 * <em>DLLCN Feature Multiplex</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#isDLLCNPResChaining
 * <em>DLLCNP Res Chaining</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#getNMTCNSoC2PReq
 * <em>NMTCN So C2P Req</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTCNFeatures()
 * @model extendedMetaData="name='t_CNFeatures' kind='empty'"
 * @generated
 */
public interface TCNFeatures extends EObject {
    /**
     * Returns the value of the '<em><b>DLLCN Feature Multiplex</b></em>'
     * attribute. The default value is <code>"false"</code>. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>DLLCN Feature Multiplex</em>' attribute isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>DLLCN Feature Multiplex</em>' attribute.
     * @see #isSetDLLCNFeatureMultiplex()
     * @see #unsetDLLCNFeatureMultiplex()
     * @see #setDLLCNFeatureMultiplex(boolean)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTCNFeatures_DLLCNFeatureMultiplex()
     * @model default="false" unsettable="true"
     *        dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='DLLCNFeatureMultiplex'"
     * @generated
     */
    boolean isDLLCNFeatureMultiplex();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#isDLLCNFeatureMultiplex
     * <em>DLLCN Feature Multiplex</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>DLLCN Feature Multiplex</em>'
     *            attribute.
     * @see #isSetDLLCNFeatureMultiplex()
     * @see #unsetDLLCNFeatureMultiplex()
     * @see #isDLLCNFeatureMultiplex()
     * @generated
     */
    void setDLLCNFeatureMultiplex(boolean value);

    /**
     * Unsets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#isDLLCNFeatureMultiplex
     * <em>DLLCN Feature Multiplex</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #isSetDLLCNFeatureMultiplex()
     * @see #isDLLCNFeatureMultiplex()
     * @see #setDLLCNFeatureMultiplex(boolean)
     * @generated
     */
    void unsetDLLCNFeatureMultiplex();

    /**
     * Returns whether the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#isDLLCNFeatureMultiplex
     * <em>DLLCN Feature Multiplex</em>}' attribute is set. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @return whether the value of the '<em>DLLCN Feature Multiplex</em>'
     *         attribute is set.
     * @see #unsetDLLCNFeatureMultiplex()
     * @see #isDLLCNFeatureMultiplex()
     * @see #setDLLCNFeatureMultiplex(boolean)
     * @generated
     */
    boolean isSetDLLCNFeatureMultiplex();

    /**
     * Returns the value of the '<em><b>DLLCNP Res Chaining</b></em>' attribute.
     * The default value is <code>"false"</code>. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DLLCNP Res Chaining</em>' attribute isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>DLLCNP Res Chaining</em>' attribute.
     * @see #isSetDLLCNPResChaining()
     * @see #unsetDLLCNPResChaining()
     * @see #setDLLCNPResChaining(boolean)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTCNFeatures_DLLCNPResChaining()
     * @model default="false" unsettable="true"
     *        dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='DLLCNPResChaining'"
     * @generated
     */
    boolean isDLLCNPResChaining();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#isDLLCNPResChaining
     * <em>DLLCNP Res Chaining</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>DLLCNP Res Chaining</em>' attribute.
     * @see #isSetDLLCNPResChaining()
     * @see #unsetDLLCNPResChaining()
     * @see #isDLLCNPResChaining()
     * @generated
     */
    void setDLLCNPResChaining(boolean value);

    /**
     * Unsets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#isDLLCNPResChaining
     * <em>DLLCNP Res Chaining</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isSetDLLCNPResChaining()
     * @see #isDLLCNPResChaining()
     * @see #setDLLCNPResChaining(boolean)
     * @generated
     */
    void unsetDLLCNPResChaining();

    /**
     * Returns whether the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#isDLLCNPResChaining
     * <em>DLLCNP Res Chaining</em>}' attribute is set. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return whether the value of the '<em>DLLCNP Res Chaining</em>' attribute
     *         is set.
     * @see #unsetDLLCNPResChaining()
     * @see #isDLLCNPResChaining()
     * @see #setDLLCNPResChaining(boolean)
     * @generated
     */
    boolean isSetDLLCNPResChaining();

    /**
     * Returns the value of the '<em><b>NMTCN So C2P Req</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>NMTCN So C2P Req</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>NMTCN So C2P Req</em>' attribute.
     * @see #isSetNMTCNSoC2PReq()
     * @see #unsetNMTCNSoC2PReq()
     * @see #setNMTCNSoC2PReq(long)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTCNFeatures_NMTCNSoC2PReq()
     * @model unsettable="true"
     *        dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
     *        required="true"
     *        extendedMetaData="kind='attribute' name='NMTCNSoC2PReq'"
     * @generated
     */
    long getNMTCNSoC2PReq();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#getNMTCNSoC2PReq
     * <em>NMTCN So C2P Req</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>NMTCN So C2P Req</em>' attribute.
     * @see #isSetNMTCNSoC2PReq()
     * @see #unsetNMTCNSoC2PReq()
     * @see #getNMTCNSoC2PReq()
     * @generated
     */
    void setNMTCNSoC2PReq(long value);

    /**
     * Unsets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#getNMTCNSoC2PReq
     * <em>NMTCN So C2P Req</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isSetNMTCNSoC2PReq()
     * @see #getNMTCNSoC2PReq()
     * @see #setNMTCNSoC2PReq(long)
     * @generated
     */
    void unsetNMTCNSoC2PReq();

    /**
     * Returns whether the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#getNMTCNSoC2PReq
     * <em>NMTCN So C2P Req</em>}' attribute is set. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return whether the value of the '<em>NMTCN So C2P Req</em>' attribute is
     *         set.
     * @see #unsetNMTCNSoC2PReq()
     * @see #getNMTCNSoC2PReq()
     * @see #setNMTCNSoC2PReq(long)
     * @generated
     */
    boolean isSetNMTCNSoC2PReq();

} // TCNFeatures
