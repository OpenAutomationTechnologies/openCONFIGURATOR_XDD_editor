/**
 * @since 21.3.2013
 * @author Joris Lückenga, Bernecker + Rainer Industrie Elektronik Ges.m.b.H.
 */

package com.br_automation.buoat.xddeditor.XDD.custom.propertypages;

import java.util.Arrays;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
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
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.custom.CiADeviceProfile;
import com.br_automation.buoat.xddeditor.XDD.custom.Messages;
import com.br_automation.buoat.xddeditor.XDD.custom.XDDUtilities;
import com.br_automation.buoat.xddeditor.XDD.custom.XDDUtilities.RegexVerifyListener;
import com.br_automation.buoat.xddeditor.XDD.provider.TObjectItemProvider;

/**
 * @brief PropertySection for DeviceType Object with index 0x1000.
 * 
 *        Contains different controls for the DeviceType object like a combo-box
 *        with several DeviceProfiles and an additional-info textbox. Generates
 *        default values for the user.
 * 
 * @author Joris Lückenga
 * */
public class AdvancedDeviceTypePropertySection extends AbstractPropertySection {

    private AdapterFactory adapterFactory;

    private final FocusAdapter additionalInfoFocuslistener = new FocusAdapter() {

        @Override
        public void focusLost(FocusEvent arg0) {
            AdvancedDeviceTypePropertySection.this.additionalInfoValue = (Long.decode("0x" //$NON-NLS-1$
                + AdvancedDeviceTypePropertySection.this.txtAdditionalInfo.getText())) << 16;
            AdvancedDeviceTypePropertySection.this.setDefaultValue();
        }
    };

    private RegexVerifyListener additionalInfoListener = new RegexVerifyListener(
        RegexVerifyListener.PATTERN_HEX, Arrays.asList(
            Character.valueOf((char) 0x7f), Character.valueOf((char) 0x8)), true);

    private long additionalInfoValue;
    private CCombo cmbDeviceProfileNr;
    private CLabel lblDefaultValueValue;
    private CLabel lblError;
    private long maskLSB;
    private long maskMSB;
    private ModifyListener profileListener = new ModifyListener() {
        @Override
        public void modifyText(ModifyEvent e) {
            AdvancedDeviceTypePropertySection.this.lblError.setText(""); //$NON-NLS-1$
            if (!AdvancedDeviceTypePropertySection.this.cmbDeviceProfileNr.getText().isEmpty())
                AdvancedDeviceTypePropertySection.this.profileValue = Long
                    .parseLong(AdvancedDeviceTypePropertySection.this.cmbDeviceProfileNr.getText()
                        .substring(4, 7));
            AdvancedDeviceTypePropertySection.this.setDefaultValue();
        }
    };
    private long profileValue;
    private TObject tobject;
    private TObjectComposite tObjectComposite;
    private TObjectItemProvider tObjectProvider;
    private Text txtAdditionalInfo;

    @Override
    public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
        super.createControls(parent, aTabbedPropertySheetPage);

        Composite composite = super.getWidgetFactory().createFlatFormComposite(parent);
        FormData data;
        this.tObjectProvider = new TObjectItemProvider(this.getAdapterFactory());
        this.maskLSB = 0xFFFF;
        this.maskMSB = 0xFFFF0000; //$NON-NLS-1$

        this.tObjectComposite = new TObjectComposite(composite, 0, this.getAdapterFactory());
        data = new FormData();
        data.top = new FormAttachment(0, 0);
        this.tObjectComposite.setLayoutData(data);

        //lblDefaultValueValue Label
        this.lblDefaultValueValue = this.getWidgetFactory().createCLabel(composite, ""); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(this.tObjectComposite, 0);
        this.lblDefaultValueValue.setLayoutData(data);
        data.right = new FormAttachment(90, 0);
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH + 10);

        CLabel lblDefaultValue = this.getWidgetFactory().createCLabel(composite, "Default Value:"); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(this.tObjectComposite, 0);
        data.left = new FormAttachment(0, 7);
        lblDefaultValue.setLayoutData(data);

        CLabel lblProfileType = this.getWidgetFactory().createCLabel(composite, "Profile Type:"); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(lblDefaultValue, 0);
        data.left = new FormAttachment(0, 7);
        lblProfileType.setLayoutData(data);

        CLabel lblAdditionalInfo = this.getWidgetFactory().createCLabel(
            composite, "Additional Info:"); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(lblProfileType, 0);
        data.left = new FormAttachment(0, 7);
        lblAdditionalInfo.setLayoutData(data);

        this.lblError = this.getWidgetFactory().createCLabel(
            composite, "                                                  "); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(lblAdditionalInfo, 0);
        this.lblError.setLayoutData(data);

        //----Combobox

        this.cmbDeviceProfileNr = this.getWidgetFactory().createCCombo(composite);
        data = new FormData();
        for (CiADeviceProfile profile : CiADeviceProfile.values()) {
            String profileText = profile.getProfileName() + " - " + profile.getProfileDescription(); //$NON-NLS-1$
            this.cmbDeviceProfileNr.add(profileText);
            this.cmbDeviceProfileNr.setData(Integer.toString(profile.getValue()), profileText);
        }
        data.top = new FormAttachment(this.lblDefaultValueValue, 0);
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH + 10);
        data.right = new FormAttachment(40, 0);
        this.cmbDeviceProfileNr.setLayoutData(data);
        this.cmbDeviceProfileNr.addModifyListener(this.profileListener);

        this.txtAdditionalInfo = this.getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(this.cmbDeviceProfileNr, 5);
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH + 10);
        data.right = new FormAttachment(15, 0);
        this.txtAdditionalInfo.setLayoutData(data);
        this.txtAdditionalInfo.setTextLimit(4);
        this.txtAdditionalInfo.addFocusListener(this.additionalInfoFocuslistener);

        CLabel hex = this.getWidgetFactory().createCLabel(composite, "h"); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(this.cmbDeviceProfileNr, 5);
        data.left = new FormAttachment(this.txtAdditionalInfo, -5);
        hex.setLayoutData(data);

    } //createControls

    /**
     * @return The default AdapterFactory.
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
        super.setInput(part, selection);
        Object input = ((IStructuredSelection) selection).getFirstElement();
        this.tobject = (TObject) input;
        this.lblError.setText(""); //$NON-NLS-1$

        this.tObjectComposite.setObject(this.tobject);

        if (this.tobject.getDefaultValue() != null && this.tobject.getDefaultValue().length() > 0) {
            try {
                this.lblDefaultValueValue.setText(this.tobject.getDefaultValue());
                this.profileValue = Long.decode(this.tobject.getDefaultValue()) & this.maskLSB; //get 16 LSB
                this.additionalInfoValue = Long.decode(this.tobject.getDefaultValue())
                    & this.maskMSB;

                this.txtAdditionalInfo.setText(String.format("%04x", this.additionalInfoValue) //$NON-NLS-1$
                    .toUpperCase());
                this.txtAdditionalInfo.addVerifyListener(this.additionalInfoListener);

                String selectedProfileString = null;
                selectedProfileString = (String) this.cmbDeviceProfileNr.getData(Long
                    .toString(this.profileValue));
                if (selectedProfileString != null) {
                    this.cmbDeviceProfileNr.select(this.cmbDeviceProfileNr
                        .indexOf(selectedProfileString));
                    this.lblError.setText(""); //$NON-NLS-1$
                } else if (this.profileValue != 0) {
                    this.cmbDeviceProfileNr.setText(""); //$NON-NLS-1$
                    this.lblError
                        .setText(Messages.advancedDeviceTypePropertySection_CiA_Profile_not_found);
                    this.lblError.setForeground(XDDUtilities.getRed(Display.getCurrent()));
                }

            } catch (NumberFormatException e) {
                this.lblError
                    .setText(Messages.general_error_defaultValueInvalid);
                this.lblError.setForeground(XDDUtilities.getRed(Display.getCurrent()));
            }
        }
    } //setInput

    /**
     * @brief Sets the new Defaultvalue to the Object based on made selections.
     * */
    private void setDefaultValue() {
        Long newDefaultValue = (this.additionalInfoValue) + this.profileValue;
        this.tObjectProvider.setPropertyValue(this.tobject, "defaultValue", "0x" //$NON-NLS-1$ //$NON-NLS-2$
            + String.format("%08x", newDefaultValue).toUpperCase()); //$NON-NLS-1$
        this.lblDefaultValueValue.setText(this.tobject.getDefaultValue());
    }

} //AdvancedDeviceTypePropertySection
