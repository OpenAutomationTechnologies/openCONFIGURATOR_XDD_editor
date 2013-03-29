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
 * @author Joris Lückenga
 * @since 19.3.2013
 * @brief Wizard to choose Template and if the ConfigurationWizard should be
 *        used
 */
public class WizardTemplatePage extends WizardPage {

    private Button cboxUseConfigurationWizard;
    private boolean enableNext;
    private Button rbtnLoadEmptyXDD;
    private Combo templatecombo;

    /**
     * @brief Constructor of WizardTemplatePage
     * @param pageName
     *            Name-String of the Wizard-Page
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
     * Create contents of the wizard.
     * 
     * @param parent
     */
    @Override
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NONE);

        this.setControl(container);

        Composite composite = new Composite(container, SWT.NONE);
        composite.setBounds(10, 10, 387, 147);

        this.rbtnLoadEmptyXDD = new Button(composite, SWT.RADIO);
        {
            this.rbtnLoadEmptyXDD.setBounds(10, 121, 149, 16);
            this.rbtnLoadEmptyXDD.setText("Load empty XDD file");
            //If Empty Project is loaded....
            this.rbtnLoadEmptyXDD.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent e) {

                    WizardTemplatePage.this.templatecombo.setEnabled(false);
                    WizardTemplatePage.this.cboxUseConfigurationWizard.setEnabled(false);
                    WizardTemplatePage.this.cboxUseConfigurationWizard.setSelection(false);
                    WizardTemplatePage.this.enableNext = false;
                    WizardTemplatePage.this.setPageComplete(false);
                    WizardTemplatePage.this.setPageComplete(true);
                }
            });
        }

        this.templatecombo = new Combo(composite, SWT.NONE);
        {
            this.templatecombo.setBounds(30, 56, 186, 23);
            this.templatecombo.setItems(new String[] { "Default device", "Default extended device",
                "Default static device" });
            this.templatecombo.select(0);
        }
        Label lblTemplateType = new Label(composite, SWT.NONE);
        lblTemplateType.setBounds(30, 32, 85, 15);
        lblTemplateType.setText("Template type:");

        Button rbtnLoadDefaultXDD = new Button(composite, SWT.RADIO);
        rbtnLoadDefaultXDD.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                WizardTemplatePage.this.templatecombo.setEnabled(true);
                WizardTemplatePage.this.cboxUseConfigurationWizard.setEnabled(true);
                WizardTemplatePage.this.enableNext = false;
            }
        });
        rbtnLoadDefaultXDD.setSelection(true);
        rbtnLoadDefaultXDD.setBounds(10, 10, 172, 16);
        rbtnLoadDefaultXDD.setText("Load default XDD Template");

        this.cboxUseConfigurationWizard = new Button(composite, SWT.CHECK);
        this.cboxUseConfigurationWizard.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {

                if (WizardTemplatePage.this.cboxUseConfigurationWizard.getSelection()) {
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
        this.cboxUseConfigurationWizard.setBounds(30, 85, 304, 16);
        this.cboxUseConfigurationWizard
            .setText("Use the Configuration Wizard to modify the Template");
    } //createControl

    /**
     * @brief checks if LoadEmpty should be triggered
     * @return true/false if empty model should be generated
     */
    public boolean getLoadEmpty() {
        return this.rbtnLoadEmptyXDD.getSelection();
    }

    /**
     * @brief gets the Template-Combobox
     * @return to check which template should be used
     */
    public Combo getTemplateCombo() {
        return this.templatecombo;
    }

    /**
     * @brief checks if additional ConfigurationWizard should be used
     * @return true/false if ConfigurationWizard should be used
     */
    public boolean isConfigurationWizardStatus() {
        return this.cboxUseConfigurationWizard.getSelection();
    }
} //WizardPage