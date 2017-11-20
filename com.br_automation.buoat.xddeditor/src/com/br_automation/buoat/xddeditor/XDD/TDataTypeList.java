/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TData Type List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TDataTypeList#getGroup <em>Group</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TDataTypeList#getArray <em>Array</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TDataTypeList#getStruct <em>Struct</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TDataTypeList#getEnum <em>Enum</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.TDataTypeList#getDerived <em>Derived</em>}</li>
 * </ul>
 *
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDataTypeList()
 * @model extendedMetaData="name='t_dataTypeList' kind='elementOnly'"
 * @generated
 */
public interface TDataTypeList extends EObject {
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
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDataTypeList_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Array</b></em>' containment reference list.
	 * The list contents are of type {@link com.br_automation.buoat.xddeditor.XDD.ArrayType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Defines a user-defined array.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Array</em>' containment reference list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDataTypeList_Array()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='array' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ArrayType> getArray();

	/**
	 * Returns the value of the '<em><b>Struct</b></em>' containment reference list.
	 * The list contents are of type {@link com.br_automation.buoat.xddeditor.XDD.StructType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Defines a user-defined structure.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Struct</em>' containment reference list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDataTypeList_Struct()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='struct' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<StructType> getStruct();

	/**
	 * Returns the value of the '<em><b>Enum</b></em>' containment reference list.
	 * The list contents are of type {@link com.br_automation.buoat.xddeditor.XDD.EnumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Defines a user-defined enumeration.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enum</em>' containment reference list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDataTypeList_Enum()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='enum' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<EnumType> getEnum();

	/**
	 * Returns the value of the '<em><b>Derived</b></em>' containment reference list.
	 * The list contents are of type {@link com.br_automation.buoat.xddeditor.XDD.DerivedType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Defines a user-defined derived data type.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived</em>' containment reference list.
	 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDataTypeList_Derived()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='derived' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DerivedType> getDerived();

} // TDataTypeList
