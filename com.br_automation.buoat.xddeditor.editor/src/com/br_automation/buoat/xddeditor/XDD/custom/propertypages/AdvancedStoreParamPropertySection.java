/**
 * @since 25.3.2013
 * @author Joris Lückenga, Bernecker + Rainer Industrie Elektronik Ges.m.b.H.
 */

package com.br_automation.buoat.xddeditor.XDD.custom.propertypages;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.wb.swt.SWTResourceManager;

import com.br_automation.buoat.xddeditor.XDD.SubObjectType;
import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.custom.Messages;
import com.br_automation.buoat.xddeditor.XDD.custom.XDDUtilities;
import com.br_automation.buoat.xddeditor.XDD.provider.SubObjectTypeItemProvider;

/**
 * @brief PropertySection for Store-Parameter SubObjectTypes.
 *
 *        This section only applies for subobjects of object 0x1010.Shows
 *        different radio-buttons to set parameters and calculates the default
 *        value based on the selection. Uses "StoreParamComposite".
 *
 * @author Joris Lückenga
 */
public class AdvancedStoreParamPropertySection extends AbstractPropertySection {

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
        private CLabel lblsubObjectDefaultValue;
        private SubObjectType subobject;
        private SubObjectTypeItemProvider subobjectItemProvider;

        /**
         * @brief Constructs the StoreParam-Composite
         * @param parent
         *            See Composite#Composite(Composite, int)
         * @param style
         *            See Composite#Composite(Composite, int)
         */
        public StoreParamComposite(Composite parent,
            int style) {
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

        //Not used
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
            AdvancedStoreParamPropertySection.this.lblDefaultvalValue.setForeground(XDDUtilities
                .getBlack(Display.getCurrent()));
            this.lblError.setVisible(false);
            this.subobjectItemProvider.setPropertyValue(this.subobject, "defaultValue", //$NON-NLS-1$
                ("0x" + String.format(String.format("%08x", settedValue)))); //$NON-NLS-1$ //$NON-NLS-2$
            this.lblsubObjectDefaultValue.setText(this.subobject.getDefaultValue());
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
        private void setSubObject(final SubObjectType subobjecttype,
            final SubObjectTypeItemProvider provider,
            final CLabel lblDefaultValue) {
            this.subobject = subobjecttype;
            this.lblError.setVisible(false);
            this.subobjectItemProvider = provider;
            this.lblsubObjectDefaultValue = lblDefaultValue;
            int storageType;
            try {
                if (this.subobject.getDefaultValue() != null
                    && !this.subobject.getDefaultValue().isEmpty()) {

                    storageType = Integer.decode(this.subobject.getDefaultValue()); //Get 2 LSB
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

    private AdapterFactory adapterFactory;

    private CLabel lblDefaultvalValue;
    private CLabel lblIndexValue;
    private StoreParamComposite storeparam;
    private SubObjectTypeItemProvider subObjectItemProvider;
    private TObjectComposite tObjectComposite;

    @Override
    public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
        super.createControls(parent, aTabbedPropertySheetPage);

        Composite composite = this.getWidgetFactory().createFlatFormComposite(parent);
        this.subObjectItemProvider = new SubObjectTypeItemProvider(this.getAdapterFactory());
        FormData data;

        //Index Label (from Parent!)
        CLabel lblIndex = this.getWidgetFactory().createCLabel(composite, "Index:"); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(0, -5);
        data.left = new FormAttachment(0, 10);
        lblIndex.setLayoutData(data);

        //Index Value (from Parent!)
        this.lblIndexValue = this.getWidgetFactory().createCLabel(composite, "       "); //$NON-NLS-1$
        data = new FormData();
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH + 20);
        data.right = new FormAttachment(80, 0);
        data.top = new FormAttachment(0, -5);
        this.lblIndexValue.setLayoutData(data);
        this.lblIndexValue.setText("1010 (NTM_StoreParam)"); //$NON-NLS-1$

        //lblDefaultValueValue Label (Actual value)
        this.lblDefaultvalValue = this.getWidgetFactory().createCLabel(
            composite, Messages.advancedMappingObjectPropertySection_No_Value_Set);
        data = new FormData();
        data.top = new FormAttachment(this.lblIndexValue, -5);
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH + 20);
        data.right = new FormAttachment(80, 0);
        this.lblDefaultvalValue.setLayoutData(data);

        //lblDefaultvalue
        CLabel lblDefaultValue = this.getWidgetFactory().createCLabel(
            composite, Messages.advancedMappingObjectPropertySection_lbl_Default_Value);
        data = new FormData();
        data.top = new FormAttachment(lblIndex, -5);
        data.left = new FormAttachment(0, 10);
        lblDefaultValue.setLayoutData(data);

        //TObjectComposite
        this.tObjectComposite = new TObjectComposite(composite, 0, this.getAdapterFactory());
        data = new FormData();
        data.top = new FormAttachment(lblDefaultValue, 0);
        this.tObjectComposite.setLayoutData(data);

        this.storeparam = new StoreParamComposite(composite, 0);
        data = new FormData();
        data.top = new FormAttachment(this.tObjectComposite, 0);
        this.storeparam.setLayoutData(data);
    } //createControls

    /**
     * @return AdapterFactory for ItemProviders.
     * */
    public AdapterFactory getAdapterFactory() {
        if (this.adapterFactory == null)
            this.adapterFactory = EEFRuntimePlugin.getDefault().getAdapterFactory();
        return this.adapterFactory;
    }

    /**
     * @see AbstractPropertySection#setInput(IWorkbenchPart, ISelection)
     */
    @Override
    public void setInput(IWorkbenchPart part, ISelection selection) {
        SubObjectType subObject;
        TObject tobject;
        super.setInput(part, selection);
        Object input = ((IStructuredSelection) selection).getFirstElement();
        subObject = (SubObjectType) input;
        tobject = (TObject) subObject.eContainer();
        if(tObjectComposite != null) {
        this.tObjectComposite.setObject(subObject);
        }
        if(lblIndexValue != null) {
        this.lblIndexValue.setText("0x1010 (" + tobject.getName() + ")"); //$NON-NLS-1$
        }
        this.storeparam
            .setSubObject(subObject, this.subObjectItemProvider, this.lblDefaultvalValue);
    }

} //AdvancedStoreParamPropertySection
