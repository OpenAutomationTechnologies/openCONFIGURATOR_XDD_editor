/*******************************************************************************
 * @file   DeviceDescriptionFileEditorPage.java
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
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.forms.IFormColors;
import org.eclipse.ui.forms.IManagedForm;
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

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.FirmwareType;
import com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileType;
import com.br_automation.buoat.xddeditor.XDD.ProductNameType;
import com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType;
import com.br_automation.buoat.xddeditor.XDD.TDeviceFunction;
import com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity;
import com.br_automation.buoat.xddeditor.XDD.TFirmwareList;
import com.br_automation.buoat.xddeditor.XDD.TProductID;
import com.br_automation.buoat.xddeditor.XDD.TVendorID;
import com.br_automation.buoat.xddeditor.XDD.TVersion;
import com.br_automation.buoat.xddeditor.XDD.VendorNameType;
import com.br_automation.buoat.xddeditor.XDD.VersionTypeType;
import com.br_automation.buoat.xddeditor.XDD.XDDFactory;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;
import com.br_automation.buoat.xddeditor.XDD.custom.XDDUtilities;
import com.br_automation.buoat.xddeditor.XDD.impl.FirmwareTypeImpl;
import com.br_automation.buoat.xddeditor.XDD.resources.IPluginImages;
import com.br_automation.buoat.xddeditor.XDD.validation.NameVerifyListener;
import com.br_automation.buoat.xddeditor.XDD.wizards.DataTypeRange;
import com.br_automation.buoat.xddeditor.XDD.wizards.NewFirmwareWizard;

/**
 * The editor page to manipulate the device identity of description file.
 *
 * @author Sree Hari Vignesh
 *
 */
public final class DeviceDescriptionFileEditorPage extends FormPage {

    /** Identifier */
    private static final String ID = "com.buoat.xddeditor.editors.DeviceDescriptionFileEditorPage";

    /** Editor label and error messages */
    private static final String DEVICE_IMAGES_SECTION_HEADING = "Images and Connectors";
    private static final String DEVICE_IMAGE_SECTION_HEADING_DESCRIPTION = "Provides the image and connector information of device.";

    private static final String GENERAL_INFORMATION_SECTION = "General Information";
    private static final String GENERAL_SECTION_HEADING_DESCRIPTION = "Provides general information about device description file.";
    private static final String PRODUCT_ID_LABEL = "Product ID:";
    private static final String PRODUCT_NAME_LABEL = "Product Name:";
    private static final String FIRMWARE_VERSION_LABEL = "F/W Version:";
    private static final String SOFTWARE_VERSION_LABEL = "S/W Version:";
    private static final String HARDWARE_VERSION_LABEL = "H/W Version:";

    private static final String VENDOR_NAME_LABEL = "Vendor Name:";
    private static final String VENDOR_ID_LABEL = "Vendor ID:";

    private static final String FIRMWARE_SECTION_HEADING = "Firmware";
    private static final String FIRMWARE_SECTION_HEADING_DESCRIPTION = "Provides the firmware settings for the device description file.";

    private static final String ADD_BUTTON_LABEL = "Add...";
    private static final String EDIT_BUTTON_LABEL = "Edit...";
    private static final String DELETE_BUTTON_LABEL = "Delete";

    private static final String PROJECT_INFORMATION_VENDOR_NAME = "Kalycito Infotech Private Limited & B&R Industrial Automation GmbH";
    private static final String PROJECT_INFORMATION_TOOL_NAME = "Ethernet POWERLINK XDD Editor";
    private static final String PROJECT_INFORMATION_VERSION_NUMBER = "1.0";

    private static final String DEVICE_COMMUNICATION_INFORMATION_SECTION = "Communication";
    private static final String DEVICE_COMMUNICATION_INFORMATION_SECTION_DESCRIPTION = "Provides links to the editor and communication sections.";
    private static final String OBJECT_DICTIONARY_HYPERLINK_SECTION = "Object Dictionary";
    private static final String NETWORK_MANAGEMENT_HYPERLINK_SECTION = "Network Management";

    private static final String FORM_EDITOR_PAGE_TITLE = "Device Description File Editor";

    private static final String INVALID_VENDOR_ID = "Invalid vendor ID for the device.";
    private static final String INVALID_VENDOR_ID_NULL_ERROR = "Vendor ID cannot be empty.";
    private static final String INVALID_PRODUCT_ID_NULL_ERROR = "Product ID cannot be empty.";
    private static final String INVALID_PRODUCT_NAME_EMPTY_ERROR = "Product name cannot be empty.";
    private static final String INVALID_HARDWARE_VERSION_VALUE = "Hardware version value {0} is invalid for the device.";
    private static final String INVALID_SOFTWARE_VERSION_VALUE = "Software version value {0} is invalid for the device.";
    private static final String INVALID_FIRMWARE_VERSION_VALUE = "Firmware version value {0} is invalid for the device.";
    private static final String SPACE_ERROR_MESSAGE_HARDWARE_VERSION = "Hardware version value cannot have space as the first character.";
    private static final String SPACE_ERROR_MESSAGE_SOFTWARE_VERSION = "Software version value cannot have space as the first character.";
    private static final String SPACE_ERROR_MESSAGE_FIRMWARE_VERSION = "Firmware version value cannot have space as the first character.";
    private static final String SPACE_ERROR_MESSAGE_VENDOR_NAME_VERSION = "Vendor name cannot have space as the first character.";
    private static final String SPACE_ERROR_MESSAGE_PRODUCT_NAME_VERSION = "Product name value cannot have space as the first character.";
    private static final String INVALID_PRODUCT_ID_VALUE = "Invalid product ID for the device.";
    private static final String INVALID_VENDOR_NAME_EMPTY_ERROR = "Vendor name cannot be empty.";
    private static final String OBJECT_DICTIONARY_HYPERLINK_DESCRIPTION = ": Edit the POWERLINK object dictionary of the device.";
    private static final String NETWORK_MANAGEMENT_HYPERLINK_DESCRIPTION = ": Configure network management properties.";
    private static final String VENDOR_ID_VAL_DOES_NOT_FIT_IN_RANGE = "Vendor ID value {0} does not fit within the range (0 - 4,294,967,295) of data type 'Unsigned32'.";
    private static final String PRODUCT_ID_VAL_DOES_NOT_FIT_IN_RANGE = "Product ID value {0} does not fit within the range (0 - 4,294,967,295) of data type 'Unsigned32'.";

    private static final String PROJECT_INFORMATION_SECTION_HEADING = "File Information";
    private static final String PROJECT_INFORMATION_SECTION_HEADING_DESCRIPTION = "Provides the device description file information.";
    private static final String GENERATOR_SECTION_MODIFIED_BY_LABEL = "Modified By:";
    private static final String GENERATOR_SECTION_CREATED_BY_LABEL = "Created By:";
    private static final String GENERATOR_SECTION_MODIFIED_ON_LABEL = "Modified On:";
    private static final String GENERATOR_SECTION_CREATED_ON_LABEL = "Created On:";
    private static final String GENERATOR_SECTION_VERSION_LABEL = "Version:";
    private static final String GENERATOR_SECTION_TOOL_NAME_LABEL = "Tool Name:";
    private static final String GENERATOR_SECTION_VENDOR_NAME_LABEL = "Vendor:";
    public static final String FIRMWARE_LIST = "Firmware List";

    /**
     * Name verify listener
     */
    private NameVerifyListener nameVerifyListener = new NameVerifyListener();

    private FirmwareTypeImpl firmwareObj;

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

    /**
     * Toolkit for the form editor.
     */
    private FormToolkit toolkit;
    private DeviceDescriptionFileEditor editor;

    /**
     * Controls for generator tag
     */
    private Text vendorNameText;
    private Text vendorIdText;
    private Text hwVersionText;
    private Text productNameText;
    private Text swVersionText;
    private Text fwVersionText;
    private Text productIdText;

    /**
     * Controls for Image setting tag
     */
    private Button addImageSettingsButton;
    private Button editImageSettingsButton;
    private Button deleteImageSettingsButton;

    private Text generatorToolNameText;
    private Text generatorVendorText;
    private Text generatorVersionText;
    private Text generatorCreatedByText;
    private Text generatorCreatedOnText;
    private Text generatorModifiedOnText;
    private Text generatorModifiedByText;

    /**
     * Controls for Firmware setting tag
     */
    private Button addFirmwareSettingsButton;
    private Button editFirmwareSettingsButton;
    private Button deleteFirmwareSettingsButton;

    private DocumentRoot documentRoot;

    private TreeViewer listViewer;

    /**
     * Constructor to initialize the editor page
     *
     * @param editor
     *            Instance of device description file editor
     * @param title
     *            Name of editor page
     * @param documentRoot
     *            Instance of document root
     */
    public DeviceDescriptionFileEditorPage(DeviceDescriptionFileEditor editor, final String title,
            DocumentRoot documentRoot) {
        super(editor, DeviceDescriptionFileEditorPage.ID, title);
        this.editor = editor;
        this.documentRoot = documentRoot;
    }

    /**
     * Create the GUI controls for the Image section of device description file
     * model.
     *
     * @param managedForm
     *            The instance of the form editor.
     */
    private void createDevImageSection(final IManagedForm managedForm) {
        Section deviceImageSection = managedForm.getToolkit().createSection(managedForm.getForm().getBody(),
                ExpandableComposite.EXPANDED | Section.DESCRIPTION | ExpandableComposite.TWISTIE
                        | ExpandableComposite.TITLE_BAR);
        managedForm.getToolkit().paintBordersFor(deviceImageSection);
        deviceImageSection.setText(DeviceDescriptionFileEditorPage.DEVICE_IMAGES_SECTION_HEADING);
        deviceImageSection.setDescription(DeviceDescriptionFileEditorPage.DEVICE_IMAGE_SECTION_HEADING_DESCRIPTION);

        Composite clientComposite = toolkit.createComposite(deviceImageSection, SWT.WRAP);
        GridLayout layout = new GridLayout(3, false);
        layout.marginWidth = 2;
        layout.marginHeight = 2;
        clientComposite.setLayout(layout);
        toolkit.paintBordersFor(clientComposite);

        deviceImageSection.setClient(clientComposite);

        TreeViewer listViewer = new TreeViewer(clientComposite, SWT.BORDER | SWT.V_SCROLL);
        Tree lst_no_foi = listViewer.getTree();

        GridData pst = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 3);

        pst.heightHint = 180;
        pst.widthHint = 526;
        lst_no_foi.setLayoutData(pst);

        addImageSettingsButton = toolkit.createButton(clientComposite, DeviceDescriptionFileEditorPage.ADD_BUTTON_LABEL,
                SWT.PUSH);
        pst = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
        addImageSettingsButton.setLayoutData(pst);
        toolkit.adapt(addImageSettingsButton, true, true);

        editImageSettingsButton = toolkit.createButton(clientComposite,
                DeviceDescriptionFileEditorPage.EDIT_BUTTON_LABEL, SWT.PUSH);
        pst = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
        editImageSettingsButton.setLayoutData(pst);
        editImageSettingsButton.setEnabled(false);
        toolkit.adapt(editImageSettingsButton, true, true);

        deleteImageSettingsButton = toolkit.createButton(clientComposite,
                DeviceDescriptionFileEditorPage.DELETE_BUTTON_LABEL, SWT.PUSH);
        pst = new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1);
        deleteImageSettingsButton.setLayoutData(pst);
        deleteImageSettingsButton.setEnabled(false);
        toolkit.adapt(deleteImageSettingsButton, true, true);

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
        form.setText(DeviceDescriptionFileEditorPage.FORM_EDITOR_PAGE_TITLE);
        Composite body = form.getBody();
        toolkit.decorateFormHeading(form.getForm());
        toolkit.paintBordersFor(body);
        managedForm.setInput(getEditorInput());

        TableWrapLayout layout = new TableWrapLayout();
        layout.topMargin = DeviceDescriptionFileEditorPage.FORM_BODY_MARGIN_TOP;
        layout.bottomMargin = DeviceDescriptionFileEditorPage.FORM_BODY_MARGIN_BOTTOM;
        layout.leftMargin = DeviceDescriptionFileEditorPage.FORM_BODY_MARGIN_LEFT;
        layout.rightMargin = DeviceDescriptionFileEditorPage.FORM_BODY_MARGIN_RIGHT;
        layout.horizontalSpacing = DeviceDescriptionFileEditorPage.FORM_BODY_HORIZONTAL_SPACING;
        layout.verticalSpacing = DeviceDescriptionFileEditorPage.FORM_BODY_VERTICAL_SPACING;
        layout.makeColumnsEqualWidth = true;
        layout.numColumns = DeviceDescriptionFileEditorPage.FORM_BODY_NUMBER_OF_COLUMNS;
        body.setLayout(layout);

        createGeneralInfoWidgets(managedForm);

        createProjectInformationSection(managedForm);
        createHyperLinkSection(managedForm);
        // createDeviceFirmwwareSection(managedForm);
        // createDevImageSection(managedForm);

    }

    /**
     * Creates the section for the project information details.
     *
     * @param managedForm
     *            The parent form.
     */
    private void createProjectInformationSection(final IManagedForm managedForm) {
        Section projectInformationSection = toolkit.createSection(managedForm.getForm().getBody(),
                ExpandableComposite.EXPANDED | Section.DESCRIPTION | ExpandableComposite.TWISTIE
                        | ExpandableComposite.TITLE_BAR);
        managedForm.getToolkit().paintBordersFor(projectInformationSection);
        projectInformationSection.setText(DeviceDescriptionFileEditorPage.PROJECT_INFORMATION_SECTION_HEADING);
        projectInformationSection
                .setDescription(DeviceDescriptionFileEditorPage.PROJECT_INFORMATION_SECTION_HEADING_DESCRIPTION);

        Composite client = toolkit.createComposite(projectInformationSection, SWT.WRAP);
        GridLayout layout = new GridLayout(2, false);
        layout.marginWidth = 2;
        layout.marginHeight = 2;
        client.setLayout(layout);
        toolkit.paintBordersFor(client);
        projectInformationSection.setClient(client);

        Label generatorvendor = new Label(client, SWT.NONE);
        generatorvendor.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        generatorvendor.setText(DeviceDescriptionFileEditorPage.GENERATOR_SECTION_VENDOR_NAME_LABEL);
        toolkit.adapt(generatorvendor, true, true);
        generatorvendor.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        generatorVendorText = new Text(client, SWT.BORDER | SWT.WRAP);
        generatorVendorText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(generatorVendorText, true, true);
        generatorVendorText.setEnabled(false);
        generatorVendorText.setText(PROJECT_INFORMATION_VENDOR_NAME);

        Label generatortoolName = new Label(client, SWT.NONE);
        generatortoolName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        generatortoolName.setText(DeviceDescriptionFileEditorPage.GENERATOR_SECTION_TOOL_NAME_LABEL);
        toolkit.adapt(generatortoolName, true, true);
        generatortoolName.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        generatorToolNameText = new Text(client, SWT.BORDER | SWT.WRAP);
        generatorToolNameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(generatorToolNameText, true, true);
        generatorToolNameText.setEnabled(false);
        generatorToolNameText.setText(PROJECT_INFORMATION_TOOL_NAME);

        Label generatorVersion = new Label(client, SWT.NONE);
        generatorVersion.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        generatorVersion.setText(DeviceDescriptionFileEditorPage.GENERATOR_SECTION_VERSION_LABEL);
        toolkit.adapt(generatorVersion, true, true);
        generatorVersion.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        generatorVersionText = new Text(client, SWT.BORDER | SWT.WRAP);
        generatorVersionText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(generatorVersionText, true, true);
        generatorVersionText.setEnabled(false);
        generatorVersionText.setText(PROJECT_INFORMATION_VERSION_NUMBER);

        Label generatorCreatedOn = new Label(client, SWT.NONE);
        generatorCreatedOn.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        generatorCreatedOn.setText(DeviceDescriptionFileEditorPage.GENERATOR_SECTION_CREATED_ON_LABEL);
        toolkit.adapt(generatorCreatedOn, true, true);
        generatorCreatedOn.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        generatorCreatedOnText = new Text(client, SWT.BORDER | SWT.WRAP);
        generatorCreatedOnText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(generatorCreatedOnText, true, true);
        generatorCreatedOnText.setEnabled(false);

        Label generatorModifiedOn = new Label(client, SWT.NONE);
        generatorModifiedOn.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        generatorModifiedOn.setText(DeviceDescriptionFileEditorPage.GENERATOR_SECTION_MODIFIED_ON_LABEL);
        toolkit.adapt(generatorModifiedOn, true, true);
        generatorModifiedOn.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        generatorModifiedOnText = new Text(client, SWT.BORDER | SWT.WRAP);
        generatorModifiedOnText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(generatorModifiedOnText, true, true);
        generatorModifiedOnText.setEnabled(false);

        Label generatorCreatedBy = new Label(client, SWT.NONE);
        generatorCreatedBy.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        generatorCreatedBy.setText(DeviceDescriptionFileEditorPage.GENERATOR_SECTION_CREATED_BY_LABEL);
        toolkit.adapt(generatorCreatedBy, true, true);
        generatorCreatedBy.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        generatorCreatedByText = new Text(client, SWT.BORDER | SWT.WRAP);
        generatorCreatedByText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(generatorCreatedByText, true, true);
        generatorCreatedByText.setEnabled(false);

        Label generatorModifiedBy = new Label(client, SWT.NONE);
        generatorModifiedBy.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        generatorModifiedBy.setText(DeviceDescriptionFileEditorPage.GENERATOR_SECTION_MODIFIED_BY_LABEL);
        toolkit.adapt(generatorModifiedBy, true, true);
        generatorModifiedBy.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        generatorModifiedByText = new Text(client, SWT.BORDER | SWT.WRAP);
        generatorModifiedByText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(generatorModifiedByText, true, true);
        generatorModifiedByText.setEnabled(false);

        updateProjectInformation();

    }

    /**
     * Updates the project information details.
     */

    private void updateProjectInformation() {

        ProfileBodyDataType projectInformation = getProfileBody();
        if (projectInformation.getFileCreationDate() != null) {
            if (projectInformation.getFileCreationTime() != null) {
                generatorCreatedOnText.setText((projectInformation.getFileCreationDate().toString())
                        + (projectInformation.getFileCreationTime().toString()));
            }
        } else {
            generatorCreatedOnText.setText(StringUtils.EMPTY);
        }
        if (projectInformation.getFileModificationDate() != null) {
            if (projectInformation.getFileModificationTime() != null) {
                generatorModifiedOnText.setText((projectInformation.getFileModificationDate().toString())
                        + (projectInformation.getFileModificationTime().toString()));
            }
        } else {
            generatorModifiedOnText.setText(StringUtils.EMPTY);

        }
        if (projectInformation.getFileCreator() != null) {
            generatorCreatedByText.setText(projectInformation.getFileCreator());
        } else {
            generatorCreatedByText.setText(System.getProperty("user.name"));
        }
        if (projectInformation.getFileModifiedBy() != null) {
            generatorModifiedByText.setText(projectInformation.getFileModifiedBy());
        } else {
            generatorModifiedByText.setText(System.getProperty("user.name"));
        }
    }

    /**
     * Receives the project information details from the {@link DocumentRoot}.
     */
    public ProfileBodyDataType getProfileBody() {

        EList<ISO15745ProfileType> profiles = documentRoot.getISO15745ProfileContainer().getISO15745Profile();
        ISO15745ProfileType profile1 = profiles.get(0);
        ProfileBodyDataType projectInformation = profile1.getProfileBody();
        return projectInformation;
    }

    /**
     * Creates the widgets and controls for the model.
     *
     * @param managedForm
     *            The parent form.
     */
    private void createGeneralInfoWidgets(final IManagedForm managedForm) {

        Section generalInfoSection = toolkit.createSection(managedForm.getForm().getBody(), ExpandableComposite.EXPANDED
                | Section.DESCRIPTION | ExpandableComposite.TWISTIE | ExpandableComposite.TITLE_BAR);
        managedForm.getToolkit().paintBordersFor(generalInfoSection);
        generalInfoSection.setText(DeviceDescriptionFileEditorPage.GENERAL_INFORMATION_SECTION);
        generalInfoSection.setDescription(DeviceDescriptionFileEditorPage.GENERAL_SECTION_HEADING_DESCRIPTION);

        Composite client = toolkit.createComposite(generalInfoSection, SWT.WRAP);
        GridLayout layout = new GridLayout(2, false);
        layout.marginWidth = 2;
        layout.marginHeight = 2;
        client.setLayout(layout);
        toolkit.paintBordersFor(client);
        generalInfoSection.setClient(client);

        Label vendorIdLabel = new Label(client, SWT.NONE);
        vendorIdLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        vendorIdLabel.setText(DeviceDescriptionFileEditorPage.VENDOR_ID_LABEL);
        toolkit.adapt(vendorIdLabel, true, true);
        vendorIdLabel.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        vendorIdText = new Text(client, SWT.BORDER | SWT.WRAP | SWT.SEARCH);
        vendorIdText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(vendorIdText, true, true);
        vendorIdText.setMessage("Ex: 0x00000000");
        vendorIdText.setTextLimit(50);

        Label vendorNameLabel = new Label(client, SWT.NONE);
        vendorNameLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        vendorNameLabel.setText(DeviceDescriptionFileEditorPage.VENDOR_NAME_LABEL);
        toolkit.adapt(vendorNameLabel, true, true);
        vendorNameLabel.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        vendorNameText = new Text(client, SWT.BORDER | SWT.WRAP);
        vendorNameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(vendorNameText, true, true);
        vendorNameText.setTextLimit(50);

        Label hwVersionLabel = new Label(client, SWT.NONE);
        hwVersionLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        hwVersionLabel.setText(DeviceDescriptionFileEditorPage.HARDWARE_VERSION_LABEL);
        toolkit.adapt(hwVersionLabel, true, true);
        hwVersionLabel.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        hwVersionText = new Text(client, SWT.BORDER | SWT.WRAP);
        hwVersionText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(hwVersionText, true, true);
        hwVersionText.setTextLimit(50);

        Label swVersionLabel = new Label(client, SWT.NONE);
        swVersionLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        swVersionLabel.setText(DeviceDescriptionFileEditorPage.SOFTWARE_VERSION_LABEL);
        toolkit.adapt(swVersionLabel, true, true);
        swVersionLabel.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        swVersionText = new Text(client, SWT.BORDER | SWT.WRAP);
        swVersionText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(swVersionText, true, true);
        swVersionText.setTextLimit(50);

        Label fwVersionLabel = new Label(client, SWT.NONE);
        fwVersionLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        fwVersionLabel.setText(DeviceDescriptionFileEditorPage.FIRMWARE_VERSION_LABEL);
        toolkit.adapt(fwVersionLabel, true, true);
        fwVersionLabel.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        fwVersionText = new Text(client, SWT.BORDER | SWT.WRAP);
        fwVersionText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(fwVersionText, true, true);
        fwVersionText.setTextLimit(50);

        Label productnameLabel = new Label(client, SWT.NONE);
        productnameLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        productnameLabel.setText(DeviceDescriptionFileEditorPage.PRODUCT_NAME_LABEL);
        toolkit.adapt(productnameLabel, true, true);
        productnameLabel.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        productNameText = new Text(client, SWT.BORDER | SWT.WRAP);
        productNameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(productNameText, true, true);
        productNameText.setTextLimit(50);

        Label productIdlabel = new Label(client, SWT.NONE);
        productIdlabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        productIdlabel.setText(DeviceDescriptionFileEditorPage.PRODUCT_ID_LABEL);
        toolkit.adapt(productIdlabel, true, true);
        productIdlabel.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        productIdText = new Text(client, SWT.BORDER | SWT.WRAP | SWT.SEARCH);
        productIdText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(productIdText, true, true);
        productIdText.setMessage("Ex: 0x00000000");
        productIdText.setTextLimit(50);

        updateGeneralInfoFields();
        addListenersToControls();

    }

    private void addListenersToControls() {
        vendorIdText.addModifyListener(vendorIdModifyListener);
        vendorIdText.addVerifyListener(nameVerifyListener);
        vendorNameText.addModifyListener(vendorNameModifyListener);
        productIdText.addVerifyListener(nameVerifyListener);

        productIdText.addModifyListener(productIdModifyListener);
        productNameText.addModifyListener(productNameModifyListener);
        hwVersionText.addModifyListener(hardwareVerModifyListener);
        swVersionText.addModifyListener(softwareVerModifyListener);
        fwVersionText.addModifyListener(firmwareVerModifyListener);

    }

    private void setErrorMessage(String message, String fieldLabel) {
        if (form != null) {
            form.setMessage(message, IMessageProvider.ERROR);
            switch (fieldLabel) {
            case VENDOR_ID_LABEL:
                productIdText.setEditable(false);
                productNameText.setEditable(false);
                hwVersionText.setEditable(false);
                swVersionText.setEditable(false);
                fwVersionText.setEditable(false);
                vendorNameText.setEditable(false);
                break;
            case PRODUCT_ID_LABEL:
                vendorIdText.setEditable(false);
                productNameText.setEditable(false);
                hwVersionText.setEditable(false);
                swVersionText.setEditable(false);
                fwVersionText.setEditable(false);
                vendorNameText.setEditable(false);
                break;
            case PRODUCT_NAME_LABEL:
                vendorIdText.setEditable(false);
                productIdText.setEditable(false);
                hwVersionText.setEditable(false);
                swVersionText.setEditable(false);
                fwVersionText.setEditable(false);
                vendorNameText.setEditable(false);

                break;
            case VENDOR_NAME_LABEL:
                vendorIdText.setEditable(false);
                productIdText.setEditable(false);
                hwVersionText.setEditable(false);
                swVersionText.setEditable(false);
                fwVersionText.setEditable(false);
                productNameText.setEditable(false);
                break;
            case HARDWARE_VERSION_LABEL:
                vendorIdText.setEditable(false);
                productIdText.setEditable(false);
                vendorNameText.setEditable(false);
                swVersionText.setEditable(false);
                fwVersionText.setEditable(false);
                productNameText.setEditable(false);
                break;
            case SOFTWARE_VERSION_LABEL:
                vendorIdText.setEditable(false);
                productIdText.setEditable(false);
                vendorNameText.setEditable(false);
                hwVersionText.setEditable(false);
                fwVersionText.setEditable(false);
                productNameText.setEditable(false);
                break;
            case FIRMWARE_VERSION_LABEL:
                vendorIdText.setEditable(false);
                productIdText.setEditable(false);
                vendorNameText.setEditable(false);
                hwVersionText.setEditable(false);
                swVersionText.setEditable(false);
                productNameText.setEditable(false);
                break;
            default:
                break;
            }
        }
    }

    private void setErrorMessage(String message) {
        if (form != null) {
            form.setMessage(message, IMessageProvider.ERROR);
            if (message == null) {
                message = StringUtils.EMPTY;
                form.setMessage(message, IMessageProvider.NONE);
            }
            vendorIdText.setEditable(true);
            productIdText.setEditable(true);
            productNameText.setEditable(true);
            hwVersionText.setEditable(true);
            swVersionText.setEditable(true);
            fwVersionText.setEditable(true);
            vendorNameText.setEditable(true);
        }
    }

    /**
     * @return TDevice Identity of XDD file
     */
    public TDeviceIdentity getDeviceIdentity() {

        EList<ISO15745ProfileType> profiles = documentRoot.getISO15745ProfileContainer().getISO15745Profile();
        ISO15745ProfileType profile1 = profiles.get(0);

        ProfileBodyDataType body1 = profile1.getProfileBody();
        EList<EObject> bodyContents = body1.eContents();
        EObject identity = bodyContents.get(0);
        TDeviceIdentity tDeviceIdentity = (TDeviceIdentity) identity;

        return tDeviceIdentity;
    }

    private ModifyListener vendorIdModifyListener = new ModifyListener() {

        @Override
        public void modifyText(ModifyEvent e) {

            setErrorMessage(null);

            String vendorId = vendorIdText.getText();
            try {

                if (vendorId == null) {
                    setErrorMessage(INVALID_VENDOR_ID_NULL_ERROR, VENDOR_ID_LABEL);
                    return;
                }

                if (vendorId.length() <= 0) {
                    setErrorMessage(INVALID_VENDOR_ID_NULL_ERROR, VENDOR_ID_LABEL);
                    return;
                }

                // Space as first character is not allowed. ppc:tNonEmptyString
                if (vendorId.contains(" ")) {
                    setErrorMessage(INVALID_VENDOR_ID, VENDOR_ID_LABEL);
                    return;
                }

                if (vendorId.contains("0x")) {
                    String val = vendorId.substring(2);

                    if (vendorId.length() > 10) {
                        setErrorMessage(INVALID_VENDOR_ID, VENDOR_ID_LABEL);
                        return;
                    }
                    if (!val.isEmpty()) {
                        long vendorIdVal = Long.parseLong(val, 16);
                        if (vendorIdVal < DataTypeRange.Unsigned32_min || vendorIdVal > DataTypeRange.Unsigned32_max) {
                            setErrorMessage(MessageFormat.format(VENDOR_ID_VAL_DOES_NOT_FIT_IN_RANGE, vendorIdVal));
                            return;

                        }
                    }
                } else {
                    setErrorMessage(INVALID_VENDOR_ID, VENDOR_ID_LABEL);

                    return;
                }

                if (getDeviceIdentity().getVendorID() != null) {
                    getDeviceIdentity().getVendorID().setValue(vendorId);
                } else {
                    TVendorID venId = XDDFactory.eINSTANCE.createTVendorID();
                    getDeviceIdentity().setVendorID(venId);
                    venId.setValue(vendorId);
                }
                updateDocument(documentRoot);
            } catch (NumberFormatException ex) {
                setErrorMessage(INVALID_VENDOR_ID, VENDOR_ID_LABEL);
                ex.printStackTrace();
                return;
            }

        }
    };

    private ModifyListener productNameModifyListener = new ModifyListener() {

        @Override
        public void modifyText(ModifyEvent e) {

            setErrorMessage(null);

            String productName = productNameText.getText();
            try {

                if (productName.isEmpty()) {
                    setErrorMessage(INVALID_PRODUCT_NAME_EMPTY_ERROR, PRODUCT_NAME_LABEL);
                    return;
                }

                if (productName.length() <= 0) {
                    setErrorMessage(INVALID_PRODUCT_NAME_EMPTY_ERROR, PRODUCT_NAME_LABEL);
                    return;
                }

                if (productName.startsWith(" ")) {
                    setErrorMessage(SPACE_ERROR_MESSAGE_PRODUCT_NAME_VERSION, PRODUCT_NAME_LABEL);
                }

                if (getDeviceIdentity().getProductName() != null) {
                    getDeviceIdentity().getProductName().setValue(productName);
                } else {
                    ProductNameType productNameVal = XDDFactory.eINSTANCE.createProductNameType();
                    getDeviceIdentity().setProductName(productNameVal);
                    productNameVal.setValue(productName);
                }
                updateDocument(documentRoot);
            } catch (NumberFormatException ex) {
                setErrorMessage(INVALID_PRODUCT_NAME_EMPTY_ERROR, PRODUCT_NAME_LABEL);
                ex.printStackTrace();
                return;
            }

        }
    };

    private ModifyListener hardwareVerModifyListener = new ModifyListener() {

        @Override
        public void modifyText(ModifyEvent e) {

            setErrorMessage(null);

            String hardwareVerText = hwVersionText.getText();
            try {

                if (hardwareVerText.startsWith(" ")) {
                    setErrorMessage(SPACE_ERROR_MESSAGE_HARDWARE_VERSION, HARDWARE_VERSION_LABEL);
                }

                if (getDeviceIdentity().getVersion() != null) {
                    List<TVersion> deviceIdentityVersion = getDeviceIdentity().getVersion();
                    boolean hwVersionAvailable = false;
                    for (TVersion version : deviceIdentityVersion) {
                        if (version.getVersionType().getName().equalsIgnoreCase("HW")) {
                            version.setValue(hardwareVerText);
                            hwVersionAvailable = true;
                        }
                    }
                    if (!hwVersionAvailable) {
                        TVersion hwVersion = XDDFactory.eINSTANCE.createTVersion();
                        hwVersion.setVersionType(VersionTypeType.HW);
                        hwVersion.setValue(hardwareVerText);
                        getDeviceIdentity().getVersion().add(hwVersion);
                    }

                }

                updateDocument(documentRoot);
            } catch (NumberFormatException ex) {
                setErrorMessage(MessageFormat.format(INVALID_HARDWARE_VERSION_VALUE, "'" + hardwareVerText + "'"),
                        HARDWARE_VERSION_LABEL);
                ex.printStackTrace();
                return;
            }

        }
    };

    private ModifyListener softwareVerModifyListener = new ModifyListener() {

        @Override
        public void modifyText(ModifyEvent e) {

            setErrorMessage(null);

            String softwareVerText = swVersionText.getText();
            try {

                if (softwareVerText.startsWith(" ")) {
                    setErrorMessage(SPACE_ERROR_MESSAGE_SOFTWARE_VERSION, SOFTWARE_VERSION_LABEL);
                }

                if (getDeviceIdentity().getVersion() != null) {
                    List<TVersion> deviceIdentityVersion = getDeviceIdentity().getVersion();
                    boolean swVersionAvailable = false;
                    for (TVersion version : deviceIdentityVersion) {
                        if (version.getVersionType().getName().equalsIgnoreCase("SW")) {
                            version.setValue(softwareVerText);
                            swVersionAvailable = true;
                        }
                    }
                    if (!swVersionAvailable) {
                        TVersion hwVersion = XDDFactory.eINSTANCE.createTVersion();
                        hwVersion.setVersionType(VersionTypeType.SW);
                        hwVersion.setValue(softwareVerText);
                        getDeviceIdentity().getVersion().add(hwVersion);
                    }

                }

                updateDocument(documentRoot);
            } catch (NumberFormatException ex) {
                setErrorMessage(MessageFormat.format(INVALID_SOFTWARE_VERSION_VALUE, "'" + softwareVerText + "'"),
                        SOFTWARE_VERSION_LABEL);
                ex.printStackTrace();
                return;
            }

        }
    };

    private ModifyListener firmwareVerModifyListener = new ModifyListener() {

        @Override
        public void modifyText(ModifyEvent e) {

            setErrorMessage(null);

            String firmwareVerText = fwVersionText.getText();
            try {

                if (firmwareVerText.startsWith(" ")) {
                    setErrorMessage(SPACE_ERROR_MESSAGE_FIRMWARE_VERSION, FIRMWARE_VERSION_LABEL);
                }

                if (getDeviceIdentity().getVersion() != null) {
                    List<TVersion> deviceIdentityVersion = getDeviceIdentity().getVersion();
                    boolean swVersionAvailable = false;
                    for (TVersion version : deviceIdentityVersion) {
                        if (version.getVersionType().getName().equalsIgnoreCase("FW")) {
                            version.setValue(firmwareVerText);
                            swVersionAvailable = true;
                        }
                    }
                    if (!swVersionAvailable) {
                        TVersion fwVersion = XDDFactory.eINSTANCE.createTVersion();
                        fwVersion.setVersionType(VersionTypeType.FW);
                        fwVersion.setValue(firmwareVerText);
                        getDeviceIdentity().getVersion().add(fwVersion);
                    }

                }

                updateDocument(documentRoot);
            } catch (NumberFormatException ex) {
                setErrorMessage(MessageFormat.format(INVALID_FIRMWARE_VERSION_VALUE, "'" + firmwareVerText + "'"),
                        FIRMWARE_VERSION_LABEL);
                ex.printStackTrace();
                return;
            }

        }
    };

    private ModifyListener productIdModifyListener = new ModifyListener() {

        @Override
        public void modifyText(ModifyEvent e) {

            setErrorMessage(null);

            String productId = productIdText.getText();
            try {

                if (productId.isEmpty()) {
                    setErrorMessage(INVALID_PRODUCT_ID_NULL_ERROR, PRODUCT_ID_LABEL);
                    return;
                }

                if (productId.length() <= 0) {
                    setErrorMessage(INVALID_PRODUCT_ID_NULL_ERROR, PRODUCT_ID_LABEL);
                    return;
                }

                // Space as first character is not allowed. ppc:tNonEmptyString
                if (productId.contains(" ")) {
                    setErrorMessage(INVALID_PRODUCT_ID_VALUE, PRODUCT_ID_LABEL);
                    return;
                }

                if (productId.contains("0x")) {
                    String val = productId.substring(2);
                    if (productId.length() > 10) {
                        setErrorMessage(INVALID_PRODUCT_ID_VALUE, PRODUCT_ID_LABEL);
                        return;
                    }
                    if (!val.isEmpty()) {
                        long productIdVal = Long.parseLong(val, 16);
                        if (productIdVal < DataTypeRange.Unsigned32_min
                                || productIdVal > DataTypeRange.Unsigned32_max) {
                            setErrorMessage(MessageFormat.format(PRODUCT_ID_VAL_DOES_NOT_FIT_IN_RANGE, productIdVal));
                            return;

                        }
                    }
                } else {
                    setErrorMessage(INVALID_PRODUCT_ID_VALUE, PRODUCT_ID_LABEL);

                    return;
                }

                if (getDeviceIdentity().getProductID() != null) {
                    getDeviceIdentity().getProductID().setValue(productId);
                } else {
                    TProductID prodId = XDDFactory.eINSTANCE.createTProductID();
                    getDeviceIdentity().setProductID(prodId);
                    prodId.setValue(productId);
                }
                updateDocument(documentRoot);
            } catch (NumberFormatException ex) {
                setErrorMessage(INVALID_PRODUCT_ID_VALUE, PRODUCT_ID_LABEL);
                ex.printStackTrace();
                return;
            }

        }
    };

    private ModifyListener vendorNameModifyListener = new ModifyListener() {

        @Override
        public void modifyText(ModifyEvent e) {

            setErrorMessage(null);

            String vendorName = vendorNameText.getText();
            try {

                if (vendorName.isEmpty()) {
                    setErrorMessage(INVALID_VENDOR_NAME_EMPTY_ERROR, VENDOR_NAME_LABEL);
                    return;
                }

                if (vendorName.length() <= 0) {
                    setErrorMessage(INVALID_VENDOR_NAME_EMPTY_ERROR, VENDOR_NAME_LABEL);
                    return;
                }

                if (vendorName.startsWith(" ")) {
                    setErrorMessage(SPACE_ERROR_MESSAGE_VENDOR_NAME_VERSION, VENDOR_NAME_LABEL);
                }

                if (getDeviceIdentity().getVendorName() != null) {
                    getDeviceIdentity().getVendorName().setValue(vendorName);
                } else {
                    VendorNameType venName = XDDFactory.eINSTANCE.createVendorNameType();
                    getDeviceIdentity().setVendorName(venName);
                    venName.setValue(vendorName);
                }
                updateDocument(documentRoot);
            } catch (NumberFormatException ex) {
                setErrorMessage(INVALID_VENDOR_NAME_EMPTY_ERROR, VENDOR_NAME_LABEL);
                ex.printStackTrace();
                return;
            }

        }
    };

    /**
     * Verifies whether the entered value is updated in XDD file
     *
     * @param documentRoot
     *            Instance of XDD file
     * @return <code>True</code> If value is updated in document,
     *         <code>False</code> otherwise.
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
        options.put(XMLResource.OPTION_ENCODING, "UTF-8");
        try {
            resource.save(options);

            return true;
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        return false;
    }

    private void updateGeneralInfoFields() {
        TDeviceIdentity tDeviceIdentity = getDeviceIdentity();

        if (tDeviceIdentity.getVendorID() != null) {
            vendorIdText.setText(tDeviceIdentity.getVendorID().getValue());
        } else {
            vendorIdText.setText(StringUtils.EMPTY);
        }

        if (tDeviceIdentity.getProductID() != null) {
            productIdText.setText(tDeviceIdentity.getProductID().getValue());
        } else {
            productIdText.setText(StringUtils.EMPTY);
        }

        if (tDeviceIdentity.getProductName() != null) {
            productNameText.setText(tDeviceIdentity.getProductName().getValue());
        } else {
            productNameText.setText(StringUtils.EMPTY);
        }

        if (tDeviceIdentity.getVendorName() != null) {
            vendorNameText.setText(tDeviceIdentity.getVendorName().getValue());
        } else {
            vendorNameText.setText(StringUtils.EMPTY);
        }

        if (tDeviceIdentity.getVersion() != null) {
            List<TVersion> deviceIdentityVersion = tDeviceIdentity.getVersion();
            swVersionText.setText(StringUtils.EMPTY);
            hwVersionText.setText(StringUtils.EMPTY);
            fwVersionText.setText(StringUtils.EMPTY);
            for (TVersion version : deviceIdentityVersion) {
                if (version.getVersionType().getName().equalsIgnoreCase("SW")) {
                    swVersionText.setText(version.getValue());
                } else if (version.getVersionType().getName().equalsIgnoreCase("HW")) {
                    hwVersionText.setText(version.getValue());
                } else if (version.getVersionType().getName().equalsIgnoreCase("FW")) {
                    fwVersionText.setText(version.getValue());
                }
            }
        }
    }

    /**
     * Content provider to list the firmware
     *
     * @author Sree Hari Vignesh B
     *
     */
    private class FirmwareContentProvider implements ITreeContentProvider {

        public FirmwareContentProvider() {
        }

        @Override
        public void dispose() {
        }

        @Override
        public Object[] getChildren(Object parentElement) {
            if (parentElement instanceof TFirmwareList) {
                TFirmwareList objItem = (TFirmwareList) parentElement;
                return objItem.getFirmware().toArray();
            }
            return new Object[0];
        }

        @Override
        public Object[] getElements(Object inputElement) {

            if (inputElement instanceof EClass) {
                EClass obj = (EClass) inputElement;
                List<TFirmwareList> tFirmware = XDDUtilities.findEObjects(documentRoot, obj);
                return tFirmware.toArray();
            }

            return new Object[0];
        }

        @Override
        public Object getParent(Object element) {
            return null;
        }

        @Override
        public boolean hasChildren(Object element) {
            if (element instanceof TFirmwareList) {
                TFirmwareList object = (TFirmwareList) element;
                return ((object.getFirmware().size() > 0) ? true : false);
            }
            return false;
        }

        @Override
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        }
    }

    /**
     * Label provider for the list of firmware
     *
     * @author Sree Hari Vignesh B
     *
     */
    private static class FirmwareLabelProvider extends LabelProvider {

        org.eclipse.swt.graphics.Image firmwareListicon;

        public FirmwareLabelProvider() {
            firmwareListicon = AbstractUIPlugin
                    .imageDescriptorFromPlugin("com.br_automation.buoat.xddeditor.editor", IPluginImages.OBJECT_ICON)
                    .createImage();
        }

        @Override
        public void dispose() {
            firmwareListicon.dispose();
        }

        @Override
        public org.eclipse.swt.graphics.Image getImage(Object obj) {
            if (obj instanceof TFirmwareList) {

                return firmwareListicon;
            }
            return null;
        }

        @Override
        public String getText(Object element) {
            if (element instanceof TFirmwareList) {
                return FIRMWARE_LIST;
            } else if (element instanceof FirmwareType) {
                FirmwareType subObj = (FirmwareType) element;
                String firmware = subObj.getURI();
                return firmware;
            }
            return StringUtils.EMPTY;
        }
    }

    /**
     * Creates the widgets and controls for the device firmware model.
     *
     * @param managedForm
     *            The parent form.
     */
    private void createDeviceFirmwwareSection(final IManagedForm managedForm) {
        Section deviceFirmwareSection = managedForm.getToolkit().createSection(managedForm.getForm().getBody(),
                ExpandableComposite.EXPANDED | Section.DESCRIPTION | ExpandableComposite.TWISTIE
                        | ExpandableComposite.TITLE_BAR);
        managedForm.getToolkit().paintBordersFor(deviceFirmwareSection);
        deviceFirmwareSection.setText(DeviceDescriptionFileEditorPage.FIRMWARE_SECTION_HEADING);
        deviceFirmwareSection.setDescription(DeviceDescriptionFileEditorPage.FIRMWARE_SECTION_HEADING_DESCRIPTION);

        Composite clientComposite = toolkit.createComposite(deviceFirmwareSection, SWT.WRAP);
        GridLayout layout = new GridLayout(3, false);
        layout.marginHeight = 15;
        layout.marginBottom = 15;
        clientComposite.setLayout(layout);
        toolkit.paintBordersFor(clientComposite);

        deviceFirmwareSection.setClient(clientComposite);

        listViewer = new TreeViewer(clientComposite, SWT.BORDER | SWT.V_SCROLL);
        Tree lst_no_foi = listViewer.getTree();

        GridData pst = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 3);
        pst.heightHint = 180;
        pst.widthHint = 626;
        lst_no_foi.setLayoutData(pst);

        listViewer.setContentProvider(new FirmwareContentProvider());
        listViewer.setLabelProvider(new FirmwareLabelProvider());
        listViewer.setInput(XDDPackage.eINSTANCE.getTFirmwareList());

        addFirmwareSettingsButton = toolkit.createButton(clientComposite,
                DeviceDescriptionFileEditorPage.ADD_BUTTON_LABEL, SWT.PUSH);
        pst = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
        addFirmwareSettingsButton.setLayoutData(pst);
        toolkit.adapt(addFirmwareSettingsButton, true, true);

        editFirmwareSettingsButton = toolkit.createButton(clientComposite,
                DeviceDescriptionFileEditorPage.EDIT_BUTTON_LABEL, SWT.PUSH);
        pst = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
        editFirmwareSettingsButton.setLayoutData(pst);
        editFirmwareSettingsButton.setEnabled(false);
        toolkit.adapt(editFirmwareSettingsButton, true, true);

        deleteFirmwareSettingsButton = toolkit.createButton(clientComposite,
                DeviceDescriptionFileEditorPage.DELETE_BUTTON_LABEL, SWT.PUSH);
        pst = new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1);
        deleteFirmwareSettingsButton.setLayoutData(pst);
        deleteFirmwareSettingsButton.setEnabled(false);
        toolkit.adapt(deleteFirmwareSettingsButton, true, true);

        listViewer.addSelectionChangedListener(new ISelectionChangedListener() {

            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                IStructuredSelection selectionEvent = (IStructuredSelection) event.getSelection();
                Object selectedobject = selectionEvent.getFirstElement();
                if (selectedobject instanceof FirmwareTypeImpl) {
                    editFirmwareSettingsButton.setEnabled(true);
                    deleteFirmwareSettingsButton.setEnabled(true);
                    firmwareObj = (FirmwareTypeImpl) selectedobject;
                } else {
                    editFirmwareSettingsButton.setEnabled(false);
                    deleteFirmwareSettingsButton.setEnabled(false);
                }
            }
        });
        addListenerstoControls();

    }

    private void addListenerstoControls() {
        addFirmwareSettingsButton.addSelectionListener(addFirmwareWizardSelectionAdapter);
        editFirmwareSettingsButton.addSelectionListener(editFirmwareWizardSelectionAdapter);
        deleteFirmwareSettingsButton.addSelectionListener(removeFirmwareWizardSelectionAdapter);

    }

    /**
     * @return TDeviceFunction from XDD file
     */
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

    private SelectionAdapter addFirmwareWizardSelectionAdapter = new SelectionAdapter() {

        @Override
        public void widgetSelected(SelectionEvent e) {
            boolean editFirmware = false;
            NewFirmwareWizard firmwareWizard = new NewFirmwareWizard(documentRoot, editor, editFirmware);

            WizardDialog dialog = new WizardDialog(Display.getDefault().getActiveShell(), firmwareWizard);
            dialog.setTitle(firmwareWizard.getWindowTitle());
            dialog.open();

            listViewer.setInput(XDDPackage.eINSTANCE.getTFirmwareList());
        }
    };

    private SelectionAdapter editFirmwareWizardSelectionAdapter = new SelectionAdapter() {

        @Override
        public void widgetSelected(SelectionEvent e) {
            boolean editFirmware = true;
            NewFirmwareWizard firmwareWizard = new NewFirmwareWizard(documentRoot, editor, editFirmware, firmwareObj);

            WizardDialog dialog = new WizardDialog(Display.getDefault().getActiveShell(), firmwareWizard);
            dialog.setTitle(firmwareWizard.getWindowTitle());
            dialog.open();

            listViewer.setInput(XDDPackage.eINSTANCE.getTFirmwareList());
        }
    };

    private SelectionAdapter removeFirmwareWizardSelectionAdapter = new SelectionAdapter() {

        @Override
        public void widgetSelected(SelectionEvent e) {

            getDeviceFunction().getFirmwareList().getFirmware().remove(firmwareObj);
            updateDocument(documentRoot);
            listViewer.setInput(XDDPackage.eINSTANCE.getTFirmwareList());
        }
    };

    /**
     * Creates the widgets and controls for the shortcut to editor page.
     *
     * @param managedForm
     *            The parent form.
     */
    private void createHyperLinkSection(final IManagedForm managedForm) {
        Section hyperLinkSection = toolkit.createSection(managedForm.getForm().getBody(), ExpandableComposite.EXPANDED
                | Section.DESCRIPTION | ExpandableComposite.TWISTIE | ExpandableComposite.TITLE_BAR);
        managedForm.getToolkit().paintBordersFor(hyperLinkSection);
        hyperLinkSection.setText(DeviceDescriptionFileEditorPage.DEVICE_COMMUNICATION_INFORMATION_SECTION);
        hyperLinkSection.setDescription(DEVICE_COMMUNICATION_INFORMATION_SECTION_DESCRIPTION);
        Composite client = toolkit.createComposite(hyperLinkSection, SWT.WRAP);
        GridLayout layout = new GridLayout(2, false);
        layout.marginWidth = 2;
        layout.marginHeight = 2;
        client.setLayout(layout);
        toolkit.paintBordersFor(client);
        hyperLinkSection.setClient(client);

        Hyperlink nwMgmtLink = toolkit.createHyperlink(client,
                DeviceDescriptionFileEditorPage.NETWORK_MANAGEMENT_HYPERLINK_SECTION, SWT.LEFT | SWT.WRAP);
        nwMgmtLink.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(nwMgmtLink, true, true);
        nwMgmtLink.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));
        nwMgmtLink.addHyperlinkListener(new HyperlinkAdapter() {
            @Override
            public void linkActivated(HyperlinkEvent e) {
                editor.setActivePage("com.buoat.xddeditor.editors.NetworkManagementEditorPage");
            }
        });

        Label nwMngmtLabel = new Label(client, SWT.WRAP);
        nwMngmtLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
        nwMngmtLabel.setText(NETWORK_MANAGEMENT_HYPERLINK_DESCRIPTION);
        toolkit.adapt(nwMngmtLabel, true, true);

        Hyperlink objDictionaryLink = toolkit.createHyperlink(client,
                DeviceDescriptionFileEditorPage.OBJECT_DICTIONARY_HYPERLINK_SECTION, SWT.RIGHT | SWT.WRAP);
        objDictionaryLink.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(objDictionaryLink, true, true);
        objDictionaryLink.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));
        objDictionaryLink.addHyperlinkListener(new HyperlinkAdapter() {
            @Override
            public void linkActivated(HyperlinkEvent e) {
                editor.setActivePage("com.buoat.xddeditor.editors.objectDictionaryEditorPage");
            }
        });

        Label obdLabel = new Label(client, SWT.WRAP);
        obdLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
        obdLabel.setText(OBJECT_DICTIONARY_HYPERLINK_DESCRIPTION);
        toolkit.adapt(obdLabel, true, true);

    }

    /**
     * Handles the save actions for the file editor page
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

}
