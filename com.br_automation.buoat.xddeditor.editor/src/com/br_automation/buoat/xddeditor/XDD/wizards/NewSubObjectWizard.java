package com.br_automation.buoat.xddeditor.XDD.wizards;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.Wizard;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileType;
import com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType;
import com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType;
import com.br_automation.buoat.xddeditor.XDD.SubObjectType;
import com.br_automation.buoat.xddeditor.XDD.TDeviceFunction;
import com.br_automation.buoat.xddeditor.XDD.TFirmwareList;
import com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures;
import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.XDDFactory;
import com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyCommunicationNetworkPowerlinkImpl;
import com.br_automation.buoat.xddeditor.XDD.impl.TApplicationLayersImpl;
import com.br_automation.buoat.xddeditor.XDD.impl.TNetworkManagementImpl;
import com.br_automation.buoat.xddeditor.XDD.impl.TObjectImpl;
import com.br_automation.buoat.xddeditor.editor.editors.DeviceDescriptionFileEditor;

import FwSchema.util.FwSchemaResourceFactoryImpl;

public class NewSubObjectWizard extends Wizard {
	

    /**
     * Add validateFirmwareWizardPage
     */
	private static final String WINDOW_TITLE = "POWERLINK Sub Object wizard";
	
	private final AddSubObjectWizardPage addSubObjectWizardPage;
	
	private TObjectImpl selObj;

	private DeviceDescriptionFileEditor editor;
	
    private DocumentRoot documentRoot;


	
    public NewSubObjectWizard(TObjectImpl selectedObject, DeviceDescriptionFileEditor editor, DocumentRoot docRoot) {
        if (selectedObject == null) {
            System.err.println("Invalid node selection");
        }
        documentRoot = docRoot;
        this.editor = editor;
        selObj = selectedObject;
        setWindowTitle(WINDOW_TITLE);
        addSubObjectWizardPage = new AddSubObjectWizardPage(WINDOW_TITLE, selectedObject);
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

    	if( selObj.getSubObject() != null) {
    		SubObjectType subObj = XDDFactory.eINSTANCE.createSubObjectType();

    		subObj.setAccessType(addSubObjectWizardPage.getAccessType());
    		
    		subObj.setPDOmapping(addSubObjectWizardPage.getPdoMapping());

    		if(addSubObjectWizardPage != null) {
    			subObj.setDataType(addSubObjectWizardPage.getDataType());
    		}

    		if(!addSubObjectWizardPage.getTxtDefaultValue().isEmpty()) {
    			subObj.setDefaultValue(addSubObjectWizardPage.getTxtDefaultValue());
    		}

    		//obj.setDenotation(addObjectWizardPage.getDenotation());

    		if(!addSubObjectWizardPage.getTxtHighLimit().isEmpty()) {
    			subObj.setHighLimit(addSubObjectWizardPage.getHighLimit());
    		}

    		if(!addSubObjectWizardPage.getTxtLowLimit().isEmpty()) {
    			subObj.setLowLimit(addSubObjectWizardPage.getLowLimit());
    		}

    		if(addSubObjectWizardPage.getSubIndex() != null) {
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
