/*******************************************************************************
 * @file   Index1000DetailsPage.java
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
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
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
import com.br_automation.buoat.xddeditor.XDD.custom.CiADeviceProfile;
import com.br_automation.buoat.xddeditor.XDD.custom.Messages;
import com.br_automation.buoat.xddeditor.XDD.custom.XDDUtilities;
import com.br_automation.buoat.xddeditor.XDD.custom.XDDUtilities.RegexVerifyListener;
import com.br_automation.buoat.xddeditor.XDD.custom.propertypages.AdvancedDeviceTypePropertySection;
import com.br_automation.buoat.xddeditor.XDD.impl.TObjectImpl;
import com.br_automation.buoat.xddeditor.XDD.resources.IPowerlinkConstants;

/**
 * Class to populate the details page of 0x1000 object
 *
 * @author Sree hari Vignesh
 *
 */
public class Index1000DetailsPage implements IDetailsPage {

    private IManagedForm managedForm;

    private Text indexText;

    private Text nameText;
    private Text objTypeText;

    private TObjectImpl index1000Object;
    private DocumentRoot docRoot;
    private DeviceDescriptionFileEditor editor;

    public Index1000DetailsPage(TObjectImpl index1000Object, DocumentRoot docRoot, DeviceDescriptionFileEditor editor) {
        this.index1000Object = index1000Object;
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
    private long profileValue;
    private long maskLSB;
    private long maskMSB;
    private long additionalInfoValue;

    private RegexVerifyListener additionalInfoListener = new RegexVerifyListener(RegexVerifyListener.PATTERN_HEX,
            Arrays.asList(Character.valueOf((char) 0x7f), Character.valueOf((char) 0x8)), true);

    private ModifyListener profileListener = new ModifyListener() {
        @Override
        public void modifyText(ModifyEvent e) {
            lblError.setText(""); //$NON-NLS-1$
            if (!cmbDeviceProfileNr.getText().isEmpty())
                profileValue = Long.parseLong(cmbDeviceProfileNr.getText().substring(4, 7));
            setDefaultValue();
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

    /**
     * @brief Sets the new Defaultvalue to the Object based on made selections.
     */
    private void setDefaultValue() {
        Long newDefaultValue = (this.additionalInfoValue) + this.profileValue;
        String defaultHexValue = Long.toHexString(newDefaultValue);
        index1000Object.setDefaultValue(defaultHexValue.toUpperCase());
        updateDocument(docRoot);
        this.lblDefaultValueValue.setText(index1000Object.getDefaultValue());
    }

    private final FocusAdapter additionalInfoFocuslistener = new FocusAdapter() {

        @Override
        public void focusLost(FocusEvent arg0) {
            additionalInfoValue = (Long.decode("0x" //$NON-NLS-1$
                    + txtAdditionalInfo.getText())) << 16;
            setDefaultValue();
        }
    };

    @Override
    public void selectionChanged(IFormPart part, ISelection selection) {
        IStructuredSelection sel = (IStructuredSelection) selection;
        System.err.println("The object instance.." + sel.getFirstElement());
        TObjectImpl obj = (TObjectImpl) sel.getFirstElement();

        this.tobject = (TObject) obj;
        this.lblError.setText(""); //$NON-NLS-1$

        if (this.tobject.getDefaultValue() != null && this.tobject.getDefaultValue().length() > 0) {
            try {
                this.lblDefaultValueValue.setText(this.tobject.getDefaultValue());
                this.profileValue = Long.decode(this.tobject.getDefaultValue()) & this.maskLSB; // get
                                                                                                // 16
                                                                                                // LSB
                this.additionalInfoValue = Long.decode(this.tobject.getDefaultValue()) & this.maskMSB;

                this.txtAdditionalInfo.setText(String.format("%04x", this.additionalInfoValue) //$NON-NLS-1$
                        .toUpperCase());
                this.txtAdditionalInfo.addVerifyListener(this.additionalInfoListener);

                String selectedProfileString = null;
                selectedProfileString = (String) this.cmbDeviceProfileNr.getData(Long.toString(this.profileValue));
                if (selectedProfileString != null) {
                    this.cmbDeviceProfileNr.select(this.cmbDeviceProfileNr.indexOf(selectedProfileString));
                    this.lblError.setText(""); //$NON-NLS-1$
                } else if (this.profileValue != 0) {
                    this.cmbDeviceProfileNr.setText(""); //$NON-NLS-1$
                    this.lblError.setText(Messages.advancedDeviceTypePropertySection_CiA_Profile_not_found);
                    this.lblError.setForeground(XDDUtilities.getRed(Display.getCurrent()));
                }

            } catch (NumberFormatException e) {
                this.lblError.setText(Messages.general_error_defaultValueInvalid);
                this.lblError.setForeground(XDDUtilities.getRed(Display.getCurrent()));
            }
        }

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

    private Text txtAdditionalInfo;

    private Label lblError;

    private Label lblDefaultValueValue;

    private Combo cmbDeviceProfileNr;

    @Override
    public void createContents(Composite parent) {

        GridLayout layout = new GridLayout(1, true);

        parent.setLayout(layout);

        this.maskLSB = 0xFFFF;
        this.maskMSB = 0xFFFF0000; // $NON-NLS-1$

        layout.marginWidth = 20;
        Section index1000ObjectSection = managedForm.getToolkit().createSection(parent, ExpandableComposite.EXPANDED
                | Section.DESCRIPTION | ExpandableComposite.TWISTIE | ExpandableComposite.TITLE_BAR);
        GridData gd_index1000ObjectSection = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_index1000ObjectSection.widthHint = 595;
        index1000ObjectSection.setLayoutData(gd_index1000ObjectSection);
        managedForm.getToolkit().paintBordersFor(index1000ObjectSection);
        index1000ObjectSection.setText(ObjectDictionaryEditorPage.OBJECT_DICTIONARY_DETAILS_HEADING);

        GridData gd_index1000Section = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_index1000Section.widthHint = 595;
        Composite clientComposite = managedForm.getToolkit().createComposite(index1000ObjectSection, SWT.WRAP);
        GridLayout layouts = new GridLayout(1, false);
        layouts.marginWidth = 2;
        layouts.marginHeight = 2;
        clientComposite.setLayout(layouts);
        managedForm.getToolkit().paintBordersFor(clientComposite);

        index1000ObjectSection.setClient(clientComposite);

        GridData gd_grpConfigurationFile = new GridData(SWT.FILL, SWT.FILL, false, false, 2, 1);
        gd_grpConfigurationFile.widthHint = 547;

        Composite groupComposite = new Composite(clientComposite, SWT.NONE);
        GridData gd_groupComposite = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_groupComposite.widthHint = 574;
        groupComposite.setLayoutData(gd_groupComposite);
        groupComposite.setLayout(new GridLayout(2, false));

        Group grpMandatoryData = new Group(groupComposite, SWT.NONE);
        grpMandatoryData.setLayoutData(gd_grpConfigurationFile);
        grpMandatoryData.setText(IPowerlinkConstants.MANDATORY_DATA_GROUP);
        grpMandatoryData.setLayout(new GridLayout(6, false));

        Label nameLabel = new Label(grpMandatoryData, SWT.NONE);
        nameLabel.setText(IPowerlinkConstants.OBJECT_NAME);
        managedForm.getToolkit().adapt(nameLabel, true, true);
        nameLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

        nameText = new Text(grpMandatoryData, SWT.BORDER | SWT.WRAP);
        GridData gd_nameText = new GridData(SWT.LEFT, SWT.CENTER, true, false, 5, 1);
        gd_nameText.widthHint = 450;
        nameText.setLayoutData(gd_nameText);
        managedForm.getToolkit().adapt(nameText, true, true);
        nameText.setEditable(false);

        Label objTypelabel = new Label(grpMandatoryData, SWT.NONE);
        objTypelabel.setText(IPowerlinkConstants.OBJECT_TYPE);
        managedForm.getToolkit().adapt(objTypelabel, true, true);
        objTypelabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

        objTypeText = new Text(grpMandatoryData, SWT.BORDER | SWT.WRAP);
        GridData gd_objTypeText = new GridData(SWT.LEFT, SWT.CENTER, true, false, 5, 1);
        gd_objTypeText.widthHint = 450;
        objTypeText.setLayoutData(gd_objTypeText);
        managedForm.getToolkit().adapt(objTypeText, true, true);
        objTypeText.setEditable(false);

        Label indexLabel = new Label(grpMandatoryData, SWT.NONE);
        indexLabel.setText(IPowerlinkConstants.OBJECT_INDEX);
        managedForm.getToolkit().adapt(indexLabel, true, true);
        indexLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

        indexText = new Text(grpMandatoryData, SWT.BORDER | SWT.WRAP);
        GridData gd_indexText = new GridData(SWT.LEFT, SWT.CENTER, true, false, 5, 1);
        gd_indexText.widthHint = 450;
        indexText.setLayoutData(gd_indexText);
        managedForm.getToolkit().adapt(indexText, true, true);
        indexText.setEditable(false);

        Composite groupComposite2 = new Composite(clientComposite, SWT.NONE);
        GridData gd_groupComposite2 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_groupComposite2.widthHint = 574;
        groupComposite2.setLayoutData(gd_groupComposite2);
        groupComposite2.setLayout(new GridLayout(2, false));

        Group grpOptionalData = new Group(groupComposite2, SWT.NONE);
        GridData gridData = new GridData(SWT.LEFT, SWT.FILL, true, false, 2, 1);
        gridData.widthHint = 569;
        grpOptionalData.setLayoutData(gridData);
        grpOptionalData.setText(IPowerlinkConstants.OPTIONAL_GROUP);
        grpOptionalData.setLayout(new GridLayout(2, false));

        Label lblDefaultValue = managedForm.getToolkit().createLabel(grpOptionalData,
                IPowerlinkConstants.DEFAULT_VALUE);

        // lblDefaultValueValue Label
        this.lblDefaultValueValue = managedForm.getToolkit().createLabel(grpOptionalData, ""); //$NON-NLS-1$

        Label lblProfileType = managedForm.getToolkit().createLabel(grpOptionalData,
                IPowerlinkConstants.PROFILE_TYPE_LABEL);

        this.cmbDeviceProfileNr = new Combo(grpOptionalData, SWT.READ_ONLY);

        for (CiADeviceProfile profile : CiADeviceProfile.values()) {
            String profileText = profile.getProfileName() + " - " + profile.getProfileDescription(); //$NON-NLS-1$
            this.cmbDeviceProfileNr.add(profileText);
            this.cmbDeviceProfileNr.setData(Integer.toString(profile.getValue()), profileText);
        }
        cmbDeviceProfileNr.select(0);
        this.cmbDeviceProfileNr.addModifyListener(this.profileListener);

        Label lblAdditionalInfo = managedForm.getToolkit().createLabel(grpOptionalData,
                IPowerlinkConstants.ADDITIONAL_INFO_LABEL);

        this.txtAdditionalInfo = managedForm.getToolkit().createText(grpOptionalData, "");
        this.txtAdditionalInfo.setTextLimit(4);
        this.txtAdditionalInfo.addFocusListener(this.additionalInfoFocuslistener);

        this.lblError = managedForm.getToolkit().createLabel(grpOptionalData,
                "                                                  ");
        new Label(grpOptionalData, SWT.NONE);

    }

}
