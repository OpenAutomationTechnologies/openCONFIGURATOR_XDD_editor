/**
 * @since 21.3.2013
 * @author Joris Lückenga, Bernecker + Rainer Industrie Elektronik Ges.m.b.H.
 */

package com.br_automation.buoat.xddeditor.XDD.custom; // NOPMD by lueckengaj on 17.05.13 14:57

import java.math.BigInteger;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.query.conditions.Condition;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.eclipse.emf.query.conditions.eobjects.EObjectTypeRelationCondition;
import org.eclipse.emf.query.conditions.eobjects.structuralfeatures.EObjectAttributeValueCondition;
import org.eclipse.emf.query.statements.FROM;
import org.eclipse.emf.query.statements.IQueryResult;
import org.eclipse.emf.query.statements.SELECT;
import org.eclipse.emf.query.statements.WHERE;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.widgets.Display;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.ObjectListType;
import com.br_automation.buoat.xddeditor.XDD.ProfileBodyCommunicationNetworkPowerlink;
import com.br_automation.buoat.xddeditor.XDD.ProfileBodyDevicePowerlink;
import com.br_automation.buoat.xddeditor.XDD.SubObjectType;
import com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures;
import com.br_automation.buoat.xddeditor.XDD.TMNFeatures;
import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.TObjectPDOMapping;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;
import com.br_automation.buoat.xddeditor.XDD.impl.SubObjectTypeImpl;
import com.br_automation.buoat.xddeditor.XDD.impl.TCNFeaturesImpl;
import com.br_automation.buoat.xddeditor.XDD.util.XDDResourceFactoryImpl;

/**
 * @brief Static utility-methods for XDD-File/resource manipulation and
 *        conversion / checks.
 *
 * @author Joris Lückenga
 */
public final class XDDUtilities {

    /**
     *
     * @brief Condition class to be used in EMF's query-framework.
     *
     *        Provides finding XDD-Objects by index-attribute.
     *
     * @author Joris Lückenga
     */
    public static class ByteArrayCondition extends Condition {

        private byte[] currentByteArray;

        public ByteArrayCondition(int index) {
            this.currentByteArray = BigInteger.valueOf(index).toByteArray();
        }

        /**
         * @see Condition#isSatisfied(Object)
         */
        @Override
        public boolean isSatisfied(Object object) {
            return Arrays.equals(this.currentByteArray, (byte[]) object);
        }

    } // ByteArrayCondition

    /**
     * @brief VerifyListener for Hex-Text fields.
     * @author David Puffer
     */
    public static class RegexVerifyListener implements VerifyListener {

        public static final String PATTERN_DEC = "\\d*";
        public static final String PATTERN_HEX = "[A-Fa-f0-9]*";
        private List<Character> excludedChars;
        private String pattern;
        private boolean toUpper;

        /**
         * @param pattern
         *            Regular expression to validate against.
         * @param excludedChars
         *            List of characters that will not be matched against
         *            <code>pattern</code>.
         * @param toUpper
         *            <code>True</code> to convert the entered character to
         *            upper-case, <code>false</code> otherwise.
         */
        public RegexVerifyListener(String pattern, List<Character> excludedChars, boolean toUpper) {
            this.pattern = pattern;
            if (excludedChars == null)
                this.excludedChars = new ArrayList<Character>(0);
            else
                this.excludedChars = excludedChars;
            this.toUpper = toUpper;
        }

        protected RegexVerifyListener() {
        }

        public List<Character> getExcludedChars() {
            return this.excludedChars;
        }

        public String getPattern() {
            return this.pattern;
        }

        public boolean isToUpper() {
            return this.toUpper;
        }

        @Override
        public void verifyText(VerifyEvent e) {
            if (!this.excludedChars.contains(Character.valueOf(e.character))) {
                String input = Character.toString(e.character);
                e.doit = Pattern.matches(this.pattern, input);
                if (e.doit && this.toUpper)
                    e.text = e.text.toUpperCase();
            }
        }

    } // RegexVerifyListener

    private static String creator;

    /**
     * @brief XDDUtilities provides only static methods.
     */
    private XDDUtilities() {
    }

    /**
     * @brief Set attributes of an XDD's ProfileBody-Element.
     *
     *        Sets fileModificatioDate and -Time to the current time and date,
     *        as well as fileModifiedBy. fileModifiedBy will be set to the
     *        username set by XDDUtilities#setCreator(String) if not
     *        <code>null</code>, system property <code>user.name</code>
     *        otherwise.
     *
     * @param root
     *            Root object of the current document.
     */
    public static void addSaveModifications(DocumentRoot root) {

        List<ProfileBodyCommunicationNetworkPowerlink> foundCommunicationBodys = XDDUtilities.findEObjects(root,
                XDDPackage.eINSTANCE.getProfileBodyCommunicationNetworkPowerlink());
        List<ProfileBodyDevicePowerlink> foundDeviceBodys = XDDUtilities.findEObjects(root,
                XDDPackage.eINSTANCE.getProfileBodyDevicePowerlink());
        if (foundCommunicationBodys.isEmpty() || foundDeviceBodys.isEmpty())
            return;

        ProfileBodyCommunicationNetworkPowerlink body1 = foundCommunicationBodys.get(0);
        ProfileBodyDevicePowerlink body2 = foundDeviceBodys.get(0);

        body1.setFileModificationDate(XDDUtilities.getXMLDate());
        body1.setFileModificationTime(XDDUtilities.getXMLTime());
        if (XDDUtilities.creator == null) {
            body1.setFileModifiedBy(System.getProperty("user.name"));
            body2.setFileModifiedBy(System.getProperty("user.name"));
        } else {
            body1.setFileModifiedBy(XDDUtilities.creator);
            body2.setFileModifiedBy(XDDUtilities.creator);
        }
        body2.setFileModificationDate(XDDUtilities.getXMLDate());
        body2.setFileModificationTime(XDDUtilities.getXMLTime());

    } // addSaveModifications

    /**
     * @brief Adds Objects and Subobjects to a given resource, if Sub-/TObjects
     *        with the same Subindex/Index do not exist already.
     * @param root
     *            Resource where objects should be added to.
     * @param objectsToAdd
     *            List of objects to add to the resource.
     * @throws <code>IllegalArgumentException</code>
     *             if the given root document does not contain the element
     *             "ObjectList".
     */
    public static void addTObjects(List<TObject> objectsToAdd, DocumentRoot root) {

        List<ObjectListType> objectListTypes = XDDUtilities.findEObjects(root,
                XDDPackage.eINSTANCE.getObjectListType());
        if (objectListTypes.isEmpty())
            throw new IllegalArgumentException("The specified root document does not contain an object list.");
        EList<TObject> currentObjectsList = objectListTypes.get(0).getObject();

        Map<Integer, TObject> currentObjectMap = new HashMap<Integer, TObject>(currentObjectsList.size());

        // Create Map of current Objectlist
        for (TObject currentObject : currentObjectsList)
            currentObjectMap.put(new BigInteger(currentObject.getIndex()).intValue(), currentObject); // NOPMD
                                                                                                      // by
                                                                                                      // lueckengaj
                                                                                                      // on
                                                                                                      // 18.04.13
                                                                                                      // 09:23

        // Iterate thorugh all objects that should be changed
        for (TObject currentObjectToAdd : objectsToAdd) {
            // Get current index as integer-value
            int currentObjectToAddIndex = new BigInteger(currentObjectToAdd.getIndex()).intValue(); // NOPMD
                                                                                                    // by
                                                                                                    // lueckengaj
                                                                                                    // on
                                                                                                    // 18.04.13
                                                                                                    // 09:22
            // Check if the object already exists
            if (currentObjectMap.containsKey(currentObjectToAddIndex)) {
                // get the subobject-list of the Tobject with matching index,and
                // put it into a hash-map
                EList<SubObjectType> currentSubObjects = currentObjectMap.get(currentObjectToAddIndex).getSubObject();
                List<SubObjectType> missingSubObjects = new ArrayList<SubObjectType>(); // NOPMD
                                                                                        // by
                                                                                        // lueckengaj
                                                                                        // on
                                                                                        // 17.05.13
                                                                                        // 14:57
                Map<Integer, SubObjectType> currentSubObjectMap = new HashMap<Integer, SubObjectType>(); // NOPMD
                                                                                                         // by
                                                                                                         // lueckengaj
                                                                                                         // on
                                                                                                         // 17.05.13
                                                                                                         // 14:57
                for (SubObjectType currentSubObject : currentSubObjects)
                    currentSubObjectMap.put(new BigInteger(currentSubObject.getSubIndex()).intValue(), // NOPMD
                                                                                                       // by
                                                                                                       // lueckengaj
                                                                                                       // on
                                                                                                       // 17.05.13
                                                                                                       // 14:57
                            currentSubObject);
                // get Objects to add
                List<SubObjectType> addableSubObjects = currentObjectToAdd.getSubObject();
                // Find objects which do not already exist
                for (SubObjectType addableSubObject : addableSubObjects) {
                    if (!currentSubObjectMap.containsKey(new BigInteger(addableSubObject // NOPMD
                                                                                         // by
                                                                                         // lueckengaj
                                                                                         // on
                                                                                         // 17.05.13
                                                                                         // 14:57
                            .getSubIndex()).intValue()))
                        missingSubObjects.add(addableSubObject);
                }
                // add & sort them after iterating
                currentSubObjects.addAll(missingSubObjects);
                ECollections.sort(currentSubObjects, new SubObjectComparator()); // NOPMD
                                                                                 // by
                                                                                 // lueckengaj
                                                                                 // on
                                                                                 // 18.04.13
                                                                                 // 09:26
            } else { // if not found -> add TObject
                currentObjectsList.add(currentObjectToAdd);
            }
        }
        ECollections.sort(currentObjectsList, new TObjectComparator());
    } // addTObjects

    /**
     * @brief Finds and returns all instances of an element having an
     *        <code>eAttribute</code> with a matching <code>condition</code> in
     *        <code>documentRoot</code>.
     *
     * @param root
     *            The current resource.
     * @param eAttribute
     *            The attribute to check in the condition.The eAttribute can be
     *            given by using XDDPackage.eINSTANCE.get
     *            <code>instanceName</code>_ <code>AttributeName</code>();.
     * @param condition
     *            The condition for the attribute value.
     * @return A list of objects with matching conditions in the specified root.
     */
    @SuppressWarnings("unchecked")
    public static <T extends EObject> List<T> findEObjects(DocumentRoot root, EAttribute eAttribute,
            Condition condition) {
        EObjectCondition attributeCondition = new EObjectAttributeValueCondition(eAttribute, condition);
        SELECT statement = new SELECT(new FROM(root.eContents()), new WHERE(attributeCondition));
        IQueryResult results = statement.execute();

        EObject[] foundObjects = results.toArray(new EObject[] {});
        List<T> foundObjectsList = new ArrayList<T>();
        for (EObject object : foundObjects)
            foundObjectsList.add((T) object);
        return foundObjectsList;
    }

    /**
     * @brief @brief Finds and returns all instances of the specified
     *        <code>eClass</code> in <code>documentRoot</code>.
     *
     * @param root
     *            the current resource.
     * @param eClass
     *            the class to search for.The eClass parameter can be given by
     *            using XDDPackage.eINSTACE.get <code>InstanceName</code>();
     * @return A list of instances found in the specified resource.
     */
    @SuppressWarnings("unchecked")
    public static <T extends EObject> List<T> findEObjects(DocumentRoot root, EClass eClass) {
        EObjectCondition condition = new EObjectTypeRelationCondition(eClass);
        SELECT statement = new SELECT(new FROM(root.eContents()), new WHERE(condition));
        IQueryResult results = statement.execute();

        EObject[] foundObjects = results.toArray(new EObject[] {});
        List<T> foundObjectsList = new ArrayList<T>();
        for (EObject object : foundObjects)
            foundObjectsList.add((T) object);

        return foundObjectsList;
    }

    /**
     * @brief Creates an instance of org.eclipse.swt.graphics.Color black.
     * @param device
     *            Is the instance of window/display used.
     * @return An instance of the color black.
     */
    public static Color getBlack(Display device) {
        return new Color(device, 0, 0, 0);
    }

    /**
     * @brief Finds matching DataType based on given byte array.
     * @param bs
     *            Byte array of the datatype field in TObject or SubObjectType.
     * @return DataType corresponding to the given byte array.
     */
    public static DataType getDataType(byte[] bs) {
        int value = new BigInteger(1, bs).intValue();
        return DataType.fromInt(value);
    }

    /**
     * @brief Creates an instance of org.eclipse.swt.graphics.Color grey.
     * @param device
     *            Is the instance of window/display used.
     * @return An instance of the color grey.
     */
    public static Color getGrey(Device device) {
        return new Color(device, 240, 240, 240);
    }

    /**
     * @brief Return XDD-TObjects which have a PDOMapping-Attribute contained in
     *        <code>mappingTypes</code>.
     * @param root
     *            Instance of XDD-Model to search for matching XDD-TObjects.
     * @param mappingTypes
     *            An array of valid ENUMs of MappingType.
     * @return A HashMap<String, TObject> with Objects that are mappable.
     */
    public static Map<Integer, TObject> getMappingObjects(DocumentRoot root, Set<TObjectPDOMapping> mappingTypes) {
        List<TObject> tObjects = XDDUtilities.findEObjects(root, XDDPackage.eINSTANCE.getTObject());
        HashMap<Integer, TObject> validObjects = new HashMap<Integer, TObject>();

        for (EObject object : tObjects) {
            TObject testObject = (TObject) object;
            if ((testObject.getSubObject().isEmpty() && mappingTypes.contains(testObject.getPDOmapping()))
                    || !(XDDUtilities.getMappingSubObjects(testObject, mappingTypes).isEmpty()))
                if (testObject.getName() != null && testObject.getIndex() != null) // NOPMD
                                                                                   // by
                                                                                   // lueckengaj
                                                                                   // on
                                                                                   // 29.03.13
                                                                                   // 11:19
                    validObjects.put(new BigInteger(testObject.getIndex()).intValue(), testObject); // NOPMD
                                                                                                    // by
                                                                                                    // lueckengaj
                                                                                                    // on
                                                                                                    // 17.05.13
                                                                                                    // 14:57
        }
        return validObjects;
    }

    /**
     * @brief Return XDD-SubObjectTypes which have a PDOMapping-Attribute
     *        contained in <code>mappingTypes</code>.
     * @param tObject
     *            The TObject to search for TSubObjects with matching
     *            PDOMapping-Attribute.
     * @param mappingType
     *            An array of valid ENUMs of MappingType.
     * @return A HashMap<String, SubObjectType> with Objects that are mappable.
     */
    public static Map<Integer, SubObjectType> getMappingSubObjects(TObject tObject,
            Set<TObjectPDOMapping> mappingType) {
        Map<Integer, SubObjectType> subobjectsList = new HashMap<Integer, SubObjectType>();

        for (SubObjectType subObject : tObject.getSubObject())
            if (mappingType.contains(subObject.getPDOmapping()) && subObject.getSubIndex() != null
                    && subObject.getDataType() != null)
                subobjectsList.put(new BigInteger(subObject.getSubIndex()).intValue(), subObject); // NOPMD
                                                                                                   // by
                                                                                                   // lueckengaj
                                                                                                   // on
                                                                                                   // 17.05.13
                                                                                                   // 14:57
        return subobjectsList;
    }

    public static boolean isMappableObject(TObject tObject, Set<TObjectPDOMapping> mappingType) {
        if (mappingType.contains(tObject.getPDOmapping()) && tObject.getIndex() != null
                && tObject.getDataType() != null) {
            return true;
        }
        return false;
    }

    public static boolean isMappableSubObject(SubObjectTypeImpl subObject, Set<TObjectPDOMapping> mappingType) {
        if (mappingType.contains(subObject.getPDOmapping()) && subObject.getSubIndex() != null
                && subObject.getDataType() != null) {
            return true;
        }
        return false;
    }

    /**
     * @brief Creates an instance of org.eclipse.swt.graphics.Color red.
     * @param device
     *            Is the instance of window/display used.
     * @return An instance of the color red.
     */
    public static Color getRed(Device device) {
        return new Color(device, 255, 0, 0);
    }

    /**
     * @brief Load given URL resource and look up Object-Elements.
     *
     *        Load a given XDD-File and return all Object-Elements with matching
     *        indices.
     *
     * @param resourcePath
     *            URL of the resource.
     * @param objectIndices
     *            List of objectIndices to search in the resource.
     * @return A <code>List</code> containing <code>TObject</code> elements with
     *         indices found in the specified resource.
     */
    public static List<TObject> getTObjectsFromResource(URL resourcePath, List<Integer> objectIndices) {
        if (resourcePath == null)
            throw new IllegalArgumentException("Parameter 'resourcePath ' must not be null.");
        // get Resource...
        DocumentRoot root = XDDUtilities.loadXDD(resourcePath); // (DocumentRoot)
                                                                // resource.getContents().get(0);
        List<TObject> foundObjects = new ArrayList<TObject>();

        if (!objectIndices.isEmpty()) {
            for (Integer index : objectIndices) {
                List<TObject> objects = XDDUtilities.findEObjects(root, XDDPackage.eINSTANCE.getTObject_Index(),
                        new XDDUtilities.ByteArrayCondition(index));
                foundObjects.addAll(objects);
            }
        }
        return foundObjects;
    }

    /**
     * @brief Used to get the valid MappingTypes of a TObject.
     *
     *        If the MappingType is set to RPDO, only RPDO,DEFAULT and OPTIONAL
     *        mappings are allowed. The same principle applies for TPDO mapping.
     *        This function returns a HashSet with valid MappingTypes to ease
     *        the check of SubObjectTypes.
     *
     * @param mappingType
     *            of the TObject.
     * @return The Set<TObjectPDOMapping> of valid mapping for the given
     *         TObject.
     */
    public static Set<TObjectPDOMapping> getValidMappingTypes(TObjectPDOMapping mappingType) {
        Set<TObjectPDOMapping> mappingTypes = new HashSet<TObjectPDOMapping>();

        switch (mappingType) {
        case RPDO:
            mappingTypes.add(TObjectPDOMapping.RPDO);
            mappingTypes.add(TObjectPDOMapping.DEFAULT);
            mappingTypes.add(TObjectPDOMapping.OPTIONAL);
            break;
        case TPDO:
            mappingTypes.add(TObjectPDOMapping.TPDO);
            mappingTypes.add(TObjectPDOMapping.DEFAULT);
            mappingTypes.add(TObjectPDOMapping.OPTIONAL);
            break;
        default:
            break;
        }
        return mappingTypes;
    }

    /**
     * @brief Creates an instance of org.eclipse.swt.graphics.Color white.
     * @param device
     *            Is the instance of window/display used.
     * @return An instance of the color white.
     */
    public static Color getWhite(Device device) {
        return new Color(device, 255, 255, 255);
    }

    /**
     * @return An instance of XMLGregorianCalendar set to the current date.
     */
    public static XMLGregorianCalendar getXMLDate() {
        GregorianCalendar cal = new GregorianCalendar();
        XMLGregorianCalendar sample;
        XMLGregorianCalendar result;
        try {
            sample = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
            result = DatatypeFactory.newInstance().newXMLGregorianCalendar();
            result.clear();
            result.setMonth(sample.getMonth());
            result.setYear(sample.getYear());
            result.setDay(sample.getDay());
            return result;
        } catch (DatatypeConfigurationException e1) {
            return null;
        }
    }

    /**
     * @return An instance of XMLGregorianCalendar set to the current time.
     */
    public static XMLGregorianCalendar getXMLTime() {
        GregorianCalendar cal = new GregorianCalendar();
        XMLGregorianCalendar sample;
        XMLGregorianCalendar result;
        try {
            sample = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
            result = DatatypeFactory.newInstance().newXMLGregorianCalendar();
            result.setMinute(sample.getMinute());
            result.setHour(sample.getHour());
            result.setSecond(sample.getSecond());
            result.setTimezone(sample.getTimezone());
            return result;
        } catch (DatatypeConfigurationException e1) {
            return null;
        }
    }

    /**
     * @brief Checks if the TOBject is an RPDO Mapping-Object.
     * @param tobject
     *            The object to check.
     * @return <code>True</code> if this is an RPDO Mapping-Object,
     *         <code>false</code> otherwise.
     */
    public static boolean isRPDO(TObject tobject) {
        int index = new BigInteger(1, tobject.getIndex()).intValue();
        return (index >= EPLGeneralConstants.PDO_RX_MAPP_PARAM_MIN
                && index <= EPLGeneralConstants.PDO_RX_MAPP_PARAM_MIN);
    }

    /**
     * @brief Checks if the TOBject is an RPDO Mapping-Object.
     * @param tobject
     *            The object to check.
     * @return <code>True</code> if this is an RPDO Mapping-Object,
     *         <code>false</code> otherwise.
     */
    public static boolean isTPDO(TObject tobject) {
        int index = new BigInteger(1, tobject.getIndex()).intValue();
        return (index >= EPLGeneralConstants.PDO_TX_COMM_PARAM_MIN
                && index <= EPLGeneralConstants.PDO_TX_COMM_PARAM_MAX);
    }

    /**
     * @brief Loads a new XDD-File based on the given URL
     *
     * @param resourcePath
     *            URL of the XDD that should be loaded.
     * @return The DocumentRoot element of the Resource
     */

    public static DocumentRoot loadXDD(URL resourcePath) {
        if (resourcePath == null)
            throw new IllegalArgumentException("Parameter 'resourcePath ' must not be null.");
        Map<Object, Object> options = new HashMap<Object, Object>();
        options.put(XMLResource.OPTION_ENCODING, "UTF-8"); //$NON-NLS-1$
        // get new Resource
        ResourceSet resSet = new ResourceSetImpl();
        resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xdd", new XDDResourceFactoryImpl()); //$NON-NLS-1$

        // Get the File and root object
        URI fileuri = URI.createURI(resourcePath.toString());
        Resource resource = resSet.getResource(fileuri, true);
        return (DocumentRoot) resource.getContents().get(0);
    }

    /**
     * @brief Parses integer from a String.
     *
     * @param data
     *            String to parse.
     * @return The parsed Integer or <code>null</code> if not not an Integer.
     */
    public static Integer parseInt(String data) {
        try {
            return Integer.parseInt(data);
        } catch (NumberFormatException nfe) {
            return null;
        }
    }

    /**
     * @brief Sets the Creator specified in the Wizard or uses
     *        System.getProperty("user.name").
     * @param string
     *            Name of the creator
     */
    public static void setCreator(String string) {
        XDDUtilities.creator = string;
    }

    /**
     * @brief Sets FeatureFlag according to bit-offset in object 1F82
     *
     *        Sets corresponding attributes in elements CNFeatures,MNFeatures
     *        and GeneralFeatures.
     *
     * @param status
     *            <code>True</code> if FeatureFlag shall be enabled,
     *            <code>false</code> otherwise.
     * @param bitOffset
     *            Bit-offset according to EPSG DS 301 v1.1.0, Object 0x1F82.
     * @param documentRoot
     *            Root of XDD-Document for which to set the FeatureFlag.
     */
    public static void setFeatureFlag(boolean status, int bitOffset, DocumentRoot documentRoot) {
        List<TObject> foundFeatureFlags = XDDUtilities.findEObjects(documentRoot,
                XDDPackage.eINSTANCE.getTObject_Index(),
                new ByteArrayCondition(EPLGeneralConstants.NMT_FEATUREFLAGS_U32));
        List<TGeneralFeatures> foundTGeneralFeatures = XDDUtilities.findEObjects(documentRoot,
                XDDPackage.eINSTANCE.getTGeneralFeatures());
        List<TCNFeaturesImpl> foundTCNFeatures = XDDUtilities.findEObjects(documentRoot,
                XDDPackage.eINSTANCE.getTCNFeatures());
        List<TMNFeatures> foundTMNFeatures = XDDUtilities.findEObjects(documentRoot,
                XDDPackage.eINSTANCE.getTMNFeatures());

        if (foundFeatureFlags.isEmpty() || foundTGeneralFeatures.isEmpty())
            return;

        TGeneralFeatures generalFeatures = (TGeneralFeatures) foundTGeneralFeatures.get(0);
        TObject featureFlagsObject = foundFeatureFlags.get(0);

        switch (bitOffset) {
        case EPLGeneralConstants.FF_OFFSET_MN_BASIC_ETHERNET_MODE:
            if (!foundTMNFeatures.isEmpty())
                foundTMNFeatures.get(0).setNMTMNBasicEthernet(status);
            break;
        case EPLGeneralConstants.FF_OFFSET_ROUTING_TYPE1_SUPPORT:
            generalFeatures.setRT1RT1Support(status);
            break;
        case EPLGeneralConstants.FF_OFFSET_ROUTING_TYPE2_SUPPORT:
            generalFeatures.setRT2RT2Support(status);
            break;
        case EPLGeneralConstants.FF_OFFSET_CONFIGURATION_MANAGER:
            generalFeatures.setCFMConfigManager(status);
            break;
        case EPLGeneralConstants.FF_OFFESET_MULTIPLEXED_ACCESS:
            if (!foundTCNFeatures.isEmpty())
                foundTCNFeatures.get(0).setDLLCNFeatureMultiplex(status);
            break;
        case EPLGeneralConstants.FF_OFFSET_PRESP_CHAINING:
            if (!foundTCNFeatures.isEmpty())
                foundTCNFeatures.get(0).setDLLCNPResChaining(status);
            break;
        default:
            break;
        }

        if (status)
            featureFlagsObject.setDefaultValue(
                    "0x" + Long.toHexString((Long.decode(featureFlagsObject.getDefaultValue()) | (1 << bitOffset))));
        else
            featureFlagsObject.setDefaultValue(
                    "0x" + Long.toHexString((Long.decode(featureFlagsObject.getDefaultValue()) & ~(1 << bitOffset))));
    } // setFeatureFlag

    /**
     * @brief Sets the IP-Support property to CNFeatures object based on
     *        status-value.
     * @param status
     *            <code>True</code> to enable IP-Support, <code>false</code>
     *            otherwise.
     * @param root
     *            The instance of DocumentRoot the feature has to be set or
     *            unset.
     */
    public static void setIPSupportProperties(DocumentRoot root, boolean status) {
        List<TGeneralFeatures> tgeneralFeatures = XDDUtilities.findEObjects(root,
                XDDPackage.eINSTANCE.getTGeneralFeatures());
        tgeneralFeatures.get(0).setNWLIPSupport(status);
    }

} // XDDUtilities
