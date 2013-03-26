package com.br_automation.buoat.xddeditor.XDD.custom;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

import com.br_automation.buoat.xddeditor.XDD.SubObjectType;
import com.br_automation.buoat.xddeditor.XDD.provider.SubObjectTypeItemProvider;

/**
 * @author Joris Lückenga
 * @since 25.3.2013
 * @brief Composite-Class for StoreParameters
 */
public class StoreParamComposite extends Composite {

    private final Button btnAutoSave;
    private final Button btnCmdSave;
    private final Button btnNoSave;
    private final Label lblError;
    private CLabel lblsubObjectDefaultValue;
    private SubObjectType subobject;
    private SubObjectTypeItemProvider subobjectItemProvider;

    /**
     * @brief Consructs the StoreParam-Composite
     * @param parent
     *            see Composite#Composite(Composite, int)
     * @param style
     *            see Composite#Composite(Composite, int)
     */
    public StoreParamComposite(Composite parent,
        int style) {
        super(parent, style);
        this.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

        Group grpStorageParameters = new Group(this, SWT.NONE);
        grpStorageParameters.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
        grpStorageParameters.setText("Storage capability");
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
        this.btnAutoSave.setText("Device saves parameters autonomously");
        this.btnAutoSave.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

        this.btnCmdSave = new Button(grpStorageParameters, SWT.RADIO);
        this.btnCmdSave.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                StoreParamComposite.this.setDefaultValue(1);
            }
        });
        this.btnCmdSave.setBounds(10, 42, 224, 16);
        this.btnCmdSave.setText("Device saves parameters on command");
        this.btnCmdSave.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

        this.btnNoSave = new Button(grpStorageParameters, SWT.RADIO);
        this.btnNoSave.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                StoreParamComposite.this.setDefaultValue(0);
            }
        });
        this.btnNoSave.setBounds(10, 64, 224, 16);
        this.btnNoSave.setText("Device does not support saves");
        this.btnNoSave.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

        this.lblError = new Label(this, SWT.NONE);
        this.lblError.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
        this.lblError.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
        this.lblError.setBounds(20, 95, 260, 15);
        this.lblError.setText("Error! The default value seems to be incorrect");
    }

    /**
     * @brief sets/calculates the new Default Value for the subobject
     * @param settedValue
     *            is generated from the selected radio-button
     */
    public void setDefaultValue(int settedValue) {
        this.lblError.setVisible(false);
        this.subobjectItemProvider.setPropertyValue(
            this.subobject, "defaultValue",
            ("0x" + String.format(String.format("%08x", settedValue))));
        this.lblsubObjectDefaultValue.setText(this.subobject.getDefaultValue());

    }

    /**
     * @brief sets the SubObject for the Composite
     * @param subobjecttype
     *            the subobject of the input
     * @param provider
     *            ItemProvider of subobject to set default value
     * @param lblDefaultValue
     *            the label displaying the actual defaultvalue in the
     *            PropertySection
     * @return
     */
    public void setSubObject(final SubObjectType subobjecttype,
        final SubObjectTypeItemProvider provider,
        final CLabel lblDefaultValue) {
        this.subobject = subobjecttype;
        this.lblError.setVisible(false);
        this.subobjectItemProvider = provider;
        this.lblsubObjectDefaultValue = lblDefaultValue;
        int setting;
        if (this.subobject.getDefaultValue() != null
            && !this.subobject.getDefaultValue().contentEquals("")) {
            setting = Integer.decode(this.subobject.getDefaultValue()); //Get 2 LSB
            this.lblsubObjectDefaultValue.setText(this.subobject.getDefaultValue());
        } else
            setting = 0;

        switch (setting) {
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
    }

    @Override
    protected void checkSubclass() {
        // Disable the check that prevents subclassing of SWT components
    }
}
