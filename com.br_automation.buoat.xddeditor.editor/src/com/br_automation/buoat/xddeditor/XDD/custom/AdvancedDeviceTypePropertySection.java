package com.br_automation.buoat.xddeditor.XDD.custom;

import java.math.BigInteger;
import java.util.Arrays;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.custom.XDDUtilities.RegexVerifyListener;
import com.br_automation.buoat.xddeditor.XDD.provider.TObjectItemProvider;

public class AdvancedDeviceTypePropertySection extends AbstractPropertySection {

    RegexVerifyListener additionalInfoListener = new RegexVerifyListener(
        RegexVerifyListener.PATTERN_HEX, Arrays.asList(
            Character.valueOf((char) 0x7f), Character.valueOf((char) 0x8)), true);

    ModifyListener profileListener = new ModifyListener() {
        @Override
        public void modifyText(ModifyEvent e) {
            AdvancedDeviceTypePropertySection.this.lblError.setText("");
            AdvancedDeviceTypePropertySection.this.profileValue = Long
                .parseLong(AdvancedDeviceTypePropertySection.this.combDeviceProfileNr.getText()
                    .substring(4, 7));
            AdvancedDeviceTypePropertySection.this.setDefaultValue();
        }
    };

    long profileValue;

    private AdapterFactory adapterFactory;
    private final FocusAdapter additionalInfoFocuslistener = new FocusAdapter() {

        @Override
        public void focusLost(FocusEvent arg0) {
            AdvancedDeviceTypePropertySection.this.additionalInfoValue = (Long.decode("0x"
                + AdvancedDeviceTypePropertySection.this.txtAdditionalInfo.getText())) << 16;
            AdvancedDeviceTypePropertySection.this.setDefaultValue();
        }
    };
    private long additionalInfoValue;
    private CCombo combDeviceProfileNr;

    private CLabel lblDefaultValueValue;
    private CLabel lblError;

    private CLabel lblIndexValue;

    private CLabel lblNameValue;
    private long maskLSB;

    private long maskMSB;
    private TObject tobject;
    private TObjectItemProvider tObjectProvider;

    private Text txtAdditionalInfo;

    public AdvancedDeviceTypePropertySection() {
    }

    @Override
    public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
        super.createControls(parent, aTabbedPropertySheetPage);

        Composite composite = super.getWidgetFactory().createFlatFormComposite(parent);
        FormData data;
        this.tObjectProvider = new TObjectItemProvider(this.getAdapterFactory());
        this.maskLSB = 65535;
        this.maskMSB = Long.parseLong("4294901760");

        //STANDARD LABEL:
        this.lblNameValue = this.getWidgetFactory().createCLabel(
            composite, "                      no Value set                      "); //$NON-NLS-1$

        data = new FormData();
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH); //Left(
        data.right = new FormAttachment(80, 0);
        data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);
        this.lblNameValue.setLayoutData(data);

        //Name Label
        CLabel lblName = this.getWidgetFactory().createCLabel(composite, "Name:"); //$NON-NLS-1$
        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(this.lblNameValue, 2);
        data.top = new FormAttachment(this.lblNameValue, 0, SWT.CENTER);
        lblName.setLayoutData(data);

        //Index Label
        CLabel lblIndex = this.getWidgetFactory().createCLabel(composite, "Index:"); //$NON-NLS-1$
        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(this.lblNameValue, 2);
        data.top = new FormAttachment(lblName, -5);
        lblIndex.setLayoutData(data);

        //Index Value
        this.lblIndexValue = this.getWidgetFactory().createCLabel(composite, "    "); //$NON-NLS-1$
        data = new FormData();
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(80, 0);
        data.top = new FormAttachment(this.lblNameValue, -5);
        this.lblIndexValue.setLayoutData(data);

        //lblDefaultValueValue Label
        this.lblDefaultValueValue = this.getWidgetFactory().createCLabel(composite, ""); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(this.lblIndexValue, -5);
        this.lblDefaultValueValue.setLayoutData(data);
        data.right = new FormAttachment(80, 0);
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH);

        CLabel lblDefaultValue = this.getWidgetFactory().createCLabel(composite, "Default Value:"); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(lblIndex, -5);
        lblDefaultValue.setLayoutData(data);

        CLabel lblProfileType = this.getWidgetFactory().createCLabel(composite, "Profile Type:");
        data = new FormData();
        data.top = new FormAttachment(lblDefaultValue, 0);
        lblProfileType.setLayoutData(data);

        CLabel lblAdditionalInfo = this.getWidgetFactory().createCLabel(
            composite, "Additional Info:");
        data = new FormData();
        data.top = new FormAttachment(lblProfileType, 0);
        lblAdditionalInfo.setLayoutData(data);

        this.lblError = this.getWidgetFactory().createCLabel(
            composite, "                                                  ");
        data = new FormData();
        data.top = new FormAttachment(lblAdditionalInfo, 0);
        this.lblError.setLayoutData(data);

        //----Combobox

        this.combDeviceProfileNr = this.getWidgetFactory().createCCombo(composite);
        data = new FormData();
        for (CiADeviceProfile profile : CiADeviceProfile.values())
            this.combDeviceProfileNr.add(profile.getProfileName() + " - "
                + profile.getProfileDescription());
        data.top = new FormAttachment(this.lblDefaultValueValue, 0);
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(40, 0);
        this.combDeviceProfileNr.setLayoutData(data);
        this.combDeviceProfileNr.addModifyListener(this.profileListener);

        this.txtAdditionalInfo = this.getWidgetFactory().createText(composite, "");
        data = new FormData();
        data.top = new FormAttachment(this.combDeviceProfileNr, 5);
        data.left = new FormAttachment(0, 110);
        data.right = new FormAttachment(15, 0);
        this.txtAdditionalInfo.setLayoutData(data);
        this.txtAdditionalInfo.setTextLimit(4);
        this.txtAdditionalInfo.addFocusListener(this.additionalInfoFocuslistener);

        CLabel hex = this.getWidgetFactory().createCLabel(composite, "h");
        data = new FormData();
        data.top = new FormAttachment(this.combDeviceProfileNr, 5);
        data.left = new FormAttachment(this.txtAdditionalInfo, -5);
        hex.setLayoutData(data);

    }//createControls

    //Taken from EEFAdvancedPropertySection
    public AdapterFactory getAdapterFactory() {
        if (this.adapterFactory == null)
            this.adapterFactory = EEFRuntimePlugin.getDefault().getAdapterFactory();
        return this.adapterFactory;
    }

    //Taken from EEFAdvancedPropertySection
    public IPropertySource getPropertySource(Object object) {
        if (this.getAdapterFactory() != null) {
            IItemPropertySource item = (IItemPropertySource) this.getAdapterFactory().adapt(
                object, IItemPropertySource.class);
            if (item != null)
                return new PropertySource(object, item);
        }
        return null;
    };

    @Override
    public void setInput(IWorkbenchPart part, ISelection selection) {

        super.setInput(part, selection);
        Object input = ((IStructuredSelection) selection).getFirstElement();
        this.tobject = (TObject) input;
        this.lblError.setText("");

        this.lblNameValue.setText(new String(this.tobject.getName()));
        String result = new BigInteger(1, this.tobject.getIndex()).toString(16);
        this.lblIndexValue.setText(result.toUpperCase());
        this.lblDefaultValueValue.setText(this.tobject.getDefaultValue());

        this.profileValue = Long.decode(this.tobject.getDefaultValue()) & this.maskLSB; //get 16 LSB
        this.additionalInfoValue = Long.decode(this.tobject.getDefaultValue()) & this.maskMSB; // get 16 MSB

        this.txtAdditionalInfo.setText(String.format("%04x", this.additionalInfoValue)
            .toUpperCase());
        this.txtAdditionalInfo.addVerifyListener(this.additionalInfoListener);

        int i = 0;
        for (String profile : this.combDeviceProfileNr.getItems()) {
            if (profile.contains(Long.toString(this.profileValue))) {
                this.combDeviceProfileNr.select(i);
                this.lblError.setText("");
                break;
            } else {
                i++;
                this.lblError.setText("Error: specified CiA Profile not found!");
                this.lblError.setForeground(XDDUtilities.getRed(Display.getCurrent()));
            }

        }

    }//setInput

    private void setDefaultValue() {
        Long newDefaultValue = (this.additionalInfoValue) + this.profileValue;
        this.tObjectProvider.setPropertyValue(
            this.tobject, "defaultValue", "0x"
                + String.format("%08x", newDefaultValue).toUpperCase());
        this.lblDefaultValueValue.setText(this.tobject.getDefaultValue());

    }
}//AdvancedDeviceTypePropertySection
