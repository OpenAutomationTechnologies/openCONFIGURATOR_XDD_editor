/*******************************************************************************
 * @file   ObjectDictionaryEditorPage.java
 *
 * @author Sree Hari Vignesh B, Kalycito Infotech Private Limited.
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

import java.awt.Image;
import java.awt.Menu;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.DatatypeConverter;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.eef.runtime.ui.properties.sections.EEFAdvancedPropertySection;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.pde.core.IModelChangedEvent;
import org.eclipse.pde.internal.ui.editor.PDEFormPage;
import org.eclipse.pde.internal.ui.editor.PDEMasterDetailsBlock;
import org.eclipse.pde.internal.ui.editor.PDESection;
import org.eclipse.pde.internal.ui.editor.plugin.AbstractPluginElementDetails;

import org.eclipse.pde.internal.ui.editor.plugin.ExtensionDetails;
import org.eclipse.pde.internal.ui.editor.plugin.ExtensionElementBodyTextDetails;
import org.eclipse.pde.internal.ui.editor.plugin.ExtensionElementDetails;
import org.eclipse.pde.internal.ui.editor.plugin.ExtensionsPage;
import org.eclipse.pde.internal.ui.editor.plugin.ExtensionsSection;

import org.eclipse.pde.internal.ui.editor.text.IControlHoverContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.forms.DetailsPart;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IDetailsPageProvider;
import org.eclipse.ui.forms.IFormColors;
import org.eclipse.ui.forms.IFormPart;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.MasterDetailsBlock;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapLayout;
import org.eclipse.ui.internal.handlers.HideTrimBarsHandler;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.SubObjectType;
import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.TObjectPDOMapping;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;
import com.br_automation.buoat.xddeditor.XDD.custom.CiADeviceProfile;
import com.br_automation.buoat.xddeditor.XDD.custom.EPLGeneralConstants;
import com.br_automation.buoat.xddeditor.XDD.custom.Messages;
import com.br_automation.buoat.xddeditor.XDD.custom.ModelLoader;
import com.br_automation.buoat.xddeditor.XDD.custom.XDDUtilities;
import com.br_automation.buoat.xddeditor.XDD.custom.propertypages.BasicViewSection;
import com.br_automation.buoat.xddeditor.XDD.custom.propertypages.TObjectComposite;
import com.br_automation.buoat.xddeditor.XDD.custom.propertypages.filters.Index1000Filter;
import com.br_automation.buoat.xddeditor.XDD.custom.propertypages.filters.Index1F80Filter;
import com.br_automation.buoat.xddeditor.XDD.custom.propertypages.filters.Index1F82Filter;
import com.br_automation.buoat.xddeditor.XDD.custom.propertypages.filters.MappingSubobjectsFilter;
import com.br_automation.buoat.xddeditor.XDD.custom.propertypages.filters.StoreParamSubobjectsFilter;
import com.br_automation.buoat.xddeditor.XDD.impl.SubObjectTypeImpl;
import com.br_automation.buoat.xddeditor.XDD.impl.TObjectImpl;
import com.br_automation.buoat.xddeditor.XDD.provider.TObjectItemProvider;
import com.br_automation.buoat.xddeditor.XDD.resources.IPluginImages;
import com.br_automation.buoat.xddeditor.XDD.resources.IPowerlinkConstants;
import com.br_automation.buoat.xddeditor.XDD.wizards.AddObjectWizardPage;
import com.br_automation.buoat.xddeditor.XDD.wizards.NewFirmwareWizard;
import com.br_automation.buoat.xddeditor.XDD.wizards.NewObjectWizard;

/**
 * The editor page to manipulate the object dictionary of device description
 * file.
 *
 * @author Sree Hari Vignesh B
 *
 */
public final class ObjectDictionaryEditorPage extends FormPage {

    /** Identifier */
    private static final String ID = "org.epsg.openconfigurator.editors.objectDictionaryEditorPage";

    private static final String OBJECT_DICTIONARY_HEADING = "Object Dictionary";
    public static final String OBJECT_DICTIONARY_DETAILS_HEADING = "Object Details";
    public static final String SUB_OBJECT_DICTIONARY_DETAILS_HEADING = "Sub Object Details";
    public static final String OBJECT_DICTIONARY_HEADING_DESCRIPTION = "Provides POWERLINK object dictionary of device.";

    private static final String ADD_BUTTON_LABEL = "Add...";
    private static final String REMOVE_BUTTON_LABEL = "Remove";

    private static final String FORM_EDITOR_PAGE_TITLE = "Device Description File Editor";

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

    /**
     * Editor dirty flag for this page.
     */
    private boolean dirty = false;

    /**
     * Scrolled form.
     */
    private ScrolledForm form;

    private static DocumentRoot docRoot;

    /**
     * Toolkit for the form editor.
     */
    private FormToolkit toolkit;
    private DeviceDescriptionFileEditor editor;

    private Button addPathSettingsButton;
    private Button removeButton;

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
        layout.numColumns = 2;
        body.setLayout(layout);

        ObjectDictionaryBlock masterDetailsBlock = new ObjectDictionaryBlock();
        masterDetailsBlock.createContent(managedForm);

    }

    public class ObjectDictionaryBlock extends MasterDetailsBlock implements IDetailsPageProvider {

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
            System.err.println("The page key.." + object);
            if (object instanceof TObjectImpl) {
                TObjectImpl obj = (TObjectImpl) object;
                String index = DatatypeConverter.printHexBinary(obj.getIndex());
                System.err.println("The Obb.." + index);
                if (index.equalsIgnoreCase("1F82")) {
                    index1F82Object = obj;
                    return Index1F82Filter.class;
                }

                if (index.equalsIgnoreCase("1F80")) {
                    index1F80Object = obj;
                    return Index1F80Filter.class;
                }

                if (index.equalsIgnoreCase("1000")) {
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
                            .intValue() == EPLGeneralConstants.NMT_STOREPARAM_REC) { // NOPMD
                                                                                        // by
                                                                                        // lueckengaj
                                                                                        // on
                                                                                        // 21.05.13
                                                                                        // 08:33
                        if (subObject.getSubIndex() == null || subObject.getSubIndex().length == 0)
                            return true;
                        int subIndex = new BigInteger(subObject.getSubIndex()).intValue();
                        this.subObject = subObject;
                        return StoreParamSubobjectsFilter.class;
                    }
                }

                return SubObjectTypeImpl.class;
            }
            return null;
        }

        private SubObjectTypeImpl subObject;
        private TObjectImpl index1000Object;
        private TObjectImpl index1F80Object;
        private TObjectImpl index1F82Object;

        @Override
        public IDetailsPage getPage(Object key) {
            System.err.println("Key.." + key);
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

    }

    private Section deviceFirmwareSection;

    private Composite clientComposite;

    /**
     * PatternFilter class to always show sub objects after filtering of
     * objects.
     */
    private class PowerlinkObjectPatternFilter extends PatternFilter {

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
     * Content provider to list the forced objects and sub_objects of node and
     * module.
     *
     * @author Sree Hari Vignesh B
     *
     */
    private static class ObjectDictionaryContentProvider implements ITreeContentProvider {

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

    private TreeViewer listViewer;

    protected void fillContextMenu(IMenuManager contextMenu) {

        contextMenu.add(propertiesAction);
    }

    protected void createContextMenu(Viewer viewer) {
        MenuManager contextMenu = new MenuManager("ViewerMenu");
        contextMenu.setRemoveAllWhenShown(true);
        contextMenu.addMenuListener(new IMenuListener() {
            @Override
            public void menuAboutToShow(IMenuManager mgr) {
                fillContextMenu(mgr);
            }
        });

        org.eclipse.swt.widgets.Menu menu = contextMenu.createContextMenu(viewer.getControl());
        viewer.getControl().setMenu(menu);
    }

    public TreeViewer getViewer() {
        return listViewer;
    }

    private Action propertiesAction;

    public static final String OBJECT_PROPERTIES = "Properties";

    private FilteredTree filteredTree;

    /**
     * Creates the widgets and controls for the Object dictionary model.
     *
     * @param managedForm
     *            The parent form.
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
        layout.numColumns = 2;
        parent.setLayout(layout);

        deviceFirmwareSection = toolKit.createSection(parent, ExpandableComposite.EXPANDED | Section.DESCRIPTION
                | ExpandableComposite.TWISTIE | ExpandableComposite.TITLE_BAR);
        managedForm.getToolkit().paintBordersFor(deviceFirmwareSection);
        deviceFirmwareSection.setText(ObjectDictionaryEditorPage.OBJECT_DICTIONARY_HEADING);
        deviceFirmwareSection.setDescription(ObjectDictionaryEditorPage.OBJECT_DICTIONARY_HEADING_DESCRIPTION);

        Composite clientComposite = toolkit.createComposite(deviceFirmwareSection, SWT.WRAP);
        GridLayout layouts = new GridLayout(2, false);
        // layout.marginHeight = 15;
        // layout.marginBottom = 15;
        clientComposite.setLayout(layouts);
        toolkit.paintBordersFor(clientComposite);

        deviceFirmwareSection.setClient(clientComposite);

        PatternFilter filter = new PowerlinkObjectPatternFilter();
        filter.setIncludeLeadingWildcard(true);
        filteredTree = new FilteredTree(clientComposite, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL, filter, true);
        listViewer = filteredTree.getViewer();
        Tree lst_no_foi = listViewer.getTree();

        listViewer.setContentProvider(new ObjectDictionaryContentProvider());
        listViewer.setLabelProvider(new ObjectDictionaryLabelProvider());
        listViewer.setInput(XDDPackage.eINSTANCE.getTObject());
        GridData pst = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 3);

        pst.heightHint = 400;
        pst.widthHint = 500;
        lst_no_foi.setLayoutData(pst);

        createContextMenu(listViewer);

        // getEditorSite().setSelectionProvider(listViewer);

        addPathSettingsButton = toolkit.createButton(clientComposite, ObjectDictionaryEditorPage.ADD_BUTTON_LABEL,
                SWT.PUSH);
        pst = new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1);
        addPathSettingsButton.setLayoutData(pst);
        toolkit.adapt(addPathSettingsButton, true, true);

        removeButton = toolkit.createButton(clientComposite, ObjectDictionaryEditorPage.REMOVE_BUTTON_LABEL, SWT.PUSH);
        pst = new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1);
        removeButton.setLayoutData(pst);
        removeButton.setEnabled(false);
        toolkit.adapt(removeButton, true, true);

        final SectionPart spart = new SectionPart(deviceFirmwareSection);
        managedForm.addPart(spart);

        listViewer.addSelectionChangedListener(new ISelectionChangedListener() {

            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                managedForm.fireSelectionChanged(spart, event.getSelection());

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

        addListenerstoControls();

        ToolBarManager toolBarManager = new ToolBarManager(SWT.NONE);
        org.eclipse.swt.widgets.ToolBar toolbar = toolBarManager.createControl(deviceFirmwareSection);
        final org.eclipse.swt.graphics.Cursor handCursor = Display.getCurrent().getSystemCursor(SWT.CURSOR_HAND);
        toolbar.setCursor(handCursor);

        toolBarManager.removeAll();
        toolBarManager.add(hideCommunicationProfileObjects);
        toolBarManager.add(hideStandardisedDeviceProfileObjects);
        toolBarManager.add(hideNonMappableObjects);
        toolBarManager.add(hideUserDefinedObjects);
        toolBarManager.update(true);
        deviceFirmwareSection.setTextClient(toolbar);

    }

    private Action hideCommunicationProfileObjects;
    private Action hideStandardisedDeviceProfileObjects;
    private Action hideNonMappableObjects;
    private Action hideUserDefinedObjects;
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
        hideNonMappableObjects.setImageDescriptor(AbstractUIPlugin
                .imageDescriptorFromPlugin("com.br_automation.buoat.xddeditor.editor", IPluginImages.OBJECT_ICON));
        hideNonMappableObjects.setChecked(false);

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
        hideCommunicationProfileObjects.setImageDescriptor(AbstractUIPlugin
                .imageDescriptorFromPlugin("com.br_automation.buoat.xddeditor.editor", IPluginImages.OBJECT_ICON));
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
        hideStandardisedDeviceProfileObjects.setImageDescriptor(AbstractUIPlugin
                .imageDescriptorFromPlugin("com.br_automation.buoat.xddeditor.editor", IPluginImages.OBJECT_ICON));
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
        hideUserDefinedObjects.setImageDescriptor(AbstractUIPlugin
                .imageDescriptorFromPlugin("com.br_automation.buoat.xddeditor.editor", IPluginImages.OBJECT_ICON));
        hideUserDefinedObjects.setChecked(false);

    }

    private void addListenerstoControls() {
        addPathSettingsButton.addSelectionListener(addObjectWizardSelectionAdapter);

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

        if (isDirty()) {

        }
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
     * Returns true, since the project editor is an editor. otherwise it will be
     * a form.
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

    // @Override
    // public void selectionChanged(SelectionChangedEvent event) {
    // ISelection selection = event.getSelection();
    //// if (selection instanceof IStructuredSelection &&
    // ((IStructuredSelection)selection).size() == 1) {
    //// Object object = ((IStructuredSelection)selection).getFirstElement();
    //// if(object instanceof TObjectImpl){
    //// updateSections(deviceFirmwareSection);
    //// }else if (object instanceof SubObjectTypeImpl) {
    //// updateSubObjectSections(deviceFirmwareSection);
    //// }
    ////
    //// }
    //
    // }

}
