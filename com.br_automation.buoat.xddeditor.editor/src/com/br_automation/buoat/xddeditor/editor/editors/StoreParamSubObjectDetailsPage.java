/*******************************************************************************
 * @file   StoreParamSubObjectDetailsPage.java
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
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
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
import org.eclipse.wb.swt.SWTResourceManager;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.custom.Messages;
import com.br_automation.buoat.xddeditor.XDD.custom.XDDUtilities;
import com.br_automation.buoat.xddeditor.XDD.impl.SubObjectTypeImpl;
import com.br_automation.buoat.xddeditor.XDD.resources.IPowerlinkConstants;

/**
 * Class to populate the details page of store param subobject
 *
 * @author Sree Hari Vignesh
 *
 */
public class StoreParamSubObjectDetailsPage extends EEFAdvancedPropertySection implements IDetailsPage {

    private IManagedForm managedForm;

    private Text nameText;
    private Text objTypeText;

    private Text subIndexText;

    private SubObjectTypeImpl subObject;
    private DocumentRoot docRoot;
    private DeviceDescriptionFileEditor editor;

    private Label valueOfLabelDefaultValue;
    private Label lblIndexValue;
    private StoreParamComposite storeparam;

    private TObject tobject;

    /*
     * Constructor
     */
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

    @Override
    public void selectionChanged(IFormPart part, ISelection selection) {
        if (selection instanceof IStructuredSelection) {
            IStructuredSelection sel = (IStructuredSelection) selection;

            SubObjectTypeImpl obj = (SubObjectTypeImpl) sel.getFirstElement();

            subObject = (SubObjectTypeImpl) obj;
            tobject = (TObject) subObject.eContainer();

            if (lblIndexValue != null) {
                this.lblIndexValue.setText("0x1010 (" + tobject.getName() + ")"); //$NON-NLS-1$
            }

            if (obj.getSubIndex() != null) {
                String index = DatatypeConverter.printHexBinary(obj.getSubIndex());
                index = "0x" + index;
                if (subIndexText != null) {
                    subIndexText.setText(index);
                }
            }

            if (obj.getName() != null) {
                if (nameText != null) {
                    nameText.setText(obj.getName());
                }
            }

            if (obj.getObjectType() != 0) {
                if (objTypeText != null) {
                    objTypeText.setText(String.valueOf(obj.getObjectType()));
                }
            }
        }
    }

    /**
     *
     * @brief Composite showing radiobuttons for device save options.
     *
     *        Generates a default value based on the selection.
     *
     * @author Sree Hari Vignesh
     */
    private class StoreParamComposite extends Composite {

        private final Button btnAutoSave;
        private final Button btnCmdSave;
        private final Button btnNoSave;
        private final Label lblError;

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
            valueOfLabelDefaultValue.setForeground(XDDUtilities.getBlack(Display.getCurrent()));
            this.lblError.setVisible(false);
            subObject.setDefaultValue(("0x" + String.format(String.format("%08x", settedValue))));
            updateDocument(docRoot);
            valueOfLabelDefaultValue.setText(subObject.getDefaultValue());
        }

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

    }

    @Override
    public void createContents(Composite parent) {

        GridLayout layout = new GridLayout(1, true);
        parent.setLayout(layout);
        layout.marginWidth = 20;
        Section storeParamSection = managedForm.getToolkit().createSection(parent, ExpandableComposite.EXPANDED
                | Section.DESCRIPTION | ExpandableComposite.TWISTIE | ExpandableComposite.TITLE_BAR);

        GridData gd_index1F82Section = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_index1F82Section.widthHint = 558;
        storeParamSection.setLayoutData(gd_index1F82Section);
        managedForm.getToolkit().paintBordersFor(storeParamSection);
        storeParamSection.setText(ObjectDictionaryEditorPage.SUB_OBJECT_DICTIONARY_DETAILS_HEADING);

        Composite clientComposite = managedForm.getToolkit().createComposite(storeParamSection, SWT.WRAP);
        GridLayout layouts = new GridLayout(6, false);
        layouts.marginWidth = 2;
        layouts.marginHeight = 2;
        clientComposite.setLayout(layouts);
        managedForm.getToolkit().paintBordersFor(clientComposite);

        storeParamSection.setClient(clientComposite);

        Group grpMandatoryData = new Group(clientComposite, SWT.NONE);
        grpMandatoryData.setText(IPowerlinkConstants.MANDATORY_DATA_GROUP);
        grpMandatoryData.setLayout(layouts);

        GridData gd_grpConfigurationFile = new GridData(SWT.LEFT, SWT.FILL, true, false, 6, 1);
        gd_grpConfigurationFile.widthHint = 500;

        grpMandatoryData.setLayoutData(gd_grpConfigurationFile);

        GridData mandatoryvalsec = new GridData(SWT.LEFT, SWT.CENTER, true, false, 5, 1);
        mandatoryvalsec.heightHint = 15;
        mandatoryvalsec.widthHint = 420;

        Label nameLabel = new Label(grpMandatoryData, SWT.NONE);
        nameLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        nameLabel.setText(IPowerlinkConstants.OBJECT_NAME);
        managedForm.getToolkit().adapt(nameLabel, true, true);

        nameText = new Text(grpMandatoryData, SWT.BORDER | SWT.WRAP);
        nameText.setLayoutData(mandatoryvalsec);
        managedForm.getToolkit().adapt(nameText, true, true);
        nameText.setEditable(false);
        nameText.setEnabled(false);

        Label objTypelabel = new Label(grpMandatoryData, SWT.NONE);
        objTypelabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        objTypelabel.setText(IPowerlinkConstants.OBJECT_TYPE);
        managedForm.getToolkit().adapt(objTypelabel, true, true);

        objTypeText = new Text(grpMandatoryData, SWT.BORDER | SWT.WRAP);
        objTypeText.setLayoutData(mandatoryvalsec);
        managedForm.getToolkit().adapt(objTypeText, true, true);
        objTypeText.setEditable(false);
        objTypeText.setEnabled(false);

        Label indexLabel = new Label(grpMandatoryData, SWT.NONE);
        indexLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
        indexLabel.setText(IPowerlinkConstants.SUB_OBJECT_INDEX);
        managedForm.getToolkit().adapt(indexLabel, true, true);

        subIndexText = new Text(grpMandatoryData, SWT.BORDER | SWT.WRAP);
        subIndexText.setLayoutData(mandatoryvalsec);
        managedForm.getToolkit().adapt(subIndexText, true, true);
        subIndexText.setEditable(false);
        subIndexText.setEnabled(false);

        Composite groupComposite2 = new Composite(clientComposite, SWT.NONE);
        groupComposite2.setLayout(new GridLayout(2, false));

        Group grpOptionalData = new Group(groupComposite2, SWT.NONE);
        GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
        gridData.widthHint = 500;
        grpOptionalData.setLayoutData(gridData);
        grpOptionalData.setText(IPowerlinkConstants.OPTIONAL_GROUP);
        grpOptionalData.setLayout(new GridLayout(2, false));

        // Checkbox-Buttons -------------------------------------------

        // Index Label (from Parent!)
        Label lblIndex = managedForm.getToolkit().createLabel(grpOptionalData, "Index:"); //$NON-NLS-1$

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
        this.valueOfLabelDefaultValue = managedForm.getToolkit().createLabel(grpOptionalData,
                Messages.advancedMappingObjectPropertySection_No_Value_Set);

        this.valueOfLabelDefaultValue.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));

        this.storeparam = new StoreParamComposite(grpOptionalData, 0);

        this.storeparam.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));

    }

}
