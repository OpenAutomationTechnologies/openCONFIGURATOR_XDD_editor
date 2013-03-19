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
 * <em><b>TDevice Manager</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceManager#getIndicatorList
 * <em>Indicator List</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceManager()
 * @model extendedMetaData="name='t_DeviceManager' kind='elementOnly'"
 * @generated
 */
public interface TDeviceManager extends EObject {
    /**
     * Returns the value of the '<em><b>Indicator List</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Indicator List</em>' containment reference
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Indicator List</em>' containment reference.
     * @see #setIndicatorList(TIndicatorList)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceManager_IndicatorList()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='indicatorList' namespace='##targetNamespace'"
     * @generated
     */
    TIndicatorList getIndicatorList();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceManager#getIndicatorList
     * <em>Indicator List</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Indicator List</em>' containment
     *            reference.
     * @see #getIndicatorList()
     * @generated
     */
    void setIndicatorList(TIndicatorList value);

} // TDeviceManager
