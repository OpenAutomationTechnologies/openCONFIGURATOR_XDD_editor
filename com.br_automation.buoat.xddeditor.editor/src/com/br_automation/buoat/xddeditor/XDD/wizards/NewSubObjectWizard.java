/*******************************************************************************
 * @file   NewSubObjectWizard.java
 *
 * @author Sree Hari Vignesh, Kalycito Infotech Private Limited.
 *
 * @copyright (c) 2017, Kalycito Infotech Private Limited
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

package com.br_automation.buoat.xddeditor.XDD.wizards;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.DatatypeConverter;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.wizard.Wizard;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.SubObjectType;
import com.br_automation.buoat.xddeditor.XDD.TObjectAccessType;
import com.br_automation.buoat.xddeditor.XDD.TObjectPDOMapping;
import com.br_automation.buoat.xddeditor.XDD.XDDFactory;
import com.br_automation.buoat.xddeditor.XDD.impl.TObjectImpl;
import com.br_automation.buoat.xddeditor.editor.editors.DeviceDescriptionFileEditor;

/**
 * Wizard page to add new sub-object
 *
 * @author Sree Hari Vignesh
 *
 */
public class NewSubObjectWizard extends Wizard {

    private static final String WINDOW_TITLE = "Add Sub-object";

    private final AddSubObjectWizardPage addSubObjectWizardPage;

    private TObjectImpl selObj;

    private DeviceDescriptionFileEditor editor;

    private DocumentRoot documentRoot;

    /**
     * Constructor to initialize the wizard page to create new sub-object.
     *
     * @param selectedObj
     *            Instance of parent object
     * @param editor
     *            Instance of Object dictionary editor page
     * @param docRoot
     *            Instance of XDD file
     */
    public NewSubObjectWizard(TObjectImpl selectedObject, DeviceDescriptionFileEditor editor, DocumentRoot docRoot) {

        documentRoot = docRoot;
        this.editor = editor;
        selObj = selectedObject;
        setWindowTitle(WINDOW_TITLE);
        addSubObjectWizardPage = new AddSubObjectWizardPage(WINDOW_TITLE, selectedObject, editor);
    }

    /**
     * Add wizard page
     */
    @Override
    public void addPages() {
        super.addPages();
        addPage(addSubObjectWizardPage);
    }

    @Override
    public boolean canFinish() {

        if (!addSubObjectWizardPage.isPageComplete()) {
            return false;
        }

        return true;
    }

    @Override
    public boolean performFinish() {

        if (selObj.getSubObject() != null) {

            if (!addSubObjectWizardPage.getTxtSubObjIndex().equalsIgnoreCase("00")) {
                if (!addSubObjectWizardPage.getTxtSubObjIndex().equalsIgnoreCase("0x00")) {
                    if (selObj.getSubObject().isEmpty()) {
                        SubObjectType subObj = XDDFactory.eINSTANCE.createSubObjectType();

                        subObj.setAccessType(TObjectAccessType.CONST);

                        subObj.setPDOmapping(TObjectPDOMapping.NO);

                        if (addSubObjectWizardPage.getDataType() != null) {
                            subObj.setDataType(
                                    DatatypeConverter.parseHexBinary(addSubObjectWizardPage.getDataType("Unsigned8")));
                        }

                        if (addSubObjectWizardPage.getSubIndex() != null) {
                            subObj.setSubIndex(DatatypeConverter.parseHexBinary("00"));
                        }

                        subObj.setObjectType((short) 7);

                        subObj.setName("NumberOfEntries");

                        selObj.getSubObject().add(subObj);
                    }
                }
            }

            SubObjectType subObj = XDDFactory.eINSTANCE.createSubObjectType();

            subObj.setAccessType(addSubObjectWizardPage.getAccessType());

            subObj.setPDOmapping(addSubObjectWizardPage.getPdoMapping());

            if (addSubObjectWizardPage.getDataType() != null) {
                subObj.setDataType(addSubObjectWizardPage.getDataType());
            }

            if (!addSubObjectWizardPage.getTxtDefaultValue().isEmpty()) {
                subObj.setDefaultValue(addSubObjectWizardPage.getTxtDefaultValue());
            }

            if (!addSubObjectWizardPage.getTxtHighLimit().isEmpty()) {
                subObj.setHighLimit(addSubObjectWizardPage.getHighLimit());
            }

            if (!addSubObjectWizardPage.getTxtLowLimit().isEmpty()) {
                subObj.setLowLimit(addSubObjectWizardPage.getLowLimit());
            }

            if (addSubObjectWizardPage.getSubIndex() != null) {
                subObj.setSubIndex(addSubObjectWizardPage.getSubIndex());
            }

            subObj.setObjectType(addSubObjectWizardPage.getSubObjectType());

            subObj.setName(addSubObjectWizardPage.getTxtSubObjName());

            selObj.getSubObject().add(subObj);

        }

        updateDocument(documentRoot);

        return true;
    }

    public boolean updateDocument(DocumentRoot documentRoot) {
        // Create a resource set
        ResourceSet resourceSet = new ResourceSetImpl();

        // Get the URI of the model file.
        URI fileURI = URI.createPlatformResourceURI(editor.getModelFile().getFullPath().toString(), true);

        // Create a resource for this file.
        Resource resource = resourceSet.createResource(fileURI);

        // Add the initial model object to the contents.
        EObject rootObject = documentRoot;
        if (rootObject != null)
            resource.getContents().add(rootObject);

        // Save the contents of the resource to the file system.
        Map<Object, Object> options = new HashMap<Object, Object>();
        // options.put(XMLResource.OPTION_ENCODING, "UTF-8");
        try {
            resource.save(options);
            return true;
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        return false;
    }

}
