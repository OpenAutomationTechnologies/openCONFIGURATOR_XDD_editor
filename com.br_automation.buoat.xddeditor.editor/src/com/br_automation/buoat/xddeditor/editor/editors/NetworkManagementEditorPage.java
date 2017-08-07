/*******************************************************************************
 * @file   NetworkManagementEditorPage.java
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

import java.awt.Checkbox;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
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

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileType;
import com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType;
import com.br_automation.buoat.xddeditor.XDD.ProfileHeaderDataType;
import com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity;
import com.br_automation.buoat.xddeditor.XDD.TVersion;
import com.br_automation.buoat.xddeditor.XDD.VersionTypeType;
import com.br_automation.buoat.xddeditor.XDD.XDDFactory;
import com.br_automation.buoat.xddeditor.XDD.custom.XDDUtilities;

/**
 * The editor page to manipulate the network management features of device
 * description file.
 *
 * @author Sree Hari Vignesh B
 *
 */
public final class NetworkManagementEditorPage extends FormPage {

    /** Identifier */
    private static final String ID = "org.epsg.openconfigurator.editors.NetworkManagementEditorPage";

    /** Editor label and error messages */
    private static final String GENERAL_FEATURES_SECTION = "General Features";
    private static final String CN_FEATURES_SECTION = "Controlled Node Features";
    private static final String GENERAL_SECTION_HEADING_DESCRIPTION = "Provides general information about device descripton file.";
    private static final String TIME_FOR_PREQ_LABEL = "Time for PReq (ns):";
    private static final String NETWORK_IP_SUPPORT_LABEL = "Network IP Support:";
    private static final String TOTAL_NETWORK_ERROR_ENTRIES_LABEL = "Total Network Error Entries:";
    private static final String MAXIMUM_CYCLE_TIME_LABEL = "Maximum Cycle Time ():";

    private static final String MINIMUM_CYCLE_TIME_LABEL = "Minimum Cycle Time ():";
    private static final String NETWORK_BOOT_TIME_LABEL = "Network Boot Time ():";

    private static final String MULTIPLEXED_COMMUNICATION_LABEL = "Multiplexed Communication";
    private static final String POLL_RESPONSE_COMMUNICATION_LABEL = "Poll Response Communication";

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
     * Controls for general and CN features
     */
    private Text minimumCycleTimeText;
    private Text networkBootTimeText;
    private Text maximumCycleTimeText;
    private Text totalNetworkErrorEntriesText;
    private Combo networkIpCombo;
    private Button multiplexedCommunicationChkBox;
    private Button pollResponseCommunication;
    private Text timeForPreqText;

    private DocumentRoot documentRoot;

    public NetworkManagementEditorPage(DeviceDescriptionFileEditor editor, final String title,
            DocumentRoot documentRoot) {
        super(editor, NetworkManagementEditorPage.ID, title);
        this.editor = editor;
        this.documentRoot = documentRoot;
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
        form.setText(NetworkManagementEditorPage.FORM_EDITOR_PAGE_TITLE);
        Composite body = form.getBody();
        toolkit.decorateFormHeading(form.getForm());
        toolkit.paintBordersFor(body);
        managedForm.setInput(getEditorInput());

        TableWrapLayout layout = new TableWrapLayout();
        layout.topMargin = NetworkManagementEditorPage.FORM_BODY_MARGIN_TOP;
        layout.bottomMargin = NetworkManagementEditorPage.FORM_BODY_MARGIN_BOTTOM;
        layout.leftMargin = NetworkManagementEditorPage.FORM_BODY_MARGIN_LEFT;
        layout.rightMargin = NetworkManagementEditorPage.FORM_BODY_MARGIN_RIGHT;
        layout.horizontalSpacing = NetworkManagementEditorPage.FORM_BODY_HORIZONTAL_SPACING;
        layout.verticalSpacing = NetworkManagementEditorPage.FORM_BODY_VERTICAL_SPACING;
        layout.makeColumnsEqualWidth = true;
        layout.numColumns = NetworkManagementEditorPage.FORM_BODY_NUMBER_OF_COLUMNS;
        body.setLayout(layout);

        createGeneralFeaturesSection(managedForm);
        createCnFeaturesSection(managedForm);

    }

    private TDeviceIdentity getDeviceIdentity() {
        EList<ISO15745ProfileType> profiles = documentRoot.getISO15745ProfileContainer().getISO15745Profile();
        ISO15745ProfileType profile1 = profiles.get(0);

        ProfileBodyDataType body1 = profile1.getProfileBody();
        EList<EObject> bodyContents = body1.eContents();
        EObject identity = bodyContents.get(0);
        TDeviceIdentity tDeviceIdentity = (TDeviceIdentity) identity;
        return tDeviceIdentity;
    }

    /**
     * Creates the widgets and controls for the general features of device
     * description file.
     *
     * @param managedForm
     *            The parent form.
     */
    private void createGeneralFeaturesSection(final IManagedForm managedForm) {
        Section sctnGenerator = toolkit.createSection(managedForm.getForm().getBody(), ExpandableComposite.EXPANDED
                | Section.DESCRIPTION | ExpandableComposite.TWISTIE | ExpandableComposite.TITLE_BAR);
        managedForm.getToolkit().paintBordersFor(sctnGenerator);
        sctnGenerator.setText(NetworkManagementEditorPage.GENERAL_FEATURES_SECTION);
        sctnGenerator.setDescription(NetworkManagementEditorPage.GENERAL_SECTION_HEADING_DESCRIPTION);

        Composite client = toolkit.createComposite(sctnGenerator, SWT.WRAP);
        GridLayout layout = new GridLayout(2, false);
        layout.marginWidth = 2;
        layout.marginHeight = 2;
        client.setLayout(layout);
        toolkit.paintBordersFor(client);
        sctnGenerator.setClient(client);

        Label netwrkBootTime = new Label(client, SWT.NONE);
        netwrkBootTime.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        netwrkBootTime.setText(NetworkManagementEditorPage.NETWORK_BOOT_TIME_LABEL);
        toolkit.adapt(netwrkBootTime, true, true);
        netwrkBootTime.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        networkBootTimeText = new Text(client, SWT.BORDER | SWT.WRAP);
        networkBootTimeText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(networkBootTimeText, true, true);

        Label minimumCycleTime = new Label(client, SWT.NONE);
        minimumCycleTime.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        minimumCycleTime.setText(NetworkManagementEditorPage.MINIMUM_CYCLE_TIME_LABEL);
        toolkit.adapt(minimumCycleTime, true, true);
        minimumCycleTime.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        minimumCycleTimeText = new Text(client, SWT.BORDER | SWT.WRAP);
        minimumCycleTimeText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(minimumCycleTimeText, true, true);

        Label maximumCycleTimeLabel = new Label(client, SWT.NONE);
        maximumCycleTimeLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        maximumCycleTimeLabel.setText(NetworkManagementEditorPage.MAXIMUM_CYCLE_TIME_LABEL);
        toolkit.adapt(maximumCycleTimeLabel, true, true);
        maximumCycleTimeLabel.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        maximumCycleTimeText = new Text(client, SWT.BORDER | SWT.WRAP);
        maximumCycleTimeText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(maximumCycleTimeText, true, true);

        Label totalNetworkErrorEntries = new Label(client, SWT.NONE);
        totalNetworkErrorEntries.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        totalNetworkErrorEntries.setText(NetworkManagementEditorPage.TOTAL_NETWORK_ERROR_ENTRIES_LABEL);
        toolkit.adapt(totalNetworkErrorEntries, true, true);
        totalNetworkErrorEntries.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        totalNetworkErrorEntriesText = new Text(client, SWT.BORDER | SWT.WRAP);
        totalNetworkErrorEntriesText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(totalNetworkErrorEntriesText, true, true);

        Label networkIpSupportLabel = new Label(client, SWT.NONE);
        networkIpSupportLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        networkIpSupportLabel.setText(NetworkManagementEditorPage.NETWORK_IP_SUPPORT_LABEL);
        toolkit.adapt(networkIpSupportLabel, true, true);
        networkIpSupportLabel.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        networkIpCombo = new Combo(client, SWT.READ_ONLY);
        networkIpCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(networkIpCombo, true, true);
        networkIpCombo.setItems("True", "false");
        networkIpCombo.select(0);

    }

    /**
     * Creates the widgets and controls for the CN features of device
     * description file.
     *
     * @param managedForm
     *            The parent form.
     */
    private void createCnFeaturesSection(final IManagedForm managedForm) {
        Section sctnGenerator = toolkit.createSection(managedForm.getForm().getBody(), ExpandableComposite.EXPANDED
                | Section.DESCRIPTION | ExpandableComposite.TWISTIE | ExpandableComposite.TITLE_BAR);
        managedForm.getToolkit().paintBordersFor(sctnGenerator);
        sctnGenerator.setText(NetworkManagementEditorPage.CN_FEATURES_SECTION);
        sctnGenerator.setDescription(NetworkManagementEditorPage.GENERAL_SECTION_HEADING_DESCRIPTION);

        Composite client = toolkit.createComposite(sctnGenerator, SWT.WRAP);
        GridLayout layout = new GridLayout(2, false);
        layout.marginWidth = 2;
        layout.marginHeight = 2;
        client.setLayout(layout);
        toolkit.paintBordersFor(client);
        sctnGenerator.setClient(client);

        new Label(client, SWT.NONE);

        multiplexedCommunicationChkBox = new Button(client, SWT.CHECK);
        multiplexedCommunicationChkBox.setText(NetworkManagementEditorPage.MULTIPLEXED_COMMUNICATION_LABEL);
        multiplexedCommunicationChkBox.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(multiplexedCommunicationChkBox, true, true);

        new Label(client, SWT.NONE);

        pollResponseCommunication = new Button(client, SWT.CHECK);
        pollResponseCommunication.setText(NetworkManagementEditorPage.POLL_RESPONSE_COMMUNICATION_LABEL);
        pollResponseCommunication.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(pollResponseCommunication, true, true);

        Label timeForPreq = new Label(client, SWT.NONE);
        timeForPreq.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        timeForPreq.setText(NetworkManagementEditorPage.TIME_FOR_PREQ_LABEL);
        toolkit.adapt(timeForPreq, true, true);
        timeForPreq.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        timeForPreqText = new Text(client, SWT.BORDER | SWT.WRAP);
        timeForPreqText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(timeForPreqText, true, true);

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

}
