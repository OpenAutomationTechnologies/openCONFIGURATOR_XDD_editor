/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>LE Dtype Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getLEDtypeType()
 * @model extendedMetaData="name='LEDtype_._type'"
 * @generated
 */
public enum LEDtypeType implements Enumerator {
	/**
	 * The '<em><b>IO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IO_VALUE
	 * @generated
	 * @ordered
	 */
	IO(0, "IO", "IO"),

	/**
	 * The '<em><b>Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE(1, "device", "device"),

	/**
	 * The '<em><b>Communication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNICATION(2, "communication", "communication");

	/**
	 * The '<em><b>IO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IO_VALUE = 0;

	/**
	 * The '<em><b>Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Device</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEVICE
	 * @model name="device"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_VALUE = 1;

	/**
	 * The '<em><b>Communication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Communication</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION
	 * @model name="communication"
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNICATION_VALUE = 2;

	/**
	 * An array of all the '<em><b>LE Dtype Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LEDtypeType[] VALUES_ARRAY =
		new LEDtypeType[] {
			IO,
			DEVICE,
			COMMUNICATION,
		};

	/**
	 * A public read-only list of all the '<em><b>LE Dtype Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LEDtypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>LE Dtype Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LEDtypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LEDtypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>LE Dtype Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LEDtypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LEDtypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>LE Dtype Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LEDtypeType get(int value) {
		switch (value) {
			case IO_VALUE: return IO;
			case DEVICE_VALUE: return DEVICE;
			case COMMUNICATION_VALUE: return COMMUNICATION;
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
	private LEDtypeType(int value, String name, String literal) {
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
	
} //LEDtypeType
