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
 * <em><b>Compliant With Type</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.CompliantWithType#getGroup
 * <em>Group</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.CompliantWithType#getLabel
 * <em>Label</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.CompliantWithType#getDescription
 * <em>Description</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.CompliantWithType#getLabelRef
 * <em>Label Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.CompliantWithType#getDescriptionRef
 * <em>Description Ref</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.CompliantWithType#getName
 * <em>Name</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.CompliantWithType#getRange
 * <em>Range</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getCompliantWithType()
 * @model extendedMetaData="name='compliantWith_._type' kind='elementOnly'"
 * @generated
 */
public interface CompliantWithType extends EObject {
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
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getCompliantWithType_Group()
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
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getCompliantWithType_Label()
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
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getCompliantWithType_Description()
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
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getCompliantWithType_LabelRef()
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
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getCompliantWithType_DescriptionRef()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData=
     *        "kind='element' name='descriptionRef' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<DescriptionRefType> getDescriptionRef();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getCompliantWithType_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.CompliantWithType#getName
     * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Range</b></em>' attribute. The default
     * value is <code>"international"</code>. The literals are from the
     * enumeration {@link com.br_automation.buoat.xddeditor.XDD.RangeType}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Range</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Range</em>' attribute.
     * @see com.br_automation.buoat.xddeditor.XDD.RangeType
     * @see #isSetRange()
     * @see #unsetRange()
     * @see #setRange(RangeType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getCompliantWithType_Range()
     * @model default="international" unsettable="true"
     *        extendedMetaData="kind='attribute' name='range'"
     * @generated
     */
    RangeType getRange();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.CompliantWithType#getRange
     * <em>Range</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Range</em>' attribute.
     * @see com.br_automation.buoat.xddeditor.XDD.RangeType
     * @see #isSetRange()
     * @see #unsetRange()
     * @see #getRange()
     * @generated
     */
    void setRange(RangeType value);

    /**
     * Unsets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.CompliantWithType#getRange
     * <em>Range</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #isSetRange()
     * @see #getRange()
     * @see #setRange(RangeType)
     * @generated
     */
    void unsetRange();

    /**
     * Returns whether the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.CompliantWithType#getRange
     * <em>Range</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return whether the value of the '<em>Range</em>' attribute is set.
     * @see #unsetRange()
     * @see #getRange()
     * @see #setRange(RangeType)
     * @generated
     */
    boolean isSetRange();

} // CompliantWithType
