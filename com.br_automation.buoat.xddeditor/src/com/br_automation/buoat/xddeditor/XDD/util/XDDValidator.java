/**
 */
package com.br_automation.buoat.xddeditor.XDD.util;

import java.math.BigInteger;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import com.br_automation.buoat.xddeditor.XDD.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage
 * @generated
 */
public class XDDValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final XDDValidator INSTANCE = new XDDValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "com.br_automation.buoat.xddeditor.ethernet";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDDValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return XDDPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case XDDPackage.ADD_INFO_TYPE:
				return validateAddInfoType((AddInfoType)value, diagnostics, context);
			case XDDPackage.ARRAY_TYPE:
				return validateArrayType((ArrayType)value, diagnostics, context);
			case XDDPackage.CATEGORY_TYPE:
				return validateCategoryType((CategoryType)value, diagnostics, context);
			case XDDPackage.CHARACTERISTIC_CONTENT_TYPE:
				return validateCharacteristicContentType((CharacteristicContentType)value, diagnostics, context);
			case XDDPackage.CHARACTERISTIC_NAME_TYPE:
				return validateCharacteristicNameType((CharacteristicNameType)value, diagnostics, context);
			case XDDPackage.CHARACTERISTICS_LIST_TYPE:
				return validateCharacteristicsListType((CharacteristicsListType)value, diagnostics, context);
			case XDDPackage.CHARACTERISTIC_TYPE:
				return validateCharacteristicType((CharacteristicType)value, diagnostics, context);
			case XDDPackage.COMPLIANT_WITH_TYPE:
				return validateCompliantWithType((CompliantWithType)value, diagnostics, context);
			case XDDPackage.CONFIG_VARS_TYPE:
				return validateConfigVarsType((ConfigVarsType)value, diagnostics, context);
			case XDDPackage.CONNECTION_TYPE:
				return validateConnectionType((ConnectionType)value, diagnostics, context);
			case XDDPackage.CONNECTOR_TYPE:
				return validateConnectorType((ConnectorType)value, diagnostics, context);
			case XDDPackage.DATA_TYPE_LIST_TYPE:
				return validateDataTypeListType((DataTypeListType)value, diagnostics, context);
			case XDDPackage.DERIVED_TYPE:
				return validateDerivedType((DerivedType)value, diagnostics, context);
			case XDDPackage.DESCRIPTION_REF_TYPE:
				return validateDescriptionRefType((DescriptionRefType)value, diagnostics, context);
			case XDDPackage.DESCRIPTION_TYPE:
				return validateDescriptionType((DescriptionType)value, diagnostics, context);
			case XDDPackage.DICTIONARY_TYPE:
				return validateDictionaryType((DictionaryType)value, diagnostics, context);
			case XDDPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case XDDPackage.DYNAMIC_CHANNELS_TYPE:
				return validateDynamicChannelsType((DynamicChannelsType)value, diagnostics, context);
			case XDDPackage.ENUM_TYPE:
				return validateEnumType((EnumType)value, diagnostics, context);
			case XDDPackage.ERROR_BIT_DATA_TYPE:
				return validateErrorBitDataType((ErrorBitDataType)value, diagnostics, context);
			case XDDPackage.ERROR_CONSTANT_DATA_TYPE:
				return validateErrorConstantDataType((ErrorConstantDataType)value, diagnostics, context);
			case XDDPackage.ERROR_LIST_TYPE:
				return validateErrorListType((ErrorListType)value, diagnostics, context);
			case XDDPackage.FILE_TYPE:
				return validateFileType((FileType)value, diagnostics, context);
			case XDDPackage.FIRMWARE_TYPE:
				return validateFirmwareType((FirmwareType)value, diagnostics, context);
			case XDDPackage.FUNCTION_INSTANCE_TYPE:
				return validateFunctionInstanceType((FunctionInstanceType)value, diagnostics, context);
			case XDDPackage.FUNCTION_TYPE_TYPE:
				return validateFunctionTypeType((FunctionTypeType)value, diagnostics, context);
			case XDDPackage.IDENTITY_TYPE:
				return validateIdentityType((IdentityType)value, diagnostics, context);
			case XDDPackage.INPUT_VARS_TYPE:
				return validateInputVarsType((InputVarsType)value, diagnostics, context);
			case XDDPackage.INSTANCE_ID_REF_TYPE:
				return validateInstanceIDRefType((InstanceIDRefType)value, diagnostics, context);
			case XDDPackage.INSTANCE_NAME_TYPE:
				return validateInstanceNameType((InstanceNameType)value, diagnostics, context);
			case XDDPackage.INTERFACE_LIST_TYPE:
				return validateInterfaceListType((InterfaceListType)value, diagnostics, context);
			case XDDPackage.ISO15745_PROFILE_CONTAINER_TYPE:
				return validateISO15745ProfileContainerType((ISO15745ProfileContainerType)value, diagnostics, context);
			case XDDPackage.ISO15745_PROFILE_TYPE:
				return validateISO15745ProfileType((ISO15745ProfileType)value, diagnostics, context);
			case XDDPackage.ISO15745_REFERENCE_DATA_TYPE:
				return validateISO15745ReferenceDataType((ISO15745ReferenceDataType)value, diagnostics, context);
			case XDDPackage.LABEL_REF_TYPE:
				return validateLabelRefType((LabelRefType)value, diagnostics, context);
			case XDDPackage.LABEL_TYPE:
				return validateLabelType((LabelType)value, diagnostics, context);
			case XDDPackage.LED_LIST_TYPE:
				return validateLEDListType((LEDListType)value, diagnostics, context);
			case XDDPackage.LE_DSTATE_REF_TYPE:
				return validateLEDstateRefType((LEDstateRefType)value, diagnostics, context);
			case XDDPackage.LE_DSTATE_TYPE:
				return validateLEDstateType((LEDstateType)value, diagnostics, context);
			case XDDPackage.MAX_VALUE_TYPE:
				return validateMaxValueType((MaxValueType)value, diagnostics, context);
			case XDDPackage.MEMBER_REF_TYPE:
				return validateMemberRefType((MemberRefType)value, diagnostics, context);
			case XDDPackage.MIN_VALUE_TYPE:
				return validateMinValueType((MinValueType)value, diagnostics, context);
			case XDDPackage.OBJECT_LIST_TYPE:
				return validateObjectListType((ObjectListType)value, diagnostics, context);
			case XDDPackage.ORDER_NUMBER_TYPE:
				return validateOrderNumberType((OrderNumberType)value, diagnostics, context);
			case XDDPackage.OUTPUT_VARS_TYPE:
				return validateOutputVarsType((OutputVarsType)value, diagnostics, context);
			case XDDPackage.PARAMETER_REF_TYPE:
				return validateParameterRefType((ParameterRefType)value, diagnostics, context);
			case XDDPackage.PARAMETER_TYPE:
				return validateParameterType((ParameterType)value, diagnostics, context);
			case XDDPackage.PICTURE_TYPE:
				return validatePictureType((PictureType)value, diagnostics, context);
			case XDDPackage.PRODUCT_FAMILY_TYPE:
				return validateProductFamilyType((ProductFamilyType)value, diagnostics, context);
			case XDDPackage.PRODUCT_NAME_TYPE:
				return validateProductNameType((ProductNameType)value, diagnostics, context);
			case XDDPackage.PRODUCT_TEXT_TYPE:
				return validateProductTextType((ProductTextType)value, diagnostics, context);
			case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK:
				return validateProfileBodyCommunicationNetworkPowerlink((ProfileBodyCommunicationNetworkPowerlink)value, diagnostics, context);
			case XDDPackage.PROFILE_BODY_DATA_TYPE:
				return validateProfileBodyDataType((ProfileBodyDataType)value, diagnostics, context);
			case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK:
				return validateProfileBodyDevicePowerlink((ProfileBodyDevicePowerlink)value, diagnostics, context);
			case XDDPackage.PROFILE_HANDLE_DATA_TYPE:
				return validateProfileHandleDataType((ProfileHandleDataType)value, diagnostics, context);
			case XDDPackage.PROFILE_HEADER_DATA_TYPE:
				return validateProfileHeaderDataType((ProfileHeaderDataType)value, diagnostics, context);
			case XDDPackage.STANDARD_COMPLIANCE_LIST_TYPE:
				return validateStandardComplianceListType((StandardComplianceListType)value, diagnostics, context);
			case XDDPackage.STATIC_ERROR_BIT_FIELD_TYPE:
				return validateStaticErrorBitFieldType((StaticErrorBitFieldType)value, diagnostics, context);
			case XDDPackage.STEP_TYPE:
				return validateStepType((StepType)value, diagnostics, context);
			case XDDPackage.STRUCT_TYPE:
				return validateStructType((StructType)value, diagnostics, context);
			case XDDPackage.SUB_OBJECT_TYPE:
				return validateSubObjectType((SubObjectType)value, diagnostics, context);
			case XDDPackage.TALLOWED_VALUES:
				return validateTAllowedValues((TAllowedValues)value, diagnostics, context);
			case XDDPackage.TALLOWED_VALUES_TEMPLATE:
				return validateTAllowedValuesTemplate((TAllowedValuesTemplate)value, diagnostics, context);
			case XDDPackage.TAPPLICATION_LAYERS:
				return validateTApplicationLayers((TApplicationLayers)value, diagnostics, context);
			case XDDPackage.TAPPLICATION_PROCESS:
				return validateTApplicationProcess((TApplicationProcess)value, diagnostics, context);
			case XDDPackage.TCAPABILITIES:
				return validateTCapabilities((TCapabilities)value, diagnostics, context);
			case XDDPackage.TCLASSIFICATION_LIST:
				return validateTClassificationList((TClassificationList)value, diagnostics, context);
			case XDDPackage.TCN_FEATURES:
				return validateTCNFeatures((TCNFeatures)value, diagnostics, context);
			case XDDPackage.TCOMBINED_STATE:
				return validateTCombinedState((TCombinedState)value, diagnostics, context);
			case XDDPackage.TCONDITIONAL_SUPPORT:
				return validateTConditionalSupport((TConditionalSupport)value, diagnostics, context);
			case XDDPackage.TCONNECTOR_LIST:
				return validateTConnectorList((TConnectorList)value, diagnostics, context);
			case XDDPackage.TCOUNT:
				return validateTCount((TCount)value, diagnostics, context);
			case XDDPackage.TDATA_TYPE_ID_REF:
				return validateTDataTypeIDRef((TDataTypeIDRef)value, diagnostics, context);
			case XDDPackage.TDATA_TYPE_LIST:
				return validateTDataTypeList((TDataTypeList)value, diagnostics, context);
			case XDDPackage.TDATA_TYPES:
				return validateTDataTypes((TDataTypes)value, diagnostics, context);
			case XDDPackage.TDENOTATION:
				return validateTDenotation((TDenotation)value, diagnostics, context);
			case XDDPackage.TDEVICE_COMMISSIONING:
				return validateTDeviceCommissioning((TDeviceCommissioning)value, diagnostics, context);
			case XDDPackage.TDEVICE_FAMILY:
				return validateTDeviceFamily((TDeviceFamily)value, diagnostics, context);
			case XDDPackage.TDEVICE_FUNCTION:
				return validateTDeviceFunction((TDeviceFunction)value, diagnostics, context);
			case XDDPackage.TDEVICE_IDENTITY:
				return validateTDeviceIdentity((TDeviceIdentity)value, diagnostics, context);
			case XDDPackage.TDEVICE_MANAGER:
				return validateTDeviceManager((TDeviceManager)value, diagnostics, context);
			case XDDPackage.TDIAGNOSTIC:
				return validateTDiagnostic((TDiagnostic)value, diagnostics, context);
			case XDDPackage.TDICTIONARY_LIST:
				return validateTDictionaryList((TDictionaryList)value, diagnostics, context);
			case XDDPackage.TDYNAMIC_CHANNEL:
				return validateTDynamicChannel((TDynamicChannel)value, diagnostics, context);
			case XDDPackage.TENUM_VALUE:
				return validateTEnumValue((TEnumValue)value, diagnostics, context);
			case XDDPackage.TEXT_ENTRY_TYPE:
				return validateTextEntryType((TextEntryType)value, diagnostics, context);
			case XDDPackage.TEXT_RESOURCE_TYPE:
				return validateTextResourceType((TextResourceType)value, diagnostics, context);
			case XDDPackage.TFIRMWARE_LIST:
				return validateTFirmwareList((TFirmwareList)value, diagnostics, context);
			case XDDPackage.TFUNCTION_INSTANCE_LIST:
				return validateTFunctionInstanceList((TFunctionInstanceList)value, diagnostics, context);
			case XDDPackage.TFUNCTION_TYPE_LIST:
				return validateTFunctionTypeList((TFunctionTypeList)value, diagnostics, context);
			case XDDPackage.TGENERAL_FEATURES:
				return validateTGeneralFeatures((TGeneralFeatures)value, diagnostics, context);
			case XDDPackage.TINDICATOR_LIST:
				return validateTIndicatorList((TIndicatorList)value, diagnostics, context);
			case XDDPackage.TLED:
				return validateTLED((TLED)value, diagnostics, context);
			case XDDPackage.TMN_FEATURES:
				return validateTMNFeatures((TMNFeatures)value, diagnostics, context);
			case XDDPackage.TNETWORK_MANAGEMENT:
				return validateTNetworkManagement((TNetworkManagement)value, diagnostics, context);
			case XDDPackage.TOBJECT:
				return validateTObject((TObject)value, diagnostics, context);
			case XDDPackage.TPARAMETER_GROUP:
				return validateTParameterGroup((TParameterGroup)value, diagnostics, context);
			case XDDPackage.TPARAMETER_GROUP_LIST:
				return validateTParameterGroupList((TParameterGroupList)value, diagnostics, context);
			case XDDPackage.TPARAMETER_LIST:
				return validateTParameterList((TParameterList)value, diagnostics, context);
			case XDDPackage.TPARAMETER_TEMPLATE:
				return validateTParameterTemplate((TParameterTemplate)value, diagnostics, context);
			case XDDPackage.TPICTURES_LIST:
				return validateTPicturesList((TPicturesList)value, diagnostics, context);
			case XDDPackage.TPRODUCT_ID:
				return validateTProductID((TProductID)value, diagnostics, context);
			case XDDPackage.TPROPERTY:
				return validateTProperty((TProperty)value, diagnostics, context);
			case XDDPackage.TRANGE:
				return validateTRange((TRange)value, diagnostics, context);
			case XDDPackage.TSPECIFICATION_REVISION:
				return validateTSpecificationRevision((TSpecificationRevision)value, diagnostics, context);
			case XDDPackage.TSUBRANGE:
				return validateTSubrange((TSubrange)value, diagnostics, context);
			case XDDPackage.TTEMPLATE_LIST:
				return validateTTemplateList((TTemplateList)value, diagnostics, context);
			case XDDPackage.TUNIT:
				return validateTUnit((TUnit)value, diagnostics, context);
			case XDDPackage.TVALUE:
				return validateTValue((TValue)value, diagnostics, context);
			case XDDPackage.TVAR_DECLARATION:
				return validateTVarDeclaration((TVarDeclaration)value, diagnostics, context);
			case XDDPackage.TVARIABLE_REF:
				return validateTVariableRef((TVariableRef)value, diagnostics, context);
			case XDDPackage.TVENDOR_ID:
				return validateTVendorID((TVendorID)value, diagnostics, context);
			case XDDPackage.TVERSION:
				return validateTVersion((TVersion)value, diagnostics, context);
			case XDDPackage.VALUE_TYPE:
				return validateValueType((ValueType)value, diagnostics, context);
			case XDDPackage.VARIABLE_ID_REF_TYPE:
				return validateVariableIDRefType((VariableIDRefType)value, diagnostics, context);
			case XDDPackage.VENDOR_NAME_TYPE:
				return validateVendorNameType((VendorNameType)value, diagnostics, context);
			case XDDPackage.VENDOR_TEXT_TYPE:
				return validateVendorTextType((VendorTextType)value, diagnostics, context);
			case XDDPackage.VERSION_INFO_TYPE:
				return validateVersionInfoType((VersionInfoType)value, diagnostics, context);
			case XDDPackage.ACCESS_TYPE:
				return validateAccessType((AccessType)value, diagnostics, context);
			case XDDPackage.ACCESS_TYPE1:
				return validateAccessType1((AccessType1)value, diagnostics, context);
			case XDDPackage.ACCESS_TYPE_TYPE:
				return validateAccessTypeType((AccessTypeType)value, diagnostics, context);
			case XDDPackage.CLASSIFICATION_TYPE:
				return validateClassificationType((ClassificationType)value, diagnostics, context);
			case XDDPackage.DEVICE_CLASS_TYPE:
				return validateDeviceClassType((DeviceClassType)value, diagnostics, context);
			case XDDPackage.IAS_INTERFACE_DATA_TYPE_MEMBER0:
				return validateIASInterfaceDataTypeMember0((IASInterfaceDataTypeMember0)value, diagnostics, context);
			case XDDPackage.LE_DCOLORS_TYPE:
				return validateLEDcolorsType((LEDcolorsType)value, diagnostics, context);
			case XDDPackage.LE_DCOLOR_TYPE:
				return validateLEDcolorType((LEDcolorType)value, diagnostics, context);
			case XDDPackage.LE_DTYPE_TYPE:
				return validateLEDtypeType((LEDtypeType)value, diagnostics, context);
			case XDDPackage.NODE_TYPE_TYPE:
				return validateNodeTypeType((NodeTypeType)value, diagnostics, context);
			case XDDPackage.POSITIONING_TYPE:
				return validatePositioningType((PositioningType)value, diagnostics, context);
			case XDDPackage.PROFILE_CLASS_ID_DATA_TYPE:
				return validateProfileClassIDDataType((ProfileClassIDDataType)value, diagnostics, context);
			case XDDPackage.RANGE_TYPE:
				return validateRangeType((RangeType)value, diagnostics, context);
			case XDDPackage.STATE_TYPE:
				return validateStateType((StateType)value, diagnostics, context);
			case XDDPackage.SUPPORT_TYPE:
				return validateSupportType((SupportType)value, diagnostics, context);
			case XDDPackage.TOBJECT_ACCESS_TYPE:
				return validateTObjectAccessType((TObjectAccessType)value, diagnostics, context);
			case XDDPackage.TOBJECT_PDO_MAPPING:
				return validateTObjectPDOMapping((TObjectPDOMapping)value, diagnostics, context);
			case XDDPackage.TSPECIFICATION_VERSION:
				return validateTSpecificationVersion((TSpecificationVersion)value, diagnostics, context);
			case XDDPackage.TYPE_TYPE:
				return validateTypeType((TypeType)value, diagnostics, context);
			case XDDPackage.VERSION_TYPE_TYPE:
				return validateVersionTypeType((VersionTypeType)value, diagnostics, context);
			case XDDPackage.ACCESS_LIST_TYPE:
				return validateAccessListType((List<?>)value, diagnostics, context);
			case XDDPackage.ACCESS_TYPE_OBJECT:
				return validateAccessTypeObject((AccessType)value, diagnostics, context);
			case XDDPackage.ACCESS_TYPE_OBJECT1:
				return validateAccessTypeObject1((AccessType1)value, diagnostics, context);
			case XDDPackage.ACCESS_TYPE_TYPE_OBJECT:
				return validateAccessTypeTypeObject((AccessTypeType)value, diagnostics, context);
			case XDDPackage.CLASSIFICATION_TYPE_OBJECT:
				return validateClassificationTypeObject((ClassificationType)value, diagnostics, context);
			case XDDPackage.DEVICE_CLASS_TYPE_OBJECT:
				return validateDeviceClassTypeObject((DeviceClassType)value, diagnostics, context);
			case XDDPackage.IAS_INTERFACE_DATA_TYPE:
				return validateIASInterfaceDataType(value, diagnostics, context);
			case XDDPackage.IAS_INTERFACE_DATA_TYPE_MEMBER0_OBJECT:
				return validateIASInterfaceDataTypeMember0Object((IASInterfaceDataTypeMember0)value, diagnostics, context);
			case XDDPackage.IAS_INTERFACE_DATA_TYPE_MEMBER1:
				return validateIASInterfaceDataTypeMember1((String)value, diagnostics, context);
			case XDDPackage.LE_DCOLORS_TYPE_OBJECT:
				return validateLEDcolorsTypeObject((LEDcolorsType)value, diagnostics, context);
			case XDDPackage.LE_DCOLOR_TYPE_OBJECT:
				return validateLEDcolorTypeObject((LEDcolorType)value, diagnostics, context);
			case XDDPackage.LE_DTYPE_TYPE_OBJECT:
				return validateLEDtypeTypeObject((LEDtypeType)value, diagnostics, context);
			case XDDPackage.NODE_TYPE_TYPE_OBJECT:
				return validateNodeTypeTypeObject((NodeTypeType)value, diagnostics, context);
			case XDDPackage.OFFSET_TYPE:
				return validateOffsetType((BigInteger)value, diagnostics, context);
			case XDDPackage.POSITIONING_TYPE_OBJECT:
				return validatePositioningTypeObject((PositioningType)value, diagnostics, context);
			case XDDPackage.PROFILE_CLASS_ID_DATA_TYPE_OBJECT:
				return validateProfileClassIDDataTypeObject((ProfileClassIDDataType)value, diagnostics, context);
			case XDDPackage.RANGE_TYPE_OBJECT:
				return validateRangeTypeObject((RangeType)value, diagnostics, context);
			case XDDPackage.STATE_TYPE_OBJECT:
				return validateStateTypeObject((StateType)value, diagnostics, context);
			case XDDPackage.SUPPORTED_LANGUAGES_TYPE:
				return validateSupportedLanguagesType((List<?>)value, diagnostics, context);
			case XDDPackage.SUPPORT_TYPE_OBJECT:
				return validateSupportTypeObject((SupportType)value, diagnostics, context);
			case XDDPackage.TOBJECT_ACCESS_TYPE_OBJECT:
				return validateTObjectAccessTypeObject((TObjectAccessType)value, diagnostics, context);
			case XDDPackage.TOBJECT_PDO_MAPPING_OBJECT:
				return validateTObjectPDOMappingObject((TObjectPDOMapping)value, diagnostics, context);
			case XDDPackage.TSPECIFICATION_VERSION_OBJECT:
				return validateTSpecificationVersionObject((TSpecificationVersion)value, diagnostics, context);
			case XDDPackage.TYPE_TYPE_OBJECT:
				return validateTypeTypeObject((TypeType)value, diagnostics, context);
			case XDDPackage.VERSION_TYPE_TYPE_OBJECT:
				return validateVersionTypeTypeObject((VersionTypeType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddInfoType(AddInfoType addInfoType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addInfoType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayType(ArrayType arrayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategoryType(CategoryType categoryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(categoryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicContentType(CharacteristicContentType characteristicContentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(characteristicContentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicNameType(CharacteristicNameType characteristicNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(characteristicNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicsListType(CharacteristicsListType characteristicsListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(characteristicsListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicType(CharacteristicType characteristicType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(characteristicType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompliantWithType(CompliantWithType compliantWithType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compliantWithType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigVarsType(ConfigVarsType configVarsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(configVarsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionType(ConnectionType connectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorType(ConnectorType connectorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeListType(DataTypeListType dataTypeListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataTypeListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerivedType(DerivedType derivedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(derivedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionRefType(DescriptionRefType descriptionRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(descriptionRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionType(DescriptionType descriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(descriptionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDictionaryType(DictionaryType dictionaryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dictionaryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicChannelsType(DynamicChannelsType dynamicChannelsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dynamicChannelsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumType(EnumType enumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErrorBitDataType(ErrorBitDataType errorBitDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(errorBitDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErrorConstantDataType(ErrorConstantDataType errorConstantDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(errorConstantDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErrorListType(ErrorListType errorListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(errorListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileType(FileType fileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirmwareType(FirmwareType firmwareType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(firmwareType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionInstanceType(FunctionInstanceType functionInstanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionInstanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionTypeType(FunctionTypeType functionTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentityType(IdentityType identityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputVarsType(InputVarsType inputVarsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputVarsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceIDRefType(InstanceIDRefType instanceIDRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instanceIDRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceNameType(InstanceNameType instanceNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instanceNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceListType(InterfaceListType interfaceListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interfaceListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateISO15745ProfileContainerType(ISO15745ProfileContainerType iso15745ProfileContainerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iso15745ProfileContainerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateISO15745ProfileType(ISO15745ProfileType iso15745ProfileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iso15745ProfileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateISO15745ReferenceDataType(ISO15745ReferenceDataType iso15745ReferenceDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iso15745ReferenceDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelRefType(LabelRefType labelRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(labelRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelType(LabelType labelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(labelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEDListType(LEDListType ledListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ledListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEDstateRefType(LEDstateRefType leDstateRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leDstateRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEDstateType(LEDstateType leDstateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leDstateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxValueType(MaxValueType maxValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(maxValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemberRefType(MemberRefType memberRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(memberRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinValueType(MinValueType minValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(minValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectListType(ObjectListType objectListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderNumberType(OrderNumberType orderNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orderNumberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputVarsType(OutputVarsType outputVarsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputVarsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterRefType(ParameterRefType parameterRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterType(ParameterType parameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePictureType(PictureType pictureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pictureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductFamilyType(ProductFamilyType productFamilyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(productFamilyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductNameType(ProductNameType productNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(productNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductTextType(ProductTextType productTextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(productTextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfileBodyCommunicationNetworkPowerlink(ProfileBodyCommunicationNetworkPowerlink profileBodyCommunicationNetworkPowerlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(profileBodyCommunicationNetworkPowerlink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfileBodyDataType(ProfileBodyDataType profileBodyDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(profileBodyDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfileBodyDevicePowerlink(ProfileBodyDevicePowerlink profileBodyDevicePowerlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(profileBodyDevicePowerlink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfileHandleDataType(ProfileHandleDataType profileHandleDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(profileHandleDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfileHeaderDataType(ProfileHeaderDataType profileHeaderDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(profileHeaderDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStandardComplianceListType(StandardComplianceListType standardComplianceListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(standardComplianceListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticErrorBitFieldType(StaticErrorBitFieldType staticErrorBitFieldType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staticErrorBitFieldType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStepType(StepType stepType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stepType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructType(StructType structType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubObjectType(SubObjectType subObjectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subObjectType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAllowedValues(TAllowedValues tAllowedValues, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tAllowedValues, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAllowedValuesTemplate(TAllowedValuesTemplate tAllowedValuesTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tAllowedValuesTemplate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTApplicationLayers(TApplicationLayers tApplicationLayers, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tApplicationLayers, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTApplicationProcess(TApplicationProcess tApplicationProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tApplicationProcess, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCapabilities(TCapabilities tCapabilities, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tCapabilities, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTClassificationList(TClassificationList tClassificationList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tClassificationList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCNFeatures(TCNFeatures tcnFeatures, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tcnFeatures, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCombinedState(TCombinedState tCombinedState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tCombinedState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTConditionalSupport(TConditionalSupport tConditionalSupport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tConditionalSupport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTConnectorList(TConnectorList tConnectorList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tConnectorList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCount(TCount tCount, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tCount, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDataTypeIDRef(TDataTypeIDRef tDataTypeIDRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDataTypeIDRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDataTypeList(TDataTypeList tDataTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDataTypeList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDataTypes(TDataTypes tDataTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDataTypes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDenotation(TDenotation tDenotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDenotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDeviceCommissioning(TDeviceCommissioning tDeviceCommissioning, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDeviceCommissioning, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDeviceFamily(TDeviceFamily tDeviceFamily, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDeviceFamily, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDeviceFunction(TDeviceFunction tDeviceFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDeviceFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDeviceIdentity(TDeviceIdentity tDeviceIdentity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDeviceIdentity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDeviceManager(TDeviceManager tDeviceManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDeviceManager, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDiagnostic(TDiagnostic tDiagnostic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDiagnostic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDictionaryList(TDictionaryList tDictionaryList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDictionaryList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDynamicChannel(TDynamicChannel tDynamicChannel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDynamicChannel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTEnumValue(TEnumValue tEnumValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tEnumValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextEntryType(TextEntryType textEntryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textEntryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextResourceType(TextResourceType textResourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textResourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTFirmwareList(TFirmwareList tFirmwareList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tFirmwareList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTFunctionInstanceList(TFunctionInstanceList tFunctionInstanceList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tFunctionInstanceList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTFunctionTypeList(TFunctionTypeList tFunctionTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tFunctionTypeList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTGeneralFeatures(TGeneralFeatures tGeneralFeatures, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tGeneralFeatures, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTIndicatorList(TIndicatorList tIndicatorList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tIndicatorList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTLED(TLED tled, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tled, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTMNFeatures(TMNFeatures tmnFeatures, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tmnFeatures, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTNetworkManagement(TNetworkManagement tNetworkManagement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tNetworkManagement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTObject(TObject tObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTParameterGroup(TParameterGroup tParameterGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tParameterGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTParameterGroupList(TParameterGroupList tParameterGroupList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tParameterGroupList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTParameterList(TParameterList tParameterList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tParameterList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTParameterTemplate(TParameterTemplate tParameterTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tParameterTemplate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPicturesList(TPicturesList tPicturesList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tPicturesList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTProductID(TProductID tProductID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tProductID, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTProperty(TProperty tProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRange(TRange tRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSpecificationRevision(TSpecificationRevision tSpecificationRevision, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tSpecificationRevision, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSubrange(TSubrange tSubrange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tSubrange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTemplateList(TTemplateList tTemplateList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tTemplateList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTUnit(TUnit tUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTValue(TValue tValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTVarDeclaration(TVarDeclaration tVarDeclaration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tVarDeclaration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTVariableRef(TVariableRef tVariableRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tVariableRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTVendorID(TVendorID tVendorID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tVendorID, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTVersion(TVersion tVersion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tVersion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueType(ValueType valueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableIDRefType(VariableIDRefType variableIDRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableIDRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVendorNameType(VendorNameType vendorNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vendorNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVendorTextType(VendorTextType vendorTextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vendorTextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionInfoType(VersionInfoType versionInfoType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(versionInfoType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessType(AccessType accessType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessType1(AccessType1 accessType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessTypeType(AccessTypeType accessTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassificationType(ClassificationType classificationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceClassType(DeviceClassType deviceClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIASInterfaceDataTypeMember0(IASInterfaceDataTypeMember0 iasInterfaceDataTypeMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEDcolorsType(LEDcolorsType leDcolorsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEDcolorType(LEDcolorType leDcolorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEDtypeType(LEDtypeType leDtypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeTypeType(NodeTypeType nodeTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositioningType(PositioningType positioningType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfileClassIDDataType(ProfileClassIDDataType profileClassIDDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeType(RangeType rangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateType(StateType stateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportType(SupportType supportType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTObjectAccessType(TObjectAccessType tObjectAccessType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTObjectPDOMapping(TObjectPDOMapping tObjectPDOMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSpecificationVersion(TSpecificationVersion tSpecificationVersion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType(TypeType typeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionTypeType(VersionTypeType versionTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessListType(List<?> accessListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNMTOKENS_MinLength(accessListType, diagnostics, context);
		if (result || diagnostics != null) result &= xmlTypeValidator.validateNMTOKENSBase_ItemType(accessListType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessTypeObject(AccessType accessTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessTypeObject1(AccessType1 accessTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessTypeTypeObject(AccessTypeType accessTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassificationTypeObject(ClassificationType classificationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceClassTypeObject(DeviceClassType deviceClassTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIASInterfaceDataType(Object iasInterfaceDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIASInterfaceDataType_MemberTypes(iasInterfaceDataType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>IAS Interface Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIASInterfaceDataType_MemberTypes(Object iasInterfaceDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XDDPackage.eINSTANCE.getIASInterfaceDataTypeMember0().isInstance(iasInterfaceDataType)) {
				if (validateIASInterfaceDataTypeMember0((IASInterfaceDataTypeMember0)iasInterfaceDataType, tempDiagnostics, context)) return true;
			}
			if (XDDPackage.eINSTANCE.getIASInterfaceDataTypeMember1().isInstance(iasInterfaceDataType)) {
				if (validateIASInterfaceDataTypeMember1((String)iasInterfaceDataType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XDDPackage.eINSTANCE.getIASInterfaceDataTypeMember0().isInstance(iasInterfaceDataType)) {
				if (validateIASInterfaceDataTypeMember0((IASInterfaceDataTypeMember0)iasInterfaceDataType, null, context)) return true;
			}
			if (XDDPackage.eINSTANCE.getIASInterfaceDataTypeMember1().isInstance(iasInterfaceDataType)) {
				if (validateIASInterfaceDataTypeMember1((String)iasInterfaceDataType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIASInterfaceDataTypeMember0Object(IASInterfaceDataTypeMember0 iasInterfaceDataTypeMember0Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIASInterfaceDataTypeMember1(String iasInterfaceDataTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIASInterfaceDataTypeMember1_MinLength(iasInterfaceDataTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateIASInterfaceDataTypeMember1_MaxLength(iasInterfaceDataTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>IAS Interface Data Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIASInterfaceDataTypeMember1_MinLength(String iasInterfaceDataTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = iasInterfaceDataTypeMember1.length();
		boolean result = length >= 4;
		if (!result && diagnostics != null)
			reportMinLengthViolation(XDDPackage.eINSTANCE.getIASInterfaceDataTypeMember1(), iasInterfaceDataTypeMember1, length, 4, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>IAS Interface Data Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIASInterfaceDataTypeMember1_MaxLength(String iasInterfaceDataTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = iasInterfaceDataTypeMember1.length();
		boolean result = length <= 4;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(XDDPackage.eINSTANCE.getIASInterfaceDataTypeMember1(), iasInterfaceDataTypeMember1, length, 4, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEDcolorsTypeObject(LEDcolorsType leDcolorsTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEDcolorTypeObject(LEDcolorType leDcolorTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEDtypeTypeObject(LEDtypeType leDtypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeTypeTypeObject(NodeTypeType nodeTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOffsetType(BigInteger offsetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(offsetType, diagnostics, context);
		if (result || diagnostics != null) result &= validateOffsetType_Max(offsetType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateOffsetType_Max
	 */
	public static final BigInteger OFFSET_TYPE__MAX__VALUE = new BigInteger("63");

	/**
	 * Validates the Max constraint of '<em>Offset Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOffsetType_Max(BigInteger offsetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = offsetType.compareTo(OFFSET_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(XDDPackage.eINSTANCE.getOffsetType(), offsetType, OFFSET_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositioningTypeObject(PositioningType positioningTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfileClassIDDataTypeObject(ProfileClassIDDataType profileClassIDDataTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeTypeObject(RangeType rangeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateTypeObject(StateType stateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportedLanguagesType(List<?> supportedLanguagesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSupportedLanguagesType_ItemType(supportedLanguagesType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Supported Languages Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportedLanguagesType_ItemType(List<?> supportedLanguagesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = supportedLanguagesType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.LANGUAGE.isInstance(item)) {
				result &= xmlTypeValidator.validateLanguage((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.LANGUAGE, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportTypeObject(SupportType supportTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTObjectAccessTypeObject(TObjectAccessType tObjectAccessTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTObjectPDOMappingObject(TObjectPDOMapping tObjectPDOMappingObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSpecificationVersionObject(TSpecificationVersion tSpecificationVersionObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject(TypeType typeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionTypeTypeObject(VersionTypeType versionTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //XDDValidator
