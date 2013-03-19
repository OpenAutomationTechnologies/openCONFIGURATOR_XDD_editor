/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>LE Dcolor Type</b></em>', and utility methods for working with them.
 * <!-- end-user-doc -->
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getLEDcolorType()
 * @model extendedMetaData="name='LEDcolor_._type'"
 * @generated
 */
public enum LEDcolorType implements Enumerator {
    /**
     * The '<em><b>Green</b></em>' literal object. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #GREEN_VALUE
     * @generated
     * @ordered
     */
    GREEN(0, "green", "green"),

    /**
     * The '<em><b>Amber</b></em>' literal object. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #AMBER_VALUE
     * @generated
     * @ordered
     */
    AMBER(1, "amber", "amber"),

    /**
     * The '<em><b>Red</b></em>' literal object. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #RED_VALUE
     * @generated
     * @ordered
     */
    RED(2, "red", "red");

    /**
     * The '<em><b>Green</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Green</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #GREEN
     * @model name="green"
     * @generated
     * @ordered
     */
    public static final int GREEN_VALUE = 0;

    /**
     * The '<em><b>Amber</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Amber</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #AMBER
     * @model name="amber"
     * @generated
     * @ordered
     */
    public static final int AMBER_VALUE = 1;

    /**
     * The '<em><b>Red</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Red</b></em>' literal object isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #RED
     * @model name="red"
     * @generated
     * @ordered
     */
    public static final int RED_VALUE = 2;

    /**
     * An array of all the '<em><b>LE Dcolor Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final LEDcolorType[] VALUES_ARRAY = new LEDcolorType[] { GREEN, AMBER, RED, };

    /**
     * A public read-only list of all the '<em><b>LE Dcolor Type</b></em>'
     * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final List<LEDcolorType> VALUES = Collections.unmodifiableList(Arrays
        .asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>LE Dcolor Type</b></em>' literal with the specified
     * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static LEDcolorType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            LEDcolorType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>LE Dcolor Type</b></em>' literal with the specified
     * name. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static LEDcolorType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            LEDcolorType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>LE Dcolor Type</b></em>' literal with the specified
     * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static LEDcolorType get(int value) {
        switch (value) {
            case GREEN_VALUE:
                return GREEN;
            case AMBER_VALUE:
                return AMBER;
            case RED_VALUE:
                return RED;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    private LEDcolorType(int value,
        String name,
        String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public int getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getLiteral() {
        return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string
     * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }

} //LEDcolorType
