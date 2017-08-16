/**
 */
package FwSchema.impl;

import FwSchema.DocumentRoot;
import FwSchema.FirmwareType;
import FwSchema.FwSchemaFactory;
import FwSchema.FwSchemaPackage;
import FwSchema.KeepXmlHeaderType;

import FwSchema.util.FwSchemaValidator;

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
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FwSchemaPackageImpl extends EPackageImpl implements FwSchemaPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass documentRootEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass firmwareTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum keepXmlHeaderTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType bootOffsHiTypeEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType chkTypeEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType dateTypeEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType keepXmlHeaderTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType matTypeEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType venTypeEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see FwSchema.FwSchemaPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private FwSchemaPackageImpl() {
        super(eNS_URI, FwSchemaFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link FwSchemaPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static FwSchemaPackage init() {
        if (isInited) return (FwSchemaPackage)EPackage.Registry.INSTANCE.getEPackage(FwSchemaPackage.eNS_URI);

        // Obtain or create and register package
        FwSchemaPackageImpl theFwSchemaPackage = (FwSchemaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FwSchemaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FwSchemaPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        XMLTypePackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theFwSchemaPackage.createPackageContents();

        // Initialize created meta-data
        theFwSchemaPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theFwSchemaPackage, 
             new EValidator.Descriptor() {
                 public EValidator getEValidator() {
                     return FwSchemaValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theFwSchemaPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(FwSchemaPackage.eNS_URI, theFwSchemaPackage);
        return theFwSchemaPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDocumentRoot() {
        return documentRootEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Firmware() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFirmwareType() {
        return firmwareTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFirmwareType_ApplSwDate() {
        return (EAttribute)firmwareTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFirmwareType_ApplSwTime() {
        return (EAttribute)firmwareTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFirmwareType_BootOffsHi() {
        return (EAttribute)firmwareTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFirmwareType_Chk() {
        return (EAttribute)firmwareTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFirmwareType_Date() {
        return (EAttribute)firmwareTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFirmwareType_Dev() {
        return (EAttribute)firmwareTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFirmwareType_Fct() {
        return (EAttribute)firmwareTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFirmwareType_KeepXmlHeader() {
        return (EAttribute)firmwareTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFirmwareType_Len() {
        return (EAttribute)firmwareTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFirmwareType_Mat() {
        return (EAttribute)firmwareTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFirmwareType_Rem() {
        return (EAttribute)firmwareTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFirmwareType_Use() {
        return (EAttribute)firmwareTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFirmwareType_Var() {
        return (EAttribute)firmwareTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFirmwareType_Ven() {
        return (EAttribute)firmwareTypeEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFirmwareType_Ver() {
        return (EAttribute)firmwareTypeEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getKeepXmlHeaderType() {
        return keepXmlHeaderTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getBootOffsHiType() {
        return bootOffsHiTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getChkType() {
        return chkTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getDateType() {
        return dateTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getKeepXmlHeaderTypeObject() {
        return keepXmlHeaderTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getMatType() {
        return matTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getVenType() {
        return venTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FwSchemaFactory getFwSchemaFactory() {
        return (FwSchemaFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
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
        documentRootEClass = createEClass(DOCUMENT_ROOT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__FIRMWARE);

        firmwareTypeEClass = createEClass(FIRMWARE_TYPE);
        createEAttribute(firmwareTypeEClass, FIRMWARE_TYPE__APPL_SW_DATE);
        createEAttribute(firmwareTypeEClass, FIRMWARE_TYPE__APPL_SW_TIME);
        createEAttribute(firmwareTypeEClass, FIRMWARE_TYPE__BOOT_OFFS_HI);
        createEAttribute(firmwareTypeEClass, FIRMWARE_TYPE__CHK);
        createEAttribute(firmwareTypeEClass, FIRMWARE_TYPE__DATE);
        createEAttribute(firmwareTypeEClass, FIRMWARE_TYPE__DEV);
        createEAttribute(firmwareTypeEClass, FIRMWARE_TYPE__FCT);
        createEAttribute(firmwareTypeEClass, FIRMWARE_TYPE__KEEP_XML_HEADER);
        createEAttribute(firmwareTypeEClass, FIRMWARE_TYPE__LEN);
        createEAttribute(firmwareTypeEClass, FIRMWARE_TYPE__MAT);
        createEAttribute(firmwareTypeEClass, FIRMWARE_TYPE__REM);
        createEAttribute(firmwareTypeEClass, FIRMWARE_TYPE__USE);
        createEAttribute(firmwareTypeEClass, FIRMWARE_TYPE__VAR);
        createEAttribute(firmwareTypeEClass, FIRMWARE_TYPE__VEN);
        createEAttribute(firmwareTypeEClass, FIRMWARE_TYPE__VER);

        // Create enums
        keepXmlHeaderTypeEEnum = createEEnum(KEEP_XML_HEADER_TYPE);

        // Create data types
        bootOffsHiTypeEDataType = createEDataType(BOOT_OFFS_HI_TYPE);
        chkTypeEDataType = createEDataType(CHK_TYPE);
        dateTypeEDataType = createEDataType(DATE_TYPE);
        keepXmlHeaderTypeObjectEDataType = createEDataType(KEEP_XML_HEADER_TYPE_OBJECT);
        matTypeEDataType = createEDataType(MAT_TYPE);
        venTypeEDataType = createEDataType(VEN_TYPE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
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

        // Initialize classes, features, and operations; add parameters
        initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Firmware(), this.getFirmwareType(), null, "firmware", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(firmwareTypeEClass, FirmwareType.class, "FirmwareType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFirmwareType_ApplSwDate(), theXMLTypePackage.getUnsignedInt(), "applSwDate", null, 1, 1, FirmwareType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFirmwareType_ApplSwTime(), theXMLTypePackage.getUnsignedInt(), "applSwTime", null, 1, 1, FirmwareType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFirmwareType_BootOffsHi(), this.getBootOffsHiType(), "bootOffsHi", null, 0, 1, FirmwareType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFirmwareType_Chk(), this.getChkType(), "chk", null, 0, 1, FirmwareType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFirmwareType_Date(), this.getDateType(), "date", null, 0, 1, FirmwareType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFirmwareType_Dev(), theXMLTypePackage.getUnsignedInt(), "dev", null, 1, 1, FirmwareType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFirmwareType_Fct(), theXMLTypePackage.getString(), "fct", "_", 1, 1, FirmwareType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFirmwareType_KeepXmlHeader(), this.getKeepXmlHeaderType(), "keepXmlHeader", null, 0, 1, FirmwareType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFirmwareType_Len(), theXMLTypePackage.getPositiveInteger(), "len", null, 1, 1, FirmwareType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFirmwareType_Mat(), this.getMatType(), "mat", null, 0, 1, FirmwareType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFirmwareType_Rem(), theXMLTypePackage.getString(), "rem", null, 0, 1, FirmwareType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFirmwareType_Use(), theXMLTypePackage.getAnySimpleType(), "use", "fw", 1, 1, FirmwareType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFirmwareType_Var(), theXMLTypePackage.getUnsignedInt(), "var", null, 1, 1, FirmwareType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFirmwareType_Ven(), this.getVenType(), "ven", null, 0, 1, FirmwareType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFirmwareType_Ver(), theXMLTypePackage.getPositiveInteger(), "ver", null, 1, 1, FirmwareType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(keepXmlHeaderTypeEEnum, KeepXmlHeaderType.class, "KeepXmlHeaderType");
        addEEnumLiteral(keepXmlHeaderTypeEEnum, KeepXmlHeaderType._0);
        addEEnumLiteral(keepXmlHeaderTypeEEnum, KeepXmlHeaderType._1);

        // Initialize data types
        initEDataType(bootOffsHiTypeEDataType, String.class, "BootOffsHiType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(chkTypeEDataType, String.class, "ChkType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(dateTypeEDataType, String.class, "DateType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(keepXmlHeaderTypeObjectEDataType, KeepXmlHeaderType.class, "KeepXmlHeaderTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(matTypeEDataType, String.class, "MatType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(venTypeEDataType, String.class, "VenType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
        createExtendedMetaDataAnnotations();
    }

    /**
     * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createExtendedMetaDataAnnotations() {
        String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
        addAnnotation
          (this, 
           source, 
           new String[] {
             "qualified", "false"
           });	
        addAnnotation
          (bootOffsHiTypeEDataType, 
           source, 
           new String[] {
             "name", "BootOffsHi_._type",
             "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
             "pattern", "0x[0-9A-Fa-f]{8,8}"
           });	
        addAnnotation
          (chkTypeEDataType, 
           source, 
           new String[] {
             "name", "Chk_._type",
             "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
             "pattern", "0x[0-9A-Fa-f]{4,4}"
           });	
        addAnnotation
          (dateTypeEDataType, 
           source, 
           new String[] {
             "name", "Date_._type",
             "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
             "pattern", "[0-3]{1}[1-9]{1}\\.[0-1]{1}[0-9]{1}\\.[0-9]{4}"
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
          (getDocumentRoot_Firmware(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Firmware",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (firmwareTypeEClass, 
           source, 
           new String[] {
             "name", "Firmware_._type",
             "kind", "empty"
           });	
        addAnnotation
          (getFirmwareType_ApplSwDate(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "ApplSwDate",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getFirmwareType_ApplSwTime(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "ApplSwTime",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getFirmwareType_BootOffsHi(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "BootOffsHi",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getFirmwareType_Chk(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "Chk",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getFirmwareType_Date(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "Date",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getFirmwareType_Dev(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "Dev",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getFirmwareType_Fct(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "Fct",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getFirmwareType_KeepXmlHeader(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "KeepXmlHeader",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getFirmwareType_Len(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "Len",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getFirmwareType_Mat(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "Mat",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getFirmwareType_Rem(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "Rem",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getFirmwareType_Use(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "Use",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getFirmwareType_Var(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "Var",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getFirmwareType_Ven(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "Ven",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getFirmwareType_Ver(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "Ver",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (keepXmlHeaderTypeEEnum, 
           source, 
           new String[] {
             "name", "KeepXmlHeader_._type"
           });	
        addAnnotation
          (keepXmlHeaderTypeObjectEDataType, 
           source, 
           new String[] {
             "name", "KeepXmlHeader_._type:Object",
             "baseType", "KeepXmlHeader_._type"
           });	
        addAnnotation
          (matTypeEDataType, 
           source, 
           new String[] {
             "name", "Mat_._type",
             "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
             "minLength", "0",
             "maxLength", "18"
           });	
        addAnnotation
          (venTypeEDataType, 
           source, 
           new String[] {
             "name", "Ven_._type",
             "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
             "pattern", "0x[0-9A-Fa-f]{8,8}"
           });
    }

} //FwSchemaPackageImpl
