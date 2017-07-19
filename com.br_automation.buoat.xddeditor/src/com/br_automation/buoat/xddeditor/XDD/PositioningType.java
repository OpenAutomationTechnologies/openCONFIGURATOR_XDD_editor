/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Positioning Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getPositioningType()
 * @model extendedMetaData="name='positioning_._type'"
 * @generated
 */
public enum PositioningType implements Enumerator {
	/**
	 * The '<em><b>Remote</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_VALUE
	 * @generated
	 * @ordered
	 */
	REMOTE(0, "remote", "remote"),

	/**
	 * The '<em><b>Local Above</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_ABOVE_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL_ABOVE(1, "localAbove", "localAbove"),

	/**
	 * The '<em><b>Local Below</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_BELOW_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL_BELOW(2, "localBelow", "localBelow"),

	/**
	 * The '<em><b>Local Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL_LEFT(3, "localLeft", "localLeft"),

	/**
	 * The '<em><b>Local Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL_RIGHT(4, "localRight", "localRight");

	/**
	 * The '<em><b>Remote</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Remote</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOTE
	 * @model name="remote"
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_VALUE = 0;

	/**
	 * The '<em><b>Local Above</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Local Above</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCAL_ABOVE
	 * @model name="localAbove"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_ABOVE_VALUE = 1;

	/**
	 * The '<em><b>Local Below</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Local Below</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCAL_BELOW
	 * @model name="localBelow"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_BELOW_VALUE = 2;

	/**
	 * The '<em><b>Local Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Local Left</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCAL_LEFT
	 * @model name="localLeft"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_LEFT_VALUE = 3;

	/**
	 * The '<em><b>Local Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Local Right</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCAL_RIGHT
	 * @model name="localRight"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_RIGHT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Positioning Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PositioningType[] VALUES_ARRAY =
		new PositioningType[] {
			REMOTE,
			LOCAL_ABOVE,
			LOCAL_BELOW,
			LOCAL_LEFT,
			LOCAL_RIGHT,
		};

	/**
	 * A public read-only list of all the '<em><b>Positioning Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PositioningType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Positioning Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PositioningType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PositioningType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Positioning Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PositioningType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PositioningType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Positioning Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PositioningType get(int value) {
		switch (value) {
			case REMOTE_VALUE: return REMOTE;
			case LOCAL_ABOVE_VALUE: return LOCAL_ABOVE;
			case LOCAL_BELOW_VALUE: return LOCAL_BELOW;
			case LOCAL_LEFT_VALUE: return LOCAL_LEFT;
			case LOCAL_RIGHT_VALUE: return LOCAL_RIGHT;
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
	private PositioningType(int value, String name, String literal) {
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
	
} //PositioningType
