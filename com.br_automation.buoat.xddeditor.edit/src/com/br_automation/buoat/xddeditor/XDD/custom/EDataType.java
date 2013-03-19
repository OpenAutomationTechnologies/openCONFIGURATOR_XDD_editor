package com.br_automation.buoat.xddeditor.XDD.custom;

public enum EDataType {

    BOOLEAN(8, "Boolean", 0x1),
    INTEGER8(8, "Integer8", 0x2),
    INTEGER16(16, "Integer16", 0x3),
    INTEGER32(32, "Integer32", 0x4),
    UNSINGNED8(8, "Unsigned8", 0x5),
    UNSINGNED16(16, "Unsigned16", 0x6),
    UNSINGNED32(32, "Unsigned32", 0x7),
    REAL32(32, "Real32", 0x8),
    INTEGER24(24, "Integer24", 0x10),
    REAL64(64, "Real64", 0x11),
    INTEGER40(40, "Integer40", 0x12),
    INTEGER48(48, "Integer48", 0x13),
    INTEGER56(56, "Integer56", 0x14),
    INTEGER64(64, "Integer64", 0x15),
    UNSINGNED24(24, "Unsigned24", 0x16),
    UNSINGNED40(40, "Unsigned40", 0x18),
    UNSINGNED48(48, "Unsigned48", 0x19),
    UNSINGNED56(56, "Unsigned56", 0x1A),
    UNSINGNED64(64, "Unsigned64", 0x1B),
    NOTKNOW(0, "Notknown", 0xFFFF);

    private int bitSize;
    private String typeName;
    private int typeValue;

    private EDataType(int size,
        String typeName,
        int typeValue) {
        bitSize = size;
        this.typeName = typeName;
        this.typeValue = typeValue;
    }

    public String toIntString() {
        return Integer.toString(getBitSize());
    }

    public int getBitSize() {
        return bitSize;
    }

    public String getTypeName() {
        return typeName;
    }

    public int getTypeValue() {
        return typeValue;
    }

    public static EDataType fromInt(int value) {
        for (EDataType dataType : EDataType.values())
            if (dataType.getTypeValue() == value)
                return dataType;

        return NOTKNOW;
    }

}

//public enum Status {
//    PASSED(1, "Passed", "The test has passed."),
//    FAILED(-1, "Failed", "The test was executed but failed."),
//    DID_NOT_RUN(0, "Did not run", "The test did not start.");
// 
//    private int code;
//    private String label;
//    private String description;
// 
//    /**
//     * A mapping between the integer code and its corresponding Status to facilitate lookup by code.
//     */
//    private static Map<Integer, Status> codeToStatusMapping;
// 
//    private Status(int code, String label, String description) {
//        this.code = code;
//        this.label = label;
//        this.description = description;
//    }

