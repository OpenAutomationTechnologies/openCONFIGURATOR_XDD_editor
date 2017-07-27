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
public final class ObjectDictionaryEditorPage extends FormPage {

	/** Identifier */
	private static final String ID = "org.epsg.openconfigurator.editors.objectDictionaryEditorPage";

	private static final String OBJECT_DICTIONARY_HEADING = "Object Dictionary";
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

	/**
	 * Toolkit for the form editor.
	 */
	private FormToolkit toolkit;
	private DeviceDescriptionFileEditor editor;

	
	private Button addPathSettingsButton;
	private Button removeButton;

	public ObjectDictionaryEditorPage(DeviceDescriptionFileEditor editor, final String title) {
		super(editor, ObjectDictionaryEditorPage.ID, title);
		this.editor = editor;
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

				createDeviceFirmwwareSection(managedForm);
		

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
		deviceFirmwareSection.setText(ObjectDictionaryEditorPage.OBJECT_DICTIONARY_HEADING);
		deviceFirmwareSection.setDescription(ObjectDictionaryEditorPage.OBJECT_DICTIONARY_HEADING_DESCRIPTION);

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
		 
		 pst.heightHint = 400;
		pst.widthHint = 626;
		 lst_no_foi.setLayoutData(pst);
		

		addPathSettingsButton = toolkit.createButton(clientComposite,
				ObjectDictionaryEditorPage.ADD_BUTTON_LABEL, SWT.PUSH);
		pst = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		addPathSettingsButton.setLayoutData(pst);
		toolkit.adapt(addPathSettingsButton, true, true);

		removeButton = toolkit.createButton(clientComposite,
				ObjectDictionaryEditorPage.REMOVE_BUTTON_LABEL, SWT.PUSH);
		pst = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		removeButton.setLayoutData(pst);
		removeButton.setEnabled(false);
		toolkit.adapt(removeButton, true, true);
		

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

	
}
