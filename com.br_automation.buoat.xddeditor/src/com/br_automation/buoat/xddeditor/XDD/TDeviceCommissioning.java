/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>TDevice Commissioning</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning#getNetworkName
 * <em>Network Name</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning#getNodeID
 * <em>Node ID</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning#getNodeName
 * <em>Node Name</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning#getNodeType
 * <em>Node Type</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning#getUsedNetworkInterface
 * <em>Used Network Interface</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceCommissioning()
 * @model extendedMetaData="name='t_deviceCommissioning' kind='empty'"
 * @generated
 */
public interface TDeviceCommissioning extends EObject {
    /**
     * Returns the value of the '<em><b>Network Name</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Network Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Network Name</em>' attribute.
     * @see #setNetworkName(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceCommissioning_NetworkName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='networkName'"
     * @generated
     */
    String getNetworkName();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning#getNetworkName
     * <em>Network Name</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Network Name</em>' attribute.
     * @see #getNetworkName()
     * @generated
     */
    void setNetworkName(String value);

    /**
     * Returns the value of the '<em><b>Node ID</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Node ID</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Node ID</em>' attribute.
     * @see #isSetNodeID()
     * @see #unsetNodeID()
     * @see #setNodeID(short)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceCommissioning_NodeID()
     * @model unsettable="true"
     *        dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte"
     *        required="true" extendedMetaData="kind='attribute' name='nodeID'"
     * @generated
     */
    short getNodeID();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning#getNodeID
     * <em>Node ID</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Node ID</em>' attribute.
     * @see #isSetNodeID()
     * @see #unsetNodeID()
     * @see #getNodeID()
     * @generated
     */
    void setNodeID(short value);

    /**
     * Unsets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning#getNodeID
     * <em>Node ID</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #isSetNodeID()
     * @see #getNodeID()
     * @see #setNodeID(short)
     * @generated
     */
    void unsetNodeID();

    /**
     * Returns whether the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning#getNodeID
     * <em>Node ID</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return whether the value of the '<em>Node ID</em>' attribute is set.
     * @see #unsetNodeID()
     * @see #getNodeID()
     * @see #setNodeID(short)
     * @generated
     */
    boolean isSetNodeID();

    /**
     * Returns the value of the '<em><b>Node Name</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Node Name</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Node Name</em>' attribute.
     * @see #setNodeName(String)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceCommissioning_NodeName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='nodeName'"
     * @generated
     */
    String getNodeName();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning#getNodeName
     * <em>Node Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Node Name</em>' attribute.
     * @see #getNodeName()
     * @generated
     */
    void setNodeName(String value);

    /**
     * Returns the value of the '<em><b>Node Type</b></em>' attribute. The
     * literals are from the enumeration
     * {@link com.br_automation.buoat.xddeditor.XDD.NodeTypeType}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Node Type</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Node Type</em>' attribute.
     * @see com.br_automation.buoat.xddeditor.XDD.NodeTypeType
     * @see #isSetNodeType()
     * @see #unsetNodeType()
     * @see #setNodeType(NodeTypeType)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceCommissioning_NodeType()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='nodeType'"
     * @generated
     */
    NodeTypeType getNodeType();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning#getNodeType
     * <em>Node Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Node Type</em>' attribute.
     * @see com.br_automation.buoat.xddeditor.XDD.NodeTypeType
     * @see #isSetNodeType()
     * @see #unsetNodeType()
     * @see #getNodeType()
     * @generated
     */
    void setNodeType(NodeTypeType value);

    /**
     * Unsets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning#getNodeType
     * <em>Node Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #isSetNodeType()
     * @see #getNodeType()
     * @see #setNodeType(NodeTypeType)
     * @generated
     */
    void unsetNodeType();

    /**
     * Returns whether the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning#getNodeType
     * <em>Node Type</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return whether the value of the '<em>Node Type</em>' attribute is set.
     * @see #unsetNodeType()
     * @see #getNodeType()
     * @see #setNodeType(NodeTypeType)
     * @generated
     */
    boolean isSetNodeType();

    /**
     * Returns the value of the '<em><b>Used Network Interface</b></em>'
     * attribute. The default value is <code>"0"</code>. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Used Network Interface</em>' attribute isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Used Network Interface</em>' attribute.
     * @see #isSetUsedNetworkInterface()
     * @see #unsetUsedNetworkInterface()
     * @see #setUsedNetworkInterface(short)
     * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTDeviceCommissioning_UsedNetworkInterface()
     * @model default="0" unsettable="true"
     *        dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte"
     *        extendedMetaData="kind='attribute' name='usedNetworkInterface'"
     * @generated
     */
    short getUsedNetworkInterface();

    /**
     * Sets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning#getUsedNetworkInterface
     * <em>Used Network Interface</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Used Network Interface</em>'
     *            attribute.
     * @see #isSetUsedNetworkInterface()
     * @see #unsetUsedNetworkInterface()
     * @see #getUsedNetworkInterface()
     * @generated
     */
    void setUsedNetworkInterface(short value);

    /**
     * Unsets the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning#getUsedNetworkInterface
     * <em>Used Network Interface</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isSetUsedNetworkInterface()
     * @see #getUsedNetworkInterface()
     * @see #setUsedNetworkInterface(short)
     * @generated
     */
    void unsetUsedNetworkInterface();

    /**
     * Returns whether the value of the '
     * {@link com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning#getUsedNetworkInterface
     * <em>Used Network Interface</em>}' attribute is set. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @return whether the value of the '<em>Used Network Interface</em>'
     *         attribute is set.
     * @see #unsetUsedNetworkInterface()
     * @see #getUsedNetworkInterface()
     * @see #setUsedNetworkInterface(short)
     * @generated
     */
    boolean isSetUsedNetworkInterface();

} // TDeviceCommissioning
