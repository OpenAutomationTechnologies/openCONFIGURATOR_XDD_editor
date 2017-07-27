package com.br_automation.buoat.xddeditor.editor.editors;



import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
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

/**
 * IndustrialNetworkProjectEditor class provides the multi-tab based form editor
 * to configure the openCONFIGURATOR project
 *
 * This editor is the main UI opened once the project.xml is double clicked from
 * the project explorer.
 *
 * Additionally this opens the {@link IndustrialNetworkView}.
 *
 * @author Ramakrishnan P
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
    private static final String PROJECT_EDITOR_PAGE_NAME = "POWERLINK Project";
    private static final String PROJECT_EDITOR_CREATION_ERROR_MESSAGE = "Error creating project editor overview page.";
    private static final String PROJECT_SOURCE_PAGE_NAME = "Source";
    private static final String PROJECT_SOURCE_PAGE_CREATION_ERROR_MESSAGE = "Error creating nested XML editor.";
    private static final String MARSHALL_ERROR = "Error marshalling the openCONFIGURATOR project.";
    private static final String UNMARSHALL_ERROR = "Error unmarshalling the openCONFIGURATOR project.";
    private static final String INVALID_INPUT_ERROR = "Invalid input: Must be a valid openCONFIGURATOR project file.";

    /**
     * Network identifier for the editor.
     */
    private String networkId;

    /**
     * Eclipse project instance linked with this editor.
     */
    private IProject activeProject;

    /**
     * openCONFIGURATOR project XML instance linked with this editor.
     */
    private IFile projectFile;

 
    /**
     * Flag to check for the library initialization
     */
    private boolean initSuccessful = false;

   
    /**
     * Advanced project editor page.
     */
    private DeviceDescriptionFileEditorPage editorPage;

    /**
     * XDC import of node
     */
    private Job importNodeXdcJob;

    /**
     * Upgrade project version
     */
    private boolean upgradeFlag;

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
     * @see IndustrialNetworkProjectSourcePage
     * @see DeviceDescriptionFileEditorPage
     */
    @Override
    protected void addPages() {

        createDeviceDescriptionFileEditor();
        createObjectDictionaryEditorPage();
        createDeviceDescriptionFileEditor();

        this.setActivePage(editorPage.getId());

       

        // If upgraded - update the source page and the file contents from
        // the model.
        if (upgradeFlag) {
            
        }
    }

    /**
     * Closes the all the pages added this editor.
     */
    private void closeEditor() {
        // Run in a separate thread.
        Display.getDefault().asyncExec(new Runnable() {
            @Override
            public void run() {

                IWorkbenchPage[] pages = DeviceDescriptionFileEditor.this
                        .getSite().getWorkbenchWindow().getPages();
                for (IWorkbenchPage editorPage : pages) {
                    IEditorPart editorPart = editorPage
                            .findEditor(getEditorInput());
                    editorPage.closeEditor(editorPart, true);
                }
            }
        });
    }

    /**
     * Creates the POWERLNK project editor page
     *
     * @see DeviceDescriptionFileEditorPage
     */
    private void createDeviceDescriptionFileEditor() {

        try {
        	        	
           editorPage = new DeviceDescriptionFileEditorPage(this,
                   getTitle());
            int index = this.addPage(editorPage, getEditorInput());
            setPageText(index,
                    DeviceDescriptionFileEditor.PROJECT_EDITOR_PAGE_NAME);
            editorPage.setIndex(index);

        } catch (PartInitException e) {
            ErrorDialog.openError(getSite().getShell(), null,
                    DeviceDescriptionFileEditor.PROJECT_EDITOR_CREATION_ERROR_MESSAGE,
                    e.getStatus());
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
        	        	
           objectEditorPage = new ObjectDictionaryEditorPage(this,
                   getTitle());
            int index = this.addPage(objectEditorPage, getEditorInput());
            setPageText(index,
                    DeviceDescriptionFileEditor.PROJECT_EDITOR_PAGE_NAME);
            objectEditorPage.setIndex(index);

        } catch (PartInitException e) {
            ErrorDialog.openError(getSite().getShell(), null,
                    DeviceDescriptionFileEditor.PROJECT_EDITOR_CREATION_ERROR_MESSAGE,
                    e.getStatus());
            e.printStackTrace();
        }
    }

   

    /**
     * Disposes the project editor UI.
     */
    @Override
    public void dispose() {
        if (initSuccessful) {

            Display.getDefault().syncExec(new Runnable() {
                @Override
                public void run() {
                    if (importNodeXdcJob != null) {
                        importNodeXdcJob.cancel();
                        try {
                            importNodeXdcJob.join();
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                }
            });

           
            
        }
        ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
        super.dispose();
    }

    /**
     * Saves the multi-page editor's changes.
     */
    @Override
    public void doSave(IProgressMonitor monitor) {
        upgradeFlag = false;
        editorPage.doSave(monitor);
        
    }

    @Override
    public void doSaveAs() {
        // TODO Auto-generated method stub
    }

      
    /**
     *
     * @return the instance of xdc import job
     */
    public Job getimportnode() {
        return importNodeXdcJob;
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
     * @param marker Marker details
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

    /**
     * Initializes the project editor
     *
     * The <code>IndustrialNetworkProjectEditor</code> implementation of this
     * method checks that the input is an instance of
     * <code>IFileEditorInput</code>.
     */
    @Override
    public void init(IEditorSite site, IEditorInput editorInput)
            throws PartInitException {
        if (!(editorInput instanceof IFileEditorInput)) {
            throw new PartInitException(
                    DeviceDescriptionFileEditor.INVALID_INPUT_ERROR);
        }
        super.init(site, editorInput);

        IFileEditorInput input = (IFileEditorInput) editorInput;
        projectFile = input.getFile();
        setPartName(projectFile.getName());

        activeProject = projectFile.getProject();
        networkId = activeProject.getName();

        try {
            activeProject.refreshLocal(IResource.DEPTH_INFINITE,
                    new NullProgressMonitor());
        } catch (CoreException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Validate the input with openCONFIGURATOR project file schema.
      

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

//        if ((getActivePage() == sourcePage.getIndex()) && (isDirty())) {
//            
//        }

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

        IResourceDelta oldDelta = delta
                .findMember(currentProjectFile.getFullPath());
        if (oldDelta == null) {
            return;
        }

        switch (oldDelta.getKind()) {
            case IResourceDelta.REMOVED:
                if ((oldDelta.getFlags() & IResourceDelta.MOVED_TO) != 0) {
                    IPath newPath = oldDelta.getMovedToPath();
                    final IFile newfile = ResourcesPlugin.getWorkspace()
                            .getRoot().getFile(newPath);
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
