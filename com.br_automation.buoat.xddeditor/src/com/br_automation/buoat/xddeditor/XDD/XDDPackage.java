/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.br_automation.buoat.xddeditor.XDD.XDDFactory
 * @model kind="package"
 * @generated
 */
public interface XDDPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ethernet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ethernet-powerlink.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ethernet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XDDPackage eINSTANCE = com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.AddInfoTypeImpl <em>Add Info Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.AddInfoTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getAddInfoType()
	 * @generated
	 */
	int ADD_INFO_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INFO_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INFO_TYPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INFO_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INFO_TYPE__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INFO_TYPE__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INFO_TYPE__VALUE = 5;

	/**
	 * The feature id for the '<em><b>Bit Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INFO_TYPE__BIT_OFFSET = 6;

	/**
	 * The feature id for the '<em><b>Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INFO_TYPE__LEN = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INFO_TYPE__NAME = 8;

	/**
	 * The number of structural features of the '<em>Add Info Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INFO_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.ArrayTypeImpl <em>Array Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.ArrayTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getArrayType()
	 * @generated
	 */
	int ARRAY_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>Subrange</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__SUBRANGE = 5;

	/**
	 * The feature id for the '<em><b>BOOL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__BOOL = 6;

	/**
	 * The feature id for the '<em><b>BITSTRING</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__BITSTRING = 7;

	/**
	 * The feature id for the '<em><b>BYTE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__BYTE = 8;

	/**
	 * The feature id for the '<em><b>CHAR</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__CHAR = 9;

	/**
	 * The feature id for the '<em><b>WORD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__WORD = 10;

	/**
	 * The feature id for the '<em><b>DWORD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__DWORD = 11;

	/**
	 * The feature id for the '<em><b>LWORD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__LWORD = 12;

	/**
	 * The feature id for the '<em><b>SINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__SINT = 13;

	/**
	 * The feature id for the '<em><b>INT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__INT = 14;

	/**
	 * The feature id for the '<em><b>DINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__DINT = 15;

	/**
	 * The feature id for the '<em><b>LINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__LINT = 16;

	/**
	 * The feature id for the '<em><b>USINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__USINT = 17;

	/**
	 * The feature id for the '<em><b>UINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__UINT = 18;

	/**
	 * The feature id for the '<em><b>UDINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__UDINT = 19;

	/**
	 * The feature id for the '<em><b>ULINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__ULINT = 20;

	/**
	 * The feature id for the '<em><b>REAL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__REAL = 21;

	/**
	 * The feature id for the '<em><b>LREAL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__LREAL = 22;

	/**
	 * The feature id for the '<em><b>STRING</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__STRING = 23;

	/**
	 * The feature id for the '<em><b>WSTRING</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__WSTRING = 24;

	/**
	 * The feature id for the '<em><b>Data Type ID Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__DATA_TYPE_ID_REF = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__NAME = 26;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__UNIQUE_ID = 27;

	/**
	 * The number of structural features of the '<em>Array Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_FEATURE_COUNT = 28;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.CategoryTypeImpl <em>Category Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.CategoryTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getCategoryType()
	 * @generated
	 */
	int CATEGORY_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_TYPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_TYPE__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_TYPE__DESCRIPTION_REF = 4;

	/**
	 * The number of structural features of the '<em>Category Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.CharacteristicContentTypeImpl <em>Characteristic Content Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.CharacteristicContentTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getCharacteristicContentType()
	 * @generated
	 */
	int CHARACTERISTIC_CONTENT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_CONTENT_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_CONTENT_TYPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_CONTENT_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_CONTENT_TYPE__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_CONTENT_TYPE__DESCRIPTION_REF = 4;

	/**
	 * The number of structural features of the '<em>Characteristic Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_CONTENT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.CharacteristicNameTypeImpl <em>Characteristic Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.CharacteristicNameTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getCharacteristicNameType()
	 * @generated
	 */
	int CHARACTERISTIC_NAME_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_NAME_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_NAME_TYPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_NAME_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_NAME_TYPE__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_NAME_TYPE__DESCRIPTION_REF = 4;

	/**
	 * The number of structural features of the '<em>Characteristic Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_NAME_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.CharacteristicsListTypeImpl <em>Characteristics List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.CharacteristicsListTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getCharacteristicsListType()
	 * @generated
	 */
	int CHARACTERISTICS_LIST_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTICS_LIST_TYPE__CATEGORY = 0;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTICS_LIST_TYPE__CHARACTERISTIC = 1;

	/**
	 * The number of structural features of the '<em>Characteristics List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTICS_LIST_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.CharacteristicTypeImpl <em>Characteristic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.CharacteristicTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getCharacteristicType()
	 * @generated
	 */
	int CHARACTERISTIC_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Characteristic Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_TYPE__CHARACTERISTIC_NAME = 0;

	/**
	 * The feature id for the '<em><b>Characteristic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_TYPE__CHARACTERISTIC_CONTENT = 1;

	/**
	 * The number of structural features of the '<em>Characteristic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.CompliantWithTypeImpl <em>Compliant With Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.CompliantWithTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getCompliantWithType()
	 * @generated
	 */
	int COMPLIANT_WITH_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANT_WITH_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANT_WITH_TYPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANT_WITH_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANT_WITH_TYPE__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANT_WITH_TYPE__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANT_WITH_TYPE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANT_WITH_TYPE__RANGE = 6;

	/**
	 * The number of structural features of the '<em>Compliant With Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANT_WITH_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.ConfigVarsTypeImpl <em>Config Vars Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.ConfigVarsTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getConfigVarsType()
	 * @generated
	 */
	int CONFIG_VARS_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Var Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_VARS_TYPE__VAR_DECLARATION = 0;

	/**
	 * The number of structural features of the '<em>Config Vars Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_VARS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.ConnectionTypeImpl <em>Connection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.ConnectionTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getConnectionType()
	 * @generated
	 */
	int CONNECTION_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__DESTINATION = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__SOURCE = 2;

	/**
	 * The number of structural features of the '<em>Connection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.ConnectorTypeImpl <em>Connector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.ConnectorTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getConnectorType()
	 * @generated
	 */
	int CONNECTOR_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>Connector Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__CONNECTOR_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__ID = 6;

	/**
	 * The feature id for the '<em><b>Positioning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__POSITIONING = 7;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__POS_X = 8;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__POS_Y = 9;

	/**
	 * The number of structural features of the '<em>Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.DataTypeListTypeImpl <em>Data Type List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.DataTypeListTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getDataTypeListType()
	 * @generated
	 */
	int DATA_TYPE_LIST_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Def Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_LIST_TYPE__DEF_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Data Type List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.DerivedTypeImpl <em>Derived Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.DerivedTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getDerivedType()
	 * @generated
	 */
	int DERIVED_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__COUNT = 5;

	/**
	 * The feature id for the '<em><b>BOOL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__BOOL = 6;

	/**
	 * The feature id for the '<em><b>BITSTRING</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__BITSTRING = 7;

	/**
	 * The feature id for the '<em><b>BYTE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__BYTE = 8;

	/**
	 * The feature id for the '<em><b>CHAR</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__CHAR = 9;

	/**
	 * The feature id for the '<em><b>WORD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__WORD = 10;

	/**
	 * The feature id for the '<em><b>DWORD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__DWORD = 11;

	/**
	 * The feature id for the '<em><b>LWORD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__LWORD = 12;

	/**
	 * The feature id for the '<em><b>SINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__SINT = 13;

	/**
	 * The feature id for the '<em><b>INT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__INT = 14;

	/**
	 * The feature id for the '<em><b>DINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__DINT = 15;

	/**
	 * The feature id for the '<em><b>LINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__LINT = 16;

	/**
	 * The feature id for the '<em><b>USINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__USINT = 17;

	/**
	 * The feature id for the '<em><b>UINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__UINT = 18;

	/**
	 * The feature id for the '<em><b>UDINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__UDINT = 19;

	/**
	 * The feature id for the '<em><b>ULINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__ULINT = 20;

	/**
	 * The feature id for the '<em><b>REAL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__REAL = 21;

	/**
	 * The feature id for the '<em><b>LREAL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__LREAL = 22;

	/**
	 * The feature id for the '<em><b>STRING</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__STRING = 23;

	/**
	 * The feature id for the '<em><b>WSTRING</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__WSTRING = 24;

	/**
	 * The feature id for the '<em><b>Data Type ID Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__DATA_TYPE_ID_REF = 25;

	/**
	 * The feature id for the '<em><b>Description1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__DESCRIPTION1 = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__NAME = 27;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__UNIQUE_ID = 28;

	/**
	 * The number of structural features of the '<em>Derived Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE_FEATURE_COUNT = 29;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.DescriptionRefTypeImpl <em>Description Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.DescriptionRefTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getDescriptionRefType()
	 * @generated
	 */
	int DESCRIPTION_REF_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_REF_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Dict ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_REF_TYPE__DICT_ID = 1;

	/**
	 * The feature id for the '<em><b>Text ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_REF_TYPE__TEXT_ID = 2;

	/**
	 * The number of structural features of the '<em>Description Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_REF_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.DescriptionTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getDescriptionType()
	 * @generated
	 */
	int DESCRIPTION_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__LANG = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__URI = 2;

	/**
	 * The number of structural features of the '<em>Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.DictionaryTypeImpl <em>Dictionary Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.DictionaryTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getDictionaryType()
	 * @generated
	 */
	int DICTIONARY_TYPE = 15;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__FILE = 0;

	/**
	 * The feature id for the '<em><b>Dict ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__DICT_ID = 1;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__LANG = 2;

	/**
	 * The number of structural features of the '<em>Dictionary Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.DocumentRootImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 16;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASSIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>Firmware</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FIRMWARE = 5;

	/**
	 * The feature id for the '<em><b>ISO15745 Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ISO15745_PROFILE = 6;

	/**
	 * The feature id for the '<em><b>ISO15745 Profile Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ISO15745_PROFILE_CONTAINER = 7;

	/**
	 * The feature id for the '<em><b>Text Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_RESOURCE = 8;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.DynamicChannelsTypeImpl <em>Dynamic Channels Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.DynamicChannelsTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getDynamicChannelsType()
	 * @generated
	 */
	int DYNAMIC_CHANNELS_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Dynamic Channel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_CHANNELS_TYPE__DYNAMIC_CHANNEL = 0;

	/**
	 * The number of structural features of the '<em>Dynamic Channels Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_CHANNELS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.EnumTypeImpl <em>Enum Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.EnumTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getEnumType()
	 * @generated
	 */
	int ENUM_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>Enum Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__ENUM_VALUE = 5;

	/**
	 * The feature id for the '<em><b>BOOL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__BOOL = 6;

	/**
	 * The feature id for the '<em><b>BITSTRING</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__BITSTRING = 7;

	/**
	 * The feature id for the '<em><b>BYTE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__BYTE = 8;

	/**
	 * The feature id for the '<em><b>CHAR</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__CHAR = 9;

	/**
	 * The feature id for the '<em><b>WORD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__WORD = 10;

	/**
	 * The feature id for the '<em><b>DWORD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__DWORD = 11;

	/**
	 * The feature id for the '<em><b>LWORD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__LWORD = 12;

	/**
	 * The feature id for the '<em><b>SINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__SINT = 13;

	/**
	 * The feature id for the '<em><b>INT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__INT = 14;

	/**
	 * The feature id for the '<em><b>DINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__DINT = 15;

	/**
	 * The feature id for the '<em><b>LINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__LINT = 16;

	/**
	 * The feature id for the '<em><b>USINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__USINT = 17;

	/**
	 * The feature id for the '<em><b>UINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__UINT = 18;

	/**
	 * The feature id for the '<em><b>UDINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__UDINT = 19;

	/**
	 * The feature id for the '<em><b>ULINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__ULINT = 20;

	/**
	 * The feature id for the '<em><b>REAL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__REAL = 21;

	/**
	 * The feature id for the '<em><b>LREAL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__LREAL = 22;

	/**
	 * The feature id for the '<em><b>STRING</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__STRING = 23;

	/**
	 * The feature id for the '<em><b>WSTRING</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__WSTRING = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__NAME = 25;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__SIZE = 26;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__UNIQUE_ID = 27;

	/**
	 * The number of structural features of the '<em>Enum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_FEATURE_COUNT = 28;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.ErrorBitDataTypeImpl <em>Error Bit Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.ErrorBitDataTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getErrorBitDataType()
	 * @generated
	 */
	int ERROR_BIT_DATA_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BIT_DATA_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BIT_DATA_TYPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BIT_DATA_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BIT_DATA_TYPE__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BIT_DATA_TYPE__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BIT_DATA_TYPE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BIT_DATA_TYPE__OFFSET = 6;

	/**
	 * The number of structural features of the '<em>Error Bit Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BIT_DATA_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.ErrorConstantDataTypeImpl <em>Error Constant Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.ErrorConstantDataTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getErrorConstantDataType()
	 * @generated
	 */
	int ERROR_CONSTANT_DATA_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CONSTANT_DATA_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CONSTANT_DATA_TYPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CONSTANT_DATA_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CONSTANT_DATA_TYPE__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CONSTANT_DATA_TYPE__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>Add Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CONSTANT_DATA_TYPE__ADD_INFO = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CONSTANT_DATA_TYPE__NAME = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CONSTANT_DATA_TYPE__VALUE = 7;

	/**
	 * The number of structural features of the '<em>Error Constant Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CONSTANT_DATA_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.ErrorListTypeImpl <em>Error List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.ErrorListTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getErrorListType()
	 * @generated
	 */
	int ERROR_LIST_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_LIST_TYPE__ERROR = 0;

	/**
	 * The number of structural features of the '<em>Error List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.FileTypeImpl <em>File Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.FileTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getFileType()
	 * @generated
	 */
	int FILE_TYPE = 22;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__URI = 0;

	/**
	 * The number of structural features of the '<em>File Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.FirmwareTypeImpl <em>Firmware Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.FirmwareTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getFirmwareType()
	 * @generated
	 */
	int FIRMWARE_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_TYPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_TYPE__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_TYPE__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>Build Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_TYPE__BUILD_DATE = 5;

	/**
	 * The feature id for the '<em><b>Device Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_TYPE__DEVICE_REVISION_NUMBER = 6;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_TYPE__URI = 7;

	/**
	 * The number of structural features of the '<em>Firmware Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.FunctionInstanceTypeImpl <em>Function Instance Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.FunctionInstanceTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getFunctionInstanceType()
	 * @generated
	 */
	int FUNCTION_INSTANCE_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE_TYPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE_TYPE__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE_TYPE__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE_TYPE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Type ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE_TYPE__TYPE_ID_REF = 6;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE_TYPE__UNIQUE_ID = 7;

	/**
	 * The number of structural features of the '<em>Function Instance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.FunctionTypeTypeImpl <em>Function Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.FunctionTypeTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getFunctionTypeType()
	 * @generated
	 */
	int FUNCTION_TYPE_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_TYPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_TYPE__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_TYPE__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>Version Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_TYPE__VERSION_INFO = 5;

	/**
	 * The feature id for the '<em><b>Interface List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_TYPE__INTERFACE_LIST = 6;

	/**
	 * The feature id for the '<em><b>Function Instance List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_TYPE__FUNCTION_INSTANCE_LIST = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_TYPE__NAME = 8;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_TYPE__PACKAGE = 9;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_TYPE__UNIQUE_ID = 10;

	/**
	 * The number of structural features of the '<em>Function Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.IdentityTypeImpl <em>Identity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.IdentityTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getIdentityType()
	 * @generated
	 */
	int IDENTITY_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Vendor ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_TYPE__VENDOR_ID = 0;

	/**
	 * The feature id for the '<em><b>Device Family</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_TYPE__DEVICE_FAMILY = 1;

	/**
	 * The feature id for the '<em><b>Product ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_TYPE__PRODUCT_ID = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_TYPE__VERSION = 3;

	/**
	 * The feature id for the '<em><b>Build Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_TYPE__BUILD_DATE = 4;

	/**
	 * The feature id for the '<em><b>Specification Revision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_TYPE__SPECIFICATION_REVISION = 5;

	/**
	 * The number of structural features of the '<em>Identity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.InputVarsTypeImpl <em>Input Vars Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.InputVarsTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getInputVarsType()
	 * @generated
	 */
	int INPUT_VARS_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Var Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARS_TYPE__VAR_DECLARATION = 0;

	/**
	 * The number of structural features of the '<em>Input Vars Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.InstanceIDRefTypeImpl <em>Instance ID Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.InstanceIDRefTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getInstanceIDRefType()
	 * @generated
	 */
	int INSTANCE_ID_REF_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Unique ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_ID_REF_TYPE__UNIQUE_ID_REF = 0;

	/**
	 * The number of structural features of the '<em>Instance ID Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_ID_REF_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.InstanceNameTypeImpl <em>Instance Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.InstanceNameTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getInstanceNameType()
	 * @generated
	 */
	int INSTANCE_NAME_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_NAME_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_NAME_TYPE__READ_ONLY = 1;

	/**
	 * The number of structural features of the '<em>Instance Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_NAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.InterfaceListTypeImpl <em>Interface List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.InterfaceListTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getInterfaceListType()
	 * @generated
	 */
	int INTERFACE_LIST_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Input Vars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_LIST_TYPE__INPUT_VARS = 0;

	/**
	 * The feature id for the '<em><b>Output Vars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_LIST_TYPE__OUTPUT_VARS = 1;

	/**
	 * The feature id for the '<em><b>Config Vars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_LIST_TYPE__CONFIG_VARS = 2;

	/**
	 * The number of structural features of the '<em>Interface List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_LIST_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.ISO15745ProfileContainerTypeImpl <em>ISO15745 Profile Container Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.ISO15745ProfileContainerTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getISO15745ProfileContainerType()
	 * @generated
	 */
	int ISO15745_PROFILE_CONTAINER_TYPE = 31;

	/**
	 * The feature id for the '<em><b>ISO15745 Profile</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO15745_PROFILE_CONTAINER_TYPE__ISO15745_PROFILE = 0;

	/**
	 * The number of structural features of the '<em>ISO15745 Profile Container Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO15745_PROFILE_CONTAINER_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.ISO15745ProfileTypeImpl <em>ISO15745 Profile Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.ISO15745ProfileTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getISO15745ProfileType()
	 * @generated
	 */
	int ISO15745_PROFILE_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Profile Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO15745_PROFILE_TYPE__PROFILE_HEADER = 0;

	/**
	 * The feature id for the '<em><b>Profile Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO15745_PROFILE_TYPE__PROFILE_BODY = 1;

	/**
	 * The number of structural features of the '<em>ISO15745 Profile Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO15745_PROFILE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.ISO15745ReferenceDataTypeImpl <em>ISO15745 Reference Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.ISO15745ReferenceDataTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getISO15745ReferenceDataType()
	 * @generated
	 */
	int ISO15745_REFERENCE_DATA_TYPE = 33;

	/**
	 * The feature id for the '<em><b>ISO15745 Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO15745_REFERENCE_DATA_TYPE__ISO15745_PART = 0;

	/**
	 * The feature id for the '<em><b>ISO15745 Edition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO15745_REFERENCE_DATA_TYPE__ISO15745_EDITION = 1;

	/**
	 * The feature id for the '<em><b>Profile Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO15745_REFERENCE_DATA_TYPE__PROFILE_TECHNOLOGY = 2;

	/**
	 * The number of structural features of the '<em>ISO15745 Reference Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO15745_REFERENCE_DATA_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.LabelRefTypeImpl <em>Label Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.LabelRefTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getLabelRefType()
	 * @generated
	 */
	int LABEL_REF_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_REF_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Dict ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_REF_TYPE__DICT_ID = 1;

	/**
	 * The feature id for the '<em><b>Text ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_REF_TYPE__TEXT_ID = 2;

	/**
	 * The number of structural features of the '<em>Label Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_REF_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.LabelTypeImpl <em>Label Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.LabelTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getLabelType()
	 * @generated
	 */
	int LABEL_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__LANG = 1;

	/**
	 * The number of structural features of the '<em>Label Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.LEDListTypeImpl <em>LED List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.LEDListTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getLEDListType()
	 * @generated
	 */
	int LED_LIST_TYPE = 36;

	/**
	 * The feature id for the '<em><b>LED</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_LIST_TYPE__LED = 0;

	/**
	 * The feature id for the '<em><b>Combined State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_LIST_TYPE__COMBINED_STATE = 1;

	/**
	 * The number of structural features of the '<em>LED List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_LIST_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.LEDstateRefTypeImpl <em>LE Dstate Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.LEDstateRefTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getLEDstateRefType()
	 * @generated
	 */
	int LE_DSTATE_REF_TYPE = 37;

	/**
	 * The feature id for the '<em><b>State ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_DSTATE_REF_TYPE__STATE_ID_REF = 0;

	/**
	 * The number of structural features of the '<em>LE Dstate Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_DSTATE_REF_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.LEDstateTypeImpl <em>LE Dstate Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.LEDstateTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getLEDstateType()
	 * @generated
	 */
	int LE_DSTATE_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_DSTATE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_DSTATE_TYPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_DSTATE_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_DSTATE_TYPE__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_DSTATE_TYPE__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>Flashing Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_DSTATE_TYPE__FLASHING_PERIOD = 5;

	/**
	 * The feature id for the '<em><b>Impuls Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_DSTATE_TYPE__IMPULS_WIDTH = 6;

	/**
	 * The feature id for the '<em><b>LE Dcolor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_DSTATE_TYPE__LE_DCOLOR = 7;

	/**
	 * The feature id for the '<em><b>Number Of Impulses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_DSTATE_TYPE__NUMBER_OF_IMPULSES = 8;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_DSTATE_TYPE__STATE = 9;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_DSTATE_TYPE__UNIQUE_ID = 10;

	/**
	 * The number of structural features of the '<em>LE Dstate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_DSTATE_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.MaxValueTypeImpl <em>Max Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.MaxValueTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getMaxValueType()
	 * @generated
	 */
	int MAX_VALUE_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_VALUE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_VALUE_TYPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_VALUE_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_VALUE_TYPE__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_VALUE_TYPE__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_VALUE_TYPE__MULTIPLIER = 5;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_VALUE_TYPE__OFFSET = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_VALUE_TYPE__VALUE = 7;

	/**
	 * The number of structural features of the '<em>Max Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_VALUE_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.MemberRefTypeImpl <em>Member Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.MemberRefTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getMemberRefType()
	 * @generated
	 */
	int MEMBER_REF_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_REF_TYPE__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Unique ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_REF_TYPE__UNIQUE_ID_REF = 1;

	/**
	 * The number of structural features of the '<em>Member Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_REF_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.MinValueTypeImpl <em>Min Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.MinValueTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getMinValueType()
	 * @generated
	 */
	int MIN_VALUE_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_VALUE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_VALUE_TYPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_VALUE_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_VALUE_TYPE__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_VALUE_TYPE__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_VALUE_TYPE__MULTIPLIER = 5;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_VALUE_TYPE__OFFSET = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_VALUE_TYPE__VALUE = 7;

	/**
	 * The number of structural features of the '<em>Min Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_VALUE_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.ObjectListTypeImpl <em>Object List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.ObjectListTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getObjectListType()
	 * @generated
	 */
	int OBJECT_LIST_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_LIST_TYPE__OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Mandatory Objects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_LIST_TYPE__MANDATORY_OBJECTS = 1;

	/**
	 * The feature id for the '<em><b>Manufacturer Objects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_LIST_TYPE__MANUFACTURER_OBJECTS = 2;

	/**
	 * The feature id for the '<em><b>Optional Objects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_LIST_TYPE__OPTIONAL_OBJECTS = 3;

	/**
	 * The number of structural features of the '<em>Object List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_LIST_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.OrderNumberTypeImpl <em>Order Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.OrderNumberTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getOrderNumberType()
	 * @generated
	 */
	int ORDER_NUMBER_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_NUMBER_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_NUMBER_TYPE__READ_ONLY = 1;

	/**
	 * The number of structural features of the '<em>Order Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_NUMBER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.OutputVarsTypeImpl <em>Output Vars Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.OutputVarsTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getOutputVarsType()
	 * @generated
	 */
	int OUTPUT_VARS_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Var Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARS_TYPE__VAR_DECLARATION = 0;

	/**
	 * The number of structural features of the '<em>Output Vars Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterRefTypeImpl <em>Parameter Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.ParameterRefTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getParameterRefType()
	 * @generated
	 */
	int PARAMETER_REF_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Actual Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF_TYPE__ACTUAL_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Bit Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF_TYPE__BIT_OFFSET = 1;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF_TYPE__LOCKED = 2;

	/**
	 * The feature id for the '<em><b>Unique ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF_TYPE__UNIQUE_ID_REF = 3;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF_TYPE__VISIBLE = 4;

	/**
	 * The number of structural features of the '<em>Parameter Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>BOOL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__BOOL = 5;

	/**
	 * The feature id for the '<em><b>BITSTRING</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__BITSTRING = 6;

	/**
	 * The feature id for the '<em><b>BYTE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__BYTE = 7;

	/**
	 * The feature id for the '<em><b>CHAR</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__CHAR = 8;

	/**
	 * The feature id for the '<em><b>WORD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__WORD = 9;

	/**
	 * The feature id for the '<em><b>DWORD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__DWORD = 10;

	/**
	 * The feature id for the '<em><b>LWORD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__LWORD = 11;

	/**
	 * The feature id for the '<em><b>SINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__SINT = 12;

	/**
	 * The feature id for the '<em><b>INT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__INT = 13;

	/**
	 * The feature id for the '<em><b>DINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__DINT = 14;

	/**
	 * The feature id for the '<em><b>LINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__LINT = 15;

	/**
	 * The feature id for the '<em><b>USINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__USINT = 16;

	/**
	 * The feature id for the '<em><b>UINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__UINT = 17;

	/**
	 * The feature id for the '<em><b>UDINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__UDINT = 18;

	/**
	 * The feature id for the '<em><b>ULINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__ULINT = 19;

	/**
	 * The feature id for the '<em><b>REAL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__REAL = 20;

	/**
	 * The feature id for the '<em><b>LREAL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__LREAL = 21;

	/**
	 * The feature id for the '<em><b>STRING</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__STRING = 22;

	/**
	 * The feature id for the '<em><b>WSTRING</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__WSTRING = 23;

	/**
	 * The feature id for the '<em><b>Data Type ID Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__DATA_TYPE_ID_REF = 24;

	/**
	 * The feature id for the '<em><b>Variable Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__VARIABLE_REF = 25;

	/**
	 * The feature id for the '<em><b>Conditional Support</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__CONDITIONAL_SUPPORT = 26;

	/**
	 * The feature id for the '<em><b>Denotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__DENOTATION = 27;

	/**
	 * The feature id for the '<em><b>Actual Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__ACTUAL_VALUE = 28;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__DEFAULT_VALUE = 29;

	/**
	 * The feature id for the '<em><b>Substitute Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__SUBSTITUTE_VALUE = 30;

	/**
	 * The feature id for the '<em><b>Allowed Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__ALLOWED_VALUES = 31;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__UNIT = 32;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__PROPERTY = 33;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__ACCESS = 34;

	/**
	 * The feature id for the '<em><b>Access List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__ACCESS_LIST = 35;

	/**
	 * The feature id for the '<em><b>Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__MULTIPLIER = 36;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__OFFSET = 37;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__PERSISTENT = 38;

	/**
	 * The feature id for the '<em><b>Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__SUPPORT = 39;

	/**
	 * The feature id for the '<em><b>Template ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__TEMPLATE_ID_REF = 40;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__UNIQUE_ID = 41;

	/**
	 * The number of structural features of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_FEATURE_COUNT = 42;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.PictureTypeImpl <em>Picture Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.PictureTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getPictureType()
	 * @generated
	 */
	int PICTURE_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_TYPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_TYPE__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_TYPE__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_TYPE__NUMBER = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_TYPE__TYPE = 6;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_TYPE__URI = 7;

	/**
	 * The number of structural features of the '<em>Picture Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.ProductFamilyTypeImpl <em>Product Family Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.ProductFamilyTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getProductFamilyType()
	 * @generated
	 */
	int PRODUCT_FAMILY_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FAMILY_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FAMILY_TYPE__READ_ONLY = 1;

	/**
	 * The number of structural features of the '<em>Product Family Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FAMILY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.ProductNameTypeImpl <em>Product Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.ProductNameTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getProductNameType()
	 * @generated
	 */
	int PRODUCT_NAME_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_NAME_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_NAME_TYPE__READ_ONLY = 1;

	/**
	 * The number of structural features of the '<em>Product Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_NAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.ProductTextTypeImpl <em>Product Text Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.ProductTextTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getProductTextType()
	 * @generated
	 */
	int PRODUCT_TEXT_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TEXT_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TEXT_TYPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TEXT_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TEXT_TYPE__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TEXT_TYPE__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TEXT_TYPE__READ_ONLY = 5;

	/**
	 * The number of structural features of the '<em>Product Text Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TEXT_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyDataTypeImpl <em>Profile Body Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyDataTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getProfileBodyDataType()
	 * @generated
	 */
	int PROFILE_BODY_DATA_TYPE = 52;

	/**
	 * The feature id for the '<em><b>File Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DATA_TYPE__FILE_CREATION_DATE = 0;

	/**
	 * The feature id for the '<em><b>File Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DATA_TYPE__FILE_CREATION_TIME = 1;

	/**
	 * The feature id for the '<em><b>File Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DATA_TYPE__FILE_CREATOR = 2;

	/**
	 * The feature id for the '<em><b>File Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DATA_TYPE__FILE_MODIFICATION_DATE = 3;

	/**
	 * The feature id for the '<em><b>File Modification Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DATA_TYPE__FILE_MODIFICATION_TIME = 4;

	/**
	 * The feature id for the '<em><b>File Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DATA_TYPE__FILE_MODIFIED_BY = 5;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DATA_TYPE__FILE_NAME = 6;

	/**
	 * The feature id for the '<em><b>File Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DATA_TYPE__FILE_VERSION = 7;

	/**
	 * The feature id for the '<em><b>Format Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DATA_TYPE__FORMAT_NAME = 8;

	/**
	 * The feature id for the '<em><b>Format Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DATA_TYPE__FORMAT_VERSION = 9;

	/**
	 * The feature id for the '<em><b>Supported Languages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DATA_TYPE__SUPPORTED_LANGUAGES = 10;

	/**
	 * The number of structural features of the '<em>Profile Body Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DATA_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyCommunicationNetworkPowerlinkImpl <em>Profile Body Communication Network Powerlink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyCommunicationNetworkPowerlinkImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getProfileBodyCommunicationNetworkPowerlink()
	 * @generated
	 */
	int PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK = 51;

	/**
	 * The feature id for the '<em><b>File Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__FILE_CREATION_DATE = PROFILE_BODY_DATA_TYPE__FILE_CREATION_DATE;

	/**
	 * The feature id for the '<em><b>File Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__FILE_CREATION_TIME = PROFILE_BODY_DATA_TYPE__FILE_CREATION_TIME;

	/**
	 * The feature id for the '<em><b>File Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__FILE_CREATOR = PROFILE_BODY_DATA_TYPE__FILE_CREATOR;

	/**
	 * The feature id for the '<em><b>File Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__FILE_MODIFICATION_DATE = PROFILE_BODY_DATA_TYPE__FILE_MODIFICATION_DATE;

	/**
	 * The feature id for the '<em><b>File Modification Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__FILE_MODIFICATION_TIME = PROFILE_BODY_DATA_TYPE__FILE_MODIFICATION_TIME;

	/**
	 * The feature id for the '<em><b>File Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__FILE_MODIFIED_BY = PROFILE_BODY_DATA_TYPE__FILE_MODIFIED_BY;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__FILE_NAME = PROFILE_BODY_DATA_TYPE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>File Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__FILE_VERSION = PROFILE_BODY_DATA_TYPE__FILE_VERSION;

	/**
	 * The feature id for the '<em><b>Format Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__FORMAT_NAME = PROFILE_BODY_DATA_TYPE__FORMAT_NAME;

	/**
	 * The feature id for the '<em><b>Format Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__FORMAT_VERSION = PROFILE_BODY_DATA_TYPE__FORMAT_VERSION;

	/**
	 * The feature id for the '<em><b>Supported Languages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__SUPPORTED_LANGUAGES = PROFILE_BODY_DATA_TYPE__SUPPORTED_LANGUAGES;

	/**
	 * The feature id for the '<em><b>Application Layers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__APPLICATION_LAYERS = PROFILE_BODY_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transport Layers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__TRANSPORT_LAYERS = PROFILE_BODY_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Network Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__NETWORK_MANAGEMENT = PROFILE_BODY_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>External Profile Handle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__EXTERNAL_PROFILE_HANDLE = PROFILE_BODY_DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Specification Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__SPECIFICATION_VERSION = PROFILE_BODY_DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Profile Body Communication Network Powerlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK_FEATURE_COUNT = PROFILE_BODY_DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyDevicePowerlinkImpl <em>Profile Body Device Powerlink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyDevicePowerlinkImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getProfileBodyDevicePowerlink()
	 * @generated
	 */
	int PROFILE_BODY_DEVICE_POWERLINK = 53;

	/**
	 * The feature id for the '<em><b>File Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DEVICE_POWERLINK__FILE_CREATION_DATE = PROFILE_BODY_DATA_TYPE__FILE_CREATION_DATE;

	/**
	 * The feature id for the '<em><b>File Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DEVICE_POWERLINK__FILE_CREATION_TIME = PROFILE_BODY_DATA_TYPE__FILE_CREATION_TIME;

	/**
	 * The feature id for the '<em><b>File Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DEVICE_POWERLINK__FILE_CREATOR = PROFILE_BODY_DATA_TYPE__FILE_CREATOR;

	/**
	 * The feature id for the '<em><b>File Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DEVICE_POWERLINK__FILE_MODIFICATION_DATE = PROFILE_BODY_DATA_TYPE__FILE_MODIFICATION_DATE;

	/**
	 * The feature id for the '<em><b>File Modification Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DEVICE_POWERLINK__FILE_MODIFICATION_TIME = PROFILE_BODY_DATA_TYPE__FILE_MODIFICATION_TIME;

	/**
	 * The feature id for the '<em><b>File Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DEVICE_POWERLINK__FILE_MODIFIED_BY = PROFILE_BODY_DATA_TYPE__FILE_MODIFIED_BY;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DEVICE_POWERLINK__FILE_NAME = PROFILE_BODY_DATA_TYPE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>File Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DEVICE_POWERLINK__FILE_VERSION = PROFILE_BODY_DATA_TYPE__FILE_VERSION;

	/**
	 * The feature id for the '<em><b>Format Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DEVICE_POWERLINK__FORMAT_NAME = PROFILE_BODY_DATA_TYPE__FORMAT_NAME;

	/**
	 * The feature id for the '<em><b>Format Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DEVICE_POWERLINK__FORMAT_VERSION = PROFILE_BODY_DATA_TYPE__FORMAT_VERSION;

	/**
	 * The feature id for the '<em><b>Supported Languages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DEVICE_POWERLINK__SUPPORTED_LANGUAGES = PROFILE_BODY_DATA_TYPE__SUPPORTED_LANGUAGES;

	/**
	 * The feature id for the '<em><b>Device Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DEVICE_POWERLINK__DEVICE_IDENTITY = PROFILE_BODY_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Device Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DEVICE_POWERLINK__DEVICE_MANAGER = PROFILE_BODY_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Device Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DEVICE_POWERLINK__DEVICE_FUNCTION = PROFILE_BODY_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Application Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DEVICE_POWERLINK__APPLICATION_PROCESS = PROFILE_BODY_DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>External Profile Handle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DEVICE_POWERLINK__EXTERNAL_PROFILE_HANDLE = PROFILE_BODY_DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Device Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DEVICE_POWERLINK__DEVICE_CLASS = PROFILE_BODY_DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Specification Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DEVICE_POWERLINK__SPECIFICATION_VERSION = PROFILE_BODY_DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Profile Body Device Powerlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_BODY_DEVICE_POWERLINK_FEATURE_COUNT = PROFILE_BODY_DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileHandleDataTypeImpl <em>Profile Handle Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.ProfileHandleDataTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getProfileHandleDataType()
	 * @generated
	 */
	int PROFILE_HANDLE_DATA_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Profile Identification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_HANDLE_DATA_TYPE__PROFILE_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Profile Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_HANDLE_DATA_TYPE__PROFILE_REVISION = 1;

	/**
	 * The feature id for the '<em><b>Profile Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_HANDLE_DATA_TYPE__PROFILE_LOCATION = 2;

	/**
	 * The number of structural features of the '<em>Profile Handle Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_HANDLE_DATA_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.ProfileHeaderDataTypeImpl <em>Profile Header Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.ProfileHeaderDataTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getProfileHeaderDataType()
	 * @generated
	 */
	int PROFILE_HEADER_DATA_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Profile Identification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_HEADER_DATA_TYPE__PROFILE_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Profile Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_HEADER_DATA_TYPE__PROFILE_REVISION = 1;

	/**
	 * The feature id for the '<em><b>Profile Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_HEADER_DATA_TYPE__PROFILE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Profile Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_HEADER_DATA_TYPE__PROFILE_SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Profile Class ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_HEADER_DATA_TYPE__PROFILE_CLASS_ID = 4;

	/**
	 * The feature id for the '<em><b>Profile Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_HEADER_DATA_TYPE__PROFILE_DATE = 5;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_HEADER_DATA_TYPE__ADDITIONAL_INFORMATION = 6;

	/**
	 * The feature id for the '<em><b>ISO15745 Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_HEADER_DATA_TYPE__ISO15745_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>IAS Interface Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_HEADER_DATA_TYPE__IAS_INTERFACE_TYPE = 8;

	/**
	 * The number of structural features of the '<em>Profile Header Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_HEADER_DATA_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.StandardComplianceListTypeImpl <em>Standard Compliance List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.StandardComplianceListTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getStandardComplianceListType()
	 * @generated
	 */
	int STANDARD_COMPLIANCE_LIST_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Compliant With</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_COMPLIANCE_LIST_TYPE__COMPLIANT_WITH = 0;

	/**
	 * The number of structural features of the '<em>Standard Compliance List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_COMPLIANCE_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.StaticErrorBitFieldTypeImpl <em>Static Error Bit Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.StaticErrorBitFieldTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getStaticErrorBitFieldType()
	 * @generated
	 */
	int STATIC_ERROR_BIT_FIELD_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Error Bit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ERROR_BIT_FIELD_TYPE__ERROR_BIT = 0;

	/**
	 * The number of structural features of the '<em>Static Error Bit Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ERROR_BIT_FIELD_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.StepTypeImpl <em>Step Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.StepTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getStepType()
	 * @generated
	 */
	int STEP_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__MULTIPLIER = 5;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__OFFSET = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__VALUE = 7;

	/**
	 * The number of structural features of the '<em>Step Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.StructTypeImpl <em>Struct Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.StructTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getStructType()
	 * @generated
	 */
	int STRUCT_TYPE = 59;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>Var Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE__VAR_DECLARATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE__NAME = 6;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE__UNIQUE_ID = 7;

	/**
	 * The number of structural features of the '<em>Struct Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.SubObjectTypeImpl <em>Sub Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.SubObjectTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getSubObjectType()
	 * @generated
	 */
	int SUB_OBJECT_TYPE = 60;

	/**
	 * The feature id for the '<em><b>Access Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECT_TYPE__ACCESS_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Actual Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECT_TYPE__ACTUAL_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECT_TYPE__DATA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECT_TYPE__DEFAULT_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Denotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECT_TYPE__DENOTATION = 4;

	/**
	 * The feature id for the '<em><b>High Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECT_TYPE__HIGH_LIMIT = 5;

	/**
	 * The feature id for the '<em><b>Low Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECT_TYPE__LOW_LIMIT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECT_TYPE__NAME = 7;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECT_TYPE__OBJECT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Obj Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECT_TYPE__OBJ_FLAGS = 9;

	/**
	 * The feature id for the '<em><b>PD Omapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECT_TYPE__PD_OMAPPING = 10;

	/**
	 * The feature id for the '<em><b>Sub Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECT_TYPE__SUB_INDEX = 11;

	/**
	 * The feature id for the '<em><b>Unique ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECT_TYPE__UNIQUE_ID_REF = 12;

	/**
	 * The number of structural features of the '<em>Sub Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECT_TYPE_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TAllowedValuesImpl <em>TAllowed Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TAllowedValuesImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTAllowedValues()
	 * @generated
	 */
	int TALLOWED_VALUES = 61;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALLOWED_VALUES__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALLOWED_VALUES__RANGE = 1;

	/**
	 * The feature id for the '<em><b>Template ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALLOWED_VALUES__TEMPLATE_ID_REF = 2;

	/**
	 * The number of structural features of the '<em>TAllowed Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALLOWED_VALUES_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TAllowedValuesTemplateImpl <em>TAllowed Values Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TAllowedValuesTemplateImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTAllowedValuesTemplate()
	 * @generated
	 */
	int TALLOWED_VALUES_TEMPLATE = 62;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALLOWED_VALUES_TEMPLATE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALLOWED_VALUES_TEMPLATE__RANGE = 1;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALLOWED_VALUES_TEMPLATE__UNIQUE_ID = 2;

	/**
	 * The number of structural features of the '<em>TAllowed Values Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALLOWED_VALUES_TEMPLATE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TApplicationLayersImpl <em>TApplication Layers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TApplicationLayersImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTApplicationLayers()
	 * @generated
	 */
	int TAPPLICATION_LAYERS = 63;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLICATION_LAYERS__IDENTITY = 0;

	/**
	 * The feature id for the '<em><b>Data Type List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLICATION_LAYERS__DATA_TYPE_LIST = 1;

	/**
	 * The feature id for the '<em><b>Object List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLICATION_LAYERS__OBJECT_LIST = 2;

	/**
	 * The feature id for the '<em><b>Dynamic Channels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLICATION_LAYERS__DYNAMIC_CHANNELS = 3;

	/**
	 * The feature id for the '<em><b>Communication Entity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLICATION_LAYERS__COMMUNICATION_ENTITY_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Conformance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLICATION_LAYERS__CONFORMANCE_CLASS = 5;

	/**
	 * The number of structural features of the '<em>TApplication Layers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLICATION_LAYERS_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TApplicationProcessImpl <em>TApplication Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TApplicationProcessImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTApplicationProcess()
	 * @generated
	 */
	int TAPPLICATION_PROCESS = 64;

	/**
	 * The feature id for the '<em><b>Data Type List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLICATION_PROCESS__DATA_TYPE_LIST = 0;

	/**
	 * The feature id for the '<em><b>Function Type List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLICATION_PROCESS__FUNCTION_TYPE_LIST = 1;

	/**
	 * The feature id for the '<em><b>Function Instance List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLICATION_PROCESS__FUNCTION_INSTANCE_LIST = 2;

	/**
	 * The feature id for the '<em><b>Template List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLICATION_PROCESS__TEMPLATE_LIST = 3;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLICATION_PROCESS__PARAMETER_LIST = 4;

	/**
	 * The feature id for the '<em><b>Parameter Group List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLICATION_PROCESS__PARAMETER_GROUP_LIST = 5;

	/**
	 * The number of structural features of the '<em>TApplication Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLICATION_PROCESS_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TCapabilitiesImpl <em>TCapabilities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TCapabilitiesImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTCapabilities()
	 * @generated
	 */
	int TCAPABILITIES = 65;

	/**
	 * The feature id for the '<em><b>Characteristics List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITIES__CHARACTERISTICS_LIST = 0;

	/**
	 * The feature id for the '<em><b>Standard Compliance List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITIES__STANDARD_COMPLIANCE_LIST = 1;

	/**
	 * The number of structural features of the '<em>TCapabilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITIES_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TClassificationListImpl <em>TClassification List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TClassificationListImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTClassificationList()
	 * @generated
	 */
	int TCLASSIFICATION_LIST = 66;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASSIFICATION_LIST__CLASSIFICATION = 0;

	/**
	 * The number of structural features of the '<em>TClassification List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASSIFICATION_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TCNFeaturesImpl <em>TCN Features</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TCNFeaturesImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTCNFeatures()
	 * @generated
	 */
	int TCN_FEATURES = 67;

	/**
	 * The feature id for the '<em><b>DLLCN Feature Multiplex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCN_FEATURES__DLLCN_FEATURE_MULTIPLEX = 0;

	/**
	 * The feature id for the '<em><b>DLLCNP Res Chaining</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCN_FEATURES__DLLCNP_RES_CHAINING = 1;

	/**
	 * The feature id for the '<em><b>NMTCNDNA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCN_FEATURES__NMTCNDNA = 2;

	/**
	 * The feature id for the '<em><b>NMTCN Max AInv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCN_FEATURES__NMTCN_MAX_AINV = 3;

	/**
	 * The feature id for the '<em><b>NMTCN Pre Op2 To Ready2 Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCN_FEATURES__NMTCN_PRE_OP2_TO_READY2_OP = 4;

	/**
	 * The feature id for the '<em><b>NMTCN Set Node Number Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCN_FEATURES__NMTCN_SET_NODE_NUMBER_TIME = 5;

	/**
	 * The feature id for the '<em><b>NMTCN So C2P Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCN_FEATURES__NMTCN_SO_C2P_REQ = 6;

	/**
	 * The number of structural features of the '<em>TCN Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCN_FEATURES_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TCombinedStateImpl <em>TCombined State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TCombinedStateImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTCombinedState()
	 * @generated
	 */
	int TCOMBINED_STATE = 68;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMBINED_STATE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMBINED_STATE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMBINED_STATE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMBINED_STATE__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMBINED_STATE__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>LE Dstate Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMBINED_STATE__LE_DSTATE_REF = 5;

	/**
	 * The number of structural features of the '<em>TCombined State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMBINED_STATE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TConditionalSupportImpl <em>TConditional Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TConditionalSupportImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTConditionalSupport()
	 * @generated
	 */
	int TCONDITIONAL_SUPPORT = 69;

	/**
	 * The feature id for the '<em><b>Param ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITIONAL_SUPPORT__PARAM_ID_REF = 0;

	/**
	 * The number of structural features of the '<em>TConditional Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITIONAL_SUPPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TConnectorListImpl <em>TConnector List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TConnectorListImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTConnectorList()
	 * @generated
	 */
	int TCONNECTOR_LIST = 70;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONNECTOR_LIST__CONNECTOR = 0;

	/**
	 * The number of structural features of the '<em>TConnector List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONNECTOR_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TCountImpl <em>TCount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TCountImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTCount()
	 * @generated
	 */
	int TCOUNT = 71;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT__DEFAULT_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Allowed Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT__ALLOWED_VALUES = 6;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT__ACCESS = 7;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT__UNIQUE_ID = 8;

	/**
	 * The number of structural features of the '<em>TCount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TDataTypeIDRefImpl <em>TData Type ID Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TDataTypeIDRefImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTDataTypeIDRef()
	 * @generated
	 */
	int TDATA_TYPE_ID_REF = 72;

	/**
	 * The feature id for the '<em><b>Unique ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPE_ID_REF__UNIQUE_ID_REF = 0;

	/**
	 * The number of structural features of the '<em>TData Type ID Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPE_ID_REF_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TDataTypeListImpl <em>TData Type List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TDataTypeListImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTDataTypeList()
	 * @generated
	 */
	int TDATA_TYPE_LIST = 73;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPE_LIST__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPE_LIST__ARRAY = 1;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPE_LIST__STRUCT = 2;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPE_LIST__ENUM = 3;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPE_LIST__DERIVED = 4;

	/**
	 * The number of structural features of the '<em>TData Type List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPE_LIST_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TDataTypesImpl <em>TData Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TDataTypesImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTDataTypes()
	 * @generated
	 */
	int TDATA_TYPES = 74;

	/**
	 * The feature id for the '<em><b>Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPES__BOOLEAN = 0;

	/**
	 * The feature id for the '<em><b>Integer8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPES__INTEGER8 = 1;

	/**
	 * The feature id for the '<em><b>Integer16</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPES__INTEGER16 = 2;

	/**
	 * The feature id for the '<em><b>Integer32</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPES__INTEGER32 = 3;

	/**
	 * The feature id for the '<em><b>Integer24</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPES__INTEGER24 = 4;

	/**
	 * The feature id for the '<em><b>Integer40</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPES__INTEGER40 = 5;

	/**
	 * The feature id for the '<em><b>Integer48</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPES__INTEGER48 = 6;

	/**
	 * The feature id for the '<em><b>Integer56</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPES__INTEGER56 = 7;

	/**
	 * The feature id for the '<em><b>Integer64</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPES__INTEGER64 = 8;

	/**
	 * The feature id for the '<em><b>Unsigned8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPES__UNSIGNED8 = 9;

	/**
	 * The feature id for the '<em><b>Unsigned16</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPES__UNSIGNED16 = 10;

	/**
	 * The feature id for the '<em><b>Unsigned32</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPES__UNSIGNED32 = 11;

	/**
	 * The feature id for the '<em><b>Unsigned24</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPES__UNSIGNED24 = 12;

	/**
	 * The feature id for the '<em><b>Unsigned40</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPES__UNSIGNED40 = 13;

	/**
	 * The feature id for the '<em><b>Unsigned48</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPES__UNSIGNED48 = 14;

	/**
	 * The feature id for the '<em><b>Unsigned56</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPES__UNSIGNED56 = 15;

	/**
	 * The feature id for the '<em><b>Unsigned64</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPES__UNSIGNED64 = 16;

	/**
	 * The feature id for the '<em><b>Real32</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPES__REAL32 = 17;

	/**
	 * The feature id for the '<em><b>Real64</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPES__REAL64 = 18;

	/**
	 * The feature id for the '<em><b>Visible String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPES__VISIBLE_STRING = 19;

	/**
	 * The feature id for the '<em><b>Octet String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPES__OCTET_STRING = 20;

	/**
	 * The feature id for the '<em><b>Unicode String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPES__UNICODE_STRING = 21;

	/**
	 * The feature id for the '<em><b>Time Of Day</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPES__TIME_OF_DAY = 22;

	/**
	 * The feature id for the '<em><b>Time Diff</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPES__TIME_DIFF = 23;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPES__DOMAIN = 24;

	/**
	 * The feature id for the '<em><b>MACADDRESS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPES__MACADDRESS = 25;

	/**
	 * The feature id for the '<em><b>IPADDRESS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPES__IPADDRESS = 26;

	/**
	 * The feature id for the '<em><b>NETTIME</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPES__NETTIME = 27;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPES__DATA_TYPE = 28;

	/**
	 * The number of structural features of the '<em>TData Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPES_FEATURE_COUNT = 29;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TDenotationImpl <em>TDenotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TDenotationImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTDenotation()
	 * @generated
	 */
	int TDENOTATION = 75;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDENOTATION__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDENOTATION__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDENOTATION__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDENOTATION__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDENOTATION__DESCRIPTION_REF = 4;

	/**
	 * The number of structural features of the '<em>TDenotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDENOTATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceCommissioningImpl <em>TDevice Commissioning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TDeviceCommissioningImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTDeviceCommissioning()
	 * @generated
	 */
	int TDEVICE_COMMISSIONING = 76;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_COMMISSIONING__NETWORK_NAME = 0;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_COMMISSIONING__NODE_ID = 1;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_COMMISSIONING__NODE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_COMMISSIONING__NODE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Used Network Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_COMMISSIONING__USED_NETWORK_INTERFACE = 4;

	/**
	 * The number of structural features of the '<em>TDevice Commissioning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_COMMISSIONING_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceFamilyImpl <em>TDevice Family</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TDeviceFamilyImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTDeviceFamily()
	 * @generated
	 */
	int TDEVICE_FAMILY = 77;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_FAMILY__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_FAMILY__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_FAMILY__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_FAMILY__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_FAMILY__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_FAMILY__READ_ONLY = 5;

	/**
	 * The number of structural features of the '<em>TDevice Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_FAMILY_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceFunctionImpl <em>TDevice Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TDeviceFunctionImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTDeviceFunction()
	 * @generated
	 */
	int TDEVICE_FUNCTION = 78;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_FUNCTION__CAPABILITIES = 0;

	/**
	 * The feature id for the '<em><b>Pictures List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_FUNCTION__PICTURES_LIST = 1;

	/**
	 * The feature id for the '<em><b>Dictionary List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_FUNCTION__DICTIONARY_LIST = 2;

	/**
	 * The feature id for the '<em><b>Connector List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_FUNCTION__CONNECTOR_LIST = 3;

	/**
	 * The feature id for the '<em><b>Firmware List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_FUNCTION__FIRMWARE_LIST = 4;

	/**
	 * The feature id for the '<em><b>Classification List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_FUNCTION__CLASSIFICATION_LIST = 5;

	/**
	 * The number of structural features of the '<em>TDevice Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_FUNCTION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceIdentityImpl <em>TDevice Identity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TDeviceIdentityImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTDeviceIdentity()
	 * @generated
	 */
	int TDEVICE_IDENTITY = 79;

	/**
	 * The feature id for the '<em><b>Vendor Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_IDENTITY__VENDOR_NAME = 0;

	/**
	 * The feature id for the '<em><b>Vendor ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_IDENTITY__VENDOR_ID = 1;

	/**
	 * The feature id for the '<em><b>Vendor Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_IDENTITY__VENDOR_TEXT = 2;

	/**
	 * The feature id for the '<em><b>Device Family</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_IDENTITY__DEVICE_FAMILY = 3;

	/**
	 * The feature id for the '<em><b>Product Family</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_IDENTITY__PRODUCT_FAMILY = 4;

	/**
	 * The feature id for the '<em><b>Product Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_IDENTITY__PRODUCT_NAME = 5;

	/**
	 * The feature id for the '<em><b>Product ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_IDENTITY__PRODUCT_ID = 6;

	/**
	 * The feature id for the '<em><b>Product Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_IDENTITY__PRODUCT_TEXT = 7;

	/**
	 * The feature id for the '<em><b>Order Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_IDENTITY__ORDER_NUMBER = 8;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_IDENTITY__VERSION = 9;

	/**
	 * The feature id for the '<em><b>Build Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_IDENTITY__BUILD_DATE = 10;

	/**
	 * The feature id for the '<em><b>Specification Revision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_IDENTITY__SPECIFICATION_REVISION = 11;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_IDENTITY__INSTANCE_NAME = 12;

	/**
	 * The number of structural features of the '<em>TDevice Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_IDENTITY_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceManagerImpl <em>TDevice Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TDeviceManagerImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTDeviceManager()
	 * @generated
	 */
	int TDEVICE_MANAGER = 80;

	/**
	 * The feature id for the '<em><b>Indicator List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_MANAGER__INDICATOR_LIST = 0;

	/**
	 * The number of structural features of the '<em>TDevice Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEVICE_MANAGER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TDiagnosticImpl <em>TDiagnostic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TDiagnosticImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTDiagnostic()
	 * @generated
	 */
	int TDIAGNOSTIC = 81;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDIAGNOSTIC__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Error List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDIAGNOSTIC__ERROR_LIST = 1;

	/**
	 * The feature id for the '<em><b>Static Error Bit Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDIAGNOSTIC__STATIC_ERROR_BIT_FIELD = 2;

	/**
	 * The number of structural features of the '<em>TDiagnostic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDIAGNOSTIC_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TDictionaryListImpl <em>TDictionary List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TDictionaryListImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTDictionaryList()
	 * @generated
	 */
	int TDICTIONARY_LIST = 82;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDICTIONARY_LIST__DICTIONARY = 0;

	/**
	 * The number of structural features of the '<em>TDictionary List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDICTIONARY_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TDynamicChannelImpl <em>TDynamic Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TDynamicChannelImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTDynamicChannel()
	 * @generated
	 */
	int TDYNAMIC_CHANNEL = 83;

	/**
	 * The feature id for the '<em><b>Access Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDYNAMIC_CHANNEL__ACCESS_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Address Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDYNAMIC_CHANNEL__ADDRESS_OFFSET = 1;

	/**
	 * The feature id for the '<em><b>Bit Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDYNAMIC_CHANNEL__BIT_ALIGNMENT = 2;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDYNAMIC_CHANNEL__DATA_TYPE = 3;

	/**
	 * The feature id for the '<em><b>End Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDYNAMIC_CHANNEL__END_INDEX = 4;

	/**
	 * The feature id for the '<em><b>Max Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDYNAMIC_CHANNEL__MAX_NUMBER = 5;

	/**
	 * The feature id for the '<em><b>Start Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDYNAMIC_CHANNEL__START_INDEX = 6;

	/**
	 * The number of structural features of the '<em>TDynamic Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDYNAMIC_CHANNEL_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TEnumValueImpl <em>TEnum Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TEnumValueImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTEnumValue()
	 * @generated
	 */
	int TENUM_VALUE = 84;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_VALUE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_VALUE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_VALUE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_VALUE__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_VALUE__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_VALUE__VALUE = 5;

	/**
	 * The number of structural features of the '<em>TEnum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_VALUE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TextEntryTypeImpl <em>Text Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TextEntryTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTextEntryType()
	 * @generated
	 */
	int TEXT_ENTRY_TYPE = 85;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ENTRY_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Text ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ENTRY_TYPE__TEXT_ID = 1;

	/**
	 * The number of structural features of the '<em>Text Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ENTRY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TextResourceTypeImpl <em>Text Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TextResourceTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTextResourceType()
	 * @generated
	 */
	int TEXT_RESOURCE_TYPE = 86;

	/**
	 * The feature id for the '<em><b>Text Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RESOURCE_TYPE__TEXT_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RESOURCE_TYPE__LANG = 1;

	/**
	 * The number of structural features of the '<em>Text Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RESOURCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TFirmwareListImpl <em>TFirmware List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TFirmwareListImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTFirmwareList()
	 * @generated
	 */
	int TFIRMWARE_LIST = 87;

	/**
	 * The feature id for the '<em><b>Firmware</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIRMWARE_LIST__FIRMWARE = 0;

	/**
	 * The number of structural features of the '<em>TFirmware List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIRMWARE_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TFunctionInstanceListImpl <em>TFunction Instance List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TFunctionInstanceListImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTFunctionInstanceList()
	 * @generated
	 */
	int TFUNCTION_INSTANCE_LIST = 88;

	/**
	 * The feature id for the '<em><b>Function Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_INSTANCE_LIST__FUNCTION_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_INSTANCE_LIST__CONNECTION = 1;

	/**
	 * The number of structural features of the '<em>TFunction Instance List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_INSTANCE_LIST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TFunctionTypeListImpl <em>TFunction Type List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TFunctionTypeListImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTFunctionTypeList()
	 * @generated
	 */
	int TFUNCTION_TYPE_LIST = 89;

	/**
	 * The feature id for the '<em><b>Function Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_TYPE_LIST__FUNCTION_TYPE = 0;

	/**
	 * The number of structural features of the '<em>TFunction Type List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_TYPE_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl <em>TGeneral Features</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TGeneralFeaturesImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTGeneralFeatures()
	 * @generated
	 */
	int TGENERAL_FEATURES = 90;

	/**
	 * The feature id for the '<em><b>CFM Config Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__CFM_CONFIG_MANAGER = 0;

	/**
	 * The feature id for the '<em><b>DLL Err Bad Phys Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__DLL_ERR_BAD_PHYS_MODE = 1;

	/**
	 * The feature id for the '<em><b>DLL Err Mac Buffer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__DLL_ERR_MAC_BUFFER = 2;

	/**
	 * The feature id for the '<em><b>DLL Feature CN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__DLL_FEATURE_CN = 3;

	/**
	 * The feature id for the '<em><b>DLL Feature MN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__DLL_FEATURE_MN = 4;

	/**
	 * The feature id for the '<em><b>DLL Multiple PReq PRes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__DLL_MULTIPLE_PREQ_PRES = 5;

	/**
	 * The feature id for the '<em><b>NMT Boot Time Not Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NMT_BOOT_TIME_NOT_ACTIVE = 6;

	/**
	 * The feature id for the '<em><b>NMT Cycle Time Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NMT_CYCLE_TIME_GRANULARITY = 7;

	/**
	 * The feature id for the '<em><b>NMT Cycle Time Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NMT_CYCLE_TIME_MAX = 8;

	/**
	 * The feature id for the '<em><b>NMT Cycle Time Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NMT_CYCLE_TIME_MIN = 9;

	/**
	 * The feature id for the '<em><b>NMT Emergency Queue Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NMT_EMERGENCY_QUEUE_SIZE = 10;

	/**
	 * The feature id for the '<em><b>NMT Error Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NMT_ERROR_ENTRIES = 11;

	/**
	 * The feature id for the '<em><b>NMT Ext Nmt Cmds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NMT_EXT_NMT_CMDS = 12;

	/**
	 * The feature id for the '<em><b>NMT Flush Arp Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NMT_FLUSH_ARP_ENTRY = 13;

	/**
	 * The feature id for the '<em><b>NMT Isochronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NMT_ISOCHRONOUS = 14;

	/**
	 * The feature id for the '<em><b>NMT Max CN Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NMT_MAX_CN_NODE_ID = 15;

	/**
	 * The feature id for the '<em><b>NMT Max CN Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NMT_MAX_CN_NUMBER = 16;

	/**
	 * The feature id for the '<em><b>NMT Max Heartbeats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NMT_MAX_HEARTBEATS = 17;

	/**
	 * The feature id for the '<em><b>NMT Min Red Cycle Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NMT_MIN_RED_CYCLE_TIME = 18;

	/**
	 * The feature id for the '<em><b>NMT Net Host Name Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NMT_NET_HOST_NAME_SET = 19;

	/**
	 * The feature id for the '<em><b>NMT Node ID By HW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NMT_NODE_ID_BY_HW = 20;

	/**
	 * The feature id for the '<em><b>NMT Node ID By SW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NMT_NODE_ID_BY_SW = 21;

	/**
	 * The feature id for the '<em><b>NMT Product Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NMT_PRODUCT_CODE = 22;

	/**
	 * The feature id for the '<em><b>NMT Publish Active Nodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NMT_PUBLISH_ACTIVE_NODES = 23;

	/**
	 * The feature id for the '<em><b>NMT Publish Config Nodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NMT_PUBLISH_CONFIG_NODES = 24;

	/**
	 * The feature id for the '<em><b>NMT Publish Emergency New</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NMT_PUBLISH_EMERGENCY_NEW = 25;

	/**
	 * The feature id for the '<em><b>NMT Publish Node State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NMT_PUBLISH_NODE_STATE = 26;

	/**
	 * The feature id for the '<em><b>NMT Publish Operational</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NMT_PUBLISH_OPERATIONAL = 27;

	/**
	 * The feature id for the '<em><b>NMT Publish Pre Op1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NMT_PUBLISH_PRE_OP1 = 28;

	/**
	 * The feature id for the '<em><b>NMT Publish Pre Op2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NMT_PUBLISH_PRE_OP2 = 29;

	/**
	 * The feature id for the '<em><b>NMT Publish Ready To Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NMT_PUBLISH_READY_TO_OP = 30;

	/**
	 * The feature id for the '<em><b>NMT Publish Stopped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NMT_PUBLISH_STOPPED = 31;

	/**
	 * The feature id for the '<em><b>NMT Publish Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NMT_PUBLISH_TIME = 32;

	/**
	 * The feature id for the '<em><b>NMT Revision No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NMT_REVISION_NO = 33;

	/**
	 * The feature id for the '<em><b>NWL Forward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NWL_FORWARD = 34;

	/**
	 * The feature id for the '<em><b>NWLICMP Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NWLICMP_SUPPORT = 35;

	/**
	 * The feature id for the '<em><b>NWLIP Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__NWLIP_SUPPORT = 36;

	/**
	 * The feature id for the '<em><b>PDO Dynamic Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__PDO_DYNAMIC_MAPPING = 37;

	/**
	 * The feature id for the '<em><b>PDO Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__PDO_GRANULARITY = 38;

	/**
	 * The feature id for the '<em><b>PDO Max Descr Mem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__PDO_MAX_DESCR_MEM = 39;

	/**
	 * The feature id for the '<em><b>PDORPDO Channel Objects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__PDORPDO_CHANNEL_OBJECTS = 40;

	/**
	 * The feature id for the '<em><b>PDORPDO Channels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__PDORPDO_CHANNELS = 41;

	/**
	 * The feature id for the '<em><b>PDORPDO Cycle Data Lim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__PDORPDO_CYCLE_DATA_LIM = 42;

	/**
	 * The feature id for the '<em><b>PDORPDO Overall Objects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__PDORPDO_OVERALL_OBJECTS = 43;

	/**
	 * The feature id for the '<em><b>PDO Self Receipt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__PDO_SELF_RECEIPT = 44;

	/**
	 * The feature id for the '<em><b>PDOTPDO Channel Objects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__PDOTPDO_CHANNEL_OBJECTS = 45;

	/**
	 * The feature id for the '<em><b>PDOTPDO Cycle Data Lim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__PDOTPDO_CYCLE_DATA_LIM = 46;

	/**
	 * The feature id for the '<em><b>PDOTPDO Overall Objects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__PDOTPDO_OVERALL_OBJECTS = 47;

	/**
	 * The feature id for the '<em><b>PHY Ext EPL Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__PHY_EXT_EPL_PORTS = 48;

	/**
	 * The feature id for the '<em><b>PHY Hub Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__PHY_HUB_DELAY = 49;

	/**
	 * The feature id for the '<em><b>PHY Hub Integrated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__PHY_HUB_INTEGRATED = 50;

	/**
	 * The feature id for the '<em><b>PHY Hub Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__PHY_HUB_JITTER = 51;

	/**
	 * The feature id for the '<em><b>RT1RT1 Security Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__RT1RT1_SECURITY_SUPPORT = 52;

	/**
	 * The feature id for the '<em><b>RT1RT1 Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__RT1RT1_SUPPORT = 53;

	/**
	 * The feature id for the '<em><b>RT2RT2 Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__RT2RT2_SUPPORT = 54;

	/**
	 * The feature id for the '<em><b>SDO Client</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__SDO_CLIENT = 55;

	/**
	 * The feature id for the '<em><b>SDO Cmd File Read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__SDO_CMD_FILE_READ = 56;

	/**
	 * The feature id for the '<em><b>SDO Cmd File Write</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__SDO_CMD_FILE_WRITE = 57;

	/**
	 * The feature id for the '<em><b>SDO Cmd Link Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__SDO_CMD_LINK_NAME = 58;

	/**
	 * The feature id for the '<em><b>SDO Cmd Read All By Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__SDO_CMD_READ_ALL_BY_INDEX = 59;

	/**
	 * The feature id for the '<em><b>SDO Cmd Read By Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__SDO_CMD_READ_BY_NAME = 60;

	/**
	 * The feature id for the '<em><b>SDO Cmd Read Mult Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__SDO_CMD_READ_MULT_PARAM = 61;

	/**
	 * The feature id for the '<em><b>SDO Cmd Write All By Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__SDO_CMD_WRITE_ALL_BY_INDEX = 62;

	/**
	 * The feature id for the '<em><b>SDO Cmd Write By Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__SDO_CMD_WRITE_BY_NAME = 63;

	/**
	 * The feature id for the '<em><b>SDO Cmd Write Mult Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__SDO_CMD_WRITE_MULT_PARAM = 64;

	/**
	 * The feature id for the '<em><b>SDO Max Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__SDO_MAX_CONNECTIONS = 65;

	/**
	 * The feature id for the '<em><b>SDO Max Parallel Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__SDO_MAX_PARALLEL_CONNECTIONS = 66;

	/**
	 * The feature id for the '<em><b>SDO Seq Layer Tx History Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__SDO_SEQ_LAYER_TX_HISTORY_SIZE = 67;

	/**
	 * The feature id for the '<em><b>SDO Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__SDO_SERVER = 68;

	/**
	 * The feature id for the '<em><b>SDO Support ASnd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__SDO_SUPPORT_ASND = 69;

	/**
	 * The feature id for the '<em><b>SDO Support PDO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__SDO_SUPPORT_PDO = 70;

	/**
	 * The feature id for the '<em><b>SDO Support Udp Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES__SDO_SUPPORT_UDP_IP = 71;

	/**
	 * The number of structural features of the '<em>TGeneral Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_FEATURES_FEATURE_COUNT = 72;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TIndicatorListImpl <em>TIndicator List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TIndicatorListImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTIndicatorList()
	 * @generated
	 */
	int TINDICATOR_LIST = 91;

	/**
	 * The feature id for the '<em><b>LED List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINDICATOR_LIST__LED_LIST = 0;

	/**
	 * The number of structural features of the '<em>TIndicator List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINDICATOR_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TLEDImpl <em>TLED</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TLEDImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTLED()
	 * @generated
	 */
	int TLED = 92;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLED__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLED__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLED__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLED__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLED__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>LE Dstate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLED__LE_DSTATE = 5;

	/**
	 * The feature id for the '<em><b>LE Dcolors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLED__LE_DCOLORS = 6;

	/**
	 * The feature id for the '<em><b>LE Dtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLED__LE_DTYPE = 7;

	/**
	 * The number of structural features of the '<em>TLED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLED_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TMNFeaturesImpl <em>TMN Features</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TMNFeaturesImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTMNFeatures()
	 * @generated
	 */
	int TMN_FEATURES = 93;

	/**
	 * The feature id for the '<em><b>DLL Err MN Multiple MN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMN_FEATURES__DLL_ERR_MN_MULTIPLE_MN = 0;

	/**
	 * The feature id for the '<em><b>DLLMN Feature Multiplex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMN_FEATURES__DLLMN_FEATURE_MULTIPLEX = 1;

	/**
	 * The feature id for the '<em><b>DLLMN Feature PRes Tx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMN_FEATURES__DLLMN_FEATURE_PRES_TX = 2;

	/**
	 * The feature id for the '<em><b>DLLMNP Res Chaining</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMN_FEATURES__DLLMNP_RES_CHAINING = 3;

	/**
	 * The feature id for the '<em><b>DLLMN Ring Redundancy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMN_FEATURES__DLLMN_RING_REDUNDANCY = 4;

	/**
	 * The feature id for the '<em><b>NMTMNA Snd2 So C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMN_FEATURES__NMTMNA_SND2_SO_C = 5;

	/**
	 * The feature id for the '<em><b>NMTMN Basic Ethernet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMN_FEATURES__NMTMN_BASIC_ETHERNET = 6;

	/**
	 * The feature id for the '<em><b>NMTMNDNA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMN_FEATURES__NMTMNDNA = 7;

	/**
	 * The feature id for the '<em><b>NMTMN Max Asynchronous Slots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMN_FEATURES__NMTMN_MAX_ASYNCHRONOUS_SLOTS = 8;

	/**
	 * The feature id for the '<em><b>NMTMN Multipl Cyc Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMN_FEATURES__NMTMN_MULTIPL_CYC_MAX = 9;

	/**
	 * The feature id for the '<em><b>NMTMNP Res2 PReq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMN_FEATURES__NMTMNP_RES2_PREQ = 10;

	/**
	 * The feature id for the '<em><b>NMTMNP Res2 PRes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMN_FEATURES__NMTMNP_RES2_PRES = 11;

	/**
	 * The feature id for the '<em><b>NMTMNP Res Rx2 So A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMN_FEATURES__NMTMNP_RES_RX2_SO_A = 12;

	/**
	 * The feature id for the '<em><b>NMTMNP Res Tx2 So A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMN_FEATURES__NMTMNP_RES_TX2_SO_A = 13;

	/**
	 * The feature id for the '<em><b>NMTMN Redundancy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMN_FEATURES__NMTMN_REDUNDANCY = 14;

	/**
	 * The feature id for the '<em><b>NMTMN So A2A Snd Tx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMN_FEATURES__NMTMN_SO_A2A_SND_TX = 15;

	/**
	 * The feature id for the '<em><b>NMTMN So C2P Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMN_FEATURES__NMTMN_SO_C2P_REQ = 16;

	/**
	 * The feature id for the '<em><b>NMT Net Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMN_FEATURES__NMT_NET_TIME = 17;

	/**
	 * The feature id for the '<em><b>NMT Net Time Is Real Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMN_FEATURES__NMT_NET_TIME_IS_REAL_TIME = 18;

	/**
	 * The feature id for the '<em><b>NMT Relative Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMN_FEATURES__NMT_RELATIVE_TIME = 19;

	/**
	 * The feature id for the '<em><b>NMT Service Udp Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMN_FEATURES__NMT_SERVICE_UDP_IP = 20;

	/**
	 * The feature id for the '<em><b>NMT Simple Boot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMN_FEATURES__NMT_SIMPLE_BOOT = 21;

	/**
	 * The feature id for the '<em><b>PDOTPDO Channels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMN_FEATURES__PDOTPDO_CHANNELS = 22;

	/**
	 * The number of structural features of the '<em>TMN Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMN_FEATURES_FEATURE_COUNT = 23;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TNetworkManagementImpl <em>TNetwork Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TNetworkManagementImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTNetworkManagement()
	 * @generated
	 */
	int TNETWORK_MANAGEMENT = 94;

	/**
	 * The feature id for the '<em><b>General Features</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNETWORK_MANAGEMENT__GENERAL_FEATURES = 0;

	/**
	 * The feature id for the '<em><b>MN Features</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNETWORK_MANAGEMENT__MN_FEATURES = 1;

	/**
	 * The feature id for the '<em><b>CN Features</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNETWORK_MANAGEMENT__CN_FEATURES = 2;

	/**
	 * The feature id for the '<em><b>Device Commissioning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNETWORK_MANAGEMENT__DEVICE_COMMISSIONING = 3;

	/**
	 * The feature id for the '<em><b>Diagnostic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNETWORK_MANAGEMENT__DIAGNOSTIC = 4;

	/**
	 * The number of structural features of the '<em>TNetwork Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNETWORK_MANAGEMENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TObjectImpl <em>TObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TObjectImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTObject()
	 * @generated
	 */
	int TOBJECT = 95;

	/**
	 * The feature id for the '<em><b>Sub Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOBJECT__SUB_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Access Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOBJECT__ACCESS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Actual Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOBJECT__ACTUAL_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOBJECT__DATA_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOBJECT__DEFAULT_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Denotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOBJECT__DENOTATION = 5;

	/**
	 * The feature id for the '<em><b>High Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOBJECT__HIGH_LIMIT = 6;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOBJECT__INDEX = 7;

	/**
	 * The feature id for the '<em><b>Low Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOBJECT__LOW_LIMIT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOBJECT__NAME = 9;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOBJECT__OBJECT_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Obj Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOBJECT__OBJ_FLAGS = 11;

	/**
	 * The feature id for the '<em><b>PD Omapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOBJECT__PD_OMAPPING = 12;

	/**
	 * The feature id for the '<em><b>Sub Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOBJECT__SUB_NUMBER = 13;

	/**
	 * The feature id for the '<em><b>Unique ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOBJECT__UNIQUE_ID_REF = 14;

	/**
	 * The number of structural features of the '<em>TObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOBJECT_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TParameterGroupImpl <em>TParameter Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TParameterGroupImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTParameterGroup()
	 * @generated
	 */
	int TPARAMETER_GROUP = 96;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_GROUP__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_GROUP__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_GROUP__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_GROUP__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_GROUP__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>Group1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_GROUP__GROUP1 = 5;

	/**
	 * The feature id for the '<em><b>Parameter Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_GROUP__PARAMETER_GROUP = 6;

	/**
	 * The feature id for the '<em><b>Parameter Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_GROUP__PARAMETER_REF = 7;

	/**
	 * The feature id for the '<em><b>Bit Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_GROUP__BIT_OFFSET = 8;

	/**
	 * The feature id for the '<em><b>Conditional Unique ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_GROUP__CONDITIONAL_UNIQUE_ID_REF = 9;

	/**
	 * The feature id for the '<em><b>Conditional Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_GROUP__CONDITIONAL_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Config Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_GROUP__CONFIG_PARAMETER = 11;

	/**
	 * The feature id for the '<em><b>Group Level Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_GROUP__GROUP_LEVEL_VISIBLE = 12;

	/**
	 * The feature id for the '<em><b>Kind Of Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_GROUP__KIND_OF_ACCESS = 13;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_GROUP__UNIQUE_ID = 14;

	/**
	 * The number of structural features of the '<em>TParameter Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_GROUP_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TParameterGroupListImpl <em>TParameter Group List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TParameterGroupListImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTParameterGroupList()
	 * @generated
	 */
	int TPARAMETER_GROUP_LIST = 97;

	/**
	 * The feature id for the '<em><b>Parameter Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_GROUP_LIST__PARAMETER_GROUP = 0;

	/**
	 * The number of structural features of the '<em>TParameter Group List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_GROUP_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TParameterListImpl <em>TParameter List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TParameterListImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTParameterList()
	 * @generated
	 */
	int TPARAMETER_LIST = 98;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_LIST__PARAMETER = 0;

	/**
	 * The number of structural features of the '<em>TParameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TParameterTemplateImpl <em>TParameter Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TParameterTemplateImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTParameterTemplate()
	 * @generated
	 */
	int TPARAMETER_TEMPLATE = 99;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>BOOL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__BOOL = 5;

	/**
	 * The feature id for the '<em><b>BITSTRING</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__BITSTRING = 6;

	/**
	 * The feature id for the '<em><b>BYTE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__BYTE = 7;

	/**
	 * The feature id for the '<em><b>CHAR</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__CHAR = 8;

	/**
	 * The feature id for the '<em><b>WORD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__WORD = 9;

	/**
	 * The feature id for the '<em><b>DWORD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__DWORD = 10;

	/**
	 * The feature id for the '<em><b>LWORD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__LWORD = 11;

	/**
	 * The feature id for the '<em><b>SINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__SINT = 12;

	/**
	 * The feature id for the '<em><b>INT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__INT = 13;

	/**
	 * The feature id for the '<em><b>DINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__DINT = 14;

	/**
	 * The feature id for the '<em><b>LINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__LINT = 15;

	/**
	 * The feature id for the '<em><b>USINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__USINT = 16;

	/**
	 * The feature id for the '<em><b>UINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__UINT = 17;

	/**
	 * The feature id for the '<em><b>UDINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__UDINT = 18;

	/**
	 * The feature id for the '<em><b>ULINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__ULINT = 19;

	/**
	 * The feature id for the '<em><b>REAL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__REAL = 20;

	/**
	 * The feature id for the '<em><b>LREAL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__LREAL = 21;

	/**
	 * The feature id for the '<em><b>STRING</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__STRING = 22;

	/**
	 * The feature id for the '<em><b>WSTRING</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__WSTRING = 23;

	/**
	 * The feature id for the '<em><b>Data Type ID Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__DATA_TYPE_ID_REF = 24;

	/**
	 * The feature id for the '<em><b>Conditional Support</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__CONDITIONAL_SUPPORT = 25;

	/**
	 * The feature id for the '<em><b>Actual Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__ACTUAL_VALUE = 26;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__DEFAULT_VALUE = 27;

	/**
	 * The feature id for the '<em><b>Substitute Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__SUBSTITUTE_VALUE = 28;

	/**
	 * The feature id for the '<em><b>Allowed Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__ALLOWED_VALUES = 29;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__UNIT = 30;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__PROPERTY = 31;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__ACCESS = 32;

	/**
	 * The feature id for the '<em><b>Access List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__ACCESS_LIST = 33;

	/**
	 * The feature id for the '<em><b>Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__MULTIPLIER = 34;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__OFFSET = 35;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__PERSISTENT = 36;

	/**
	 * The feature id for the '<em><b>Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__SUPPORT = 37;

	/**
	 * The feature id for the '<em><b>Template ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__TEMPLATE_ID_REF = 38;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE__UNIQUE_ID = 39;

	/**
	 * The number of structural features of the '<em>TParameter Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_TEMPLATE_FEATURE_COUNT = 40;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TPicturesListImpl <em>TPictures List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TPicturesListImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTPicturesList()
	 * @generated
	 */
	int TPICTURES_LIST = 100;

	/**
	 * The feature id for the '<em><b>Picture</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPICTURES_LIST__PICTURE = 0;

	/**
	 * The number of structural features of the '<em>TPictures List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPICTURES_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TProductIDImpl <em>TProduct ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TProductIDImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTProductID()
	 * @generated
	 */
	int TPRODUCT_ID = 101;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRODUCT_ID__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRODUCT_ID__READ_ONLY = 1;

	/**
	 * The number of structural features of the '<em>TProduct ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRODUCT_ID_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TPropertyImpl <em>TProperty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TPropertyImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTProperty()
	 * @generated
	 */
	int TPROPERTY = 102;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>TProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TRangeImpl <em>TRange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TRangeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTRange()
	 * @generated
	 */
	int TRANGE = 103;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANGE__MIN_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANGE__MAX_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANGE__STEP = 2;

	/**
	 * The number of structural features of the '<em>TRange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANGE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TSpecificationRevisionImpl <em>TSpecification Revision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TSpecificationRevisionImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTSpecificationRevision()
	 * @generated
	 */
	int TSPECIFICATION_REVISION = 104;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPECIFICATION_REVISION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPECIFICATION_REVISION__READ_ONLY = 1;

	/**
	 * The number of structural features of the '<em>TSpecification Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPECIFICATION_REVISION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TSubrangeImpl <em>TSubrange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TSubrangeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTSubrange()
	 * @generated
	 */
	int TSUBRANGE = 105;

	/**
	 * The feature id for the '<em><b>Lower Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUBRANGE__LOWER_LIMIT = 0;

	/**
	 * The feature id for the '<em><b>Upper Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUBRANGE__UPPER_LIMIT = 1;

	/**
	 * The number of structural features of the '<em>TSubrange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUBRANGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TTemplateListImpl <em>TTemplate List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TTemplateListImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTTemplateList()
	 * @generated
	 */
	int TTEMPLATE_LIST = 106;

	/**
	 * The feature id for the '<em><b>Parameter Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEMPLATE_LIST__PARAMETER_TEMPLATE = 0;

	/**
	 * The feature id for the '<em><b>Allowed Values Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEMPLATE_LIST__ALLOWED_VALUES_TEMPLATE = 1;

	/**
	 * The number of structural features of the '<em>TTemplate List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEMPLATE_LIST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TUnitImpl <em>TUnit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TUnitImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTUnit()
	 * @generated
	 */
	int TUNIT = 107;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNIT__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNIT__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNIT__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNIT__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNIT__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNIT__MULTIPLIER = 5;

	/**
	 * The feature id for the '<em><b>Unit URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNIT__UNIT_URI = 6;

	/**
	 * The number of structural features of the '<em>TUnit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNIT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TValueImpl <em>TValue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TValueImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTValue()
	 * @generated
	 */
	int TVALUE = 108;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVALUE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVALUE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVALUE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVALUE__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVALUE__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVALUE__MULTIPLIER = 5;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVALUE__OFFSET = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVALUE__VALUE = 7;

	/**
	 * The number of structural features of the '<em>TValue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVALUE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TVarDeclarationImpl <em>TVar Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TVarDeclarationImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTVarDeclaration()
	 * @generated
	 */
	int TVAR_DECLARATION = 109;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAR_DECLARATION__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAR_DECLARATION__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAR_DECLARATION__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAR_DECLARATION__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAR_DECLARATION__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>BOOL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAR_DECLARATION__BOOL = 5;

	/**
	 * The feature id for the '<em><b>BITSTRING</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAR_DECLARATION__BITSTRING = 6;

	/**
	 * The feature id for the '<em><b>BYTE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAR_DECLARATION__BYTE = 7;

	/**
	 * The feature id for the '<em><b>CHAR</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAR_DECLARATION__CHAR = 8;

	/**
	 * The feature id for the '<em><b>WORD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAR_DECLARATION__WORD = 9;

	/**
	 * The feature id for the '<em><b>DWORD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAR_DECLARATION__DWORD = 10;

	/**
	 * The feature id for the '<em><b>LWORD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAR_DECLARATION__LWORD = 11;

	/**
	 * The feature id for the '<em><b>SINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAR_DECLARATION__SINT = 12;

	/**
	 * The feature id for the '<em><b>INT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAR_DECLARATION__INT = 13;

	/**
	 * The feature id for the '<em><b>DINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAR_DECLARATION__DINT = 14;

	/**
	 * The feature id for the '<em><b>LINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAR_DECLARATION__LINT = 15;

	/**
	 * The feature id for the '<em><b>USINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAR_DECLARATION__USINT = 16;

	/**
	 * The feature id for the '<em><b>UINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAR_DECLARATION__UINT = 17;

	/**
	 * The feature id for the '<em><b>UDINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAR_DECLARATION__UDINT = 18;

	/**
	 * The feature id for the '<em><b>ULINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAR_DECLARATION__ULINT = 19;

	/**
	 * The feature id for the '<em><b>REAL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAR_DECLARATION__REAL = 20;

	/**
	 * The feature id for the '<em><b>LREAL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAR_DECLARATION__LREAL = 21;

	/**
	 * The feature id for the '<em><b>STRING</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAR_DECLARATION__STRING = 22;

	/**
	 * The feature id for the '<em><b>WSTRING</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAR_DECLARATION__WSTRING = 23;

	/**
	 * The feature id for the '<em><b>Data Type ID Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAR_DECLARATION__DATA_TYPE_ID_REF = 24;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAR_DECLARATION__INITIAL_VALUE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAR_DECLARATION__NAME = 26;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAR_DECLARATION__SIZE = 27;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAR_DECLARATION__UNIQUE_ID = 28;

	/**
	 * The number of structural features of the '<em>TVar Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAR_DECLARATION_FEATURE_COUNT = 29;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TVariableRefImpl <em>TVariable Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TVariableRefImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTVariableRef()
	 * @generated
	 */
	int TVARIABLE_REF = 110;

	/**
	 * The feature id for the '<em><b>Instance ID Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVARIABLE_REF__INSTANCE_ID_REF = 0;

	/**
	 * The feature id for the '<em><b>Variable ID Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVARIABLE_REF__VARIABLE_ID_REF = 1;

	/**
	 * The feature id for the '<em><b>Member Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVARIABLE_REF__MEMBER_REF = 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVARIABLE_REF__POSITION = 3;

	/**
	 * The number of structural features of the '<em>TVariable Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVARIABLE_REF_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TVendorIDImpl <em>TVendor ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TVendorIDImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTVendorID()
	 * @generated
	 */
	int TVENDOR_ID = 111;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVENDOR_ID__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVENDOR_ID__READ_ONLY = 1;

	/**
	 * The number of structural features of the '<em>TVendor ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVENDOR_ID_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.TVersionImpl <em>TVersion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.TVersionImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTVersion()
	 * @generated
	 */
	int TVERSION = 112;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVERSION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVERSION__READ_ONLY = 1;

	/**
	 * The feature id for the '<em><b>Version Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVERSION__VERSION_TYPE = 2;

	/**
	 * The number of structural features of the '<em>TVersion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVERSION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.ValueTypeImpl <em>Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.ValueTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 113;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__VALUE = 6;

	/**
	 * The number of structural features of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.VariableIDRefTypeImpl <em>Variable ID Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.VariableIDRefTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getVariableIDRefType()
	 * @generated
	 */
	int VARIABLE_ID_REF_TYPE = 114;

	/**
	 * The feature id for the '<em><b>Unique ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ID_REF_TYPE__UNIQUE_ID_REF = 0;

	/**
	 * The number of structural features of the '<em>Variable ID Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ID_REF_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.VendorNameTypeImpl <em>Vendor Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.VendorNameTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getVendorNameType()
	 * @generated
	 */
	int VENDOR_NAME_TYPE = 115;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_NAME_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_NAME_TYPE__READ_ONLY = 1;

	/**
	 * The number of structural features of the '<em>Vendor Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_NAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.VendorTextTypeImpl <em>Vendor Text Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.VendorTextTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getVendorTextType()
	 * @generated
	 */
	int VENDOR_TEXT_TYPE = 116;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_TEXT_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_TEXT_TYPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_TEXT_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_TEXT_TYPE__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_TEXT_TYPE__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_TEXT_TYPE__READ_ONLY = 5;

	/**
	 * The number of structural features of the '<em>Vendor Text Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_TEXT_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.impl.VersionInfoTypeImpl <em>Version Info Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.VersionInfoTypeImpl
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getVersionInfoType()
	 * @generated
	 */
	int VERSION_INFO_TYPE = 117;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO_TYPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Label Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO_TYPE__LABEL_REF = 3;

	/**
	 * The feature id for the '<em><b>Description Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO_TYPE__DESCRIPTION_REF = 4;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO_TYPE__AUTHOR = 5;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO_TYPE__DATE = 6;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO_TYPE__ORGANIZATION = 7;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO_TYPE__VERSION = 8;

	/**
	 * The number of structural features of the '<em>Version Info Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.AccessType <em>Access Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.AccessType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getAccessType()
	 * @generated
	 */
	int ACCESS_TYPE = 118;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.AccessType1 <em>Access Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.AccessType1
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getAccessType1()
	 * @generated
	 */
	int ACCESS_TYPE1 = 119;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.AccessTypeType <em>Access Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.AccessTypeType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getAccessTypeType()
	 * @generated
	 */
	int ACCESS_TYPE_TYPE = 120;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.ClassificationType <em>Classification Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.ClassificationType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getClassificationType()
	 * @generated
	 */
	int CLASSIFICATION_TYPE = 121;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.DeviceClassType <em>Device Class Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.DeviceClassType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getDeviceClassType()
	 * @generated
	 */
	int DEVICE_CLASS_TYPE = 122;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.IASInterfaceDataTypeMember0 <em>IAS Interface Data Type Member0</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.IASInterfaceDataTypeMember0
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getIASInterfaceDataTypeMember0()
	 * @generated
	 */
	int IAS_INTERFACE_DATA_TYPE_MEMBER0 = 123;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.LEDcolorsType <em>LE Dcolors Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDcolorsType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getLEDcolorsType()
	 * @generated
	 */
	int LE_DCOLORS_TYPE = 124;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.LEDcolorType <em>LE Dcolor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDcolorType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getLEDcolorType()
	 * @generated
	 */
	int LE_DCOLOR_TYPE = 125;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.LEDtypeType <em>LE Dtype Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDtypeType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getLEDtypeType()
	 * @generated
	 */
	int LE_DTYPE_TYPE = 126;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.NodeTypeType <em>Node Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.NodeTypeType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getNodeTypeType()
	 * @generated
	 */
	int NODE_TYPE_TYPE = 127;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.PositioningType <em>Positioning Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.PositioningType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getPositioningType()
	 * @generated
	 */
	int POSITIONING_TYPE = 128;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.ProfileClassIDDataType <em>Profile Class ID Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileClassIDDataType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getProfileClassIDDataType()
	 * @generated
	 */
	int PROFILE_CLASS_ID_DATA_TYPE = 129;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.RangeType <em>Range Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.RangeType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getRangeType()
	 * @generated
	 */
	int RANGE_TYPE = 130;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.StateType <em>State Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.StateType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getStateType()
	 * @generated
	 */
	int STATE_TYPE = 131;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.SupportType <em>Support Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.SupportType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getSupportType()
	 * @generated
	 */
	int SUPPORT_TYPE = 132;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.TObjectAccessType <em>TObject Access Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.TObjectAccessType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTObjectAccessType()
	 * @generated
	 */
	int TOBJECT_ACCESS_TYPE = 133;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.TObjectPDOMapping <em>TObject PDO Mapping</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.TObjectPDOMapping
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTObjectPDOMapping()
	 * @generated
	 */
	int TOBJECT_PDO_MAPPING = 134;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.TSpecificationVersion <em>TSpecification Version</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.TSpecificationVersion
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTSpecificationVersion()
	 * @generated
	 */
	int TSPECIFICATION_VERSION = 135;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.TypeType <em>Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.TypeType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTypeType()
	 * @generated
	 */
	int TYPE_TYPE = 136;

	/**
	 * The meta object id for the '{@link com.br_automation.buoat.xddeditor.XDD.VersionTypeType <em>Version Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.VersionTypeType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getVersionTypeType()
	 * @generated
	 */
	int VERSION_TYPE_TYPE = 137;

	/**
	 * The meta object id for the '<em>Access List Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getAccessListType()
	 * @generated
	 */
	int ACCESS_LIST_TYPE = 138;

	/**
	 * The meta object id for the '<em>Access Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.AccessType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getAccessTypeObject()
	 * @generated
	 */
	int ACCESS_TYPE_OBJECT = 139;

	/**
	 * The meta object id for the '<em>Access Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.AccessType1
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getAccessTypeObject1()
	 * @generated
	 */
	int ACCESS_TYPE_OBJECT1 = 140;

	/**
	 * The meta object id for the '<em>Access Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.AccessTypeType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getAccessTypeTypeObject()
	 * @generated
	 */
	int ACCESS_TYPE_TYPE_OBJECT = 141;

	/**
	 * The meta object id for the '<em>Classification Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.ClassificationType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getClassificationTypeObject()
	 * @generated
	 */
	int CLASSIFICATION_TYPE_OBJECT = 142;

	/**
	 * The meta object id for the '<em>Device Class Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.DeviceClassType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getDeviceClassTypeObject()
	 * @generated
	 */
	int DEVICE_CLASS_TYPE_OBJECT = 143;

	/**
	 * The meta object id for the '<em>IAS Interface Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getIASInterfaceDataType()
	 * @generated
	 */
	int IAS_INTERFACE_DATA_TYPE = 144;

	/**
	 * The meta object id for the '<em>IAS Interface Data Type Member0 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.IASInterfaceDataTypeMember0
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getIASInterfaceDataTypeMember0Object()
	 * @generated
	 */
	int IAS_INTERFACE_DATA_TYPE_MEMBER0_OBJECT = 145;

	/**
	 * The meta object id for the '<em>IAS Interface Data Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getIASInterfaceDataTypeMember1()
	 * @generated
	 */
	int IAS_INTERFACE_DATA_TYPE_MEMBER1 = 146;

	/**
	 * The meta object id for the '<em>LE Dcolors Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDcolorsType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getLEDcolorsTypeObject()
	 * @generated
	 */
	int LE_DCOLORS_TYPE_OBJECT = 147;

	/**
	 * The meta object id for the '<em>LE Dcolor Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDcolorType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getLEDcolorTypeObject()
	 * @generated
	 */
	int LE_DCOLOR_TYPE_OBJECT = 148;

	/**
	 * The meta object id for the '<em>LE Dtype Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDtypeType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getLEDtypeTypeObject()
	 * @generated
	 */
	int LE_DTYPE_TYPE_OBJECT = 149;

	/**
	 * The meta object id for the '<em>Node Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.NodeTypeType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getNodeTypeTypeObject()
	 * @generated
	 */
	int NODE_TYPE_TYPE_OBJECT = 150;

	/**
	 * The meta object id for the '<em>Offset Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getOffsetType()
	 * @generated
	 */
	int OFFSET_TYPE = 151;

	/**
	 * The meta object id for the '<em>Positioning Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.PositioningType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getPositioningTypeObject()
	 * @generated
	 */
	int POSITIONING_TYPE_OBJECT = 152;

	/**
	 * The meta object id for the '<em>Profile Class ID Data Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileClassIDDataType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getProfileClassIDDataTypeObject()
	 * @generated
	 */
	int PROFILE_CLASS_ID_DATA_TYPE_OBJECT = 153;

	/**
	 * The meta object id for the '<em>Range Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.RangeType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getRangeTypeObject()
	 * @generated
	 */
	int RANGE_TYPE_OBJECT = 154;

	/**
	 * The meta object id for the '<em>State Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.StateType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getStateTypeObject()
	 * @generated
	 */
	int STATE_TYPE_OBJECT = 155;

	/**
	 * The meta object id for the '<em>Supported Languages Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getSupportedLanguagesType()
	 * @generated
	 */
	int SUPPORTED_LANGUAGES_TYPE = 156;

	/**
	 * The meta object id for the '<em>Support Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.SupportType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getSupportTypeObject()
	 * @generated
	 */
	int SUPPORT_TYPE_OBJECT = 157;

	/**
	 * The meta object id for the '<em>TObject Access Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.TObjectAccessType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTObjectAccessTypeObject()
	 * @generated
	 */
	int TOBJECT_ACCESS_TYPE_OBJECT = 158;

	/**
	 * The meta object id for the '<em>TObject PDO Mapping Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.TObjectPDOMapping
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTObjectPDOMappingObject()
	 * @generated
	 */
	int TOBJECT_PDO_MAPPING_OBJECT = 159;

	/**
	 * The meta object id for the '<em>TSpecification Version Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.TSpecificationVersion
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTSpecificationVersionObject()
	 * @generated
	 */
	int TSPECIFICATION_VERSION_OBJECT = 160;

	/**
	 * The meta object id for the '<em>Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.TypeType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getTypeTypeObject()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT = 161;

	/**
	 * The meta object id for the '<em>Version Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br_automation.buoat.xddeditor.XDD.VersionTypeType
	 * @see com.br_automation.buoat.xddeditor.XDD.impl.XDDPackageImpl#getVersionTypeTypeObject()
	 * @generated
	 */
	int VERSION_TYPE_TYPE_OBJECT = 162;


	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.AddInfoType <em>Add Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Info Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.AddInfoType
	 * @generated
	 */
	EClass getAddInfoType();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.AddInfoType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.AddInfoType#getGroup()
	 * @see #getAddInfoType()
	 * @generated
	 */
	EAttribute getAddInfoType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.AddInfoType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.AddInfoType#getLabel()
	 * @see #getAddInfoType()
	 * @generated
	 */
	EReference getAddInfoType_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.AddInfoType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.AddInfoType#getDescription()
	 * @see #getAddInfoType()
	 * @generated
	 */
	EReference getAddInfoType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.AddInfoType#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.AddInfoType#getLabelRef()
	 * @see #getAddInfoType()
	 * @generated
	 */
	EReference getAddInfoType_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.AddInfoType#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.AddInfoType#getDescriptionRef()
	 * @see #getAddInfoType()
	 * @generated
	 */
	EReference getAddInfoType_DescriptionRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.AddInfoType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.AddInfoType#getValue()
	 * @see #getAddInfoType()
	 * @generated
	 */
	EReference getAddInfoType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.AddInfoType#getBitOffset <em>Bit Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bit Offset</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.AddInfoType#getBitOffset()
	 * @see #getAddInfoType()
	 * @generated
	 */
	EAttribute getAddInfoType_BitOffset();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.AddInfoType#getLen <em>Len</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Len</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.AddInfoType#getLen()
	 * @see #getAddInfoType()
	 * @generated
	 */
	EAttribute getAddInfoType_Len();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.AddInfoType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.AddInfoType#getName()
	 * @see #getAddInfoType()
	 * @generated
	 */
	EAttribute getAddInfoType_Name();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.ArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ArrayType
	 * @generated
	 */
	EClass getArrayType();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.ArrayType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ArrayType#getGroup()
	 * @see #getArrayType()
	 * @generated
	 */
	EAttribute getArrayType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ArrayType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ArrayType#getLabel()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ArrayType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ArrayType#getDescription()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ArrayType#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ArrayType#getLabelRef()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ArrayType#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ArrayType#getDescriptionRef()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_DescriptionRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ArrayType#getSubrange <em>Subrange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subrange</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ArrayType#getSubrange()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_Subrange();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ArrayType#getBOOL <em>BOOL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BOOL</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ArrayType#getBOOL()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_BOOL();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ArrayType#getBITSTRING <em>BITSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BITSTRING</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ArrayType#getBITSTRING()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_BITSTRING();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ArrayType#getBYTE <em>BYTE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BYTE</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ArrayType#getBYTE()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_BYTE();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ArrayType#getCHAR <em>CHAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CHAR</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ArrayType#getCHAR()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_CHAR();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ArrayType#getWORD <em>WORD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WORD</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ArrayType#getWORD()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_WORD();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ArrayType#getDWORD <em>DWORD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DWORD</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ArrayType#getDWORD()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_DWORD();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ArrayType#getLWORD <em>LWORD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LWORD</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ArrayType#getLWORD()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_LWORD();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ArrayType#getSINT <em>SINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ArrayType#getSINT()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_SINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ArrayType#getINT <em>INT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>INT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ArrayType#getINT()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_INT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ArrayType#getDINT <em>DINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ArrayType#getDINT()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_DINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ArrayType#getLINT <em>LINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ArrayType#getLINT()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_LINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ArrayType#getUSINT <em>USINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>USINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ArrayType#getUSINT()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_USINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ArrayType#getUINT <em>UINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ArrayType#getUINT()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_UINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ArrayType#getUDINT <em>UDINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UDINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ArrayType#getUDINT()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_UDINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ArrayType#getULINT <em>ULINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ULINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ArrayType#getULINT()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_ULINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ArrayType#getREAL <em>REAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>REAL</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ArrayType#getREAL()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_REAL();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ArrayType#getLREAL <em>LREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LREAL</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ArrayType#getLREAL()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_LREAL();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ArrayType#getSTRING <em>STRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>STRING</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ArrayType#getSTRING()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_STRING();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ArrayType#getWSTRING <em>WSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WSTRING</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ArrayType#getWSTRING()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_WSTRING();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ArrayType#getDataTypeIDRef <em>Data Type ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type ID Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ArrayType#getDataTypeIDRef()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_DataTypeIDRef();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ArrayType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ArrayType#getName()
	 * @see #getArrayType()
	 * @generated
	 */
	EAttribute getArrayType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ArrayType#getUniqueID <em>Unique ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique ID</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ArrayType#getUniqueID()
	 * @see #getArrayType()
	 * @generated
	 */
	EAttribute getArrayType_UniqueID();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.CategoryType <em>Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CategoryType
	 * @generated
	 */
	EClass getCategoryType();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.CategoryType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CategoryType#getGroup()
	 * @see #getCategoryType()
	 * @generated
	 */
	EAttribute getCategoryType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.CategoryType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CategoryType#getLabel()
	 * @see #getCategoryType()
	 * @generated
	 */
	EReference getCategoryType_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.CategoryType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CategoryType#getDescription()
	 * @see #getCategoryType()
	 * @generated
	 */
	EReference getCategoryType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.CategoryType#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CategoryType#getLabelRef()
	 * @see #getCategoryType()
	 * @generated
	 */
	EReference getCategoryType_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.CategoryType#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CategoryType#getDescriptionRef()
	 * @see #getCategoryType()
	 * @generated
	 */
	EReference getCategoryType_DescriptionRef();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.CharacteristicContentType <em>Characteristic Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic Content Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CharacteristicContentType
	 * @generated
	 */
	EClass getCharacteristicContentType();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.CharacteristicContentType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CharacteristicContentType#getGroup()
	 * @see #getCharacteristicContentType()
	 * @generated
	 */
	EAttribute getCharacteristicContentType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.CharacteristicContentType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CharacteristicContentType#getLabel()
	 * @see #getCharacteristicContentType()
	 * @generated
	 */
	EReference getCharacteristicContentType_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.CharacteristicContentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CharacteristicContentType#getDescription()
	 * @see #getCharacteristicContentType()
	 * @generated
	 */
	EReference getCharacteristicContentType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.CharacteristicContentType#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CharacteristicContentType#getLabelRef()
	 * @see #getCharacteristicContentType()
	 * @generated
	 */
	EReference getCharacteristicContentType_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.CharacteristicContentType#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CharacteristicContentType#getDescriptionRef()
	 * @see #getCharacteristicContentType()
	 * @generated
	 */
	EReference getCharacteristicContentType_DescriptionRef();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.CharacteristicNameType <em>Characteristic Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic Name Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CharacteristicNameType
	 * @generated
	 */
	EClass getCharacteristicNameType();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.CharacteristicNameType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CharacteristicNameType#getGroup()
	 * @see #getCharacteristicNameType()
	 * @generated
	 */
	EAttribute getCharacteristicNameType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.CharacteristicNameType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CharacteristicNameType#getLabel()
	 * @see #getCharacteristicNameType()
	 * @generated
	 */
	EReference getCharacteristicNameType_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.CharacteristicNameType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CharacteristicNameType#getDescription()
	 * @see #getCharacteristicNameType()
	 * @generated
	 */
	EReference getCharacteristicNameType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.CharacteristicNameType#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CharacteristicNameType#getLabelRef()
	 * @see #getCharacteristicNameType()
	 * @generated
	 */
	EReference getCharacteristicNameType_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.CharacteristicNameType#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CharacteristicNameType#getDescriptionRef()
	 * @see #getCharacteristicNameType()
	 * @generated
	 */
	EReference getCharacteristicNameType_DescriptionRef();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.CharacteristicsListType <em>Characteristics List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristics List Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CharacteristicsListType
	 * @generated
	 */
	EClass getCharacteristicsListType();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.CharacteristicsListType#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Category</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CharacteristicsListType#getCategory()
	 * @see #getCharacteristicsListType()
	 * @generated
	 */
	EReference getCharacteristicsListType_Category();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.CharacteristicsListType#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Characteristic</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CharacteristicsListType#getCharacteristic()
	 * @see #getCharacteristicsListType()
	 * @generated
	 */
	EReference getCharacteristicsListType_Characteristic();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.CharacteristicType <em>Characteristic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CharacteristicType
	 * @generated
	 */
	EClass getCharacteristicType();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.CharacteristicType#getCharacteristicName <em>Characteristic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Characteristic Name</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CharacteristicType#getCharacteristicName()
	 * @see #getCharacteristicType()
	 * @generated
	 */
	EReference getCharacteristicType_CharacteristicName();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.CharacteristicType#getCharacteristicContent <em>Characteristic Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Characteristic Content</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CharacteristicType#getCharacteristicContent()
	 * @see #getCharacteristicType()
	 * @generated
	 */
	EReference getCharacteristicType_CharacteristicContent();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.CompliantWithType <em>Compliant With Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compliant With Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CompliantWithType
	 * @generated
	 */
	EClass getCompliantWithType();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.CompliantWithType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CompliantWithType#getGroup()
	 * @see #getCompliantWithType()
	 * @generated
	 */
	EAttribute getCompliantWithType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.CompliantWithType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CompliantWithType#getLabel()
	 * @see #getCompliantWithType()
	 * @generated
	 */
	EReference getCompliantWithType_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.CompliantWithType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CompliantWithType#getDescription()
	 * @see #getCompliantWithType()
	 * @generated
	 */
	EReference getCompliantWithType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.CompliantWithType#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CompliantWithType#getLabelRef()
	 * @see #getCompliantWithType()
	 * @generated
	 */
	EReference getCompliantWithType_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.CompliantWithType#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CompliantWithType#getDescriptionRef()
	 * @see #getCompliantWithType()
	 * @generated
	 */
	EReference getCompliantWithType_DescriptionRef();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.CompliantWithType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CompliantWithType#getName()
	 * @see #getCompliantWithType()
	 * @generated
	 */
	EAttribute getCompliantWithType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.CompliantWithType#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.CompliantWithType#getRange()
	 * @see #getCompliantWithType()
	 * @generated
	 */
	EAttribute getCompliantWithType_Range();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.ConfigVarsType <em>Config Vars Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Vars Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ConfigVarsType
	 * @generated
	 */
	EClass getConfigVarsType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ConfigVarsType#getVarDeclaration <em>Var Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var Declaration</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ConfigVarsType#getVarDeclaration()
	 * @see #getConfigVarsType()
	 * @generated
	 */
	EReference getConfigVarsType_VarDeclaration();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.ConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ConnectionType
	 * @generated
	 */
	EClass getConnectionType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ConnectionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ConnectionType#getDescription()
	 * @see #getConnectionType()
	 * @generated
	 */
	EAttribute getConnectionType_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ConnectionType#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ConnectionType#getDestination()
	 * @see #getConnectionType()
	 * @generated
	 */
	EAttribute getConnectionType_Destination();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ConnectionType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ConnectionType#getSource()
	 * @see #getConnectionType()
	 * @generated
	 */
	EAttribute getConnectionType_Source();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ConnectorType
	 * @generated
	 */
	EClass getConnectorType();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ConnectorType#getGroup()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ConnectorType#getLabel()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ConnectorType#getDescription()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ConnectorType#getLabelRef()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ConnectorType#getDescriptionRef()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_DescriptionRef();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType#getConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ConnectorType#getConnectorType()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_ConnectorType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ConnectorType#getId()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType#getPositioning <em>Positioning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Positioning</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ConnectorType#getPositioning()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_Positioning();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType#getPosX <em>Pos X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos X</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ConnectorType#getPosX()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_PosX();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType#getPosY <em>Pos Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos Y</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ConnectorType#getPosY()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_PosY();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.DataTypeListType <em>Data Type List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type List Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DataTypeListType
	 * @generated
	 */
	EClass getDataTypeListType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.DataTypeListType#getDefType <em>Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Def Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DataTypeListType#getDefType()
	 * @see #getDataTypeListType()
	 * @generated
	 */
	EReference getDataTypeListType_DefType();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType <em>Derived Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType
	 * @generated
	 */
	EClass getDerivedType();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType#getGroup()
	 * @see #getDerivedType()
	 * @generated
	 */
	EAttribute getDerivedType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType#getLabel()
	 * @see #getDerivedType()
	 * @generated
	 */
	EReference getDerivedType_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType#getDescription()
	 * @see #getDerivedType()
	 * @generated
	 */
	EReference getDerivedType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType#getLabelRef()
	 * @see #getDerivedType()
	 * @generated
	 */
	EReference getDerivedType_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType#getDescriptionRef()
	 * @see #getDerivedType()
	 * @generated
	 */
	EReference getDerivedType_DescriptionRef();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Count</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType#getCount()
	 * @see #getDerivedType()
	 * @generated
	 */
	EReference getDerivedType_Count();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType#getBOOL <em>BOOL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BOOL</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType#getBOOL()
	 * @see #getDerivedType()
	 * @generated
	 */
	EReference getDerivedType_BOOL();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType#getBITSTRING <em>BITSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BITSTRING</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType#getBITSTRING()
	 * @see #getDerivedType()
	 * @generated
	 */
	EReference getDerivedType_BITSTRING();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType#getBYTE <em>BYTE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BYTE</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType#getBYTE()
	 * @see #getDerivedType()
	 * @generated
	 */
	EReference getDerivedType_BYTE();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType#getCHAR <em>CHAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CHAR</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType#getCHAR()
	 * @see #getDerivedType()
	 * @generated
	 */
	EReference getDerivedType_CHAR();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType#getWORD <em>WORD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WORD</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType#getWORD()
	 * @see #getDerivedType()
	 * @generated
	 */
	EReference getDerivedType_WORD();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType#getDWORD <em>DWORD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DWORD</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType#getDWORD()
	 * @see #getDerivedType()
	 * @generated
	 */
	EReference getDerivedType_DWORD();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType#getLWORD <em>LWORD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LWORD</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType#getLWORD()
	 * @see #getDerivedType()
	 * @generated
	 */
	EReference getDerivedType_LWORD();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType#getSINT <em>SINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType#getSINT()
	 * @see #getDerivedType()
	 * @generated
	 */
	EReference getDerivedType_SINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType#getINT <em>INT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>INT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType#getINT()
	 * @see #getDerivedType()
	 * @generated
	 */
	EReference getDerivedType_INT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType#getDINT <em>DINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType#getDINT()
	 * @see #getDerivedType()
	 * @generated
	 */
	EReference getDerivedType_DINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType#getLINT <em>LINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType#getLINT()
	 * @see #getDerivedType()
	 * @generated
	 */
	EReference getDerivedType_LINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType#getUSINT <em>USINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>USINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType#getUSINT()
	 * @see #getDerivedType()
	 * @generated
	 */
	EReference getDerivedType_USINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType#getUINT <em>UINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType#getUINT()
	 * @see #getDerivedType()
	 * @generated
	 */
	EReference getDerivedType_UINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType#getUDINT <em>UDINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UDINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType#getUDINT()
	 * @see #getDerivedType()
	 * @generated
	 */
	EReference getDerivedType_UDINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType#getULINT <em>ULINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ULINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType#getULINT()
	 * @see #getDerivedType()
	 * @generated
	 */
	EReference getDerivedType_ULINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType#getREAL <em>REAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>REAL</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType#getREAL()
	 * @see #getDerivedType()
	 * @generated
	 */
	EReference getDerivedType_REAL();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType#getLREAL <em>LREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LREAL</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType#getLREAL()
	 * @see #getDerivedType()
	 * @generated
	 */
	EReference getDerivedType_LREAL();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType#getSTRING <em>STRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>STRING</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType#getSTRING()
	 * @see #getDerivedType()
	 * @generated
	 */
	EReference getDerivedType_STRING();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType#getWSTRING <em>WSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WSTRING</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType#getWSTRING()
	 * @see #getDerivedType()
	 * @generated
	 */
	EReference getDerivedType_WSTRING();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType#getDataTypeIDRef <em>Data Type ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type ID Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType#getDataTypeIDRef()
	 * @see #getDerivedType()
	 * @generated
	 */
	EReference getDerivedType_DataTypeIDRef();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType#getDescription1 <em>Description1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description1</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType#getDescription1()
	 * @see #getDerivedType()
	 * @generated
	 */
	EAttribute getDerivedType_Description1();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType#getName()
	 * @see #getDerivedType()
	 * @generated
	 */
	EAttribute getDerivedType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType#getUniqueID <em>Unique ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique ID</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType#getUniqueID()
	 * @see #getDerivedType()
	 * @generated
	 */
	EAttribute getDerivedType_UniqueID();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.DescriptionRefType <em>Description Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Ref Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DescriptionRefType
	 * @generated
	 */
	EClass getDescriptionRefType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.DescriptionRefType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DescriptionRefType#getValue()
	 * @see #getDescriptionRefType()
	 * @generated
	 */
	EAttribute getDescriptionRefType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.DescriptionRefType#getDictID <em>Dict ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dict ID</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DescriptionRefType#getDictID()
	 * @see #getDescriptionRefType()
	 * @generated
	 */
	EAttribute getDescriptionRefType_DictID();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.DescriptionRefType#getTextID <em>Text ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text ID</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DescriptionRefType#getTextID()
	 * @see #getDescriptionRefType()
	 * @generated
	 */
	EAttribute getDescriptionRefType_TextID();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DescriptionType
	 * @generated
	 */
	EClass getDescriptionType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.DescriptionType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DescriptionType#getValue()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EAttribute getDescriptionType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.DescriptionType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DescriptionType#getLang()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EAttribute getDescriptionType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.DescriptionType#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DescriptionType#getURI()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EAttribute getDescriptionType_URI();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.DictionaryType <em>Dictionary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dictionary Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DictionaryType
	 * @generated
	 */
	EClass getDictionaryType();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.DictionaryType#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DictionaryType#getFile()
	 * @see #getDictionaryType()
	 * @generated
	 */
	EReference getDictionaryType_File();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.DictionaryType#getDictID <em>Dict ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dict ID</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DictionaryType#getDictID()
	 * @see #getDictionaryType()
	 * @generated
	 */
	EAttribute getDictionaryType_DictID();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.DictionaryType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DictionaryType#getLang()
	 * @see #getDictionaryType()
	 * @generated
	 */
	EAttribute getDictionaryType_Lang();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getClassification()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Classification();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connector</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getConnector()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Connector();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getFirmware <em>Firmware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Firmware</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getFirmware()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Firmware();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getISO15745Profile <em>ISO15745 Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ISO15745 Profile</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getISO15745Profile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ISO15745Profile();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getISO15745ProfileContainer <em>ISO15745 Profile Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ISO15745 Profile Container</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getISO15745ProfileContainer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ISO15745ProfileContainer();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getTextResource <em>Text Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Resource</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DocumentRoot#getTextResource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TextResource();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.DynamicChannelsType <em>Dynamic Channels Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Channels Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DynamicChannelsType
	 * @generated
	 */
	EClass getDynamicChannelsType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.DynamicChannelsType#getDynamicChannel <em>Dynamic Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dynamic Channel</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DynamicChannelsType#getDynamicChannel()
	 * @see #getDynamicChannelsType()
	 * @generated
	 */
	EReference getDynamicChannelsType_DynamicChannel();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.EnumType <em>Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.EnumType
	 * @generated
	 */
	EClass getEnumType();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.EnumType#getGroup()
	 * @see #getEnumType()
	 * @generated
	 */
	EAttribute getEnumType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.EnumType#getLabel()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.EnumType#getDescription()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.EnumType#getLabelRef()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.EnumType#getDescriptionRef()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_DescriptionRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getEnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.EnumType#getEnumValue()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_EnumValue();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getBOOL <em>BOOL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BOOL</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.EnumType#getBOOL()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_BOOL();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getBITSTRING <em>BITSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BITSTRING</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.EnumType#getBITSTRING()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_BITSTRING();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getBYTE <em>BYTE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BYTE</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.EnumType#getBYTE()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_BYTE();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getCHAR <em>CHAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CHAR</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.EnumType#getCHAR()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_CHAR();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getWORD <em>WORD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WORD</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.EnumType#getWORD()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_WORD();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getDWORD <em>DWORD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DWORD</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.EnumType#getDWORD()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_DWORD();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getLWORD <em>LWORD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LWORD</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.EnumType#getLWORD()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_LWORD();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getSINT <em>SINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.EnumType#getSINT()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_SINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getINT <em>INT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>INT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.EnumType#getINT()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_INT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getDINT <em>DINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.EnumType#getDINT()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_DINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getLINT <em>LINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.EnumType#getLINT()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_LINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getUSINT <em>USINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>USINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.EnumType#getUSINT()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_USINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getUINT <em>UINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.EnumType#getUINT()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_UINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getUDINT <em>UDINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UDINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.EnumType#getUDINT()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_UDINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getULINT <em>ULINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ULINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.EnumType#getULINT()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_ULINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getREAL <em>REAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>REAL</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.EnumType#getREAL()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_REAL();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getLREAL <em>LREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LREAL</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.EnumType#getLREAL()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_LREAL();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getSTRING <em>STRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>STRING</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.EnumType#getSTRING()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_STRING();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getWSTRING <em>WSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WSTRING</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.EnumType#getWSTRING()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_WSTRING();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.EnumType#getName()
	 * @see #getEnumType()
	 * @generated
	 */
	EAttribute getEnumType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.EnumType#getSize()
	 * @see #getEnumType()
	 * @generated
	 */
	EAttribute getEnumType_Size();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.EnumType#getUniqueID <em>Unique ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique ID</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.EnumType#getUniqueID()
	 * @see #getEnumType()
	 * @generated
	 */
	EAttribute getEnumType_UniqueID();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.ErrorBitDataType <em>Error Bit Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Bit Data Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ErrorBitDataType
	 * @generated
	 */
	EClass getErrorBitDataType();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.ErrorBitDataType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ErrorBitDataType#getGroup()
	 * @see #getErrorBitDataType()
	 * @generated
	 */
	EAttribute getErrorBitDataType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ErrorBitDataType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ErrorBitDataType#getLabel()
	 * @see #getErrorBitDataType()
	 * @generated
	 */
	EReference getErrorBitDataType_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ErrorBitDataType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ErrorBitDataType#getDescription()
	 * @see #getErrorBitDataType()
	 * @generated
	 */
	EReference getErrorBitDataType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ErrorBitDataType#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ErrorBitDataType#getLabelRef()
	 * @see #getErrorBitDataType()
	 * @generated
	 */
	EReference getErrorBitDataType_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ErrorBitDataType#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ErrorBitDataType#getDescriptionRef()
	 * @see #getErrorBitDataType()
	 * @generated
	 */
	EReference getErrorBitDataType_DescriptionRef();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ErrorBitDataType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ErrorBitDataType#getName()
	 * @see #getErrorBitDataType()
	 * @generated
	 */
	EAttribute getErrorBitDataType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ErrorBitDataType#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ErrorBitDataType#getOffset()
	 * @see #getErrorBitDataType()
	 * @generated
	 */
	EAttribute getErrorBitDataType_Offset();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.ErrorConstantDataType <em>Error Constant Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Constant Data Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ErrorConstantDataType
	 * @generated
	 */
	EClass getErrorConstantDataType();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.ErrorConstantDataType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ErrorConstantDataType#getGroup()
	 * @see #getErrorConstantDataType()
	 * @generated
	 */
	EAttribute getErrorConstantDataType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ErrorConstantDataType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ErrorConstantDataType#getLabel()
	 * @see #getErrorConstantDataType()
	 * @generated
	 */
	EReference getErrorConstantDataType_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ErrorConstantDataType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ErrorConstantDataType#getDescription()
	 * @see #getErrorConstantDataType()
	 * @generated
	 */
	EReference getErrorConstantDataType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ErrorConstantDataType#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ErrorConstantDataType#getLabelRef()
	 * @see #getErrorConstantDataType()
	 * @generated
	 */
	EReference getErrorConstantDataType_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ErrorConstantDataType#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ErrorConstantDataType#getDescriptionRef()
	 * @see #getErrorConstantDataType()
	 * @generated
	 */
	EReference getErrorConstantDataType_DescriptionRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ErrorConstantDataType#getAddInfo <em>Add Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Add Info</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ErrorConstantDataType#getAddInfo()
	 * @see #getErrorConstantDataType()
	 * @generated
	 */
	EReference getErrorConstantDataType_AddInfo();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ErrorConstantDataType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ErrorConstantDataType#getName()
	 * @see #getErrorConstantDataType()
	 * @generated
	 */
	EAttribute getErrorConstantDataType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ErrorConstantDataType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ErrorConstantDataType#getValue()
	 * @see #getErrorConstantDataType()
	 * @generated
	 */
	EAttribute getErrorConstantDataType_Value();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.ErrorListType <em>Error List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error List Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ErrorListType
	 * @generated
	 */
	EClass getErrorListType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ErrorListType#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ErrorListType#getError()
	 * @see #getErrorListType()
	 * @generated
	 */
	EReference getErrorListType_Error();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.FileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FileType
	 * @generated
	 */
	EClass getFileType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.FileType#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FileType#getURI()
	 * @see #getFileType()
	 * @generated
	 */
	EAttribute getFileType_URI();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.FirmwareType <em>Firmware Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firmware Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FirmwareType
	 * @generated
	 */
	EClass getFirmwareType();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.FirmwareType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FirmwareType#getGroup()
	 * @see #getFirmwareType()
	 * @generated
	 */
	EAttribute getFirmwareType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.FirmwareType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FirmwareType#getLabel()
	 * @see #getFirmwareType()
	 * @generated
	 */
	EReference getFirmwareType_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.FirmwareType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FirmwareType#getDescription()
	 * @see #getFirmwareType()
	 * @generated
	 */
	EReference getFirmwareType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.FirmwareType#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FirmwareType#getLabelRef()
	 * @see #getFirmwareType()
	 * @generated
	 */
	EReference getFirmwareType_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.FirmwareType#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FirmwareType#getDescriptionRef()
	 * @see #getFirmwareType()
	 * @generated
	 */
	EReference getFirmwareType_DescriptionRef();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.FirmwareType#getBuildDate <em>Build Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Build Date</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FirmwareType#getBuildDate()
	 * @see #getFirmwareType()
	 * @generated
	 */
	EAttribute getFirmwareType_BuildDate();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.FirmwareType#getDeviceRevisionNumber <em>Device Revision Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Revision Number</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FirmwareType#getDeviceRevisionNumber()
	 * @see #getFirmwareType()
	 * @generated
	 */
	EAttribute getFirmwareType_DeviceRevisionNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.FirmwareType#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FirmwareType#getURI()
	 * @see #getFirmwareType()
	 * @generated
	 */
	EAttribute getFirmwareType_URI();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.FunctionInstanceType <em>Function Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Instance Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FunctionInstanceType
	 * @generated
	 */
	EClass getFunctionInstanceType();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.FunctionInstanceType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FunctionInstanceType#getGroup()
	 * @see #getFunctionInstanceType()
	 * @generated
	 */
	EAttribute getFunctionInstanceType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.FunctionInstanceType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FunctionInstanceType#getLabel()
	 * @see #getFunctionInstanceType()
	 * @generated
	 */
	EReference getFunctionInstanceType_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.FunctionInstanceType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FunctionInstanceType#getDescription()
	 * @see #getFunctionInstanceType()
	 * @generated
	 */
	EReference getFunctionInstanceType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.FunctionInstanceType#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FunctionInstanceType#getLabelRef()
	 * @see #getFunctionInstanceType()
	 * @generated
	 */
	EReference getFunctionInstanceType_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.FunctionInstanceType#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FunctionInstanceType#getDescriptionRef()
	 * @see #getFunctionInstanceType()
	 * @generated
	 */
	EReference getFunctionInstanceType_DescriptionRef();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.FunctionInstanceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FunctionInstanceType#getName()
	 * @see #getFunctionInstanceType()
	 * @generated
	 */
	EAttribute getFunctionInstanceType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.FunctionInstanceType#getTypeIDRef <em>Type ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type ID Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FunctionInstanceType#getTypeIDRef()
	 * @see #getFunctionInstanceType()
	 * @generated
	 */
	EAttribute getFunctionInstanceType_TypeIDRef();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.FunctionInstanceType#getUniqueID <em>Unique ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique ID</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FunctionInstanceType#getUniqueID()
	 * @see #getFunctionInstanceType()
	 * @generated
	 */
	EAttribute getFunctionInstanceType_UniqueID();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.FunctionTypeType <em>Function Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Type Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FunctionTypeType
	 * @generated
	 */
	EClass getFunctionTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.FunctionTypeType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FunctionTypeType#getGroup()
	 * @see #getFunctionTypeType()
	 * @generated
	 */
	EAttribute getFunctionTypeType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.FunctionTypeType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FunctionTypeType#getLabel()
	 * @see #getFunctionTypeType()
	 * @generated
	 */
	EReference getFunctionTypeType_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.FunctionTypeType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FunctionTypeType#getDescription()
	 * @see #getFunctionTypeType()
	 * @generated
	 */
	EReference getFunctionTypeType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.FunctionTypeType#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FunctionTypeType#getLabelRef()
	 * @see #getFunctionTypeType()
	 * @generated
	 */
	EReference getFunctionTypeType_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.FunctionTypeType#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FunctionTypeType#getDescriptionRef()
	 * @see #getFunctionTypeType()
	 * @generated
	 */
	EReference getFunctionTypeType_DescriptionRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.FunctionTypeType#getVersionInfo <em>Version Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Version Info</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FunctionTypeType#getVersionInfo()
	 * @see #getFunctionTypeType()
	 * @generated
	 */
	EReference getFunctionTypeType_VersionInfo();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.FunctionTypeType#getInterfaceList <em>Interface List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FunctionTypeType#getInterfaceList()
	 * @see #getFunctionTypeType()
	 * @generated
	 */
	EReference getFunctionTypeType_InterfaceList();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.FunctionTypeType#getFunctionInstanceList <em>Function Instance List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function Instance List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FunctionTypeType#getFunctionInstanceList()
	 * @see #getFunctionTypeType()
	 * @generated
	 */
	EReference getFunctionTypeType_FunctionInstanceList();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.FunctionTypeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FunctionTypeType#getName()
	 * @see #getFunctionTypeType()
	 * @generated
	 */
	EAttribute getFunctionTypeType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.FunctionTypeType#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FunctionTypeType#getPackage()
	 * @see #getFunctionTypeType()
	 * @generated
	 */
	EAttribute getFunctionTypeType_Package();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.FunctionTypeType#getUniqueID <em>Unique ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique ID</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.FunctionTypeType#getUniqueID()
	 * @see #getFunctionTypeType()
	 * @generated
	 */
	EAttribute getFunctionTypeType_UniqueID();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.IdentityType <em>Identity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.IdentityType
	 * @generated
	 */
	EClass getIdentityType();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.IdentityType#getVendorID <em>Vendor ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vendor ID</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.IdentityType#getVendorID()
	 * @see #getIdentityType()
	 * @generated
	 */
	EReference getIdentityType_VendorID();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.IdentityType#getDeviceFamily <em>Device Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Family</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.IdentityType#getDeviceFamily()
	 * @see #getIdentityType()
	 * @generated
	 */
	EReference getIdentityType_DeviceFamily();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.IdentityType#getProductID <em>Product ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Product ID</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.IdentityType#getProductID()
	 * @see #getIdentityType()
	 * @generated
	 */
	EReference getIdentityType_ProductID();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.IdentityType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Version</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.IdentityType#getVersion()
	 * @see #getIdentityType()
	 * @generated
	 */
	EReference getIdentityType_Version();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.IdentityType#getBuildDate <em>Build Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Build Date</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.IdentityType#getBuildDate()
	 * @see #getIdentityType()
	 * @generated
	 */
	EAttribute getIdentityType_BuildDate();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.IdentityType#getSpecificationRevision <em>Specification Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification Revision</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.IdentityType#getSpecificationRevision()
	 * @see #getIdentityType()
	 * @generated
	 */
	EReference getIdentityType_SpecificationRevision();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.InputVarsType <em>Input Vars Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Vars Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.InputVarsType
	 * @generated
	 */
	EClass getInputVarsType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.InputVarsType#getVarDeclaration <em>Var Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var Declaration</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.InputVarsType#getVarDeclaration()
	 * @see #getInputVarsType()
	 * @generated
	 */
	EReference getInputVarsType_VarDeclaration();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.InstanceIDRefType <em>Instance ID Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance ID Ref Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.InstanceIDRefType
	 * @generated
	 */
	EClass getInstanceIDRefType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.InstanceIDRefType#getUniqueIDRef <em>Unique ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique ID Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.InstanceIDRefType#getUniqueIDRef()
	 * @see #getInstanceIDRefType()
	 * @generated
	 */
	EAttribute getInstanceIDRefType_UniqueIDRef();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.InstanceNameType <em>Instance Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Name Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.InstanceNameType
	 * @generated
	 */
	EClass getInstanceNameType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.InstanceNameType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.InstanceNameType#getValue()
	 * @see #getInstanceNameType()
	 * @generated
	 */
	EAttribute getInstanceNameType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.InstanceNameType#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.InstanceNameType#isReadOnly()
	 * @see #getInstanceNameType()
	 * @generated
	 */
	EAttribute getInstanceNameType_ReadOnly();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.InterfaceListType <em>Interface List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface List Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.InterfaceListType
	 * @generated
	 */
	EClass getInterfaceListType();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.InterfaceListType#getInputVars <em>Input Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Vars</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.InterfaceListType#getInputVars()
	 * @see #getInterfaceListType()
	 * @generated
	 */
	EReference getInterfaceListType_InputVars();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.InterfaceListType#getOutputVars <em>Output Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Vars</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.InterfaceListType#getOutputVars()
	 * @see #getInterfaceListType()
	 * @generated
	 */
	EReference getInterfaceListType_OutputVars();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.InterfaceListType#getConfigVars <em>Config Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config Vars</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.InterfaceListType#getConfigVars()
	 * @see #getInterfaceListType()
	 * @generated
	 */
	EReference getInterfaceListType_ConfigVars();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileContainerType <em>ISO15745 Profile Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISO15745 Profile Container Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileContainerType
	 * @generated
	 */
	EClass getISO15745ProfileContainerType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileContainerType#getISO15745Profile <em>ISO15745 Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ISO15745 Profile</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileContainerType#getISO15745Profile()
	 * @see #getISO15745ProfileContainerType()
	 * @generated
	 */
	EReference getISO15745ProfileContainerType_ISO15745Profile();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileType <em>ISO15745 Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISO15745 Profile Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileType
	 * @generated
	 */
	EClass getISO15745ProfileType();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileType#getProfileHeader <em>Profile Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Profile Header</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileType#getProfileHeader()
	 * @see #getISO15745ProfileType()
	 * @generated
	 */
	EReference getISO15745ProfileType_ProfileHeader();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileType#getProfileBody <em>Profile Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Profile Body</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileType#getProfileBody()
	 * @see #getISO15745ProfileType()
	 * @generated
	 */
	EReference getISO15745ProfileType_ProfileBody();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.ISO15745ReferenceDataType <em>ISO15745 Reference Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISO15745 Reference Data Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ISO15745ReferenceDataType
	 * @generated
	 */
	EClass getISO15745ReferenceDataType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ISO15745ReferenceDataType#getISO15745Part <em>ISO15745 Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ISO15745 Part</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ISO15745ReferenceDataType#getISO15745Part()
	 * @see #getISO15745ReferenceDataType()
	 * @generated
	 */
	EAttribute getISO15745ReferenceDataType_ISO15745Part();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ISO15745ReferenceDataType#getISO15745Edition <em>ISO15745 Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ISO15745 Edition</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ISO15745ReferenceDataType#getISO15745Edition()
	 * @see #getISO15745ReferenceDataType()
	 * @generated
	 */
	EAttribute getISO15745ReferenceDataType_ISO15745Edition();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ISO15745ReferenceDataType#getProfileTechnology <em>Profile Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile Technology</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ISO15745ReferenceDataType#getProfileTechnology()
	 * @see #getISO15745ReferenceDataType()
	 * @generated
	 */
	EAttribute getISO15745ReferenceDataType_ProfileTechnology();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.LabelRefType <em>Label Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Ref Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.LabelRefType
	 * @generated
	 */
	EClass getLabelRefType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.LabelRefType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.LabelRefType#getValue()
	 * @see #getLabelRefType()
	 * @generated
	 */
	EAttribute getLabelRefType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.LabelRefType#getDictID <em>Dict ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dict ID</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.LabelRefType#getDictID()
	 * @see #getLabelRefType()
	 * @generated
	 */
	EAttribute getLabelRefType_DictID();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.LabelRefType#getTextID <em>Text ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text ID</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.LabelRefType#getTextID()
	 * @see #getLabelRefType()
	 * @generated
	 */
	EAttribute getLabelRefType_TextID();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.LabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.LabelType
	 * @generated
	 */
	EClass getLabelType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.LabelType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.LabelType#getValue()
	 * @see #getLabelType()
	 * @generated
	 */
	EAttribute getLabelType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.LabelType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.LabelType#getLang()
	 * @see #getLabelType()
	 * @generated
	 */
	EAttribute getLabelType_Lang();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.LEDListType <em>LED List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LED List Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDListType
	 * @generated
	 */
	EClass getLEDListType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.LEDListType#getLED <em>LED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>LED</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDListType#getLED()
	 * @see #getLEDListType()
	 * @generated
	 */
	EReference getLEDListType_LED();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.LEDListType#getCombinedState <em>Combined State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Combined State</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDListType#getCombinedState()
	 * @see #getLEDListType()
	 * @generated
	 */
	EReference getLEDListType_CombinedState();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.LEDstateRefType <em>LE Dstate Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LE Dstate Ref Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDstateRefType
	 * @generated
	 */
	EClass getLEDstateRefType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.LEDstateRefType#getStateIDRef <em>State ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State ID Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDstateRefType#getStateIDRef()
	 * @see #getLEDstateRefType()
	 * @generated
	 */
	EAttribute getLEDstateRefType_StateIDRef();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.LEDstateType <em>LE Dstate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LE Dstate Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDstateType
	 * @generated
	 */
	EClass getLEDstateType();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDstateType#getGroup()
	 * @see #getLEDstateType()
	 * @generated
	 */
	EAttribute getLEDstateType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDstateType#getLabel()
	 * @see #getLEDstateType()
	 * @generated
	 */
	EReference getLEDstateType_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDstateType#getDescription()
	 * @see #getLEDstateType()
	 * @generated
	 */
	EReference getLEDstateType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDstateType#getLabelRef()
	 * @see #getLEDstateType()
	 * @generated
	 */
	EReference getLEDstateType_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDstateType#getDescriptionRef()
	 * @see #getLEDstateType()
	 * @generated
	 */
	EReference getLEDstateType_DescriptionRef();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getFlashingPeriod <em>Flashing Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flashing Period</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDstateType#getFlashingPeriod()
	 * @see #getLEDstateType()
	 * @generated
	 */
	EAttribute getLEDstateType_FlashingPeriod();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getImpulsWidth <em>Impuls Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impuls Width</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDstateType#getImpulsWidth()
	 * @see #getLEDstateType()
	 * @generated
	 */
	EAttribute getLEDstateType_ImpulsWidth();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getLEDcolor <em>LE Dcolor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LE Dcolor</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDstateType#getLEDcolor()
	 * @see #getLEDstateType()
	 * @generated
	 */
	EAttribute getLEDstateType_LEDcolor();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getNumberOfImpulses <em>Number Of Impulses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Impulses</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDstateType#getNumberOfImpulses()
	 * @see #getLEDstateType()
	 * @generated
	 */
	EAttribute getLEDstateType_NumberOfImpulses();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDstateType#getState()
	 * @see #getLEDstateType()
	 * @generated
	 */
	EAttribute getLEDstateType_State();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.LEDstateType#getUniqueID <em>Unique ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique ID</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDstateType#getUniqueID()
	 * @see #getLEDstateType()
	 * @generated
	 */
	EAttribute getLEDstateType_UniqueID();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.MaxValueType <em>Max Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Value Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.MaxValueType
	 * @generated
	 */
	EClass getMaxValueType();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.MaxValueType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.MaxValueType#getGroup()
	 * @see #getMaxValueType()
	 * @generated
	 */
	EAttribute getMaxValueType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.MaxValueType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.MaxValueType#getLabel()
	 * @see #getMaxValueType()
	 * @generated
	 */
	EReference getMaxValueType_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.MaxValueType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.MaxValueType#getDescription()
	 * @see #getMaxValueType()
	 * @generated
	 */
	EReference getMaxValueType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.MaxValueType#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.MaxValueType#getLabelRef()
	 * @see #getMaxValueType()
	 * @generated
	 */
	EReference getMaxValueType_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.MaxValueType#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.MaxValueType#getDescriptionRef()
	 * @see #getMaxValueType()
	 * @generated
	 */
	EReference getMaxValueType_DescriptionRef();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.MaxValueType#getMultiplier <em>Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplier</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.MaxValueType#getMultiplier()
	 * @see #getMaxValueType()
	 * @generated
	 */
	EAttribute getMaxValueType_Multiplier();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.MaxValueType#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.MaxValueType#getOffset()
	 * @see #getMaxValueType()
	 * @generated
	 */
	EAttribute getMaxValueType_Offset();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.MaxValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.MaxValueType#getValue()
	 * @see #getMaxValueType()
	 * @generated
	 */
	EAttribute getMaxValueType_Value();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.MemberRefType <em>Member Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member Ref Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.MemberRefType
	 * @generated
	 */
	EClass getMemberRefType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.MemberRefType#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.MemberRefType#getIndex()
	 * @see #getMemberRefType()
	 * @generated
	 */
	EAttribute getMemberRefType_Index();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.MemberRefType#getUniqueIDRef <em>Unique ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique ID Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.MemberRefType#getUniqueIDRef()
	 * @see #getMemberRefType()
	 * @generated
	 */
	EAttribute getMemberRefType_UniqueIDRef();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.MinValueType <em>Min Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Value Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.MinValueType
	 * @generated
	 */
	EClass getMinValueType();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.MinValueType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.MinValueType#getGroup()
	 * @see #getMinValueType()
	 * @generated
	 */
	EAttribute getMinValueType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.MinValueType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.MinValueType#getLabel()
	 * @see #getMinValueType()
	 * @generated
	 */
	EReference getMinValueType_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.MinValueType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.MinValueType#getDescription()
	 * @see #getMinValueType()
	 * @generated
	 */
	EReference getMinValueType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.MinValueType#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.MinValueType#getLabelRef()
	 * @see #getMinValueType()
	 * @generated
	 */
	EReference getMinValueType_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.MinValueType#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.MinValueType#getDescriptionRef()
	 * @see #getMinValueType()
	 * @generated
	 */
	EReference getMinValueType_DescriptionRef();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.MinValueType#getMultiplier <em>Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplier</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.MinValueType#getMultiplier()
	 * @see #getMinValueType()
	 * @generated
	 */
	EAttribute getMinValueType_Multiplier();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.MinValueType#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.MinValueType#getOffset()
	 * @see #getMinValueType()
	 * @generated
	 */
	EAttribute getMinValueType_Offset();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.MinValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.MinValueType#getValue()
	 * @see #getMinValueType()
	 * @generated
	 */
	EAttribute getMinValueType_Value();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.ObjectListType <em>Object List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object List Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ObjectListType
	 * @generated
	 */
	EClass getObjectListType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ObjectListType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ObjectListType#getObject()
	 * @see #getObjectListType()
	 * @generated
	 */
	EReference getObjectListType_Object();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ObjectListType#getMandatoryObjects <em>Mandatory Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory Objects</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ObjectListType#getMandatoryObjects()
	 * @see #getObjectListType()
	 * @generated
	 */
	EAttribute getObjectListType_MandatoryObjects();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ObjectListType#getManufacturerObjects <em>Manufacturer Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer Objects</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ObjectListType#getManufacturerObjects()
	 * @see #getObjectListType()
	 * @generated
	 */
	EAttribute getObjectListType_ManufacturerObjects();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ObjectListType#getOptionalObjects <em>Optional Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional Objects</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ObjectListType#getOptionalObjects()
	 * @see #getObjectListType()
	 * @generated
	 */
	EAttribute getObjectListType_OptionalObjects();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.OrderNumberType <em>Order Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Number Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.OrderNumberType
	 * @generated
	 */
	EClass getOrderNumberType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.OrderNumberType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.OrderNumberType#getValue()
	 * @see #getOrderNumberType()
	 * @generated
	 */
	EAttribute getOrderNumberType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.OrderNumberType#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.OrderNumberType#isReadOnly()
	 * @see #getOrderNumberType()
	 * @generated
	 */
	EAttribute getOrderNumberType_ReadOnly();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.OutputVarsType <em>Output Vars Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Vars Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.OutputVarsType
	 * @generated
	 */
	EClass getOutputVarsType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.OutputVarsType#getVarDeclaration <em>Var Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var Declaration</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.OutputVarsType#getVarDeclaration()
	 * @see #getOutputVarsType()
	 * @generated
	 */
	EReference getOutputVarsType_VarDeclaration();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.ParameterRefType <em>Parameter Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Ref Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterRefType
	 * @generated
	 */
	EClass getParameterRefType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ParameterRefType#getActualValue <em>Actual Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterRefType#getActualValue()
	 * @see #getParameterRefType()
	 * @generated
	 */
	EAttribute getParameterRefType_ActualValue();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ParameterRefType#getBitOffset <em>Bit Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bit Offset</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterRefType#getBitOffset()
	 * @see #getParameterRefType()
	 * @generated
	 */
	EAttribute getParameterRefType_BitOffset();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ParameterRefType#isLocked <em>Locked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locked</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterRefType#isLocked()
	 * @see #getParameterRefType()
	 * @generated
	 */
	EAttribute getParameterRefType_Locked();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ParameterRefType#getUniqueIDRef <em>Unique ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique ID Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterRefType#getUniqueIDRef()
	 * @see #getParameterRefType()
	 * @generated
	 */
	EAttribute getParameterRefType_UniqueIDRef();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ParameterRefType#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterRefType#isVisible()
	 * @see #getParameterRefType()
	 * @generated
	 */
	EAttribute getParameterRefType_Visible();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType
	 * @generated
	 */
	EClass getParameterType();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getGroup()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getLabel()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getDescription()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getLabelRef()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getDescriptionRef()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_DescriptionRef();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getBOOL <em>BOOL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BOOL</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getBOOL()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_BOOL();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getBITSTRING <em>BITSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BITSTRING</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getBITSTRING()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_BITSTRING();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getBYTE <em>BYTE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BYTE</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getBYTE()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_BYTE();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getCHAR <em>CHAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CHAR</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getCHAR()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_CHAR();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getWORD <em>WORD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WORD</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getWORD()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_WORD();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getDWORD <em>DWORD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DWORD</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getDWORD()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_DWORD();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getLWORD <em>LWORD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LWORD</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getLWORD()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_LWORD();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getSINT <em>SINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getSINT()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_SINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getINT <em>INT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>INT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getINT()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_INT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getDINT <em>DINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getDINT()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_DINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getLINT <em>LINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getLINT()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_LINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getUSINT <em>USINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>USINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getUSINT()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_USINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getUINT <em>UINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getUINT()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_UINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getUDINT <em>UDINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UDINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getUDINT()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_UDINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getULINT <em>ULINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ULINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getULINT()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_ULINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getREAL <em>REAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>REAL</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getREAL()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_REAL();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getLREAL <em>LREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LREAL</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getLREAL()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_LREAL();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getSTRING <em>STRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>STRING</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getSTRING()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_STRING();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getWSTRING <em>WSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WSTRING</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getWSTRING()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_WSTRING();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getDataTypeIDRef <em>Data Type ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type ID Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getDataTypeIDRef()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_DataTypeIDRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getVariableRef <em>Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getVariableRef()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_VariableRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getConditionalSupport <em>Conditional Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditional Support</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getConditionalSupport()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_ConditionalSupport();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getDenotation <em>Denotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Denotation</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getDenotation()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_Denotation();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getActualValue <em>Actual Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actual Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getActualValue()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_ActualValue();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getDefaultValue()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_DefaultValue();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getSubstituteValue <em>Substitute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Substitute Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getSubstituteValue()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_SubstituteValue();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getAllowedValues <em>Allowed Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allowed Values</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getAllowedValues()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_AllowedValues();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getUnit()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_Unit();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getProperty()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_Property();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getAccess()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_Access();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getAccessList <em>Access List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getAccessList()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_AccessList();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getMultiplier <em>Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplier</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getMultiplier()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_Multiplier();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getOffset()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_Offset();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#isPersistent <em>Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#isPersistent()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_Persistent();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getSupport <em>Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Support</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getSupport()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_Support();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getTemplateIDRef <em>Template ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template ID Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getTemplateIDRef()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_TemplateIDRef();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType#getUniqueID <em>Unique ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique ID</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType#getUniqueID()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_UniqueID();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.PictureType <em>Picture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Picture Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.PictureType
	 * @generated
	 */
	EClass getPictureType();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.PictureType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.PictureType#getGroup()
	 * @see #getPictureType()
	 * @generated
	 */
	EAttribute getPictureType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.PictureType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.PictureType#getLabel()
	 * @see #getPictureType()
	 * @generated
	 */
	EReference getPictureType_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.PictureType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.PictureType#getDescription()
	 * @see #getPictureType()
	 * @generated
	 */
	EReference getPictureType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.PictureType#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.PictureType#getLabelRef()
	 * @see #getPictureType()
	 * @generated
	 */
	EReference getPictureType_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.PictureType#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.PictureType#getDescriptionRef()
	 * @see #getPictureType()
	 * @generated
	 */
	EReference getPictureType_DescriptionRef();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.PictureType#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.PictureType#getNumber()
	 * @see #getPictureType()
	 * @generated
	 */
	EAttribute getPictureType_Number();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.PictureType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.PictureType#getType()
	 * @see #getPictureType()
	 * @generated
	 */
	EAttribute getPictureType_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.PictureType#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.PictureType#getURI()
	 * @see #getPictureType()
	 * @generated
	 */
	EAttribute getPictureType_URI();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.ProductFamilyType <em>Product Family Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Family Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProductFamilyType
	 * @generated
	 */
	EClass getProductFamilyType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ProductFamilyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProductFamilyType#getValue()
	 * @see #getProductFamilyType()
	 * @generated
	 */
	EAttribute getProductFamilyType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ProductFamilyType#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProductFamilyType#isReadOnly()
	 * @see #getProductFamilyType()
	 * @generated
	 */
	EAttribute getProductFamilyType_ReadOnly();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.ProductNameType <em>Product Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Name Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProductNameType
	 * @generated
	 */
	EClass getProductNameType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ProductNameType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProductNameType#getValue()
	 * @see #getProductNameType()
	 * @generated
	 */
	EAttribute getProductNameType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ProductNameType#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProductNameType#isReadOnly()
	 * @see #getProductNameType()
	 * @generated
	 */
	EAttribute getProductNameType_ReadOnly();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.ProductTextType <em>Product Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Text Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProductTextType
	 * @generated
	 */
	EClass getProductTextType();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.ProductTextType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProductTextType#getGroup()
	 * @see #getProductTextType()
	 * @generated
	 */
	EAttribute getProductTextType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ProductTextType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProductTextType#getLabel()
	 * @see #getProductTextType()
	 * @generated
	 */
	EReference getProductTextType_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ProductTextType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProductTextType#getDescription()
	 * @see #getProductTextType()
	 * @generated
	 */
	EReference getProductTextType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ProductTextType#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProductTextType#getLabelRef()
	 * @see #getProductTextType()
	 * @generated
	 */
	EReference getProductTextType_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ProductTextType#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProductTextType#getDescriptionRef()
	 * @see #getProductTextType()
	 * @generated
	 */
	EReference getProductTextType_DescriptionRef();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ProductTextType#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProductTextType#isReadOnly()
	 * @see #getProductTextType()
	 * @generated
	 */
	EAttribute getProductTextType_ReadOnly();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink <em>Profile Body Communication Network Powerlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile Body Communication Network Powerlink</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink
	 * @generated
	 */
	EClass getProfileBodyCommunicationNetworkPowerlink();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink#getApplicationLayers <em>Application Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Layers</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink#getApplicationLayers()
	 * @see #getProfileBodyCommunicationNetworkPowerlink()
	 * @generated
	 */
	EReference getProfileBodyCommunicationNetworkPowerlink_ApplicationLayers();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink#getTransportLayers <em>Transport Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transport Layers</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink#getTransportLayers()
	 * @see #getProfileBodyCommunicationNetworkPowerlink()
	 * @generated
	 */
	EReference getProfileBodyCommunicationNetworkPowerlink_TransportLayers();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink#getNetworkManagement <em>Network Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network Management</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink#getNetworkManagement()
	 * @see #getProfileBodyCommunicationNetworkPowerlink()
	 * @generated
	 */
	EReference getProfileBodyCommunicationNetworkPowerlink_NetworkManagement();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink#getExternalProfileHandle <em>External Profile Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Profile Handle</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink#getExternalProfileHandle()
	 * @see #getProfileBodyCommunicationNetworkPowerlink()
	 * @generated
	 */
	EReference getProfileBodyCommunicationNetworkPowerlink_ExternalProfileHandle();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink#getSpecificationVersion <em>Specification Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification Version</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink#getSpecificationVersion()
	 * @see #getProfileBodyCommunicationNetworkPowerlink()
	 * @generated
	 */
	EAttribute getProfileBodyCommunicationNetworkPowerlink_SpecificationVersion();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType <em>Profile Body Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile Body Data Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType
	 * @generated
	 */
	EClass getProfileBodyDataType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileCreationDate <em>File Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Creation Date</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileCreationDate()
	 * @see #getProfileBodyDataType()
	 * @generated
	 */
	EAttribute getProfileBodyDataType_FileCreationDate();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileCreationTime <em>File Creation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Creation Time</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileCreationTime()
	 * @see #getProfileBodyDataType()
	 * @generated
	 */
	EAttribute getProfileBodyDataType_FileCreationTime();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileCreator <em>File Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Creator</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileCreator()
	 * @see #getProfileBodyDataType()
	 * @generated
	 */
	EAttribute getProfileBodyDataType_FileCreator();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileModificationDate <em>File Modification Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Modification Date</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileModificationDate()
	 * @see #getProfileBodyDataType()
	 * @generated
	 */
	EAttribute getProfileBodyDataType_FileModificationDate();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileModificationTime <em>File Modification Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Modification Time</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileModificationTime()
	 * @see #getProfileBodyDataType()
	 * @generated
	 */
	EAttribute getProfileBodyDataType_FileModificationTime();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileModifiedBy <em>File Modified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Modified By</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileModifiedBy()
	 * @see #getProfileBodyDataType()
	 * @generated
	 */
	EAttribute getProfileBodyDataType_FileModifiedBy();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileName()
	 * @see #getProfileBodyDataType()
	 * @generated
	 */
	EAttribute getProfileBodyDataType_FileName();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileVersion <em>File Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Version</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFileVersion()
	 * @see #getProfileBodyDataType()
	 * @generated
	 */
	EAttribute getProfileBodyDataType_FileVersion();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFormatName <em>Format Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format Name</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFormatName()
	 * @see #getProfileBodyDataType()
	 * @generated
	 */
	EAttribute getProfileBodyDataType_FormatName();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFormatVersion <em>Format Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format Version</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getFormatVersion()
	 * @see #getProfileBodyDataType()
	 * @generated
	 */
	EAttribute getProfileBodyDataType_FormatVersion();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getSupportedLanguages <em>Supported Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supported Languages</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType#getSupportedLanguages()
	 * @see #getProfileBodyDataType()
	 * @generated
	 */
	EAttribute getProfileBodyDataType_SupportedLanguages();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink <em>Profile Body Device Powerlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile Body Device Powerlink</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink
	 * @generated
	 */
	EClass getProfileBodyDevicePowerlink();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink#getDeviceIdentity <em>Device Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Identity</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink#getDeviceIdentity()
	 * @see #getProfileBodyDevicePowerlink()
	 * @generated
	 */
	EReference getProfileBodyDevicePowerlink_DeviceIdentity();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink#getDeviceManager <em>Device Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Manager</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink#getDeviceManager()
	 * @see #getProfileBodyDevicePowerlink()
	 * @generated
	 */
	EReference getProfileBodyDevicePowerlink_DeviceManager();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink#getDeviceFunction <em>Device Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device Function</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink#getDeviceFunction()
	 * @see #getProfileBodyDevicePowerlink()
	 * @generated
	 */
	EReference getProfileBodyDevicePowerlink_DeviceFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink#getApplicationProcess <em>Application Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Application Process</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink#getApplicationProcess()
	 * @see #getProfileBodyDevicePowerlink()
	 * @generated
	 */
	EReference getProfileBodyDevicePowerlink_ApplicationProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink#getExternalProfileHandle <em>External Profile Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Profile Handle</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink#getExternalProfileHandle()
	 * @see #getProfileBodyDevicePowerlink()
	 * @generated
	 */
	EReference getProfileBodyDevicePowerlink_ExternalProfileHandle();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink#getDeviceClass <em>Device Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Class</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink#getDeviceClass()
	 * @see #getProfileBodyDevicePowerlink()
	 * @generated
	 */
	EAttribute getProfileBodyDevicePowerlink_DeviceClass();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink#getSpecificationVersion <em>Specification Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification Version</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink#getSpecificationVersion()
	 * @see #getProfileBodyDevicePowerlink()
	 * @generated
	 */
	EAttribute getProfileBodyDevicePowerlink_SpecificationVersion();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.ProfileHandleDataType <em>Profile Handle Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile Handle Data Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileHandleDataType
	 * @generated
	 */
	EClass getProfileHandleDataType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ProfileHandleDataType#getProfileIdentification <em>Profile Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile Identification</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileHandleDataType#getProfileIdentification()
	 * @see #getProfileHandleDataType()
	 * @generated
	 */
	EAttribute getProfileHandleDataType_ProfileIdentification();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ProfileHandleDataType#getProfileRevision <em>Profile Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile Revision</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileHandleDataType#getProfileRevision()
	 * @see #getProfileHandleDataType()
	 * @generated
	 */
	EAttribute getProfileHandleDataType_ProfileRevision();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ProfileHandleDataType#getProfileLocation <em>Profile Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile Location</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileHandleDataType#getProfileLocation()
	 * @see #getProfileHandleDataType()
	 * @generated
	 */
	EAttribute getProfileHandleDataType_ProfileLocation();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType <em>Profile Header Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile Header Data Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType
	 * @generated
	 */
	EClass getProfileHeaderDataType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getProfileIdentification <em>Profile Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile Identification</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getProfileIdentification()
	 * @see #getProfileHeaderDataType()
	 * @generated
	 */
	EAttribute getProfileHeaderDataType_ProfileIdentification();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getProfileRevision <em>Profile Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile Revision</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getProfileRevision()
	 * @see #getProfileHeaderDataType()
	 * @generated
	 */
	EAttribute getProfileHeaderDataType_ProfileRevision();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getProfileName <em>Profile Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile Name</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getProfileName()
	 * @see #getProfileHeaderDataType()
	 * @generated
	 */
	EAttribute getProfileHeaderDataType_ProfileName();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getProfileSource <em>Profile Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile Source</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getProfileSource()
	 * @see #getProfileHeaderDataType()
	 * @generated
	 */
	EAttribute getProfileHeaderDataType_ProfileSource();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getProfileClassID <em>Profile Class ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile Class ID</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getProfileClassID()
	 * @see #getProfileHeaderDataType()
	 * @generated
	 */
	EAttribute getProfileHeaderDataType_ProfileClassID();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getProfileDate <em>Profile Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile Date</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getProfileDate()
	 * @see #getProfileHeaderDataType()
	 * @generated
	 */
	EAttribute getProfileHeaderDataType_ProfileDate();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getAdditionalInformation <em>Additional Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Information</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getAdditionalInformation()
	 * @see #getProfileHeaderDataType()
	 * @generated
	 */
	EAttribute getProfileHeaderDataType_AdditionalInformation();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getISO15745Reference <em>ISO15745 Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ISO15745 Reference</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getISO15745Reference()
	 * @see #getProfileHeaderDataType()
	 * @generated
	 */
	EReference getProfileHeaderDataType_ISO15745Reference();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getIASInterfaceType <em>IAS Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>IAS Interface Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType#getIASInterfaceType()
	 * @see #getProfileHeaderDataType()
	 * @generated
	 */
	EAttribute getProfileHeaderDataType_IASInterfaceType();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.StandardComplianceListType <em>Standard Compliance List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Compliance List Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.StandardComplianceListType
	 * @generated
	 */
	EClass getStandardComplianceListType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.StandardComplianceListType#getCompliantWith <em>Compliant With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compliant With</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.StandardComplianceListType#getCompliantWith()
	 * @see #getStandardComplianceListType()
	 * @generated
	 */
	EReference getStandardComplianceListType_CompliantWith();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.StaticErrorBitFieldType <em>Static Error Bit Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Error Bit Field Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.StaticErrorBitFieldType
	 * @generated
	 */
	EClass getStaticErrorBitFieldType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.StaticErrorBitFieldType#getErrorBit <em>Error Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error Bit</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.StaticErrorBitFieldType#getErrorBit()
	 * @see #getStaticErrorBitFieldType()
	 * @generated
	 */
	EReference getStaticErrorBitFieldType_ErrorBit();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.StepType <em>Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.StepType
	 * @generated
	 */
	EClass getStepType();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.StepType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.StepType#getGroup()
	 * @see #getStepType()
	 * @generated
	 */
	EAttribute getStepType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.StepType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.StepType#getLabel()
	 * @see #getStepType()
	 * @generated
	 */
	EReference getStepType_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.StepType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.StepType#getDescription()
	 * @see #getStepType()
	 * @generated
	 */
	EReference getStepType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.StepType#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.StepType#getLabelRef()
	 * @see #getStepType()
	 * @generated
	 */
	EReference getStepType_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.StepType#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.StepType#getDescriptionRef()
	 * @see #getStepType()
	 * @generated
	 */
	EReference getStepType_DescriptionRef();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.StepType#getMultiplier <em>Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplier</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.StepType#getMultiplier()
	 * @see #getStepType()
	 * @generated
	 */
	EAttribute getStepType_Multiplier();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.StepType#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.StepType#getOffset()
	 * @see #getStepType()
	 * @generated
	 */
	EAttribute getStepType_Offset();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.StepType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.StepType#getValue()
	 * @see #getStepType()
	 * @generated
	 */
	EAttribute getStepType_Value();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.StructType <em>Struct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.StructType
	 * @generated
	 */
	EClass getStructType();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.StructType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.StructType#getGroup()
	 * @see #getStructType()
	 * @generated
	 */
	EAttribute getStructType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.StructType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.StructType#getLabel()
	 * @see #getStructType()
	 * @generated
	 */
	EReference getStructType_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.StructType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.StructType#getDescription()
	 * @see #getStructType()
	 * @generated
	 */
	EReference getStructType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.StructType#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.StructType#getLabelRef()
	 * @see #getStructType()
	 * @generated
	 */
	EReference getStructType_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.StructType#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.StructType#getDescriptionRef()
	 * @see #getStructType()
	 * @generated
	 */
	EReference getStructType_DescriptionRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.StructType#getVarDeclaration <em>Var Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var Declaration</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.StructType#getVarDeclaration()
	 * @see #getStructType()
	 * @generated
	 */
	EReference getStructType_VarDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.StructType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.StructType#getName()
	 * @see #getStructType()
	 * @generated
	 */
	EAttribute getStructType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.StructType#getUniqueID <em>Unique ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique ID</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.StructType#getUniqueID()
	 * @see #getStructType()
	 * @generated
	 */
	EAttribute getStructType_UniqueID();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.SubObjectType <em>Sub Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Object Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.SubObjectType
	 * @generated
	 */
	EClass getSubObjectType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.SubObjectType#getAccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.SubObjectType#getAccessType()
	 * @see #getSubObjectType()
	 * @generated
	 */
	EAttribute getSubObjectType_AccessType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.SubObjectType#getActualValue <em>Actual Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.SubObjectType#getActualValue()
	 * @see #getSubObjectType()
	 * @generated
	 */
	EAttribute getSubObjectType_ActualValue();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.SubObjectType#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.SubObjectType#getDataType()
	 * @see #getSubObjectType()
	 * @generated
	 */
	EAttribute getSubObjectType_DataType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.SubObjectType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.SubObjectType#getDefaultValue()
	 * @see #getSubObjectType()
	 * @generated
	 */
	EAttribute getSubObjectType_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.SubObjectType#getDenotation <em>Denotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Denotation</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.SubObjectType#getDenotation()
	 * @see #getSubObjectType()
	 * @generated
	 */
	EAttribute getSubObjectType_Denotation();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.SubObjectType#getHighLimit <em>High Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Limit</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.SubObjectType#getHighLimit()
	 * @see #getSubObjectType()
	 * @generated
	 */
	EAttribute getSubObjectType_HighLimit();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.SubObjectType#getLowLimit <em>Low Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Limit</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.SubObjectType#getLowLimit()
	 * @see #getSubObjectType()
	 * @generated
	 */
	EAttribute getSubObjectType_LowLimit();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.SubObjectType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.SubObjectType#getName()
	 * @see #getSubObjectType()
	 * @generated
	 */
	EAttribute getSubObjectType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.SubObjectType#getObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.SubObjectType#getObjectType()
	 * @see #getSubObjectType()
	 * @generated
	 */
	EAttribute getSubObjectType_ObjectType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.SubObjectType#getObjFlags <em>Obj Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obj Flags</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.SubObjectType#getObjFlags()
	 * @see #getSubObjectType()
	 * @generated
	 */
	EAttribute getSubObjectType_ObjFlags();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.SubObjectType#getPDOmapping <em>PD Omapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PD Omapping</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.SubObjectType#getPDOmapping()
	 * @see #getSubObjectType()
	 * @generated
	 */
	EAttribute getSubObjectType_PDOmapping();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.SubObjectType#getSubIndex <em>Sub Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Index</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.SubObjectType#getSubIndex()
	 * @see #getSubObjectType()
	 * @generated
	 */
	EAttribute getSubObjectType_SubIndex();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.SubObjectType#getUniqueIDRef <em>Unique ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique ID Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.SubObjectType#getUniqueIDRef()
	 * @see #getSubObjectType()
	 * @generated
	 */
	EAttribute getSubObjectType_UniqueIDRef();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TAllowedValues <em>TAllowed Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAllowed Values</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TAllowedValues
	 * @generated
	 */
	EClass getTAllowedValues();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TAllowedValues#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TAllowedValues#getValue()
	 * @see #getTAllowedValues()
	 * @generated
	 */
	EReference getTAllowedValues_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TAllowedValues#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Range</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TAllowedValues#getRange()
	 * @see #getTAllowedValues()
	 * @generated
	 */
	EReference getTAllowedValues_Range();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TAllowedValues#getTemplateIDRef <em>Template ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template ID Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TAllowedValues#getTemplateIDRef()
	 * @see #getTAllowedValues()
	 * @generated
	 */
	EAttribute getTAllowedValues_TemplateIDRef();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TAllowedValuesTemplate <em>TAllowed Values Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAllowed Values Template</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TAllowedValuesTemplate
	 * @generated
	 */
	EClass getTAllowedValuesTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TAllowedValuesTemplate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TAllowedValuesTemplate#getValue()
	 * @see #getTAllowedValuesTemplate()
	 * @generated
	 */
	EReference getTAllowedValuesTemplate_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TAllowedValuesTemplate#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Range</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TAllowedValuesTemplate#getRange()
	 * @see #getTAllowedValuesTemplate()
	 * @generated
	 */
	EReference getTAllowedValuesTemplate_Range();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TAllowedValuesTemplate#getUniqueID <em>Unique ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique ID</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TAllowedValuesTemplate#getUniqueID()
	 * @see #getTAllowedValuesTemplate()
	 * @generated
	 */
	EAttribute getTAllowedValuesTemplate_UniqueID();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TApplicationLayers <em>TApplication Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TApplication Layers</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TApplicationLayers
	 * @generated
	 */
	EClass getTApplicationLayers();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TApplicationLayers#getIdentity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identity</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TApplicationLayers#getIdentity()
	 * @see #getTApplicationLayers()
	 * @generated
	 */
	EReference getTApplicationLayers_Identity();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TApplicationLayers#getDataTypeList <em>Data Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TApplicationLayers#getDataTypeList()
	 * @see #getTApplicationLayers()
	 * @generated
	 */
	EReference getTApplicationLayers_DataTypeList();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TApplicationLayers#getObjectList <em>Object List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TApplicationLayers#getObjectList()
	 * @see #getTApplicationLayers()
	 * @generated
	 */
	EReference getTApplicationLayers_ObjectList();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TApplicationLayers#getDynamicChannels <em>Dynamic Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dynamic Channels</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TApplicationLayers#getDynamicChannels()
	 * @see #getTApplicationLayers()
	 * @generated
	 */
	EReference getTApplicationLayers_DynamicChannels();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TApplicationLayers#getCommunicationEntityType <em>Communication Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Entity Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TApplicationLayers#getCommunicationEntityType()
	 * @see #getTApplicationLayers()
	 * @generated
	 */
	EAttribute getTApplicationLayers_CommunicationEntityType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TApplicationLayers#getConformanceClass <em>Conformance Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conformance Class</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TApplicationLayers#getConformanceClass()
	 * @see #getTApplicationLayers()
	 * @generated
	 */
	EAttribute getTApplicationLayers_ConformanceClass();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TApplicationProcess <em>TApplication Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TApplication Process</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TApplicationProcess
	 * @generated
	 */
	EClass getTApplicationProcess();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TApplicationProcess#getDataTypeList <em>Data Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TApplicationProcess#getDataTypeList()
	 * @see #getTApplicationProcess()
	 * @generated
	 */
	EReference getTApplicationProcess_DataTypeList();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TApplicationProcess#getFunctionTypeList <em>Function Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function Type List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TApplicationProcess#getFunctionTypeList()
	 * @see #getTApplicationProcess()
	 * @generated
	 */
	EReference getTApplicationProcess_FunctionTypeList();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TApplicationProcess#getFunctionInstanceList <em>Function Instance List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function Instance List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TApplicationProcess#getFunctionInstanceList()
	 * @see #getTApplicationProcess()
	 * @generated
	 */
	EReference getTApplicationProcess_FunctionInstanceList();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TApplicationProcess#getTemplateList <em>Template List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TApplicationProcess#getTemplateList()
	 * @see #getTApplicationProcess()
	 * @generated
	 */
	EReference getTApplicationProcess_TemplateList();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TApplicationProcess#getParameterList <em>Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TApplicationProcess#getParameterList()
	 * @see #getTApplicationProcess()
	 * @generated
	 */
	EReference getTApplicationProcess_ParameterList();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TApplicationProcess#getParameterGroupList <em>Parameter Group List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Group List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TApplicationProcess#getParameterGroupList()
	 * @see #getTApplicationProcess()
	 * @generated
	 */
	EReference getTApplicationProcess_ParameterGroupList();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TCapabilities <em>TCapabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCapabilities</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCapabilities
	 * @generated
	 */
	EClass getTCapabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TCapabilities#getCharacteristicsList <em>Characteristics List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Characteristics List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCapabilities#getCharacteristicsList()
	 * @see #getTCapabilities()
	 * @generated
	 */
	EReference getTCapabilities_CharacteristicsList();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TCapabilities#getStandardComplianceList <em>Standard Compliance List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Standard Compliance List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCapabilities#getStandardComplianceList()
	 * @see #getTCapabilities()
	 * @generated
	 */
	EReference getTCapabilities_StandardComplianceList();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TClassificationList <em>TClassification List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TClassification List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TClassificationList
	 * @generated
	 */
	EClass getTClassificationList();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.TClassificationList#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Classification</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TClassificationList#getClassification()
	 * @see #getTClassificationList()
	 * @generated
	 */
	EAttribute getTClassificationList_Classification();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures <em>TCN Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCN Features</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCNFeatures
	 * @generated
	 */
	EClass getTCNFeatures();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#isDLLCNFeatureMultiplex <em>DLLCN Feature Multiplex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DLLCN Feature Multiplex</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCNFeatures#isDLLCNFeatureMultiplex()
	 * @see #getTCNFeatures()
	 * @generated
	 */
	EAttribute getTCNFeatures_DLLCNFeatureMultiplex();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#isDLLCNPResChaining <em>DLLCNP Res Chaining</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DLLCNP Res Chaining</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCNFeatures#isDLLCNPResChaining()
	 * @see #getTCNFeatures()
	 * @generated
	 */
	EAttribute getTCNFeatures_DLLCNPResChaining();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#isNMTCNDNA <em>NMTCNDNA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMTCNDNA</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCNFeatures#isNMTCNDNA()
	 * @see #getTCNFeatures()
	 * @generated
	 */
	EAttribute getTCNFeatures_NMTCNDNA();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#getNMTCNMaxAInv <em>NMTCN Max AInv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMTCN Max AInv</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCNFeatures#getNMTCNMaxAInv()
	 * @see #getTCNFeatures()
	 * @generated
	 */
	EAttribute getTCNFeatures_NMTCNMaxAInv();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#getNMTCNPreOp2ToReady2Op <em>NMTCN Pre Op2 To Ready2 Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMTCN Pre Op2 To Ready2 Op</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCNFeatures#getNMTCNPreOp2ToReady2Op()
	 * @see #getTCNFeatures()
	 * @generated
	 */
	EAttribute getTCNFeatures_NMTCNPreOp2ToReady2Op();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#getNMTCNSetNodeNumberTime <em>NMTCN Set Node Number Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMTCN Set Node Number Time</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCNFeatures#getNMTCNSetNodeNumberTime()
	 * @see #getTCNFeatures()
	 * @generated
	 */
	EAttribute getTCNFeatures_NMTCNSetNodeNumberTime();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures#getNMTCNSoC2PReq <em>NMTCN So C2P Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMTCN So C2P Req</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCNFeatures#getNMTCNSoC2PReq()
	 * @see #getTCNFeatures()
	 * @generated
	 */
	EAttribute getTCNFeatures_NMTCNSoC2PReq();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TCombinedState <em>TCombined State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCombined State</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCombinedState
	 * @generated
	 */
	EClass getTCombinedState();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.TCombinedState#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCombinedState#getGroup()
	 * @see #getTCombinedState()
	 * @generated
	 */
	EAttribute getTCombinedState_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TCombinedState#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCombinedState#getLabel()
	 * @see #getTCombinedState()
	 * @generated
	 */
	EReference getTCombinedState_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TCombinedState#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCombinedState#getDescription()
	 * @see #getTCombinedState()
	 * @generated
	 */
	EReference getTCombinedState_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TCombinedState#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCombinedState#getLabelRef()
	 * @see #getTCombinedState()
	 * @generated
	 */
	EReference getTCombinedState_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TCombinedState#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCombinedState#getDescriptionRef()
	 * @see #getTCombinedState()
	 * @generated
	 */
	EReference getTCombinedState_DescriptionRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TCombinedState#getLEDstateRef <em>LE Dstate Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>LE Dstate Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCombinedState#getLEDstateRef()
	 * @see #getTCombinedState()
	 * @generated
	 */
	EReference getTCombinedState_LEDstateRef();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TConditionalSupport <em>TConditional Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TConditional Support</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TConditionalSupport
	 * @generated
	 */
	EClass getTConditionalSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TConditionalSupport#getParamIDRef <em>Param ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param ID Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TConditionalSupport#getParamIDRef()
	 * @see #getTConditionalSupport()
	 * @generated
	 */
	EAttribute getTConditionalSupport_ParamIDRef();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TConnectorList <em>TConnector List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TConnector List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TConnectorList
	 * @generated
	 */
	EClass getTConnectorList();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TConnectorList#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TConnectorList#getConnector()
	 * @see #getTConnectorList()
	 * @generated
	 */
	EReference getTConnectorList_Connector();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TCount <em>TCount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCount</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCount
	 * @generated
	 */
	EClass getTCount();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.TCount#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCount#getGroup()
	 * @see #getTCount()
	 * @generated
	 */
	EAttribute getTCount_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TCount#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCount#getLabel()
	 * @see #getTCount()
	 * @generated
	 */
	EReference getTCount_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TCount#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCount#getDescription()
	 * @see #getTCount()
	 * @generated
	 */
	EReference getTCount_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TCount#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCount#getLabelRef()
	 * @see #getTCount()
	 * @generated
	 */
	EReference getTCount_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TCount#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCount#getDescriptionRef()
	 * @see #getTCount()
	 * @generated
	 */
	EReference getTCount_DescriptionRef();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TCount#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCount#getDefaultValue()
	 * @see #getTCount()
	 * @generated
	 */
	EReference getTCount_DefaultValue();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TCount#getAllowedValues <em>Allowed Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allowed Values</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCount#getAllowedValues()
	 * @see #getTCount()
	 * @generated
	 */
	EReference getTCount_AllowedValues();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TCount#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCount#getAccess()
	 * @see #getTCount()
	 * @generated
	 */
	EAttribute getTCount_Access();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TCount#getUniqueID <em>Unique ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique ID</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCount#getUniqueID()
	 * @see #getTCount()
	 * @generated
	 */
	EAttribute getTCount_UniqueID();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypeIDRef <em>TData Type ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TData Type ID Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypeIDRef
	 * @generated
	 */
	EClass getTDataTypeIDRef();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypeIDRef#getUniqueIDRef <em>Unique ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique ID Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypeIDRef#getUniqueIDRef()
	 * @see #getTDataTypeIDRef()
	 * @generated
	 */
	EAttribute getTDataTypeIDRef_UniqueIDRef();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypeList <em>TData Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TData Type List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypeList
	 * @generated
	 */
	EClass getTDataTypeList();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypeList#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypeList#getGroup()
	 * @see #getTDataTypeList()
	 * @generated
	 */
	EAttribute getTDataTypeList_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypeList#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypeList#getArray()
	 * @see #getTDataTypeList()
	 * @generated
	 */
	EReference getTDataTypeList_Array();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypeList#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypeList#getStruct()
	 * @see #getTDataTypeList()
	 * @generated
	 */
	EReference getTDataTypeList_Struct();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypeList#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypeList#getEnum()
	 * @see #getTDataTypeList()
	 * @generated
	 */
	EReference getTDataTypeList_Enum();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypeList#getDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Derived</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypeList#getDerived()
	 * @see #getTDataTypeList()
	 * @generated
	 */
	EReference getTDataTypeList_Derived();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes <em>TData Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TData Types</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes
	 * @generated
	 */
	EClass getTDataTypes();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes#getBoolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes#getBoolean()
	 * @see #getTDataTypes()
	 * @generated
	 */
	EReference getTDataTypes_Boolean();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes#getInteger8 <em>Integer8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer8</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes#getInteger8()
	 * @see #getTDataTypes()
	 * @generated
	 */
	EReference getTDataTypes_Integer8();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes#getInteger16 <em>Integer16</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer16</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes#getInteger16()
	 * @see #getTDataTypes()
	 * @generated
	 */
	EReference getTDataTypes_Integer16();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes#getInteger32 <em>Integer32</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer32</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes#getInteger32()
	 * @see #getTDataTypes()
	 * @generated
	 */
	EReference getTDataTypes_Integer32();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes#getInteger24 <em>Integer24</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer24</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes#getInteger24()
	 * @see #getTDataTypes()
	 * @generated
	 */
	EReference getTDataTypes_Integer24();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes#getInteger40 <em>Integer40</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer40</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes#getInteger40()
	 * @see #getTDataTypes()
	 * @generated
	 */
	EReference getTDataTypes_Integer40();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes#getInteger48 <em>Integer48</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer48</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes#getInteger48()
	 * @see #getTDataTypes()
	 * @generated
	 */
	EReference getTDataTypes_Integer48();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes#getInteger56 <em>Integer56</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer56</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes#getInteger56()
	 * @see #getTDataTypes()
	 * @generated
	 */
	EReference getTDataTypes_Integer56();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes#getInteger64 <em>Integer64</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer64</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes#getInteger64()
	 * @see #getTDataTypes()
	 * @generated
	 */
	EReference getTDataTypes_Integer64();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes#getUnsigned8 <em>Unsigned8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unsigned8</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes#getUnsigned8()
	 * @see #getTDataTypes()
	 * @generated
	 */
	EReference getTDataTypes_Unsigned8();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes#getUnsigned16 <em>Unsigned16</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unsigned16</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes#getUnsigned16()
	 * @see #getTDataTypes()
	 * @generated
	 */
	EReference getTDataTypes_Unsigned16();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes#getUnsigned32 <em>Unsigned32</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unsigned32</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes#getUnsigned32()
	 * @see #getTDataTypes()
	 * @generated
	 */
	EReference getTDataTypes_Unsigned32();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes#getUnsigned24 <em>Unsigned24</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unsigned24</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes#getUnsigned24()
	 * @see #getTDataTypes()
	 * @generated
	 */
	EReference getTDataTypes_Unsigned24();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes#getUnsigned40 <em>Unsigned40</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unsigned40</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes#getUnsigned40()
	 * @see #getTDataTypes()
	 * @generated
	 */
	EReference getTDataTypes_Unsigned40();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes#getUnsigned48 <em>Unsigned48</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unsigned48</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes#getUnsigned48()
	 * @see #getTDataTypes()
	 * @generated
	 */
	EReference getTDataTypes_Unsigned48();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes#getUnsigned56 <em>Unsigned56</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unsigned56</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes#getUnsigned56()
	 * @see #getTDataTypes()
	 * @generated
	 */
	EReference getTDataTypes_Unsigned56();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes#getUnsigned64 <em>Unsigned64</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unsigned64</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes#getUnsigned64()
	 * @see #getTDataTypes()
	 * @generated
	 */
	EReference getTDataTypes_Unsigned64();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes#getReal32 <em>Real32</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Real32</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes#getReal32()
	 * @see #getTDataTypes()
	 * @generated
	 */
	EReference getTDataTypes_Real32();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes#getReal64 <em>Real64</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Real64</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes#getReal64()
	 * @see #getTDataTypes()
	 * @generated
	 */
	EReference getTDataTypes_Real64();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes#getVisibleString <em>Visible String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Visible String</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes#getVisibleString()
	 * @see #getTDataTypes()
	 * @generated
	 */
	EReference getTDataTypes_VisibleString();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes#getOctetString <em>Octet String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Octet String</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes#getOctetString()
	 * @see #getTDataTypes()
	 * @generated
	 */
	EReference getTDataTypes_OctetString();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes#getUnicodeString <em>Unicode String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unicode String</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes#getUnicodeString()
	 * @see #getTDataTypes()
	 * @generated
	 */
	EReference getTDataTypes_UnicodeString();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes#getTimeOfDay <em>Time Of Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Of Day</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes#getTimeOfDay()
	 * @see #getTDataTypes()
	 * @generated
	 */
	EReference getTDataTypes_TimeOfDay();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes#getTimeDiff <em>Time Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Diff</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes#getTimeDiff()
	 * @see #getTDataTypes()
	 * @generated
	 */
	EReference getTDataTypes_TimeDiff();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes#getDomain()
	 * @see #getTDataTypes()
	 * @generated
	 */
	EReference getTDataTypes_Domain();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes#getMACADDRESS <em>MACADDRESS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MACADDRESS</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes#getMACADDRESS()
	 * @see #getTDataTypes()
	 * @generated
	 */
	EReference getTDataTypes_MACADDRESS();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes#getIPADDRESS <em>IPADDRESS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IPADDRESS</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes#getIPADDRESS()
	 * @see #getTDataTypes()
	 * @generated
	 */
	EReference getTDataTypes_IPADDRESS();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes#getNETTIME <em>NETTIME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>NETTIME</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes#getNETTIME()
	 * @see #getTDataTypes()
	 * @generated
	 */
	EReference getTDataTypes_NETTIME();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes#getDataType()
	 * @see #getTDataTypes()
	 * @generated
	 */
	EAttribute getTDataTypes_DataType();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TDenotation <em>TDenotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDenotation</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDenotation
	 * @generated
	 */
	EClass getTDenotation();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.TDenotation#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDenotation#getGroup()
	 * @see #getTDenotation()
	 * @generated
	 */
	EAttribute getTDenotation_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TDenotation#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDenotation#getLabel()
	 * @see #getTDenotation()
	 * @generated
	 */
	EReference getTDenotation_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TDenotation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDenotation#getDescription()
	 * @see #getTDenotation()
	 * @generated
	 */
	EReference getTDenotation_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TDenotation#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDenotation#getLabelRef()
	 * @see #getTDenotation()
	 * @generated
	 */
	EReference getTDenotation_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TDenotation#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDenotation#getDescriptionRef()
	 * @see #getTDenotation()
	 * @generated
	 */
	EReference getTDenotation_DescriptionRef();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning <em>TDevice Commissioning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDevice Commissioning</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning
	 * @generated
	 */
	EClass getTDeviceCommissioning();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning#getNetworkName <em>Network Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Name</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning#getNetworkName()
	 * @see #getTDeviceCommissioning()
	 * @generated
	 */
	EAttribute getTDeviceCommissioning_NetworkName();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning#getNodeID <em>Node ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node ID</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning#getNodeID()
	 * @see #getTDeviceCommissioning()
	 * @generated
	 */
	EAttribute getTDeviceCommissioning_NodeID();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning#getNodeName <em>Node Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Name</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning#getNodeName()
	 * @see #getTDeviceCommissioning()
	 * @generated
	 */
	EAttribute getTDeviceCommissioning_NodeName();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning#getNodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning#getNodeType()
	 * @see #getTDeviceCommissioning()
	 * @generated
	 */
	EAttribute getTDeviceCommissioning_NodeType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning#getUsedNetworkInterface <em>Used Network Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Used Network Interface</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning#getUsedNetworkInterface()
	 * @see #getTDeviceCommissioning()
	 * @generated
	 */
	EAttribute getTDeviceCommissioning_UsedNetworkInterface();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFamily <em>TDevice Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDevice Family</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceFamily
	 * @generated
	 */
	EClass getTDeviceFamily();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFamily#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceFamily#getGroup()
	 * @see #getTDeviceFamily()
	 * @generated
	 */
	EAttribute getTDeviceFamily_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFamily#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceFamily#getLabel()
	 * @see #getTDeviceFamily()
	 * @generated
	 */
	EReference getTDeviceFamily_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFamily#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceFamily#getDescription()
	 * @see #getTDeviceFamily()
	 * @generated
	 */
	EReference getTDeviceFamily_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFamily#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceFamily#getLabelRef()
	 * @see #getTDeviceFamily()
	 * @generated
	 */
	EReference getTDeviceFamily_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFamily#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceFamily#getDescriptionRef()
	 * @see #getTDeviceFamily()
	 * @generated
	 */
	EReference getTDeviceFamily_DescriptionRef();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFamily#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceFamily#isReadOnly()
	 * @see #getTDeviceFamily()
	 * @generated
	 */
	EAttribute getTDeviceFamily_ReadOnly();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFunction <em>TDevice Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDevice Function</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceFunction
	 * @generated
	 */
	EClass getTDeviceFunction();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFunction#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capabilities</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceFunction#getCapabilities()
	 * @see #getTDeviceFunction()
	 * @generated
	 */
	EReference getTDeviceFunction_Capabilities();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFunction#getPicturesList <em>Pictures List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pictures List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceFunction#getPicturesList()
	 * @see #getTDeviceFunction()
	 * @generated
	 */
	EReference getTDeviceFunction_PicturesList();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFunction#getDictionaryList <em>Dictionary List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dictionary List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceFunction#getDictionaryList()
	 * @see #getTDeviceFunction()
	 * @generated
	 */
	EReference getTDeviceFunction_DictionaryList();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFunction#getConnectorList <em>Connector List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connector List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceFunction#getConnectorList()
	 * @see #getTDeviceFunction()
	 * @generated
	 */
	EReference getTDeviceFunction_ConnectorList();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFunction#getFirmwareList <em>Firmware List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Firmware List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceFunction#getFirmwareList()
	 * @see #getTDeviceFunction()
	 * @generated
	 */
	EReference getTDeviceFunction_FirmwareList();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFunction#getClassificationList <em>Classification List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceFunction#getClassificationList()
	 * @see #getTDeviceFunction()
	 * @generated
	 */
	EReference getTDeviceFunction_ClassificationList();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity <em>TDevice Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDevice Identity</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity
	 * @generated
	 */
	EClass getTDeviceIdentity();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getVendorName <em>Vendor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vendor Name</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getVendorName()
	 * @see #getTDeviceIdentity()
	 * @generated
	 */
	EReference getTDeviceIdentity_VendorName();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getVendorID <em>Vendor ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vendor ID</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getVendorID()
	 * @see #getTDeviceIdentity()
	 * @generated
	 */
	EReference getTDeviceIdentity_VendorID();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getVendorText <em>Vendor Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vendor Text</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getVendorText()
	 * @see #getTDeviceIdentity()
	 * @generated
	 */
	EReference getTDeviceIdentity_VendorText();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getDeviceFamily <em>Device Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Family</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getDeviceFamily()
	 * @see #getTDeviceIdentity()
	 * @generated
	 */
	EReference getTDeviceIdentity_DeviceFamily();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getProductFamily <em>Product Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Product Family</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getProductFamily()
	 * @see #getTDeviceIdentity()
	 * @generated
	 */
	EReference getTDeviceIdentity_ProductFamily();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getProductName <em>Product Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Product Name</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getProductName()
	 * @see #getTDeviceIdentity()
	 * @generated
	 */
	EReference getTDeviceIdentity_ProductName();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getProductID <em>Product ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Product ID</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getProductID()
	 * @see #getTDeviceIdentity()
	 * @generated
	 */
	EReference getTDeviceIdentity_ProductID();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getProductText <em>Product Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Product Text</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getProductText()
	 * @see #getTDeviceIdentity()
	 * @generated
	 */
	EReference getTDeviceIdentity_ProductText();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getOrderNumber <em>Order Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Order Number</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getOrderNumber()
	 * @see #getTDeviceIdentity()
	 * @generated
	 */
	EReference getTDeviceIdentity_OrderNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Version</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getVersion()
	 * @see #getTDeviceIdentity()
	 * @generated
	 */
	EReference getTDeviceIdentity_Version();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getBuildDate <em>Build Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Build Date</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getBuildDate()
	 * @see #getTDeviceIdentity()
	 * @generated
	 */
	EAttribute getTDeviceIdentity_BuildDate();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getSpecificationRevision <em>Specification Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification Revision</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getSpecificationRevision()
	 * @see #getTDeviceIdentity()
	 * @generated
	 */
	EReference getTDeviceIdentity_SpecificationRevision();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getInstanceName <em>Instance Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instance Name</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity#getInstanceName()
	 * @see #getTDeviceIdentity()
	 * @generated
	 */
	EReference getTDeviceIdentity_InstanceName();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceManager <em>TDevice Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDevice Manager</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceManager
	 * @generated
	 */
	EClass getTDeviceManager();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceManager#getIndicatorList <em>Indicator List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Indicator List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceManager#getIndicatorList()
	 * @see #getTDeviceManager()
	 * @generated
	 */
	EReference getTDeviceManager_IndicatorList();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TDiagnostic <em>TDiagnostic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDiagnostic</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDiagnostic
	 * @generated
	 */
	EClass getTDiagnostic();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.TDiagnostic#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDiagnostic#getGroup()
	 * @see #getTDiagnostic()
	 * @generated
	 */
	EAttribute getTDiagnostic_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TDiagnostic#getErrorList <em>Error List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDiagnostic#getErrorList()
	 * @see #getTDiagnostic()
	 * @generated
	 */
	EReference getTDiagnostic_ErrorList();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TDiagnostic#getStaticErrorBitField <em>Static Error Bit Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Static Error Bit Field</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDiagnostic#getStaticErrorBitField()
	 * @see #getTDiagnostic()
	 * @generated
	 */
	EReference getTDiagnostic_StaticErrorBitField();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TDictionaryList <em>TDictionary List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDictionary List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDictionaryList
	 * @generated
	 */
	EClass getTDictionaryList();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TDictionaryList#getDictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dictionary</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDictionaryList#getDictionary()
	 * @see #getTDictionaryList()
	 * @generated
	 */
	EReference getTDictionaryList_Dictionary();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TDynamicChannel <em>TDynamic Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDynamic Channel</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDynamicChannel
	 * @generated
	 */
	EClass getTDynamicChannel();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getAccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getAccessType()
	 * @see #getTDynamicChannel()
	 * @generated
	 */
	EAttribute getTDynamicChannel_AccessType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getAddressOffset <em>Address Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Offset</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getAddressOffset()
	 * @see #getTDynamicChannel()
	 * @generated
	 */
	EAttribute getTDynamicChannel_AddressOffset();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getBitAlignment <em>Bit Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bit Alignment</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getBitAlignment()
	 * @see #getTDynamicChannel()
	 * @generated
	 */
	EAttribute getTDynamicChannel_BitAlignment();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getDataType()
	 * @see #getTDynamicChannel()
	 * @generated
	 */
	EAttribute getTDynamicChannel_DataType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getEndIndex <em>End Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Index</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getEndIndex()
	 * @see #getTDynamicChannel()
	 * @generated
	 */
	EAttribute getTDynamicChannel_EndIndex();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getMaxNumber <em>Max Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Number</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getMaxNumber()
	 * @see #getTDynamicChannel()
	 * @generated
	 */
	EAttribute getTDynamicChannel_MaxNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getStartIndex <em>Start Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Index</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDynamicChannel#getStartIndex()
	 * @see #getTDynamicChannel()
	 * @generated
	 */
	EAttribute getTDynamicChannel_StartIndex();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TEnumValue <em>TEnum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEnum Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TEnumValue
	 * @generated
	 */
	EClass getTEnumValue();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.TEnumValue#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TEnumValue#getGroup()
	 * @see #getTEnumValue()
	 * @generated
	 */
	EAttribute getTEnumValue_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TEnumValue#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TEnumValue#getLabel()
	 * @see #getTEnumValue()
	 * @generated
	 */
	EReference getTEnumValue_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TEnumValue#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TEnumValue#getDescription()
	 * @see #getTEnumValue()
	 * @generated
	 */
	EReference getTEnumValue_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TEnumValue#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TEnumValue#getLabelRef()
	 * @see #getTEnumValue()
	 * @generated
	 */
	EReference getTEnumValue_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TEnumValue#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TEnumValue#getDescriptionRef()
	 * @see #getTEnumValue()
	 * @generated
	 */
	EReference getTEnumValue_DescriptionRef();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TEnumValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TEnumValue#getValue()
	 * @see #getTEnumValue()
	 * @generated
	 */
	EAttribute getTEnumValue_Value();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TextEntryType <em>Text Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Entry Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TextEntryType
	 * @generated
	 */
	EClass getTextEntryType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TextEntryType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TextEntryType#getValue()
	 * @see #getTextEntryType()
	 * @generated
	 */
	EAttribute getTextEntryType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TextEntryType#getTextID <em>Text ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text ID</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TextEntryType#getTextID()
	 * @see #getTextEntryType()
	 * @generated
	 */
	EAttribute getTextEntryType_TextID();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TextResourceType <em>Text Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Resource Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TextResourceType
	 * @generated
	 */
	EClass getTextResourceType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TextResourceType#getTextEntry <em>Text Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text Entry</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TextResourceType#getTextEntry()
	 * @see #getTextResourceType()
	 * @generated
	 */
	EReference getTextResourceType_TextEntry();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TextResourceType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TextResourceType#getLang()
	 * @see #getTextResourceType()
	 * @generated
	 */
	EAttribute getTextResourceType_Lang();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TFirmwareList <em>TFirmware List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TFirmware List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TFirmwareList
	 * @generated
	 */
	EClass getTFirmwareList();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TFirmwareList#getFirmware <em>Firmware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Firmware</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TFirmwareList#getFirmware()
	 * @see #getTFirmwareList()
	 * @generated
	 */
	EReference getTFirmwareList_Firmware();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TFunctionInstanceList <em>TFunction Instance List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TFunction Instance List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TFunctionInstanceList
	 * @generated
	 */
	EClass getTFunctionInstanceList();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TFunctionInstanceList#getFunctionInstance <em>Function Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Instance</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TFunctionInstanceList#getFunctionInstance()
	 * @see #getTFunctionInstanceList()
	 * @generated
	 */
	EReference getTFunctionInstanceList_FunctionInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TFunctionInstanceList#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TFunctionInstanceList#getConnection()
	 * @see #getTFunctionInstanceList()
	 * @generated
	 */
	EReference getTFunctionInstanceList_Connection();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TFunctionTypeList <em>TFunction Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TFunction Type List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TFunctionTypeList
	 * @generated
	 */
	EClass getTFunctionTypeList();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TFunctionTypeList#getFunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TFunctionTypeList#getFunctionType()
	 * @see #getTFunctionTypeList()
	 * @generated
	 */
	EReference getTFunctionTypeList_FunctionType();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures <em>TGeneral Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGeneral Features</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures
	 * @generated
	 */
	EClass getTGeneralFeatures();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isCFMConfigManager <em>CFM Config Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CFM Config Manager</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isCFMConfigManager()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_CFMConfigManager();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isDLLErrBadPhysMode <em>DLL Err Bad Phys Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DLL Err Bad Phys Mode</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isDLLErrBadPhysMode()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_DLLErrBadPhysMode();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isDLLErrMacBuffer <em>DLL Err Mac Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DLL Err Mac Buffer</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isDLLErrMacBuffer()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_DLLErrMacBuffer();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isDLLFeatureCN <em>DLL Feature CN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DLL Feature CN</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isDLLFeatureCN()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_DLLFeatureCN();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isDLLFeatureMN <em>DLL Feature MN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DLL Feature MN</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isDLLFeatureMN()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_DLLFeatureMN();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isDLLMultiplePReqPRes <em>DLL Multiple PReq PRes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DLL Multiple PReq PRes</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isDLLMultiplePReqPRes()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_DLLMultiplePReqPRes();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getNMTBootTimeNotActive <em>NMT Boot Time Not Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Boot Time Not Active</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getNMTBootTimeNotActive()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NMTBootTimeNotActive();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getNMTCycleTimeGranularity <em>NMT Cycle Time Granularity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Cycle Time Granularity</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getNMTCycleTimeGranularity()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NMTCycleTimeGranularity();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getNMTCycleTimeMax <em>NMT Cycle Time Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Cycle Time Max</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getNMTCycleTimeMax()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NMTCycleTimeMax();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getNMTCycleTimeMin <em>NMT Cycle Time Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Cycle Time Min</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getNMTCycleTimeMin()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NMTCycleTimeMin();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getNMTEmergencyQueueSize <em>NMT Emergency Queue Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Emergency Queue Size</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getNMTEmergencyQueueSize()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NMTEmergencyQueueSize();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getNMTErrorEntries <em>NMT Error Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Error Entries</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getNMTErrorEntries()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NMTErrorEntries();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTExtNmtCmds <em>NMT Ext Nmt Cmds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Ext Nmt Cmds</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTExtNmtCmds()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NMTExtNmtCmds();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTFlushArpEntry <em>NMT Flush Arp Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Flush Arp Entry</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTFlushArpEntry()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NMTFlushArpEntry();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTIsochronous <em>NMT Isochronous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Isochronous</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTIsochronous()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NMTIsochronous();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getNMTMaxCNNodeID <em>NMT Max CN Node ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Max CN Node ID</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getNMTMaxCNNodeID()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NMTMaxCNNodeID();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getNMTMaxCNNumber <em>NMT Max CN Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Max CN Number</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getNMTMaxCNNumber()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NMTMaxCNNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getNMTMaxHeartbeats <em>NMT Max Heartbeats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Max Heartbeats</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getNMTMaxHeartbeats()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NMTMaxHeartbeats();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getNMTMinRedCycleTime <em>NMT Min Red Cycle Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Min Red Cycle Time</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getNMTMinRedCycleTime()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NMTMinRedCycleTime();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTNetHostNameSet <em>NMT Net Host Name Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Net Host Name Set</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTNetHostNameSet()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NMTNetHostNameSet();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTNodeIDByHW <em>NMT Node ID By HW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Node ID By HW</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTNodeIDByHW()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NMTNodeIDByHW();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTNodeIDBySW <em>NMT Node ID By SW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Node ID By SW</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTNodeIDBySW()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NMTNodeIDBySW();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getNMTProductCode <em>NMT Product Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Product Code</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getNMTProductCode()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NMTProductCode();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTPublishActiveNodes <em>NMT Publish Active Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Publish Active Nodes</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTPublishActiveNodes()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NMTPublishActiveNodes();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTPublishConfigNodes <em>NMT Publish Config Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Publish Config Nodes</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTPublishConfigNodes()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NMTPublishConfigNodes();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTPublishEmergencyNew <em>NMT Publish Emergency New</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Publish Emergency New</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTPublishEmergencyNew()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NMTPublishEmergencyNew();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTPublishNodeState <em>NMT Publish Node State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Publish Node State</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTPublishNodeState()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NMTPublishNodeState();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTPublishOperational <em>NMT Publish Operational</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Publish Operational</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTPublishOperational()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NMTPublishOperational();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTPublishPreOp1 <em>NMT Publish Pre Op1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Publish Pre Op1</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTPublishPreOp1()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NMTPublishPreOp1();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTPublishPreOp2 <em>NMT Publish Pre Op2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Publish Pre Op2</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTPublishPreOp2()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NMTPublishPreOp2();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTPublishReadyToOp <em>NMT Publish Ready To Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Publish Ready To Op</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTPublishReadyToOp()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NMTPublishReadyToOp();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTPublishStopped <em>NMT Publish Stopped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Publish Stopped</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTPublishStopped()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NMTPublishStopped();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTPublishTime <em>NMT Publish Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Publish Time</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNMTPublishTime()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NMTPublishTime();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getNMTRevisionNo <em>NMT Revision No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Revision No</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getNMTRevisionNo()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NMTRevisionNo();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNWLForward <em>NWL Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NWL Forward</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNWLForward()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NWLForward();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNWLICMPSupport <em>NWLICMP Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NWLICMP Support</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNWLICMPSupport()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NWLICMPSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNWLIPSupport <em>NWLIP Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NWLIP Support</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isNWLIPSupport()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_NWLIPSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isPDODynamicMapping <em>PDO Dynamic Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PDO Dynamic Mapping</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isPDODynamicMapping()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_PDODynamicMapping();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getPDOGranularity <em>PDO Granularity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PDO Granularity</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getPDOGranularity()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_PDOGranularity();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getPDOMaxDescrMem <em>PDO Max Descr Mem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PDO Max Descr Mem</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getPDOMaxDescrMem()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_PDOMaxDescrMem();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getPDORPDOChannelObjects <em>PDORPDO Channel Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PDORPDO Channel Objects</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getPDORPDOChannelObjects()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_PDORPDOChannelObjects();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getPDORPDOChannels <em>PDORPDO Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PDORPDO Channels</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getPDORPDOChannels()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_PDORPDOChannels();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getPDORPDOCycleDataLim <em>PDORPDO Cycle Data Lim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PDORPDO Cycle Data Lim</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getPDORPDOCycleDataLim()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_PDORPDOCycleDataLim();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getPDORPDOOverallObjects <em>PDORPDO Overall Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PDORPDO Overall Objects</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getPDORPDOOverallObjects()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_PDORPDOOverallObjects();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isPDOSelfReceipt <em>PDO Self Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PDO Self Receipt</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isPDOSelfReceipt()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_PDOSelfReceipt();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getPDOTPDOChannelObjects <em>PDOTPDO Channel Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PDOTPDO Channel Objects</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getPDOTPDOChannelObjects()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_PDOTPDOChannelObjects();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getPDOTPDOCycleDataLim <em>PDOTPDO Cycle Data Lim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PDOTPDO Cycle Data Lim</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getPDOTPDOCycleDataLim()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_PDOTPDOCycleDataLim();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getPDOTPDOOverallObjects <em>PDOTPDO Overall Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PDOTPDO Overall Objects</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getPDOTPDOOverallObjects()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_PDOTPDOOverallObjects();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getPHYExtEPLPorts <em>PHY Ext EPL Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PHY Ext EPL Ports</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getPHYExtEPLPorts()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_PHYExtEPLPorts();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getPHYHubDelay <em>PHY Hub Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PHY Hub Delay</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getPHYHubDelay()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_PHYHubDelay();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isPHYHubIntegrated <em>PHY Hub Integrated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PHY Hub Integrated</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isPHYHubIntegrated()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_PHYHubIntegrated();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getPHYHubJitter <em>PHY Hub Jitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PHY Hub Jitter</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getPHYHubJitter()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_PHYHubJitter();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isRT1RT1SecuritySupport <em>RT1RT1 Security Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RT1RT1 Security Support</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isRT1RT1SecuritySupport()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_RT1RT1SecuritySupport();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isRT1RT1Support <em>RT1RT1 Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RT1RT1 Support</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isRT1RT1Support()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_RT1RT1Support();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isRT2RT2Support <em>RT2RT2 Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RT2RT2 Support</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isRT2RT2Support()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_RT2RT2Support();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isSDOClient <em>SDO Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SDO Client</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isSDOClient()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_SDOClient();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isSDOCmdFileRead <em>SDO Cmd File Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SDO Cmd File Read</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isSDOCmdFileRead()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_SDOCmdFileRead();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isSDOCmdFileWrite <em>SDO Cmd File Write</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SDO Cmd File Write</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isSDOCmdFileWrite()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_SDOCmdFileWrite();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isSDOCmdLinkName <em>SDO Cmd Link Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SDO Cmd Link Name</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isSDOCmdLinkName()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_SDOCmdLinkName();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isSDOCmdReadAllByIndex <em>SDO Cmd Read All By Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SDO Cmd Read All By Index</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isSDOCmdReadAllByIndex()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_SDOCmdReadAllByIndex();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isSDOCmdReadByName <em>SDO Cmd Read By Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SDO Cmd Read By Name</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isSDOCmdReadByName()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_SDOCmdReadByName();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isSDOCmdReadMultParam <em>SDO Cmd Read Mult Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SDO Cmd Read Mult Param</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isSDOCmdReadMultParam()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_SDOCmdReadMultParam();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isSDOCmdWriteAllByIndex <em>SDO Cmd Write All By Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SDO Cmd Write All By Index</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isSDOCmdWriteAllByIndex()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_SDOCmdWriteAllByIndex();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isSDOCmdWriteByName <em>SDO Cmd Write By Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SDO Cmd Write By Name</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isSDOCmdWriteByName()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_SDOCmdWriteByName();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isSDOCmdWriteMultParam <em>SDO Cmd Write Mult Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SDO Cmd Write Mult Param</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isSDOCmdWriteMultParam()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_SDOCmdWriteMultParam();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getSDOMaxConnections <em>SDO Max Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SDO Max Connections</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getSDOMaxConnections()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_SDOMaxConnections();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getSDOMaxParallelConnections <em>SDO Max Parallel Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SDO Max Parallel Connections</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getSDOMaxParallelConnections()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_SDOMaxParallelConnections();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getSDOSeqLayerTxHistorySize <em>SDO Seq Layer Tx History Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SDO Seq Layer Tx History Size</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#getSDOSeqLayerTxHistorySize()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_SDOSeqLayerTxHistorySize();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isSDOServer <em>SDO Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SDO Server</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isSDOServer()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_SDOServer();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isSDOSupportASnd <em>SDO Support ASnd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SDO Support ASnd</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isSDOSupportASnd()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_SDOSupportASnd();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isSDOSupportPDO <em>SDO Support PDO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SDO Support PDO</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isSDOSupportPDO()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_SDOSupportPDO();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isSDOSupportUdpIp <em>SDO Support Udp Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SDO Support Udp Ip</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures#isSDOSupportUdpIp()
	 * @see #getTGeneralFeatures()
	 * @generated
	 */
	EAttribute getTGeneralFeatures_SDOSupportUdpIp();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TIndicatorList <em>TIndicator List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TIndicator List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TIndicatorList
	 * @generated
	 */
	EClass getTIndicatorList();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TIndicatorList#getLEDList <em>LED List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LED List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TIndicatorList#getLEDList()
	 * @see #getTIndicatorList()
	 * @generated
	 */
	EReference getTIndicatorList_LEDList();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TLED <em>TLED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TLED</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TLED
	 * @generated
	 */
	EClass getTLED();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.TLED#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TLED#getGroup()
	 * @see #getTLED()
	 * @generated
	 */
	EAttribute getTLED_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TLED#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TLED#getLabel()
	 * @see #getTLED()
	 * @generated
	 */
	EReference getTLED_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TLED#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TLED#getDescription()
	 * @see #getTLED()
	 * @generated
	 */
	EReference getTLED_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TLED#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TLED#getLabelRef()
	 * @see #getTLED()
	 * @generated
	 */
	EReference getTLED_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TLED#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TLED#getDescriptionRef()
	 * @see #getTLED()
	 * @generated
	 */
	EReference getTLED_DescriptionRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TLED#getLEDstate <em>LE Dstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>LE Dstate</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TLED#getLEDstate()
	 * @see #getTLED()
	 * @generated
	 */
	EReference getTLED_LEDstate();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TLED#getLEDcolors <em>LE Dcolors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LE Dcolors</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TLED#getLEDcolors()
	 * @see #getTLED()
	 * @generated
	 */
	EAttribute getTLED_LEDcolors();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TLED#getLEDtype <em>LE Dtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LE Dtype</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TLED#getLEDtype()
	 * @see #getTLED()
	 * @generated
	 */
	EAttribute getTLED_LEDtype();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures <em>TMN Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMN Features</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TMNFeatures
	 * @generated
	 */
	EClass getTMNFeatures();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isDLLErrMNMultipleMN <em>DLL Err MN Multiple MN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DLL Err MN Multiple MN</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isDLLErrMNMultipleMN()
	 * @see #getTMNFeatures()
	 * @generated
	 */
	EAttribute getTMNFeatures_DLLErrMNMultipleMN();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isDLLMNFeatureMultiplex <em>DLLMN Feature Multiplex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DLLMN Feature Multiplex</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isDLLMNFeatureMultiplex()
	 * @see #getTMNFeatures()
	 * @generated
	 */
	EAttribute getTMNFeatures_DLLMNFeatureMultiplex();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isDLLMNFeaturePResTx <em>DLLMN Feature PRes Tx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DLLMN Feature PRes Tx</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isDLLMNFeaturePResTx()
	 * @see #getTMNFeatures()
	 * @generated
	 */
	EAttribute getTMNFeatures_DLLMNFeaturePResTx();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isDLLMNPResChaining <em>DLLMNP Res Chaining</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DLLMNP Res Chaining</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isDLLMNPResChaining()
	 * @see #getTMNFeatures()
	 * @generated
	 */
	EAttribute getTMNFeatures_DLLMNPResChaining();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isDLLMNRingRedundancy <em>DLLMN Ring Redundancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DLLMN Ring Redundancy</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isDLLMNRingRedundancy()
	 * @see #getTMNFeatures()
	 * @generated
	 */
	EAttribute getTMNFeatures_DLLMNRingRedundancy();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNASnd2SoC <em>NMTMNA Snd2 So C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMTMNA Snd2 So C</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNASnd2SoC()
	 * @see #getTMNFeatures()
	 * @generated
	 */
	EAttribute getTMNFeatures_NMTMNASnd2SoC();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTMNBasicEthernet <em>NMTMN Basic Ethernet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMTMN Basic Ethernet</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTMNBasicEthernet()
	 * @see #getTMNFeatures()
	 * @generated
	 */
	EAttribute getTMNFeatures_NMTMNBasicEthernet();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTMNDNA <em>NMTMNDNA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMTMNDNA</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTMNDNA()
	 * @see #getTMNFeatures()
	 * @generated
	 */
	EAttribute getTMNFeatures_NMTMNDNA();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNMaxAsynchronousSlots <em>NMTMN Max Asynchronous Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMTMN Max Asynchronous Slots</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNMaxAsynchronousSlots()
	 * @see #getTMNFeatures()
	 * @generated
	 */
	EAttribute getTMNFeatures_NMTMNMaxAsynchronousSlots();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNMultiplCycMax <em>NMTMN Multipl Cyc Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMTMN Multipl Cyc Max</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNMultiplCycMax()
	 * @see #getTMNFeatures()
	 * @generated
	 */
	EAttribute getTMNFeatures_NMTMNMultiplCycMax();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNPRes2PReq <em>NMTMNP Res2 PReq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMTMNP Res2 PReq</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNPRes2PReq()
	 * @see #getTMNFeatures()
	 * @generated
	 */
	EAttribute getTMNFeatures_NMTMNPRes2PReq();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNPRes2PRes <em>NMTMNP Res2 PRes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMTMNP Res2 PRes</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNPRes2PRes()
	 * @see #getTMNFeatures()
	 * @generated
	 */
	EAttribute getTMNFeatures_NMTMNPRes2PRes();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNPResRx2SoA <em>NMTMNP Res Rx2 So A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMTMNP Res Rx2 So A</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNPResRx2SoA()
	 * @see #getTMNFeatures()
	 * @generated
	 */
	EAttribute getTMNFeatures_NMTMNPResRx2SoA();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNPResTx2SoA <em>NMTMNP Res Tx2 So A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMTMNP Res Tx2 So A</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNPResTx2SoA()
	 * @see #getTMNFeatures()
	 * @generated
	 */
	EAttribute getTMNFeatures_NMTMNPResTx2SoA();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTMNRedundancy <em>NMTMN Redundancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMTMN Redundancy</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTMNRedundancy()
	 * @see #getTMNFeatures()
	 * @generated
	 */
	EAttribute getTMNFeatures_NMTMNRedundancy();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNSoA2ASndTx <em>NMTMN So A2A Snd Tx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMTMN So A2A Snd Tx</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNSoA2ASndTx()
	 * @see #getTMNFeatures()
	 * @generated
	 */
	EAttribute getTMNFeatures_NMTMNSoA2ASndTx();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNSoC2PReq <em>NMTMN So C2P Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMTMN So C2P Req</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getNMTMNSoC2PReq()
	 * @see #getTMNFeatures()
	 * @generated
	 */
	EAttribute getTMNFeatures_NMTMNSoC2PReq();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTNetTime <em>NMT Net Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Net Time</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTNetTime()
	 * @see #getTMNFeatures()
	 * @generated
	 */
	EAttribute getTMNFeatures_NMTNetTime();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTNetTimeIsRealTime <em>NMT Net Time Is Real Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Net Time Is Real Time</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTNetTimeIsRealTime()
	 * @see #getTMNFeatures()
	 * @generated
	 */
	EAttribute getTMNFeatures_NMTNetTimeIsRealTime();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTRelativeTime <em>NMT Relative Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Relative Time</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTRelativeTime()
	 * @see #getTMNFeatures()
	 * @generated
	 */
	EAttribute getTMNFeatures_NMTRelativeTime();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTServiceUdpIp <em>NMT Service Udp Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Service Udp Ip</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTServiceUdpIp()
	 * @see #getTMNFeatures()
	 * @generated
	 */
	EAttribute getTMNFeatures_NMTServiceUdpIp();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTSimpleBoot <em>NMT Simple Boot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NMT Simple Boot</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TMNFeatures#isNMTSimpleBoot()
	 * @see #getTMNFeatures()
	 * @generated
	 */
	EAttribute getTMNFeatures_NMTSimpleBoot();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getPDOTPDOChannels <em>PDOTPDO Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PDOTPDO Channels</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TMNFeatures#getPDOTPDOChannels()
	 * @see #getTMNFeatures()
	 * @generated
	 */
	EAttribute getTMNFeatures_PDOTPDOChannels();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TNetworkManagement <em>TNetwork Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TNetwork Management</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TNetworkManagement
	 * @generated
	 */
	EClass getTNetworkManagement();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TNetworkManagement#getGeneralFeatures <em>General Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>General Features</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TNetworkManagement#getGeneralFeatures()
	 * @see #getTNetworkManagement()
	 * @generated
	 */
	EReference getTNetworkManagement_GeneralFeatures();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TNetworkManagement#getMNFeatures <em>MN Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MN Features</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TNetworkManagement#getMNFeatures()
	 * @see #getTNetworkManagement()
	 * @generated
	 */
	EReference getTNetworkManagement_MNFeatures();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TNetworkManagement#getCNFeatures <em>CN Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CN Features</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TNetworkManagement#getCNFeatures()
	 * @see #getTNetworkManagement()
	 * @generated
	 */
	EReference getTNetworkManagement_CNFeatures();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TNetworkManagement#getDeviceCommissioning <em>Device Commissioning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Commissioning</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TNetworkManagement#getDeviceCommissioning()
	 * @see #getTNetworkManagement()
	 * @generated
	 */
	EReference getTNetworkManagement_DeviceCommissioning();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TNetworkManagement#getDiagnostic <em>Diagnostic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Diagnostic</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TNetworkManagement#getDiagnostic()
	 * @see #getTNetworkManagement()
	 * @generated
	 */
	EReference getTNetworkManagement_Diagnostic();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TObject <em>TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TObject</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TObject
	 * @generated
	 */
	EClass getTObject();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getSubObject <em>Sub Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Object</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TObject#getSubObject()
	 * @see #getTObject()
	 * @generated
	 */
	EReference getTObject_SubObject();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getAccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TObject#getAccessType()
	 * @see #getTObject()
	 * @generated
	 */
	EAttribute getTObject_AccessType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getActualValue <em>Actual Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TObject#getActualValue()
	 * @see #getTObject()
	 * @generated
	 */
	EAttribute getTObject_ActualValue();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TObject#getDataType()
	 * @see #getTObject()
	 * @generated
	 */
	EAttribute getTObject_DataType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TObject#getDefaultValue()
	 * @see #getTObject()
	 * @generated
	 */
	EAttribute getTObject_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getDenotation <em>Denotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Denotation</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TObject#getDenotation()
	 * @see #getTObject()
	 * @generated
	 */
	EAttribute getTObject_Denotation();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getHighLimit <em>High Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Limit</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TObject#getHighLimit()
	 * @see #getTObject()
	 * @generated
	 */
	EAttribute getTObject_HighLimit();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TObject#getIndex()
	 * @see #getTObject()
	 * @generated
	 */
	EAttribute getTObject_Index();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getLowLimit <em>Low Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Limit</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TObject#getLowLimit()
	 * @see #getTObject()
	 * @generated
	 */
	EAttribute getTObject_LowLimit();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TObject#getName()
	 * @see #getTObject()
	 * @generated
	 */
	EAttribute getTObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TObject#getObjectType()
	 * @see #getTObject()
	 * @generated
	 */
	EAttribute getTObject_ObjectType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getObjFlags <em>Obj Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obj Flags</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TObject#getObjFlags()
	 * @see #getTObject()
	 * @generated
	 */
	EAttribute getTObject_ObjFlags();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getPDOmapping <em>PD Omapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PD Omapping</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TObject#getPDOmapping()
	 * @see #getTObject()
	 * @generated
	 */
	EAttribute getTObject_PDOmapping();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getSubNumber <em>Sub Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Number</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TObject#getSubNumber()
	 * @see #getTObject()
	 * @generated
	 */
	EAttribute getTObject_SubNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TObject#getUniqueIDRef <em>Unique ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique ID Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TObject#getUniqueIDRef()
	 * @see #getTObject()
	 * @generated
	 */
	EAttribute getTObject_UniqueIDRef();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup <em>TParameter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TParameter Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterGroup
	 * @generated
	 */
	EClass getTParameterGroup();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getGroup()
	 * @see #getTParameterGroup()
	 * @generated
	 */
	EAttribute getTParameterGroup_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getLabel()
	 * @see #getTParameterGroup()
	 * @generated
	 */
	EReference getTParameterGroup_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getDescription()
	 * @see #getTParameterGroup()
	 * @generated
	 */
	EReference getTParameterGroup_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getLabelRef()
	 * @see #getTParameterGroup()
	 * @generated
	 */
	EReference getTParameterGroup_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getDescriptionRef()
	 * @see #getTParameterGroup()
	 * @generated
	 */
	EReference getTParameterGroup_DescriptionRef();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getGroup1 <em>Group1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group1</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getGroup1()
	 * @see #getTParameterGroup()
	 * @generated
	 */
	EAttribute getTParameterGroup_Group1();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getParameterGroup <em>Parameter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getParameterGroup()
	 * @see #getTParameterGroup()
	 * @generated
	 */
	EReference getTParameterGroup_ParameterGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getParameterRef <em>Parameter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getParameterRef()
	 * @see #getTParameterGroup()
	 * @generated
	 */
	EReference getTParameterGroup_ParameterRef();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getBitOffset <em>Bit Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bit Offset</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getBitOffset()
	 * @see #getTParameterGroup()
	 * @generated
	 */
	EAttribute getTParameterGroup_BitOffset();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getConditionalUniqueIDRef <em>Conditional Unique ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conditional Unique ID Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getConditionalUniqueIDRef()
	 * @see #getTParameterGroup()
	 * @generated
	 */
	EAttribute getTParameterGroup_ConditionalUniqueIDRef();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getConditionalValue <em>Conditional Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conditional Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getConditionalValue()
	 * @see #getTParameterGroup()
	 * @generated
	 */
	EAttribute getTParameterGroup_ConditionalValue();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#isConfigParameter <em>Config Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Parameter</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterGroup#isConfigParameter()
	 * @see #getTParameterGroup()
	 * @generated
	 */
	EAttribute getTParameterGroup_ConfigParameter();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#isGroupLevelVisible <em>Group Level Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Level Visible</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterGroup#isGroupLevelVisible()
	 * @see #getTParameterGroup()
	 * @generated
	 */
	EAttribute getTParameterGroup_GroupLevelVisible();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getKindOfAccess <em>Kind Of Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind Of Access</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getKindOfAccess()
	 * @see #getTParameterGroup()
	 * @generated
	 */
	EAttribute getTParameterGroup_KindOfAccess();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getUniqueID <em>Unique ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique ID</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterGroup#getUniqueID()
	 * @see #getTParameterGroup()
	 * @generated
	 */
	EAttribute getTParameterGroup_UniqueID();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroupList <em>TParameter Group List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TParameter Group List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterGroupList
	 * @generated
	 */
	EClass getTParameterGroupList();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroupList#getParameterGroup <em>Parameter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterGroupList#getParameterGroup()
	 * @see #getTParameterGroupList()
	 * @generated
	 */
	EReference getTParameterGroupList_ParameterGroup();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TParameterList <em>TParameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TParameter List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterList
	 * @generated
	 */
	EClass getTParameterList();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TParameterList#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterList#getParameter()
	 * @see #getTParameterList()
	 * @generated
	 */
	EReference getTParameterList_Parameter();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate <em>TParameter Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TParameter Template</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate
	 * @generated
	 */
	EClass getTParameterTemplate();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getGroup()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EAttribute getTParameterTemplate_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getLabel()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getDescription()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getLabelRef()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getDescriptionRef()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_DescriptionRef();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getBOOL <em>BOOL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BOOL</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getBOOL()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_BOOL();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getBITSTRING <em>BITSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BITSTRING</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getBITSTRING()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_BITSTRING();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getBYTE <em>BYTE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BYTE</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getBYTE()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_BYTE();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getCHAR <em>CHAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CHAR</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getCHAR()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_CHAR();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getWORD <em>WORD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WORD</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getWORD()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_WORD();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getDWORD <em>DWORD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DWORD</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getDWORD()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_DWORD();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getLWORD <em>LWORD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LWORD</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getLWORD()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_LWORD();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getSINT <em>SINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getSINT()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_SINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getINT <em>INT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>INT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getINT()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_INT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getDINT <em>DINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getDINT()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_DINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getLINT <em>LINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getLINT()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_LINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getUSINT <em>USINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>USINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getUSINT()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_USINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getUINT <em>UINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getUINT()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_UINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getUDINT <em>UDINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UDINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getUDINT()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_UDINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getULINT <em>ULINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ULINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getULINT()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_ULINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getREAL <em>REAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>REAL</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getREAL()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_REAL();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getLREAL <em>LREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LREAL</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getLREAL()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_LREAL();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getSTRING <em>STRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>STRING</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getSTRING()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_STRING();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getWSTRING <em>WSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WSTRING</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getWSTRING()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_WSTRING();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getDataTypeIDRef <em>Data Type ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type ID Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getDataTypeIDRef()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_DataTypeIDRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getConditionalSupport <em>Conditional Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditional Support</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getConditionalSupport()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_ConditionalSupport();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getActualValue <em>Actual Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actual Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getActualValue()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_ActualValue();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getDefaultValue()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_DefaultValue();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getSubstituteValue <em>Substitute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Substitute Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getSubstituteValue()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_SubstituteValue();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getAllowedValues <em>Allowed Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allowed Values</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getAllowedValues()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_AllowedValues();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getUnit()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_Unit();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getProperty()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EReference getTParameterTemplate_Property();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getAccess()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EAttribute getTParameterTemplate_Access();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getAccessList <em>Access List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getAccessList()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EAttribute getTParameterTemplate_AccessList();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getMultiplier <em>Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplier</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getMultiplier()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EAttribute getTParameterTemplate_Multiplier();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getOffset()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EAttribute getTParameterTemplate_Offset();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#isPersistent <em>Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#isPersistent()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EAttribute getTParameterTemplate_Persistent();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getSupport <em>Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Support</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getSupport()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EAttribute getTParameterTemplate_Support();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getTemplateIDRef <em>Template ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template ID Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getTemplateIDRef()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EAttribute getTParameterTemplate_TemplateIDRef();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getUniqueID <em>Unique ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique ID</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getUniqueID()
	 * @see #getTParameterTemplate()
	 * @generated
	 */
	EAttribute getTParameterTemplate_UniqueID();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TPicturesList <em>TPictures List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPictures List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TPicturesList
	 * @generated
	 */
	EClass getTPicturesList();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TPicturesList#getPicture <em>Picture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Picture</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TPicturesList#getPicture()
	 * @see #getTPicturesList()
	 * @generated
	 */
	EReference getTPicturesList_Picture();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TProductID <em>TProduct ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TProduct ID</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TProductID
	 * @generated
	 */
	EClass getTProductID();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TProductID#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TProductID#getValue()
	 * @see #getTProductID()
	 * @generated
	 */
	EAttribute getTProductID_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TProductID#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TProductID#isReadOnly()
	 * @see #getTProductID()
	 * @generated
	 */
	EAttribute getTProductID_ReadOnly();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TProperty <em>TProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TProperty</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TProperty
	 * @generated
	 */
	EClass getTProperty();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TProperty#getName()
	 * @see #getTProperty()
	 * @generated
	 */
	EAttribute getTProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TProperty#getValue()
	 * @see #getTProperty()
	 * @generated
	 */
	EAttribute getTProperty_Value();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TRange <em>TRange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRange</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TRange
	 * @generated
	 */
	EClass getTRange();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TRange#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TRange#getMinValue()
	 * @see #getTRange()
	 * @generated
	 */
	EReference getTRange_MinValue();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TRange#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TRange#getMaxValue()
	 * @see #getTRange()
	 * @generated
	 */
	EReference getTRange_MaxValue();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TRange#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Step</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TRange#getStep()
	 * @see #getTRange()
	 * @generated
	 */
	EReference getTRange_Step();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TSpecificationRevision <em>TSpecification Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSpecification Revision</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TSpecificationRevision
	 * @generated
	 */
	EClass getTSpecificationRevision();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TSpecificationRevision#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TSpecificationRevision#getValue()
	 * @see #getTSpecificationRevision()
	 * @generated
	 */
	EAttribute getTSpecificationRevision_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TSpecificationRevision#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TSpecificationRevision#isReadOnly()
	 * @see #getTSpecificationRevision()
	 * @generated
	 */
	EAttribute getTSpecificationRevision_ReadOnly();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TSubrange <em>TSubrange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSubrange</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TSubrange
	 * @generated
	 */
	EClass getTSubrange();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TSubrange#getLowerLimit <em>Lower Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Limit</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TSubrange#getLowerLimit()
	 * @see #getTSubrange()
	 * @generated
	 */
	EAttribute getTSubrange_LowerLimit();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TSubrange#getUpperLimit <em>Upper Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Limit</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TSubrange#getUpperLimit()
	 * @see #getTSubrange()
	 * @generated
	 */
	EAttribute getTSubrange_UpperLimit();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TTemplateList <em>TTemplate List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTemplate List</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TTemplateList
	 * @generated
	 */
	EClass getTTemplateList();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TTemplateList#getParameterTemplate <em>Parameter Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Template</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TTemplateList#getParameterTemplate()
	 * @see #getTTemplateList()
	 * @generated
	 */
	EReference getTTemplateList_ParameterTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TTemplateList#getAllowedValuesTemplate <em>Allowed Values Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allowed Values Template</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TTemplateList#getAllowedValuesTemplate()
	 * @see #getTTemplateList()
	 * @generated
	 */
	EReference getTTemplateList_AllowedValuesTemplate();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TUnit <em>TUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TUnit</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TUnit
	 * @generated
	 */
	EClass getTUnit();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.TUnit#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TUnit#getGroup()
	 * @see #getTUnit()
	 * @generated
	 */
	EAttribute getTUnit_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TUnit#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TUnit#getLabel()
	 * @see #getTUnit()
	 * @generated
	 */
	EReference getTUnit_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TUnit#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TUnit#getDescription()
	 * @see #getTUnit()
	 * @generated
	 */
	EReference getTUnit_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TUnit#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TUnit#getLabelRef()
	 * @see #getTUnit()
	 * @generated
	 */
	EReference getTUnit_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TUnit#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TUnit#getDescriptionRef()
	 * @see #getTUnit()
	 * @generated
	 */
	EReference getTUnit_DescriptionRef();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TUnit#getMultiplier <em>Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplier</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TUnit#getMultiplier()
	 * @see #getTUnit()
	 * @generated
	 */
	EAttribute getTUnit_Multiplier();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TUnit#getUnitURI <em>Unit URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit URI</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TUnit#getUnitURI()
	 * @see #getTUnit()
	 * @generated
	 */
	EAttribute getTUnit_UnitURI();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TValue <em>TValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TValue</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TValue
	 * @generated
	 */
	EClass getTValue();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.TValue#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TValue#getGroup()
	 * @see #getTValue()
	 * @generated
	 */
	EAttribute getTValue_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TValue#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TValue#getLabel()
	 * @see #getTValue()
	 * @generated
	 */
	EReference getTValue_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TValue#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TValue#getDescription()
	 * @see #getTValue()
	 * @generated
	 */
	EReference getTValue_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TValue#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TValue#getLabelRef()
	 * @see #getTValue()
	 * @generated
	 */
	EReference getTValue_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TValue#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TValue#getDescriptionRef()
	 * @see #getTValue()
	 * @generated
	 */
	EReference getTValue_DescriptionRef();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TValue#getMultiplier <em>Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplier</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TValue#getMultiplier()
	 * @see #getTValue()
	 * @generated
	 */
	EAttribute getTValue_Multiplier();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TValue#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TValue#getOffset()
	 * @see #getTValue()
	 * @generated
	 */
	EAttribute getTValue_Offset();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TValue#getValue()
	 * @see #getTValue()
	 * @generated
	 */
	EAttribute getTValue_Value();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration <em>TVar Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TVar Declaration</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration
	 * @generated
	 */
	EClass getTVarDeclaration();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getGroup()
	 * @see #getTVarDeclaration()
	 * @generated
	 */
	EAttribute getTVarDeclaration_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getLabel()
	 * @see #getTVarDeclaration()
	 * @generated
	 */
	EReference getTVarDeclaration_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getDescription()
	 * @see #getTVarDeclaration()
	 * @generated
	 */
	EReference getTVarDeclaration_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getLabelRef()
	 * @see #getTVarDeclaration()
	 * @generated
	 */
	EReference getTVarDeclaration_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getDescriptionRef()
	 * @see #getTVarDeclaration()
	 * @generated
	 */
	EReference getTVarDeclaration_DescriptionRef();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getBOOL <em>BOOL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BOOL</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getBOOL()
	 * @see #getTVarDeclaration()
	 * @generated
	 */
	EReference getTVarDeclaration_BOOL();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getBITSTRING <em>BITSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BITSTRING</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getBITSTRING()
	 * @see #getTVarDeclaration()
	 * @generated
	 */
	EReference getTVarDeclaration_BITSTRING();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getBYTE <em>BYTE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BYTE</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getBYTE()
	 * @see #getTVarDeclaration()
	 * @generated
	 */
	EReference getTVarDeclaration_BYTE();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getCHAR <em>CHAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CHAR</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getCHAR()
	 * @see #getTVarDeclaration()
	 * @generated
	 */
	EReference getTVarDeclaration_CHAR();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getWORD <em>WORD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WORD</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getWORD()
	 * @see #getTVarDeclaration()
	 * @generated
	 */
	EReference getTVarDeclaration_WORD();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getDWORD <em>DWORD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DWORD</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getDWORD()
	 * @see #getTVarDeclaration()
	 * @generated
	 */
	EReference getTVarDeclaration_DWORD();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getLWORD <em>LWORD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LWORD</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getLWORD()
	 * @see #getTVarDeclaration()
	 * @generated
	 */
	EReference getTVarDeclaration_LWORD();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getSINT <em>SINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getSINT()
	 * @see #getTVarDeclaration()
	 * @generated
	 */
	EReference getTVarDeclaration_SINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getINT <em>INT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>INT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getINT()
	 * @see #getTVarDeclaration()
	 * @generated
	 */
	EReference getTVarDeclaration_INT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getDINT <em>DINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getDINT()
	 * @see #getTVarDeclaration()
	 * @generated
	 */
	EReference getTVarDeclaration_DINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getLINT <em>LINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getLINT()
	 * @see #getTVarDeclaration()
	 * @generated
	 */
	EReference getTVarDeclaration_LINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getUSINT <em>USINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>USINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getUSINT()
	 * @see #getTVarDeclaration()
	 * @generated
	 */
	EReference getTVarDeclaration_USINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getUINT <em>UINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getUINT()
	 * @see #getTVarDeclaration()
	 * @generated
	 */
	EReference getTVarDeclaration_UINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getUDINT <em>UDINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UDINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getUDINT()
	 * @see #getTVarDeclaration()
	 * @generated
	 */
	EReference getTVarDeclaration_UDINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getULINT <em>ULINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ULINT</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getULINT()
	 * @see #getTVarDeclaration()
	 * @generated
	 */
	EReference getTVarDeclaration_ULINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getREAL <em>REAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>REAL</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getREAL()
	 * @see #getTVarDeclaration()
	 * @generated
	 */
	EReference getTVarDeclaration_REAL();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getLREAL <em>LREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LREAL</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getLREAL()
	 * @see #getTVarDeclaration()
	 * @generated
	 */
	EReference getTVarDeclaration_LREAL();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getSTRING <em>STRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>STRING</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getSTRING()
	 * @see #getTVarDeclaration()
	 * @generated
	 */
	EReference getTVarDeclaration_STRING();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getWSTRING <em>WSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WSTRING</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getWSTRING()
	 * @see #getTVarDeclaration()
	 * @generated
	 */
	EReference getTVarDeclaration_WSTRING();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getDataTypeIDRef <em>Data Type ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type ID Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getDataTypeIDRef()
	 * @see #getTVarDeclaration()
	 * @generated
	 */
	EReference getTVarDeclaration_DataTypeIDRef();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getInitialValue()
	 * @see #getTVarDeclaration()
	 * @generated
	 */
	EAttribute getTVarDeclaration_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getName()
	 * @see #getTVarDeclaration()
	 * @generated
	 */
	EAttribute getTVarDeclaration_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getSize()
	 * @see #getTVarDeclaration()
	 * @generated
	 */
	EAttribute getTVarDeclaration_Size();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getUniqueID <em>Unique ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique ID</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration#getUniqueID()
	 * @see #getTVarDeclaration()
	 * @generated
	 */
	EAttribute getTVarDeclaration_UniqueID();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TVariableRef <em>TVariable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TVariable Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVariableRef
	 * @generated
	 */
	EClass getTVariableRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TVariableRef#getInstanceIDRef <em>Instance ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance ID Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVariableRef#getInstanceIDRef()
	 * @see #getTVariableRef()
	 * @generated
	 */
	EReference getTVariableRef_InstanceIDRef();

	/**
	 * Returns the meta object for the containment reference '{@link com.br_automation.buoat.xddeditor.XDD.TVariableRef#getVariableIDRef <em>Variable ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable ID Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVariableRef#getVariableIDRef()
	 * @see #getTVariableRef()
	 * @generated
	 */
	EReference getTVariableRef_VariableIDRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.TVariableRef#getMemberRef <em>Member Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVariableRef#getMemberRef()
	 * @see #getTVariableRef()
	 * @generated
	 */
	EReference getTVariableRef_MemberRef();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TVariableRef#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVariableRef#getPosition()
	 * @see #getTVariableRef()
	 * @generated
	 */
	EAttribute getTVariableRef_Position();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TVendorID <em>TVendor ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TVendor ID</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVendorID
	 * @generated
	 */
	EClass getTVendorID();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TVendorID#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVendorID#getValue()
	 * @see #getTVendorID()
	 * @generated
	 */
	EAttribute getTVendorID_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TVendorID#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVendorID#isReadOnly()
	 * @see #getTVendorID()
	 * @generated
	 */
	EAttribute getTVendorID_ReadOnly();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.TVersion <em>TVersion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TVersion</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVersion
	 * @generated
	 */
	EClass getTVersion();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TVersion#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVersion#getValue()
	 * @see #getTVersion()
	 * @generated
	 */
	EAttribute getTVersion_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TVersion#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVersion#isReadOnly()
	 * @see #getTVersion()
	 * @generated
	 */
	EAttribute getTVersion_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.TVersion#getVersionType <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVersion#getVersionType()
	 * @see #getTVersion()
	 * @generated
	 */
	EAttribute getTVersion_VersionType();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ValueType
	 * @generated
	 */
	EClass getValueType();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.ValueType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ValueType#getGroup()
	 * @see #getValueType()
	 * @generated
	 */
	EAttribute getValueType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ValueType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ValueType#getLabel()
	 * @see #getValueType()
	 * @generated
	 */
	EReference getValueType_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ValueType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ValueType#getDescription()
	 * @see #getValueType()
	 * @generated
	 */
	EReference getValueType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ValueType#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ValueType#getLabelRef()
	 * @see #getValueType()
	 * @generated
	 */
	EReference getValueType_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.ValueType#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ValueType#getDescriptionRef()
	 * @see #getValueType()
	 * @generated
	 */
	EReference getValueType_DescriptionRef();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ValueType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ValueType#getName()
	 * @see #getValueType()
	 * @generated
	 */
	EAttribute getValueType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.ValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ValueType#getValue()
	 * @see #getValueType()
	 * @generated
	 */
	EAttribute getValueType_Value();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.VariableIDRefType <em>Variable ID Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable ID Ref Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.VariableIDRefType
	 * @generated
	 */
	EClass getVariableIDRefType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.VariableIDRefType#getUniqueIDRef <em>Unique ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique ID Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.VariableIDRefType#getUniqueIDRef()
	 * @see #getVariableIDRefType()
	 * @generated
	 */
	EAttribute getVariableIDRefType_UniqueIDRef();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.VendorNameType <em>Vendor Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vendor Name Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.VendorNameType
	 * @generated
	 */
	EClass getVendorNameType();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.VendorNameType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.VendorNameType#getValue()
	 * @see #getVendorNameType()
	 * @generated
	 */
	EAttribute getVendorNameType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.VendorNameType#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.VendorNameType#isReadOnly()
	 * @see #getVendorNameType()
	 * @generated
	 */
	EAttribute getVendorNameType_ReadOnly();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.VendorTextType <em>Vendor Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vendor Text Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.VendorTextType
	 * @generated
	 */
	EClass getVendorTextType();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.VendorTextType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.VendorTextType#getGroup()
	 * @see #getVendorTextType()
	 * @generated
	 */
	EAttribute getVendorTextType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.VendorTextType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.VendorTextType#getLabel()
	 * @see #getVendorTextType()
	 * @generated
	 */
	EReference getVendorTextType_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.VendorTextType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.VendorTextType#getDescription()
	 * @see #getVendorTextType()
	 * @generated
	 */
	EReference getVendorTextType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.VendorTextType#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.VendorTextType#getLabelRef()
	 * @see #getVendorTextType()
	 * @generated
	 */
	EReference getVendorTextType_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.VendorTextType#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.VendorTextType#getDescriptionRef()
	 * @see #getVendorTextType()
	 * @generated
	 */
	EReference getVendorTextType_DescriptionRef();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.VendorTextType#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.VendorTextType#isReadOnly()
	 * @see #getVendorTextType()
	 * @generated
	 */
	EAttribute getVendorTextType_ReadOnly();

	/**
	 * Returns the meta object for class '{@link com.br_automation.buoat.xddeditor.XDD.VersionInfoType <em>Version Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version Info Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.VersionInfoType
	 * @generated
	 */
	EClass getVersionInfoType();

	/**
	 * Returns the meta object for the attribute list '{@link com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getGroup()
	 * @see #getVersionInfoType()
	 * @generated
	 */
	EAttribute getVersionInfoType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getLabel()
	 * @see #getVersionInfoType()
	 * @generated
	 */
	EReference getVersionInfoType_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getDescription()
	 * @see #getVersionInfoType()
	 * @generated
	 */
	EReference getVersionInfoType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getLabelRef <em>Label Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getLabelRef()
	 * @see #getVersionInfoType()
	 * @generated
	 */
	EReference getVersionInfoType_LabelRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getDescriptionRef <em>Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Ref</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getDescriptionRef()
	 * @see #getVersionInfoType()
	 * @generated
	 */
	EReference getVersionInfoType_DescriptionRef();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getAuthor()
	 * @see #getVersionInfoType()
	 * @generated
	 */
	EAttribute getVersionInfoType_Author();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getDate()
	 * @see #getVersionInfoType()
	 * @generated
	 */
	EAttribute getVersionInfoType_Date();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getOrganization()
	 * @see #getVersionInfoType()
	 * @generated
	 */
	EAttribute getVersionInfoType_Organization();

	/**
	 * Returns the meta object for the attribute '{@link com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.VersionInfoType#getVersion()
	 * @see #getVersionInfoType()
	 * @generated
	 */
	EAttribute getVersionInfoType_Version();

	/**
	 * Returns the meta object for enum '{@link com.br_automation.buoat.xddeditor.XDD.AccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.AccessType
	 * @generated
	 */
	EEnum getAccessType();

	/**
	 * Returns the meta object for enum '{@link com.br_automation.buoat.xddeditor.XDD.AccessType1 <em>Access Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Type1</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.AccessType1
	 * @generated
	 */
	EEnum getAccessType1();

	/**
	 * Returns the meta object for enum '{@link com.br_automation.buoat.xddeditor.XDD.AccessTypeType <em>Access Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Type Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.AccessTypeType
	 * @generated
	 */
	EEnum getAccessTypeType();

	/**
	 * Returns the meta object for enum '{@link com.br_automation.buoat.xddeditor.XDD.ClassificationType <em>Classification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Classification Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ClassificationType
	 * @generated
	 */
	EEnum getClassificationType();

	/**
	 * Returns the meta object for enum '{@link com.br_automation.buoat.xddeditor.XDD.DeviceClassType <em>Device Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Class Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DeviceClassType
	 * @generated
	 */
	EEnum getDeviceClassType();

	/**
	 * Returns the meta object for enum '{@link com.br_automation.buoat.xddeditor.XDD.IASInterfaceDataTypeMember0 <em>IAS Interface Data Type Member0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>IAS Interface Data Type Member0</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.IASInterfaceDataTypeMember0
	 * @generated
	 */
	EEnum getIASInterfaceDataTypeMember0();

	/**
	 * Returns the meta object for enum '{@link com.br_automation.buoat.xddeditor.XDD.LEDcolorsType <em>LE Dcolors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>LE Dcolors Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDcolorsType
	 * @generated
	 */
	EEnum getLEDcolorsType();

	/**
	 * Returns the meta object for enum '{@link com.br_automation.buoat.xddeditor.XDD.LEDcolorType <em>LE Dcolor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>LE Dcolor Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDcolorType
	 * @generated
	 */
	EEnum getLEDcolorType();

	/**
	 * Returns the meta object for enum '{@link com.br_automation.buoat.xddeditor.XDD.LEDtypeType <em>LE Dtype Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>LE Dtype Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDtypeType
	 * @generated
	 */
	EEnum getLEDtypeType();

	/**
	 * Returns the meta object for enum '{@link com.br_automation.buoat.xddeditor.XDD.NodeTypeType <em>Node Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Type Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.NodeTypeType
	 * @generated
	 */
	EEnum getNodeTypeType();

	/**
	 * Returns the meta object for enum '{@link com.br_automation.buoat.xddeditor.XDD.PositioningType <em>Positioning Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Positioning Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.PositioningType
	 * @generated
	 */
	EEnum getPositioningType();

	/**
	 * Returns the meta object for enum '{@link com.br_automation.buoat.xddeditor.XDD.ProfileClassIDDataType <em>Profile Class ID Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Profile Class ID Data Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileClassIDDataType
	 * @generated
	 */
	EEnum getProfileClassIDDataType();

	/**
	 * Returns the meta object for enum '{@link com.br_automation.buoat.xddeditor.XDD.RangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Range Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.RangeType
	 * @generated
	 */
	EEnum getRangeType();

	/**
	 * Returns the meta object for enum '{@link com.br_automation.buoat.xddeditor.XDD.StateType <em>State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.StateType
	 * @generated
	 */
	EEnum getStateType();

	/**
	 * Returns the meta object for enum '{@link com.br_automation.buoat.xddeditor.XDD.SupportType <em>Support Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Support Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.SupportType
	 * @generated
	 */
	EEnum getSupportType();

	/**
	 * Returns the meta object for enum '{@link com.br_automation.buoat.xddeditor.XDD.TObjectAccessType <em>TObject Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TObject Access Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TObjectAccessType
	 * @generated
	 */
	EEnum getTObjectAccessType();

	/**
	 * Returns the meta object for enum '{@link com.br_automation.buoat.xddeditor.XDD.TObjectPDOMapping <em>TObject PDO Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TObject PDO Mapping</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TObjectPDOMapping
	 * @generated
	 */
	EEnum getTObjectPDOMapping();

	/**
	 * Returns the meta object for enum '{@link com.br_automation.buoat.xddeditor.XDD.TSpecificationVersion <em>TSpecification Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TSpecification Version</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TSpecificationVersion
	 * @generated
	 */
	EEnum getTSpecificationVersion();

	/**
	 * Returns the meta object for enum '{@link com.br_automation.buoat.xddeditor.XDD.TypeType <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TypeType
	 * @generated
	 */
	EEnum getTypeType();

	/**
	 * Returns the meta object for enum '{@link com.br_automation.buoat.xddeditor.XDD.VersionTypeType <em>Version Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Version Type Type</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.VersionTypeType
	 * @generated
	 */
	EEnum getVersionTypeType();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Access List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Access List Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='accessList_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#NMTOKENS'"
	 * @generated
	 */
	EDataType getAccessListType();

	/**
	 * Returns the meta object for data type '{@link com.br_automation.buoat.xddeditor.XDD.AccessType <em>Access Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Access Type Object</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.AccessType
	 * @model instanceClass="com.br_automation.buoat.xddeditor.ethernet.AccessType"
	 *        extendedMetaData="name='access_._type:Object' baseType='access_._type'"
	 * @generated
	 */
	EDataType getAccessTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.br_automation.buoat.xddeditor.XDD.AccessType1 <em>Access Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Access Type Object1</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.AccessType1
	 * @model instanceClass="com.br_automation.buoat.xddeditor.ethernet.AccessType1"
	 *        extendedMetaData="name='access_._1_._type:Object' baseType='access_._1_._type'"
	 * @generated
	 */
	EDataType getAccessTypeObject1();

	/**
	 * Returns the meta object for data type '{@link com.br_automation.buoat.xddeditor.XDD.AccessTypeType <em>Access Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Access Type Type Object</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.AccessTypeType
	 * @model instanceClass="com.br_automation.buoat.xddeditor.ethernet.AccessTypeType"
	 *        extendedMetaData="name='accessType_._type:Object' baseType='accessType_._type'"
	 * @generated
	 */
	EDataType getAccessTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.br_automation.buoat.xddeditor.XDD.ClassificationType <em>Classification Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Classification Type Object</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ClassificationType
	 * @model instanceClass="com.br_automation.buoat.xddeditor.ethernet.ClassificationType"
	 *        extendedMetaData="name='classification_._type:Object' baseType='classification_._type'"
	 * @generated
	 */
	EDataType getClassificationTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.br_automation.buoat.xddeditor.XDD.DeviceClassType <em>Device Class Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Device Class Type Object</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.DeviceClassType
	 * @model instanceClass="com.br_automation.buoat.xddeditor.ethernet.DeviceClassType"
	 *        extendedMetaData="name='deviceClass_._type:Object' baseType='deviceClass_._type'"
	 * @generated
	 */
	EDataType getDeviceClassTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>IAS Interface Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IAS Interface Data Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='IASInterface_DataType' memberTypes='IASInterface_DataType_._member_._0 IASInterface_DataType_._member_._1'"
	 * @generated
	 */
	EDataType getIASInterfaceDataType();

	/**
	 * Returns the meta object for data type '{@link com.br_automation.buoat.xddeditor.XDD.IASInterfaceDataTypeMember0 <em>IAS Interface Data Type Member0 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IAS Interface Data Type Member0 Object</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.IASInterfaceDataTypeMember0
	 * @model instanceClass="com.br_automation.buoat.xddeditor.ethernet.IASInterfaceDataTypeMember0"
	 *        extendedMetaData="name='IASInterface_DataType_._member_._0:Object' baseType='IASInterface_DataType_._member_._0'"
	 * @generated
	 */
	EDataType getIASInterfaceDataTypeMember0Object();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>IAS Interface Data Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IAS Interface Data Type Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='IASInterface_DataType_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#string' length='4'"
	 * @generated
	 */
	EDataType getIASInterfaceDataTypeMember1();

	/**
	 * Returns the meta object for data type '{@link com.br_automation.buoat.xddeditor.XDD.LEDcolorsType <em>LE Dcolors Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>LE Dcolors Type Object</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDcolorsType
	 * @model instanceClass="com.br_automation.buoat.xddeditor.ethernet.LEDcolorsType"
	 *        extendedMetaData="name='LEDcolors_._type:Object' baseType='LEDcolors_._type'"
	 * @generated
	 */
	EDataType getLEDcolorsTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.br_automation.buoat.xddeditor.XDD.LEDcolorType <em>LE Dcolor Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>LE Dcolor Type Object</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDcolorType
	 * @model instanceClass="com.br_automation.buoat.xddeditor.ethernet.LEDcolorType"
	 *        extendedMetaData="name='LEDcolor_._type:Object' baseType='LEDcolor_._type'"
	 * @generated
	 */
	EDataType getLEDcolorTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.br_automation.buoat.xddeditor.XDD.LEDtypeType <em>LE Dtype Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>LE Dtype Type Object</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDtypeType
	 * @model instanceClass="com.br_automation.buoat.xddeditor.ethernet.LEDtypeType"
	 *        extendedMetaData="name='LEDtype_._type:Object' baseType='LEDtype_._type'"
	 * @generated
	 */
	EDataType getLEDtypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.br_automation.buoat.xddeditor.XDD.NodeTypeType <em>Node Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Node Type Type Object</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.NodeTypeType
	 * @model instanceClass="com.br_automation.buoat.xddeditor.ethernet.NodeTypeType"
	 *        extendedMetaData="name='nodeType_._type:Object' baseType='nodeType_._type'"
	 * @generated
	 */
	EDataType getNodeTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Offset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Offset Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='offset_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger' maxInclusive='63'"
	 * @generated
	 */
	EDataType getOffsetType();

	/**
	 * Returns the meta object for data type '{@link com.br_automation.buoat.xddeditor.XDD.PositioningType <em>Positioning Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Positioning Type Object</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.PositioningType
	 * @model instanceClass="com.br_automation.buoat.xddeditor.ethernet.PositioningType"
	 *        extendedMetaData="name='positioning_._type:Object' baseType='positioning_._type'"
	 * @generated
	 */
	EDataType getPositioningTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.br_automation.buoat.xddeditor.XDD.ProfileClassIDDataType <em>Profile Class ID Data Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Profile Class ID Data Type Object</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileClassIDDataType
	 * @model instanceClass="com.br_automation.buoat.xddeditor.ethernet.ProfileClassIDDataType"
	 *        extendedMetaData="name='ProfileClassID_DataType:Object' baseType='ProfileClassID_DataType'"
	 * @generated
	 */
	EDataType getProfileClassIDDataTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.br_automation.buoat.xddeditor.XDD.RangeType <em>Range Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Range Type Object</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.RangeType
	 * @model instanceClass="com.br_automation.buoat.xddeditor.ethernet.RangeType"
	 *        extendedMetaData="name='range_._type:Object' baseType='range_._type'"
	 * @generated
	 */
	EDataType getRangeTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.br_automation.buoat.xddeditor.XDD.StateType <em>State Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>State Type Object</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.StateType
	 * @model instanceClass="com.br_automation.buoat.xddeditor.ethernet.StateType"
	 *        extendedMetaData="name='state_._type:Object' baseType='state_._type'"
	 * @generated
	 */
	EDataType getStateTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Supported Languages Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Supported Languages Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='supportedLanguages_._type' itemType='http://www.eclipse.org/emf/2003/XMLType#language'"
	 * @generated
	 */
	EDataType getSupportedLanguagesType();

	/**
	 * Returns the meta object for data type '{@link com.br_automation.buoat.xddeditor.XDD.SupportType <em>Support Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Support Type Object</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.SupportType
	 * @model instanceClass="com.br_automation.buoat.xddeditor.ethernet.SupportType"
	 *        extendedMetaData="name='support_._type:Object' baseType='support_._type'"
	 * @generated
	 */
	EDataType getSupportTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.br_automation.buoat.xddeditor.XDD.TObjectAccessType <em>TObject Access Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TObject Access Type Object</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TObjectAccessType
	 * @model instanceClass="com.br_automation.buoat.xddeditor.ethernet.TObjectAccessType"
	 *        extendedMetaData="name='t_ObjectAccessType:Object' baseType='t_ObjectAccessType'"
	 * @generated
	 */
	EDataType getTObjectAccessTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.br_automation.buoat.xddeditor.XDD.TObjectPDOMapping <em>TObject PDO Mapping Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TObject PDO Mapping Object</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TObjectPDOMapping
	 * @model instanceClass="com.br_automation.buoat.xddeditor.ethernet.TObjectPDOMapping"
	 *        extendedMetaData="name='t_ObjectPDOMapping:Object' baseType='t_ObjectPDOMapping'"
	 * @generated
	 */
	EDataType getTObjectPDOMappingObject();

	/**
	 * Returns the meta object for data type '{@link com.br_automation.buoat.xddeditor.XDD.TSpecificationVersion <em>TSpecification Version Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TSpecification Version Object</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TSpecificationVersion
	 * @model instanceClass="com.br_automation.buoat.xddeditor.ethernet.TSpecificationVersion"
	 *        extendedMetaData="name='t_specificationVersion:Object' baseType='t_specificationVersion'"
	 * @generated
	 */
	EDataType getTSpecificationVersionObject();

	/**
	 * Returns the meta object for data type '{@link com.br_automation.buoat.xddeditor.XDD.TypeType <em>Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.TypeType
	 * @model instanceClass="com.br_automation.buoat.xddeditor.ethernet.TypeType"
	 *        extendedMetaData="name='type_._type:Object' baseType='type_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.br_automation.buoat.xddeditor.XDD.VersionTypeType <em>Version Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version Type Type Object</em>'.
	 * @see com.br_automation.buoat.xddeditor.XDD.VersionTypeType
	 * @model instanceClass="com.br_automation.buoat.xddeditor.ethernet.VersionTypeType"
	 *        extendedMetaData="name='versionType_._type:Object' baseType='versionType_._type'"
	 * @generated
	 */
	EDataType getVersionTypeTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XDDFactory getXDDFactory();

} //XDDPackage
