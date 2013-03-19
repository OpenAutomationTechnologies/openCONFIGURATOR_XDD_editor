/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Dynamic Channels Type</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.DynamicChannelsType#getDynamicChannel
 * <em>Dynamic Channel</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getDynamicChannelsType()
 * @model extendedMetaData="name='dynamicChannels_._type' kind='elementOnly'"
 * @generated
 */
public interface DynamicChannelsType extends EObject {
    /**
     * Returns the value of the '<em><b>Dynamic Channel</b></em>' containment
     * reference list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.TDynamicChannel}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dynamic Channel</em>' containment reference
     * list isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Dynamic Channel</em>' containment reference
     *         list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getDynamicChannelsType_DynamicChannel()
     * @model containment="true" required="true" extendedMetaData=
     *        "kind='element' name='dynamicChannel' namespace='##targetNamespace'"
     * @generated
     */
    EList<TDynamicChannel> getDynamicChannel();

} // DynamicChannelsType
