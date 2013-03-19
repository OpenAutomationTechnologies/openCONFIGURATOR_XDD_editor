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
 * <em><b>TCount</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TCount#getGroup <em>Group
 * </em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TCount#getLabel <em>Label
 * </em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TCount#getDescription <em>
 * Description</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TCount#getLabelRef <em>Label
 * Ref</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TCount#getDescriptionRef
 * <em>Description Ref</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TCount#getDefaultValue <em>
 * Default Value</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TCount#getAllowedValues <em>
 * Allowed Values</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TCount#getAccess <em>Access
 * </em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TCount#getUniqueID <em>
 * Unique ID</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTCount()
 * @model extendedMetaData="name='t_count' kind='elementOnly'"
 * @generated
 */
public interface TCount extends EObject {
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
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTCount_Group()
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
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTCount_Label()
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
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTCount_Description()
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
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTCount_LabelRef()
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
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTCount_DescriptionRef()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData=
     *        "kind='element' name='descriptionRef' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<DescriptionRefType> getDescriptionRef();

    /**
     * Returns the value of the '<em><b>Default Value</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Value</em>' containment reference
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Default Value</em>' containment reference.
     * @see #setDefaultValue(TValue)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTCount_DefaultValue()
     * @model containment="true" required="true" extendedMetaData=
     *        "kind='element' name='defaultValue' namespace='##targetNamespace'"
     * @generated
     */
    TValue getDefaultValue();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TCount#getDefaultValue
     * <em>Default Value</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Default Value</em>' containment
     *            reference.
     * @see #getDefaultValue()
     * @generated
     */
    void setDefaultValue(TValue value);

    /**
     * Returns the value of the '<em><b>Allowed Values</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Allowed Values</em>' containment reference
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Allowed Values</em>' containment reference.
     * @see #setAllowedValues(TAllowedValues)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTCount_AllowedValues()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='allowedValues' namespace='##targetNamespace'"
     * @generated
     */
    TAllowedValues getAllowedValues();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TCount#getAllowedValues
     * <em>Allowed Values</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Allowed Values</em>' containment
     *            reference.
     * @see #getAllowedValues()
     * @generated
     */
    void setAllowedValues(TAllowedValues value);

    /**
     * Returns the value of the '<em><b>Access</b></em>' attribute. The default
     * value is <code>"read"</code>. The literals are from the enumeration
     * {@link com.br_automation.buoat.xddeditor.XDD.AccessType1}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Access</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Access</em>' attribute.
     * @see com.br_automation.buoat.xddeditor.XDD.AccessType1
     * @see #isSetAccess()
     * @see #unsetAccess()
     * @see #setAccess(AccessType1)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTCount_Access()
     * @model default="read" unsettable="true"
     *        extendedMetaData="kind='attribute' name='access'"
     * @generated
     */
    AccessType1 getAccess();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TCount#getAccess
     * <em>Access</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Access</em>' attribute.
     * @see com.br_automation.buoat.xddeditor.XDD.AccessType1
     * @see #isSetAccess()
     * @see #unsetAccess()
     * @see #getAccess()
     * @generated
     */
    void setAccess(AccessType1 value);

    /**
     * Unsets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TCount#getAccess
     * <em>Access</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #isSetAccess()
     * @see #getAccess()
     * @see #setAccess(AccessType1)
     * @generated
     */
    void unsetAccess();

    /**
     * Returns whether the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TCount#getAccess
     * <em>Access</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return whether the value of the '<em>Access</em>' attribute is set.
     * @see #unsetAccess()
     * @see #getAccess()
     * @see #setAccess(AccessType1)
     * @generated
     */
    boolean isSetAccess();

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
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTCount_UniqueID()
     * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
     *        required="true"
     *        extendedMetaData="kind='attribute' name='uniqueID'"
     * @generated
     */
    String getUniqueID();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TCount#getUniqueID
     * <em>Unique ID</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Unique ID</em>' attribute.
     * @see #getUniqueID()
     * @generated
     */
    void setUniqueID(String value);

} // TCount
