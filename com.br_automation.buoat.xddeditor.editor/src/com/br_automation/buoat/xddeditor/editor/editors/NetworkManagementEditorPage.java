/*******************************************************************************
 * @file   NetworkManagementEditorPage.java
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

import java.awt.Checkbox;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.dialogs.IMessageProvider;
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
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
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
import com.br_automation.buoat.xddeditor.XDD.TCNFeatures;
import com.br_automation.buoat.xddeditor.XDD.TDeviceIdentity;
import com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures;
import com.br_automation.buoat.xddeditor.XDD.TVendorID;
import com.br_automation.buoat.xddeditor.XDD.TVersion;
import com.br_automation.buoat.xddeditor.XDD.VersionTypeType;
import com.br_automation.buoat.xddeditor.XDD.XDDFactory;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;
import com.br_automation.buoat.xddeditor.XDD.custom.XDDUtilities;
import com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyCommunicationNetworkPowerlinkImpl;
import com.br_automation.buoat.xddeditor.XDD.impl.TNetworkManagementImpl;
import com.br_automation.buoat.xddeditor.XDD.validation.NameVerifyListener;
import com.br_automation.buoat.xddeditor.XDD.wizards.NewFirmwareWizard;

/**
 * The editor page to manipulate the network management features of device
 * description file.
 *
 * @author Sree Hari Vignesh
 *
 */
public final class NetworkManagementEditorPage extends FormPage {

    /** Identifier */
    private static final String ID = "com.buoat.xddeditor.editors.NetworkManagementEditorPage";

    /** Editor label and error messages */
    private static final String GENERAL_FEATURES_SECTION = "General Features";
    private static final String CN_FEATURES_SECTION = "Controlled Node Features";
    private static final String GENERAL_FEATURES_SECTION_HEADING_DESCRIPTION = "Provides general information about device descripton file.";
    private static final String TIME_FOR_PREQ_LABEL = "Time for PReq (ns):";
    private static final String NETWORK_IP_SUPPORT_LABEL = "Network IP Support:";
    private static final String TOTAL_NETWORK_ERROR_ENTRIES_LABEL = "Total Network Error Entries:";
    private static final String MAXIMUM_CYCLE_TIME_LABEL = "Maximum Cycle Time (\u00B5s):";

    private static final String MINIMUM_CYCLE_TIME_LABEL = "Minimum Cycle Time (\u00B5s):";
    private static final String NETWORK_BOOT_TIME_LABEL = "Network Boot Time  (\u00B5s):";

    private static final String MULTIPLEXED_COMMUNICATION_LABEL = "Multiplexed Communication";
    private static final String POLL_RESPONSE_COMMUNICATION_LABEL = "Poll Response Communication";

    private static final String FORM_EDITOR_PAGE_TITLE = "Device Description File Editor";

    public static final String INVALID_PREQ_TIME_VALUE = "Invalid PReq time value.";
    public static final String INVALID_NETWORK_ERROR_ENTRIES = "Invalid network error entries.";
    public static final String INVALID_MAX_CYCLE_TIME = "Maximum cycle time value invalid.";
    public static final String INVALID_MIN_CYCLE_TIME = "Invalid minimum cycle time value.";
    public static final String EMPTY_CYCLE_TIME_ERROR_MESSAGE = "The cycle time value cannot be empty.";
    public static final String EMPTY_MIN_CYCLE_TIME_ERROR_MESSAGE = "The minimum cycle time value cannot be empty.";
    public static final String EMPTY_NETWORK_BOOT_TIME_ERROR_MESSAGE = "The network boot time value cannot be empty.";
    public static final String INVALID_NETWORK_BOOT_TIME = "Invalid network boot time value.";

    /**
     * Form size
     */
    private static final int FORM_BODY_MARGIN_TOP = 12;
    private static final int FORM_BODY_MARGIN_BOTTOM = 12;
    private static final int FORM_BODY_MARGIN_LEFT = 12;
    private static final int FORM_BODY_MARGIN_RIGHT = 12;
    private static final int FORM_BODY_HORIZONTAL_SPACING = 20;
    private static final int FORM_BODY_VERTICAL_SPACING = 17;
    private static final int FORM_BODY_NUMBER_OF_COLUMNS = 1;

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
    private Button networkIpButton;
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

        addListenersToControls();

    }

    /**
     * Name verify listener
     */
    private NameVerifyListener nameVerifyListener = new NameVerifyListener();

    private void addListenersToControls() {
        minimumCycleTimeText.addModifyListener(minimumCycleTimeModifyListener);
        networkBootTimeText.addModifyListener(networkBootTimeModifyListener);
        maximumCycleTimeText.addModifyListener(maximumCycleTimeModifyListener);
        totalNetworkErrorEntriesText.addModifyListener(totalnetworkEntriesModifyListener);
        minimumCycleTimeText.addVerifyListener(nameVerifyListener);
        networkBootTimeText.addVerifyListener(nameVerifyListener);
        maximumCycleTimeText.addVerifyListener(nameVerifyListener);
        totalNetworkErrorEntriesText.addVerifyListener(nameVerifyListener);
        networkIpButton.addSelectionListener(networkIpButtonSelectionListener);
        multiplexedCommunicationChkBox.addSelectionListener(multiplexedCommunicationChkBoxSelectionListener);
        pollResponseCommunication.addSelectionListener(pollResponseCommunicationSelectionListener);
        timeForPreqText.addModifyListener(timeForPreqModifyListener);
        timeForPreqText.addVerifyListener(nameVerifyListener);
    }

    private SelectionAdapter networkIpButtonSelectionListener = new SelectionAdapter() {

        @Override
        public void widgetSelected(SelectionEvent e) {
            if (!networkIpButton.getSelection()) {
                if (getGeneralFeatures() != null) {
                    getGeneralFeatures().unsetNWLIPSupport();
                }
            } else {
                if (getGeneralFeatures() != null) {
                    getGeneralFeatures().setNWLIPSupport(true);
                }
            }
        }
    };

    private SelectionAdapter multiplexedCommunicationChkBoxSelectionListener = new SelectionAdapter() {

        @Override
        public void widgetSelected(SelectionEvent e) {
            if (!multiplexedCommunicationChkBox.getSelection()) {
                if (getCnFeatures() != null) {
                    getCnFeatures().unsetDLLCNFeatureMultiplex();
                }
            } else {
                if (getCnFeatures() != null) {
                    getCnFeatures().setDLLCNFeatureMultiplex(true);
                }
            }
        }
    };

    private SelectionAdapter pollResponseCommunicationSelectionListener = new SelectionAdapter() {

        @Override
        public void widgetSelected(SelectionEvent e) {
            if (!pollResponseCommunication.getSelection()) {
                if (getCnFeatures() != null) {
                    getCnFeatures().unsetDLLCNPResChaining();
                }
            } else {
                if (getCnFeatures() != null) {
                    getCnFeatures().setDLLCNPResChaining(true);
                }
            }
        }
    };

    private void setErrorMessage(String message) {
    	if(form != null) {
        form.setMessage(message, IMessageProvider.ERROR);
        if (message == null) {
            message = StringUtils.EMPTY;
            form.setMessage(message, IMessageProvider.NONE);
        }
    	}
    }

    private ModifyListener timeForPreqModifyListener = new ModifyListener() {

        @Override
        public void modifyText(ModifyEvent e) {
            setErrorMessage(null);
            String timeforPreqText = timeForPreqText.getText();
            try {

                if (timeforPreqText == null) {
                    setErrorMessage(INVALID_PREQ_TIME_VALUE);
                    return;
                }

                if (timeforPreqText.length() <= 0) {
                    setErrorMessage(INVALID_PREQ_TIME_VALUE);
                    return;
                }

                // Space as first character is not allowed. ppc:tNonEmptyString
                if (timeforPreqText.contains(" ")) {
                    setErrorMessage(INVALID_PREQ_TIME_VALUE);
                    return;
                }

                if (getCnFeatures() != null) {
                    Long preqTimeValue = Long.parseLong(timeforPreqText);
                    getCnFeatures().setNMTCNSoC2PReq(preqTimeValue);
                }
                updateDocument(documentRoot);

            } catch (NumberFormatException ex) {
                setErrorMessage(INVALID_PREQ_TIME_VALUE);
                ex.printStackTrace();
                return;
            }

        }
    };

    private ModifyListener totalnetworkEntriesModifyListener = new ModifyListener() {

        @Override
        public void modifyText(ModifyEvent e) {
            setErrorMessage(null);
            String totalNetworkEntry = totalNetworkErrorEntriesText.getText();
            try {

                if (totalNetworkEntry == null) {
                    setErrorMessage(INVALID_NETWORK_ERROR_ENTRIES);
                    return;
                }

                if (totalNetworkEntry.length() <= 0) {
                    setErrorMessage(INVALID_NETWORK_ERROR_ENTRIES);
                    return;
                }

                // Space as first character is not allowed. ppc:tNonEmptyString
                if (totalNetworkEntry.contains(" ")) {
                    setErrorMessage(INVALID_NETWORK_ERROR_ENTRIES);
                    return;
                }

                if (getGeneralFeatures() != null) {
                    Long ntwrkErrorEntries = Long.parseLong(totalNetworkEntry);
                    getGeneralFeatures().setNMTErrorEntries(ntwrkErrorEntries);
                }
                updateDocument(documentRoot);

            } catch (NumberFormatException ex) {
                setErrorMessage(INVALID_NETWORK_ERROR_ENTRIES);
                ex.printStackTrace();
                return;
            }

        }
    };

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

    private ModifyListener maximumCycleTimeModifyListener = new ModifyListener() {

        @Override
        public void modifyText(ModifyEvent e) {
            setErrorMessage(null);
            String maximumCycleTime = maximumCycleTimeText.getText();
            try {

                if (maximumCycleTime == null) {
                    setErrorMessage(INVALID_MAX_CYCLE_TIME);
                    return;
                }

                if (maximumCycleTime.length() <= 0) {
                    setErrorMessage(EMPTY_CYCLE_TIME_ERROR_MESSAGE);
                    return;
                }

                // Space as first character is not allowed. ppc:tNonEmptyString
                if (maximumCycleTime.contains(" ")) {
                    setErrorMessage(INVALID_MAX_CYCLE_TIME);
                    return;
                }

                if (getGeneralFeatures() != null) {
                    Long maxCycleTimeValue = Long.parseLong(maximumCycleTime);
                    getGeneralFeatures().setNMTCycleTimeMax(maxCycleTimeValue);
                }
                updateDocument(documentRoot);

            } catch (NumberFormatException ex) {
                setErrorMessage(INVALID_MAX_CYCLE_TIME);
                ex.printStackTrace();
                return;
            }

        }
    };

    private ModifyListener minimumCycleTimeModifyListener = new ModifyListener() {

        @Override
        public void modifyText(ModifyEvent e) {
            setErrorMessage(null);
            String minimumCycleTime = minimumCycleTimeText.getText();
            try {

                if (minimumCycleTime == null) {
                    setErrorMessage(EMPTY_MIN_CYCLE_TIME_ERROR_MESSAGE);
                    return;
                }

                if (minimumCycleTime.length() <= 0) {
                    setErrorMessage(INVALID_MIN_CYCLE_TIME);
                    return;
                }

                // Space as first character is not allowed. ppc:tNonEmptyString
                if (minimumCycleTime.contains(" ")) {
                    setErrorMessage(INVALID_MIN_CYCLE_TIME);
                    return;
                }

                if (getGeneralFeatures() != null) {
                    Long minimumCycleTimeValue = Long.parseLong(minimumCycleTime);
                    getGeneralFeatures().setNMTCycleTimeMin(minimumCycleTimeValue);
                }

                updateDocument(documentRoot);

            } catch (NumberFormatException ex) {
                setErrorMessage(INVALID_MIN_CYCLE_TIME);
                ex.printStackTrace();
                return;
            }

        }
    };

    private ModifyListener networkBootTimeModifyListener = new ModifyListener() {

        @Override
        public void modifyText(ModifyEvent e) {
            setErrorMessage(null);
            String networkBootTime = networkBootTimeText.getText();
            try {

                if (networkBootTime == null) {
                    setErrorMessage(EMPTY_NETWORK_BOOT_TIME_ERROR_MESSAGE);
                    return;
                }

                if (networkBootTime.length() <= 0) {
                    setErrorMessage(INVALID_NETWORK_BOOT_TIME);
                    return;
                }

                // Space as first character is not allowed. ppc:tNonEmptyString
                if (networkBootTime.contains(" ")) {
                    setErrorMessage(INVALID_NETWORK_BOOT_TIME);
                    return;
                }

                if (getGeneralFeatures() != null) {
                    Long ntwrkBootTime = Long.parseLong(networkBootTime);
                    getGeneralFeatures().setNMTBootTimeNotActive(ntwrkBootTime);
                }

                updateDocument(documentRoot);

            } catch (NumberFormatException ex) {
                setErrorMessage(INVALID_NETWORK_BOOT_TIME);
                ex.printStackTrace();
                return;
            }

        }
    };

    private TGeneralFeatures getGeneralFeatures() {
        EList<ISO15745ProfileType> profiles = documentRoot.getISO15745ProfileContainer().getISO15745Profile();
        for (ISO15745ProfileType profile : profiles) {
            ProfileBodyDataType profileBody = profile.getProfileBody();
            if (profileBody instanceof ProfileBodyCommunicationNetworkPowerlinkImpl) {
                EList<EObject> bodyContents = profileBody.eContents();
                for (EObject object : bodyContents) {
                    if (object instanceof TNetworkManagementImpl) {
                        TNetworkManagementImpl networkManagement = (TNetworkManagementImpl) object;
                        return networkManagement.getGeneralFeatures();
                    }
                }
            }
        }
        return null;

    }

    private TCNFeatures getCnFeatures() {
        EList<ISO15745ProfileType> profiles = documentRoot.getISO15745ProfileContainer().getISO15745Profile();
        for (ISO15745ProfileType profile : profiles) {
            ProfileBodyDataType profileBody = profile.getProfileBody();
            if (profileBody instanceof ProfileBodyCommunicationNetworkPowerlinkImpl) {
                EList<EObject> bodyContents = profileBody.eContents();
                for (EObject object : bodyContents) {
                    if (object instanceof TNetworkManagementImpl) {
                        TNetworkManagementImpl networkManagement = (TNetworkManagementImpl) object;
                        return networkManagement.getCNFeatures();
                    }
                }
            }
        }
        return null;

    }

    /**
     * Creates the widgets and controls for the general features of device
     * description file.
     *
     * @param managedForm
     *            The parent form.
     */
    private void createGeneralFeaturesSection(final IManagedForm managedForm) {
    	if(toolkit != null) {
        Section generalFeaturesSection = toolkit.createSection(managedForm.getForm().getBody(),
                ExpandableComposite.EXPANDED | Section.DESCRIPTION | ExpandableComposite.TWISTIE
                        | ExpandableComposite.TITLE_BAR);
        managedForm.getToolkit().paintBordersFor(generalFeaturesSection);
        generalFeaturesSection.setText(NetworkManagementEditorPage.GENERAL_FEATURES_SECTION);
        generalFeaturesSection.setDescription(NetworkManagementEditorPage.GENERAL_FEATURES_SECTION_HEADING_DESCRIPTION);

        Composite client = toolkit.createComposite(generalFeaturesSection, SWT.WRAP);
        GridLayout layout = new GridLayout(3, false);
        layout.marginWidth = 2;
        layout.marginHeight = 2;
        client.setLayout(layout);
        toolkit.paintBordersFor(client);
        generalFeaturesSection.setClient(client);

        Label networkBootTime = new Label(client, SWT.NONE);
        networkBootTime.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        networkBootTime.setText(NetworkManagementEditorPage.NETWORK_BOOT_TIME_LABEL);
        toolkit.adapt(networkBootTime, true, true);
        networkBootTime.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        networkBootTimeText = new Text(client, SWT.BORDER | SWT.WRAP);
        networkBootTimeText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        toolkit.adapt(networkBootTimeText, true, true);

        Label minimumCycleTime = new Label(client, SWT.NONE);
        minimumCycleTime.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        minimumCycleTime.setText(NetworkManagementEditorPage.MINIMUM_CYCLE_TIME_LABEL);
        toolkit.adapt(minimumCycleTime, true, true);
        minimumCycleTime.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        minimumCycleTimeText = new Text(client, SWT.BORDER | SWT.WRAP);
        minimumCycleTimeText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        toolkit.adapt(minimumCycleTimeText, true, true);

        Label maximumCycleTimeLabel = new Label(client, SWT.NONE);
        maximumCycleTimeLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        maximumCycleTimeLabel.setText(NetworkManagementEditorPage.MAXIMUM_CYCLE_TIME_LABEL);
        toolkit.adapt(maximumCycleTimeLabel, true, true);
        maximumCycleTimeLabel.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        maximumCycleTimeText = new Text(client, SWT.BORDER | SWT.WRAP);
        maximumCycleTimeText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        toolkit.adapt(maximumCycleTimeText, true, true);

        Label totalNetworkErrorEntries = new Label(client, SWT.NONE);
        totalNetworkErrorEntries.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        totalNetworkErrorEntries.setText(NetworkManagementEditorPage.TOTAL_NETWORK_ERROR_ENTRIES_LABEL);
        toolkit.adapt(totalNetworkErrorEntries, true, true);
        totalNetworkErrorEntries.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        totalNetworkErrorEntriesText = new Text(client, SWT.BORDER | SWT.WRAP);
        totalNetworkErrorEntriesText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        toolkit.adapt(totalNetworkErrorEntriesText, true, true);

        Label networkIpSupportLabel = new Label(client, SWT.NONE);
        networkIpSupportLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        networkIpSupportLabel.setText(NetworkManagementEditorPage.NETWORK_IP_SUPPORT_LABEL);
        toolkit.adapt(networkIpSupportLabel, true, true);
        networkIpSupportLabel.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        networkIpButton = new Button(client, SWT.CHECK);
        networkIpButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        toolkit.adapt(networkIpButton, true, true);
    	}

    }

    /**
     * Creates the widgets and controls for the CN features of device
     * description file.
     *
     * @param managedForm
     *            The parent form.
     */
    private void createCnFeaturesSection(final IManagedForm managedForm) {
    	if(toolkit != null) {
        Section cnFeatureSection = toolkit.createSection(managedForm.getForm().getBody(), ExpandableComposite.EXPANDED
                | Section.DESCRIPTION | ExpandableComposite.TWISTIE | ExpandableComposite.TITLE_BAR);
        managedForm.getToolkit().paintBordersFor(cnFeatureSection);
        cnFeatureSection.setText(NetworkManagementEditorPage.CN_FEATURES_SECTION);
        cnFeatureSection.setDescription(NetworkManagementEditorPage.GENERAL_FEATURES_SECTION_HEADING_DESCRIPTION);

        Composite client = toolkit.createComposite(cnFeatureSection, SWT.WRAP);
        GridLayout layout = new GridLayout(3, false);
        layout.marginWidth = 2;
        layout.marginHeight = 2;
        client.setLayout(layout);
        toolkit.paintBordersFor(client);
        cnFeatureSection.setClient(client);

        Label multiplexedCommunicationlabel = new Label(client, SWT.NONE);
        multiplexedCommunicationlabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        multiplexedCommunicationlabel.setText(NetworkManagementEditorPage.MULTIPLEXED_COMMUNICATION_LABEL);
        toolkit.adapt(multiplexedCommunicationlabel, true, true);
        multiplexedCommunicationlabel.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        multiplexedCommunicationChkBox = new Button(client, SWT.CHECK);

        multiplexedCommunicationChkBox.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(multiplexedCommunicationChkBox, true, true);

        new Label(client, SWT.NONE);
        Label pollresponseChainLabel = new Label(client, SWT.NONE);
        pollresponseChainLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        pollresponseChainLabel.setText(NetworkManagementEditorPage.POLL_RESPONSE_COMMUNICATION_LABEL);
        toolkit.adapt(pollresponseChainLabel, true, true);
        pollresponseChainLabel.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        pollResponseCommunication = new Button(client, SWT.CHECK);
        pollResponseCommunication.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(pollResponseCommunication, true, true);

        new Label(client, SWT.NONE);

        Label timeForPreq = new Label(client, SWT.NONE);
        timeForPreq.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        timeForPreq.setText(NetworkManagementEditorPage.TIME_FOR_PREQ_LABEL);
        toolkit.adapt(timeForPreq, true, true);
        timeForPreq.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

        timeForPreqText = new Text(client, SWT.BORDER | SWT.WRAP);
        timeForPreqText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        toolkit.adapt(timeForPreqText, true, true);
    	}

    }

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
