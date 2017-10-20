/*******************************************************************************
 * @file   ObjectDetailsPage.java
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

import javax.xml.bind.DatatypeConverter;

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

import com.br_automation.buoat.xddeditor.XDD.impl.TObjectImpl;
import com.br_automation.buoat.xddeditor.XDD.resources.IPowerlinkConstants;

/**
 * Class to populate the details page of object
 *
 * @author Sree hari Vignesh
 *
 */
public class ObjectDetailsPage implements IDetailsPage {

    private IManagedForm managedForm;

    private Text indexText;

    private Text nameText;
    private Text objTypeText;

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

            TObjectImpl obj = (TObjectImpl) sel.getFirstElement();

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
    }

    @Override
    public void createContents(Composite parent) {

        if (managedForm != null) {
            GridLayout layout = new GridLayout(2, false);
            parent.setLayout(layout);
            layout.marginWidth = 20;
            Section objectDetailsSection = managedForm.getToolkit().createSection(parent,
                    ExpandableComposite.EXPANDED | Section.DESCRIPTION | ExpandableComposite.TWISTIE
                            | ExpandableComposite.TITLE_BAR | ExpandableComposite.COMPACT);
            managedForm.getToolkit().paintBordersFor(objectDetailsSection);
            objectDetailsSection.setText(ObjectDictionaryEditorPage.OBJECT_DICTIONARY_DETAILS_HEADING);

            Composite clientComposite = managedForm.getToolkit().createComposite(objectDetailsSection, SWT.WRAP);
            GridLayout layouts = new GridLayout(6, false);
            layouts.marginWidth = 5;
            clientComposite.setLayout(layouts);
            managedForm.getToolkit().paintBordersFor(clientComposite);
            objectDetailsSection.setClient(clientComposite);

            Group grpMandatoryData = new Group(clientComposite, SWT.WRAP);
            grpMandatoryData.setText(IPowerlinkConstants.MANDATORY_DATA_GROUP);
            grpMandatoryData.setLayout(layouts);

            GridData gd_grpMandatoryData = new GridData(SWT.FILL, SWT.FILL, true, false, 6, 1);
            gd_grpMandatoryData.widthHint = 500;
            grpMandatoryData.setLayoutData(gd_grpMandatoryData);

            GridData mandatoryvalsec = new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1);
            mandatoryvalsec.heightHint = 15;
            mandatoryvalsec.widthHint = 250;

            Label nameLabel = new Label(grpMandatoryData, SWT.WRAP);
            nameLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
            nameLabel.setText(IPowerlinkConstants.OBJECT_NAME);
            managedForm.getToolkit().adapt(nameLabel, true, true);
            nameLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

            nameText = new Text(grpMandatoryData, SWT.BORDER | SWT.WRAP);
            nameText.setLayoutData(mandatoryvalsec);
            managedForm.getToolkit().adapt(nameText, true, true);
            nameText.setEditable(false);

            Label objTypelabel = new Label(grpMandatoryData, SWT.WRAP);
            objTypelabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
            objTypelabel.setText(IPowerlinkConstants.OBJECT_TYPE);
            managedForm.getToolkit().adapt(objTypelabel, true, true);
            objTypelabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

            objTypeText = new Text(grpMandatoryData, SWT.BORDER | SWT.WRAP);
            objTypeText.setLayoutData(mandatoryvalsec);
            managedForm.getToolkit().adapt(objTypeText, true, true);
            objTypeText.setEditable(false);

            Label indexLabel = new Label(grpMandatoryData, SWT.WRAP);
            indexLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
            indexLabel.setText(IPowerlinkConstants.OBJECT_INDEX);
            managedForm.getToolkit().adapt(indexLabel, true, true);
            indexLabel.setForeground(managedForm.getToolkit().getColors().getColor(IFormColors.TITLE));

            indexText = new Text(grpMandatoryData, SWT.BORDER | SWT.WRAP);
            indexText.setLayoutData(mandatoryvalsec);
            managedForm.getToolkit().adapt(indexText, true, true);
            indexText.setEditable(false);

        }
    }

}
