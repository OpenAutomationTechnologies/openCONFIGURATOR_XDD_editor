/**
 * @since 19.3.2013
 * @author Joris Lückenga, B&R Industrial Automation GmbH
 */

package com.br_automation.buoat.xddeditor.XDD.custom;

/**
 * @brief Values of XDD datatypes acc. to EPSG DS 301 v1.1.0.
 *
 *        This enum is used to get the names, representation value and bit
 *        length from different datatypes used in XDD files according to the
 *        POWERLINK Communication Profile Specification.
 *
 * @author Joris Lückenga
 */
public enum DataType {

    BOOLEAN(8, "Boolean", 0x1), INTEGER16(16, "Integer16", 0x3), INTEGER24(24, "Integer24", 0x10), INTEGER32(32,
            "Integer32", 0x4), INTEGER40(40, "Integer40", 0x12), INTEGER48(48, "Integer48", 0x13), INTEGER56(56,
                    "Integer56", 0x14), INTEGER64(64, "Integer64", 0x15), INTEGER8(8, "Integer8", 0x2), REAL32(32,
                            "Real32", 0x8), REAL64(64, "Real64", 0x11), UNKNOWN(0, "Unknown", 0xFFFF), UNSIGNED16(16,
                                    "Unsigned16", 0x6), UNSIGNED24(24, "Unsigned24", 0x16), UNSIGNED32(32, "Unsigned32",
                                            0x7), UNSIGNED40(40, "Unsigned40", 0x18), UNSIGNED48(48, "Unsigned48",
                                                    0x19), UNSIGNED56(56, "Unsigned56", 0x1A), UNSIGNED64(64,
                                                            "Unsigned64", 0x1B), UNSIGNED8(8, "Unsigned8", 0x5);

    private int bitSize;
    private String typeName;
    private int typeValue;

    /**
     * @param size
     *            Size in bits of specified DataType e.g 64,32 etc.
     * @param typeName
     *            Name of the DataType.
     * @param typeValue
     *            Integer-Representation of the type. See EPSG DS 301 v1.1.0.
     */
    private DataType(int size, String typeName, int typeValue) {
        this.bitSize = size;
        this.typeName = typeName;
        this.typeValue = typeValue;
    }

    /**
     * @brief Convert integer to DataType.
     * @param value
     *            Integer representation of the dataType acc. to EPSG DS 301
     *            v1.1.0.
     * @return An instance of DataType if <code>value</code> matches an
     *         Integer-Representation of a DataType specified in EPSG DS 301
     *         v1.1.0, UNKNOWN otherwise.
     */
    public static DataType fromInt(int value) {
        for (DataType dataType : DataType.values())
            if (dataType.getTypeValue() == value)
                return dataType;

        return UNKNOWN;
    }

    public int getBitSize() {
        return this.bitSize;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public int getTypeValue() {
        return this.typeValue;
    }

} // DataType
