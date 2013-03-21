package com.br_automation.buoat.xddeditor.XDD.custom;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
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
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.SubObjectType;
import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.TObjectPDOMapping;
import com.br_automation.buoat.xddeditor.XDD.provider.SubObjectTypeItemProvider;

//AdvancedMappingObjectPropertySection shows the Section for Mappable Subobjects
//with index-parent 1600 or 1A00. Default-Value calculations
public class AdvancedMappingObjectPropertySection extends AbstractPropertySection {

    Device device = Display.getCurrent();

    long maskIndexValue;
    long maskLengthValue;

    long maskOffsetValue;
    long maskSubindexValue;

    private AdapterFactory adapterFactory;
    private CCombo combIndex;
    private CCombo combSubindex;
    private long defaultValue;
    //Shows mappable subobjects, sets Lengthfield,triggers new defaultvalue-calculation
    private SelectionAdapter indexListener = new SelectionAdapter() {

        @Override
        public void widgetSelected(SelectionEvent e) {
            String selection = AdvancedMappingObjectPropertySection.this.combIndex
                .getItem(AdvancedMappingObjectPropertySection.this.combIndex.getSelectionIndex());
            TObject object;
            AdvancedMappingObjectPropertySection.this.setError(0);
            String dataTypeSize;

            if (!selection.isEmpty()) {
                //choose the right object in the list...
                object = AdvancedMappingObjectPropertySection.this.validTObjects.get(selection);

                //If Subobjects NOT empty...modify the Subindex-Combobox
                if (!object.getSubObject().isEmpty()) {
                    //Get Subobjects & Enable Combobox
                    AdvancedMappingObjectPropertySection.this.validSubObjectTypes = XDDUtilities
                        .getMappingSubObjects(
                            object, AdvancedMappingObjectPropertySection.this.validTObjectMapping);
                    AdvancedMappingObjectPropertySection.this.combSubindex.setEnabled(true);
                    AdvancedMappingObjectPropertySection.this.combSubindex
                        .setBackground(XDDUtilities
                            .getWhite(AdvancedMappingObjectPropertySection.this.device));
                    AdvancedMappingObjectPropertySection.this.combSubindex.removeAll();

                    //Fill Comobobox
                    Set<Entry<String, SubObjectType>> subobjectSet = AdvancedMappingObjectPropertySection.this.validSubObjectTypes
                        .entrySet();
                    for (Entry<String, SubObjectType> entry : subobjectSet)
                        AdvancedMappingObjectPropertySection.this.combSubindex.add(entry.getKey());

                    //Set Text-Instructions
                    AdvancedMappingObjectPropertySection.this.txtLength
                        .setText(Messages.AdvancedMappingObjectPropertySection_Set_Subindex);
                    AdvancedMappingObjectPropertySection.this.txtLength.setEnabled(false);
                    //Add Listener to subObjectCombobox
                    AdvancedMappingObjectPropertySection.this.combSubindex
                        .addSelectionListener(AdvancedMappingObjectPropertySection.this.subIndexListener);
                } else {
                    AdvancedMappingObjectPropertySection.this.combSubindex.setEnabled(false);
                    AdvancedMappingObjectPropertySection.this.combSubindex.removeAll();
                    AdvancedMappingObjectPropertySection.this.combSubindex
                        .setBackground(XDDUtilities
                            .getGrey(AdvancedMappingObjectPropertySection.this.device));
                    AdvancedMappingObjectPropertySection.this.subindexValue = 0;
                    //Bitlänge anhand DatenTyp herausfinden
                    dataTypeSize = XDDUtilities.getDataTypeSize(object.getDataType());
                    if (!dataTypeSize.contentEquals("0")) { //$NON-NLS-1$
                        dataTypeSize = Long.toString((Long.parseLong(dataTypeSize)) / 8);
                        AdvancedMappingObjectPropertySection.this.txtLength.setText(dataTypeSize);
                        AdvancedMappingObjectPropertySection.this.lengthValue = Long
                            .parseLong(dataTypeSize) * 8;
                        AdvancedMappingObjectPropertySection.this.txtLength.setEnabled(false);
                    } else {
                        AdvancedMappingObjectPropertySection.this.txtLength
                            .setText(Messages.AdvancedMappingObjectPropertySection_Set_Length);
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
            }//If selection is not empty!

        }//widgetSelected

    };//SelectionAdapter

    private long indexValue;
    private CLabel lblDefaultValue;

    private CLabel lblDefaultValueValue;
    private CLabel lblerror;

    private CLabel lblIndexValue;

    private CLabel lblNameValue;
    private CLabel lblSubIndexValue;

    //When length-Texbox looses focus -> Check values,calculate & set the new defaultvalues
    private FocusAdapter lengthlistener = new FocusAdapter() {

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
        }//focusLost

    };

    private long lengthValue;

    //When Offset-Texbox looses focus -> Check values,calculate & set the new defaultvalues
    private FocusAdapter offsetListener = new FocusAdapter() {

        @Override
        public void focusLost(FocusEvent arg0) {
            Integer offset = XDDUtilities
                .parseInt(AdvancedMappingObjectPropertySection.this.txtOffset.getText());
            if (offset != null && (offset >= 0 && offset <= 1489)) {
                AdvancedMappingObjectPropertySection.this.setError(0);
                AdvancedMappingObjectPropertySection.this.offsetValue = offset.intValue() * 8;
                AdvancedMappingObjectPropertySection.this.setNewDefaultValue();
            } else {
                AdvancedMappingObjectPropertySection.this.txtOffset.forceFocus();
                AdvancedMappingObjectPropertySection.this.txtOffset.selectAll();
                AdvancedMappingObjectPropertySection.this.setError(3);
            }
        }//focusLost

    };//FocusAdapter
    private long offsetValue;
    //Shows Mappable Objects and adds subindexListener when object with subobjects is selected
    //also sets lengthfield depending on object,triggers new defaultvalue-calculation
    private SelectionAdapter subIndexListener = new SelectionAdapter() {

        @Override
        public void widgetSelected(SelectionEvent e) {
            String selection = AdvancedMappingObjectPropertySection.this.combSubindex
                .getItem(AdvancedMappingObjectPropertySection.this.combSubindex.getSelectionIndex());
            //If selection is made...
            if (!selection.isEmpty()) {
                SubObjectType subobject = AdvancedMappingObjectPropertySection.this.validSubObjectTypes
                    .get(selection);

                String lengthResultString;
                //Check if Empty DataType exists...
                if (subobject.getDataType() != null)
                    lengthResultString = Long.toString(((Long.parseLong((XDDUtilities
                        .getDataTypeSize(subobject.getDataType())))) / 8));
                else
                    lengthResultString = Messages.AdvancedMappingObjectPropertySection_No_DataType;
                //When there is a valid value
                if (!lengthResultString.contentEquals("0") //$NON-NLS-1$
                    && !lengthResultString
                        .contentEquals(Messages.AdvancedMappingObjectPropertySection_No_DataType)) {
                    AdvancedMappingObjectPropertySection.this.txtLength.setText(lengthResultString);
                    AdvancedMappingObjectPropertySection.this.txtLength.setEnabled(false);
                    AdvancedMappingObjectPropertySection.this.lengthValue = Long
                        .parseLong(lengthResultString) * 8;
                } else {
                    if (!lengthResultString
                        .equals(Messages.AdvancedMappingObjectPropertySection_No_DataType))
                        AdvancedMappingObjectPropertySection.this.txtLength
                            .setText(Messages.AdvancedMappingObjectPropertySection_Set_Length);
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
        }//widgetSelected
    };//SelectionAdapter

    private long subindexValue;
    private SubObjectTypeItemProvider subObjectItemProvider;
    private TObject tobject;
    private SubObjectType tsubObject;
    private Text txtLength;
    private Text txtOffset;
    private HashMap<String, SubObjectType> validSubObjectTypes;

    private Set<TObjectPDOMapping> validTObjectMapping;
    private HashMap<String, TObject> validTObjects;

    //Creates the Checkbox-Buttons and Labels as well as slection listeners for each component
    @Override
    public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
        super.createControls(parent, aTabbedPropertySheetPage);

        Composite composite = super.getWidgetFactory().createFlatFormComposite(parent);
        FormData data;
        this.subObjectItemProvider = new SubObjectTypeItemProvider(this.getAdapterFactory());
        this.maskIndexValue = Long.parseLong("FFFF", 16);
        this.maskSubindexValue = Long.parseLong("FF0000", 16);
        this.maskOffsetValue = Long.parseLong("FFFF00000000", 16);
        this.maskLengthValue = Long.parseLong("FFF000000000000", 16); //Long doesnt support "FFF000000000000"
        //STANDARD LABEL:

        this.lblNameValue = this.getWidgetFactory().createCLabel(
            composite, "                                            "); //$NON-NLS-1$
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

        //Index Label (from Parent!)
        CLabel lblIndex = this.getWidgetFactory().createCLabel(composite, "Index:"); //$NON-NLS-1$
        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(this.lblNameValue, 2);
        data.top = new FormAttachment(lblName, -5);
        lblIndex.setLayoutData(data);

        //Index Value (from Parent!)
        this.lblIndexValue = this.getWidgetFactory().createCLabel(composite, "       "); //$NON-NLS-1$
        data = new FormData();
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(80, 0);
        data.top = new FormAttachment(this.lblNameValue, -5);
        this.lblIndexValue.setLayoutData(data);

        //SubIndex Label
        CLabel lblSubIndex = this.getWidgetFactory().createCLabel(composite, "Subindex:"); //$NON-NLS-1$
        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.top = new FormAttachment(lblIndex, -5);
        lblSubIndex.setLayoutData(data);

        //SubIndex Value
        this.lblSubIndexValue = this.getWidgetFactory().createCLabel(composite, "    "); //$NON-NLS-1$
        data = new FormData();
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(80, 0);
        data.top = new FormAttachment(this.lblIndexValue, -5);
        this.lblSubIndexValue.setLayoutData(data);

        //lblDefaultValueValue Label (Actual value)
        this.lblDefaultValueValue = this.getWidgetFactory().createCLabel(
            composite, Messages.AdvancedMappingObjectPropertySection_No_Value_Set);
        data = new FormData();
        data.top = new FormAttachment(this.lblSubIndexValue, -5);
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(80, 0);
        this.lblDefaultValueValue.setLayoutData(data);

        //lblDefaultvalue
        this.lblDefaultValue = this.getWidgetFactory().createCLabel(
            composite, Messages.AdvancedMappingObjectPropertySection_lbl_Default_Value);
        data = new FormData();
        data.top = new FormAttachment(lblSubIndex, -5);
        this.lblDefaultValue.setLayoutData(data);

        //MappingobjectIndex label
        CLabel lblMOIndex = this.getWidgetFactory().createCLabel(
            composite, Messages.AdvancedMappingObjectPropertySection_lbl_MO_Index);
        lblMOIndex.setToolTipText("Index of Mapping Object"); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(this.lblDefaultValue, -5);
        lblMOIndex.setLayoutData(data);

        //SubindexLabel
        CLabel lblSubindex = this.getWidgetFactory().createCLabel(
            composite, Messages.AdvancedMappingObjectPropertySection_lbl_MO_Subindex);
        lblSubindex.setToolTipText("Subindex of Subobject"); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(lblMOIndex, -5);
        lblSubindex.setLayoutData(data);

        //OffsetLabel
        CLabel lbloffset = this.getWidgetFactory().createCLabel(
            composite, Messages.AdvancedMappingObjectPropertySection_lbl_Offset);
        data = new FormData();
        data.top = new FormAttachment(lblSubindex, 0);
        lbloffset.setLayoutData(data);

        //Lengthlabel
        CLabel lbllength = this.getWidgetFactory().createCLabel(
            composite, Messages.AdvancedMappingObjectPropertySection_lbl_Length);
        data = new FormData();
        data.top = new FormAttachment(lbloffset, 0);
        lbllength.setLayoutData(data);

        //Combobox / Textboxen

        this.combIndex = this.getWidgetFactory().createCCombo(composite);
        this.combIndex
            .setToolTipText(Messages.AdvancedMappingObjectPropertySection_help_Index_combobox);
        data = new FormData();
        data.top = new FormAttachment(this.lblDefaultValueValue, 0);
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(40, 0);
        this.combIndex.setLayoutData(data);
        this.combIndex.removeAll();

        this.combSubindex = this.getWidgetFactory().createCCombo(composite);
        this.combSubindex
            .setToolTipText(Messages.AdvancedMappingObjectPropertySection_help_subindex_combobox);
        data = new FormData();
        data.top = new FormAttachment(this.combIndex, 0);
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(40, 0);
        this.combSubindex.setLayoutData(data);
        this.combSubindex.removeAll();
        this.combSubindex.setEnabled(false);
        this.combSubindex.setBackground(XDDUtilities.getGrey(this.device));

        this.txtOffset = this.getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(this.combSubindex, 0);
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
        this.txtLength.addFocusListener(this.lengthlistener);

        //Errorlabel
        this.lblerror = this.getWidgetFactory().createCLabel(
            composite,
            "This is the initial Error text. This string reserves Space in the composite " //$NON-NLS-1$
                + "\n for further use and implementation of Errors.Must not be translated."); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(lbllength, -5);
        data.left = new FormAttachment(0, 0);
        this.lblerror.setForeground(XDDUtilities.getRed(this.device));
        this.lblerror.setLayoutData(data);
        this.lblerror.setVisible(false);

    }//createControls

    //Taken from EEFAdvancedPropertySection
    public AdapterFactory getAdapterFactory() {
        if (this.adapterFactory == null)
            this.adapterFactory = EEFRuntimePlugin.getDefault().getAdapterFactory();
        return this.adapterFactory;
    }//getAdapterFactory

    //Taken from EEFAdvancedPropertySection
    public IPropertySource getPropertySource(Object object) {
        if (this.getAdapterFactory() != null) {
            IItemPropertySource item = (IItemPropertySource) this.getAdapterFactory().adapt(
                object, IItemPropertySource.class);
            if (item != null)
                return new PropertySource(object, item);
        }
        return null;
    }//getPropertySource

    //Sets the current input of the workbench and maps the actual default value to objects
    @Override
    public void setInput(IWorkbenchPart part, ISelection selection) {

        super.setInput(part, selection);
        Object input = ((IStructuredSelection) selection).getFirstElement();
        this.tsubObject = (SubObjectType) input;

        this.tobject = (TObject) this.tsubObject.eContainer();

        this.lblNameValue.setText(new String(this.tsubObject.getName()));
        String result = new BigInteger(1, this.tobject.getIndex()).toString(16);
        this.lblIndexValue.setText(result.toUpperCase());

        this.indexValue = 0;
        this.subindexValue = 0;
        this.offsetValue = 0;
        this.lengthValue = 0;
        this.setError(0);

        if (this.tsubObject.getSubIndex() != null) {
            result = new BigInteger(1, this.tsubObject.getSubIndex()).toString(16);
            this.lblSubIndexValue.setText(result.toUpperCase());
        }

        if (XDDUtilities.isRPDO(this.tobject)) {
            this.validTObjectMapping = XDDUtilities.getValidMappingTypes(TObjectPDOMapping.RPDO);
            this.lblIndexValue.setText(this.lblIndexValue.getText() + " (RPDO)"); //$NON-NLS-1$
        } else {
            this.validTObjectMapping = XDDUtilities.getValidMappingTypes(TObjectPDOMapping.TPDO);
            this.lblIndexValue.setText(this.lblIndexValue.getText() + " (TPDO)"); //$NON-NLS-1$
        }

        this.validTObjects = XDDUtilities.getMappingObjects(
            (DocumentRoot) EcoreUtil.getRootContainer(this.tobject), this.validTObjectMapping);

        this.combIndex.removeAll();
        this.combSubindex.removeAll();
        this.txtLength.setText(""); //$NON-NLS-1$
        this.txtOffset.setText(""); //$NON-NLS-1$
        Set<Entry<String, TObject>> validObjectSet = this.validTObjects.entrySet();

        for (Entry<String, TObject> entry : validObjectSet)
            this.combIndex.add(entry.getKey());
        if (this.combIndex.getItemCount() > 0)
            this.combIndex.addSelectionListener(this.indexListener);

        if (this.tsubObject.getDefaultValue() != null)
            try {
                this.lblDefaultValueValue.setText(this.tsubObject.getDefaultValue());
                this.defaultValue = Long.decode(this.tsubObject.getDefaultValue());
                if (this.defaultValue != 0)
                    this.getDefaultParameters(this.defaultValue);
            } catch (NumberFormatException e) {
                this.setError(9);
            }

    }//setInput

    //Gets the Parameters from the setted Defaultvalue and handles errors of wrong Defaultvalues
    private void getDefaultParameters(long oldDefaultValue) {

        //Extract Index,Subindex,Offset & Length from defaultvalue of tsubObject
        this.lengthValue = (oldDefaultValue & this.maskLengthValue) >> 48;
        this.offsetValue = (oldDefaultValue & this.maskOffsetValue) >> 32;
        this.subindexValue = (oldDefaultValue & this.maskSubindexValue) >> 16;
        this.indexValue = oldDefaultValue & this.maskIndexValue;

        long compareTo;
        boolean subObjectset = false;
        boolean tObjectset = false;
        TObject selectedObject = null;
        int i1 = 0, i = 0;

        if (this.indexValue != 0) {
            //If IndexValue is set...find the index
            Set<Entry<String, TObject>> tObjectSet = this.validTObjects.entrySet();
            for (Entry<String, TObject> entry : tObjectSet) { //iterate through Objects
                compareTo = new BigInteger(1, entry.getValue().getIndex()).intValue();
                if (compareTo == this.indexValue) {
                    this.combIndex.select(i);
                    selectedObject = entry.getValue();
                    this.setError(0);
                    tObjectset = true;
                    this.validSubObjectTypes = XDDUtilities.getMappingSubObjects(
                        selectedObject, this.validTObjectMapping);
                    break;
                }
                this.setError(2);
                i++;
            }//Index-for

            if (selectedObject != null && tObjectset && !this.validSubObjectTypes.isEmpty()) {
                this.validSubObjectTypes = XDDUtilities.getMappingSubObjects(
                    selectedObject, this.validTObjectMapping);
                Set<Entry<String, SubObjectType>> validSubObjecSet = this.validSubObjectTypes
                    .entrySet();
                for (Entry<String, SubObjectType> entry : validSubObjecSet) {

                    compareTo = new BigInteger(1, entry.getValue().getSubIndex()).intValue();
                    this.combSubindex.add(entry.getKey());

                    if (compareTo == this.subindexValue) {
                        this.combSubindex.select(i1);
                        this.combSubindex.setEnabled(true);
                        this.combSubindex.setBackground(XDDUtilities.getGrey(this.device));
                        subObjectset = true;
                    }
                    i1++;
                }
            } else {
                this.combSubindex.setEnabled(false);
                this.combSubindex.setBackground(XDDUtilities.getGrey(this.device));
            }

            if (!tObjectset) //if TObject not set -> Index not found
                this.setError(4);
            else if (this.subindexValue != 0 && !subObjectset)
                this.setError(1);
            else {
                if (this.offsetValue >= 0 && this.offsetValue <= 1489 * 8
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
                    && !(this.offsetValue >= 0 && this.offsetValue <= 1489 * 8))
                    this.setError(6);
            }

        } else
            this.setError(4); //If IndexValue is 0, even if other Values are set!

    }//getDefaultParameter

    //sets the different types of error-texts to lblerror depending on the integer-value
    private void setError(int errorNr) {
        this.lblerror.setVisible(true);

        switch (errorNr) {
            case 0:
                this.lblerror.setVisible(false);
                break;
            case 1:
                this.lblerror
                    .setText(Messages.AdvancedMappingObjectPropertySection_err_subobject_not_found);
                break;
            case 2:
                this.lblerror
                    .setText(Messages.AdvancedMappingObjectPropertySection_err_mappingObject_not_found);
                break;
            case 3:
                this.lblerror.setText(Messages.AdvancedMappingObjectPropertySection_err_offset);
                break;
            case 4:
                this.lblerror
                    .setText(Messages.AdvancedMappingObjectPropertySection_err_index_not_found);
                break;
            case 5:
                this.lblerror.setText(Messages.AdvancedMappingObjectPropertySection_err_length);
                break;
            case 6:
                this.lblerror
                    .setText(Messages.AdvancedMappingObjectPropertySection_err_length_and_offset);
            case 7:
                this.lblerror.setText(NLS.bind(
                    Messages.AdvancedMappingObjectPropertySection_err_offset_not_dividable,
                    this.offsetValue, (this.offsetValue % 8)));
                break;
            case 8:
                this.lblerror.setText(NLS.bind(
                    Messages.AdvancedMappingObjectPropertySection_err_length_not_dividable,
                    this.lengthValue, (this.lengthValue % 8)));
                break;
            case 9:
                this.lblerror
                    .setText(Messages.AdvancedMappingObjectPropertySection_err_defaultvalue_not_decodable);
            default:

                break;
        }//switchcase
    }//setError

    //Calculates the new defaultvalue by Bitshifing. If changes are made the setPropertyMethod (isDirty) is triggered
    private void setNewDefaultValue() {
        long newSubObjectValue = (this.indexValue) | (this.subindexValue << 16)
            | (this.offsetValue << 32) | (this.lengthValue << 48);
        String newValue = String.format("%016x", newSubObjectValue).toUpperCase(); //$NON-NLS-1$
        newValue = "0x" + newValue; //$NON-NLS-1$
        if (!this.tsubObject.getDefaultValue().contentEquals(newValue)) {
            this.subObjectItemProvider.setPropertyValue(this.tsubObject, "defaultValue", newValue); //$NON-NLS-1$
            this.lblDefaultValueValue.setText(newValue);
        }
    }//setDefaultValue
}//AdvancedMappingObjectPropertySection

