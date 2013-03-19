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
 * <em><b>Access Type Type</b></em>', and utility methods for working with them.
 * <!-- end-user-doc -->
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getAccessTypeType()
 * @model extendedMetaData="name='accessType_._type'"
 * @generated
 */
public enum AccessTypeType implements Enumerator {
    /**
     * The '<em><b>Read Only</b></em>' literal object. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #READ_ONLY_VALUE
     * @generated
     * @ordered
     */
    READ_ONLY(0, "readOnly", "readOnly"),

    /**
     * The '<em><b>Write Only</b></em>' literal object. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #WRITE_ONLY_VALUE
     * @generated
     * @ordered
     */
    WRITE_ONLY(1, "writeOnly", "writeOnly"),

    /**
     * The '<em><b>Read Write Output</b></em>' literal object. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #READ_WRITE_OUTPUT_VALUE
     * @generated
     * @ordered
     */
    READ_WRITE_OUTPUT(2, "readWriteOutput", "readWriteOutput");

    /**
     * The '<em><b>Read Only</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Read Only</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #READ_ONLY
     * @model name="readOnly"
     * @generated
     * @ordered
     */
    public static final int READ_ONLY_VALUE = 0;

    /**
     * The '<em><b>Write Only</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Write Only</b></em>' literal object isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #WRITE_ONLY
     * @model name="writeOnly"
     * @generated
     * @ordered
     */
    public static final int WRITE_ONLY_VALUE = 1;

    /**
     * The '<em><b>Read Write Output</b></em>' literal value. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Read Write Output</b></em>' literal object
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #READ_WRITE_OUTPUT
     * @model name="readWriteOutput"
     * @generated
     * @ordered
     */
    public static final int READ_WRITE_OUTPUT_VALUE = 2;

    /**
     * An array of all the '<em><b>Access Type Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final AccessTypeType[] VALUES_ARRAY = new AccessTypeType[] { READ_ONLY,
        WRITE_ONLY, READ_WRITE_OUTPUT, };

    /**
     * A public read-only list of all the '<em><b>Access Type Type</b></em>'
     * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final List<AccessTypeType> VALUES = Collections.unmodifiableList(Arrays
        .asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Access Type Type</b></em>' literal with the specified
     * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static AccessTypeType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AccessTypeType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Access Type Type</b></em>' literal with the specified
     * name. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static AccessTypeType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AccessTypeType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Access Type Type</b></em>' literal with the specified
     * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static AccessTypeType get(int value) {
        switch (value) {
            case READ_ONLY_VALUE:
                return READ_ONLY;
            case WRITE_ONLY_VALUE:
                return WRITE_ONLY;
            case READ_WRITE_OUTPUT_VALUE:
                return READ_WRITE_OUTPUT;
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
    private AccessTypeType(int value,
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

} //AccessTypeType
