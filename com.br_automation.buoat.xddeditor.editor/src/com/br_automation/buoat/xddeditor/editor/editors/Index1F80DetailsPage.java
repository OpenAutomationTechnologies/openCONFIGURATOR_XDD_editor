/*******************************************************************************
 * @file   Index1F80DetailsPage.java
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
import com.br_automation.buoat.xddeditor.XDD.resources.IPowerlinkConstants;

/**
 * Class to populate the details page of object index 0x1F80
 *
 * @author Sree Hari Vignesh
 *
 */
public class Index1F80DetailsPage implements IDetailsPage {

    private IManagedForm managedForm;

    private Text indexText;

    private Text nameText;
    private Text objTypeText;
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

            lblDefaultValueValue.setText(IPowerlinkConstants.DEFAULT_VALUE+" "+strDefaultValue);
            index1F80Object.setDefaultValue(strDefaultValue);
            updateDocument(docRoot);

        }
    }; // SelectionListener

    private int defaultValue;

    @Override
    public void selectionChanged(IFormPart part, ISelection selection) {
        IStructuredSelection sel = (IStructuredSelection) selection;
        TObjectImpl obj = (TObjectImpl) sel.getFirstElement();

        this.tobject = (TObject) obj;
        if (lblError != null) {
            this.lblError.setText(""); //$NON-NLS-1$
        }
        if (lblDefaultValueValue != null) {
            this.lblDefaultValueValue.setText(IPowerlinkConstants.DEFAULT_VALUE+" "+this.tobject.getDefaultValue());
        }
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
                    objTypeText.setText(IPowerlinkConstants.OBJECT_TYPES[0]);
                }
            } else if (objectType.equalsIgnoreCase("8")) {
                if (objTypeText != null) {
                    objTypeText.setText(IPowerlinkConstants.OBJECT_TYPES[1]);
                }
            } else if (objectType.equalsIgnoreCase("9")) {
                if (objTypeText != null) {
                    objTypeText.setText(IPowerlinkConstants.OBJECT_TYPES[2]);
                }
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
        Section index1F80Section = managedForm.getToolkit().createSection(parent, ExpandableComposite.EXPANDED
                | Section.DESCRIPTION | ExpandableComposite.TWISTIE | ExpandableComposite.TITLE_BAR);
        managedForm.getToolkit().paintBordersFor(index1F80Section);
        index1F80Section.setText(ObjectDictionaryEditorPage.OBJECT_DICTIONARY_DETAILS_HEADING);


        Composite clientComposite = managedForm.getToolkit().createComposite(index1F80Section, SWT.WRAP);
        GridLayout layouts = new GridLayout(1, true);
        layouts.marginWidth = 2;
        layouts.marginHeight = 2;
        clientComposite.setLayout(layouts);
        managedForm.getToolkit().paintBordersFor(clientComposite);

        index1F80Section.setClient(clientComposite);

        Composite groupComposite = new Composite(clientComposite, SWT.NONE);
        groupComposite.setLayout(new GridLayout(2, false));

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
        GridData gd_nameText = new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1);
        gd_nameText.widthHint = 450;
        nameText.setLayoutData(gd_nameText);
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
        new Label(groupComposite, SWT.NONE);

        Composite groupComposite2 = new Composite(clientComposite, SWT.NONE);
        groupComposite2.setLayout(new GridLayout(2, false));

        Group grpOptionalData = new Group(groupComposite2, SWT.NONE);
        GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
        gridData.widthHint = 500;
        grpOptionalData.setLayoutData(gridData);
        grpOptionalData.setText(IPowerlinkConstants.OPTIONAL_GROUP);
        grpOptionalData.setLayout(new GridLayout(1, false));

//        Label lblDefaultValue = managedForm.getToolkit().createLabel(grpOptionalData,
//                IPowerlinkConstants.DEFAULT_VALUE); // $NON-NLS-1$
//
//        lblDefaultValue.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));

        this.lblDefaultValueValue = managedForm.getToolkit().createLabel(grpOptionalData, "               ");

        // --Checkbox-Section

        // btnStartCNsMode
        Button btnStartCNsMode = managedForm.getToolkit().createButton(grpOptionalData,
                Messages.advancedStartUpPropertySection_btn_startBroadcastCN, SWT.CHECK);
        btnStartCNsMode.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_startexplicitCN);
        btnStartCNsMode.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnStartCNsMode, 1);

        // btnAutoOperationalState
        Button btnAutoOperationalState = managedForm.getToolkit().createButton(grpOptionalData,
                Messages.advancedStartUpPropertySection_btn_NoAutoNMTOperational, SWT.CHECK | SWT.WRAP);
        btnAutoOperationalState.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_autoNMTOperational);
        btnAutoOperationalState.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnAutoOperationalState, 2);

        // btnNMTStartNode
        Button btnNMTStartNode = managedForm.getToolkit().createButton(grpOptionalData,
                Messages.advancedStartUpPropertySection_btn_applicationCNStart, SWT.CHECK);
        btnNMTStartNode.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_allowCNstartup);
        btnNMTStartNode.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnNMTStartNode, 3);

        // btnNMTResetNodeTrigger
        Button btnNMTResetNode = managedForm.getToolkit().createButton(grpOptionalData,
                Messages.advancedStartUpPropertySection_btn_resetNodeWithBroadcast, SWT.CHECK);
        btnNMTResetNode.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_individualOnError);
        btnNMTResetNode.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnNMTResetNode, 4);

        // btnNTMStopNode
        Button btnNMTStopNode = managedForm.getToolkit().createButton(grpOptionalData,
                Messages.advancedStartUpPropertySection_btn_dealStopNodeWithBroadcast, SWT.CHECK);
        btnNMTStopNode.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_dealCNaccordingBit4);
        btnNMTStopNode.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnNMTStopNode, 6);

        // btnPreOperational2
        Button btnNMTPreOperational2 = managedForm.getToolkit().createButton(grpOptionalData,
                Messages.advancedStartUpPropertySection_btn_enterPreOp2ByApplication, SWT.CHECK);
        btnNMTPreOperational2.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_enterPreOperational2);
        btnNMTPreOperational2.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnNMTPreOperational2, 7);

        // btnMSReadyToOperate
        Button btnMSReadyToOperate = managedForm.getToolkit().createButton(grpOptionalData,
                Messages.advancedStartUpPropertySection_btn_appDecide_ReadyState, SWT.CHECK);
        btnMSReadyToOperate.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_setReadyToOperate);
        btnMSReadyToOperate.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnMSReadyToOperate, 8);

        // btnCompleteCNIdCheck
        Button btnCompleteCNIdCheck = managedForm.getToolkit().createButton(grpOptionalData,
                Messages.advancedStartUpPropertySection_btn_VerifyAllCNIds, SWT.CHECK);
        btnCompleteCNIdCheck.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_LimitVerifyAllCNIds);
        btnCompleteCNIdCheck.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnCompleteCNIdCheck, 9);

        // btnCheckSWVersion
        Button btnCheckSWVersion = managedForm.getToolkit().createButton(grpOptionalData,
                Messages.advancedStartUpPropertySection_btn_checkSWVersion, SWT.CHECK);
        btnCheckSWVersion.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_doNotCheckSW);
        btnCheckSWVersion.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnCheckSWVersion, 10);

        // btnCheckConfig
        Button btnCheckConfig = managedForm.getToolkit().createButton(grpOptionalData,
                Messages.advancedStartUpPropertySection_btn_checkCNConfig, SWT.CHECK);
        btnCheckConfig.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_doNotCheckConfig);
        btnCheckConfig.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnCheckConfig, 11);

        // btnReturnOperational1
        Button btnReturnOperational1 = managedForm.getToolkit().createButton(grpOptionalData,
                Messages.advancedStartUpPropertySection_btn_AppDecideChangeToPreOp, SWT.CHECK);
        btnReturnOperational1.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_autoChangeToPreOp);
        btnReturnOperational1.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnReturnOperational1, 12);

        // btnChangeToBasicEth
        Button btnChangeToBasicEth = managedForm.getToolkit().createButton(grpOptionalData,
                Messages.advancedStartUpPropertySection_btn_ChangeNotActiveToBaiscEthernet, SWT.CHECK);
        btnChangeToBasicEth.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_notActiveBasicEthState);
        btnChangeToBasicEth.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnChangeToBasicEth, 13);

        // ----ERRORLABEL

        this.lblError = managedForm.getToolkit().createLabel(grpOptionalData,
                "                                                  ");
        this.lblError.setForeground(XDDUtilities.getRed(Display.getCurrent()));
        new Label(groupComposite2, SWT.NONE);

    }

}
