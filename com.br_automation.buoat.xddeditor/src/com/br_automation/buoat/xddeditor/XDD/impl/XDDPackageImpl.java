/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.AccessType;
import com.br_automation.buoat.xddeditor.XDD.AccessType1;
import com.br_automation.buoat.xddeditor.XDD.AccessTypeType;
import com.br_automation.buoat.xddeditor.XDD.AddInfoType;
import com.br_automation.buoat.xddeditor.XDD.ArrayType;
import com.br_automation.buoat.xddeditor.XDD.CategoryType;
import com.br_automation.buoat.xddeditor.XDD.CharacteristicContentType;
import com.br_automation.buoat.xddeditor.XDD.CharacteristicNameType;
import com.br_automation.buoat.xddeditor.XDD.CharacteristicType;
import com.br_automation.buoat.xddeditor.XDD.CharacteristicsListType;
import com.br_automation.buoat.xddeditor.XDD.CompliantWithType;
import com.br_automation.buoat.xddeditor.XDD.ConfigVarsType;
import com.br_automation.buoat.xddeditor.XDD.ConnectionType;
import com.br_automation.buoat.xddeditor.XDD.DataTypeListType;
import com.br_automation.buoat.xddeditor.XDD.DerivedType;
import com.br_automation.buoat.xddeditor.XDD.DescriptionRefType;
import com.br_automation.buoat.xddeditor.XDD.DescriptionType;
import com.br_automation.buoat.xddeditor.XDD.DeviceClassType;
import com.br_automation.buoat.xddeditor.XDD.DictionaryType;
import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.DynamicChannelsType;
import com.br_automation.buoat.xddeditor.XDD.EnumType;
import com.br_automation.buoat.xddeditor.XDD.ErrorBitDataType;
import com.br_automation.buoat.xddeditor.XDD.ErrorConstantDataType;
import com.br_automation.buoat.xddeditor.XDD.ErrorListType;
import com.br_automation.buoat.xddeditor.XDD.FileType;
import com.br_automation.buoat.xddeditor.XDD.FunctionInstanceType;
import com.br_automation.buoat.xddeditor.XDD.FunctionTypeType;
import com.br_automation.buoat.xddeditor.XDD.IASInterfaceDataTypeMember0;
import com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileContainerType;
import com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileType;
import com.br_automation.buoat.xddeditor.XDD.ISO15745ReferenceDataType;
import com.br_automation.buoat.xddeditor.XDD.IdentityType;
import com.br_automation.buoat.xddeditor.XDD.InputVarsType;
import com.br_automation.buoat.xddeditor.XDD.InstanceIDRefType;
import com.br_automation.buoat.xddeditor.XDD.InstanceNameType;
import com.br_automation.buoat.xddeditor.XDD.InterfaceListType;
import com.br_automation.buoat.xddeditor.XDD.LEDListType;
import com.br_automation.buoat.xddeditor.XDD.LEDcolorType;
import com.br_automation.buoat.xddeditor.XDD.LEDcolorsType;
import com.br_automation.buoat.xddeditor.XDD.LEDstateRefType;
import com.br_automation.buoat.xddeditor.XDD.LEDstateType;
import com.br_automation.buoat.xddeditor.XDD.LEDtypeType;
import com.br_automation.buoat.xddeditor.XDD.LabelRefType;
import com.br_automation.buoat.xddeditor.XDD.LabelType;
import com.br_automation.buoat.xddeditor.XDD.MaxValueType;
import com.br_automation.buoat.xddeditor.XDD.MemberRefType;
import com.br_automation.buoat.xddeditor.XDD.MinValueType;
import com.br_automation.buoat.xddeditor.XDD.NodeTypeType;
import com.br_automation.buoat.xddeditor.XDD.ObjectListType;
import com.br_automation.buoat.xddeditor.XDD.OrderNumberType;
import com.br_automation.buoat.xddeditor.XDD.OutputVarsType;
import com.br_automation.buoat.xddeditor.XDD.ParameterRefType;
import com.br_automation.buoat.xddeditor.XDD.ParameterType;
import com.br_automation.buoat.xddeditor.XDD.PictureType;
import com.br_automation.buoat.xddeditor.XDD.ProductFamilyType;
import com.br_automation.buoat.xddeditor.XDD.ProductNameType;
import com.br_automation.buoat.xddeditor.XDD.ProductTextType;
import com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink;
import com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType;
import com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink;
import com.br_automation.buoat.xddeditor.XDD.ProfileClassIDDataType;
import com.br_automation.buoat.xddeditor.XDD.ProfileHandleDataType;
import com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType;
import com.br_automation.buoat.xddeditor.XDD.RangeType;
import com.br_automation.buoat.xddeditor.XDD.StandardComplianceListType;
import com.br_automation.buoat.xddeditor.XDD.StateType;
import com.br_automation.buoat.xddeditor.XDD.StaticErrorBitFieldType;
import com.br_automation.buoat.xddeditor.XDD.StepType;
import com.br_automation.buoat.xddeditor.XDD.StructType;
import com.br_automation.buoat.xddeditor.XDD.SubObjectType;
import com.br_automation.buoat.xddeditor.XDD.SupportType;
import com.br_automation.buoat.xddeditor.XDD.TAllowedValues;
import com.br_automation.buoat.xddeditor.XDD.TAllowedValuesTemplate;
import com.br_automation.buoat.xddeditor.XDD.TApplicationLayers;
import com.br_automation.buoat.xddeditor.XDD.TApplicationProcess;
import com.br_automation.buoat.xddeditor.XDD.TCNFeatures;
import com.br_automation.buoat.xddeditor.XDD.TCapabilities;
import com.br_automation.buoat.xddeditor.XDD.TCombinedState;
import com.br_automation.buoat.xddeditor.XDD.TConditionalSupport;
import com.br_automation.buoat.xddeditor.XDD.TCount;
import com.br_automation.buoat.xddeditor.XDD.TDataTypeIDRef;
import com.br_automation.buoat.xddeditor.XDD.TDataTypeList;
import com.br_automation.buoat.xddeditor.XDD.TDataTypes;
import com.br_automation.buoat.xddeditor.XDD.TDenotation;
import com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning;
import com.br_automation.buoat.xddeditor.XDD.TDeviceFamily;
import com.br_automation.buoat.xddeditor.XDD.TDeviceFunction;
import com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity;
import com.br_automation.buoat.xddeditor.XDD.TDeviceManager;
import com.br_automation.buoat.xddeditor.XDD.TDiagnostic;
import com.br_automation.buoat.xddeditor.XDD.TDictionaryList;
import com.br_automation.buoat.xddeditor.XDD.TDynamicChannel;
import com.br_automation.buoat.xddeditor.XDD.TEnumValue;
import com.br_automation.buoat.xddeditor.XDD.TFunctionInstanceList;
import com.br_automation.buoat.xddeditor.XDD.TFunctionTypeList;
import com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures;
import com.br_automation.buoat.xddeditor.XDD.TIndicatorList;
import com.br_automation.buoat.xddeditor.XDD.TMNFeatures;
import com.br_automation.buoat.xddeditor.XDD.TNetworkManagement;
import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.TObjectAccessType;
import com.br_automation.buoat.xddeditor.XDD.TObjectPDOMapping;
import com.br_automation.buoat.xddeditor.XDD.TParameterGroup;
import com.br_automation.buoat.xddeditor.XDD.TParameterGroupList;
import com.br_automation.buoat.xddeditor.XDD.TParameterList;
import com.br_automation.buoat.xddeditor.XDD.TParameterTemplate;
import com.br_automation.buoat.xddeditor.XDD.TPicturesList;
import com.br_automation.buoat.xddeditor.XDD.TProductID;
import com.br_automation.buoat.xddeditor.XDD.TProperty;
import com.br_automation.buoat.xddeditor.XDD.TRange;
import com.br_automation.buoat.xddeditor.XDD.TSpecificationRevision;
import com.br_automation.buoat.xddeditor.XDD.TSubrange;
import com.br_automation.buoat.xddeditor.XDD.TTemplateList;
import com.br_automation.buoat.xddeditor.XDD.TTransportLayers;
import com.br_automation.buoat.xddeditor.XDD.TUnit;
import com.br_automation.buoat.xddeditor.XDD.TValue;
import com.br_automation.buoat.xddeditor.XDD.TVarDeclaration;
import com.br_automation.buoat.xddeditor.XDD.TVariableRef;
import com.br_automation.buoat.xddeditor.XDD.TVendorID;
import com.br_automation.buoat.xddeditor.XDD.TVersion;
import com.br_automation.buoat.xddeditor.XDD.TextEntryType;
import com.br_automation.buoat.xddeditor.XDD.TextResourceType;
import com.br_automation.buoat.xddeditor.XDD.ValueType;
import com.br_automation.buoat.xddeditor.XDD.VariableIDRefType;
import com.br_automation.buoat.xddeditor.XDD.VendorNameType;
import com.br_automation.buoat.xddeditor.XDD.VendorTextType;
import com.br_automation.buoat.xddeditor.XDD.VersionInfoType;
import com.br_automation.buoat.xddeditor.XDD.VersionTypeType;
import com.br_automation.buoat.xddeditor.XDD.XDDFactory;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import com.br_automation.buoat.xddeditor.XDD.util.XDDValidator;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class XDDPackageImpl extends EPackageImpl implements XDDPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass addInfoTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass arrayTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass categoryTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass characteristicContentTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass characteristicNameTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass characteristicsListTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass characteristicTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass compliantWithTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass configVarsTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass connectionTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass dataTypeListTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass derivedTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass descriptionRefTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass descriptionTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass dictionaryTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass documentRootEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass dynamicChannelsTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass enumTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass errorBitDataTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass errorConstantDataTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass errorListTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass fileTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass functionInstanceTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass functionTypeTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass identityTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass inputVarsTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass instanceIDRefTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass instanceNameTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass interfaceListTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass iso15745ProfileContainerTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass iso15745ProfileTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass iso15745ReferenceDataTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass labelRefTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass labelTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass ledListTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass leDstateRefTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass leDstateTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass maxValueTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass memberRefTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass minValueTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass objectListTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass orderNumberTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass outputVarsTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass parameterRefTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass parameterTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass pictureTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass productFamilyTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass productNameTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass productTextTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass profileBodyCommunicationNetworkPowerlinkEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass profileBodyDataTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass profileBodyDevicePowerlinkEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass profileHandleDataTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass profileHeaderDataTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass standardComplianceListTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass staticErrorBitFieldTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass stepTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass structTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass subObjectTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tAllowedValuesEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tAllowedValuesTemplateEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tApplicationLayersEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tApplicationProcessEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tCapabilitiesEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tcnFeaturesEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tCombinedStateEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tConditionalSupportEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tCountEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tDataTypeIDRefEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tDataTypeListEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tDataTypesEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tDenotationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tDeviceCommissioningEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tDeviceFamilyEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tDeviceFunctionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tDeviceIdentityEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tDeviceManagerEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tDiagnosticEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tTransportLayersEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tDictionaryListEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tDynamicChannelEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tEnumValueEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass textEntryTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass textResourceTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tFunctionInstanceListEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tFunctionTypeListEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tGeneralFeaturesEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tIndicatorListEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tledEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tmnFeaturesEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tNetworkManagementEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tObjectEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tParameterGroupEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tParameterGroupListEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tParameterListEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tParameterTemplateEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tPicturesListEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tProductIDEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tPropertyEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tRangeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tSpecificationRevisionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tSubrangeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tTemplateListEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tUnitEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tValueEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tVarDeclarationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tVariableRefEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tVendorIDEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tVersionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass valueTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass variableIDRefTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass vendorNameTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass vendorTextTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass versionInfoTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum accessTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum accessType1EEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum accessTypeTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum deviceClassTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum iasInterfaceDataTypeMember0EEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum leDcolorsTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum leDcolorTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum leDtypeTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum nodeTypeTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum profileClassIDDataTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum rangeTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum stateTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum supportTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum tObjectAccessTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum tObjectPDOMappingEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum versionTypeTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EDataType accessListTypeEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EDataType accessTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EDataType accessTypeObject1EDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EDataType accessTypeTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EDataType deviceClassTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EDataType iasInterfaceDataTypeEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EDataType iasInterfaceDataTypeMember0ObjectEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EDataType iasInterfaceDataTypeMember1EDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EDataType leDcolorsTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EDataType leDcolorTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EDataType leDtypeTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EDataType nodeTypeTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EDataType offsetTypeEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EDataType profileClassIDDataTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EDataType rangeTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EDataType stateTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EDataType supportedLanguagesTypeEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EDataType supportTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EDataType tObjectAccessTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EDataType tObjectPDOMappingObjectEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EDataType versionTypeTypeObjectEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
     * package package URI value.
     * <p>
     * Note: the correct way to create the package is via the static factory
     * method {@link #init init()}, which also performs initialization of the
     * package, or returns the registered package, if one already exists. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private XDDPackageImpl() {
        super(eNS_URI, XDDFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model,
     * and for any others upon which it depends.
     * 
     * <p>
     * This method is used to initialize {@link XDDPackage#eINSTANCE} when that
     * field is accessed. Clients should not invoke it directly. Instead, they
     * should simply access that field to obtain the package. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static XDDPackage init() {
        if (isInited) return (XDDPackage)EPackage.Registry.INSTANCE.getEPackage(XDDPackage.eNS_URI);

        // Obtain or create and register package
        XDDPackageImpl theXDDPackage = (XDDPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XDDPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XDDPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        XMLTypePackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theXDDPackage.createPackageContents();

        // Initialize created meta-data
        theXDDPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theXDDPackage, 
             new EValidator.Descriptor() {
                 public EValidator getEValidator() {
                     return XDDValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theXDDPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(XDDPackage.eNS_URI, theXDDPackage);
        return theXDDPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getAddInfoType() {
        return addInfoTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAddInfoType_Group() {
        return (EAttribute)addInfoTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getAddInfoType_Label() {
        return (EReference)addInfoTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getAddInfoType_Description() {
        return (EReference)addInfoTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getAddInfoType_LabelRef() {
        return (EReference)addInfoTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getAddInfoType_DescriptionRef() {
        return (EReference)addInfoTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getAddInfoType_Value() {
        return (EReference)addInfoTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAddInfoType_BitOffset() {
        return (EAttribute)addInfoTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAddInfoType_Len() {
        return (EAttribute)addInfoTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAddInfoType_Name() {
        return (EAttribute)addInfoTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getArrayType() {
        return arrayTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getArrayType_Group() {
        return (EAttribute)arrayTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getArrayType_Label() {
        return (EReference)arrayTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getArrayType_Description() {
        return (EReference)arrayTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getArrayType_LabelRef() {
        return (EReference)arrayTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getArrayType_DescriptionRef() {
        return (EReference)arrayTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getArrayType_Subrange() {
        return (EReference)arrayTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getArrayType_BOOL() {
        return (EReference)arrayTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getArrayType_BITSTRING() {
        return (EReference)arrayTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getArrayType_BYTE() {
        return (EReference)arrayTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getArrayType_CHAR() {
        return (EReference)arrayTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getArrayType_WORD() {
        return (EReference)arrayTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getArrayType_DWORD() {
        return (EReference)arrayTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getArrayType_LWORD() {
        return (EReference)arrayTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getArrayType_SINT() {
        return (EReference)arrayTypeEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getArrayType_INT() {
        return (EReference)arrayTypeEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getArrayType_DINT() {
        return (EReference)arrayTypeEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getArrayType_LINT() {
        return (EReference)arrayTypeEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getArrayType_USINT() {
        return (EReference)arrayTypeEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getArrayType_UINT() {
        return (EReference)arrayTypeEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getArrayType_UDINT() {
        return (EReference)arrayTypeEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getArrayType_ULINT() {
        return (EReference)arrayTypeEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getArrayType_REAL() {
        return (EReference)arrayTypeEClass.getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getArrayType_LREAL() {
        return (EReference)arrayTypeEClass.getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getArrayType_STRING() {
        return (EReference)arrayTypeEClass.getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getArrayType_WSTRING() {
        return (EReference)arrayTypeEClass.getEStructuralFeatures().get(24);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getArrayType_DataTypeIDRef() {
        return (EReference)arrayTypeEClass.getEStructuralFeatures().get(25);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getArrayType_Name() {
        return (EAttribute)arrayTypeEClass.getEStructuralFeatures().get(26);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getArrayType_UniqueID() {
        return (EAttribute)arrayTypeEClass.getEStructuralFeatures().get(27);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getCategoryType() {
        return categoryTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCategoryType_Group() {
        return (EAttribute)categoryTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCategoryType_Label() {
        return (EReference)categoryTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCategoryType_Description() {
        return (EReference)categoryTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCategoryType_LabelRef() {
        return (EReference)categoryTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCategoryType_DescriptionRef() {
        return (EReference)categoryTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getCharacteristicContentType() {
        return characteristicContentTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCharacteristicContentType_Group() {
        return (EAttribute)characteristicContentTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCharacteristicContentType_Label() {
        return (EReference)characteristicContentTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCharacteristicContentType_Description() {
        return (EReference)characteristicContentTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCharacteristicContentType_LabelRef() {
        return (EReference)characteristicContentTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCharacteristicContentType_DescriptionRef() {
        return (EReference)characteristicContentTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getCharacteristicNameType() {
        return characteristicNameTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCharacteristicNameType_Group() {
        return (EAttribute)characteristicNameTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCharacteristicNameType_Label() {
        return (EReference)characteristicNameTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCharacteristicNameType_Description() {
        return (EReference)characteristicNameTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCharacteristicNameType_LabelRef() {
        return (EReference)characteristicNameTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCharacteristicNameType_DescriptionRef() {
        return (EReference)characteristicNameTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getCharacteristicsListType() {
        return characteristicsListTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCharacteristicsListType_Category() {
        return (EReference)characteristicsListTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCharacteristicsListType_Characteristic() {
        return (EReference)characteristicsListTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getCharacteristicType() {
        return characteristicTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCharacteristicType_CharacteristicName() {
        return (EReference)characteristicTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCharacteristicType_CharacteristicContent() {
        return (EReference)characteristicTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getCompliantWithType() {
        return compliantWithTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCompliantWithType_Group() {
        return (EAttribute)compliantWithTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCompliantWithType_Label() {
        return (EReference)compliantWithTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCompliantWithType_Description() {
        return (EReference)compliantWithTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCompliantWithType_LabelRef() {
        return (EReference)compliantWithTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCompliantWithType_DescriptionRef() {
        return (EReference)compliantWithTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCompliantWithType_Name() {
        return (EAttribute)compliantWithTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCompliantWithType_Range() {
        return (EAttribute)compliantWithTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getConfigVarsType() {
        return configVarsTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getConfigVarsType_VarDeclaration() {
        return (EReference)configVarsTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getConnectionType() {
        return connectionTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectionType_Description() {
        return (EAttribute)connectionTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectionType_Destination() {
        return (EAttribute)connectionTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectionType_Source() {
        return (EAttribute)connectionTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataTypeListType() {
        return dataTypeListTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataTypeListType_DefType() {
        return (EReference)dataTypeListTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getDerivedType() {
        return derivedTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDerivedType_Group() {
        return (EAttribute)derivedTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDerivedType_Label() {
        return (EReference)derivedTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDerivedType_Description() {
        return (EReference)derivedTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDerivedType_LabelRef() {
        return (EReference)derivedTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDerivedType_DescriptionRef() {
        return (EReference)derivedTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDerivedType_Count() {
        return (EReference)derivedTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDerivedType_BOOL() {
        return (EReference)derivedTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDerivedType_BITSTRING() {
        return (EReference)derivedTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDerivedType_BYTE() {
        return (EReference)derivedTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDerivedType_CHAR() {
        return (EReference)derivedTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDerivedType_WORD() {
        return (EReference)derivedTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDerivedType_DWORD() {
        return (EReference)derivedTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDerivedType_LWORD() {
        return (EReference)derivedTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDerivedType_SINT() {
        return (EReference)derivedTypeEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDerivedType_INT() {
        return (EReference)derivedTypeEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDerivedType_DINT() {
        return (EReference)derivedTypeEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDerivedType_LINT() {
        return (EReference)derivedTypeEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDerivedType_USINT() {
        return (EReference)derivedTypeEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDerivedType_UINT() {
        return (EReference)derivedTypeEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDerivedType_UDINT() {
        return (EReference)derivedTypeEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDerivedType_ULINT() {
        return (EReference)derivedTypeEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDerivedType_REAL() {
        return (EReference)derivedTypeEClass.getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDerivedType_LREAL() {
        return (EReference)derivedTypeEClass.getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDerivedType_STRING() {
        return (EReference)derivedTypeEClass.getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDerivedType_WSTRING() {
        return (EReference)derivedTypeEClass.getEStructuralFeatures().get(24);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDerivedType_DataTypeIDRef() {
        return (EReference)derivedTypeEClass.getEStructuralFeatures().get(25);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDerivedType_Description1() {
        return (EAttribute)derivedTypeEClass.getEStructuralFeatures().get(26);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDerivedType_Name() {
        return (EAttribute)derivedTypeEClass.getEStructuralFeatures().get(27);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDerivedType_UniqueID() {
        return (EAttribute)derivedTypeEClass.getEStructuralFeatures().get(28);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getDescriptionRefType() {
        return descriptionRefTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDescriptionRefType_Value() {
        return (EAttribute)descriptionRefTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDescriptionRefType_DictID() {
        return (EAttribute)descriptionRefTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDescriptionRefType_TextID() {
        return (EAttribute)descriptionRefTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getDescriptionType() {
        return descriptionTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDescriptionType_Value() {
        return (EAttribute)descriptionTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDescriptionType_Lang() {
        return (EAttribute)descriptionTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDescriptionType_URI() {
        return (EAttribute)descriptionTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getDictionaryType() {
        return dictionaryTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDictionaryType_File() {
        return (EReference)dictionaryTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDictionaryType_DictID() {
        return (EAttribute)dictionaryTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDictionaryType_Lang() {
        return (EAttribute)dictionaryTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getDocumentRoot() {
        return documentRootEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ISO15745ProfileContainer() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getDynamicChannelsType() {
        return dynamicChannelsTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDynamicChannelsType_DynamicChannel() {
        return (EReference)dynamicChannelsTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getEnumType() {
        return enumTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEnumType_Group() {
        return (EAttribute)enumTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getEnumType_Label() {
        return (EReference)enumTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getEnumType_Description() {
        return (EReference)enumTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getEnumType_LabelRef() {
        return (EReference)enumTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getEnumType_DescriptionRef() {
        return (EReference)enumTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getEnumType_EnumValue() {
        return (EReference)enumTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getEnumType_BOOL() {
        return (EReference)enumTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getEnumType_BITSTRING() {
        return (EReference)enumTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getEnumType_BYTE() {
        return (EReference)enumTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getEnumType_CHAR() {
        return (EReference)enumTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getEnumType_WORD() {
        return (EReference)enumTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getEnumType_DWORD() {
        return (EReference)enumTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getEnumType_LWORD() {
        return (EReference)enumTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getEnumType_SINT() {
        return (EReference)enumTypeEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getEnumType_INT() {
        return (EReference)enumTypeEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getEnumType_DINT() {
        return (EReference)enumTypeEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getEnumType_LINT() {
        return (EReference)enumTypeEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getEnumType_USINT() {
        return (EReference)enumTypeEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getEnumType_UINT() {
        return (EReference)enumTypeEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getEnumType_UDINT() {
        return (EReference)enumTypeEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getEnumType_ULINT() {
        return (EReference)enumTypeEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getEnumType_REAL() {
        return (EReference)enumTypeEClass.getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getEnumType_LREAL() {
        return (EReference)enumTypeEClass.getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getEnumType_STRING() {
        return (EReference)enumTypeEClass.getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getEnumType_WSTRING() {
        return (EReference)enumTypeEClass.getEStructuralFeatures().get(24);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEnumType_Name() {
        return (EAttribute)enumTypeEClass.getEStructuralFeatures().get(25);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEnumType_Size() {
        return (EAttribute)enumTypeEClass.getEStructuralFeatures().get(26);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEnumType_UniqueID() {
        return (EAttribute)enumTypeEClass.getEStructuralFeatures().get(27);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getErrorBitDataType() {
        return errorBitDataTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getErrorBitDataType_Group() {
        return (EAttribute)errorBitDataTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getErrorBitDataType_Label() {
        return (EReference)errorBitDataTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getErrorBitDataType_Description() {
        return (EReference)errorBitDataTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getErrorBitDataType_LabelRef() {
        return (EReference)errorBitDataTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getErrorBitDataType_DescriptionRef() {
        return (EReference)errorBitDataTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getErrorBitDataType_Name() {
        return (EAttribute)errorBitDataTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getErrorBitDataType_Offset() {
        return (EAttribute)errorBitDataTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getErrorConstantDataType() {
        return errorConstantDataTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getErrorConstantDataType_Group() {
        return (EAttribute)errorConstantDataTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getErrorConstantDataType_Label() {
        return (EReference)errorConstantDataTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getErrorConstantDataType_Description() {
        return (EReference)errorConstantDataTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getErrorConstantDataType_LabelRef() {
        return (EReference)errorConstantDataTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getErrorConstantDataType_DescriptionRef() {
        return (EReference)errorConstantDataTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getErrorConstantDataType_AddInfo() {
        return (EReference)errorConstantDataTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getErrorConstantDataType_Name() {
        return (EAttribute)errorConstantDataTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getErrorConstantDataType_Value() {
        return (EAttribute)errorConstantDataTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getErrorListType() {
        return errorListTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getErrorListType_Error() {
        return (EReference)errorListTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getFileType() {
        return fileTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileType_URI() {
        return (EAttribute)fileTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getFunctionInstanceType() {
        return functionInstanceTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFunctionInstanceType_Group() {
        return (EAttribute)functionInstanceTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getFunctionInstanceType_Label() {
        return (EReference)functionInstanceTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getFunctionInstanceType_Description() {
        return (EReference)functionInstanceTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getFunctionInstanceType_LabelRef() {
        return (EReference)functionInstanceTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getFunctionInstanceType_DescriptionRef() {
        return (EReference)functionInstanceTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFunctionInstanceType_Name() {
        return (EAttribute)functionInstanceTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFunctionInstanceType_TypeIDRef() {
        return (EAttribute)functionInstanceTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFunctionInstanceType_UniqueID() {
        return (EAttribute)functionInstanceTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getFunctionTypeType() {
        return functionTypeTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFunctionTypeType_Group() {
        return (EAttribute)functionTypeTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getFunctionTypeType_Label() {
        return (EReference)functionTypeTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getFunctionTypeType_Description() {
        return (EReference)functionTypeTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getFunctionTypeType_LabelRef() {
        return (EReference)functionTypeTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getFunctionTypeType_DescriptionRef() {
        return (EReference)functionTypeTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getFunctionTypeType_VersionInfo() {
        return (EReference)functionTypeTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getFunctionTypeType_InterfaceList() {
        return (EReference)functionTypeTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getFunctionTypeType_FunctionInstanceList() {
        return (EReference)functionTypeTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFunctionTypeType_Name() {
        return (EAttribute)functionTypeTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFunctionTypeType_Package() {
        return (EAttribute)functionTypeTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFunctionTypeType_UniqueID() {
        return (EAttribute)functionTypeTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getIdentityType() {
        return identityTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityType_VendorID() {
        return (EReference)identityTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityType_DeviceFamily() {
        return (EReference)identityTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityType_ProductID() {
        return (EReference)identityTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityType_Version() {
        return (EReference)identityTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIdentityType_BuildDate() {
        return (EAttribute)identityTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityType_SpecificationRevision() {
        return (EReference)identityTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getInputVarsType() {
        return inputVarsTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getInputVarsType_VarDeclaration() {
        return (EReference)inputVarsTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getInstanceIDRefType() {
        return instanceIDRefTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInstanceIDRefType_UniqueIDRef() {
        return (EAttribute)instanceIDRefTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getInstanceNameType() {
        return instanceNameTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInstanceNameType_Value() {
        return (EAttribute)instanceNameTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInstanceNameType_ReadOnly() {
        return (EAttribute)instanceNameTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getInterfaceListType() {
        return interfaceListTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getInterfaceListType_InputVars() {
        return (EReference)interfaceListTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getInterfaceListType_OutputVars() {
        return (EReference)interfaceListTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getInterfaceListType_ConfigVars() {
        return (EReference)interfaceListTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getISO15745ProfileContainerType() {
        return iso15745ProfileContainerTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getISO15745ProfileContainerType_ISO15745Profile() {
        return (EReference)iso15745ProfileContainerTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getISO15745ProfileType() {
        return iso15745ProfileTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getISO15745ProfileType_ProfileHeader() {
        return (EReference)iso15745ProfileTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getISO15745ProfileType_ProfileBody() {
        return (EReference)iso15745ProfileTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getISO15745ReferenceDataType() {
        return iso15745ReferenceDataTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getISO15745ReferenceDataType_ISO15745Part() {
        return (EAttribute)iso15745ReferenceDataTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getISO15745ReferenceDataType_ISO15745Edition() {
        return (EAttribute)iso15745ReferenceDataTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getISO15745ReferenceDataType_ProfileTechnology() {
        return (EAttribute)iso15745ReferenceDataTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getLabelRefType() {
        return labelRefTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLabelRefType_Value() {
        return (EAttribute)labelRefTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLabelRefType_DictID() {
        return (EAttribute)labelRefTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLabelRefType_TextID() {
        return (EAttribute)labelRefTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getLabelType() {
        return labelTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLabelType_Value() {
        return (EAttribute)labelTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLabelType_Lang() {
        return (EAttribute)labelTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getLEDListType() {
        return ledListTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getLEDListType_LED() {
        return (EReference)ledListTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getLEDListType_CombinedState() {
        return (EReference)ledListTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getLEDstateRefType() {
        return leDstateRefTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLEDstateRefType_StateIDRef() {
        return (EAttribute)leDstateRefTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getLEDstateType() {
        return leDstateTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLEDstateType_Group() {
        return (EAttribute)leDstateTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getLEDstateType_Label() {
        return (EReference)leDstateTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getLEDstateType_Description() {
        return (EReference)leDstateTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getLEDstateType_LabelRef() {
        return (EReference)leDstateTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getLEDstateType_DescriptionRef() {
        return (EReference)leDstateTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLEDstateType_FlashingPeriod() {
        return (EAttribute)leDstateTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLEDstateType_ImpulsWidth() {
        return (EAttribute)leDstateTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLEDstateType_LEDcolor() {
        return (EAttribute)leDstateTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLEDstateType_NumberOfImpulses() {
        return (EAttribute)leDstateTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLEDstateType_State() {
        return (EAttribute)leDstateTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLEDstateType_UniqueID() {
        return (EAttribute)leDstateTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getMaxValueType() {
        return maxValueTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMaxValueType_Group() {
        return (EAttribute)maxValueTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getMaxValueType_Label() {
        return (EReference)maxValueTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getMaxValueType_Description() {
        return (EReference)maxValueTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getMaxValueType_LabelRef() {
        return (EReference)maxValueTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getMaxValueType_DescriptionRef() {
        return (EReference)maxValueTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMaxValueType_Multiplier() {
        return (EAttribute)maxValueTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMaxValueType_Offset() {
        return (EAttribute)maxValueTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMaxValueType_Value() {
        return (EAttribute)maxValueTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getMemberRefType() {
        return memberRefTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMemberRefType_Index() {
        return (EAttribute)memberRefTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMemberRefType_UniqueIDRef() {
        return (EAttribute)memberRefTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getMinValueType() {
        return minValueTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMinValueType_Group() {
        return (EAttribute)minValueTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getMinValueType_Label() {
        return (EReference)minValueTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getMinValueType_Description() {
        return (EReference)minValueTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getMinValueType_LabelRef() {
        return (EReference)minValueTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getMinValueType_DescriptionRef() {
        return (EReference)minValueTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMinValueType_Multiplier() {
        return (EAttribute)minValueTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMinValueType_Offset() {
        return (EAttribute)minValueTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMinValueType_Value() {
        return (EAttribute)minValueTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getObjectListType() {
        return objectListTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getObjectListType_Object() {
        return (EReference)objectListTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getObjectListType_MandatoryObjects() {
        return (EAttribute)objectListTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getObjectListType_ManufacturerObjects() {
        return (EAttribute)objectListTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getObjectListType_OptionalObjects() {
        return (EAttribute)objectListTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getOrderNumberType() {
        return orderNumberTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOrderNumberType_Value() {
        return (EAttribute)orderNumberTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOrderNumberType_ReadOnly() {
        return (EAttribute)orderNumberTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getOutputVarsType() {
        return outputVarsTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getOutputVarsType_VarDeclaration() {
        return (EReference)outputVarsTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getParameterRefType() {
        return parameterRefTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParameterRefType_UniqueIDRef() {
        return (EAttribute)parameterRefTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getParameterType() {
        return parameterTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParameterType_Group() {
        return (EAttribute)parameterTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_Label() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_Description() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_LabelRef() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_DescriptionRef() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_BOOL() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_BITSTRING() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_BYTE() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_CHAR() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_WORD() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_DWORD() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_LWORD() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_SINT() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_INT() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_DINT() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_LINT() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_USINT() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_UINT() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_UDINT() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_ULINT() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_REAL() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_LREAL() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_STRING() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_WSTRING() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_DataTypeIDRef() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(24);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_VariableRef() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(25);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_ConditionalSupport() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(26);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_Denotation() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(27);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_ActualValue() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(28);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_DefaultValue() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(29);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_SubstituteValue() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(30);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_AllowedValues() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(31);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_Unit() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(32);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_Property() {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(33);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParameterType_Access() {
        return (EAttribute)parameterTypeEClass.getEStructuralFeatures().get(34);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParameterType_AccessList() {
        return (EAttribute)parameterTypeEClass.getEStructuralFeatures().get(35);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParameterType_Multiplier() {
        return (EAttribute)parameterTypeEClass.getEStructuralFeatures().get(36);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParameterType_Offset() {
        return (EAttribute)parameterTypeEClass.getEStructuralFeatures().get(37);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParameterType_Persistent() {
        return (EAttribute)parameterTypeEClass.getEStructuralFeatures().get(38);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParameterType_Support() {
        return (EAttribute)parameterTypeEClass.getEStructuralFeatures().get(39);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParameterType_TemplateIDRef() {
        return (EAttribute)parameterTypeEClass.getEStructuralFeatures().get(40);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParameterType_UniqueID() {
        return (EAttribute)parameterTypeEClass.getEStructuralFeatures().get(41);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getPictureType() {
        return pictureTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPictureType_Group() {
        return (EAttribute)pictureTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getPictureType_Label() {
        return (EReference)pictureTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getPictureType_Description() {
        return (EReference)pictureTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getPictureType_LabelRef() {
        return (EReference)pictureTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getPictureType_DescriptionRef() {
        return (EReference)pictureTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPictureType_Number() {
        return (EAttribute)pictureTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPictureType_URI() {
        return (EAttribute)pictureTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getProductFamilyType() {
        return productFamilyTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProductFamilyType_Value() {
        return (EAttribute)productFamilyTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProductFamilyType_ReadOnly() {
        return (EAttribute)productFamilyTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getProductNameType() {
        return productNameTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProductNameType_Value() {
        return (EAttribute)productNameTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProductNameType_ReadOnly() {
        return (EAttribute)productNameTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getProductTextType() {
        return productTextTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProductTextType_Group() {
        return (EAttribute)productTextTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getProductTextType_Label() {
        return (EReference)productTextTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getProductTextType_Description() {
        return (EReference)productTextTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getProductTextType_LabelRef() {
        return (EReference)productTextTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getProductTextType_DescriptionRef() {
        return (EReference)productTextTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProductTextType_ReadOnly() {
        return (EAttribute)productTextTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getProfileBodyCommunicationNetworkPowerlink() {
        return profileBodyCommunicationNetworkPowerlinkEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getProfileBodyCommunicationNetworkPowerlink_ApplicationLayers() {
        return (EReference)profileBodyCommunicationNetworkPowerlinkEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getProfileBodyCommunicationNetworkPowerlink_TransportLayers() {
        return (EReference)profileBodyCommunicationNetworkPowerlinkEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getProfileBodyCommunicationNetworkPowerlink_NetworkManagement() {
        return (EReference)profileBodyCommunicationNetworkPowerlinkEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getProfileBodyCommunicationNetworkPowerlink_ExternalProfileHandle() {
        return (EReference)profileBodyCommunicationNetworkPowerlinkEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getProfileBodyDataType() {
        return profileBodyDataTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProfileBodyDataType_FileCreationDate() {
        return (EAttribute)profileBodyDataTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProfileBodyDataType_FileCreationTime() {
        return (EAttribute)profileBodyDataTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProfileBodyDataType_FileCreator() {
        return (EAttribute)profileBodyDataTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProfileBodyDataType_FileModificationDate() {
        return (EAttribute)profileBodyDataTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProfileBodyDataType_FileModificationTime() {
        return (EAttribute)profileBodyDataTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProfileBodyDataType_FileModifiedBy() {
        return (EAttribute)profileBodyDataTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProfileBodyDataType_FileName() {
        return (EAttribute)profileBodyDataTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProfileBodyDataType_FileVersion() {
        return (EAttribute)profileBodyDataTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProfileBodyDataType_FormatName() {
        return (EAttribute)profileBodyDataTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProfileBodyDataType_FormatVersion() {
        return (EAttribute)profileBodyDataTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProfileBodyDataType_SupportedLanguages() {
        return (EAttribute)profileBodyDataTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getProfileBodyDevicePowerlink() {
        return profileBodyDevicePowerlinkEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getProfileBodyDevicePowerlink_DeviceIdentity() {
        return (EReference)profileBodyDevicePowerlinkEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getProfileBodyDevicePowerlink_DeviceManager() {
        return (EReference)profileBodyDevicePowerlinkEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getProfileBodyDevicePowerlink_DeviceFunction() {
        return (EReference)profileBodyDevicePowerlinkEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getProfileBodyDevicePowerlink_ApplicationProcess() {
        return (EReference)profileBodyDevicePowerlinkEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getProfileBodyDevicePowerlink_ExternalProfileHandle() {
        return (EReference)profileBodyDevicePowerlinkEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProfileBodyDevicePowerlink_DeviceClass() {
        return (EAttribute)profileBodyDevicePowerlinkEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getProfileHandleDataType() {
        return profileHandleDataTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProfileHandleDataType_ProfileIdentification() {
        return (EAttribute)profileHandleDataTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProfileHandleDataType_ProfileRevision() {
        return (EAttribute)profileHandleDataTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProfileHandleDataType_ProfileLocation() {
        return (EAttribute)profileHandleDataTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getProfileHeaderDataType() {
        return profileHeaderDataTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProfileHeaderDataType_ProfileIdentification() {
        return (EAttribute)profileHeaderDataTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProfileHeaderDataType_ProfileRevision() {
        return (EAttribute)profileHeaderDataTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProfileHeaderDataType_ProfileName() {
        return (EAttribute)profileHeaderDataTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProfileHeaderDataType_ProfileSource() {
        return (EAttribute)profileHeaderDataTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProfileHeaderDataType_ProfileClassID() {
        return (EAttribute)profileHeaderDataTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProfileHeaderDataType_ProfileDate() {
        return (EAttribute)profileHeaderDataTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProfileHeaderDataType_AdditionalInformation() {
        return (EAttribute)profileHeaderDataTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getProfileHeaderDataType_ISO15745Reference() {
        return (EReference)profileHeaderDataTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProfileHeaderDataType_IASInterfaceType() {
        return (EAttribute)profileHeaderDataTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getStandardComplianceListType() {
        return standardComplianceListTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getStandardComplianceListType_CompliantWith() {
        return (EReference)standardComplianceListTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getStaticErrorBitFieldType() {
        return staticErrorBitFieldTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getStaticErrorBitFieldType_ErrorBit() {
        return (EReference)staticErrorBitFieldTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getStepType() {
        return stepTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStepType_Group() {
        return (EAttribute)stepTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getStepType_Label() {
        return (EReference)stepTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getStepType_Description() {
        return (EReference)stepTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getStepType_LabelRef() {
        return (EReference)stepTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getStepType_DescriptionRef() {
        return (EReference)stepTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStepType_Multiplier() {
        return (EAttribute)stepTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStepType_Offset() {
        return (EAttribute)stepTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStepType_Value() {
        return (EAttribute)stepTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getStructType() {
        return structTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStructType_Group() {
        return (EAttribute)structTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getStructType_Label() {
        return (EReference)structTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getStructType_Description() {
        return (EReference)structTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getStructType_LabelRef() {
        return (EReference)structTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getStructType_DescriptionRef() {
        return (EReference)structTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getStructType_VarDeclaration() {
        return (EReference)structTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStructType_Name() {
        return (EAttribute)structTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStructType_UniqueID() {
        return (EAttribute)structTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getSubObjectType() {
        return subObjectTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubObjectType_AccessType() {
        return (EAttribute)subObjectTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubObjectType_ActualValue() {
        return (EAttribute)subObjectTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubObjectType_DataType() {
        return (EAttribute)subObjectTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubObjectType_DefaultValue() {
        return (EAttribute)subObjectTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubObjectType_Denotation() {
        return (EAttribute)subObjectTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubObjectType_HighLimit() {
        return (EAttribute)subObjectTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubObjectType_LowLimit() {
        return (EAttribute)subObjectTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubObjectType_Name() {
        return (EAttribute)subObjectTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubObjectType_ObjectType() {
        return (EAttribute)subObjectTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubObjectType_ObjFlags() {
        return (EAttribute)subObjectTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubObjectType_PDOmapping() {
        return (EAttribute)subObjectTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubObjectType_SubIndex() {
        return (EAttribute)subObjectTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubObjectType_UniqueIDRef() {
        return (EAttribute)subObjectTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTAllowedValues() {
        return tAllowedValuesEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTAllowedValues_Value() {
        return (EReference)tAllowedValuesEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTAllowedValues_Range() {
        return (EReference)tAllowedValuesEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTAllowedValues_TemplateIDRef() {
        return (EAttribute)tAllowedValuesEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTAllowedValuesTemplate() {
        return tAllowedValuesTemplateEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTAllowedValuesTemplate_Value() {
        return (EReference)tAllowedValuesTemplateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTAllowedValuesTemplate_Range() {
        return (EReference)tAllowedValuesTemplateEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTAllowedValuesTemplate_UniqueID() {
        return (EAttribute)tAllowedValuesTemplateEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTApplicationLayers() {
        return tApplicationLayersEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTApplicationLayers_Identity() {
        return (EReference)tApplicationLayersEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTApplicationLayers_DataTypeList() {
        return (EReference)tApplicationLayersEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTApplicationLayers_ObjectList() {
        return (EReference)tApplicationLayersEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTApplicationLayers_DynamicChannels() {
        return (EReference)tApplicationLayersEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTApplicationLayers_CommunicationEntityType() {
        return (EAttribute)tApplicationLayersEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTApplicationLayers_ConformanceClass() {
        return (EAttribute)tApplicationLayersEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTApplicationProcess() {
        return tApplicationProcessEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTApplicationProcess_DataTypeList() {
        return (EReference)tApplicationProcessEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTApplicationProcess_FunctionTypeList() {
        return (EReference)tApplicationProcessEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTApplicationProcess_FunctionInstanceList() {
        return (EReference)tApplicationProcessEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTApplicationProcess_TemplateList() {
        return (EReference)tApplicationProcessEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTApplicationProcess_ParameterList() {
        return (EReference)tApplicationProcessEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTApplicationProcess_ParameterGroupList() {
        return (EReference)tApplicationProcessEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTCapabilities() {
        return tCapabilitiesEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTCapabilities_CharacteristicsList() {
        return (EReference)tCapabilitiesEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTCapabilities_StandardComplianceList() {
        return (EReference)tCapabilitiesEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTCNFeatures() {
        return tcnFeaturesEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTCNFeatures_DLLCNFeatureMultiplex() {
        return (EAttribute)tcnFeaturesEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTCNFeatures_DLLCNPResChaining() {
        return (EAttribute)tcnFeaturesEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTCNFeatures_NMTCNSoC2PReq() {
        return (EAttribute)tcnFeaturesEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTCombinedState() {
        return tCombinedStateEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTCombinedState_Group() {
        return (EAttribute)tCombinedStateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTCombinedState_Label() {
        return (EReference)tCombinedStateEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTCombinedState_Description() {
        return (EReference)tCombinedStateEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTCombinedState_LabelRef() {
        return (EReference)tCombinedStateEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTCombinedState_DescriptionRef() {
        return (EReference)tCombinedStateEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTCombinedState_LEDstateRef() {
        return (EReference)tCombinedStateEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTConditionalSupport() {
        return tConditionalSupportEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTConditionalSupport_ParamIDRef() {
        return (EAttribute)tConditionalSupportEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTCount() {
        return tCountEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTCount_Group() {
        return (EAttribute)tCountEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTCount_Label() {
        return (EReference)tCountEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTCount_Description() {
        return (EReference)tCountEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTCount_LabelRef() {
        return (EReference)tCountEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTCount_DescriptionRef() {
        return (EReference)tCountEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTCount_DefaultValue() {
        return (EReference)tCountEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTCount_AllowedValues() {
        return (EReference)tCountEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTCount_Access() {
        return (EAttribute)tCountEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTCount_UniqueID() {
        return (EAttribute)tCountEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTDataTypeIDRef() {
        return tDataTypeIDRefEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTDataTypeIDRef_UniqueIDRef() {
        return (EAttribute)tDataTypeIDRefEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTDataTypeList() {
        return tDataTypeListEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTDataTypeList_Group() {
        return (EAttribute)tDataTypeListEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypeList_Array() {
        return (EReference)tDataTypeListEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypeList_Struct() {
        return (EReference)tDataTypeListEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypeList_Enum() {
        return (EReference)tDataTypeListEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypeList_Derived() {
        return (EReference)tDataTypeListEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTDataTypes() {
        return tDataTypesEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypes_Boolean() {
        return (EReference)tDataTypesEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypes_Integer8() {
        return (EReference)tDataTypesEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypes_Integer16() {
        return (EReference)tDataTypesEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypes_Integer32() {
        return (EReference)tDataTypesEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypes_Integer24() {
        return (EReference)tDataTypesEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypes_Integer40() {
        return (EReference)tDataTypesEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypes_Integer48() {
        return (EReference)tDataTypesEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypes_Integer56() {
        return (EReference)tDataTypesEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypes_Integer64() {
        return (EReference)tDataTypesEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypes_Unsigned8() {
        return (EReference)tDataTypesEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypes_Unsigned16() {
        return (EReference)tDataTypesEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypes_Unsigned32() {
        return (EReference)tDataTypesEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypes_Unsigned24() {
        return (EReference)tDataTypesEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypes_Unsigned40() {
        return (EReference)tDataTypesEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypes_Unsigned48() {
        return (EReference)tDataTypesEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypes_Unsigned56() {
        return (EReference)tDataTypesEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypes_Unsigned64() {
        return (EReference)tDataTypesEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypes_Real32() {
        return (EReference)tDataTypesEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypes_Real64() {
        return (EReference)tDataTypesEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypes_VisibleString() {
        return (EReference)tDataTypesEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypes_OctetString() {
        return (EReference)tDataTypesEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypes_UnicodeString() {
        return (EReference)tDataTypesEClass.getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypes_TimeOfDay() {
        return (EReference)tDataTypesEClass.getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypes_TimeDiff() {
        return (EReference)tDataTypesEClass.getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypes_Domain() {
        return (EReference)tDataTypesEClass.getEStructuralFeatures().get(24);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypes_MACADDRESS() {
        return (EReference)tDataTypesEClass.getEStructuralFeatures().get(25);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypes_IPADDRESS() {
        return (EReference)tDataTypesEClass.getEStructuralFeatures().get(26);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDataTypes_NETTIME() {
        return (EReference)tDataTypesEClass.getEStructuralFeatures().get(27);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTDataTypes_DataType() {
        return (EAttribute)tDataTypesEClass.getEStructuralFeatures().get(28);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTDenotation() {
        return tDenotationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTDenotation_Group() {
        return (EAttribute)tDenotationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDenotation_Label() {
        return (EReference)tDenotationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDenotation_Description() {
        return (EReference)tDenotationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDenotation_LabelRef() {
        return (EReference)tDenotationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDenotation_DescriptionRef() {
        return (EReference)tDenotationEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTDeviceCommissioning() {
        return tDeviceCommissioningEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTDeviceCommissioning_NetworkName() {
        return (EAttribute)tDeviceCommissioningEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTDeviceCommissioning_NodeID() {
        return (EAttribute)tDeviceCommissioningEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTDeviceCommissioning_NodeName() {
        return (EAttribute)tDeviceCommissioningEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTDeviceCommissioning_NodeType() {
        return (EAttribute)tDeviceCommissioningEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTDeviceCommissioning_UsedNetworkInterface() {
        return (EAttribute)tDeviceCommissioningEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTDeviceFamily() {
        return tDeviceFamilyEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTDeviceFamily_Group() {
        return (EAttribute)tDeviceFamilyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDeviceFamily_Label() {
        return (EReference)tDeviceFamilyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDeviceFamily_Description() {
        return (EReference)tDeviceFamilyEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDeviceFamily_LabelRef() {
        return (EReference)tDeviceFamilyEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDeviceFamily_DescriptionRef() {
        return (EReference)tDeviceFamilyEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTDeviceFamily_ReadOnly() {
        return (EAttribute)tDeviceFamilyEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTDeviceFunction() {
        return tDeviceFunctionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDeviceFunction_Capabilities() {
        return (EReference)tDeviceFunctionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDeviceFunction_PicturesList() {
        return (EReference)tDeviceFunctionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDeviceFunction_DictionaryList() {
        return (EReference)tDeviceFunctionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTDeviceIdentity() {
        return tDeviceIdentityEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDeviceIdentity_VendorName() {
        return (EReference)tDeviceIdentityEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDeviceIdentity_VendorID() {
        return (EReference)tDeviceIdentityEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDeviceIdentity_VendorText() {
        return (EReference)tDeviceIdentityEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDeviceIdentity_DeviceFamily() {
        return (EReference)tDeviceIdentityEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDeviceIdentity_ProductFamily() {
        return (EReference)tDeviceIdentityEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDeviceIdentity_ProductName() {
        return (EReference)tDeviceIdentityEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDeviceIdentity_ProductID() {
        return (EReference)tDeviceIdentityEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDeviceIdentity_ProductText() {
        return (EReference)tDeviceIdentityEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDeviceIdentity_OrderNumber() {
        return (EReference)tDeviceIdentityEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDeviceIdentity_Version() {
        return (EReference)tDeviceIdentityEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTDeviceIdentity_BuildDate() {
        return (EAttribute)tDeviceIdentityEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDeviceIdentity_SpecificationRevision() {
        return (EReference)tDeviceIdentityEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDeviceIdentity_InstanceName() {
        return (EReference)tDeviceIdentityEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTDeviceManager() {
        return tDeviceManagerEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDeviceManager_IndicatorList() {
        return (EReference)tDeviceManagerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTDiagnostic() {
        return tDiagnosticEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTDiagnostic_Group() {
        return (EAttribute)tDiagnosticEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDiagnostic_ErrorList() {
        return (EReference)tDiagnosticEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDiagnostic_StaticErrorBitField() {
        return (EReference)tDiagnosticEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTTransportLayers() {
        return tTransportLayersEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTDictionaryList() {
        return tDictionaryListEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDictionaryList_Dictionary() {
        return (EReference)tDictionaryListEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTDynamicChannel() {
        return tDynamicChannelEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTDynamicChannel_AccessType() {
        return (EAttribute)tDynamicChannelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTDynamicChannel_AddressOffset() {
        return (EAttribute)tDynamicChannelEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTDynamicChannel_BitAlignment() {
        return (EAttribute)tDynamicChannelEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTDynamicChannel_DataType() {
        return (EAttribute)tDynamicChannelEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTDynamicChannel_EndIndex() {
        return (EAttribute)tDynamicChannelEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTDynamicChannel_MaxNumber() {
        return (EAttribute)tDynamicChannelEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTDynamicChannel_StartIndex() {
        return (EAttribute)tDynamicChannelEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTEnumValue() {
        return tEnumValueEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTEnumValue_Group() {
        return (EAttribute)tEnumValueEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTEnumValue_Label() {
        return (EReference)tEnumValueEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTEnumValue_Description() {
        return (EReference)tEnumValueEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTEnumValue_LabelRef() {
        return (EReference)tEnumValueEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTEnumValue_DescriptionRef() {
        return (EReference)tEnumValueEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTEnumValue_Value() {
        return (EAttribute)tEnumValueEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTextEntryType() {
        return textEntryTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTextEntryType_Value() {
        return (EAttribute)textEntryTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTextEntryType_TextID() {
        return (EAttribute)textEntryTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTextResourceType() {
        return textResourceTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTextResourceType_TextEntry() {
        return (EReference)textResourceTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTextResourceType_Lang() {
        return (EAttribute)textResourceTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTFunctionInstanceList() {
        return tFunctionInstanceListEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTFunctionInstanceList_FunctionInstance() {
        return (EReference)tFunctionInstanceListEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTFunctionInstanceList_Connection() {
        return (EReference)tFunctionInstanceListEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTFunctionTypeList() {
        return tFunctionTypeListEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTFunctionTypeList_FunctionType() {
        return (EReference)tFunctionTypeListEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTGeneralFeatures() {
        return tGeneralFeaturesEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_CFMConfigManager() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_DLLErrBadPhysMode() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_DLLErrMacBuffer() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_DLLFeatureCN() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_DLLFeatureMN() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_NMTBootTimeNotActive() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_NMTCycleTimeGranularity() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_NMTCycleTimeMax() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_NMTCycleTimeMin() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_NMTEmergencyQueueSize() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_NMTErrorEntries() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_NMTFlushArpEntry() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_NMTMaxCNNodeID() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_NMTMaxCNNumber() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_NMTMaxHeartbeats() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_NMTMinRedCycleTime() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_NMTNetHostNameSet() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_NMTNodeIDByHW() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_NMTProductCode() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_NMTPublishActiveNodes() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_NMTPublishConfigNodes() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_NMTPublishEmergencyNew() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_NMTPublishNodeState() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_NMTPublishOperational() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_NMTPublishPreOp1() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(24);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_NMTPublishPreOp2() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(25);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_NMTPublishReadyToOp() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(26);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_NMTPublishStopped() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(27);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_NMTPublishTime() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(28);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_NMTRevisionNo() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(29);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_NWLForward() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(30);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_NWLICMPSupport() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(31);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_NWLIPSupport() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(32);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_PDOGranularity() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(33);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_PDOMaxDescrMem() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(34);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_PDORPDOChannelObjects() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(35);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_PDORPDOChannels() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(36);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_PDORPDOCycleDataLim() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(37);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_PDORPDOOverallObjects() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(38);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_PDOSelfReceipt() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(39);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_PDOTPDOChannelObjects() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(40);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_PDOTPDOCycleDataLim() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(41);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_PDOTPDOOverallObjects() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(42);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_PHYExtEPLPorts() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(43);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_PHYHubDelay() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(44);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_PHYHubIntegrated() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(45);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_PHYHubJitter() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(46);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_RT1RT1SecuritySupport() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(47);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_RT1RT1Support() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(48);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_RT2RT2Support() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(49);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_SDOClient() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(50);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_SDOCmdFileRead() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(51);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_SDOCmdFileWrite() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(52);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_SDOCmdLinkName() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(53);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_SDOCmdReadAllByIndex() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(54);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_SDOCmdReadByName() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(55);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_SDOCmdReadMultParam() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(56);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_SDOCmdWriteAllByIndex() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(57);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_SDOCmdWriteByName() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(58);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_SDOCmdWriteMultParam() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(59);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_SDOMaxConnections() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(60);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_SDOMaxParallelConnections() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(61);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_SDOSeqLayerTxHistorySize() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(62);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTGeneralFeatures_SDOServer() {
        return (EAttribute)tGeneralFeaturesEClass.getEStructuralFeatures().get(63);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTIndicatorList() {
        return tIndicatorListEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTIndicatorList_LEDList() {
        return (EReference)tIndicatorListEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTLED() {
        return tledEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTLED_Group() {
        return (EAttribute)tledEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTLED_Label() {
        return (EReference)tledEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTLED_Description() {
        return (EReference)tledEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTLED_LabelRef() {
        return (EReference)tledEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTLED_DescriptionRef() {
        return (EReference)tledEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTLED_LEDstate() {
        return (EReference)tledEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTLED_LEDcolors() {
        return (EAttribute)tledEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTLED_LEDtype() {
        return (EAttribute)tledEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTMNFeatures() {
        return tmnFeaturesEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTMNFeatures_DLLErrMNMultipleMN() {
        return (EAttribute)tmnFeaturesEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTMNFeatures_DLLMNFeatureMultiplex() {
        return (EAttribute)tmnFeaturesEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTMNFeatures_DLLMNFeaturePResTx() {
        return (EAttribute)tmnFeaturesEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTMNFeatures_DLLMNPResChaining() {
        return (EAttribute)tmnFeaturesEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTMNFeatures_NMTMNASnd2SoC() {
        return (EAttribute)tmnFeaturesEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTMNFeatures_NMTMNBasicEthernet() {
        return (EAttribute)tmnFeaturesEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTMNFeatures_NMTMNMultiplCycMax() {
        return (EAttribute)tmnFeaturesEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTMNFeatures_NMTMNPRes2PReq() {
        return (EAttribute)tmnFeaturesEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTMNFeatures_NMTMNPRes2PRes() {
        return (EAttribute)tmnFeaturesEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTMNFeatures_NMTMNPResRx2SoA() {
        return (EAttribute)tmnFeaturesEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTMNFeatures_NMTMNPResTx2SoA() {
        return (EAttribute)tmnFeaturesEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTMNFeatures_NMTMNSoA2ASndTx() {
        return (EAttribute)tmnFeaturesEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTMNFeatures_NMTMNSoC2PReq() {
        return (EAttribute)tmnFeaturesEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTMNFeatures_NMTNetTime() {
        return (EAttribute)tmnFeaturesEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTMNFeatures_NMTNetTimeIsRealTime() {
        return (EAttribute)tmnFeaturesEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTMNFeatures_NMTRelativeTime() {
        return (EAttribute)tmnFeaturesEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTMNFeatures_NMTSimpleBoot() {
        return (EAttribute)tmnFeaturesEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTMNFeatures_PDOTPDOChannels() {
        return (EAttribute)tmnFeaturesEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTNetworkManagement() {
        return tNetworkManagementEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTNetworkManagement_GeneralFeatures() {
        return (EReference)tNetworkManagementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTNetworkManagement_MNFeatures() {
        return (EReference)tNetworkManagementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTNetworkManagement_CNFeatures() {
        return (EReference)tNetworkManagementEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTNetworkManagement_DeviceCommissioning() {
        return (EReference)tNetworkManagementEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTNetworkManagement_Diagnostic() {
        return (EReference)tNetworkManagementEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTObject() {
        return tObjectEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTObject_SubObject() {
        return (EReference)tObjectEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTObject_AccessType() {
        return (EAttribute)tObjectEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTObject_ActualValue() {
        return (EAttribute)tObjectEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTObject_DataType() {
        return (EAttribute)tObjectEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTObject_DefaultValue() {
        return (EAttribute)tObjectEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTObject_Denotation() {
        return (EAttribute)tObjectEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTObject_HighLimit() {
        return (EAttribute)tObjectEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTObject_Index() {
        return (EAttribute)tObjectEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTObject_LowLimit() {
        return (EAttribute)tObjectEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTObject_Name() {
        return (EAttribute)tObjectEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTObject_ObjectType() {
        return (EAttribute)tObjectEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTObject_ObjFlags() {
        return (EAttribute)tObjectEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTObject_PDOmapping() {
        return (EAttribute)tObjectEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTObject_SubNumber() {
        return (EAttribute)tObjectEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTObject_UniqueIDRef() {
        return (EAttribute)tObjectEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTParameterGroup() {
        return tParameterGroupEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTParameterGroup_Group() {
        return (EAttribute)tParameterGroupEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterGroup_Label() {
        return (EReference)tParameterGroupEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterGroup_Description() {
        return (EReference)tParameterGroupEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterGroup_LabelRef() {
        return (EReference)tParameterGroupEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterGroup_DescriptionRef() {
        return (EReference)tParameterGroupEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterGroup_ParameterGroup() {
        return (EReference)tParameterGroupEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterGroup_ParameterRef() {
        return (EReference)tParameterGroupEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTParameterGroup_KindOfAccess() {
        return (EAttribute)tParameterGroupEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTParameterGroup_UniqueID() {
        return (EAttribute)tParameterGroupEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTParameterGroupList() {
        return tParameterGroupListEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterGroupList_ParameterGroup() {
        return (EReference)tParameterGroupListEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTParameterList() {
        return tParameterListEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterList_Parameter() {
        return (EReference)tParameterListEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTParameterTemplate() {
        return tParameterTemplateEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterTemplate_BOOL() {
        return (EReference)tParameterTemplateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterTemplate_BITSTRING() {
        return (EReference)tParameterTemplateEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterTemplate_BYTE() {
        return (EReference)tParameterTemplateEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterTemplate_CHAR() {
        return (EReference)tParameterTemplateEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterTemplate_WORD() {
        return (EReference)tParameterTemplateEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterTemplate_DWORD() {
        return (EReference)tParameterTemplateEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterTemplate_LWORD() {
        return (EReference)tParameterTemplateEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterTemplate_SINT() {
        return (EReference)tParameterTemplateEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterTemplate_INT() {
        return (EReference)tParameterTemplateEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterTemplate_DINT() {
        return (EReference)tParameterTemplateEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterTemplate_LINT() {
        return (EReference)tParameterTemplateEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterTemplate_USINT() {
        return (EReference)tParameterTemplateEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterTemplate_UINT() {
        return (EReference)tParameterTemplateEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterTemplate_UDINT() {
        return (EReference)tParameterTemplateEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterTemplate_ULINT() {
        return (EReference)tParameterTemplateEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterTemplate_REAL() {
        return (EReference)tParameterTemplateEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterTemplate_LREAL() {
        return (EReference)tParameterTemplateEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterTemplate_STRING() {
        return (EReference)tParameterTemplateEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterTemplate_WSTRING() {
        return (EReference)tParameterTemplateEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterTemplate_DataTypeIDRef() {
        return (EReference)tParameterTemplateEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterTemplate_ConditionalSupport() {
        return (EReference)tParameterTemplateEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterTemplate_ActualValue() {
        return (EReference)tParameterTemplateEClass.getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterTemplate_DefaultValue() {
        return (EReference)tParameterTemplateEClass.getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterTemplate_SubstituteValue() {
        return (EReference)tParameterTemplateEClass.getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterTemplate_AllowedValues() {
        return (EReference)tParameterTemplateEClass.getEStructuralFeatures().get(24);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterTemplate_Unit() {
        return (EReference)tParameterTemplateEClass.getEStructuralFeatures().get(25);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTParameterTemplate_Property() {
        return (EReference)tParameterTemplateEClass.getEStructuralFeatures().get(26);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTParameterTemplate_Access() {
        return (EAttribute)tParameterTemplateEClass.getEStructuralFeatures().get(27);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTParameterTemplate_AccessList() {
        return (EAttribute)tParameterTemplateEClass.getEStructuralFeatures().get(28);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTParameterTemplate_Multiplier() {
        return (EAttribute)tParameterTemplateEClass.getEStructuralFeatures().get(29);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTParameterTemplate_Offset() {
        return (EAttribute)tParameterTemplateEClass.getEStructuralFeatures().get(30);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTParameterTemplate_Persistent() {
        return (EAttribute)tParameterTemplateEClass.getEStructuralFeatures().get(31);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTParameterTemplate_Support() {
        return (EAttribute)tParameterTemplateEClass.getEStructuralFeatures().get(32);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTParameterTemplate_TemplateIDRef() {
        return (EAttribute)tParameterTemplateEClass.getEStructuralFeatures().get(33);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTParameterTemplate_UniqueID() {
        return (EAttribute)tParameterTemplateEClass.getEStructuralFeatures().get(34);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTPicturesList() {
        return tPicturesListEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTPicturesList_Picture() {
        return (EReference)tPicturesListEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTProductID() {
        return tProductIDEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTProductID_Value() {
        return (EAttribute)tProductIDEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTProductID_ReadOnly() {
        return (EAttribute)tProductIDEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTProperty() {
        return tPropertyEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTProperty_Name() {
        return (EAttribute)tPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTProperty_Value() {
        return (EAttribute)tPropertyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTRange() {
        return tRangeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTRange_MinValue() {
        return (EReference)tRangeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTRange_MaxValue() {
        return (EReference)tRangeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTRange_Step() {
        return (EReference)tRangeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTSpecificationRevision() {
        return tSpecificationRevisionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTSpecificationRevision_Value() {
        return (EAttribute)tSpecificationRevisionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTSpecificationRevision_ReadOnly() {
        return (EAttribute)tSpecificationRevisionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTSubrange() {
        return tSubrangeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTSubrange_LowerLimit() {
        return (EAttribute)tSubrangeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTSubrange_UpperLimit() {
        return (EAttribute)tSubrangeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTTemplateList() {
        return tTemplateListEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTTemplateList_ParameterTemplate() {
        return (EReference)tTemplateListEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTTemplateList_AllowedValuesTemplate() {
        return (EReference)tTemplateListEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTUnit() {
        return tUnitEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTUnit_Group() {
        return (EAttribute)tUnitEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTUnit_Label() {
        return (EReference)tUnitEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTUnit_Description() {
        return (EReference)tUnitEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTUnit_LabelRef() {
        return (EReference)tUnitEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTUnit_DescriptionRef() {
        return (EReference)tUnitEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTUnit_Multiplier() {
        return (EAttribute)tUnitEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTUnit_UnitURI() {
        return (EAttribute)tUnitEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTValue() {
        return tValueEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTValue_Group() {
        return (EAttribute)tValueEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTValue_Label() {
        return (EReference)tValueEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTValue_Description() {
        return (EReference)tValueEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTValue_LabelRef() {
        return (EReference)tValueEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTValue_DescriptionRef() {
        return (EReference)tValueEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTValue_Multiplier() {
        return (EAttribute)tValueEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTValue_Offset() {
        return (EAttribute)tValueEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTValue_Value() {
        return (EAttribute)tValueEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTVarDeclaration() {
        return tVarDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTVarDeclaration_Group() {
        return (EAttribute)tVarDeclarationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTVarDeclaration_Label() {
        return (EReference)tVarDeclarationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTVarDeclaration_Description() {
        return (EReference)tVarDeclarationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTVarDeclaration_LabelRef() {
        return (EReference)tVarDeclarationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTVarDeclaration_DescriptionRef() {
        return (EReference)tVarDeclarationEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTVarDeclaration_BOOL() {
        return (EReference)tVarDeclarationEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTVarDeclaration_BITSTRING() {
        return (EReference)tVarDeclarationEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTVarDeclaration_BYTE() {
        return (EReference)tVarDeclarationEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTVarDeclaration_CHAR() {
        return (EReference)tVarDeclarationEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTVarDeclaration_WORD() {
        return (EReference)tVarDeclarationEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTVarDeclaration_DWORD() {
        return (EReference)tVarDeclarationEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTVarDeclaration_LWORD() {
        return (EReference)tVarDeclarationEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTVarDeclaration_SINT() {
        return (EReference)tVarDeclarationEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTVarDeclaration_INT() {
        return (EReference)tVarDeclarationEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTVarDeclaration_DINT() {
        return (EReference)tVarDeclarationEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTVarDeclaration_LINT() {
        return (EReference)tVarDeclarationEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTVarDeclaration_USINT() {
        return (EReference)tVarDeclarationEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTVarDeclaration_UINT() {
        return (EReference)tVarDeclarationEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTVarDeclaration_UDINT() {
        return (EReference)tVarDeclarationEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTVarDeclaration_ULINT() {
        return (EReference)tVarDeclarationEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTVarDeclaration_REAL() {
        return (EReference)tVarDeclarationEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTVarDeclaration_LREAL() {
        return (EReference)tVarDeclarationEClass.getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTVarDeclaration_STRING() {
        return (EReference)tVarDeclarationEClass.getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTVarDeclaration_WSTRING() {
        return (EReference)tVarDeclarationEClass.getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTVarDeclaration_DataTypeIDRef() {
        return (EReference)tVarDeclarationEClass.getEStructuralFeatures().get(24);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTVarDeclaration_InitialValue() {
        return (EAttribute)tVarDeclarationEClass.getEStructuralFeatures().get(25);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTVarDeclaration_Name() {
        return (EAttribute)tVarDeclarationEClass.getEStructuralFeatures().get(26);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTVarDeclaration_Size() {
        return (EAttribute)tVarDeclarationEClass.getEStructuralFeatures().get(27);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTVarDeclaration_UniqueID() {
        return (EAttribute)tVarDeclarationEClass.getEStructuralFeatures().get(28);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTVariableRef() {
        return tVariableRefEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTVariableRef_InstanceIDRef() {
        return (EReference)tVariableRefEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTVariableRef_VariableIDRef() {
        return (EReference)tVariableRefEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTVariableRef_MemberRef() {
        return (EReference)tVariableRefEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTVariableRef_Position() {
        return (EAttribute)tVariableRefEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTVendorID() {
        return tVendorIDEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTVendorID_Value() {
        return (EAttribute)tVendorIDEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTVendorID_ReadOnly() {
        return (EAttribute)tVendorIDEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTVersion() {
        return tVersionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTVersion_Value() {
        return (EAttribute)tVersionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTVersion_ReadOnly() {
        return (EAttribute)tVersionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTVersion_VersionType() {
        return (EAttribute)tVersionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getValueType() {
        return valueTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getValueType_Group() {
        return (EAttribute)valueTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getValueType_Label() {
        return (EReference)valueTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getValueType_Description() {
        return (EReference)valueTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getValueType_LabelRef() {
        return (EReference)valueTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getValueType_DescriptionRef() {
        return (EReference)valueTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getValueType_Name() {
        return (EAttribute)valueTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getValueType_Value() {
        return (EAttribute)valueTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getVariableIDRefType() {
        return variableIDRefTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVariableIDRefType_UniqueIDRef() {
        return (EAttribute)variableIDRefTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getVendorNameType() {
        return vendorNameTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVendorNameType_Value() {
        return (EAttribute)vendorNameTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVendorNameType_ReadOnly() {
        return (EAttribute)vendorNameTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getVendorTextType() {
        return vendorTextTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVendorTextType_Group() {
        return (EAttribute)vendorTextTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getVendorTextType_Label() {
        return (EReference)vendorTextTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getVendorTextType_Description() {
        return (EReference)vendorTextTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getVendorTextType_LabelRef() {
        return (EReference)vendorTextTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getVendorTextType_DescriptionRef() {
        return (EReference)vendorTextTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVendorTextType_ReadOnly() {
        return (EAttribute)vendorTextTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getVersionInfoType() {
        return versionInfoTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVersionInfoType_Group() {
        return (EAttribute)versionInfoTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getVersionInfoType_Label() {
        return (EReference)versionInfoTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getVersionInfoType_Description() {
        return (EReference)versionInfoTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getVersionInfoType_LabelRef() {
        return (EReference)versionInfoTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getVersionInfoType_DescriptionRef() {
        return (EReference)versionInfoTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVersionInfoType_Author() {
        return (EAttribute)versionInfoTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVersionInfoType_Date() {
        return (EAttribute)versionInfoTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVersionInfoType_Organization() {
        return (EAttribute)versionInfoTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVersionInfoType_Version() {
        return (EAttribute)versionInfoTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getAccessType() {
        return accessTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getAccessType1() {
        return accessType1EEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getAccessTypeType() {
        return accessTypeTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDeviceClassType() {
        return deviceClassTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getIASInterfaceDataTypeMember0() {
        return iasInterfaceDataTypeMember0EEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getLEDcolorsType() {
        return leDcolorsTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getLEDcolorType() {
        return leDcolorTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getLEDtypeType() {
        return leDtypeTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getNodeTypeType() {
        return nodeTypeTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getProfileClassIDDataType() {
        return profileClassIDDataTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getRangeType() {
        return rangeTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getStateType() {
        return stateTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getSupportType() {
        return supportTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getTObjectAccessType() {
        return tObjectAccessTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getTObjectPDOMapping() {
        return tObjectPDOMappingEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getVersionTypeType() {
        return versionTypeTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EDataType getAccessListType() {
        return accessListTypeEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EDataType getAccessTypeObject() {
        return accessTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EDataType getAccessTypeObject1() {
        return accessTypeObject1EDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EDataType getAccessTypeTypeObject() {
        return accessTypeTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EDataType getDeviceClassTypeObject() {
        return deviceClassTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EDataType getIASInterfaceDataType() {
        return iasInterfaceDataTypeEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EDataType getIASInterfaceDataTypeMember0Object() {
        return iasInterfaceDataTypeMember0ObjectEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EDataType getIASInterfaceDataTypeMember1() {
        return iasInterfaceDataTypeMember1EDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EDataType getLEDcolorsTypeObject() {
        return leDcolorsTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EDataType getLEDcolorTypeObject() {
        return leDcolorTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EDataType getLEDtypeTypeObject() {
        return leDtypeTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EDataType getNodeTypeTypeObject() {
        return nodeTypeTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EDataType getOffsetType() {
        return offsetTypeEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EDataType getProfileClassIDDataTypeObject() {
        return profileClassIDDataTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EDataType getRangeTypeObject() {
        return rangeTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EDataType getStateTypeObject() {
        return stateTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EDataType getSupportedLanguagesType() {
        return supportedLanguagesTypeEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EDataType getSupportTypeObject() {
        return supportTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTObjectAccessTypeObject() {
        return tObjectAccessTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTObjectPDOMappingObject() {
        return tObjectPDOMappingObjectEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EDataType getVersionTypeTypeObject() {
        return versionTypeTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public XDDFactory getXDDFactory() {
        return (XDDFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        addInfoTypeEClass = createEClass(ADD_INFO_TYPE);
        createEAttribute(addInfoTypeEClass, ADD_INFO_TYPE__GROUP);
        createEReference(addInfoTypeEClass, ADD_INFO_TYPE__LABEL);
        createEReference(addInfoTypeEClass, ADD_INFO_TYPE__DESCRIPTION);
        createEReference(addInfoTypeEClass, ADD_INFO_TYPE__LABEL_REF);
        createEReference(addInfoTypeEClass, ADD_INFO_TYPE__DESCRIPTION_REF);
        createEReference(addInfoTypeEClass, ADD_INFO_TYPE__VALUE);
        createEAttribute(addInfoTypeEClass, ADD_INFO_TYPE__BIT_OFFSET);
        createEAttribute(addInfoTypeEClass, ADD_INFO_TYPE__LEN);
        createEAttribute(addInfoTypeEClass, ADD_INFO_TYPE__NAME);

        arrayTypeEClass = createEClass(ARRAY_TYPE);
        createEAttribute(arrayTypeEClass, ARRAY_TYPE__GROUP);
        createEReference(arrayTypeEClass, ARRAY_TYPE__LABEL);
        createEReference(arrayTypeEClass, ARRAY_TYPE__DESCRIPTION);
        createEReference(arrayTypeEClass, ARRAY_TYPE__LABEL_REF);
        createEReference(arrayTypeEClass, ARRAY_TYPE__DESCRIPTION_REF);
        createEReference(arrayTypeEClass, ARRAY_TYPE__SUBRANGE);
        createEReference(arrayTypeEClass, ARRAY_TYPE__BOOL);
        createEReference(arrayTypeEClass, ARRAY_TYPE__BITSTRING);
        createEReference(arrayTypeEClass, ARRAY_TYPE__BYTE);
        createEReference(arrayTypeEClass, ARRAY_TYPE__CHAR);
        createEReference(arrayTypeEClass, ARRAY_TYPE__WORD);
        createEReference(arrayTypeEClass, ARRAY_TYPE__DWORD);
        createEReference(arrayTypeEClass, ARRAY_TYPE__LWORD);
        createEReference(arrayTypeEClass, ARRAY_TYPE__SINT);
        createEReference(arrayTypeEClass, ARRAY_TYPE__INT);
        createEReference(arrayTypeEClass, ARRAY_TYPE__DINT);
        createEReference(arrayTypeEClass, ARRAY_TYPE__LINT);
        createEReference(arrayTypeEClass, ARRAY_TYPE__USINT);
        createEReference(arrayTypeEClass, ARRAY_TYPE__UINT);
        createEReference(arrayTypeEClass, ARRAY_TYPE__UDINT);
        createEReference(arrayTypeEClass, ARRAY_TYPE__ULINT);
        createEReference(arrayTypeEClass, ARRAY_TYPE__REAL);
        createEReference(arrayTypeEClass, ARRAY_TYPE__LREAL);
        createEReference(arrayTypeEClass, ARRAY_TYPE__STRING);
        createEReference(arrayTypeEClass, ARRAY_TYPE__WSTRING);
        createEReference(arrayTypeEClass, ARRAY_TYPE__DATA_TYPE_ID_REF);
        createEAttribute(arrayTypeEClass, ARRAY_TYPE__NAME);
        createEAttribute(arrayTypeEClass, ARRAY_TYPE__UNIQUE_ID);

        categoryTypeEClass = createEClass(CATEGORY_TYPE);
        createEAttribute(categoryTypeEClass, CATEGORY_TYPE__GROUP);
        createEReference(categoryTypeEClass, CATEGORY_TYPE__LABEL);
        createEReference(categoryTypeEClass, CATEGORY_TYPE__DESCRIPTION);
        createEReference(categoryTypeEClass, CATEGORY_TYPE__LABEL_REF);
        createEReference(categoryTypeEClass, CATEGORY_TYPE__DESCRIPTION_REF);

        characteristicContentTypeEClass = createEClass(CHARACTERISTIC_CONTENT_TYPE);
        createEAttribute(characteristicContentTypeEClass, CHARACTERISTIC_CONTENT_TYPE__GROUP);
        createEReference(characteristicContentTypeEClass, CHARACTERISTIC_CONTENT_TYPE__LABEL);
        createEReference(characteristicContentTypeEClass, CHARACTERISTIC_CONTENT_TYPE__DESCRIPTION);
        createEReference(characteristicContentTypeEClass, CHARACTERISTIC_CONTENT_TYPE__LABEL_REF);
        createEReference(characteristicContentTypeEClass, CHARACTERISTIC_CONTENT_TYPE__DESCRIPTION_REF);

        characteristicNameTypeEClass = createEClass(CHARACTERISTIC_NAME_TYPE);
        createEAttribute(characteristicNameTypeEClass, CHARACTERISTIC_NAME_TYPE__GROUP);
        createEReference(characteristicNameTypeEClass, CHARACTERISTIC_NAME_TYPE__LABEL);
        createEReference(characteristicNameTypeEClass, CHARACTERISTIC_NAME_TYPE__DESCRIPTION);
        createEReference(characteristicNameTypeEClass, CHARACTERISTIC_NAME_TYPE__LABEL_REF);
        createEReference(characteristicNameTypeEClass, CHARACTERISTIC_NAME_TYPE__DESCRIPTION_REF);

        characteristicsListTypeEClass = createEClass(CHARACTERISTICS_LIST_TYPE);
        createEReference(characteristicsListTypeEClass, CHARACTERISTICS_LIST_TYPE__CATEGORY);
        createEReference(characteristicsListTypeEClass, CHARACTERISTICS_LIST_TYPE__CHARACTERISTIC);

        characteristicTypeEClass = createEClass(CHARACTERISTIC_TYPE);
        createEReference(characteristicTypeEClass, CHARACTERISTIC_TYPE__CHARACTERISTIC_NAME);
        createEReference(characteristicTypeEClass, CHARACTERISTIC_TYPE__CHARACTERISTIC_CONTENT);

        compliantWithTypeEClass = createEClass(COMPLIANT_WITH_TYPE);
        createEAttribute(compliantWithTypeEClass, COMPLIANT_WITH_TYPE__GROUP);
        createEReference(compliantWithTypeEClass, COMPLIANT_WITH_TYPE__LABEL);
        createEReference(compliantWithTypeEClass, COMPLIANT_WITH_TYPE__DESCRIPTION);
        createEReference(compliantWithTypeEClass, COMPLIANT_WITH_TYPE__LABEL_REF);
        createEReference(compliantWithTypeEClass, COMPLIANT_WITH_TYPE__DESCRIPTION_REF);
        createEAttribute(compliantWithTypeEClass, COMPLIANT_WITH_TYPE__NAME);
        createEAttribute(compliantWithTypeEClass, COMPLIANT_WITH_TYPE__RANGE);

        configVarsTypeEClass = createEClass(CONFIG_VARS_TYPE);
        createEReference(configVarsTypeEClass, CONFIG_VARS_TYPE__VAR_DECLARATION);

        connectionTypeEClass = createEClass(CONNECTION_TYPE);
        createEAttribute(connectionTypeEClass, CONNECTION_TYPE__DESCRIPTION);
        createEAttribute(connectionTypeEClass, CONNECTION_TYPE__DESTINATION);
        createEAttribute(connectionTypeEClass, CONNECTION_TYPE__SOURCE);

        dataTypeListTypeEClass = createEClass(DATA_TYPE_LIST_TYPE);
        createEReference(dataTypeListTypeEClass, DATA_TYPE_LIST_TYPE__DEF_TYPE);

        derivedTypeEClass = createEClass(DERIVED_TYPE);
        createEAttribute(derivedTypeEClass, DERIVED_TYPE__GROUP);
        createEReference(derivedTypeEClass, DERIVED_TYPE__LABEL);
        createEReference(derivedTypeEClass, DERIVED_TYPE__DESCRIPTION);
        createEReference(derivedTypeEClass, DERIVED_TYPE__LABEL_REF);
        createEReference(derivedTypeEClass, DERIVED_TYPE__DESCRIPTION_REF);
        createEReference(derivedTypeEClass, DERIVED_TYPE__COUNT);
        createEReference(derivedTypeEClass, DERIVED_TYPE__BOOL);
        createEReference(derivedTypeEClass, DERIVED_TYPE__BITSTRING);
        createEReference(derivedTypeEClass, DERIVED_TYPE__BYTE);
        createEReference(derivedTypeEClass, DERIVED_TYPE__CHAR);
        createEReference(derivedTypeEClass, DERIVED_TYPE__WORD);
        createEReference(derivedTypeEClass, DERIVED_TYPE__DWORD);
        createEReference(derivedTypeEClass, DERIVED_TYPE__LWORD);
        createEReference(derivedTypeEClass, DERIVED_TYPE__SINT);
        createEReference(derivedTypeEClass, DERIVED_TYPE__INT);
        createEReference(derivedTypeEClass, DERIVED_TYPE__DINT);
        createEReference(derivedTypeEClass, DERIVED_TYPE__LINT);
        createEReference(derivedTypeEClass, DERIVED_TYPE__USINT);
        createEReference(derivedTypeEClass, DERIVED_TYPE__UINT);
        createEReference(derivedTypeEClass, DERIVED_TYPE__UDINT);
        createEReference(derivedTypeEClass, DERIVED_TYPE__ULINT);
        createEReference(derivedTypeEClass, DERIVED_TYPE__REAL);
        createEReference(derivedTypeEClass, DERIVED_TYPE__LREAL);
        createEReference(derivedTypeEClass, DERIVED_TYPE__STRING);
        createEReference(derivedTypeEClass, DERIVED_TYPE__WSTRING);
        createEReference(derivedTypeEClass, DERIVED_TYPE__DATA_TYPE_ID_REF);
        createEAttribute(derivedTypeEClass, DERIVED_TYPE__DESCRIPTION1);
        createEAttribute(derivedTypeEClass, DERIVED_TYPE__NAME);
        createEAttribute(derivedTypeEClass, DERIVED_TYPE__UNIQUE_ID);

        descriptionRefTypeEClass = createEClass(DESCRIPTION_REF_TYPE);
        createEAttribute(descriptionRefTypeEClass, DESCRIPTION_REF_TYPE__VALUE);
        createEAttribute(descriptionRefTypeEClass, DESCRIPTION_REF_TYPE__DICT_ID);
        createEAttribute(descriptionRefTypeEClass, DESCRIPTION_REF_TYPE__TEXT_ID);

        descriptionTypeEClass = createEClass(DESCRIPTION_TYPE);
        createEAttribute(descriptionTypeEClass, DESCRIPTION_TYPE__VALUE);
        createEAttribute(descriptionTypeEClass, DESCRIPTION_TYPE__LANG);
        createEAttribute(descriptionTypeEClass, DESCRIPTION_TYPE__URI);

        dictionaryTypeEClass = createEClass(DICTIONARY_TYPE);
        createEReference(dictionaryTypeEClass, DICTIONARY_TYPE__FILE);
        createEAttribute(dictionaryTypeEClass, DICTIONARY_TYPE__DICT_ID);
        createEAttribute(dictionaryTypeEClass, DICTIONARY_TYPE__LANG);

        documentRootEClass = createEClass(DOCUMENT_ROOT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__ISO15745_PROFILE_CONTAINER);

        dynamicChannelsTypeEClass = createEClass(DYNAMIC_CHANNELS_TYPE);
        createEReference(dynamicChannelsTypeEClass, DYNAMIC_CHANNELS_TYPE__DYNAMIC_CHANNEL);

        enumTypeEClass = createEClass(ENUM_TYPE);
        createEAttribute(enumTypeEClass, ENUM_TYPE__GROUP);
        createEReference(enumTypeEClass, ENUM_TYPE__LABEL);
        createEReference(enumTypeEClass, ENUM_TYPE__DESCRIPTION);
        createEReference(enumTypeEClass, ENUM_TYPE__LABEL_REF);
        createEReference(enumTypeEClass, ENUM_TYPE__DESCRIPTION_REF);
        createEReference(enumTypeEClass, ENUM_TYPE__ENUM_VALUE);
        createEReference(enumTypeEClass, ENUM_TYPE__BOOL);
        createEReference(enumTypeEClass, ENUM_TYPE__BITSTRING);
        createEReference(enumTypeEClass, ENUM_TYPE__BYTE);
        createEReference(enumTypeEClass, ENUM_TYPE__CHAR);
        createEReference(enumTypeEClass, ENUM_TYPE__WORD);
        createEReference(enumTypeEClass, ENUM_TYPE__DWORD);
        createEReference(enumTypeEClass, ENUM_TYPE__LWORD);
        createEReference(enumTypeEClass, ENUM_TYPE__SINT);
        createEReference(enumTypeEClass, ENUM_TYPE__INT);
        createEReference(enumTypeEClass, ENUM_TYPE__DINT);
        createEReference(enumTypeEClass, ENUM_TYPE__LINT);
        createEReference(enumTypeEClass, ENUM_TYPE__USINT);
        createEReference(enumTypeEClass, ENUM_TYPE__UINT);
        createEReference(enumTypeEClass, ENUM_TYPE__UDINT);
        createEReference(enumTypeEClass, ENUM_TYPE__ULINT);
        createEReference(enumTypeEClass, ENUM_TYPE__REAL);
        createEReference(enumTypeEClass, ENUM_TYPE__LREAL);
        createEReference(enumTypeEClass, ENUM_TYPE__STRING);
        createEReference(enumTypeEClass, ENUM_TYPE__WSTRING);
        createEAttribute(enumTypeEClass, ENUM_TYPE__NAME);
        createEAttribute(enumTypeEClass, ENUM_TYPE__SIZE);
        createEAttribute(enumTypeEClass, ENUM_TYPE__UNIQUE_ID);

        errorBitDataTypeEClass = createEClass(ERROR_BIT_DATA_TYPE);
        createEAttribute(errorBitDataTypeEClass, ERROR_BIT_DATA_TYPE__GROUP);
        createEReference(errorBitDataTypeEClass, ERROR_BIT_DATA_TYPE__LABEL);
        createEReference(errorBitDataTypeEClass, ERROR_BIT_DATA_TYPE__DESCRIPTION);
        createEReference(errorBitDataTypeEClass, ERROR_BIT_DATA_TYPE__LABEL_REF);
        createEReference(errorBitDataTypeEClass, ERROR_BIT_DATA_TYPE__DESCRIPTION_REF);
        createEAttribute(errorBitDataTypeEClass, ERROR_BIT_DATA_TYPE__NAME);
        createEAttribute(errorBitDataTypeEClass, ERROR_BIT_DATA_TYPE__OFFSET);

        errorConstantDataTypeEClass = createEClass(ERROR_CONSTANT_DATA_TYPE);
        createEAttribute(errorConstantDataTypeEClass, ERROR_CONSTANT_DATA_TYPE__GROUP);
        createEReference(errorConstantDataTypeEClass, ERROR_CONSTANT_DATA_TYPE__LABEL);
        createEReference(errorConstantDataTypeEClass, ERROR_CONSTANT_DATA_TYPE__DESCRIPTION);
        createEReference(errorConstantDataTypeEClass, ERROR_CONSTANT_DATA_TYPE__LABEL_REF);
        createEReference(errorConstantDataTypeEClass, ERROR_CONSTANT_DATA_TYPE__DESCRIPTION_REF);
        createEReference(errorConstantDataTypeEClass, ERROR_CONSTANT_DATA_TYPE__ADD_INFO);
        createEAttribute(errorConstantDataTypeEClass, ERROR_CONSTANT_DATA_TYPE__NAME);
        createEAttribute(errorConstantDataTypeEClass, ERROR_CONSTANT_DATA_TYPE__VALUE);

        errorListTypeEClass = createEClass(ERROR_LIST_TYPE);
        createEReference(errorListTypeEClass, ERROR_LIST_TYPE__ERROR);

        fileTypeEClass = createEClass(FILE_TYPE);
        createEAttribute(fileTypeEClass, FILE_TYPE__URI);

        functionInstanceTypeEClass = createEClass(FUNCTION_INSTANCE_TYPE);
        createEAttribute(functionInstanceTypeEClass, FUNCTION_INSTANCE_TYPE__GROUP);
        createEReference(functionInstanceTypeEClass, FUNCTION_INSTANCE_TYPE__LABEL);
        createEReference(functionInstanceTypeEClass, FUNCTION_INSTANCE_TYPE__DESCRIPTION);
        createEReference(functionInstanceTypeEClass, FUNCTION_INSTANCE_TYPE__LABEL_REF);
        createEReference(functionInstanceTypeEClass, FUNCTION_INSTANCE_TYPE__DESCRIPTION_REF);
        createEAttribute(functionInstanceTypeEClass, FUNCTION_INSTANCE_TYPE__NAME);
        createEAttribute(functionInstanceTypeEClass, FUNCTION_INSTANCE_TYPE__TYPE_ID_REF);
        createEAttribute(functionInstanceTypeEClass, FUNCTION_INSTANCE_TYPE__UNIQUE_ID);

        functionTypeTypeEClass = createEClass(FUNCTION_TYPE_TYPE);
        createEAttribute(functionTypeTypeEClass, FUNCTION_TYPE_TYPE__GROUP);
        createEReference(functionTypeTypeEClass, FUNCTION_TYPE_TYPE__LABEL);
        createEReference(functionTypeTypeEClass, FUNCTION_TYPE_TYPE__DESCRIPTION);
        createEReference(functionTypeTypeEClass, FUNCTION_TYPE_TYPE__LABEL_REF);
        createEReference(functionTypeTypeEClass, FUNCTION_TYPE_TYPE__DESCRIPTION_REF);
        createEReference(functionTypeTypeEClass, FUNCTION_TYPE_TYPE__VERSION_INFO);
        createEReference(functionTypeTypeEClass, FUNCTION_TYPE_TYPE__INTERFACE_LIST);
        createEReference(functionTypeTypeEClass, FUNCTION_TYPE_TYPE__FUNCTION_INSTANCE_LIST);
        createEAttribute(functionTypeTypeEClass, FUNCTION_TYPE_TYPE__NAME);
        createEAttribute(functionTypeTypeEClass, FUNCTION_TYPE_TYPE__PACKAGE);
        createEAttribute(functionTypeTypeEClass, FUNCTION_TYPE_TYPE__UNIQUE_ID);

        identityTypeEClass = createEClass(IDENTITY_TYPE);
        createEReference(identityTypeEClass, IDENTITY_TYPE__VENDOR_ID);
        createEReference(identityTypeEClass, IDENTITY_TYPE__DEVICE_FAMILY);
        createEReference(identityTypeEClass, IDENTITY_TYPE__PRODUCT_ID);
        createEReference(identityTypeEClass, IDENTITY_TYPE__VERSION);
        createEAttribute(identityTypeEClass, IDENTITY_TYPE__BUILD_DATE);
        createEReference(identityTypeEClass, IDENTITY_TYPE__SPECIFICATION_REVISION);

        inputVarsTypeEClass = createEClass(INPUT_VARS_TYPE);
        createEReference(inputVarsTypeEClass, INPUT_VARS_TYPE__VAR_DECLARATION);

        instanceIDRefTypeEClass = createEClass(INSTANCE_ID_REF_TYPE);
        createEAttribute(instanceIDRefTypeEClass, INSTANCE_ID_REF_TYPE__UNIQUE_ID_REF);

        instanceNameTypeEClass = createEClass(INSTANCE_NAME_TYPE);
        createEAttribute(instanceNameTypeEClass, INSTANCE_NAME_TYPE__VALUE);
        createEAttribute(instanceNameTypeEClass, INSTANCE_NAME_TYPE__READ_ONLY);

        interfaceListTypeEClass = createEClass(INTERFACE_LIST_TYPE);
        createEReference(interfaceListTypeEClass, INTERFACE_LIST_TYPE__INPUT_VARS);
        createEReference(interfaceListTypeEClass, INTERFACE_LIST_TYPE__OUTPUT_VARS);
        createEReference(interfaceListTypeEClass, INTERFACE_LIST_TYPE__CONFIG_VARS);

        iso15745ProfileContainerTypeEClass = createEClass(ISO15745_PROFILE_CONTAINER_TYPE);
        createEReference(iso15745ProfileContainerTypeEClass, ISO15745_PROFILE_CONTAINER_TYPE__ISO15745_PROFILE);

        iso15745ProfileTypeEClass = createEClass(ISO15745_PROFILE_TYPE);
        createEReference(iso15745ProfileTypeEClass, ISO15745_PROFILE_TYPE__PROFILE_HEADER);
        createEReference(iso15745ProfileTypeEClass, ISO15745_PROFILE_TYPE__PROFILE_BODY);

        iso15745ReferenceDataTypeEClass = createEClass(ISO15745_REFERENCE_DATA_TYPE);
        createEAttribute(iso15745ReferenceDataTypeEClass, ISO15745_REFERENCE_DATA_TYPE__ISO15745_PART);
        createEAttribute(iso15745ReferenceDataTypeEClass, ISO15745_REFERENCE_DATA_TYPE__ISO15745_EDITION);
        createEAttribute(iso15745ReferenceDataTypeEClass, ISO15745_REFERENCE_DATA_TYPE__PROFILE_TECHNOLOGY);

        labelRefTypeEClass = createEClass(LABEL_REF_TYPE);
        createEAttribute(labelRefTypeEClass, LABEL_REF_TYPE__VALUE);
        createEAttribute(labelRefTypeEClass, LABEL_REF_TYPE__DICT_ID);
        createEAttribute(labelRefTypeEClass, LABEL_REF_TYPE__TEXT_ID);

        labelTypeEClass = createEClass(LABEL_TYPE);
        createEAttribute(labelTypeEClass, LABEL_TYPE__VALUE);
        createEAttribute(labelTypeEClass, LABEL_TYPE__LANG);

        ledListTypeEClass = createEClass(LED_LIST_TYPE);
        createEReference(ledListTypeEClass, LED_LIST_TYPE__LED);
        createEReference(ledListTypeEClass, LED_LIST_TYPE__COMBINED_STATE);

        leDstateRefTypeEClass = createEClass(LE_DSTATE_REF_TYPE);
        createEAttribute(leDstateRefTypeEClass, LE_DSTATE_REF_TYPE__STATE_ID_REF);

        leDstateTypeEClass = createEClass(LE_DSTATE_TYPE);
        createEAttribute(leDstateTypeEClass, LE_DSTATE_TYPE__GROUP);
        createEReference(leDstateTypeEClass, LE_DSTATE_TYPE__LABEL);
        createEReference(leDstateTypeEClass, LE_DSTATE_TYPE__DESCRIPTION);
        createEReference(leDstateTypeEClass, LE_DSTATE_TYPE__LABEL_REF);
        createEReference(leDstateTypeEClass, LE_DSTATE_TYPE__DESCRIPTION_REF);
        createEAttribute(leDstateTypeEClass, LE_DSTATE_TYPE__FLASHING_PERIOD);
        createEAttribute(leDstateTypeEClass, LE_DSTATE_TYPE__IMPULS_WIDTH);
        createEAttribute(leDstateTypeEClass, LE_DSTATE_TYPE__LE_DCOLOR);
        createEAttribute(leDstateTypeEClass, LE_DSTATE_TYPE__NUMBER_OF_IMPULSES);
        createEAttribute(leDstateTypeEClass, LE_DSTATE_TYPE__STATE);
        createEAttribute(leDstateTypeEClass, LE_DSTATE_TYPE__UNIQUE_ID);

        maxValueTypeEClass = createEClass(MAX_VALUE_TYPE);
        createEAttribute(maxValueTypeEClass, MAX_VALUE_TYPE__GROUP);
        createEReference(maxValueTypeEClass, MAX_VALUE_TYPE__LABEL);
        createEReference(maxValueTypeEClass, MAX_VALUE_TYPE__DESCRIPTION);
        createEReference(maxValueTypeEClass, MAX_VALUE_TYPE__LABEL_REF);
        createEReference(maxValueTypeEClass, MAX_VALUE_TYPE__DESCRIPTION_REF);
        createEAttribute(maxValueTypeEClass, MAX_VALUE_TYPE__MULTIPLIER);
        createEAttribute(maxValueTypeEClass, MAX_VALUE_TYPE__OFFSET);
        createEAttribute(maxValueTypeEClass, MAX_VALUE_TYPE__VALUE);

        memberRefTypeEClass = createEClass(MEMBER_REF_TYPE);
        createEAttribute(memberRefTypeEClass, MEMBER_REF_TYPE__INDEX);
        createEAttribute(memberRefTypeEClass, MEMBER_REF_TYPE__UNIQUE_ID_REF);

        minValueTypeEClass = createEClass(MIN_VALUE_TYPE);
        createEAttribute(minValueTypeEClass, MIN_VALUE_TYPE__GROUP);
        createEReference(minValueTypeEClass, MIN_VALUE_TYPE__LABEL);
        createEReference(minValueTypeEClass, MIN_VALUE_TYPE__DESCRIPTION);
        createEReference(minValueTypeEClass, MIN_VALUE_TYPE__LABEL_REF);
        createEReference(minValueTypeEClass, MIN_VALUE_TYPE__DESCRIPTION_REF);
        createEAttribute(minValueTypeEClass, MIN_VALUE_TYPE__MULTIPLIER);
        createEAttribute(minValueTypeEClass, MIN_VALUE_TYPE__OFFSET);
        createEAttribute(minValueTypeEClass, MIN_VALUE_TYPE__VALUE);

        objectListTypeEClass = createEClass(OBJECT_LIST_TYPE);
        createEReference(objectListTypeEClass, OBJECT_LIST_TYPE__OBJECT);
        createEAttribute(objectListTypeEClass, OBJECT_LIST_TYPE__MANDATORY_OBJECTS);
        createEAttribute(objectListTypeEClass, OBJECT_LIST_TYPE__MANUFACTURER_OBJECTS);
        createEAttribute(objectListTypeEClass, OBJECT_LIST_TYPE__OPTIONAL_OBJECTS);

        orderNumberTypeEClass = createEClass(ORDER_NUMBER_TYPE);
        createEAttribute(orderNumberTypeEClass, ORDER_NUMBER_TYPE__VALUE);
        createEAttribute(orderNumberTypeEClass, ORDER_NUMBER_TYPE__READ_ONLY);

        outputVarsTypeEClass = createEClass(OUTPUT_VARS_TYPE);
        createEReference(outputVarsTypeEClass, OUTPUT_VARS_TYPE__VAR_DECLARATION);

        parameterRefTypeEClass = createEClass(PARAMETER_REF_TYPE);
        createEAttribute(parameterRefTypeEClass, PARAMETER_REF_TYPE__UNIQUE_ID_REF);

        parameterTypeEClass = createEClass(PARAMETER_TYPE);
        createEAttribute(parameterTypeEClass, PARAMETER_TYPE__GROUP);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__LABEL);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__DESCRIPTION);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__LABEL_REF);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__DESCRIPTION_REF);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__BOOL);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__BITSTRING);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__BYTE);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__CHAR);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__WORD);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__DWORD);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__LWORD);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__SINT);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__INT);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__DINT);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__LINT);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__USINT);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__UINT);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__UDINT);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__ULINT);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__REAL);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__LREAL);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__STRING);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__WSTRING);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__DATA_TYPE_ID_REF);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__VARIABLE_REF);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__CONDITIONAL_SUPPORT);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__DENOTATION);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__ACTUAL_VALUE);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__DEFAULT_VALUE);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__SUBSTITUTE_VALUE);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__ALLOWED_VALUES);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__UNIT);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__PROPERTY);
        createEAttribute(parameterTypeEClass, PARAMETER_TYPE__ACCESS);
        createEAttribute(parameterTypeEClass, PARAMETER_TYPE__ACCESS_LIST);
        createEAttribute(parameterTypeEClass, PARAMETER_TYPE__MULTIPLIER);
        createEAttribute(parameterTypeEClass, PARAMETER_TYPE__OFFSET);
        createEAttribute(parameterTypeEClass, PARAMETER_TYPE__PERSISTENT);
        createEAttribute(parameterTypeEClass, PARAMETER_TYPE__SUPPORT);
        createEAttribute(parameterTypeEClass, PARAMETER_TYPE__TEMPLATE_ID_REF);
        createEAttribute(parameterTypeEClass, PARAMETER_TYPE__UNIQUE_ID);

        pictureTypeEClass = createEClass(PICTURE_TYPE);
        createEAttribute(pictureTypeEClass, PICTURE_TYPE__GROUP);
        createEReference(pictureTypeEClass, PICTURE_TYPE__LABEL);
        createEReference(pictureTypeEClass, PICTURE_TYPE__DESCRIPTION);
        createEReference(pictureTypeEClass, PICTURE_TYPE__LABEL_REF);
        createEReference(pictureTypeEClass, PICTURE_TYPE__DESCRIPTION_REF);
        createEAttribute(pictureTypeEClass, PICTURE_TYPE__NUMBER);
        createEAttribute(pictureTypeEClass, PICTURE_TYPE__URI);

        productFamilyTypeEClass = createEClass(PRODUCT_FAMILY_TYPE);
        createEAttribute(productFamilyTypeEClass, PRODUCT_FAMILY_TYPE__VALUE);
        createEAttribute(productFamilyTypeEClass, PRODUCT_FAMILY_TYPE__READ_ONLY);

        productNameTypeEClass = createEClass(PRODUCT_NAME_TYPE);
        createEAttribute(productNameTypeEClass, PRODUCT_NAME_TYPE__VALUE);
        createEAttribute(productNameTypeEClass, PRODUCT_NAME_TYPE__READ_ONLY);

        productTextTypeEClass = createEClass(PRODUCT_TEXT_TYPE);
        createEAttribute(productTextTypeEClass, PRODUCT_TEXT_TYPE__GROUP);
        createEReference(productTextTypeEClass, PRODUCT_TEXT_TYPE__LABEL);
        createEReference(productTextTypeEClass, PRODUCT_TEXT_TYPE__DESCRIPTION);
        createEReference(productTextTypeEClass, PRODUCT_TEXT_TYPE__LABEL_REF);
        createEReference(productTextTypeEClass, PRODUCT_TEXT_TYPE__DESCRIPTION_REF);
        createEAttribute(productTextTypeEClass, PRODUCT_TEXT_TYPE__READ_ONLY);

        profileBodyCommunicationNetworkPowerlinkEClass = createEClass(PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK);
        createEReference(profileBodyCommunicationNetworkPowerlinkEClass, PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__APPLICATION_LAYERS);
        createEReference(profileBodyCommunicationNetworkPowerlinkEClass, PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__TRANSPORT_LAYERS);
        createEReference(profileBodyCommunicationNetworkPowerlinkEClass, PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__NETWORK_MANAGEMENT);
        createEReference(profileBodyCommunicationNetworkPowerlinkEClass, PROFILE_BODY_COMMUNICATION_NETWORK_POWERLINK__EXTERNAL_PROFILE_HANDLE);

        profileBodyDataTypeEClass = createEClass(PROFILE_BODY_DATA_TYPE);
        createEAttribute(profileBodyDataTypeEClass, PROFILE_BODY_DATA_TYPE__FILE_CREATION_DATE);
        createEAttribute(profileBodyDataTypeEClass, PROFILE_BODY_DATA_TYPE__FILE_CREATION_TIME);
        createEAttribute(profileBodyDataTypeEClass, PROFILE_BODY_DATA_TYPE__FILE_CREATOR);
        createEAttribute(profileBodyDataTypeEClass, PROFILE_BODY_DATA_TYPE__FILE_MODIFICATION_DATE);
        createEAttribute(profileBodyDataTypeEClass, PROFILE_BODY_DATA_TYPE__FILE_MODIFICATION_TIME);
        createEAttribute(profileBodyDataTypeEClass, PROFILE_BODY_DATA_TYPE__FILE_MODIFIED_BY);
        createEAttribute(profileBodyDataTypeEClass, PROFILE_BODY_DATA_TYPE__FILE_NAME);
        createEAttribute(profileBodyDataTypeEClass, PROFILE_BODY_DATA_TYPE__FILE_VERSION);
        createEAttribute(profileBodyDataTypeEClass, PROFILE_BODY_DATA_TYPE__FORMAT_NAME);
        createEAttribute(profileBodyDataTypeEClass, PROFILE_BODY_DATA_TYPE__FORMAT_VERSION);
        createEAttribute(profileBodyDataTypeEClass, PROFILE_BODY_DATA_TYPE__SUPPORTED_LANGUAGES);

        profileBodyDevicePowerlinkEClass = createEClass(PROFILE_BODY_DEVICE_POWERLINK);
        createEReference(profileBodyDevicePowerlinkEClass, PROFILE_BODY_DEVICE_POWERLINK__DEVICE_IDENTITY);
        createEReference(profileBodyDevicePowerlinkEClass, PROFILE_BODY_DEVICE_POWERLINK__DEVICE_MANAGER);
        createEReference(profileBodyDevicePowerlinkEClass, PROFILE_BODY_DEVICE_POWERLINK__DEVICE_FUNCTION);
        createEReference(profileBodyDevicePowerlinkEClass, PROFILE_BODY_DEVICE_POWERLINK__APPLICATION_PROCESS);
        createEReference(profileBodyDevicePowerlinkEClass, PROFILE_BODY_DEVICE_POWERLINK__EXTERNAL_PROFILE_HANDLE);
        createEAttribute(profileBodyDevicePowerlinkEClass, PROFILE_BODY_DEVICE_POWERLINK__DEVICE_CLASS);

        profileHandleDataTypeEClass = createEClass(PROFILE_HANDLE_DATA_TYPE);
        createEAttribute(profileHandleDataTypeEClass, PROFILE_HANDLE_DATA_TYPE__PROFILE_IDENTIFICATION);
        createEAttribute(profileHandleDataTypeEClass, PROFILE_HANDLE_DATA_TYPE__PROFILE_REVISION);
        createEAttribute(profileHandleDataTypeEClass, PROFILE_HANDLE_DATA_TYPE__PROFILE_LOCATION);

        profileHeaderDataTypeEClass = createEClass(PROFILE_HEADER_DATA_TYPE);
        createEAttribute(profileHeaderDataTypeEClass, PROFILE_HEADER_DATA_TYPE__PROFILE_IDENTIFICATION);
        createEAttribute(profileHeaderDataTypeEClass, PROFILE_HEADER_DATA_TYPE__PROFILE_REVISION);
        createEAttribute(profileHeaderDataTypeEClass, PROFILE_HEADER_DATA_TYPE__PROFILE_NAME);
        createEAttribute(profileHeaderDataTypeEClass, PROFILE_HEADER_DATA_TYPE__PROFILE_SOURCE);
        createEAttribute(profileHeaderDataTypeEClass, PROFILE_HEADER_DATA_TYPE__PROFILE_CLASS_ID);
        createEAttribute(profileHeaderDataTypeEClass, PROFILE_HEADER_DATA_TYPE__PROFILE_DATE);
        createEAttribute(profileHeaderDataTypeEClass, PROFILE_HEADER_DATA_TYPE__ADDITIONAL_INFORMATION);
        createEReference(profileHeaderDataTypeEClass, PROFILE_HEADER_DATA_TYPE__ISO15745_REFERENCE);
        createEAttribute(profileHeaderDataTypeEClass, PROFILE_HEADER_DATA_TYPE__IAS_INTERFACE_TYPE);

        standardComplianceListTypeEClass = createEClass(STANDARD_COMPLIANCE_LIST_TYPE);
        createEReference(standardComplianceListTypeEClass, STANDARD_COMPLIANCE_LIST_TYPE__COMPLIANT_WITH);

        staticErrorBitFieldTypeEClass = createEClass(STATIC_ERROR_BIT_FIELD_TYPE);
        createEReference(staticErrorBitFieldTypeEClass, STATIC_ERROR_BIT_FIELD_TYPE__ERROR_BIT);

        stepTypeEClass = createEClass(STEP_TYPE);
        createEAttribute(stepTypeEClass, STEP_TYPE__GROUP);
        createEReference(stepTypeEClass, STEP_TYPE__LABEL);
        createEReference(stepTypeEClass, STEP_TYPE__DESCRIPTION);
        createEReference(stepTypeEClass, STEP_TYPE__LABEL_REF);
        createEReference(stepTypeEClass, STEP_TYPE__DESCRIPTION_REF);
        createEAttribute(stepTypeEClass, STEP_TYPE__MULTIPLIER);
        createEAttribute(stepTypeEClass, STEP_TYPE__OFFSET);
        createEAttribute(stepTypeEClass, STEP_TYPE__VALUE);

        structTypeEClass = createEClass(STRUCT_TYPE);
        createEAttribute(structTypeEClass, STRUCT_TYPE__GROUP);
        createEReference(structTypeEClass, STRUCT_TYPE__LABEL);
        createEReference(structTypeEClass, STRUCT_TYPE__DESCRIPTION);
        createEReference(structTypeEClass, STRUCT_TYPE__LABEL_REF);
        createEReference(structTypeEClass, STRUCT_TYPE__DESCRIPTION_REF);
        createEReference(structTypeEClass, STRUCT_TYPE__VAR_DECLARATION);
        createEAttribute(structTypeEClass, STRUCT_TYPE__NAME);
        createEAttribute(structTypeEClass, STRUCT_TYPE__UNIQUE_ID);

        subObjectTypeEClass = createEClass(SUB_OBJECT_TYPE);
        createEAttribute(subObjectTypeEClass, SUB_OBJECT_TYPE__ACCESS_TYPE);
        createEAttribute(subObjectTypeEClass, SUB_OBJECT_TYPE__ACTUAL_VALUE);
        createEAttribute(subObjectTypeEClass, SUB_OBJECT_TYPE__DATA_TYPE);
        createEAttribute(subObjectTypeEClass, SUB_OBJECT_TYPE__DEFAULT_VALUE);
        createEAttribute(subObjectTypeEClass, SUB_OBJECT_TYPE__DENOTATION);
        createEAttribute(subObjectTypeEClass, SUB_OBJECT_TYPE__HIGH_LIMIT);
        createEAttribute(subObjectTypeEClass, SUB_OBJECT_TYPE__LOW_LIMIT);
        createEAttribute(subObjectTypeEClass, SUB_OBJECT_TYPE__NAME);
        createEAttribute(subObjectTypeEClass, SUB_OBJECT_TYPE__OBJECT_TYPE);
        createEAttribute(subObjectTypeEClass, SUB_OBJECT_TYPE__OBJ_FLAGS);
        createEAttribute(subObjectTypeEClass, SUB_OBJECT_TYPE__PD_OMAPPING);
        createEAttribute(subObjectTypeEClass, SUB_OBJECT_TYPE__SUB_INDEX);
        createEAttribute(subObjectTypeEClass, SUB_OBJECT_TYPE__UNIQUE_ID_REF);

        tAllowedValuesEClass = createEClass(TALLOWED_VALUES);
        createEReference(tAllowedValuesEClass, TALLOWED_VALUES__VALUE);
        createEReference(tAllowedValuesEClass, TALLOWED_VALUES__RANGE);
        createEAttribute(tAllowedValuesEClass, TALLOWED_VALUES__TEMPLATE_ID_REF);

        tAllowedValuesTemplateEClass = createEClass(TALLOWED_VALUES_TEMPLATE);
        createEReference(tAllowedValuesTemplateEClass, TALLOWED_VALUES_TEMPLATE__VALUE);
        createEReference(tAllowedValuesTemplateEClass, TALLOWED_VALUES_TEMPLATE__RANGE);
        createEAttribute(tAllowedValuesTemplateEClass, TALLOWED_VALUES_TEMPLATE__UNIQUE_ID);

        tApplicationLayersEClass = createEClass(TAPPLICATION_LAYERS);
        createEReference(tApplicationLayersEClass, TAPPLICATION_LAYERS__IDENTITY);
        createEReference(tApplicationLayersEClass, TAPPLICATION_LAYERS__DATA_TYPE_LIST);
        createEReference(tApplicationLayersEClass, TAPPLICATION_LAYERS__OBJECT_LIST);
        createEReference(tApplicationLayersEClass, TAPPLICATION_LAYERS__DYNAMIC_CHANNELS);
        createEAttribute(tApplicationLayersEClass, TAPPLICATION_LAYERS__COMMUNICATION_ENTITY_TYPE);
        createEAttribute(tApplicationLayersEClass, TAPPLICATION_LAYERS__CONFORMANCE_CLASS);

        tApplicationProcessEClass = createEClass(TAPPLICATION_PROCESS);
        createEReference(tApplicationProcessEClass, TAPPLICATION_PROCESS__DATA_TYPE_LIST);
        createEReference(tApplicationProcessEClass, TAPPLICATION_PROCESS__FUNCTION_TYPE_LIST);
        createEReference(tApplicationProcessEClass, TAPPLICATION_PROCESS__FUNCTION_INSTANCE_LIST);
        createEReference(tApplicationProcessEClass, TAPPLICATION_PROCESS__TEMPLATE_LIST);
        createEReference(tApplicationProcessEClass, TAPPLICATION_PROCESS__PARAMETER_LIST);
        createEReference(tApplicationProcessEClass, TAPPLICATION_PROCESS__PARAMETER_GROUP_LIST);

        tCapabilitiesEClass = createEClass(TCAPABILITIES);
        createEReference(tCapabilitiesEClass, TCAPABILITIES__CHARACTERISTICS_LIST);
        createEReference(tCapabilitiesEClass, TCAPABILITIES__STANDARD_COMPLIANCE_LIST);

        tcnFeaturesEClass = createEClass(TCN_FEATURES);
        createEAttribute(tcnFeaturesEClass, TCN_FEATURES__DLLCN_FEATURE_MULTIPLEX);
        createEAttribute(tcnFeaturesEClass, TCN_FEATURES__DLLCNP_RES_CHAINING);
        createEAttribute(tcnFeaturesEClass, TCN_FEATURES__NMTCN_SO_C2P_REQ);

        tCombinedStateEClass = createEClass(TCOMBINED_STATE);
        createEAttribute(tCombinedStateEClass, TCOMBINED_STATE__GROUP);
        createEReference(tCombinedStateEClass, TCOMBINED_STATE__LABEL);
        createEReference(tCombinedStateEClass, TCOMBINED_STATE__DESCRIPTION);
        createEReference(tCombinedStateEClass, TCOMBINED_STATE__LABEL_REF);
        createEReference(tCombinedStateEClass, TCOMBINED_STATE__DESCRIPTION_REF);
        createEReference(tCombinedStateEClass, TCOMBINED_STATE__LE_DSTATE_REF);

        tConditionalSupportEClass = createEClass(TCONDITIONAL_SUPPORT);
        createEAttribute(tConditionalSupportEClass, TCONDITIONAL_SUPPORT__PARAM_ID_REF);

        tCountEClass = createEClass(TCOUNT);
        createEAttribute(tCountEClass, TCOUNT__GROUP);
        createEReference(tCountEClass, TCOUNT__LABEL);
        createEReference(tCountEClass, TCOUNT__DESCRIPTION);
        createEReference(tCountEClass, TCOUNT__LABEL_REF);
        createEReference(tCountEClass, TCOUNT__DESCRIPTION_REF);
        createEReference(tCountEClass, TCOUNT__DEFAULT_VALUE);
        createEReference(tCountEClass, TCOUNT__ALLOWED_VALUES);
        createEAttribute(tCountEClass, TCOUNT__ACCESS);
        createEAttribute(tCountEClass, TCOUNT__UNIQUE_ID);

        tDataTypeIDRefEClass = createEClass(TDATA_TYPE_ID_REF);
        createEAttribute(tDataTypeIDRefEClass, TDATA_TYPE_ID_REF__UNIQUE_ID_REF);

        tDataTypeListEClass = createEClass(TDATA_TYPE_LIST);
        createEAttribute(tDataTypeListEClass, TDATA_TYPE_LIST__GROUP);
        createEReference(tDataTypeListEClass, TDATA_TYPE_LIST__ARRAY);
        createEReference(tDataTypeListEClass, TDATA_TYPE_LIST__STRUCT);
        createEReference(tDataTypeListEClass, TDATA_TYPE_LIST__ENUM);
        createEReference(tDataTypeListEClass, TDATA_TYPE_LIST__DERIVED);

        tDataTypesEClass = createEClass(TDATA_TYPES);
        createEReference(tDataTypesEClass, TDATA_TYPES__BOOLEAN);
        createEReference(tDataTypesEClass, TDATA_TYPES__INTEGER8);
        createEReference(tDataTypesEClass, TDATA_TYPES__INTEGER16);
        createEReference(tDataTypesEClass, TDATA_TYPES__INTEGER32);
        createEReference(tDataTypesEClass, TDATA_TYPES__INTEGER24);
        createEReference(tDataTypesEClass, TDATA_TYPES__INTEGER40);
        createEReference(tDataTypesEClass, TDATA_TYPES__INTEGER48);
        createEReference(tDataTypesEClass, TDATA_TYPES__INTEGER56);
        createEReference(tDataTypesEClass, TDATA_TYPES__INTEGER64);
        createEReference(tDataTypesEClass, TDATA_TYPES__UNSIGNED8);
        createEReference(tDataTypesEClass, TDATA_TYPES__UNSIGNED16);
        createEReference(tDataTypesEClass, TDATA_TYPES__UNSIGNED32);
        createEReference(tDataTypesEClass, TDATA_TYPES__UNSIGNED24);
        createEReference(tDataTypesEClass, TDATA_TYPES__UNSIGNED40);
        createEReference(tDataTypesEClass, TDATA_TYPES__UNSIGNED48);
        createEReference(tDataTypesEClass, TDATA_TYPES__UNSIGNED56);
        createEReference(tDataTypesEClass, TDATA_TYPES__UNSIGNED64);
        createEReference(tDataTypesEClass, TDATA_TYPES__REAL32);
        createEReference(tDataTypesEClass, TDATA_TYPES__REAL64);
        createEReference(tDataTypesEClass, TDATA_TYPES__VISIBLE_STRING);
        createEReference(tDataTypesEClass, TDATA_TYPES__OCTET_STRING);
        createEReference(tDataTypesEClass, TDATA_TYPES__UNICODE_STRING);
        createEReference(tDataTypesEClass, TDATA_TYPES__TIME_OF_DAY);
        createEReference(tDataTypesEClass, TDATA_TYPES__TIME_DIFF);
        createEReference(tDataTypesEClass, TDATA_TYPES__DOMAIN);
        createEReference(tDataTypesEClass, TDATA_TYPES__MACADDRESS);
        createEReference(tDataTypesEClass, TDATA_TYPES__IPADDRESS);
        createEReference(tDataTypesEClass, TDATA_TYPES__NETTIME);
        createEAttribute(tDataTypesEClass, TDATA_TYPES__DATA_TYPE);

        tDenotationEClass = createEClass(TDENOTATION);
        createEAttribute(tDenotationEClass, TDENOTATION__GROUP);
        createEReference(tDenotationEClass, TDENOTATION__LABEL);
        createEReference(tDenotationEClass, TDENOTATION__DESCRIPTION);
        createEReference(tDenotationEClass, TDENOTATION__LABEL_REF);
        createEReference(tDenotationEClass, TDENOTATION__DESCRIPTION_REF);

        tDeviceCommissioningEClass = createEClass(TDEVICE_COMMISSIONING);
        createEAttribute(tDeviceCommissioningEClass, TDEVICE_COMMISSIONING__NETWORK_NAME);
        createEAttribute(tDeviceCommissioningEClass, TDEVICE_COMMISSIONING__NODE_ID);
        createEAttribute(tDeviceCommissioningEClass, TDEVICE_COMMISSIONING__NODE_NAME);
        createEAttribute(tDeviceCommissioningEClass, TDEVICE_COMMISSIONING__NODE_TYPE);
        createEAttribute(tDeviceCommissioningEClass, TDEVICE_COMMISSIONING__USED_NETWORK_INTERFACE);

        tDeviceFamilyEClass = createEClass(TDEVICE_FAMILY);
        createEAttribute(tDeviceFamilyEClass, TDEVICE_FAMILY__GROUP);
        createEReference(tDeviceFamilyEClass, TDEVICE_FAMILY__LABEL);
        createEReference(tDeviceFamilyEClass, TDEVICE_FAMILY__DESCRIPTION);
        createEReference(tDeviceFamilyEClass, TDEVICE_FAMILY__LABEL_REF);
        createEReference(tDeviceFamilyEClass, TDEVICE_FAMILY__DESCRIPTION_REF);
        createEAttribute(tDeviceFamilyEClass, TDEVICE_FAMILY__READ_ONLY);

        tDeviceFunctionEClass = createEClass(TDEVICE_FUNCTION);
        createEReference(tDeviceFunctionEClass, TDEVICE_FUNCTION__CAPABILITIES);
        createEReference(tDeviceFunctionEClass, TDEVICE_FUNCTION__PICTURES_LIST);
        createEReference(tDeviceFunctionEClass, TDEVICE_FUNCTION__DICTIONARY_LIST);

        tDeviceIdentityEClass = createEClass(TDEVICE_IDENTITY);
        createEReference(tDeviceIdentityEClass, TDEVICE_IDENTITY__VENDOR_NAME);
        createEReference(tDeviceIdentityEClass, TDEVICE_IDENTITY__VENDOR_ID);
        createEReference(tDeviceIdentityEClass, TDEVICE_IDENTITY__VENDOR_TEXT);
        createEReference(tDeviceIdentityEClass, TDEVICE_IDENTITY__DEVICE_FAMILY);
        createEReference(tDeviceIdentityEClass, TDEVICE_IDENTITY__PRODUCT_FAMILY);
        createEReference(tDeviceIdentityEClass, TDEVICE_IDENTITY__PRODUCT_NAME);
        createEReference(tDeviceIdentityEClass, TDEVICE_IDENTITY__PRODUCT_ID);
        createEReference(tDeviceIdentityEClass, TDEVICE_IDENTITY__PRODUCT_TEXT);
        createEReference(tDeviceIdentityEClass, TDEVICE_IDENTITY__ORDER_NUMBER);
        createEReference(tDeviceIdentityEClass, TDEVICE_IDENTITY__VERSION);
        createEAttribute(tDeviceIdentityEClass, TDEVICE_IDENTITY__BUILD_DATE);
        createEReference(tDeviceIdentityEClass, TDEVICE_IDENTITY__SPECIFICATION_REVISION);
        createEReference(tDeviceIdentityEClass, TDEVICE_IDENTITY__INSTANCE_NAME);

        tDeviceManagerEClass = createEClass(TDEVICE_MANAGER);
        createEReference(tDeviceManagerEClass, TDEVICE_MANAGER__INDICATOR_LIST);

        tDiagnosticEClass = createEClass(TDIAGNOSTIC);
        createEAttribute(tDiagnosticEClass, TDIAGNOSTIC__GROUP);
        createEReference(tDiagnosticEClass, TDIAGNOSTIC__ERROR_LIST);
        createEReference(tDiagnosticEClass, TDIAGNOSTIC__STATIC_ERROR_BIT_FIELD);

        tDictionaryListEClass = createEClass(TDICTIONARY_LIST);
        createEReference(tDictionaryListEClass, TDICTIONARY_LIST__DICTIONARY);

        tDynamicChannelEClass = createEClass(TDYNAMIC_CHANNEL);
        createEAttribute(tDynamicChannelEClass, TDYNAMIC_CHANNEL__ACCESS_TYPE);
        createEAttribute(tDynamicChannelEClass, TDYNAMIC_CHANNEL__ADDRESS_OFFSET);
        createEAttribute(tDynamicChannelEClass, TDYNAMIC_CHANNEL__BIT_ALIGNMENT);
        createEAttribute(tDynamicChannelEClass, TDYNAMIC_CHANNEL__DATA_TYPE);
        createEAttribute(tDynamicChannelEClass, TDYNAMIC_CHANNEL__END_INDEX);
        createEAttribute(tDynamicChannelEClass, TDYNAMIC_CHANNEL__MAX_NUMBER);
        createEAttribute(tDynamicChannelEClass, TDYNAMIC_CHANNEL__START_INDEX);

        tEnumValueEClass = createEClass(TENUM_VALUE);
        createEAttribute(tEnumValueEClass, TENUM_VALUE__GROUP);
        createEReference(tEnumValueEClass, TENUM_VALUE__LABEL);
        createEReference(tEnumValueEClass, TENUM_VALUE__DESCRIPTION);
        createEReference(tEnumValueEClass, TENUM_VALUE__LABEL_REF);
        createEReference(tEnumValueEClass, TENUM_VALUE__DESCRIPTION_REF);
        createEAttribute(tEnumValueEClass, TENUM_VALUE__VALUE);

        textEntryTypeEClass = createEClass(TEXT_ENTRY_TYPE);
        createEAttribute(textEntryTypeEClass, TEXT_ENTRY_TYPE__VALUE);
        createEAttribute(textEntryTypeEClass, TEXT_ENTRY_TYPE__TEXT_ID);

        textResourceTypeEClass = createEClass(TEXT_RESOURCE_TYPE);
        createEReference(textResourceTypeEClass, TEXT_RESOURCE_TYPE__TEXT_ENTRY);
        createEAttribute(textResourceTypeEClass, TEXT_RESOURCE_TYPE__LANG);

        tFunctionInstanceListEClass = createEClass(TFUNCTION_INSTANCE_LIST);
        createEReference(tFunctionInstanceListEClass, TFUNCTION_INSTANCE_LIST__FUNCTION_INSTANCE);
        createEReference(tFunctionInstanceListEClass, TFUNCTION_INSTANCE_LIST__CONNECTION);

        tFunctionTypeListEClass = createEClass(TFUNCTION_TYPE_LIST);
        createEReference(tFunctionTypeListEClass, TFUNCTION_TYPE_LIST__FUNCTION_TYPE);

        tGeneralFeaturesEClass = createEClass(TGENERAL_FEATURES);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__CFM_CONFIG_MANAGER);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__DLL_ERR_BAD_PHYS_MODE);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__DLL_ERR_MAC_BUFFER);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__DLL_FEATURE_CN);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__DLL_FEATURE_MN);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__NMT_BOOT_TIME_NOT_ACTIVE);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__NMT_CYCLE_TIME_GRANULARITY);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__NMT_CYCLE_TIME_MAX);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__NMT_CYCLE_TIME_MIN);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__NMT_EMERGENCY_QUEUE_SIZE);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__NMT_ERROR_ENTRIES);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__NMT_FLUSH_ARP_ENTRY);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__NMT_MAX_CN_NODE_ID);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__NMT_MAX_CN_NUMBER);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__NMT_MAX_HEARTBEATS);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__NMT_MIN_RED_CYCLE_TIME);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__NMT_NET_HOST_NAME_SET);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__NMT_NODE_ID_BY_HW);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__NMT_PRODUCT_CODE);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__NMT_PUBLISH_ACTIVE_NODES);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__NMT_PUBLISH_CONFIG_NODES);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__NMT_PUBLISH_EMERGENCY_NEW);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__NMT_PUBLISH_NODE_STATE);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__NMT_PUBLISH_OPERATIONAL);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__NMT_PUBLISH_PRE_OP1);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__NMT_PUBLISH_PRE_OP2);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__NMT_PUBLISH_READY_TO_OP);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__NMT_PUBLISH_STOPPED);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__NMT_PUBLISH_TIME);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__NMT_REVISION_NO);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__NWL_FORWARD);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__NWLICMP_SUPPORT);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__NWLIP_SUPPORT);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__PDO_GRANULARITY);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__PDO_MAX_DESCR_MEM);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__PDORPDO_CHANNEL_OBJECTS);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__PDORPDO_CHANNELS);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__PDORPDO_CYCLE_DATA_LIM);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__PDORPDO_OVERALL_OBJECTS);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__PDO_SELF_RECEIPT);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__PDOTPDO_CHANNEL_OBJECTS);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__PDOTPDO_CYCLE_DATA_LIM);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__PDOTPDO_OVERALL_OBJECTS);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__PHY_EXT_EPL_PORTS);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__PHY_HUB_DELAY);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__PHY_HUB_INTEGRATED);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__PHY_HUB_JITTER);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__RT1RT1_SECURITY_SUPPORT);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__RT1RT1_SUPPORT);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__RT2RT2_SUPPORT);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__SDO_CLIENT);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__SDO_CMD_FILE_READ);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__SDO_CMD_FILE_WRITE);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__SDO_CMD_LINK_NAME);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__SDO_CMD_READ_ALL_BY_INDEX);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__SDO_CMD_READ_BY_NAME);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__SDO_CMD_READ_MULT_PARAM);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__SDO_CMD_WRITE_ALL_BY_INDEX);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__SDO_CMD_WRITE_BY_NAME);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__SDO_CMD_WRITE_MULT_PARAM);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__SDO_MAX_CONNECTIONS);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__SDO_MAX_PARALLEL_CONNECTIONS);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__SDO_SEQ_LAYER_TX_HISTORY_SIZE);
        createEAttribute(tGeneralFeaturesEClass, TGENERAL_FEATURES__SDO_SERVER);

        tIndicatorListEClass = createEClass(TINDICATOR_LIST);
        createEReference(tIndicatorListEClass, TINDICATOR_LIST__LED_LIST);

        tledEClass = createEClass(TLED);
        createEAttribute(tledEClass, TLED__GROUP);
        createEReference(tledEClass, TLED__LABEL);
        createEReference(tledEClass, TLED__DESCRIPTION);
        createEReference(tledEClass, TLED__LABEL_REF);
        createEReference(tledEClass, TLED__DESCRIPTION_REF);
        createEReference(tledEClass, TLED__LE_DSTATE);
        createEAttribute(tledEClass, TLED__LE_DCOLORS);
        createEAttribute(tledEClass, TLED__LE_DTYPE);

        tmnFeaturesEClass = createEClass(TMN_FEATURES);
        createEAttribute(tmnFeaturesEClass, TMN_FEATURES__DLL_ERR_MN_MULTIPLE_MN);
        createEAttribute(tmnFeaturesEClass, TMN_FEATURES__DLLMN_FEATURE_MULTIPLEX);
        createEAttribute(tmnFeaturesEClass, TMN_FEATURES__DLLMN_FEATURE_PRES_TX);
        createEAttribute(tmnFeaturesEClass, TMN_FEATURES__DLLMNP_RES_CHAINING);
        createEAttribute(tmnFeaturesEClass, TMN_FEATURES__NMTMNA_SND2_SO_C);
        createEAttribute(tmnFeaturesEClass, TMN_FEATURES__NMTMN_BASIC_ETHERNET);
        createEAttribute(tmnFeaturesEClass, TMN_FEATURES__NMTMN_MULTIPL_CYC_MAX);
        createEAttribute(tmnFeaturesEClass, TMN_FEATURES__NMTMNP_RES2_PREQ);
        createEAttribute(tmnFeaturesEClass, TMN_FEATURES__NMTMNP_RES2_PRES);
        createEAttribute(tmnFeaturesEClass, TMN_FEATURES__NMTMNP_RES_RX2_SO_A);
        createEAttribute(tmnFeaturesEClass, TMN_FEATURES__NMTMNP_RES_TX2_SO_A);
        createEAttribute(tmnFeaturesEClass, TMN_FEATURES__NMTMN_SO_A2A_SND_TX);
        createEAttribute(tmnFeaturesEClass, TMN_FEATURES__NMTMN_SO_C2P_REQ);
        createEAttribute(tmnFeaturesEClass, TMN_FEATURES__NMT_NET_TIME);
        createEAttribute(tmnFeaturesEClass, TMN_FEATURES__NMT_NET_TIME_IS_REAL_TIME);
        createEAttribute(tmnFeaturesEClass, TMN_FEATURES__NMT_RELATIVE_TIME);
        createEAttribute(tmnFeaturesEClass, TMN_FEATURES__NMT_SIMPLE_BOOT);
        createEAttribute(tmnFeaturesEClass, TMN_FEATURES__PDOTPDO_CHANNELS);

        tNetworkManagementEClass = createEClass(TNETWORK_MANAGEMENT);
        createEReference(tNetworkManagementEClass, TNETWORK_MANAGEMENT__GENERAL_FEATURES);
        createEReference(tNetworkManagementEClass, TNETWORK_MANAGEMENT__MN_FEATURES);
        createEReference(tNetworkManagementEClass, TNETWORK_MANAGEMENT__CN_FEATURES);
        createEReference(tNetworkManagementEClass, TNETWORK_MANAGEMENT__DEVICE_COMMISSIONING);
        createEReference(tNetworkManagementEClass, TNETWORK_MANAGEMENT__DIAGNOSTIC);

        tObjectEClass = createEClass(TOBJECT);
        createEReference(tObjectEClass, TOBJECT__SUB_OBJECT);
        createEAttribute(tObjectEClass, TOBJECT__ACCESS_TYPE);
        createEAttribute(tObjectEClass, TOBJECT__ACTUAL_VALUE);
        createEAttribute(tObjectEClass, TOBJECT__DATA_TYPE);
        createEAttribute(tObjectEClass, TOBJECT__DEFAULT_VALUE);
        createEAttribute(tObjectEClass, TOBJECT__DENOTATION);
        createEAttribute(tObjectEClass, TOBJECT__HIGH_LIMIT);
        createEAttribute(tObjectEClass, TOBJECT__INDEX);
        createEAttribute(tObjectEClass, TOBJECT__LOW_LIMIT);
        createEAttribute(tObjectEClass, TOBJECT__NAME);
        createEAttribute(tObjectEClass, TOBJECT__OBJECT_TYPE);
        createEAttribute(tObjectEClass, TOBJECT__OBJ_FLAGS);
        createEAttribute(tObjectEClass, TOBJECT__PD_OMAPPING);
        createEAttribute(tObjectEClass, TOBJECT__SUB_NUMBER);
        createEAttribute(tObjectEClass, TOBJECT__UNIQUE_ID_REF);

        tParameterGroupEClass = createEClass(TPARAMETER_GROUP);
        createEAttribute(tParameterGroupEClass, TPARAMETER_GROUP__GROUP);
        createEReference(tParameterGroupEClass, TPARAMETER_GROUP__LABEL);
        createEReference(tParameterGroupEClass, TPARAMETER_GROUP__DESCRIPTION);
        createEReference(tParameterGroupEClass, TPARAMETER_GROUP__LABEL_REF);
        createEReference(tParameterGroupEClass, TPARAMETER_GROUP__DESCRIPTION_REF);
        createEReference(tParameterGroupEClass, TPARAMETER_GROUP__PARAMETER_GROUP);
        createEReference(tParameterGroupEClass, TPARAMETER_GROUP__PARAMETER_REF);
        createEAttribute(tParameterGroupEClass, TPARAMETER_GROUP__KIND_OF_ACCESS);
        createEAttribute(tParameterGroupEClass, TPARAMETER_GROUP__UNIQUE_ID);

        tParameterGroupListEClass = createEClass(TPARAMETER_GROUP_LIST);
        createEReference(tParameterGroupListEClass, TPARAMETER_GROUP_LIST__PARAMETER_GROUP);

        tParameterListEClass = createEClass(TPARAMETER_LIST);
        createEReference(tParameterListEClass, TPARAMETER_LIST__PARAMETER);

        tParameterTemplateEClass = createEClass(TPARAMETER_TEMPLATE);
        createEReference(tParameterTemplateEClass, TPARAMETER_TEMPLATE__BOOL);
        createEReference(tParameterTemplateEClass, TPARAMETER_TEMPLATE__BITSTRING);
        createEReference(tParameterTemplateEClass, TPARAMETER_TEMPLATE__BYTE);
        createEReference(tParameterTemplateEClass, TPARAMETER_TEMPLATE__CHAR);
        createEReference(tParameterTemplateEClass, TPARAMETER_TEMPLATE__WORD);
        createEReference(tParameterTemplateEClass, TPARAMETER_TEMPLATE__DWORD);
        createEReference(tParameterTemplateEClass, TPARAMETER_TEMPLATE__LWORD);
        createEReference(tParameterTemplateEClass, TPARAMETER_TEMPLATE__SINT);
        createEReference(tParameterTemplateEClass, TPARAMETER_TEMPLATE__INT);
        createEReference(tParameterTemplateEClass, TPARAMETER_TEMPLATE__DINT);
        createEReference(tParameterTemplateEClass, TPARAMETER_TEMPLATE__LINT);
        createEReference(tParameterTemplateEClass, TPARAMETER_TEMPLATE__USINT);
        createEReference(tParameterTemplateEClass, TPARAMETER_TEMPLATE__UINT);
        createEReference(tParameterTemplateEClass, TPARAMETER_TEMPLATE__UDINT);
        createEReference(tParameterTemplateEClass, TPARAMETER_TEMPLATE__ULINT);
        createEReference(tParameterTemplateEClass, TPARAMETER_TEMPLATE__REAL);
        createEReference(tParameterTemplateEClass, TPARAMETER_TEMPLATE__LREAL);
        createEReference(tParameterTemplateEClass, TPARAMETER_TEMPLATE__STRING);
        createEReference(tParameterTemplateEClass, TPARAMETER_TEMPLATE__WSTRING);
        createEReference(tParameterTemplateEClass, TPARAMETER_TEMPLATE__DATA_TYPE_ID_REF);
        createEReference(tParameterTemplateEClass, TPARAMETER_TEMPLATE__CONDITIONAL_SUPPORT);
        createEReference(tParameterTemplateEClass, TPARAMETER_TEMPLATE__ACTUAL_VALUE);
        createEReference(tParameterTemplateEClass, TPARAMETER_TEMPLATE__DEFAULT_VALUE);
        createEReference(tParameterTemplateEClass, TPARAMETER_TEMPLATE__SUBSTITUTE_VALUE);
        createEReference(tParameterTemplateEClass, TPARAMETER_TEMPLATE__ALLOWED_VALUES);
        createEReference(tParameterTemplateEClass, TPARAMETER_TEMPLATE__UNIT);
        createEReference(tParameterTemplateEClass, TPARAMETER_TEMPLATE__PROPERTY);
        createEAttribute(tParameterTemplateEClass, TPARAMETER_TEMPLATE__ACCESS);
        createEAttribute(tParameterTemplateEClass, TPARAMETER_TEMPLATE__ACCESS_LIST);
        createEAttribute(tParameterTemplateEClass, TPARAMETER_TEMPLATE__MULTIPLIER);
        createEAttribute(tParameterTemplateEClass, TPARAMETER_TEMPLATE__OFFSET);
        createEAttribute(tParameterTemplateEClass, TPARAMETER_TEMPLATE__PERSISTENT);
        createEAttribute(tParameterTemplateEClass, TPARAMETER_TEMPLATE__SUPPORT);
        createEAttribute(tParameterTemplateEClass, TPARAMETER_TEMPLATE__TEMPLATE_ID_REF);
        createEAttribute(tParameterTemplateEClass, TPARAMETER_TEMPLATE__UNIQUE_ID);

        tPicturesListEClass = createEClass(TPICTURES_LIST);
        createEReference(tPicturesListEClass, TPICTURES_LIST__PICTURE);

        tProductIDEClass = createEClass(TPRODUCT_ID);
        createEAttribute(tProductIDEClass, TPRODUCT_ID__VALUE);
        createEAttribute(tProductIDEClass, TPRODUCT_ID__READ_ONLY);

        tPropertyEClass = createEClass(TPROPERTY);
        createEAttribute(tPropertyEClass, TPROPERTY__NAME);
        createEAttribute(tPropertyEClass, TPROPERTY__VALUE);

        tRangeEClass = createEClass(TRANGE);
        createEReference(tRangeEClass, TRANGE__MIN_VALUE);
        createEReference(tRangeEClass, TRANGE__MAX_VALUE);
        createEReference(tRangeEClass, TRANGE__STEP);

        tSpecificationRevisionEClass = createEClass(TSPECIFICATION_REVISION);
        createEAttribute(tSpecificationRevisionEClass, TSPECIFICATION_REVISION__VALUE);
        createEAttribute(tSpecificationRevisionEClass, TSPECIFICATION_REVISION__READ_ONLY);

        tSubrangeEClass = createEClass(TSUBRANGE);
        createEAttribute(tSubrangeEClass, TSUBRANGE__LOWER_LIMIT);
        createEAttribute(tSubrangeEClass, TSUBRANGE__UPPER_LIMIT);

        tTemplateListEClass = createEClass(TTEMPLATE_LIST);
        createEReference(tTemplateListEClass, TTEMPLATE_LIST__PARAMETER_TEMPLATE);
        createEReference(tTemplateListEClass, TTEMPLATE_LIST__ALLOWED_VALUES_TEMPLATE);

        tTransportLayersEClass = createEClass(TTRANSPORT_LAYERS);

        tUnitEClass = createEClass(TUNIT);
        createEAttribute(tUnitEClass, TUNIT__GROUP);
        createEReference(tUnitEClass, TUNIT__LABEL);
        createEReference(tUnitEClass, TUNIT__DESCRIPTION);
        createEReference(tUnitEClass, TUNIT__LABEL_REF);
        createEReference(tUnitEClass, TUNIT__DESCRIPTION_REF);
        createEAttribute(tUnitEClass, TUNIT__MULTIPLIER);
        createEAttribute(tUnitEClass, TUNIT__UNIT_URI);

        tValueEClass = createEClass(TVALUE);
        createEAttribute(tValueEClass, TVALUE__GROUP);
        createEReference(tValueEClass, TVALUE__LABEL);
        createEReference(tValueEClass, TVALUE__DESCRIPTION);
        createEReference(tValueEClass, TVALUE__LABEL_REF);
        createEReference(tValueEClass, TVALUE__DESCRIPTION_REF);
        createEAttribute(tValueEClass, TVALUE__MULTIPLIER);
        createEAttribute(tValueEClass, TVALUE__OFFSET);
        createEAttribute(tValueEClass, TVALUE__VALUE);

        tVarDeclarationEClass = createEClass(TVAR_DECLARATION);
        createEAttribute(tVarDeclarationEClass, TVAR_DECLARATION__GROUP);
        createEReference(tVarDeclarationEClass, TVAR_DECLARATION__LABEL);
        createEReference(tVarDeclarationEClass, TVAR_DECLARATION__DESCRIPTION);
        createEReference(tVarDeclarationEClass, TVAR_DECLARATION__LABEL_REF);
        createEReference(tVarDeclarationEClass, TVAR_DECLARATION__DESCRIPTION_REF);
        createEReference(tVarDeclarationEClass, TVAR_DECLARATION__BOOL);
        createEReference(tVarDeclarationEClass, TVAR_DECLARATION__BITSTRING);
        createEReference(tVarDeclarationEClass, TVAR_DECLARATION__BYTE);
        createEReference(tVarDeclarationEClass, TVAR_DECLARATION__CHAR);
        createEReference(tVarDeclarationEClass, TVAR_DECLARATION__WORD);
        createEReference(tVarDeclarationEClass, TVAR_DECLARATION__DWORD);
        createEReference(tVarDeclarationEClass, TVAR_DECLARATION__LWORD);
        createEReference(tVarDeclarationEClass, TVAR_DECLARATION__SINT);
        createEReference(tVarDeclarationEClass, TVAR_DECLARATION__INT);
        createEReference(tVarDeclarationEClass, TVAR_DECLARATION__DINT);
        createEReference(tVarDeclarationEClass, TVAR_DECLARATION__LINT);
        createEReference(tVarDeclarationEClass, TVAR_DECLARATION__USINT);
        createEReference(tVarDeclarationEClass, TVAR_DECLARATION__UINT);
        createEReference(tVarDeclarationEClass, TVAR_DECLARATION__UDINT);
        createEReference(tVarDeclarationEClass, TVAR_DECLARATION__ULINT);
        createEReference(tVarDeclarationEClass, TVAR_DECLARATION__REAL);
        createEReference(tVarDeclarationEClass, TVAR_DECLARATION__LREAL);
        createEReference(tVarDeclarationEClass, TVAR_DECLARATION__STRING);
        createEReference(tVarDeclarationEClass, TVAR_DECLARATION__WSTRING);
        createEReference(tVarDeclarationEClass, TVAR_DECLARATION__DATA_TYPE_ID_REF);
        createEAttribute(tVarDeclarationEClass, TVAR_DECLARATION__INITIAL_VALUE);
        createEAttribute(tVarDeclarationEClass, TVAR_DECLARATION__NAME);
        createEAttribute(tVarDeclarationEClass, TVAR_DECLARATION__SIZE);
        createEAttribute(tVarDeclarationEClass, TVAR_DECLARATION__UNIQUE_ID);

        tVariableRefEClass = createEClass(TVARIABLE_REF);
        createEReference(tVariableRefEClass, TVARIABLE_REF__INSTANCE_ID_REF);
        createEReference(tVariableRefEClass, TVARIABLE_REF__VARIABLE_ID_REF);
        createEReference(tVariableRefEClass, TVARIABLE_REF__MEMBER_REF);
        createEAttribute(tVariableRefEClass, TVARIABLE_REF__POSITION);

        tVendorIDEClass = createEClass(TVENDOR_ID);
        createEAttribute(tVendorIDEClass, TVENDOR_ID__VALUE);
        createEAttribute(tVendorIDEClass, TVENDOR_ID__READ_ONLY);

        tVersionEClass = createEClass(TVERSION);
        createEAttribute(tVersionEClass, TVERSION__VALUE);
        createEAttribute(tVersionEClass, TVERSION__READ_ONLY);
        createEAttribute(tVersionEClass, TVERSION__VERSION_TYPE);

        valueTypeEClass = createEClass(VALUE_TYPE);
        createEAttribute(valueTypeEClass, VALUE_TYPE__GROUP);
        createEReference(valueTypeEClass, VALUE_TYPE__LABEL);
        createEReference(valueTypeEClass, VALUE_TYPE__DESCRIPTION);
        createEReference(valueTypeEClass, VALUE_TYPE__LABEL_REF);
        createEReference(valueTypeEClass, VALUE_TYPE__DESCRIPTION_REF);
        createEAttribute(valueTypeEClass, VALUE_TYPE__NAME);
        createEAttribute(valueTypeEClass, VALUE_TYPE__VALUE);

        variableIDRefTypeEClass = createEClass(VARIABLE_ID_REF_TYPE);
        createEAttribute(variableIDRefTypeEClass, VARIABLE_ID_REF_TYPE__UNIQUE_ID_REF);

        vendorNameTypeEClass = createEClass(VENDOR_NAME_TYPE);
        createEAttribute(vendorNameTypeEClass, VENDOR_NAME_TYPE__VALUE);
        createEAttribute(vendorNameTypeEClass, VENDOR_NAME_TYPE__READ_ONLY);

        vendorTextTypeEClass = createEClass(VENDOR_TEXT_TYPE);
        createEAttribute(vendorTextTypeEClass, VENDOR_TEXT_TYPE__GROUP);
        createEReference(vendorTextTypeEClass, VENDOR_TEXT_TYPE__LABEL);
        createEReference(vendorTextTypeEClass, VENDOR_TEXT_TYPE__DESCRIPTION);
        createEReference(vendorTextTypeEClass, VENDOR_TEXT_TYPE__LABEL_REF);
        createEReference(vendorTextTypeEClass, VENDOR_TEXT_TYPE__DESCRIPTION_REF);
        createEAttribute(vendorTextTypeEClass, VENDOR_TEXT_TYPE__READ_ONLY);

        versionInfoTypeEClass = createEClass(VERSION_INFO_TYPE);
        createEAttribute(versionInfoTypeEClass, VERSION_INFO_TYPE__GROUP);
        createEReference(versionInfoTypeEClass, VERSION_INFO_TYPE__LABEL);
        createEReference(versionInfoTypeEClass, VERSION_INFO_TYPE__DESCRIPTION);
        createEReference(versionInfoTypeEClass, VERSION_INFO_TYPE__LABEL_REF);
        createEReference(versionInfoTypeEClass, VERSION_INFO_TYPE__DESCRIPTION_REF);
        createEAttribute(versionInfoTypeEClass, VERSION_INFO_TYPE__AUTHOR);
        createEAttribute(versionInfoTypeEClass, VERSION_INFO_TYPE__DATE);
        createEAttribute(versionInfoTypeEClass, VERSION_INFO_TYPE__ORGANIZATION);
        createEAttribute(versionInfoTypeEClass, VERSION_INFO_TYPE__VERSION);

        // Create enums
        accessTypeEEnum = createEEnum(ACCESS_TYPE);
        accessType1EEnum = createEEnum(ACCESS_TYPE1);
        accessTypeTypeEEnum = createEEnum(ACCESS_TYPE_TYPE);
        deviceClassTypeEEnum = createEEnum(DEVICE_CLASS_TYPE);
        iasInterfaceDataTypeMember0EEnum = createEEnum(IAS_INTERFACE_DATA_TYPE_MEMBER0);
        leDcolorsTypeEEnum = createEEnum(LE_DCOLORS_TYPE);
        leDcolorTypeEEnum = createEEnum(LE_DCOLOR_TYPE);
        leDtypeTypeEEnum = createEEnum(LE_DTYPE_TYPE);
        nodeTypeTypeEEnum = createEEnum(NODE_TYPE_TYPE);
        profileClassIDDataTypeEEnum = createEEnum(PROFILE_CLASS_ID_DATA_TYPE);
        rangeTypeEEnum = createEEnum(RANGE_TYPE);
        stateTypeEEnum = createEEnum(STATE_TYPE);
        supportTypeEEnum = createEEnum(SUPPORT_TYPE);
        tObjectAccessTypeEEnum = createEEnum(TOBJECT_ACCESS_TYPE);
        tObjectPDOMappingEEnum = createEEnum(TOBJECT_PDO_MAPPING);
        versionTypeTypeEEnum = createEEnum(VERSION_TYPE_TYPE);

        // Create data types
        accessListTypeEDataType = createEDataType(ACCESS_LIST_TYPE);
        accessTypeObjectEDataType = createEDataType(ACCESS_TYPE_OBJECT);
        accessTypeObject1EDataType = createEDataType(ACCESS_TYPE_OBJECT1);
        accessTypeTypeObjectEDataType = createEDataType(ACCESS_TYPE_TYPE_OBJECT);
        deviceClassTypeObjectEDataType = createEDataType(DEVICE_CLASS_TYPE_OBJECT);
        iasInterfaceDataTypeEDataType = createEDataType(IAS_INTERFACE_DATA_TYPE);
        iasInterfaceDataTypeMember0ObjectEDataType = createEDataType(IAS_INTERFACE_DATA_TYPE_MEMBER0_OBJECT);
        iasInterfaceDataTypeMember1EDataType = createEDataType(IAS_INTERFACE_DATA_TYPE_MEMBER1);
        leDcolorsTypeObjectEDataType = createEDataType(LE_DCOLORS_TYPE_OBJECT);
        leDcolorTypeObjectEDataType = createEDataType(LE_DCOLOR_TYPE_OBJECT);
        leDtypeTypeObjectEDataType = createEDataType(LE_DTYPE_TYPE_OBJECT);
        nodeTypeTypeObjectEDataType = createEDataType(NODE_TYPE_TYPE_OBJECT);
        offsetTypeEDataType = createEDataType(OFFSET_TYPE);
        profileClassIDDataTypeObjectEDataType = createEDataType(PROFILE_CLASS_ID_DATA_TYPE_OBJECT);
        rangeTypeObjectEDataType = createEDataType(RANGE_TYPE_OBJECT);
        stateTypeObjectEDataType = createEDataType(STATE_TYPE_OBJECT);
        supportedLanguagesTypeEDataType = createEDataType(SUPPORTED_LANGUAGES_TYPE);
        supportTypeObjectEDataType = createEDataType(SUPPORT_TYPE_OBJECT);
        tObjectAccessTypeObjectEDataType = createEDataType(TOBJECT_ACCESS_TYPE_OBJECT);
        tObjectPDOMappingObjectEDataType = createEDataType(TOBJECT_PDO_MAPPING_OBJECT);
        versionTypeTypeObjectEDataType = createEDataType(VERSION_TYPE_TYPE_OBJECT);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This
     * method is guarded to have no affect on any invocation but its first. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        profileBodyCommunicationNetworkPowerlinkEClass.getESuperTypes().add(this.getProfileBodyDataType());
        profileBodyDevicePowerlinkEClass.getESuperTypes().add(this.getProfileBodyDataType());

        // Initialize classes and features; add operations and parameters
        initEClass(addInfoTypeEClass, AddInfoType.class, "AddInfoType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAddInfoType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, AddInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAddInfoType_Label(), this.getLabelType(), null, "label", null, 0, -1, AddInfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getAddInfoType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, AddInfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getAddInfoType_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, AddInfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getAddInfoType_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, AddInfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getAddInfoType_Value(), this.getValueType(), null, "value", null, 0, -1, AddInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAddInfoType_BitOffset(), theXMLTypePackage.getUnsignedByte(), "bitOffset", null, 1, 1, AddInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAddInfoType_Len(), theXMLTypePackage.getUnsignedByte(), "len", null, 1, 1, AddInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAddInfoType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, AddInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(arrayTypeEClass, ArrayType.class, "ArrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getArrayType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getArrayType_Label(), this.getLabelType(), null, "label", null, 0, -1, ArrayType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getArrayType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, ArrayType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getArrayType_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, ArrayType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getArrayType_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, ArrayType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getArrayType_Subrange(), this.getTSubrange(), null, "subrange", null, 1, -1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getArrayType_BOOL(), ecorePackage.getEObject(), null, "bOOL", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getArrayType_BITSTRING(), ecorePackage.getEObject(), null, "bITSTRING", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getArrayType_BYTE(), ecorePackage.getEObject(), null, "bYTE", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getArrayType_CHAR(), ecorePackage.getEObject(), null, "cHAR", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getArrayType_WORD(), ecorePackage.getEObject(), null, "wORD", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getArrayType_DWORD(), ecorePackage.getEObject(), null, "dWORD", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getArrayType_LWORD(), ecorePackage.getEObject(), null, "lWORD", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getArrayType_SINT(), ecorePackage.getEObject(), null, "sINT", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getArrayType_INT(), ecorePackage.getEObject(), null, "iNT", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getArrayType_DINT(), ecorePackage.getEObject(), null, "dINT", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getArrayType_LINT(), ecorePackage.getEObject(), null, "lINT", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getArrayType_USINT(), ecorePackage.getEObject(), null, "uSINT", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getArrayType_UINT(), ecorePackage.getEObject(), null, "uINT", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getArrayType_UDINT(), ecorePackage.getEObject(), null, "uDINT", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getArrayType_ULINT(), ecorePackage.getEObject(), null, "uLINT", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getArrayType_REAL(), ecorePackage.getEObject(), null, "rEAL", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getArrayType_LREAL(), ecorePackage.getEObject(), null, "lREAL", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getArrayType_STRING(), ecorePackage.getEObject(), null, "sTRING", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getArrayType_WSTRING(), ecorePackage.getEObject(), null, "wSTRING", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getArrayType_DataTypeIDRef(), this.getTDataTypeIDRef(), null, "dataTypeIDRef", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getArrayType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getArrayType_UniqueID(), theXMLTypePackage.getID(), "uniqueID", null, 1, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(categoryTypeEClass, CategoryType.class, "CategoryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCategoryType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, CategoryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCategoryType_Label(), this.getLabelType(), null, "label", null, 0, -1, CategoryType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getCategoryType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, CategoryType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getCategoryType_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, CategoryType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getCategoryType_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, CategoryType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(characteristicContentTypeEClass, CharacteristicContentType.class, "CharacteristicContentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCharacteristicContentType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, CharacteristicContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCharacteristicContentType_Label(), this.getLabelType(), null, "label", null, 0, -1, CharacteristicContentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getCharacteristicContentType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, CharacteristicContentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getCharacteristicContentType_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, CharacteristicContentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getCharacteristicContentType_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, CharacteristicContentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(characteristicNameTypeEClass, CharacteristicNameType.class, "CharacteristicNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCharacteristicNameType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, CharacteristicNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCharacteristicNameType_Label(), this.getLabelType(), null, "label", null, 0, -1, CharacteristicNameType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getCharacteristicNameType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, CharacteristicNameType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getCharacteristicNameType_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, CharacteristicNameType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getCharacteristicNameType_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, CharacteristicNameType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(characteristicsListTypeEClass, CharacteristicsListType.class, "CharacteristicsListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCharacteristicsListType_Category(), this.getCategoryType(), null, "category", null, 0, 1, CharacteristicsListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCharacteristicsListType_Characteristic(), this.getCharacteristicType(), null, "characteristic", null, 1, -1, CharacteristicsListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(characteristicTypeEClass, CharacteristicType.class, "CharacteristicType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCharacteristicType_CharacteristicName(), this.getCharacteristicNameType(), null, "characteristicName", null, 1, 1, CharacteristicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCharacteristicType_CharacteristicContent(), this.getCharacteristicContentType(), null, "characteristicContent", null, 1, -1, CharacteristicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(compliantWithTypeEClass, CompliantWithType.class, "CompliantWithType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCompliantWithType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, CompliantWithType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCompliantWithType_Label(), this.getLabelType(), null, "label", null, 0, -1, CompliantWithType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getCompliantWithType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, CompliantWithType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getCompliantWithType_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, CompliantWithType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getCompliantWithType_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, CompliantWithType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getCompliantWithType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, CompliantWithType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCompliantWithType_Range(), this.getRangeType(), "range", "international", 0, 1, CompliantWithType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(configVarsTypeEClass, ConfigVarsType.class, "ConfigVarsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getConfigVarsType_VarDeclaration(), this.getTVarDeclaration(), null, "varDeclaration", null, 1, -1, ConfigVarsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(connectionTypeEClass, ConnectionType.class, "ConnectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getConnectionType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, ConnectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConnectionType_Destination(), theXMLTypePackage.getString(), "destination", null, 1, 1, ConnectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConnectionType_Source(), theXMLTypePackage.getString(), "source", null, 1, 1, ConnectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dataTypeListTypeEClass, DataTypeListType.class, "DataTypeListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDataTypeListType_DefType(), this.getTDataTypes(), null, "defType", null, 1, -1, DataTypeListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(derivedTypeEClass, DerivedType.class, "DerivedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDerivedType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, DerivedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDerivedType_Label(), this.getLabelType(), null, "label", null, 0, -1, DerivedType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDerivedType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, DerivedType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDerivedType_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, DerivedType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDerivedType_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, DerivedType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDerivedType_Count(), this.getTCount(), null, "count", null, 0, 1, DerivedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDerivedType_BOOL(), ecorePackage.getEObject(), null, "bOOL", null, 0, 1, DerivedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDerivedType_BITSTRING(), ecorePackage.getEObject(), null, "bITSTRING", null, 0, 1, DerivedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDerivedType_BYTE(), ecorePackage.getEObject(), null, "bYTE", null, 0, 1, DerivedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDerivedType_CHAR(), ecorePackage.getEObject(), null, "cHAR", null, 0, 1, DerivedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDerivedType_WORD(), ecorePackage.getEObject(), null, "wORD", null, 0, 1, DerivedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDerivedType_DWORD(), ecorePackage.getEObject(), null, "dWORD", null, 0, 1, DerivedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDerivedType_LWORD(), ecorePackage.getEObject(), null, "lWORD", null, 0, 1, DerivedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDerivedType_SINT(), ecorePackage.getEObject(), null, "sINT", null, 0, 1, DerivedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDerivedType_INT(), ecorePackage.getEObject(), null, "iNT", null, 0, 1, DerivedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDerivedType_DINT(), ecorePackage.getEObject(), null, "dINT", null, 0, 1, DerivedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDerivedType_LINT(), ecorePackage.getEObject(), null, "lINT", null, 0, 1, DerivedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDerivedType_USINT(), ecorePackage.getEObject(), null, "uSINT", null, 0, 1, DerivedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDerivedType_UINT(), ecorePackage.getEObject(), null, "uINT", null, 0, 1, DerivedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDerivedType_UDINT(), ecorePackage.getEObject(), null, "uDINT", null, 0, 1, DerivedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDerivedType_ULINT(), ecorePackage.getEObject(), null, "uLINT", null, 0, 1, DerivedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDerivedType_REAL(), ecorePackage.getEObject(), null, "rEAL", null, 0, 1, DerivedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDerivedType_LREAL(), ecorePackage.getEObject(), null, "lREAL", null, 0, 1, DerivedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDerivedType_STRING(), ecorePackage.getEObject(), null, "sTRING", null, 0, 1, DerivedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDerivedType_WSTRING(), ecorePackage.getEObject(), null, "wSTRING", null, 0, 1, DerivedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDerivedType_DataTypeIDRef(), this.getTDataTypeIDRef(), null, "dataTypeIDRef", null, 0, 1, DerivedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDerivedType_Description1(), theXMLTypePackage.getString(), "description1", null, 0, 1, DerivedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDerivedType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, DerivedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDerivedType_UniqueID(), theXMLTypePackage.getID(), "uniqueID", null, 1, 1, DerivedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(descriptionRefTypeEClass, DescriptionRefType.class, "DescriptionRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDescriptionRefType_Value(), theXMLTypePackage.getAnyURI(), "value", null, 0, 1, DescriptionRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDescriptionRefType_DictID(), theXMLTypePackage.getNMTOKEN(), "dictID", null, 1, 1, DescriptionRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDescriptionRefType_TextID(), theXMLTypePackage.getNMTOKEN(), "textID", null, 1, 1, DescriptionRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(descriptionTypeEClass, DescriptionType.class, "DescriptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDescriptionType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, DescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDescriptionType_Lang(), theXMLTypePackage.getLanguage(), "lang", null, 1, 1, DescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDescriptionType_URI(), theXMLTypePackage.getAnyURI(), "uRI", null, 0, 1, DescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dictionaryTypeEClass, DictionaryType.class, "DictionaryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDictionaryType_File(), this.getFileType(), null, "file", null, 1, 1, DictionaryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDictionaryType_DictID(), theXMLTypePackage.getToken(), "dictID", null, 1, 1, DictionaryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDictionaryType_Lang(), theXMLTypePackage.getLanguage(), "lang", null, 1, 1, DictionaryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_ISO15745ProfileContainer(), this.getISO15745ProfileContainerType(), null, "iSO15745ProfileContainer", null, 1, 1, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(dynamicChannelsTypeEClass, DynamicChannelsType.class, "DynamicChannelsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDynamicChannelsType_DynamicChannel(), this.getTDynamicChannel(), null, "dynamicChannel", null, 1, -1, DynamicChannelsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(enumTypeEClass, EnumType.class, "EnumType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEnumType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEnumType_Label(), this.getLabelType(), null, "label", null, 0, -1, EnumType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getEnumType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, EnumType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getEnumType_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, EnumType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getEnumType_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, EnumType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getEnumType_EnumValue(), this.getTEnumValue(), null, "enumValue", null, 1, -1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEnumType_BOOL(), ecorePackage.getEObject(), null, "bOOL", null, 0, 1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEnumType_BITSTRING(), ecorePackage.getEObject(), null, "bITSTRING", null, 0, 1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEnumType_BYTE(), ecorePackage.getEObject(), null, "bYTE", null, 0, 1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEnumType_CHAR(), ecorePackage.getEObject(), null, "cHAR", null, 0, 1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEnumType_WORD(), ecorePackage.getEObject(), null, "wORD", null, 0, 1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEnumType_DWORD(), ecorePackage.getEObject(), null, "dWORD", null, 0, 1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEnumType_LWORD(), ecorePackage.getEObject(), null, "lWORD", null, 0, 1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEnumType_SINT(), ecorePackage.getEObject(), null, "sINT", null, 0, 1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEnumType_INT(), ecorePackage.getEObject(), null, "iNT", null, 0, 1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEnumType_DINT(), ecorePackage.getEObject(), null, "dINT", null, 0, 1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEnumType_LINT(), ecorePackage.getEObject(), null, "lINT", null, 0, 1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEnumType_USINT(), ecorePackage.getEObject(), null, "uSINT", null, 0, 1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEnumType_UINT(), ecorePackage.getEObject(), null, "uINT", null, 0, 1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEnumType_UDINT(), ecorePackage.getEObject(), null, "uDINT", null, 0, 1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEnumType_ULINT(), ecorePackage.getEObject(), null, "uLINT", null, 0, 1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEnumType_REAL(), ecorePackage.getEObject(), null, "rEAL", null, 0, 1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEnumType_LREAL(), ecorePackage.getEObject(), null, "lREAL", null, 0, 1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEnumType_STRING(), ecorePackage.getEObject(), null, "sTRING", null, 0, 1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEnumType_WSTRING(), ecorePackage.getEObject(), null, "wSTRING", null, 0, 1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEnumType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEnumType_Size(), theXMLTypePackage.getString(), "size", null, 0, 1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEnumType_UniqueID(), theXMLTypePackage.getID(), "uniqueID", null, 1, 1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(errorBitDataTypeEClass, ErrorBitDataType.class, "ErrorBitDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getErrorBitDataType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ErrorBitDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getErrorBitDataType_Label(), this.getLabelType(), null, "label", null, 0, -1, ErrorBitDataType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getErrorBitDataType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, ErrorBitDataType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getErrorBitDataType_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, ErrorBitDataType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getErrorBitDataType_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, ErrorBitDataType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getErrorBitDataType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ErrorBitDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getErrorBitDataType_Offset(), this.getOffsetType(), "offset", null, 1, 1, ErrorBitDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(errorConstantDataTypeEClass, ErrorConstantDataType.class, "ErrorConstantDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getErrorConstantDataType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ErrorConstantDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getErrorConstantDataType_Label(), this.getLabelType(), null, "label", null, 0, -1, ErrorConstantDataType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getErrorConstantDataType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, ErrorConstantDataType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getErrorConstantDataType_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, ErrorConstantDataType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getErrorConstantDataType_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, ErrorConstantDataType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getErrorConstantDataType_AddInfo(), this.getAddInfoType(), null, "addInfo", null, 0, -1, ErrorConstantDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getErrorConstantDataType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ErrorConstantDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getErrorConstantDataType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, ErrorConstantDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(errorListTypeEClass, ErrorListType.class, "ErrorListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getErrorListType_Error(), this.getErrorConstantDataType(), null, "error", null, 1, -1, ErrorListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(fileTypeEClass, FileType.class, "FileType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFileType_URI(), theXMLTypePackage.getAnyURI(), "uRI", null, 1, 1, FileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(functionInstanceTypeEClass, FunctionInstanceType.class, "FunctionInstanceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFunctionInstanceType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, FunctionInstanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFunctionInstanceType_Label(), this.getLabelType(), null, "label", null, 0, -1, FunctionInstanceType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getFunctionInstanceType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, FunctionInstanceType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getFunctionInstanceType_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, FunctionInstanceType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getFunctionInstanceType_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, FunctionInstanceType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getFunctionInstanceType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, FunctionInstanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFunctionInstanceType_TypeIDRef(), theXMLTypePackage.getIDREF(), "typeIDRef", null, 1, 1, FunctionInstanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFunctionInstanceType_UniqueID(), theXMLTypePackage.getID(), "uniqueID", null, 1, 1, FunctionInstanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(functionTypeTypeEClass, FunctionTypeType.class, "FunctionTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFunctionTypeType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, FunctionTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFunctionTypeType_Label(), this.getLabelType(), null, "label", null, 0, -1, FunctionTypeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getFunctionTypeType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, FunctionTypeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getFunctionTypeType_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, FunctionTypeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getFunctionTypeType_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, FunctionTypeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getFunctionTypeType_VersionInfo(), this.getVersionInfoType(), null, "versionInfo", null, 1, -1, FunctionTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFunctionTypeType_InterfaceList(), this.getInterfaceListType(), null, "interfaceList", null, 1, 1, FunctionTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFunctionTypeType_FunctionInstanceList(), this.getTFunctionInstanceList(), null, "functionInstanceList", null, 0, 1, FunctionTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFunctionTypeType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, FunctionTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFunctionTypeType_Package(), theXMLTypePackage.getString(), "package", null, 0, 1, FunctionTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFunctionTypeType_UniqueID(), theXMLTypePackage.getID(), "uniqueID", null, 1, 1, FunctionTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(identityTypeEClass, IdentityType.class, "IdentityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getIdentityType_VendorID(), this.getTVendorID(), null, "vendorID", null, 0, 1, IdentityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIdentityType_DeviceFamily(), this.getTDeviceFamily(), null, "deviceFamily", null, 0, 1, IdentityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIdentityType_ProductID(), this.getTProductID(), null, "productID", null, 0, 1, IdentityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIdentityType_Version(), this.getTVersion(), null, "version", null, 0, -1, IdentityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIdentityType_BuildDate(), theXMLTypePackage.getDate(), "buildDate", null, 0, 1, IdentityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIdentityType_SpecificationRevision(), this.getTSpecificationRevision(), null, "specificationRevision", null, 0, 1, IdentityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(inputVarsTypeEClass, InputVarsType.class, "InputVarsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInputVarsType_VarDeclaration(), this.getTVarDeclaration(), null, "varDeclaration", null, 1, -1, InputVarsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(instanceIDRefTypeEClass, InstanceIDRefType.class, "InstanceIDRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getInstanceIDRefType_UniqueIDRef(), theXMLTypePackage.getIDREF(), "uniqueIDRef", null, 1, 1, InstanceIDRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(instanceNameTypeEClass, InstanceNameType.class, "InstanceNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getInstanceNameType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, InstanceNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInstanceNameType_ReadOnly(), theXMLTypePackage.getBoolean(), "readOnly", "false", 0, 1, InstanceNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(interfaceListTypeEClass, InterfaceListType.class, "InterfaceListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInterfaceListType_InputVars(), this.getInputVarsType(), null, "inputVars", null, 0, 1, InterfaceListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInterfaceListType_OutputVars(), this.getOutputVarsType(), null, "outputVars", null, 0, 1, InterfaceListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInterfaceListType_ConfigVars(), this.getConfigVarsType(), null, "configVars", null, 0, 1, InterfaceListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(iso15745ProfileContainerTypeEClass, ISO15745ProfileContainerType.class, "ISO15745ProfileContainerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getISO15745ProfileContainerType_ISO15745Profile(), this.getISO15745ProfileType(), null, "iSO15745Profile", null, 2, 2, ISO15745ProfileContainerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(iso15745ProfileTypeEClass, ISO15745ProfileType.class, "ISO15745ProfileType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getISO15745ProfileType_ProfileHeader(), this.getProfileHeaderDataType(), null, "profileHeader", null, 1, 1, ISO15745ProfileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getISO15745ProfileType_ProfileBody(), this.getProfileBodyDataType(), null, "profileBody", null, 1, 1, ISO15745ProfileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(iso15745ReferenceDataTypeEClass, ISO15745ReferenceDataType.class, "ISO15745ReferenceDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getISO15745ReferenceDataType_ISO15745Part(), theXMLTypePackage.getPositiveInteger(), "iSO15745Part", null, 1, 1, ISO15745ReferenceDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getISO15745ReferenceDataType_ISO15745Edition(), theXMLTypePackage.getPositiveInteger(), "iSO15745Edition", null, 1, 1, ISO15745ReferenceDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getISO15745ReferenceDataType_ProfileTechnology(), theXMLTypePackage.getString(), "profileTechnology", null, 1, 1, ISO15745ReferenceDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(labelRefTypeEClass, LabelRefType.class, "LabelRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLabelRefType_Value(), theXMLTypePackage.getAnyURI(), "value", null, 0, 1, LabelRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLabelRefType_DictID(), theXMLTypePackage.getNMTOKEN(), "dictID", null, 1, 1, LabelRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLabelRefType_TextID(), theXMLTypePackage.getNMTOKEN(), "textID", null, 1, 1, LabelRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(labelTypeEClass, LabelType.class, "LabelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLabelType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, LabelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLabelType_Lang(), theXMLTypePackage.getLanguage(), "lang", null, 1, 1, LabelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(ledListTypeEClass, LEDListType.class, "LEDListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getLEDListType_LED(), this.getTLED(), null, "lED", null, 1, -1, LEDListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLEDListType_CombinedState(), this.getTCombinedState(), null, "combinedState", null, 0, -1, LEDListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(leDstateRefTypeEClass, LEDstateRefType.class, "LEDstateRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLEDstateRefType_StateIDRef(), theXMLTypePackage.getIDREF(), "stateIDRef", null, 1, 1, LEDstateRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(leDstateTypeEClass, LEDstateType.class, "LEDstateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLEDstateType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, LEDstateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLEDstateType_Label(), this.getLabelType(), null, "label", null, 0, -1, LEDstateType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getLEDstateType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, LEDstateType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getLEDstateType_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, LEDstateType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getLEDstateType_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, LEDstateType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getLEDstateType_FlashingPeriod(), theXMLTypePackage.getUnsignedInt(), "flashingPeriod", null, 0, 1, LEDstateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLEDstateType_ImpulsWidth(), theXMLTypePackage.getUnsignedByte(), "impulsWidth", "50", 0, 1, LEDstateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLEDstateType_LEDcolor(), this.getLEDcolorType(), "lEDcolor", null, 1, 1, LEDstateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLEDstateType_NumberOfImpulses(), theXMLTypePackage.getUnsignedByte(), "numberOfImpulses", "1", 0, 1, LEDstateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLEDstateType_State(), this.getStateType(), "state", null, 1, 1, LEDstateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLEDstateType_UniqueID(), theXMLTypePackage.getID(), "uniqueID", null, 1, 1, LEDstateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(maxValueTypeEClass, MaxValueType.class, "MaxValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMaxValueType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, MaxValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMaxValueType_Label(), this.getLabelType(), null, "label", null, 0, -1, MaxValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getMaxValueType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, MaxValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getMaxValueType_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, MaxValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getMaxValueType_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, MaxValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getMaxValueType_Multiplier(), theXMLTypePackage.getString(), "multiplier", null, 0, 1, MaxValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMaxValueType_Offset(), theXMLTypePackage.getString(), "offset", null, 0, 1, MaxValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMaxValueType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, MaxValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(memberRefTypeEClass, MemberRefType.class, "MemberRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMemberRefType_Index(), theXMLTypePackage.getLong(), "index", null, 0, 1, MemberRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMemberRefType_UniqueIDRef(), theXMLTypePackage.getIDREF(), "uniqueIDRef", null, 0, 1, MemberRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(minValueTypeEClass, MinValueType.class, "MinValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMinValueType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, MinValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMinValueType_Label(), this.getLabelType(), null, "label", null, 0, -1, MinValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getMinValueType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, MinValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getMinValueType_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, MinValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getMinValueType_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, MinValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getMinValueType_Multiplier(), theXMLTypePackage.getString(), "multiplier", null, 0, 1, MinValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMinValueType_Offset(), theXMLTypePackage.getString(), "offset", null, 0, 1, MinValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMinValueType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, MinValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(objectListTypeEClass, ObjectListType.class, "ObjectListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getObjectListType_Object(), this.getTObject(), null, "object", null, 1, 65535, ObjectListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getObjectListType_MandatoryObjects(), theXMLTypePackage.getUnsignedInt(), "mandatoryObjects", null, 0, 1, ObjectListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getObjectListType_ManufacturerObjects(), theXMLTypePackage.getUnsignedInt(), "manufacturerObjects", null, 0, 1, ObjectListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getObjectListType_OptionalObjects(), theXMLTypePackage.getUnsignedInt(), "optionalObjects", null, 0, 1, ObjectListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(orderNumberTypeEClass, OrderNumberType.class, "OrderNumberType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getOrderNumberType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, OrderNumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOrderNumberType_ReadOnly(), theXMLTypePackage.getBoolean(), "readOnly", "true", 0, 1, OrderNumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(outputVarsTypeEClass, OutputVarsType.class, "OutputVarsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getOutputVarsType_VarDeclaration(), this.getTVarDeclaration(), null, "varDeclaration", null, 1, -1, OutputVarsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(parameterRefTypeEClass, ParameterRefType.class, "ParameterRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getParameterRefType_UniqueIDRef(), theXMLTypePackage.getIDREF(), "uniqueIDRef", null, 1, 1, ParameterRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(parameterTypeEClass, ParameterType.class, "ParameterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getParameterType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_Label(), this.getLabelType(), null, "label", null, 0, -1, ParameterType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, ParameterType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, ParameterType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, ParameterType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_BOOL(), ecorePackage.getEObject(), null, "bOOL", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_BITSTRING(), ecorePackage.getEObject(), null, "bITSTRING", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_BYTE(), ecorePackage.getEObject(), null, "bYTE", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_CHAR(), ecorePackage.getEObject(), null, "cHAR", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_WORD(), ecorePackage.getEObject(), null, "wORD", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_DWORD(), ecorePackage.getEObject(), null, "dWORD", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_LWORD(), ecorePackage.getEObject(), null, "lWORD", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_SINT(), ecorePackage.getEObject(), null, "sINT", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_INT(), ecorePackage.getEObject(), null, "iNT", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_DINT(), ecorePackage.getEObject(), null, "dINT", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_LINT(), ecorePackage.getEObject(), null, "lINT", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_USINT(), ecorePackage.getEObject(), null, "uSINT", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_UINT(), ecorePackage.getEObject(), null, "uINT", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_UDINT(), ecorePackage.getEObject(), null, "uDINT", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_ULINT(), ecorePackage.getEObject(), null, "uLINT", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_REAL(), ecorePackage.getEObject(), null, "rEAL", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_LREAL(), ecorePackage.getEObject(), null, "lREAL", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_STRING(), ecorePackage.getEObject(), null, "sTRING", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_WSTRING(), ecorePackage.getEObject(), null, "wSTRING", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_DataTypeIDRef(), this.getTDataTypeIDRef(), null, "dataTypeIDRef", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_VariableRef(), this.getTVariableRef(), null, "variableRef", null, 0, -1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_ConditionalSupport(), this.getTConditionalSupport(), null, "conditionalSupport", null, 0, -1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_Denotation(), this.getTDenotation(), null, "denotation", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_ActualValue(), this.getTValue(), null, "actualValue", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_DefaultValue(), this.getTValue(), null, "defaultValue", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_SubstituteValue(), this.getTValue(), null, "substituteValue", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_AllowedValues(), this.getTAllowedValues(), null, "allowedValues", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_Unit(), this.getTUnit(), null, "unit", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_Property(), this.getTProperty(), null, "property", null, 0, -1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getParameterType_Access(), this.getAccessType(), "access", "read", 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getParameterType_AccessList(), this.getAccessListType(), "accessList", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getParameterType_Multiplier(), theXMLTypePackage.getString(), "multiplier", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getParameterType_Offset(), theXMLTypePackage.getString(), "offset", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getParameterType_Persistent(), theXMLTypePackage.getBoolean(), "persistent", "false", 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getParameterType_Support(), this.getSupportType(), "support", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getParameterType_TemplateIDRef(), theXMLTypePackage.getIDREF(), "templateIDRef", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getParameterType_UniqueID(), theXMLTypePackage.getID(), "uniqueID", null, 1, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(pictureTypeEClass, PictureType.class, "PictureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPictureType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, PictureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPictureType_Label(), this.getLabelType(), null, "label", null, 0, -1, PictureType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getPictureType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, PictureType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getPictureType_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, PictureType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getPictureType_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, PictureType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getPictureType_Number(), theXMLTypePackage.getUnsignedInt(), "number", null, 0, 1, PictureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPictureType_URI(), theXMLTypePackage.getAnyURI(), "uRI", null, 1, 1, PictureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(productFamilyTypeEClass, ProductFamilyType.class, "ProductFamilyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProductFamilyType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, ProductFamilyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProductFamilyType_ReadOnly(), theXMLTypePackage.getBoolean(), "readOnly", "true", 0, 1, ProductFamilyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(productNameTypeEClass, ProductNameType.class, "ProductNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProductNameType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, ProductNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProductNameType_ReadOnly(), theXMLTypePackage.getBoolean(), "readOnly", "true", 0, 1, ProductNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(productTextTypeEClass, ProductTextType.class, "ProductTextType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProductTextType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ProductTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProductTextType_Label(), this.getLabelType(), null, "label", null, 0, -1, ProductTextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getProductTextType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, ProductTextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getProductTextType_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, ProductTextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getProductTextType_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, ProductTextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getProductTextType_ReadOnly(), theXMLTypePackage.getBoolean(), "readOnly", "true", 0, 1, ProductTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(profileBodyCommunicationNetworkPowerlinkEClass, ProfileBodyCommunicationNetworkPowerlink.class, "ProfileBodyCommunicationNetworkPowerlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getProfileBodyCommunicationNetworkPowerlink_ApplicationLayers(), this.getTApplicationLayers(), null, "applicationLayers", null, 0, 1, ProfileBodyCommunicationNetworkPowerlink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProfileBodyCommunicationNetworkPowerlink_TransportLayers(), this.getTTransportLayers(), null, "transportLayers", null, 0, 1, ProfileBodyCommunicationNetworkPowerlink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProfileBodyCommunicationNetworkPowerlink_NetworkManagement(), this.getTNetworkManagement(), null, "networkManagement", null, 0, 1, ProfileBodyCommunicationNetworkPowerlink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProfileBodyCommunicationNetworkPowerlink_ExternalProfileHandle(), this.getProfileHandleDataType(), null, "externalProfileHandle", null, 0, -1, ProfileBodyCommunicationNetworkPowerlink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(profileBodyDataTypeEClass, ProfileBodyDataType.class, "ProfileBodyDataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProfileBodyDataType_FileCreationDate(), theXMLTypePackage.getDate(), "fileCreationDate", null, 1, 1, ProfileBodyDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProfileBodyDataType_FileCreationTime(), theXMLTypePackage.getTime(), "fileCreationTime", null, 0, 1, ProfileBodyDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProfileBodyDataType_FileCreator(), theXMLTypePackage.getString(), "fileCreator", null, 1, 1, ProfileBodyDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProfileBodyDataType_FileModificationDate(), theXMLTypePackage.getDate(), "fileModificationDate", null, 0, 1, ProfileBodyDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProfileBodyDataType_FileModificationTime(), theXMLTypePackage.getTime(), "fileModificationTime", null, 0, 1, ProfileBodyDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProfileBodyDataType_FileModifiedBy(), theXMLTypePackage.getString(), "fileModifiedBy", null, 0, 1, ProfileBodyDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProfileBodyDataType_FileName(), theXMLTypePackage.getString(), "fileName", null, 1, 1, ProfileBodyDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProfileBodyDataType_FileVersion(), theXMLTypePackage.getString(), "fileVersion", null, 1, 1, ProfileBodyDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProfileBodyDataType_FormatName(), theXMLTypePackage.getString(), "formatName", "DDXML", 0, 1, ProfileBodyDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProfileBodyDataType_FormatVersion(), theXMLTypePackage.getString(), "formatVersion", "2.0", 0, 1, ProfileBodyDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProfileBodyDataType_SupportedLanguages(), this.getSupportedLanguagesType(), "supportedLanguages", null, 0, 1, ProfileBodyDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(profileBodyDevicePowerlinkEClass, ProfileBodyDevicePowerlink.class, "ProfileBodyDevicePowerlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getProfileBodyDevicePowerlink_DeviceIdentity(), this.getTDeviceIdentity(), null, "deviceIdentity", null, 0, 1, ProfileBodyDevicePowerlink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProfileBodyDevicePowerlink_DeviceManager(), this.getTDeviceManager(), null, "deviceManager", null, 0, 1, ProfileBodyDevicePowerlink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProfileBodyDevicePowerlink_DeviceFunction(), this.getTDeviceFunction(), null, "deviceFunction", null, 1, -1, ProfileBodyDevicePowerlink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProfileBodyDevicePowerlink_ApplicationProcess(), this.getTApplicationProcess(), null, "applicationProcess", null, 0, -1, ProfileBodyDevicePowerlink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProfileBodyDevicePowerlink_ExternalProfileHandle(), this.getProfileHandleDataType(), null, "externalProfileHandle", null, 0, -1, ProfileBodyDevicePowerlink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProfileBodyDevicePowerlink_DeviceClass(), this.getDeviceClassType(), "deviceClass", null, 0, 1, ProfileBodyDevicePowerlink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(profileHandleDataTypeEClass, ProfileHandleDataType.class, "ProfileHandleDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProfileHandleDataType_ProfileIdentification(), theXMLTypePackage.getString(), "profileIdentification", null, 1, 1, ProfileHandleDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProfileHandleDataType_ProfileRevision(), theXMLTypePackage.getString(), "profileRevision", null, 1, 1, ProfileHandleDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProfileHandleDataType_ProfileLocation(), theXMLTypePackage.getAnyURI(), "profileLocation", null, 0, 1, ProfileHandleDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(profileHeaderDataTypeEClass, ProfileHeaderDataType.class, "ProfileHeaderDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProfileHeaderDataType_ProfileIdentification(), theXMLTypePackage.getString(), "profileIdentification", null, 1, 1, ProfileHeaderDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProfileHeaderDataType_ProfileRevision(), theXMLTypePackage.getString(), "profileRevision", null, 1, 1, ProfileHeaderDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProfileHeaderDataType_ProfileName(), theXMLTypePackage.getString(), "profileName", null, 1, 1, ProfileHeaderDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProfileHeaderDataType_ProfileSource(), theXMLTypePackage.getString(), "profileSource", null, 1, 1, ProfileHeaderDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProfileHeaderDataType_ProfileClassID(), this.getProfileClassIDDataType(), "profileClassID", null, 1, 1, ProfileHeaderDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProfileHeaderDataType_ProfileDate(), theXMLTypePackage.getDate(), "profileDate", null, 0, 1, ProfileHeaderDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProfileHeaderDataType_AdditionalInformation(), theXMLTypePackage.getAnyURI(), "additionalInformation", null, 0, 1, ProfileHeaderDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProfileHeaderDataType_ISO15745Reference(), this.getISO15745ReferenceDataType(), null, "iSO15745Reference", null, 1, 1, ProfileHeaderDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProfileHeaderDataType_IASInterfaceType(), this.getIASInterfaceDataType(), "iASInterfaceType", null, 0, -1, ProfileHeaderDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(standardComplianceListTypeEClass, StandardComplianceListType.class, "StandardComplianceListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getStandardComplianceListType_CompliantWith(), this.getCompliantWithType(), null, "compliantWith", null, 1, -1, StandardComplianceListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(staticErrorBitFieldTypeEClass, StaticErrorBitFieldType.class, "StaticErrorBitFieldType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getStaticErrorBitFieldType_ErrorBit(), this.getErrorBitDataType(), null, "errorBit", null, 1, 64, StaticErrorBitFieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(stepTypeEClass, StepType.class, "StepType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getStepType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, StepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getStepType_Label(), this.getLabelType(), null, "label", null, 0, -1, StepType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getStepType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, StepType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getStepType_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, StepType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getStepType_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, StepType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getStepType_Multiplier(), theXMLTypePackage.getString(), "multiplier", null, 0, 1, StepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getStepType_Offset(), theXMLTypePackage.getString(), "offset", null, 0, 1, StepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getStepType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, StepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(structTypeEClass, StructType.class, "StructType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getStructType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, StructType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getStructType_Label(), this.getLabelType(), null, "label", null, 0, -1, StructType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getStructType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, StructType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getStructType_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, StructType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getStructType_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, StructType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getStructType_VarDeclaration(), this.getTVarDeclaration(), null, "varDeclaration", null, 1, -1, StructType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getStructType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, StructType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getStructType_UniqueID(), theXMLTypePackage.getID(), "uniqueID", null, 1, 1, StructType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(subObjectTypeEClass, SubObjectType.class, "SubObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSubObjectType_AccessType(), this.getTObjectAccessType(), "accessType", null, 0, 1, SubObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSubObjectType_ActualValue(), theXMLTypePackage.getString(), "actualValue", null, 0, 1, SubObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSubObjectType_DataType(), theXMLTypePackage.getHexBinary(), "dataType", null, 0, 1, SubObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSubObjectType_DefaultValue(), theXMLTypePackage.getString(), "defaultValue", null, 0, 1, SubObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSubObjectType_Denotation(), theXMLTypePackage.getString(), "denotation", null, 0, 1, SubObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSubObjectType_HighLimit(), theXMLTypePackage.getString(), "highLimit", null, 0, 1, SubObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSubObjectType_LowLimit(), theXMLTypePackage.getString(), "lowLimit", null, 0, 1, SubObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSubObjectType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, SubObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSubObjectType_ObjectType(), theXMLTypePackage.getUnsignedByte(), "objectType", null, 1, 1, SubObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSubObjectType_ObjFlags(), theXMLTypePackage.getHexBinary(), "objFlags", null, 0, 1, SubObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSubObjectType_PDOmapping(), this.getTObjectPDOMapping(), "pDOmapping", null, 0, 1, SubObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSubObjectType_SubIndex(), theXMLTypePackage.getHexBinary(), "subIndex", null, 1, 1, SubObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSubObjectType_UniqueIDRef(), theXMLTypePackage.getIDREF(), "uniqueIDRef", null, 0, 1, SubObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tAllowedValuesEClass, TAllowedValues.class, "TAllowedValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTAllowedValues_Value(), this.getTValue(), null, "value", null, 0, -1, TAllowedValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTAllowedValues_Range(), this.getTRange(), null, "range", null, 0, -1, TAllowedValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTAllowedValues_TemplateIDRef(), theXMLTypePackage.getIDREF(), "templateIDRef", null, 0, 1, TAllowedValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tAllowedValuesTemplateEClass, TAllowedValuesTemplate.class, "TAllowedValuesTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTAllowedValuesTemplate_Value(), this.getTValue(), null, "value", null, 0, -1, TAllowedValuesTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTAllowedValuesTemplate_Range(), this.getTRange(), null, "range", null, 0, -1, TAllowedValuesTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTAllowedValuesTemplate_UniqueID(), theXMLTypePackage.getID(), "uniqueID", null, 1, 1, TAllowedValuesTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tApplicationLayersEClass, TApplicationLayers.class, "TApplicationLayers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTApplicationLayers_Identity(), this.getIdentityType(), null, "identity", null, 0, 1, TApplicationLayers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTApplicationLayers_DataTypeList(), this.getDataTypeListType(), null, "dataTypeList", null, 1, 1, TApplicationLayers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTApplicationLayers_ObjectList(), this.getObjectListType(), null, "objectList", null, 1, 1, TApplicationLayers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTApplicationLayers_DynamicChannels(), this.getDynamicChannelsType(), null, "dynamicChannels", null, 0, 1, TApplicationLayers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTApplicationLayers_CommunicationEntityType(), theXMLTypePackage.getNMTOKENS(), "communicationEntityType", "slave", 0, 1, TApplicationLayers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTApplicationLayers_ConformanceClass(), theXMLTypePackage.getString(), "conformanceClass", null, 0, 1, TApplicationLayers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tApplicationProcessEClass, TApplicationProcess.class, "TApplicationProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTApplicationProcess_DataTypeList(), this.getTDataTypeList(), null, "dataTypeList", null, 0, 1, TApplicationProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTApplicationProcess_FunctionTypeList(), this.getTFunctionTypeList(), null, "functionTypeList", null, 0, 1, TApplicationProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTApplicationProcess_FunctionInstanceList(), this.getTFunctionInstanceList(), null, "functionInstanceList", null, 0, 1, TApplicationProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTApplicationProcess_TemplateList(), this.getTTemplateList(), null, "templateList", null, 0, 1, TApplicationProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTApplicationProcess_ParameterList(), this.getTParameterList(), null, "parameterList", null, 1, 1, TApplicationProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTApplicationProcess_ParameterGroupList(), this.getTParameterGroupList(), null, "parameterGroupList", null, 0, 1, TApplicationProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tCapabilitiesEClass, TCapabilities.class, "TCapabilities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTCapabilities_CharacteristicsList(), this.getCharacteristicsListType(), null, "characteristicsList", null, 1, -1, TCapabilities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTCapabilities_StandardComplianceList(), this.getStandardComplianceListType(), null, "standardComplianceList", null, 0, 1, TCapabilities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tcnFeaturesEClass, TCNFeatures.class, "TCNFeatures", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTCNFeatures_DLLCNFeatureMultiplex(), theXMLTypePackage.getBoolean(), "dLLCNFeatureMultiplex", "false", 0, 1, TCNFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTCNFeatures_DLLCNPResChaining(), theXMLTypePackage.getBoolean(), "dLLCNPResChaining", "false", 0, 1, TCNFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTCNFeatures_NMTCNSoC2PReq(), theXMLTypePackage.getUnsignedInt(), "nMTCNSoC2PReq", null, 1, 1, TCNFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tCombinedStateEClass, TCombinedState.class, "TCombinedState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTCombinedState_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TCombinedState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTCombinedState_Label(), this.getLabelType(), null, "label", null, 0, -1, TCombinedState.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTCombinedState_Description(), this.getDescriptionType(), null, "description", null, 0, -1, TCombinedState.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTCombinedState_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, TCombinedState.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTCombinedState_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, TCombinedState.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTCombinedState_LEDstateRef(), this.getLEDstateRefType(), null, "lEDstateRef", null, 2, -1, TCombinedState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tConditionalSupportEClass, TConditionalSupport.class, "TConditionalSupport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTConditionalSupport_ParamIDRef(), theXMLTypePackage.getIDREF(), "paramIDRef", null, 1, 1, TConditionalSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tCountEClass, TCount.class, "TCount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTCount_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTCount_Label(), this.getLabelType(), null, "label", null, 0, -1, TCount.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTCount_Description(), this.getDescriptionType(), null, "description", null, 0, -1, TCount.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTCount_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, TCount.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTCount_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, TCount.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTCount_DefaultValue(), this.getTValue(), null, "defaultValue", null, 1, 1, TCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTCount_AllowedValues(), this.getTAllowedValues(), null, "allowedValues", null, 0, 1, TCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTCount_Access(), this.getAccessType1(), "access", "read", 0, 1, TCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTCount_UniqueID(), theXMLTypePackage.getID(), "uniqueID", null, 1, 1, TCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tDataTypeIDRefEClass, TDataTypeIDRef.class, "TDataTypeIDRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTDataTypeIDRef_UniqueIDRef(), theXMLTypePackage.getIDREF(), "uniqueIDRef", null, 1, 1, TDataTypeIDRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tDataTypeListEClass, TDataTypeList.class, "TDataTypeList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTDataTypeList_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TDataTypeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypeList_Array(), this.getArrayType(), null, "array", null, 0, -1, TDataTypeList.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypeList_Struct(), this.getStructType(), null, "struct", null, 0, -1, TDataTypeList.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypeList_Enum(), this.getEnumType(), null, "enum", null, 0, -1, TDataTypeList.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypeList_Derived(), this.getDerivedType(), null, "derived", null, 0, -1, TDataTypeList.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(tDataTypesEClass, TDataTypes.class, "TDataTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTDataTypes_Boolean(), this.getTDataTypes(), null, "boolean", null, 0, 1, TDataTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypes_Integer8(), this.getTDataTypes(), null, "integer8", null, 0, 1, TDataTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypes_Integer16(), this.getTDataTypes(), null, "integer16", null, 0, 1, TDataTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypes_Integer32(), this.getTDataTypes(), null, "integer32", null, 0, 1, TDataTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypes_Integer24(), this.getTDataTypes(), null, "integer24", null, 0, 1, TDataTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypes_Integer40(), this.getTDataTypes(), null, "integer40", null, 0, 1, TDataTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypes_Integer48(), this.getTDataTypes(), null, "integer48", null, 0, 1, TDataTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypes_Integer56(), this.getTDataTypes(), null, "integer56", null, 0, 1, TDataTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypes_Integer64(), this.getTDataTypes(), null, "integer64", null, 0, 1, TDataTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypes_Unsigned8(), this.getTDataTypes(), null, "unsigned8", null, 0, 1, TDataTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypes_Unsigned16(), this.getTDataTypes(), null, "unsigned16", null, 0, 1, TDataTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypes_Unsigned32(), this.getTDataTypes(), null, "unsigned32", null, 0, 1, TDataTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypes_Unsigned24(), this.getTDataTypes(), null, "unsigned24", null, 0, 1, TDataTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypes_Unsigned40(), this.getTDataTypes(), null, "unsigned40", null, 0, 1, TDataTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypes_Unsigned48(), this.getTDataTypes(), null, "unsigned48", null, 0, 1, TDataTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypes_Unsigned56(), this.getTDataTypes(), null, "unsigned56", null, 0, 1, TDataTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypes_Unsigned64(), this.getTDataTypes(), null, "unsigned64", null, 0, 1, TDataTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypes_Real32(), this.getTDataTypes(), null, "real32", null, 0, 1, TDataTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypes_Real64(), this.getTDataTypes(), null, "real64", null, 0, 1, TDataTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypes_VisibleString(), this.getTDataTypes(), null, "visibleString", null, 0, 1, TDataTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypes_OctetString(), this.getTDataTypes(), null, "octetString", null, 0, 1, TDataTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypes_UnicodeString(), this.getTDataTypes(), null, "unicodeString", null, 0, 1, TDataTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypes_TimeOfDay(), this.getTDataTypes(), null, "timeOfDay", null, 0, 1, TDataTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypes_TimeDiff(), this.getTDataTypes(), null, "timeDiff", null, 0, 1, TDataTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypes_Domain(), this.getTDataTypes(), null, "domain", null, 0, 1, TDataTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypes_MACADDRESS(), this.getTDataTypes(), null, "mACADDRESS", null, 0, 1, TDataTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypes_IPADDRESS(), this.getTDataTypes(), null, "iPADDRESS", null, 0, 1, TDataTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDataTypes_NETTIME(), this.getTDataTypes(), null, "nETTIME", null, 0, 1, TDataTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTDataTypes_DataType(), theXMLTypePackage.getHexBinary(), "dataType", null, 1, 1, TDataTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tDenotationEClass, TDenotation.class, "TDenotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTDenotation_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TDenotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDenotation_Label(), this.getLabelType(), null, "label", null, 0, -1, TDenotation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTDenotation_Description(), this.getDescriptionType(), null, "description", null, 0, -1, TDenotation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTDenotation_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, TDenotation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTDenotation_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, TDenotation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(tDeviceCommissioningEClass, TDeviceCommissioning.class, "TDeviceCommissioning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTDeviceCommissioning_NetworkName(), theXMLTypePackage.getString(), "networkName", null, 1, 1, TDeviceCommissioning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTDeviceCommissioning_NodeID(), theXMLTypePackage.getUnsignedByte(), "nodeID", null, 1, 1, TDeviceCommissioning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTDeviceCommissioning_NodeName(), theXMLTypePackage.getString(), "nodeName", null, 1, 1, TDeviceCommissioning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTDeviceCommissioning_NodeType(), this.getNodeTypeType(), "nodeType", null, 1, 1, TDeviceCommissioning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTDeviceCommissioning_UsedNetworkInterface(), theXMLTypePackage.getUnsignedByte(), "usedNetworkInterface", "0", 0, 1, TDeviceCommissioning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tDeviceFamilyEClass, TDeviceFamily.class, "TDeviceFamily", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTDeviceFamily_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TDeviceFamily.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDeviceFamily_Label(), this.getLabelType(), null, "label", null, 0, -1, TDeviceFamily.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTDeviceFamily_Description(), this.getDescriptionType(), null, "description", null, 0, -1, TDeviceFamily.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTDeviceFamily_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, TDeviceFamily.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTDeviceFamily_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, TDeviceFamily.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getTDeviceFamily_ReadOnly(), theXMLTypePackage.getBoolean(), "readOnly", "true", 0, 1, TDeviceFamily.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tDeviceFunctionEClass, TDeviceFunction.class, "TDeviceFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTDeviceFunction_Capabilities(), this.getTCapabilities(), null, "capabilities", null, 1, 1, TDeviceFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDeviceFunction_PicturesList(), this.getTPicturesList(), null, "picturesList", null, 0, 1, TDeviceFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDeviceFunction_DictionaryList(), this.getTDictionaryList(), null, "dictionaryList", null, 0, 1, TDeviceFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tDeviceIdentityEClass, TDeviceIdentity.class, "TDeviceIdentity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTDeviceIdentity_VendorName(), this.getVendorNameType(), null, "vendorName", null, 1, 1, TDeviceIdentity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDeviceIdentity_VendorID(), this.getTVendorID(), null, "vendorID", null, 0, 1, TDeviceIdentity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDeviceIdentity_VendorText(), this.getVendorTextType(), null, "vendorText", null, 0, 1, TDeviceIdentity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDeviceIdentity_DeviceFamily(), this.getTDeviceFamily(), null, "deviceFamily", null, 0, 1, TDeviceIdentity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDeviceIdentity_ProductFamily(), this.getProductFamilyType(), null, "productFamily", null, 0, 1, TDeviceIdentity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDeviceIdentity_ProductName(), this.getProductNameType(), null, "productName", null, 1, 1, TDeviceIdentity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDeviceIdentity_ProductID(), this.getTProductID(), null, "productID", null, 0, 1, TDeviceIdentity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDeviceIdentity_ProductText(), this.getProductTextType(), null, "productText", null, 0, 1, TDeviceIdentity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDeviceIdentity_OrderNumber(), this.getOrderNumberType(), null, "orderNumber", null, 0, -1, TDeviceIdentity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDeviceIdentity_Version(), this.getTVersion(), null, "version", null, 0, -1, TDeviceIdentity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTDeviceIdentity_BuildDate(), theXMLTypePackage.getDate(), "buildDate", null, 0, 1, TDeviceIdentity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDeviceIdentity_SpecificationRevision(), this.getTSpecificationRevision(), null, "specificationRevision", null, 0, 1, TDeviceIdentity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDeviceIdentity_InstanceName(), this.getInstanceNameType(), null, "instanceName", null, 0, 1, TDeviceIdentity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tDeviceManagerEClass, TDeviceManager.class, "TDeviceManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTDeviceManager_IndicatorList(), this.getTIndicatorList(), null, "indicatorList", null, 0, 1, TDeviceManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tDiagnosticEClass, TDiagnostic.class, "TDiagnostic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTDiagnostic_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TDiagnostic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTDiagnostic_ErrorList(), this.getErrorListType(), null, "errorList", null, 0, -1, TDiagnostic.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTDiagnostic_StaticErrorBitField(), this.getStaticErrorBitFieldType(), null, "staticErrorBitField", null, 0, -1, TDiagnostic.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(tDictionaryListEClass, TDictionaryList.class, "TDictionaryList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTDictionaryList_Dictionary(), this.getDictionaryType(), null, "dictionary", null, 1, -1, TDictionaryList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tDynamicChannelEClass, TDynamicChannel.class, "TDynamicChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTDynamicChannel_AccessType(), this.getAccessTypeType(), "accessType", null, 1, 1, TDynamicChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTDynamicChannel_AddressOffset(), theXMLTypePackage.getHexBinary(), "addressOffset", null, 1, 1, TDynamicChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTDynamicChannel_BitAlignment(), theXMLTypePackage.getUnsignedByte(), "bitAlignment", null, 0, 1, TDynamicChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTDynamicChannel_DataType(), theXMLTypePackage.getHexBinary(), "dataType", null, 1, 1, TDynamicChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTDynamicChannel_EndIndex(), theXMLTypePackage.getHexBinary(), "endIndex", null, 1, 1, TDynamicChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTDynamicChannel_MaxNumber(), theXMLTypePackage.getUnsignedInt(), "maxNumber", null, 1, 1, TDynamicChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTDynamicChannel_StartIndex(), theXMLTypePackage.getHexBinary(), "startIndex", null, 1, 1, TDynamicChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tEnumValueEClass, TEnumValue.class, "TEnumValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTEnumValue_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TEnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTEnumValue_Label(), this.getLabelType(), null, "label", null, 0, -1, TEnumValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTEnumValue_Description(), this.getDescriptionType(), null, "description", null, 0, -1, TEnumValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTEnumValue_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, TEnumValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTEnumValue_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, TEnumValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getTEnumValue_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, TEnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(textEntryTypeEClass, TextEntryType.class, "TextEntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTextEntryType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, TextEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTextEntryType_TextID(), theXMLTypePackage.getID(), "textID", null, 1, 1, TextEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(textResourceTypeEClass, TextResourceType.class, "TextResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTextResourceType_TextEntry(), this.getTextEntryType(), null, "textEntry", null, 1, -1, TextResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTextResourceType_Lang(), theXMLTypePackage.getLanguage(), "lang", null, 1, 1, TextResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tFunctionInstanceListEClass, TFunctionInstanceList.class, "TFunctionInstanceList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTFunctionInstanceList_FunctionInstance(), this.getFunctionInstanceType(), null, "functionInstance", null, 1, -1, TFunctionInstanceList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTFunctionInstanceList_Connection(), this.getConnectionType(), null, "connection", null, 0, -1, TFunctionInstanceList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tFunctionTypeListEClass, TFunctionTypeList.class, "TFunctionTypeList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTFunctionTypeList_FunctionType(), this.getFunctionTypeType(), null, "functionType", null, 1, -1, TFunctionTypeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tGeneralFeaturesEClass, TGeneralFeatures.class, "TGeneralFeatures", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTGeneralFeatures_CFMConfigManager(), theXMLTypePackage.getBoolean(), "cFMConfigManager", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_DLLErrBadPhysMode(), theXMLTypePackage.getBoolean(), "dLLErrBadPhysMode", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_DLLErrMacBuffer(), theXMLTypePackage.getBoolean(), "dLLErrMacBuffer", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_DLLFeatureCN(), theXMLTypePackage.getBoolean(), "dLLFeatureCN", "true", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_DLLFeatureMN(), theXMLTypePackage.getBoolean(), "dLLFeatureMN", null, 1, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_NMTBootTimeNotActive(), theXMLTypePackage.getUnsignedInt(), "nMTBootTimeNotActive", null, 1, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_NMTCycleTimeGranularity(), theXMLTypePackage.getUnsignedInt(), "nMTCycleTimeGranularity", "1", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_NMTCycleTimeMax(), theXMLTypePackage.getUnsignedInt(), "nMTCycleTimeMax", null, 1, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_NMTCycleTimeMin(), theXMLTypePackage.getUnsignedInt(), "nMTCycleTimeMin", null, 1, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_NMTEmergencyQueueSize(), theXMLTypePackage.getUnsignedInt(), "nMTEmergencyQueueSize", "0", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_NMTErrorEntries(), theXMLTypePackage.getUnsignedInt(), "nMTErrorEntries", null, 1, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_NMTFlushArpEntry(), theXMLTypePackage.getBoolean(), "nMTFlushArpEntry", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_NMTMaxCNNodeID(), theXMLTypePackage.getUnsignedByte(), "nMTMaxCNNodeID", "239", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_NMTMaxCNNumber(), theXMLTypePackage.getUnsignedByte(), "nMTMaxCNNumber", "239", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_NMTMaxHeartbeats(), theXMLTypePackage.getUnsignedByte(), "nMTMaxHeartbeats", "254", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_NMTMinRedCycleTime(), theXMLTypePackage.getUnsignedInt(), "nMTMinRedCycleTime", "0", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_NMTNetHostNameSet(), theXMLTypePackage.getBoolean(), "nMTNetHostNameSet", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_NMTNodeIDByHW(), theXMLTypePackage.getBoolean(), "nMTNodeIDByHW", "true", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_NMTProductCode(), theXMLTypePackage.getUnsignedInt(), "nMTProductCode", "0", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_NMTPublishActiveNodes(), theXMLTypePackage.getBoolean(), "nMTPublishActiveNodes", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_NMTPublishConfigNodes(), theXMLTypePackage.getBoolean(), "nMTPublishConfigNodes", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_NMTPublishEmergencyNew(), theXMLTypePackage.getBoolean(), "nMTPublishEmergencyNew", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_NMTPublishNodeState(), theXMLTypePackage.getBoolean(), "nMTPublishNodeState", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_NMTPublishOperational(), theXMLTypePackage.getBoolean(), "nMTPublishOperational", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_NMTPublishPreOp1(), theXMLTypePackage.getBoolean(), "nMTPublishPreOp1", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_NMTPublishPreOp2(), theXMLTypePackage.getBoolean(), "nMTPublishPreOp2", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_NMTPublishReadyToOp(), theXMLTypePackage.getBoolean(), "nMTPublishReadyToOp", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_NMTPublishStopped(), theXMLTypePackage.getBoolean(), "nMTPublishStopped", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_NMTPublishTime(), theXMLTypePackage.getBoolean(), "nMTPublishTime", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_NMTRevisionNo(), theXMLTypePackage.getUnsignedInt(), "nMTRevisionNo", "0", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_NWLForward(), theXMLTypePackage.getBoolean(), "nWLForward", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_NWLICMPSupport(), theXMLTypePackage.getBoolean(), "nWLICMPSupport", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_NWLIPSupport(), theXMLTypePackage.getBoolean(), "nWLIPSupport", "true", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_PDOGranularity(), theXMLTypePackage.getUnsignedByte(), "pDOGranularity", "8", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_PDOMaxDescrMem(), theXMLTypePackage.getUnsignedInt(), "pDOMaxDescrMem", "4294967295", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_PDORPDOChannelObjects(), theXMLTypePackage.getUnsignedByte(), "pDORPDOChannelObjects", "254", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_PDORPDOChannels(), theXMLTypePackage.getUnsignedShort(), "pDORPDOChannels", "256", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_PDORPDOCycleDataLim(), theXMLTypePackage.getUnsignedInt(), "pDORPDOCycleDataLim", "4294967295", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_PDORPDOOverallObjects(), theXMLTypePackage.getUnsignedShort(), "pDORPDOOverallObjects", "65535", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_PDOSelfReceipt(), theXMLTypePackage.getBoolean(), "pDOSelfReceipt", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_PDOTPDOChannelObjects(), theXMLTypePackage.getUnsignedByte(), "pDOTPDOChannelObjects", "254", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_PDOTPDOCycleDataLim(), theXMLTypePackage.getUnsignedInt(), "pDOTPDOCycleDataLim", "4294967295", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_PDOTPDOOverallObjects(), theXMLTypePackage.getUnsignedShort(), "pDOTPDOOverallObjects", "65535", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_PHYExtEPLPorts(), theXMLTypePackage.getUnsignedByte(), "pHYExtEPLPorts", "1", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_PHYHubDelay(), theXMLTypePackage.getUnsignedInt(), "pHYHubDelay", "460", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_PHYHubIntegrated(), theXMLTypePackage.getBoolean(), "pHYHubIntegrated", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_PHYHubJitter(), theXMLTypePackage.getUnsignedInt(), "pHYHubJitter", "70", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_RT1RT1SecuritySupport(), theXMLTypePackage.getBoolean(), "rT1RT1SecuritySupport", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_RT1RT1Support(), theXMLTypePackage.getBoolean(), "rT1RT1Support", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_RT2RT2Support(), theXMLTypePackage.getBoolean(), "rT2RT2Support", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_SDOClient(), theXMLTypePackage.getBoolean(), "sDOClient", "true", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_SDOCmdFileRead(), theXMLTypePackage.getBoolean(), "sDOCmdFileRead", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_SDOCmdFileWrite(), theXMLTypePackage.getBoolean(), "sDOCmdFileWrite", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_SDOCmdLinkName(), theXMLTypePackage.getBoolean(), "sDOCmdLinkName", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_SDOCmdReadAllByIndex(), theXMLTypePackage.getBoolean(), "sDOCmdReadAllByIndex", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_SDOCmdReadByName(), theXMLTypePackage.getBoolean(), "sDOCmdReadByName", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_SDOCmdReadMultParam(), theXMLTypePackage.getBoolean(), "sDOCmdReadMultParam", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_SDOCmdWriteAllByIndex(), theXMLTypePackage.getBoolean(), "sDOCmdWriteAllByIndex", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_SDOCmdWriteByName(), theXMLTypePackage.getBoolean(), "sDOCmdWriteByName", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_SDOCmdWriteMultParam(), theXMLTypePackage.getBoolean(), "sDOCmdWriteMultParam", "false", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_SDOMaxConnections(), theXMLTypePackage.getUnsignedInt(), "sDOMaxConnections", "1", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_SDOMaxParallelConnections(), theXMLTypePackage.getUnsignedInt(), "sDOMaxParallelConnections", "1", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_SDOSeqLayerTxHistorySize(), theXMLTypePackage.getUnsignedShort(), "sDOSeqLayerTxHistorySize", "5", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTGeneralFeatures_SDOServer(), theXMLTypePackage.getBoolean(), "sDOServer", "true", 0, 1, TGeneralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tIndicatorListEClass, TIndicatorList.class, "TIndicatorList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTIndicatorList_LEDList(), this.getLEDListType(), null, "lEDList", null, 0, 1, TIndicatorList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tledEClass, com.br_automation.buoat.xddeditor.XDD.TLED.class, "TLED", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTLED_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, com.br_automation.buoat.xddeditor.XDD.TLED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTLED_Label(), this.getLabelType(), null, "label", null, 0, -1, com.br_automation.buoat.xddeditor.XDD.TLED.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTLED_Description(), this.getDescriptionType(), null, "description", null, 0, -1, com.br_automation.buoat.xddeditor.XDD.TLED.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTLED_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, com.br_automation.buoat.xddeditor.XDD.TLED.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTLED_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, com.br_automation.buoat.xddeditor.XDD.TLED.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTLED_LEDstate(), this.getLEDstateType(), null, "lEDstate", null, 1, -1, com.br_automation.buoat.xddeditor.XDD.TLED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTLED_LEDcolors(), this.getLEDcolorsType(), "lEDcolors", null, 1, 1, com.br_automation.buoat.xddeditor.XDD.TLED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTLED_LEDtype(), this.getLEDtypeType(), "lEDtype", null, 0, 1, com.br_automation.buoat.xddeditor.XDD.TLED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tmnFeaturesEClass, TMNFeatures.class, "TMNFeatures", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTMNFeatures_DLLErrMNMultipleMN(), theXMLTypePackage.getBoolean(), "dLLErrMNMultipleMN", "false", 0, 1, TMNFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTMNFeatures_DLLMNFeatureMultiplex(), theXMLTypePackage.getBoolean(), "dLLMNFeatureMultiplex", "true", 0, 1, TMNFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTMNFeatures_DLLMNFeaturePResTx(), theXMLTypePackage.getBoolean(), "dLLMNFeaturePResTx", "true", 0, 1, TMNFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTMNFeatures_DLLMNPResChaining(), theXMLTypePackage.getBoolean(), "dLLMNPResChaining", "false", 0, 1, TMNFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTMNFeatures_NMTMNASnd2SoC(), theXMLTypePackage.getUnsignedInt(), "nMTMNASnd2SoC", null, 1, 1, TMNFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTMNFeatures_NMTMNBasicEthernet(), theXMLTypePackage.getBoolean(), "nMTMNBasicEthernet", "false", 0, 1, TMNFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTMNFeatures_NMTMNMultiplCycMax(), theXMLTypePackage.getUnsignedByte(), "nMTMNMultiplCycMax", "0", 0, 1, TMNFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTMNFeatures_NMTMNPRes2PReq(), theXMLTypePackage.getUnsignedInt(), "nMTMNPRes2PReq", null, 1, 1, TMNFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTMNFeatures_NMTMNPRes2PRes(), theXMLTypePackage.getUnsignedInt(), "nMTMNPRes2PRes", null, 1, 1, TMNFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTMNFeatures_NMTMNPResRx2SoA(), theXMLTypePackage.getUnsignedInt(), "nMTMNPResRx2SoA", null, 1, 1, TMNFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTMNFeatures_NMTMNPResTx2SoA(), theXMLTypePackage.getUnsignedInt(), "nMTMNPResTx2SoA", null, 1, 1, TMNFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTMNFeatures_NMTMNSoA2ASndTx(), theXMLTypePackage.getUnsignedInt(), "nMTMNSoA2ASndTx", null, 1, 1, TMNFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTMNFeatures_NMTMNSoC2PReq(), theXMLTypePackage.getUnsignedInt(), "nMTMNSoC2PReq", null, 1, 1, TMNFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTMNFeatures_NMTNetTime(), theXMLTypePackage.getBoolean(), "nMTNetTime", "false", 0, 1, TMNFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTMNFeatures_NMTNetTimeIsRealTime(), theXMLTypePackage.getBoolean(), "nMTNetTimeIsRealTime", "false", 0, 1, TMNFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTMNFeatures_NMTRelativeTime(), theXMLTypePackage.getBoolean(), "nMTRelativeTime", "false", 0, 1, TMNFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTMNFeatures_NMTSimpleBoot(), theXMLTypePackage.getBoolean(), "nMTSimpleBoot", null, 1, 1, TMNFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTMNFeatures_PDOTPDOChannels(), theXMLTypePackage.getUnsignedShort(), "pDOTPDOChannels", "256", 0, 1, TMNFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tNetworkManagementEClass, TNetworkManagement.class, "TNetworkManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTNetworkManagement_GeneralFeatures(), this.getTGeneralFeatures(), null, "generalFeatures", null, 1, 1, TNetworkManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTNetworkManagement_MNFeatures(), this.getTMNFeatures(), null, "mNFeatures", null, 0, 1, TNetworkManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTNetworkManagement_CNFeatures(), this.getTCNFeatures(), null, "cNFeatures", null, 0, 1, TNetworkManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTNetworkManagement_DeviceCommissioning(), this.getTDeviceCommissioning(), null, "deviceCommissioning", null, 0, 1, TNetworkManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTNetworkManagement_Diagnostic(), this.getTDiagnostic(), null, "diagnostic", null, 0, 1, TNetworkManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tObjectEClass, TObject.class, "TObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTObject_SubObject(), this.getSubObjectType(), null, "subObject", null, 0, 255, TObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTObject_AccessType(), this.getTObjectAccessType(), "accessType", null, 0, 1, TObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTObject_ActualValue(), theXMLTypePackage.getString(), "actualValue", null, 0, 1, TObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTObject_DataType(), theXMLTypePackage.getHexBinary(), "dataType", null, 0, 1, TObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTObject_DefaultValue(), theXMLTypePackage.getString(), "defaultValue", null, 0, 1, TObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTObject_Denotation(), theXMLTypePackage.getString(), "denotation", null, 0, 1, TObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTObject_HighLimit(), theXMLTypePackage.getString(), "highLimit", null, 0, 1, TObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTObject_Index(), theXMLTypePackage.getHexBinary(), "index", null, 1, 1, TObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTObject_LowLimit(), theXMLTypePackage.getString(), "lowLimit", null, 0, 1, TObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTObject_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTObject_ObjectType(), theXMLTypePackage.getUnsignedByte(), "objectType", null, 1, 1, TObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTObject_ObjFlags(), theXMLTypePackage.getHexBinary(), "objFlags", null, 0, 1, TObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTObject_PDOmapping(), this.getTObjectPDOMapping(), "pDOmapping", null, 0, 1, TObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTObject_SubNumber(), theXMLTypePackage.getUnsignedByte(), "subNumber", null, 0, 1, TObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTObject_UniqueIDRef(), theXMLTypePackage.getIDREF(), "uniqueIDRef", null, 0, 1, TObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tParameterGroupEClass, TParameterGroup.class, "TParameterGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTParameterGroup_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TParameterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterGroup_Label(), this.getLabelType(), null, "label", null, 0, -1, TParameterGroup.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterGroup_Description(), this.getDescriptionType(), null, "description", null, 0, -1, TParameterGroup.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterGroup_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, TParameterGroup.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterGroup_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, TParameterGroup.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterGroup_ParameterGroup(), this.getTParameterGroup(), null, "parameterGroup", null, 0, -1, TParameterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterGroup_ParameterRef(), this.getParameterRefType(), null, "parameterRef", null, 0, -1, TParameterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTParameterGroup_KindOfAccess(), theXMLTypePackage.getString(), "kindOfAccess", null, 0, 1, TParameterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTParameterGroup_UniqueID(), theXMLTypePackage.getID(), "uniqueID", null, 1, 1, TParameterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tParameterGroupListEClass, TParameterGroupList.class, "TParameterGroupList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTParameterGroupList_ParameterGroup(), this.getTParameterGroup(), null, "parameterGroup", null, 1, -1, TParameterGroupList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tParameterListEClass, TParameterList.class, "TParameterList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTParameterList_Parameter(), this.getParameterType(), null, "parameter", null, 1, -1, TParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tParameterTemplateEClass, TParameterTemplate.class, "TParameterTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTParameterTemplate_BOOL(), ecorePackage.getEObject(), null, "bOOL", null, 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterTemplate_BITSTRING(), ecorePackage.getEObject(), null, "bITSTRING", null, 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterTemplate_BYTE(), ecorePackage.getEObject(), null, "bYTE", null, 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterTemplate_CHAR(), ecorePackage.getEObject(), null, "cHAR", null, 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterTemplate_WORD(), ecorePackage.getEObject(), null, "wORD", null, 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterTemplate_DWORD(), ecorePackage.getEObject(), null, "dWORD", null, 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterTemplate_LWORD(), ecorePackage.getEObject(), null, "lWORD", null, 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterTemplate_SINT(), ecorePackage.getEObject(), null, "sINT", null, 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterTemplate_INT(), ecorePackage.getEObject(), null, "iNT", null, 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterTemplate_DINT(), ecorePackage.getEObject(), null, "dINT", null, 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterTemplate_LINT(), ecorePackage.getEObject(), null, "lINT", null, 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterTemplate_USINT(), ecorePackage.getEObject(), null, "uSINT", null, 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterTemplate_UINT(), ecorePackage.getEObject(), null, "uINT", null, 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterTemplate_UDINT(), ecorePackage.getEObject(), null, "uDINT", null, 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterTemplate_ULINT(), ecorePackage.getEObject(), null, "uLINT", null, 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterTemplate_REAL(), ecorePackage.getEObject(), null, "rEAL", null, 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterTemplate_LREAL(), ecorePackage.getEObject(), null, "lREAL", null, 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterTemplate_STRING(), ecorePackage.getEObject(), null, "sTRING", null, 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterTemplate_WSTRING(), ecorePackage.getEObject(), null, "wSTRING", null, 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterTemplate_DataTypeIDRef(), this.getTDataTypeIDRef(), null, "dataTypeIDRef", null, 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterTemplate_ConditionalSupport(), this.getTConditionalSupport(), null, "conditionalSupport", null, 0, -1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterTemplate_ActualValue(), this.getTValue(), null, "actualValue", null, 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterTemplate_DefaultValue(), this.getTValue(), null, "defaultValue", null, 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterTemplate_SubstituteValue(), this.getTValue(), null, "substituteValue", null, 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterTemplate_AllowedValues(), this.getTAllowedValues(), null, "allowedValues", null, 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterTemplate_Unit(), this.getTUnit(), null, "unit", null, 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTParameterTemplate_Property(), this.getTProperty(), null, "property", null, 0, -1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTParameterTemplate_Access(), this.getAccessType(), "access", "read", 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTParameterTemplate_AccessList(), this.getAccessListType(), "accessList", null, 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTParameterTemplate_Multiplier(), theXMLTypePackage.getString(), "multiplier", null, 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTParameterTemplate_Offset(), theXMLTypePackage.getString(), "offset", null, 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTParameterTemplate_Persistent(), theXMLTypePackage.getBoolean(), "persistent", "false", 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTParameterTemplate_Support(), this.getSupportType(), "support", null, 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTParameterTemplate_TemplateIDRef(), theXMLTypePackage.getIDREF(), "templateIDRef", null, 0, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTParameterTemplate_UniqueID(), theXMLTypePackage.getID(), "uniqueID", null, 1, 1, TParameterTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tPicturesListEClass, TPicturesList.class, "TPicturesList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTPicturesList_Picture(), this.getPictureType(), null, "picture", null, 1, -1, TPicturesList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tProductIDEClass, TProductID.class, "TProductID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTProductID_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, TProductID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTProductID_ReadOnly(), theXMLTypePackage.getBoolean(), "readOnly", "true", 0, 1, TProductID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tPropertyEClass, TProperty.class, "TProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTProperty_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTProperty_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, TProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tRangeEClass, TRange.class, "TRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTRange_MinValue(), this.getMinValueType(), null, "minValue", null, 1, 1, TRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTRange_MaxValue(), this.getMaxValueType(), null, "maxValue", null, 1, 1, TRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTRange_Step(), this.getStepType(), null, "step", null, 0, 1, TRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tSpecificationRevisionEClass, TSpecificationRevision.class, "TSpecificationRevision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTSpecificationRevision_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, TSpecificationRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTSpecificationRevision_ReadOnly(), theXMLTypePackage.getBoolean(), "readOnly", "true", 0, 1, TSpecificationRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tSubrangeEClass, TSubrange.class, "TSubrange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTSubrange_LowerLimit(), theXMLTypePackage.getLong(), "lowerLimit", null, 1, 1, TSubrange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTSubrange_UpperLimit(), theXMLTypePackage.getLong(), "upperLimit", null, 1, 1, TSubrange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tTemplateListEClass, TTemplateList.class, "TTemplateList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTTemplateList_ParameterTemplate(), this.getTParameterTemplate(), null, "parameterTemplate", null, 0, -1, TTemplateList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTTemplateList_AllowedValuesTemplate(), this.getTAllowedValuesTemplate(), null, "allowedValuesTemplate", null, 0, -1, TTemplateList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tTransportLayersEClass, TTransportLayers.class, "TTransportLayers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(tUnitEClass, TUnit.class, "TUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTUnit_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTUnit_Label(), this.getLabelType(), null, "label", null, 0, -1, TUnit.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTUnit_Description(), this.getDescriptionType(), null, "description", null, 0, -1, TUnit.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTUnit_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, TUnit.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTUnit_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, TUnit.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getTUnit_Multiplier(), theXMLTypePackage.getString(), "multiplier", null, 1, 1, TUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTUnit_UnitURI(), theXMLTypePackage.getAnyURI(), "unitURI", null, 0, 1, TUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tValueEClass, TValue.class, "TValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTValue_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTValue_Label(), this.getLabelType(), null, "label", null, 0, -1, TValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTValue_Description(), this.getDescriptionType(), null, "description", null, 0, -1, TValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTValue_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, TValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTValue_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, TValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getTValue_Multiplier(), theXMLTypePackage.getString(), "multiplier", null, 0, 1, TValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTValue_Offset(), theXMLTypePackage.getString(), "offset", null, 0, 1, TValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTValue_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, TValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tVarDeclarationEClass, TVarDeclaration.class, "TVarDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTVarDeclaration_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTVarDeclaration_Label(), this.getLabelType(), null, "label", null, 0, -1, TVarDeclaration.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTVarDeclaration_Description(), this.getDescriptionType(), null, "description", null, 0, -1, TVarDeclaration.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTVarDeclaration_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, TVarDeclaration.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTVarDeclaration_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, TVarDeclaration.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTVarDeclaration_BOOL(), ecorePackage.getEObject(), null, "bOOL", null, 0, 1, TVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTVarDeclaration_BITSTRING(), ecorePackage.getEObject(), null, "bITSTRING", null, 0, 1, TVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTVarDeclaration_BYTE(), ecorePackage.getEObject(), null, "bYTE", null, 0, 1, TVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTVarDeclaration_CHAR(), ecorePackage.getEObject(), null, "cHAR", null, 0, 1, TVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTVarDeclaration_WORD(), ecorePackage.getEObject(), null, "wORD", null, 0, 1, TVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTVarDeclaration_DWORD(), ecorePackage.getEObject(), null, "dWORD", null, 0, 1, TVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTVarDeclaration_LWORD(), ecorePackage.getEObject(), null, "lWORD", null, 0, 1, TVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTVarDeclaration_SINT(), ecorePackage.getEObject(), null, "sINT", null, 0, 1, TVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTVarDeclaration_INT(), ecorePackage.getEObject(), null, "iNT", null, 0, 1, TVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTVarDeclaration_DINT(), ecorePackage.getEObject(), null, "dINT", null, 0, 1, TVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTVarDeclaration_LINT(), ecorePackage.getEObject(), null, "lINT", null, 0, 1, TVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTVarDeclaration_USINT(), ecorePackage.getEObject(), null, "uSINT", null, 0, 1, TVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTVarDeclaration_UINT(), ecorePackage.getEObject(), null, "uINT", null, 0, 1, TVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTVarDeclaration_UDINT(), ecorePackage.getEObject(), null, "uDINT", null, 0, 1, TVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTVarDeclaration_ULINT(), ecorePackage.getEObject(), null, "uLINT", null, 0, 1, TVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTVarDeclaration_REAL(), ecorePackage.getEObject(), null, "rEAL", null, 0, 1, TVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTVarDeclaration_LREAL(), ecorePackage.getEObject(), null, "lREAL", null, 0, 1, TVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTVarDeclaration_STRING(), ecorePackage.getEObject(), null, "sTRING", null, 0, 1, TVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTVarDeclaration_WSTRING(), ecorePackage.getEObject(), null, "wSTRING", null, 0, 1, TVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTVarDeclaration_DataTypeIDRef(), this.getTDataTypeIDRef(), null, "dataTypeIDRef", null, 0, 1, TVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTVarDeclaration_InitialValue(), theXMLTypePackage.getString(), "initialValue", null, 0, 1, TVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTVarDeclaration_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTVarDeclaration_Size(), theXMLTypePackage.getString(), "size", null, 0, 1, TVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTVarDeclaration_UniqueID(), theXMLTypePackage.getID(), "uniqueID", null, 1, 1, TVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tVariableRefEClass, TVariableRef.class, "TVariableRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTVariableRef_InstanceIDRef(), this.getInstanceIDRefType(), null, "instanceIDRef", null, 1, -1, TVariableRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTVariableRef_VariableIDRef(), this.getVariableIDRefType(), null, "variableIDRef", null, 1, 1, TVariableRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTVariableRef_MemberRef(), this.getMemberRefType(), null, "memberRef", null, 0, -1, TVariableRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTVariableRef_Position(), theXMLTypePackage.getUnsignedByte(), "position", "1", 0, 1, TVariableRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tVendorIDEClass, TVendorID.class, "TVendorID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTVendorID_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, TVendorID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTVendorID_ReadOnly(), theXMLTypePackage.getBoolean(), "readOnly", "true", 0, 1, TVendorID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tVersionEClass, TVersion.class, "TVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTVersion_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, TVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTVersion_ReadOnly(), theXMLTypePackage.getBoolean(), "readOnly", "true", 0, 1, TVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTVersion_VersionType(), this.getVersionTypeType(), "versionType", null, 1, 1, TVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(valueTypeEClass, ValueType.class, "ValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getValueType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getValueType_Label(), this.getLabelType(), null, "label", null, 0, -1, ValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getValueType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, ValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getValueType_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, ValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getValueType_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, ValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getValueType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getValueType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, ValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(variableIDRefTypeEClass, VariableIDRefType.class, "VariableIDRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getVariableIDRefType_UniqueIDRef(), theXMLTypePackage.getIDREF(), "uniqueIDRef", null, 1, 1, VariableIDRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(vendorNameTypeEClass, VendorNameType.class, "VendorNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getVendorNameType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, VendorNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVendorNameType_ReadOnly(), theXMLTypePackage.getBoolean(), "readOnly", "true", 0, 1, VendorNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(vendorTextTypeEClass, VendorTextType.class, "VendorTextType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getVendorTextType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, VendorTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getVendorTextType_Label(), this.getLabelType(), null, "label", null, 0, -1, VendorTextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getVendorTextType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, VendorTextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getVendorTextType_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, VendorTextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getVendorTextType_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, VendorTextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getVendorTextType_ReadOnly(), theXMLTypePackage.getBoolean(), "readOnly", "true", 0, 1, VendorTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(versionInfoTypeEClass, VersionInfoType.class, "VersionInfoType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getVersionInfoType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, VersionInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getVersionInfoType_Label(), this.getLabelType(), null, "label", null, 0, -1, VersionInfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getVersionInfoType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, VersionInfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getVersionInfoType_LabelRef(), this.getLabelRefType(), null, "labelRef", null, 0, -1, VersionInfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getVersionInfoType_DescriptionRef(), this.getDescriptionRefType(), null, "descriptionRef", null, 0, -1, VersionInfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getVersionInfoType_Author(), theXMLTypePackage.getString(), "author", null, 1, 1, VersionInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVersionInfoType_Date(), theXMLTypePackage.getDate(), "date", null, 1, 1, VersionInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVersionInfoType_Organization(), theXMLTypePackage.getString(), "organization", null, 1, 1, VersionInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVersionInfoType_Version(), theXMLTypePackage.getString(), "version", null, 1, 1, VersionInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(accessTypeEEnum, AccessType.class, "AccessType");
        addEEnumLiteral(accessTypeEEnum, AccessType.CONST);
        addEEnumLiteral(accessTypeEEnum, AccessType.READ);
        addEEnumLiteral(accessTypeEEnum, AccessType.WRITE);
        addEEnumLiteral(accessTypeEEnum, AccessType.READ_WRITE);
        addEEnumLiteral(accessTypeEEnum, AccessType.READ_WRITE_INPUT);
        addEEnumLiteral(accessTypeEEnum, AccessType.READ_WRITE_OUTPUT);
        addEEnumLiteral(accessTypeEEnum, AccessType.NO_ACCESS);

        initEEnum(accessType1EEnum, AccessType1.class, "AccessType1");
        addEEnumLiteral(accessType1EEnum, AccessType1.CONST);
        addEEnumLiteral(accessType1EEnum, AccessType1.READ);
        addEEnumLiteral(accessType1EEnum, AccessType1.WRITE);
        addEEnumLiteral(accessType1EEnum, AccessType1.READ_WRITE);
        addEEnumLiteral(accessType1EEnum, AccessType1.NO_ACCESS);

        initEEnum(accessTypeTypeEEnum, AccessTypeType.class, "AccessTypeType");
        addEEnumLiteral(accessTypeTypeEEnum, AccessTypeType.READ_ONLY);
        addEEnumLiteral(accessTypeTypeEEnum, AccessTypeType.WRITE_ONLY);
        addEEnumLiteral(accessTypeTypeEEnum, AccessTypeType.READ_WRITE_OUTPUT);

        initEEnum(deviceClassTypeEEnum, DeviceClassType.class, "DeviceClassType");
        addEEnumLiteral(deviceClassTypeEEnum, DeviceClassType.COMPACT);
        addEEnumLiteral(deviceClassTypeEEnum, DeviceClassType.MODULAR);
        addEEnumLiteral(deviceClassTypeEEnum, DeviceClassType.CONFIGURABLE);

        initEEnum(iasInterfaceDataTypeMember0EEnum, IASInterfaceDataTypeMember0.class, "IASInterfaceDataTypeMember0");
        addEEnumLiteral(iasInterfaceDataTypeMember0EEnum, IASInterfaceDataTypeMember0.CSI);
        addEEnumLiteral(iasInterfaceDataTypeMember0EEnum, IASInterfaceDataTypeMember0.HCI);
        addEEnumLiteral(iasInterfaceDataTypeMember0EEnum, IASInterfaceDataTypeMember0.ISI);
        addEEnumLiteral(iasInterfaceDataTypeMember0EEnum, IASInterfaceDataTypeMember0.API);
        addEEnumLiteral(iasInterfaceDataTypeMember0EEnum, IASInterfaceDataTypeMember0.CMI);
        addEEnumLiteral(iasInterfaceDataTypeMember0EEnum, IASInterfaceDataTypeMember0.ESI);
        addEEnumLiteral(iasInterfaceDataTypeMember0EEnum, IASInterfaceDataTypeMember0.FSI);
        addEEnumLiteral(iasInterfaceDataTypeMember0EEnum, IASInterfaceDataTypeMember0.MTI);
        addEEnumLiteral(iasInterfaceDataTypeMember0EEnum, IASInterfaceDataTypeMember0.SEI);
        addEEnumLiteral(iasInterfaceDataTypeMember0EEnum, IASInterfaceDataTypeMember0.USI);

        initEEnum(leDcolorsTypeEEnum, LEDcolorsType.class, "LEDcolorsType");
        addEEnumLiteral(leDcolorsTypeEEnum, LEDcolorsType.MONOCOLOR);
        addEEnumLiteral(leDcolorsTypeEEnum, LEDcolorsType.BICOLOR);

        initEEnum(leDcolorTypeEEnum, LEDcolorType.class, "LEDcolorType");
        addEEnumLiteral(leDcolorTypeEEnum, LEDcolorType.GREEN);
        addEEnumLiteral(leDcolorTypeEEnum, LEDcolorType.AMBER);
        addEEnumLiteral(leDcolorTypeEEnum, LEDcolorType.RED);

        initEEnum(leDtypeTypeEEnum, LEDtypeType.class, "LEDtypeType");
        addEEnumLiteral(leDtypeTypeEEnum, LEDtypeType.IO);
        addEEnumLiteral(leDtypeTypeEEnum, LEDtypeType.DEVICE);
        addEEnumLiteral(leDtypeTypeEEnum, LEDtypeType.COMMUNICATION);

        initEEnum(nodeTypeTypeEEnum, NodeTypeType.class, "NodeTypeType");
        addEEnumLiteral(nodeTypeTypeEEnum, NodeTypeType.MN);
        addEEnumLiteral(nodeTypeTypeEEnum, NodeTypeType.CN);

        initEEnum(profileClassIDDataTypeEEnum, ProfileClassIDDataType.class, "ProfileClassIDDataType");
        addEEnumLiteral(profileClassIDDataTypeEEnum, ProfileClassIDDataType.AIP);
        addEEnumLiteral(profileClassIDDataTypeEEnum, ProfileClassIDDataType.PROCESS);
        addEEnumLiteral(profileClassIDDataTypeEEnum, ProfileClassIDDataType.INFORMATION_EXCHANGE);
        addEEnumLiteral(profileClassIDDataTypeEEnum, ProfileClassIDDataType.RESOURCE);
        addEEnumLiteral(profileClassIDDataTypeEEnum, ProfileClassIDDataType.DEVICE);
        addEEnumLiteral(profileClassIDDataTypeEEnum, ProfileClassIDDataType.COMMUNICATION_NETWORK);
        addEEnumLiteral(profileClassIDDataTypeEEnum, ProfileClassIDDataType.EQUIPMENT);
        addEEnumLiteral(profileClassIDDataTypeEEnum, ProfileClassIDDataType.HUMAN);
        addEEnumLiteral(profileClassIDDataTypeEEnum, ProfileClassIDDataType.MATERIAL);

        initEEnum(rangeTypeEEnum, RangeType.class, "RangeType");
        addEEnumLiteral(rangeTypeEEnum, RangeType.INTERNATIONAL);
        addEEnumLiteral(rangeTypeEEnum, RangeType.INTERNAL);

        initEEnum(stateTypeEEnum, StateType.class, "StateType");
        addEEnumLiteral(stateTypeEEnum, StateType.ON);
        addEEnumLiteral(stateTypeEEnum, StateType.OFF);
        addEEnumLiteral(stateTypeEEnum, StateType.FLASHING);

        initEEnum(supportTypeEEnum, SupportType.class, "SupportType");
        addEEnumLiteral(supportTypeEEnum, SupportType.MANDATORY);
        addEEnumLiteral(supportTypeEEnum, SupportType.OPTIONAL);
        addEEnumLiteral(supportTypeEEnum, SupportType.CONDITIONAL);

        initEEnum(tObjectAccessTypeEEnum, TObjectAccessType.class, "TObjectAccessType");
        addEEnumLiteral(tObjectAccessTypeEEnum, TObjectAccessType.RO);
        addEEnumLiteral(tObjectAccessTypeEEnum, TObjectAccessType.WO);
        addEEnumLiteral(tObjectAccessTypeEEnum, TObjectAccessType.RW);
        addEEnumLiteral(tObjectAccessTypeEEnum, TObjectAccessType.CONST);

        initEEnum(tObjectPDOMappingEEnum, TObjectPDOMapping.class, "TObjectPDOMapping");
        addEEnumLiteral(tObjectPDOMappingEEnum, TObjectPDOMapping.NO);
        addEEnumLiteral(tObjectPDOMappingEEnum, TObjectPDOMapping.DEFAULT);
        addEEnumLiteral(tObjectPDOMappingEEnum, TObjectPDOMapping.OPTIONAL);
        addEEnumLiteral(tObjectPDOMappingEEnum, TObjectPDOMapping.TPDO);
        addEEnumLiteral(tObjectPDOMappingEEnum, TObjectPDOMapping.RPDO);

        initEEnum(versionTypeTypeEEnum, VersionTypeType.class, "VersionTypeType");
        addEEnumLiteral(versionTypeTypeEEnum, VersionTypeType.SW);
        addEEnumLiteral(versionTypeTypeEEnum, VersionTypeType.FW);
        addEEnumLiteral(versionTypeTypeEEnum, VersionTypeType.HW);

        // Initialize data types
        initEDataType(accessListTypeEDataType, List.class, "AccessListType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(accessTypeObjectEDataType, AccessType.class, "AccessTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(accessTypeObject1EDataType, AccessType1.class, "AccessTypeObject1", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(accessTypeTypeObjectEDataType, AccessTypeType.class, "AccessTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(deviceClassTypeObjectEDataType, DeviceClassType.class, "DeviceClassTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(iasInterfaceDataTypeEDataType, Object.class, "IASInterfaceDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(iasInterfaceDataTypeMember0ObjectEDataType, IASInterfaceDataTypeMember0.class, "IASInterfaceDataTypeMember0Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(iasInterfaceDataTypeMember1EDataType, String.class, "IASInterfaceDataTypeMember1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(leDcolorsTypeObjectEDataType, LEDcolorsType.class, "LEDcolorsTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(leDcolorTypeObjectEDataType, LEDcolorType.class, "LEDcolorTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(leDtypeTypeObjectEDataType, LEDtypeType.class, "LEDtypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(nodeTypeTypeObjectEDataType, NodeTypeType.class, "NodeTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(offsetTypeEDataType, BigInteger.class, "OffsetType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(profileClassIDDataTypeObjectEDataType, ProfileClassIDDataType.class, "ProfileClassIDDataTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(rangeTypeObjectEDataType, RangeType.class, "RangeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(stateTypeObjectEDataType, StateType.class, "StateTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(supportedLanguagesTypeEDataType, List.class, "SupportedLanguagesType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(supportTypeObjectEDataType, SupportType.class, "SupportTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(tObjectAccessTypeObjectEDataType, TObjectAccessType.class, "TObjectAccessTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(tObjectPDOMappingObjectEDataType, TObjectPDOMapping.class, "TObjectPDOMappingObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(versionTypeTypeObjectEDataType, VersionTypeType.class, "VersionTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
        createExtendedMetaDataAnnotations();
    }

    /**
     * Initializes the annotations for
     * <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void createExtendedMetaDataAnnotations() {
        String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
        addAnnotation
          (accessListTypeEDataType, 
           source, 
           new String[] {
             "name", "accessList_._type",
             "baseType", "http://www.eclipse.org/emf/2003/XMLType#NMTOKENS"
           });		
        addAnnotation
          (accessTypeEEnum, 
           source, 
           new String[] {
             "name", "access_._type"
           });		
        addAnnotation
          (accessType1EEnum, 
           source, 
           new String[] {
             "name", "access_._1_._type"
           });		
        addAnnotation
          (accessTypeObjectEDataType, 
           source, 
           new String[] {
             "name", "access_._type:Object",
             "baseType", "access_._type"
           });		
        addAnnotation
          (accessTypeObject1EDataType, 
           source, 
           new String[] {
             "name", "access_._1_._type:Object",
             "baseType", "access_._1_._type"
           });		
        addAnnotation
          (accessTypeTypeEEnum, 
           source, 
           new String[] {
             "name", "accessType_._type"
           });		
        addAnnotation
          (accessTypeTypeObjectEDataType, 
           source, 
           new String[] {
             "name", "accessType_._type:Object",
             "baseType", "accessType_._type"
           });		
        addAnnotation
          (addInfoTypeEClass, 
           source, 
           new String[] {
             "name", "addInfo_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getAddInfoType_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getAddInfoType_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getAddInfoType_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getAddInfoType_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getAddInfoType_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getAddInfoType_Value(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "value",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getAddInfoType_BitOffset(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "bitOffset"
           });		
        addAnnotation
          (getAddInfoType_Len(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "len"
           });		
        addAnnotation
          (getAddInfoType_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (arrayTypeEClass, 
           source, 
           new String[] {
             "name", "array_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getArrayType_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getArrayType_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getArrayType_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getArrayType_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getArrayType_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getArrayType_Subrange(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "subrange",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getArrayType_BOOL(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "BOOL",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getArrayType_BITSTRING(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "BITSTRING",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getArrayType_BYTE(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "BYTE",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getArrayType_CHAR(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "CHAR",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getArrayType_WORD(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "WORD",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getArrayType_DWORD(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "DWORD",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getArrayType_LWORD(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "LWORD",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getArrayType_SINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "SINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getArrayType_INT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "INT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getArrayType_DINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "DINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getArrayType_LINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "LINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getArrayType_USINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "USINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getArrayType_UINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "UINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getArrayType_UDINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "UDINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getArrayType_ULINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ULINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getArrayType_REAL(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "REAL",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getArrayType_LREAL(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "LREAL",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getArrayType_STRING(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "STRING",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getArrayType_WSTRING(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "WSTRING",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getArrayType_DataTypeIDRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "dataTypeIDRef",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getArrayType_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getArrayType_UniqueID(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "uniqueID"
           });		
        addAnnotation
          (categoryTypeEClass, 
           source, 
           new String[] {
             "name", "category_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCategoryType_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getCategoryType_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getCategoryType_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getCategoryType_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getCategoryType_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (characteristicContentTypeEClass, 
           source, 
           new String[] {
             "name", "characteristicContent_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCharacteristicContentType_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getCharacteristicContentType_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getCharacteristicContentType_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getCharacteristicContentType_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getCharacteristicContentType_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (characteristicNameTypeEClass, 
           source, 
           new String[] {
             "name", "characteristicName_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCharacteristicNameType_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getCharacteristicNameType_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getCharacteristicNameType_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getCharacteristicNameType_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getCharacteristicNameType_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (characteristicsListTypeEClass, 
           source, 
           new String[] {
             "name", "characteristicsList_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCharacteristicsListType_Category(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "category",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCharacteristicsListType_Characteristic(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "characteristic",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (characteristicTypeEClass, 
           source, 
           new String[] {
             "name", "characteristic_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCharacteristicType_CharacteristicName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "characteristicName",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCharacteristicType_CharacteristicContent(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "characteristicContent",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (compliantWithTypeEClass, 
           source, 
           new String[] {
             "name", "compliantWith_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCompliantWithType_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getCompliantWithType_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getCompliantWithType_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getCompliantWithType_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getCompliantWithType_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getCompliantWithType_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getCompliantWithType_Range(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "range"
           });		
        addAnnotation
          (configVarsTypeEClass, 
           source, 
           new String[] {
             "name", "configVars_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getConfigVarsType_VarDeclaration(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "varDeclaration",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (connectionTypeEClass, 
           source, 
           new String[] {
             "name", "connection_._type",
             "kind", "empty"
           });		
        addAnnotation
          (getConnectionType_Description(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "description"
           });		
        addAnnotation
          (getConnectionType_Destination(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "destination"
           });		
        addAnnotation
          (getConnectionType_Source(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "source"
           });		
        addAnnotation
          (dataTypeListTypeEClass, 
           source, 
           new String[] {
             "name", "DataTypeList_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getDataTypeListType_DefType(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "defType",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (derivedTypeEClass, 
           source, 
           new String[] {
             "name", "derived_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getDerivedType_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getDerivedType_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getDerivedType_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getDerivedType_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getDerivedType_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getDerivedType_Count(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "count",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDerivedType_BOOL(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "BOOL",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDerivedType_BITSTRING(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "BITSTRING",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDerivedType_BYTE(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "BYTE",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDerivedType_CHAR(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "CHAR",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDerivedType_WORD(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "WORD",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDerivedType_DWORD(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "DWORD",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDerivedType_LWORD(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "LWORD",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDerivedType_SINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "SINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDerivedType_INT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "INT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDerivedType_DINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "DINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDerivedType_LINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "LINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDerivedType_USINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "USINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDerivedType_UINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "UINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDerivedType_UDINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "UDINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDerivedType_ULINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ULINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDerivedType_REAL(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "REAL",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDerivedType_LREAL(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "LREAL",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDerivedType_STRING(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "STRING",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDerivedType_WSTRING(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "WSTRING",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDerivedType_DataTypeIDRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "dataTypeIDRef",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDerivedType_Description1(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "description"
           });		
        addAnnotation
          (getDerivedType_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getDerivedType_UniqueID(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "uniqueID"
           });		
        addAnnotation
          (descriptionRefTypeEClass, 
           source, 
           new String[] {
             "name", "descriptionRef_._type",
             "kind", "simple"
           });		
        addAnnotation
          (getDescriptionRefType_Value(), 
           source, 
           new String[] {
             "name", ":0",
             "kind", "simple"
           });			
        addAnnotation
          (getDescriptionRefType_DictID(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "dictID"
           });			
        addAnnotation
          (getDescriptionRefType_TextID(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "textID"
           });		
        addAnnotation
          (descriptionTypeEClass, 
           source, 
           new String[] {
             "name", "description_._type",
             "kind", "simple"
           });		
        addAnnotation
          (getDescriptionType_Value(), 
           source, 
           new String[] {
             "name", ":0",
             "kind", "simple"
           });			
        addAnnotation
          (getDescriptionType_Lang(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "lang"
           });			
        addAnnotation
          (getDescriptionType_URI(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "URI"
           });		
        addAnnotation
          (deviceClassTypeEEnum, 
           source, 
           new String[] {
             "name", "deviceClass_._type"
           });		
        addAnnotation
          (deviceClassTypeObjectEDataType, 
           source, 
           new String[] {
             "name", "deviceClass_._type:Object",
             "baseType", "deviceClass_._type"
           });		
        addAnnotation
          (dictionaryTypeEClass, 
           source, 
           new String[] {
             "name", "dictionary_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getDictionaryType_File(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "file",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDictionaryType_DictID(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "dictID"
           });		
        addAnnotation
          (getDictionaryType_Lang(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "lang"
           });		
        addAnnotation
          (documentRootEClass, 
           source, 
           new String[] {
             "name", "",
             "kind", "mixed"
           });		
        addAnnotation
          (getDocumentRoot_Mixed(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "name", ":mixed"
           });		
        addAnnotation
          (getDocumentRoot_XMLNSPrefixMap(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "xmlns:prefix"
           });		
        addAnnotation
          (getDocumentRoot_XSISchemaLocation(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "xsi:schemaLocation"
           });		
        addAnnotation
          (getDocumentRoot_ISO15745ProfileContainer(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ISO15745ProfileContainer",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (dynamicChannelsTypeEClass, 
           source, 
           new String[] {
             "name", "dynamicChannels_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getDynamicChannelsType_DynamicChannel(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "dynamicChannel",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (enumTypeEClass, 
           source, 
           new String[] {
             "name", "enum_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getEnumType_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getEnumType_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getEnumType_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getEnumType_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getEnumType_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getEnumType_EnumValue(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "enumValue",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getEnumType_BOOL(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "BOOL",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getEnumType_BITSTRING(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "BITSTRING",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getEnumType_BYTE(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "BYTE",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getEnumType_CHAR(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "CHAR",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getEnumType_WORD(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "WORD",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getEnumType_DWORD(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "DWORD",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getEnumType_LWORD(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "LWORD",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getEnumType_SINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "SINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getEnumType_INT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "INT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getEnumType_DINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "DINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getEnumType_LINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "LINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getEnumType_USINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "USINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getEnumType_UINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "UINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getEnumType_UDINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "UDINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getEnumType_ULINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ULINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getEnumType_REAL(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "REAL",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getEnumType_LREAL(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "LREAL",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getEnumType_STRING(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "STRING",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getEnumType_WSTRING(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "WSTRING",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getEnumType_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getEnumType_Size(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "size"
           });		
        addAnnotation
          (getEnumType_UniqueID(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "uniqueID"
           });		
        addAnnotation
          (errorBitDataTypeEClass, 
           source, 
           new String[] {
             "name", "ErrorBit_DataType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getErrorBitDataType_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getErrorBitDataType_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getErrorBitDataType_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getErrorBitDataType_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getErrorBitDataType_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getErrorBitDataType_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getErrorBitDataType_Offset(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "offset"
           });		
        addAnnotation
          (errorConstantDataTypeEClass, 
           source, 
           new String[] {
             "name", "ErrorConstant_DataType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getErrorConstantDataType_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getErrorConstantDataType_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getErrorConstantDataType_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getErrorConstantDataType_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getErrorConstantDataType_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getErrorConstantDataType_AddInfo(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "addInfo",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getErrorConstantDataType_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getErrorConstantDataType_Value(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "value"
           });		
        addAnnotation
          (errorListTypeEClass, 
           source, 
           new String[] {
             "name", "ErrorList_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getErrorListType_Error(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Error",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (fileTypeEClass, 
           source, 
           new String[] {
             "name", "file_._type",
             "kind", "empty"
           });		
        addAnnotation
          (getFileType_URI(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "URI"
           });		
        addAnnotation
          (functionInstanceTypeEClass, 
           source, 
           new String[] {
             "name", "functionInstance_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getFunctionInstanceType_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getFunctionInstanceType_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getFunctionInstanceType_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getFunctionInstanceType_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getFunctionInstanceType_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getFunctionInstanceType_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getFunctionInstanceType_TypeIDRef(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "typeIDRef"
           });		
        addAnnotation
          (getFunctionInstanceType_UniqueID(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "uniqueID"
           });		
        addAnnotation
          (functionTypeTypeEClass, 
           source, 
           new String[] {
             "name", "functionType_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getFunctionTypeType_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getFunctionTypeType_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getFunctionTypeType_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getFunctionTypeType_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getFunctionTypeType_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getFunctionTypeType_VersionInfo(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "versionInfo",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFunctionTypeType_InterfaceList(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "interfaceList",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFunctionTypeType_FunctionInstanceList(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "functionInstanceList",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFunctionTypeType_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getFunctionTypeType_Package(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "package"
           });		
        addAnnotation
          (getFunctionTypeType_UniqueID(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "uniqueID"
           });		
        addAnnotation
          (iasInterfaceDataTypeEDataType, 
           source, 
           new String[] {
             "name", "IASInterface_DataType",
             "memberTypes", "IASInterface_DataType_._member_._0 IASInterface_DataType_._member_._1"
           });		
        addAnnotation
          (iasInterfaceDataTypeMember0EEnum, 
           source, 
           new String[] {
             "name", "IASInterface_DataType_._member_._0"
           });												
        addAnnotation
          (iasInterfaceDataTypeMember0ObjectEDataType, 
           source, 
           new String[] {
             "name", "IASInterface_DataType_._member_._0:Object",
             "baseType", "IASInterface_DataType_._member_._0"
           });		
        addAnnotation
          (iasInterfaceDataTypeMember1EDataType, 
           source, 
           new String[] {
             "name", "IASInterface_DataType_._member_._1",
             "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
             "length", "4"
           });		
        addAnnotation
          (identityTypeEClass, 
           source, 
           new String[] {
             "name", "identity_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getIdentityType_VendorID(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "vendorID",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getIdentityType_DeviceFamily(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "deviceFamily",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getIdentityType_ProductID(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "productID",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getIdentityType_Version(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "version",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getIdentityType_BuildDate(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "buildDate",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getIdentityType_SpecificationRevision(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "specificationRevision",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (inputVarsTypeEClass, 
           source, 
           new String[] {
             "name", "inputVars_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getInputVarsType_VarDeclaration(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "varDeclaration",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (instanceIDRefTypeEClass, 
           source, 
           new String[] {
             "name", "instanceIDRef_._type",
             "kind", "empty"
           });		
        addAnnotation
          (getInstanceIDRefType_UniqueIDRef(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "uniqueIDRef"
           });		
        addAnnotation
          (instanceNameTypeEClass, 
           source, 
           new String[] {
             "name", "instanceName_._type",
             "kind", "simple"
           });		
        addAnnotation
          (getInstanceNameType_Value(), 
           source, 
           new String[] {
             "name", ":0",
             "kind", "simple"
           });		
        addAnnotation
          (getInstanceNameType_ReadOnly(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "readOnly"
           });		
        addAnnotation
          (interfaceListTypeEClass, 
           source, 
           new String[] {
             "name", "interfaceList_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getInterfaceListType_InputVars(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "inputVars",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getInterfaceListType_OutputVars(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "outputVars",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getInterfaceListType_ConfigVars(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "configVars",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (iso15745ProfileContainerTypeEClass, 
           source, 
           new String[] {
             "name", "ISO15745ProfileContainer_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getISO15745ProfileContainerType_ISO15745Profile(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ISO15745Profile",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (iso15745ProfileTypeEClass, 
           source, 
           new String[] {
             "name", "ISO15745Profile_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getISO15745ProfileType_ProfileHeader(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ProfileHeader",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getISO15745ProfileType_ProfileBody(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ProfileBody",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (iso15745ReferenceDataTypeEClass, 
           source, 
           new String[] {
             "name", "ISO15745Reference_DataType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getISO15745ReferenceDataType_ISO15745Part(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ISO15745Part",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getISO15745ReferenceDataType_ISO15745Edition(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ISO15745Edition",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getISO15745ReferenceDataType_ProfileTechnology(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ProfileTechnology",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (labelRefTypeEClass, 
           source, 
           new String[] {
             "name", "labelRef_._type",
             "kind", "simple"
           });		
        addAnnotation
          (getLabelRefType_Value(), 
           source, 
           new String[] {
             "name", ":0",
             "kind", "simple"
           });			
        addAnnotation
          (getLabelRefType_DictID(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "dictID"
           });			
        addAnnotation
          (getLabelRefType_TextID(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "textID"
           });		
        addAnnotation
          (labelTypeEClass, 
           source, 
           new String[] {
             "name", "label_._type",
             "kind", "simple"
           });		
        addAnnotation
          (getLabelType_Value(), 
           source, 
           new String[] {
             "name", ":0",
             "kind", "simple"
           });			
        addAnnotation
          (getLabelType_Lang(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "lang"
           });		
        addAnnotation
          (leDcolorsTypeEEnum, 
           source, 
           new String[] {
             "name", "LEDcolors_._type"
           });		
        addAnnotation
          (leDcolorsTypeObjectEDataType, 
           source, 
           new String[] {
             "name", "LEDcolors_._type:Object",
             "baseType", "LEDcolors_._type"
           });		
        addAnnotation
          (leDcolorTypeEEnum, 
           source, 
           new String[] {
             "name", "LEDcolor_._type"
           });		
        addAnnotation
          (leDcolorTypeObjectEDataType, 
           source, 
           new String[] {
             "name", "LEDcolor_._type:Object",
             "baseType", "LEDcolor_._type"
           });		
        addAnnotation
          (ledListTypeEClass, 
           source, 
           new String[] {
             "name", "LEDList_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getLEDListType_LED(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "LED",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getLEDListType_CombinedState(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "combinedState",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (leDstateRefTypeEClass, 
           source, 
           new String[] {
             "name", "LEDstateRef_._type",
             "kind", "empty"
           });		
        addAnnotation
          (getLEDstateRefType_StateIDRef(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "stateIDRef"
           });		
        addAnnotation
          (leDstateTypeEClass, 
           source, 
           new String[] {
             "name", "LEDstate_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getLEDstateType_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getLEDstateType_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getLEDstateType_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getLEDstateType_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getLEDstateType_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getLEDstateType_FlashingPeriod(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "flashingPeriod"
           });		
        addAnnotation
          (getLEDstateType_ImpulsWidth(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "impulsWidth"
           });		
        addAnnotation
          (getLEDstateType_LEDcolor(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "LEDcolor"
           });		
        addAnnotation
          (getLEDstateType_NumberOfImpulses(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "numberOfImpulses"
           });		
        addAnnotation
          (getLEDstateType_State(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "state"
           });		
        addAnnotation
          (getLEDstateType_UniqueID(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "uniqueID"
           });		
        addAnnotation
          (leDtypeTypeEEnum, 
           source, 
           new String[] {
             "name", "LEDtype_._type"
           });		
        addAnnotation
          (leDtypeTypeObjectEDataType, 
           source, 
           new String[] {
             "name", "LEDtype_._type:Object",
             "baseType", "LEDtype_._type"
           });		
        addAnnotation
          (maxValueTypeEClass, 
           source, 
           new String[] {
             "name", "maxValue_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getMaxValueType_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getMaxValueType_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getMaxValueType_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getMaxValueType_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getMaxValueType_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getMaxValueType_Multiplier(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "multiplier"
           });		
        addAnnotation
          (getMaxValueType_Offset(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "offset"
           });		
        addAnnotation
          (getMaxValueType_Value(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "value"
           });		
        addAnnotation
          (memberRefTypeEClass, 
           source, 
           new String[] {
             "name", "memberRef_._type",
             "kind", "empty"
           });		
        addAnnotation
          (getMemberRefType_Index(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "index"
           });		
        addAnnotation
          (getMemberRefType_UniqueIDRef(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "uniqueIDRef"
           });		
        addAnnotation
          (minValueTypeEClass, 
           source, 
           new String[] {
             "name", "minValue_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getMinValueType_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getMinValueType_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getMinValueType_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getMinValueType_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getMinValueType_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getMinValueType_Multiplier(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "multiplier"
           });		
        addAnnotation
          (getMinValueType_Offset(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "offset"
           });		
        addAnnotation
          (getMinValueType_Value(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "value"
           });		
        addAnnotation
          (nodeTypeTypeEEnum, 
           source, 
           new String[] {
             "name", "nodeType_._type"
           });		
        addAnnotation
          (nodeTypeTypeObjectEDataType, 
           source, 
           new String[] {
             "name", "nodeType_._type:Object",
             "baseType", "nodeType_._type"
           });		
        addAnnotation
          (objectListTypeEClass, 
           source, 
           new String[] {
             "name", "ObjectList_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getObjectListType_Object(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Object",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getObjectListType_MandatoryObjects(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "mandatoryObjects"
           });		
        addAnnotation
          (getObjectListType_ManufacturerObjects(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "manufacturerObjects"
           });		
        addAnnotation
          (getObjectListType_OptionalObjects(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "optionalObjects"
           });		
        addAnnotation
          (offsetTypeEDataType, 
           source, 
           new String[] {
             "name", "offset_._type",
             "baseType", "http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger",
             "maxInclusive", "63"
           });		
        addAnnotation
          (orderNumberTypeEClass, 
           source, 
           new String[] {
             "name", "orderNumber_._type",
             "kind", "simple"
           });		
        addAnnotation
          (getOrderNumberType_Value(), 
           source, 
           new String[] {
             "name", ":0",
             "kind", "simple"
           });		
        addAnnotation
          (getOrderNumberType_ReadOnly(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "readOnly"
           });		
        addAnnotation
          (outputVarsTypeEClass, 
           source, 
           new String[] {
             "name", "outputVars_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getOutputVarsType_VarDeclaration(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "varDeclaration",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (parameterRefTypeEClass, 
           source, 
           new String[] {
             "name", "parameterRef_._type",
             "kind", "empty"
           });		
        addAnnotation
          (getParameterRefType_UniqueIDRef(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "uniqueIDRef"
           });		
        addAnnotation
          (parameterTypeEClass, 
           source, 
           new String[] {
             "name", "parameter_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getParameterType_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getParameterType_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getParameterType_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getParameterType_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getParameterType_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getParameterType_BOOL(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "BOOL",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getParameterType_BITSTRING(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "BITSTRING",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getParameterType_BYTE(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "BYTE",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getParameterType_CHAR(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "CHAR",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getParameterType_WORD(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "WORD",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getParameterType_DWORD(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "DWORD",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getParameterType_LWORD(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "LWORD",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getParameterType_SINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "SINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getParameterType_INT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "INT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getParameterType_DINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "DINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getParameterType_LINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "LINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getParameterType_USINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "USINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getParameterType_UINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "UINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getParameterType_UDINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "UDINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getParameterType_ULINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ULINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getParameterType_REAL(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "REAL",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getParameterType_LREAL(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "LREAL",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getParameterType_STRING(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "STRING",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getParameterType_WSTRING(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "WSTRING",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getParameterType_DataTypeIDRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "dataTypeIDRef",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getParameterType_VariableRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "variableRef",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getParameterType_ConditionalSupport(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "conditionalSupport",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getParameterType_Denotation(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "denotation",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getParameterType_ActualValue(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "actualValue",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getParameterType_DefaultValue(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "defaultValue",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getParameterType_SubstituteValue(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "substituteValue",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getParameterType_AllowedValues(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "allowedValues",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getParameterType_Unit(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "unit",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getParameterType_Property(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "property",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getParameterType_Access(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "access"
           });		
        addAnnotation
          (getParameterType_AccessList(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "accessList"
           });		
        addAnnotation
          (getParameterType_Multiplier(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "multiplier"
           });		
        addAnnotation
          (getParameterType_Offset(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "offset"
           });		
        addAnnotation
          (getParameterType_Persistent(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "persistent"
           });		
        addAnnotation
          (getParameterType_Support(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "support"
           });		
        addAnnotation
          (getParameterType_TemplateIDRef(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "templateIDRef"
           });		
        addAnnotation
          (getParameterType_UniqueID(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "uniqueID"
           });		
        addAnnotation
          (pictureTypeEClass, 
           source, 
           new String[] {
             "name", "picture_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getPictureType_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getPictureType_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getPictureType_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getPictureType_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getPictureType_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getPictureType_Number(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "number"
           });		
        addAnnotation
          (getPictureType_URI(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "URI"
           });		
        addAnnotation
          (productFamilyTypeEClass, 
           source, 
           new String[] {
             "name", "productFamily_._type",
             "kind", "simple"
           });		
        addAnnotation
          (getProductFamilyType_Value(), 
           source, 
           new String[] {
             "name", ":0",
             "kind", "simple"
           });		
        addAnnotation
          (getProductFamilyType_ReadOnly(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "readOnly"
           });		
        addAnnotation
          (productNameTypeEClass, 
           source, 
           new String[] {
             "name", "productName_._type",
             "kind", "simple"
           });		
        addAnnotation
          (getProductNameType_Value(), 
           source, 
           new String[] {
             "name", ":0",
             "kind", "simple"
           });		
        addAnnotation
          (getProductNameType_ReadOnly(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "readOnly"
           });		
        addAnnotation
          (productTextTypeEClass, 
           source, 
           new String[] {
             "name", "productText_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getProductTextType_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getProductTextType_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getProductTextType_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getProductTextType_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getProductTextType_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getProductTextType_ReadOnly(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "readOnly"
           });		
        addAnnotation
          (profileBodyCommunicationNetworkPowerlinkEClass, 
           source, 
           new String[] {
             "name", "ProfileBody_CommunicationNetwork_Powerlink",
             "kind", "elementOnly"
           });			
        addAnnotation
          (getProfileBodyCommunicationNetworkPowerlink_ApplicationLayers(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ApplicationLayers",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getProfileBodyCommunicationNetworkPowerlink_TransportLayers(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "TransportLayers",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getProfileBodyCommunicationNetworkPowerlink_NetworkManagement(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "NetworkManagement",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getProfileBodyCommunicationNetworkPowerlink_ExternalProfileHandle(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ExternalProfileHandle",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (profileBodyDataTypeEClass, 
           source, 
           new String[] {
             "name", "ProfileBody_DataType",
             "kind", "empty"
           });		
        addAnnotation
          (getProfileBodyDataType_FileCreationDate(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "fileCreationDate"
           });		
        addAnnotation
          (getProfileBodyDataType_FileCreationTime(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "fileCreationTime"
           });		
        addAnnotation
          (getProfileBodyDataType_FileCreator(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "fileCreator"
           });		
        addAnnotation
          (getProfileBodyDataType_FileModificationDate(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "fileModificationDate"
           });		
        addAnnotation
          (getProfileBodyDataType_FileModificationTime(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "fileModificationTime"
           });		
        addAnnotation
          (getProfileBodyDataType_FileModifiedBy(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "fileModifiedBy"
           });		
        addAnnotation
          (getProfileBodyDataType_FileName(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "fileName"
           });		
        addAnnotation
          (getProfileBodyDataType_FileVersion(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "fileVersion"
           });		
        addAnnotation
          (getProfileBodyDataType_FormatName(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "formatName"
           });		
        addAnnotation
          (getProfileBodyDataType_FormatVersion(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "formatVersion"
           });		
        addAnnotation
          (getProfileBodyDataType_SupportedLanguages(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "supportedLanguages"
           });		
        addAnnotation
          (profileBodyDevicePowerlinkEClass, 
           source, 
           new String[] {
             "name", "ProfileBody_Device_Powerlink",
             "kind", "elementOnly"
           });			
        addAnnotation
          (getProfileBodyDevicePowerlink_DeviceIdentity(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "DeviceIdentity",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getProfileBodyDevicePowerlink_DeviceManager(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "DeviceManager",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getProfileBodyDevicePowerlink_DeviceFunction(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "DeviceFunction",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getProfileBodyDevicePowerlink_ApplicationProcess(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ApplicationProcess",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getProfileBodyDevicePowerlink_ExternalProfileHandle(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ExternalProfileHandle",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getProfileBodyDevicePowerlink_DeviceClass(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "deviceClass"
           });		
        addAnnotation
          (profileClassIDDataTypeEEnum, 
           source, 
           new String[] {
             "name", "ProfileClassID_DataType"
           });		
        addAnnotation
          (profileClassIDDataTypeObjectEDataType, 
           source, 
           new String[] {
             "name", "ProfileClassID_DataType:Object",
             "baseType", "ProfileClassID_DataType"
           });		
        addAnnotation
          (profileHandleDataTypeEClass, 
           source, 
           new String[] {
             "name", "ProfileHandle_DataType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getProfileHandleDataType_ProfileIdentification(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ProfileIdentification",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getProfileHandleDataType_ProfileRevision(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ProfileRevision",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getProfileHandleDataType_ProfileLocation(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ProfileLocation",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (profileHeaderDataTypeEClass, 
           source, 
           new String[] {
             "name", "ProfileHeader_DataType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getProfileHeaderDataType_ProfileIdentification(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ProfileIdentification",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getProfileHeaderDataType_ProfileRevision(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ProfileRevision",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getProfileHeaderDataType_ProfileName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ProfileName",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getProfileHeaderDataType_ProfileSource(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ProfileSource",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getProfileHeaderDataType_ProfileClassID(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ProfileClassID",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getProfileHeaderDataType_ProfileDate(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ProfileDate",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getProfileHeaderDataType_AdditionalInformation(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "AdditionalInformation",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getProfileHeaderDataType_ISO15745Reference(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ISO15745Reference",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getProfileHeaderDataType_IASInterfaceType(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "IASInterfaceType",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (rangeTypeEEnum, 
           source, 
           new String[] {
             "name", "range_._type"
           });		
        addAnnotation
          (rangeTypeObjectEDataType, 
           source, 
           new String[] {
             "name", "range_._type:Object",
             "baseType", "range_._type"
           });		
        addAnnotation
          (standardComplianceListTypeEClass, 
           source, 
           new String[] {
             "name", "standardComplianceList_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getStandardComplianceListType_CompliantWith(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "compliantWith",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (stateTypeEEnum, 
           source, 
           new String[] {
             "name", "state_._type"
           });		
        addAnnotation
          (stateTypeObjectEDataType, 
           source, 
           new String[] {
             "name", "state_._type:Object",
             "baseType", "state_._type"
           });		
        addAnnotation
          (staticErrorBitFieldTypeEClass, 
           source, 
           new String[] {
             "name", "StaticErrorBitField_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getStaticErrorBitFieldType_ErrorBit(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ErrorBit",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (stepTypeEClass, 
           source, 
           new String[] {
             "name", "step_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getStepType_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getStepType_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getStepType_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getStepType_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getStepType_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getStepType_Multiplier(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "multiplier"
           });		
        addAnnotation
          (getStepType_Offset(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "offset"
           });		
        addAnnotation
          (getStepType_Value(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "value"
           });		
        addAnnotation
          (structTypeEClass, 
           source, 
           new String[] {
             "name", "struct_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getStructType_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getStructType_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getStructType_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getStructType_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getStructType_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getStructType_VarDeclaration(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "varDeclaration",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getStructType_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getStructType_UniqueID(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "uniqueID"
           });		
        addAnnotation
          (subObjectTypeEClass, 
           source, 
           new String[] {
             "name", "SubObject_._type",
             "kind", "empty"
           });		
        addAnnotation
          (getSubObjectType_AccessType(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "accessType"
           });		
        addAnnotation
          (getSubObjectType_ActualValue(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "actualValue"
           });		
        addAnnotation
          (getSubObjectType_DataType(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "dataType"
           });		
        addAnnotation
          (getSubObjectType_DefaultValue(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "defaultValue"
           });		
        addAnnotation
          (getSubObjectType_Denotation(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "denotation"
           });		
        addAnnotation
          (getSubObjectType_HighLimit(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "highLimit"
           });		
        addAnnotation
          (getSubObjectType_LowLimit(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "lowLimit"
           });		
        addAnnotation
          (getSubObjectType_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getSubObjectType_ObjectType(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "objectType"
           });		
        addAnnotation
          (getSubObjectType_ObjFlags(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "objFlags"
           });		
        addAnnotation
          (getSubObjectType_PDOmapping(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "PDOmapping"
           });		
        addAnnotation
          (getSubObjectType_SubIndex(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "subIndex"
           });		
        addAnnotation
          (getSubObjectType_UniqueIDRef(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "uniqueIDRef"
           });		
        addAnnotation
          (supportedLanguagesTypeEDataType, 
           source, 
           new String[] {
             "name", "supportedLanguages_._type",
             "itemType", "http://www.eclipse.org/emf/2003/XMLType#language"
           });		
        addAnnotation
          (supportTypeEEnum, 
           source, 
           new String[] {
             "name", "support_._type"
           });		
        addAnnotation
          (supportTypeObjectEDataType, 
           source, 
           new String[] {
             "name", "support_._type:Object",
             "baseType", "support_._type"
           });		
        addAnnotation
          (tAllowedValuesEClass, 
           source, 
           new String[] {
             "name", "t_allowedValues",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTAllowedValues_Value(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "value",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTAllowedValues_Range(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "range",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTAllowedValues_TemplateIDRef(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "templateIDRef"
           });		
        addAnnotation
          (tAllowedValuesTemplateEClass, 
           source, 
           new String[] {
             "name", "t_allowedValuesTemplate",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTAllowedValuesTemplate_Value(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "value",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTAllowedValuesTemplate_Range(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "range",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTAllowedValuesTemplate_UniqueID(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "uniqueID"
           });		
        addAnnotation
          (tApplicationLayersEClass, 
           source, 
           new String[] {
             "name", "t_ApplicationLayers",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTApplicationLayers_Identity(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "identity",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTApplicationLayers_DataTypeList(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "DataTypeList",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTApplicationLayers_ObjectList(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ObjectList",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTApplicationLayers_DynamicChannels(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "dynamicChannels",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getTApplicationLayers_CommunicationEntityType(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "communicationEntityType"
           });			
        addAnnotation
          (getTApplicationLayers_ConformanceClass(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "conformanceClass"
           });		
        addAnnotation
          (tApplicationProcessEClass, 
           source, 
           new String[] {
             "name", "t_ApplicationProcess",
             "kind", "elementOnly"
           });			
        addAnnotation
          (getTApplicationProcess_DataTypeList(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "dataTypeList",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTApplicationProcess_FunctionTypeList(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "functionTypeList",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTApplicationProcess_FunctionInstanceList(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "functionInstanceList",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getTApplicationProcess_TemplateList(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "templateList",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getTApplicationProcess_ParameterList(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "parameterList",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getTApplicationProcess_ParameterGroupList(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "parameterGroupList",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (tCapabilitiesEClass, 
           source, 
           new String[] {
             "name", "t_capabilities",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTCapabilities_CharacteristicsList(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "characteristicsList",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTCapabilities_StandardComplianceList(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "standardComplianceList",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (tcnFeaturesEClass, 
           source, 
           new String[] {
             "name", "t_CNFeatures",
             "kind", "empty"
           });		
        addAnnotation
          (getTCNFeatures_DLLCNFeatureMultiplex(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "DLLCNFeatureMultiplex"
           });		
        addAnnotation
          (getTCNFeatures_DLLCNPResChaining(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "DLLCNPResChaining"
           });		
        addAnnotation
          (getTCNFeatures_NMTCNSoC2PReq(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTCNSoC2PReq"
           });		
        addAnnotation
          (tCombinedStateEClass, 
           source, 
           new String[] {
             "name", "t_combinedState",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTCombinedState_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getTCombinedState_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTCombinedState_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTCombinedState_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTCombinedState_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getTCombinedState_LEDstateRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "LEDstateRef",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (tConditionalSupportEClass, 
           source, 
           new String[] {
             "name", "t_conditionalSupport",
             "kind", "empty"
           });		
        addAnnotation
          (getTConditionalSupport_ParamIDRef(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "paramIDRef"
           });		
        addAnnotation
          (tCountEClass, 
           source, 
           new String[] {
             "name", "t_count",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTCount_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getTCount_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTCount_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTCount_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTCount_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getTCount_DefaultValue(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "defaultValue",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTCount_AllowedValues(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "allowedValues",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTCount_Access(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "access"
           });		
        addAnnotation
          (getTCount_UniqueID(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "uniqueID"
           });		
        addAnnotation
          (tDataTypeIDRefEClass, 
           source, 
           new String[] {
             "name", "t_dataTypeIDRef",
             "kind", "empty"
           });		
        addAnnotation
          (getTDataTypeIDRef_UniqueIDRef(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "uniqueIDRef"
           });		
        addAnnotation
          (tDataTypeListEClass, 
           source, 
           new String[] {
             "name", "t_dataTypeList",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTDataTypeList_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getTDataTypeList_Array(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "array",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTDataTypeList_Struct(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "struct",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTDataTypeList_Enum(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "enum",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTDataTypeList_Derived(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "derived",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (tDataTypesEClass, 
           source, 
           new String[] {
             "name", "t_DataTypes",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTDataTypes_Boolean(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Boolean",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDataTypes_Integer8(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Integer8",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDataTypes_Integer16(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Integer16",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDataTypes_Integer32(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Integer32",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDataTypes_Integer24(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Integer24",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDataTypes_Integer40(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Integer40",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDataTypes_Integer48(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Integer48",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDataTypes_Integer56(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Integer56",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDataTypes_Integer64(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Integer64",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDataTypes_Unsigned8(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Unsigned8",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDataTypes_Unsigned16(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Unsigned16",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDataTypes_Unsigned32(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Unsigned32",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDataTypes_Unsigned24(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Unsigned24",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDataTypes_Unsigned40(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Unsigned40",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDataTypes_Unsigned48(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Unsigned48",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDataTypes_Unsigned56(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Unsigned56",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDataTypes_Unsigned64(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Unsigned64",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDataTypes_Real32(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Real32",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDataTypes_Real64(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Real64",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDataTypes_VisibleString(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Visible_String",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDataTypes_OctetString(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Octet_String",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDataTypes_UnicodeString(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Unicode_String",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDataTypes_TimeOfDay(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Time_of_Day",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDataTypes_TimeDiff(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Time_Diff",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDataTypes_Domain(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Domain",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDataTypes_MACADDRESS(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "MAC_ADDRESS",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDataTypes_IPADDRESS(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "IP_ADDRESS",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDataTypes_NETTIME(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "NETTIME",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDataTypes_DataType(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "dataType"
           });		
        addAnnotation
          (tDenotationEClass, 
           source, 
           new String[] {
             "name", "t_denotation",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTDenotation_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getTDenotation_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTDenotation_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTDenotation_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTDenotation_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (tDeviceCommissioningEClass, 
           source, 
           new String[] {
             "name", "t_deviceCommissioning",
             "kind", "empty"
           });		
        addAnnotation
          (getTDeviceCommissioning_NetworkName(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "networkName"
           });		
        addAnnotation
          (getTDeviceCommissioning_NodeID(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "nodeID"
           });		
        addAnnotation
          (getTDeviceCommissioning_NodeName(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "nodeName"
           });		
        addAnnotation
          (getTDeviceCommissioning_NodeType(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "nodeType"
           });		
        addAnnotation
          (getTDeviceCommissioning_UsedNetworkInterface(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "usedNetworkInterface"
           });		
        addAnnotation
          (tDeviceFamilyEClass, 
           source, 
           new String[] {
             "name", "t_deviceFamily",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTDeviceFamily_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getTDeviceFamily_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTDeviceFamily_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTDeviceFamily_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTDeviceFamily_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getTDeviceFamily_ReadOnly(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "readOnly"
           });		
        addAnnotation
          (tDeviceFunctionEClass, 
           source, 
           new String[] {
             "name", "t_DeviceFunction",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTDeviceFunction_Capabilities(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "capabilities",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDeviceFunction_PicturesList(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "picturesList",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDeviceFunction_DictionaryList(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "dictionaryList",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (tDeviceIdentityEClass, 
           source, 
           new String[] {
             "name", "t_DeviceIdentity",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTDeviceIdentity_VendorName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "vendorName",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDeviceIdentity_VendorID(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "vendorID",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDeviceIdentity_VendorText(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "vendorText",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDeviceIdentity_DeviceFamily(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "deviceFamily",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDeviceIdentity_ProductFamily(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "productFamily",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDeviceIdentity_ProductName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "productName",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDeviceIdentity_ProductID(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "productID",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDeviceIdentity_ProductText(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "productText",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDeviceIdentity_OrderNumber(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "orderNumber",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDeviceIdentity_Version(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "version",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDeviceIdentity_BuildDate(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "buildDate",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDeviceIdentity_SpecificationRevision(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "specificationRevision",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTDeviceIdentity_InstanceName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "instanceName",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (tDeviceManagerEClass, 
           source, 
           new String[] {
             "name", "t_DeviceManager",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTDeviceManager_IndicatorList(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "indicatorList",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (tDiagnosticEClass, 
           source, 
           new String[] {
             "name", "t_Diagnostic",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTDiagnostic_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });		
        addAnnotation
          (getTDiagnostic_ErrorList(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ErrorList",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getTDiagnostic_StaticErrorBitField(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "StaticErrorBitField",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (tDictionaryListEClass, 
           source, 
           new String[] {
             "name", "t_dictionaryList",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTDictionaryList_Dictionary(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "dictionary",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (tDynamicChannelEClass, 
           source, 
           new String[] {
             "name", "t_dynamicChannel",
             "kind", "empty"
           });		
        addAnnotation
          (getTDynamicChannel_AccessType(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "accessType"
           });		
        addAnnotation
          (getTDynamicChannel_AddressOffset(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "addressOffset"
           });		
        addAnnotation
          (getTDynamicChannel_BitAlignment(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "bitAlignment"
           });		
        addAnnotation
          (getTDynamicChannel_DataType(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "dataType"
           });		
        addAnnotation
          (getTDynamicChannel_EndIndex(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "endIndex"
           });		
        addAnnotation
          (getTDynamicChannel_MaxNumber(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "maxNumber"
           });		
        addAnnotation
          (getTDynamicChannel_StartIndex(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "startIndex"
           });		
        addAnnotation
          (tEnumValueEClass, 
           source, 
           new String[] {
             "name", "t_enumValue",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTEnumValue_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getTEnumValue_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTEnumValue_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTEnumValue_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTEnumValue_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getTEnumValue_Value(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "value"
           });		
        addAnnotation
          (textEntryTypeEClass, 
           source, 
           new String[] {
             "name", "textEntry_._type",
             "kind", "simple"
           });		
        addAnnotation
          (getTextEntryType_Value(), 
           source, 
           new String[] {
             "name", ":0",
             "kind", "simple"
           });			
        addAnnotation
          (getTextEntryType_TextID(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "textID"
           });		
        addAnnotation
          (textResourceTypeEClass, 
           source, 
           new String[] {
             "name", "textResource_._type",
             "kind", "elementOnly"
           });			
        addAnnotation
          (getTextResourceType_TextEntry(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "textEntry",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getTextResourceType_Lang(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "lang"
           });		
        addAnnotation
          (tFunctionInstanceListEClass, 
           source, 
           new String[] {
             "name", "t_functionInstanceList",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTFunctionInstanceList_FunctionInstance(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "functionInstance",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTFunctionInstanceList_Connection(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "connection",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (tFunctionTypeListEClass, 
           source, 
           new String[] {
             "name", "t_functionTypeList",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTFunctionTypeList_FunctionType(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "functionType",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (tGeneralFeaturesEClass, 
           source, 
           new String[] {
             "name", "t_GeneralFeatures",
             "kind", "empty"
           });		
        addAnnotation
          (getTGeneralFeatures_CFMConfigManager(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "CFMConfigManager"
           });		
        addAnnotation
          (getTGeneralFeatures_DLLErrBadPhysMode(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "DLLErrBadPhysMode"
           });		
        addAnnotation
          (getTGeneralFeatures_DLLErrMacBuffer(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "DLLErrMacBuffer"
           });		
        addAnnotation
          (getTGeneralFeatures_DLLFeatureCN(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "DLLFeatureCN"
           });		
        addAnnotation
          (getTGeneralFeatures_DLLFeatureMN(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "DLLFeatureMN"
           });		
        addAnnotation
          (getTGeneralFeatures_NMTBootTimeNotActive(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTBootTimeNotActive"
           });		
        addAnnotation
          (getTGeneralFeatures_NMTCycleTimeGranularity(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTCycleTimeGranularity"
           });		
        addAnnotation
          (getTGeneralFeatures_NMTCycleTimeMax(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTCycleTimeMax"
           });		
        addAnnotation
          (getTGeneralFeatures_NMTCycleTimeMin(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTCycleTimeMin"
           });		
        addAnnotation
          (getTGeneralFeatures_NMTEmergencyQueueSize(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTEmergencyQueueSize"
           });		
        addAnnotation
          (getTGeneralFeatures_NMTErrorEntries(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTErrorEntries"
           });		
        addAnnotation
          (getTGeneralFeatures_NMTFlushArpEntry(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTFlushArpEntry"
           });		
        addAnnotation
          (getTGeneralFeatures_NMTMaxCNNodeID(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTMaxCNNodeID"
           });		
        addAnnotation
          (getTGeneralFeatures_NMTMaxCNNumber(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTMaxCNNumber"
           });		
        addAnnotation
          (getTGeneralFeatures_NMTMaxHeartbeats(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTMaxHeartbeats"
           });		
        addAnnotation
          (getTGeneralFeatures_NMTMinRedCycleTime(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTMinRedCycleTime"
           });		
        addAnnotation
          (getTGeneralFeatures_NMTNetHostNameSet(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTNetHostNameSet"
           });		
        addAnnotation
          (getTGeneralFeatures_NMTNodeIDByHW(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTNodeIDByHW"
           });		
        addAnnotation
          (getTGeneralFeatures_NMTProductCode(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTProductCode"
           });		
        addAnnotation
          (getTGeneralFeatures_NMTPublishActiveNodes(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTPublishActiveNodes"
           });		
        addAnnotation
          (getTGeneralFeatures_NMTPublishConfigNodes(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTPublishConfigNodes"
           });		
        addAnnotation
          (getTGeneralFeatures_NMTPublishEmergencyNew(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTPublishEmergencyNew"
           });		
        addAnnotation
          (getTGeneralFeatures_NMTPublishNodeState(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTPublishNodeState"
           });		
        addAnnotation
          (getTGeneralFeatures_NMTPublishOperational(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTPublishOperational"
           });		
        addAnnotation
          (getTGeneralFeatures_NMTPublishPreOp1(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTPublishPreOp1"
           });		
        addAnnotation
          (getTGeneralFeatures_NMTPublishPreOp2(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTPublishPreOp2"
           });		
        addAnnotation
          (getTGeneralFeatures_NMTPublishReadyToOp(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTPublishReadyToOp"
           });		
        addAnnotation
          (getTGeneralFeatures_NMTPublishStopped(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTPublishStopped"
           });		
        addAnnotation
          (getTGeneralFeatures_NMTPublishTime(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTPublishTime"
           });		
        addAnnotation
          (getTGeneralFeatures_NMTRevisionNo(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTRevisionNo"
           });		
        addAnnotation
          (getTGeneralFeatures_NWLForward(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NWLForward"
           });		
        addAnnotation
          (getTGeneralFeatures_NWLICMPSupport(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NWLICMPSupport"
           });		
        addAnnotation
          (getTGeneralFeatures_NWLIPSupport(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NWLIPSupport"
           });		
        addAnnotation
          (getTGeneralFeatures_PDOGranularity(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "PDOGranularity"
           });		
        addAnnotation
          (getTGeneralFeatures_PDOMaxDescrMem(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "PDOMaxDescrMem"
           });		
        addAnnotation
          (getTGeneralFeatures_PDORPDOChannelObjects(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "PDORPDOChannelObjects"
           });		
        addAnnotation
          (getTGeneralFeatures_PDORPDOChannels(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "PDORPDOChannels"
           });		
        addAnnotation
          (getTGeneralFeatures_PDORPDOCycleDataLim(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "PDORPDOCycleDataLim"
           });		
        addAnnotation
          (getTGeneralFeatures_PDORPDOOverallObjects(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "PDORPDOOverallObjects"
           });		
        addAnnotation
          (getTGeneralFeatures_PDOSelfReceipt(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "PDOSelfReceipt"
           });		
        addAnnotation
          (getTGeneralFeatures_PDOTPDOChannelObjects(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "PDOTPDOChannelObjects"
           });		
        addAnnotation
          (getTGeneralFeatures_PDOTPDOCycleDataLim(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "PDOTPDOCycleDataLim"
           });		
        addAnnotation
          (getTGeneralFeatures_PDOTPDOOverallObjects(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "PDOTPDOOverallObjects"
           });		
        addAnnotation
          (getTGeneralFeatures_PHYExtEPLPorts(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "PHYExtEPLPorts"
           });		
        addAnnotation
          (getTGeneralFeatures_PHYHubDelay(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "PHYHubDelay"
           });		
        addAnnotation
          (getTGeneralFeatures_PHYHubIntegrated(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "PHYHubIntegrated"
           });		
        addAnnotation
          (getTGeneralFeatures_PHYHubJitter(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "PHYHubJitter"
           });		
        addAnnotation
          (getTGeneralFeatures_RT1RT1SecuritySupport(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "RT1RT1SecuritySupport"
           });		
        addAnnotation
          (getTGeneralFeatures_RT1RT1Support(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "RT1RT1Support"
           });		
        addAnnotation
          (getTGeneralFeatures_RT2RT2Support(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "RT2RT2Support"
           });		
        addAnnotation
          (getTGeneralFeatures_SDOClient(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "SDOClient"
           });		
        addAnnotation
          (getTGeneralFeatures_SDOCmdFileRead(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "SDOCmdFileRead"
           });		
        addAnnotation
          (getTGeneralFeatures_SDOCmdFileWrite(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "SDOCmdFileWrite"
           });		
        addAnnotation
          (getTGeneralFeatures_SDOCmdLinkName(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "SDOCmdLinkName"
           });		
        addAnnotation
          (getTGeneralFeatures_SDOCmdReadAllByIndex(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "SDOCmdReadAllByIndex"
           });		
        addAnnotation
          (getTGeneralFeatures_SDOCmdReadByName(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "SDOCmdReadByName"
           });		
        addAnnotation
          (getTGeneralFeatures_SDOCmdReadMultParam(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "SDOCmdReadMultParam"
           });		
        addAnnotation
          (getTGeneralFeatures_SDOCmdWriteAllByIndex(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "SDOCmdWriteAllByIndex"
           });		
        addAnnotation
          (getTGeneralFeatures_SDOCmdWriteByName(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "SDOCmdWriteByName"
           });		
        addAnnotation
          (getTGeneralFeatures_SDOCmdWriteMultParam(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "SDOCmdWriteMultParam"
           });		
        addAnnotation
          (getTGeneralFeatures_SDOMaxConnections(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "SDOMaxConnections"
           });		
        addAnnotation
          (getTGeneralFeatures_SDOMaxParallelConnections(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "SDOMaxParallelConnections"
           });		
        addAnnotation
          (getTGeneralFeatures_SDOSeqLayerTxHistorySize(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "SDOSeqLayerTxHistorySize"
           });		
        addAnnotation
          (getTGeneralFeatures_SDOServer(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "SDOServer"
           });		
        addAnnotation
          (tIndicatorListEClass, 
           source, 
           new String[] {
             "name", "t_indicatorList",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTIndicatorList_LEDList(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "LEDList",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (tledEClass, 
           source, 
           new String[] {
             "name", "t_LED",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTLED_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getTLED_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTLED_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTLED_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTLED_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getTLED_LEDstate(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "LEDstate",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTLED_LEDcolors(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "LEDcolors"
           });		
        addAnnotation
          (getTLED_LEDtype(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "LEDtype"
           });		
        addAnnotation
          (tmnFeaturesEClass, 
           source, 
           new String[] {
             "name", "t_MNFeatures",
             "kind", "empty"
           });		
        addAnnotation
          (getTMNFeatures_DLLErrMNMultipleMN(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "DLLErrMNMultipleMN"
           });		
        addAnnotation
          (getTMNFeatures_DLLMNFeatureMultiplex(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "DLLMNFeatureMultiplex"
           });		
        addAnnotation
          (getTMNFeatures_DLLMNFeaturePResTx(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "DLLMNFeaturePResTx"
           });		
        addAnnotation
          (getTMNFeatures_DLLMNPResChaining(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "DLLMNPResChaining"
           });		
        addAnnotation
          (getTMNFeatures_NMTMNASnd2SoC(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTMNASnd2SoC"
           });		
        addAnnotation
          (getTMNFeatures_NMTMNBasicEthernet(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTMNBasicEthernet"
           });		
        addAnnotation
          (getTMNFeatures_NMTMNMultiplCycMax(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTMNMultiplCycMax"
           });		
        addAnnotation
          (getTMNFeatures_NMTMNPRes2PReq(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTMNPRes2PReq"
           });		
        addAnnotation
          (getTMNFeatures_NMTMNPRes2PRes(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTMNPRes2PRes"
           });		
        addAnnotation
          (getTMNFeatures_NMTMNPResRx2SoA(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTMNPResRx2SoA"
           });		
        addAnnotation
          (getTMNFeatures_NMTMNPResTx2SoA(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTMNPResTx2SoA"
           });		
        addAnnotation
          (getTMNFeatures_NMTMNSoA2ASndTx(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTMNSoA2ASndTx"
           });		
        addAnnotation
          (getTMNFeatures_NMTMNSoC2PReq(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTMNSoC2PReq"
           });		
        addAnnotation
          (getTMNFeatures_NMTNetTime(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTNetTime"
           });		
        addAnnotation
          (getTMNFeatures_NMTNetTimeIsRealTime(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTNetTimeIsRealTime"
           });		
        addAnnotation
          (getTMNFeatures_NMTRelativeTime(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTRelativeTime"
           });		
        addAnnotation
          (getTMNFeatures_NMTSimpleBoot(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "NMTSimpleBoot"
           });		
        addAnnotation
          (getTMNFeatures_PDOTPDOChannels(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "PDOTPDOChannels"
           });		
        addAnnotation
          (tNetworkManagementEClass, 
           source, 
           new String[] {
             "name", "t_NetworkManagement",
             "kind", "elementOnly"
           });			
        addAnnotation
          (getTNetworkManagement_GeneralFeatures(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "GeneralFeatures",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getTNetworkManagement_MNFeatures(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "MNFeatures",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getTNetworkManagement_CNFeatures(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "CNFeatures",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getTNetworkManagement_DeviceCommissioning(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "deviceCommissioning",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getTNetworkManagement_Diagnostic(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Diagnostic",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (tObjectEClass, 
           source, 
           new String[] {
             "name", "t_Object",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTObject_SubObject(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "SubObject",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTObject_AccessType(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "accessType"
           });		
        addAnnotation
          (getTObject_ActualValue(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "actualValue"
           });		
        addAnnotation
          (getTObject_DataType(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "dataType"
           });		
        addAnnotation
          (getTObject_DefaultValue(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "defaultValue"
           });		
        addAnnotation
          (getTObject_Denotation(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "denotation"
           });		
        addAnnotation
          (getTObject_HighLimit(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "highLimit"
           });		
        addAnnotation
          (getTObject_Index(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "index"
           });		
        addAnnotation
          (getTObject_LowLimit(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "lowLimit"
           });		
        addAnnotation
          (getTObject_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getTObject_ObjectType(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "objectType"
           });		
        addAnnotation
          (getTObject_ObjFlags(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "objFlags"
           });		
        addAnnotation
          (getTObject_PDOmapping(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "PDOmapping"
           });		
        addAnnotation
          (getTObject_SubNumber(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "subNumber"
           });		
        addAnnotation
          (getTObject_UniqueIDRef(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "uniqueIDRef"
           });		
        addAnnotation
          (tObjectAccessTypeEEnum, 
           source, 
           new String[] {
             "name", "t_ObjectAccessType"
           });						
        addAnnotation
          (tObjectAccessTypeObjectEDataType, 
           source, 
           new String[] {
             "name", "t_ObjectAccessType:Object",
             "baseType", "t_ObjectAccessType"
           });		
        addAnnotation
          (tObjectPDOMappingEEnum, 
           source, 
           new String[] {
             "name", "t_ObjectPDOMapping"
           });							
        addAnnotation
          (tObjectPDOMappingObjectEDataType, 
           source, 
           new String[] {
             "name", "t_ObjectPDOMapping:Object",
             "baseType", "t_ObjectPDOMapping"
           });		
        addAnnotation
          (tParameterGroupEClass, 
           source, 
           new String[] {
             "name", "t_parameterGroup",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTParameterGroup_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getTParameterGroup_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTParameterGroup_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTParameterGroup_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTParameterGroup_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getTParameterGroup_ParameterGroup(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "parameterGroup",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTParameterGroup_ParameterRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "parameterRef",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTParameterGroup_KindOfAccess(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "kindOfAccess"
           });		
        addAnnotation
          (getTParameterGroup_UniqueID(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "uniqueID"
           });		
        addAnnotation
          (tParameterGroupListEClass, 
           source, 
           new String[] {
             "name", "t_parameterGroupList",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTParameterGroupList_ParameterGroup(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "parameterGroup",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (tParameterListEClass, 
           source, 
           new String[] {
             "name", "t_parameterList",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTParameterList_Parameter(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "parameter",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (tParameterTemplateEClass, 
           source, 
           new String[] {
             "name", "t_parameterTemplate",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTParameterTemplate_BOOL(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "BOOL",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTParameterTemplate_BITSTRING(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "BITSTRING",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTParameterTemplate_BYTE(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "BYTE",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTParameterTemplate_CHAR(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "CHAR",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTParameterTemplate_WORD(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "WORD",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTParameterTemplate_DWORD(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "DWORD",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTParameterTemplate_LWORD(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "LWORD",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTParameterTemplate_SINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "SINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTParameterTemplate_INT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "INT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTParameterTemplate_DINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "DINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTParameterTemplate_LINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "LINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTParameterTemplate_USINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "USINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTParameterTemplate_UINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "UINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTParameterTemplate_UDINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "UDINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTParameterTemplate_ULINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ULINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTParameterTemplate_REAL(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "REAL",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTParameterTemplate_LREAL(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "LREAL",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTParameterTemplate_STRING(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "STRING",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTParameterTemplate_WSTRING(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "WSTRING",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTParameterTemplate_DataTypeIDRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "dataTypeIDRef",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTParameterTemplate_ConditionalSupport(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "conditionalSupport",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTParameterTemplate_ActualValue(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "actualValue",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTParameterTemplate_DefaultValue(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "defaultValue",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTParameterTemplate_SubstituteValue(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "substituteValue",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTParameterTemplate_AllowedValues(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "allowedValues",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTParameterTemplate_Unit(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "unit",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTParameterTemplate_Property(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "property",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTParameterTemplate_Access(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "access"
           });		
        addAnnotation
          (getTParameterTemplate_AccessList(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "accessList"
           });		
        addAnnotation
          (getTParameterTemplate_Multiplier(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "multiplier"
           });		
        addAnnotation
          (getTParameterTemplate_Offset(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "offset"
           });		
        addAnnotation
          (getTParameterTemplate_Persistent(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "persistent"
           });		
        addAnnotation
          (getTParameterTemplate_Support(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "support"
           });		
        addAnnotation
          (getTParameterTemplate_TemplateIDRef(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "templateIDRef"
           });		
        addAnnotation
          (getTParameterTemplate_UniqueID(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "uniqueID"
           });		
        addAnnotation
          (tPicturesListEClass, 
           source, 
           new String[] {
             "name", "t_picturesList",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTPicturesList_Picture(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "picture",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (tProductIDEClass, 
           source, 
           new String[] {
             "name", "t_productID",
             "kind", "simple"
           });		
        addAnnotation
          (getTProductID_Value(), 
           source, 
           new String[] {
             "name", ":0",
             "kind", "simple"
           });		
        addAnnotation
          (getTProductID_ReadOnly(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "readOnly"
           });		
        addAnnotation
          (tPropertyEClass, 
           source, 
           new String[] {
             "name", "t_property",
             "kind", "empty"
           });		
        addAnnotation
          (getTProperty_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getTProperty_Value(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "value"
           });		
        addAnnotation
          (tRangeEClass, 
           source, 
           new String[] {
             "name", "t_range",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTRange_MinValue(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "minValue",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTRange_MaxValue(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "maxValue",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTRange_Step(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "step",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (tSpecificationRevisionEClass, 
           source, 
           new String[] {
             "name", "t_specificationRevision",
             "kind", "simple"
           });		
        addAnnotation
          (getTSpecificationRevision_Value(), 
           source, 
           new String[] {
             "name", ":0",
             "kind", "simple"
           });		
        addAnnotation
          (getTSpecificationRevision_ReadOnly(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "readOnly"
           });		
        addAnnotation
          (tSubrangeEClass, 
           source, 
           new String[] {
             "name", "t_subrange",
             "kind", "empty"
           });		
        addAnnotation
          (getTSubrange_LowerLimit(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "lowerLimit"
           });		
        addAnnotation
          (getTSubrange_UpperLimit(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "upperLimit"
           });		
        addAnnotation
          (tTemplateListEClass, 
           source, 
           new String[] {
             "name", "t_templateList",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTTemplateList_ParameterTemplate(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "parameterTemplate",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTTemplateList_AllowedValuesTemplate(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "allowedValuesTemplate",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (tTransportLayersEClass, 
           source, 
           new String[] {
           });		
        addAnnotation
          (tUnitEClass, 
           source, 
           new String[] {
             "name", "t_unit",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTUnit_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getTUnit_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTUnit_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTUnit_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTUnit_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getTUnit_Multiplier(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "multiplier"
           });		
        addAnnotation
          (getTUnit_UnitURI(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "unitURI"
           });		
        addAnnotation
          (tValueEClass, 
           source, 
           new String[] {
             "name", "t_value",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTValue_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getTValue_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTValue_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTValue_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTValue_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getTValue_Multiplier(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "multiplier"
           });		
        addAnnotation
          (getTValue_Offset(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "offset"
           });		
        addAnnotation
          (getTValue_Value(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "value"
           });		
        addAnnotation
          (tVarDeclarationEClass, 
           source, 
           new String[] {
             "name", "t_varDeclaration",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTVarDeclaration_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getTVarDeclaration_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTVarDeclaration_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTVarDeclaration_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getTVarDeclaration_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getTVarDeclaration_BOOL(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "BOOL",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTVarDeclaration_BITSTRING(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "BITSTRING",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTVarDeclaration_BYTE(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "BYTE",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTVarDeclaration_CHAR(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "CHAR",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTVarDeclaration_WORD(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "WORD",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTVarDeclaration_DWORD(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "DWORD",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTVarDeclaration_LWORD(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "LWORD",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTVarDeclaration_SINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "SINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTVarDeclaration_INT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "INT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTVarDeclaration_DINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "DINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTVarDeclaration_LINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "LINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTVarDeclaration_USINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "USINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTVarDeclaration_UINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "UINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTVarDeclaration_UDINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "UDINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTVarDeclaration_ULINT(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ULINT",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTVarDeclaration_REAL(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "REAL",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTVarDeclaration_LREAL(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "LREAL",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTVarDeclaration_STRING(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "STRING",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTVarDeclaration_WSTRING(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "WSTRING",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTVarDeclaration_DataTypeIDRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "dataTypeIDRef",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTVarDeclaration_InitialValue(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "initialValue"
           });		
        addAnnotation
          (getTVarDeclaration_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getTVarDeclaration_Size(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "size"
           });		
        addAnnotation
          (getTVarDeclaration_UniqueID(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "uniqueID"
           });		
        addAnnotation
          (tVariableRefEClass, 
           source, 
           new String[] {
             "name", "t_variableRef",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTVariableRef_InstanceIDRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "instanceIDRef",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTVariableRef_VariableIDRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "variableIDRef",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTVariableRef_MemberRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "memberRef",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTVariableRef_Position(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "position"
           });		
        addAnnotation
          (tVendorIDEClass, 
           source, 
           new String[] {
             "name", "t_vendorID",
             "kind", "simple"
           });		
        addAnnotation
          (getTVendorID_Value(), 
           source, 
           new String[] {
             "name", ":0",
             "kind", "simple"
           });		
        addAnnotation
          (getTVendorID_ReadOnly(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "readOnly"
           });		
        addAnnotation
          (tVersionEClass, 
           source, 
           new String[] {
             "name", "t_version",
             "kind", "simple"
           });		
        addAnnotation
          (getTVersion_Value(), 
           source, 
           new String[] {
             "name", ":0",
             "kind", "simple"
           });		
        addAnnotation
          (getTVersion_ReadOnly(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "readOnly"
           });		
        addAnnotation
          (getTVersion_VersionType(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "versionType"
           });		
        addAnnotation
          (valueTypeEClass, 
           source, 
           new String[] {
             "name", "value_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getValueType_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getValueType_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getValueType_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getValueType_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getValueType_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getValueType_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getValueType_Value(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "value"
           });		
        addAnnotation
          (variableIDRefTypeEClass, 
           source, 
           new String[] {
             "name", "variableIDRef_._type",
             "kind", "empty"
           });		
        addAnnotation
          (getVariableIDRefType_UniqueIDRef(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "uniqueIDRef"
           });		
        addAnnotation
          (vendorNameTypeEClass, 
           source, 
           new String[] {
             "name", "vendorName_._type",
             "kind", "simple"
           });		
        addAnnotation
          (getVendorNameType_Value(), 
           source, 
           new String[] {
             "name", ":0",
             "kind", "simple"
           });		
        addAnnotation
          (getVendorNameType_ReadOnly(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "readOnly"
           });		
        addAnnotation
          (vendorTextTypeEClass, 
           source, 
           new String[] {
             "name", "vendorText_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getVendorTextType_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getVendorTextType_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getVendorTextType_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getVendorTextType_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getVendorTextType_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getVendorTextType_ReadOnly(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "readOnly"
           });		
        addAnnotation
          (versionInfoTypeEClass, 
           source, 
           new String[] {
             "name", "versionInfo_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getVersionInfoType_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });			
        addAnnotation
          (getVersionInfoType_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "label",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getVersionInfoType_Description(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "description",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getVersionInfoType_LabelRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "labelRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });			
        addAnnotation
          (getVersionInfoType_DescriptionRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "descriptionRef",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getVersionInfoType_Author(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "author"
           });		
        addAnnotation
          (getVersionInfoType_Date(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "date"
           });		
        addAnnotation
          (getVersionInfoType_Organization(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "organization"
           });		
        addAnnotation
          (getVersionInfoType_Version(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "version"
           });		
        addAnnotation
          (versionTypeTypeEEnum, 
           source, 
           new String[] {
             "name", "versionType_._type"
           });					
        addAnnotation
          (versionTypeTypeObjectEDataType, 
           source, 
           new String[] {
             "name", "versionType_._type:Object",
             "baseType", "versionType_._type"
           });
    }

} //XDDPackageImpl
