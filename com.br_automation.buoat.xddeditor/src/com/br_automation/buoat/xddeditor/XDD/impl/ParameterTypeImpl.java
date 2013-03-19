/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.AccessType;
import com.br_automation.buoat.xddeditor.XDD.DescriptionRefType;
import com.br_automation.buoat.xddeditor.XDD.DescriptionType;
import com.br_automation.buoat.xddeditor.XDD.LabelRefType;
import com.br_automation.buoat.xddeditor.XDD.LabelType;
import com.br_automation.buoat.xddeditor.XDD.ParameterType;
import com.br_automation.buoat.xddeditor.XDD.SupportType;
import com.br_automation.buoat.xddeditor.XDD.TAllowedValues;
import com.br_automation.buoat.xddeditor.XDD.TConditionalSupport;
import com.br_automation.buoat.xddeditor.XDD.TDataTypeIDRef;
import com.br_automation.buoat.xddeditor.XDD.TDenotation;
import com.br_automation.buoat.xddeditor.XDD.TProperty;
import com.br_automation.buoat.xddeditor.XDD.TUnit;
import com.br_automation.buoat.xddeditor.XDD.TValue;
import com.br_automation.buoat.xddeditor.XDD.TVariableRef;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Parameter Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getGroup
 * <em>Group</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getLabel
 * <em>Label</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getDescription
 * <em>Description</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getLabelRef
 * <em>Label Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getDescriptionRef
 * <em>Description Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getBOOL
 * <em>BOOL</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getBITSTRING
 * <em>BITSTRING</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getBYTE
 * <em>BYTE</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getCHAR
 * <em>CHAR</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getWORD
 * <em>WORD</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getDWORD
 * <em>DWORD</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getLWORD
 * <em>LWORD</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getSINT
 * <em>SINT</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getINT
 * <em>INT</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getDINT
 * <em>DINT</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getLINT
 * <em>LINT</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getUSINT
 * <em>USINT</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getUINT
 * <em>UINT</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getUDINT
 * <em>UDINT</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getULINT
 * <em>ULINT</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getREAL
 * <em>REAL</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getLREAL
 * <em>LREAL</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getSTRING
 * <em>STRING</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getWSTRING
 * <em>WSTRING</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getDataTypeIDRef
 * <em>Data Type ID Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getVariableRef
 * <em>Variable Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getConditionalSupport
 * <em>Conditional Support</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getDenotation
 * <em>Denotation</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getActualValue
 * <em>Actual Value</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getDefaultValue
 * <em>Default Value</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getSubstituteValue
 * <em>Substitute Value</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getAllowedValues
 * <em>Allowed Values</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getUnit
 * <em>Unit</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getProperty
 * <em>Property</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getAccess
 * <em>Access</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getAccessList
 * <em>Access List</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getMultiplier
 * <em>Multiplier</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getOffset
 * <em>Offset</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#isPersistent
 * <em>Persistent</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getSupport
 * <em>Support</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getTemplateIDRef
 * <em>Template ID Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.ParameterTypeImpl#getUniqueID
 * <em>Unique ID</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ParameterTypeImpl extends EObjectImpl implements ParameterType {
    /**
     * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap group;

    /**
     * The cached value of the '{@link #getBOOL() <em>BOOL</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getBOOL()
     * @generated
     * @ordered
     */
    protected EObject bOOL;

    /**
     * The cached value of the '{@link #getBITSTRING() <em>BITSTRING</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getBITSTRING()
     * @generated
     * @ordered
     */
    protected EObject bITSTRING;

    /**
     * The cached value of the '{@link #getBYTE() <em>BYTE</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getBYTE()
     * @generated
     * @ordered
     */
    protected EObject bYTE;

    /**
     * The cached value of the '{@link #getCHAR() <em>CHAR</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getCHAR()
     * @generated
     * @ordered
     */
    protected EObject cHAR;

    /**
     * The cached value of the '{@link #getWORD() <em>WORD</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getWORD()
     * @generated
     * @ordered
     */
    protected EObject wORD;

    /**
     * The cached value of the '{@link #getDWORD() <em>DWORD</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getDWORD()
     * @generated
     * @ordered
     */
    protected EObject dWORD;

    /**
     * The cached value of the '{@link #getLWORD() <em>LWORD</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLWORD()
     * @generated
     * @ordered
     */
    protected EObject lWORD;

    /**
     * The cached value of the '{@link #getSINT() <em>SINT</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSINT()
     * @generated
     * @ordered
     */
    protected EObject sINT;

    /**
     * The cached value of the '{@link #getINT() <em>INT</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getINT()
     * @generated
     * @ordered
     */
    protected EObject iNT;

    /**
     * The cached value of the '{@link #getDINT() <em>DINT</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getDINT()
     * @generated
     * @ordered
     */
    protected EObject dINT;

    /**
     * The cached value of the '{@link #getLINT() <em>LINT</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLINT()
     * @generated
     * @ordered
     */
    protected EObject lINT;

    /**
     * The cached value of the '{@link #getUSINT() <em>USINT</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getUSINT()
     * @generated
     * @ordered
     */
    protected EObject uSINT;

    /**
     * The cached value of the '{@link #getUINT() <em>UINT</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getUINT()
     * @generated
     * @ordered
     */
    protected EObject uINT;

    /**
     * The cached value of the '{@link #getUDINT() <em>UDINT</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getUDINT()
     * @generated
     * @ordered
     */
    protected EObject uDINT;

    /**
     * The cached value of the '{@link #getULINT() <em>ULINT</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getULINT()
     * @generated
     * @ordered
     */
    protected EObject uLINT;

    /**
     * The cached value of the '{@link #getREAL() <em>REAL</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getREAL()
     * @generated
     * @ordered
     */
    protected EObject rEAL;

    /**
     * The cached value of the '{@link #getLREAL() <em>LREAL</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLREAL()
     * @generated
     * @ordered
     */
    protected EObject lREAL;

    /**
     * The cached value of the '{@link #getSTRING() <em>STRING</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSTRING()
     * @generated
     * @ordered
     */
    protected EObject sTRING;

    /**
     * The cached value of the '{@link #getWSTRING() <em>WSTRING</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getWSTRING()
     * @generated
     * @ordered
     */
    protected EObject wSTRING;

    /**
     * The cached value of the '{@link #getDataTypeIDRef()
     * <em>Data Type ID Ref</em>}' containment reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getDataTypeIDRef()
     * @generated
     * @ordered
     */
    protected TDataTypeIDRef dataTypeIDRef;

    /**
     * The cached value of the '{@link #getVariableRef() <em>Variable Ref</em>}'
     * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getVariableRef()
     * @generated
     * @ordered
     */
    protected EList<TVariableRef> variableRef;

    /**
     * The cached value of the '{@link #getConditionalSupport()
     * <em>Conditional Support</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getConditionalSupport()
     * @generated
     * @ordered
     */
    protected EList<TConditionalSupport> conditionalSupport;

    /**
     * The cached value of the '{@link #getDenotation() <em>Denotation</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getDenotation()
     * @generated
     * @ordered
     */
    protected TDenotation denotation;

    /**
     * The cached value of the '{@link #getActualValue() <em>Actual Value</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getActualValue()
     * @generated
     * @ordered
     */
    protected TValue actualValue;

    /**
     * The cached value of the '{@link #getDefaultValue()
     * <em>Default Value</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
    protected TValue defaultValue;

    /**
     * The cached value of the '{@link #getSubstituteValue()
     * <em>Substitute Value</em>}' containment reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getSubstituteValue()
     * @generated
     * @ordered
     */
    protected TValue substituteValue;

    /**
     * The cached value of the '{@link #getAllowedValues()
     * <em>Allowed Values</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getAllowedValues()
     * @generated
     * @ordered
     */
    protected TAllowedValues allowedValues;

    /**
     * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getUnit()
     * @generated
     * @ordered
     */
    protected TUnit unit;

    /**
     * The cached value of the '{@link #getProperty() <em>Property</em>}'
     * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getProperty()
     * @generated
     * @ordered
     */
    protected EList<TProperty> property;

    /**
     * The default value of the '{@link #getAccess() <em>Access</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getAccess()
     * @generated
     * @ordered
     */
    protected static final AccessType ACCESS_EDEFAULT = AccessType.READ;

    /**
     * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getAccess()
     * @generated
     * @ordered
     */
    protected AccessType access = ACCESS_EDEFAULT;

    /**
     * This is true if the Access attribute has been set. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean accessESet;

    /**
     * The default value of the '{@link #getAccessList() <em>Access List</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getAccessList()
     * @generated
     * @ordered
     */
    protected static final List<String> ACCESS_LIST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAccessList() <em>Access List</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getAccessList()
     * @generated
     * @ordered
     */
    protected List<String> accessList = ACCESS_LIST_EDEFAULT;

    /**
     * The default value of the '{@link #getMultiplier() <em>Multiplier</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getMultiplier()
     * @generated
     * @ordered
     */
    protected static final String MULTIPLIER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMultiplier() <em>Multiplier</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getMultiplier()
     * @generated
     * @ordered
     */
    protected String multiplier = MULTIPLIER_EDEFAULT;

    /**
     * The default value of the '{@link #getOffset() <em>Offset</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getOffset()
     * @generated
     * @ordered
     */
    protected static final String OFFSET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getOffset()
     * @generated
     * @ordered
     */
    protected String offset = OFFSET_EDEFAULT;

    /**
     * The default value of the '{@link #isPersistent() <em>Persistent</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #isPersistent()
     * @generated
     * @ordered
     */
    protected static final boolean PERSISTENT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isPersistent() <em>Persistent</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #isPersistent()
     * @generated
     * @ordered
     */
    protected boolean persistent = PERSISTENT_EDEFAULT;

    /**
     * This is true if the Persistent attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean persistentESet;

    /**
     * The default value of the '{@link #getSupport() <em>Support</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSupport()
     * @generated
     * @ordered
     */
    protected static final SupportType SUPPORT_EDEFAULT = SupportType.MANDATORY;

    /**
     * The cached value of the '{@link #getSupport() <em>Support</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSupport()
     * @generated
     * @ordered
     */
    protected SupportType support = SUPPORT_EDEFAULT;

    /**
     * This is true if the Support attribute has been set. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    protected boolean supportESet;

    /**
     * The default value of the '{@link #getTemplateIDRef()
     * <em>Template ID Ref</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getTemplateIDRef()
     * @generated
     * @ordered
     */
    protected static final String TEMPLATE_ID_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTemplateIDRef()
     * <em>Template ID Ref</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getTemplateIDRef()
     * @generated
     * @ordered
     */
    protected String templateIDRef = TEMPLATE_ID_REF_EDEFAULT;

    /**
     * The default value of the '{@link #getUniqueID() <em>Unique ID</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getUniqueID()
     * @generated
     * @ordered
     */
    protected static final String UNIQUE_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUniqueID() <em>Unique ID</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getUniqueID()
     * @generated
     * @ordered
     */
    protected String uniqueID = UNIQUE_ID_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ParameterTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getParameterType();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, XDDPackage.PARAMETER_TYPE__GROUP);
        }
        return group;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<LabelType> getLabel() {
        return getGroup().list(XDDPackage.eINSTANCE.getParameterType_Label());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<DescriptionType> getDescription() {
        return getGroup().list(XDDPackage.eINSTANCE.getParameterType_Description());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<LabelRefType> getLabelRef() {
        return getGroup().list(XDDPackage.eINSTANCE.getParameterType_LabelRef());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<DescriptionRefType> getDescriptionRef() {
        return getGroup().list(XDDPackage.eINSTANCE.getParameterType_DescriptionRef());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EObject getBOOL() {
        return bOOL;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetBOOL(EObject newBOOL, NotificationChain msgs) {
        EObject oldBOOL = bOOL;
        bOOL = newBOOL;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__BOOL, oldBOOL, newBOOL);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setBOOL(EObject newBOOL) {
        if (newBOOL != bOOL) {
            NotificationChain msgs = null;
            if (bOOL != null)
                msgs = ((InternalEObject) bOOL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__BOOL, null, msgs);
            if (newBOOL != null)
                msgs = ((InternalEObject) newBOOL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__BOOL, null, msgs);
            msgs = basicSetBOOL(newBOOL, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PARAMETER_TYPE__BOOL,
                newBOOL, newBOOL));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EObject getBITSTRING() {
        return bITSTRING;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetBITSTRING(EObject newBITSTRING, NotificationChain msgs) {
        EObject oldBITSTRING = bITSTRING;
        bITSTRING = newBITSTRING;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__BITSTRING, oldBITSTRING, newBITSTRING);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setBITSTRING(EObject newBITSTRING) {
        if (newBITSTRING != bITSTRING) {
            NotificationChain msgs = null;
            if (bITSTRING != null)
                msgs = ((InternalEObject) bITSTRING).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__BITSTRING, null, msgs);
            if (newBITSTRING != null)
                msgs = ((InternalEObject) newBITSTRING).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__BITSTRING, null, msgs);
            msgs = basicSetBITSTRING(newBITSTRING, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__BITSTRING, newBITSTRING, newBITSTRING));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EObject getBYTE() {
        return bYTE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetBYTE(EObject newBYTE, NotificationChain msgs) {
        EObject oldBYTE = bYTE;
        bYTE = newBYTE;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__BYTE, oldBYTE, newBYTE);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setBYTE(EObject newBYTE) {
        if (newBYTE != bYTE) {
            NotificationChain msgs = null;
            if (bYTE != null)
                msgs = ((InternalEObject) bYTE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__BYTE, null, msgs);
            if (newBYTE != null)
                msgs = ((InternalEObject) newBYTE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__BYTE, null, msgs);
            msgs = basicSetBYTE(newBYTE, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PARAMETER_TYPE__BYTE,
                newBYTE, newBYTE));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EObject getCHAR() {
        return cHAR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetCHAR(EObject newCHAR, NotificationChain msgs) {
        EObject oldCHAR = cHAR;
        cHAR = newCHAR;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__CHAR, oldCHAR, newCHAR);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setCHAR(EObject newCHAR) {
        if (newCHAR != cHAR) {
            NotificationChain msgs = null;
            if (cHAR != null)
                msgs = ((InternalEObject) cHAR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__CHAR, null, msgs);
            if (newCHAR != null)
                msgs = ((InternalEObject) newCHAR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__CHAR, null, msgs);
            msgs = basicSetCHAR(newCHAR, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PARAMETER_TYPE__CHAR,
                newCHAR, newCHAR));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EObject getWORD() {
        return wORD;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetWORD(EObject newWORD, NotificationChain msgs) {
        EObject oldWORD = wORD;
        wORD = newWORD;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__WORD, oldWORD, newWORD);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setWORD(EObject newWORD) {
        if (newWORD != wORD) {
            NotificationChain msgs = null;
            if (wORD != null)
                msgs = ((InternalEObject) wORD).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__WORD, null, msgs);
            if (newWORD != null)
                msgs = ((InternalEObject) newWORD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__WORD, null, msgs);
            msgs = basicSetWORD(newWORD, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PARAMETER_TYPE__WORD,
                newWORD, newWORD));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EObject getDWORD() {
        return dWORD;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetDWORD(EObject newDWORD, NotificationChain msgs) {
        EObject oldDWORD = dWORD;
        dWORD = newDWORD;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__DWORD, oldDWORD, newDWORD);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setDWORD(EObject newDWORD) {
        if (newDWORD != dWORD) {
            NotificationChain msgs = null;
            if (dWORD != null)
                msgs = ((InternalEObject) dWORD).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__DWORD, null, msgs);
            if (newDWORD != null)
                msgs = ((InternalEObject) newDWORD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__DWORD, null, msgs);
            msgs = basicSetDWORD(newDWORD, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PARAMETER_TYPE__DWORD,
                newDWORD, newDWORD));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EObject getLWORD() {
        return lWORD;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetLWORD(EObject newLWORD, NotificationChain msgs) {
        EObject oldLWORD = lWORD;
        lWORD = newLWORD;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__LWORD, oldLWORD, newLWORD);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setLWORD(EObject newLWORD) {
        if (newLWORD != lWORD) {
            NotificationChain msgs = null;
            if (lWORD != null)
                msgs = ((InternalEObject) lWORD).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__LWORD, null, msgs);
            if (newLWORD != null)
                msgs = ((InternalEObject) newLWORD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__LWORD, null, msgs);
            msgs = basicSetLWORD(newLWORD, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PARAMETER_TYPE__LWORD,
                newLWORD, newLWORD));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EObject getSINT() {
        return sINT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetSINT(EObject newSINT, NotificationChain msgs) {
        EObject oldSINT = sINT;
        sINT = newSINT;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__SINT, oldSINT, newSINT);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setSINT(EObject newSINT) {
        if (newSINT != sINT) {
            NotificationChain msgs = null;
            if (sINT != null)
                msgs = ((InternalEObject) sINT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__SINT, null, msgs);
            if (newSINT != null)
                msgs = ((InternalEObject) newSINT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__SINT, null, msgs);
            msgs = basicSetSINT(newSINT, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PARAMETER_TYPE__SINT,
                newSINT, newSINT));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EObject getINT() {
        return iNT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetINT(EObject newINT, NotificationChain msgs) {
        EObject oldINT = iNT;
        iNT = newINT;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__INT, oldINT, newINT);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setINT(EObject newINT) {
        if (newINT != iNT) {
            NotificationChain msgs = null;
            if (iNT != null)
                msgs = ((InternalEObject) iNT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__INT, null, msgs);
            if (newINT != null)
                msgs = ((InternalEObject) newINT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__INT, null, msgs);
            msgs = basicSetINT(newINT, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PARAMETER_TYPE__INT,
                newINT, newINT));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EObject getDINT() {
        return dINT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetDINT(EObject newDINT, NotificationChain msgs) {
        EObject oldDINT = dINT;
        dINT = newDINT;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__DINT, oldDINT, newDINT);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setDINT(EObject newDINT) {
        if (newDINT != dINT) {
            NotificationChain msgs = null;
            if (dINT != null)
                msgs = ((InternalEObject) dINT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__DINT, null, msgs);
            if (newDINT != null)
                msgs = ((InternalEObject) newDINT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__DINT, null, msgs);
            msgs = basicSetDINT(newDINT, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PARAMETER_TYPE__DINT,
                newDINT, newDINT));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EObject getLINT() {
        return lINT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetLINT(EObject newLINT, NotificationChain msgs) {
        EObject oldLINT = lINT;
        lINT = newLINT;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__LINT, oldLINT, newLINT);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setLINT(EObject newLINT) {
        if (newLINT != lINT) {
            NotificationChain msgs = null;
            if (lINT != null)
                msgs = ((InternalEObject) lINT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__LINT, null, msgs);
            if (newLINT != null)
                msgs = ((InternalEObject) newLINT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__LINT, null, msgs);
            msgs = basicSetLINT(newLINT, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PARAMETER_TYPE__LINT,
                newLINT, newLINT));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EObject getUSINT() {
        return uSINT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetUSINT(EObject newUSINT, NotificationChain msgs) {
        EObject oldUSINT = uSINT;
        uSINT = newUSINT;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__USINT, oldUSINT, newUSINT);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setUSINT(EObject newUSINT) {
        if (newUSINT != uSINT) {
            NotificationChain msgs = null;
            if (uSINT != null)
                msgs = ((InternalEObject) uSINT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__USINT, null, msgs);
            if (newUSINT != null)
                msgs = ((InternalEObject) newUSINT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__USINT, null, msgs);
            msgs = basicSetUSINT(newUSINT, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PARAMETER_TYPE__USINT,
                newUSINT, newUSINT));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EObject getUINT() {
        return uINT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetUINT(EObject newUINT, NotificationChain msgs) {
        EObject oldUINT = uINT;
        uINT = newUINT;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__UINT, oldUINT, newUINT);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setUINT(EObject newUINT) {
        if (newUINT != uINT) {
            NotificationChain msgs = null;
            if (uINT != null)
                msgs = ((InternalEObject) uINT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__UINT, null, msgs);
            if (newUINT != null)
                msgs = ((InternalEObject) newUINT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__UINT, null, msgs);
            msgs = basicSetUINT(newUINT, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PARAMETER_TYPE__UINT,
                newUINT, newUINT));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EObject getUDINT() {
        return uDINT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetUDINT(EObject newUDINT, NotificationChain msgs) {
        EObject oldUDINT = uDINT;
        uDINT = newUDINT;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__UDINT, oldUDINT, newUDINT);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setUDINT(EObject newUDINT) {
        if (newUDINT != uDINT) {
            NotificationChain msgs = null;
            if (uDINT != null)
                msgs = ((InternalEObject) uDINT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__UDINT, null, msgs);
            if (newUDINT != null)
                msgs = ((InternalEObject) newUDINT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__UDINT, null, msgs);
            msgs = basicSetUDINT(newUDINT, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PARAMETER_TYPE__UDINT,
                newUDINT, newUDINT));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EObject getULINT() {
        return uLINT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetULINT(EObject newULINT, NotificationChain msgs) {
        EObject oldULINT = uLINT;
        uLINT = newULINT;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__ULINT, oldULINT, newULINT);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setULINT(EObject newULINT) {
        if (newULINT != uLINT) {
            NotificationChain msgs = null;
            if (uLINT != null)
                msgs = ((InternalEObject) uLINT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__ULINT, null, msgs);
            if (newULINT != null)
                msgs = ((InternalEObject) newULINT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__ULINT, null, msgs);
            msgs = basicSetULINT(newULINT, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PARAMETER_TYPE__ULINT,
                newULINT, newULINT));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EObject getREAL() {
        return rEAL;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetREAL(EObject newREAL, NotificationChain msgs) {
        EObject oldREAL = rEAL;
        rEAL = newREAL;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__REAL, oldREAL, newREAL);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setREAL(EObject newREAL) {
        if (newREAL != rEAL) {
            NotificationChain msgs = null;
            if (rEAL != null)
                msgs = ((InternalEObject) rEAL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__REAL, null, msgs);
            if (newREAL != null)
                msgs = ((InternalEObject) newREAL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__REAL, null, msgs);
            msgs = basicSetREAL(newREAL, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PARAMETER_TYPE__REAL,
                newREAL, newREAL));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EObject getLREAL() {
        return lREAL;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetLREAL(EObject newLREAL, NotificationChain msgs) {
        EObject oldLREAL = lREAL;
        lREAL = newLREAL;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__LREAL, oldLREAL, newLREAL);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setLREAL(EObject newLREAL) {
        if (newLREAL != lREAL) {
            NotificationChain msgs = null;
            if (lREAL != null)
                msgs = ((InternalEObject) lREAL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__LREAL, null, msgs);
            if (newLREAL != null)
                msgs = ((InternalEObject) newLREAL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__LREAL, null, msgs);
            msgs = basicSetLREAL(newLREAL, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PARAMETER_TYPE__LREAL,
                newLREAL, newLREAL));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EObject getSTRING() {
        return sTRING;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetSTRING(EObject newSTRING, NotificationChain msgs) {
        EObject oldSTRING = sTRING;
        sTRING = newSTRING;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__STRING, oldSTRING, newSTRING);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setSTRING(EObject newSTRING) {
        if (newSTRING != sTRING) {
            NotificationChain msgs = null;
            if (sTRING != null)
                msgs = ((InternalEObject) sTRING).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__STRING, null, msgs);
            if (newSTRING != null)
                msgs = ((InternalEObject) newSTRING).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__STRING, null, msgs);
            msgs = basicSetSTRING(newSTRING, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__STRING, newSTRING, newSTRING));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EObject getWSTRING() {
        return wSTRING;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetWSTRING(EObject newWSTRING, NotificationChain msgs) {
        EObject oldWSTRING = wSTRING;
        wSTRING = newWSTRING;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__WSTRING, oldWSTRING, newWSTRING);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setWSTRING(EObject newWSTRING) {
        if (newWSTRING != wSTRING) {
            NotificationChain msgs = null;
            if (wSTRING != null)
                msgs = ((InternalEObject) wSTRING).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__WSTRING, null, msgs);
            if (newWSTRING != null)
                msgs = ((InternalEObject) newWSTRING).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__WSTRING, null, msgs);
            msgs = basicSetWSTRING(newWSTRING, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__WSTRING, newWSTRING, newWSTRING));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TDataTypeIDRef getDataTypeIDRef() {
        return dataTypeIDRef;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetDataTypeIDRef(TDataTypeIDRef newDataTypeIDRef,
        NotificationChain msgs) {
        TDataTypeIDRef oldDataTypeIDRef = dataTypeIDRef;
        dataTypeIDRef = newDataTypeIDRef;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__DATA_TYPE_ID_REF, oldDataTypeIDRef, newDataTypeIDRef);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setDataTypeIDRef(TDataTypeIDRef newDataTypeIDRef) {
        if (newDataTypeIDRef != dataTypeIDRef) {
            NotificationChain msgs = null;
            if (dataTypeIDRef != null)
                msgs = ((InternalEObject) dataTypeIDRef).eInverseRemove(
                    this, EOPPOSITE_FEATURE_BASE - XDDPackage.PARAMETER_TYPE__DATA_TYPE_ID_REF,
                    null, msgs);
            if (newDataTypeIDRef != null)
                msgs = ((InternalEObject) newDataTypeIDRef).eInverseAdd(
                    this, EOPPOSITE_FEATURE_BASE - XDDPackage.PARAMETER_TYPE__DATA_TYPE_ID_REF,
                    null, msgs);
            msgs = basicSetDataTypeIDRef(newDataTypeIDRef, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__DATA_TYPE_ID_REF, newDataTypeIDRef, newDataTypeIDRef));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<TVariableRef> getVariableRef() {
        if (variableRef == null) {
            variableRef = new EObjectContainmentEList<TVariableRef>(TVariableRef.class, this,
                XDDPackage.PARAMETER_TYPE__VARIABLE_REF);
        }
        return variableRef;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<TConditionalSupport> getConditionalSupport() {
        if (conditionalSupport == null) {
            conditionalSupport = new EObjectContainmentEList<TConditionalSupport>(
                TConditionalSupport.class, this, XDDPackage.PARAMETER_TYPE__CONDITIONAL_SUPPORT);
        }
        return conditionalSupport;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TDenotation getDenotation() {
        return denotation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetDenotation(TDenotation newDenotation, NotificationChain msgs) {
        TDenotation oldDenotation = denotation;
        denotation = newDenotation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__DENOTATION, oldDenotation, newDenotation);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setDenotation(TDenotation newDenotation) {
        if (newDenotation != denotation) {
            NotificationChain msgs = null;
            if (denotation != null)
                msgs = ((InternalEObject) denotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__DENOTATION, null, msgs);
            if (newDenotation != null)
                msgs = ((InternalEObject) newDenotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__DENOTATION, null, msgs);
            msgs = basicSetDenotation(newDenotation, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__DENOTATION, newDenotation, newDenotation));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TValue getActualValue() {
        return actualValue;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetActualValue(TValue newActualValue, NotificationChain msgs) {
        TValue oldActualValue = actualValue;
        actualValue = newActualValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__ACTUAL_VALUE, oldActualValue, newActualValue);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setActualValue(TValue newActualValue) {
        if (newActualValue != actualValue) {
            NotificationChain msgs = null;
            if (actualValue != null)
                msgs = ((InternalEObject) actualValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__ACTUAL_VALUE, null, msgs);
            if (newActualValue != null)
                msgs = ((InternalEObject) newActualValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__ACTUAL_VALUE, null, msgs);
            msgs = basicSetActualValue(newActualValue, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__ACTUAL_VALUE, newActualValue, newActualValue));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TValue getDefaultValue() {
        return defaultValue;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetDefaultValue(TValue newDefaultValue, NotificationChain msgs) {
        TValue oldDefaultValue = defaultValue;
        defaultValue = newDefaultValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setDefaultValue(TValue newDefaultValue) {
        if (newDefaultValue != defaultValue) {
            NotificationChain msgs = null;
            if (defaultValue != null)
                msgs = ((InternalEObject) defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__DEFAULT_VALUE, null, msgs);
            if (newDefaultValue != null)
                msgs = ((InternalEObject) newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__DEFAULT_VALUE, null, msgs);
            msgs = basicSetDefaultValue(newDefaultValue, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TValue getSubstituteValue() {
        return substituteValue;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetSubstituteValue(TValue newSubstituteValue,
        NotificationChain msgs) {
        TValue oldSubstituteValue = substituteValue;
        substituteValue = newSubstituteValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__SUBSTITUTE_VALUE, oldSubstituteValue, newSubstituteValue);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setSubstituteValue(TValue newSubstituteValue) {
        if (newSubstituteValue != substituteValue) {
            NotificationChain msgs = null;
            if (substituteValue != null)
                msgs = ((InternalEObject) substituteValue).eInverseRemove(
                    this, EOPPOSITE_FEATURE_BASE - XDDPackage.PARAMETER_TYPE__SUBSTITUTE_VALUE,
                    null, msgs);
            if (newSubstituteValue != null)
                msgs = ((InternalEObject) newSubstituteValue).eInverseAdd(
                    this, EOPPOSITE_FEATURE_BASE - XDDPackage.PARAMETER_TYPE__SUBSTITUTE_VALUE,
                    null, msgs);
            msgs = basicSetSubstituteValue(newSubstituteValue, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__SUBSTITUTE_VALUE, newSubstituteValue, newSubstituteValue));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TAllowedValues getAllowedValues() {
        return allowedValues;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetAllowedValues(TAllowedValues newAllowedValues,
        NotificationChain msgs) {
        TAllowedValues oldAllowedValues = allowedValues;
        allowedValues = newAllowedValues;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__ALLOWED_VALUES, oldAllowedValues, newAllowedValues);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setAllowedValues(TAllowedValues newAllowedValues) {
        if (newAllowedValues != allowedValues) {
            NotificationChain msgs = null;
            if (allowedValues != null)
                msgs = ((InternalEObject) allowedValues).eInverseRemove(
                    this, EOPPOSITE_FEATURE_BASE - XDDPackage.PARAMETER_TYPE__ALLOWED_VALUES, null,
                    msgs);
            if (newAllowedValues != null)
                msgs = ((InternalEObject) newAllowedValues).eInverseAdd(
                    this, EOPPOSITE_FEATURE_BASE - XDDPackage.PARAMETER_TYPE__ALLOWED_VALUES, null,
                    msgs);
            msgs = basicSetAllowedValues(newAllowedValues, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__ALLOWED_VALUES, newAllowedValues, newAllowedValues));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TUnit getUnit() {
        return unit;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetUnit(TUnit newUnit, NotificationChain msgs) {
        TUnit oldUnit = unit;
        unit = newUnit;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__UNIT, oldUnit, newUnit);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setUnit(TUnit newUnit) {
        if (newUnit != unit) {
            NotificationChain msgs = null;
            if (unit != null)
                msgs = ((InternalEObject) unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__UNIT, null, msgs);
            if (newUnit != null)
                msgs = ((InternalEObject) newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                    - XDDPackage.PARAMETER_TYPE__UNIT, null, msgs);
            msgs = basicSetUnit(newUnit, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.PARAMETER_TYPE__UNIT,
                newUnit, newUnit));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<TProperty> getProperty() {
        if (property == null) {
            property = new EObjectContainmentEList<TProperty>(TProperty.class, this,
                XDDPackage.PARAMETER_TYPE__PROPERTY);
        }
        return property;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public AccessType getAccess() {
        return access;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setAccess(AccessType newAccess) {
        AccessType oldAccess = access;
        access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
        boolean oldAccessESet = accessESet;
        accessESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__ACCESS, oldAccess, access, !oldAccessESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetAccess() {
        AccessType oldAccess = access;
        boolean oldAccessESet = accessESet;
        access = ACCESS_EDEFAULT;
        accessESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.PARAMETER_TYPE__ACCESS, oldAccess, ACCESS_EDEFAULT, oldAccessESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetAccess() {
        return accessESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public List<String> getAccessList() {
        return accessList;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setAccessList(List<String> newAccessList) {
        List<String> oldAccessList = accessList;
        accessList = newAccessList;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__ACCESS_LIST, oldAccessList, accessList));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getMultiplier() {
        return multiplier;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setMultiplier(String newMultiplier) {
        String oldMultiplier = multiplier;
        multiplier = newMultiplier;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__MULTIPLIER, oldMultiplier, multiplier));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getOffset() {
        return offset;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setOffset(String newOffset) {
        String oldOffset = offset;
        offset = newOffset;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__OFFSET, oldOffset, offset));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isPersistent() {
        return persistent;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setPersistent(boolean newPersistent) {
        boolean oldPersistent = persistent;
        persistent = newPersistent;
        boolean oldPersistentESet = persistentESet;
        persistentESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__PERSISTENT, oldPersistent, persistent,
                !oldPersistentESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetPersistent() {
        boolean oldPersistent = persistent;
        boolean oldPersistentESet = persistentESet;
        persistent = PERSISTENT_EDEFAULT;
        persistentESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.PARAMETER_TYPE__PERSISTENT, oldPersistent, PERSISTENT_EDEFAULT,
                oldPersistentESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetPersistent() {
        return persistentESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public SupportType getSupport() {
        return support;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setSupport(SupportType newSupport) {
        SupportType oldSupport = support;
        support = newSupport == null ? SUPPORT_EDEFAULT : newSupport;
        boolean oldSupportESet = supportESet;
        supportESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__SUPPORT, oldSupport, support, !oldSupportESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetSupport() {
        SupportType oldSupport = support;
        boolean oldSupportESet = supportESet;
        support = SUPPORT_EDEFAULT;
        supportESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                XDDPackage.PARAMETER_TYPE__SUPPORT, oldSupport, SUPPORT_EDEFAULT, oldSupportESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetSupport() {
        return supportESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getTemplateIDRef() {
        return templateIDRef;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setTemplateIDRef(String newTemplateIDRef) {
        String oldTemplateIDRef = templateIDRef;
        templateIDRef = newTemplateIDRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__TEMPLATE_ID_REF, oldTemplateIDRef, templateIDRef));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getUniqueID() {
        return uniqueID;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setUniqueID(String newUniqueID) {
        String oldUniqueID = uniqueID;
        uniqueID = newUniqueID;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                XDDPackage.PARAMETER_TYPE__UNIQUE_ID, oldUniqueID, uniqueID));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd,
        int featureID,
        NotificationChain msgs) {
        switch (featureID) {
            case XDDPackage.PARAMETER_TYPE__GROUP:
                return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
            case XDDPackage.PARAMETER_TYPE__LABEL:
                return ((InternalEList<?>) getLabel()).basicRemove(otherEnd, msgs);
            case XDDPackage.PARAMETER_TYPE__DESCRIPTION:
                return ((InternalEList<?>) getDescription()).basicRemove(otherEnd, msgs);
            case XDDPackage.PARAMETER_TYPE__LABEL_REF:
                return ((InternalEList<?>) getLabelRef()).basicRemove(otherEnd, msgs);
            case XDDPackage.PARAMETER_TYPE__DESCRIPTION_REF:
                return ((InternalEList<?>) getDescriptionRef()).basicRemove(otherEnd, msgs);
            case XDDPackage.PARAMETER_TYPE__BOOL:
                return basicSetBOOL(null, msgs);
            case XDDPackage.PARAMETER_TYPE__BITSTRING:
                return basicSetBITSTRING(null, msgs);
            case XDDPackage.PARAMETER_TYPE__BYTE:
                return basicSetBYTE(null, msgs);
            case XDDPackage.PARAMETER_TYPE__CHAR:
                return basicSetCHAR(null, msgs);
            case XDDPackage.PARAMETER_TYPE__WORD:
                return basicSetWORD(null, msgs);
            case XDDPackage.PARAMETER_TYPE__DWORD:
                return basicSetDWORD(null, msgs);
            case XDDPackage.PARAMETER_TYPE__LWORD:
                return basicSetLWORD(null, msgs);
            case XDDPackage.PARAMETER_TYPE__SINT:
                return basicSetSINT(null, msgs);
            case XDDPackage.PARAMETER_TYPE__INT:
                return basicSetINT(null, msgs);
            case XDDPackage.PARAMETER_TYPE__DINT:
                return basicSetDINT(null, msgs);
            case XDDPackage.PARAMETER_TYPE__LINT:
                return basicSetLINT(null, msgs);
            case XDDPackage.PARAMETER_TYPE__USINT:
                return basicSetUSINT(null, msgs);
            case XDDPackage.PARAMETER_TYPE__UINT:
                return basicSetUINT(null, msgs);
            case XDDPackage.PARAMETER_TYPE__UDINT:
                return basicSetUDINT(null, msgs);
            case XDDPackage.PARAMETER_TYPE__ULINT:
                return basicSetULINT(null, msgs);
            case XDDPackage.PARAMETER_TYPE__REAL:
                return basicSetREAL(null, msgs);
            case XDDPackage.PARAMETER_TYPE__LREAL:
                return basicSetLREAL(null, msgs);
            case XDDPackage.PARAMETER_TYPE__STRING:
                return basicSetSTRING(null, msgs);
            case XDDPackage.PARAMETER_TYPE__WSTRING:
                return basicSetWSTRING(null, msgs);
            case XDDPackage.PARAMETER_TYPE__DATA_TYPE_ID_REF:
                return basicSetDataTypeIDRef(null, msgs);
            case XDDPackage.PARAMETER_TYPE__VARIABLE_REF:
                return ((InternalEList<?>) getVariableRef()).basicRemove(otherEnd, msgs);
            case XDDPackage.PARAMETER_TYPE__CONDITIONAL_SUPPORT:
                return ((InternalEList<?>) getConditionalSupport()).basicRemove(otherEnd, msgs);
            case XDDPackage.PARAMETER_TYPE__DENOTATION:
                return basicSetDenotation(null, msgs);
            case XDDPackage.PARAMETER_TYPE__ACTUAL_VALUE:
                return basicSetActualValue(null, msgs);
            case XDDPackage.PARAMETER_TYPE__DEFAULT_VALUE:
                return basicSetDefaultValue(null, msgs);
            case XDDPackage.PARAMETER_TYPE__SUBSTITUTE_VALUE:
                return basicSetSubstituteValue(null, msgs);
            case XDDPackage.PARAMETER_TYPE__ALLOWED_VALUES:
                return basicSetAllowedValues(null, msgs);
            case XDDPackage.PARAMETER_TYPE__UNIT:
                return basicSetUnit(null, msgs);
            case XDDPackage.PARAMETER_TYPE__PROPERTY:
                return ((InternalEList<?>) getProperty()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XDDPackage.PARAMETER_TYPE__GROUP:
                if (coreType)
                    return getGroup();
                return ((FeatureMap.Internal) getGroup()).getWrapper();
            case XDDPackage.PARAMETER_TYPE__LABEL:
                return getLabel();
            case XDDPackage.PARAMETER_TYPE__DESCRIPTION:
                return getDescription();
            case XDDPackage.PARAMETER_TYPE__LABEL_REF:
                return getLabelRef();
            case XDDPackage.PARAMETER_TYPE__DESCRIPTION_REF:
                return getDescriptionRef();
            case XDDPackage.PARAMETER_TYPE__BOOL:
                return getBOOL();
            case XDDPackage.PARAMETER_TYPE__BITSTRING:
                return getBITSTRING();
            case XDDPackage.PARAMETER_TYPE__BYTE:
                return getBYTE();
            case XDDPackage.PARAMETER_TYPE__CHAR:
                return getCHAR();
            case XDDPackage.PARAMETER_TYPE__WORD:
                return getWORD();
            case XDDPackage.PARAMETER_TYPE__DWORD:
                return getDWORD();
            case XDDPackage.PARAMETER_TYPE__LWORD:
                return getLWORD();
            case XDDPackage.PARAMETER_TYPE__SINT:
                return getSINT();
            case XDDPackage.PARAMETER_TYPE__INT:
                return getINT();
            case XDDPackage.PARAMETER_TYPE__DINT:
                return getDINT();
            case XDDPackage.PARAMETER_TYPE__LINT:
                return getLINT();
            case XDDPackage.PARAMETER_TYPE__USINT:
                return getUSINT();
            case XDDPackage.PARAMETER_TYPE__UINT:
                return getUINT();
            case XDDPackage.PARAMETER_TYPE__UDINT:
                return getUDINT();
            case XDDPackage.PARAMETER_TYPE__ULINT:
                return getULINT();
            case XDDPackage.PARAMETER_TYPE__REAL:
                return getREAL();
            case XDDPackage.PARAMETER_TYPE__LREAL:
                return getLREAL();
            case XDDPackage.PARAMETER_TYPE__STRING:
                return getSTRING();
            case XDDPackage.PARAMETER_TYPE__WSTRING:
                return getWSTRING();
            case XDDPackage.PARAMETER_TYPE__DATA_TYPE_ID_REF:
                return getDataTypeIDRef();
            case XDDPackage.PARAMETER_TYPE__VARIABLE_REF:
                return getVariableRef();
            case XDDPackage.PARAMETER_TYPE__CONDITIONAL_SUPPORT:
                return getConditionalSupport();
            case XDDPackage.PARAMETER_TYPE__DENOTATION:
                return getDenotation();
            case XDDPackage.PARAMETER_TYPE__ACTUAL_VALUE:
                return getActualValue();
            case XDDPackage.PARAMETER_TYPE__DEFAULT_VALUE:
                return getDefaultValue();
            case XDDPackage.PARAMETER_TYPE__SUBSTITUTE_VALUE:
                return getSubstituteValue();
            case XDDPackage.PARAMETER_TYPE__ALLOWED_VALUES:
                return getAllowedValues();
            case XDDPackage.PARAMETER_TYPE__UNIT:
                return getUnit();
            case XDDPackage.PARAMETER_TYPE__PROPERTY:
                return getProperty();
            case XDDPackage.PARAMETER_TYPE__ACCESS:
                return getAccess();
            case XDDPackage.PARAMETER_TYPE__ACCESS_LIST:
                return getAccessList();
            case XDDPackage.PARAMETER_TYPE__MULTIPLIER:
                return getMultiplier();
            case XDDPackage.PARAMETER_TYPE__OFFSET:
                return getOffset();
            case XDDPackage.PARAMETER_TYPE__PERSISTENT:
                return isPersistent();
            case XDDPackage.PARAMETER_TYPE__SUPPORT:
                return getSupport();
            case XDDPackage.PARAMETER_TYPE__TEMPLATE_ID_REF:
                return getTemplateIDRef();
            case XDDPackage.PARAMETER_TYPE__UNIQUE_ID:
                return getUniqueID();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case XDDPackage.PARAMETER_TYPE__GROUP:
                ((FeatureMap.Internal) getGroup()).set(newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__LABEL:
                getLabel().clear();
                getLabel().addAll((Collection<? extends LabelType>) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__DESCRIPTION:
                getDescription().clear();
                getDescription().addAll((Collection<? extends DescriptionType>) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__LABEL_REF:
                getLabelRef().clear();
                getLabelRef().addAll((Collection<? extends LabelRefType>) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__DESCRIPTION_REF:
                getDescriptionRef().clear();
                getDescriptionRef().addAll((Collection<? extends DescriptionRefType>) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__BOOL:
                setBOOL((EObject) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__BITSTRING:
                setBITSTRING((EObject) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__BYTE:
                setBYTE((EObject) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__CHAR:
                setCHAR((EObject) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__WORD:
                setWORD((EObject) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__DWORD:
                setDWORD((EObject) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__LWORD:
                setLWORD((EObject) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__SINT:
                setSINT((EObject) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__INT:
                setINT((EObject) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__DINT:
                setDINT((EObject) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__LINT:
                setLINT((EObject) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__USINT:
                setUSINT((EObject) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__UINT:
                setUINT((EObject) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__UDINT:
                setUDINT((EObject) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__ULINT:
                setULINT((EObject) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__REAL:
                setREAL((EObject) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__LREAL:
                setLREAL((EObject) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__STRING:
                setSTRING((EObject) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__WSTRING:
                setWSTRING((EObject) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__DATA_TYPE_ID_REF:
                setDataTypeIDRef((TDataTypeIDRef) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__VARIABLE_REF:
                getVariableRef().clear();
                getVariableRef().addAll((Collection<? extends TVariableRef>) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__CONDITIONAL_SUPPORT:
                getConditionalSupport().clear();
                getConditionalSupport()
                    .addAll((Collection<? extends TConditionalSupport>) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__DENOTATION:
                setDenotation((TDenotation) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__ACTUAL_VALUE:
                setActualValue((TValue) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__DEFAULT_VALUE:
                setDefaultValue((TValue) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__SUBSTITUTE_VALUE:
                setSubstituteValue((TValue) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__ALLOWED_VALUES:
                setAllowedValues((TAllowedValues) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__UNIT:
                setUnit((TUnit) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__PROPERTY:
                getProperty().clear();
                getProperty().addAll((Collection<? extends TProperty>) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__ACCESS:
                setAccess((AccessType) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__ACCESS_LIST:
                setAccessList((List<String>) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__MULTIPLIER:
                setMultiplier((String) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__OFFSET:
                setOffset((String) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__PERSISTENT:
                setPersistent((Boolean) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__SUPPORT:
                setSupport((SupportType) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__TEMPLATE_ID_REF:
                setTemplateIDRef((String) newValue);
                return;
            case XDDPackage.PARAMETER_TYPE__UNIQUE_ID:
                setUniqueID((String) newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case XDDPackage.PARAMETER_TYPE__GROUP:
                getGroup().clear();
                return;
            case XDDPackage.PARAMETER_TYPE__LABEL:
                getLabel().clear();
                return;
            case XDDPackage.PARAMETER_TYPE__DESCRIPTION:
                getDescription().clear();
                return;
            case XDDPackage.PARAMETER_TYPE__LABEL_REF:
                getLabelRef().clear();
                return;
            case XDDPackage.PARAMETER_TYPE__DESCRIPTION_REF:
                getDescriptionRef().clear();
                return;
            case XDDPackage.PARAMETER_TYPE__BOOL:
                setBOOL((EObject) null);
                return;
            case XDDPackage.PARAMETER_TYPE__BITSTRING:
                setBITSTRING((EObject) null);
                return;
            case XDDPackage.PARAMETER_TYPE__BYTE:
                setBYTE((EObject) null);
                return;
            case XDDPackage.PARAMETER_TYPE__CHAR:
                setCHAR((EObject) null);
                return;
            case XDDPackage.PARAMETER_TYPE__WORD:
                setWORD((EObject) null);
                return;
            case XDDPackage.PARAMETER_TYPE__DWORD:
                setDWORD((EObject) null);
                return;
            case XDDPackage.PARAMETER_TYPE__LWORD:
                setLWORD((EObject) null);
                return;
            case XDDPackage.PARAMETER_TYPE__SINT:
                setSINT((EObject) null);
                return;
            case XDDPackage.PARAMETER_TYPE__INT:
                setINT((EObject) null);
                return;
            case XDDPackage.PARAMETER_TYPE__DINT:
                setDINT((EObject) null);
                return;
            case XDDPackage.PARAMETER_TYPE__LINT:
                setLINT((EObject) null);
                return;
            case XDDPackage.PARAMETER_TYPE__USINT:
                setUSINT((EObject) null);
                return;
            case XDDPackage.PARAMETER_TYPE__UINT:
                setUINT((EObject) null);
                return;
            case XDDPackage.PARAMETER_TYPE__UDINT:
                setUDINT((EObject) null);
                return;
            case XDDPackage.PARAMETER_TYPE__ULINT:
                setULINT((EObject) null);
                return;
            case XDDPackage.PARAMETER_TYPE__REAL:
                setREAL((EObject) null);
                return;
            case XDDPackage.PARAMETER_TYPE__LREAL:
                setLREAL((EObject) null);
                return;
            case XDDPackage.PARAMETER_TYPE__STRING:
                setSTRING((EObject) null);
                return;
            case XDDPackage.PARAMETER_TYPE__WSTRING:
                setWSTRING((EObject) null);
                return;
            case XDDPackage.PARAMETER_TYPE__DATA_TYPE_ID_REF:
                setDataTypeIDRef((TDataTypeIDRef) null);
                return;
            case XDDPackage.PARAMETER_TYPE__VARIABLE_REF:
                getVariableRef().clear();
                return;
            case XDDPackage.PARAMETER_TYPE__CONDITIONAL_SUPPORT:
                getConditionalSupport().clear();
                return;
            case XDDPackage.PARAMETER_TYPE__DENOTATION:
                setDenotation((TDenotation) null);
                return;
            case XDDPackage.PARAMETER_TYPE__ACTUAL_VALUE:
                setActualValue((TValue) null);
                return;
            case XDDPackage.PARAMETER_TYPE__DEFAULT_VALUE:
                setDefaultValue((TValue) null);
                return;
            case XDDPackage.PARAMETER_TYPE__SUBSTITUTE_VALUE:
                setSubstituteValue((TValue) null);
                return;
            case XDDPackage.PARAMETER_TYPE__ALLOWED_VALUES:
                setAllowedValues((TAllowedValues) null);
                return;
            case XDDPackage.PARAMETER_TYPE__UNIT:
                setUnit((TUnit) null);
                return;
            case XDDPackage.PARAMETER_TYPE__PROPERTY:
                getProperty().clear();
                return;
            case XDDPackage.PARAMETER_TYPE__ACCESS:
                unsetAccess();
                return;
            case XDDPackage.PARAMETER_TYPE__ACCESS_LIST:
                setAccessList(ACCESS_LIST_EDEFAULT);
                return;
            case XDDPackage.PARAMETER_TYPE__MULTIPLIER:
                setMultiplier(MULTIPLIER_EDEFAULT);
                return;
            case XDDPackage.PARAMETER_TYPE__OFFSET:
                setOffset(OFFSET_EDEFAULT);
                return;
            case XDDPackage.PARAMETER_TYPE__PERSISTENT:
                unsetPersistent();
                return;
            case XDDPackage.PARAMETER_TYPE__SUPPORT:
                unsetSupport();
                return;
            case XDDPackage.PARAMETER_TYPE__TEMPLATE_ID_REF:
                setTemplateIDRef(TEMPLATE_ID_REF_EDEFAULT);
                return;
            case XDDPackage.PARAMETER_TYPE__UNIQUE_ID:
                setUniqueID(UNIQUE_ID_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case XDDPackage.PARAMETER_TYPE__GROUP:
                return group != null && !group.isEmpty();
            case XDDPackage.PARAMETER_TYPE__LABEL:
                return !getLabel().isEmpty();
            case XDDPackage.PARAMETER_TYPE__DESCRIPTION:
                return !getDescription().isEmpty();
            case XDDPackage.PARAMETER_TYPE__LABEL_REF:
                return !getLabelRef().isEmpty();
            case XDDPackage.PARAMETER_TYPE__DESCRIPTION_REF:
                return !getDescriptionRef().isEmpty();
            case XDDPackage.PARAMETER_TYPE__BOOL:
                return bOOL != null;
            case XDDPackage.PARAMETER_TYPE__BITSTRING:
                return bITSTRING != null;
            case XDDPackage.PARAMETER_TYPE__BYTE:
                return bYTE != null;
            case XDDPackage.PARAMETER_TYPE__CHAR:
                return cHAR != null;
            case XDDPackage.PARAMETER_TYPE__WORD:
                return wORD != null;
            case XDDPackage.PARAMETER_TYPE__DWORD:
                return dWORD != null;
            case XDDPackage.PARAMETER_TYPE__LWORD:
                return lWORD != null;
            case XDDPackage.PARAMETER_TYPE__SINT:
                return sINT != null;
            case XDDPackage.PARAMETER_TYPE__INT:
                return iNT != null;
            case XDDPackage.PARAMETER_TYPE__DINT:
                return dINT != null;
            case XDDPackage.PARAMETER_TYPE__LINT:
                return lINT != null;
            case XDDPackage.PARAMETER_TYPE__USINT:
                return uSINT != null;
            case XDDPackage.PARAMETER_TYPE__UINT:
                return uINT != null;
            case XDDPackage.PARAMETER_TYPE__UDINT:
                return uDINT != null;
            case XDDPackage.PARAMETER_TYPE__ULINT:
                return uLINT != null;
            case XDDPackage.PARAMETER_TYPE__REAL:
                return rEAL != null;
            case XDDPackage.PARAMETER_TYPE__LREAL:
                return lREAL != null;
            case XDDPackage.PARAMETER_TYPE__STRING:
                return sTRING != null;
            case XDDPackage.PARAMETER_TYPE__WSTRING:
                return wSTRING != null;
            case XDDPackage.PARAMETER_TYPE__DATA_TYPE_ID_REF:
                return dataTypeIDRef != null;
            case XDDPackage.PARAMETER_TYPE__VARIABLE_REF:
                return variableRef != null && !variableRef.isEmpty();
            case XDDPackage.PARAMETER_TYPE__CONDITIONAL_SUPPORT:
                return conditionalSupport != null && !conditionalSupport.isEmpty();
            case XDDPackage.PARAMETER_TYPE__DENOTATION:
                return denotation != null;
            case XDDPackage.PARAMETER_TYPE__ACTUAL_VALUE:
                return actualValue != null;
            case XDDPackage.PARAMETER_TYPE__DEFAULT_VALUE:
                return defaultValue != null;
            case XDDPackage.PARAMETER_TYPE__SUBSTITUTE_VALUE:
                return substituteValue != null;
            case XDDPackage.PARAMETER_TYPE__ALLOWED_VALUES:
                return allowedValues != null;
            case XDDPackage.PARAMETER_TYPE__UNIT:
                return unit != null;
            case XDDPackage.PARAMETER_TYPE__PROPERTY:
                return property != null && !property.isEmpty();
            case XDDPackage.PARAMETER_TYPE__ACCESS:
                return isSetAccess();
            case XDDPackage.PARAMETER_TYPE__ACCESS_LIST:
                return ACCESS_LIST_EDEFAULT == null ? accessList != null : !ACCESS_LIST_EDEFAULT
                    .equals(accessList);
            case XDDPackage.PARAMETER_TYPE__MULTIPLIER:
                return MULTIPLIER_EDEFAULT == null ? multiplier != null : !MULTIPLIER_EDEFAULT
                    .equals(multiplier);
            case XDDPackage.PARAMETER_TYPE__OFFSET:
                return OFFSET_EDEFAULT == null ? offset != null : !OFFSET_EDEFAULT.equals(offset);
            case XDDPackage.PARAMETER_TYPE__PERSISTENT:
                return isSetPersistent();
            case XDDPackage.PARAMETER_TYPE__SUPPORT:
                return isSetSupport();
            case XDDPackage.PARAMETER_TYPE__TEMPLATE_ID_REF:
                return TEMPLATE_ID_REF_EDEFAULT == null ? templateIDRef != null
                    : !TEMPLATE_ID_REF_EDEFAULT.equals(templateIDRef);
            case XDDPackage.PARAMETER_TYPE__UNIQUE_ID:
                return UNIQUE_ID_EDEFAULT == null ? uniqueID != null : !UNIQUE_ID_EDEFAULT
                    .equals(uniqueID);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (group: ");
        result.append(group);
        result.append(", access: ");
        if (accessESet)
            result.append(access);
        else
            result.append("<unset>");
        result.append(", accessList: ");
        result.append(accessList);
        result.append(", multiplier: ");
        result.append(multiplier);
        result.append(", offset: ");
        result.append(offset);
        result.append(", persistent: ");
        if (persistentESet)
            result.append(persistent);
        else
            result.append("<unset>");
        result.append(", support: ");
        if (supportESet)
            result.append(support);
        else
            result.append("<unset>");
        result.append(", templateIDRef: ");
        result.append(templateIDRef);
        result.append(", uniqueID: ");
        result.append(uniqueID);
        result.append(')');
        return result.toString();
    }

} //ParameterTypeImpl
