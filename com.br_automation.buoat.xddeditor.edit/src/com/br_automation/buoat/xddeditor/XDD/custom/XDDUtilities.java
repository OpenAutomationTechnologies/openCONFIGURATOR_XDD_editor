package com.br_automation.buoat.xddeditor.XDD.custom;

import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileType;
import com.br_automation.buoat.xddeditor.XDD.ObjectListType;
import com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType;
import com.br_automation.buoat.xddeditor.XDD.SubObjectType;
import com.br_automation.buoat.xddeditor.XDD.TApplicationLayers;
import com.br_automation.buoat.xddeditor.XDD.TCNFeatures;
import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.TObjectPDOMapping;

public class XDDUtilities {

    private static String creator;

    public static void setCreator(String string) {
        XDDUtilities.creator = string;
    }

    //TODO:Documentation?
    public static XMLGregorianCalendar getXMLDate() {
        GregorianCalendar cal = new GregorianCalendar();
        XMLGregorianCalendar sample = null;
        XMLGregorianCalendar result = null;
        try {
            sample = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
            result = DatatypeFactory.newInstance().newXMLGregorianCalendar();
        } catch (DatatypeConfigurationException e1) {
            e1.printStackTrace();
        }
        result.clear();
        result.setMonth(sample.getMonth());
        result.setYear(sample.getYear());
        result.setDay(sample.getDay());
        return result;
    }//getXMLDate

    public static XMLGregorianCalendar getXMLTime() {
        GregorianCalendar cal = new GregorianCalendar();
        XMLGregorianCalendar sample = null;
        XMLGregorianCalendar result = null;
        try {
            sample = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
            result = DatatypeFactory.newInstance().newXMLGregorianCalendar();
        } catch (DatatypeConfigurationException e1) {
            e1.printStackTrace();
        }
        result.setMinute(sample.getMinute());
        result.setHour(sample.getHour());
        result.setSecond(sample.getSecond());
        result.setTimezone(sample.getTimezone());
        return result;
    }//getXMLTime

    //Function to update the Username an Modification Date when saving
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
    }//addSaveModifications

    //Sets the MultiplexFeature for TObject and TCNFeatures
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
    }//setMultiplexFeature

    public static HashMap<String, TObject> getMappingObjects(DocumentRoot root,
        Set<TObjectPDOMapping> mappingTypes) {
        List<EObject> tObjects = root.getISO15745ProfileContainer().getISO15745Profile().get(1)
            .getProfileBody().eContents().get(0).eContents().get(2).eContents();
        HashMap<String, TObject> validObjects = new HashMap<String, TObject>();

        for (EObject object : tObjects) {
            TObject testObject = (TObject) object;
            if ((testObject.getSubObject().isEmpty() && mappingTypes.contains(testObject
                .getPDOmapping()))
                || !(XDDUtilities.getMappingSubObjects(testObject, mappingTypes).isEmpty()))
                if (testObject.getName() != null && testObject.getIndex() != null)
                    validObjects.put(testObject.getName(), testObject);
        }
        return validObjects;
    }//getMappingObjects

    public static HashMap<String, SubObjectType> getMappingSubObjects(TObject tObject,
        Set<TObjectPDOMapping> mappingType) {
        HashMap<String, SubObjectType> subobjectsList = new HashMap<String, SubObjectType>();

        for (SubObjectType subObject : tObject.getSubObject())
            if (mappingType.contains(subObject.getPDOmapping()) && subObject.getSubIndex() != null
                && subObject.getDataType() != null)
                subobjectsList.put(subObject.getName(), subObject);
        return subobjectsList;
    }//getMappingSubObjects

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
            default:
                break;
        }
        return mappingTypes;
    }//getValidMappingTypes

    public static Integer parseInt(String data) {
        try {
            return Integer.parseInt(data);
        } catch (NumberFormatException nfe) {
            return null;
        }
    }//parseInt

    public static String getDataTypeSize(byte[] bs) {
        int value = new BigInteger(1, bs).intValue();
        return EDataType.fromInt(value).toIntString();
    }//getDataTypeSize

    public static boolean isRPDO(TObject tobject) {
        int value = new BigInteger(1, tobject.getIndex()).intValue();
        if (value >= 0x1600 && value <= 0x16FF)
            return true;
        else
            return false;
    }//isRPDO
}// XDDUtilities