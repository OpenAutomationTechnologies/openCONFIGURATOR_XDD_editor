/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.util;

import com.br_automation.buoat.xddeditor.XDD.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage
 * @generated
 */
public class XDDSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected static XDDPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public XDDSwitch() {
        if (modelPackage == null) {
            modelPackage = XDDPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case XDDPackage.ADD_INFO_TYPE: {
                AddInfoType addInfoType = (AddInfoType)theEObject;
                T result = caseAddInfoType(addInfoType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.ARRAY_TYPE: {
                ArrayType arrayType = (ArrayType)theEObject;
                T result = caseArrayType(arrayType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.CATEGORY_TYPE: {
                CategoryType categoryType = (CategoryType)theEObject;
                T result = caseCategoryType(categoryType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.CHARACTERISTIC_CONTENT_TYPE: {
                CharacteristicContentType characteristicContentType = (CharacteristicContentType)theEObject;
                T result = caseCharacteristicContentType(characteristicContentType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.CHARACTERISTIC_NAME_TYPE: {
                CharacteristicNameType characteristicNameType = (CharacteristicNameType)theEObject;
                T result = caseCharacteristicNameType(characteristicNameType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.CHARACTERISTICS_LIST_TYPE: {
                CharacteristicsListType characteristicsListType = (CharacteristicsListType)theEObject;
                T result = caseCharacteristicsListType(characteristicsListType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.CHARACTERISTIC_TYPE: {
                CharacteristicType characteristicType = (CharacteristicType)theEObject;
                T result = caseCharacteristicType(characteristicType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.COMPLIANT_WITH_TYPE: {
                CompliantWithType compliantWithType = (CompliantWithType)theEObject;
                T result = caseCompliantWithType(compliantWithType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.CONFIG_VARS_TYPE: {
                ConfigVarsType configVarsType = (ConfigVarsType)theEObject;
                T result = caseConfigVarsType(configVarsType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.CONNECTION_TYPE: {
                ConnectionType connectionType = (ConnectionType)theEObject;
                T result = caseConnectionType(connectionType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.DATA_TYPE_LIST_TYPE: {
                DataTypeListType dataTypeListType = (DataTypeListType)theEObject;
                T result = caseDataTypeListType(dataTypeListType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.DERIVED_TYPE: {
                DerivedType derivedType = (DerivedType)theEObject;
                T result = caseDerivedType(derivedType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.DESCRIPTION_REF_TYPE: {
                DescriptionRefType descriptionRefType = (DescriptionRefType)theEObject;
                T result = caseDescriptionRefType(descriptionRefType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.DESCRIPTION_TYPE: {
                DescriptionType descriptionType = (DescriptionType)theEObject;
                T result = caseDescriptionType(descriptionType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.DICTIONARY_TYPE: {
                DictionaryType dictionaryType = (DictionaryType)theEObject;
                T result = caseDictionaryType(dictionaryType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.DOCUMENT_ROOT: {
                DocumentRoot documentRoot = (DocumentRoot)theEObject;
                T result = caseDocumentRoot(documentRoot);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.DYNAMIC_CHANNELS_TYPE: {
                DynamicChannelsType dynamicChannelsType = (DynamicChannelsType)theEObject;
                T result = caseDynamicChannelsType(dynamicChannelsType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.ENUM_TYPE: {
                EnumType enumType = (EnumType)theEObject;
                T result = caseEnumType(enumType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.ERROR_BIT_DATA_TYPE: {
                ErrorBitDataType errorBitDataType = (ErrorBitDataType)theEObject;
                T result = caseErrorBitDataType(errorBitDataType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.ERROR_CONSTANT_DATA_TYPE: {
                ErrorConstantDataType errorConstantDataType = (ErrorConstantDataType)theEObject;
                T result = caseErrorConstantDataType(errorConstantDataType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.ERROR_LIST_TYPE: {
                ErrorListType errorListType = (ErrorListType)theEObject;
                T result = caseErrorListType(errorListType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.FILE_TYPE: {
                FileType fileType = (FileType)theEObject;
                T result = caseFileType(fileType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.FUNCTION_INSTANCE_TYPE: {
                FunctionInstanceType functionInstanceType = (FunctionInstanceType)theEObject;
                T result = caseFunctionInstanceType(functionInstanceType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.FUNCTION_TYPE_TYPE: {
                FunctionTypeType functionTypeType = (FunctionTypeType)theEObject;
                T result = caseFunctionTypeType(functionTypeType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.IDENTITY_TYPE: {
                IdentityType identityType = (IdentityType)theEObject;
                T result = caseIdentityType(identityType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.INPUT_VARS_TYPE: {
                InputVarsType inputVarsType = (InputVarsType)theEObject;
                T result = caseInputVarsType(inputVarsType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.INSTANCE_ID_REF_TYPE: {
                InstanceIDRefType instanceIDRefType = (InstanceIDRefType)theEObject;
                T result = caseInstanceIDRefType(instanceIDRefType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.INSTANCE_NAME_TYPE: {
                InstanceNameType instanceNameType = (InstanceNameType)theEObject;
                T result = caseInstanceNameType(instanceNameType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.INTERFACE_LIST_TYPE: {
                InterfaceListType interfaceListType = (InterfaceListType)theEObject;
                T result = caseInterfaceListType(interfaceListType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.ISO15745_PROFILE_CONTAINER_TYPE: {
                ISO15745ProfileContainerType iso15745ProfileContainerType = (ISO15745ProfileContainerType)theEObject;
                T result = caseISO15745ProfileContainerType(iso15745ProfileContainerType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.ISO15745_PROFILE_TYPE: {
                ISO15745ProfileType iso15745ProfileType = (ISO15745ProfileType)theEObject;
                T result = caseISO15745ProfileType(iso15745ProfileType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.ISO15745_REFERENCE_DATA_TYPE: {
                ISO15745ReferenceDataType iso15745ReferenceDataType = (ISO15745ReferenceDataType)theEObject;
                T result = caseISO15745ReferenceDataType(iso15745ReferenceDataType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.LABEL_REF_TYPE: {
                LabelRefType labelRefType = (LabelRefType)theEObject;
                T result = caseLabelRefType(labelRefType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.LABEL_TYPE: {
                LabelType labelType = (LabelType)theEObject;
                T result = caseLabelType(labelType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.LED_LIST_TYPE: {
                LEDListType ledListType = (LEDListType)theEObject;
                T result = caseLEDListType(ledListType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.LE_DSTATE_REF_TYPE: {
                LEDstateRefType leDstateRefType = (LEDstateRefType)theEObject;
                T result = caseLEDstateRefType(leDstateRefType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.LE_DSTATE_TYPE: {
                LEDstateType leDstateType = (LEDstateType)theEObject;
                T result = caseLEDstateType(leDstateType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.MAX_VALUE_TYPE: {
                MaxValueType maxValueType = (MaxValueType)theEObject;
                T result = caseMaxValueType(maxValueType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.MEMBER_REF_TYPE: {
                MemberRefType memberRefType = (MemberRefType)theEObject;
                T result = caseMemberRefType(memberRefType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.MIN_VALUE_TYPE: {
                MinValueType minValueType = (MinValueType)theEObject;
                T result = caseMinValueType(minValueType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.OBJECT_LIST_TYPE: {
                ObjectListType objectListType = (ObjectListType)theEObject;
                T result = caseObjectListType(objectListType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.ORDER_NUMBER_TYPE: {
                OrderNumberType orderNumberType = (OrderNumberType)theEObject;
                T result = caseOrderNumberType(orderNumberType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.OUTPUT_VARS_TYPE: {
                OutputVarsType outputVarsType = (OutputVarsType)theEObject;
                T result = caseOutputVarsType(outputVarsType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.PARAMETER_REF_TYPE: {
                ParameterRefType parameterRefType = (ParameterRefType)theEObject;
                T result = caseParameterRefType(parameterRefType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.PARAMETER_TYPE: {
                ParameterType parameterType = (ParameterType)theEObject;
                T result = caseParameterType(parameterType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.PICTURE_TYPE: {
                PictureType pictureType = (PictureType)theEObject;
                T result = casePictureType(pictureType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.PRODUCT_FAMILY_TYPE: {
                ProductFamilyType productFamilyType = (ProductFamilyType)theEObject;
                T result = caseProductFamilyType(productFamilyType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.PRODUCT_NAME_TYPE: {
                ProductNameType productNameType = (ProductNameType)theEObject;
                T result = caseProductNameType(productNameType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.PRODUCT_TEXT_TYPE: {
                ProductTextType productTextType = (ProductTextType)theEObject;
                T result = caseProductTextType(productTextType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK: {
                ProfileBodyCommunicationNetworkPowerlink profileBodyCommunicationNetworkPowerlink = (ProfileBodyCommunicationNetworkPowerlink)theEObject;
                T result = caseProfileBodyCommunicationNetworkPowerlink(profileBodyCommunicationNetworkPowerlink);
                if (result == null) result = caseProfileBodyDataType(profileBodyCommunicationNetworkPowerlink);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.PROFILE_BODY_DATA_TYPE: {
                ProfileBodyDataType profileBodyDataType = (ProfileBodyDataType)theEObject;
                T result = caseProfileBodyDataType(profileBodyDataType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.PROFILE_BODY_DEVICE_POWERLINK: {
                ProfileBodyDevicePowerlink profileBodyDevicePowerlink = (ProfileBodyDevicePowerlink)theEObject;
                T result = caseProfileBodyDevicePowerlink(profileBodyDevicePowerlink);
                if (result == null) result = caseProfileBodyDataType(profileBodyDevicePowerlink);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.PROFILE_HANDLE_DATA_TYPE: {
                ProfileHandleDataType profileHandleDataType = (ProfileHandleDataType)theEObject;
                T result = caseProfileHandleDataType(profileHandleDataType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.PROFILE_HEADER_DATA_TYPE: {
                ProfileHeaderDataType profileHeaderDataType = (ProfileHeaderDataType)theEObject;
                T result = caseProfileHeaderDataType(profileHeaderDataType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.STANDARD_COMPLIANCE_LIST_TYPE: {
                StandardComplianceListType standardComplianceListType = (StandardComplianceListType)theEObject;
                T result = caseStandardComplianceListType(standardComplianceListType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.STATIC_ERROR_BIT_FIELD_TYPE: {
                StaticErrorBitFieldType staticErrorBitFieldType = (StaticErrorBitFieldType)theEObject;
                T result = caseStaticErrorBitFieldType(staticErrorBitFieldType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.STEP_TYPE: {
                StepType stepType = (StepType)theEObject;
                T result = caseStepType(stepType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.STRUCT_TYPE: {
                StructType structType = (StructType)theEObject;
                T result = caseStructType(structType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.SUB_OBJECT_TYPE: {
                SubObjectType subObjectType = (SubObjectType)theEObject;
                T result = caseSubObjectType(subObjectType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TALLOWED_VALUES: {
                TAllowedValues tAllowedValues = (TAllowedValues)theEObject;
                T result = caseTAllowedValues(tAllowedValues);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TALLOWED_VALUES_TEMPLATE: {
                TAllowedValuesTemplate tAllowedValuesTemplate = (TAllowedValuesTemplate)theEObject;
                T result = caseTAllowedValuesTemplate(tAllowedValuesTemplate);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TAPPLICATION_LAYERS: {
                TApplicationLayers tApplicationLayers = (TApplicationLayers)theEObject;
                T result = caseTApplicationLayers(tApplicationLayers);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TAPPLICATION_PROCESS: {
                TApplicationProcess tApplicationProcess = (TApplicationProcess)theEObject;
                T result = caseTApplicationProcess(tApplicationProcess);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TCAPABILITIES: {
                TCapabilities tCapabilities = (TCapabilities)theEObject;
                T result = caseTCapabilities(tCapabilities);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TCN_FEATURES: {
                TCNFeatures tcnFeatures = (TCNFeatures)theEObject;
                T result = caseTCNFeatures(tcnFeatures);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TCOMBINED_STATE: {
                TCombinedState tCombinedState = (TCombinedState)theEObject;
                T result = caseTCombinedState(tCombinedState);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TCONDITIONAL_SUPPORT: {
                TConditionalSupport tConditionalSupport = (TConditionalSupport)theEObject;
                T result = caseTConditionalSupport(tConditionalSupport);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TCOUNT: {
                TCount tCount = (TCount)theEObject;
                T result = caseTCount(tCount);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TDATA_TYPE_ID_REF: {
                TDataTypeIDRef tDataTypeIDRef = (TDataTypeIDRef)theEObject;
                T result = caseTDataTypeIDRef(tDataTypeIDRef);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TDATA_TYPE_LIST: {
                TDataTypeList tDataTypeList = (TDataTypeList)theEObject;
                T result = caseTDataTypeList(tDataTypeList);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TDATA_TYPES: {
                TDataTypes tDataTypes = (TDataTypes)theEObject;
                T result = caseTDataTypes(tDataTypes);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TDENOTATION: {
                TDenotation tDenotation = (TDenotation)theEObject;
                T result = caseTDenotation(tDenotation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TDEVICE_COMMISSIONING: {
                TDeviceCommissioning tDeviceCommissioning = (TDeviceCommissioning)theEObject;
                T result = caseTDeviceCommissioning(tDeviceCommissioning);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TDEVICE_FAMILY: {
                TDeviceFamily tDeviceFamily = (TDeviceFamily)theEObject;
                T result = caseTDeviceFamily(tDeviceFamily);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TDEVICE_FUNCTION: {
                TDeviceFunction tDeviceFunction = (TDeviceFunction)theEObject;
                T result = caseTDeviceFunction(tDeviceFunction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TDEVICE_IDENTITY: {
                TDeviceIdentity tDeviceIdentity = (TDeviceIdentity)theEObject;
                T result = caseTDeviceIdentity(tDeviceIdentity);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TDEVICE_MANAGER: {
                TDeviceManager tDeviceManager = (TDeviceManager)theEObject;
                T result = caseTDeviceManager(tDeviceManager);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TDIAGNOSTIC: {
                TDiagnostic tDiagnostic = (TDiagnostic)theEObject;
                T result = caseTDiagnostic(tDiagnostic);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TDICTIONARY_LIST: {
                TDictionaryList tDictionaryList = (TDictionaryList)theEObject;
                T result = caseTDictionaryList(tDictionaryList);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TDYNAMIC_CHANNEL: {
                TDynamicChannel tDynamicChannel = (TDynamicChannel)theEObject;
                T result = caseTDynamicChannel(tDynamicChannel);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TENUM_VALUE: {
                TEnumValue tEnumValue = (TEnumValue)theEObject;
                T result = caseTEnumValue(tEnumValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TEXT_ENTRY_TYPE: {
                TextEntryType textEntryType = (TextEntryType)theEObject;
                T result = caseTextEntryType(textEntryType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TEXT_RESOURCE_TYPE: {
                TextResourceType textResourceType = (TextResourceType)theEObject;
                T result = caseTextResourceType(textResourceType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TFUNCTION_INSTANCE_LIST: {
                TFunctionInstanceList tFunctionInstanceList = (TFunctionInstanceList)theEObject;
                T result = caseTFunctionInstanceList(tFunctionInstanceList);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TFUNCTION_TYPE_LIST: {
                TFunctionTypeList tFunctionTypeList = (TFunctionTypeList)theEObject;
                T result = caseTFunctionTypeList(tFunctionTypeList);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TGENERAL_FEATURES: {
                TGeneralFeatures tGeneralFeatures = (TGeneralFeatures)theEObject;
                T result = caseTGeneralFeatures(tGeneralFeatures);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TINDICATOR_LIST: {
                TIndicatorList tIndicatorList = (TIndicatorList)theEObject;
                T result = caseTIndicatorList(tIndicatorList);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TLED: {
                TLED tled = (TLED)theEObject;
                T result = caseTLED(tled);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TMN_FEATURES: {
                TMNFeatures tmnFeatures = (TMNFeatures)theEObject;
                T result = caseTMNFeatures(tmnFeatures);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TNETWORK_MANAGEMENT: {
                TNetworkManagement tNetworkManagement = (TNetworkManagement)theEObject;
                T result = caseTNetworkManagement(tNetworkManagement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TOBJECT: {
                TObject tObject = (TObject)theEObject;
                T result = caseTObject(tObject);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TPARAMETER_GROUP: {
                TParameterGroup tParameterGroup = (TParameterGroup)theEObject;
                T result = caseTParameterGroup(tParameterGroup);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TPARAMETER_GROUP_LIST: {
                TParameterGroupList tParameterGroupList = (TParameterGroupList)theEObject;
                T result = caseTParameterGroupList(tParameterGroupList);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TPARAMETER_LIST: {
                TParameterList tParameterList = (TParameterList)theEObject;
                T result = caseTParameterList(tParameterList);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TPARAMETER_TEMPLATE: {
                TParameterTemplate tParameterTemplate = (TParameterTemplate)theEObject;
                T result = caseTParameterTemplate(tParameterTemplate);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TPICTURES_LIST: {
                TPicturesList tPicturesList = (TPicturesList)theEObject;
                T result = caseTPicturesList(tPicturesList);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TPRODUCT_ID: {
                TProductID tProductID = (TProductID)theEObject;
                T result = caseTProductID(tProductID);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TPROPERTY: {
                TProperty tProperty = (TProperty)theEObject;
                T result = caseTProperty(tProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TRANGE: {
                TRange tRange = (TRange)theEObject;
                T result = caseTRange(tRange);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TSPECIFICATION_REVISION: {
                TSpecificationRevision tSpecificationRevision = (TSpecificationRevision)theEObject;
                T result = caseTSpecificationRevision(tSpecificationRevision);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TSUBRANGE: {
                TSubrange tSubrange = (TSubrange)theEObject;
                T result = caseTSubrange(tSubrange);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TTEMPLATE_LIST: {
                TTemplateList tTemplateList = (TTemplateList)theEObject;
                T result = caseTTemplateList(tTemplateList);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TTRANSPORT_LAYERS: {
                TTransportLayers tTransportLayers = (TTransportLayers)theEObject;
                T result = caseTTransportLayers(tTransportLayers);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TUNIT: {
                TUnit tUnit = (TUnit)theEObject;
                T result = caseTUnit(tUnit);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TVALUE: {
                TValue tValue = (TValue)theEObject;
                T result = caseTValue(tValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TVAR_DECLARATION: {
                TVarDeclaration tVarDeclaration = (TVarDeclaration)theEObject;
                T result = caseTVarDeclaration(tVarDeclaration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TVARIABLE_REF: {
                TVariableRef tVariableRef = (TVariableRef)theEObject;
                T result = caseTVariableRef(tVariableRef);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TVENDOR_ID: {
                TVendorID tVendorID = (TVendorID)theEObject;
                T result = caseTVendorID(tVendorID);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.TVERSION: {
                TVersion tVersion = (TVersion)theEObject;
                T result = caseTVersion(tVersion);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.VALUE_TYPE: {
                ValueType valueType = (ValueType)theEObject;
                T result = caseValueType(valueType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.VARIABLE_ID_REF_TYPE: {
                VariableIDRefType variableIDRefType = (VariableIDRefType)theEObject;
                T result = caseVariableIDRefType(variableIDRefType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.VENDOR_NAME_TYPE: {
                VendorNameType vendorNameType = (VendorNameType)theEObject;
                T result = caseVendorNameType(vendorNameType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.VENDOR_TEXT_TYPE: {
                VendorTextType vendorTextType = (VendorTextType)theEObject;
                T result = caseVendorTextType(vendorTextType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XDDPackage.VERSION_INFO_TYPE: {
                VersionInfoType versionInfoType = (VersionInfoType)theEObject;
                T result = caseVersionInfoType(versionInfoType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Add Info Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Add Info Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAddInfoType(AddInfoType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Array Type</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Array Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseArrayType(ArrayType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Category Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Category Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCategoryType(CategoryType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Characteristic Content Type</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Characteristic Content Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCharacteristicContentType(CharacteristicContentType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Characteristic Name Type</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Characteristic Name Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCharacteristicNameType(CharacteristicNameType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Characteristics List Type</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Characteristics List Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCharacteristicsListType(CharacteristicsListType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Characteristic Type</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Characteristic Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCharacteristicType(CharacteristicType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Compliant With Type</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Compliant With Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCompliantWithType(CompliantWithType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Config Vars Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Config Vars Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConfigVarsType(ConfigVarsType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Connection Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connection Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConnectionType(ConnectionType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Type List Type</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Type List Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataTypeListType(DataTypeListType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Derived Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Derived Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDerivedType(DerivedType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Description Ref Type</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Description Ref Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDescriptionRefType(DescriptionRefType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Description Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Description Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDescriptionType(DescriptionType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dictionary Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dictionary Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDictionaryType(DictionaryType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDocumentRoot(DocumentRoot object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dynamic Channels Type</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dynamic Channels Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDynamicChannelsType(DynamicChannelsType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Enum Type</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enum Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnumType(EnumType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Error Bit Data Type</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Error Bit Data Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseErrorBitDataType(ErrorBitDataType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Error Constant Data Type</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Error Constant Data Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseErrorConstantDataType(ErrorConstantDataType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Error List Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Error List Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseErrorListType(ErrorListType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>File Type</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>File Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFileType(FileType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Function Instance Type</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Function Instance Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFunctionInstanceType(FunctionInstanceType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Function Type Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Function Type Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFunctionTypeType(FunctionTypeType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identity Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identity Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentityType(IdentityType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Input Vars Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Input Vars Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInputVarsType(InputVarsType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Instance ID Ref Type</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Instance ID Ref Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInstanceIDRefType(InstanceIDRefType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Instance Name Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Instance Name Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInstanceNameType(InstanceNameType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interface List Type</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interface List Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInterfaceListType(InterfaceListType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ISO15745 Profile Container Type</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ISO15745 Profile Container Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseISO15745ProfileContainerType(ISO15745ProfileContainerType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ISO15745 Profile Type</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ISO15745 Profile Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseISO15745ProfileType(ISO15745ProfileType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ISO15745 Reference Data Type</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ISO15745 Reference Data Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseISO15745ReferenceDataType(ISO15745ReferenceDataType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Label Ref Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Label Ref Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLabelRefType(LabelRefType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Label Type</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Label Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLabelType(LabelType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>LED List Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>LED List Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLEDListType(LEDListType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>LE Dstate Ref Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>LE Dstate Ref Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLEDstateRefType(LEDstateRefType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>LE Dstate Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>LE Dstate Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLEDstateType(LEDstateType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Max Value Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Max Value Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMaxValueType(MaxValueType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Member Ref Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Member Ref Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMemberRefType(MemberRefType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Min Value Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Min Value Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMinValueType(MinValueType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Object List Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Object List Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseObjectListType(ObjectListType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Order Number Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Order Number Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOrderNumberType(OrderNumberType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Output Vars Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Output Vars Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOutputVarsType(OutputVarsType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Parameter Ref Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Parameter Ref Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseParameterRefType(ParameterRefType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseParameterType(ParameterType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Picture Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Picture Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePictureType(PictureType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Product Family Type</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Product Family Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProductFamilyType(ProductFamilyType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Product Name Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Product Name Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProductNameType(ProductNameType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Product Text Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Product Text Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProductTextType(ProductTextType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Profile Body Communication Network Powerlink</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null
     * result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Profile Body Communication Network Powerlink</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T
        caseProfileBodyCommunicationNetworkPowerlink(ProfileBodyCommunicationNetworkPowerlink object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Profile Body Data Type</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Profile Body Data Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProfileBodyDataType(ProfileBodyDataType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Profile Body Device Powerlink</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Profile Body Device Powerlink</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProfileBodyDevicePowerlink(ProfileBodyDevicePowerlink object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Profile Handle Data Type</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Profile Handle Data Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProfileHandleDataType(ProfileHandleDataType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Profile Header Data Type</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Profile Header Data Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProfileHeaderDataType(ProfileHeaderDataType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Standard Compliance List Type</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Standard Compliance List Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStandardComplianceListType(StandardComplianceListType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Static Error Bit Field Type</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Static Error Bit Field Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStaticErrorBitFieldType(StaticErrorBitFieldType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Step Type</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Step Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStepType(StepType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Struct Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Struct Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStructType(StructType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sub Object Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sub Object Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubObjectType(SubObjectType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TAllowed Values</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TAllowed Values</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTAllowedValues(TAllowedValues object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TAllowed Values Template</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TAllowed Values Template</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTAllowedValuesTemplate(TAllowedValuesTemplate object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TApplication Layers</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TApplication Layers</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTApplicationLayers(TApplicationLayers object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TApplication Process</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TApplication Process</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTApplicationProcess(TApplicationProcess object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TCapabilities</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TCapabilities</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTCapabilities(TCapabilities object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TCN Features</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TCN Features</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTCNFeatures(TCNFeatures object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TCombined State</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TCombined State</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTCombinedState(TCombinedState object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TConditional Support</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TConditional Support</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTConditionalSupport(TConditionalSupport object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TCount</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TCount</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTCount(TCount object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TData Type ID Ref</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TData Type ID Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTDataTypeIDRef(TDataTypeIDRef object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TData Type List</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TData Type List</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTDataTypeList(TDataTypeList object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TData Types</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TData Types</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTDataTypes(TDataTypes object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TDenotation</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TDenotation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTDenotation(TDenotation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TDevice Commissioning</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TDevice Commissioning</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTDeviceCommissioning(TDeviceCommissioning object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TDevice Family</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TDevice Family</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTDeviceFamily(TDeviceFamily object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TDevice Function</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TDevice Function</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTDeviceFunction(TDeviceFunction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TDevice Identity</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TDevice Identity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTDeviceIdentity(TDeviceIdentity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TDevice Manager</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TDevice Manager</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTDeviceManager(TDeviceManager object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TDiagnostic</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TDiagnostic</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTDiagnostic(TDiagnostic object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TTransport Layers</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TTransport Layers</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTTransportLayers(TTransportLayers object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TDictionary List</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TDictionary List</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTDictionaryList(TDictionaryList object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TDynamic Channel</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TDynamic Channel</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTDynamicChannel(TDynamicChannel object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TEnum Value</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TEnum Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTEnumValue(TEnumValue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Text Entry Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Text Entry Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTextEntryType(TextEntryType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Text Resource Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Text Resource Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTextResourceType(TextResourceType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TFunction Instance List</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TFunction Instance List</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTFunctionInstanceList(TFunctionInstanceList object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TFunction Type List</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TFunction Type List</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTFunctionTypeList(TFunctionTypeList object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TGeneral Features</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TGeneral Features</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTGeneralFeatures(TGeneralFeatures object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TIndicator List</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TIndicator List</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTIndicatorList(TIndicatorList object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>TLED</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>TLED</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTLED(TLED object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TMN Features</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TMN Features</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTMNFeatures(TMNFeatures object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TNetwork Management</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TNetwork Management</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTNetworkManagement(TNetworkManagement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TObject</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTObject(TObject object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TParameter Group</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TParameter Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTParameterGroup(TParameterGroup object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TParameter Group List</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TParameter Group List</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTParameterGroupList(TParameterGroupList object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TParameter List</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TParameter List</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTParameterList(TParameterList object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TParameter Template</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TParameter Template</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTParameterTemplate(TParameterTemplate object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TPictures List</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TPictures List</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTPicturesList(TPicturesList object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TProduct ID</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TProduct ID</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTProductID(TProductID object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TProperty</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TProperty</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTProperty(TProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TRange</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TRange</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTRange(TRange object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TSpecification Revision</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TSpecification Revision</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTSpecificationRevision(TSpecificationRevision object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TSubrange</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TSubrange</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTSubrange(TSubrange object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TTemplate List</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TTemplate List</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTTemplateList(TTemplateList object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TUnit</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TUnit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTUnit(TUnit object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TValue</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TValue</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTValue(TValue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TVar Declaration</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TVar Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTVarDeclaration(TVarDeclaration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TVariable Ref</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TVariable Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTVariableRef(TVariableRef object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TVendor ID</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TVendor ID</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTVendorID(TVendorID object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TVersion</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TVersion</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTVersion(TVersion object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseValueType(ValueType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Variable ID Ref Type</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Variable ID Ref Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVariableIDRefType(VariableIDRefType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Vendor Name Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Vendor Name Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVendorNameType(VendorNameType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Vendor Text Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Vendor Text Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVendorTextType(VendorTextType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Version Info Type</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Version Info Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVersionInfoType(VersionInfoType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch, but this is
     * the last case anyway. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //XDDSwitch
