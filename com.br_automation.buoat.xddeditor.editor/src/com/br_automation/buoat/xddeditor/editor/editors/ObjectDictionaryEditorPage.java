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
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.bind.DatatypeConverter;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.eef.runtime.ui.properties.sections.EEFAdvancedPropertySection;
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
import org.eclipse.jface.window.Window;
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
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.forms.DetailsPart;
import org.eclipse.ui.forms.IDetailsPage;
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
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.SubObjectType;
import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;
import com.br_automation.buoat.xddeditor.XDD.custom.CiADeviceProfile;
import com.br_automation.buoat.xddeditor.XDD.custom.Messages;
import com.br_automation.buoat.xddeditor.XDD.custom.ModelLoader;
import com.br_automation.buoat.xddeditor.XDD.custom.XDDUtilities;
import com.br_automation.buoat.xddeditor.XDD.custom.propertypages.BasicViewSection;
import com.br_automation.buoat.xddeditor.XDD.custom.propertypages.TObjectComposite;
import com.br_automation.buoat.xddeditor.XDD.impl.SubObjectTypeImpl;
import com.br_automation.buoat.xddeditor.XDD.impl.TObjectImpl;
import com.br_automation.buoat.xddeditor.XDD.provider.TObjectItemProvider;
import com.br_automation.buoat.xddeditor.XDD.resources.IPluginImages;

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
    private static final String OBJECT_DICTIONARY_DETAILS_HEADING = "Object Details";
    private static final String SUB_OBJECT_DICTIONARY_DETAILS_HEADING = "Sub Object Details";
    private static final String OBJECT_DICTIONARY_HEADING_DESCRIPTION = "Provides POWERLINK object dictionary of device.";

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

    // TO be implemented
    private void createObjectDetailsSections(final IManagedForm managedForm) {
        deviceFirmwareSection = managedForm.getToolkit().createSection(managedForm.getForm().getBody(),
                ExpandableComposite.EXPANDED | Section.DESCRIPTION | ExpandableComposite.TWISTIE
                        | ExpandableComposite.TITLE_BAR);
        managedForm.getToolkit().paintBordersFor(deviceFirmwareSection);
        deviceFirmwareSection.setText(ObjectDictionaryEditorPage.OBJECT_DICTIONARY_DETAILS_HEADING);
        deviceFirmwareSection.setDescription(ObjectDictionaryEditorPage.OBJECT_DICTIONARY_HEADING_DESCRIPTION);

    }

    public class ObjectDictionaryBlock extends MasterDetailsBlock {

        @Override
        protected void createMasterPart(IManagedForm managedForm, Composite parent) {
            createObjectDictionarySection(managedForm, parent);
        }

        @Override
        protected void registerPages(DetailsPart detailsPart) {
            detailsPart.registerPage(TObjectImpl.class, new ObjectDetailsPage());
            detailsPart.registerPage(SubObjectTypeImpl.class, new SubObjectDetailsPage());
        }

        @Override
        protected void createToolBarActions(IManagedForm managedForm) {
            // TODO Auto-generated method stub

        }

    }

    private Section deviceFirmwareSection;

    private Composite clientComposite;

    public void updateSections(Section deviceFirmwareSection) {

        clientComposite = toolkit.createComposite(deviceFirmwareSection, SWT.WRAP);
        GridLayout layout = new GridLayout(2, false);
        layout.marginHeight = 15;
        layout.marginBottom = 15;
        clientComposite.setLayout(layout);
        toolkit.paintBordersFor(clientComposite);
        deviceFirmwareSection.setClient(clientComposite);

        Label vendorIdLabel = new Label(clientComposite, SWT.NONE);
        vendorIdLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        vendorIdLabel.setText("Vendor ID");
        toolkit.adapt(vendorIdLabel, true, true);
        vendorIdLabel.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        Text vendorIdText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
        vendorIdText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(vendorIdText, true, true);

        Label vendorNameLabel = new Label(clientComposite, SWT.NONE);
        vendorNameLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        vendorNameLabel.setText("Vendor Name");
        toolkit.adapt(vendorNameLabel, true, true);
        vendorNameLabel.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        Text vendorNameText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
        vendorNameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(vendorNameText, true, true);
    }

    public void updateSubObjectSections(Section deviceFirmwareSection) {

        clientComposite = toolkit.createComposite(deviceFirmwareSection, SWT.WRAP);
        GridLayout layout = new GridLayout(2, false);
        layout.marginHeight = 15;
        layout.marginBottom = 15;
        clientComposite.setLayout(layout);
        toolkit.paintBordersFor(clientComposite);
        deviceFirmwareSection.setClient(clientComposite);

        Label vendorIdLabel = new Label(clientComposite, SWT.NONE);
        vendorIdLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        vendorIdLabel.setText("Vendor");
        toolkit.adapt(vendorIdLabel, true, true);
        vendorIdLabel.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        Text vendorIdText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
        vendorIdText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(vendorIdText, true, true);

        Label vendorNameLabel = new Label(clientComposite, SWT.NONE);
        vendorNameLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        vendorNameLabel.setText("Vendor Name ID");
        toolkit.adapt(vendorNameLabel, true, true);
        vendorNameLabel.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        Text vendorNameText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
        vendorNameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(vendorNameText, true, true);
    }

    private void createSubObjectDetailsSections(final IManagedForm managedForm) {
        Section deviceFirmwareSection = managedForm.getToolkit().createSection(managedForm.getForm().getBody(),
                ExpandableComposite.EXPANDED | Section.DESCRIPTION | ExpandableComposite.TWISTIE
                        | ExpandableComposite.TITLE_BAR);
        managedForm.getToolkit().paintBordersFor(deviceFirmwareSection);
        deviceFirmwareSection.setText("New");
        deviceFirmwareSection.setDescription(ObjectDictionaryEditorPage.OBJECT_DICTIONARY_HEADING_DESCRIPTION);

        Composite clientComposite = toolkit.createComposite(deviceFirmwareSection, SWT.WRAP);
        GridLayout layout = new GridLayout(3, false);
        layout.marginHeight = 15;
        layout.marginBottom = 15;
        clientComposite.setLayout(layout);
        toolkit.paintBordersFor(clientComposite);

    }

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
                String objIndex = getIndex(obj.getIndex());
                return obj.getName() + " (0x" + objIndex + ")";
            } else if (element instanceof SubObjectType) {
                SubObjectType subObj = (SubObjectType) element;
                String subObjIndex = getIndex(subObj.getSubIndex());
                return subObj.getName() + " (0x" + subObjIndex + ")";
            }
            return "";
        }
    }

    private static String getIndex(byte[] index) {
        String objectIdRaw = DatatypeConverter.printHexBinary(index);
        return objectIdRaw;

    }

    private TreeViewer listViewer;

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

        Section deviceFirmwareSection = toolKit.createSection(parent, ExpandableComposite.EXPANDED | Section.DESCRIPTION
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
        FilteredTree tree = new FilteredTree(clientComposite, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL, filter, true);
        listViewer = tree.getViewer();
        Tree lst_no_foi = listViewer.getTree();

        listViewer.setContentProvider(new ObjectDictionaryContentProvider());
        listViewer.setLabelProvider(new ObjectDictionaryLabelProvider());
        listViewer.setInput(XDDPackage.eINSTANCE.getTObject());
        GridData pst = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 3);

        pst.heightHint = 400;
        pst.widthHint = 500;
        lst_no_foi.setLayoutData(pst);

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

        // ISelectionProvider selectionProvider =
        // editor.getSite().getSelectionProvider();
        listViewer.addSelectionChangedListener(new ISelectionChangedListener() {

            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                managedForm.fireSelectionChanged(spart, event.getSelection());

            }
        });

    }

    public class ObjectDetailsPage implements IDetailsPage {

        private IManagedForm managedForm;

        private Text accessTypeText;

        private Text actualValueText;

        private Text dataTypeText;

        private Text defaultValueText;
        private Text denotationText;
        private Text highLimitText;
        private Text indexText;
        private Text lowLimitText;
        private Text nameText;
        private Text objTypeText;
        private Text objFlagsText;
        private Text pdoMappingText;
        private Text subNumberText;
        private Text uniqueIdRefText;

        @Override
        public void initialize(IManagedForm form) {
            managedForm = form;

        }

        @Override
        public void dispose() {
            // TODO Auto-generated method stub

        }

        @Override
        public boolean isDirty() {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public void commit(boolean onSave) {
            // TODO Auto-generated method stub

        }

        @Override
        public boolean setFormInput(Object input) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public void setFocus() {
            // TODO Auto-generated method stub

        }

        @Override
        public boolean isStale() {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public void refresh() {
            // TODO Auto-generated method stub

        }

        @Override
        public void selectionChanged(IFormPart part, ISelection selection) {
            IStructuredSelection sel = (IStructuredSelection) selection;
            System.err.println("The object instance.." + sel.getFirstElement());
            TObjectImpl obj = (TObjectImpl) sel.getFirstElement();

            if (obj.getAccessType() != null) {
                accessTypeText.setText(obj.getAccessType().getName());
            }

            if (obj.getActualValue() != null) {
                actualValueText.setText(obj.getActualValue());
            }

            if (obj.getDataType() != null) {
                String dataType = DatatypeConverter.printHexBinary(obj.getDataType());
                dataTypeText.setText(dataType);
            }

            if (obj.getDefaultValue() != null) {
                defaultValueText.setText(obj.getDefaultValue());
            }

            if (obj.getDenotation() != null) {
                denotationText.setText(obj.getDenotation());
            }

            if (obj.getHighLimit() != null) {
                highLimitText.setText(obj.getHighLimit());
            }

            if (obj.getIndex() != null) {
                String index = DatatypeConverter.printHexBinary(obj.getIndex());
                index = "0x" + index;
                indexText.setText(index);
            }

            if (obj.getLowLimit() != null) {
                lowLimitText.setText(obj.getLowLimit());
            }

            if (obj.getName() != null) {
                nameText.setText(obj.getName());
            }

            if (obj.getObjectType() != 0) {
                objTypeText.setText(String.valueOf(obj.getObjectType()));
            }

            if (obj.getObjFlags() != null) {
                objFlagsText.setText(obj.getObjFlags().toString());
            }

            if (obj.getPDOmapping() != null) {
                pdoMappingText.setText(obj.getPDOmapping().getName());
            }

            if (obj.getSubNumber() != 0) {
                subNumberText.setText(String.valueOf(obj.getSubNumber()));
            }

            if (obj.getUniqueIDRef() != null) {
                uniqueIdRefText.setText(obj.getUniqueIDRef());
            }

        }

        @Override
        public void createContents(Composite parent) {

            GridLayout layout = new GridLayout(3, true);

            parent.setLayout(layout);
            layout.marginWidth = 20;
            Section deviceFirmwareSection = managedForm.getToolkit().createSection(parent, ExpandableComposite.EXPANDED
                    | Section.DESCRIPTION | ExpandableComposite.TWISTIE | ExpandableComposite.TITLE_BAR);
            managedForm.getToolkit().paintBordersFor(deviceFirmwareSection);
            deviceFirmwareSection.setText(ObjectDictionaryEditorPage.OBJECT_DICTIONARY_DETAILS_HEADING);
            deviceFirmwareSection.setDescription(ObjectDictionaryEditorPage.OBJECT_DICTIONARY_HEADING_DESCRIPTION);

            Composite clientComposite = managedForm.getToolkit().createComposite(deviceFirmwareSection, SWT.WRAP);
            GridLayout layouts = new GridLayout(6, true);
            layouts.marginWidth = 2;
            layouts.marginHeight = 2;
            clientComposite.setLayout(layouts);
            managedForm.getToolkit().paintBordersFor(clientComposite);

            deviceFirmwareSection.setClient(clientComposite);

            Label accessTypeLabel = new Label(clientComposite, SWT.NONE);
            accessTypeLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            accessTypeLabel.setText("Access Type:");
            managedForm.getToolkit().adapt(accessTypeLabel, true, true);
            accessTypeLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

            accessTypeText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
            accessTypeText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
            managedForm.getToolkit().adapt(accessTypeText, true, true);

            Label actualValueLabel = new Label(clientComposite, SWT.NONE);
            actualValueLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            actualValueLabel.setText("Actual Value:");
            managedForm.getToolkit().adapt(actualValueLabel, true, true);
            actualValueLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

            actualValueText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
            actualValueText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
            managedForm.getToolkit().adapt(actualValueText, true, true);

            Label dataTypeLabel = new Label(clientComposite, SWT.NONE);
            dataTypeLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            dataTypeLabel.setText("Data Type:");
            managedForm.getToolkit().adapt(dataTypeLabel, true, true);
            dataTypeLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

            dataTypeText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
            dataTypeText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
            managedForm.getToolkit().adapt(dataTypeText, true, true);

            Label defaultValueLabel = new Label(clientComposite, SWT.NONE);
            defaultValueLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            defaultValueLabel.setText("Default Value:");
            managedForm.getToolkit().adapt(defaultValueLabel, true, true);
            defaultValueLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

            defaultValueText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
            defaultValueText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
            managedForm.getToolkit().adapt(defaultValueText, true, true);

            Label denotationLabel = new Label(clientComposite, SWT.NONE);
            denotationLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            denotationLabel.setText("Denotation:");
            managedForm.getToolkit().adapt(denotationLabel, true, true);
            denotationLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

            denotationText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
            denotationText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
            managedForm.getToolkit().adapt(denotationText, true, true);

            Label highLimitLabel = new Label(clientComposite, SWT.NONE);
            highLimitLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            highLimitLabel.setText("High Limit:");
            managedForm.getToolkit().adapt(highLimitLabel, true, true);
            highLimitLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

            highLimitText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
            highLimitText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
            managedForm.getToolkit().adapt(highLimitText, true, true);

            Label indexLabel = new Label(clientComposite, SWT.NONE);
            indexLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            indexLabel.setText("Index:");
            managedForm.getToolkit().adapt(indexLabel, true, true);
            indexLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

            indexText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
            indexText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
            managedForm.getToolkit().adapt(indexText, true, true);

            Label lowLimitlabel = new Label(clientComposite, SWT.NONE);
            lowLimitlabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            lowLimitlabel.setText("Low Limit:");
            managedForm.getToolkit().adapt(lowLimitlabel, true, true);
            lowLimitlabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

            lowLimitText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
            lowLimitText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
            managedForm.getToolkit().adapt(lowLimitText, true, true);

            Label nameLabel = new Label(clientComposite, SWT.NONE);
            nameLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            nameLabel.setText("Name:");
            managedForm.getToolkit().adapt(nameLabel, true, true);
            nameLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

            nameText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
            nameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
            managedForm.getToolkit().adapt(nameText, true, true);

            Label objTypelabel = new Label(clientComposite, SWT.NONE);
            objTypelabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            objTypelabel.setText("Object Type:");
            managedForm.getToolkit().adapt(objTypelabel, true, true);
            objTypelabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

            objTypeText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
            objTypeText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
            managedForm.getToolkit().adapt(objTypeText, true, true);

            Label objFlagsLabel = new Label(clientComposite, SWT.NONE);
            objFlagsLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            objFlagsLabel.setText("Object Flags:");
            managedForm.getToolkit().adapt(objFlagsLabel, true, true);
            objFlagsLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

            objFlagsText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
            objFlagsText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
            managedForm.getToolkit().adapt(objFlagsText, true, true);

            Label pdoMappingLabel = new Label(clientComposite, SWT.NONE);
            pdoMappingLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            pdoMappingLabel.setText("PDO Mapping:");
            managedForm.getToolkit().adapt(pdoMappingLabel, true, true);
            pdoMappingLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

            pdoMappingText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
            pdoMappingText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
            managedForm.getToolkit().adapt(pdoMappingText, true, true);

            Label subNumberLabel = new Label(clientComposite, SWT.NONE);
            subNumberLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            subNumberLabel.setText("Sub Number:");
            managedForm.getToolkit().adapt(subNumberLabel, true, true);
            subNumberLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

            subNumberText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
            subNumberText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
            managedForm.getToolkit().adapt(subNumberText, true, true);

            Label uniqueIdRefLabel = new Label(clientComposite, SWT.NONE);
            uniqueIdRefLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            uniqueIdRefLabel.setText("UniqueID Ref:");
            managedForm.getToolkit().adapt(uniqueIdRefLabel, true, true);
            uniqueIdRefLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

            uniqueIdRefText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
            uniqueIdRefText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
            managedForm.getToolkit().adapt(uniqueIdRefText, true, true);

        }

    }

    public class SubObjectDetailsPage extends EEFAdvancedPropertySection implements IDetailsPage {

        private IManagedForm managedForm;

        private Text accessTypeText;

        private Text actualValueText;

        private Text dataTypeText;

        private Text defaultValueText;
        private Text denotationText;
        private Text highLimitText;
        // private Text indexText;
        private Text lowLimitText;
        private Text nameText;
        private Text objTypeText;
        private Text objFlagsText;
        private Text pdoMappingText;
        private Text subIndexText;
        private Text uniqueIdRefText;

        @Override
        public void initialize(IManagedForm form) {
            managedForm = form;

        }

        @Override
        public void dispose() {
            // TODO Auto-generated method stub

        }

        @Override
        public boolean isDirty() {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public void commit(boolean onSave) {
            // TODO Auto-generated method stub

        }

        @Override
        public boolean setFormInput(Object input) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public void setFocus() {
            // TODO Auto-generated method stub

        }

        @Override
        public boolean isStale() {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public void refresh() {
            // TODO Auto-generated method stub

        }

        @Override
        public void selectionChanged(IFormPart part, ISelection selection) {
            IStructuredSelection sel = (IStructuredSelection) selection;

            SubObjectTypeImpl obj = (SubObjectTypeImpl) sel.getFirstElement();

            if (obj.getAccessType() != null) {
                accessTypeText.setText(obj.getAccessType().getName());
            }

            if (obj.getActualValue() != null) {
                actualValueText.setText(obj.getActualValue());
            }

            if (obj.getDataType() != null) {
                String dataType = DatatypeConverter.printHexBinary(obj.getDataType());
                dataTypeText.setText(dataType);
            }

            if (obj.getDefaultValue() != null) {
                defaultValueText.setText(obj.getDefaultValue());
            }

            if (obj.getDenotation() != null) {
                denotationText.setText(obj.getDenotation());
            }

            if (obj.getHighLimit() != null) {
                highLimitText.setText(obj.getHighLimit());
            }

            if (obj.getSubIndex() != null) {
                String index = DatatypeConverter.printHexBinary(obj.getSubIndex());
                index = "0x" + index;
                subIndexText.setText(index);
            }

            if (obj.getLowLimit() != null) {
                lowLimitText.setText(obj.getLowLimit());
            }

            if (obj.getName() != null) {
                nameText.setText(obj.getName());
            }

            if (obj.getObjectType() != 0) {
                objTypeText.setText(String.valueOf(obj.getObjectType()));
            }

            if (obj.getObjFlags() != null) {
                objFlagsText.setText(obj.getObjFlags().toString());
            }

            if (obj.getPDOmapping() != null) {
                pdoMappingText.setText(obj.getPDOmapping().getName());
            }

            if (obj.getUniqueIDRef() != null) {
                uniqueIdRefText.setText(obj.getUniqueIDRef());
            }

        }

        @Override
        public void createContents(Composite parent) {

            GridLayout layout = new GridLayout(3, true);

            parent.setLayout(layout);
            layout.marginWidth = 20;
            Section deviceFirmwareSection = managedForm.getToolkit().createSection(parent, ExpandableComposite.EXPANDED
                    | Section.DESCRIPTION | ExpandableComposite.TWISTIE | ExpandableComposite.TITLE_BAR);
            managedForm.getToolkit().paintBordersFor(deviceFirmwareSection);
            deviceFirmwareSection.setText(ObjectDictionaryEditorPage.SUB_OBJECT_DICTIONARY_DETAILS_HEADING);
            deviceFirmwareSection.setDescription(ObjectDictionaryEditorPage.OBJECT_DICTIONARY_HEADING_DESCRIPTION);

            Composite clientComposite = managedForm.getToolkit().createComposite(deviceFirmwareSection, SWT.WRAP);
            GridLayout layouts = new GridLayout(6, true);
            layouts.marginWidth = 2;
            layouts.marginHeight = 2;
            clientComposite.setLayout(layouts);
            managedForm.getToolkit().paintBordersFor(clientComposite);

            deviceFirmwareSection.setClient(clientComposite);

            Label accessTypeLabel = new Label(clientComposite, SWT.NONE);
            accessTypeLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            accessTypeLabel.setText("Access Type:");
            managedForm.getToolkit().adapt(accessTypeLabel, true, true);
            accessTypeLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

            accessTypeText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
            accessTypeText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
            managedForm.getToolkit().adapt(accessTypeText, true, true);

            Label actualValueLabel = new Label(clientComposite, SWT.NONE);
            actualValueLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            actualValueLabel.setText("Actual Value:");
            managedForm.getToolkit().adapt(actualValueLabel, true, true);
            actualValueLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

            actualValueText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
            actualValueText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
            managedForm.getToolkit().adapt(actualValueText, true, true);

            Label dataTypeLabel = new Label(clientComposite, SWT.NONE);
            dataTypeLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            dataTypeLabel.setText("Data Type:");
            managedForm.getToolkit().adapt(dataTypeLabel, true, true);
            dataTypeLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

            dataTypeText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
            dataTypeText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
            managedForm.getToolkit().adapt(dataTypeText, true, true);

            Label defaultValueLabel = new Label(clientComposite, SWT.NONE);
            defaultValueLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            defaultValueLabel.setText("Default Value:");
            managedForm.getToolkit().adapt(defaultValueLabel, true, true);
            defaultValueLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

            defaultValueText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
            defaultValueText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
            managedForm.getToolkit().adapt(defaultValueText, true, true);

            Label denotationLabel = new Label(clientComposite, SWT.NONE);
            denotationLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            denotationLabel.setText("Denotation:");
            managedForm.getToolkit().adapt(denotationLabel, true, true);
            denotationLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

            denotationText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
            denotationText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
            managedForm.getToolkit().adapt(denotationText, true, true);

            Label highLimitLabel = new Label(clientComposite, SWT.NONE);
            highLimitLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            highLimitLabel.setText("High Limit:");
            managedForm.getToolkit().adapt(highLimitLabel, true, true);
            highLimitLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

            highLimitText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
            highLimitText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
            managedForm.getToolkit().adapt(highLimitText, true, true);

            // Label indexLabel = new Label(clientComposite, SWT.NONE);
            // indexLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER,
            // false, false, 1, 1));
            // indexLabel.setText("Index:");
            // managedForm.getToolkit().adapt(indexLabel, true, true);
            // indexLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));
            //
            // indexText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
            // indexText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
            // false, 5, 1));
            // managedForm.getToolkit().adapt(indexText, true, true);

            Label lowLimitlabel = new Label(clientComposite, SWT.NONE);
            lowLimitlabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            lowLimitlabel.setText("Low Limit:");
            managedForm.getToolkit().adapt(lowLimitlabel, true, true);
            lowLimitlabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

            lowLimitText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
            lowLimitText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
            managedForm.getToolkit().adapt(lowLimitText, true, true);

            Label nameLabel = new Label(clientComposite, SWT.NONE);
            nameLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            nameLabel.setText("Name:");
            managedForm.getToolkit().adapt(nameLabel, true, true);
            nameLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

            nameText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
            nameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
            managedForm.getToolkit().adapt(nameText, true, true);

            Label objTypelabel = new Label(clientComposite, SWT.NONE);
            objTypelabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            objTypelabel.setText("Object Type:");
            managedForm.getToolkit().adapt(objTypelabel, true, true);
            objTypelabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

            objTypeText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
            objTypeText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
            managedForm.getToolkit().adapt(objTypeText, true, true);

            Label objFlagsLabel = new Label(clientComposite, SWT.NONE);
            objFlagsLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            objFlagsLabel.setText("Object Flags:");
            managedForm.getToolkit().adapt(objFlagsLabel, true, true);
            objFlagsLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

            objFlagsText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
            objFlagsText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
            managedForm.getToolkit().adapt(objFlagsText, true, true);

            Label pdoMappingLabel = new Label(clientComposite, SWT.NONE);
            pdoMappingLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            pdoMappingLabel.setText("PDO Mapping:");
            managedForm.getToolkit().adapt(pdoMappingLabel, true, true);
            pdoMappingLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

            pdoMappingText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
            pdoMappingText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
            managedForm.getToolkit().adapt(pdoMappingText, true, true);

            Label subNumberLabel = new Label(clientComposite, SWT.NONE);
            subNumberLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            subNumberLabel.setText("Sub Index:");
            managedForm.getToolkit().adapt(subNumberLabel, true, true);
            subNumberLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

            subIndexText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
            subIndexText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
            managedForm.getToolkit().adapt(subIndexText, true, true);

            Label uniqueIdRefLabel = new Label(clientComposite, SWT.NONE);
            uniqueIdRefLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            uniqueIdRefLabel.setText("UniqueID Ref:");
            managedForm.getToolkit().adapt(uniqueIdRefLabel, true, true);
            uniqueIdRefLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

            uniqueIdRefText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
            uniqueIdRefText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
            managedForm.getToolkit().adapt(uniqueIdRefText, true, true);

        }

    }

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
