package com.br_automation.buoat.xddeditor.XDD.custom;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.impl.TObjectImpl;
import com.br_automation.buoat.xddeditor.XDD.provider.TObjectItemProvider;

public class AdvancedFeatureFlagsPropertySection extends AbstractPropertySection {

    private CLabel lblNameValue;
    private TObject tobject;
    private AdapterFactory adapterFactory;
    private TObjectItemProvider tObjectProvider;

    private CLabel lblDefaultValueValue;
    private CLabel lblIndexValue;
    private CLabel lbloptionalFlags;
    private CLabel lblDefaultValue;
    private Button btnMultiplexedAccess;

    private HashMap<Button, Integer> buttonMap = new HashMap<Button, Integer>();

    //Set the correct Bits if a Button is selected (with MultiplexFeature-Check)
    private SelectionListener selectionListener = new SelectionListener() {

        @Override
        public void widgetSelected(SelectionEvent e) {
            Set<Entry<Button, Integer>> buttonSet = buttonMap.entrySet();
            int btnValue = 0;
            int newDefaultValue = 0;
            String defaultValue;
            for (Entry<Button, Integer> entry : buttonSet) {
                btnValue = entry.getValue();
                if (entry.getKey().getSelection())
                    newDefaultValue = newDefaultValue | (1 << btnValue);
                else
                    newDefaultValue = newDefaultValue & ~(1 << btnValue);
            }

            defaultValue = "0x" + Integer.toHexString(newDefaultValue);
            if (!tobject.getDefaultValue().contentEquals(defaultValue)) {
                tObjectProvider.setPropertyValue(tobject, "defaultValue", defaultValue);
                lblDefaultValueValue.setText(defaultValue);
                XDDUtilities.setMultiplexFeature(
                    btnMultiplexedAccess.getSelection(),
                    (DocumentRoot) EcoreUtil.getRootContainer(tobject));
            }
        }

        @Override
        public void widgetDefaultSelected(SelectionEvent e) {

        }

    };//SelectionListener

    //Creates the Checkbox-Buttons and Labels as well as selection listeners for each box
    @Override
    public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {

        super.createControls(parent, aTabbedPropertySheetPage);

        Composite composite = super.getWidgetFactory().createFlatFormComposite(parent);
        FormData data;

        tObjectProvider = new TObjectItemProvider(getAdapterFactory());

        //Standard-Label--------------------------------------

        lblNameValue = getWidgetFactory().createCLabel(
            composite, "                                            "); //$NON-NLS-1$

        data = new FormData();
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH); //Left(
        data.right = new FormAttachment(80, 0);
        data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);
        lblNameValue.setLayoutData(data);

        //Name Label
        CLabel lblName = getWidgetFactory().createCLabel(composite, "Name:"); //$NON-NLS-1$
        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(lblNameValue, 2);
        data.top = new FormAttachment(lblNameValue, 0, SWT.CENTER);
        lblName.setLayoutData(data);

        //Index Label
        CLabel lblIndex = getWidgetFactory().createCLabel(composite, "Index:"); //$NON-NLS-1$
        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(lblNameValue, 2);
        data.top = new FormAttachment(lblName, -5);
        lblIndex.setLayoutData(data);

        //Index Value
        lblIndexValue = getWidgetFactory().createCLabel(composite, "    "); //$NON-NLS-1$
        data = new FormData();
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(80, 0);
        data.top = new FormAttachment(lblNameValue, -5);
        lblIndexValue.setLayoutData(data);

        //lblDefaultValue Label
        lblDefaultValueValue = getWidgetFactory().createCLabel(composite, "     bla    "); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(lblIndexValue, -5);
        lblDefaultValueValue.setLayoutData(data);
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH);

        lblDefaultValue = getWidgetFactory().createCLabel(composite, "Default Value:"); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(lblIndex, -5);
        lblDefaultValue.setLayoutData(data);

        //optionalFlags Label
        lbloptionalFlags = getWidgetFactory().createCLabel(composite, "Optional Feature Flags:"); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(lblDefaultValueValue, 0);
        lbloptionalFlags.setLayoutData(data);

        //Checkbox-Buttons -------------------------------------------

        //Isonchronus

        Button btnIsochronous = getWidgetFactory().createButton(
            composite, "Isonchronus Mode", SWT.CHECK);
        data = new FormData();
        data.top = new FormAttachment(lbloptionalFlags, 0);
        btnIsochronous.setLayoutData(data);
        btnIsochronous.addSelectionListener(selectionListener);
        buttonMap.put(btnIsochronous, new Integer(0));

        //btnSDObyUDPIP
        Button btnSDObyUDPIP = getWidgetFactory().createButton(
            composite, "SDO by UDP/IP", SWT.CHECK);
        data = new FormData();
        data.top = new FormAttachment(btnIsochronous, -5);
        btnSDObyUDPIP.setLayoutData(data);
        btnSDObyUDPIP.addSelectionListener(selectionListener);
        buttonMap.put(btnSDObyUDPIP, new Integer(1));

        //btnSDObyASnd
        Button btnSDObyASnd = getWidgetFactory().createButton(composite, "SDO by ASnd", SWT.CHECK);
        data = new FormData();
        data.top = new FormAttachment(btnSDObyUDPIP, -5);
        btnSDObyASnd.setLayoutData(data);
        btnSDObyASnd.addSelectionListener(selectionListener);
        buttonMap.put(btnSDObyASnd, new Integer(2));

        //btnSDObyPDO
        Button btnSDObyPDO = getWidgetFactory().createButton(composite, "SDO by PDO", SWT.CHECK);
        data = new FormData();
        data.top = new FormAttachment(btnSDObyASnd, -5);
        btnSDObyPDO.setLayoutData(data);
        btnSDObyPDO.addSelectionListener(selectionListener);
        buttonMap.put(btnSDObyPDO, new Integer(3));

        //btnNMTInfoServices
        Button btnNMTInfoServices = getWidgetFactory().createButton(
            composite, "NMT Info Services", SWT.CHECK);
        data = new FormData();
        data.top = new FormAttachment(btnSDObyPDO, -5);
        btnNMTInfoServices.setLayoutData(data);
        btnNMTInfoServices.addSelectionListener(selectionListener);
        buttonMap.put(btnNMTInfoServices, new Integer(4));

        //btnExtendedNMTStateCommands
        Button btnExtendedNMTStateCommands = getWidgetFactory().createButton(
            composite, "Extended NMT State Commands", SWT.CHECK);
        data = new FormData();
        data.top = new FormAttachment(btnNMTInfoServices, -5);
        btnExtendedNMTStateCommands.setLayoutData(data);
        btnExtendedNMTStateCommands.addSelectionListener(selectionListener);
        buttonMap.put(btnExtendedNMTStateCommands, new Integer(5));

        //btnDynamicPDOMapping
        Button btnDynamicPDOMapping = getWidgetFactory().createButton(
            composite, "Dynamic PDO mapping", SWT.CHECK);
        data = new FormData();
        data.top = new FormAttachment(btnExtendedNMTStateCommands, -5);
        btnDynamicPDOMapping.setLayoutData(data);
        btnDynamicPDOMapping.addSelectionListener(selectionListener);
        buttonMap.put(btnDynamicPDOMapping, new Integer(6));

        //btnNMTServicebyUDPIP
        Button btnNMTServicebyUDPIP = getWidgetFactory().createButton(
            composite, "NMT Service by UDP/IP", SWT.CHECK);
        data = new FormData();
        data.top = new FormAttachment(btnDynamicPDOMapping, -5);
        btnNMTServicebyUDPIP.setLayoutData(data);
        btnNMTServicebyUDPIP.addSelectionListener(selectionListener);
        buttonMap.put(btnNMTServicebyUDPIP, new Integer(7));

        //btnConfigurationManager
        Button btnConfigurationManager = getWidgetFactory().createButton(
            composite, "Configuration Manager functions", SWT.CHECK);
        data = new FormData();
        data.top = new FormAttachment(btnNMTServicebyUDPIP, -5);
        btnConfigurationManager.setLayoutData(data);
        btnConfigurationManager.addSelectionListener(selectionListener);
        buttonMap.put(btnConfigurationManager, new Integer(8));

        //btnMultiplexedAccess
        btnMultiplexedAccess = getWidgetFactory().createButton(
            composite, "Multiplexed  Access", SWT.CHECK);
        data = new FormData();
        data.top = new FormAttachment(btnConfigurationManager, -5);
        btnMultiplexedAccess.setLayoutData(data);
        btnMultiplexedAccess.addSelectionListener(selectionListener);
        buttonMap.put(btnMultiplexedAccess, new Integer(9));

        //btnNodeIDsetupbySW
        Button btnNodeIDsetupbySW = getWidgetFactory().createButton(
            composite, "NodeID setup by SW", SWT.CHECK);
        data = new FormData();
        data.top = new FormAttachment(btnMultiplexedAccess, -5);
        btnNodeIDsetupbySW.setLayoutData(data);
        btnNodeIDsetupbySW.addSelectionListener(selectionListener);
        buttonMap.put(btnNodeIDsetupbySW, new Integer(10));

        //btnMNBasicEthernetMode
        Button btnMNBasicEthernetMode = getWidgetFactory().createButton(
            composite, "MN Basic Ethernet Mode", SWT.CHECK);
        data = new FormData();
        data.top = new FormAttachment(btnNodeIDsetupbySW, -5);
        btnMNBasicEthernetMode.setLayoutData(data);
        btnMNBasicEthernetMode.addSelectionListener(selectionListener);
        buttonMap.put(btnMNBasicEthernetMode, new Integer(11));

        //btnRoutingType1Support
        Button btnRoutingType1Support = getWidgetFactory().createButton(
            composite, "Routing Type 1 Support", SWT.CHECK);
        data = new FormData();
        data.top = new FormAttachment(btnMNBasicEthernetMode, -5);
        btnRoutingType1Support.setLayoutData(data);
        btnRoutingType1Support.addSelectionListener(selectionListener);
        buttonMap.put(btnRoutingType1Support, new Integer(12));

        //btnRoutingType2Support
        Button btnRoutingType2Support = getWidgetFactory().createButton(
            composite, "Routing Type 2 Support", SWT.CHECK);
        data = new FormData();
        data.top = new FormAttachment(btnRoutingType1Support, -5);
        btnRoutingType2Support.setLayoutData(data);
        btnRoutingType2Support.addSelectionListener(selectionListener);
        buttonMap.put(btnRoutingType2Support, new Integer(13));

        //btnSDOReadWriteAllbyIndex
        Button btnSDOReadWriteAllbyIndex = getWidgetFactory().createButton(
            composite, "SDO Read/Write All by Index", SWT.CHECK);
        data = new FormData();
        data.top = new FormAttachment(btnRoutingType2Support, -5);
        btnSDOReadWriteAllbyIndex.setLayoutData(data);
        btnSDOReadWriteAllbyIndex.addSelectionListener(selectionListener);
        buttonMap.put(btnSDOReadWriteAllbyIndex, new Integer(14));

        //btnSDOSDOReadWriteMultipleParameterbyIndex
        Button btnSDOSDOReadWriteMultipleParameterbyIndex = getWidgetFactory().createButton(
            composite, "SDO Read/Write Multiple Parameter by Index", SWT.CHECK);
        data = new FormData();
        data.top = new FormAttachment(btnSDOReadWriteAllbyIndex, -5);
        btnSDOSDOReadWriteMultipleParameterbyIndex.setLayoutData(data);
        btnSDOSDOReadWriteMultipleParameterbyIndex.addSelectionListener(selectionListener);
        buttonMap.put(btnSDOSDOReadWriteMultipleParameterbyIndex, new Integer(15));

    }//CreateControls

    //Sets the current input of the workbench and calculates the selected Checkbox-Buttons
    @Override
    public void setInput(IWorkbenchPart part, ISelection selection) {
        super.setInput(part, selection);
        Object input = ((IStructuredSelection) selection).getFirstElement();
        Assert.isTrue(input instanceof TObjectImpl);
        tobject = (TObject) input;
        lblNameValue.setText(new String(tobject.getName()));
        if (tobject.getDefaultValue() != null)
            lblDefaultValueValue.setText(tobject.getDefaultValue());

        if (tobject.getIndex() != null) {
            int defaultValue = Integer.decode(tobject.getDefaultValue());
            Set<Entry<Button, Integer>> buttonSet = buttonMap.entrySet();
            int btnValue = 0;
            for (Entry<Button, Integer> entry : buttonSet) {
                btnValue = entry.getValue().intValue();
                if ((defaultValue & (1 << btnValue)) != 0) //Check if Bit of Button is set
                    entry.getKey().setSelection(true); //if yes, set the selection to true
            }
        }
    }//setInput

    //Taken from EEFAdvancedPropertySection
    public IPropertySource getPropertySource(Object object) {
        if (getAdapterFactory() != null) {
            IItemPropertySource item = (IItemPropertySource) getAdapterFactory().adapt(
                object, IItemPropertySource.class);
            if (item != null)
                return new PropertySource(object, item);
        }
        return null;
    }

    //Taken from EEFAdvancedPropertySection
    public AdapterFactory getAdapterFactory() {
        if (adapterFactory == null)
            adapterFactory = EEFRuntimePlugin.getDefault().getAdapterFactory();
        return adapterFactory;
    }
}//AdvancedTObjectPropertySection
