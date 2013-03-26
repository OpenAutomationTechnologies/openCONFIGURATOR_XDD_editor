package com.br_automation.buoat.xddeditor.XDD.custom;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import com.br_automation.buoat.xddeditor.XDD.SubObjectType;
import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.provider.SubObjectTypeItemProvider;

/**
 * @author Joris Lückenga
 * @since 25.3.2013
 * @brief PropertySection for Store-Parameter Object
 */
public class AdvancedStoreParamPropertySection extends AbstractPropertySection {

    private AdapterFactory adapterFactory;
    private CLabel lblDefaultvalValue;

    private CLabel lblIndexValue;
    private TObjectComposite mandatory;
    private StoreParamComposite storeparam;

    private SubObjectTypeItemProvider subObjectItemProvider;

    @Override
    public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
        super.createControls(parent, aTabbedPropertySheetPage);

        Composite composite = this.getWidgetFactory().createFlatFormComposite(parent);
        FormData data;
        this.subObjectItemProvider = new SubObjectTypeItemProvider(this.getAdapterFactory());

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
        this.lblIndexValue.setText("1010 (NTM_StoreParam)");

        //lblDefaultValueValue Label (Actual value)
        this.lblDefaultvalValue = this.getWidgetFactory().createCLabel(
            composite, Messages.AdvancedMappingObjectPropertySection_No_Value_Set);
        data = new FormData();
        data.top = new FormAttachment(this.lblIndexValue, -5);
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH + 20);
        data.right = new FormAttachment(80, 0);
        this.lblDefaultvalValue.setLayoutData(data);

        //lblDefaultvalue
        CLabel lblDefaultValue = this.getWidgetFactory().createCLabel(
            composite, Messages.AdvancedMappingObjectPropertySection_lbl_Default_Value);
        data = new FormData();
        data.top = new FormAttachment(lblIndex, -5);
        data.left = new FormAttachment(0, 10);
        lblDefaultValue.setLayoutData(data);

        this.mandatory = new TObjectComposite(composite, 0, this.getAdapterFactory());
        data = new FormData();
        data.top = new FormAttachment(lblDefaultValue, 0);
        this.mandatory.setLayoutData(data);

        this.storeparam = new StoreParamComposite(composite, 0);
        data = new FormData();
        data.top = new FormAttachment(this.mandatory, 0);
        this.storeparam.setLayoutData(data);

    } //createControls

    /**
     * @brief Gets the current AdapterFactory, used to get ItemProviders
     * @return AdapterFactory for ItemProviders
     * */
    public AdapterFactory getAdapterFactory() {
        if (this.adapterFactory == null)
            this.adapterFactory = EEFRuntimePlugin.getDefault().getAdapterFactory();
        return this.adapterFactory;
    }

    @Override
    public void setInput(IWorkbenchPart part, ISelection selection) {
        SubObjectType subObject;
        TObject tobject;
        super.setInput(part, selection);
        Object input = ((IStructuredSelection) selection).getFirstElement();
        subObject = (SubObjectType) input;
        tobject = (TObject) subObject.eContainer();
        this.mandatory.setObject(subObject);
        this.lblIndexValue.setText("0x1010 (" + tobject.getName() + ")");
        this.storeparam
            .setSubObject(subObject, this.subObjectItemProvider, this.lblDefaultvalValue);

    }

} //AdvancedStoreParamPropertySection
