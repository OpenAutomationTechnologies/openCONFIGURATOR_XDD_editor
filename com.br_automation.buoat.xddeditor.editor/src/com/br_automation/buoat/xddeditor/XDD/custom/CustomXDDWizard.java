/**
 * @since 19.3.2013
 * @author Joris Lückenga, Bernecker + Rainer Industrie Elektronik Ges.m.b.H.
 *
 *  @copyright (c) 2017, Kalycito Infotech Private Limited
 *
 *  @copyright (c) 2017, Bernecker + Rainer Industrie Elektronik Ges.m.b.H.
 *            All rights reserved.
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

/**
 * @brief Modified/Overridden XDDWizard extended from generated Wizard.
 *
 *        Modifications for methods addPages(), performFinis() and
 *        creatInitialModel() as well as getters for WizardPages to extend the
 *        design and functions of the wizard.
 *
 * @author Joris Lückenga
 */
public class CustomXDDWizard extends XDDModelWizard {

    private WizardConfigurationPage1 wizardConfigurationPage1;
    private WizardTemplatePage wizardTemplatePage;

    /**
     * @see XDDModelWizard#addPages()
     */
    @Override
    public void addPages() {
        // Create a page, set the title, and the initial model file name.
        this.newFileCreationPage = new XDDModelWizardNewFileCreationPage("WizPag1", this.selection);
        this.newFileCreationPage.setTitle(XDDEditorPlugin.INSTANCE.getString("_UI_XDDModelWizard_label"));
        this.newFileCreationPage.setDescription(XDDEditorPlugin.INSTANCE.getString("_UI_XDDModelWizard_description"));
        this.newFileCreationPage.setFileName(XDDEditorPlugin.INSTANCE.getString("_UI_XDDEditorFilenameDefaultBase")
                + "." + XDDModelWizard.FILE_EXTENSIONS.get(0));
        this.addPage(this.newFileCreationPage);

        // Try and get the resource selection to determine a current directory
        // for the file dialog.
        if (this.selection != null && !this.selection.isEmpty()) {
            // Get the resource...
            Object selectedElement = this.selection.iterator().next();
            if (selectedElement instanceof IResource) {
                // Get the resource parent, if its a file.
                IResource selectedResource = (IResource) selectedElement;
                if (selectedResource.getType() == IResource.FILE)
                    selectedResource = selectedResource.getParent();

                // This gives us a directory...
                if (selectedResource instanceof IFolder || selectedResource instanceof IProject) {
                    // Set this for the container.
                    this.newFileCreationPage.setContainerFullPath(selectedResource.getFullPath());
                    // Make up a unique new name here.
                    String defaultModelBaseFilename = XDDEditorPlugin.INSTANCE
                            .getString("_UI_XDDEditorFilenameDefaultBase");
                    String defaultModelFilenameExtension = XDDModelWizard.FILE_EXTENSIONS.get(0);
                    String modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension;
                    for (int i = 1; ((IContainer) selectedResource).findMember(modelFilename) != null; ++i)
                        modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension;
                    this.newFileCreationPage.setFileName(modelFilename);
                }
            }
        }

        // ----------Changes of addPages method start here--------------\\
        // Add own pages instead of generated ones.
        this.wizardTemplatePage = new WizardTemplatePage("wizardTemplatePage");
        this.addPage(this.wizardTemplatePage);

        this.wizardConfigurationPage1 = new WizardConfigurationPage1("wizardConfigurationPage1", this);
        this.addPage(this.wizardConfigurationPage1);



    }



    @Override
    public boolean canFinish() {

        if (!wizardConfigurationPage1.isPageComplete()) {
            return false;
        }

        return true;
    }

    /**
     * @return Instance of XDDModelWizardNewFileCreationPage.
     */
    public XDDModelWizardNewFileCreationPage getNewFileCreationPage() {
        return this.newFileCreationPage;
    }

    /**
     * @return The WizardTemplatePage instance.
     */
    public WizardTemplatePage getWizardTemplatePage() {
        return this.wizardTemplatePage;
    }

    /**
     * @see XDDModelWizard#performFinish()
     */
    @Override
    public boolean performFinish() {
        try {
            if (newFileCreationPage != null) {
                final IFile modelFile = this.newFileCreationPage.getModelFile();

                // Do the work within an operation.
                WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
                    @Override
                    protected void execute(IProgressMonitor progressMonitor) {
                        try {
                            // Create a resource set
                            ResourceSet resourceSet = new ResourceSetImpl();

                            // Get the URI of the model file.
                            URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);

                            // Create a resource for this file.
                            Resource resource = resourceSet.createResource(fileURI);

                            // Add the initial model object to the contents.
                            EObject rootObject = CustomXDDWizard.this.createInitialModel();
                            if (rootObject != null)
                                resource.getContents().add(rootObject);

                            // Save the contents of the resource to the file
                            // system.
                            Map<Object, Object> options = new HashMap<Object, Object>();
                            options.put(XMLResource.OPTION_ENCODING, "UTF-8");
                            resource.save(options);
                        } catch (Exception exception) { // Code was copied from
                                                        // generated class
                            XDDEditorPlugin.INSTANCE.log(exception);
                        } finally {
                            progressMonitor.done();
                        }
                    }
                };

                this.getContainer().run(false, false, operation);

                // Select the new file resource in the current view.
                IWorkbenchWindow workbenchWindow = this.workbench.getActiveWorkbenchWindow();
                IWorkbenchPage page = workbenchWindow.getActivePage();
                final IWorkbenchPart activePart = page.getActivePart();
                if (activePart instanceof ISetSelectionTarget) {
                    final ISelection targetSelection = new StructuredSelection(modelFile);
                    this.getShell().getDisplay().asyncExec(new Runnable() { // NOPMD
                                                                            // by
                                                                            // lueckengaj
                                                                            // on
                                                                            // 29.03.13
                                                                            // 11:26
                        @Override
                        public void run() {
                            ((ISetSelectionTarget) activePart).selectReveal(targetSelection);
                        }

                    });
                }

                // Open an editor on the new file.
                try {
                    page.openEditor(new FileEditorInput(modelFile), this.workbench.getEditorRegistry()
                            .getDefaultEditor(modelFile.getFullPath().toString()).getId());
                } catch (PartInitException exception) {
                    MessageDialog.openError(workbenchWindow.getShell(),
                            XDDEditorPlugin.INSTANCE.getString("_UI_OpenEditorError_label"), exception.getMessage());
                    return false;
                }
                return true;
            }
        } catch (Exception exception) { // Code was copied from generated class
            XDDEditorPlugin.INSTANCE.log(exception);
            return false;
        }
        return false;
    }

    /**
     * @brief Instantiates the initalModelLoader and creates a new XDD Model.
     * @see XDDModelWizard#createInitialModel
     */
    @Override
    protected EObject createInitialModel() {
        DocumentRoot root = ModelLoader.createXDDFromWizardData(this.wizardTemplatePage, this.wizardConfigurationPage1);
        return root;
    }

} // CustomXDDWizard
