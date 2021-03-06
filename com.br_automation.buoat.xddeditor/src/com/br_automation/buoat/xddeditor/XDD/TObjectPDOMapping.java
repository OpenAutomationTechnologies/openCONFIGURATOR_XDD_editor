/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TObject PDO Mapping</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTObjectPDOMapping()
 * @model extendedMetaData="name='t_ObjectPDOMapping'"
 * @generated
 */
public enum TObjectPDOMapping implements Enumerator {
	/**
	 * The '<em><b>No</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_VALUE
	 * @generated
	 * @ordered
	 */
	NO(0, "no", "no"),

	/**
	 * The '<em><b>Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT(1, "default", "default"),

	/**
	 * The '<em><b>Optional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	OPTIONAL(2, "optional", "optional"),

	/**
	 * The '<em><b>TPDO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TPDO_VALUE
	 * @generated
	 * @ordered
	 */
	TPDO(3, "TPDO", "TPDO"),

	/**
	 * The '<em><b>RPDO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RPDO_VALUE
	 * @generated
	 * @ordered
	 */
	RPDO(4, "RPDO", "RPDO");

	/**
	 * The '<em><b>No</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Object cannot be mapped to a PDO.
	 * <!-- end-model-doc -->
	 * @see #NO
	 * @model name="no"
	 * @generated
	 * @ordered
	 */
	public static final int NO_VALUE = 0;

	/**
	 * The '<em><b>Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Object is by default mapped to a PDO.
	 * <!-- end-model-doc -->
	 * @see #DEFAULT
	 * @model name="default"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_VALUE = 1;

	/**
	 * The '<em><b>Optional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Object can be mapped to any PDO.
	 * <!-- end-model-doc -->
	 * @see #OPTIONAL
	 * @model name="optional"
	 * @generated
	 * @ordered
	 */
	public static final int OPTIONAL_VALUE = 2;

	/**
	 * The '<em><b>TPDO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Object can be mapped to a Transmit PDO.
	 * <!-- end-model-doc -->
	 * @see #TPDO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TPDO_VALUE = 3;

	/**
	 * The '<em><b>RPDO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Object can be mapped to a Receive PDO.
	 * <!-- end-model-doc -->
	 * @see #RPDO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RPDO_VALUE = 4;

	/**
	 * An array of all the '<em><b>TObject PDO Mapping</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TObjectPDOMapping[] VALUES_ARRAY =
		new TObjectPDOMapping[] {
			NO,
			DEFAULT,
			OPTIONAL,
			TPDO,
			RPDO,
		};

	/**
	 * A public read-only list of all the '<em><b>TObject PDO Mapping</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TObjectPDOMapping> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TObject PDO Mapping</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TObjectPDOMapping get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TObjectPDOMapping result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TObject PDO Mapping</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TObjectPDOMapping getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TObjectPDOMapping result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TObject PDO Mapping</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TObjectPDOMapping get(int value) {
		switch (value) {
			case NO_VALUE: return NO;
			case DEFAULT_VALUE: return DEFAULT;
			case OPTIONAL_VALUE: return OPTIONAL;
			case TPDO_VALUE: return TPDO;
			case RPDO_VALUE: return RPDO;
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
	private TObjectPDOMapping(int value, String name, String literal) {
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
	
} //TObjectPDOMapping
