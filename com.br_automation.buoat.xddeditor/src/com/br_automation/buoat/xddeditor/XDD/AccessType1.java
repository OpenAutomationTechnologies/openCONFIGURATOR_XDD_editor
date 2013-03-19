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
 * <em><b>Access Type1</b></em>', and utility methods for working with them.
 * <!-- end-user-doc -->
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getAccessType1()
 * @model extendedMetaData="name='access_._1_._type'"
 * @generated
 */
public enum AccessType1 implements Enumerator {
    /**
     * The '<em><b>Const</b></em>' literal object. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #CONST_VALUE
     * @generated
     * @ordered
     */
    CONST(0, "const", "const"),

    /**
     * The '<em><b>Read</b></em>' literal object. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #READ_VALUE
     * @generated
     * @ordered
     */
    READ(1, "read", "read"),

    /**
     * The '<em><b>Write</b></em>' literal object. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #WRITE_VALUE
     * @generated
     * @ordered
     */
    WRITE(2, "write", "write"),

    /**
     * The '<em><b>Read Write</b></em>' literal object. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #READ_WRITE_VALUE
     * @generated
     * @ordered
     */
    READ_WRITE(3, "readWrite", "readWrite"),

    /**
     * The '<em><b>No Access</b></em>' literal object. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #NO_ACCESS_VALUE
     * @generated
     * @ordered
     */
    NO_ACCESS(4, "noAccess", "noAccess");

    /**
     * The '<em><b>Const</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Const</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #CONST
     * @model name="const"
     * @generated
     * @ordered
     */
    public static final int CONST_VALUE = 0;

    /**
     * The '<em><b>Read</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Read</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #READ
     * @model name="read"
     * @generated
     * @ordered
     */
    public static final int READ_VALUE = 1;

    /**
     * The '<em><b>Write</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Write</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #WRITE
     * @model name="write"
     * @generated
     * @ordered
     */
    public static final int WRITE_VALUE = 2;

    /**
     * The '<em><b>Read Write</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Read Write</b></em>' literal object isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #READ_WRITE
     * @model name="readWrite"
     * @generated
     * @ordered
     */
    public static final int READ_WRITE_VALUE = 3;

    /**
     * The '<em><b>No Access</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>No Access</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #NO_ACCESS
     * @model name="noAccess"
     * @generated
     * @ordered
     */
    public static final int NO_ACCESS_VALUE = 4;

    /**
     * An array of all the '<em><b>Access Type1</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final AccessType1[] VALUES_ARRAY = new AccessType1[] { CONST, READ, WRITE,
        READ_WRITE, NO_ACCESS, };

    /**
     * A public read-only list of all the '<em><b>Access Type1</b></em>'
     * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final List<AccessType1> VALUES = Collections.unmodifiableList(Arrays
        .asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Access Type1</b></em>' literal with the specified
     * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static AccessType1 get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AccessType1 result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Access Type1</b></em>' literal with the specified
     * name. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static AccessType1 getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AccessType1 result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Access Type1</b></em>' literal with the specified
     * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static AccessType1 get(int value) {
        switch (value) {
            case CONST_VALUE:
                return CONST;
            case READ_VALUE:
                return READ;
            case WRITE_VALUE:
                return WRITE;
            case READ_WRITE_VALUE:
                return READ_WRITE;
            case NO_ACCESS_VALUE:
                return NO_ACCESS;
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
    private AccessType1(int value,
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

} //AccessType1
