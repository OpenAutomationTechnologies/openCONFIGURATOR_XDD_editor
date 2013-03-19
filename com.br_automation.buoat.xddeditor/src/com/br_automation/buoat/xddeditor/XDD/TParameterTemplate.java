/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>TParameter Template</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getBOOL
 * <em>BOOL</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getBITSTRING
 * <em>BITSTRING</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getBYTE
 * <em>BYTE</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getCHAR
 * <em>CHAR</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getWORD
 * <em>WORD</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getDWORD
 * <em>DWORD</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getLWORD
 * <em>LWORD</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getSINT
 * <em>SINT</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getINT
 * <em>INT</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getDINT
 * <em>DINT</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getLINT
 * <em>LINT</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getUSINT
 * <em>USINT</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getUINT
 * <em>UINT</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getUDINT
 * <em>UDINT</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getULINT
 * <em>ULINT</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getREAL
 * <em>REAL</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getLREAL
 * <em>LREAL</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getSTRING
 * <em>STRING</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getWSTRING
 * <em>WSTRING</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getDataTypeIDRef
 * <em>Data Type ID Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getConditionalSupport
 * <em>Conditional Support</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getActualValue
 * <em>Actual Value</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getDefaultValue
 * <em>Default Value</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getSubstituteValue
 * <em>Substitute Value</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getAllowedValues
 * <em>Allowed Values</em>}</li>
 * <li>{@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getUnit
 * <em>Unit</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getProperty
 * <em>Property</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getAccess
 * <em>Access</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getAccessList
 * <em>Access List</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getMultiplier
 * <em>Multiplier</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getOffset
 * <em>Offset</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#isPersistent
 * <em>Persistent</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getSupport
 * <em>Support</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getTemplateIDRef
 * <em>Template ID Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getUniqueID
 * <em>Unique ID</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate()
 * @model extendedMetaData="name='t_parameterTemplate' kind='elementOnly'"
 * @generated
 */
public interface TParameterTemplate extends EObject {
    /**
     * Returns the value of the '<em><b>BOOL</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>BOOL</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>BOOL</em>' containment reference.
     * @see #setBOOL(EObject)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_BOOL()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='BOOL' namespace='##targetNamespace'"
     * @generated
     */
    EObject getBOOL();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getBOOL
     * <em>BOOL</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>BOOL</em>' containment reference.
     * @see #getBOOL()
     * @generated
     */
    void setBOOL(EObject value);

    /**
     * Returns the value of the '<em><b>BITSTRING</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>BITSTRING</em>' containment reference isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>BITSTRING</em>' containment reference.
     * @see #setBITSTRING(EObject)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_BITSTRING()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='BITSTRING' namespace='##targetNamespace'"
     * @generated
     */
    EObject getBITSTRING();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getBITSTRING
     * <em>BITSTRING</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>BITSTRING</em>' containment
     *            reference.
     * @see #getBITSTRING()
     * @generated
     */
    void setBITSTRING(EObject value);

    /**
     * Returns the value of the '<em><b>BYTE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>BYTE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>BYTE</em>' containment reference.
     * @see #setBYTE(EObject)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_BYTE()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='BYTE' namespace='##targetNamespace'"
     * @generated
     */
    EObject getBYTE();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getBYTE
     * <em>BYTE</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>BYTE</em>' containment reference.
     * @see #getBYTE()
     * @generated
     */
    void setBYTE(EObject value);

    /**
     * Returns the value of the '<em><b>CHAR</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CHAR</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>CHAR</em>' containment reference.
     * @see #setCHAR(EObject)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_CHAR()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='CHAR' namespace='##targetNamespace'"
     * @generated
     */
    EObject getCHAR();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getCHAR
     * <em>CHAR</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>CHAR</em>' containment reference.
     * @see #getCHAR()
     * @generated
     */
    void setCHAR(EObject value);

    /**
     * Returns the value of the '<em><b>WORD</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>WORD</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>WORD</em>' containment reference.
     * @see #setWORD(EObject)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_WORD()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='WORD' namespace='##targetNamespace'"
     * @generated
     */
    EObject getWORD();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getWORD
     * <em>WORD</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>WORD</em>' containment reference.
     * @see #getWORD()
     * @generated
     */
    void setWORD(EObject value);

    /**
     * Returns the value of the '<em><b>DWORD</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DWORD</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>DWORD</em>' containment reference.
     * @see #setDWORD(EObject)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_DWORD()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='DWORD' namespace='##targetNamespace'"
     * @generated
     */
    EObject getDWORD();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getDWORD
     * <em>DWORD</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>DWORD</em>' containment reference.
     * @see #getDWORD()
     * @generated
     */
    void setDWORD(EObject value);

    /**
     * Returns the value of the '<em><b>LWORD</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LWORD</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>LWORD</em>' containment reference.
     * @see #setLWORD(EObject)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_LWORD()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='LWORD' namespace='##targetNamespace'"
     * @generated
     */
    EObject getLWORD();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getLWORD
     * <em>LWORD</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>LWORD</em>' containment reference.
     * @see #getLWORD()
     * @generated
     */
    void setLWORD(EObject value);

    /**
     * Returns the value of the '<em><b>SINT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SINT</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>SINT</em>' containment reference.
     * @see #setSINT(EObject)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_SINT()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='SINT' namespace='##targetNamespace'"
     * @generated
     */
    EObject getSINT();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getSINT
     * <em>SINT</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>SINT</em>' containment reference.
     * @see #getSINT()
     * @generated
     */
    void setSINT(EObject value);

    /**
     * Returns the value of the '<em><b>INT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>INT</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>INT</em>' containment reference.
     * @see #setINT(EObject)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_INT()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='INT' namespace='##targetNamespace'"
     * @generated
     */
    EObject getINT();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getINT
     * <em>INT</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>INT</em>' containment reference.
     * @see #getINT()
     * @generated
     */
    void setINT(EObject value);

    /**
     * Returns the value of the '<em><b>DINT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DINT</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>DINT</em>' containment reference.
     * @see #setDINT(EObject)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_DINT()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='DINT' namespace='##targetNamespace'"
     * @generated
     */
    EObject getDINT();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getDINT
     * <em>DINT</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>DINT</em>' containment reference.
     * @see #getDINT()
     * @generated
     */
    void setDINT(EObject value);

    /**
     * Returns the value of the '<em><b>LINT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LINT</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>LINT</em>' containment reference.
     * @see #setLINT(EObject)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_LINT()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='LINT' namespace='##targetNamespace'"
     * @generated
     */
    EObject getLINT();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getLINT
     * <em>LINT</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>LINT</em>' containment reference.
     * @see #getLINT()
     * @generated
     */
    void setLINT(EObject value);

    /**
     * Returns the value of the '<em><b>USINT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>USINT</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>USINT</em>' containment reference.
     * @see #setUSINT(EObject)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_USINT()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='USINT' namespace='##targetNamespace'"
     * @generated
     */
    EObject getUSINT();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getUSINT
     * <em>USINT</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>USINT</em>' containment reference.
     * @see #getUSINT()
     * @generated
     */
    void setUSINT(EObject value);

    /**
     * Returns the value of the '<em><b>UINT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>UINT</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>UINT</em>' containment reference.
     * @see #setUINT(EObject)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_UINT()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='UINT' namespace='##targetNamespace'"
     * @generated
     */
    EObject getUINT();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getUINT
     * <em>UINT</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>UINT</em>' containment reference.
     * @see #getUINT()
     * @generated
     */
    void setUINT(EObject value);

    /**
     * Returns the value of the '<em><b>UDINT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>UDINT</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>UDINT</em>' containment reference.
     * @see #setUDINT(EObject)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_UDINT()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='UDINT' namespace='##targetNamespace'"
     * @generated
     */
    EObject getUDINT();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getUDINT
     * <em>UDINT</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>UDINT</em>' containment reference.
     * @see #getUDINT()
     * @generated
     */
    void setUDINT(EObject value);

    /**
     * Returns the value of the '<em><b>ULINT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ULINT</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>ULINT</em>' containment reference.
     * @see #setULINT(EObject)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_ULINT()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='ULINT' namespace='##targetNamespace'"
     * @generated
     */
    EObject getULINT();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getULINT
     * <em>ULINT</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>ULINT</em>' containment reference.
     * @see #getULINT()
     * @generated
     */
    void setULINT(EObject value);

    /**
     * Returns the value of the '<em><b>REAL</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REAL</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>REAL</em>' containment reference.
     * @see #setREAL(EObject)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_REAL()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='REAL' namespace='##targetNamespace'"
     * @generated
     */
    EObject getREAL();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getREAL
     * <em>REAL</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>REAL</em>' containment reference.
     * @see #getREAL()
     * @generated
     */
    void setREAL(EObject value);

    /**
     * Returns the value of the '<em><b>LREAL</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LREAL</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>LREAL</em>' containment reference.
     * @see #setLREAL(EObject)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_LREAL()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='LREAL' namespace='##targetNamespace'"
     * @generated
     */
    EObject getLREAL();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getLREAL
     * <em>LREAL</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>LREAL</em>' containment reference.
     * @see #getLREAL()
     * @generated
     */
    void setLREAL(EObject value);

    /**
     * Returns the value of the '<em><b>STRING</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>STRING</em>' containment reference isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>STRING</em>' containment reference.
     * @see #setSTRING(EObject)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_STRING()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='STRING' namespace='##targetNamespace'"
     * @generated
     */
    EObject getSTRING();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getSTRING
     * <em>STRING</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>STRING</em>' containment reference.
     * @see #getSTRING()
     * @generated
     */
    void setSTRING(EObject value);

    /**
     * Returns the value of the '<em><b>WSTRING</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>WSTRING</em>' containment reference isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>WSTRING</em>' containment reference.
     * @see #setWSTRING(EObject)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_WSTRING()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='WSTRING' namespace='##targetNamespace'"
     * @generated
     */
    EObject getWSTRING();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getWSTRING
     * <em>WSTRING</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>WSTRING</em>' containment reference.
     * @see #getWSTRING()
     * @generated
     */
    void setWSTRING(EObject value);

    /**
     * Returns the value of the '<em><b>Data Type ID Ref</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Type ID Ref</em>' containment reference
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Data Type ID Ref</em>' containment
     *         reference.
     * @see #setDataTypeIDRef(TDataTypeIDRef)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_DataTypeIDRef()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='dataTypeIDRef' namespace='##targetNamespace'"
     * @generated
     */
    TDataTypeIDRef getDataTypeIDRef();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getDataTypeIDRef
     * <em>Data Type ID Ref</em>}' containment reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Data Type ID Ref</em>' containment
     *            reference.
     * @see #getDataTypeIDRef()
     * @generated
     */
    void setDataTypeIDRef(TDataTypeIDRef value);

    /**
     * Returns the value of the '<em><b>Conditional Support</b></em>'
     * containment reference list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.TConditionalSupport}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conditional Support</em>' containment
     * reference list isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Conditional Support</em>' containment
     *         reference list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_ConditionalSupport()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='conditionalSupport' namespace='##targetNamespace'"
     * @generated
     */
    EList<TConditionalSupport> getConditionalSupport();

    /**
     * Returns the value of the '<em><b>Actual Value</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Actual Value</em>' containment reference isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Actual Value</em>' containment reference.
     * @see #setActualValue(TValue)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_ActualValue()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='actualValue' namespace='##targetNamespace'"
     * @generated
     */
    TValue getActualValue();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getActualValue
     * <em>Actual Value</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Actual Value</em>' containment
     *            reference.
     * @see #getActualValue()
     * @generated
     */
    void setActualValue(TValue value);

    /**
     * Returns the value of the '<em><b>Default Value</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Value</em>' containment reference
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Default Value</em>' containment reference.
     * @see #setDefaultValue(TValue)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_DefaultValue()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='defaultValue' namespace='##targetNamespace'"
     * @generated
     */
    TValue getDefaultValue();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getDefaultValue
     * <em>Default Value</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Default Value</em>' containment
     *            reference.
     * @see #getDefaultValue()
     * @generated
     */
    void setDefaultValue(TValue value);

    /**
     * Returns the value of the '<em><b>Substitute Value</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Substitute Value</em>' containment reference
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Substitute Value</em>' containment
     *         reference.
     * @see #setSubstituteValue(TValue)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_SubstituteValue()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='substituteValue' namespace='##targetNamespace'"
     * @generated
     */
    TValue getSubstituteValue();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getSubstituteValue
     * <em>Substitute Value</em>}' containment reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Substitute Value</em>' containment
     *            reference.
     * @see #getSubstituteValue()
     * @generated
     */
    void setSubstituteValue(TValue value);

    /**
     * Returns the value of the '<em><b>Allowed Values</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Allowed Values</em>' containment reference
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Allowed Values</em>' containment reference.
     * @see #setAllowedValues(TAllowedValues)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_AllowedValues()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='allowedValues' namespace='##targetNamespace'"
     * @generated
     */
    TAllowedValues getAllowedValues();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getAllowedValues
     * <em>Allowed Values</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Allowed Values</em>' containment
     *            reference.
     * @see #getAllowedValues()
     * @generated
     */
    void setAllowedValues(TAllowedValues value);

    /**
     * Returns the value of the '<em><b>Unit</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unit</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Unit</em>' containment reference.
     * @see #setUnit(TUnit)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_Unit()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='unit' namespace='##targetNamespace'"
     * @generated
     */
    TUnit getUnit();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getUnit
     * <em>Unit</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Unit</em>' containment reference.
     * @see #getUnit()
     * @generated
     */
    void setUnit(TUnit value);

    /**
     * Returns the value of the '<em><b>Property</b></em>' containment reference
     * list. The list contents are of type
     * {@link com.br_automation.buoat.xddeditor.XDD.TProperty}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property</em>' containment reference list
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Property</em>' containment reference list.
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_Property()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='property' namespace='##targetNamespace'"
     * @generated
     */
    EList<TProperty> getProperty();

    /**
     * Returns the value of the '<em><b>Access</b></em>' attribute. The default
     * value is <code>"read"</code>. The literals are from the enumeration
     * {@link com.br_automation.buoat.xddeditor.XDD.AccessType}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Access</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Access</em>' attribute.
     * @see com.br_automation.buoat.xddeditor.XDD.AccessType
     * @see #isSetAccess()
     * @see #unsetAccess()
     * @see #setAccess(AccessType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_Access()
     * @model default="read" unsettable="true"
     *        extendedMetaData="kind='attribute' name='access'"
     * @generated
     */
    AccessType getAccess();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getAccess
     * <em>Access</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Access</em>' attribute.
     * @see com.br_automation.buoat.xddeditor.XDD.AccessType
     * @see #isSetAccess()
     * @see #unsetAccess()
     * @see #getAccess()
     * @generated
     */
    void setAccess(AccessType value);

    /**
     * Unsets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getAccess
     * <em>Access</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #isSetAccess()
     * @see #getAccess()
     * @see #setAccess(AccessType)
     * @generated
     */
    void unsetAccess();

    /**
     * Returns whether the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getAccess
     * <em>Access</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return whether the value of the '<em>Access</em>' attribute is set.
     * @see #unsetAccess()
     * @see #getAccess()
     * @see #setAccess(AccessType)
     * @generated
     */
    boolean isSetAccess();

    /**
     * Returns the value of the '<em><b>Access List</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Access List</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Access List</em>' attribute.
     * @see #setAccessList(List)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_AccessList()
     * @model dataType="com.br_automation.buoat.xddeditor.XDD.AccessListType"
     *        many="false" extendedMetaData="kind='attribute' name='accessList'"
     * @generated
     */
    List<String> getAccessList();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getAccessList
     * <em>Access List</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Access List</em>' attribute.
     * @see #getAccessList()
     * @generated
     */
    void setAccessList(List<String> value);

    /**
     * Returns the value of the '<em><b>Multiplier</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Multiplier</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Multiplier</em>' attribute.
     * @see #setMultiplier(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_Multiplier()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='multiplier'"
     * @generated
     */
    String getMultiplier();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getMultiplier
     * <em>Multiplier</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Multiplier</em>' attribute.
     * @see #getMultiplier()
     * @generated
     */
    void setMultiplier(String value);

    /**
     * Returns the value of the '<em><b>Offset</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Offset</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Offset</em>' attribute.
     * @see #setOffset(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_Offset()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='offset'"
     * @generated
     */
    String getOffset();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getOffset
     * <em>Offset</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Offset</em>' attribute.
     * @see #getOffset()
     * @generated
     */
    void setOffset(String value);

    /**
     * Returns the value of the '<em><b>Persistent</b></em>' attribute. The
     * default value is <code>"false"</code>. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Persistent</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Persistent</em>' attribute.
     * @see #isSetPersistent()
     * @see #unsetPersistent()
     * @see #setPersistent(boolean)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_Persistent()
     * @model default="false" unsettable="true"
     *        dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='persistent'"
     * @generated
     */
    boolean isPersistent();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#isPersistent
     * <em>Persistent</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Persistent</em>' attribute.
     * @see #isSetPersistent()
     * @see #unsetPersistent()
     * @see #isPersistent()
     * @generated
     */
    void setPersistent(boolean value);

    /**
     * Unsets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#isPersistent
     * <em>Persistent</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isSetPersistent()
     * @see #isPersistent()
     * @see #setPersistent(boolean)
     * @generated
     */
    void unsetPersistent();

    /**
     * Returns whether the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#isPersistent
     * <em>Persistent</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return whether the value of the '<em>Persistent</em>' attribute is set.
     * @see #unsetPersistent()
     * @see #isPersistent()
     * @see #setPersistent(boolean)
     * @generated
     */
    boolean isSetPersistent();

    /**
     * Returns the value of the '<em><b>Support</b></em>' attribute. The
     * literals are from the enumeration
     * {@link com.br_automation.buoat.xddeditor.XDD.SupportType}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Support</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Support</em>' attribute.
     * @see com.br_automation.buoat.xddeditor.XDD.SupportType
     * @see #isSetSupport()
     * @see #unsetSupport()
     * @see #setSupport(SupportType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_Support()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='support'"
     * @generated
     */
    SupportType getSupport();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getSupport
     * <em>Support</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Support</em>' attribute.
     * @see com.br_automation.buoat.xddeditor.XDD.SupportType
     * @see #isSetSupport()
     * @see #unsetSupport()
     * @see #getSupport()
     * @generated
     */
    void setSupport(SupportType value);

    /**
     * Unsets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getSupport
     * <em>Support</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #isSetSupport()
     * @see #getSupport()
     * @see #setSupport(SupportType)
     * @generated
     */
    void unsetSupport();

    /**
     * Returns whether the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getSupport
     * <em>Support</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return whether the value of the '<em>Support</em>' attribute is set.
     * @see #unsetSupport()
     * @see #getSupport()
     * @see #setSupport(SupportType)
     * @generated
     */
    boolean isSetSupport();

    /**
     * Returns the value of the '<em><b>Template ID Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Template ID Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Template ID Ref</em>' attribute.
     * @see #setTemplateIDRef(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_TemplateIDRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
     *        extendedMetaData="kind='attribute' name='templateIDRef'"
     * @generated
     */
    String getTemplateIDRef();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getTemplateIDRef
     * <em>Template ID Ref</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Template ID Ref</em>' attribute.
     * @see #getTemplateIDRef()
     * @generated
     */
    void setTemplateIDRef(String value);

    /**
     * Returns the value of the '<em><b>Unique ID</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unique ID</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Unique ID</em>' attribute.
     * @see #setUniqueID(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTParameterTemplate_UniqueID()
     * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
     *        required="true"
     *        extendedMetaData="kind='attribute' name='uniqueID'"
     * @generated
     */
    String getUniqueID();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TParameterTemplate#getUniqueID
     * <em>Unique ID</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Unique ID</em>' attribute.
     * @see #getUniqueID()
     * @generated
     */
    void setUniqueID(String value);

} // TParameterTemplate
