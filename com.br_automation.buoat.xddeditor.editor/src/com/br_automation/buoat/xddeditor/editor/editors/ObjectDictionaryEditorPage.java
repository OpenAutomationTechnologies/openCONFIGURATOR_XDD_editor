/*******************************************************************************
 * @file   ObjectDictionaryEditorPage.java
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

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.DatatypeConverter;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.forms.DetailsPart;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IDetailsPageProvider;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.MasterDetailsBlock;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapLayout;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileType;
import com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType;
import com.br_automation.buoat.xddeditor.XDD.SubObjectType;
import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.TObjectPDOMapping;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;
import com.br_automation.buoat.xddeditor.XDD.custom.EPLGeneralConstants;
import com.br_automation.buoat.xddeditor.XDD.custom.TObjectComparator;
import com.br_automation.buoat.xddeditor.XDD.custom.XDDUtilities;
import com.br_automation.buoat.xddeditor.XDD.custom.propertypages.filters.Index1000Filter;
import com.br_automation.buoat.xddeditor.XDD.custom.propertypages.filters.Index1F80Filter;
import com.br_automation.buoat.xddeditor.XDD.custom.propertypages.filters.Index1F82Filter;
import com.br_automation.buoat.xddeditor.XDD.custom.propertypages.filters.MappingSubobjectsFilter;
import com.br_automation.buoat.xddeditor.XDD.custom.propertypages.filters.StoreParamSubobjectsFilter;
import com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyCommunicationNetworkPowerlinkImpl;
import com.br_automation.buoat.xddeditor.XDD.impl.SubObjectTypeImpl;
import com.br_automation.buoat.xddeditor.XDD.impl.TApplicationLayersImpl;
import com.br_automation.buoat.xddeditor.XDD.impl.TObjectImpl;
import com.br_automation.buoat.xddeditor.XDD.resources.IPluginImages;
import com.br_automation.buoat.xddeditor.XDD.resources.IPowerlinkConstants;
import com.br_automation.buoat.xddeditor.XDD.wizards.NewObjectWizard;
import com.br_automation.buoat.xddeditor.XDD.wizards.NewSubObjectWizard;
import com.br_automation.buoat.xddeditor.editor.adapters.AbstractObjectPropertySource;

/**
 * The editor page to manipulate the object dictionary of device description
 * file.
 *
 * @author Sree Hari Vignesh
 *
 */
public class ObjectDictionaryEditorPage extends FormPage implements IPropertyListener {

    /** Identifier */
    private static final String ID = "com.buoat.xddeditor.editors.objectDictionaryEditorPage";

    private static final String OBJECT_DICTIONARY_HEADING = "Object Dictionary";
    public static final String OBJECT_DICTIONARY_DETAILS_HEADING = "Object Details";
    public static final String SUB_OBJECT_DICTIONARY_DETAILS_HEADING = "Sub-Object Details";

    private static final String ADD_OBJECT_BUTTON_LABEL = "Add Object...";
    private static final String ADD_SUB_OBJECT_BUTTON_LABEL = "Add Sub-Object...";
    private static final String REMOVE_BUTTON_LABEL = "Remove";

    private static final String FORM_EDITOR_PAGE_TITLE = "POWERLINK Device Description Editor";

    /**
     * Form size
     */
    private static final int FORM_BODY_MARGIN_TOP = 12;
    private static final int FORM_BODY_MARGIN_BOTTOM = 12;
    private static final int FORM_BODY_MARGIN_LEFT = 6;
    private static final int FORM_BODY_MARGIN_RIGHT = 6;
    private static final int FORM_BODY_HORIZONTAL_SPACING = 20;
    private static final int FORM_BODY_VERTICAL_SPACING = 17;
    private static final int FORM_BODY_NUMBER_OF_COLUMNS = 2;

    public static final String OBJECT_PROPERTIES = "Properties";

    /**
     * Source workbench part.
     */
    private IWorkbenchPart sourcePart;

    /**
     * Listener instance to listen to the changes in the source part.
     */
    private PartListener partListener = new PartListener();

    private FilteredTree filteredTree;

    private TObjectImpl selectedObject;
    private SubObjectTypeImpl selectedSubObject;

    private TObjectImpl object;

    private Action hideCommunicationProfileObjects;
    private Action hideStandardisedDeviceProfileObjects;
    private Action hideNonMappableObjects;
    private Action hideUserDefinedObjects;
    private Action propertiesAction;
    private Set<TObjectPDOMapping> validTpdoTObjectMapping;
    private Set<TObjectPDOMapping> validRpdoTObjectMapping;

    private boolean communicationProfileObjectsVisible = true;
    private boolean standardisedDeviceProfileObjectsVisible = true;
    private boolean nonMappableObjectsVisible = true;
    private boolean userdefinedObjectsVisisble = true;

    public static final String HIDE_NON_MAPPABLE_OBJECTS = "Hide Non Mappable Objects";

    public static final String HIDE_COMMUNICATION_PROFILE_AREA_OBJECTS = "Hide Communication Profile Area Objects(0x1000-0x1FFF)";
    public static final String HIDE_STANDARDISED_DEVICE_PROFILE_AREA_OBJECTS = "Hide Standardised Device Profile Area Objects(0x6000-0x9FFF)";
    public static final String HIDE_USER_DEFINED_OBJECTS = "Hide User Defined Objects(0x2000-0x5FFF)";
    public static final String HIDE_NON_FORCED_OBJECTS = "Hide NonForced Objects";

    /**
     * Editor dirty flag for this page.
     */
    private boolean dirty = false;

    /**
     * Scrolled form.
     */
    private ScrolledForm form;

    private DocumentRoot docRoot;

    private TreeViewer listViewer;

    /**
     * Toolkit for the form editor.
     */
    private FormToolkit toolkit;
    private DeviceDescriptionFileEditor editor;

    private Button addObjectButton;
    private Button addSubObjectButton;
    private Button removeButton;

    private Section objectDictionarySection;

    /**
     * Constructor to instantiate object dictionary editor.
     *
     * @param editor
     *            Instance of form page editor
     * @param title
     *            Name of editor page
     * @param docRoot
     *            Instance of XDD/XDC document
     */
    public ObjectDictionaryEditorPage(DeviceDescriptionFileEditor editor, final String title, DocumentRoot docRoot) {
        super(editor, ObjectDictionaryEditorPage.ID, title);
        this.editor = editor;
        this.docRoot = docRoot;
    }

    /**
     * Create contents of the form.
     *
     * @param managedForm
     *            The instance of the form
     */
    @Override
    protected void createFormContent(final IManagedForm managedForm) {
        toolkit = managedForm.getToolkit();
        form = managedForm.getForm();
        form.setText(ObjectDictionaryEditorPage.FORM_EDITOR_PAGE_TITLE);
        Composite body = form.getBody();
        toolkit.decorateFormHeading(form.getForm());
        toolkit.paintBordersFor(body);
        managedForm.setInput(getEditorInput());

        TableWrapLayout layout = new TableWrapLayout();
        layout.topMargin = ObjectDictionaryEditorPage.FORM_BODY_MARGIN_TOP;
        layout.bottomMargin = ObjectDictionaryEditorPage.FORM_BODY_MARGIN_BOTTOM;
        layout.leftMargin = ObjectDictionaryEditorPage.FORM_BODY_MARGIN_LEFT;
        layout.rightMargin = ObjectDictionaryEditorPage.FORM_BODY_MARGIN_RIGHT;
        layout.horizontalSpacing = ObjectDictionaryEditorPage.FORM_BODY_HORIZONTAL_SPACING;
        layout.verticalSpacing = ObjectDictionaryEditorPage.FORM_BODY_VERTICAL_SPACING;
        layout.makeColumnsEqualWidth = true;
        layout.numColumns = ObjectDictionaryEditorPage.FORM_BODY_NUMBER_OF_COLUMNS;
        body.setLayout(layout);

        ObjectDictionaryBlock masterDetailsBlock = new ObjectDictionaryBlock();
        masterDetailsBlock.createContent(managedForm);

    }

    /**
     * Class to list the details of objects and sub-objects in the list viewer
     *
     * @author Sree Hari Vignesh
     *
     */
    public class ObjectDictionaryBlock extends MasterDetailsBlock implements IDetailsPageProvider, IPropertyListener {

        private static final String OBJECT_INDEX_1F82 = "1F82";
        private static final String OBJECT_INDEX_1F80 = "1F80";
        private static final String OBJECT_INDEX_1000 = "1000";

        private SubObjectTypeImpl subObject;
        private TObjectImpl index1000Object;
        private TObjectImpl index1F80Object;
        private TObjectImpl index1F82Object;

        @Override
        protected void createMasterPart(IManagedForm managedForm, Composite parent) {
            createActions();
            createObjectDictionarySection(managedForm, parent);

        }

        @Override
        protected void registerPages(DetailsPart detailsPart) {

            detailsPart.setPageProvider(this);

        }

        @Override
        protected void createToolBarActions(IManagedForm managedForm) {

        }

        @Override
        public Object getPageKey(Object object) {

            if (object instanceof TObjectImpl) {
                TObjectImpl obj = (TObjectImpl) object;
                String index = DatatypeConverter.printHexBinary(obj.getIndex());

                if (index.equalsIgnoreCase(OBJECT_INDEX_1F82)) {
                    index1F82Object = obj;
                    return Index1F82Filter.class;
                }

                if (index.equalsIgnoreCase(OBJECT_INDEX_1F80)) {
                    index1F80Object = obj;
                    return Index1F80Filter.class;
                }

                if (index.equalsIgnoreCase(OBJECT_INDEX_1000)) {
                    index1000Object = obj;
                    return Index1000Filter.class;
                }
                return TObjectImpl.class;
            }
            if (object instanceof SubObjectTypeImpl) {
                SubObjectTypeImpl subObject = (SubObjectTypeImpl) object;
                TObject parentObject = (TObject) subObject.eContainer();
                if (parentObject.getIndex() != null) {
                    int objectIndex = new BigInteger(1, parentObject.getIndex()).intValue();
                    if ((objectIndex >= EPLGeneralConstants.PDO_RX_MAPP_PARAM_MIN
                            && objectIndex <= EPLGeneralConstants.PDO_RX_MAPP_PARAM_MAX)
                            || (objectIndex >= EPLGeneralConstants.PDO_TX_COMM_PARAM_MIN
                                    && objectIndex <= EPLGeneralConstants.PDO_TX_COMM_PARAM_MAX)) {
                        if (subObject.getSubIndex() != null) {
                            this.subObject = subObject;
                            return MappingSubobjectsFilter.class;
                        } // This statement ignores NumberOfEntries object
                    }
                }

                if (parentObject.getIndex() != null) {
                    if (new BigInteger(1, parentObject.getIndex())
                            .intValue() == EPLGeneralConstants.NMT_STOREPARAM_REC) {
                        if (subObject.getSubIndex() == null || subObject.getSubIndex().length == 0)
                            return true;
                        this.subObject = subObject;
                        return StoreParamSubobjectsFilter.class;
                    }
                }

                return SubObjectTypeImpl.class;
            }
            return null;
        }

        @Override
        public IDetailsPage getPage(Object key) {

            if (key.equals(TObjectImpl.class)) {

                return new ObjectDetailsPage();

            } else if (key.equals(Index1F82Filter.class)) {
                return new Index1F82DetailsPage(index1F82Object, docRoot, editor);
            } else if (key.equals(Index1F80Filter.class)) {
                return new Index1F80DetailsPage(index1F80Object, docRoot, editor);
            } else if (key.equals(Index1000Filter.class)) {
                return new Index1000DetailsPage(index1000Object, docRoot, editor);
            } else if (key.equals(SubObjectTypeImpl.class)) {
                return new SubObjectDetailsPage();
            } else if (key.equals(MappingSubobjectsFilter.class)) {
                return new MappingObjectDetailsPage(subObject, docRoot, editor);
            } else if (key.equals(StoreParamSubobjectsFilter.class)) {
                return new StoreParamSubObjectDetailsPage(subObject, docRoot, editor);
            }
            return null;
        }

        @Override
        public void propertyChanged(Object source, int propId) {
            // TODO Auto-generated method stub

        }

    }

    /**
     * PatternFilter class to always show sub-objects after filtering of objects.
     *
     * @author Sree Hari Vignesh
     */
    private static class PowerlinkObjectPatternFilter extends PatternFilter {

        @Override
        public Object[] filter(Viewer viewer, Object parent, Object[] elements) {
            ArrayList<Object> objList = new ArrayList<>();

            // Display sub-object after filtering of objects.
            if (parent instanceof TObject) {
                TObject obj = (TObject) parent;
                EList<SubObjectType> subObj = obj.getSubObject();
                objList.addAll(subObj);
            } else {
                Collections.addAll(objList, super.filter(viewer, parent, elements));
            }

            return objList.toArray();
        }

    }

    /**
     * Content provider to list the objects and sub-objects in XDD/XDC file
     *
     * @author Sree Hari Vignesh
     *
     */
    private class ObjectDictionaryContentProvider implements ITreeContentProvider {

        public ObjectDictionaryContentProvider() {
        }

        @Override
        public void dispose() {
        }

        @Override
        public Object[] getChildren(Object parentElement) {
            if (parentElement instanceof TObject) {
                TObject objItem = (TObject) parentElement;
                return objItem.getSubObject().toArray();
            }
            return new Object[0];
        }

        @Override
        public Object[] getElements(Object inputElement) {

            if (inputElement instanceof EClass) {
                EClass obj = (EClass) inputElement;
                List<TObject> tObjects = XDDUtilities.findEObjects(docRoot, obj);
                tObjects.sort(new TObjectComparator());
                return tObjects.toArray();
            }

            return new Object[0];
        }

        @Override
        public Object getParent(Object element) {
            return null;
        }

        @Override
        public boolean hasChildren(Object element) {
            if (element instanceof TObject) {
                TObject object = (TObject) element;
                return ((object.getSubObject().size() > 0) ? true : false);
            }
            return false;
        }

        @Override
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        }
    }

    /**
     * Label provider for the objects and sub-objects.
     *
     * @author Sree Hari Vignesh B
     *
     */
    private static class ObjectDictionaryLabelProvider extends LabelProvider {

        org.eclipse.swt.graphics.Image objectIcon;
        org.eclipse.swt.graphics.Image subObjectIcon;

        public ObjectDictionaryLabelProvider() {
            objectIcon = AbstractUIPlugin
                    .imageDescriptorFromPlugin("com.br_automation.buoat.xddeditor.editor", IPluginImages.OBJECT_ICON)
                    .createImage();
            subObjectIcon = AbstractUIPlugin.imageDescriptorFromPlugin("com.br_automation.buoat.xddeditor.editor",
                    IPluginImages.SUB_OBJECT_ICON).createImage();

        }

        @Override
        public void dispose() {
            objectIcon.dispose();
            subObjectIcon.dispose();
        }

        @Override
        public org.eclipse.swt.graphics.Image getImage(Object obj) {
            if (obj instanceof TObject) {

                return objectIcon;
            } else if (obj instanceof SubObjectType) {

                return subObjectIcon;
            }
            return null;
        }

        @Override
        public String getText(Object element) {
            if (element instanceof TObject) {
                TObject obj = (TObject) element;
                if (obj.getIndex() != null) {
                    String objIndex = getIndex(obj.getIndex());
                    return obj.getName() + " (0x" + objIndex + ")";
                }
            } else if (element instanceof SubObjectType) {
                SubObjectType subObj = (SubObjectType) element;
                if (subObj.getSubIndex() != null) {
                    String subObjIndex = getIndex(subObj.getSubIndex());
                    return subObj.getName() + " (0x" + subObjIndex + ")";
                }
            }
            return "";
        }
    }

    private static String getIndex(byte[] index) {
        String objectIdRaw = DatatypeConverter.printHexBinary(index);
        return objectIdRaw;

    }

    /**
     * @return Instance of object dictionary list viewer
     */
    public TreeViewer getViewer() {
        return listViewer;
    }

    private class PartListener implements IPartListener {
        @Override
        public void partActivated(IWorkbenchPart part) {
        }

        @Override
        public void partBroughtToTop(IWorkbenchPart part) {
        }

        @Override
        public void partClosed(IWorkbenchPart part) {
            if (sourcePart == part) {
                if (sourcePart != null) {
                    sourcePart.getSite().getPage().removePartListener(partListener);
                }
                sourcePart = null;
                if ((listViewer != null) && !listViewer.getControl().isDisposed()) {
                    listViewer.setInput(new Object[0]);
                }
            }
        }

        @Override
        public void partDeactivated(IWorkbenchPart part) {
        }

        @Override
        public void partOpened(IWorkbenchPart part) {
        }
    }

    @Override
    public void setFocus() {
        listViewer.getControl().setFocus();

    }

    /**
     * Creates the widgets and controls for the Object dictionary model.
     *
     * @param managedForm
     *            The parent form.
     * @param parent
     *            The parent composite.
     */
    private void createObjectDictionarySection(final IManagedForm managedForm, Composite parent) {

        FormToolkit toolKit = managedForm.getToolkit();

        TableWrapLayout layout = new TableWrapLayout();
        layout.topMargin = ObjectDictionaryEditorPage.FORM_BODY_MARGIN_TOP;
        layout.bottomMargin = ObjectDictionaryEditorPage.FORM_BODY_MARGIN_BOTTOM;
        layout.leftMargin = ObjectDictionaryEditorPage.FORM_BODY_MARGIN_LEFT;
        layout.rightMargin = ObjectDictionaryEditorPage.FORM_BODY_MARGIN_RIGHT;
        layout.horizontalSpacing = ObjectDictionaryEditorPage.FORM_BODY_HORIZONTAL_SPACING;
        layout.verticalSpacing = ObjectDictionaryEditorPage.FORM_BODY_VERTICAL_SPACING;
        layout.makeColumnsEqualWidth = true;
        layout.numColumns = FORM_BODY_NUMBER_OF_COLUMNS;
        parent.setLayout(layout);

        objectDictionarySection = toolKit.createSection(parent, ExpandableComposite.EXPANDED | Section.DESCRIPTION
                | ExpandableComposite.TWISTIE | ExpandableComposite.TITLE_BAR);
        managedForm.getToolkit().paintBordersFor(objectDictionarySection);
        objectDictionarySection.setText(ObjectDictionaryEditorPage.OBJECT_DICTIONARY_HEADING);

        if (toolkit != null) {
            Composite clientComposite = toolkit.createComposite(objectDictionarySection, SWT.WRAP);
            GridLayout layouts = new GridLayout(3, false);
            clientComposite.setLayout(layouts);
            toolkit.paintBordersFor(clientComposite);

            objectDictionarySection.setClient(clientComposite);

            Composite listComposite = toolkit.createComposite(clientComposite, SWT.WRAP);
            GridLayout listLayout = new GridLayout(1, false);
            listLayout.marginHeight = 10;
            listLayout.marginBottom = 10;
            listComposite.setLayout(listLayout);
            toolkit.paintBordersFor(listComposite);

            GridData pst = new GridData(SWT.TOP, SWT.TOP, false, false, 1, 1);
            pst.heightHint = 450;
            pst.widthHint = 350;

            Composite btnComposite = toolkit.createComposite(clientComposite, SWT.ON_TOP | SWT.TOP);
            GridLayout btnLayout = new GridLayout(1, false);
            btnLayout.marginHeight = 2;
            btnLayout.marginBottom = 2;
            btnComposite.setLayout(btnLayout);
            toolkit.paintBordersFor(btnComposite);

            PatternFilter filter = new PowerlinkObjectPatternFilter();
            filter.setIncludeLeadingWildcard(true);
            filteredTree = new FilteredTree(listComposite, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL, filter, true);
            listViewer = filteredTree.getViewer();
            Tree lst_no_foi = listViewer.getTree();

            lst_no_foi.setLayoutData(pst);

            listViewer.setContentProvider(new ObjectDictionaryContentProvider());
            listViewer.setLabelProvider(new ObjectDictionaryLabelProvider());
            listViewer.setInput(XDDPackage.eINSTANCE.getTObject());

            GridData btn = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
            btn.heightHint = 25;
            btn.widthHint = 150;

            addObjectButton = toolkit.createButton(btnComposite, ObjectDictionaryEditorPage.ADD_OBJECT_BUTTON_LABEL,
                    SWT.PUSH);
            addObjectButton.setLayoutData(btn);
            toolkit.adapt(addObjectButton, true, true);

            addSubObjectButton = toolkit.createButton(btnComposite,
                    ObjectDictionaryEditorPage.ADD_SUB_OBJECT_BUTTON_LABEL, SWT.PUSH);

            addSubObjectButton.setLayoutData(btn);
            toolkit.adapt(addSubObjectButton, true, true);
            addSubObjectButton.setEnabled(false);

            removeButton = toolkit.createButton(btnComposite, ObjectDictionaryEditorPage.REMOVE_BUTTON_LABEL, SWT.PUSH);
            removeButton.setLayoutData(btn);
            removeButton.setEnabled(false);
            toolkit.adapt(removeButton, true, true);

            new Label(btnComposite, SWT.NONE);
            new Label(btnComposite, SWT.NONE);
            new Label(btnComposite, SWT.NONE);
            new Label(btnComposite, SWT.NONE);
            new Label(btnComposite, SWT.NONE);
            new Label(btnComposite, SWT.NONE);
            new Label(btnComposite, SWT.NONE);
            new Label(btnComposite, SWT.NONE);
            new Label(btnComposite, SWT.NONE);
            new Label(btnComposite, SWT.NONE);
            new Label(btnComposite, SWT.NONE);
            new Label(btnComposite, SWT.NONE);
            new Label(btnComposite, SWT.NONE);
            new Label(btnComposite, SWT.NONE);
            new Label(btnComposite, SWT.NONE);
            new Label(btnComposite, SWT.NONE);
            new Label(btnComposite, SWT.NONE);

            final SectionPart spart = new SectionPart(objectDictionarySection);
            managedForm.addPart(spart);

            getSite().setSelectionProvider(listViewer);

            listViewer.addSelectionChangedListener(new ISelectionChangedListener() {

                @Override
                public void selectionChanged(SelectionChangedEvent event) {
                    IStructuredSelection sel = (IStructuredSelection) event.getSelection();
                    Object selectedElement = sel.getFirstElement();

                    if (listViewer == null) {
                        return;
                    }

                    if (sourcePart != null) {
                        sourcePart.getSite().getPage().removePartListener(partListener);
                        sourcePart = null;
                    }

                    if (selectedElement instanceof TObjectImpl) {
                        TObjectImpl obj = (TObjectImpl) selectedElement;
                        selectedObject = obj;
                        selectedSubObject = null;
                        AbstractObjectPropertySource objSource = new AbstractObjectPropertySource();
                        objSource.setEditor(editor);
                        String index = DatatypeConverter.printHexBinary(obj.getIndex());
                        addSubObjectButton.setEnabled(isSubObjectAdded(index, selectedObject));
                        removeButton.setEnabled(isObjectIndexValid(index));
                        IViewReference[] viewList = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
                                .getViewReferences();

                        boolean isPropertyAvailable = false;
                        for (IViewReference view : viewList) {
                            if (view.getPartName().equalsIgnoreCase("Properties")) {
                                isPropertyAvailable = true;
                            }
                        }

                        if (isPropertyAvailable) {
                            PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
                                    .findView(IPageLayout.ID_PROP_SHEET);
                        } else {
                            try {
                                PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
                                        .showView(IPageLayout.ID_PROP_SHEET);
                            } catch (PartInitException e) {
                                e.printStackTrace();
                            }
                        }

                    } else if (selectedElement instanceof SubObjectTypeImpl) {
                        SubObjectTypeImpl subObj = (SubObjectTypeImpl) selectedElement;
                        selectedObject = null;
                        selectedSubObject = subObj;
                        AbstractObjectPropertySource objSource = new AbstractObjectPropertySource();
                        objSource.setEditor(editor);
                        addSubObjectButton.setEnabled(false);
                        object = (TObjectImpl) subObj.eContainer();
                        String objIndex = DatatypeConverter.printHexBinary(object.getIndex());
                        if (isObjectIndexValid(objIndex)) {
                            removeButton.setEnabled(true);
                        }
                    }

                    managedForm.fireSelectionChanged(spart, event.getSelection());
                    if (sourcePart != null) {
                        sourcePart.getSite().getPage().addPartListener(partListener);
                    }
                }
            });

            listViewer.addFilter(new ViewerFilter() {

                @Override
                public boolean select(Viewer viewer, Object parentElement, Object element) {
                    try {
                        if (element instanceof TObjectImpl) {
                            TObjectImpl obj = (TObjectImpl) element;
                            byte[] index = obj.getIndex();
                            String indexValue = DatatypeConverter.printHexBinary(index);
                            Integer objectId = Integer.parseInt(indexValue, 16);
                            if (!communicationProfileObjectsVisible) {
                                if ((objectId >= IPowerlinkConstants.COMMUNICATION_PROFILE_START_INDEX)
                                        && (objectId < IPowerlinkConstants.MANUFACTURER_PROFILE_START_INDEX)) {
                                    return false;
                                }

                            }

                            if (!standardisedDeviceProfileObjectsVisible) {
                                if ((objectId >= IPowerlinkConstants.STANDARDISED_DEVICE_PROFILE_START_INDEX)
                                        && (objectId <= IPowerlinkConstants.STANDARDISED_DEVICE_PROFILE_END_INDEX)) {
                                    return false;
                                }
                            }

                            validRpdoTObjectMapping = XDDUtilities.getValidMappingTypes(TObjectPDOMapping.RPDO);

                            validTpdoTObjectMapping = XDDUtilities.getValidMappingTypes(TObjectPDOMapping.TPDO);

                            Map<Integer, SubObjectType> tpdoMappableSubObjects = XDDUtilities.getMappingSubObjects(obj,
                                    validTpdoTObjectMapping);
                            Map<Integer, SubObjectType> rpdoMappableSubObjects = XDDUtilities.getMappingSubObjects(obj,
                                    validRpdoTObjectMapping);

                            if (!nonMappableObjectsVisible) {
                                if (!XDDUtilities.isMappableObject(obj, validTpdoTObjectMapping)
                                        && !XDDUtilities.isMappableObject(obj, validRpdoTObjectMapping)
                                        && tpdoMappableSubObjects.isEmpty() && rpdoMappableSubObjects.isEmpty()) {
                                    return false;
                                }
                            }

                            if (!userdefinedObjectsVisisble) {
                                if ((objectId >= IPowerlinkConstants.MANUFACTURER_PROFILE_START_INDEX)
                                        && (objectId <= IPowerlinkConstants.MANUFACTURER_PROFILE_END_INDEX)) {
                                    return false;
                                }
                            }

                        } else if (element instanceof SubObjectTypeImpl) {
                            SubObjectTypeImpl subObj = (SubObjectTypeImpl) element;
                            validRpdoTObjectMapping = XDDUtilities.getValidMappingTypes(TObjectPDOMapping.RPDO);

                            validTpdoTObjectMapping = XDDUtilities.getValidMappingTypes(TObjectPDOMapping.TPDO);
                            if (!nonMappableObjectsVisible) {
                                if (!XDDUtilities.isMappableSubObject(subObj, validTpdoTObjectMapping)
                                        && !XDDUtilities.isMappableSubObject(subObj, validRpdoTObjectMapping)) {
                                    return false;
                                }
                            }
                        }

                    } catch (Exception exc) {
                        exc.printStackTrace();
                    }
                    return true;
                }
            });
        }

        addListenerstoControls();

        ToolBarManager toolBarManager = new ToolBarManager(SWT.NONE);
        org.eclipse.swt.widgets.ToolBar toolbar = toolBarManager.createControl(objectDictionarySection);
        final org.eclipse.swt.graphics.Cursor handCursor = Display.getCurrent().getSystemCursor(SWT.CURSOR_HAND);
        toolbar.setCursor(handCursor);

        toolBarManager.removeAll();
        toolBarManager.add(hideCommunicationProfileObjects);
        toolBarManager.add(hideStandardisedDeviceProfileObjects);
        toolBarManager.add(hideNonMappableObjects);
        toolBarManager.add(hideUserDefinedObjects);
        toolBarManager.update(true);
        objectDictionarySection.setTextClient(toolbar);

    }

    /**
     * Refreshes the network view
     */
    public void handleRefresh() {
        listViewer.setInput(XDDPackage.eINSTANCE.getTObject());
        listViewer.refresh();
        listViewer.setSelection(listViewer.getSelection());

    }

    private boolean isObjectIndexValid(String text) {
        if (!text.isEmpty()) {
            Integer indexvalue = Integer.parseInt(text, 16);
            if ((indexvalue < IPowerlinkConstants.COMMUNICATION_PROFILE_START_INDEX)
                    || (indexvalue > IPowerlinkConstants.MAX_PROFILE_INDEX)) {
                return false;
            } else
                return true;
        } else
            return false;
    }

    private boolean isSubObjectAdded(String objectIndex, TObjectImpl obj) {
        if (isObjectIndexValid(objectIndex)) {
            if (obj.getObjectType() != 7) {
                return true;
            }
        }
        return false;
    }

    /**
     * Create the actions.
     */
    private void createActions() {

        hideNonMappableObjects = new Action(HIDE_NON_MAPPABLE_OBJECTS, IAction.AS_CHECK_BOX) {
            @Override
            public void run() {
                if (hideNonMappableObjects.isChecked()) {
                    nonMappableObjectsVisible = false;
                } else {
                    nonMappableObjectsVisible = true;
                }
                listViewer.refresh();
            }
        };
        hideNonMappableObjects.setToolTipText(HIDE_NON_MAPPABLE_OBJECTS);
        hideNonMappableObjects.setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(
                "com.br_automation.buoat.xddeditor.editor", IPluginImages.HIDE_NON_MAPPABLE_OBJECT_ICON));
        hideNonMappableObjects.setChecked(false);

        propertiesAction = new Action(OBJECT_PROPERTIES) {
            @Override
            public void run() {
                super.run();
                try {
                    PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
                            .showView(IPageLayout.ID_PROP_SHEET);
                    listViewer.setSelection(listViewer.getSelection());
                } catch (PartInitException e) {
                    e.printStackTrace();

                }
            }
        };
        propertiesAction.setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(
                "com.br_automation.buoat.xddeditor.editor", IPluginImages.HIDE_STANDARDIZED_PROFILE_ICON));

        hideCommunicationProfileObjects = new Action(HIDE_COMMUNICATION_PROFILE_AREA_OBJECTS, IAction.AS_CHECK_BOX) {
            @Override
            public void run() {
                if (hideCommunicationProfileObjects.isChecked()) {
                    communicationProfileObjectsVisible = false;
                } else {
                    communicationProfileObjectsVisible = true;
                }
                listViewer.refresh();
            }
        };
        hideCommunicationProfileObjects.setToolTipText(HIDE_COMMUNICATION_PROFILE_AREA_OBJECTS);
        hideCommunicationProfileObjects.setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(
                "com.br_automation.buoat.xddeditor.editor", IPluginImages.HIDE_COMMUNICATION_PROFILE_ICON));
        hideCommunicationProfileObjects.setChecked(false);

        hideStandardisedDeviceProfileObjects = new Action(HIDE_STANDARDISED_DEVICE_PROFILE_AREA_OBJECTS,
                IAction.AS_CHECK_BOX) {
            @Override
            public void run() {
                if (hideStandardisedDeviceProfileObjects.isChecked()) {
                    standardisedDeviceProfileObjectsVisible = false;
                } else {
                    standardisedDeviceProfileObjectsVisible = true;
                }
                listViewer.refresh();
            }
        };
        hideStandardisedDeviceProfileObjects.setToolTipText(HIDE_STANDARDISED_DEVICE_PROFILE_AREA_OBJECTS);
        hideStandardisedDeviceProfileObjects.setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(
                "com.br_automation.buoat.xddeditor.editor", IPluginImages.HIDE_STANDARDIZED_PROFILE_ICON));
        hideStandardisedDeviceProfileObjects.setChecked(false);

        hideUserDefinedObjects = new Action(HIDE_STANDARDISED_DEVICE_PROFILE_AREA_OBJECTS, IAction.AS_CHECK_BOX) {
            @Override
            public void run() {
                if (hideUserDefinedObjects.isChecked()) {
                    userdefinedObjectsVisisble = false;
                } else {
                    userdefinedObjectsVisisble = true;
                }
                listViewer.refresh();
            }
        };
        hideUserDefinedObjects.setToolTipText(HIDE_USER_DEFINED_OBJECTS);
        hideUserDefinedObjects.setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(
                "com.br_automation.buoat.xddeditor.editor", IPluginImages.HIDE_USER_DEFINED_OBJECT_ICON));
        hideUserDefinedObjects.setChecked(false);

    }

    private void addListenerstoControls() {
        addObjectButton.addSelectionListener(addObjectWizardSelectionAdapter);
        addSubObjectButton.addSelectionListener(addSubObjectWizardSelectionAdapter);
        removeButton.addSelectionListener(removeObjectSelectionAdapter);

    }

    private SelectionAdapter addSubObjectWizardSelectionAdapter = new SelectionAdapter() {

        @Override
        public void widgetSelected(SelectionEvent e) {
            NewSubObjectWizard objWizard = new NewSubObjectWizard(selectedObject, editor, docRoot);

            WizardDialog dialog = new WizardDialog(Display.getDefault().getActiveShell(), objWizard);
            dialog.setTitle(objWizard.getWindowTitle());
            dialog.open();

            listViewer.setInput(XDDPackage.eINSTANCE.getTObject());
        }
    };

    private TApplicationLayersImpl getApplicationLayer() {
        EList<ISO15745ProfileType> profiles = docRoot.getISO15745ProfileContainer().getISO15745Profile();
        for (ISO15745ProfileType profile : profiles) {
            ProfileBodyDataType profileBody = profile.getProfileBody();
            if (profileBody instanceof ProfileBodyCommunicationNetworkPowerlinkImpl) {
                EList<EObject> bodyContents = profileBody.eContents();
                for (EObject object : bodyContents) {
                    if (object instanceof TApplicationLayersImpl) {
                        TApplicationLayersImpl applicationLayer = (TApplicationLayersImpl) object;
                        return applicationLayer;
                    }
                }
            }
        }
        return null;

    }

    private SelectionAdapter removeObjectSelectionAdapter = new SelectionAdapter() {

        @Override
        public void widgetSelected(SelectionEvent e) {

            if (selectedObject != null) {
                MessageDialog dialog = new MessageDialog(null, "Delete Object", null,
                        "Are you sure you want to delete the object '" + selectedObject.getName() + "'",
                        MessageDialog.QUESTION, new String[] { "Yes", "No" }, 1);

                int result = dialog.open();
                if (result == 0) {

                    getApplicationLayer().getObjectList().getObject().remove(selectedObject);
                }
            }

            if (selectedSubObject != null) {
                MessageDialog dialog = new MessageDialog(null, "Delete Sub-object", null,
                        "Are you sure you want to delete the Sub-object '" + selectedSubObject.getName() + "'",
                        MessageDialog.QUESTION, new String[] { "Yes", "No" }, 1);

                int result = dialog.open();
                if (result == 0) {

                    object.getSubObject().remove(selectedSubObject);
                }

            }
            updateDocument(docRoot);

            listViewer.setInput(XDDPackage.eINSTANCE.getTObject());
        }
    };

    /**
     * Verifies whether the entered value is updated in XDD file
     *
     * @param documentRoot
     *            Instance of XDD file
     * @return <code>True</code> If value is updated in document, <code>False</code>
     *         otherwise.
     */
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

    private SelectionAdapter addObjectWizardSelectionAdapter = new SelectionAdapter() {

        @Override
        public void widgetSelected(SelectionEvent e) {
            NewObjectWizard objWizard = new NewObjectWizard(docRoot, editor);

            WizardDialog dialog = new WizardDialog(Display.getDefault().getActiveShell(), objWizard);
            dialog.setTitle(objWizard.getWindowTitle());
            dialog.open();

            listViewer.setInput(XDDPackage.eINSTANCE.getTObject());
        }
    };

    /**
     * Handles the save actions for the project editor page
     */
    @Override
    public void doSave(IProgressMonitor monitor) {

        setDirty(false);
        super.doSave(monitor);
    }

    /**
     * Initializes the file editor page.
     */
    @Override
    public void init(IEditorSite site, IEditorInput input) {
        super.init(site, input);
    }

    /**
     * Handles it internally using the dirty flag.
     */
    @Override
    public boolean isDirty() {
        return dirty;
    }

    /**
     * Returns true, since the project editor is an editor. otherwise it will be a
     * form.
     */
    @Override
    public boolean isEditor() {
        return true;
    }

    /**
     * Sets the editor dirty and notifies the base editor with
     * editorDirtoStateChanged signal.
     *
     * @param value
     *            state of the editor.
     */
    private void setDirty(boolean value) {
        if (dirty != value) {
            dirty = value;
            getEditor().editorDirtyStateChanged();
        }
    }

    @Override
    public void propertyChanged(Object source, int propId) {
        listViewer.setInput(XDDPackage.eINSTANCE.getTObject());
        listViewer.refresh();
    }

}
