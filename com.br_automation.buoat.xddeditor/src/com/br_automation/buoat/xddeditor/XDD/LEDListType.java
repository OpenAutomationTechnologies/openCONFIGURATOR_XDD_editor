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
 * <em><b>LED List Type</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.LEDListType#getLED <em>LED
 * </em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.LEDListType#getCombinedState
 * <em>Combined State</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getLEDListType()
 * @model extendedMetaData="name='LEDList_._type' kind='elementOnly'"
 * @generated
 */
public interface LEDListType extends EObject {
    /**
     * Returns the value of the '<em><b>LED</b></em>' containment reference
     * list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.TLED}. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>LED</em>' containment reference list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>LED</em>' containment reference list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getLEDListType_LED()
     * @model containment="true" required="true" extendedMetaData=
     *        "kind='element' name='LED' namespace='##targetNamespace'"
     * @generated
     */
    EList<TLED> getLED();

    /**
     * Returns the value of the '<em><b>Combined State</b></em>' containment
     * reference list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.TCombinedState}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Combined State</em>' containment reference
     * list isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Combined State</em>' containment reference
     *         list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getLEDListType_CombinedState()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='combinedState' namespace='##targetNamespace'"
     * @generated
     */
    EList<TCombinedState> getCombinedState();

} // LEDListType
