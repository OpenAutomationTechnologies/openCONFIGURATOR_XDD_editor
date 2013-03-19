/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Profile Body Device Powerlink</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink#getDeviceIdentity
 * <em>Device Identity</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink#getDeviceManager
 * <em>Device Manager</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink#getDeviceFunction
 * <em>Device Function</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink#getApplicationProcess
 * <em>Application Process</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink#getExternalProfileHandle
 * <em>External Profile Handle</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink#getDeviceClass
 * <em>Device Class</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileBodyDevicePowerlink()
 * @model 
 *        extendedMetaData="name='ProfileBody_Device_Powerlink' kind='elementOnly'"
 * @generated
 */
public interface ProfileBodyDevicePowerlink extends ProfileBodyDataType {
    /**
     * Returns the value of the '<em><b>Device Identity</b></em>' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc -->
     * 
     * The DeviceIdentity element contains attributes that are independent of
     * the network and of the process, and which uniquely identify the device.
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Device Identity</em>' containment
     *         reference.
     * @see #setDeviceIdentity(TDeviceIdentity)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileBodyDevicePowerlink_DeviceIdentity()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='DeviceIdentity' namespace='##targetNamespace'"
     * @generated
     */
    TDeviceIdentity getDeviceIdentity();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink#getDeviceIdentity
     * <em>Device Identity</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Device Identity</em>' containment
     *            reference.
     * @see #getDeviceIdentity()
     * @generated
     */
    void setDeviceIdentity(TDeviceIdentity value);

    /**
     * Returns the value of the '<em><b>Device Manager</b></em>' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc -->
     * 
     * The DeviceManager element contains attributes and supports services that
     * enable the monitoring of the device.
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Device Manager</em>' containment reference.
     * @see #setDeviceManager(TDeviceManager)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileBodyDevicePowerlink_DeviceManager()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='DeviceManager' namespace='##targetNamespace'"
     * @generated
     */
    TDeviceManager getDeviceManager();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink#getDeviceManager
     * <em>Device Manager</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Device Manager</em>' containment
     *            reference.
     * @see #getDeviceManager()
     * @generated
     */
    void setDeviceManager(TDeviceManager value);

    /**
     * Returns the value of the '<em><b>Device Function</b></em>' containment
     * reference list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceFunction}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * 
     * The DeviceFunction element describes the intrinsic function of a device
     * in terms of its technology. It contains network independent
     * descriptions/definitions of the technological device functionality.
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Device Function</em>' containment reference
     *         list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileBodyDevicePowerlink_DeviceFunction()
     * @model containment="true" required="true" extendedMetaData=
     *        "kind='element' name='DeviceFunction' namespace='##targetNamespace'"
     * @generated
     */
    EList<TDeviceFunction> getDeviceFunction();

    /**
     * Returns the value of the '<em><b>Application Process</b></em>'
     * containment reference list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.TApplicationProcess}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * 
     * The ApplicationProcess element represents the set of services and
     * parameters, which constitute the behaviour and the interfaces of the
     * device in terms of the application, independent of the device technology
     * and the underlying communication networks and communication protocols.
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Application Process</em>' containment
     *         reference list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileBodyDevicePowerlink_ApplicationProcess()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='ApplicationProcess' namespace='##targetNamespace'"
     * @generated
     */
    EList<TApplicationProcess> getApplicationProcess();

    /**
     * Returns the value of the '<em><b>External Profile Handle</b></em>'
     * containment reference list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileHandleDataType}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>External Profile Handle</em>' containment
     * reference list isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>External Profile Handle</em>' containment
     *         reference list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileBodyDevicePowerlink_ExternalProfileHandle()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='ExternalProfileHandle' namespace='##targetNamespace'"
     * @generated
     */
    EList<ProfileHandleDataType> getExternalProfileHandle();

    /**
     * Returns the value of the '<em><b>Device Class</b></em>' attribute. The
     * literals are from the enumeration
     * {@link com.br_automation.buoat.xddeditor.XDD.DeviceClassType}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Device Class</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Device Class</em>' attribute.
     * @see com.br_automation.buoat.xddeditor.XDD.DeviceClassType
     * @see #isSetDeviceClass()
     * @see #unsetDeviceClass()
     * @see #setDeviceClass(DeviceClassType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getProfileBodyDevicePowerlink_DeviceClass()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='deviceClass'"
     * @generated
     */
    DeviceClassType getDeviceClass();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink#getDeviceClass
     * <em>Device Class</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Device Class</em>' attribute.
     * @see com.br_automation.buoat.xddeditor.XDD.DeviceClassType
     * @see #isSetDeviceClass()
     * @see #unsetDeviceClass()
     * @see #getDeviceClass()
     * @generated
     */
    void setDeviceClass(DeviceClassType value);

    /**
     * Unsets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink#getDeviceClass
     * <em>Device Class</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isSetDeviceClass()
     * @see #getDeviceClass()
     * @see #setDeviceClass(DeviceClassType)
     * @generated
     */
    void unsetDeviceClass();

    /**
     * Returns whether the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink#getDeviceClass
     * <em>Device Class</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return whether the value of the '<em>Device Class</em>' attribute is
     *         set.
     * @see #unsetDeviceClass()
     * @see #getDeviceClass()
     * @see #setDeviceClass(DeviceClassType)
     * @generated
     */
    boolean isSetDeviceClass();

} // ProfileBodyDevicePowerlink
