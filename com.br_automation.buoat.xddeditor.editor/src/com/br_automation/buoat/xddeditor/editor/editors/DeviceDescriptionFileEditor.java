/*******************************************************************************
 * @file   DeviceDescriptionFileEditor.java
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

package com.br_automation.buoat.xddeditor.editor.editors;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.IFormPage;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.texteditor.IDocumentProvider;

import org.xml.sax.SAXException;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileContainerType;
import com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileType;
import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;
import com.br_automation.buoat.xddeditor.XDD.custom.ModelLoader;
import com.br_automation.buoat.xddeditor.XDD.custom.XDDUtilities;

/**
 * DeviceDescriptionFileEditor class provides the multi-tab based form editor to
 * configure the device description file
 *
 * This editor is the main UI opened once the XDD/XDC is double clicked from the
 * project explorer.
 *
 *
 * @author Sree Hari Vignesh B
 *
 */
public final class DeviceDescriptionFileEditor extends FormEditor
        implements IResourceChangeListener, IPropertyChangeListener {

    /**
     * Identifier for this page.
     */
    public static final String ID = "com.br_automation.buoat.xddeditor.editor.XDD";

    /**
     * Editor strings and messages.
     */
    private static final String OVERVIEW_EDITOR_PAGE_NAME = "Overview";
    private static final String OBJECT_DICTIONARY_EDITOR_PAGE_NAME = "Object Dictionary";
    private static final String NETWORK_MANAGEMENT_EDITOR_PAGE_NAME = "Network Management";
    private static final String PROJECT_EDITOR_CREATION_ERROR_MESSAGE = "Error creating project editor overview page.";
    private static final String INVALID_INPUT_ERROR = "Invalid input: Must be a valid openCONFIGURATOR project file.";

    /**
     * Eclipse project instance linked with this editor.
     */
    private IProject activeProject;

    /**
     * openCONFIGURATOR project XML instance linked with this editor.
     */
    private IFile projectFile;

    /**
     * Overview editor page.
     */
    private DeviceDescriptionFileEditorPage editorPage;

    /**
     * Network management editor page.
     */
    private NetworkManagementEditorPage ntwrkMgmteditorPage;

    /**
     * Constructor
     */
    public DeviceDescriptionFileEditor() {
        super();
        ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
    }

    /**
     * Adds an editor page and source page for the project editor.
     *
     * @see ObjectDictionaryEditorPage
     * @see DeviceDescriptionFileEditorPage
     * @see NetworkManagementEditorPage
     */
    @Override
    protected void addPages() {

        createDeviceDescriptionFileEditor();
        createNetworkManagementFileEditor();
        createObjectDictionaryEditorPage();

        this.setActivePage(editorPage.getId());
    }

    /**
     * Closes the all the pages added this editor.
     */
    private void closeEditor() {
        // Run in a separate thread.
        Display.getDefault().asyncExec(new Runnable() {
            @Override
            public void run() {

                IWorkbenchPage[] pages = DeviceDescriptionFileEditor.this.getSite().getWorkbenchWindow().getPages();
                for (IWorkbenchPage editorPage : pages) {
                    IEditorPart editorPart = editorPage.findEditor(getEditorInput());
                    editorPage.closeEditor(editorPart, true);
                }
            }
        });
    }

    /**
     * Creates the Description file editor page
     *
     * @see DeviceDescriptionFileEditorPage
     */
    private void createDeviceDescriptionFileEditor() {

        try {

            editorPage = new DeviceDescriptionFileEditorPage(this, getTitle(), getDocumentRoot());
            int index = this.addPage(editorPage, getEditorInput());
            setPageText(index, DeviceDescriptionFileEditor.OVERVIEW_EDITOR_PAGE_NAME);
            editorPage.setIndex(index);

        } catch (PartInitException e) {
            ErrorDialog.openError(getSite().getShell(), null,
                    DeviceDescriptionFileEditor.PROJECT_EDITOR_CREATION_ERROR_MESSAGE, e.getStatus());
            e.printStackTrace();
        }
    }

    /**
     * Creates the NetworkManagement editor page
     *
     * @see NetworkManagementEditorPage
     */
    private void createNetworkManagementFileEditor() {

        try {

            ntwrkMgmteditorPage = new NetworkManagementEditorPage(this, getTitle(), getDocumentRoot());
            int index = this.addPage(ntwrkMgmteditorPage, getEditorInput());
            setPageText(index, DeviceDescriptionFileEditor.NETWORK_MANAGEMENT_EDITOR_PAGE_NAME);
            ntwrkMgmteditorPage.setIndex(index);

        } catch (PartInitException e) {
            ErrorDialog.openError(getSite().getShell(), null,
                    DeviceDescriptionFileEditor.PROJECT_EDITOR_CREATION_ERROR_MESSAGE, e.getStatus());
            e.printStackTrace();
        }
    }

    private ObjectDictionaryEditorPage objectEditorPage;

    /**
     * Creates the Object dictionary editor page
     *
     * @see ObjectDictionaryEditorPage
     */
    private void createObjectDictionaryEditorPage() {

        try {

            objectEditorPage = new ObjectDictionaryEditorPage(this, getTitle(), getDocumentRoot());
            int index = this.addPage(objectEditorPage, getEditorInput());
            setPageText(index, DeviceDescriptionFileEditor.OBJECT_DICTIONARY_EDITOR_PAGE_NAME);
            objectEditorPage.setIndex(index);

        } catch (PartInitException e) {
            ErrorDialog.openError(getSite().getShell(), null,
                    DeviceDescriptionFileEditor.PROJECT_EDITOR_CREATION_ERROR_MESSAGE, e.getStatus());
            e.printStackTrace();
        }
    }

    /**
     * Disposes the description file editor UI.
     */
    @Override
    public void dispose() {
        ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
        super.dispose();
    }

    /**
     * Saves the multi-page editor's changes.
     */
    @Override
    public void doSave(IProgressMonitor monitor) {
        editorPage.doSave(monitor);

    }

    @Override
    public void doSaveAs() {
        // TODO Auto-generated method stub
    }

    /**
     * @return The IFile instance of the openCONFIGURATOR project XML file.
     */
    public IFile getProjectFile() {
        return projectFile;
    }

    /**
     * Marks the content in the project editor source page based on the marker.
     *
     * @param marker
     *            Marker details
     */
    public void gotoMarker(IMarker marker) {
        this.setActivePage(0);
        IDE.gotoMarker(getEditor(0), marker);
    }

    /**
     * Handles the property change signals.
     */
    @Override
    protected void handlePropertyChange(int propertyId) {
        super.handlePropertyChange(propertyId);
    }

    public DocumentRoot getDocumentRoot() {
        java.net.URI uri = projectFile.getLocationURI();
        DocumentRoot root = null;
        try {
            URL url = uri.toURL();
            root = XDDUtilities.loadXDD(url);

        } catch (MalformedURLException e1) {
            e1.printStackTrace();
        }
        return root;
    }

    /**
     * Initializes the project editor
     *
     * The <code>IndustrialNetworkProjectEditor</code> implementation of this
     * method checks that the input is an instance of
     * <code>IFileEditorInput</code>.
     */
    @Override
    public void init(IEditorSite site, IEditorInput editorInput) throws PartInitException {
        if (!(editorInput instanceof IFileEditorInput)) {
            throw new PartInitException(DeviceDescriptionFileEditor.INVALID_INPUT_ERROR);
        }
        super.init(site, editorInput);

        IFileEditorInput input = (IFileEditorInput) editorInput;
        projectFile = input.getFile();
        setPartName(projectFile.getName());

        activeProject = projectFile.getProject();

        try {
            activeProject.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
        } catch (CoreException e) {
            e.printStackTrace();
        }

        System.out.println("activeProject- path" + activeProject.getLocation());

    }

    /**
     * Returns false as saveAs is not supported for this editor.
     */
    @Override
    public boolean isSaveAsAllowed() {
        return false;
    }

    /**
     * Reloads the contents of pages when the it is activated.
     */
    @Override
    protected void pageChange(int newPageIndex) {

        // switch page
        super.pageChange(newPageIndex);

        // update page if needed
        final IFormPage page = getActivePageInstance();

    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        // TODO Auto-generated method stub
    }

    /**
     * Handles the project change events.
     */
    @Override
    public void resourceChanged(final IResourceChangeEvent event) {

        switch (event.getType()) {
        case IResourceChangeEvent.POST_CHANGE:
            break;
        case IResourceChangeEvent.PRE_CLOSE:
        case IResourceChangeEvent.PRE_DELETE: // Fallthrough

            break;
        case IResourceChangeEvent.PRE_BUILD:
            break;
        case IResourceChangeEvent.POST_BUILD:
            break;
        case IResourceChangeEvent.PRE_REFRESH:
            break;
        default:
            break;
        }

        // Handle project file delete and rename events
        IResourceDelta delta = event.getDelta();
        if (delta == null) {
            return;
        }

        IFileEditorInput input = (IFileEditorInput) getEditorInput();
        if (input == null) {
            return;
        }

        // Project file is not present, so close all the editor pages.
        IFile currentProjectFile = input.getFile();
        if (currentProjectFile == null) {
            closeEditor();
            return;
        }

        IResourceDelta oldDelta = delta.findMember(currentProjectFile.getFullPath());
        if (oldDelta == null) {
            return;
        }

        switch (oldDelta.getKind()) {
        case IResourceDelta.REMOVED:
            if ((oldDelta.getFlags() & IResourceDelta.MOVED_TO) != 0) {
                IPath newPath = oldDelta.getMovedToPath();
                final IFile newfile = ResourcesPlugin.getWorkspace().getRoot().getFile(newPath);
                if (newfile != null) {
                    setInput(new FileEditorInput(newfile));

                    if (newfile.getName() != null) {
                        Display.getDefault().asyncExec(new Runnable() {
                            @Override
                            public void run() {
                                setPartName(newfile.getName());
                            }
                        });
                    }
                }
            } else if (oldDelta.getFlags() == 0) {
                closeEditor();
            }
            break;
        case IResourceDelta.CHANGED:
            if (oldDelta.getFlags() == IResourceDelta.CONTENT) {
                setInput(new FileEditorInput(currentProjectFile));
                Display.getDefault().asyncExec(new Runnable() {
                    @Override
                    public void run() {

                    }
                });

            }

            break;
        default:
            break;
        }
    }

}