package com.br_automation.buoat.xddeditor.XDD.custom;

/**
 * @author Joris Lückenga
 * @since 19.3.2013
 * @brief Datatypes & Sizes for MappingObjects
 */
public enum DataType {
    BOOLEAN(8, "Boolean", 0x1),
    INTEGER16(16, "Integer16", 0x3),
    INTEGER24(24, "Integer24", 0x10),
    INTEGER32(32, "Integer32", 0x4),
    INTEGER40(40, "Integer40", 0x12),
    INTEGER48(48, "Integer48", 0x13),
    INTEGER56(56, "Integer56", 0x14),
    INTEGER64(64, "Integer64", 0x15),
    INTEGER8(8, "Integer8", 0x2),
    REAL32(32, "Real32", 0x8),
    REAL64(64, "Real64", 0x11),
    UNKNOWN(0, "Unknown", 0xFFFF),
    UNSIGNED16(16, "Unsigned16", 0x6),
    UNSIGNED24(24, "Unsigned24", 0x16),
    UNSIGNED32(32, "Unsigned32", 0x7),
    UNSIGNED40(40, "Unsigned40", 0x18),
    UNSIGNED48(48, "Unsigned48", 0x19),
    UNSIGNED56(56, "Unsigned56", 0x1A),
    UNSIGNED64(64, "Unsigned64", 0x1B),
    UNSIGNED8(8, "Unsigned8", 0x5);

    private int bitSize;
    private String typeName;
    private int typeValue;

    /**
     * @brief constructor of DataType
     * @param size
     *            Size of specified DataType e.g 64,32 etc.
     * @param typeName
     *            If its Unsinged, Integer etc.
     * @param typeValue
     *            value stands for a specified type -> 0x5 -> Unsigned8 with
     *            size 8
     */
    private DataType(int size,
        String typeName,
        int typeValue) {
        this.bitSize = size;
        this.typeName = typeName;
        this.typeValue = typeValue;
    }

    /**
     * @brief Checks whether the value matchtes to a dataType or not
     * @param value
     *            of the datatype
     * @return if DataType is know, it is returned, else the unknown Datatype is
     *         returned
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

    /**
     * @brief turns Integer into String
     * @return returns the string from the Integer
     */
    public String toIntString() {
        return Integer.toString(this.getBitSize());
    }

} //DataType
