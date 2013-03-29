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

/**
 * @author Joris Lückenga
 * @brief PropertySection for DeviceType Object (index 0x1000)
 * @since 21.3.2013
 * */
public final class XDDUtilities {
    /**
     * 
     * @author David Puffer
     * @brief VerifyListener for Hex-Text fields
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
         *            <code>true</code> to convert the entered character to
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

        /**
         * 
         */
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
     * @brief private Constructor becaus Utilityclass uses Static methods and
     *        should not be instantiated
     */
    private XDDUtilities() {
    }

    /**
     * @brief Function to update the Username an Modification Date when saving
     * 
     * @param root
     *            Object of actual document
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
     * @brief gets the size of the DataType
     * @param bs
     *            bytearray of the object
     * @return Stringvalue of the bytearray
     */
    public static String getDataTypeSize(byte[] bs) {
        int value = new BigInteger(1, bs).intValue();
        return DataType.fromInt(value).toIntString();
    } //getDataTypeSize

    /**
     * @brief returns the specified color
     * @param device
     *            , the actual window/device used
     * @return the specified color
     */
    public static Color getGrey(Device device) {
        return new Color(device, 240, 240, 240);
    }

    /**
     * @brief returns the possible mappable objects
     * @param root
     *            element to iterate through
     * @param mappingTypes
     *            an array of valid ENUMs of MappingType
     * @return a HashMap with valid Objects that are mappable
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
    } //getMappingObjects

    /**
     * @brief gets the valid subobjecttypes of a tObject
     * @param tObject
     *            with subojects to iterate through
     * @param mappingType
     *            wich is valid
     * @return the hashMap of Subobjects with matching mapping
     */
    public static Map<String, SubObjectType> getMappingSubObjects(TObject tObject,
        Set<TObjectPDOMapping> mappingType) {
        Map<String, SubObjectType> subobjectsList = new HashMap<String, SubObjectType>();

        for (SubObjectType subObject : tObject.getSubObject())
            if (mappingType.contains(subObject.getPDOmapping()) && subObject.getSubIndex() != null
                && subObject.getDataType() != null)
                subobjectsList.put(subObject.getName(), subObject);
        return subobjectsList;
    } //getMappingSubObjects

    /**
     * @brief returns the specified color
     * @param device
     *            , the actual window/device used
     * @return the specified color
     */
    public static Color getRed(Device device) {
        return new Color(device, 255, 0, 0);
    }

    /**
     * @brief gets the valid Mapping depending on parent tobject
     * @param mappingType
     *            of the tobject
     * @return the set of valid mapping
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
    } //getValidMappingTypes

    /**
     * @brief returns the specified color
     * @param device
     *            , the actual window/device used
     * @return the specified color
     */
    public static Color getWhite(Device device) {
        return new Color(device, 255, 255, 255);
    }

    /**
     * @brief gets the acutal Date in XML-Format
     * @return actual Date in XML-Format
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
    } //getXMLDate

    /**
     * @brief gets the actual Time in XML-Format
     * @return actual Time in XML-Format
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
    } //getXMLTime

    /**
     * @brief checks if the parentIndex should use TPDO or RPDO mapping
     * @param tobject
     *            /parentobject
     * @return the right mappingtype for the index
     */
    public static boolean isRPDO(TObject tobject) {
        int value = new BigInteger(1, tobject.getIndex()).intValue();
        if (value >= 0x1600 && value <= 0x16FF)
            return true;
        return false;
    } //isRPDO

    /**
     * @brief parses Integer from a String, is needed to check if it works for
     *        If-statement
     * @param data
     *            of the string
     * @return Integer or null if exception is thrown
     */
    public static Integer parseInt(String data) {
        try {
            return Integer.parseInt(data);
        } catch (NumberFormatException nfe) {
            return null;
        }
    } //parseInt

    public static void setCreator(String string) {
        XDDUtilities.creator = string;
    }

    /**
     * @brief Sets the MultiplexFeature for TObject and TCNFeatures
     * @param status
     *            of the multiplexfeature
     * @param documentRoot
     *            of the opened Resource
     */
    //TODO:implement generic lookup!?
    public static void setMultiplexFeature(boolean status, DocumentRoot documentRoot) {
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
