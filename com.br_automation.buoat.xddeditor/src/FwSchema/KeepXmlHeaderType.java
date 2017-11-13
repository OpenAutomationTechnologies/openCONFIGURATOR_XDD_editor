/**
 */
package FwSchema;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Keep Xml Header Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see FwSchema.FwSchemaPackage#getKeepXmlHeaderType()
 * @model extendedMetaData="name='KeepXmlHeader_._type'"
 * @generated
 */
public enum KeepXmlHeaderType implements Enumerator {
    /**
     * The '<em><b>0</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #_0_VALUE
     * @generated
     * @ordered
     */
    _0(0, "_0", "0"),

    /**
     * The '<em><b>1</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #_1_VALUE
     * @generated
     * @ordered
     */
    _1(1, "_1", "1");

    /**
     * The '<em><b>0</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>0</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #_0
     * @model literal="0"
     * @generated
     * @ordered
     */
    public static final int _0_VALUE = 0;

    /**
     * The '<em><b>1</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>1</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #_1
     * @model literal="1"
     * @generated
     * @ordered
     */
    public static final int _1_VALUE = 1;

    /**
     * An array of all the '<em><b>Keep Xml Header Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final KeepXmlHeaderType[] VALUES_ARRAY =
        new KeepXmlHeaderType[] {
            _0,
            _1,
        };

    /**
     * A public read-only list of all the '<em><b>Keep Xml Header Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<KeepXmlHeaderType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Keep Xml Header Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static KeepXmlHeaderType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            KeepXmlHeaderType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Keep Xml Header Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static KeepXmlHeaderType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            KeepXmlHeaderType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Keep Xml Header Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static KeepXmlHeaderType get(int value) {
        switch (value) {
            case _0_VALUE: return _0;
            case _1_VALUE: return _1;
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
    private KeepXmlHeaderType(int value, String name, String literal) {
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
    
} //KeepXmlHeaderType
