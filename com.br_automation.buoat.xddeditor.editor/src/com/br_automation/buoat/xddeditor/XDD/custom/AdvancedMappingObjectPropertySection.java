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
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
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
    Color grey = new Color(device, 240, 240, 240);
    Color white = new Color(device, 255, 255, 255);
    Color red = new Color(device, 255, 0, 0);

    private Set<TObjectPDOMapping> validTObjectMapping;
    private AdapterFactory adapterFactory;
    private SubObjectTypeItemProvider subObjectItemProvider;

    private CLabel lblDefaultValueValue;
    private CLabel lblSubIndexValue;
    private CLabel lblDefaultValue;
    private CLabel lblIndexValue;
    private CLabel lblerror;
    private CLabel lblNameValue;

    private TObject tobject;
    private SubObjectType tsubObject;

    private HashMap<String, TObject> validTObjects;
    private HashMap<String, SubObjectType> validSubObjectTypes;

    private long indexValue;
    private long subindexValue;
    private long offsetValue;
    private long lengthValue;
    private long defaultValue;

    private CCombo combIndex;
    private CCombo combSubindex;

    private Text txtOffset;
    private Text txtLength;

    //When Offset-Texbox looses focus -> Check values,calculate & set the new defaultvalues
    private FocusAdapter offsetListener = new FocusAdapter() {

        @Override
        public void focusLost(FocusEvent arg0) {
            Integer offset = XDDUtilities.parseInt(txtOffset.getText());
            if (offset != null && (offset >= 0 && offset <= 1489)) {
                setError(0);
                offsetValue = offset.intValue() * 8;
                setNewDefaultValue();
            } else {
                txtOffset.forceFocus();
                txtOffset.selectAll();
                setError(3);
            }
        }//focusLost

    };//FocusAdapter

    //Shows Mappable Objects and adds subindexListener when object with subobjects is selected
    //also sets lengthfield depending on object,triggers new defaultvalue-calculation
    private SelectionAdapter subIndexListener = new SelectionAdapter() {

        @Override
        public void widgetSelected(SelectionEvent e) {
            String selection = combSubindex.getItem(combSubindex.getSelectionIndex());
            //If selection is made...
            if (!selection.isEmpty()) {
                SubObjectType subobject = validSubObjectTypes.get(selection);

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
                    txtLength.setText(lengthResultString);
                    txtLength.setEnabled(false);
                    lengthValue = Long.parseLong(lengthResultString) * 8;
                } else {
                    if (lengthResultString != Messages.AdvancedMappingObjectPropertySection_No_DataType)
                        txtLength.setText(Messages.AdvancedMappingObjectPropertySection_Set_Length);
                    else
                        txtLength.setText(lengthResultString);
                    txtLength.setEnabled(true);
                    txtLength.setFocus();
                    txtLength.selectAll();
                }
                subindexValue = new BigInteger(1, subobject.getSubIndex()).intValue();
                setNewDefaultValue();
                lblDefaultValueValue.setText(tsubObject.getDefaultValue());
            }
        }//widgetSelected
    };//SelectionAdapter

    //When length-Texbox looses focus -> Check values,calculate & set the new defaultvalues
    private FocusAdapter lengthlistener = new FocusAdapter() {

        @Override
        public void focusLost(FocusEvent arg0) {
            Integer length = XDDUtilities.parseInt(txtLength.getText());
            if (length != null && (length >= 0 && length <= 1490)) {
                //                lblInvalid.setVisible(false);
                lengthValue = length.intValue() * 8;
                setNewDefaultValue();
            } else {
                setError(5);
                txtLength.forceFocus();
                txtLength.selectAll();
                //                lblInvalid.setVisible(true);
            }
        }//focusLost

    };

    //Shows mappable subobjects, sets Lengthfield,triggers new defaultvalue-calculation
    private SelectionAdapter indexListener = new SelectionAdapter() {

        @Override
        public void widgetSelected(SelectionEvent e) {
            String selection = combIndex.getItem(combIndex.getSelectionIndex());
            TObject object;
            setError(0);
            String dataTypeSize;

            if (!selection.isEmpty()) {
                //choose the right object in the list...
                object = validTObjects.get(selection);

                //If Subobjects NOT empty...modify the Subindex-Combobox
                if (!object.getSubObject().isEmpty()) {
                    //Get Subobjects & Enable Combobox
                    validSubObjectTypes = XDDUtilities.getMappingSubObjects(
                        object, validTObjectMapping);
                    combSubindex.setEnabled(true);
                    combSubindex.setBackground(white);
                    combSubindex.removeAll();

                    //Fill Comobobox
                    Set<Entry<String, SubObjectType>> subobjectSet = validSubObjectTypes.entrySet();
                    for (Entry<String, SubObjectType> entry : subobjectSet)
                        combSubindex.add(entry.getKey());

                    //Set Text-Instructions
                    txtLength.setText(Messages.AdvancedMappingObjectPropertySection_Set_Subindex);
                    txtLength.setEnabled(false);
                    txtLength.setEditable(true);
                    //Add Listener to subObjectCombobox
                    combSubindex.addSelectionListener(subIndexListener);
                } else {
                    combSubindex.setEnabled(false);
                    combSubindex.removeAll();
                    combSubindex.setBackground(grey);
                    subindexValue = 0;
                    //Bitlänge anhand DatenTyp herausfinden
                    dataTypeSize = XDDUtilities.getDataTypeSize(object.getDataType());
                    if (!dataTypeSize.contentEquals("0")) { //$NON-NLS-1$
                        dataTypeSize = Long.toString((Long.parseLong(dataTypeSize)) / 8);
                        txtLength.setText(dataTypeSize);
                        lengthValue = Long.parseLong(dataTypeSize) * 8;
                        txtLength.setEnabled(false);
                    } else {
                        txtLength.setText(Messages.AdvancedMappingObjectPropertySection_Set_Length);
                        txtLength.setEnabled(true);
                        txtLength.setFocus();
                        txtLength.selectAll();
                    }

                }
                indexValue = new BigInteger(1, object.getIndex()).intValue();
                setNewDefaultValue();
                lblDefaultValueValue.setText(tsubObject.getDefaultValue());
            }//If selection is not empty!

        }//widgetSelected

    };//SelectionAdapter

    //Creates the Checkbox-Buttons and Labels as well as slection listeners for each component
    @Override
    public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
        super.createControls(parent, aTabbedPropertySheetPage);

        Composite composite = super.getWidgetFactory().createFlatFormComposite(parent);
        FormData data;
        subObjectItemProvider = new SubObjectTypeItemProvider(getAdapterFactory());

        //STANDARD LABEL:

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

        //Index Label (from Parent!)
        CLabel lblIndex = getWidgetFactory().createCLabel(composite, "Index:"); //$NON-NLS-1$
        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(lblNameValue, 2);
        data.top = new FormAttachment(lblName, -5);
        lblIndex.setLayoutData(data);

        //Index Value (from Parent!)
        lblIndexValue = getWidgetFactory().createCLabel(composite, "       "); //$NON-NLS-1$
        data = new FormData();
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(80, 0);
        data.top = new FormAttachment(lblNameValue, -5);
        lblIndexValue.setLayoutData(data);

        //SubIndex Label
        CLabel lblSubIndex = getWidgetFactory().createCLabel(composite, "Subindex:"); //$NON-NLS-1$
        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.top = new FormAttachment(lblIndex, -5);
        lblSubIndex.setLayoutData(data);

        //SubIndex Value
        lblSubIndexValue = getWidgetFactory().createCLabel(composite, "    "); //$NON-NLS-1$
        data = new FormData();
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(80, 0);
        data.top = new FormAttachment(lblIndexValue, -5);
        lblSubIndexValue.setLayoutData(data);

        //lblDefaultValueValue Label (Actual value)
        lblDefaultValueValue = getWidgetFactory().createCLabel(
            composite, Messages.AdvancedMappingObjectPropertySection_No_Value_Set);
        data = new FormData();
        data.top = new FormAttachment(lblSubIndexValue, -5);
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(80, 0);
        lblDefaultValueValue.setLayoutData(data);

        //lblDefaultvalue
        lblDefaultValue = getWidgetFactory().createCLabel(
            composite, Messages.AdvancedMappingObjectPropertySection_lbl_Default_Value);
        data = new FormData();
        data.top = new FormAttachment(lblSubIndex, -5);
        lblDefaultValue.setLayoutData(data);

        //MappingobjectIndex label
        CLabel lblMOIndex = getWidgetFactory().createCLabel(
            composite, Messages.AdvancedMappingObjectPropertySection_lbl_MO_Index);
        lblMOIndex.setToolTipText("Index of Mapping Object"); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(lblDefaultValue, -5);
        lblMOIndex.setLayoutData(data);

        //SubindexLabel
        CLabel lblSubindex = getWidgetFactory().createCLabel(
            composite, Messages.AdvancedMappingObjectPropertySection_lbl_MO_Subindex);
        lblSubindex.setToolTipText("Subindex of Subobject"); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(lblMOIndex, -5);
        lblSubindex.setLayoutData(data);

        //OffsetLabel
        CLabel lbloffset = getWidgetFactory().createCLabel(
            composite, Messages.AdvancedMappingObjectPropertySection_lbl_Offset);
        data = new FormData();
        data.top = new FormAttachment(lblSubindex, 0);
        lbloffset.setLayoutData(data);

        //Lengthlabel
        CLabel lbllength = getWidgetFactory().createCLabel(
            composite, Messages.AdvancedMappingObjectPropertySection_lbl_Length);
        data = new FormData();
        data.top = new FormAttachment(lbloffset, 0);
        lbllength.setLayoutData(data);

        //Combobox / Textboxen

        combIndex = getWidgetFactory().createCCombo(composite);
        combIndex.setToolTipText(Messages.AdvancedMappingObjectPropertySection_help_Index_combobox);
        data = new FormData();
        data.top = new FormAttachment(lblDefaultValueValue, 0);
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(40, 0);
        combIndex.setLayoutData(data);
        combIndex.removeAll();

        combSubindex = getWidgetFactory().createCCombo(composite);
        combSubindex
            .setToolTipText(Messages.AdvancedMappingObjectPropertySection_help_subindex_combobox);
        data = new FormData();
        data.top = new FormAttachment(combIndex, 0);
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(40, 0);
        combSubindex.setLayoutData(data);
        combSubindex.removeAll();
        combSubindex.setEnabled(false);
        combSubindex.setBackground(grey);

        txtOffset = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(combSubindex, 0);
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(40, 0);
        txtOffset.setLayoutData(data);
        txtOffset.addFocusListener(offsetListener);

        //Textbox Lenght
        txtLength = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(txtOffset, 0);
        data.left = new FormAttachment(0, AbstractPropertySection.STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(40, 0);
        txtLength.setLayoutData(data);
        txtLength.addFocusListener(lengthlistener);

        //Errorlabel
        lblerror = getWidgetFactory().createCLabel(
            composite,
            "This is the initial Error text. This string reserves Space in the composite " //$NON-NLS-1$
                + "\n for further use and implementation of Errors.Must not be translated."); //$NON-NLS-1$
        data = new FormData();
        data.top = new FormAttachment(lbllength, -5);
        data.left = new FormAttachment(0, 0);
        lblerror.setForeground(red);
        lblerror.setLayoutData(data);
        lblerror.setVisible(false);

    }//createControls

    //Sets the current input of the workbench and maps the actual default value to objects
    @Override
    public void setInput(IWorkbenchPart part, ISelection selection) {

        super.setInput(part, selection);
        Object input = ((IStructuredSelection) selection).getFirstElement();
        tsubObject = (SubObjectType) input;
        tobject = (TObject) tsubObject.eContainer();

        lblNameValue.setText(new String(tsubObject.getName()));
        String result = new BigInteger(1, tobject.getIndex()).toString(16);
        lblIndexValue.setText(result.toUpperCase());

        indexValue = 0;
        subindexValue = 0;
        offsetValue = 0;
        lengthValue = 0;
        setError(0);

        if (tsubObject.getSubIndex() != null) {
            result = new BigInteger(1, tsubObject.getSubIndex()).toString(16);
            lblSubIndexValue.setText(result.toUpperCase());
        }

        if (XDDUtilities.isRPDO(tobject)) {
            validTObjectMapping = XDDUtilities.getValidMappingTypes(TObjectPDOMapping.RPDO);
            lblIndexValue.setText(lblIndexValue.getText() + " (RPDO)"); //$NON-NLS-1$
        } else {
            validTObjectMapping = XDDUtilities.getValidMappingTypes(TObjectPDOMapping.TPDO);
            lblIndexValue.setText(lblIndexValue.getText() + " (TPDO)"); //$NON-NLS-1$
        }

        validTObjects = XDDUtilities.getMappingObjects(
            (DocumentRoot) EcoreUtil.getRootContainer(tobject), validTObjectMapping);

        combIndex.removeAll();
        combSubindex.removeAll();
        txtLength.setText(""); //$NON-NLS-1$
        txtOffset.setText(""); //$NON-NLS-1$
        Set<Entry<String, TObject>> validObjectSet = validTObjects.entrySet();

        for (Entry<String, TObject> entry : validObjectSet)
            combIndex.add(entry.getKey());
        if (combIndex.getItemCount() > 0)
            combIndex.addSelectionListener(indexListener);

        if (tsubObject.getDefaultValue() != null)
            try {
                lblDefaultValueValue.setText(tsubObject.getDefaultValue());
                defaultValue = Long.decode(tsubObject.getDefaultValue());
                if (defaultValue != 0)
                    getDefaultParameters(defaultValue);
            } catch (NumberFormatException e) {
                setError(9);
            }

    }//setInput

    //Calculates the new Defaultvalue by bitshifing. If changes are made the setPropertyMethod (isDirty) is triggered
    private void setNewDefaultValue() {
        long newSubObjectValue = (indexValue) | (subindexValue << 16) | (offsetValue << 32)
            | (lengthValue << 48);
        String newValue = String.format("%016x", newSubObjectValue).toUpperCase(); //$NON-NLS-1$
        newValue = "0x" + newValue; //$NON-NLS-1$
        if (!tsubObject.getDefaultValue().contentEquals(newValue)) {
            subObjectItemProvider.setPropertyValue(tsubObject, "defaultValue", newValue); //$NON-NLS-1$
            lblDefaultValueValue.setText(newValue);
            //            StatusBarWriter.writeToStatus("Value changed!", false);
        }
    }//setDefaultValue

    //Gets the Parameters from the setted Defaultvalue and handles errors of wrong Defaultvalues
    private void getDefaultParameters(long oldDefaultValue) {
        //Extract Index,Subindex,Offset & Length from defaultvalue of tsubObject
        lengthValue = (oldDefaultValue >> 48);
        oldDefaultValue -= lengthValue << 48;

        offsetValue = (oldDefaultValue >> 32);
        oldDefaultValue -= offsetValue << 32;

        subindexValue = oldDefaultValue >> 16;
        oldDefaultValue -= subindexValue << 16;

        indexValue = oldDefaultValue;
        oldDefaultValue -= indexValue;

        long compareTo;
        boolean subObjectset = false;
        boolean tObjectset = false;
        TObject selectedObject = null;
        int i1 = 0, i = 0;

        if (indexValue != 0) {
            //If IndexValue is set...find the index
            Set<Entry<String, TObject>> tObjectSet = validTObjects.entrySet();
            for (Entry<String, TObject> entry : tObjectSet) { //iterate through Objects
                compareTo = new BigInteger(1, entry.getValue().getIndex()).intValue();
                if (compareTo == indexValue) {
                    combIndex.select(i);
                    selectedObject = entry.getValue();
                    setError(0);
                    tObjectset = true;
                    break;
                }
                setError(2);
                i++;
            }//Index-for

            if (selectedObject != null && subindexValue != 0 && tObjectset) {
                validSubObjectTypes = XDDUtilities.getMappingSubObjects(
                    selectedObject, validTObjectMapping);
                Set<Entry<String, SubObjectType>> validSubObjecSet = validSubObjectTypes.entrySet();
                for (Entry<String, SubObjectType> entry : validSubObjecSet) {

                    compareTo = new BigInteger(1, entry.getValue().getSubIndex()).intValue();
                    combSubindex.add(entry.getKey());

                    if (compareTo == subindexValue) {
                        combSubindex.select(i1);
                        combSubindex.setEnabled(true);
                        combSubindex.setBackground(white);
                        subObjectset = true;
                    }
                    i1++;
                }
            }

            if (!tObjectset) //if TObject not set -> Index not found
                setError(4);
            else if (subindexValue != 0 && !subObjectset)
                setError(1);
            else {
                if (offsetValue >= 0 && offsetValue <= 1489 * 8 && offsetValue % 8 == 0)
                    txtOffset.setText(Long.toString(offsetValue / 8));
                else {
                    setError(3);
                    if (offsetValue % 8 != 0) {
                        setError(7);
                        offsetValue = 0;
                    }
                }
                if (lengthValue >= 1 && lengthValue <= 1490 * 8 && lengthValue % 8 == 0)
                    txtLength.setText(Long.toString(lengthValue / 8));
                else {
                    setError(5);
                    if (lengthValue % 8 != 0)
                        setError(8);
                    lengthValue = 8;
                }
                if (lengthValue == 0 && !(offsetValue >= 0 && offsetValue <= 1489 * 8))
                    setError(6);
            }

        } else
            setError(4); //If IndexValue is 0, even if other Values are set!

    }//getDefaultParameter

    //sets the different types of error-texts to lblerror depending on the integer-value
    private void setError(int errorNr) {
        lblerror.setVisible(true);

        switch (errorNr) {
            case 0:
                lblerror.setVisible(false);
                break;
            case 1:
                lblerror
                    .setText(Messages.AdvancedMappingObjectPropertySection_err_subobject_not_found);
                break;
            case 2:
                lblerror
                    .setText(Messages.AdvancedMappingObjectPropertySection_err_mappingObject_not_found);
                break;
            case 3:
                lblerror.setText(Messages.AdvancedMappingObjectPropertySection_err_offset);
                break;
            case 4:
                lblerror.setText(Messages.AdvancedMappingObjectPropertySection_err_index_not_found);
                break;
            case 5:
                lblerror.setText(Messages.AdvancedMappingObjectPropertySection_err_length);
                break;
            case 6:
                lblerror
                    .setText(Messages.AdvancedMappingObjectPropertySection_err_length_and_offset);
            case 7:
                lblerror
                    .setText(Messages.AdvancedMappingObjectPropertySection_err_offset_not_dividable_1
                        + (offsetValue)
                        + Messages.AdvancedMappingObjectPropertySection_err_offset_not_dividable_2
                        + offsetValue
                        % 8
                        + Messages.AdvancedMappingObjectPropertySection_err_offset_not_dividable_3);
                break;
            case 8:
                lblerror
                    .setText(Messages.AdvancedMappingObjectPropertySection_err_length_not_dividable_1
                        + (lengthValue)
                        + Messages.AdvancedMappingObjectPropertySection_err_length_not_dividable_2
                        + lengthValue
                        % 8
                        + Messages.AdvancedMappingObjectPropertySection_err_length_not_dividable_3);
                break;
            case 9:
                lblerror
                    .setText(Messages.AdvancedMappingObjectPropertySection_err_defaultvalue_not_decodable);
            default:

                break;
        }//switchcase
    }//setError

    //Taken from EEFAdvancedPropertySection
    public IPropertySource getPropertySource(Object object) {
        if (getAdapterFactory() != null) {
            IItemPropertySource item = (IItemPropertySource) getAdapterFactory().adapt(
                object, IItemPropertySource.class);
            if (item != null)
                return new PropertySource(object, item);
        }
        return null;
    }//getPropertySource

    //Taken from EEFAdvancedPropertySection
    public AdapterFactory getAdapterFactory() {
        if (adapterFactory == null)
            adapterFactory = EEFRuntimePlugin.getDefault().getAdapterFactory();
        return adapterFactory;
    }//getAdapterFactory
}//AdvancedMappingObjectPropertySection

