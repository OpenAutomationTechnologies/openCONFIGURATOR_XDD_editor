package com.br_automation.buoat.xddeditor.XDD.custom;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

//Wizard to choose Template and if the ConfigurationWizard should be used
public class WizardTemplatePage extends WizardPage {

    public WizardTemplatePage(String pageName) {
        super(pageName);
        setTitle("XDD Model wizard");
        setDescription("Default Template selection");
        enableNext = false;
        setPageComplete(false);
    }

    //These Parameters are public, so that "InitalModelLoad" can read the parameters
    private Combo templatecombo;
    private Button rbtnLoadEmptyXDD;
    private Button cboxUseConfigurationWizard;
    boolean enableNext;

    public Combo getTemplateCombo() {
        return templatecombo;
    }

    public boolean getLoadEmpty() {
        if (rbtnLoadEmptyXDD.getSelection())
            return true;
        else
            return false;
    }

    public boolean getConfigurationWizardStatus() {
        if (cboxUseConfigurationWizard.getSelection())
            return true;
        else
            return false;
    }

    /**
     * Create the wizard.
     */

    /**
     * Create contents of the wizard.
     * 
     * @param parent
     */
    @Override
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NONE);

        setControl(container);

        Composite composite = new Composite(container, SWT.NONE);
        composite.setBounds(10, 10, 387, 147);

        rbtnLoadEmptyXDD = new Button(composite, SWT.RADIO);
        {
            rbtnLoadEmptyXDD.setBounds(10, 121, 149, 16);
            rbtnLoadEmptyXDD.setText("Load empty XDD file");
            //If Empty Project is loaded....
            rbtnLoadEmptyXDD.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent e) {

                    templatecombo.setEnabled(false);
                    cboxUseConfigurationWizard.setEnabled(false);
                    cboxUseConfigurationWizard.setSelection(false);
                    enableNext = false;
                    setPageComplete(false);
                    setPageComplete(true);
                }
            });
        }

        templatecombo = new Combo(composite, SWT.NONE);
        {
            templatecombo.setBounds(30, 56, 186, 23);
            templatecombo.setItems(new String[] { "Default device", "Default extended device",
                "Default static device" });
            templatecombo.select(0);
        }
        Label lblTemplateType = new Label(composite, SWT.NONE);
        lblTemplateType.setBounds(30, 32, 85, 15);
        lblTemplateType.setText("Template type:");

        Button rbtnLoadDefaultXDD = new Button(composite, SWT.RADIO);
        rbtnLoadDefaultXDD.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                templatecombo.setEnabled(true);
                cboxUseConfigurationWizard.setEnabled(true);
                enableNext = false;
            }
        });
        rbtnLoadDefaultXDD.setSelection(true);
        rbtnLoadDefaultXDD.setBounds(10, 10, 172, 16);
        rbtnLoadDefaultXDD.setText("Load default XDD Template");

        cboxUseConfigurationWizard = new Button(composite, SWT.CHECK);
        cboxUseConfigurationWizard.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {

                if (cboxUseConfigurationWizard.getSelection() == true) {
                    enableNext = true;
                    setPageComplete(true);
                    //((WizardPage) getNextPage()).setPageComplete(false);
                } else {
                    enableNext = false;
                    //((WizardPage) getNextPage()).setPageComplete(true);
                    setPageComplete(false);
                    setPageComplete(true);
                }

            }
        });
        cboxUseConfigurationWizard.setBounds(30, 85, 304, 16);
        cboxUseConfigurationWizard.setText("Use the Configuration Wizard to modify the Template");

    }//createControl

    @Override
    public boolean canFlipToNextPage() {
        return enableNext;
    }

}//WizardPage