/**
 */
package com.br_automation.buoat.xddeditor.XDD.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import com.br_automation.buoat.xddeditor.XDD.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage
 * @generated
 */
public class XDDAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XDDPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDDAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XDDPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XDDSwitch<Adapter> modelSwitch =
		new XDDSwitch<Adapter>() {
			@Override
			public Adapter caseAddInfoType(AddInfoType object) {
				return createAddInfoTypeAdapter();
			}
			@Override
			public Adapter caseArrayType(ArrayType object) {
				return createArrayTypeAdapter();
			}
			@Override
			public Adapter caseCategoryType(CategoryType object) {
				return createCategoryTypeAdapter();
			}
			@Override
			public Adapter caseCharacteristicContentType(CharacteristicContentType object) {
				return createCharacteristicContentTypeAdapter();
			}
			@Override
			public Adapter caseCharacteristicNameType(CharacteristicNameType object) {
				return createCharacteristicNameTypeAdapter();
			}
			@Override
			public Adapter caseCharacteristicsListType(CharacteristicsListType object) {
				return createCharacteristicsListTypeAdapter();
			}
			@Override
			public Adapter caseCharacteristicType(CharacteristicType object) {
				return createCharacteristicTypeAdapter();
			}
			@Override
			public Adapter caseCompliantWithType(CompliantWithType object) {
				return createCompliantWithTypeAdapter();
			}
			@Override
			public Adapter caseConfigVarsType(ConfigVarsType object) {
				return createConfigVarsTypeAdapter();
			}
			@Override
			public Adapter caseConnectionType(ConnectionType object) {
				return createConnectionTypeAdapter();
			}
			@Override
			public Adapter caseConnectorType(ConnectorType object) {
				return createConnectorTypeAdapter();
			}
			@Override
			public Adapter caseDataTypeListType(DataTypeListType object) {
				return createDataTypeListTypeAdapter();
			}
			@Override
			public Adapter caseDerivedType(DerivedType object) {
				return createDerivedTypeAdapter();
			}
			@Override
			public Adapter caseDescriptionRefType(DescriptionRefType object) {
				return createDescriptionRefTypeAdapter();
			}
			@Override
			public Adapter caseDescriptionType(DescriptionType object) {
				return createDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseDictionaryType(DictionaryType object) {
				return createDictionaryTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDynamicChannelsType(DynamicChannelsType object) {
				return createDynamicChannelsTypeAdapter();
			}
			@Override
			public Adapter caseEnumType(EnumType object) {
				return createEnumTypeAdapter();
			}
			@Override
			public Adapter caseErrorBitDataType(ErrorBitDataType object) {
				return createErrorBitDataTypeAdapter();
			}
			@Override
			public Adapter caseErrorConstantDataType(ErrorConstantDataType object) {
				return createErrorConstantDataTypeAdapter();
			}
			@Override
			public Adapter caseErrorListType(ErrorListType object) {
				return createErrorListTypeAdapter();
			}
			@Override
			public Adapter caseFileType(FileType object) {
				return createFileTypeAdapter();
			}
			@Override
			public Adapter caseFirmwareType(FirmwareType object) {
				return createFirmwareTypeAdapter();
			}
			@Override
			public Adapter caseFunctionInstanceType(FunctionInstanceType object) {
				return createFunctionInstanceTypeAdapter();
			}
			@Override
			public Adapter caseFunctionTypeType(FunctionTypeType object) {
				return createFunctionTypeTypeAdapter();
			}
			@Override
			public Adapter caseIdentityType(IdentityType object) {
				return createIdentityTypeAdapter();
			}
			@Override
			public Adapter caseInputVarsType(InputVarsType object) {
				return createInputVarsTypeAdapter();
			}
			@Override
			public Adapter caseInstanceIDRefType(InstanceIDRefType object) {
				return createInstanceIDRefTypeAdapter();
			}
			@Override
			public Adapter caseInstanceNameType(InstanceNameType object) {
				return createInstanceNameTypeAdapter();
			}
			@Override
			public Adapter caseInterfaceListType(InterfaceListType object) {
				return createInterfaceListTypeAdapter();
			}
			@Override
			public Adapter caseISO15745ProfileContainerType(ISO15745ProfileContainerType object) {
				return createISO15745ProfileContainerTypeAdapter();
			}
			@Override
			public Adapter caseISO15745ProfileType(ISO15745ProfileType object) {
				return createISO15745ProfileTypeAdapter();
			}
			@Override
			public Adapter caseISO15745ReferenceDataType(ISO15745ReferenceDataType object) {
				return createISO15745ReferenceDataTypeAdapter();
			}
			@Override
			public Adapter caseLabelRefType(LabelRefType object) {
				return createLabelRefTypeAdapter();
			}
			@Override
			public Adapter caseLabelType(LabelType object) {
				return createLabelTypeAdapter();
			}
			@Override
			public Adapter caseLEDListType(LEDListType object) {
				return createLEDListTypeAdapter();
			}
			@Override
			public Adapter caseLEDstateRefType(LEDstateRefType object) {
				return createLEDstateRefTypeAdapter();
			}
			@Override
			public Adapter caseLEDstateType(LEDstateType object) {
				return createLEDstateTypeAdapter();
			}
			@Override
			public Adapter caseMaxValueType(MaxValueType object) {
				return createMaxValueTypeAdapter();
			}
			@Override
			public Adapter caseMemberRefType(MemberRefType object) {
				return createMemberRefTypeAdapter();
			}
			@Override
			public Adapter caseMinValueType(MinValueType object) {
				return createMinValueTypeAdapter();
			}
			@Override
			public Adapter caseObjectListType(ObjectListType object) {
				return createObjectListTypeAdapter();
			}
			@Override
			public Adapter caseOrderNumberType(OrderNumberType object) {
				return createOrderNumberTypeAdapter();
			}
			@Override
			public Adapter caseOutputVarsType(OutputVarsType object) {
				return createOutputVarsTypeAdapter();
			}
			@Override
			public Adapter caseParameterRefType(ParameterRefType object) {
				return createParameterRefTypeAdapter();
			}
			@Override
			public Adapter caseParameterType(ParameterType object) {
				return createParameterTypeAdapter();
			}
			@Override
			public Adapter casePictureType(PictureType object) {
				return createPictureTypeAdapter();
			}
			@Override
			public Adapter caseProductFamilyType(ProductFamilyType object) {
				return createProductFamilyTypeAdapter();
			}
			@Override
			public Adapter caseProductNameType(ProductNameType object) {
				return createProductNameTypeAdapter();
			}
			@Override
			public Adapter caseProductTextType(ProductTextType object) {
				return createProductTextTypeAdapter();
			}
			@Override
			public Adapter caseProfileBodyCommunicationNetworkPowerlink(ProfileBodyCommunicationNetworkPowerlink object) {
				return createProfileBodyCommunicationNetworkPowerlinkAdapter();
			}
			@Override
			public Adapter caseProfileBodyDataType(ProfileBodyDataType object) {
				return createProfileBodyDataTypeAdapter();
			}
			@Override
			public Adapter caseProfileBodyDevicePowerlink(ProfileBodyDevicePowerlink object) {
				return createProfileBodyDevicePowerlinkAdapter();
			}
			@Override
			public Adapter caseProfileHandleDataType(ProfileHandleDataType object) {
				return createProfileHandleDataTypeAdapter();
			}
			@Override
			public Adapter caseProfileHeaderDataType(ProfileHeaderDataType object) {
				return createProfileHeaderDataTypeAdapter();
			}
			@Override
			public Adapter caseStandardComplianceListType(StandardComplianceListType object) {
				return createStandardComplianceListTypeAdapter();
			}
			@Override
			public Adapter caseStaticErrorBitFieldType(StaticErrorBitFieldType object) {
				return createStaticErrorBitFieldTypeAdapter();
			}
			@Override
			public Adapter caseStepType(StepType object) {
				return createStepTypeAdapter();
			}
			@Override
			public Adapter caseStructType(StructType object) {
				return createStructTypeAdapter();
			}
			@Override
			public Adapter caseSubObjectType(SubObjectType object) {
				return createSubObjectTypeAdapter();
			}
			@Override
			public Adapter caseTAllowedValues(TAllowedValues object) {
				return createTAllowedValuesAdapter();
			}
			@Override
			public Adapter caseTAllowedValuesTemplate(TAllowedValuesTemplate object) {
				return createTAllowedValuesTemplateAdapter();
			}
			@Override
			public Adapter caseTApplicationLayers(TApplicationLayers object) {
				return createTApplicationLayersAdapter();
			}
			@Override
			public Adapter caseTApplicationProcess(TApplicationProcess object) {
				return createTApplicationProcessAdapter();
			}
			@Override
			public Adapter caseTCapabilities(TCapabilities object) {
				return createTCapabilitiesAdapter();
			}
			@Override
			public Adapter caseTClassificationList(TClassificationList object) {
				return createTClassificationListAdapter();
			}
			@Override
			public Adapter caseTCNFeatures(TCNFeatures object) {
				return createTCNFeaturesAdapter();
			}
			@Override
			public Adapter caseTCombinedState(TCombinedState object) {
				return createTCombinedStateAdapter();
			}
			@Override
			public Adapter caseTConditionalSupport(TConditionalSupport object) {
				return createTConditionalSupportAdapter();
			}
			@Override
			public Adapter caseTConnectorList(TConnectorList object) {
				return createTConnectorListAdapter();
			}
			@Override
			public Adapter caseTCount(TCount object) {
				return createTCountAdapter();
			}
			@Override
			public Adapter caseTDataTypeIDRef(TDataTypeIDRef object) {
				return createTDataTypeIDRefAdapter();
			}
			@Override
			public Adapter caseTDataTypeList(TDataTypeList object) {
				return createTDataTypeListAdapter();
			}
			@Override
			public Adapter caseTDataTypes(TDataTypes object) {
				return createTDataTypesAdapter();
			}
			@Override
			public Adapter caseTDenotation(TDenotation object) {
				return createTDenotationAdapter();
			}
			@Override
			public Adapter caseTDeviceCommissioning(TDeviceCommissioning object) {
				return createTDeviceCommissioningAdapter();
			}
			@Override
			public Adapter caseTDeviceFamily(TDeviceFamily object) {
				return createTDeviceFamilyAdapter();
			}
			@Override
			public Adapter caseTDeviceFunction(TDeviceFunction object) {
				return createTDeviceFunctionAdapter();
			}
			@Override
			public Adapter caseTDeviceIdentity(TDeviceIdentity object) {
				return createTDeviceIdentityAdapter();
			}
			@Override
			public Adapter caseTDeviceManager(TDeviceManager object) {
				return createTDeviceManagerAdapter();
			}
			@Override
			public Adapter caseTDiagnostic(TDiagnostic object) {
				return createTDiagnosticAdapter();
			}
			@Override
			public Adapter caseTDictionaryList(TDictionaryList object) {
				return createTDictionaryListAdapter();
			}
			@Override
			public Adapter caseTDynamicChannel(TDynamicChannel object) {
				return createTDynamicChannelAdapter();
			}
			@Override
			public Adapter caseTEnumValue(TEnumValue object) {
				return createTEnumValueAdapter();
			}
			@Override
			public Adapter caseTextEntryType(TextEntryType object) {
				return createTextEntryTypeAdapter();
			}
			@Override
			public Adapter caseTextResourceType(TextResourceType object) {
				return createTextResourceTypeAdapter();
			}
			@Override
			public Adapter caseTFirmwareList(TFirmwareList object) {
				return createTFirmwareListAdapter();
			}
			@Override
			public Adapter caseTFunctionInstanceList(TFunctionInstanceList object) {
				return createTFunctionInstanceListAdapter();
			}
			@Override
			public Adapter caseTFunctionTypeList(TFunctionTypeList object) {
				return createTFunctionTypeListAdapter();
			}
			@Override
			public Adapter caseTGeneralFeatures(TGeneralFeatures object) {
				return createTGeneralFeaturesAdapter();
			}
			@Override
			public Adapter caseTIndicatorList(TIndicatorList object) {
				return createTIndicatorListAdapter();
			}
			@Override
			public Adapter caseTLED(TLED object) {
				return createTLEDAdapter();
			}
			@Override
			public Adapter caseTMNFeatures(TMNFeatures object) {
				return createTMNFeaturesAdapter();
			}
			@Override
			public Adapter caseTNetworkManagement(TNetworkManagement object) {
				return createTNetworkManagementAdapter();
			}
			@Override
			public Adapter caseTObject(TObject object) {
				return createTObjectAdapter();
			}
			@Override
			public Adapter caseTParameterGroup(TParameterGroup object) {
				return createTParameterGroupAdapter();
			}
			@Override
			public Adapter caseTParameterGroupList(TParameterGroupList object) {
				return createTParameterGroupListAdapter();
			}
			@Override
			public Adapter caseTParameterList(TParameterList object) {
				return createTParameterListAdapter();
			}
			@Override
			public Adapter caseTParameterTemplate(TParameterTemplate object) {
				return createTParameterTemplateAdapter();
			}
			@Override
			public Adapter caseTPicturesList(TPicturesList object) {
				return createTPicturesListAdapter();
			}
			@Override
			public Adapter caseTProductID(TProductID object) {
				return createTProductIDAdapter();
			}
			@Override
			public Adapter caseTProperty(TProperty object) {
				return createTPropertyAdapter();
			}
			@Override
			public Adapter caseTRange(TRange object) {
				return createTRangeAdapter();
			}
			@Override
			public Adapter caseTSpecificationRevision(TSpecificationRevision object) {
				return createTSpecificationRevisionAdapter();
			}
			@Override
			public Adapter caseTSubrange(TSubrange object) {
				return createTSubrangeAdapter();
			}
			@Override
			public Adapter caseTTemplateList(TTemplateList object) {
				return createTTemplateListAdapter();
			}
			@Override
			public Adapter caseTUnit(TUnit object) {
				return createTUnitAdapter();
			}
			@Override
			public Adapter caseTValue(TValue object) {
				return createTValueAdapter();
			}
			@Override
			public Adapter caseTVarDeclaration(TVarDeclaration object) {
				return createTVarDeclarationAdapter();
			}
			@Override
			public Adapter caseTVariableRef(TVariableRef object) {
				return createTVariableRefAdapter();
			}
			@Override
			public Adapter caseTVendorID(TVendorID object) {
				return createTVendorIDAdapter();
			}
			@Override
			public Adapter caseTVersion(TVersion object) {
				return createTVersionAdapter();
			}
			@Override
			public Adapter caseValueType(ValueType object) {
				return createValueTypeAdapter();
			}
			@Override
			public Adapter caseVariableIDRefType(VariableIDRefType object) {
				return createVariableIDRefTypeAdapter();
			}
			@Override
			public Adapter caseVendorNameType(VendorNameType object) {
				return createVendorNameTypeAdapter();
			}
			@Override
			public Adapter caseVendorTextType(VendorTextType object) {
				return createVendorTextTypeAdapter();
			}
			@Override
			public Adapter caseVersionInfoType(VersionInfoType object) {
				return createVersionInfoTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.AddInfoType <em>Add Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.AddInfoType
	 * @generated
	 */
	public Adapter createAddInfoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.ArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.ArrayType
	 * @generated
	 */
	public Adapter createArrayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.CategoryType <em>Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.CategoryType
	 * @generated
	 */
	public Adapter createCategoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.CharacteristicContentType <em>Characteristic Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.CharacteristicContentType
	 * @generated
	 */
	public Adapter createCharacteristicContentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.CharacteristicNameType <em>Characteristic Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.CharacteristicNameType
	 * @generated
	 */
	public Adapter createCharacteristicNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.CharacteristicsListType <em>Characteristics List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.CharacteristicsListType
	 * @generated
	 */
	public Adapter createCharacteristicsListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.CharacteristicType <em>Characteristic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.CharacteristicType
	 * @generated
	 */
	public Adapter createCharacteristicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.CompliantWithType <em>Compliant With Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.CompliantWithType
	 * @generated
	 */
	public Adapter createCompliantWithTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.ConfigVarsType <em>Config Vars Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.ConfigVarsType
	 * @generated
	 */
	public Adapter createConfigVarsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.ConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.ConnectionType
	 * @generated
	 */
	public Adapter createConnectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.ConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.ConnectorType
	 * @generated
	 */
	public Adapter createConnectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.DataTypeListType <em>Data Type List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.DataTypeListType
	 * @generated
	 */
	public Adapter createDataTypeListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.DerivedType <em>Derived Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.DerivedType
	 * @generated
	 */
	public Adapter createDerivedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.DescriptionRefType <em>Description Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.DescriptionRefType
	 * @generated
	 */
	public Adapter createDescriptionRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.DescriptionType
	 * @generated
	 */
	public Adapter createDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.DictionaryType <em>Dictionary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.DictionaryType
	 * @generated
	 */
	public Adapter createDictionaryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.DynamicChannelsType <em>Dynamic Channels Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.DynamicChannelsType
	 * @generated
	 */
	public Adapter createDynamicChannelsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.EnumType <em>Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.EnumType
	 * @generated
	 */
	public Adapter createEnumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.ErrorBitDataType <em>Error Bit Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.ErrorBitDataType
	 * @generated
	 */
	public Adapter createErrorBitDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.ErrorConstantDataType <em>Error Constant Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.ErrorConstantDataType
	 * @generated
	 */
	public Adapter createErrorConstantDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.ErrorListType <em>Error List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.ErrorListType
	 * @generated
	 */
	public Adapter createErrorListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.FileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.FileType
	 * @generated
	 */
	public Adapter createFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.FirmwareType <em>Firmware Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.FirmwareType
	 * @generated
	 */
	public Adapter createFirmwareTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.FunctionInstanceType <em>Function Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.FunctionInstanceType
	 * @generated
	 */
	public Adapter createFunctionInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.FunctionTypeType <em>Function Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.FunctionTypeType
	 * @generated
	 */
	public Adapter createFunctionTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.IdentityType <em>Identity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.IdentityType
	 * @generated
	 */
	public Adapter createIdentityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.InputVarsType <em>Input Vars Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.InputVarsType
	 * @generated
	 */
	public Adapter createInputVarsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.InstanceIDRefType <em>Instance ID Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.InstanceIDRefType
	 * @generated
	 */
	public Adapter createInstanceIDRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.InstanceNameType <em>Instance Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.InstanceNameType
	 * @generated
	 */
	public Adapter createInstanceNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.InterfaceListType <em>Interface List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.InterfaceListType
	 * @generated
	 */
	public Adapter createInterfaceListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileContainerType <em>ISO15745 Profile Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileContainerType
	 * @generated
	 */
	public Adapter createISO15745ProfileContainerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileType <em>ISO15745 Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileType
	 * @generated
	 */
	public Adapter createISO15745ProfileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.ISO15745ReferenceDataType <em>ISO15745 Reference Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.ISO15745ReferenceDataType
	 * @generated
	 */
	public Adapter createISO15745ReferenceDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.LabelRefType <em>Label Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.LabelRefType
	 * @generated
	 */
	public Adapter createLabelRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.LabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.LabelType
	 * @generated
	 */
	public Adapter createLabelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.LEDListType <em>LED List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDListType
	 * @generated
	 */
	public Adapter createLEDListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.LEDstateRefType <em>LE Dstate Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDstateRefType
	 * @generated
	 */
	public Adapter createLEDstateRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.LEDstateType <em>LE Dstate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.LEDstateType
	 * @generated
	 */
	public Adapter createLEDstateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.MaxValueType <em>Max Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.MaxValueType
	 * @generated
	 */
	public Adapter createMaxValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.MemberRefType <em>Member Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.MemberRefType
	 * @generated
	 */
	public Adapter createMemberRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.MinValueType <em>Min Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.MinValueType
	 * @generated
	 */
	public Adapter createMinValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.ObjectListType <em>Object List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.ObjectListType
	 * @generated
	 */
	public Adapter createObjectListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.OrderNumberType <em>Order Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.OrderNumberType
	 * @generated
	 */
	public Adapter createOrderNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.OutputVarsType <em>Output Vars Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.OutputVarsType
	 * @generated
	 */
	public Adapter createOutputVarsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.ParameterRefType <em>Parameter Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterRefType
	 * @generated
	 */
	public Adapter createParameterRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.ParameterType
	 * @generated
	 */
	public Adapter createParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.PictureType <em>Picture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.PictureType
	 * @generated
	 */
	public Adapter createPictureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.ProductFamilyType <em>Product Family Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProductFamilyType
	 * @generated
	 */
	public Adapter createProductFamilyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.ProductNameType <em>Product Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProductNameType
	 * @generated
	 */
	public Adapter createProductNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.ProductTextType <em>Product Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProductTextType
	 * @generated
	 */
	public Adapter createProductTextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink <em>Profile Body Communication Network Powerlink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink
	 * @generated
	 */
	public Adapter createProfileBodyCommunicationNetworkPowerlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType <em>Profile Body Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType
	 * @generated
	 */
	public Adapter createProfileBodyDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink <em>Profile Body Device Powerlink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink
	 * @generated
	 */
	public Adapter createProfileBodyDevicePowerlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.ProfileHandleDataType <em>Profile Handle Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileHandleDataType
	 * @generated
	 */
	public Adapter createProfileHandleDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType <em>Profile Header Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType
	 * @generated
	 */
	public Adapter createProfileHeaderDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.StandardComplianceListType <em>Standard Compliance List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.StandardComplianceListType
	 * @generated
	 */
	public Adapter createStandardComplianceListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.StaticErrorBitFieldType <em>Static Error Bit Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.StaticErrorBitFieldType
	 * @generated
	 */
	public Adapter createStaticErrorBitFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.StepType <em>Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.StepType
	 * @generated
	 */
	public Adapter createStepTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.StructType <em>Struct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.StructType
	 * @generated
	 */
	public Adapter createStructTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.SubObjectType <em>Sub Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.SubObjectType
	 * @generated
	 */
	public Adapter createSubObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TAllowedValues <em>TAllowed Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TAllowedValues
	 * @generated
	 */
	public Adapter createTAllowedValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TAllowedValuesTemplate <em>TAllowed Values Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TAllowedValuesTemplate
	 * @generated
	 */
	public Adapter createTAllowedValuesTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TApplicationLayers <em>TApplication Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TApplicationLayers
	 * @generated
	 */
	public Adapter createTApplicationLayersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TApplicationProcess <em>TApplication Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TApplicationProcess
	 * @generated
	 */
	public Adapter createTApplicationProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TCapabilities <em>TCapabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCapabilities
	 * @generated
	 */
	public Adapter createTCapabilitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TClassificationList <em>TClassification List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TClassificationList
	 * @generated
	 */
	public Adapter createTClassificationListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TCNFeatures <em>TCN Features</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCNFeatures
	 * @generated
	 */
	public Adapter createTCNFeaturesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TCombinedState <em>TCombined State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCombinedState
	 * @generated
	 */
	public Adapter createTCombinedStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TConditionalSupport <em>TConditional Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TConditionalSupport
	 * @generated
	 */
	public Adapter createTConditionalSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TConnectorList <em>TConnector List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TConnectorList
	 * @generated
	 */
	public Adapter createTConnectorListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TCount <em>TCount</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TCount
	 * @generated
	 */
	public Adapter createTCountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypeIDRef <em>TData Type ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypeIDRef
	 * @generated
	 */
	public Adapter createTDataTypeIDRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypeList <em>TData Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypeList
	 * @generated
	 */
	public Adapter createTDataTypeListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TDataTypes <em>TData Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDataTypes
	 * @generated
	 */
	public Adapter createTDataTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TDenotation <em>TDenotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDenotation
	 * @generated
	 */
	public Adapter createTDenotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning <em>TDevice Commissioning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning
	 * @generated
	 */
	public Adapter createTDeviceCommissioningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFamily <em>TDevice Family</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceFamily
	 * @generated
	 */
	public Adapter createTDeviceFamilyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceFunction <em>TDevice Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceFunction
	 * @generated
	 */
	public Adapter createTDeviceFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity <em>TDevice Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity
	 * @generated
	 */
	public Adapter createTDeviceIdentityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TDeviceManager <em>TDevice Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDeviceManager
	 * @generated
	 */
	public Adapter createTDeviceManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TDiagnostic <em>TDiagnostic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDiagnostic
	 * @generated
	 */
	public Adapter createTDiagnosticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TDictionaryList <em>TDictionary List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDictionaryList
	 * @generated
	 */
	public Adapter createTDictionaryListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TDynamicChannel <em>TDynamic Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TDynamicChannel
	 * @generated
	 */
	public Adapter createTDynamicChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TEnumValue <em>TEnum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TEnumValue
	 * @generated
	 */
	public Adapter createTEnumValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TextEntryType <em>Text Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TextEntryType
	 * @generated
	 */
	public Adapter createTextEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TextResourceType <em>Text Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TextResourceType
	 * @generated
	 */
	public Adapter createTextResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TFirmwareList <em>TFirmware List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TFirmwareList
	 * @generated
	 */
	public Adapter createTFirmwareListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TFunctionInstanceList <em>TFunction Instance List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TFunctionInstanceList
	 * @generated
	 */
	public Adapter createTFunctionInstanceListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TFunctionTypeList <em>TFunction Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TFunctionTypeList
	 * @generated
	 */
	public Adapter createTFunctionTypeListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures <em>TGeneral Features</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures
	 * @generated
	 */
	public Adapter createTGeneralFeaturesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TIndicatorList <em>TIndicator List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TIndicatorList
	 * @generated
	 */
	public Adapter createTIndicatorListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TLED <em>TLED</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TLED
	 * @generated
	 */
	public Adapter createTLEDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TMNFeatures <em>TMN Features</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TMNFeatures
	 * @generated
	 */
	public Adapter createTMNFeaturesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TNetworkManagement <em>TNetwork Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TNetworkManagement
	 * @generated
	 */
	public Adapter createTNetworkManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TObject <em>TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TObject
	 * @generated
	 */
	public Adapter createTObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroup <em>TParameter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterGroup
	 * @generated
	 */
	public Adapter createTParameterGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TParameterGroupList <em>TParameter Group List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterGroupList
	 * @generated
	 */
	public Adapter createTParameterGroupListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TParameterList <em>TParameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterList
	 * @generated
	 */
	public Adapter createTParameterListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate <em>TParameter Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TParameterTemplate
	 * @generated
	 */
	public Adapter createTParameterTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TPicturesList <em>TPictures List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TPicturesList
	 * @generated
	 */
	public Adapter createTPicturesListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TProductID <em>TProduct ID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TProductID
	 * @generated
	 */
	public Adapter createTProductIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TProperty <em>TProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TProperty
	 * @generated
	 */
	public Adapter createTPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TRange <em>TRange</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TRange
	 * @generated
	 */
	public Adapter createTRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TSpecificationRevision <em>TSpecification Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TSpecificationRevision
	 * @generated
	 */
	public Adapter createTSpecificationRevisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TSubrange <em>TSubrange</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TSubrange
	 * @generated
	 */
	public Adapter createTSubrangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TTemplateList <em>TTemplate List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TTemplateList
	 * @generated
	 */
	public Adapter createTTemplateListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TUnit <em>TUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TUnit
	 * @generated
	 */
	public Adapter createTUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TValue <em>TValue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TValue
	 * @generated
	 */
	public Adapter createTValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TVarDeclaration <em>TVar Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVarDeclaration
	 * @generated
	 */
	public Adapter createTVarDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TVariableRef <em>TVariable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVariableRef
	 * @generated
	 */
	public Adapter createTVariableRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TVendorID <em>TVendor ID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVendorID
	 * @generated
	 */
	public Adapter createTVendorIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.TVersion <em>TVersion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.TVersion
	 * @generated
	 */
	public Adapter createTVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.ValueType
	 * @generated
	 */
	public Adapter createValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.VariableIDRefType <em>Variable ID Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.VariableIDRefType
	 * @generated
	 */
	public Adapter createVariableIDRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.VendorNameType <em>Vendor Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.VendorNameType
	 * @generated
	 */
	public Adapter createVendorNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.VendorTextType <em>Vendor Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.VendorTextType
	 * @generated
	 */
	public Adapter createVendorTextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br_automation.buoat.xddeditor.XDD.VersionInfoType <em>Version Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br_automation.buoat.xddeditor.XDD.VersionInfoType
	 * @generated
	 */
	public Adapter createVersionInfoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //XDDAdapterFactory
