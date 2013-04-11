/**
 * @since 19.3.2013
 * @author Joris Lückenga, Bernecker + Rainer Industrie Elektronik Ges.m.b.H.
 */

package com.br_automation.buoat.xddeditor.XDD.custom.propertypages;

import java.math.BigInteger;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.SubObjectType;
import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.TObjectPDOMapping;
import com.br_automation.buoat.xddeditor.XDD.custom.Messages;
import com.br_automation.buoat.xddeditor.XDD.custom.XDDUtilities;
import com.br_automation.buoat.xddeditor.XDD.provider.SubObjectTypeItemProvider;

/**
 * @brief This class represents an advanced section for user-friendly creation
 *        of RPDO/TPDO object-mappings.
 * 
 *        Only applies to subobjects of objects 0x16XX and 0x1AXX. Shows
 *        comboboxes for selection of mappable objects, as well as text fields
 *        for input of length and offset. Calculates a mapping-value based on
 *        user's input.
 * 
 * @author Joris Lückenga
 * */
public class AdvancedMappingObjectPropertySection extends AbstractPropertySection {

    protected static final int MAX_OFFSET_VALUE = 1489;
    private AdapterFactory adapterFactory;
    private CCombo cmbIndex;
    private CCombo cmbSubindex;
    private long defaultValue;

    private final Device device = Display.getCurrent();

    //Shows mappable subobjects, sets Lengthfield,triggers new defaultvalue-calculation
    private final SelectionAdapter indexListener = new SelectionAdapter() {

        @Override
        public void widgetSelected(SelectionEvent e) {
            String selection = AdvancedMappingObjectPropertySection.this.cmbIndex
                .getItem(AdvancedMappingObjectPropertySection.this.cmbIndex.getSelectionIndex());
            TObject object;
            AdvancedMappingObjectPropertySection.this.setError(0);
            String dataTypeSize;

            if (!selection.isEmpty()) {
                //choose the right object in the list...
                object = AdvancedMappingObjectPropertySection.this.validTObjects.get(selection);
                AdvancedMappingObjectPropertySection.this.subObjectItemProvider.setPropertyValue(
                    AdvancedMappingObjectPropertySection.this.tsubObject, "defaultValue", "0x0");
                //If Subobjects NOT empty...modify the Subindex-Combobox
                if (!object.getSubObject().isEmpty()) {
                    //Get Subobjects & Enable Combobox
                    AdvancedMappingObjectPropertySection.this.validSubObjectTypes = XDDUtilities
                        .getMappingSubObjects(
                            object, AdvancedMappingObjectPropertySection.this.validTObjectMapping);
                    AdvancedMappingObjectPropertySection.this.cmbSubindex.setEnabled(true);
                    AdvancedMappingObjectPropertySection.this.cmbSubindex
                        .setBackground(XDDUtilities
                            .getWhite(AdvancedMappingObjectPropertySection.this.device));
                    AdvancedMappingObjectPropertySection.this.cmbSubindex.removeAll();

                    //Fill Comobobox
                    Set<Entry<String, SubObjectType>> subobjectSet = AdvancedMappingObjectPropertySection.this.validSubObjectTypes
                        .entrySet();
                    for (Entry<String, SubObjectType> entry : subobjectSet)
                        AdvancedMappingObjectPropertySection.this.cmbSubindex.add(entry.getKey());

                    //Set Text-Instructions
                    AdvancedMappingObjectPropertySection.this.txtLength
                        .setText(Messages.advancedMappingObjectPropertySection_Set_Subindex);
                    AdvancedMappingObjectPropertySection.this.txtLength.setEnabled(false);
                    //Add Listener to subObjectCombobox
                    AdvancedMappingObjectPropertySection.this.cmbSubindex
                        .addSelectionListener(AdvancedMappingObjectPropertySection.this.subIndexListener);
                } else {
                    AdvancedMappingObjectPropertySection.this.cmbSubindex.setEnabled(false);
                    AdvancedMappingObjectPropertySection.this.cmbSubindex.removeAll();
                    AdvancedMappingObjectPropertySection.this.cmbSubindex
                        .setBackground(XDDUtilities
                            .getGrey(AdvancedMappingObjectPropertySection.this.device));
                    AdvancedMappingObjectPropertySection.this.subindexValue = 0;
                    //Find Bitlength of DataType
                    dataTypeSize = Integer.toString(XDDUtilities.getDataType(object.getDataType())
                        .getBitSize());
                    if (!dataTypeSize.contentEquals("0")) { //$NON-NLS-1$
                        dataTypeSize = Long.toString((Long.parseLong(dataTypeSize)) / 8);
                        AdvancedMappingObjectPropertySection.this.txtLength.setText(dataTypeSize);
                        AdvancedMappingObjectPropertySection.this.lengthValue = Long
                            .parseLong(dataTypeSize) * 8;
                        AdvancedMappingObjectPropertySection.this.txtLength.setEnabled(false);
                    } else {
                        AdvancedMappingObjectPropertySection.this.txtLength
                            .setText(Messages.advancedMappingObjectPropertySection_Set_Length);
                        AdvancedMappingObjectPropertySection.this.txtLength.setEnabled(true);
                        AdvancedMappingObjectPropertySection.this.txtLength.setFocus();
                        AdvancedMappingObjectPropertySection.this.txtLength.selectAll();
                    }
                }
                AdvancedMappingObjectPropertySection.this.indexValue = new BigInteger(1,
                    object.getIndex()).intValue();
                AdvancedMappingObjectPropertySection.this.setNewDefaultValue();
                AdvancedMappingObjectPropertySection.this.lblDefaultValueValue
                    .setText(AdvancedMappingObjectPropertySection.this.tsubObject.getDefaultValue());
            } //If selection is not empty!
        } //widgetSelected
    }; //SelectionAdapter
    private long indexValue;
    private CLabel lblDefaultValue;
    private CLabel lblDefaultValueValue;
    private CLabel lblError;

    private CLabel lblIndexValue;

    //When length-Texbox looses focus -> Check values,calculate & set the new defaultvalues
    private final FocusAdapter lengthListener = new FocusAdapter() {
        //On lost focus -> check entered Value and set it / show error
        @Override
        public void focusLost(FocusEvent arg0) {
            Integer length = XDDUtilities
                .parseInt(AdvancedMappingObjectPropertySection.this.txtLength.getText());
            if (length != null && (length >= 0 && length <= 1490)) {
                AdvancedMappingObjectPropertySection.this.lengthValue = length.intValue() * 8;
                AdvancedMappingObjectPropertySection.this.setNewDefaultValue();
            } else {
                AdvancedMappingObjectPropertySection.this.setError(5);
                AdvancedMappingObjectPropertySection.this.txtLength.forceFocus();
                AdvancedMappingObjectPropertySection.this.txtLength.selectAll();
            }
        } //focusLost
    };
    private long lengthValue;
    private long maskIndexValue;
    private long maskLengthValue;
    private long maskOffsetValue;
    private long maskSubindexValue;
    //When Offset-Texbox looses focus -> Check values,calculate & set the new defaultvalues
    private final FocusAdapter offsetListener = new FocusAdapter() {
        @Override
        public void focusLost(FocusEvent arg0) {
            Integer offset = XDDUtilities
                .parseInt(AdvancedMappingObjectPropertySection.this.txtOffset.getText());
            if (offset != null
                && (offset >= 0 && offset <= AdvancedMappingObjectPropertySection.MAX_OFFSET_VALUE)) {
                AdvancedMappingObjectPropertySection.this.setError(0);
                AdvancedMappingObjectPropertySection.this.offsetValue = offset.intValue() * 8;
                AdvancedMappingObjectPropertySection.this.setNewDefaultValue();
            } else {
                AdvancedMappingObjectPropertySection.this.txtOffset.forceFocus();
                AdvancedMappingObjectPropertySection.this.txtOffset.selectAll();
                AdvancedMappingObjectPropertySection.this.setError(3);
            }
        } //focusLost
    }; //FocusAdapter

    private long offsetValue;

    //Shows Mappable Objects and adds subindexListener when object with subobjects is selected
    //also sets lengthfield depending on object,triggers new defaultvalue-calculation
    private final SelectionAdapter subIndexListener = new SelectionAdapter() {

        @Override
        public void widgetSelected(SelectionEvent e) {
            String selection = AdvancedMappingObjectPropertySection.this.cmbSubindex
                .getItem(AdvancedMappingObjectPropertySection.this.cmbSubindex.getSelectionIndex());
            //If selection is made...
            if (!selection.isEmpty()) {
                SubObjectType subobject = AdvancedMappingObjectPropertySection.this.validSubObjectTypes
                    .get(selection);

                String lengthResultString;
                //Check if Empty DataType exists...
                if (subobject.getDataType() != null)
                    lengthResultString = Long
                        .toString((Long.parseLong(Integer.toString(XDDUtilities.getDataType(
                            subobject.getDataType()).getBitSize()))) / 8);
                else
                    lengthResultString = Messages.advancedMappingObjectPropertySection_No_DataType;
                //When there is a valid value
                if (!lengthResultString.contentEquals("0") //$NON-NLS-1$
                    && !lengthResultString
                        .contentEquals(Messages.advancedMappingObjectPropertySection_No_DataType)) {
                    AdvancedMappingObjectPropertySection.this.txtLength.setText(lengthResultString);
                    AdvancedMappingObjectPropertySection.this.txtLength.setEnabled(false);
                    AdvancedMappingObjectPropertySection.this.lengthValue = Long
                        .parseLong(lengthResultString) * 8;
                } else {
                    if (!lengthResultString
                        .equals(Messages.advancedMappingObjectPropertySection_No_DataType))
                        AdvancedMappingObjectPropertySection.this.txtLength
                            .setText(Messages.advancedMappingObjectPropertySection_Set_Length);
                    else
                        AdvancedMappingObjectPropertySection.this.txtLength
                            .setText(lengthResultString);
                    AdvancedMappingObjectPropertySection.this.txtLength.setEnabled(true);
                    AdvancedMappingObjectPropertySection.this.txtLength.setFocus();
                    AdvancedMappingObjectPropertySection.this.txtLength.selectAll();
                }
                AdvancedMappingObjectPropertySection.this.subindexValue = new BigInteger(1,
                    subobject.getSubIndex()).intValue();
                AdvancedMappingObjectPropertySection.this.setNewDefaultValue();
                AdvancedMappingObjectPropertySection.this.lblDefaultValueValue
                    .setText(AdvancedMappingObjectPropertySection.this.tsubObject.getDefaultValue());
            }
        } //widgetSelected
    }; //SelectionAdapter
    private long subindexValue;
    private SubObjectTypeItemProvider subObjectItemProvider;
    private TObjectComposite tobjectComposite;
    private SubObjectType tsubObject;
    private Text txtLength;
    private Text txtOffset;
    private Map<String, SubObjectType> validSubObjectTypes;
    private Set<TObjectPDOMapping> validTObjectMapping;
    private Map<String, TObject> validTObjects;

    //Creates the Checkbox-Buttons and Labels as well as slection listeners for each component
    @Override
    public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
        super.createControls(parent, aTabbedPropertySheetPage);

        Composite composite = super.getWidgetFactory().createFlatFormComposite(parent);
        FormData data;
        this.subObjectItemProvider = new SubObjectTypeItemProvider(this.getAdapterFactory());
        this.maskIndexValue = 0xFFFF;
        this.maskSubindexValue = 0xFF0000;
        this.maskOffsetValue = 0xFFFF00000000L;
        this.maskLengthValue = 0xFFFF000000000000L;
        //STANDARD LABEL:

        //Index Label (from Parent!)
        CLabel lblIndex = this.getWidgetFactory().createCLabel(composite, "Index:"); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(0, 0);
        lblIndex.setLayoutData(data);

        //Index Value (from Parent!)
        this.lblIndexValue = this.getWidgetFactory().createCLabel(
            composite, "                              "); //$NON-NLS-1$
        data = new FormData();
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(80, 0);
        data.top = new FormAttachment(0, 0);
        this.lblIndexValue.setLayoutData(data);

        this.tobjectComposite = new TObjectComposite(composite, 0, this.getAdapterFactory());
        data = new FormData();
        data.top = new FormAttachment(lblIndex, 0);
        this.tobjectComposite.setLayoutData(data);

        //lblDefaultValueValue Label (Actual value)
        this.lblDefaultValueValue = this.getWidgetFactory().createCLabel(
            composite, Messages.advancedMappingObjectPropertySection_No_Value_Set);
        data = new FormData();
        data.top = new FormAttachment(this.tobjectComposite, 0);
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(80, 0);
        this.lblDefaultValueValue.setLayoutData(data);

        //lblDefaultvalue
        this.lblDefaultValue = this.getWidgetFactory().createCLabel(
            composite, Messages.advancedMappingObjectPropertySection_lbl_Default_Value);
        data = new FormData();
        data.top = new FormAttachment(this.tobjectComposite, 0);
        this.lblDefaultValue.setLayoutData(data);

        //MappingobjectIndex label
        CLabel lblMOIndex = this.getWidgetFactory().createCLabel(
            composite, Messages.advancedMappingObjectPropertySection_lbl_MO_Index);
        lblMOIndex.setToolTipText("Index of Mapping Object"); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(this.lblDefaultValue, 0);
        lblMOIndex.setLayoutData(data);

        //SubindexLabel
        CLabel lblSubindex = this.getWidgetFactory().createCLabel(
            composite, Messages.advancedMappingObjectPropertySection_lbl_MO_Subindex);
        lblSubindex.setToolTipText("Subindex of Subobject"); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(lblMOIndex, -5);
        lblSubindex.setLayoutData(data);

        //OffsetLabel
        CLabel lbloffset = this.getWidgetFactory().createCLabel(
            composite, Messages.advancedMappingObjectPropertySection_lbl_Offset);
        data = new FormData();
        data.top = new FormAttachment(lblSubindex, 0);
        lbloffset.setLayoutData(data);

        //Lengthlabel
        CLabel lbllength = this.getWidgetFactory().createCLabel(
            composite, Messages.advancedMappingObjectPropertySection_lbl_Length);
        data = new FormData();
        data.top = new FormAttachment(lbloffset, 0);
        lbllength.setLayoutData(data);

        //Combobox / Textboxen

        this.cmbIndex = this.getWidgetFactory().createCCombo(composite);
        this.cmbIndex
            .setToolTipText(Messages.advancedMappingObjectPropertySection_help_Index_combobox);
        data = new FormData();
        data.top = new FormAttachment(this.lblDefaultValueValue, 0);
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(40, 0);
        this.cmbIndex.setLayoutData(data);
        this.cmbIndex.removeAll();

        this.cmbSubindex = this.getWidgetFactory().createCCombo(composite);
        this.cmbSubindex
            .setToolTipText(Messages.advancedMappingObjectPropertySection_help_subindex_combobox);
        data = new FormData();
        data.top = new FormAttachment(this.cmbIndex, 0);
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(40, 0);
        this.cmbSubindex.setLayoutData(data);
        this.cmbSubindex.removeAll();
        this.cmbSubindex.setEnabled(false);
        this.cmbSubindex.setBackground(XDDUtilities.getGrey(this.device));

        this.txtOffset = this.getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(this.cmbSubindex, 0);
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(40, 0);
        this.txtOffset.setLayoutData(data);
        this.txtOffset.addFocusListener(this.offsetListener);

        //Textbox Lenght
        this.txtLength = this.getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(this.txtOffset, 0);
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(40, 0);
        this.txtLength.setLayoutData(data);
        this.txtLength.addFocusListener(this.lengthListener);

        //Errorlabel
        this.lblError = this.getWidgetFactory().createCLabel(
            composite,
            "This is the initial Error text. This string reserves Space in the composite " //$NON-NLS-1$
                + "\n for further use and implementation of Errors.Must not be translated."); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(lbllength, -5);
        data.left = new FormAttachment(0, 0);
        this.lblError.setForeground(XDDUtilities.getRed(this.device));
        this.lblError.setLayoutData(data);
        this.lblError.setVisible(false);
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
        this.tsubObject = (SubObjectType) input;
        TObject tobject = (TObject) this.tsubObject.eContainer();
        this.tobjectComposite.setObject(this.tsubObject);
        this.indexValue = 0;
        this.subindexValue = 0;
        this.offsetValue = 0;
        this.lengthValue = 0;
        this.setError(0);

        if (XDDUtilities.isRPDO(tobject)) {
            this.validTObjectMapping = XDDUtilities.getValidMappingTypes(TObjectPDOMapping.RPDO);
            this.lblIndexValue.setText("0x"
                + Integer.toHexString(new BigInteger(1, tobject.getIndex()).intValue())
                    .toUpperCase() + " (Object Mapping - RPDO)"); //$NON-NLS-1$
        } else {
            this.validTObjectMapping = XDDUtilities.getValidMappingTypes(TObjectPDOMapping.TPDO);
            this.lblIndexValue.setText("0x"
                + Integer.toHexString(new BigInteger(1, tobject.getIndex()).intValue())
                    .toUpperCase() + " (Object Mapping - TPDO)"); //$NON-NLS-1$
        }

        this.validTObjects = XDDUtilities.getMappingObjects(
            (DocumentRoot) EcoreUtil.getRootContainer((EObject) tobject), this.validTObjectMapping);

        this.cmbIndex.removeAll();
        this.cmbSubindex.removeAll();
        this.txtLength.setText(""); //$NON-NLS-1$
        this.txtOffset.setText(""); //$NON-NLS-1$
        Set<Entry<String, TObject>> validObjectSet = this.validTObjects.entrySet();

        for (Entry<String, TObject> entry : validObjectSet)
            this.cmbIndex.add(entry.getKey());
        if (this.cmbIndex.getItemCount() > 0)
            this.cmbIndex.addSelectionListener(this.indexListener);

        if (this.tsubObject.getDefaultValue() != null)
            try {
                this.lblDefaultValueValue.setText(this.tsubObject.getDefaultValue());
                this.defaultValue = Long.decode(this.tsubObject.getDefaultValue());
                if (this.defaultValue != 0)
                    this.parseDefaultParameters(this.defaultValue);
            } catch (NumberFormatException e) {
                this.setError(9);
            }
    } //setInput

    /**
     * @brief Parses the current default value and sets contents of controls
     *        accordingly.
     * @param currentValue
     *            The current default value of subobject.
     */
    private void parseDefaultParameters(long currentValue) {

        //Extract Index,Subindex,Offset & Length from defaultvalue of tsubObject
        this.lengthValue = (currentValue & this.maskLengthValue) >> 48;
        this.offsetValue = (currentValue & this.maskOffsetValue) >> 32;
        this.subindexValue = (currentValue & this.maskSubindexValue) >> 16;
        this.indexValue = currentValue & this.maskIndexValue;
        long compareTo;
        boolean subObjectset = false;
        boolean tObjectset = false;
        TObject selectedObject = null;
        int j = 0;
        int i = 0;

        if (this.indexValue != 0) { //If IndexValue is set...find the index
            Set<Entry<String, TObject>> tObjectSet = this.validTObjects.entrySet();
            for (Entry<String, TObject> entry : tObjectSet) { //iterate through Objects
                compareTo = new BigInteger(1, entry.getValue().getIndex()).intValue(); // NOPMD by lueckengaj on 29.03.13 11:24
                if (compareTo == this.indexValue) {
                    this.cmbIndex.select(i);
                    selectedObject = entry.getValue();
                    this.setError(0);
                    tObjectset = true;
                    this.validSubObjectTypes = XDDUtilities.getMappingSubObjects(
                        selectedObject, this.validTObjectMapping);
                    break;
                }
                this.setError(2);
                i++;
            } //Index-for

            if (selectedObject != null && tObjectset && !this.validSubObjectTypes.isEmpty()) { //If there are valid Subobjects
                this.validSubObjectTypes = XDDUtilities.getMappingSubObjects(
                    selectedObject, this.validTObjectMapping);
                Set<Entry<String, SubObjectType>> validSubObjecSet = this.validSubObjectTypes
                    .entrySet();
                for (Entry<String, SubObjectType> entry : validSubObjecSet) {

                    compareTo = new BigInteger(1, entry.getValue().getSubIndex()).intValue(); // NOPMD by lueckengaj on 29.03.13 11:24
                    this.cmbSubindex.add(entry.getKey());

                    if (compareTo == this.subindexValue) {
                        this.cmbSubindex.select(j);
                        this.cmbSubindex.setEnabled(true);
                        this.cmbSubindex.setBackground(XDDUtilities.getGrey(this.device));
                        subObjectset = true;
                    }
                    j++;
                }
            } else { //if not...
                this.cmbSubindex.setEnabled(false);
                this.cmbSubindex.setBackground(XDDUtilities.getGrey(this.device));
            }

            if (!tObjectset) //if TObject not set -> Index not found
                this.setError(4);
            else if (this.subindexValue != 0 && !subObjectset)
                this.setError(1);
            else {
                if (this.offsetValue >= 0
                    && this.offsetValue <= AdvancedMappingObjectPropertySection.MAX_OFFSET_VALUE * 8
                    && this.offsetValue % 8 == 0)
                    this.txtOffset.setText(Long.toString(this.offsetValue / 8));
                else {
                    this.setError(3);
                    if (this.offsetValue % 8 != 0) {
                        this.setError(7);
                        this.offsetValue = 0;
                    }
                }
                if (this.lengthValue >= 1 && this.lengthValue <= 1490 * 8
                    && this.lengthValue % 8 == 0)
                    this.txtLength.setText(Long.toString(this.lengthValue / 8));
                else {
                    this.setError(5);
                    if (this.lengthValue % 8 != 0)
                        this.setError(8);
                    this.lengthValue = 8;
                }
                if (this.lengthValue == 0
                    && !(this.offsetValue >= 0 && this.offsetValue <= AdvancedMappingObjectPropertySection.MAX_OFFSET_VALUE * 8))
                    this.setError(6);
            }
        } else
            this.setError(4); //If IndexValue is 0, even if other Values are set!

    } //getDefaultParameter

    /**
     * @brief Sets the different types of error-texts, depending on given value.
     * @param errorNr
     *            Stands for a specific error.
     */
    private void setError(int errorNr) {
        this.lblError.setVisible(true);

        switch (errorNr) {
            case 0:
                this.lblError.setVisible(false);
                break;
            case 1:
                this.lblError
                    .setText(Messages.advancedMappingObjectPropertySection_err_subobject_not_found);
                break;
            case 2:
                this.lblError
                    .setText(Messages.advancedMappingObjectPropertySection_err_mappingObject_not_found);
                break;
            case 3:
                this.lblError.setText(Messages.advancedMappingObjectPropertySection_err_offset);
                break;
            case 4:
                this.lblError
                    .setText(Messages.advancedMappingObjectPropertySection_err_index_not_found);
                break;
            case 5:
                this.lblError.setText(Messages.advancedMappingObjectPropertySection_err_length);
                break;
            case 6:
                this.lblError
                    .setText(Messages.advancedMappingObjectPropertySection_err_length_and_offset);
                break;
            case 7:
                this.lblError.setText(NLS.bind(
                    Messages.advancedMappingObjectPropertySection_err_offset_not_dividable,
                    this.offsetValue, (this.offsetValue % 8)));
                break;
            case 8:
                this.lblError.setText(NLS.bind(
                    Messages.advancedMappingObjectPropertySection_err_length_not_dividable,
                    this.lengthValue, (this.lengthValue % 8)));
                break;
            case 9:
                this.lblError
                    .setText(Messages.advancedMappingObjectPropertySection_err_defaultvalue_not_decodable);
                break;
            default:
                break;
        } //switchcase
    } //setError

    /**
     * @brief Calculates new default value.
     */
    private void setNewDefaultValue() {
        long newSubObjectValue = (this.indexValue) | (this.subindexValue << 16)
            | (this.offsetValue << 32) | (this.lengthValue << 48);
        String newValue = String.format("%016x", newSubObjectValue).toUpperCase(); //$NON-NLS-1$
        newValue = "0x" + newValue; //$NON-NLS-1$
        if (!this.tsubObject.getDefaultValue().contentEquals(newValue)) {
            this.subObjectItemProvider.setPropertyValue(this.tsubObject, "defaultValue", newValue); //$NON-NLS-1$
            this.lblDefaultValueValue.setText(newValue);
        }
    } //setDefaultValue

} //AdvancedMappingObjectPropertySection
