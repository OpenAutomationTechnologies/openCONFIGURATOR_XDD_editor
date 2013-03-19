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
 * <em><b>TNetwork Management</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TNetworkManagement#getGeneralFeatures
 * <em>General Features</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TNetworkManagement#getMNFeatures
 * <em>MN Features</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TNetworkManagement#getCNFeatures
 * <em>CN Features</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TNetworkManagement#getDeviceCommissioning
 * <em>Device Commissioning</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TNetworkManagement#getDiagnostic
 * <em>Diagnostic</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTNetworkManagement()
 * @model extendedMetaData="name='t_NetworkManagement' kind='elementOnly'"
 * @generated
 */
public interface TNetworkManagement extends EObject {
    /**
     * Returns the value of the '<em><b>General Features</b></em>' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc -->
     * 
     * Lists general features of a POWERLINK device.
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>General Features</em>' containment
     *         reference.
     * @see #setGeneralFeatures(TGeneralFeatures)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTNetworkManagement_GeneralFeatures()
     * @model containment="true" required="true" extendedMetaData=
     *        "kind='element' name='GeneralFeatures' namespace='##targetNamespace'"
     * @generated
     */
    TGeneralFeatures getGeneralFeatures();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TNetworkManagement#getGeneralFeatures
     * <em>General Features</em>}' containment reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>General Features</em>' containment
     *            reference.
     * @see #getGeneralFeatures()
     * @generated
     */
    void setGeneralFeatures(TGeneralFeatures value);

    /**
     * Returns the value of the '<em><b>MN Features</b></em>' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc -->
     * 
     * Lists MN specific features. (only valid if the device can be operated as
     * MN)
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>MN Features</em>' containment reference.
     * @see #setMNFeatures(TMNFeatures)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTNetworkManagement_MNFeatures()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='MNFeatures' namespace='##targetNamespace'"
     * @generated
     */
    TMNFeatures getMNFeatures();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TNetworkManagement#getMNFeatures
     * <em>MN Features</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>MN Features</em>' containment
     *            reference.
     * @see #getMNFeatures()
     * @generated
     */
    void setMNFeatures(TMNFeatures value);

    /**
     * Returns the value of the '<em><b>CN Features</b></em>' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc -->
     * 
     * Lists CN specific features. (only valid if the device can be operated as
     * CN)
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>CN Features</em>' containment reference.
     * @see #setCNFeatures(TCNFeatures)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTNetworkManagement_CNFeatures()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='CNFeatures' namespace='##targetNamespace'"
     * @generated
     */
    TCNFeatures getCNFeatures();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TNetworkManagement#getCNFeatures
     * <em>CN Features</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>CN Features</em>' containment
     *            reference.
     * @see #getCNFeatures()
     * @generated
     */
    void setCNFeatures(TCNFeatures value);

    /**
     * Returns the value of the '<em><b>Device Commissioning</b></em>'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc -->
     * 
     * Stores configuration specific data. (only valid in XDC files)
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Device Commissioning</em>' containment
     *         reference.
     * @see #setDeviceCommissioning(TDeviceCommissioning)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTNetworkManagement_DeviceCommissioning()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='deviceCommissioning' namespace='##targetNamespace'"
     * @generated
     */
    TDeviceCommissioning getDeviceCommissioning();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TNetworkManagement#getDeviceCommissioning
     * <em>Device Commissioning</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Device Commissioning</em>'
     *            containment reference.
     * @see #getDeviceCommissioning()
     * @generated
     */
    void setDeviceCommissioning(TDeviceCommissioning value);

    /**
     * Returns the value of the '<em><b>Diagnostic</b></em>' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc -->
     * 
     * Provides tools with presentational detail for the information transported
     * in the StatusResponse frame.
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Diagnostic</em>' containment reference.
     * @see #setDiagnostic(TDiagnostic)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTNetworkManagement_Diagnostic()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='Diagnostic' namespace='##targetNamespace'"
     * @generated
     */
    TDiagnostic getDiagnostic();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TNetworkManagement#getDiagnostic
     * <em>Diagnostic</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Diagnostic</em>' containment
     *            reference.
     * @see #getDiagnostic()
     * @generated
     */
    void setDiagnostic(TDiagnostic value);

} // TNetworkManagement
