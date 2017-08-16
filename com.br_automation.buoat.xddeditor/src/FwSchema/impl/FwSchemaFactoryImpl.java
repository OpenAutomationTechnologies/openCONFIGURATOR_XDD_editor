/**
 */
package FwSchema.impl;

import FwSchema.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FwSchemaFactoryImpl extends EFactoryImpl implements FwSchemaFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static FwSchemaFactory init() {
        try {
            FwSchemaFactory theFwSchemaFactory = (FwSchemaFactory)EPackage.Registry.INSTANCE.getEFactory(FwSchemaPackage.eNS_URI);
            if (theFwSchemaFactory != null) {
                return theFwSchemaFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new FwSchemaFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FwSchemaFactoryImpl() {
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
            case FwSchemaPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case FwSchemaPackage.FIRMWARE_TYPE: return createFirmwareType();
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
            case FwSchemaPackage.KEEP_XML_HEADER_TYPE:
                return createKeepXmlHeaderTypeFromString(eDataType, initialValue);
            case FwSchemaPackage.BOOT_OFFS_HI_TYPE:
                return createBootOffsHiTypeFromString(eDataType, initialValue);
            case FwSchemaPackage.CHK_TYPE:
                return createChkTypeFromString(eDataType, initialValue);
            case FwSchemaPackage.DATE_TYPE:
                return createDateTypeFromString(eDataType, initialValue);
            case FwSchemaPackage.KEEP_XML_HEADER_TYPE_OBJECT:
                return createKeepXmlHeaderTypeObjectFromString(eDataType, initialValue);
            case FwSchemaPackage.MAT_TYPE:
                return createMatTypeFromString(eDataType, initialValue);
            case FwSchemaPackage.VEN_TYPE:
                return createVenTypeFromString(eDataType, initialValue);
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
            case FwSchemaPackage.KEEP_XML_HEADER_TYPE:
                return convertKeepXmlHeaderTypeToString(eDataType, instanceValue);
            case FwSchemaPackage.BOOT_OFFS_HI_TYPE:
                return convertBootOffsHiTypeToString(eDataType, instanceValue);
            case FwSchemaPackage.CHK_TYPE:
                return convertChkTypeToString(eDataType, instanceValue);
            case FwSchemaPackage.DATE_TYPE:
                return convertDateTypeToString(eDataType, instanceValue);
            case FwSchemaPackage.KEEP_XML_HEADER_TYPE_OBJECT:
                return convertKeepXmlHeaderTypeObjectToString(eDataType, instanceValue);
            case FwSchemaPackage.MAT_TYPE:
                return convertMatTypeToString(eDataType, instanceValue);
            case FwSchemaPackage.VEN_TYPE:
                return convertVenTypeToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
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
    public FirmwareType createFirmwareType() {
        FirmwareTypeImpl firmwareType = new FirmwareTypeImpl();
        return firmwareType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KeepXmlHeaderType createKeepXmlHeaderTypeFromString(EDataType eDataType, String initialValue) {
        KeepXmlHeaderType result = KeepXmlHeaderType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertKeepXmlHeaderTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createBootOffsHiTypeFromString(EDataType eDataType, String initialValue) {
        return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertBootOffsHiTypeToString(EDataType eDataType, Object instanceValue) {
        return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createChkTypeFromString(EDataType eDataType, String initialValue) {
        return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertChkTypeToString(EDataType eDataType, Object instanceValue) {
        return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createDateTypeFromString(EDataType eDataType, String initialValue) {
        return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDateTypeToString(EDataType eDataType, Object instanceValue) {
        return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KeepXmlHeaderType createKeepXmlHeaderTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createKeepXmlHeaderTypeFromString(FwSchemaPackage.Literals.KEEP_XML_HEADER_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertKeepXmlHeaderTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertKeepXmlHeaderTypeToString(FwSchemaPackage.Literals.KEEP_XML_HEADER_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createMatTypeFromString(EDataType eDataType, String initialValue) {
        return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMatTypeToString(EDataType eDataType, Object instanceValue) {
        return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createVenTypeFromString(EDataType eDataType, String initialValue) {
        return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertVenTypeToString(EDataType eDataType, Object instanceValue) {
        return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FwSchemaPackage getFwSchemaPackage() {
        return (FwSchemaPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static FwSchemaPackage getPackage() {
        return FwSchemaPackage.eINSTANCE;
    }

} //FwSchemaFactoryImpl
