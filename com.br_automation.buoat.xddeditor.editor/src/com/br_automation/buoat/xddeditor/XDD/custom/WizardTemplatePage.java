/*******************************************************************************
 * @file   WizardTemplatePage.java
 *
 * @author Joris Lückenga, Bernecker + Rainer Industrie Elektronik Ges.m.b.H.
 *
 * @copyright (c) 2017, Kalycito Infotech Private Limited
 *
 *
 *@copyright (c) 2017, Bernecker + Rainer Industrie Elektronik Ges.m.b.H.
 *            All rights reserved.
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

package com.br_automation.buoat.xddeditor.XDD.custom;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * @brief Wizard to choose Template and if the ConfigurationWizard should be
 *        used.
 *
 *        Provides a combobox and checkbox to set template and ask if the
 *        advanced wizard should be used.
 *
 * @author Joris Lückenga
 */
public class WizardTemplatePage extends WizardPage {

    private Button cbtnUseConfigurationWizard;
    private Combo cmbTemplate;
    private boolean enableNext;
    private Button rbtnLoadEmptyXDD;

    /**
     * @see WizardTemplatePage#WizardTemplatePage(String)
     */
    public WizardTemplatePage(String pageName) {
        super(pageName);
        this.setTitle("XDD Model wizard");
        this.setDescription("Default Template selection");
        this.enableNext = false;
        this.setPageComplete(false);
    }

    @Override
    public boolean canFlipToNextPage() {
        return this.enableNext;
    }

    /**
     * @see WizardPage#createControl(Composite)
     */
    @Override
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NONE);

        this.setControl(container);

        Composite composite = new Composite(container, SWT.NONE);
        composite.setBounds(10, 10, 387, 147);

        this.cmbTemplate = new Combo(composite, SWT.READ_ONLY);
        this.cmbTemplate.setBounds(30, 56, 186, 23);
        this.cmbTemplate
                .setItems(new String[] { "Default device", "Default extended device", "Default static device" });
        this.cmbTemplate.select(0);

        Label lblTemplateType = new Label(composite, SWT.NONE);
        lblTemplateType.setBounds(30, 32, 85, 15);
        lblTemplateType.setText("Template type:");

        Button rbtnLoadDefaultXDD = new Button(composite, SWT.RADIO);
        rbtnLoadDefaultXDD.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                WizardTemplatePage.this.cmbTemplate.setEnabled(true);
                WizardTemplatePage.this.cbtnUseConfigurationWizard.setEnabled(true);
                WizardTemplatePage.this.enableNext = false;
            }
        });
        rbtnLoadDefaultXDD.setSelection(true);
        rbtnLoadDefaultXDD.setBounds(10, 10, 240, 16);
        rbtnLoadDefaultXDD.setText("Create a new XDD file based on a template");

        this.cbtnUseConfigurationWizard = new Button(composite, SWT.CHECK);
        this.cbtnUseConfigurationWizard.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {

                if (WizardTemplatePage.this.cbtnUseConfigurationWizard.getSelection()) {
                    WizardTemplatePage.this.enableNext = true;
                    WizardTemplatePage.this.setPageComplete(true);
                    // ((WizardPage) getNextPage()).setPageComplete(false);
                } else {
                    WizardTemplatePage.this.enableNext = false;
                    // ((WizardPage) getNextPage()).setPageComplete(true);
                    WizardTemplatePage.this.setPageComplete(false);
                    WizardTemplatePage.this.setPageComplete(true);
                }

            }
        });
        this.cbtnUseConfigurationWizard.setBounds(30, 85, 304, 16);
        this.cbtnUseConfigurationWizard.setText("Use the configuration wizard to modify the template");
    } // createControl

    /**
     * @return <code>True</code> if empty model should be generated,
     *         <code>false</code> otherwise.
     */
    public boolean getLoadEmpty() {
        return this.rbtnLoadEmptyXDD.getSelection();
    }

    /**
     * @brief Gets the template combobox.
     * @return The combo instance of the Wizard.
     */
    public Combo getTemplateCombo() {
        return this.cmbTemplate;
    }

    /**
     * @brief Checks cboxUseConfigurationWizard if additional
     *        ConfigurationWizard should be used.
     * @return <code>true</code>if ConfigurationWizard checkbox is selected,
     *         <code>false</code> otherwise.
     */
    public boolean isConfigurationWizardStatus() {
        return this.cbtnUseConfigurationWizard.getSelection();
    }

} // WizardPage
