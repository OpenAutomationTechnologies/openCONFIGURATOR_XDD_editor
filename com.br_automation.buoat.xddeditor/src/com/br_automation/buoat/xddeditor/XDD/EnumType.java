/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getGroup <em>Group</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getLabel <em>Label</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getDescription <em>Description</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getLabelRef <em>Label Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getDescriptionRef <em>Description Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getEnumValue <em>Enum Value</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getBOOL <em>BOOL</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getBITSTRING <em>BITSTRING</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getBYTE <em>BYTE</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getCHAR <em>CHAR</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getWORD <em>WORD</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getDWORD <em>DWORD</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getLWORD <em>LWORD</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getSINT <em>SINT</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getINT <em>INT</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getDINT <em>DINT</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getLINT <em>LINT</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getUSINT <em>USINT</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getUINT <em>UINT</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getUDINT <em>UDINT</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getULINT <em>ULINT</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getREAL <em>REAL</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getLREAL <em>LREAL</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getSTRING <em>STRING</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getWSTRING <em>WSTRING</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getName <em>Name</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getSize <em>Size</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getUniqueID <em>Unique ID</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getEnumType()
 * @model extendedMetaData="name='enum_._type' kind='elementOnly'"
 * @generated
 */
public interface EnumType extends EObject {
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
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getEnumType_Group()
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
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getEnumType_Label()
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
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getEnumType_Description()
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
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getEnumType_LabelRef()
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
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getEnumType_DescriptionRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='descriptionRef' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DescriptionRefType> getDescriptionRef();

	/**
	 * Returns the value of the '<em><b>Enum Value</b></em>' containment reference list.
	 * The list contents are of type {@link com.br_automation.buoat.xddeditor.XDD.TEnumValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Value</em>' containment reference list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getEnumType_EnumValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='enumValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TEnumValue> getEnumValue();

	/**
	 * Returns the value of the '<em><b>BOOL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BOOL</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BOOL</em>' containment reference.
	 * @see #setBOOL(EObject)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getEnumType_BOOL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BOOL' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getBOOL();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getBOOL <em>BOOL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BOOL</em>' containment reference.
	 * @see #getBOOL()
	 * @generated
	 */
	void setBOOL(EObject value);

	/**
	 * Returns the value of the '<em><b>BITSTRING</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BITSTRING</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BITSTRING</em>' containment reference.
	 * @see #setBITSTRING(EObject)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getEnumType_BITSTRING()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BITSTRING' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getBITSTRING();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getBITSTRING <em>BITSTRING</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BITSTRING</em>' containment reference.
	 * @see #getBITSTRING()
	 * @generated
	 */
	void setBITSTRING(EObject value);

	/**
	 * Returns the value of the '<em><b>BYTE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BYTE</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BYTE</em>' containment reference.
	 * @see #setBYTE(EObject)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getEnumType_BYTE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BYTE' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getBYTE();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getBYTE <em>BYTE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BYTE</em>' containment reference.
	 * @see #getBYTE()
	 * @generated
	 */
	void setBYTE(EObject value);

	/**
	 * Returns the value of the '<em><b>CHAR</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CHAR</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CHAR</em>' containment reference.
	 * @see #setCHAR(EObject)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getEnumType_CHAR()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CHAR' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getCHAR();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getCHAR <em>CHAR</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CHAR</em>' containment reference.
	 * @see #getCHAR()
	 * @generated
	 */
	void setCHAR(EObject value);

	/**
	 * Returns the value of the '<em><b>WORD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>WORD</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>WORD</em>' containment reference.
	 * @see #setWORD(EObject)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getEnumType_WORD()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WORD' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getWORD();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getWORD <em>WORD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WORD</em>' containment reference.
	 * @see #getWORD()
	 * @generated
	 */
	void setWORD(EObject value);

	/**
	 * Returns the value of the '<em><b>DWORD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DWORD</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DWORD</em>' containment reference.
	 * @see #setDWORD(EObject)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getEnumType_DWORD()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DWORD' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getDWORD();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getDWORD <em>DWORD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DWORD</em>' containment reference.
	 * @see #getDWORD()
	 * @generated
	 */
	void setDWORD(EObject value);

	/**
	 * Returns the value of the '<em><b>LWORD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LWORD</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LWORD</em>' containment reference.
	 * @see #setLWORD(EObject)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getEnumType_LWORD()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LWORD' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getLWORD();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getLWORD <em>LWORD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LWORD</em>' containment reference.
	 * @see #getLWORD()
	 * @generated
	 */
	void setLWORD(EObject value);

	/**
	 * Returns the value of the '<em><b>SINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SINT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SINT</em>' containment reference.
	 * @see #setSINT(EObject)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getEnumType_SINT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SINT' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getSINT();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getSINT <em>SINT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SINT</em>' containment reference.
	 * @see #getSINT()
	 * @generated
	 */
	void setSINT(EObject value);

	/**
	 * Returns the value of the '<em><b>INT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>INT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>INT</em>' containment reference.
	 * @see #setINT(EObject)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getEnumType_INT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='INT' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getINT();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getINT <em>INT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>INT</em>' containment reference.
	 * @see #getINT()
	 * @generated
	 */
	void setINT(EObject value);

	/**
	 * Returns the value of the '<em><b>DINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DINT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DINT</em>' containment reference.
	 * @see #setDINT(EObject)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getEnumType_DINT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DINT' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getDINT();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getDINT <em>DINT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DINT</em>' containment reference.
	 * @see #getDINT()
	 * @generated
	 */
	void setDINT(EObject value);

	/**
	 * Returns the value of the '<em><b>LINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LINT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LINT</em>' containment reference.
	 * @see #setLINT(EObject)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getEnumType_LINT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LINT' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getLINT();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getLINT <em>LINT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LINT</em>' containment reference.
	 * @see #getLINT()
	 * @generated
	 */
	void setLINT(EObject value);

	/**
	 * Returns the value of the '<em><b>USINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>USINT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>USINT</em>' containment reference.
	 * @see #setUSINT(EObject)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getEnumType_USINT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='USINT' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getUSINT();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getUSINT <em>USINT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>USINT</em>' containment reference.
	 * @see #getUSINT()
	 * @generated
	 */
	void setUSINT(EObject value);

	/**
	 * Returns the value of the '<em><b>UINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UINT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UINT</em>' containment reference.
	 * @see #setUINT(EObject)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getEnumType_UINT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UINT' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getUINT();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getUINT <em>UINT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UINT</em>' containment reference.
	 * @see #getUINT()
	 * @generated
	 */
	void setUINT(EObject value);

	/**
	 * Returns the value of the '<em><b>UDINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UDINT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UDINT</em>' containment reference.
	 * @see #setUDINT(EObject)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getEnumType_UDINT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UDINT' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getUDINT();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getUDINT <em>UDINT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UDINT</em>' containment reference.
	 * @see #getUDINT()
	 * @generated
	 */
	void setUDINT(EObject value);

	/**
	 * Returns the value of the '<em><b>ULINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ULINT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ULINT</em>' containment reference.
	 * @see #setULINT(EObject)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getEnumType_ULINT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ULINT' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getULINT();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getULINT <em>ULINT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ULINT</em>' containment reference.
	 * @see #getULINT()
	 * @generated
	 */
	void setULINT(EObject value);

	/**
	 * Returns the value of the '<em><b>REAL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>REAL</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>REAL</em>' containment reference.
	 * @see #setREAL(EObject)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getEnumType_REAL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='REAL' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getREAL();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getREAL <em>REAL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>REAL</em>' containment reference.
	 * @see #getREAL()
	 * @generated
	 */
	void setREAL(EObject value);

	/**
	 * Returns the value of the '<em><b>LREAL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LREAL</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LREAL</em>' containment reference.
	 * @see #setLREAL(EObject)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getEnumType_LREAL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LREAL' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getLREAL();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getLREAL <em>LREAL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LREAL</em>' containment reference.
	 * @see #getLREAL()
	 * @generated
	 */
	void setLREAL(EObject value);

	/**
	 * Returns the value of the '<em><b>STRING</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>STRING</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>STRING</em>' containment reference.
	 * @see #setSTRING(EObject)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getEnumType_STRING()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='STRING' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getSTRING();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getSTRING <em>STRING</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>STRING</em>' containment reference.
	 * @see #getSTRING()
	 * @generated
	 */
	void setSTRING(EObject value);

	/**
	 * Returns the value of the '<em><b>WSTRING</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>WSTRING</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>WSTRING</em>' containment reference.
	 * @see #setWSTRING(EObject)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getEnumType_WSTRING()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WSTRING' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getWSTRING();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getWSTRING <em>WSTRING</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WSTRING</em>' containment reference.
	 * @see #getWSTRING()
	 * @generated
	 */
	void setWSTRING(EObject value);

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
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getEnumType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #setSize(BigInteger)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getEnumType_Size()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='size'"
	 * @generated
	 */
	BigInteger getSize();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #getSize()
	 * @generated
	 */
	void setSize(BigInteger value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSize()
	 * @see #getSize()
	 * @see #setSize(BigInteger)
	 * @generated
	 */
	void unsetSize();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getSize <em>Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size</em>' attribute is set.
	 * @see #unsetSize()
	 * @see #getSize()
	 * @see #setSize(BigInteger)
	 * @generated
	 */
	boolean isSetSize();

	/**
	 * Returns the value of the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique ID</em>' attribute.
	 * @see #setUniqueID(String)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getEnumType_UniqueID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uniqueID'"
	 * @generated
	 */
	String getUniqueID();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getUniqueID <em>Unique ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique ID</em>' attribute.
	 * @see #getUniqueID()
	 * @generated
	 */
	void setUniqueID(String value);

} // EnumType
