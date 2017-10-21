/**
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.br_automation.buoat.xddeditor.XDD.NodeTypeType;
import com.br_automation.buoat.xddeditor.XDD.TDeviceCommissioning;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDevice Commissioning</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceCommissioningImpl#getNetworkName <em>Network Name</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceCommissioningImpl#getNodeID <em>Node ID</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceCommissioningImpl#getNodeName <em>Node Name</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceCommissioningImpl#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link com.br_automation.buoat.xddeditor.XDD.impl.TDeviceCommissioningImpl#getUsedNetworkInterface <em>Used Network Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TDeviceCommissioningImpl extends EObjectImpl implements TDeviceCommissioning {
	/**
	 * The default value of the '{@link #getNetworkName() <em>Network Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkName()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetworkName() <em>Network Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkName()
	 * @generated
	 * @ordered
	 */
	protected String networkName = NETWORK_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodeID() <em>Node ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeID()
	 * @generated
	 * @ordered
	 */
	protected static final short NODE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNodeID() <em>Node ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeID()
	 * @generated
	 * @ordered
	 */
	protected short nodeID = NODE_ID_EDEFAULT;

	/**
	 * This is true if the Node ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nodeIDESet;

	/**
	 * The default value of the '{@link #getNodeName() <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeName()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeName() <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeName()
	 * @generated
	 * @ordered
	 */
	protected String nodeName = NODE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodeType() <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeType()
	 * @generated
	 * @ordered
	 */
	protected static final NodeTypeType NODE_TYPE_EDEFAULT = NodeTypeType.MN;

	/**
	 * The cached value of the '{@link #getNodeType() <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeType()
	 * @generated
	 * @ordered
	 */
	protected NodeTypeType nodeType = NODE_TYPE_EDEFAULT;

	/**
	 * This is true if the Node Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nodeTypeESet;

	/**
	 * The default value of the '{@link #getUsedNetworkInterface() <em>Used Network Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedNetworkInterface()
	 * @generated
	 * @ordered
	 */
	protected static final short USED_NETWORK_INTERFACE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUsedNetworkInterface() <em>Used Network Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedNetworkInterface()
	 * @generated
	 * @ordered
	 */
	protected short usedNetworkInterface = USED_NETWORK_INTERFACE_EDEFAULT;

	/**
	 * This is true if the Used Network Interface attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean usedNetworkInterfaceESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TDeviceCommissioningImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XDDPackage.eINSTANCE.getTDeviceCommissioning();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetworkName() {
		return networkName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkName(String newNetworkName) {
		String oldNetworkName = networkName;
		networkName = newNetworkName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TDEVICE_COMMISSIONING__NETWORK_NAME, oldNetworkName, networkName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getNodeID() {
		return nodeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeID(short newNodeID) {
		short oldNodeID = nodeID;
		nodeID = newNodeID;
		boolean oldNodeIDESet = nodeIDESet;
		nodeIDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TDEVICE_COMMISSIONING__NODE_ID, oldNodeID, nodeID, !oldNodeIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNodeID() {
		short oldNodeID = nodeID;
		boolean oldNodeIDESet = nodeIDESet;
		nodeID = NODE_ID_EDEFAULT;
		nodeIDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TDEVICE_COMMISSIONING__NODE_ID, oldNodeID, NODE_ID_EDEFAULT, oldNodeIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNodeID() {
		return nodeIDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeName() {
		return nodeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeName(String newNodeName) {
		String oldNodeName = nodeName;
		nodeName = newNodeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TDEVICE_COMMISSIONING__NODE_NAME, oldNodeName, nodeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeTypeType getNodeType() {
		return nodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeType(NodeTypeType newNodeType) {
		NodeTypeType oldNodeType = nodeType;
		nodeType = newNodeType == null ? NODE_TYPE_EDEFAULT : newNodeType;
		boolean oldNodeTypeESet = nodeTypeESet;
		nodeTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TDEVICE_COMMISSIONING__NODE_TYPE, oldNodeType, nodeType, !oldNodeTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNodeType() {
		NodeTypeType oldNodeType = nodeType;
		boolean oldNodeTypeESet = nodeTypeESet;
		nodeType = NODE_TYPE_EDEFAULT;
		nodeTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TDEVICE_COMMISSIONING__NODE_TYPE, oldNodeType, NODE_TYPE_EDEFAULT, oldNodeTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNodeType() {
		return nodeTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getUsedNetworkInterface() {
		return usedNetworkInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsedNetworkInterface(short newUsedNetworkInterface) {
		short oldUsedNetworkInterface = usedNetworkInterface;
		usedNetworkInterface = newUsedNetworkInterface;
		boolean oldUsedNetworkInterfaceESet = usedNetworkInterfaceESet;
		usedNetworkInterfaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XDDPackage.TDEVICE_COMMISSIONING__USED_NETWORK_INTERFACE, oldUsedNetworkInterface, usedNetworkInterface, !oldUsedNetworkInterfaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUsedNetworkInterface() {
		short oldUsedNetworkInterface = usedNetworkInterface;
		boolean oldUsedNetworkInterfaceESet = usedNetworkInterfaceESet;
		usedNetworkInterface = USED_NETWORK_INTERFACE_EDEFAULT;
		usedNetworkInterfaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XDDPackage.TDEVICE_COMMISSIONING__USED_NETWORK_INTERFACE, oldUsedNetworkInterface, USED_NETWORK_INTERFACE_EDEFAULT, oldUsedNetworkInterfaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUsedNetworkInterface() {
		return usedNetworkInterfaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XDDPackage.TDEVICE_COMMISSIONING__NETWORK_NAME:
				return getNetworkName();
			case XDDPackage.TDEVICE_COMMISSIONING__NODE_ID:
				return getNodeID();
			case XDDPackage.TDEVICE_COMMISSIONING__NODE_NAME:
				return getNodeName();
			case XDDPackage.TDEVICE_COMMISSIONING__NODE_TYPE:
				return getNodeType();
			case XDDPackage.TDEVICE_COMMISSIONING__USED_NETWORK_INTERFACE:
				return getUsedNetworkInterface();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XDDPackage.TDEVICE_COMMISSIONING__NETWORK_NAME:
				setNetworkName((String)newValue);
				return;
			case XDDPackage.TDEVICE_COMMISSIONING__NODE_ID:
				setNodeID((Short)newValue);
				return;
			case XDDPackage.TDEVICE_COMMISSIONING__NODE_NAME:
				setNodeName((String)newValue);
				return;
			case XDDPackage.TDEVICE_COMMISSIONING__NODE_TYPE:
				setNodeType((NodeTypeType)newValue);
				return;
			case XDDPackage.TDEVICE_COMMISSIONING__USED_NETWORK_INTERFACE:
				setUsedNetworkInterface((Short)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XDDPackage.TDEVICE_COMMISSIONING__NETWORK_NAME:
				setNetworkName(NETWORK_NAME_EDEFAULT);
				return;
			case XDDPackage.TDEVICE_COMMISSIONING__NODE_ID:
				unsetNodeID();
				return;
			case XDDPackage.TDEVICE_COMMISSIONING__NODE_NAME:
				setNodeName(NODE_NAME_EDEFAULT);
				return;
			case XDDPackage.TDEVICE_COMMISSIONING__NODE_TYPE:
				unsetNodeType();
				return;
			case XDDPackage.TDEVICE_COMMISSIONING__USED_NETWORK_INTERFACE:
				unsetUsedNetworkInterface();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XDDPackage.TDEVICE_COMMISSIONING__NETWORK_NAME:
				return NETWORK_NAME_EDEFAULT == null ? networkName != null : !NETWORK_NAME_EDEFAULT.equals(networkName);
			case XDDPackage.TDEVICE_COMMISSIONING__NODE_ID:
				return isSetNodeID();
			case XDDPackage.TDEVICE_COMMISSIONING__NODE_NAME:
				return NODE_NAME_EDEFAULT == null ? nodeName != null : !NODE_NAME_EDEFAULT.equals(nodeName);
			case XDDPackage.TDEVICE_COMMISSIONING__NODE_TYPE:
				return isSetNodeType();
			case XDDPackage.TDEVICE_COMMISSIONING__USED_NETWORK_INTERFACE:
				return isSetUsedNetworkInterface();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (networkName: ");
		result.append(networkName);
		result.append(", nodeID: ");
		if (nodeIDESet) result.append(nodeID); else result.append("<unset>");
		result.append(", nodeName: ");
		result.append(nodeName);
		result.append(", nodeType: ");
		if (nodeTypeESet) result.append(nodeType); else result.append("<unset>");
		result.append(", usedNetworkInterface: ");
		if (usedNetworkInterfaceESet) result.append(usedNetworkInterface); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TDeviceCommissioningImpl
