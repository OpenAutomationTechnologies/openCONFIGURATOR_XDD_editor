/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Device Class Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getDeviceClassType()
 * @model extendedMetaData="name='deviceClass_._type'"
 * @generated
 */
public enum DeviceClassType implements Enumerator {
	/**
	 * The '<em><b>Compact</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPACT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPACT(0, "compact", "compact"),

	/**
	 * The '<em><b>Modular</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODULAR_VALUE
	 * @generated
	 * @ordered
	 */
	MODULAR(1, "modular", "modular"),

	/**
	 * The '<em><b>Configurable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGURABLE_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIGURABLE(2, "configurable", "configurable");

	/**
	 * The '<em><b>Compact</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Compact</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPACT
	 * @model name="compact"
	 * @generated
	 * @ordered
	 */
	public static final int COMPACT_VALUE = 0;

	/**
	 * The '<em><b>Modular</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Modular</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODULAR
	 * @model name="modular"
	 * @generated
	 * @ordered
	 */
	public static final int MODULAR_VALUE = 1;

	/**
	 * The '<em><b>Configurable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Configurable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIGURABLE
	 * @model name="configurable"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURABLE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Device Class Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeviceClassType[] VALUES_ARRAY =
		new DeviceClassType[] {
			COMPACT,
			MODULAR,
			CONFIGURABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Device Class Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DeviceClassType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Device Class Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceClassType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceClassType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Class Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceClassType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceClassType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Class Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceClassType get(int value) {
		switch (value) {
			case COMPACT_VALUE: return COMPACT;
			case MODULAR_VALUE: return MODULAR;
			case CONFIGURABLE_VALUE: return CONFIGURABLE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DeviceClassType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DeviceClassType
