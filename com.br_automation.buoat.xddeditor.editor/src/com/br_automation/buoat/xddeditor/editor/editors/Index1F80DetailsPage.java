/*******************************************************************************
 * @file   Index1F80DetailsPage.java
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

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.xml.bind.DatatypeConverter;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
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
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.custom.Messages;
import com.br_automation.buoat.xddeditor.XDD.custom.XDDUtilities;
import com.br_automation.buoat.xddeditor.XDD.custom.propertypages.AdvancedStartUpPropertySection;
import com.br_automation.buoat.xddeditor.XDD.impl.TObjectImpl;

/**
 * Class to populate the details page of object index 0x1F80
 *
 * @author Sree Hari Vignesh
 *
 */
public class Index1F80DetailsPage implements IDetailsPage {

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
    private TObjectImpl index1F80Object;
    private DocumentRoot docRoot;
    private DeviceDescriptionFileEditor editor;

    public Index1F80DetailsPage(TObjectImpl index1f80Object, DocumentRoot docRoot, DeviceDescriptionFileEditor editor) {
        this.index1F80Object = index1f80Object;
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

    private final SelectionListener selectionListener = new SelectionAdapter() {

        @Override
        public void widgetSelected(SelectionEvent e) {
            String strDefaultValue;
            try {
                defaultValue = Integer.decode(tobject.getDefaultValue());
            } catch (NumberFormatException f) {
                defaultValue = 0;
            }
            if (((Button) e.getSource()).getSelection())
                defaultValue = defaultValue | (1 << buttonMap.get(e.getSource()).intValue());
            else
                defaultValue = defaultValue & ~(1 << buttonMap.get(e.getSource()).intValue());

            strDefaultValue = "0x" + Integer.toHexString(defaultValue).toUpperCase(); //$NON-NLS-1$

            lblDefaultValueValue.setText(strDefaultValue);
            index1F80Object.setDefaultValue(strDefaultValue);
            updateDocument(docRoot);

        }
    }; // SelectionListener

    private int defaultValue;

    @Override
    public void selectionChanged(IFormPart part, ISelection selection) {
        IStructuredSelection sel = (IStructuredSelection) selection;
        System.err.println("The object instance.." + sel.getFirstElement());
        TObjectImpl obj = (TObjectImpl) sel.getFirstElement();

        this.tobject = (TObject) obj;
        this.lblError.setText(""); //$NON-NLS-1$

        this.lblDefaultValueValue.setText(this.tobject.getDefaultValue());
        Set<Entry<Button, Integer>> buttonSet = this.buttonMap.entrySet();

        try {
            int currentDefaultValue = 0;
            if (this.tobject.getDefaultValue() != null && this.tobject.getDefaultValue().length() > 0) {

                currentDefaultValue = Integer.decode(this.tobject.getDefaultValue());

                for (Entry<Button, Integer> entry : buttonSet) {
                    int btnValue = entry.getValue().intValue();
                    if ((currentDefaultValue & (1 << btnValue)) != 0) // Check
                                                                        // if
                                                                        // Bit
                                                                        // of
                                                                        // Button
                                                                        // is
                                                                        // set
                        entry.getKey().setSelection(true); // if yes, set the
                                                            // selection to true
                    else
                        entry.getKey().setSelection(false);
                }
            }
            if (currentDefaultValue != 0 // Checks if any reserved bits are set
                                            // in defaultValue (Bit 0, Bit 5,
                                            // all Bits > 13)
                    && (currentDefaultValue > 0x3FDE || ((currentDefaultValue & (1 << 5)) != 0))
                    || (currentDefaultValue & (1 << 0)) != 0) {
                this.lblError.setText(Messages.general_error_defaultValueInvalid);
                for (Entry<Button, Integer> entry : buttonSet)
                    entry.getKey().setSelection(false);
            }
        } catch (NumberFormatException e) {
            this.lblError.setText(Messages.general_error_defaultValueInvalid);
        }

        // if (obj.getAccessType() != null) {
        // accessTypeText.setText(obj.getAccessType().getName());
        // }
        //
        // if (obj.getActualValue() != null) {
        // actualValueText.setText(obj.getActualValue());
        // }
        //
        // if (obj.getDataType() != null) {
        // String dataType =
        // DatatypeConverter.printHexBinary(obj.getDataType());
        // dataTypeText.setText(dataType);
        // }
        //
        // if (obj.getDefaultValue() != null) {
        // defaultValueText.setText(obj.getDefaultValue());
        // }
        //
        // if (obj.getDenotation() != null) {
        // denotationText.setText(obj.getDenotation());
        // }
        //
        // if (obj.getHighLimit() != null) {
        // highLimitText.setText(obj.getHighLimit());
        // }
        //
        // if (obj.getIndex() != null) {
        // String index = DatatypeConverter.printHexBinary(obj.getIndex());
        // index = "0x" + index;
        // indexText.setText(index);
        // }
        //
        // if (obj.getLowLimit() != null) {
        // lowLimitText.setText(obj.getLowLimit());
        // }
        //
        // if (obj.getName() != null) {
        // nameText.setText(obj.getName());
        // }
        //
        // if (obj.getObjectType() != 0) {
        // objTypeText.setText(String.valueOf(obj.getObjectType()));
        // }
        //
        // if (obj.getObjFlags() != null) {
        // objFlagsText.setText(obj.getObjFlags().toString());
        // }
        //
        // if (obj.getPDOmapping() != null) {
        // pdoMappingText.setText(obj.getPDOmapping().getName());
        // }
        //
        // if (obj.getSubNumber() != 0) {
        // subNumberText.setText(String.valueOf(obj.getSubNumber()));
        // }
        //
        // if (obj.getUniqueIDRef() != null) {
        // uniqueIdRefText.setText(obj.getUniqueIDRef());
        // }

        if (obj.getIndex() != null) {
            String index = DatatypeConverter.printHexBinary(obj.getIndex());
            index = "0x" + index;
            indexText.setText(index);
        }

        if (obj.getName() != null) {
            nameText.setText(obj.getName());
        }

        if (obj.getObjectType() != 0) {
            String objectType = String.valueOf(obj.getObjectType());
            if (objectType.equalsIgnoreCase("7")) {
                objTypeText.setText("7 - VAR");
            } else if (objectType.equalsIgnoreCase("8")) {
                objTypeText.setText("8 - ARRAY");
            } else if (objectType.equalsIgnoreCase("9")) {
                objTypeText.setText("9 - RECORD");
            }
        }

    }

    private Label lblDefaultValueValue;

    private final Map<Button, Integer> buttonMap = new HashMap<Button, Integer>(13);

    private Label lblError;

    @Override
    public void createContents(Composite parent) {

        GridLayout layout = new GridLayout(1, true);

        parent.setLayout(layout);
        layout.marginWidth = 20;
        Section deviceFirmwareSection = managedForm.getToolkit().createSection(parent, ExpandableComposite.EXPANDED
                | Section.DESCRIPTION | ExpandableComposite.TWISTIE | ExpandableComposite.TITLE_BAR);
        managedForm.getToolkit().paintBordersFor(deviceFirmwareSection);
        deviceFirmwareSection.setText(ObjectDictionaryEditorPage.OBJECT_DICTIONARY_DETAILS_HEADING);
        deviceFirmwareSection.setDescription(ObjectDictionaryEditorPage.OBJECT_DICTIONARY_HEADING_DESCRIPTION);

        Composite clientComposite = managedForm.getToolkit().createComposite(deviceFirmwareSection, SWT.WRAP);
        GridLayout layouts = new GridLayout(1, true);
        layouts.marginWidth = 2;
        layouts.marginHeight = 2;
        clientComposite.setLayout(layouts);
        managedForm.getToolkit().paintBordersFor(clientComposite);

        deviceFirmwareSection.setClient(clientComposite);

        Composite groupComposite = new Composite(clientComposite, SWT.NONE);
        groupComposite.setLayout(new GridLayout(2, false));

        Group grpFirmwareFile = new Group(groupComposite, SWT.NONE);
        GridData gd_grpConfigurationFile = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
        gd_grpConfigurationFile.widthHint = 600;
        grpFirmwareFile.setLayoutData(gd_grpConfigurationFile);
        grpFirmwareFile.setText("Mandatory Data");
        grpFirmwareFile.setLayout(new GridLayout(6, false));

        Label nameLabel = new Label(grpFirmwareFile, SWT.NONE);
        nameLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        nameLabel.setText("Name:");
        managedForm.getToolkit().adapt(nameLabel, true, true);
        nameLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

        nameText = new Text(grpFirmwareFile, SWT.BORDER | SWT.WRAP);
        nameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
        managedForm.getToolkit().adapt(nameText, true, true);
        nameText.setEditable(false);

        Label objTypelabel = new Label(grpFirmwareFile, SWT.NONE);
        objTypelabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        objTypelabel.setText("Object Type:");
        managedForm.getToolkit().adapt(objTypelabel, true, true);
        objTypelabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

        objTypeText = new Text(grpFirmwareFile, SWT.BORDER | SWT.WRAP);
        objTypeText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
        managedForm.getToolkit().adapt(objTypeText, true, true);
        objTypeText.setEditable(false);

        Label indexLabel = new Label(grpFirmwareFile, SWT.NONE);
        indexLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        indexLabel.setText("Index:");
        managedForm.getToolkit().adapt(indexLabel, true, true);
        indexLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

        indexText = new Text(grpFirmwareFile, SWT.BORDER | SWT.WRAP);
        indexText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
        managedForm.getToolkit().adapt(indexText, true, true);
        indexText.setEditable(false);

        Composite groupComposite2 = new Composite(clientComposite, SWT.NONE);
        groupComposite2.setLayout(new GridLayout(2, false));

        Group grpOptionalData = new Group(groupComposite2, SWT.NONE);
        GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
        gridData.widthHint = 600;
        grpOptionalData.setLayoutData(gridData);
        grpOptionalData.setText("Optional Data");
        grpOptionalData.setLayout(new GridLayout(2, false));

        FormData data;

        Label lblDefaultValue = managedForm.getToolkit().createLabel(grpOptionalData, "Default Value:"); //$NON-NLS-1$

        lblDefaultValue.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));

        this.lblDefaultValueValue = managedForm.getToolkit().createLabel(grpOptionalData, "               "); //$NON-NLS-1$

        this.lblDefaultValueValue.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        data = new FormData();

        // --Checkbox-Section

        // btnStartCNsMode
        Button btnStartCNsMode = managedForm.getToolkit().createButton(grpOptionalData,
                Messages.advancedStartUpPropertySection_btn_startBroadcastCN, SWT.CHECK);
        btnStartCNsMode.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_startexplicitCN);

        btnStartCNsMode.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        btnStartCNsMode.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnStartCNsMode, 1);

        // btnAutoOperationalState
        Button btnAutoOperationalState = managedForm.getToolkit().createButton(grpOptionalData,
                Messages.advancedStartUpPropertySection_btn_NoAutoNMTOperational, SWT.CHECK);
        btnAutoOperationalState.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_autoNMTOperational);

        btnAutoOperationalState.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        btnAutoOperationalState.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnAutoOperationalState, 2);

        // btnNMTStartNode
        Button btnNMTStartNode = managedForm.getToolkit().createButton(grpOptionalData,
                Messages.advancedStartUpPropertySection_btn_applicationCNStart, SWT.CHECK);
        btnNMTStartNode.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_allowCNstartup);

        btnNMTStartNode.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        btnNMTStartNode.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnNMTStartNode, 3);

        // btnNMTResetNodeTrigger
        Button btnNMTResetNode = managedForm.getToolkit().createButton(grpOptionalData,
                Messages.advancedStartUpPropertySection_btn_resetNodeWithBroadcast, SWT.CHECK);
        btnNMTResetNode.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_individualOnError);

        btnNMTResetNode.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        btnNMTResetNode.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnNMTResetNode, 4);

        // btnNTMStopNode
        Button btnNMTStopNode = managedForm.getToolkit().createButton(grpOptionalData,
                Messages.advancedStartUpPropertySection_btn_dealStopNodeWithBroadcast, SWT.CHECK);
        btnNMTStopNode.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_dealCNaccordingBit4);

        btnNMTStopNode.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        btnNMTStopNode.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnNMTStopNode, 6);

        // btnPreOperational2
        Button btnNMTPreOperational2 = managedForm.getToolkit().createButton(grpOptionalData,
                Messages.advancedStartUpPropertySection_btn_enterPreOp2ByApplication, SWT.CHECK);
        btnNMTPreOperational2.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_enterPreOperational2);

        btnNMTPreOperational2.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        btnNMTPreOperational2.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnNMTPreOperational2, 7);

        // btnMSReadyToOperate
        Button btnMSReadyToOperate = managedForm.getToolkit().createButton(grpOptionalData,
                Messages.advancedStartUpPropertySection_btn_appDecide_ReadyState, SWT.CHECK);
        btnMSReadyToOperate.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_setReadyToOperate);

        btnMSReadyToOperate.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        btnMSReadyToOperate.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnMSReadyToOperate, 8);

        // btnCompleteCNIdCheck
        Button btnCompleteCNIdCheck = managedForm.getToolkit().createButton(grpOptionalData,
                Messages.advancedStartUpPropertySection_btn_VerifyAllCNIds, SWT.CHECK);
        btnCompleteCNIdCheck.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_LimitVerifyAllCNIds);

        btnCompleteCNIdCheck.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        btnCompleteCNIdCheck.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnCompleteCNIdCheck, 9);

        // btnCheckSWVersion
        Button btnCheckSWVersion = managedForm.getToolkit().createButton(grpOptionalData,
                Messages.advancedStartUpPropertySection_btn_checkSWVersion, SWT.CHECK);
        btnCheckSWVersion.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_doNotCheckSW);

        btnCheckSWVersion.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        btnCheckSWVersion.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnCheckSWVersion, 10);

        // btnCheckConfig
        Button btnCheckConfig = managedForm.getToolkit().createButton(grpOptionalData,
                Messages.advancedStartUpPropertySection_btn_checkCNConfig, SWT.CHECK);
        btnCheckConfig.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_doNotCheckConfig);

        btnCheckConfig.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        btnCheckConfig.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnCheckConfig, 11);

        // btnReturnOperational1
        Button btnReturnOperational1 = managedForm.getToolkit().createButton(grpOptionalData,
                Messages.advancedStartUpPropertySection_btn_AppDecideChangeToPreOp, SWT.CHECK);
        btnReturnOperational1.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_autoChangeToPreOp);

        btnReturnOperational1.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        btnReturnOperational1.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnReturnOperational1, 12);

        // btnChangeToBasicEth
        Button btnChangeToBasicEth = managedForm.getToolkit().createButton(grpOptionalData,
                Messages.advancedStartUpPropertySection_btn_ChangeNotActiveToBaiscEthernet, SWT.CHECK);
        btnChangeToBasicEth.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_notActiveBasicEthState);

        btnChangeToBasicEth.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        btnChangeToBasicEth.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnChangeToBasicEth, 13);

        // ----ERRORLABEL

        this.lblError = managedForm.getToolkit().createLabel(grpOptionalData,
                "                                                  "); //$NON-NLS-1$
        this.lblError.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        this.lblError.setForeground(XDDUtilities.getRed(Display.getCurrent()));

        // Label accessTypeLabel = new Label(clientComposite, SWT.NONE);
        // accessTypeLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER,
        // false, false, 1, 1));
        // accessTypeLabel.setText("Access Type:");
        // managedForm.getToolkit().adapt(accessTypeLabel, true, true);
        // accessTypeLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));
        //
        // accessTypeText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
        // accessTypeText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
        // false, 5, 1));
        // managedForm.getToolkit().adapt(accessTypeText, true, true);
        //
        // Label actualValueLabel = new Label(clientComposite, SWT.NONE);
        // actualValueLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER,
        // false, false, 1, 1));
        // actualValueLabel.setText("Actual Value:");
        // managedForm.getToolkit().adapt(actualValueLabel, true, true);
        // actualValueLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));
        //
        // actualValueText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
        // actualValueText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
        // true, false, 5, 1));
        // managedForm.getToolkit().adapt(actualValueText, true, true);
        //
        // Label dataTypeLabel = new Label(clientComposite, SWT.NONE);
        // dataTypeLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false,
        // false, 1, 1));
        // dataTypeLabel.setText("Data Type:");
        // managedForm.getToolkit().adapt(dataTypeLabel, true, true);
        // dataTypeLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));
        //
        // dataTypeText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
        // dataTypeText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
        // false, 5, 1));
        // managedForm.getToolkit().adapt(dataTypeText, true, true);
        //
        // Label defaultValueLabel = new Label(clientComposite, SWT.NONE);
        // defaultValueLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER,
        // false, false, 1, 1));
        // defaultValueLabel.setText("Default Value:");
        // managedForm.getToolkit().adapt(defaultValueLabel, true, true);
        // defaultValueLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));
        //
        // defaultValueText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
        // defaultValueText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
        // true, false, 5, 1));
        // managedForm.getToolkit().adapt(defaultValueText, true, true);
        //
        // Label denotationLabel = new Label(clientComposite, SWT.NONE);
        // denotationLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER,
        // false, false, 1, 1));
        // denotationLabel.setText("Denotation:");
        // managedForm.getToolkit().adapt(denotationLabel, true, true);
        // denotationLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));
        //
        // denotationText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
        // denotationText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
        // false, 5, 1));
        // managedForm.getToolkit().adapt(denotationText, true, true);
        //
        // Label highLimitLabel = new Label(clientComposite, SWT.NONE);
        // highLimitLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER,
        // false, false, 1, 1));
        // highLimitLabel.setText("High Limit:");
        // managedForm.getToolkit().adapt(highLimitLabel, true, true);
        // highLimitLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));
        //
        // highLimitText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
        // highLimitText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
        // false, 5, 1));
        // managedForm.getToolkit().adapt(highLimitText, true, true);
        //
        // Label indexLabel = new Label(clientComposite, SWT.NONE);
        // indexLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false,
        // false, 1, 1));
        // indexLabel.setText("Index:");
        // managedForm.getToolkit().adapt(indexLabel, true, true);
        // indexLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));
        //
        // indexText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
        // indexText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
        // false, 5, 1));
        // managedForm.getToolkit().adapt(indexText, true, true);
        //
        // Label lowLimitlabel = new Label(clientComposite, SWT.NONE);
        // lowLimitlabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false,
        // false, 1, 1));
        // lowLimitlabel.setText("Low Limit:");
        // managedForm.getToolkit().adapt(lowLimitlabel, true, true);
        // lowLimitlabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));
        //
        // lowLimitText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
        // lowLimitText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
        // false, 5, 1));
        // managedForm.getToolkit().adapt(lowLimitText, true, true);
        //
        // Label nameLabel = new Label(clientComposite, SWT.NONE);
        // nameLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false,
        // false, 1, 1));
        // nameLabel.setText("Name:");
        // managedForm.getToolkit().adapt(nameLabel, true, true);
        // nameLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));
        //
        // nameText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
        // nameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
        // false, 5, 1));
        // managedForm.getToolkit().adapt(nameText, true, true);
        //
        // Label objTypelabel = new Label(clientComposite, SWT.NONE);
        // objTypelabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false,
        // false, 1, 1));
        // objTypelabel.setText("Object Type:");
        // managedForm.getToolkit().adapt(objTypelabel, true, true);
        // objTypelabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));
        //
        // objTypeText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
        // objTypeText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
        // false, 5, 1));
        // managedForm.getToolkit().adapt(objTypeText, true, true);
        //
        // Label objFlagsLabel = new Label(clientComposite, SWT.NONE);
        // objFlagsLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false,
        // false, 1, 1));
        // objFlagsLabel.setText("Object Flags:");
        // managedForm.getToolkit().adapt(objFlagsLabel, true, true);
        // objFlagsLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));
        //
        // objFlagsText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
        // objFlagsText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
        // false, 5, 1));
        // managedForm.getToolkit().adapt(objFlagsText, true, true);
        //
        // Label pdoMappingLabel = new Label(clientComposite, SWT.NONE);
        // pdoMappingLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER,
        // false, false, 1, 1));
        // pdoMappingLabel.setText("PDO Mapping:");
        // managedForm.getToolkit().adapt(pdoMappingLabel, true, true);
        // pdoMappingLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));
        //
        // pdoMappingText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
        // pdoMappingText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
        // false, 5, 1));
        // managedForm.getToolkit().adapt(pdoMappingText, true, true);
        //
        // Label subNumberLabel = new Label(clientComposite, SWT.NONE);
        // subNumberLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER,
        // false, false, 1, 1));
        // subNumberLabel.setText("Sub Number:");
        // managedForm.getToolkit().adapt(subNumberLabel, true, true);
        // subNumberLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));
        //
        // subNumberText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
        // subNumberText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
        // false, 5, 1));
        // managedForm.getToolkit().adapt(subNumberText, true, true);
        //
        // Label uniqueIdRefLabel = new Label(clientComposite, SWT.NONE);
        // uniqueIdRefLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER,
        // false, false, 1, 1));
        // uniqueIdRefLabel.setText("UniqueID Ref:");
        // managedForm.getToolkit().adapt(uniqueIdRefLabel, true, true);
        // uniqueIdRefLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));
        //
        // uniqueIdRefText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
        // uniqueIdRefText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
        // true, false, 5, 1));
        // managedForm.getToolkit().adapt(uniqueIdRefText, true, true);

    }

}
