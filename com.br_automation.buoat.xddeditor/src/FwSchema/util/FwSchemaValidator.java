/**
 */
package FwSchema.util;

import FwSchema.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see FwSchema.FwSchemaPackage
 * @generated
 */
public class FwSchemaValidator extends EObjectValidator {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final FwSchemaValidator INSTANCE = new FwSchemaValidator();

    /**
     * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.Diagnostic#getSource()
     * @see org.eclipse.emf.common.util.Diagnostic#getCode()
     * @generated
     */
    public static final String DIAGNOSTIC_SOURCE = "FwSchema";

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
    public FwSchemaValidator() {
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
      return FwSchemaPackage.eINSTANCE;
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
            case FwSchemaPackage.DOCUMENT_ROOT:
                return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
            case FwSchemaPackage.FIRMWARE_TYPE:
                return validateFirmwareType((FirmwareType)value, diagnostics, context);
            case FwSchemaPackage.KEEP_XML_HEADER_TYPE:
                return validateKeepXmlHeaderType((KeepXmlHeaderType)value, diagnostics, context);
            case FwSchemaPackage.BOOT_OFFS_HI_TYPE:
                return validateBootOffsHiType((String)value, diagnostics, context);
            case FwSchemaPackage.CHK_TYPE:
                return validateChkType((String)value, diagnostics, context);
            case FwSchemaPackage.DATE_TYPE:
                return validateDateType((String)value, diagnostics, context);
            case FwSchemaPackage.KEEP_XML_HEADER_TYPE_OBJECT:
                return validateKeepXmlHeaderTypeObject((KeepXmlHeaderType)value, diagnostics, context);
            case FwSchemaPackage.MAT_TYPE:
                return validateMatType((String)value, diagnostics, context);
            case FwSchemaPackage.VEN_TYPE:
                return validateVenType((String)value, diagnostics, context);
            default:
                return true;
        }
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
    public boolean validateFirmwareType(FirmwareType firmwareType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(firmwareType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateKeepXmlHeaderType(KeepXmlHeaderType keepXmlHeaderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateBootOffsHiType(String bootOffsHiType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        boolean result = validateBootOffsHiType_Pattern(bootOffsHiType, diagnostics, context);
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @see #validateBootOffsHiType_Pattern
     */
    public static final  PatternMatcher [][] BOOT_OFFS_HI_TYPE__PATTERN__VALUES =
        new PatternMatcher [][] {
            new PatternMatcher [] {
                XMLTypeUtil.createPatternMatcher("0x[0-9A-Fa-f]{8,8}")
            }
        };

    /**
     * Validates the Pattern constraint of '<em>Boot Offs Hi Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateBootOffsHiType_Pattern(String bootOffsHiType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validatePattern(FwSchemaPackage.Literals.BOOT_OFFS_HI_TYPE, bootOffsHiType, BOOT_OFFS_HI_TYPE__PATTERN__VALUES, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateChkType(String chkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        boolean result = validateChkType_Pattern(chkType, diagnostics, context);
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @see #validateChkType_Pattern
     */
    public static final  PatternMatcher [][] CHK_TYPE__PATTERN__VALUES =
        new PatternMatcher [][] {
            new PatternMatcher [] {
                XMLTypeUtil.createPatternMatcher("0x[0-9A-Fa-f]{4,4}")
            }
        };

    /**
     * Validates the Pattern constraint of '<em>Chk Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateChkType_Pattern(String chkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validatePattern(FwSchemaPackage.Literals.CHK_TYPE, chkType, CHK_TYPE__PATTERN__VALUES, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDateType(String dateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        boolean result = validateDateType_Pattern(dateType, diagnostics, context);
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @see #validateDateType_Pattern
     */
    public static final  PatternMatcher [][] DATE_TYPE__PATTERN__VALUES =
        new PatternMatcher [][] {
            new PatternMatcher [] {
                XMLTypeUtil.createPatternMatcher("[0-3]{1}[1-9]{1}\\.[0-1]{1}[0-9]{1}\\.[0-9]{4}")
            }
        };

    /**
     * Validates the Pattern constraint of '<em>Date Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDateType_Pattern(String dateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validatePattern(FwSchemaPackage.Literals.DATE_TYPE, dateType, DATE_TYPE__PATTERN__VALUES, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateKeepXmlHeaderTypeObject(KeepXmlHeaderType keepXmlHeaderTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMatType(String matType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        boolean result = validateMatType_MinLength(matType, diagnostics, context);
        if (result || diagnostics != null) result &= validateMatType_MaxLength(matType, diagnostics, context);
        return result;
    }

    /**
     * Validates the MinLength constraint of '<em>Mat Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMatType_MinLength(String matType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        int length = matType.length();
        boolean result = length >= 0;
        if (!result && diagnostics != null)
            reportMinLengthViolation(FwSchemaPackage.Literals.MAT_TYPE, matType, length, 0, diagnostics, context);
        return result;
    }

    /**
     * Validates the MaxLength constraint of '<em>Mat Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMatType_MaxLength(String matType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        int length = matType.length();
        boolean result = length <= 18;
        if (!result && diagnostics != null)
            reportMaxLengthViolation(FwSchemaPackage.Literals.MAT_TYPE, matType, length, 18, diagnostics, context);
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateVenType(String venType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        boolean result = validateVenType_Pattern(venType, diagnostics, context);
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @see #validateVenType_Pattern
     */
    public static final  PatternMatcher [][] VEN_TYPE__PATTERN__VALUES =
        new PatternMatcher [][] {
            new PatternMatcher [] {
                XMLTypeUtil.createPatternMatcher("0x[0-9A-Fa-f]{8,8}")
            }
        };

    /**
     * Validates the Pattern constraint of '<em>Ven Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateVenType_Pattern(String venType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validatePattern(FwSchemaPackage.Literals.VEN_TYPE, venType, VEN_TYPE__PATTERN__VALUES, diagnostics, context);
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

} //FwSchemaValidator
