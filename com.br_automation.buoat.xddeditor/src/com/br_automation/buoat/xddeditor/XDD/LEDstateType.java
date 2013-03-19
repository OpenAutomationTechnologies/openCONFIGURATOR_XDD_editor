/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>LE Dstate Type</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getGroup <em>
 * Group</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getLabel <em>
 * Label</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getDescription
 * <em>Description</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getLabelRef
 * <em>Label Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getDescriptionRef
 * <em>Description Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getFlashingPeriod
 * <em>Flashing Period</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getImpulsWidth
 * <em>Impuls Width</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getLEDcolor
 * <em>LE Dcolor</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getNumberOfImpulses
 * <em>Number Of Impulses</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getState <em>
 * State</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getUniqueID
 * <em>Unique ID</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getLEDstateType()
 * @model extendedMetaData="name='LEDstate_._type' kind='elementOnly'"
 * @generated
 */
public interface LEDstateType extends EObject {
    /**
     * Returns the value of the '<em><b>Group</b></em>' attribute list. The list
     * contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group</em>' attribute list isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Group</em>' attribute list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getLEDstateType_Group()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry"
     *        many="true" extendedMetaData="kind='group' name='group:0'"
     * @generated
     */
    FeatureMap getGroup();

    /**
     * Returns the value of the '<em><b>Label</b></em>' containment reference
     * list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.LabelType}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * 
     * This element allows storage of the identifying name inside the XML file
     * itself.
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Label</em>' containment reference list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getLEDstateType_Label()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData=
     *        "kind='element' name='label' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<LabelType> getLabel();

    /**
     * Returns the value of the '<em><b>Description</b></em>' containment
     * reference list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.DescriptionType}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * 
     * This element allows storage of descriptive information inside the XML
     * file itself.
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Description</em>' containment reference
     *         list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getLEDstateType_Description()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData=
     *        "kind='element' name='description' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<DescriptionType> getDescription();

    /**
     * Returns the value of the '<em><b>Label Ref</b></em>' containment
     * reference list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.LabelRefType}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * 
     * This element allows storage of identifying names inside an external text
     * resource file.
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Label Ref</em>' containment reference list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getLEDstateType_LabelRef()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData=
     *        "kind='element' name='labelRef' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<LabelRefType> getLabelRef();

    /**
     * Returns the value of the '<em><b>Description Ref</b></em>' containment
     * reference list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.DescriptionRefType}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * 
     * This element allows storage of reference descriptive texts inside an
     * external text resource file.
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Description Ref</em>' containment reference
     *         list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getLEDstateType_DescriptionRef()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData=
     *        "kind='element' name='descriptionRef' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<DescriptionRefType> getDescriptionRef();

    /**
     * Returns the value of the '<em><b>Flashing Period</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flashing Period</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Flashing Period</em>' attribute.
     * @see #isSetFlashingPeriod()
     * @see #unsetFlashingPeriod()
     * @see #setFlashingPeriod(long)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getLEDstateType_FlashingPeriod()
     * @model unsettable="true"
     *        dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
     *        extendedMetaData="kind='attribute' name='flashingPeriod'"
     * @generated
     */
    long getFlashingPeriod();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getFlashingPeriod
     * <em>Flashing Period</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Flashing Period</em>' attribute.
     * @see #isSetFlashingPeriod()
     * @see #unsetFlashingPeriod()
     * @see #getFlashingPeriod()
     * @generated
     */
    void setFlashingPeriod(long value);

    /**
     * Unsets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getFlashingPeriod
     * <em>Flashing Period</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isSetFlashingPeriod()
     * @see #getFlashingPeriod()
     * @see #setFlashingPeriod(long)
     * @generated
     */
    void unsetFlashingPeriod();

    /**
     * Returns whether the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getFlashingPeriod
     * <em>Flashing Period</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return whether the value of the '<em>Flashing Period</em>' attribute is
     *         set.
     * @see #unsetFlashingPeriod()
     * @see #getFlashingPeriod()
     * @see #setFlashingPeriod(long)
     * @generated
     */
    boolean isSetFlashingPeriod();

    /**
     * Returns the value of the '<em><b>Impuls Width</b></em>' attribute. The
     * default value is <code>"50"</code>. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Impuls Width</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Impuls Width</em>' attribute.
     * @see #isSetImpulsWidth()
     * @see #unsetImpulsWidth()
     * @see #setImpulsWidth(short)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getLEDstateType_ImpulsWidth()
     * @model default="50" unsettable="true"
     *        dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte"
     *        extendedMetaData="kind='attribute' name='impulsWidth'"
     * @generated
     */
    short getImpulsWidth();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getImpulsWidth
     * <em>Impuls Width</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Impuls Width</em>' attribute.
     * @see #isSetImpulsWidth()
     * @see #unsetImpulsWidth()
     * @see #getImpulsWidth()
     * @generated
     */
    void setImpulsWidth(short value);

    /**
     * Unsets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getImpulsWidth
     * <em>Impuls Width</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isSetImpulsWidth()
     * @see #getImpulsWidth()
     * @see #setImpulsWidth(short)
     * @generated
     */
    void unsetImpulsWidth();

    /**
     * Returns whether the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getImpulsWidth
     * <em>Impuls Width</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return whether the value of the '<em>Impuls Width</em>' attribute is
     *         set.
     * @see #unsetImpulsWidth()
     * @see #getImpulsWidth()
     * @see #setImpulsWidth(short)
     * @generated
     */
    boolean isSetImpulsWidth();

    /**
     * Returns the value of the '<em><b>LE Dcolor</b></em>' attribute. The
     * literals are from the enumeration
     * {@link com.br_automation.buoat.xddeditor.XDD.LEDcolorType}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LE Dcolor</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>LE Dcolor</em>' attribute.
     * @see com.br_automation.buoat.xddeditor.XDD.LEDcolorType
     * @see #isSetLEDcolor()
     * @see #unsetLEDcolor()
     * @see #setLEDcolor(LEDcolorType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getLEDstateType_LEDcolor()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='LEDcolor'"
     * @generated
     */
    LEDcolorType getLEDcolor();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getLEDcolor
     * <em>LE Dcolor</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>LE Dcolor</em>' attribute.
     * @see com.br_automation.buoat.xddeditor.XDD.LEDcolorType
     * @see #isSetLEDcolor()
     * @see #unsetLEDcolor()
     * @see #getLEDcolor()
     * @generated
     */
    void setLEDcolor(LEDcolorType value);

    /**
     * Unsets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getLEDcolor
     * <em>LE Dcolor</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #isSetLEDcolor()
     * @see #getLEDcolor()
     * @see #setLEDcolor(LEDcolorType)
     * @generated
     */
    void unsetLEDcolor();

    /**
     * Returns whether the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getLEDcolor
     * <em>LE Dcolor</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return whether the value of the '<em>LE Dcolor</em>' attribute is set.
     * @see #unsetLEDcolor()
     * @see #getLEDcolor()
     * @see #setLEDcolor(LEDcolorType)
     * @generated
     */
    boolean isSetLEDcolor();

    /**
     * Returns the value of the '<em><b>Number Of Impulses</b></em>' attribute.
     * The default value is <code>"1"</code>. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Number Of Impulses</em>' attribute isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Number Of Impulses</em>' attribute.
     * @see #isSetNumberOfImpulses()
     * @see #unsetNumberOfImpulses()
     * @see #setNumberOfImpulses(short)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getLEDstateType_NumberOfImpulses()
     * @model default="1" unsettable="true"
     *        dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte"
     *        extendedMetaData="kind='attribute' name='numberOfImpulses'"
     * @generated
     */
    short getNumberOfImpulses();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getNumberOfImpulses
     * <em>Number Of Impulses</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Number Of Impulses</em>' attribute.
     * @see #isSetNumberOfImpulses()
     * @see #unsetNumberOfImpulses()
     * @see #getNumberOfImpulses()
     * @generated
     */
    void setNumberOfImpulses(short value);

    /**
     * Unsets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getNumberOfImpulses
     * <em>Number Of Impulses</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isSetNumberOfImpulses()
     * @see #getNumberOfImpulses()
     * @see #setNumberOfImpulses(short)
     * @generated
     */
    void unsetNumberOfImpulses();

    /**
     * Returns whether the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getNumberOfImpulses
     * <em>Number Of Impulses</em>}' attribute is set. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return whether the value of the '<em>Number Of Impulses</em>' attribute
     *         is set.
     * @see #unsetNumberOfImpulses()
     * @see #getNumberOfImpulses()
     * @see #setNumberOfImpulses(short)
     * @generated
     */
    boolean isSetNumberOfImpulses();

    /**
     * Returns the value of the '<em><b>State</b></em>' attribute. The literals
     * are from the enumeration
     * {@link com.br_automation.buoat.xddeditor.XDD.StateType}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>State</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>State</em>' attribute.
     * @see com.br_automation.buoat.xddeditor.XDD.StateType
     * @see #isSetState()
     * @see #unsetState()
     * @see #setState(StateType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getLEDstateType_State()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='state'"
     * @generated
     */
    StateType getState();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getState
     * <em>State</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>State</em>' attribute.
     * @see com.br_automation.buoat.xddeditor.XDD.StateType
     * @see #isSetState()
     * @see #unsetState()
     * @see #getState()
     * @generated
     */
    void setState(StateType value);

    /**
     * Unsets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getState
     * <em>State</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #isSetState()
     * @see #getState()
     * @see #setState(StateType)
     * @generated
     */
    void unsetState();

    /**
     * Returns whether the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getState
     * <em>State</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return whether the value of the '<em>State</em>' attribute is set.
     * @see #unsetState()
     * @see #getState()
     * @see #setState(StateType)
     * @generated
     */
    boolean isSetState();

    /**
     * Returns the value of the '<em><b>Unique ID</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unique ID</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Unique ID</em>' attribute.
     * @see #setUniqueID(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getLEDstateType_UniqueID()
     * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
     *        required="true"
     *        extendedMetaData="kind='attribute' name='uniqueID'"
     * @generated
     */
    String getUniqueID();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getUniqueID
     * <em>Unique ID</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Unique ID</em>' attribute.
     * @see #getUniqueID()
     * @generated
     */
    void setUniqueID(String value);

} // LEDstateType
