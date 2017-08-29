/*******************************************************************************
 * @file   StoreParamSubObjectDetailsPage.java
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

import javax.xml.bind.DatatypeConverter;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.eef.runtime.ui.properties.sections.EEFAdvancedPropertySection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
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
import org.eclipse.wb.swt.SWTResourceManager;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.SubObjectType;
import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.custom.Messages;
import com.br_automation.buoat.xddeditor.XDD.custom.XDDUtilities;
import com.br_automation.buoat.xddeditor.XDD.custom.propertypages.AdvancedStoreParamPropertySection;
import com.br_automation.buoat.xddeditor.XDD.custom.propertypages.TObjectComposite;

import com.br_automation.buoat.xddeditor.XDD.impl.SubObjectTypeImpl;
import com.br_automation.buoat.xddeditor.XDD.provider.SubObjectTypeItemProvider;

/**
 * Class to populate the details page of store param subobject
 *
 * @author Sree hari Vignesh
 *
 */
public class StoreParamSubObjectDetailsPage extends EEFAdvancedPropertySection implements IDetailsPage {

    private IManagedForm managedForm;

    private Text accessTypeText;

    private Text actualValueText;

    private Text dataTypeText;

    private Text defaultValueText;
    private Text denotationText;
    private Text highLimitText;
    // private Text indexText;
    private Text lowLimitText;
    private Text nameText;
    private Text objTypeText;
    private Text objFlagsText;
    private Text pdoMappingText;
    private Text subIndexText;
    private Text uniqueIdRefText;
    private SubObjectTypeImpl subObject;
    private DocumentRoot docRoot;
    private DeviceDescriptionFileEditor editor;

    private Label lblDefaultvalValue;
    private Label lblIndexValue;
    private StoreParamComposite storeparam;
    private SubObjectTypeItemProvider subObjectItemProvider;
    private TObjectComposite tObjectComposite;

    public StoreParamSubObjectDetailsPage(SubObjectTypeImpl subObject, DocumentRoot docRoot,
            DeviceDescriptionFileEditor editor) {
        this.subObject = subObject;
        this.docRoot = docRoot;
        this.editor = editor;
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

        SubObjectTypeImpl obj = (SubObjectTypeImpl) sel.getFirstElement();

        subObject = (SubObjectTypeImpl) obj;
        tobject = (TObject) subObject.eContainer();

        this.lblIndexValue.setText("0x1010 (" + tobject.getName() + ")"); //$NON-NLS-1$ //$NON-NLS-2$
        this.storeparam.setSubObject(subObject, this.subObjectItemProvider, this.lblDefaultvalValue);

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

        if (obj.getSubIndex() != null) {
            String index = DatatypeConverter.printHexBinary(obj.getSubIndex());
            index = "0x" + index;
            subIndexText.setText(index);
        }

        // if (obj.getLowLimit() != null) {
        // lowLimitText.setText(obj.getLowLimit());
        // }

        if (obj.getName() != null) {
            nameText.setText(obj.getName());
        }

        if (obj.getObjectType() != 0) {
            objTypeText.setText(String.valueOf(obj.getObjectType()));
        }

        // if (obj.getObjFlags() != null) {
        // objFlagsText.setText(obj.getObjFlags().toString());
        // }
        //
        // if (obj.getPDOmapping() != null) {
        // pdoMappingText.setText(obj.getPDOmapping().getName());
        // }
        //
        // if (obj.getUniqueIDRef() != null) {
        // uniqueIdRefText.setText(obj.getUniqueIDRef());
        // }

    }

    /**
     *
     * @brief Composite showing radiobuttons for device save options.
     *
     *        Generates a default value based on the selection.
     *
     * @author Joris Lückenga
     */
    private class StoreParamComposite extends Composite {

        private final Button btnAutoSave;
        private final Button btnCmdSave;
        private final Button btnNoSave;
        private final Label lblError;
        private Label lblsubObjectDefaultValue;
        private SubObjectType subobject;
        private SubObjectTypeItemProvider subobjectItemProvider;

        /**
         * @brief Constructs the StoreParam-Composite
         * @param parent
         *            See Composite#Composite(Composite, int)
         * @param style
         *            See Composite#Composite(Composite, int)
         */
        public StoreParamComposite(Composite parent, int style) {
            super(parent, style);
            this.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
            Group grpStorageParameters = new Group(this, SWT.NONE);
            grpStorageParameters.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
            grpStorageParameters.setText(Messages.advancedStoreParamPropertySection_0);
            grpStorageParameters.setBounds(10, 0, 270, 89);
            this.btnAutoSave = new Button(grpStorageParameters, SWT.RADIO);

            this.btnAutoSave.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent event) {
                    StoreParamComposite.this.setDefaultValue(2);
                }
            });
            this.btnAutoSave.setGrayed(true);
            this.btnAutoSave.setBounds(10, 20, 224, 16);
            this.btnAutoSave.setText(Messages.advancedStoreParamPropertySection_descr_saveAuto);
            this.btnAutoSave.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

            this.btnCmdSave = new Button(grpStorageParameters, SWT.RADIO);
            this.btnCmdSave.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent event) {
                    StoreParamComposite.this.setDefaultValue(1);
                }
            });
            this.btnCmdSave.setBounds(10, 42, 224, 16);
            this.btnCmdSave.setText(Messages.advancedStoreParamPropertySection_descr_saveOnCommand);
            this.btnCmdSave.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

            this.btnNoSave = new Button(grpStorageParameters, SWT.RADIO);
            this.btnNoSave.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent event) {
                    StoreParamComposite.this.setDefaultValue(0);
                }
            });
            this.btnNoSave.setBounds(10, 64, 224, 16);
            this.btnNoSave.setText(Messages.advancedStoreParamPropertySection_descr_noSaveSupport);
            this.btnNoSave.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

            this.lblError = new Label(this, SWT.NONE);
            this.lblError.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
            this.lblError.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
            this.lblError.setBounds(20, 95, 260, 15);
            this.lblError.setText(Messages.general_error_defaultValueInvalid);
        }

        // Not used
        @Override
        protected void checkSubclass() {
            // Disable the check that prevents subclassing of SWT components
        }

        /**
         * @brief Sets/calculates the new Default Value for the subobject
         * @param settedValue
         *            Is generated depending on selected radio-button.
         */
        private void setDefaultValue(int settedValue) {
            lblDefaultvalValue.setForeground(XDDUtilities.getBlack(Display.getCurrent()));
            this.lblError.setVisible(false);
            subObject.setDefaultValue(("0x" + String.format(String.format("%08x", settedValue))));
            updateDocument(docRoot);
            lblDefaultvalValue.setText(this.subobject.getDefaultValue());
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

        /**
         * @brief Sets the SubObject for the Composite
         * @param subobjecttype
         *            The subobject of the input.
         * @param provider
         *            ItemProvider of subobject to set a new default value.
         * @param lblDefaultValue
         *            The label displaying the actual default value in the
         *            PropertySection.
         */
        private void setSubObject(final SubObjectType subobjecttype, final SubObjectTypeItemProvider provider,
                final Label lblDefaultValue) {
            this.subobject = subobjecttype;
            this.lblError.setVisible(false);
            this.subobjectItemProvider = provider;
            this.lblsubObjectDefaultValue = lblDefaultValue;
            int storageType;
            try {
                if (this.subobject.getDefaultValue() != null && !this.subobject.getDefaultValue().isEmpty()) {

                    storageType = Integer.decode(this.subobject.getDefaultValue()); // Get
                                                                                    // 2
                                                                                    // LSB
                    this.lblsubObjectDefaultValue.setText(this.subobject.getDefaultValue());
                } else
                    storageType = 0;

                switch (storageType) {
                case 2:
                    this.btnAutoSave.setSelection(true);
                    this.btnCmdSave.setSelection(false);
                    this.btnNoSave.setSelection(false);
                    break;
                case 1:
                    this.btnCmdSave.setSelection(true);
                    this.btnNoSave.setSelection(false);
                    this.btnAutoSave.setSelection(false);
                    break;
                case 0:
                    this.btnNoSave.setSelection(true);
                    this.btnCmdSave.setSelection(false);
                    this.btnAutoSave.setSelection(false);
                    break;
                default:
                    this.lblError.setVisible(true);
                    this.btnNoSave.setSelection(false);
                    this.btnCmdSave.setSelection(false);
                    this.btnAutoSave.setSelection(false);
                }
            } catch (NumberFormatException e) {
                lblDefaultValue.setText(Messages.general_error_defaultValueInvalid);
                lblDefaultValue.setForeground(XDDUtilities.getRed(Display.getCurrent()));
            }
        }
    }

    @Override
    public void createContents(Composite parent) {

        GridLayout layout = new GridLayout(1, true);

        parent.setLayout(layout);
        layout.marginWidth = 20;
        Section deviceFirmwareSection = managedForm.getToolkit().createSection(parent, ExpandableComposite.EXPANDED
                | Section.DESCRIPTION | ExpandableComposite.TWISTIE | ExpandableComposite.TITLE_BAR);
        managedForm.getToolkit().paintBordersFor(deviceFirmwareSection);
        deviceFirmwareSection.setText(ObjectDictionaryEditorPage.SUB_OBJECT_DICTIONARY_DETAILS_HEADING);
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
        indexLabel.setText("Sub Index:");
        managedForm.getToolkit().adapt(indexLabel, true, true);
        indexLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

        subIndexText = new Text(grpMandatoryData, SWT.BORDER | SWT.WRAP);
        subIndexText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
        managedForm.getToolkit().adapt(subIndexText, true, true);
        subIndexText.setEditable(false);

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

        // Index Label (from Parent!)
        Label lblIndex = managedForm.getToolkit().createLabel(grpOptionalData, "Index:"); //$NON-NLS-1$
        data = new FormData();
        lblIndex.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));

        // Index Value (from Parent!)
        this.lblIndexValue = managedForm.getToolkit().createLabel(grpOptionalData, "       "); //$NON-NLS-1$

        this.lblIndexValue.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        this.lblIndexValue.setText("1010 (NTM_StoreParam)"); //$NON-NLS-1$

        // lblDefaultvalue
        Label lblDefaultValue = managedForm.getToolkit().createLabel(grpOptionalData,
                Messages.advancedMappingObjectPropertySection_lbl_Default_Value);

        lblDefaultValue.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));

        // lblDefaultValueValue Label (Actual value)
        this.lblDefaultvalValue = managedForm.getToolkit().createLabel(grpOptionalData,
                Messages.advancedMappingObjectPropertySection_No_Value_Set);

        this.lblDefaultvalValue.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));

        this.storeparam = new StoreParamComposite(grpOptionalData, 0);

        this.storeparam.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));

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
        // // Label indexLabel = new Label(clientComposite, SWT.NONE);
        // // indexLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER,
        // // false, false, 1, 1));
        // // indexLabel.setText("Index:");
        // // managedForm.getToolkit().adapt(indexLabel, true, true);
        // //
        // indexLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));
        // //
        // // indexText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
        // // indexText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
        // // false, 5, 1));
        // // managedForm.getToolkit().adapt(indexText, true, true);
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
        // subNumberLabel.setText("Sub Index:");
        // managedForm.getToolkit().adapt(subNumberLabel, true, true);
        // subNumberLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));
        //
        // subIndexText = new Text(clientComposite, SWT.BORDER | SWT.WRAP);
        // subIndexText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
        // false, 5, 1));
        // managedForm.getToolkit().adapt(subIndexText, true, true);
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
