/**
 */
package FwSchema.util;

import FwSchema.FwSchemaPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class FwSchemaXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public FwSchemaXMLProcessor() {
        super(new EPackageRegistryImpl(EPackage.Registry.INSTANCE));
        extendedMetaData.putPackage(null, FwSchemaPackage.eINSTANCE);
    }

    /**
     * Register for "*" and "xml" file extensions the
     * FwSchemaResourceFactoryImpl factory. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new FwSchemaResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new FwSchemaResourceFactoryImpl());
        }
        return registrations;
    }

} // FwSchemaXMLProcessor
