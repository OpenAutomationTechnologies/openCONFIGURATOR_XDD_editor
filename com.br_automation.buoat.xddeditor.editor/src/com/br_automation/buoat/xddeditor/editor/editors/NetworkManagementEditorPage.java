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

import java.io.IOException;
import java.text.MessageFormat;
import java.util.HashMap;
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
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.forms.IFormColors;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapLayout;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.ISO15745ProfileType;
import com.br_automation.buoat.xddeditor.XDD.ProfileBodyDataType;
import com.br_automation.buoat.xddeditor.XDD.TCNFeatures;
import com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures;
import com.br_automation.buoat.xddeditor.XDD.impl.ProfileBodyCommunicationNetworkPowerlinkImpl;
import com.br_automation.buoat.xddeditor.XDD.impl.TNetworkManagementImpl;
import com.br_automation.buoat.xddeditor.XDD.validation.NameVerifyListener;
import com.br_automation.buoat.xddeditor.XDD.wizards.DataTypeRange;

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
    private static final String CN_FEATURES_SECTION = "Node Features";
    private static final String GENERAL_FEATURES_SECTION_HEADING_DESCRIPTION = "Provides information about the general network management features.";
    private static final String CN_FEATURES_SECTION_HEADING_DESCRIPTION = "Provides information about the network management features of node.";
    private static final String TIME_FOR_PREQ_LABEL = "Time for PReq (ns):";
    private static final String NETWORK_IP_SUPPORT_LABEL = "Network IP Support:";
    private static final String TOTAL_NETWORK_ERROR_ENTRIES_LABEL = "Total Network Error Entries:";
    private static final String MAXIMUM_CYCLE_TIME_LABEL = "Maximum Cycle Time (\u00B5s):";

    private static final String MINIMUM_CYCLE_TIME_LABEL = "Minimum Cycle Time (\u00B5s):";
    private static final String NETWORK_BOOT_TIME_LABEL = "Network Boot Time  (\u00B5s):";

    private static final String MULTIPLEXED_COMMUNICATION_LABEL = "Multiplexed Communication";
    private static final String POLL_RESPONSE_COMMUNICATION_LABEL = "Poll Response Chaining Communication";

    private static final String FORM_EDITOR_PAGE_TITLE = "Device Description File Editor";

    public static final String INVALID_PREQ_TIME_VALUE_EMPTY_ERROR = "PReq time cannot be empty.";
    public static final String INVALID_NETWORK_EMPTY_ERROR_ENTRIES = "Network error entries cannot be empty.";
    public static final String INVALID_MAX_CYCLE_TIME = "Maximum cycle time value invalid.";
    public static final String INVALID_MIN_CYCLE_TIME = "Invalid minimum cycle time value.";
    public static final String EMPTY_CYCLE_TIME_ERROR_MESSAGE = "Cycle time cannot be empty.";
    public static final String EMPTY_MIN_CYCLE_TIME_ERROR_MESSAGE = "Minimum cycle time cannot be empty.";
    public static final String EMPTY_NETWORK_BOOT_TIME_ERROR_MESSAGE = "Network boot time cannot be empty.";
    public static final String INVALID_NETWORK_BOOT_TIME = "Invalid network boot time value.";

    private static final String INVALID_PREQ_TIME_SPACE_ERROR = "PReq time cannot start with spaces.";
    private static final String INVALID_NETWORK_BOOT_TIME_SPACE_ERROR = "Network boot time cannot start with spaces.";
    private static final String INVALID_NETWORK_ERROR_ENTRIES_SPACE_ERROR = "Network error entries cannot start with spaces.";

    private static final String MAXIMUM_CYCLE_TIME_OUT_OF_RANGE = "Maximum cycle time value {0} does not fit within the range (0 - 4,294,967,295) of data type 'Unsigned32'.";
    private static final String MAXIMUM_CYCLE_LESS_THAN_MINIMUM_CYCLE_TIME = "Maximum cycle time value {0} cannot be lesser than minimum cycle time value {1}.";
    private static final String MINIMUM_CYCLE_TIME_OUT_OF_RANGE = "Minimum cycle time value {0} does not fit within the range (0 - 4,294,967,295) of data type 'Unsigned32'.";
    private static final String MINIMUM_CYCLE_GREATER_MAXIMUM_CYCLE_TIME = "Minimum cycle time value {0} cannot be greater than maximum cycle time value {1}.";
    private static final String NETWORK_BOOT_TIME_OUT_OF_RANGE = "Network boot time value {0} does not fit within the range (0 - 4,294,967,295) of data type 'Unsigned32'.";
    private static final String TIME_FOR_PREQ_OUT_OF_RANGE = "Time for PReq value {0} does not fit within the range (0 - 4,294,967,295) of data type 'Unsigned32'.";

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

    /**
     * Name verify listener
     */
    private NameVerifyListener nameVerifyListener = new NameVerifyListener();

    /*
     * Constructor
     */
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
            updateDocument(documentRoot);
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
            updateDocument(documentRoot);
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
            updateDocument(documentRoot);
        }
    };

    private void setErrorMessage(String message) {
        if (form != null) {
            form.setMessage(message, IMessageProvider.ERROR);
            if (message == null) {
                message = StringUtils.EMPTY;
                form.setMessage(message, IMessageProvider.NONE);
            }

            networkBootTimeText.setEditable(true);
            maximumCycleTimeText.setEditable(true);
            minimumCycleTimeText.setEditable(true);
            totalNetworkErrorEntriesText.setEditable(true);
            timeForPreqText.setEditable(true);
        }
    }

    private void setErrorMessage(String message, String fieldLabel) {
        if (form != null) {
            form.setMessage(message, IMessageProvider.ERROR);
            switch (fieldLabel) {
            case MINIMUM_CYCLE_TIME_LABEL:

                networkBootTimeText.setEditable(false);
                maximumCycleTimeText.setEditable(false);
                totalNetworkErrorEntriesText.setEditable(false);
                timeForPreqText.setEditable(false);
                break;
            case MAXIMUM_CYCLE_TIME_LABEL:
                minimumCycleTimeText.setEditable(false);
                networkBootTimeText.setEditable(false);
                totalNetworkErrorEntriesText.setEditable(false);
                timeForPreqText.setEditable(false);
                break;
            case NETWORK_BOOT_TIME_LABEL:
                minimumCycleTimeText.setEditable(false);
                maximumCycleTimeText.setEditable(false);
                totalNetworkErrorEntriesText.setEditable(false);
                timeForPreqText.setEditable(false);
                break;
            case TOTAL_NETWORK_ERROR_ENTRIES_LABEL:
                minimumCycleTimeText.setEditable(false);
                networkBootTimeText.setEditable(false);
                maximumCycleTimeText.setEditable(false);
                timeForPreqText.setEditable(false);
                break;
            case TIME_FOR_PREQ_LABEL:
                minimumCycleTimeText.setEditable(false);
                networkBootTimeText.setEditable(false);
                maximumCycleTimeText.setEditable(false);
                totalNetworkErrorEntriesText.setEditable(false);

                break;

            default:
                System.err.println("Invalid selection!");
                break;
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
                    setErrorMessage(INVALID_PREQ_TIME_VALUE_EMPTY_ERROR, TIME_FOR_PREQ_LABEL);
                    return;
                }

                if (timeforPreqText.length() <= 0) {
                    setErrorMessage(INVALID_PREQ_TIME_VALUE_EMPTY_ERROR, TIME_FOR_PREQ_LABEL);
                    return;
                }

                // Space as first character is not allowed. ppc:tNonEmptyString
                if (timeforPreqText.contains(" ")) {
                    setErrorMessage(INVALID_PREQ_TIME_SPACE_ERROR, TIME_FOR_PREQ_LABEL);
                    return;
                }

                Long value = Long.parseLong(timeforPreqText);
                if (value < DataTypeRange.Unsigned32_min || value > DataTypeRange.Unsigned32_max) {
                    setErrorMessage(MessageFormat.format(TIME_FOR_PREQ_OUT_OF_RANGE, timeforPreqText));
                    return;

                }

                if (getCnFeatures() != null) {
                    Long preqTimeValue = Long.parseLong(timeforPreqText);
                    getCnFeatures().setNMTCNSoC2PReq(preqTimeValue);
                }
                updateDocument(documentRoot);

            } catch (NumberFormatException ex) {
                setErrorMessage(INVALID_PREQ_TIME_VALUE_EMPTY_ERROR, TIME_FOR_PREQ_LABEL);
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
                    setErrorMessage(INVALID_NETWORK_EMPTY_ERROR_ENTRIES, TOTAL_NETWORK_ERROR_ENTRIES_LABEL);
                    return;
                }

                if (totalNetworkEntry.length() <= 0) {
                    setErrorMessage(INVALID_NETWORK_EMPTY_ERROR_ENTRIES, TOTAL_NETWORK_ERROR_ENTRIES_LABEL);
                    return;
                }

                // Space as first character is not allowed. ppc:tNonEmptyString
                if (totalNetworkEntry.contains(" ")) {
                    setErrorMessage(INVALID_NETWORK_ERROR_ENTRIES_SPACE_ERROR, TOTAL_NETWORK_ERROR_ENTRIES_LABEL);
                    return;
                }

                Long value = Long.parseLong(totalNetworkEntry);
                if (value < DataTypeRange.Unsigned32_min || value > DataTypeRange.Unsigned32_max) {
                    setErrorMessage(MessageFormat.format(NETWORK_BOOT_TIME_OUT_OF_RANGE, totalNetworkEntry));
                    return;

                }

                if (getGeneralFeatures() != null) {
                    Long ntwrkErrorEntries = Long.parseLong(totalNetworkEntry);
                    getGeneralFeatures().setNMTErrorEntries(ntwrkErrorEntries);
                }
                updateDocument(documentRoot);

            } catch (NumberFormatException ex) {
                setErrorMessage(INVALID_NETWORK_EMPTY_ERROR_ENTRIES, TOTAL_NETWORK_ERROR_ENTRIES_LABEL);
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

    private ModifyListener maximumCycleTimeModifyListener = new ModifyListener() {

        @Override
        public void modifyText(ModifyEvent e) {
            setErrorMessage(null);
            String maximumCycleTime = maximumCycleTimeText.getText();
            String minimumCycleTime = minimumCycleTimeText.getText();
            try {

                if (maximumCycleTime == null) {
                    setErrorMessage(EMPTY_CYCLE_TIME_ERROR_MESSAGE, MAXIMUM_CYCLE_TIME_LABEL);
                    return;
                }

                if (maximumCycleTime.length() <= 0) {
                    setErrorMessage(EMPTY_CYCLE_TIME_ERROR_MESSAGE, MAXIMUM_CYCLE_TIME_LABEL);
                    return;
                }

                // Space as first character is not allowed. ppc:tNonEmptyString
                if (maximumCycleTime.contains(" ")) {
                    setErrorMessage(INVALID_MAX_CYCLE_TIME, MAXIMUM_CYCLE_TIME_LABEL);
                    return;
                }

                Long value = Long.parseLong(maximumCycleTime);
                if (value < DataTypeRange.Unsigned32_min || value > DataTypeRange.Unsigned32_max) {
                    setErrorMessage(MessageFormat.format(MAXIMUM_CYCLE_TIME_OUT_OF_RANGE, maximumCycleTime));
                    return;

                }

                if (!minimumCycleTime.isEmpty()) {
                    Long minValue = Long.parseLong(minimumCycleTime);
                    if (value < minValue) {
                        setErrorMessage(MessageFormat.format(MAXIMUM_CYCLE_LESS_THAN_MINIMUM_CYCLE_TIME, value,
                                minimumCycleTime));
                    }
                }

                if (getGeneralFeatures() != null) {
                    Long maxCycleTimeValue = Long.parseLong(maximumCycleTime);
                    getGeneralFeatures().setNMTCycleTimeMax(maxCycleTimeValue);
                }
                updateDocument(documentRoot);

            } catch (NumberFormatException ex) {
                setErrorMessage(INVALID_MAX_CYCLE_TIME, MAXIMUM_CYCLE_TIME_LABEL);
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
            String maximumCycleTime = maximumCycleTimeText.getText();
            try {

                if (minimumCycleTime == null) {
                    setErrorMessage(EMPTY_MIN_CYCLE_TIME_ERROR_MESSAGE, MINIMUM_CYCLE_TIME_LABEL);
                    return;
                }

                if (minimumCycleTime.length() <= 0) {
                    setErrorMessage(EMPTY_MIN_CYCLE_TIME_ERROR_MESSAGE, MINIMUM_CYCLE_TIME_LABEL);
                    return;
                }

                // Space as first character is not allowed. ppc:tNonEmptyString
                if (minimumCycleTime.contains(" ")) {
                    setErrorMessage(INVALID_MIN_CYCLE_TIME, MINIMUM_CYCLE_TIME_LABEL);
                    return;
                }

                Long value = Long.parseLong(minimumCycleTime);
                if (value < DataTypeRange.Unsigned32_min || value > DataTypeRange.Unsigned32_max) {
                    setErrorMessage(MessageFormat.format(MINIMUM_CYCLE_TIME_OUT_OF_RANGE, minimumCycleTime));
                    return;

                }

                if (!maximumCycleTime.isEmpty()) {
                    Long maxValue = Long.parseLong(maximumCycleTime);
                    if (value > maxValue) {
                        setErrorMessage(MessageFormat.format(MINIMUM_CYCLE_GREATER_MAXIMUM_CYCLE_TIME, value,
                                maximumCycleTime));
                    }
                }

                if (getGeneralFeatures() != null) {
                    Long minimumCycleTimeValue = Long.parseLong(minimumCycleTime);
                    getGeneralFeatures().setNMTCycleTimeMin(minimumCycleTimeValue);
                }

                updateDocument(documentRoot);

            } catch (NumberFormatException ex) {
                setErrorMessage(INVALID_MIN_CYCLE_TIME, MINIMUM_CYCLE_TIME_LABEL);
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
                    setErrorMessage(EMPTY_NETWORK_BOOT_TIME_ERROR_MESSAGE, NETWORK_BOOT_TIME_LABEL);
                    return;
                }

                if (networkBootTime.length() <= 0) {
                    setErrorMessage(EMPTY_NETWORK_BOOT_TIME_ERROR_MESSAGE, NETWORK_BOOT_TIME_LABEL);
                    return;
                }

                // Space as first character is not allowed. ppc:tNonEmptyString
                if (networkBootTime.contains(" ")) {
                    setErrorMessage(INVALID_NETWORK_BOOT_TIME_SPACE_ERROR, NETWORK_BOOT_TIME_LABEL);
                    return;
                }

                Long value = Long.parseLong(networkBootTime);
                if (value < DataTypeRange.Unsigned32_min || value > DataTypeRange.Unsigned32_max) {
                    setErrorMessage(MessageFormat.format(NETWORK_BOOT_TIME_OUT_OF_RANGE, networkBootTime));
                    return;

                }

                if (getGeneralFeatures() != null) {
                    Long ntwrkBootTime = Long.parseLong(networkBootTime);
                    getGeneralFeatures().setNMTBootTimeNotActive(ntwrkBootTime);
                }

                updateDocument(documentRoot);

            } catch (NumberFormatException ex) {
                setErrorMessage(INVALID_NETWORK_BOOT_TIME, NETWORK_BOOT_TIME_LABEL);
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
        if (toolkit != null) {
            Section generalFeaturesSection = toolkit.createSection(managedForm.getForm().getBody(),
                    ExpandableComposite.EXPANDED | Section.DESCRIPTION | ExpandableComposite.TWISTIE
                            | ExpandableComposite.TITLE_BAR);
            managedForm.getToolkit().paintBordersFor(generalFeaturesSection);
            generalFeaturesSection.setText(NetworkManagementEditorPage.GENERAL_FEATURES_SECTION);
            generalFeaturesSection
                    .setDescription(NetworkManagementEditorPage.GENERAL_FEATURES_SECTION_HEADING_DESCRIPTION);

            Composite client = toolkit.createComposite(generalFeaturesSection, SWT.WRAP);
            GridLayout layout = new GridLayout(3, false);
            layout.marginWidth = 2;
            layout.marginHeight = 2;
            client.setLayout(layout);
            toolkit.paintBordersFor(client);
            generalFeaturesSection.setClient(client);

            GridData gensec = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1);
            gensec.heightHint = 20;
            gensec.widthHint = 250;

            Label networkBootTime = new Label(client, SWT.NONE);
            networkBootTime.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            networkBootTime.setText(NetworkManagementEditorPage.NETWORK_BOOT_TIME_LABEL);
            toolkit.adapt(networkBootTime, true, true);
            networkBootTime.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

            networkBootTimeText = new Text(client, SWT.BORDER | SWT.WRAP);
            networkBootTimeText.setLayoutData(gensec);
            toolkit.adapt(networkBootTimeText, true, true);

            Label minimumCycleTime = new Label(client, SWT.NONE);
            minimumCycleTime.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            minimumCycleTime.setText(NetworkManagementEditorPage.MINIMUM_CYCLE_TIME_LABEL);
            toolkit.adapt(minimumCycleTime, true, true);
            minimumCycleTime.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

            minimumCycleTimeText = new Text(client, SWT.BORDER | SWT.WRAP);
            minimumCycleTimeText.setLayoutData(gensec);
            toolkit.adapt(minimumCycleTimeText, true, true);

            Label maximumCycleTimeLabel = new Label(client, SWT.NONE);
            maximumCycleTimeLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            maximumCycleTimeLabel.setText(NetworkManagementEditorPage.MAXIMUM_CYCLE_TIME_LABEL);
            toolkit.adapt(maximumCycleTimeLabel, true, true);
            maximumCycleTimeLabel.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

            maximumCycleTimeText = new Text(client, SWT.BORDER | SWT.WRAP);
            maximumCycleTimeText.setLayoutData(gensec);
            toolkit.adapt(maximumCycleTimeText, true, true);

            Label totalNetworkErrorEntries = new Label(client, SWT.NONE);
            totalNetworkErrorEntries.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            totalNetworkErrorEntries.setText(NetworkManagementEditorPage.TOTAL_NETWORK_ERROR_ENTRIES_LABEL);
            toolkit.adapt(totalNetworkErrorEntries, true, true);
            totalNetworkErrorEntries.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

            totalNetworkErrorEntriesText = new Text(client, SWT.BORDER | SWT.WRAP);
            totalNetworkErrorEntriesText.setLayoutData(gensec);
            toolkit.adapt(totalNetworkErrorEntriesText, true, true);

            Label networkIpSupportLabel = new Label(client, SWT.NONE);
            networkIpSupportLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            networkIpSupportLabel.setText(NetworkManagementEditorPage.NETWORK_IP_SUPPORT_LABEL);
            toolkit.adapt(networkIpSupportLabel, true, true);
            networkIpSupportLabel.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

            networkIpButton = new Button(client, SWT.CHECK);
            networkIpButton.setLayoutData(gensec);
            toolkit.adapt(networkIpButton, true, true);

            updateGeneralFeatureFields();
        }

    }

    private void updateGeneralFeatureFields() {

        if (getGeneralFeatures() != null) {
            if (getGeneralFeatures().getNMTBootTimeNotActive() != 0) {
                networkBootTimeText.setText(String.valueOf(getGeneralFeatures().getNMTBootTimeNotActive()));
            }
            minimumCycleTimeText.setText(String.valueOf(getGeneralFeatures().getNMTCycleTimeMin()));
            maximumCycleTimeText.setText(String.valueOf(getGeneralFeatures().getNMTCycleTimeMax()));
            totalNetworkErrorEntriesText.setText(String.valueOf(getGeneralFeatures().getNMTErrorEntries()));

            if (getGeneralFeatures().isNWLIPSupport()) {
                networkIpButton.setSelection(true);
            }
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
        if (toolkit != null) {
            Section cnFeatureSection = toolkit.createSection(managedForm.getForm().getBody(),
                    ExpandableComposite.EXPANDED | Section.DESCRIPTION | ExpandableComposite.TWISTIE
                            | ExpandableComposite.TITLE_BAR);
            managedForm.getToolkit().paintBordersFor(cnFeatureSection);
            cnFeatureSection.setText(NetworkManagementEditorPage.CN_FEATURES_SECTION);
            cnFeatureSection.setDescription(NetworkManagementEditorPage.CN_FEATURES_SECTION_HEADING_DESCRIPTION);

            Composite client = toolkit.createComposite(cnFeatureSection, SWT.WRAP);
            GridLayout layout = new GridLayout(3, false);
            layout.marginWidth = 2;
            layout.marginHeight = 2;
            client.setLayout(layout);
            toolkit.paintBordersFor(client);
            cnFeatureSection.setClient(client);

            GridData cnsec = new GridData(SWT.LEFT, SWT.CENTER, true, false, 2, 1);
            cnsec.heightHint = 15;
            cnsec.widthHint = 250;

            Label multiplexedCommunicationlabel = new Label(client, SWT.NONE);
            multiplexedCommunicationlabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            multiplexedCommunicationlabel.setText(NetworkManagementEditorPage.MULTIPLEXED_COMMUNICATION_LABEL);
            toolkit.adapt(multiplexedCommunicationlabel, true, true);
            multiplexedCommunicationlabel.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

            multiplexedCommunicationChkBox = new Button(client, SWT.CHECK);
            multiplexedCommunicationChkBox.setLayoutData(cnsec);
            toolkit.adapt(multiplexedCommunicationChkBox, true, true);

            Label pollresponseChainLabel = new Label(client, SWT.NONE);
            pollresponseChainLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            pollresponseChainLabel.setText(NetworkManagementEditorPage.POLL_RESPONSE_COMMUNICATION_LABEL);
            toolkit.adapt(pollresponseChainLabel, true, true);
            pollresponseChainLabel.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

            pollResponseCommunication = new Button(client, SWT.CHECK);
            pollResponseCommunication.setLayoutData(cnsec);
            toolkit.adapt(pollResponseCommunication, true, true);

            Label timeForPreq = new Label(client, SWT.NONE);
            timeForPreq.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
            timeForPreq.setText(NetworkManagementEditorPage.TIME_FOR_PREQ_LABEL);
            toolkit.adapt(timeForPreq, true, true);
            timeForPreq.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));

            timeForPreqText = new Text(client, SWT.BORDER | SWT.WRAP);
            timeForPreqText.setLayoutData(cnsec);
            toolkit.adapt(timeForPreqText, true, true);

            updateCnFeatureFields();
        }

    }

    private void updateCnFeatureFields() {
        if (getCnFeatures() != null) {
            if (getCnFeatures().isDLLCNFeatureMultiplex()) {
                multiplexedCommunicationChkBox.setSelection(true);
            }
            if (getCnFeatures().isDLLCNPResChaining()) {
                pollResponseCommunication.setSelection(true);
            }
            timeForPreqText.setText(String.valueOf(getCnFeatures().getNMTCNSoC2PReq()));
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
