package com.br_automation.buoat.xddeditor.XDD.custom;

import java.math.BigInteger;
import java.util.Arrays;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xml.type.internal.DataValue.HexBin;
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
import com.br_automation.buoat.xddeditor.XDD.custom.XDDUtilities.RegexVerifyListener;
import com.br_automation.buoat.xddeditor.XDD.provider.SubObjectTypeItemProvider;
import com.br_automation.buoat.xddeditor.XDD.provider.TObjectItemProvider;

/**
 * @author Joris Lückenga
 * @since 25.3.2013
 * @brief Composite for TObjects or SubObjectTypes
 */
public class TObjectComposite extends Composite {
    private final Combo cmbObjectType;
    private final FocusAdapter indexFocusListener = new FocusAdapter() {
        @Override
        public void focusLost(FocusEvent event) {

            if (TObjectComposite.this.stautsTObject) {
                TObjectComposite.this.tobjectitemProvider.setPropertyValue(
                    TObjectComposite.this.tobject, "index", //$NON-NLS-1$
                    HexBin.decode("0" + TObjectComposite.this.txtIndex.getText())); //$NON-NLS-1$
            } else {
                TObjectComposite.this.subObjectItemProvicer.setPropertyValue(
                    TObjectComposite.this.subobject, "subIndex", //$NON-NLS-1$
                    HexBin.decode("0" + TObjectComposite.this.txtIndex.getText())); //$NON-NLS-1$
            }
        }
    };
    private final RegexVerifyListener indexVerifyListener = new RegexVerifyListener(
        RegexVerifyListener.PATTERN_HEX, Arrays.asList(
            Character.valueOf((char) 0x7f), Character.valueOf((char) 0x8)), true);

    private final Label lblindex;
    private final FocusAdapter nameListener = new FocusAdapter() {
        @Override
        public void focusLost(FocusEvent event) {
            if (TObjectComposite.this.stautsTObject)
                TObjectComposite.this.tobjectitemProvider.setPropertyValue(
                    TObjectComposite.this.tobject, "name", TObjectComposite.this.txtName.getText()); //$NON-NLS-1$
            else
                TObjectComposite.this.subObjectItemProvicer.setPropertyValue(
                    TObjectComposite.this.subobject, "name", //$NON-NLS-1$
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

            if (TObjectComposite.this.stautsTObject && selection != 0)
                TObjectComposite.this.tobjectitemProvider.setPropertyValue(
                    TObjectComposite.this.tobject, "objectType", selection); //$NON-NLS-1$
            else if (selection != 0)
                TObjectComposite.this.subObjectItemProvicer.setPropertyValue(
                    TObjectComposite.this.subobject, "objectType", selection); //$NON-NLS-1$
        }
    };

    private boolean stautsTObject;
    private SubObjectType subobject;
    private final SubObjectTypeItemProvider subObjectItemProvicer;
    private TObject tobject;
    private final TObjectItemProvider tobjectitemProvider;
    private final Text txtIndex;
    private final Text txtName;

    /**
     * Create the composite.
     * 
     * @param parent
     *            see Composite#Composite(Composite, int)
     * @param style
     *            see Composite#Composite(Composite, int)
     * @param factory
     *            to set properties for TObject/Subobjects
     */
    public TObjectComposite(Composite parent,
        int style,
        AdapterFactory factory) {
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
     * @brief sets the TObject or SubObjectType of the composite also sets given
     *        parameters.
     * @param object
     *            EObject of Type TObject or SubObject
     */
    public void setObject(final EObject object) {
        this.removeListeners();
        if (object instanceof TObject) {
            this.stautsTObject = true;
            this.txtIndex.setTextLimit(4);
            this.lblindex.setText("Index:"); //$NON-NLS-1$
            this.tobject = (TObject) object;

            if (this.tobject.getIndex() != null) {
                String result = Integer.toHexString(
                    new BigInteger(1, this.tobject.getIndex()).intValue()).toUpperCase();
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
            this.stautsTObject = false;
            this.txtIndex.setTextLimit(2);
            this.subobject = (SubObjectType) object;
            this.lblindex.setText("Subindex:"); //$NON-NLS-1$

            if (this.subobject.getSubIndex() != null) {
                String result = String.format(
                    "%02x", (new BigInteger(1, this.subobject.getSubIndex())).intValue()) //$NON-NLS-1$
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
     * @brief adds the Focus/Verfy and Modifylisteners when needed
     */
    private void addListeners() {

        this.txtName.addFocusListener(this.nameListener);
        this.txtIndex.addFocusListener(this.indexFocusListener);
        this.txtIndex.addVerifyListener(this.indexVerifyListener);
        this.cmbObjectType.addModifyListener(this.objectTypeListener);
    }

    /**
     * @brief removes the Focus/Verfy and Modifylisteners when needed
     */
    private void removeListeners() {
        this.txtName.removeFocusListener(this.nameListener);
        this.txtIndex.removeFocusListener(this.indexFocusListener);
        this.txtIndex.removeVerifyListener(this.indexVerifyListener);
        this.cmbObjectType.removeModifyListener(this.objectTypeListener);
    }
}
