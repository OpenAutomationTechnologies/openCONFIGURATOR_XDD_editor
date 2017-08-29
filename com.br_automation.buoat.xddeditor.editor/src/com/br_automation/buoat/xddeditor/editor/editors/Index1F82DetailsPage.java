/*******************************************************************************
 * @file   Index1F82DetailsPage.java
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

import org.eclipse.core.runtime.Assert;
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
import com.br_automation.buoat.xddeditor.XDD.custom.propertypages.AdvancedFeatureFlagsPropertySection;
import com.br_automation.buoat.xddeditor.XDD.impl.TObjectImpl;

/**
 * Class to populate the details page of Object index 0x1F82
 *
 * @author Sree Hari Vignesh
 *
 */
public class Index1F82DetailsPage implements IDetailsPage {

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
        IStructuredSelection sel = (IStructuredSelection) selection;
        System.err.println("The object instance.." + sel.getFirstElement());
        TObjectImpl obj = (TObjectImpl) sel.getFirstElement();

        Assert.isTrue(obj instanceof TObjectImpl);
        this.tobject = (TObject) obj;

        this.lblError.setText(""); //$NON-NLS-1$
        if (this.tobject.getDefaultValue() != null)

            this.lblDefaultValueValue.setText(this.tobject.getDefaultValue().toUpperCase());

        if (this.tobject.getIndex() != null && this.tobject.getDefaultValue() != null) {
            try {
                long defaultValue = Integer.decode(this.tobject.getDefaultValue());
                if ((defaultValue & (1 << 17)) != 0 || defaultValue >= 0x80000)
                    throw new NumberFormatException(); // Also throw this
                                                        // exception when a
                                                        // wrong bit is set or
                                                        // too long value!

                Set<Entry<Button, Integer>> buttonSet = this.buttonMap.entrySet();
                for (Entry<Button, Integer> entry : buttonSet) {
                    int bitOffset = entry.getValue().intValue();
                    if ((defaultValue & (1 << bitOffset)) != 0) // Check if bit
                                                                // of button is
                                                                // set
                        entry.getKey().setSelection(true); // if yes, set the
                                                            // selection to true
                    else
                        entry.getKey().setSelection(false);
                }
            } catch (NumberFormatException e) {
                // Set error-text
                this.lblError.setText(Messages.general_error_defaultValueInvalid);
                this.lblError.setForeground(XDDUtilities.getRed(Display.getCurrent()));
            }

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
                        + Long.toHexString(newDefaultValue));
            }
            lblError.setText(""); //$NON-NLS-1$
            Button currentButton = (Button) e.getSource();
            int bitOffset = buttonMap.get(currentButton);
            XDDUtilities.setFeatureFlag(currentButton.getSelection(), bitOffset,
                    (DocumentRoot) EcoreUtil.getRootContainer(tobject));
            lblDefaultValueValue.setText(tobject.getDefaultValue());
            index1F82Object.setDefaultValue(lblDefaultValueValue.getText());
            updateDocument(docRoot);
        }
    }; // SelectionListener

    private Label lblDefaultValueValue;
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
        groupComposite.setLayout(new GridLayout(1, false));

        Group grpMandatoryData = new Group(groupComposite, SWT.NONE);
        GridData gd_grpConfigurationFile = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
        gd_grpConfigurationFile.widthHint = 558;
        grpMandatoryData.setLayoutData(gd_grpConfigurationFile);
        grpMandatoryData.setText("Mandatory Data");
        grpMandatoryData.setLayout(new GridLayout(6, false));

        Label nameLabel = new Label(grpMandatoryData, SWT.NONE);
        nameLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        nameLabel.setText("Name:");
        managedForm.getToolkit().adapt(nameLabel, true, true);
        nameLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

        nameText = new Text(grpMandatoryData, SWT.BORDER | SWT.WRAP);
        nameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
        managedForm.getToolkit().adapt(nameText, true, true);
        nameText.setEditable(false);

        Label objTypelabel = new Label(grpMandatoryData, SWT.NONE);
        objTypelabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        objTypelabel.setText("Object Type:");
        managedForm.getToolkit().adapt(objTypelabel, true, true);
        objTypelabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

        objTypeText = new Text(grpMandatoryData, SWT.BORDER | SWT.WRAP);
        objTypeText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
        managedForm.getToolkit().adapt(objTypeText, true, true);
        objTypeText.setEditable(false);

        Label indexLabel = new Label(grpMandatoryData, SWT.NONE);
        indexLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        indexLabel.setText("Index:");
        managedForm.getToolkit().adapt(indexLabel, true, true);
        indexLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

        indexText = new Text(grpMandatoryData, SWT.BORDER | SWT.WRAP);
        indexText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
        managedForm.getToolkit().adapt(indexText, true, true);
        indexText.setEditable(false);

        Composite groupComposite2 = new Composite(clientComposite, SWT.NONE);
        groupComposite2.setLayout(new GridLayout(2, false));

        Group grpOptionalData = new Group(groupComposite2, SWT.NONE);
        GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
        gridData.widthHint = 558;
        grpOptionalData.setLayoutData(gridData);
        grpOptionalData.setText("Optional Feature Flags");
        grpOptionalData.setLayout(new GridLayout(2, false));

        // Checkbox-Buttons -------------------------------------------
        FormData data;

        // optionalFlags Label
        Label defaultValueLabel = managedForm.getToolkit().createLabel(grpOptionalData, "Default value:"); //$NON-NLS-1$
        data = new FormData();
        // data.top = new FormAttachment(this.lblDefaultValueValue, 0);
        defaultValueLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));

        // lblDefaultValue Label
        this.lblDefaultValueValue = managedForm.getToolkit().createLabel(grpOptionalData, "      Not found!     "); //$NON-NLS-1$

        this.lblDefaultValueValue.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));

        // Isonchronus
        Button btnIsochronous = managedForm.getToolkit().createButton(grpOptionalData, "Isonchronus Mode", SWT.CHECK); //$NON-NLS-1$
        btnIsochronous.setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnIsochronous_tooltip);
        data = new FormData();
        data.top = new FormAttachment(defaultValueLabel, 0);
        btnIsochronous.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        btnIsochronous.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnIsochronous, 0);

        // btnSDObyUDPIP
        Button btnSDObyUDPIP = managedForm.getToolkit().createButton(grpOptionalData, "SDO by UDP/IP", //$NON-NLS-1$
                Integer.valueOf(SWT.CHECK));
        btnSDObyUDPIP.setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnSDObyUDPIP_tooltip);
        data = new FormData();
        data.top = new FormAttachment(btnIsochronous, -5);
        btnSDObyUDPIP.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        btnSDObyUDPIP.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnSDObyUDPIP, Integer.valueOf(1));

        // btnSDObyASnd
        Button btnSDObyASnd = managedForm.getToolkit().createButton(grpOptionalData, "SDO by ASnd", //$NON-NLS-1$
                Integer.valueOf(SWT.CHECK));
        btnSDObyASnd.setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnSDObyASnd_tooltip);
        data = new FormData();
        data.top = new FormAttachment(btnSDObyUDPIP, -5);
        btnSDObyASnd.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        btnSDObyASnd.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnSDObyASnd, Integer.valueOf(2));

        // btnSDObyPDO
        Button btnSDObyPDO = managedForm.getToolkit().createButton(grpOptionalData, "SDO by PDO", SWT.CHECK); //$NON-NLS-1$
        btnSDObyPDO.setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnSDObyPDO_tooltip);
        data = new FormData();
        data.top = new FormAttachment(btnSDObyASnd, -5);
        btnSDObyPDO.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        btnSDObyPDO.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnSDObyPDO, Integer.valueOf(3));

        // btnNMTInfoServices
        Button btnNMTInfoServices = managedForm.getToolkit().createButton(grpOptionalData, "NMT Info Services", //$NON-NLS-1$
                SWT.CHECK);
        btnNMTInfoServices.setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnNMTInfoServices_tooltip);
        data = new FormData();
        data.top = new FormAttachment(btnSDObyPDO, -5);
        btnNMTInfoServices.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        btnNMTInfoServices.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnNMTInfoServices, Integer.valueOf(4));

        // btnExtendedNMTStateCommands
        Button btnExtendedNMTStateCommands = managedForm.getToolkit().createButton(grpOptionalData,
                "Extended NMT State Commands", SWT.CHECK); //$NON-NLS-1$
        btnExtendedNMTStateCommands
                .setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnExtendedNMTStateCommands_tooltip);
        data = new FormData();
        data.top = new FormAttachment(btnNMTInfoServices, -5);
        btnExtendedNMTStateCommands.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        btnExtendedNMTStateCommands.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnExtendedNMTStateCommands, Integer.valueOf(5));

        // btnDynamicPDOMapping
        Button btnDynamicPDOMapping = managedForm.getToolkit().createButton(grpOptionalData, "Dynamic PDO mapping", //$NON-NLS-1$
                SWT.CHECK);
        btnDynamicPDOMapping.setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnDynamicPDOMapping_tooltip);
        data = new FormData();
        data.top = new FormAttachment(btnExtendedNMTStateCommands, -5);
        btnDynamicPDOMapping.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        btnDynamicPDOMapping.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnDynamicPDOMapping, Integer.valueOf(6));

        // btnNMTServicebyUDPIP
        Button btnNMTServicebyUDPIP = managedForm.getToolkit().createButton(grpOptionalData, "NMT Service by UDP/IP", //$NON-NLS-1$
                SWT.CHECK);
        btnNMTServicebyUDPIP.setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnNMTServicebyUDPIP_tooltip);
        data = new FormData();
        data.top = new FormAttachment(btnDynamicPDOMapping, -5);
        btnNMTServicebyUDPIP.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        btnNMTServicebyUDPIP.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnNMTServicebyUDPIP, Integer.valueOf(7));

        Button btnMultipleASnd = managedForm.getToolkit().createButton(grpOptionalData, "Multi-ASnd Support", //$NON-NLS-1$
                SWT.CHECK);
        btnMultipleASnd.setToolTipText(Messages.advancedFeatureFlagsPropertySection_tooltip_multipleASnd);
        data = new FormData();
        data.top = new FormAttachment(btnNMTServicebyUDPIP, -5);
        btnMultipleASnd.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        btnMultipleASnd.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnMultipleASnd, Integer.valueOf(16));

        // --------------------------NEXT SECTION

        // btnConfigurationManager
        Button btnConfigurationManager = managedForm.getToolkit().createButton(grpOptionalData,
                "Configuration Manager functions", SWT.CHECK); //$NON-NLS-1$
        btnConfigurationManager
                .setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnConfigurationManager_tooltip);
        data = new FormData();
        data.top = new FormAttachment(defaultValueLabel, 0);
        data.left = new FormAttachment(btnIsochronous, 80);
        btnConfigurationManager.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        btnConfigurationManager.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnConfigurationManager, Integer.valueOf(8));

        // btnMultiplexedAccess
        Button btnMultiplexedAccess = managedForm.getToolkit().createButton(grpOptionalData, "Multiplexed  Access", //$NON-NLS-1$
                SWT.CHECK);
        btnMultiplexedAccess.setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnMultiplexedAccess_tooltip);
        data = new FormData();
        data.top = new FormAttachment(btnConfigurationManager, -5);
        data.left = new FormAttachment(btnIsochronous, 80);
        btnMultiplexedAccess.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        btnMultiplexedAccess.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnMultiplexedAccess, Integer.valueOf(9));

        // btnNodeIDsetupbySW
        Button btnNodeIDsetupbySW = managedForm.getToolkit().createButton(grpOptionalData, "NodeID setup by SW", //$NON-NLS-1$
                SWT.CHECK);
        btnNodeIDsetupbySW.setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnNodeIDsetupbySW_tooltip);
        data = new FormData();
        data.top = new FormAttachment(btnMultiplexedAccess, -5);
        data.left = new FormAttachment(btnIsochronous, 80);
        btnNodeIDsetupbySW.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        btnNodeIDsetupbySW.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnNodeIDsetupbySW, Integer.valueOf(10));

        // btnMNBasicEthernetMode
        Button btnMNBasicEthernetMode = managedForm.getToolkit().createButton(grpOptionalData, "MN Basic Ethernet Mode", //$NON-NLS-1$
                SWT.CHECK);
        btnMNBasicEthernetMode
                .setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnMNBasicEthernetMode_tooltip);
        data = new FormData();
        data.top = new FormAttachment(btnNodeIDsetupbySW, -5);
        data.left = new FormAttachment(btnIsochronous, 80);
        btnMNBasicEthernetMode.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        btnMNBasicEthernetMode.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnMNBasicEthernetMode, Integer.valueOf(11));

        // btnRoutingType1Support
        Button btnRoutingType1Support = managedForm.getToolkit().createButton(grpOptionalData, "Routing Type 1 Support", //$NON-NLS-1$
                SWT.CHECK);
        btnRoutingType1Support
                .setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnRoutingType1Support_tooltip);
        data = new FormData();
        data.top = new FormAttachment(btnMNBasicEthernetMode, -5);
        data.left = new FormAttachment(btnIsochronous, 80);
        btnRoutingType1Support.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        btnRoutingType1Support.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnRoutingType1Support, Integer.valueOf(12));

        // btnRoutingType2Support
        Button btnRoutingType2Support = managedForm.getToolkit().createButton(grpOptionalData, "Routing Type 2 Support", //$NON-NLS-1$
                SWT.CHECK);
        btnRoutingType2Support
                .setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnRoutingType2Support_tooltip);
        data = new FormData();
        data.top = new FormAttachment(btnRoutingType1Support, -5);
        data.left = new FormAttachment(btnIsochronous, 80);
        btnRoutingType2Support.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        btnRoutingType2Support.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnRoutingType2Support, Integer.valueOf(13));

        // btnSDOReadWriteAllbyIndex
        Button btnSDOReadWriteAllbyIndex = managedForm.getToolkit().createButton(grpOptionalData,
                "SDO Read/Write All by Index", SWT.CHECK); //$NON-NLS-1$
        btnSDOReadWriteAllbyIndex
                .setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnSDOReadWriteAllbyIndex_tooltip);
        data = new FormData();
        data.top = new FormAttachment(btnRoutingType2Support, -5);
        data.left = new FormAttachment(btnIsochronous, 80);
        btnSDOReadWriteAllbyIndex.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        btnSDOReadWriteAllbyIndex.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnSDOReadWriteAllbyIndex, Integer.valueOf(14));

        // btnSDOSDOReadWriteMultipleParameterbyIndex
        Button btnSDOSDOReadWriteMultipleParameterbyIndex = managedForm.getToolkit().createButton(grpOptionalData,
                "SDO Read/Write Multiple Parameter by Index", SWT.CHECK); //$NON-NLS-1$
        btnSDOSDOReadWriteMultipleParameterbyIndex.setToolTipText(
                Messages.advancedFeatureFlagsPropertySection_btnSDOSDOReadWriteMultipleParameterbyIndex_tooltip);
        data = new FormData();
        data.top = new FormAttachment(btnSDOReadWriteAllbyIndex, -5);
        data.left = new FormAttachment(btnIsochronous, 80);
        btnSDOSDOReadWriteMultipleParameterbyIndex
                .setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        btnSDOSDOReadWriteMultipleParameterbyIndex.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnSDOSDOReadWriteMultipleParameterbyIndex, Integer.valueOf(15));

        // btnPResChaining
        Button btnPResChaining = managedForm.getToolkit().createButton(grpOptionalData, "PResponse Chaining Support", //$NON-NLS-1$
                SWT.CHECK);
        btnPResChaining.setToolTipText(Messages.advancedFeatureFlagsPropertySection_tooltip_presChaining);
        data = new FormData();
        data.top = new FormAttachment(btnSDOSDOReadWriteMultipleParameterbyIndex, -5);
        data.left = new FormAttachment(btnIsochronous, 80);
        btnPResChaining.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        btnPResChaining.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnPResChaining, Integer.valueOf(18));

        this.lblError = managedForm.getToolkit().createLabel(grpOptionalData, ""); //$NON-NLS-1$
        this.lblError.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));

    }

}
