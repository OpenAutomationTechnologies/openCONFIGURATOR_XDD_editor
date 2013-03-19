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
 * <em><b>Support Type</b></em>', and utility methods for working with them.
 * <!-- end-user-doc -->
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getSupportType()
 * @model extendedMetaData="name='support_._type'"
 * @generated
 */
public enum SupportType implements Enumerator {
    /**
     * The '<em><b>Mandatory</b></em>' literal object. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #MANDATORY_VALUE
     * @generated
     * @ordered
     */
    MANDATORY(0, "mandatory", "mandatory"),

    /**
     * The '<em><b>Optional</b></em>' literal object. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #OPTIONAL_VALUE
     * @generated
     * @ordered
     */
    OPTIONAL(1, "optional", "optional"),

    /**
     * The '<em><b>Conditional</b></em>' literal object. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #CONDITIONAL_VALUE
     * @generated
     * @ordered
     */
    CONDITIONAL(2, "conditional", "conditional");

    /**
     * The '<em><b>Mandatory</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Mandatory</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #MANDATORY
     * @model name="mandatory"
     * @generated
     * @ordered
     */
    public static final int MANDATORY_VALUE = 0;

    /**
     * The '<em><b>Optional</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Optional</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #OPTIONAL
     * @model name="optional"
     * @generated
     * @ordered
     */
    public static final int OPTIONAL_VALUE = 1;

    /**
     * The '<em><b>Conditional</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Conditional</b></em>' literal object isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #CONDITIONAL
     * @model name="conditional"
     * @generated
     * @ordered
     */
    public static final int CONDITIONAL_VALUE = 2;

    /**
     * An array of all the '<em><b>Support Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final SupportType[] VALUES_ARRAY = new SupportType[] { MANDATORY, OPTIONAL,
        CONDITIONAL, };

    /**
     * A public read-only list of all the '<em><b>Support Type</b></em>'
     * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final List<SupportType> VALUES = Collections.unmodifiableList(Arrays
        .asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Support Type</b></em>' literal with the specified
     * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static SupportType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SupportType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Support Type</b></em>' literal with the specified
     * name. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static SupportType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SupportType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Support Type</b></em>' literal with the specified
     * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static SupportType get(int value) {
        switch (value) {
            case MANDATORY_VALUE:
                return MANDATORY;
            case OPTIONAL_VALUE:
                return OPTIONAL;
            case CONDITIONAL_VALUE:
                return CONDITIONAL;
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
    private SupportType(int value,
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

} //SupportType
