/**
 * @since 21.3.2013
 * @author Joris Lückenga, Bernecker + Rainer Industrie Elektronik Ges.m.b.H.
 */

package com.br_automation.buoat.xddeditor.XDD.custom.propertypages;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.custom.Messages;
import com.br_automation.buoat.xddeditor.XDD.custom.XDDUtilities;
import com.br_automation.buoat.xddeditor.XDD.impl.TObjectImpl;
import com.br_automation.buoat.xddeditor.XDD.provider.TObjectItemProvider;

/**
 * @brief FeatureFlags-Section for Object index 0x1F82.
 * 
 *        Contains different checkbox-buttons for the FeatureFlags object.
 *        Generates default value for the user based on selection.
 * 
 * @author Joris Lückenga
 * */
public class AdvancedFeatureFlagsPropertySection extends AbstractPropertySection {

    private AdapterFactory adapterFactory;
    private Button btnMultiplexedAccess;
    private final Map<Button, Integer> buttonMap = new HashMap<Button, Integer>();
    private CLabel lblDefaultValueValue;
    private CLabel lblError;

    //Set the correct Bits if a Button is selected (with MultiplexFeature-Check)
    private final SelectionListener selectionListener = new SelectionAdapter() {

        @Override
        public void widgetSelected(SelectionEvent e) {
            try {
                long currentValue = Long.decode(AdvancedFeatureFlagsPropertySection.this.tobject
                    .getDefaultValue());
                if ((currentValue & (1 << 17)) != 0 || currentValue >= 0x80000)
                    throw new NumberFormatException(); //Throw format exception if wrong bit is set or too long!

                //CHECK FOR INVALID BITS!
            } catch (NumberFormatException e2) {
                // Generate a valid default-value by using selected checkboxes, 
                //if user had entered an invalid value but wants to continue...
                AdvancedFeatureFlagsPropertySection.this.tobject.setDefaultValue("0"); //$NON-NLS-1$
                Set<Entry<Button, Integer>> buttonSet = AdvancedFeatureFlagsPropertySection.this.buttonMap
                    .entrySet();

                long newDefaultValue = 0;
                for (Entry<Button, Integer> entry : buttonSet) {
                    int bitOffset = entry.getValue();
                    if (entry.getKey().getSelection()) {
                        newDefaultValue = newDefaultValue | (1 << bitOffset);
                    } else
                        newDefaultValue = newDefaultValue & ~(1 << bitOffset);
                }
                AdvancedFeatureFlagsPropertySection.this.tobject.setDefaultValue("0x" //$NON-NLS-1$
                    + Long.toHexString(newDefaultValue));
            }
            AdvancedFeatureFlagsPropertySection.this.lblError.setText(""); //$NON-NLS-1$
            Button currentButton = (Button) e.getSource();
            int bitOffset = AdvancedFeatureFlagsPropertySection.this.buttonMap.get(currentButton);
            XDDUtilities.setFeatureFlag(
                currentButton.getSelection(), bitOffset, (DocumentRoot) EcoreUtil
                    .getRootContainer(AdvancedFeatureFlagsPropertySection.this.tobject));
            AdvancedFeatureFlagsPropertySection.this.lblDefaultValueValue
                .setText(AdvancedFeatureFlagsPropertySection.this.tobject.getDefaultValue());
        }
    }; //SelectionListener

    private TObject tobject;
    private TObjectComposite tobjectComposite;
    private TObjectItemProvider tObjectProvider;

    //Creates the Checkbox-Buttons and Labels as well as selection listeners for each box
    @Override
    public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {

        super.createControls(parent, aTabbedPropertySheetPage);
        Composite composite = super.getWidgetFactory().createFlatFormComposite(parent);
        this.tObjectProvider = new TObjectItemProvider(this.getAdapterFactory());
        FormData data;
        //Standard-Label--------------------------------------

        //TobjectComposite
        this.tobjectComposite = new TObjectComposite(composite, 0, this.getAdapterFactory());
        data = new FormData();
        data.top = new FormAttachment(0, 0);
        this.tobjectComposite.setLayoutData(data);

        //lblDefaultValue Label
        this.lblDefaultValueValue = this.getWidgetFactory().createCLabel(
            composite, "      Not found!     "); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(this.tobjectComposite, -5);
        this.lblDefaultValueValue.setLayoutData(data);
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(0, 200);

        CLabel lblDefaultValue = this.getWidgetFactory().createCLabel(composite, "Default Value:"); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(this.tobjectComposite, -5);
        lblDefaultValue.setLayoutData(data);

        //optionalFlags Label
        CLabel lbloptionalFlags = this.getWidgetFactory().createCLabel(
            composite, "Optional Feature Flags:"); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(this.lblDefaultValueValue, 0);
        lbloptionalFlags.setLayoutData(data);

        //Checkbox-Buttons -------------------------------------------

        //Isonchronus
        Button btnIsochronous = this.getWidgetFactory().createButton(
            composite, "Isonchronus Mode", SWT.CHECK); //$NON-NLS-1$
        btnIsochronous
            .setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnIsochronous_tooltip);
        data = new FormData();
        data.top = new FormAttachment(lbloptionalFlags, 0);
        btnIsochronous.setLayoutData(data);
        btnIsochronous.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnIsochronous, 0);

        //btnSDObyUDPIP
        Button btnSDObyUDPIP = this.getWidgetFactory().createButton(
            composite, "SDO by UDP/IP", Integer.valueOf(SWT.CHECK)); //$NON-NLS-1$
        btnSDObyUDPIP
            .setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnSDObyUDPIP_tooltip);
        data = new FormData();
        data.top = new FormAttachment(btnIsochronous, -5);
        btnSDObyUDPIP.setLayoutData(data);
        btnSDObyUDPIP.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnSDObyUDPIP, Integer.valueOf(1));

        //btnSDObyASnd
        Button btnSDObyASnd = this.getWidgetFactory().createButton(
            composite, "SDO by ASnd", Integer.valueOf(SWT.CHECK)); //$NON-NLS-1$
        btnSDObyASnd
            .setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnSDObyASnd_tooltip);
        data = new FormData();
        data.top = new FormAttachment(btnSDObyUDPIP, -5);
        btnSDObyASnd.setLayoutData(data);
        btnSDObyASnd.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnSDObyASnd, Integer.valueOf(2));

        //btnSDObyPDO
        Button btnSDObyPDO = this.getWidgetFactory().createButton(
            composite, "SDO by PDO", SWT.CHECK); //$NON-NLS-1$
        btnSDObyPDO
            .setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnSDObyPDO_tooltip);
        data = new FormData();
        data.top = new FormAttachment(btnSDObyASnd, -5);
        btnSDObyPDO.setLayoutData(data);
        btnSDObyPDO.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnSDObyPDO, Integer.valueOf(3));

        //btnNMTInfoServices
        Button btnNMTInfoServices = this.getWidgetFactory().createButton(
            composite, "NMT Info Services", SWT.CHECK); //$NON-NLS-1$
        btnNMTInfoServices
            .setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnNMTInfoServices_tooltip);
        data = new FormData();
        data.top = new FormAttachment(btnSDObyPDO, -5);
        btnNMTInfoServices.setLayoutData(data);
        btnNMTInfoServices.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnNMTInfoServices, Integer.valueOf(4));

        //btnExtendedNMTStateCommands
        Button btnExtendedNMTStateCommands = this.getWidgetFactory().createButton(
            composite, "Extended NMT State Commands", SWT.CHECK); //$NON-NLS-1$
        btnExtendedNMTStateCommands
            .setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnExtendedNMTStateCommands_tooltip);
        data = new FormData();
        data.top = new FormAttachment(btnNMTInfoServices, -5);
        btnExtendedNMTStateCommands.setLayoutData(data);
        btnExtendedNMTStateCommands.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnExtendedNMTStateCommands, Integer.valueOf(5));

        //btnDynamicPDOMapping
        Button btnDynamicPDOMapping = this.getWidgetFactory().createButton(
            composite, "Dynamic PDO mapping", SWT.CHECK); //$NON-NLS-1$
        btnDynamicPDOMapping
            .setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnDynamicPDOMapping_tooltip);
        data = new FormData();
        data.top = new FormAttachment(btnExtendedNMTStateCommands, -5);
        btnDynamicPDOMapping.setLayoutData(data);
        btnDynamicPDOMapping.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnDynamicPDOMapping, Integer.valueOf(6));

        //btnNMTServicebyUDPIP
        Button btnNMTServicebyUDPIP = this.getWidgetFactory().createButton(
            composite, "NMT Service by UDP/IP", SWT.CHECK); //$NON-NLS-1$
        btnNMTServicebyUDPIP
            .setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnNMTServicebyUDPIP_tooltip);
        data = new FormData();
        data.top = new FormAttachment(btnDynamicPDOMapping, -5);
        btnNMTServicebyUDPIP.setLayoutData(data);
        btnNMTServicebyUDPIP.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnNMTServicebyUDPIP, Integer.valueOf(7));

        Button btnMultipleASnd = this.getWidgetFactory().createButton(
            composite, "Multi-ASnd Support", SWT.CHECK); //$NON-NLS-1$
        btnMultipleASnd
            .setToolTipText(Messages.advancedFeatureFlagsPropertySection_tooltip_multipleASnd);
        data = new FormData();
        data.top = new FormAttachment(btnNMTServicebyUDPIP, -5);
        btnMultipleASnd.setLayoutData(data);
        btnMultipleASnd.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnMultipleASnd, Integer.valueOf(16));

        //--------------------------NEXT SECTION

        //btnConfigurationManager
        Button btnConfigurationManager = this.getWidgetFactory().createButton(
            composite, "Configuration Manager functions", SWT.CHECK); //$NON-NLS-1$
        btnConfigurationManager
            .setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnConfigurationManager_tooltip);
        data = new FormData();
        data.top = new FormAttachment(lbloptionalFlags, 0);
        data.left = new FormAttachment(btnIsochronous, 80);
        btnConfigurationManager.setLayoutData(data);
        btnConfigurationManager.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnConfigurationManager, Integer.valueOf(8));

        //btnMultiplexedAccess
        this.btnMultiplexedAccess = this.getWidgetFactory().createButton(
            composite, "Multiplexed  Access", SWT.CHECK); //$NON-NLS-1$
        this.btnMultiplexedAccess
            .setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnMultiplexedAccess_tooltip);
        data = new FormData();
        data.top = new FormAttachment(btnConfigurationManager, -5);
        data.left = new FormAttachment(btnIsochronous, 80);
        this.btnMultiplexedAccess.setLayoutData(data);
        this.btnMultiplexedAccess.addSelectionListener(this.selectionListener);
        this.buttonMap.put(this.btnMultiplexedAccess, Integer.valueOf(9));

        //btnNodeIDsetupbySW
        Button btnNodeIDsetupbySW = this.getWidgetFactory().createButton(
            composite, "NodeID setup by SW", SWT.CHECK); //$NON-NLS-1$
        btnNodeIDsetupbySW
            .setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnNodeIDsetupbySW_tooltip);
        data = new FormData();
        data.top = new FormAttachment(this.btnMultiplexedAccess, -5);
        data.left = new FormAttachment(btnIsochronous, 80);
        btnNodeIDsetupbySW.setLayoutData(data);
        btnNodeIDsetupbySW.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnNodeIDsetupbySW, Integer.valueOf(10));

        //btnMNBasicEthernetMode
        Button btnMNBasicEthernetMode = this.getWidgetFactory().createButton(
            composite, "MN Basic Ethernet Mode", SWT.CHECK); //$NON-NLS-1$
        btnMNBasicEthernetMode
            .setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnMNBasicEthernetMode_tooltip);
        data = new FormData();
        data.top = new FormAttachment(btnNodeIDsetupbySW, -5);
        data.left = new FormAttachment(btnIsochronous, 80);
        btnMNBasicEthernetMode.setLayoutData(data);
        btnMNBasicEthernetMode.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnMNBasicEthernetMode, Integer.valueOf(11));

        //btnRoutingType1Support
        Button btnRoutingType1Support = this.getWidgetFactory().createButton(
            composite, "Routing Type 1 Support", SWT.CHECK); //$NON-NLS-1$
        btnRoutingType1Support
            .setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnRoutingType1Support_tooltip);
        data = new FormData();
        data.top = new FormAttachment(btnMNBasicEthernetMode, -5);
        data.left = new FormAttachment(btnIsochronous, 80);
        btnRoutingType1Support.setLayoutData(data);
        btnRoutingType1Support.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnRoutingType1Support, Integer.valueOf(12));

        //btnRoutingType2Support
        Button btnRoutingType2Support = this.getWidgetFactory().createButton(
            composite, "Routing Type 2 Support", SWT.CHECK); //$NON-NLS-1$
        btnRoutingType2Support
            .setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnRoutingType2Support_tooltip);
        data = new FormData();
        data.top = new FormAttachment(btnRoutingType1Support, -5);
        data.left = new FormAttachment(btnIsochronous, 80);
        btnRoutingType2Support.setLayoutData(data);
        btnRoutingType2Support.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnRoutingType2Support, Integer.valueOf(13));

        //btnSDOReadWriteAllbyIndex
        Button btnSDOReadWriteAllbyIndex = this.getWidgetFactory().createButton(
            composite, "SDO Read/Write All by Index", SWT.CHECK); //$NON-NLS-1$
        btnSDOReadWriteAllbyIndex
            .setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnSDOReadWriteAllbyIndex_tooltip);
        data = new FormData();
        data.top = new FormAttachment(btnRoutingType2Support, -5);
        data.left = new FormAttachment(btnIsochronous, 80);
        btnSDOReadWriteAllbyIndex.setLayoutData(data);
        btnSDOReadWriteAllbyIndex.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnSDOReadWriteAllbyIndex, Integer.valueOf(14));

        //btnSDOSDOReadWriteMultipleParameterbyIndex
        Button btnSDOSDOReadWriteMultipleParameterbyIndex = this.getWidgetFactory().createButton(
            composite, "SDO Read/Write Multiple Parameter by Index", SWT.CHECK); //$NON-NLS-1$
        btnSDOSDOReadWriteMultipleParameterbyIndex
            .setToolTipText(Messages.advancedFeatureFlagsPropertySection_btnSDOSDOReadWriteMultipleParameterbyIndex_tooltip);
        data = new FormData();
        data.top = new FormAttachment(btnSDOReadWriteAllbyIndex, -5);
        data.left = new FormAttachment(btnIsochronous, 80);
        btnSDOSDOReadWriteMultipleParameterbyIndex.setLayoutData(data);
        btnSDOSDOReadWriteMultipleParameterbyIndex.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnSDOSDOReadWriteMultipleParameterbyIndex, Integer.valueOf(15));

        //btnPResChaining
        Button btnPResChaining = this.getWidgetFactory().createButton(
            composite, "PResponse Chaining Support", SWT.CHECK); //$NON-NLS-1$
        btnPResChaining
            .setToolTipText(Messages.advancedFeatureFlagsPropertySection_tooltip_presChaining);
        data = new FormData();
        data.top = new FormAttachment(btnSDOSDOReadWriteMultipleParameterbyIndex, -5);
        data.left = new FormAttachment(btnIsochronous, 80);
        btnPResChaining.setLayoutData(data);
        btnPResChaining.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnPResChaining, Integer.valueOf(18));

        this.lblError = this.getWidgetFactory().createCLabel(composite, ""); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(btnPResChaining, 0);
        this.lblError.setLayoutData(data);
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
        super.setInput(part, selection);
        Object input = ((IStructuredSelection) selection).getFirstElement();
        Assert.isTrue(input instanceof TObjectImpl);
        this.tobject = (TObject) input;
        this.tobjectComposite.setObject(this.tobject);
        this.lblError.setText(""); //$NON-NLS-1$
        if (this.tobject.getDefaultValue() != null)

            this.lblDefaultValueValue.setText(this.tobject.getDefaultValue());

        if (this.tobject.getIndex() != null && this.tobject.getDefaultValue() != null) {
            try {
                long defaultValue = Integer.decode(this.tobject.getDefaultValue());
                if ((defaultValue & (1 << 17)) != 0 || defaultValue >= 0x80000)
                    throw new NumberFormatException(); //Also throw this exception when a wrong bit is set or too long value!

                Set<Entry<Button, Integer>> buttonSet = this.buttonMap.entrySet();
                for (Entry<Button, Integer> entry : buttonSet) {
                    int bitOffset = entry.getValue().intValue();
                    if ((defaultValue & (1 << bitOffset)) != 0) //Check if bit of button is set
                        entry.getKey().setSelection(true); //if yes, set the selection to true
                    else
                        entry.getKey().setSelection(false);
                }
            } catch (NumberFormatException e) {
                //Set error-text
                this.lblError.setText(Messages.general_error_defaultValueInvalid);
                this.lblError.setForeground(XDDUtilities.getRed(Display.getCurrent()));
            }

        }
    } //setInput

} //AdvancedTObjectPropertySection
