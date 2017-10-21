/**
 * @since 19.3.2013
 * @author Joris L�ckenga, B&R Industrial Automation GmbH
 *
 *  @copyright (c) 2017, Kalycito Infotech Private Limited
 *
 *  @copyright (c) 2017, B&R Industrial Automation GmbH
 *            All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *   * Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *   * Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *   * Neither the name of the copyright holders nor the
 *     names of its contributors may be used to endorse or promote products
 *     derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL COPYRIGHT HOLDERS BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *******************************************************************************/
package com.br_automation.buoat.xddeditor.XDD.custom.propertypages;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
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

import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.custom.Messages;
import com.br_automation.buoat.xddeditor.XDD.custom.XDDUtilities;
import com.br_automation.buoat.xddeditor.XDD.provider.TObjectItemProvider;

/**
 * @brief PropertySection for StartUp object with index 0x1F80.
 *
 *        Shows checkboxes for StartUpObject and calculates a default value
 *        based on user selection.
 *
 * @author Joris L�ckenga
 */
public class AdvancedStartUpPropertySection extends AbstractPropertySection {

    private AdapterFactory adapterFactory;
    private final Map<Button, Integer> buttonMap = new HashMap<Button, Integer>(13);
    private int defaultValue;
    private CLabel lblDefaultValueValue;
    private CLabel lblError;

    private TObject tobject;
    private TObjectComposite tObjectComposite;

    private TObjectItemProvider tObjectProvider;

    private final SelectionListener selectionListener = new SelectionAdapter() {

        @Override
        public void widgetSelected(SelectionEvent e) {
            String strDefaultValue;
            try {
                AdvancedStartUpPropertySection.this.defaultValue = Integer
                        .decode(AdvancedStartUpPropertySection.this.tobject.getDefaultValue());
            } catch (NumberFormatException f) {
                AdvancedStartUpPropertySection.this.defaultValue = 0;
            }
            if (((Button) e.getSource()).getSelection())
                AdvancedStartUpPropertySection.this.defaultValue = AdvancedStartUpPropertySection.this.defaultValue
                        | (1 << AdvancedStartUpPropertySection.this.buttonMap.get(e.getSource()).intValue());
            else
                AdvancedStartUpPropertySection.this.defaultValue = AdvancedStartUpPropertySection.this.defaultValue
                        & ~(1 << AdvancedStartUpPropertySection.this.buttonMap.get(e.getSource()).intValue());

            strDefaultValue = "0x" //$NON-NLS-1$
                    + Integer.toHexString(AdvancedStartUpPropertySection.this.defaultValue).toUpperCase();
            AdvancedStartUpPropertySection.this.tObjectProvider
                    .setPropertyValue(AdvancedStartUpPropertySection.this.tobject, "defaultValue", strDefaultValue); //$NON-NLS-1$
            AdvancedStartUpPropertySection.this.lblDefaultValueValue.setText(strDefaultValue);

        }
    }; // SelectionListener

    @Override
    public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
        super.createControls(parent, aTabbedPropertySheetPage);

        Composite composite = super.getWidgetFactory().createFlatFormComposite(parent);
        FormData data;
        this.tObjectProvider = new TObjectItemProvider(this.getAdapterFactory());
        this.tObjectComposite = new TObjectComposite(composite, 0, this.getAdapterFactory());
        data = new FormData();
        data.top = new FormAttachment(0, 0);
        this.tObjectComposite.setLayoutData(data);

        // lblDefaultValueValue Label
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

        // --Checkbox-Section

        // btnStartCNsMode
        Button btnStartCNsMode = this.getWidgetFactory().createButton(composite,
                Messages.advancedStartUpPropertySection_btn_startBroadcastCN, SWT.CHECK);
        btnStartCNsMode.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_startexplicitCN);
        data = new FormData();
        data.top = new FormAttachment(lblDefaultValue, 0);
        data.left = new FormAttachment(0, 7);
        btnStartCNsMode.setLayoutData(data);
        btnStartCNsMode.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnStartCNsMode, 1);

        // btnAutoOperationalState
        Button btnAutoOperationalState = this.getWidgetFactory().createButton(composite,
                Messages.advancedStartUpPropertySection_btn_NoAutoNMTOperational, SWT.CHECK);
        btnAutoOperationalState.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_autoNMTOperational);
        data = new FormData();
        data.top = new FormAttachment(btnStartCNsMode, -5);
        data.left = new FormAttachment(0, 7);
        btnAutoOperationalState.setLayoutData(data);
        btnAutoOperationalState.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnAutoOperationalState, 2);

        // btnNMTStartNode
        Button btnNMTStartNode = this.getWidgetFactory().createButton(composite,
                Messages.advancedStartUpPropertySection_btn_applicationCNStart, SWT.CHECK);
        btnNMTStartNode.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_allowCNstartup);
        data = new FormData();
        data.top = new FormAttachment(btnAutoOperationalState, -5);
        data.left = new FormAttachment(0, 7);
        btnNMTStartNode.setLayoutData(data);
        btnNMTStartNode.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnNMTStartNode, 3);

        // btnNMTResetNodeTrigger
        Button btnNMTResetNode = this.getWidgetFactory().createButton(composite,
                Messages.advancedStartUpPropertySection_btn_resetNodeWithBroadcast, SWT.CHECK);
        btnNMTResetNode.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_individualOnError);
        data = new FormData();
        data.top = new FormAttachment(btnNMTStartNode, -5);
        data.left = new FormAttachment(0, 7);
        btnNMTResetNode.setLayoutData(data);
        btnNMTResetNode.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnNMTResetNode, 4);

        // btnNTMStopNode
        Button btnNMTStopNode = this.getWidgetFactory().createButton(composite,
                Messages.advancedStartUpPropertySection_btn_dealStopNodeWithBroadcast, SWT.CHECK);
        btnNMTStopNode.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_dealCNaccordingBit4);
        data = new FormData();
        data.top = new FormAttachment(btnNMTResetNode, -5);
        data.left = new FormAttachment(0, 7);
        btnNMTStopNode.setLayoutData(data);
        btnNMTStopNode.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnNMTStopNode, 6);

        // btnPreOperational2
        Button btnNMTPreOperational2 = this.getWidgetFactory().createButton(composite,
                Messages.advancedStartUpPropertySection_btn_enterPreOp2ByApplication, SWT.CHECK);
        btnNMTPreOperational2.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_enterPreOperational2);
        data = new FormData();
        data.top = new FormAttachment(btnNMTStopNode, -5);
        data.left = new FormAttachment(0, 7);
        btnNMTPreOperational2.setLayoutData(data);
        btnNMTPreOperational2.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnNMTPreOperational2, 7);

        // btnMSReadyToOperate
        Button btnMSReadyToOperate = this.getWidgetFactory().createButton(composite,
                Messages.advancedStartUpPropertySection_btn_appDecide_ReadyState, SWT.CHECK);
        btnMSReadyToOperate.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_setReadyToOperate);
        data = new FormData();
        data.top = new FormAttachment(lblDefaultValue, 0);
        data.left = new FormAttachment(btnStartCNsMode, 120);
        btnMSReadyToOperate.setLayoutData(data);
        btnMSReadyToOperate.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnMSReadyToOperate, 8);

        // btnCompleteCNIdCheck
        Button btnCompleteCNIdCheck = this.getWidgetFactory().createButton(composite,
                Messages.advancedStartUpPropertySection_btn_VerifyAllCNIds, SWT.CHECK);
        btnCompleteCNIdCheck.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_LimitVerifyAllCNIds);
        data = new FormData();
        data.top = new FormAttachment(btnMSReadyToOperate, -5);
        data.left = new FormAttachment(btnStartCNsMode, 120);
        btnCompleteCNIdCheck.setLayoutData(data);
        btnCompleteCNIdCheck.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnCompleteCNIdCheck, 9);

        // btnCheckSWVersion
        Button btnCheckSWVersion = this.getWidgetFactory().createButton(composite,
                Messages.advancedStartUpPropertySection_btn_checkSWVersion, SWT.CHECK);
        btnCheckSWVersion.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_doNotCheckSW);
        data = new FormData();
        data.top = new FormAttachment(btnCompleteCNIdCheck, -5);
        data.left = new FormAttachment(btnStartCNsMode, 120);
        btnCheckSWVersion.setLayoutData(data);
        btnCheckSWVersion.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnCheckSWVersion, 10);

        // btnCheckConfig
        Button btnCheckConfig = this.getWidgetFactory().createButton(composite,
                Messages.advancedStartUpPropertySection_btn_checkCNConfig, SWT.CHECK);
        btnCheckConfig.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_doNotCheckConfig);
        data = new FormData();
        data.top = new FormAttachment(btnCheckSWVersion, -5);
        data.left = new FormAttachment(btnStartCNsMode, 120);
        btnCheckConfig.setLayoutData(data);
        btnCheckConfig.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnCheckConfig, 11);

        // btnReturnOperational1
        Button btnReturnOperational1 = this.getWidgetFactory().createButton(composite,
                Messages.advancedStartUpPropertySection_btn_AppDecideChangeToPreOp, SWT.CHECK);
        btnReturnOperational1.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_autoChangeToPreOp);
        data = new FormData();
        data.top = new FormAttachment(btnCheckConfig, -5);
        data.left = new FormAttachment(btnStartCNsMode, 120);
        btnReturnOperational1.setLayoutData(data);
        btnReturnOperational1.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnReturnOperational1, 12);

        // btnChangeToBasicEth
        Button btnChangeToBasicEth = this.getWidgetFactory().createButton(composite,
                Messages.advancedStartUpPropertySection_btn_ChangeNotActiveToBaiscEthernet, SWT.CHECK);
        btnChangeToBasicEth.setToolTipText(Messages.advancedStartUpPropertySection_tooltip_notActiveBasicEthState);
        data = new FormData();
        data.top = new FormAttachment(btnReturnOperational1, -5);
        data.left = new FormAttachment(btnStartCNsMode, 120);
        btnChangeToBasicEth.setLayoutData(data);
        btnChangeToBasicEth.addSelectionListener(this.selectionListener);
        this.buttonMap.put(btnChangeToBasicEth, 13);

        // ----ERRORLABEL

        this.lblError = this.getWidgetFactory().createCLabel(composite,
                "                                                  "); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(btnNMTPreOperational2, 0);
        data.left = new FormAttachment(0, 7);
        this.lblError.setLayoutData(data);
        this.lblError.setForeground(XDDUtilities.getRed(Display.getCurrent()));

    } // createControls

    /**
     * @return AdapterFactory for ItemProviders.
     */
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
        if (selection instanceof IStructuredSelection) {
            Object input = ((IStructuredSelection) selection).getFirstElement();
            this.tobject = (TObject) input;
            if (lblError != null) {
                this.lblError.setText(""); //$NON-NLS-1$
            }
            if (tObjectComposite != null) {
                this.tObjectComposite.setObject(this.tobject);
            }
            if (lblDefaultValueValue != null) {
                this.lblDefaultValueValue.setText(this.tobject.getDefaultValue());
            }
            Set<Entry<Button, Integer>> buttonSet = this.buttonMap.entrySet();

            try {
                int currentDefaultValue = 0;
                if (this.tobject.getDefaultValue() != null && this.tobject.getDefaultValue().length() > 0) {

                    currentDefaultValue = Integer.decode(this.tobject.getDefaultValue());

                    for (Entry<Button, Integer> entry : buttonSet) {
                        int btnValue = entry.getValue().intValue();
                        if ((currentDefaultValue & (1 << btnValue)) != 0) // Check
                                                                            // if
                                                                            // Bit
                                                                            // of
                                                                            // Button
                                                                            // is
                                                                            // set
                            entry.getKey().setSelection(true); // if yes, set
                                                                // the
                                                                // selection to
                                                                // true
                        else
                            entry.getKey().setSelection(false);
                    }
                }
                if (currentDefaultValue != 0 // Checks if any reserved bits are
                                                // set
                                                // in defaultValue (Bit 0, Bit
                                                // 5,
                                                // all Bits > 13)
                        && (currentDefaultValue > 0x3FDE || ((currentDefaultValue & (1 << 5)) != 0))
                        || (currentDefaultValue & (1 << 0)) != 0) {
                    this.lblError.setText(Messages.general_error_defaultValueInvalid);
                    for (Entry<Button, Integer> entry : buttonSet)
                        entry.getKey().setSelection(false);
                }
            } catch (NumberFormatException e) {
                this.lblError.setText(Messages.general_error_defaultValueInvalid);
            }
        } // setInput
    }
} // AdvancedStartUpPropertySection
