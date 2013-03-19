package com.br_automation.buoat.xddeditor.XDD.custom;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.presentation.XDDEditorPlugin;
import com.br_automation.buoat.xddeditor.XDD.presentation.XDDModelWizard;

public class CustomXDDWizard extends XDDModelWizard {

    //Instance of WizardTemplatePage to acces Options etc.
    //private WizardTemplatePage wizardTemplatePage;

    public WizardTemplatePage wizardTemplatePage;
    public WizardConfigurationPage1 wizardConfigurationPage1;
    public XDDModelWizardNewFileCreationPage newFileCreationPage;

    //createInitalModel method (modified) - calls the loader-Method of InitalModelLoad which differs between 4 cases:
    //1.No default Template, 2.default template 3.default extended template 4.default static template
    @Override
    protected EObject createInitialModel() {
        InitialModelLoader initialModelLoader = new InitialModelLoader();
        DocumentRoot root = initialModelLoader
            .loadXDD(wizardTemplatePage, wizardConfigurationPage1);
        return root;
    }

    //addPages Method (modified) - adds custom pages (a.e WizardTemplatePage)

    @Override
    public void addPages() {
        // Create a page, set the title, and the initial model file name.
        //
        newFileCreationPage = new XDDModelWizardNewFileCreationPage("WizPag1", selection);
        newFileCreationPage
            .setTitle(XDDEditorPlugin.INSTANCE.getString("_UI_XDDModelWizard_label"));
        newFileCreationPage.setDescription(XDDEditorPlugin.INSTANCE
            .getString("_UI_XDDModelWizard_description"));
        newFileCreationPage.setFileName(XDDEditorPlugin.INSTANCE
            .getString("_UI_XDDEditorFilenameDefaultBase") + "." + XDDModelWizard.FILE_EXTENSIONS.get(0));
        addPage(newFileCreationPage);

        // Try and get the resource selection to determine a current directory for the file dialog.
        //
        if (selection != null && !selection.isEmpty()) {
            // Get the resource...
            //
            Object selectedElement = selection.iterator().next();
            if (selectedElement instanceof IResource) {
                // Get the resource parent, if its a file.
                IResource selectedResource = (IResource) selectedElement;
                if (selectedResource.getType() == IResource.FILE)
                    selectedResource = selectedResource.getParent();

                // This gives us a directory...
                if (selectedResource instanceof IFolder || selectedResource instanceof IProject) {
                    // Set this for the container.
                    //
                    newFileCreationPage.setContainerFullPath(selectedResource.getFullPath());

                    // Make up a unique new name here.
                    String defaultModelBaseFilename = XDDEditorPlugin.INSTANCE
                        .getString("_UI_XDDEditorFilenameDefaultBase");
                    String defaultModelFilenameExtension = XDDModelWizard.FILE_EXTENSIONS.get(0);
                    String modelFilename = defaultModelBaseFilename + "."
                        + defaultModelFilenameExtension;
                    for (int i = 1; ((IContainer) selectedResource).findMember(modelFilename) != null; ++i)
                        modelFilename = defaultModelBaseFilename + i + "."
                            + defaultModelFilenameExtension;
                    newFileCreationPage.setFileName(modelFilename);
                }
            }
        }

        //----------Changes of addPages method start here--------------\\
        //Hinzufügen der eigenen Page
        wizardTemplatePage = new WizardTemplatePage("wizardTemplatePage");
        addPage(wizardTemplatePage);

        wizardConfigurationPage1 = new WizardConfigurationPage1("wizardConfigurationPage1",
            this);
        addPage(wizardConfigurationPage1);

    }

    @Override
    public boolean performFinish() {
        try {
            // Remember the file.
            //
            final IFile modelFile = newFileCreationPage.getModelFile();

            // Do the work within an operation.
            //
            WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
                @Override
                protected void execute(IProgressMonitor progressMonitor) {
                    try {
                        // Create a resource set
                        //
                        ResourceSet resourceSet = new ResourceSetImpl();

                        // Get the URI of the model file.
                        //
                        URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath()
                            .toString(), true);

                        // Create a resource for this file.
                        //
                        Resource resource = resourceSet.createResource(fileURI);

                        // Add the initial model object to the contents.
                        //
                        EObject rootObject = createInitialModel();
                        if (rootObject != null)
                            resource.getContents().add(rootObject);

                        // Save the contents of the resource to the file system.
                        //
                        Map<Object, Object> options = new HashMap<Object, Object>();
                        options.put(XMLResource.OPTION_ENCODING, "UTF-8");
                        resource.save(options);
                    } catch (Exception exception) {
                        XDDEditorPlugin.INSTANCE.log(exception);
                    } finally {
                        progressMonitor.done();
                    }
                }
            };

            getContainer().run(false, false, operation);

            // Select the new file resource in the current view.
            //
            IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
            IWorkbenchPage page = workbenchWindow.getActivePage();
            final IWorkbenchPart activePart = page.getActivePart();
            if (activePart instanceof ISetSelectionTarget) {
                final ISelection targetSelection = new StructuredSelection(modelFile);
                getShell().getDisplay().asyncExec(new Runnable() {
                    @Override
                    public void run() {
                        ((ISetSelectionTarget) activePart).selectReveal(targetSelection);
                    }
                });
            }

            // Open an editor on the new file.
            //
            try {
                page.openEditor(new FileEditorInput(modelFile), workbench.getEditorRegistry()
                    .getDefaultEditor(modelFile.getFullPath().toString()).getId());
            } catch (PartInitException exception) {
                MessageDialog.openError(
                    workbenchWindow.getShell(),
                    XDDEditorPlugin.INSTANCE.getString("_UI_OpenEditorError_label"),
                    exception.getMessage());
                return false;
            }

            return true;
        } catch (Exception exception) {
            XDDEditorPlugin.INSTANCE.log(exception);
            return false;
        }
    }
}
