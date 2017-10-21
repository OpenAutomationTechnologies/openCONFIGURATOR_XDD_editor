/**
 */
package com.br_automation.buoat.xddeditor.XDD;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Classification Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getClassificationType()
 * @model extendedMetaData="name='classification_._type'"
 * @generated
 */
public enum ClassificationType implements Enumerator {
	/**
	 * The '<em><b>Controller</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLLER_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROLLER(0, "Controller", "Controller"),

	/**
	 * The '<em><b>Industrial PC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDUSTRIAL_PC_VALUE
	 * @generated
	 * @ordered
	 */
	INDUSTRIAL_PC(1, "IndustrialPC", "Industrial PC"),

	/**
	 * The '<em><b>Operator Interface</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATOR_INTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATOR_INTERFACE(2, "OperatorInterface", "Operator Interface"),

	/**
	 * The '<em><b>IO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IO_VALUE
	 * @generated
	 * @ordered
	 */
	IO(3, "IO", "IO"),

	/**
	 * The '<em><b>Drive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRIVE_VALUE
	 * @generated
	 * @ordered
	 */
	DRIVE(4, "Drive", "Drive"),

	/**
	 * The '<em><b>Motor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTOR_VALUE
	 * @generated
	 * @ordered
	 */
	MOTOR(5, "Motor", "Motor"),

	/**
	 * The '<em><b>Encoder</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENCODER_VALUE
	 * @generated
	 * @ordered
	 */
	ENCODER(6, "Encoder", "Encoder"),

	/**
	 * The '<em><b>Vision System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VISION_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	VISION_SYSTEM(7, "VisionSystem", "Vision System"),

	/**
	 * The '<em><b>Sensor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENSOR_VALUE
	 * @generated
	 * @ordered
	 */
	SENSOR(8, "Sensor", "Sensor"),

	/**
	 * The '<em><b>Temperature</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURE_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPERATURE(9, "Temperature", "Temperature"),

	/**
	 * The '<em><b>Counter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNTER_VALUE
	 * @generated
	 * @ordered
	 */
	COUNTER(10, "Counter", "Counter"),

	/**
	 * The '<em><b>Safe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAFE_VALUE
	 * @generated
	 * @ordered
	 */
	SAFE(11, "Safe", "Safe"),

	/**
	 * The '<em><b>Analog</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALOG_VALUE
	 * @generated
	 * @ordered
	 */
	ANALOG(12, "Analog", "Analog"),

	/**
	 * The '<em><b>Digital</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIGITAL_VALUE
	 * @generated
	 * @ordered
	 */
	DIGITAL(13, "Digital", "Digital"),

	/**
	 * The '<em><b>Input</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	INPUT(14, "Input", "Input"),

	/**
	 * The '<em><b>Output</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTPUT_VALUE
	 * @generated
	 * @ordered
	 */
	OUTPUT(15, "Output", "Output");

	/**
	 * The '<em><b>Controller</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Controller</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTROLLER
	 * @model name="Controller"
	 * @generated
	 * @ordered
	 */
	public static final int CONTROLLER_VALUE = 0;

	/**
	 * The '<em><b>Industrial PC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Industrial PC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INDUSTRIAL_PC
	 * @model name="IndustrialPC" literal="Industrial PC"
	 * @generated
	 * @ordered
	 */
	public static final int INDUSTRIAL_PC_VALUE = 1;

	/**
	 * The '<em><b>Operator Interface</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Operator Interface</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPERATOR_INTERFACE
	 * @model name="OperatorInterface" literal="Operator Interface"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATOR_INTERFACE_VALUE = 2;

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
	public static final int IO_VALUE = 3;

	/**
	 * The '<em><b>Drive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Drive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRIVE
	 * @model name="Drive"
	 * @generated
	 * @ordered
	 */
	public static final int DRIVE_VALUE = 4;

	/**
	 * The '<em><b>Motor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Motor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOTOR
	 * @model name="Motor"
	 * @generated
	 * @ordered
	 */
	public static final int MOTOR_VALUE = 5;

	/**
	 * The '<em><b>Encoder</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Encoder</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENCODER
	 * @model name="Encoder"
	 * @generated
	 * @ordered
	 */
	public static final int ENCODER_VALUE = 6;

	/**
	 * The '<em><b>Vision System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vision System</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VISION_SYSTEM
	 * @model name="VisionSystem" literal="Vision System"
	 * @generated
	 * @ordered
	 */
	public static final int VISION_SYSTEM_VALUE = 7;

	/**
	 * The '<em><b>Sensor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sensor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SENSOR
	 * @model name="Sensor"
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR_VALUE = 8;

	/**
	 * The '<em><b>Temperature</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Temperature</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURE
	 * @model name="Temperature"
	 * @generated
	 * @ordered
	 */
	public static final int TEMPERATURE_VALUE = 9;

	/**
	 * The '<em><b>Counter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Counter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COUNTER
	 * @model name="Counter"
	 * @generated
	 * @ordered
	 */
	public static final int COUNTER_VALUE = 10;

	/**
	 * The '<em><b>Safe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Safe</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAFE
	 * @model name="Safe"
	 * @generated
	 * @ordered
	 */
	public static final int SAFE_VALUE = 11;

	/**
	 * The '<em><b>Analog</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Analog</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANALOG
	 * @model name="Analog"
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_VALUE = 12;

	/**
	 * The '<em><b>Digital</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Digital</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIGITAL
	 * @model name="Digital"
	 * @generated
	 * @ordered
	 */
	public static final int DIGITAL_VALUE = 13;

	/**
	 * The '<em><b>Input</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Input</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INPUT
	 * @model name="Input"
	 * @generated
	 * @ordered
	 */
	public static final int INPUT_VALUE = 14;

	/**
	 * The '<em><b>Output</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Output</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OUTPUT
	 * @model name="Output"
	 * @generated
	 * @ordered
	 */
	public static final int OUTPUT_VALUE = 15;

	/**
	 * An array of all the '<em><b>Classification Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ClassificationType[] VALUES_ARRAY =
		new ClassificationType[] {
			CONTROLLER,
			INDUSTRIAL_PC,
			OPERATOR_INTERFACE,
			IO,
			DRIVE,
			MOTOR,
			ENCODER,
			VISION_SYSTEM,
			SENSOR,
			TEMPERATURE,
			COUNTER,
			SAFE,
			ANALOG,
			DIGITAL,
			INPUT,
			OUTPUT,
		};

	/**
	 * A public read-only list of all the '<em><b>Classification Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ClassificationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Classification Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClassificationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClassificationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Classification Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClassificationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClassificationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Classification Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClassificationType get(int value) {
		switch (value) {
			case CONTROLLER_VALUE: return CONTROLLER;
			case INDUSTRIAL_PC_VALUE: return INDUSTRIAL_PC;
			case OPERATOR_INTERFACE_VALUE: return OPERATOR_INTERFACE;
			case IO_VALUE: return IO;
			case DRIVE_VALUE: return DRIVE;
			case MOTOR_VALUE: return MOTOR;
			case ENCODER_VALUE: return ENCODER;
			case VISION_SYSTEM_VALUE: return VISION_SYSTEM;
			case SENSOR_VALUE: return SENSOR;
			case TEMPERATURE_VALUE: return TEMPERATURE;
			case COUNTER_VALUE: return COUNTER;
			case SAFE_VALUE: return SAFE;
			case ANALOG_VALUE: return ANALOG;
			case DIGITAL_VALUE: return DIGITAL;
			case INPUT_VALUE: return INPUT;
			case OUTPUT_VALUE: return OUTPUT;
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
	private ClassificationType(int value, String name, String literal) {
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
	
} //ClassificationType
