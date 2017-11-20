/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TLED</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TLED#getGroup <em>Group</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TLED#getLabel <em>Label</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TLED#getDescription <em>Description</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TLED#getLabelRef <em>Label Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TLED#getDescriptionRef <em>Description Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TLED#getLEDstate <em>LE Dstate</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TLED#getLEDcolors <em>LE Dcolors</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TLED#getLEDtype <em>LE Dtype</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTLED()
 * @model extendedMetaData="name='t_LED' kind='elementOnly'"
 * @generated
 */
public interface TLED extends EObject {
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
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTLED_Group()
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
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTLED_Label()
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
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTLED_Description()
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
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTLED_LabelRef()
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
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTLED_DescriptionRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='descriptionRef' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DescriptionRefType> getDescriptionRef();

	/**
	 * Returns the value of the '<em><b>LE Dstate</b></em>' containment reference list.
	 * The list contents are of type {@link com.br_automation.buoat.xddeditor.XDD.LEDstateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LE Dstate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LE Dstate</em>' containment reference list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTLED_LEDstate()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LEDstate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LEDstateType> getLEDstate();

	/**
	 * Returns the value of the '<em><b>LE Dcolors</b></em>' attribute.
	 * The literals are from the enumeration {@link com.br_automation.buoat.xddeditor.XDD.LEDcolorsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LE Dcolors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LE Dcolors</em>' attribute.
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDcolorsType
	 * @see #isSetLEDcolors()
	 * @see #unsetLEDcolors()
	 * @see #setLEDcolors(LEDcolorsType)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTLED_LEDcolors()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='LEDcolors'"
	 * @generated
	 */
	LEDcolorsType getLEDcolors();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TLED#getLEDcolors <em>LE Dcolors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LE Dcolors</em>' attribute.
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDcolorsType
	 * @see #isSetLEDcolors()
	 * @see #unsetLEDcolors()
	 * @see #getLEDcolors()
	 * @generated
	 */
	void setLEDcolors(LEDcolorsType value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TLED#getLEDcolors <em>LE Dcolors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLEDcolors()
	 * @see #getLEDcolors()
	 * @see #setLEDcolors(LEDcolorsType)
	 * @generated
	 */
	void unsetLEDcolors();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TLED#getLEDcolors <em>LE Dcolors</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>LE Dcolors</em>' attribute is set.
	 * @see #unsetLEDcolors()
	 * @see #getLEDcolors()
	 * @see #setLEDcolors(LEDcolorsType)
	 * @generated
	 */
	boolean isSetLEDcolors();

	/**
	 * Returns the value of the '<em><b>LE Dtype</b></em>' attribute.
	 * The literals are from the enumeration {@link com.br_automation.buoat.xddeditor.XDD.LEDtypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LE Dtype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LE Dtype</em>' attribute.
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDtypeType
	 * @see #isSetLEDtype()
	 * @see #unsetLEDtype()
	 * @see #setLEDtype(LEDtypeType)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTLED_LEDtype()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='LEDtype'"
	 * @generated
	 */
	LEDtypeType getLEDtype();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TLED#getLEDtype <em>LE Dtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LE Dtype</em>' attribute.
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDtypeType
	 * @see #isSetLEDtype()
	 * @see #unsetLEDtype()
	 * @see #getLEDtype()
	 * @generated
	 */
	void setLEDtype(LEDtypeType value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TLED#getLEDtype <em>LE Dtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLEDtype()
	 * @see #getLEDtype()
	 * @see #setLEDtype(LEDtypeType)
	 * @generated
	 */
	void unsetLEDtype();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TLED#getLEDtype <em>LE Dtype</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>LE Dtype</em>' attribute is set.
	 * @see #unsetLEDtype()
	 * @see #getLEDtype()
	 * @see #setLEDtype(LEDtypeType)
	 * @generated
	 */
	boolean isSetLEDtype();

} // TLED
