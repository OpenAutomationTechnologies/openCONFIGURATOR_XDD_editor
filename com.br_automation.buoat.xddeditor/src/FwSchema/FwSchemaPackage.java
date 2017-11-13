/**
 */
package FwSchema;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see FwSchema.FwSchemaFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface FwSchemaPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "FwSchema";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "file:/D:/OCPV2.2_Release/openconfigurator-core-plugin/org.epsg.openconfigurator/resources/firmwareschema/fw_schema.xsd";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "FwSchema";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    FwSchemaPackage eINSTANCE = FwSchema.impl.FwSchemaPackageImpl.init();

    /**
     * The meta object id for the '{@link FwSchema.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see FwSchema.impl.DocumentRootImpl
     * @see FwSchema.impl.FwSchemaPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 0;

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
     * The feature id for the '<em><b>Firmware</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FIRMWARE = 3;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link FwSchema.impl.FirmwareTypeImpl <em>Firmware Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see FwSchema.impl.FirmwareTypeImpl
     * @see FwSchema.impl.FwSchemaPackageImpl#getFirmwareType()
     * @generated
     */
    int FIRMWARE_TYPE = 1;

    /**
     * The feature id for the '<em><b>Appl Sw Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIRMWARE_TYPE__APPL_SW_DATE = 0;

    /**
     * The feature id for the '<em><b>Appl Sw Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIRMWARE_TYPE__APPL_SW_TIME = 1;

    /**
     * The feature id for the '<em><b>Boot Offs Hi</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIRMWARE_TYPE__BOOT_OFFS_HI = 2;

    /**
     * The feature id for the '<em><b>Chk</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIRMWARE_TYPE__CHK = 3;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIRMWARE_TYPE__DATE = 4;

    /**
     * The feature id for the '<em><b>Dev</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIRMWARE_TYPE__DEV = 5;

    /**
     * The feature id for the '<em><b>Fct</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIRMWARE_TYPE__FCT = 6;

    /**
     * The feature id for the '<em><b>Keep Xml Header</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIRMWARE_TYPE__KEEP_XML_HEADER = 7;

    /**
     * The feature id for the '<em><b>Len</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIRMWARE_TYPE__LEN = 8;

    /**
     * The feature id for the '<em><b>Mat</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIRMWARE_TYPE__MAT = 9;

    /**
     * The feature id for the '<em><b>Rem</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIRMWARE_TYPE__REM = 10;

    /**
     * The feature id for the '<em><b>Use</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIRMWARE_TYPE__USE = 11;

    /**
     * The feature id for the '<em><b>Var</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIRMWARE_TYPE__VAR = 12;

    /**
     * The feature id for the '<em><b>Ven</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIRMWARE_TYPE__VEN = 13;

    /**
     * The feature id for the '<em><b>Ver</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIRMWARE_TYPE__VER = 14;

    /**
     * The number of structural features of the '<em>Firmware Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIRMWARE_TYPE_FEATURE_COUNT = 15;

    /**
     * The number of operations of the '<em>Firmware Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIRMWARE_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link FwSchema.KeepXmlHeaderType <em>Keep Xml Header Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see FwSchema.KeepXmlHeaderType
     * @see FwSchema.impl.FwSchemaPackageImpl#getKeepXmlHeaderType()
     * @generated
     */
    int KEEP_XML_HEADER_TYPE = 2;

    /**
     * The meta object id for the '<em>Boot Offs Hi Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see FwSchema.impl.FwSchemaPackageImpl#getBootOffsHiType()
     * @generated
     */
    int BOOT_OFFS_HI_TYPE = 3;

    /**
     * The meta object id for the '<em>Chk Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see FwSchema.impl.FwSchemaPackageImpl#getChkType()
     * @generated
     */
    int CHK_TYPE = 4;

    /**
     * The meta object id for the '<em>Date Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see FwSchema.impl.FwSchemaPackageImpl#getDateType()
     * @generated
     */
    int DATE_TYPE = 5;

    /**
     * The meta object id for the '<em>Keep Xml Header Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see FwSchema.KeepXmlHeaderType
     * @see FwSchema.impl.FwSchemaPackageImpl#getKeepXmlHeaderTypeObject()
     * @generated
     */
    int KEEP_XML_HEADER_TYPE_OBJECT = 6;

    /**
     * The meta object id for the '<em>Mat Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see FwSchema.impl.FwSchemaPackageImpl#getMatType()
     * @generated
     */
    int MAT_TYPE = 7;

    /**
     * The meta object id for the '<em>Ven Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see FwSchema.impl.FwSchemaPackageImpl#getVenType()
     * @generated
     */
    int VEN_TYPE = 8;


    /**
     * Returns the meta object for class '{@link FwSchema.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see FwSchema.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link FwSchema.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see FwSchema.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link FwSchema.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see FwSchema.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link FwSchema.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see FwSchema.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link FwSchema.DocumentRoot#getFirmware <em>Firmware</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Firmware</em>'.
     * @see FwSchema.DocumentRoot#getFirmware()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Firmware();

    /**
     * Returns the meta object for class '{@link FwSchema.FirmwareType <em>Firmware Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Firmware Type</em>'.
     * @see FwSchema.FirmwareType
     * @generated
     */
    EClass getFirmwareType();

    /**
     * Returns the meta object for the attribute '{@link FwSchema.FirmwareType#getApplSwDate <em>Appl Sw Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Appl Sw Date</em>'.
     * @see FwSchema.FirmwareType#getApplSwDate()
     * @see #getFirmwareType()
     * @generated
     */
    EAttribute getFirmwareType_ApplSwDate();

    /**
     * Returns the meta object for the attribute '{@link FwSchema.FirmwareType#getApplSwTime <em>Appl Sw Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Appl Sw Time</em>'.
     * @see FwSchema.FirmwareType#getApplSwTime()
     * @see #getFirmwareType()
     * @generated
     */
    EAttribute getFirmwareType_ApplSwTime();

    /**
     * Returns the meta object for the attribute '{@link FwSchema.FirmwareType#getBootOffsHi <em>Boot Offs Hi</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Boot Offs Hi</em>'.
     * @see FwSchema.FirmwareType#getBootOffsHi()
     * @see #getFirmwareType()
     * @generated
     */
    EAttribute getFirmwareType_BootOffsHi();

    /**
     * Returns the meta object for the attribute '{@link FwSchema.FirmwareType#getChk <em>Chk</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Chk</em>'.
     * @see FwSchema.FirmwareType#getChk()
     * @see #getFirmwareType()
     * @generated
     */
    EAttribute getFirmwareType_Chk();

    /**
     * Returns the meta object for the attribute '{@link FwSchema.FirmwareType#getDate <em>Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Date</em>'.
     * @see FwSchema.FirmwareType#getDate()
     * @see #getFirmwareType()
     * @generated
     */
    EAttribute getFirmwareType_Date();

    /**
     * Returns the meta object for the attribute '{@link FwSchema.FirmwareType#getDev <em>Dev</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dev</em>'.
     * @see FwSchema.FirmwareType#getDev()
     * @see #getFirmwareType()
     * @generated
     */
    EAttribute getFirmwareType_Dev();

    /**
     * Returns the meta object for the attribute '{@link FwSchema.FirmwareType#getFct <em>Fct</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fct</em>'.
     * @see FwSchema.FirmwareType#getFct()
     * @see #getFirmwareType()
     * @generated
     */
    EAttribute getFirmwareType_Fct();

    /**
     * Returns the meta object for the attribute '{@link FwSchema.FirmwareType#getKeepXmlHeader <em>Keep Xml Header</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Keep Xml Header</em>'.
     * @see FwSchema.FirmwareType#getKeepXmlHeader()
     * @see #getFirmwareType()
     * @generated
     */
    EAttribute getFirmwareType_KeepXmlHeader();

    /**
     * Returns the meta object for the attribute '{@link FwSchema.FirmwareType#getLen <em>Len</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Len</em>'.
     * @see FwSchema.FirmwareType#getLen()
     * @see #getFirmwareType()
     * @generated
     */
    EAttribute getFirmwareType_Len();

    /**
     * Returns the meta object for the attribute '{@link FwSchema.FirmwareType#getMat <em>Mat</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mat</em>'.
     * @see FwSchema.FirmwareType#getMat()
     * @see #getFirmwareType()
     * @generated
     */
    EAttribute getFirmwareType_Mat();

    /**
     * Returns the meta object for the attribute '{@link FwSchema.FirmwareType#getRem <em>Rem</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Rem</em>'.
     * @see FwSchema.FirmwareType#getRem()
     * @see #getFirmwareType()
     * @generated
     */
    EAttribute getFirmwareType_Rem();

    /**
     * Returns the meta object for the attribute '{@link FwSchema.FirmwareType#getUse <em>Use</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use</em>'.
     * @see FwSchema.FirmwareType#getUse()
     * @see #getFirmwareType()
     * @generated
     */
    EAttribute getFirmwareType_Use();

    /**
     * Returns the meta object for the attribute '{@link FwSchema.FirmwareType#getVar <em>Var</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Var</em>'.
     * @see FwSchema.FirmwareType#getVar()
     * @see #getFirmwareType()
     * @generated
     */
    EAttribute getFirmwareType_Var();

    /**
     * Returns the meta object for the attribute '{@link FwSchema.FirmwareType#getVen <em>Ven</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ven</em>'.
     * @see FwSchema.FirmwareType#getVen()
     * @see #getFirmwareType()
     * @generated
     */
    EAttribute getFirmwareType_Ven();

    /**
     * Returns the meta object for the attribute '{@link FwSchema.FirmwareType#getVer <em>Ver</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ver</em>'.
     * @see FwSchema.FirmwareType#getVer()
     * @see #getFirmwareType()
     * @generated
     */
    EAttribute getFirmwareType_Ver();

    /**
     * Returns the meta object for enum '{@link FwSchema.KeepXmlHeaderType <em>Keep Xml Header Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Keep Xml Header Type</em>'.
     * @see FwSchema.KeepXmlHeaderType
     * @generated
     */
    EEnum getKeepXmlHeaderType();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Boot Offs Hi Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Boot Offs Hi Type</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='BootOffsHi_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='0x[0-9A-Fa-f]{8,8}'"
     * @generated
     */
    EDataType getBootOffsHiType();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Chk Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Chk Type</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='Chk_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='0x[0-9A-Fa-f]{4,4}'"
     * @generated
     */
    EDataType getChkType();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Date Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Date Type</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='Date_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[0-3]{1}[1-9]{1}\\.[0-1]{1}[0-9]{1}\\.[0-9]{4}'"
     * @generated
     */
    EDataType getDateType();

    /**
     * Returns the meta object for data type '{@link FwSchema.KeepXmlHeaderType <em>Keep Xml Header Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Keep Xml Header Type Object</em>'.
     * @see FwSchema.KeepXmlHeaderType
     * @model instanceClass="FwSchema.KeepXmlHeaderType"
     *        extendedMetaData="name='KeepXmlHeader_._type:Object' baseType='KeepXmlHeader_._type'"
     * @generated
     */
    EDataType getKeepXmlHeaderTypeObject();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Mat Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Mat Type</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='Mat_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='0' maxLength='18'"
     * @generated
     */
    EDataType getMatType();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Ven Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Ven Type</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='Ven_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='0x[0-9A-Fa-f]{8,8}'"
     * @generated
     */
    EDataType getVenType();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    FwSchemaFactory getFwSchemaFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link FwSchema.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see FwSchema.impl.DocumentRootImpl
         * @see FwSchema.impl.FwSchemaPackageImpl#getDocumentRoot()
         * @generated
         */
        EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

        /**
         * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

        /**
         * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

        /**
         * The meta object literal for the '<em><b>Firmware</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__FIRMWARE = eINSTANCE.getDocumentRoot_Firmware();

        /**
         * The meta object literal for the '{@link FwSchema.impl.FirmwareTypeImpl <em>Firmware Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see FwSchema.impl.FirmwareTypeImpl
         * @see FwSchema.impl.FwSchemaPackageImpl#getFirmwareType()
         * @generated
         */
        EClass FIRMWARE_TYPE = eINSTANCE.getFirmwareType();

        /**
         * The meta object literal for the '<em><b>Appl Sw Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FIRMWARE_TYPE__APPL_SW_DATE = eINSTANCE.getFirmwareType_ApplSwDate();

        /**
         * The meta object literal for the '<em><b>Appl Sw Time</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FIRMWARE_TYPE__APPL_SW_TIME = eINSTANCE.getFirmwareType_ApplSwTime();

        /**
         * The meta object literal for the '<em><b>Boot Offs Hi</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FIRMWARE_TYPE__BOOT_OFFS_HI = eINSTANCE.getFirmwareType_BootOffsHi();

        /**
         * The meta object literal for the '<em><b>Chk</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FIRMWARE_TYPE__CHK = eINSTANCE.getFirmwareType_Chk();

        /**
         * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FIRMWARE_TYPE__DATE = eINSTANCE.getFirmwareType_Date();

        /**
         * The meta object literal for the '<em><b>Dev</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FIRMWARE_TYPE__DEV = eINSTANCE.getFirmwareType_Dev();

        /**
         * The meta object literal for the '<em><b>Fct</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FIRMWARE_TYPE__FCT = eINSTANCE.getFirmwareType_Fct();

        /**
         * The meta object literal for the '<em><b>Keep Xml Header</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FIRMWARE_TYPE__KEEP_XML_HEADER = eINSTANCE.getFirmwareType_KeepXmlHeader();

        /**
         * The meta object literal for the '<em><b>Len</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FIRMWARE_TYPE__LEN = eINSTANCE.getFirmwareType_Len();

        /**
         * The meta object literal for the '<em><b>Mat</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FIRMWARE_TYPE__MAT = eINSTANCE.getFirmwareType_Mat();

        /**
         * The meta object literal for the '<em><b>Rem</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FIRMWARE_TYPE__REM = eINSTANCE.getFirmwareType_Rem();

        /**
         * The meta object literal for the '<em><b>Use</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FIRMWARE_TYPE__USE = eINSTANCE.getFirmwareType_Use();

        /**
         * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FIRMWARE_TYPE__VAR = eINSTANCE.getFirmwareType_Var();

        /**
         * The meta object literal for the '<em><b>Ven</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FIRMWARE_TYPE__VEN = eINSTANCE.getFirmwareType_Ven();

        /**
         * The meta object literal for the '<em><b>Ver</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FIRMWARE_TYPE__VER = eINSTANCE.getFirmwareType_Ver();

        /**
         * The meta object literal for the '{@link FwSchema.KeepXmlHeaderType <em>Keep Xml Header Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see FwSchema.KeepXmlHeaderType
         * @see FwSchema.impl.FwSchemaPackageImpl#getKeepXmlHeaderType()
         * @generated
         */
        EEnum KEEP_XML_HEADER_TYPE = eINSTANCE.getKeepXmlHeaderType();

        /**
         * The meta object literal for the '<em>Boot Offs Hi Type</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see FwSchema.impl.FwSchemaPackageImpl#getBootOffsHiType()
         * @generated
         */
        EDataType BOOT_OFFS_HI_TYPE = eINSTANCE.getBootOffsHiType();

        /**
         * The meta object literal for the '<em>Chk Type</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see FwSchema.impl.FwSchemaPackageImpl#getChkType()
         * @generated
         */
        EDataType CHK_TYPE = eINSTANCE.getChkType();

        /**
         * The meta object literal for the '<em>Date Type</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see FwSchema.impl.FwSchemaPackageImpl#getDateType()
         * @generated
         */
        EDataType DATE_TYPE = eINSTANCE.getDateType();

        /**
         * The meta object literal for the '<em>Keep Xml Header Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see FwSchema.KeepXmlHeaderType
         * @see FwSchema.impl.FwSchemaPackageImpl#getKeepXmlHeaderTypeObject()
         * @generated
         */
        EDataType KEEP_XML_HEADER_TYPE_OBJECT = eINSTANCE.getKeepXmlHeaderTypeObject();

        /**
         * The meta object literal for the '<em>Mat Type</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see FwSchema.impl.FwSchemaPackageImpl#getMatType()
         * @generated
         */
        EDataType MAT_TYPE = eINSTANCE.getMatType();

        /**
         * The meta object literal for the '<em>Ven Type</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see FwSchema.impl.FwSchemaPackageImpl#getVenType()
         * @generated
         */
        EDataType VEN_TYPE = eINSTANCE.getVenType();

    }

} //FwSchemaPackage
