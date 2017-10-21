/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TParameter Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getGroup <em>Group</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getLabel <em>Label</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getDescription <em>Description</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getLabelRef <em>Label Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getDescriptionRef <em>Description Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getParameterGroup <em>Parameter Group</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getParameterRef <em>Parameter Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getBitOffset <em>Bit Offset</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getConditionalUniqueIDRef <em>Conditional Unique ID Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getConditionalValue <em>Conditional Value</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#isConfigParameter <em>Config Parameter</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#isGroupLevelVisible <em>Group Level Visible</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getKindOfAccess <em>Kind Of Access</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getUniqueID <em>Unique ID</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterGroup()
 * @model extendedMetaData="name='t_parameterGroup' kind='elementOnly'"
 * @generated
 */
public interface TParameterGroup extends EObject {
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
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterGroup_Group()
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
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterGroup_Label()
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
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterGroup_Description()
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
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterGroup_LabelRef()
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
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterGroup_DescriptionRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='descriptionRef' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DescriptionRefType> getDescriptionRef();

	/**
	 * Returns the value of the '<em><b>Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group1</em>' attribute list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterGroup_Group1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:5'"
	 * @generated
	 */
	FeatureMap getGroup1();

	/**
	 * Returns the value of the '<em><b>Parameter Group</b></em>' containment reference list.
	 * The list contents are of type {@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Group</em>' containment reference list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterGroup_ParameterGroup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='parameterGroup' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<TParameterGroup> getParameterGroup();

	/**
	 * Returns the value of the '<em><b>Parameter Ref</b></em>' containment reference list.
	 * The list contents are of type {@link com.br_automation.buoat.xddeditor.XDD.ParameterRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Ref</em>' containment reference list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterGroup_ParameterRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='parameterRef' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<ParameterRefType> getParameterRef();

	/**
	 * Returns the value of the '<em><b>Bit Offset</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bit Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Offset</em>' attribute.
	 * @see #isSetBitOffset()
	 * @see #unsetBitOffset()
	 * @see #setBitOffset(BigInteger)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterGroup_BitOffset()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='bitOffset'"
	 * @generated
	 */
	BigInteger getBitOffset();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getBitOffset <em>Bit Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Offset</em>' attribute.
	 * @see #isSetBitOffset()
	 * @see #unsetBitOffset()
	 * @see #getBitOffset()
	 * @generated
	 */
	void setBitOffset(BigInteger value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getBitOffset <em>Bit Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBitOffset()
	 * @see #getBitOffset()
	 * @see #setBitOffset(BigInteger)
	 * @generated
	 */
	void unsetBitOffset();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getBitOffset <em>Bit Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bit Offset</em>' attribute is set.
	 * @see #unsetBitOffset()
	 * @see #getBitOffset()
	 * @see #setBitOffset(BigInteger)
	 * @generated
	 */
	boolean isSetBitOffset();

	/**
	 * Returns the value of the '<em><b>Conditional Unique ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional Unique ID Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional Unique ID Ref</em>' attribute.
	 * @see #setConditionalUniqueIDRef(String)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterGroup_ConditionalUniqueIDRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='conditionalUniqueIDRef'"
	 * @generated
	 */
	String getConditionalUniqueIDRef();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getConditionalUniqueIDRef <em>Conditional Unique ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional Unique ID Ref</em>' attribute.
	 * @see #getConditionalUniqueIDRef()
	 * @generated
	 */
	void setConditionalUniqueIDRef(String value);

	/**
	 * Returns the value of the '<em><b>Conditional Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional Value</em>' attribute.
	 * @see #setConditionalValue(String)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterGroup_ConditionalValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='conditionalValue'"
	 * @generated
	 */
	String getConditionalValue();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getConditionalValue <em>Conditional Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional Value</em>' attribute.
	 * @see #getConditionalValue()
	 * @generated
	 */
	void setConditionalValue(String value);

	/**
	 * Returns the value of the '<em><b>Config Parameter</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Parameter</em>' attribute.
	 * @see #isSetConfigParameter()
	 * @see #unsetConfigParameter()
	 * @see #setConfigParameter(boolean)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterGroup_ConfigParameter()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='configParameter'"
	 * @generated
	 */
	boolean isConfigParameter();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#isConfigParameter <em>Config Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Parameter</em>' attribute.
	 * @see #isSetConfigParameter()
	 * @see #unsetConfigParameter()
	 * @see #isConfigParameter()
	 * @generated
	 */
	void setConfigParameter(boolean value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#isConfigParameter <em>Config Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConfigParameter()
	 * @see #isConfigParameter()
	 * @see #setConfigParameter(boolean)
	 * @generated
	 */
	void unsetConfigParameter();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#isConfigParameter <em>Config Parameter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Config Parameter</em>' attribute is set.
	 * @see #unsetConfigParameter()
	 * @see #isConfigParameter()
	 * @see #setConfigParameter(boolean)
	 * @generated
	 */
	boolean isSetConfigParameter();

	/**
	 * Returns the value of the '<em><b>Group Level Visible</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Level Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Level Visible</em>' attribute.
	 * @see #isSetGroupLevelVisible()
	 * @see #unsetGroupLevelVisible()
	 * @see #setGroupLevelVisible(boolean)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterGroup_GroupLevelVisible()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='groupLevelVisible'"
	 * @generated
	 */
	boolean isGroupLevelVisible();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#isGroupLevelVisible <em>Group Level Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Level Visible</em>' attribute.
	 * @see #isSetGroupLevelVisible()
	 * @see #unsetGroupLevelVisible()
	 * @see #isGroupLevelVisible()
	 * @generated
	 */
	void setGroupLevelVisible(boolean value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#isGroupLevelVisible <em>Group Level Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGroupLevelVisible()
	 * @see #isGroupLevelVisible()
	 * @see #setGroupLevelVisible(boolean)
	 * @generated
	 */
	void unsetGroupLevelVisible();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#isGroupLevelVisible <em>Group Level Visible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Group Level Visible</em>' attribute is set.
	 * @see #unsetGroupLevelVisible()
	 * @see #isGroupLevelVisible()
	 * @see #setGroupLevelVisible(boolean)
	 * @generated
	 */
	boolean isSetGroupLevelVisible();

	/**
	 * Returns the value of the '<em><b>Kind Of Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind Of Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind Of Access</em>' attribute.
	 * @see #setKindOfAccess(String)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterGroup_KindOfAccess()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='kindOfAccess'"
	 * @generated
	 */
	String getKindOfAccess();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getKindOfAccess <em>Kind Of Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind Of Access</em>' attribute.
	 * @see #getKindOfAccess()
	 * @generated
	 */
	void setKindOfAccess(String value);

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
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterGroup_UniqueID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uniqueID'"
	 * @generated
	 */
	String getUniqueID();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getUniqueID <em>Unique ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique ID</em>' attribute.
	 * @see #getUniqueID()
	 * @generated
	 */
	void setUniqueID(String value);

} // TParameterGroup
