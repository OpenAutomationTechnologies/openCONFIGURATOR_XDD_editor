/**
 * @since 19.3.2013
 * @author Joris Lückenga, Bernecker + Rainer Industrie Elektronik Ges.m.b.H.
 *
 * @copyright (c) 2017, Bernecker + Rainer Industrie Elektronik Ges.m.b.H.
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

import java.math.BigInteger;
import java.util.Arrays;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

import com.br_automation.buoat.xddeditor.XDD.SubObjectType;
import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.custom.Messages;
import com.br_automation.buoat.xddeditor.XDD.custom.XDDUtilities.RegexVerifyListener;
import com.br_automation.buoat.xddeditor.XDD.provider.SubObjectTypeItemProvider;
import com.br_automation.buoat.xddeditor.XDD.provider.TObjectItemProvider;

/**
 * @brief Composite for TObjects or SubObjectTypes.
 *
 *        Contains text and combo boxes with listeners to set mandatory values
 *        for TObjects and SubobjecTypes.
 *
 * @author Joris Lückenga
 */
public class TObjectComposite extends Composite {
    private final Combo cmbObjectType;
    private SubObjectType subobject;
    private final SubObjectTypeItemProvider subObjectItemProvicer;
    private TObject tobject;
    private final TObjectItemProvider tobjectitemProvider;
    private final Text txtIndex;
    private final Text txtName;

    private final RegexVerifyListener indexVerifyListener = new RegexVerifyListener(RegexVerifyListener.PATTERN_HEX,
            Arrays.asList(Character.valueOf((char) 0x7f), Character.valueOf((char) 0x8)), true);

    private boolean isTObject;
    private final Label lblindex;

    private final FocusAdapter indexFocusListener = new FocusAdapter() {
        @Override
        public void focusLost(FocusEvent event) {
            if (TObjectComposite.this.txtIndex.getText() != null
                    && !TObjectComposite.this.txtIndex.getText().contentEquals("")) {
                byte[] indexNew = new BigInteger(TObjectComposite.this.txtIndex.getText(), 16).toByteArray();

                if (TObjectComposite.this.isTObject) {
                    TObjectComposite.this.tobjectitemProvider.setPropertyValue(TObjectComposite.this.tobject, "index", //$NON-NLS-1$
                            indexNew); // $NON-NLS-1$
                } else {
                    TObjectComposite.this.subObjectItemProvicer.setPropertyValue(TObjectComposite.this.subobject,
                            "subIndex", //$NON-NLS-1$
                            indexNew); // $NON-NLS-1$
                }
            }
        }
    };

    private final FocusAdapter nameListener = new FocusAdapter() {
        @Override
        public void focusLost(FocusEvent event) {
            if (TObjectComposite.this.isTObject)
                TObjectComposite.this.tobjectitemProvider.setPropertyValue(TObjectComposite.this.tobject, "name", //$NON-NLS-1$
                        TObjectComposite.this.txtName.getText());
            else
                TObjectComposite.this.subObjectItemProvicer.setPropertyValue(TObjectComposite.this.subobject, "name", //$NON-NLS-1$
                        TObjectComposite.this.txtName.getText());
        }
    };

    private final ModifyListener objectTypeListener = new ModifyListener() {

        @Override
        public void modifyText(ModifyEvent event) {
            String selectionStr = TObjectComposite.this.cmbObjectType.getText();
            short selection;
            if (selectionStr.contentEquals("7 - VAR")) //$NON-NLS-1$
                selection = 7;
            else if (selectionStr.contentEquals("8 - ARRAY")) //$NON-NLS-1$
                selection = 8;
            else if (selectionStr.contentEquals("9 - RECORD")) //$NON-NLS-1$
                selection = 9;
            else
                selection = 0;

            if (TObjectComposite.this.isTObject && selection != 0)
                TObjectComposite.this.tobjectitemProvider.setPropertyValue(TObjectComposite.this.tobject, "objectType", //$NON-NLS-1$
                        selection);
            else if (selection != 0)
                TObjectComposite.this.subObjectItemProvicer.setPropertyValue(TObjectComposite.this.subobject,
                        "objectType", selection); //$NON-NLS-1$
        }
    };

    /**
     * @brief Also needs the AdapterFactory to set properties for the Object.
     * @see Composite#Composite(Composite, int)
     * @param factory
     *            to set properties for TObject/SubObjectType.
     */
    public TObjectComposite(Composite parent, int style, AdapterFactory factory) {
        super(parent, style);
        this.tobjectitemProvider = new TObjectItemProvider(factory);
        this.subObjectItemProvicer = new SubObjectTypeItemProvider(factory);
        this.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

        Group grpMandatory = new Group(this, SWT.NONE);
        grpMandatory.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
        grpMandatory.setText("Mandatory Data"); //$NON-NLS-1$
        grpMandatory.setBounds(10, 0, 271, 112);

        Label lblName = new Label(grpMandatory, SWT.NONE);
        lblName.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
        this.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
        lblName.setBounds(10, 22, 55, 15);
        lblName.setText("Name:"); //$NON-NLS-1$

        this.lblindex = new Label(grpMandatory, SWT.NONE);
        this.lblindex.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
        this.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
        this.lblindex.setText("Index:"); //$NON-NLS-1$
        this.lblindex.setBounds(10, 80, 55, 15);

        this.txtName = new Text(grpMandatory, SWT.BORDER);
        this.txtName.setBounds(83, 19, 183, 21);

        this.txtIndex = new Text(grpMandatory, SWT.BORDER | SWT.RIGHT);
        this.txtIndex.setBounds(83, 77, 55, 21);
        this.txtIndex.setTextLimit(4);

        this.cmbObjectType = new Combo(grpMandatory, SWT.NONE);
        this.cmbObjectType.setItems(new String[] { "7 - VAR", "8 - ARRAY", "9 - RECORD" }); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        this.cmbObjectType.setBounds(83, 45, 183, 23);

        Label lblObjectType = new Label(grpMandatory, SWT.NONE);
        lblObjectType.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
        lblObjectType.setBounds(10, 48, 67, 15);
        lblObjectType.setText("Object Type:"); //$NON-NLS-1$

        Label lblH = new Label(grpMandatory, SWT.NONE);
        lblH.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
        lblH.setBounds(144, 80, 7, 15);
        lblH.setText("h"); //$NON-NLS-1$
    }

    /**
     * @brief Sets the TObject or SubObjectType and parameters to composite.
     * @param object
     *            EObject of Type TObject or SubObject that should appear in the
     *            composite.
     */
    public void setObject(final EObject object) {
        this.removeListeners();
        if (object instanceof TObject) {
            this.isTObject = true;
            this.txtIndex.setTextLimit(4);
            this.lblindex.setText("Index:"); //$NON-NLS-1$
            this.tobject = (TObject) object;

            if (this.tobject.getIndex() != null) {
                String result = Integer.toHexString(new BigInteger(1, this.tobject.getIndex()).intValue())
                        .toUpperCase();
                this.txtIndex.setText(result);
            } else
                this.txtIndex.setText(""); //$NON-NLS-1$
            if (this.tobject.getName() != null)
                this.txtName.setText(this.tobject.getName());
            int i = 0;
            for (String objectType : this.cmbObjectType.getItems()) {
                if (objectType.contains(Short.toString(this.tobject.getObjectType()))) {
                    this.cmbObjectType.select(i);
                    break;
                } else
                    this.cmbObjectType.setText(Messages.tObjectComposite_type_not_found);
                i++;
            }

        } else {
            this.isTObject = false;
            this.txtIndex.setTextLimit(2);
            if (object instanceof SubObjectType) {
                this.subobject = (SubObjectType) object;
            }
            this.lblindex.setText("Subindex:"); //$NON-NLS-1$

            if (this.subobject.getSubIndex() != null) {
                String result = String.format("%02x", (new BigInteger(1, this.subobject.getSubIndex())).intValue()) //$NON-NLS-1$
                        .toUpperCase();
                this.txtIndex.setText(result);
            } else
                this.txtIndex.setText(""); //$NON-NLS-1$
            if (this.subobject.getName() != null)
                this.txtName.setText(this.subobject.getName());

            int i = 0;
            for (String objectType : this.cmbObjectType.getItems()) {
                if (objectType.contains(Short.toString(this.subobject.getObjectType()))) {
                    this.cmbObjectType.select(i);
                    break;
                } else {
                    this.cmbObjectType.setText(Messages.tObjectComposite_type_not_found);
                }
                i++;
            }
        }
        this.addListeners();
    }

    @Override
    protected void checkSubclass() {
        // Disable the check that prevents subclassing of SWT components
    }

    /**
     * @brief Adds the focus/verify- and modify-listeners.
     */
    private void addListeners() {
        this.txtName.addFocusListener(this.nameListener);
        this.txtIndex.addFocusListener(this.indexFocusListener);
        this.txtIndex.addVerifyListener(this.indexVerifyListener);
        this.cmbObjectType.addModifyListener(this.objectTypeListener);
    }

    /**
     * @brief Removes the focus/verify and modify-listeners.
     */
    private void removeListeners() {
        this.txtName.removeFocusListener(this.nameListener);
        this.txtIndex.removeFocusListener(this.indexFocusListener);
        this.txtIndex.removeVerifyListener(this.indexVerifyListener);
        this.cmbObjectType.removeModifyListener(this.objectTypeListener);
    }

} // TObjectComposite
