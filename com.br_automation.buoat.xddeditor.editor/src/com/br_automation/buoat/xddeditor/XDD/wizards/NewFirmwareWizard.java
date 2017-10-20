/*******************************************************************************
 * @file   NewFirmwareWizard.java
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

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.wizard.Wizard;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileType;
import com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType;
import com.br_automation.buoat.xddeditor.XDD.TDeviceFunction;
import com.br_automation.buoat.xddeditor.XDD.TFirmwareList;
import com.br_automation.buoat.xddeditor.XDD.XDDFactory;
import com.br_automation.buoat.xddeditor.XDD.impl.FirmwareTypeImpl;
import com.br_automation.buoat.xddeditor.editor.editors.DeviceDescriptionFileEditor;

/**
 * Wizard page to add new firmware.
 *
 * @author Sree Hari Vignesh
 *
 */
public class NewFirmwareWizard extends Wizard {

    private static final String WINDOW_TITLE = "Add firmware";

    /**
     * Add validateFirmwareWizardPage
     */
    private final ValidateFirmwareWizardPage validateFirmwarePage;

    private DocumentRoot documentRoot;

    private DeviceDescriptionFileEditor editor;

    private boolean editFirmware;

    private FirmwareTypeImpl firmwareObj;

    public NewFirmwareWizard(

            DocumentRoot selectedObj, DeviceDescriptionFileEditor editor, boolean editFirmware) {

        documentRoot = selectedObj;
        this.editor = editor;
        this.editFirmware = editFirmware;
        setWindowTitle(WINDOW_TITLE);
        validateFirmwarePage = new ValidateFirmwareWizardPage(WINDOW_TITLE, documentRoot, editor);
    }

    public NewFirmwareWizard(DocumentRoot selectedObj, DeviceDescriptionFileEditor editor, boolean editFirmware,
            FirmwareTypeImpl firmwareObj) {
        if (selectedObj == null) {
            System.err.println("Invalid node selection");
        }
        documentRoot = selectedObj;
        this.editor = editor;
        this.editFirmware = editFirmware;
        this.firmwareObj = firmwareObj;
        setWindowTitle(WINDOW_TITLE);
        validateFirmwarePage = new ValidateFirmwareWizardPage(WINDOW_TITLE, documentRoot, editor);
    }

    /**
     * Add wizard page
     */
    @Override
    public void addPages() {
        super.addPages();
        addPage(validateFirmwarePage);
    }

    @Override
    public boolean canFinish() {

        if (!validateFirmwarePage.isPageComplete()) {
            return false;
        }

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

    public TDeviceFunction getDeviceFunction() {
        EList<ISO15745ProfileType> profiles = documentRoot.getISO15745ProfileContainer().getISO15745Profile();
        ISO15745ProfileType profile1 = profiles.get(0);

        ProfileBodyDataType body1 = profile1.getProfileBody();
        EList<EObject> bodyContents = body1.eContents();
        for (EObject object : bodyContents) {
            if (object instanceof TDeviceFunction) {
                TDeviceFunction deviceFunction = (TDeviceFunction) object;
                return deviceFunction;
            }
        }
        return null;
    }

    @Override
    public boolean performFinish() {
        Path firmwareFilePath = validateFirmwarePage.getFirmwareConfigurationPath();
        FwSchema.DocumentRoot firmwareDocumentRoot = validateFirmwarePage.getFirmwareDocument();
        File firmwareFile = null;
        String fileName = StringUtils.EMPTY;

        if (firmwareFilePath != null) {
            firmwareFile = firmwareFilePath.toFile();
            fileName = firmwareFile.getName();

        }
        if (!editFirmware) {
            if (getDeviceFunction().getFirmwareList() != null) {
                com.br_automation.buoat.xddeditor.XDD.FirmwareType fwType = XDDFactory.eINSTANCE.createFirmwareType();
                fwType.setURI(fileName);
                fwType.setDeviceRevisionNumber(firmwareDocumentRoot.getFirmware().getVer());
                getDeviceFunction().getFirmwareList().getFirmware().add(fwType);

            } else {
                com.br_automation.buoat.xddeditor.XDD.FirmwareType fwType = XDDFactory.eINSTANCE.createFirmwareType();
                TFirmwareList fwList = XDDFactory.eINSTANCE.createTFirmwareList();
                getDeviceFunction().setFirmwareList(fwList);
                fwType.setURI(fileName);
                fwType.setDeviceRevisionNumber(firmwareDocumentRoot.getFirmware().getVer());
                getDeviceFunction().getFirmwareList().getFirmware().add(fwType);
            }
        } else {
            firmwareObj.setURI(fileName);
            firmwareObj.setDeviceRevisionNumber(firmwareDocumentRoot.getFirmware().getVer());
        }
        updateDocument(documentRoot);

        return true;
    }

}
