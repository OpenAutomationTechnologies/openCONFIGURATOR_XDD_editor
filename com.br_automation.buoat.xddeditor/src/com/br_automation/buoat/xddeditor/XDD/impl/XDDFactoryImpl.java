/**
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import com.br_automation.buoat.xddeditor.XDD.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XDDFactoryImpl extends EFactoryImpl implements XDDFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XDDFactory init() {
		try {
			XDDFactory theXDDFactory = (XDDFactory)EPackage.Registry.INSTANCE.getEFactory(XDDPackage.eNS_URI);
			if (theXDDFactory != null) {
				return theXDDFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XDDFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDDFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XDDPackage.ADD_INFO_TYPE: return createAddInfoType();
			case XDDPackage.ARRAY_TYPE: return createArrayType();
			case XDDPackage.CATEGORY_TYPE: return createCategoryType();
			case XDDPackage.CHARACTERISTIC_CONTENT_TYPE: return createCharacteristicContentType();
			case XDDPackage.CHARACTERISTIC_NAME_TYPE: return createCharacteristicNameType();
			case XDDPackage.CHARACTERISTICS_LIST_TYPE: return createCharacteristicsListType();
			case XDDPackage.CHARACTERISTIC_TYPE: return createCharacteristicType();
			case XDDPackage.COMPLIANT_WITH_TYPE: return createCompliantWithType();
			case XDDPackage.CONFIG_VARS_TYPE: return createConfigVarsType();
			case XDDPackage.CONNECTION_TYPE: return createConnectionType();
			case XDDPackage.CONNECTOR_TYPE: return createConnectorType();
			case XDDPackage.DATA_TYPE_LIST_TYPE: return createDataTypeListType();
			case XDDPackage.DERIVED_TYPE: return createDerivedType();
			case XDDPackage.DESCRIPTION_REF_TYPE: return createDescriptionRefType();
			case XDDPackage.DESCRIPTION_TYPE: return createDescriptionType();
			case XDDPackage.DICTIONARY_TYPE: return createDictionaryType();
			case XDDPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case XDDPackage.DYNAMIC_CHANNELS_TYPE: return createDynamicChannelsType();
			case XDDPackage.ENUM_TYPE: return createEnumType();
			case XDDPackage.ERROR_BIT_DATA_TYPE: return createErrorBitDataType();
			case XDDPackage.ERROR_CONSTANT_DATA_TYPE: return createErrorConstantDataType();
			case XDDPackage.ERROR_LIST_TYPE: return createErrorListType();
			case XDDPackage.FILE_TYPE: return createFileType();
			case XDDPackage.FIRMWARE_TYPE: return createFirmwareType();
			case XDDPackage.FUNCTION_INSTANCE_TYPE: return createFunctionInstanceType();
			case XDDPackage.FUNCTION_TYPE_TYPE: return createFunctionTypeType();
			case XDDPackage.IDENTITY_TYPE: return createIdentityType();
			case XDDPackage.INPUT_VARS_TYPE: return createInputVarsType();
			case XDDPackage.INSTANCE_ID_REF_TYPE: return createInstanceIDRefType();
			case XDDPackage.INSTANCE_NAME_TYPE: return createInstanceNameType();
			case XDDPackage.INTERFACE_LIST_TYPE: return createInterfaceListType();
			case XDDPackage.ISO15745_PROFILE_CONTAINER_TYPE: return createISO15745ProfileContainerType();
			case XDDPackage.ISO15745_PROFILE_TYPE: return createISO15745ProfileType();
			case XDDPackage.ISO15745_REFERENCE_DATA_TYPE: return createISO15745ReferenceDataType();
			case XDDPackage.LABEL_REF_TYPE: return createLabelRefType();
			case XDDPackage.LABEL_TYPE: return createLabelType();
			case XDDPackage.LED_LIST_TYPE: return createLEDListType();
			case XDDPackage.LE_DSTATE_REF_TYPE: return createLEDstateRefType();
			case XDDPackage.LE_DSTATE_TYPE: return createLEDstateType();
			case XDDPackage.MAX_VALUE_TYPE: return createMaxValueType();
			case XDDPackage.MEMBER_REF_TYPE: return createMemberRefType();
			case XDDPackage.MIN_VALUE_TYPE: return createMinValueType();
			case XDDPackage.OBJECT_LIST_TYPE: return createObjectListType();
			case XDDPackage.ORDER_NUMBER_TYPE: return createOrderNumberType();
			case XDDPackage.OUTPUT_VARS_TYPE: return createOutputVarsType();
			case XDDPackage.PARAMETER_REF_TYPE: return createParameterRefType();
			case XDDPackage.PARAMETER_TYPE: return createParameterType();
			case XDDPackage.PICTURE_TYPE: return createPictureType();
			case XDDPackage.PRODUCT_FAMILY_TYPE: return createProductFamilyType();
			case XDDPackage.PRODUCT_NAME_TYPE: return createProductNameType();
			case XDDPackage.PRODUCT_TEXT_TYPE: return createProductTextType();
			case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK: return createProfileBodyCommunicationNetworkPowerlink();
			case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK: return createProfileBodyDevicePowerlink();
			case XDDPackage.PROFILE_HANDLE_DATA_TYPE: return createProfileHandleDataType();
			case XDDPackage.PROFILE_HEADER_DATA_TYPE: return createProfileHeaderDataType();
			case XDDPackage.STANDARD_COMPLIANCE_LIST_TYPE: return createStandardComplianceListType();
			case XDDPackage.STATIC_ERROR_BIT_FIELD_TYPE: return createStaticErrorBitFieldType();
			case XDDPackage.STEP_TYPE: return createStepType();
			case XDDPackage.STRUCT_TYPE: return createStructType();
			case XDDPackage.SUB_OBJECT_TYPE: return createSubObjectType();
			case XDDPackage.TALLOWED_VALUES: return createTAllowedValues();
			case XDDPackage.TALLOWED_VALUES_TEMPLATE: return createTAllowedValuesTemplate();
			case XDDPackage.TAPPLICATION_LAYERS: return createTApplicationLayers();
			case XDDPackage.TAPPLICATION_PROCESS: return createTApplicationProcess();
			case XDDPackage.TCAPABILITIES: return createTCapabilities();
			case XDDPackage.TCLASSIFICATION_LIST: return createTClassificationList();
			case XDDPackage.TCN_FEATURES: return createTCNFeatures();
			case XDDPackage.TCOMBINED_STATE: return createTCombinedState();
			case XDDPackage.TCONDITIONAL_SUPPORT: return createTConditionalSupport();
			case XDDPackage.TCONNECTOR_LIST: return createTConnectorList();
			case XDDPackage.TCOUNT: return createTCount();
			case XDDPackage.TDATA_TYPE_ID_REF: return createTDataTypeIDRef();
			case XDDPackage.TDATA_TYPE_LIST: return createTDataTypeList();
			case XDDPackage.TDATA_TYPES: return createTDataTypes();
			case XDDPackage.TDENOTATION: return createTDenotation();
			case XDDPackage.TDEVICE_COMMISSIONING: return createTDeviceCommissioning();
			case XDDPackage.TDEVICE_FAMILY: return createTDeviceFamily();
			case XDDPackage.TDEVICE_FUNCTION: return createTDeviceFunction();
			case XDDPackage.TDEVICE_IDENTITY: return createTDeviceIdentity();
			case XDDPackage.TDEVICE_MANAGER: return createTDeviceManager();
			case XDDPackage.TDIAGNOSTIC: return createTDiagnostic();
			case XDDPackage.TDICTIONARY_LIST: return createTDictionaryList();
			case XDDPackage.TDYNAMIC_CHANNEL: return createTDynamicChannel();
			case XDDPackage.TENUM_VALUE: return createTEnumValue();
			case XDDPackage.TEXT_ENTRY_TYPE: return createTextEntryType();
			case XDDPackage.TEXT_RESOURCE_TYPE: return createTextResourceType();
			case XDDPackage.TFIRMWARE_LIST: return createTFirmwareList();
			case XDDPackage.TFUNCTION_INSTANCE_LIST: return createTFunctionInstanceList();
			case XDDPackage.TFUNCTION_TYPE_LIST: return createTFunctionTypeList();
			case XDDPackage.TGENERAL_FEATURES: return createTGeneralFeatures();
			case XDDPackage.TINDICATOR_LIST: return createTIndicatorList();
			case XDDPackage.TLED: return createTLED();
			case XDDPackage.TMN_FEATURES: return createTMNFeatures();
			case XDDPackage.TNETWORK_MANAGEMENT: return createTNetworkManagement();
			case XDDPackage.TOBJECT: return createTObject();
			case XDDPackage.TPARAMETER_GROUP: return createTParameterGroup();
			case XDDPackage.TPARAMETER_GROUP_LIST: return createTParameterGroupList();
			case XDDPackage.TPARAMETER_LIST: return createTParameterList();
			case XDDPackage.TPARAMETER_TEMPLATE: return createTParameterTemplate();
			case XDDPackage.TPICTURES_LIST: return createTPicturesList();
			case XDDPackage.TPRODUCT_ID: return createTProductID();
			case XDDPackage.TPROPERTY: return createTProperty();
			case XDDPackage.TRANGE: return createTRange();
			case XDDPackage.TSPECIFICATION_REVISION: return createTSpecificationRevision();
			case XDDPackage.TSUBRANGE: return createTSubrange();
			case XDDPackage.TTEMPLATE_LIST: return createTTemplateList();
			case XDDPackage.TUNIT: return createTUnit();
			case XDDPackage.TVALUE: return createTValue();
			case XDDPackage.TVAR_DECLARATION: return createTVarDeclaration();
			case XDDPackage.TVARIABLE_REF: return createTVariableRef();
			case XDDPackage.TVENDOR_ID: return createTVendorID();
			case XDDPackage.TVERSION: return createTVersion();
			case XDDPackage.VALUE_TYPE: return createValueType();
			case XDDPackage.VARIABLE_ID_REF_TYPE: return createVariableIDRefType();
			case XDDPackage.VENDOR_NAME_TYPE: return createVendorNameType();
			case XDDPackage.VENDOR_TEXT_TYPE: return createVendorTextType();
			case XDDPackage.VERSION_INFO_TYPE: return createVersionInfoType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case XDDPackage.ACCESS_TYPE:
				return createAccessTypeFromString(eDataType, initialValue);
			case XDDPackage.ACCESS_TYPE1:
				return createAccessType1FromString(eDataType, initialValue);
			case XDDPackage.ACCESS_TYPE_TYPE:
				return createAccessTypeTypeFromString(eDataType, initialValue);
			case XDDPackage.CLASSIFICATION_TYPE:
				return createClassificationTypeFromString(eDataType, initialValue);
			case XDDPackage.DEVICE_CLASS_TYPE:
				return createDeviceClassTypeFromString(eDataType, initialValue);
			case XDDPackage.IAS_INTERFACE_DATA_TYPE_MEMBER0:
				return createIASInterfaceDataTypeMember0FromString(eDataType, initialValue);
			case XDDPackage.LE_DCOLORS_TYPE:
				return createLEDcolorsTypeFromString(eDataType, initialValue);
			case XDDPackage.LE_DCOLOR_TYPE:
				return createLEDcolorTypeFromString(eDataType, initialValue);
			case XDDPackage.LE_DTYPE_TYPE:
				return createLEDtypeTypeFromString(eDataType, initialValue);
			case XDDPackage.NODE_TYPE_TYPE:
				return createNodeTypeTypeFromString(eDataType, initialValue);
			case XDDPackage.POSITIONING_TYPE:
				return createPositioningTypeFromString(eDataType, initialValue);
			case XDDPackage.PROFILE_CLASS_ID_DATA_TYPE:
				return createProfileClassIDDataTypeFromString(eDataType, initialValue);
			case XDDPackage.RANGE_TYPE:
				return createRangeTypeFromString(eDataType, initialValue);
			case XDDPackage.STATE_TYPE:
				return createStateTypeFromString(eDataType, initialValue);
			case XDDPackage.SUPPORT_TYPE:
				return createSupportTypeFromString(eDataType, initialValue);
			case XDDPackage.TOBJECT_ACCESS_TYPE:
				return createTObjectAccessTypeFromString(eDataType, initialValue);
			case XDDPackage.TOBJECT_PDO_MAPPING:
				return createTObjectPDOMappingFromString(eDataType, initialValue);
			case XDDPackage.TSPECIFICATION_VERSION:
				return createTSpecificationVersionFromString(eDataType, initialValue);
			case XDDPackage.TYPE_TYPE:
				return createTypeTypeFromString(eDataType, initialValue);
			case XDDPackage.VERSION_TYPE_TYPE:
				return createVersionTypeTypeFromString(eDataType, initialValue);
			case XDDPackage.ACCESS_LIST_TYPE:
				return createAccessListTypeFromString(eDataType, initialValue);
			case XDDPackage.ACCESS_TYPE_OBJECT:
				return createAccessTypeObjectFromString(eDataType, initialValue);
			case XDDPackage.ACCESS_TYPE_OBJECT1:
				return createAccessTypeObject1FromString(eDataType, initialValue);
			case XDDPackage.ACCESS_TYPE_TYPE_OBJECT:
				return createAccessTypeTypeObjectFromString(eDataType, initialValue);
			case XDDPackage.CLASSIFICATION_TYPE_OBJECT:
				return createClassificationTypeObjectFromString(eDataType, initialValue);
			case XDDPackage.DEVICE_CLASS_TYPE_OBJECT:
				return createDeviceClassTypeObjectFromString(eDataType, initialValue);
			case XDDPackage.IAS_INTERFACE_DATA_TYPE:
				return createIASInterfaceDataTypeFromString(eDataType, initialValue);
			case XDDPackage.IAS_INTERFACE_DATA_TYPE_MEMBER0_OBJECT:
				return createIASInterfaceDataTypeMember0ObjectFromString(eDataType, initialValue);
			case XDDPackage.IAS_INTERFACE_DATA_TYPE_MEMBER1:
				return createIASInterfaceDataTypeMember1FromString(eDataType, initialValue);
			case XDDPackage.LE_DCOLORS_TYPE_OBJECT:
				return createLEDcolorsTypeObjectFromString(eDataType, initialValue);
			case XDDPackage.LE_DCOLOR_TYPE_OBJECT:
				return createLEDcolorTypeObjectFromString(eDataType, initialValue);
			case XDDPackage.LE_DTYPE_TYPE_OBJECT:
				return createLEDtypeTypeObjectFromString(eDataType, initialValue);
			case XDDPackage.NODE_TYPE_TYPE_OBJECT:
				return createNodeTypeTypeObjectFromString(eDataType, initialValue);
			case XDDPackage.OFFSET_TYPE:
				return createOffsetTypeFromString(eDataType, initialValue);
			case XDDPackage.POSITIONING_TYPE_OBJECT:
				return createPositioningTypeObjectFromString(eDataType, initialValue);
			case XDDPackage.PROFILE_CLASS_ID_DATA_TYPE_OBJECT:
				return createProfileClassIDDataTypeObjectFromString(eDataType, initialValue);
			case XDDPackage.RANGE_TYPE_OBJECT:
				return createRangeTypeObjectFromString(eDataType, initialValue);
			case XDDPackage.STATE_TYPE_OBJECT:
				return createStateTypeObjectFromString(eDataType, initialValue);
			case XDDPackage.SUPPORTED_LANGUAGES_TYPE:
				return createSupportedLanguagesTypeFromString(eDataType, initialValue);
			case XDDPackage.SUPPORT_TYPE_OBJECT:
				return createSupportTypeObjectFromString(eDataType, initialValue);
			case XDDPackage.TOBJECT_ACCESS_TYPE_OBJECT:
				return createTObjectAccessTypeObjectFromString(eDataType, initialValue);
			case XDDPackage.TOBJECT_PDO_MAPPING_OBJECT:
				return createTObjectPDOMappingObjectFromString(eDataType, initialValue);
			case XDDPackage.TSPECIFICATION_VERSION_OBJECT:
				return createTSpecificationVersionObjectFromString(eDataType, initialValue);
			case XDDPackage.TYPE_TYPE_OBJECT:
				return createTypeTypeObjectFromString(eDataType, initialValue);
			case XDDPackage.VERSION_TYPE_TYPE_OBJECT:
				return createVersionTypeTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case XDDPackage.ACCESS_TYPE:
				return convertAccessTypeToString(eDataType, instanceValue);
			case XDDPackage.ACCESS_TYPE1:
				return convertAccessType1ToString(eDataType, instanceValue);
			case XDDPackage.ACCESS_TYPE_TYPE:
				return convertAccessTypeTypeToString(eDataType, instanceValue);
			case XDDPackage.CLASSIFICATION_TYPE:
				return convertClassificationTypeToString(eDataType, instanceValue);
			case XDDPackage.DEVICE_CLASS_TYPE:
				return convertDeviceClassTypeToString(eDataType, instanceValue);
			case XDDPackage.IAS_INTERFACE_DATA_TYPE_MEMBER0:
				return convertIASInterfaceDataTypeMember0ToString(eDataType, instanceValue);
			case XDDPackage.LE_DCOLORS_TYPE:
				return convertLEDcolorsTypeToString(eDataType, instanceValue);
			case XDDPackage.LE_DCOLOR_TYPE:
				return convertLEDcolorTypeToString(eDataType, instanceValue);
			case XDDPackage.LE_DTYPE_TYPE:
				return convertLEDtypeTypeToString(eDataType, instanceValue);
			case XDDPackage.NODE_TYPE_TYPE:
				return convertNodeTypeTypeToString(eDataType, instanceValue);
			case XDDPackage.POSITIONING_TYPE:
				return convertPositioningTypeToString(eDataType, instanceValue);
			case XDDPackage.PROFILE_CLASS_ID_DATA_TYPE:
				return convertProfileClassIDDataTypeToString(eDataType, instanceValue);
			case XDDPackage.RANGE_TYPE:
				return convertRangeTypeToString(eDataType, instanceValue);
			case XDDPackage.STATE_TYPE:
				return convertStateTypeToString(eDataType, instanceValue);
			case XDDPackage.SUPPORT_TYPE:
				return convertSupportTypeToString(eDataType, instanceValue);
			case XDDPackage.TOBJECT_ACCESS_TYPE:
				return convertTObjectAccessTypeToString(eDataType, instanceValue);
			case XDDPackage.TOBJECT_PDO_MAPPING:
				return convertTObjectPDOMappingToString(eDataType, instanceValue);
			case XDDPackage.TSPECIFICATION_VERSION:
				return convertTSpecificationVersionToString(eDataType, instanceValue);
			case XDDPackage.TYPE_TYPE:
				return convertTypeTypeToString(eDataType, instanceValue);
			case XDDPackage.VERSION_TYPE_TYPE:
				return convertVersionTypeTypeToString(eDataType, instanceValue);
			case XDDPackage.ACCESS_LIST_TYPE:
				return convertAccessListTypeToString(eDataType, instanceValue);
			case XDDPackage.ACCESS_TYPE_OBJECT:
				return convertAccessTypeObjectToString(eDataType, instanceValue);
			case XDDPackage.ACCESS_TYPE_OBJECT1:
				return convertAccessTypeObject1ToString(eDataType, instanceValue);
			case XDDPackage.ACCESS_TYPE_TYPE_OBJECT:
				return convertAccessTypeTypeObjectToString(eDataType, instanceValue);
			case XDDPackage.CLASSIFICATION_TYPE_OBJECT:
				return convertClassificationTypeObjectToString(eDataType, instanceValue);
			case XDDPackage.DEVICE_CLASS_TYPE_OBJECT:
				return convertDeviceClassTypeObjectToString(eDataType, instanceValue);
			case XDDPackage.IAS_INTERFACE_DATA_TYPE:
				return convertIASInterfaceDataTypeToString(eDataType, instanceValue);
			case XDDPackage.IAS_INTERFACE_DATA_TYPE_MEMBER0_OBJECT:
				return convertIASInterfaceDataTypeMember0ObjectToString(eDataType, instanceValue);
			case XDDPackage.IAS_INTERFACE_DATA_TYPE_MEMBER1:
				return convertIASInterfaceDataTypeMember1ToString(eDataType, instanceValue);
			case XDDPackage.LE_DCOLORS_TYPE_OBJECT:
				return convertLEDcolorsTypeObjectToString(eDataType, instanceValue);
			case XDDPackage.LE_DCOLOR_TYPE_OBJECT:
				return convertLEDcolorTypeObjectToString(eDataType, instanceValue);
			case XDDPackage.LE_DTYPE_TYPE_OBJECT:
				return convertLEDtypeTypeObjectToString(eDataType, instanceValue);
			case XDDPackage.NODE_TYPE_TYPE_OBJECT:
				return convertNodeTypeTypeObjectToString(eDataType, instanceValue);
			case XDDPackage.OFFSET_TYPE:
				return convertOffsetTypeToString(eDataType, instanceValue);
			case XDDPackage.POSITIONING_TYPE_OBJECT:
				return convertPositioningTypeObjectToString(eDataType, instanceValue);
			case XDDPackage.PROFILE_CLASS_ID_DATA_TYPE_OBJECT:
				return convertProfileClassIDDataTypeObjectToString(eDataType, instanceValue);
			case XDDPackage.RANGE_TYPE_OBJECT:
				return convertRangeTypeObjectToString(eDataType, instanceValue);
			case XDDPackage.STATE_TYPE_OBJECT:
				return convertStateTypeObjectToString(eDataType, instanceValue);
			case XDDPackage.SUPPORTED_LANGUAGES_TYPE:
				return convertSupportedLanguagesTypeToString(eDataType, instanceValue);
			case XDDPackage.SUPPORT_TYPE_OBJECT:
				return convertSupportTypeObjectToString(eDataType, instanceValue);
			case XDDPackage.TOBJECT_ACCESS_TYPE_OBJECT:
				return convertTObjectAccessTypeObjectToString(eDataType, instanceValue);
			case XDDPackage.TOBJECT_PDO_MAPPING_OBJECT:
				return convertTObjectPDOMappingObjectToString(eDataType, instanceValue);
			case XDDPackage.TSPECIFICATION_VERSION_OBJECT:
				return convertTSpecificationVersionObjectToString(eDataType, instanceValue);
			case XDDPackage.TYPE_TYPE_OBJECT:
				return convertTypeTypeObjectToString(eDataType, instanceValue);
			case XDDPackage.VERSION_TYPE_TYPE_OBJECT:
				return convertVersionTypeTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddInfoType createAddInfoType() {
		AddInfoTypeImpl addInfoType = new AddInfoTypeImpl();
		return addInfoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayType createArrayType() {
		ArrayTypeImpl arrayType = new ArrayTypeImpl();
		return arrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryType createCategoryType() {
		CategoryTypeImpl categoryType = new CategoryTypeImpl();
		return categoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicContentType createCharacteristicContentType() {
		CharacteristicContentTypeImpl characteristicContentType = new CharacteristicContentTypeImpl();
		return characteristicContentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicNameType createCharacteristicNameType() {
		CharacteristicNameTypeImpl characteristicNameType = new CharacteristicNameTypeImpl();
		return characteristicNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicsListType createCharacteristicsListType() {
		CharacteristicsListTypeImpl characteristicsListType = new CharacteristicsListTypeImpl();
		return characteristicsListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicType createCharacteristicType() {
		CharacteristicTypeImpl characteristicType = new CharacteristicTypeImpl();
		return characteristicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompliantWithType createCompliantWithType() {
		CompliantWithTypeImpl compliantWithType = new CompliantWithTypeImpl();
		return compliantWithType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigVarsType createConfigVarsType() {
		ConfigVarsTypeImpl configVarsType = new ConfigVarsTypeImpl();
		return configVarsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionType createConnectionType() {
		ConnectionTypeImpl connectionType = new ConnectionTypeImpl();
		return connectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorType createConnectorType() {
		ConnectorTypeImpl connectorType = new ConnectorTypeImpl();
		return connectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeListType createDataTypeListType() {
		DataTypeListTypeImpl dataTypeListType = new DataTypeListTypeImpl();
		return dataTypeListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedType createDerivedType() {
		DerivedTypeImpl derivedType = new DerivedTypeImpl();
		return derivedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionRefType createDescriptionRefType() {
		DescriptionRefTypeImpl descriptionRefType = new DescriptionRefTypeImpl();
		return descriptionRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionType createDescriptionType() {
		DescriptionTypeImpl descriptionType = new DescriptionTypeImpl();
		return descriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictionaryType createDictionaryType() {
		DictionaryTypeImpl dictionaryType = new DictionaryTypeImpl();
		return dictionaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicChannelsType createDynamicChannelsType() {
		DynamicChannelsTypeImpl dynamicChannelsType = new DynamicChannelsTypeImpl();
		return dynamicChannelsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumType createEnumType() {
		EnumTypeImpl enumType = new EnumTypeImpl();
		return enumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorBitDataType createErrorBitDataType() {
		ErrorBitDataTypeImpl errorBitDataType = new ErrorBitDataTypeImpl();
		return errorBitDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorConstantDataType createErrorConstantDataType() {
		ErrorConstantDataTypeImpl errorConstantDataType = new ErrorConstantDataTypeImpl();
		return errorConstantDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorListType createErrorListType() {
		ErrorListTypeImpl errorListType = new ErrorListTypeImpl();
		return errorListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType createFileType() {
		FileTypeImpl fileType = new FileTypeImpl();
		return fileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirmwareType createFirmwareType() {
		FirmwareTypeImpl firmwareType = new FirmwareTypeImpl();
		return firmwareType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionInstanceType createFunctionInstanceType() {
		FunctionInstanceTypeImpl functionInstanceType = new FunctionInstanceTypeImpl();
		return functionInstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTypeType createFunctionTypeType() {
		FunctionTypeTypeImpl functionTypeType = new FunctionTypeTypeImpl();
		return functionTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityType createIdentityType() {
		IdentityTypeImpl identityType = new IdentityTypeImpl();
		return identityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputVarsType createInputVarsType() {
		InputVarsTypeImpl inputVarsType = new InputVarsTypeImpl();
		return inputVarsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceIDRefType createInstanceIDRefType() {
		InstanceIDRefTypeImpl instanceIDRefType = new InstanceIDRefTypeImpl();
		return instanceIDRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceNameType createInstanceNameType() {
		InstanceNameTypeImpl instanceNameType = new InstanceNameTypeImpl();
		return instanceNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceListType createInterfaceListType() {
		InterfaceListTypeImpl interfaceListType = new InterfaceListTypeImpl();
		return interfaceListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISO15745ProfileContainerType createISO15745ProfileContainerType() {
		ISO15745ProfileContainerTypeImpl iso15745ProfileContainerType = new ISO15745ProfileContainerTypeImpl();
		return iso15745ProfileContainerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISO15745ProfileType createISO15745ProfileType() {
		ISO15745ProfileTypeImpl iso15745ProfileType = new ISO15745ProfileTypeImpl();
		return iso15745ProfileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISO15745ReferenceDataType createISO15745ReferenceDataType() {
		ISO15745ReferenceDataTypeImpl iso15745ReferenceDataType = new ISO15745ReferenceDataTypeImpl();
		return iso15745ReferenceDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelRefType createLabelRefType() {
		LabelRefTypeImpl labelRefType = new LabelRefTypeImpl();
		return labelRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelType createLabelType() {
		LabelTypeImpl labelType = new LabelTypeImpl();
		return labelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEDListType createLEDListType() {
		LEDListTypeImpl ledListType = new LEDListTypeImpl();
		return ledListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEDstateRefType createLEDstateRefType() {
		LEDstateRefTypeImpl leDstateRefType = new LEDstateRefTypeImpl();
		return leDstateRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEDstateType createLEDstateType() {
		LEDstateTypeImpl leDstateType = new LEDstateTypeImpl();
		return leDstateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxValueType createMaxValueType() {
		MaxValueTypeImpl maxValueType = new MaxValueTypeImpl();
		return maxValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberRefType createMemberRefType() {
		MemberRefTypeImpl memberRefType = new MemberRefTypeImpl();
		return memberRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinValueType createMinValueType() {
		MinValueTypeImpl minValueType = new MinValueTypeImpl();
		return minValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectListType createObjectListType() {
		ObjectListTypeImpl objectListType = new ObjectListTypeImpl();
		return objectListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderNumberType createOrderNumberType() {
		OrderNumberTypeImpl orderNumberType = new OrderNumberTypeImpl();
		return orderNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputVarsType createOutputVarsType() {
		OutputVarsTypeImpl outputVarsType = new OutputVarsTypeImpl();
		return outputVarsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterRefType createParameterRefType() {
		ParameterRefTypeImpl parameterRefType = new ParameterRefTypeImpl();
		return parameterRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType createParameterType() {
		ParameterTypeImpl parameterType = new ParameterTypeImpl();
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PictureType createPictureType() {
		PictureTypeImpl pictureType = new PictureTypeImpl();
		return pictureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFamilyType createProductFamilyType() {
		ProductFamilyTypeImpl productFamilyType = new ProductFamilyTypeImpl();
		return productFamilyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductNameType createProductNameType() {
		ProductNameTypeImpl productNameType = new ProductNameTypeImpl();
		return productNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductTextType createProductTextType() {
		ProductTextTypeImpl productTextType = new ProductTextTypeImpl();
		return productTextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileBodyCommunicationNetworkPowerlink createProfileBodyCommunicationNetworkPowerlink() {
		ProfileBodyCommunicationNetworkPowerlinkImpl profileBodyCommunicationNetworkPowerlink = new ProfileBodyCommunicationNetworkPowerlinkImpl();
		return profileBodyCommunicationNetworkPowerlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileBodyDevicePowerlink createProfileBodyDevicePowerlink() {
		ProfileBodyDevicePowerlinkImpl profileBodyDevicePowerlink = new ProfileBodyDevicePowerlinkImpl();
		return profileBodyDevicePowerlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileHandleDataType createProfileHandleDataType() {
		ProfileHandleDataTypeImpl profileHandleDataType = new ProfileHandleDataTypeImpl();
		return profileHandleDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileHeaderDataType createProfileHeaderDataType() {
		ProfileHeaderDataTypeImpl profileHeaderDataType = new ProfileHeaderDataTypeImpl();
		return profileHeaderDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardComplianceListType createStandardComplianceListType() {
		StandardComplianceListTypeImpl standardComplianceListType = new StandardComplianceListTypeImpl();
		return standardComplianceListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticErrorBitFieldType createStaticErrorBitFieldType() {
		StaticErrorBitFieldTypeImpl staticErrorBitFieldType = new StaticErrorBitFieldTypeImpl();
		return staticErrorBitFieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepType createStepType() {
		StepTypeImpl stepType = new StepTypeImpl();
		return stepType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructType createStructType() {
		StructTypeImpl structType = new StructTypeImpl();
		return structType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubObjectType createSubObjectType() {
		SubObjectTypeImpl subObjectType = new SubObjectTypeImpl();
		return subObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAllowedValues createTAllowedValues() {
		TAllowedValuesImpl tAllowedValues = new TAllowedValuesImpl();
		return tAllowedValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAllowedValuesTemplate createTAllowedValuesTemplate() {
		TAllowedValuesTemplateImpl tAllowedValuesTemplate = new TAllowedValuesTemplateImpl();
		return tAllowedValuesTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TApplicationLayers createTApplicationLayers() {
		TApplicationLayersImpl tApplicationLayers = new TApplicationLayersImpl();
		return tApplicationLayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TApplicationProcess createTApplicationProcess() {
		TApplicationProcessImpl tApplicationProcess = new TApplicationProcessImpl();
		return tApplicationProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCapabilities createTCapabilities() {
		TCapabilitiesImpl tCapabilities = new TCapabilitiesImpl();
		return tCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClassificationList createTClassificationList() {
		TClassificationListImpl tClassificationList = new TClassificationListImpl();
		return tClassificationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCNFeatures createTCNFeatures() {
		TCNFeaturesImpl tcnFeatures = new TCNFeaturesImpl();
		return tcnFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCombinedState createTCombinedState() {
		TCombinedStateImpl tCombinedState = new TCombinedStateImpl();
		return tCombinedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TConditionalSupport createTConditionalSupport() {
		TConditionalSupportImpl tConditionalSupport = new TConditionalSupportImpl();
		return tConditionalSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TConnectorList createTConnectorList() {
		TConnectorListImpl tConnectorList = new TConnectorListImpl();
		return tConnectorList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCount createTCount() {
		TCountImpl tCount = new TCountImpl();
		return tCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDataTypeIDRef createTDataTypeIDRef() {
		TDataTypeIDRefImpl tDataTypeIDRef = new TDataTypeIDRefImpl();
		return tDataTypeIDRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDataTypeList createTDataTypeList() {
		TDataTypeListImpl tDataTypeList = new TDataTypeListImpl();
		return tDataTypeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDataTypes createTDataTypes() {
		TDataTypesImpl tDataTypes = new TDataTypesImpl();
		return tDataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDenotation createTDenotation() {
		TDenotationImpl tDenotation = new TDenotationImpl();
		return tDenotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDeviceCommissioning createTDeviceCommissioning() {
		TDeviceCommissioningImpl tDeviceCommissioning = new TDeviceCommissioningImpl();
		return tDeviceCommissioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDeviceFamily createTDeviceFamily() {
		TDeviceFamilyImpl tDeviceFamily = new TDeviceFamilyImpl();
		return tDeviceFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDeviceFunction createTDeviceFunction() {
		TDeviceFunctionImpl tDeviceFunction = new TDeviceFunctionImpl();
		return tDeviceFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDeviceIdentity createTDeviceIdentity() {
		TDeviceIdentityImpl tDeviceIdentity = new TDeviceIdentityImpl();
		return tDeviceIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDeviceManager createTDeviceManager() {
		TDeviceManagerImpl tDeviceManager = new TDeviceManagerImpl();
		return tDeviceManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDiagnostic createTDiagnostic() {
		TDiagnosticImpl tDiagnostic = new TDiagnosticImpl();
		return tDiagnostic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDictionaryList createTDictionaryList() {
		TDictionaryListImpl tDictionaryList = new TDictionaryListImpl();
		return tDictionaryList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDynamicChannel createTDynamicChannel() {
		TDynamicChannelImpl tDynamicChannel = new TDynamicChannelImpl();
		return tDynamicChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEnumValue createTEnumValue() {
		TEnumValueImpl tEnumValue = new TEnumValueImpl();
		return tEnumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextEntryType createTextEntryType() {
		TextEntryTypeImpl textEntryType = new TextEntryTypeImpl();
		return textEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextResourceType createTextResourceType() {
		TextResourceTypeImpl textResourceType = new TextResourceTypeImpl();
		return textResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFirmwareList createTFirmwareList() {
		TFirmwareListImpl tFirmwareList = new TFirmwareListImpl();
		return tFirmwareList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFunctionInstanceList createTFunctionInstanceList() {
		TFunctionInstanceListImpl tFunctionInstanceList = new TFunctionInstanceListImpl();
		return tFunctionInstanceList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFunctionTypeList createTFunctionTypeList() {
		TFunctionTypeListImpl tFunctionTypeList = new TFunctionTypeListImpl();
		return tFunctionTypeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TGeneralFeatures createTGeneralFeatures() {
		TGeneralFeaturesImpl tGeneralFeatures = new TGeneralFeaturesImpl();
		return tGeneralFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TIndicatorList createTIndicatorList() {
		TIndicatorListImpl tIndicatorList = new TIndicatorListImpl();
		return tIndicatorList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLED createTLED() {
		TLEDImpl tled = new TLEDImpl();
		return tled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMNFeatures createTMNFeatures() {
		TMNFeaturesImpl tmnFeatures = new TMNFeaturesImpl();
		return tmnFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TNetworkManagement createTNetworkManagement() {
		TNetworkManagementImpl tNetworkManagement = new TNetworkManagementImpl();
		return tNetworkManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TObject createTObject() {
		TObjectImpl tObject = new TObjectImpl();
		return tObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TParameterGroup createTParameterGroup() {
		TParameterGroupImpl tParameterGroup = new TParameterGroupImpl();
		return tParameterGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TParameterGroupList createTParameterGroupList() {
		TParameterGroupListImpl tParameterGroupList = new TParameterGroupListImpl();
		return tParameterGroupList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TParameterList createTParameterList() {
		TParameterListImpl tParameterList = new TParameterListImpl();
		return tParameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TParameterTemplate createTParameterTemplate() {
		TParameterTemplateImpl tParameterTemplate = new TParameterTemplateImpl();
		return tParameterTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPicturesList createTPicturesList() {
		TPicturesListImpl tPicturesList = new TPicturesListImpl();
		return tPicturesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TProductID createTProductID() {
		TProductIDImpl tProductID = new TProductIDImpl();
		return tProductID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TProperty createTProperty() {
		TPropertyImpl tProperty = new TPropertyImpl();
		return tProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRange createTRange() {
		TRangeImpl tRange = new TRangeImpl();
		return tRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSpecificationRevision createTSpecificationRevision() {
		TSpecificationRevisionImpl tSpecificationRevision = new TSpecificationRevisionImpl();
		return tSpecificationRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSubrange createTSubrange() {
		TSubrangeImpl tSubrange = new TSubrangeImpl();
		return tSubrange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTemplateList createTTemplateList() {
		TTemplateListImpl tTemplateList = new TTemplateListImpl();
		return tTemplateList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TUnit createTUnit() {
		TUnitImpl tUnit = new TUnitImpl();
		return tUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TValue createTValue() {
		TValueImpl tValue = new TValueImpl();
		return tValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVarDeclaration createTVarDeclaration() {
		TVarDeclarationImpl tVarDeclaration = new TVarDeclarationImpl();
		return tVarDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVariableRef createTVariableRef() {
		TVariableRefImpl tVariableRef = new TVariableRefImpl();
		return tVariableRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVendorID createTVendorID() {
		TVendorIDImpl tVendorID = new TVendorIDImpl();
		return tVendorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVersion createTVersion() {
		TVersionImpl tVersion = new TVersionImpl();
		return tVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType createValueType() {
		ValueTypeImpl valueType = new ValueTypeImpl();
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableIDRefType createVariableIDRefType() {
		VariableIDRefTypeImpl variableIDRefType = new VariableIDRefTypeImpl();
		return variableIDRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendorNameType createVendorNameType() {
		VendorNameTypeImpl vendorNameType = new VendorNameTypeImpl();
		return vendorNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendorTextType createVendorTextType() {
		VendorTextTypeImpl vendorTextType = new VendorTextTypeImpl();
		return vendorTextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionInfoType createVersionInfoType() {
		VersionInfoTypeImpl versionInfoType = new VersionInfoTypeImpl();
		return versionInfoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType createAccessTypeFromString(EDataType eDataType, String initialValue) {
		AccessType result = AccessType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType1 createAccessType1FromString(EDataType eDataType, String initialValue) {
		AccessType1 result = AccessType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessTypeType createAccessTypeTypeFromString(EDataType eDataType, String initialValue) {
		AccessTypeType result = AccessTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationType createClassificationTypeFromString(EDataType eDataType, String initialValue) {
		ClassificationType result = ClassificationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassificationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceClassType createDeviceClassTypeFromString(EDataType eDataType, String initialValue) {
		DeviceClassType result = DeviceClassType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceClassTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IASInterfaceDataTypeMember0 createIASInterfaceDataTypeMember0FromString(EDataType eDataType, String initialValue) {
		IASInterfaceDataTypeMember0 result = IASInterfaceDataTypeMember0.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIASInterfaceDataTypeMember0ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEDcolorsType createLEDcolorsTypeFromString(EDataType eDataType, String initialValue) {
		LEDcolorsType result = LEDcolorsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLEDcolorsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEDcolorType createLEDcolorTypeFromString(EDataType eDataType, String initialValue) {
		LEDcolorType result = LEDcolorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLEDcolorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEDtypeType createLEDtypeTypeFromString(EDataType eDataType, String initialValue) {
		LEDtypeType result = LEDtypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLEDtypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeTypeType createNodeTypeTypeFromString(EDataType eDataType, String initialValue) {
		NodeTypeType result = NodeTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositioningType createPositioningTypeFromString(EDataType eDataType, String initialValue) {
		PositioningType result = PositioningType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositioningTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileClassIDDataType createProfileClassIDDataTypeFromString(EDataType eDataType, String initialValue) {
		ProfileClassIDDataType result = ProfileClassIDDataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProfileClassIDDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeType createRangeTypeFromString(EDataType eDataType, String initialValue) {
		RangeType result = RangeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRangeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType createStateTypeFromString(EDataType eDataType, String initialValue) {
		StateType result = StateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportType createSupportTypeFromString(EDataType eDataType, String initialValue) {
		SupportType result = SupportType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupportTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TObjectAccessType createTObjectAccessTypeFromString(EDataType eDataType, String initialValue) {
		TObjectAccessType result = TObjectAccessType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTObjectAccessTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TObjectPDOMapping createTObjectPDOMappingFromString(EDataType eDataType, String initialValue) {
		TObjectPDOMapping result = TObjectPDOMapping.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTObjectPDOMappingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSpecificationVersion createTSpecificationVersionFromString(EDataType eDataType, String initialValue) {
		TSpecificationVersion result = TSpecificationVersion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTSpecificationVersionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeFromString(EDataType eDataType, String initialValue) {
		TypeType result = TypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionTypeType createVersionTypeTypeFromString(EDataType eDataType, String initialValue) {
		VersionTypeType result = VersionTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createAccessListTypeFromString(EDataType eDataType, String initialValue) {
		return (List)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NMTOKENS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessListTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NMTOKENS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType createAccessTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAccessTypeFromString(XDDPackage.eINSTANCE.getAccessType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAccessTypeToString(XDDPackage.eINSTANCE.getAccessType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType1 createAccessTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createAccessType1FromString(XDDPackage.eINSTANCE.getAccessType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertAccessType1ToString(XDDPackage.eINSTANCE.getAccessType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessTypeType createAccessTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAccessTypeTypeFromString(XDDPackage.eINSTANCE.getAccessTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAccessTypeTypeToString(XDDPackage.eINSTANCE.getAccessTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationType createClassificationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createClassificationTypeFromString(XDDPackage.eINSTANCE.getClassificationType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassificationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertClassificationTypeToString(XDDPackage.eINSTANCE.getClassificationType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceClassType createDeviceClassTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceClassTypeFromString(XDDPackage.eINSTANCE.getDeviceClassType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceClassTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceClassTypeToString(XDDPackage.eINSTANCE.getDeviceClassType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createIASInterfaceDataTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createIASInterfaceDataTypeMember0FromString(XDDPackage.eINSTANCE.getIASInterfaceDataTypeMember0(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createIASInterfaceDataTypeMember1FromString(XDDPackage.eINSTANCE.getIASInterfaceDataTypeMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIASInterfaceDataTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XDDPackage.eINSTANCE.getIASInterfaceDataTypeMember0().isInstance(instanceValue)) {
			try {
				String value = convertIASInterfaceDataTypeMember0ToString(XDDPackage.eINSTANCE.getIASInterfaceDataTypeMember0(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XDDPackage.eINSTANCE.getIASInterfaceDataTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertIASInterfaceDataTypeMember1ToString(XDDPackage.eINSTANCE.getIASInterfaceDataTypeMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IASInterfaceDataTypeMember0 createIASInterfaceDataTypeMember0ObjectFromString(EDataType eDataType, String initialValue) {
		return createIASInterfaceDataTypeMember0FromString(XDDPackage.eINSTANCE.getIASInterfaceDataTypeMember0(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIASInterfaceDataTypeMember0ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIASInterfaceDataTypeMember0ToString(XDDPackage.eINSTANCE.getIASInterfaceDataTypeMember0(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIASInterfaceDataTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIASInterfaceDataTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEDcolorsType createLEDcolorsTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLEDcolorsTypeFromString(XDDPackage.eINSTANCE.getLEDcolorsType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLEDcolorsTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLEDcolorsTypeToString(XDDPackage.eINSTANCE.getLEDcolorsType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEDcolorType createLEDcolorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLEDcolorTypeFromString(XDDPackage.eINSTANCE.getLEDcolorType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLEDcolorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLEDcolorTypeToString(XDDPackage.eINSTANCE.getLEDcolorType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEDtypeType createLEDtypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLEDtypeTypeFromString(XDDPackage.eINSTANCE.getLEDtypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLEDtypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLEDtypeTypeToString(XDDPackage.eINSTANCE.getLEDtypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeTypeType createNodeTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNodeTypeTypeFromString(XDDPackage.eINSTANCE.getNodeTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNodeTypeTypeToString(XDDPackage.eINSTANCE.getNodeTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createOffsetTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOffsetTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositioningType createPositioningTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPositioningTypeFromString(XDDPackage.eINSTANCE.getPositioningType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositioningTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPositioningTypeToString(XDDPackage.eINSTANCE.getPositioningType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileClassIDDataType createProfileClassIDDataTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createProfileClassIDDataTypeFromString(XDDPackage.eINSTANCE.getProfileClassIDDataType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProfileClassIDDataTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProfileClassIDDataTypeToString(XDDPackage.eINSTANCE.getProfileClassIDDataType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeType createRangeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRangeTypeFromString(XDDPackage.eINSTANCE.getRangeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRangeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRangeTypeToString(XDDPackage.eINSTANCE.getRangeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType createStateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStateTypeFromString(XDDPackage.eINSTANCE.getStateType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStateTypeToString(XDDPackage.eINSTANCE.getStateType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createSupportedLanguagesTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add((String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LANGUAGE, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupportedLanguagesTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LANGUAGE, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportType createSupportTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSupportTypeFromString(XDDPackage.eINSTANCE.getSupportType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupportTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSupportTypeToString(XDDPackage.eINSTANCE.getSupportType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TObjectAccessType createTObjectAccessTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTObjectAccessTypeFromString(XDDPackage.eINSTANCE.getTObjectAccessType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTObjectAccessTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTObjectAccessTypeToString(XDDPackage.eINSTANCE.getTObjectAccessType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TObjectPDOMapping createTObjectPDOMappingObjectFromString(EDataType eDataType, String initialValue) {
		return createTObjectPDOMappingFromString(XDDPackage.eINSTANCE.getTObjectPDOMapping(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTObjectPDOMappingObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTObjectPDOMappingToString(XDDPackage.eINSTANCE.getTObjectPDOMapping(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSpecificationVersion createTSpecificationVersionObjectFromString(EDataType eDataType, String initialValue) {
		return createTSpecificationVersionFromString(XDDPackage.eINSTANCE.getTSpecificationVersion(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTSpecificationVersionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTSpecificationVersionToString(XDDPackage.eINSTANCE.getTSpecificationVersion(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeTypeFromString(XDDPackage.eINSTANCE.getTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeTypeToString(XDDPackage.eINSTANCE.getTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionTypeType createVersionTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createVersionTypeTypeFromString(XDDPackage.eINSTANCE.getVersionTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVersionTypeTypeToString(XDDPackage.eINSTANCE.getVersionTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDDPackage getXDDPackage() {
		return (XDDPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XDDPackage getPackage() {
		return XDDPackage.eINSTANCE;
	}

} //XDDFactoryImpl
