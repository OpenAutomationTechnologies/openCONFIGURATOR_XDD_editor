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
 * <em><b>Version Type Type</b></em>', and utility methods for working with
 * them. <!-- end-user-doc -->
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getVersionTypeType()
 * @model extendedMetaData="name='versionType_._type'"
 * @generated
 */
public enum VersionTypeType implements Enumerator {
    /**
     * The '<em><b>SW</b></em>' literal object. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #SW_VALUE
     * @generated
     * @ordered
     */
    SW(0, "SW", "SW"),

    /**
     * The '<em><b>FW</b></em>' literal object. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #FW_VALUE
     * @generated
     * @ordered
     */
    FW(1, "FW", "FW"),

    /**
     * The '<em><b>HW</b></em>' literal object. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #HW_VALUE
     * @generated
     * @ordered
     */
    HW(2, "HW", "HW");

    /**
     * The '<em><b>SW</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Software <!-- end-model-doc -->
     * 
     * @see #SW
     * @model
     * @generated
     * @ordered
     */
    public static final int SW_VALUE = 0;

    /**
     * The '<em><b>FW</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Firmware <!-- end-model-doc -->
     * 
     * @see #FW
     * @model
     * @generated
     * @ordered
     */
    public static final int FW_VALUE = 1;

    /**
     * The '<em><b>HW</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Hardware <!-- end-model-doc -->
     * 
     * @see #HW
     * @model
     * @generated
     * @ordered
     */
    public static final int HW_VALUE = 2;

    /**
     * An array of all the '<em><b>Version Type Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final VersionTypeType[] VALUES_ARRAY = new VersionTypeType[] { SW, FW, HW, };

    /**
     * A public read-only list of all the '<em><b>Version Type Type</b></em>'
     * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final List<VersionTypeType> VALUES = Collections.unmodifiableList(Arrays
        .asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Version Type Type</b></em>' literal with the
     * specified literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static VersionTypeType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            VersionTypeType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Version Type Type</b></em>' literal with the
     * specified name. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static VersionTypeType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            VersionTypeType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Version Type Type</b></em>' literal with the
     * specified integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static VersionTypeType get(int value) {
        switch (value) {
            case SW_VALUE:
                return SW;
            case FW_VALUE:
                return FW;
            case HW_VALUE:
                return HW;
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
    private VersionTypeType(int value,
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

} //VersionTypeType
