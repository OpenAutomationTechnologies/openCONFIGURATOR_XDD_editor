/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType#getGroup <em>Group</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType#getLabel <em>Label</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType#getDescription <em>Description</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType#getLabelRef <em>Label Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType#getDescriptionRef <em>Description Ref</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType#getConnectorType <em>Connector Type</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType#getId <em>Id</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType#getPositioning <em>Positioning</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType#getPosX <em>Pos X</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType#getPosY <em>Pos Y</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getConnectorType()
 * @model extendedMetaData="name='connector_._type' kind='elementOnly'"
 * @generated
 */
public interface ConnectorType extends EObject {
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
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getConnectorType_Group()
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
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getConnectorType_Label()
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
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getConnectorType_Description()
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
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getConnectorType_LabelRef()
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
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getConnectorType_DescriptionRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='descriptionRef' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DescriptionRefType> getDescriptionRef();

	/**
	 * Returns the value of the '<em><b>Connector Type</b></em>' attribute.
	 * The default value is <code>"POWERLINK"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Type</em>' attribute.
	 * @see #isSetConnectorType()
	 * @see #unsetConnectorType()
	 * @see #setConnectorType(String)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getConnectorType_ConnectorType()
	 * @model default="POWERLINK" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='connectorType'"
	 * @generated
	 */
	String getConnectorType();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType#getConnectorType <em>Connector Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Type</em>' attribute.
	 * @see #isSetConnectorType()
	 * @see #unsetConnectorType()
	 * @see #getConnectorType()
	 * @generated
	 */
	void setConnectorType(String value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType#getConnectorType <em>Connector Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectorType()
	 * @see #getConnectorType()
	 * @see #setConnectorType(String)
	 * @generated
	 */
	void unsetConnectorType();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType#getConnectorType <em>Connector Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connector Type</em>' attribute is set.
	 * @see #unsetConnectorType()
	 * @see #getConnectorType()
	 * @see #setConnectorType(String)
	 * @generated
	 */
	boolean isSetConnectorType();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getConnectorType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Positioning</b></em>' attribute.
	 * The default value is <code>"remote"</code>.
	 * The literals are from the enumeration {@link com.br_automation.buoat.xddeditor.XDD.PositioningType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positioning</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positioning</em>' attribute.
	 * @see com.br_automation.buoat.xddeditor.XDD.PositioningType
	 * @see #isSetPositioning()
	 * @see #unsetPositioning()
	 * @see #setPositioning(PositioningType)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getConnectorType_Positioning()
	 * @model default="remote" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='positioning'"
	 * @generated
	 */
	PositioningType getPositioning();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType#getPositioning <em>Positioning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positioning</em>' attribute.
	 * @see com.br_automation.buoat.xddeditor.XDD.PositioningType
	 * @see #isSetPositioning()
	 * @see #unsetPositioning()
	 * @see #getPositioning()
	 * @generated
	 */
	void setPositioning(PositioningType value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType#getPositioning <em>Positioning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPositioning()
	 * @see #getPositioning()
	 * @see #setPositioning(PositioningType)
	 * @generated
	 */
	void unsetPositioning();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType#getPositioning <em>Positioning</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Positioning</em>' attribute is set.
	 * @see #unsetPositioning()
	 * @see #getPositioning()
	 * @see #setPositioning(PositioningType)
	 * @generated
	 */
	boolean isSetPositioning();

	/**
	 * Returns the value of the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos X</em>' attribute.
	 * @see #setPosX(BigInteger)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getConnectorType_PosX()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='posX'"
	 * @generated
	 */
	BigInteger getPosX();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType#getPosX <em>Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos X</em>' attribute.
	 * @see #getPosX()
	 * @generated
	 */
	void setPosX(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Y</em>' attribute.
	 * @see #setPosY(BigInteger)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getConnectorType_PosY()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='posY'"
	 * @generated
	 */
	BigInteger getPosY();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType#getPosY <em>Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Y</em>' attribute.
	 * @see #getPosY()
	 * @generated
	 */
	void setPosY(BigInteger value);

} // ConnectorType
