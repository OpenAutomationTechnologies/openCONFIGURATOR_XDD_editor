/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TObject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TObject#getSubObject <em>Sub Object</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TObject#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TObject#getActualValue <em>Actual Value</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TObject#getDataType <em>Data Type</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TObject#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TObject#getDenotation <em>Denotation</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TObject#getHighLimit <em>High Limit</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TObject#getIndex <em>Index</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TObject#getLowLimit <em>Low Limit</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TObject#getName <em>Name</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TObject#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TObject#getObjFlags <em>Obj Flags</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TObject#getPDOmapping <em>PD Omapping</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TObject#getSubNumber <em>Sub Number</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TObject#getUniqueIDRef <em>Unique ID Ref</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTObject()
 * @model extendedMetaData="name='t_Object' kind='elementOnly'"
 * @generated
 */
public interface TObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub Object</b></em>' containment reference list.
	 * The list contents are of type {@link com.br_automation.buoat.xddeditor.XDD.SubObjectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Object</em>' containment reference list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTObject_SubObject()
	 * @model containment="true" upper="255"
	 *        extendedMetaData="kind='element' name='SubObject' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubObjectType> getSubObject();

	/**
	 * Returns the value of the '<em><b>Access Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.br_automation.buoat.xddeditor.XDD.TObjectAccessType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Type</em>' attribute.
	 * @see com.br_automation.buoat.xddeditor.XDD.TObjectAccessType
	 * @see #isSetAccessType()
	 * @see #unsetAccessType()
	 * @see #setAccessType(TObjectAccessType)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTObject_AccessType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='accessType'"
	 * @generated
	 */
	TObjectAccessType getAccessType();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getAccessType <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Type</em>' attribute.
	 * @see com.br_automation.buoat.xddeditor.XDD.TObjectAccessType
	 * @see #isSetAccessType()
	 * @see #unsetAccessType()
	 * @see #getAccessType()
	 * @generated
	 */
	void setAccessType(TObjectAccessType value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getAccessType <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccessType()
	 * @see #getAccessType()
	 * @see #setAccessType(TObjectAccessType)
	 * @generated
	 */
	void unsetAccessType();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getAccessType <em>Access Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Access Type</em>' attribute is set.
	 * @see #unsetAccessType()
	 * @see #getAccessType()
	 * @see #setAccessType(TObjectAccessType)
	 * @generated
	 */
	boolean isSetAccessType();

	/**
	 * Returns the value of the '<em><b>Actual Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Value</em>' attribute.
	 * @see #setActualValue(String)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTObject_ActualValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='actualValue'"
	 * @generated
	 */
	String getActualValue();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getActualValue <em>Actual Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Value</em>' attribute.
	 * @see #getActualValue()
	 * @generated
	 */
	void setActualValue(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #setDataType(byte[])
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTObject_DataType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.HexBinary"
	 *        extendedMetaData="kind='attribute' name='dataType'"
	 * @generated
	 */
	byte[] getDataType();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(byte[] value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTObject_DefaultValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='defaultValue'"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Denotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Denotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Denotation</em>' attribute.
	 * @see #setDenotation(String)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTObject_Denotation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='denotation'"
	 * @generated
	 */
	String getDenotation();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getDenotation <em>Denotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Denotation</em>' attribute.
	 * @see #getDenotation()
	 * @generated
	 */
	void setDenotation(String value);

	/**
	 * Returns the value of the '<em><b>High Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Limit</em>' attribute.
	 * @see #setHighLimit(String)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTObject_HighLimit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='highLimit'"
	 * @generated
	 */
	String getHighLimit();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getHighLimit <em>High Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Limit</em>' attribute.
	 * @see #getHighLimit()
	 * @generated
	 */
	void setHighLimit(String value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(byte[])
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTObject_Index()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.HexBinary" required="true"
	 *        extendedMetaData="kind='attribute' name='index'"
	 * @generated
	 */
	byte[] getIndex();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(byte[] value);

	/**
	 * Returns the value of the '<em><b>Low Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Limit</em>' attribute.
	 * @see #setLowLimit(String)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTObject_LowLimit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='lowLimit'"
	 * @generated
	 */
	String getLowLimit();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getLowLimit <em>Low Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Limit</em>' attribute.
	 * @see #getLowLimit()
	 * @generated
	 */
	void setLowLimit(String value);

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
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTObject_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type</em>' attribute.
	 * @see #isSetObjectType()
	 * @see #unsetObjectType()
	 * @see #setObjectType(short)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTObject_ObjectType()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte" required="true"
	 *        extendedMetaData="kind='attribute' name='objectType'"
	 * @generated
	 */
	short getObjectType();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getObjectType <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Type</em>' attribute.
	 * @see #isSetObjectType()
	 * @see #unsetObjectType()
	 * @see #getObjectType()
	 * @generated
	 */
	void setObjectType(short value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getObjectType <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetObjectType()
	 * @see #getObjectType()
	 * @see #setObjectType(short)
	 * @generated
	 */
	void unsetObjectType();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getObjectType <em>Object Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Object Type</em>' attribute is set.
	 * @see #unsetObjectType()
	 * @see #getObjectType()
	 * @see #setObjectType(short)
	 * @generated
	 */
	boolean isSetObjectType();

	/**
	 * Returns the value of the '<em><b>Obj Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obj Flags</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obj Flags</em>' attribute.
	 * @see #setObjFlags(byte[])
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTObject_ObjFlags()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.HexBinary"
	 *        extendedMetaData="kind='attribute' name='objFlags'"
	 * @generated
	 */
	byte[] getObjFlags();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getObjFlags <em>Obj Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obj Flags</em>' attribute.
	 * @see #getObjFlags()
	 * @generated
	 */
	void setObjFlags(byte[] value);

	/**
	 * Returns the value of the '<em><b>PD Omapping</b></em>' attribute.
	 * The literals are from the enumeration {@link com.br_automation.buoat.xddeditor.XDD.TObjectPDOMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PD Omapping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PD Omapping</em>' attribute.
	 * @see com.br_automation.buoat.xddeditor.XDD.TObjectPDOMapping
	 * @see #isSetPDOmapping()
	 * @see #unsetPDOmapping()
	 * @see #setPDOmapping(TObjectPDOMapping)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTObject_PDOmapping()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='PDOmapping'"
	 * @generated
	 */
	TObjectPDOMapping getPDOmapping();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getPDOmapping <em>PD Omapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PD Omapping</em>' attribute.
	 * @see com.br_automation.buoat.xddeditor.XDD.TObjectPDOMapping
	 * @see #isSetPDOmapping()
	 * @see #unsetPDOmapping()
	 * @see #getPDOmapping()
	 * @generated
	 */
	void setPDOmapping(TObjectPDOMapping value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getPDOmapping <em>PD Omapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPDOmapping()
	 * @see #getPDOmapping()
	 * @see #setPDOmapping(TObjectPDOMapping)
	 * @generated
	 */
	void unsetPDOmapping();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getPDOmapping <em>PD Omapping</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>PD Omapping</em>' attribute is set.
	 * @see #unsetPDOmapping()
	 * @see #getPDOmapping()
	 * @see #setPDOmapping(TObjectPDOMapping)
	 * @generated
	 */
	boolean isSetPDOmapping();

	/**
	 * Returns the value of the '<em><b>Sub Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Number</em>' attribute.
	 * @see #isSetSubNumber()
	 * @see #unsetSubNumber()
	 * @see #setSubNumber(short)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTObject_SubNumber()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte"
	 *        extendedMetaData="kind='attribute' name='subNumber'"
	 * @generated
	 */
	short getSubNumber();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getSubNumber <em>Sub Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Number</em>' attribute.
	 * @see #isSetSubNumber()
	 * @see #unsetSubNumber()
	 * @see #getSubNumber()
	 * @generated
	 */
	void setSubNumber(short value);

	/**
	 * Unsets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getSubNumber <em>Sub Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSubNumber()
	 * @see #getSubNumber()
	 * @see #setSubNumber(short)
	 * @generated
	 */
	void unsetSubNumber();

	/**
	 * Returns whether the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getSubNumber <em>Sub Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sub Number</em>' attribute is set.
	 * @see #unsetSubNumber()
	 * @see #getSubNumber()
	 * @see #setSubNumber(short)
	 * @generated
	 */
	boolean isSetSubNumber();

	/**
	 * Returns the value of the '<em><b>Unique ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique ID Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique ID Ref</em>' attribute.
	 * @see #setUniqueIDRef(String)
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTObject_UniqueIDRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='uniqueIDRef'"
	 * @generated
	 */
	String getUniqueIDRef();

	/**
	 * Sets the value of the '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getUniqueIDRef <em>Unique ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique ID Ref</em>' attribute.
	 * @see #getUniqueIDRef()
	 * @generated
	 */
	void setUniqueIDRef(String value);

} // TObject
