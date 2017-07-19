/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Info Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.AddInfoType#getGroup <em>Group</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.AddInfoType#getLabel <em>Label</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.AddInfoType#getDescription <em>Description</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.AddInfoType#getLabelRef <em>Label Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.AddInfoType#getDescriptionRef <em>Description Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.AddInfoType#getValue <em>Value</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.AddInfoType#getBitOffset <em>Bit Offset</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.AddInfoType#getLen <em>Len</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.AddInfoType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getAddInfoType()
 * @model extendedMetaData="name='addInfo_._type' kind='elementOnly'"
 * @generated
 */
public interface AddInfoType extends EObject {
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
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getAddInfoType_Group()
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
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getAddInfoType_Label()
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
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getAddInfoType_Description()
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
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getAddInfoType_LabelRef()
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
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getAddInfoType_DescriptionRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='descriptionRef' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DescriptionRefType> getDescriptionRef();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link com.br_automation.buoat.xddeditor.XDD.ValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getAddInfoType_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ValueType> getValue();

	/**
	 * Returns the value of the '<em><b>Bit Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bit Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Offset</em>' attribute.
	 * @see #isSetBitOffset()
	 * @see #unsetBitOffset()
	 * @see #setBitOffset(short)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getAddInfoType_BitOffset()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte" required="true"
	 *        extendedMetaData="kind='attribute' name='bitOffset'"
	 * @generated
	 */
	short getBitOffset();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.AddInfoType#getBitOffset <em>Bit Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Offset</em>' attribute.
	 * @see #isSetBitOffset()
	 * @see #unsetBitOffset()
	 * @see #getBitOffset()
	 * @generated
	 */
	void setBitOffset(short value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.AddInfoType#getBitOffset <em>Bit Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBitOffset()
	 * @see #getBitOffset()
	 * @see #setBitOffset(short)
	 * @generated
	 */
	void unsetBitOffset();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.AddInfoType#getBitOffset <em>Bit Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bit Offset</em>' attribute is set.
	 * @see #unsetBitOffset()
	 * @see #getBitOffset()
	 * @see #setBitOffset(short)
	 * @generated
	 */
	boolean isSetBitOffset();

	/**
	 * Returns the value of the '<em><b>Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Len</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Len</em>' attribute.
	 * @see #isSetLen()
	 * @see #unsetLen()
	 * @see #setLen(short)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getAddInfoType_Len()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte" required="true"
	 *        extendedMetaData="kind='attribute' name='len'"
	 * @generated
	 */
	short getLen();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.AddInfoType#getLen <em>Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Len</em>' attribute.
	 * @see #isSetLen()
	 * @see #unsetLen()
	 * @see #getLen()
	 * @generated
	 */
	void setLen(short value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.AddInfoType#getLen <em>Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLen()
	 * @see #getLen()
	 * @see #setLen(short)
	 * @generated
	 */
	void unsetLen();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.AddInfoType#getLen <em>Len</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Len</em>' attribute is set.
	 * @see #unsetLen()
	 * @see #getLen()
	 * @see #setLen(short)
	 * @generated
	 */
	boolean isSetLen();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getAddInfoType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.AddInfoType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AddInfoType
