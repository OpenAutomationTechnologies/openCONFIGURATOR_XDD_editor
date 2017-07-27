/*******************************************************************************
 * @file   IndustrialNetworkProjectEditorPage.java
 *
 * @author Ramakrishnan Periyakaruppan, Kalycito Infotech Private Limited.
 *
 * @copyright (c) 2015, Kalycito Infotech Private Limited
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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
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
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
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

/**
 * The editor page to manipulate the openCONFIGURATOR project.
 *
 * @author Ramakrishnan P
 *
 */
public final class DeviceDescriptionFileEditorPage extends FormPage {

	/** Identifier */
	private static final String ID = "org.epsg.openconfigurator.editors.IndustrialNetworkProjectEditorPage";

	/** Editor label and error messages */
	private static final String DEVICE_IMAGES_SECTION_HEADING = "Device Images and Connectors Information";
	private static final String DEVICE_IMAGE_SECTION_HEADING_DESCRIPTION = "Provides the image and connector information of device.";
	

	private static final String GENERAL_INFORMATION_SECTION = "General Information";
	private static final String GENERAL_SECTION_HEADING_DESCRIPTION = "Provides general information about device descripton file.";
	private static final String PRODUCT_ID_LABEL = "Product ID:*";
	private static final String PRODUCT_NAME_LABEL = "Product Name:*";
	private static final String FIRMWARE_VERSION_LABEL = "F/W version:*";
	private static final String SOFTWARE_VERSION_LABEL = "S/W version:*";
	private static final String HARDWARE_VERSION_LABEL = "H/W version:*";

	private static final String VENDOR_NAME_LABEL = "Vendor Name:*";
	private static final String VENDOR_ID_LABEL = "Vendor ID:*";

	private static final String FIRMWARE_SECTION_HEADING = "Device Firmware Information";
	private static final String FIRMWARE_SECTION_HEADING_DESCRIPTION = "Provides the firmware settings for the device description file.";

	private static final String PATH_SECTION_INFO_LABEL = "Configure the specific path settings:";
	private static final String ADD_BUTTON_LABEL = "Add...";
	private static final String EDIT_BUTTON_LABEL = "Edit...";
	private static final String DELETE_BUTTON_LABEL = "Delete";

	private static final String DEVICE_COMMUNICATION_INFORMATION_SECTION = "Device Communication Information";
	private static final String OBJECT_DICTIONARY_HYPERLINK_SECTION = "Object Dictionary";
	private static final String NETWORK_MANAGEMENT_HYPERLINK_SECTION = "Network Management";

	private static final String NO_ROWS_SELECTED_ERROR = "No rows selected.";
	private static final String MULTIPLE_SELECTION_NOT_ALLOWED_ERROR = "Multiple rows selection is not supported.";
	private static final String NO_LISTENERS_REGISTERED_ERROR = "New widget has registered but not handled.";
	private static final String ERROR_MESSAGE = "{0} generation of all the works.";
	private static final String ERROR_INITIALISATION_FAILED = "Error initializing the project configuration data";
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
	private Text hardwareVersionText;
	private Text productNameText;
	private Text swVersionText;
	private Text fwVersionText;

	private Text productIdText;
	/**
	 * Controls for project configuration tag
	 */
	private Combo autoGenerationCombo;
	private Table agSettingsTable;
	private Button btnModifyAutoGenerationSettings;
	private Button addSettingsButton;
	private Button editSettingsButton;

	private Button deleteSettingsButton;
	/**
	 * Controls for path setting tag
	 */
	private Combo pathDropDown;
	private Table pathSettingsTable;
	private ComboViewer pathComboViewer;
	private Button addPathSettingsButton;
	private Button editPathSettingsButton;

	private Button deletePathSettingsButton;
	// private ComboViewer pathConfigurationComboViewer;

	public DeviceDescriptionFileEditorPage(DeviceDescriptionFileEditor editor, final String title) {
		super(editor, DeviceDescriptionFileEditorPage.ID, title);
		this.editor = editor;
	}

	/**
	 * Create the GUI controls for the Generator in the openCONFIGURATOR project
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
		deviceImageSection
				.setDescription(DeviceDescriptionFileEditorPage.DEVICE_IMAGE_SECTION_HEADING_DESCRIPTION);

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
		 //pst.heightHint = 100;
		 
		 pst.heightHint = 180;
		 pst.widthHint = 526;
		 lst_no_foi.setLayoutData(pst);
		

		addPathSettingsButton = toolkit.createButton(clientComposite,
				DeviceDescriptionFileEditorPage.ADD_BUTTON_LABEL, SWT.PUSH);
		pst = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		addPathSettingsButton.setLayoutData(pst);
		toolkit.adapt(addPathSettingsButton, true, true);

		editPathSettingsButton = toolkit.createButton(clientComposite,
				DeviceDescriptionFileEditorPage.EDIT_BUTTON_LABEL, SWT.PUSH);
		pst = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		editPathSettingsButton.setLayoutData(pst);
		editPathSettingsButton.setEnabled(false);
		toolkit.adapt(editPathSettingsButton, true, true);

		deletePathSettingsButton = toolkit.createButton(clientComposite,
				DeviceDescriptionFileEditorPage.DELETE_BUTTON_LABEL, SWT.PUSH);
		pst = new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1);
		deletePathSettingsButton.setLayoutData(pst);
		deletePathSettingsButton.setEnabled(false);
		toolkit.adapt(deletePathSettingsButton, true, true);

//		Label activeAutoGenerationSettingsLabel = toolkit.createLabel(clientComposite,
//				IndustrialNetworkProjectEditorPage.AUTOGENERATIONSETTINGS_SECTION_ACTIVEGROUP_LABEL);
//		activeAutoGenerationSettingsLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
//		activeAutoGenerationSettingsLabel.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));
//
//		autoGenerationCombo = new Combo(clientComposite, SWT.READ_ONLY);
//		autoGenerationCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
//		toolkit.adapt(autoGenerationCombo, true, true);
//
//		btnModifyAutoGenerationSettings = toolkit.createButton(clientComposite,
//				IndustrialNetworkProjectEditorPage.AUTOGENERATIONSETTINGS_SECTION_MODIFY_LABEL, SWT.PUSH);
//		GridData gd = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
//		btnModifyAutoGenerationSettings.setLayoutData(gd);
//
//		Label dummyLabel = new Label(clientComposite, SWT.WRAP);
//		dummyLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 3, 1));
//		dummyLabel.setText(IndustrialNetworkProjectEditorPage.AUTOGENERATIONSETTINGS_SECTION_INFO_LABEL);
//		toolkit.adapt(dummyLabel, true, true);
//		dummyLabel.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));
//
//		agSettingsTable = toolkit.createTable(clientComposite,
//				SWT.SINGLE | SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL | SWT.FULL_SELECTION);
//		gd = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 3);
//		gd.heightHint = 100;
//		agSettingsTable.setLayoutData(gd);
//		agSettingsTable.setHeaderVisible(true);
//		agSettingsTable.setVisible(true);
//
//		String[] titles = { "Settings Type", "Value" };
//
//		final TableColumn settingsTypeColumn = new TableColumn(agSettingsTable, SWT.NONE);
//		settingsTypeColumn.setText(titles[0]);
//		final TableColumn valueColumn = new TableColumn(agSettingsTable, SWT.NONE);
//		valueColumn.setText(titles[1]);
//
//		for (int loopIndex = 0; loopIndex < titles.length; loopIndex++) {
//			agSettingsTable.getColumn(loopIndex).pack();
//		}
//		// Composite tpdoActionsbuttonGroup = new Composite(clientComposite,
//		// SWT.NONE);
//		// tpdoActionsbuttonGroup.setLayoutData(
//		// new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1));
//		// tpdoActionsbuttonGroup.setLayout(new GridLayout(3, false));
//		//
//		// Button tpdoActionsUpButton = new Button(tpdoActionsbuttonGroup,
//		// SWT.NONE);
//		// tpdoActionsUpButton.setToolTipText("Move up");
//		// // tpdoActionsUpButton.setImage(upArrowImage);
//
//		agSettingsTable.addListener(SWT.Resize, new Listener() {
//			@Override
//			public void handleEvent(Event event) {
//				int width = agSettingsTable.getClientArea().width - settingsTypeColumn.getWidth();
//				valueColumn.setWidth(width);
//			}
//		});
//
//		addSettingsButton = toolkit.createButton(clientComposite,
//				IndustrialNetworkProjectEditorPage.AUTOGENERATIONSETTINGS_SECTION_ADD_LABEL, SWT.PUSH);
//		gd = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
//		addSettingsButton.setLayoutData(gd);
//
//		editSettingsButton = toolkit.createButton(clientComposite,
//				IndustrialNetworkProjectEditorPage.AUTOGENERATIONSETTINGS_SECTION_EDIT_LABEL, SWT.PUSH);
//		gd = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
//		editSettingsButton.setLayoutData(gd);
//
//		deleteSettingsButton = toolkit.createButton(clientComposite,
//				IndustrialNetworkProjectEditorPage.AUTOGENERATIONSETTINGS_SECTION_DELETE_LABEL, SWT.PUSH);
//		gd = new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1);
//		deleteSettingsButton.setLayoutData(gd);
//
//		toolkit.adapt(agSettingsTable, true, true);
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
		createHyperLinkSection(managedForm);
		createDeviceFirmwwareSection(managedForm);
		createDevImageSection(managedForm);

	}

	/**
	 * Creates the widgets and controls for the {@link TGenerator} model.
	 *
	 * @param managedForm
	 *            The parent form.
	 */
	private void createGeneralInfoWidgets(final IManagedForm managedForm) {
		Section sctnGenerator = toolkit.createSection(managedForm.getForm().getBody(), ExpandableComposite.EXPANDED
				| Section.DESCRIPTION | ExpandableComposite.TWISTIE | ExpandableComposite.TITLE_BAR);
		managedForm.getToolkit().paintBordersFor(sctnGenerator);
		sctnGenerator.setText(DeviceDescriptionFileEditorPage.GENERAL_INFORMATION_SECTION);
		sctnGenerator.setDescription(DeviceDescriptionFileEditorPage.GENERAL_SECTION_HEADING_DESCRIPTION);

		Composite client = toolkit.createComposite(sctnGenerator, SWT.WRAP);
		GridLayout layout = new GridLayout(2, false);
		layout.marginWidth = 2;
		layout.marginHeight = 2;
		client.setLayout(layout);
		toolkit.paintBordersFor(client);
		sctnGenerator.setClient(client);

		Label vendorIdLabel = new Label(client, SWT.NONE);
		vendorIdLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		vendorIdLabel.setText(DeviceDescriptionFileEditorPage.VENDOR_ID_LABEL);
		toolkit.adapt(vendorIdLabel, true, true);
		vendorIdLabel.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

		vendorIdText = new Text(client, SWT.BORDER | SWT.WRAP);
		vendorIdText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		toolkit.adapt(vendorIdText, true, true);

		Label vendorNameLabel = new Label(client, SWT.NONE);
		vendorNameLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		vendorNameLabel.setText(DeviceDescriptionFileEditorPage.VENDOR_NAME_LABEL);
		toolkit.adapt(vendorNameLabel, true, true);
		vendorNameLabel.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

		vendorNameText = new Text(client, SWT.BORDER | SWT.WRAP);
		vendorNameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		toolkit.adapt(vendorNameText, true, true);

		Label hwVersionLabel = new Label(client, SWT.NONE);
		hwVersionLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		hwVersionLabel.setText(DeviceDescriptionFileEditorPage.HARDWARE_VERSION_LABEL);
		toolkit.adapt(hwVersionLabel, true, true);
		hwVersionLabel.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

		hardwareVersionText = new Text(client, SWT.BORDER | SWT.WRAP);
		hardwareVersionText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		toolkit.adapt(hardwareVersionText, true, true);

		Label swVersionLabel = new Label(client, SWT.NONE);
		swVersionLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		swVersionLabel.setText(DeviceDescriptionFileEditorPage.SOFTWARE_VERSION_LABEL);
		toolkit.adapt(swVersionLabel, true, true);
		swVersionLabel.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

		swVersionText = new Text(client, SWT.BORDER | SWT.WRAP);
		swVersionText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		toolkit.adapt(swVersionText, true, true);

		Label fwVersionLabel = new Label(client, SWT.NONE);
		fwVersionLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		fwVersionLabel.setText(DeviceDescriptionFileEditorPage.FIRMWARE_VERSION_LABEL);
		toolkit.adapt(fwVersionLabel, true, true);
		fwVersionLabel.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

		fwVersionText = new Text(client, SWT.BORDER | SWT.WRAP);
		fwVersionText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		toolkit.adapt(fwVersionText, true, true);

		Label productnameLabel = new Label(client, SWT.NONE);
		productnameLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		productnameLabel.setText(DeviceDescriptionFileEditorPage.PRODUCT_NAME_LABEL);
		toolkit.adapt(productnameLabel, true, true);
		productnameLabel.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

		productNameText = new Text(client, SWT.BORDER | SWT.WRAP);
		productNameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		toolkit.adapt(productNameText, true, true);

		Label productIdlabel = new Label(client, SWT.NONE);
		productIdlabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		productIdlabel.setText(DeviceDescriptionFileEditorPage.PRODUCT_ID_LABEL);
		toolkit.adapt(productIdlabel, true, true);
		productIdlabel.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

		productIdText = new Text(client, SWT.BORDER | SWT.WRAP);
		productIdText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		toolkit.adapt(productIdText, true, true);

	}

	/**
	 * Creates the widgets and controls for the
	 * {@link TProjectConfiguration.PathSettings} model.
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

		TreeViewer listViewer = new TreeViewer(clientComposite, SWT.BORDER | SWT.V_SCROLL);
		Tree lst_no_foi = listViewer.getTree();
				
		GridData pst = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 3);
		 //pst.heightHint = 100;
		 
		 pst.heightHint = 180;
		pst.widthHint = 626;
		 lst_no_foi.setLayoutData(pst);
		

		addPathSettingsButton = toolkit.createButton(clientComposite,
				DeviceDescriptionFileEditorPage.ADD_BUTTON_LABEL, SWT.PUSH);
		pst = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		addPathSettingsButton.setLayoutData(pst);
		toolkit.adapt(addPathSettingsButton, true, true);

		editPathSettingsButton = toolkit.createButton(clientComposite,
				DeviceDescriptionFileEditorPage.EDIT_BUTTON_LABEL, SWT.PUSH);
		pst = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		editPathSettingsButton.setLayoutData(pst);
		editPathSettingsButton.setEnabled(false);
		toolkit.adapt(editPathSettingsButton, true, true);

		deletePathSettingsButton = toolkit.createButton(clientComposite,
				DeviceDescriptionFileEditorPage.DELETE_BUTTON_LABEL, SWT.PUSH);
		pst = new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1);
		deletePathSettingsButton.setLayoutData(pst);
		deletePathSettingsButton.setEnabled(false);
		toolkit.adapt(deletePathSettingsButton, true, true);

		// Label lblOutputPath = new Label(clientComposite, SWT.NONE);
		// lblOutputPath.setLayoutData(
		// new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
		// lblOutputPath.setText(
		// "");
		// toolkit.adapt(lblOutputPath, true, true);
		// lblOutputPath
		// .setForeground(toolkit.getColors().getColor(IFormColors.TITLE));
		//
		// pathDropDown = new Combo(clientComposite,
		// SWT.DROP_DOWN | SWT.READ_ONLY);
		// pathDropDown.setLayoutData(
		// new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		// toolkit.adapt(pathDropDown, true, true);
		//
		//
		// // pathDropDown.setText(
		// // OpenConfiguratorProjectUtils.PATH_SETTINGS_ALL_PATH_ID);
		//
		// Label dummyLabel = new Label(clientComposite, SWT.WRAP);
		// dummyLabel.setLayoutData(
		// new GridData(SWT.FILL, SWT.CENTER, false, false, 3, 1));
		// dummyLabel.setText(
		// IndustrialNetworkProjectEditorPage.PATH_SECTION_INFO_LABEL);
		// toolkit.adapt(dummyLabel, true, true);
		// dummyLabel
		// .setForeground(toolkit.getColors().getColor(IFormColors.TITLE));
		//
		// TreeViewer listViewer = new TreeViewer(clientComposite,
		// SWT.BORDER | SWT.V_SCROLL);
		// Tree lst_no_foi = listViewer.getTree();
		// GridData gd_list = new GridData(SWT.LEFT, SWT.CENTER, false, false,
		// 1, 1);
		// gd_list.heightHint = 180;
		// gd_list.widthHint = 426;
		// lst_no_foi.setLayoutData(gd_list);
		//
		//
		// pathSettingsTable = toolkit.createTable(clientComposite,
		// SWT.SINGLE | SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL
		// | SWT.FULL_SELECTION);
		//
		// GridData pst = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 3);
		// pst.heightHint = 100;
		// pathSettingsTable.setLayoutData(pst);
		// pathSettingsTable.setHeaderVisible(true);
		// pathSettingsTable.setVisible(true);
		//
		// String[] titles = { "Path ID", "Path" };
		//
		// final TableColumn idColumn = new TableColumn(pathSettingsTable,
		// SWT.NONE);
		// idColumn.setText(titles[0]);
		// final TableColumn valueColumn = new TableColumn(pathSettingsTable,
		// SWT.NONE);
		// valueColumn.setText(titles[1]);
		//
		// for (int loopIndex = 0; loopIndex < titles.length; loopIndex++) {
		// pathSettingsTable.getColumn(loopIndex).pack();
		// }
		//
		// pathSettingsTable.addListener(SWT.Resize, new Listener() {
		// @Override
		// public void handleEvent(Event event) {
		// int width = pathSettingsTable.getClientArea().width
		// - idColumn.getWidth();
		// valueColumn.setWidth(width);
		// }
		// });
		//
		// addPathSettingsButton = toolkit.createButton(clientComposite,
		// IndustrialNetworkProjectEditorPage.PATHSETTINGS_SECTION_ADD_LABEL,
		// SWT.PUSH);
		// pst = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		// addPathSettingsButton.setLayoutData(pst);
		//
		// editPathSettingsButton = toolkit.createButton(clientComposite,
		// IndustrialNetworkProjectEditorPage.PATHSETTINGS_SECTION_EDIT_LABEL,
		// SWT.PUSH);
		// pst = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		// editPathSettingsButton.setLayoutData(pst);
		// editPathSettingsButton.setEnabled(false);
		//
		// deletePathSettingsButton = toolkit.createButton(clientComposite,
		// IndustrialNetworkProjectEditorPage.PATHSETTINGS_SECTION_DELETE_LABEL,
		// SWT.PUSH);
		// pst = new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1);
		// deletePathSettingsButton.setLayoutData(pst);
		// deletePathSettingsButton.setEnabled(false);
		//
		// toolkit.adapt(pathSettingsTable, true, true);
		//
		// pathComboViewer = new ComboViewer(pathDropDown);
		// pathComboViewer.setContentProvider(new IStructuredContentProvider() {
		//
		// @Override
		// public void dispose() {
		// // TODO Auto-generated method stub
		//
		// }
		//
		// @SuppressWarnings("rawtypes")
		// @Override
		// public Object[] getElements(Object inputElement) {
		// return ((List) inputElement).toArray();
		// }
		//
		// @Override
		// public void inputChanged(Viewer viewer, Object oldInput,
		// Object newInput) {
		// // TODO Auto-generated method stub
		// }
		// });

	}

	/**
	 * Creates the widgets and controls for the {@link TGenerator} model.
	 *
	 * @param managedForm
	 *            The parent form.
	 */
	private void createHyperLinkSection(final IManagedForm managedForm) {
		Section hyperLinkSection = toolkit.createSection(managedForm.getForm().getBody(), ExpandableComposite.EXPANDED
				| Section.DESCRIPTION | ExpandableComposite.TWISTIE | ExpandableComposite.TITLE_BAR);
		managedForm.getToolkit().paintBordersFor(hyperLinkSection);
		hyperLinkSection.setText(DeviceDescriptionFileEditorPage.DEVICE_COMMUNICATION_INFORMATION_SECTION);

		Composite client = toolkit.createComposite(hyperLinkSection, SWT.WRAP);
		GridLayout layout = new GridLayout(2, false);
		layout.marginWidth = 2;
		layout.marginHeight = 2;
		client.setLayout(layout);
		toolkit.paintBordersFor(client);
		hyperLinkSection.setClient(client);

		Hyperlink link = toolkit.createHyperlink(client,
				DeviceDescriptionFileEditorPage.OBJECT_DICTIONARY_HYPERLINK_SECTION, SWT.RIGHT | SWT.WRAP);
		link.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		toolkit.adapt(link, true, true);
		link.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));
		
		Label obdLabel = new Label(client, SWT.WRAP);
		obdLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		obdLabel.setText(": To edit the POWERLINK object dictionary of the device.");
		toolkit.adapt(obdLabel, true, true);
		
		
		Hyperlink linkNwMgmt = toolkit.createHyperlink(client,
				DeviceDescriptionFileEditorPage.NETWORK_MANAGEMENT_HYPERLINK_SECTION, SWT.LEFT | SWT.WRAP);
		linkNwMgmt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		toolkit.adapt(linkNwMgmt, true, true);
		linkNwMgmt.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));
		
		Label nwMngmtLabel = new Label(client, SWT.WRAP);
		nwMngmtLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		nwMngmtLabel.setText(": To configure network management properties.");
		toolkit.adapt(nwMngmtLabel, true, true);

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
	 * Initializes the project editor page.
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

	/**
	 * Enables the AutoGenerationSettings group if the argument is true, and
	 * disables it otherwise.
	 *
	 * @param enabled
	 *            Enables/disable the settings group
	 */
	private void setEnabledSettingsControls(boolean enabled) {
		agSettingsTable.setEnabled(enabled);
		addSettingsButton.setEnabled(enabled);
		editSettingsButton.setEnabled(enabled);
		deleteSettingsButton.setEnabled(enabled);
		int[] selectedIndices = agSettingsTable.getSelectionIndices();
		System.err.println("Selection indices....." + selectedIndices.length);
		if (selectedIndices.length <= 0) {
			editSettingsButton.setEnabled(false);
			deleteSettingsButton.setEnabled(false);
		}

	}

}
