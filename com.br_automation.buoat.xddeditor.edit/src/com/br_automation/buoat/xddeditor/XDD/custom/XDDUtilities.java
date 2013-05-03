/**
 * @since 21.3.2013
 * @author Joris Lückenga, Bernecker + Rainer Industrie Elektronik Ges.m.b.H.
 */

package com.br_automation.buoat.xddeditor.XDD.custom;

import java.math.BigInteger;
import java.util.ArrayList;
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
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileType;
import com.br_automation.buoat.xddeditor.XDD.ObjectListType;
import com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType;
import com.br_automation.buoat.xddeditor.XDD.SubObjectType;
import com.br_automation.buoat.xddeditor.XDD.TApplicationLayers;
import com.br_automation.buoat.xddeditor.XDD.TCNFeatures;
import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.TObjectPDOMapping;
import com.br_automation.buoat.xddeditor.XDD.impl.ObjectListTypeImpl;

/**
 * @brief Static utility-methods for XDD-File/resource manipulation and
 *        conversion / checks.
 * 
 * @author Joris Lückenga
 * */
public final class XDDUtilities {

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
        public RegexVerifyListener(String pattern,
            List<Character> excludedChars,
            boolean toUpper) {
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
     * @brief Function to set username to "modified by" field,modification date
     *        and time on save.
     * 
     * @param root
     *            Root object of the current document.
     */
    public static void addSaveModifications(DocumentRoot root) {
        ISO15745ProfileType profile1 = root.getISO15745ProfileContainer().getISO15745Profile()
            .get(0);
        ISO15745ProfileType profile2 = root.getISO15745ProfileContainer().getISO15745Profile()
            .get(1);
        ProfileBodyDataType body1 = profile1.getProfileBody();
        ProfileBodyDataType body2 = profile2.getProfileBody();
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
    } //addSaveModifications

    /**
     * @brief Adds Objects and Subobjects to the current TObjects,if
     *        Sub-/TObjects with the same Subindex/Index do not exist already.
     * @param currentObjectList
     *            List where Objects should be added to
     * @param objectsToAdd
     *            List of Objects to check if they already exist,if not, they
     *            are added.
     * */
    public static void addTObjects(EList<TObject> currentObjectList, List<TObject> objectsToAdd) {

        Map<Integer, TObject> currentObjectMap = new HashMap<Integer, TObject>(
            currentObjectList.size());

        //Create Map of current Objectlist
        for (TObject currentObject : currentObjectList)
            currentObjectMap
                .put(new BigInteger(currentObject.getIndex()).intValue(), currentObject); // NOPMD by lueckengaj on 18.04.13 09:23

        //Iterate thorugh all objects that should be changed
        for (TObject currentObjectToAdd : objectsToAdd) {
            //Get current index as integer-value
            int currentObjectToAddIndex = new BigInteger(currentObjectToAdd.getIndex()).intValue(); // NOPMD by lueckengaj on 18.04.13 09:22
            //Check if the object already exists
            if (currentObjectMap.containsKey(currentObjectToAddIndex)) {

                //get the subobject-list of the Tobject with matching index,and put it into a hash-map
                EList<SubObjectType> currentSubObjects = currentObjectMap.get(
                    currentObjectToAddIndex).getSubObject();
                List<SubObjectType> missingSubObjects = new ArrayList<SubObjectType>();
                Map<Integer, SubObjectType> currentSubObjectMap = new HashMap<Integer, SubObjectType>();
                for (SubObjectType currentSubObject : currentSubObjects)
                    currentSubObjectMap
                        .put(
                            new BigInteger(currentSubObject.getSubIndex()).intValue(),
                            currentSubObject);
                //get Objects to add
                List<SubObjectType> addableSubObjects = currentObjectToAdd.getSubObject();
                //Find objects which do not already exist
                for (SubObjectType addableSubObject : addableSubObjects) {
                    if (!currentSubObjectMap.containsKey(new BigInteger(addableSubObject
                        .getSubIndex()).intValue()))
                        missingSubObjects.add(addableSubObject);
                }
                //add & sort them after iterating
                currentSubObjects.addAll(missingSubObjects);
                ECollections.sort(currentSubObjects, new SubObjectComparator()); // NOPMD by lueckengaj on 18.04.13 09:26

            } else { //if not found -> add TObject 
                currentObjectList.add(currentObjectToAdd);
            }
        }
        ECollections.sort(currentObjectList, new TObjectComparator());
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
    public static Map<String, TObject> getMappingObjects(DocumentRoot root,
        Set<TObjectPDOMapping> mappingTypes) {
        List<EObject> tObjects = root.getISO15745ProfileContainer().getISO15745Profile().get(1)
            .getProfileBody().eContents().get(0).eContents().get(2).eContents();
        HashMap<String, TObject> validObjects = new HashMap<String, TObject>();

        for (EObject object : tObjects) {
            TObject testObject = (TObject) object;
            if ((testObject.getSubObject().isEmpty() && mappingTypes.contains(testObject
                .getPDOmapping()))
                || !(XDDUtilities.getMappingSubObjects(testObject, mappingTypes).isEmpty()))
                if (testObject.getName() != null && testObject.getIndex() != null) // NOPMD by lueckengaj on 29.03.13 11:19
                    validObjects.put(testObject.getName(), testObject);
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
    public static Map<String, SubObjectType> getMappingSubObjects(TObject tObject,
        Set<TObjectPDOMapping> mappingType) {
        Map<String, SubObjectType> subobjectsList = new HashMap<String, SubObjectType>();

        for (SubObjectType subObject : tObject.getSubObject())
            if (mappingType.contains(subObject.getPDOmapping()) && subObject.getSubIndex() != null
                && subObject.getDataType() != null)
                subobjectsList.put(subObject.getName(), subObject);
        return subobjectsList;
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
     * @brief Gets the list of existing TObjects from the specified
     *        root-element.
     * @param root
     *            The Instance of DocumentRoot in which should be searched for a
     *            TObject-list.
     * @return An <code>EList</code> of <code>TObject</code> elements found in
     *         root.
     */
    public static EList<TObject> getTObjectList(DocumentRoot root) {
        TreeIterator<EObject> iterator = root.eAllContents(); //Iterator through whole Resource
        Object currentObject;
        EList<TObject> resourceTObjects = null;

        //Iterate through resource and get current TOBjectlist
        while (iterator.hasNext()) {
            currentObject = iterator.next();
            if (currentObject instanceof ObjectListTypeImpl) { //get the current TOBjectlist
                resourceTObjects = ((ObjectListTypeImpl) currentObject).getObject();
                break;
            }

        }
        return resourceTObjects;
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
     *         TOBject.
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
        XMLGregorianCalendar sample = null;
        XMLGregorianCalendar result = null;
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
        XMLGregorianCalendar sample = null;
        XMLGregorianCalendar result = null;
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
        return (index >= ObjectDictionaryEntry.PDO_RXMAPPPARAM_MIN && index <= ObjectDictionaryEntry.PDO_RXMAPPPARAM_MIN);
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
     * @brief Set MultiplexFeature for TObject and TCNFeatures.Does not add
     *        required Objects
     * @param status
     *            <code>True</code> if Multiplexing shall be enabled,
     *            <code>false</code> otherwise.
     * @param documentRoot
     *            Root of XDD-Document for which to enable Multiplexing.
     */
    public static void setMultiplexFeatureProperties(boolean status, DocumentRoot documentRoot) {
        //TODO:implement generic lookup!?
        //TODO Überprüfen auf Null (Muss auch ohne Template verwendbar sein)
        ISO15745ProfileType profile = documentRoot.getISO15745ProfileContainer()
            .getISO15745Profile().get(1);
        TCNFeatures features = (TCNFeatures) profile.getProfileBody().eContents().get(2)
            .eContents().get(1);

        //Setzen von CNFeature
        features.setDLLCNFeatureMultiplex(status);

        TApplicationLayers applicationLayers = (TApplicationLayers) profile.getProfileBody()
            .eContents().get(0);
        ObjectListType listType = applicationLayers.getObjectList();
        List<TObject> objects = listType.getObject();

        for (TObject tObject : objects)
            if (tObject.getName().contentEquals("NMT_FeatureFlags_U32"))
                if (status)
                    tObject.setDefaultValue("0x"
                        + Long.toHexString((Long.decode(tObject.getDefaultValue()) | 512)));
                else
                    tObject.setDefaultValue("0x"
                        + Long.toHexString((Long.decode(tObject.getDefaultValue()) & ~512)));
    } //setMultiplexFeature

} // XDDUtilities
