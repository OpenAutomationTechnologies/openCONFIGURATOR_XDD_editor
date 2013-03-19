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
 * <em><b>TObject Access Type</b></em>', and utility methods for working with
 * them. <!-- end-user-doc -->
 * 
 * @see com.br_automation.buoat.xddeditor.XDD.XDDPackage#getTObjectAccessType()
 * @model extendedMetaData="name='t_ObjectAccessType'"
 * @generated
 */
public enum TObjectAccessType implements Enumerator {
    /**
     * The '<em><b>Ro</b></em>' literal object. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #RO_VALUE
     * @generated
     * @ordered
     */
    RO(0, "ro", "ro"),

    /**
     * The '<em><b>Wo</b></em>' literal object. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #WO_VALUE
     * @generated
     * @ordered
     */
    WO(1, "wo", "wo"),

    /**
     * The '<em><b>Rw</b></em>' literal object. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #RW_VALUE
     * @generated
     * @ordered
     */
    RW(2, "rw", "rw"),

    /**
     * The '<em><b>Const</b></em>' literal object. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #CONST_VALUE
     * @generated
     * @ordered
     */
    CONST(3, "const", "const");

    /**
     * The '<em><b>Ro</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Object is read-only and can
     * change. <!-- end-model-doc -->
     * 
     * @see #RO
     * @model name="ro"
     * @generated
     * @ordered
     */
    public static final int RO_VALUE = 0;

    /**
     * The '<em><b>Wo</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Object is write-only. <!--
     * end-model-doc -->
     * 
     * @see #WO
     * @model name="wo"
     * @generated
     * @ordered
     */
    public static final int WO_VALUE = 1;

    /**
     * The '<em><b>Rw</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Object can be read and written
     * to. <!-- end-model-doc -->
     * 
     * @see #RW
     * @model name="rw"
     * @generated
     * @ordered
     */
    public static final int RW_VALUE = 2;

    /**
     * The '<em><b>Const</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Object is read-only and cannot
     * change. <!-- end-model-doc -->
     * 
     * @see #CONST
     * @model name="const"
     * @generated
     * @ordered
     */
    public static final int CONST_VALUE = 3;

    /**
     * An array of all the '<em><b>TObject Access Type</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final TObjectAccessType[] VALUES_ARRAY = new TObjectAccessType[] { RO, WO, RW,
        CONST, };

    /**
     * A public read-only list of all the '<em><b>TObject Access Type</b></em>'
     * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final List<TObjectAccessType> VALUES = Collections.unmodifiableList(Arrays
        .asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>TObject Access Type</b></em>' literal with the
     * specified literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static TObjectAccessType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            TObjectAccessType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>TObject Access Type</b></em>' literal with the
     * specified name. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static TObjectAccessType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            TObjectAccessType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>TObject Access Type</b></em>' literal with the
     * specified integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static TObjectAccessType get(int value) {
        switch (value) {
            case RO_VALUE:
                return RO;
            case WO_VALUE:
                return WO;
            case RW_VALUE:
                return RW;
            case CONST_VALUE:
                return CONST;
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
    private TObjectAccessType(int value,
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

} //TObjectAccessType
