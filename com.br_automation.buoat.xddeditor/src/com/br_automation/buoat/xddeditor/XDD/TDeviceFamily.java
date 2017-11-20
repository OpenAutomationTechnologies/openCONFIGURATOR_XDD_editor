/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TDevice Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFamily#getGroup <em>Group</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFamily#getLabel <em>Label</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFamily#getDescription <em>Description</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFamily#getLabelRef <em>Label Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFamily#getDescriptionRef <em>Description Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFamily#isReadOnly <em>Read Only</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceFamily()
 * @model extendedMetaData="name='t_deviceFamily' kind='elementOnly'"
 * @generated
 */
public interface TDeviceFamily extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceFamily_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference list.
	 * The list contents are of type {@link com.br_automation.buoat.xddeditor.XDD.LabelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               This element allows storage of the identifying name inside the XML file itself.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' containment reference list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceFamily_Label()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<LabelType> getLabel();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link com.br_automation.buoat.xddeditor.XDD.DescriptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               This element allows storage of descriptive information inside the XML file itself.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceFamily_Description()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DescriptionType> getDescription();

	/**
	 * Returns the value of the '<em><b>Label Ref</b></em>' containment reference list.
	 * The list contents are of type {@link com.br_automation.buoat.xddeditor.XDD.LabelRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               This element allows storage of identifying names inside an external text resource file.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label Ref</em>' containment reference list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceFamily_LabelRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='labelRef' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<LabelRefType> getLabelRef();

	/**
	 * Returns the value of the '<em><b>Description Ref</b></em>' containment reference list.
	 * The list contents are of type {@link com.br_automation.buoat.xddeditor.XDD.DescriptionRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               This element allows storage of reference descriptive texts inside an external text resource file.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description Ref</em>' containment reference list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceFamily_DescriptionRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='descriptionRef' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DescriptionRefType> getDescriptionRef();

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #isSetReadOnly()
	 * @see #unsetReadOnly()
	 * @see #setReadOnly(boolean)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceFamily_ReadOnly()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='readOnly'"
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFamily#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isSetReadOnly()
	 * @see #unsetReadOnly()
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFamily#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReadOnly()
	 * @see #isReadOnly()
	 * @see #setReadOnly(boolean)
	 * @generated
	 */
	void unsetReadOnly();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFamily#isReadOnly <em>Read Only</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Read Only</em>' attribute is set.
	 * @see #unsetReadOnly()
	 * @see #isReadOnly()
	 * @see #setReadOnly(boolean)
	 * @generated
	 */
	boolean isSetReadOnly();

} // TDeviceFamily
