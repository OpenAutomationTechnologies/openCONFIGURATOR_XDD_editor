/*******************************************************************************
 * @file   XddJdomOperation.java
 *
 * @author Ramakrishnan Periyakaruppan, Kalycito Infotech Private Limited.
 *
 * @copyright (c) 2015, Kalycito Infotech Private Limited
 *                    All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *   * Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *   * Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *   * Neither the name of the copyright holders nor the
 *     names of its contributors may be used to endorse or promote products
 *     derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL COPYRIGHT HOLDERS BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *******************************************************************************/

package com.br_automation.buoat.xddeditor.XDD.xmloperation;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.DatatypeConverter;

import org.apache.commons.lang3.StringUtils;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Namespace;
import org.jdom2.xpath.XPathExpression;

/**
 * Class that performs JDom operations on an XDD/XDC file.
 *
 * @author Ramakrishnan P
 *
 */
public class XddJdomOperation {

    static final Namespace POWERLINK_XDD_NAMESPACE;

    private static final String OBJECT_ACTUAL_VALUE = "actualValue";
    private static final String PARAMETER_VALUE = "value";
    public static final String PARAMETER_ACTUAL_VALUE = "actualValue";
    public static final String CONNECTED_MODULE_LIST = "connectedModuleList";
    public static final String CONNECTED_MODULE = "connectedModule";
    public static final String CHILD_ID = "childIDRef";
    public static final String POSITION = "position";
    public static final String ADDRESS = "address";
    public static final String APPLICATION_PROCESS = "ApplicationProcess";
    public static final String TEMPLATE_LIST = "templateList";
    public static final String PARAMETER_LIST = "parameterList";
    public static final String DATATYPE_LIST = "dataTypeList";
    public static final String PARAMETER_GROUP_LIST = "parameterGroupList";
    public static final String PARAMETER_GROUP = "parameterGroup";
    public static final String PARAMETER_REFERENCE = "parameterRef";
    public static final String PARAMETER_DEFAULT_VALUE = "defaultValue";
    public static final String PARAMETER_SUBSTITUTE_VALUE = "substituteValue";
    public static final String PARAMETER_ALLOWED_VALUE = "allowedValues";
    public static final String PARAMETER_UNIT_ELEMENT = "unit";
    public static final String PARAMETER_PROPERTY_ELEMENT = "property";
    private static final String FILE_MODIFICATION_TIME = "fileModificationTime";
    private static final String FILE_MODIFICATION_DATE = "fileModificationDate";
    private static final String FILE_MODIFIED_BY = "fileModifiedBy";
    private static final String APPLICATION_PROCESS_XPATH = "//plk:ProfileBody"
            + "/plk:ApplicationProcess";

    private static final String FILE_MODIFICATION_TIME_XPATH = "//plk:ProfileBody[@"
            + FILE_MODIFICATION_TIME + "]";
    private static final String FILE_MODIFICATION_DATE_XPATH = "//plk:ProfileBody[@"
            + FILE_MODIFICATION_DATE + "]";
    private static final String FILE_MODIFIED_BY_XPATH = "//plk:ProfileBody[@"
            + FILE_MODIFIED_BY + "]";
    private static final String INTERFACE_LIST_XPATH = "//plk:DeviceManager"
            + "/plk:moduleManagement" + "/plk:interfaceList";

    private static final String PARAMETER_LIST_XPATH = APPLICATION_PROCESS_XPATH
            + "/plk:parameterList";
    private static final String TEMPLATE_LIST_XPATH = APPLICATION_PROCESS_XPATH
            + "/plk:templateList";
    private static final String PARAMETER_GROUP_LIST_XPATH = APPLICATION_PROCESS_XPATH
            + "/plk:parameterGroupList";

    static {
        POWERLINK_XDD_NAMESPACE = Namespace.getNamespace("plk",
                "http://www.ethernet-powerlink.org");
    }



    private static void removeNodeApplicationProcess(Document document) {
        String paramDataTypeXpath = APPLICATION_PROCESS_XPATH + "/plk:"
                + DATATYPE_LIST + "/plk:struct";
        String paramGrpXpath = PARAMETER_GROUP_LIST_XPATH
                + "/plk:parameterGroup";
        String paramtempXpath = TEMPLATE_LIST_XPATH + "/plk:parameterTemplate";
        String paramXpath = PARAMETER_LIST_XPATH + "/plk:parameter";

        if (!JDomUtil.isXpathPresent(document, paramDataTypeXpath,
                POWERLINK_XDD_NAMESPACE)) {
            JDomUtil.removeElement(document,
                    APPLICATION_PROCESS_XPATH + "/plk:" + DATATYPE_LIST,
                    POWERLINK_XDD_NAMESPACE);
        }

        if (!JDomUtil.isXpathPresent(document, paramGrpXpath,
                POWERLINK_XDD_NAMESPACE)) {
            JDomUtil.removeElement(document, PARAMETER_GROUP_LIST_XPATH,
                    POWERLINK_XDD_NAMESPACE);
        }

        if (!JDomUtil.isXpathPresent(document, paramtempXpath,
                POWERLINK_XDD_NAMESPACE)) {
            JDomUtil.removeElement(document, TEMPLATE_LIST_XPATH,
                    POWERLINK_XDD_NAMESPACE);
        }

        if (!JDomUtil.isXpathPresent(document, paramXpath,
                POWERLINK_XDD_NAMESPACE)) {
            JDomUtil.removeElement(document, PARAMETER_LIST_XPATH,
                    POWERLINK_XDD_NAMESPACE);
        }
    }





    private static void updateApplicationProcess(Document document) {

        String xpath = "//plk:ProfileBody[@*[local-name()='type']='ProfileBody_Device_Powerlink_Modular_Head']";
        String applicationProcessXpath = xpath + "/plk:ApplicationProcess";

        if (JDomUtil.isXpathPresent(document, applicationProcessXpath,
                POWERLINK_XDD_NAMESPACE)) {
            System.err.println("prfileBody Xpath present....");
            Element newdataTypeElement = new Element(DATATYPE_LIST);
            JDomUtil.addNewElement(document, APPLICATION_PROCESS_XPATH,
                    POWERLINK_XDD_NAMESPACE, newdataTypeElement);

            Element newTempElement = new Element(TEMPLATE_LIST);
            JDomUtil.addNewElement(document, APPLICATION_PROCESS_XPATH,
                    POWERLINK_XDD_NAMESPACE, newTempElement);

            Element newParamElement = new Element(PARAMETER_LIST);
            JDomUtil.addNewElement(document, APPLICATION_PROCESS_XPATH,
                    POWERLINK_XDD_NAMESPACE, newParamElement);

            Element newParamGroupElement = new Element(PARAMETER_GROUP_LIST);
            JDomUtil.addNewElement(document, APPLICATION_PROCESS_XPATH,
                    POWERLINK_XDD_NAMESPACE, newParamGroupElement);

        } else {
            Element newObjElement = new Element(APPLICATION_PROCESS);
            JDomUtil.addNewElement(document, xpath, POWERLINK_XDD_NAMESPACE,
                    newObjElement);
            Element newdataTypeElement = new Element(DATATYPE_LIST);
            JDomUtil.addNewElement(document, APPLICATION_PROCESS_XPATH,
                    POWERLINK_XDD_NAMESPACE, newdataTypeElement);

            Element newTempElement = new Element(TEMPLATE_LIST);
            JDomUtil.addNewElement(document, APPLICATION_PROCESS_XPATH,
                    POWERLINK_XDD_NAMESPACE, newTempElement);

            Element newParamElement = new Element(PARAMETER_LIST);
            JDomUtil.addNewElement(document, APPLICATION_PROCESS_XPATH,
                    POWERLINK_XDD_NAMESPACE, newParamElement);

            Element newParamGroupElement = new Element(PARAMETER_GROUP_LIST);
            JDomUtil.addNewElement(document, APPLICATION_PROCESS_XPATH,
                    POWERLINK_XDD_NAMESPACE, newParamGroupElement);

        }

    }

    /**
     * Update the given name for the given file modified by attribute in the
     * XDD/XDC document
     *
     * @param document XDD/XDC file instance.
     * @param value The user name to be set.
     */
    public static void updateFileModifiedBy(Document document, String value) {
        Attribute newAttribute = new Attribute(FILE_MODIFIED_BY, value);
        JDomUtil.setAttribute(document, FILE_MODIFIED_BY_XPATH,
                POWERLINK_XDD_NAMESPACE, newAttribute);
    }

    /**
     * Update the given date for the given file modified date attribute in the
     * XDD/XDC document
     *
     * @param document XDD/XDC file instance.
     * @param value The current date to be set.
     */
    public static void updateFileModifiedDate(Document document, String value) {
        Attribute newAttribute = new Attribute(FILE_MODIFICATION_DATE, value);
        JDomUtil.setAttribute(document, FILE_MODIFICATION_DATE_XPATH,
                POWERLINK_XDD_NAMESPACE, newAttribute);
    }

    /**
     * Update the given time for the given file modified time attribute in the
     * XDD/XDC document
     *
     * @param document XDD/XDC file instance.
     * @param time The current time to be set.
     */
    public static void updateFileModifiedTime(Document document, String time) {
        Attribute newAttribute = new Attribute(FILE_MODIFICATION_TIME, time);
        JDomUtil.setAttribute(document, FILE_MODIFICATION_TIME_XPATH,
                POWERLINK_XDD_NAMESPACE, newAttribute);

    }



}
