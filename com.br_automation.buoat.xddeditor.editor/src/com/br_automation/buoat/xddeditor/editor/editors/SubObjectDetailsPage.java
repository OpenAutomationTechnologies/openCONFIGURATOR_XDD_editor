/*******************************************************************************
 * @file   SubObjectDetailsPage.java
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

import javax.xml.bind.DatatypeConverter;

import org.eclipse.emf.eef.runtime.ui.properties.sections.EEFAdvancedPropertySection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IFormColors;
import org.eclipse.ui.forms.IFormPart;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.Section;

import com.br_automation.buoat.xddeditor.XDD.impl.SubObjectTypeImpl;

/**
 * Class to populate the details page of subobject
 *
 * @author Sree hari Vignesh
 *
 */
public class SubObjectDetailsPage extends EEFAdvancedPropertySection implements IDetailsPage {

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
        IStructuredSelection sel = (IStructuredSelection) selection;

        SubObjectTypeImpl obj = (SubObjectTypeImpl) sel.getFirstElement();

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

    @Override
    public void createContents(Composite parent) {

        GridLayout layout = new GridLayout(3, true);

        parent.setLayout(layout);
        layout.marginWidth = 20;
        Section deviceFirmwareSection = managedForm.getToolkit().createSection(parent, ExpandableComposite.EXPANDED
                | Section.DESCRIPTION | ExpandableComposite.TWISTIE | ExpandableComposite.TITLE_BAR);
        managedForm.getToolkit().paintBordersFor(deviceFirmwareSection);
        deviceFirmwareSection.setText(ObjectDictionaryEditorPage.SUB_OBJECT_DICTIONARY_DETAILS_HEADING);
        deviceFirmwareSection.setDescription(ObjectDictionaryEditorPage.OBJECT_DICTIONARY_HEADING_DESCRIPTION);

        Composite clientComposite = managedForm.getToolkit().createComposite(deviceFirmwareSection, SWT.WRAP);
        GridLayout layouts = new GridLayout(6, true);
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
