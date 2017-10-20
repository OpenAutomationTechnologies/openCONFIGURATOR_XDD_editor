/*******************************************************************************
 * @file   Index1F82DetailsPage.java
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
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.xml.bind.DatatypeConverter;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IFormColors;
import org.eclipse.ui.forms.IFormPart;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.Section;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.custom.Messages;
import com.br_automation.buoat.xddeditor.XDD.custom.XDDUtilities;
import com.br_automation.buoat.xddeditor.XDD.impl.TObjectImpl;
import com.br_automation.buoat.xddeditor.XDD.resources.IPowerlinkConstants;

/**
 * Class to populate the details page of Object index 0x1F82
 *
 * @author Sree Hari Vignesh
 *
 */
public class Index1F82DetailsPage implements IDetailsPage {

    private IManagedForm managedForm;

    private Text indexText;

    private Text nameText;
    private Text objTypeText;
    private TObjectImpl index1F82Object;
    private DocumentRoot docRoot;
    private DeviceDescriptionFileEditor editor;

    public Index1F82DetailsPage(TObjectImpl index1f82Object, DocumentRoot docRoot, DeviceDescriptionFileEditor editor) {
        this.index1F82Object = index1f82Object;
        this.docRoot = docRoot;
        this.editor = editor;
    }

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

    private TObject tobject;

    @Override
    public void selectionChanged(IFormPart part, ISelection selection) {
        if (selection instanceof IStructuredSelection) {
            IStructuredSelection sel = (IStructuredSelection) selection;
            TObjectImpl obj = (TObjectImpl) sel.getFirstElement();

            this.tobject = (TObject) obj;
            if (lblError != null) {
                this.lblError.setText(""); //$NON-NLS-1$
            }
            if (this.tobject.getDefaultValue() != null)

                if (valueOfLblDefaultValue != null) {
                    this.valueOfLblDefaultValue.setText(this.tobject.getDefaultValue().toUpperCase());
                }

            if (this.tobject.getIndex() != null && this.tobject.getDefaultValue() != null) {
                try {
                    long defaultValue = Integer.decode(this.tobject.getDefaultValue());
                    if ((defaultValue & (1 << 17)) != 0 || defaultValue >= 0x80000)
                        throw new NumberFormatException(); // Also throw this
                                                            // exception when a
                                                            // wrong bit is set
                                                            // or
                                                            // too long value!

                    Set<Entry<Button, Integer>> buttonSet = this.buttonMap.entrySet();
                    for (Entry<Button, Integer> entry : buttonSet) {
                        int bitOffset = entry.getValue().intValue();
                        if ((defaultValue & (1 << bitOffset)) != 0) // Check if
                                                                    // bit
                                                                    // of button
                                                                    // is
                                                                    // set
                            entry.getKey().setSelection(true); // if yes, set
                                                                // the
                                                                // selection to
                                                                // true
                        else
                            entry.getKey().setSelection(false);
                    }
                } catch (NumberFormatException e) {
                    // Set error-text
                    this.lblError.setText(Messages.general_error_defaultValueInvalid);
                    this.lblError.setForeground(XDDUtilities.getRed(Display.getCurrent()));
                }

            }

            if (obj.getIndex() != null) {
                String index = DatatypeConverter.printHexBinary(obj.getIndex());
                index = "0x" + index;
                if (indexText != null) {
                    indexText.setText(index);
                }
            }

            if (obj.getName() != null) {
                if (nameText != null) {
                    nameText.setText(obj.getName());
                }
            }

            if (obj.getObjectType() != 0) {
                String objectType = String.valueOf(obj.getObjectType());
                if (objectType.equalsIgnoreCase("7")) {
                    if (objTypeText != null) {
                        objTypeText.setText("7 - VAR");
                    }
                } else if (objectType.equalsIgnoreCase("8")) {
                    if (objTypeText != null) {
                        objTypeText.setText("8 - ARRAY");
                    }
                } else if (objectType.equalsIgnoreCase("9")) {
                    if (objTypeText != null) {
                        objTypeText.setText("9 - RECORD");
                    }
                }
            }
        }

    }

    private final Map<Button, Integer> buttonMap = new HashMap<Button, Integer>();

    private final SelectionListener selectionListener = new SelectionAdapter() {

        @Override
        public void widgetSelected(SelectionEvent e) {
            try {
                long currentValue = Long.decode(tobject.getDefaultValue());
                if ((currentValue & (1 << 17)) != 0 || currentValue >= 0x80000)
                    throw new NumberFormatException(); // Throw format exception
                                                        // if wrong bit is set
                                                        // or too long!

                // CHECK FOR INVALID BITS!
            } catch (NumberFormatException e2) {
                // Generate a valid default-value by using selected checkboxes,
                // if user had entered an invalid value but wants to continue...
                tobject.setDefaultValue("0"); //$NON-NLS-1$
                Set<Entry<Button, Integer>> buttonSet = buttonMap.entrySet();

                long newDefaultValue = 0;
                for (Entry<Button, Integer> entry : buttonSet) {
                    int bitOffset = entry.getValue();
                    if (entry.getKey().getSelection()) {
                        newDefaultValue = newDefaultValue | (1 << bitOffset);
                    } else
                        newDefaultValue = newDefaultValue & ~(1 << bitOffset);
                }
                tobject.setDefaultValue("0x" //$NON-NLS-1$
                        + Long.toHexString(newDefaultValue).toUpperCase());
            }
            lblError.setText(""); //$NON-NLS-1$
            Button currentButton = (Button) e.getSource();
            int bitOffset = buttonMap.get(currentButton);
            XDDUtilities.setFeatureFlag(currentButton.getSelection(), bitOffset,
                    (DocumentRoot) EcoreUtil.getRootContainer(tobject));
            String defaultValue = tobject.getDefaultValue().substring(2);
            valueOfLblDefaultValue.setText("0x" + defaultValue.toUpperCase());
            index1F82Object.setDefaultValue(valueOfLblDefaultValue.getText());
            updateDocument(docRoot);
        }
    }; // SelectionListener

    private Label valueOfLblDefaultValue;
    private Label lblError;

    @Override
    public void createContents(Composite parent) {

        GridLayout layout = new GridLayout(1, true);

        parent.setLayout(layout);
        layout.marginWidth = 20;
        Section index1F82Section = managedForm.getToolkit().createSection(parent, ExpandableComposite.EXPANDED
                | Section.DESCRIPTION | ExpandableComposite.TWISTIE | ExpandableComposite.TITLE_BAR);
        managedForm.getToolkit().paintBordersFor(index1F82Section);
        index1F82Section.setText(ObjectDictionaryEditorPage.OBJECT_DICTIONARY_DETAILS_HEADING);

        Composite clientComposite = managedForm.getToolkit().createComposite(index1F82Section, SWT.WRAP);
        GridLayout layouts = new GridLayout(1, true);
        layouts.marginWidth = 2;
        layouts.marginHeight = 2;
        clientComposite.setLayout(layouts);
        managedForm.getToolkit().paintBordersFor(clientComposite);

        index1F82Section.setClient(clientComposite);

        Composite groupComposite = new Composite(clientComposite, SWT.NONE);
        groupComposite.setLayout(new GridLayout(1, false));

        Group grpMandatoryData = new Group(groupComposite, SWT.NONE);
        GridData gd_grpConfigurationFile = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
        gd_grpConfigurationFile.widthHint = 500;
        grpMandatoryData.setLayoutData(gd_grpConfigurationFile);
        grpMandatoryData.setText(IPowerlinkConstants.MANDATORY_DATA_GROUP);
        grpMandatoryData.setLayout(new GridLayout(6, false));

        Label nameLabel = new Label(grpMandatoryData, SWT.NONE);
        nameLabel.setText(IPowerlinkConstants.OBJECT_NAME);
        managedForm.getToolkit().adapt(nameLabel, true, true);
        nameLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

        nameText = new Text(grpMandatoryData, SWT.BORDER | SWT.WRAP);
        nameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
        managedForm.getToolkit().adapt(nameText, true, true);
        nameText.setEditable(false);
        nameText.setEnabled(false);

        Label objTypelabel = new Label(grpMandatoryData, SWT.NONE);
        objTypelabel.setText(IPowerlinkConstants.OBJECT_TYPE);
        managedForm.getToolkit().adapt(objTypelabel, true, true);
        objTypelabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

        objTypeText = new Text(grpMandatoryData, SWT.BORDER | SWT.WRAP);
        objTypeText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
        managedForm.getToolkit().adapt(objTypeText, true, true);
        objTypeText.setEditable(false);
        objTypeText.setEnabled(false);

        Label indexLabel = new Label(grpMandatoryData, SWT.NONE);
        indexLabel.setText(IPowerlinkConstants.OBJECT_INDEX);
        managedForm.getToolkit().adapt(indexLabel, true, true);
        indexLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

        indexText = new Text(grpMandatoryData, SWT.BORDER | SWT.WRAP);
        indexText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
        managedForm.getToolkit().adapt(indexText, true, true);
        indexText.setEditable(false);
        indexText.setEnabled(false);

        Composite groupComposite2 = new Composite(clientComposite, SWT.NONE);
        groupComposite2.setLayout(new GridLayout(2, false));

        Group grpOptionalData = new Group(groupComposite2, SWT.NONE);
        GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
        gridData.widthHint = 500;
        grpOptionalData.setLayoutData(gridData);
        grpOptionalData.setText("Optional Feature Flags");
        grpOptionalData.setLayout(new GridLayout(2, false));

        // Checkbox-Buttons -------------------------------------------

        // optionalFlags Label
        Label defaultValueLabel = managedForm.getToolkit().createLabel(grpOptionalData,
                IPowerlinkConstants.DEFAULT_VALUE);
        defaultValueLabel.setToolTipText("Default value of object 0x1F82.");

        // lblDefaultValue Label
        this.valueOfLblDefaultValue = managedForm.getToolkit().createLabel(grpOptionalData, "      Not found!     ");

        // Isonchronus
        Button btnIsochronous = managedForm.getToolkit().createButton(grpOptionalData,
                IPowerlinkConstants.ISOCHRONOUS_MODE_LABEL, SWT.CHECK); // $NON-NLS-1$
        btnIsochronous.setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnIsochronous_tooltip);
        btnIsochronous.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnIsochronous, 0);

        // btnSDObyUDPIP
        Button btnSDObyUDPIP = managedForm.getToolkit().createButton(grpOptionalData,
                IPowerlinkConstants.SDO_BY_UDP_LABEL, // $NON-NLS-1$
                Integer.valueOf(SWT.CHECK));
        btnSDObyUDPIP.setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnSDObyUDPIP_tooltip);
        btnSDObyUDPIP.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnSDObyUDPIP, Integer.valueOf(1));

        // btnSDObyASnd
        Button btnSDObyASnd = managedForm.getToolkit().createButton(grpOptionalData,
                IPowerlinkConstants.SDO_BYASND_LABEL, // $NON-NLS-1$
                Integer.valueOf(SWT.CHECK));
        btnSDObyASnd.setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnSDObyASnd_tooltip);
        btnSDObyASnd.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnSDObyASnd, Integer.valueOf(2));

        // btnSDObyPDO
        Button btnSDObyPDO = managedForm.getToolkit().createButton(grpOptionalData,
                IPowerlinkConstants.SDO_BY_PDO_LABEL, SWT.CHECK); // $NON-NLS-1$
        btnSDObyPDO.setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnSDObyPDO_tooltip);
        btnSDObyPDO.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnSDObyPDO, Integer.valueOf(3));

        // btnNMTInfoServices
        Button btnNMTInfoServices = managedForm.getToolkit().createButton(grpOptionalData,
                IPowerlinkConstants.NMT_INFO_SERVICES, // $NON-NLS-1$
                SWT.CHECK);
        btnNMTInfoServices.setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnNMTInfoServices_tooltip);
        btnNMTInfoServices.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnNMTInfoServices, Integer.valueOf(4));

        // btnExtendedNMTStateCommands
        Button btnExtendedNMTStateCommands = managedForm.getToolkit().createButton(grpOptionalData,
                IPowerlinkConstants.EXTENDED_NMT_STATE_COMMANDS, SWT.CHECK); // $NON-NLS-1$
        btnExtendedNMTStateCommands
                .setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnExtendedNMTStateCommands_tooltip);
        btnExtendedNMTStateCommands.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnExtendedNMTStateCommands, Integer.valueOf(5));

        // btnDynamicPDOMapping
        Button btnDynamicPDOMapping = managedForm.getToolkit().createButton(grpOptionalData,
                IPowerlinkConstants.DYNAMIC_PDO_MAPPING, // $NON-NLS-1$
                SWT.CHECK);
        btnDynamicPDOMapping.setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnDynamicPDOMapping_tooltip);
        btnDynamicPDOMapping.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnDynamicPDOMapping, Integer.valueOf(6));

        // btnNMTServicebyUDPIP
        Button btnNMTServicebyUDPIP = managedForm.getToolkit().createButton(grpOptionalData,
                IPowerlinkConstants.NMT_SERVICE_BY_UDP, // $NON-NLS-1$
                SWT.CHECK);
        btnNMTServicebyUDPIP.setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnNMTServicebyUDPIP_tooltip);
        btnNMTServicebyUDPIP.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnNMTServicebyUDPIP, Integer.valueOf(7));

        Button btnMultipleASnd = managedForm.getToolkit().createButton(grpOptionalData,
                IPowerlinkConstants.MULTI_ASND_SUPPORT, // $NON-NLS-1$
                SWT.CHECK);
        btnMultipleASnd.setToolTipText(Messages.advancedFeatureFlagsPropertySection_tooltip_multipleASnd);
        btnMultipleASnd.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnMultipleASnd, Integer.valueOf(16));

        // btnConfigurationManager
        Button btnConfigurationManager = managedForm.getToolkit().createButton(grpOptionalData,
                IPowerlinkConstants.CONFIGURATION_MANAGER_LABEL, SWT.CHECK); // $NON-NLS-1$
        btnConfigurationManager
                .setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnConfigurationManager_tooltip);
        btnConfigurationManager.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnConfigurationManager, Integer.valueOf(8));

        // btnMultiplexedAccess
        Button btnMultiplexedAccess = managedForm.getToolkit().createButton(grpOptionalData,
                IPowerlinkConstants.MULTIPLEXED_ACCESS, // $NON-NLS-1$
                SWT.CHECK);
        btnMultiplexedAccess.setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnMultiplexedAccess_tooltip);
        btnMultiplexedAccess.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnMultiplexedAccess, Integer.valueOf(9));

        // btnNodeIDsetupbySW
        Button btnNodeIDsetupbySW = managedForm.getToolkit().createButton(grpOptionalData,
                IPowerlinkConstants.NODE_ID_SETUP_BY_SW, // $NON-NLS-1$
                SWT.CHECK);
        btnNodeIDsetupbySW.setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnNodeIDsetupbySW_tooltip);
        btnNodeIDsetupbySW.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnNodeIDsetupbySW, Integer.valueOf(10));

        // btnMNBasicEthernetMode
        Button btnMNBasicEthernetMode = managedForm.getToolkit().createButton(grpOptionalData,
                IPowerlinkConstants.MN_BASIC_ETHERNET_MODE, // $NON-NLS-1$
                SWT.CHECK);
        btnMNBasicEthernetMode
                .setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnMNBasicEthernetMode_tooltip);
        btnMNBasicEthernetMode.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnMNBasicEthernetMode, Integer.valueOf(11));

        // btnRoutingType1Support
        Button btnRoutingType1Support = managedForm.getToolkit().createButton(grpOptionalData,
                IPowerlinkConstants.ROUTING_TYPE_1_SUPPORT, // $NON-NLS-1$
                SWT.CHECK);
        btnRoutingType1Support
                .setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnRoutingType1Support_tooltip);
        btnRoutingType1Support.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnRoutingType1Support, Integer.valueOf(12));

        // btnRoutingType2Support
        Button btnRoutingType2Support = managedForm.getToolkit().createButton(grpOptionalData,
                IPowerlinkConstants.ROUTING_TYPE_2_SUPPORT, // $NON-NLS-1$
                SWT.CHECK);
        btnRoutingType2Support
                .setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnRoutingType2Support_tooltip);
        btnRoutingType2Support.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnRoutingType2Support, Integer.valueOf(13));

        // btnSDOReadWriteAllbyIndex
        Button btnSDOReadWriteAllbyIndex = managedForm.getToolkit().createButton(grpOptionalData,
                IPowerlinkConstants.SDO_READ_WRITE_BY_ALL_INDEX, SWT.CHECK); // $NON-NLS-1$
        btnSDOReadWriteAllbyIndex
                .setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnSDOReadWriteAllbyIndex_tooltip);
        btnSDOReadWriteAllbyIndex.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnSDOReadWriteAllbyIndex, Integer.valueOf(14));

        // btnSDOSDOReadWriteMultipleParameterbyIndex
        Button btnSDOSDOReadWriteMultipleParameterbyIndex = managedForm.getToolkit().createButton(grpOptionalData,
                IPowerlinkConstants.SDO_READ_WRITE_MULTIPLE_PARAMETER, SWT.CHECK); // $NON-NLS-1$
        btnSDOSDOReadWriteMultipleParameterbyIndex.setToolTipText(
                Messages.advancedFeatureFlagsPropertySection_btnSDOSDOReadWriteMultipleParameterbyIndex_tooltip);
        btnSDOSDOReadWriteMultipleParameterbyIndex.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnSDOSDOReadWriteMultipleParameterbyIndex, Integer.valueOf(15));

        // btnPResChaining
        Button btnPResChaining = managedForm.getToolkit().createButton(grpOptionalData,
                IPowerlinkConstants.PRESPONSE_CHAINING_SUPPORT, // $NON-NLS-1$
                SWT.CHECK);
        btnPResChaining.setToolTipText(Messages.advancedFeatureFlagsPropertySection_tooltip_presChaining);
        btnPResChaining.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnPResChaining, Integer.valueOf(18));

        this.lblError = managedForm.getToolkit().createLabel(grpOptionalData, "");
        new Label(grpOptionalData, SWT.NONE);
        new Label(groupComposite2, SWT.NONE);

    }

}
