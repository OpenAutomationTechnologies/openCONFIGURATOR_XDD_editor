/**
 * @since 19.3.2013
 * @author Joris Lückenga, Bernecker + Rainer Industrie Elektronik Ges.m.b.H.
 */

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

        this.rbtnLoadEmptyXDD = new Button(composite, SWT.RADIO);
        this.rbtnLoadEmptyXDD.setBounds(10, 121, 149, 16);
        this.rbtnLoadEmptyXDD.setText("Create an empty XDD file");
        rbtnLoadEmptyXDD.setVisible(false);
        //If Empty Project is loaded....
        this.rbtnLoadEmptyXDD.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {

                WizardTemplatePage.this.cmbTemplate.setEnabled(false);
                WizardTemplatePage.this.cbtnUseConfigurationWizard.setEnabled(false);
                WizardTemplatePage.this.cbtnUseConfigurationWizard.setSelection(false);
                WizardTemplatePage.this.enableNext = false;
                WizardTemplatePage.this.setPageComplete(false);
                WizardTemplatePage.this.setPageComplete(true);
            }
        });

        this.cmbTemplate = new Combo(composite, SWT.NONE);
        this.cmbTemplate.setBounds(30, 56, 186, 23);
        this.cmbTemplate.setItems(new String[] { "Default device", "Default extended device",
        "Default static device" });
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
                    //((WizardPage) getNextPage()).setPageComplete(false);
                } else {
                    WizardTemplatePage.this.enableNext = false;
                    //((WizardPage) getNextPage()).setPageComplete(true);
                    WizardTemplatePage.this.setPageComplete(false);
                    WizardTemplatePage.this.setPageComplete(true);
                }

            }
        });
        this.cbtnUseConfigurationWizard.setBounds(30, 85, 304, 16);
        this.cbtnUseConfigurationWizard
        .setText("Use the Configuration Wizard to modify the Template");
    } //createControl

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

} //WizardPage
