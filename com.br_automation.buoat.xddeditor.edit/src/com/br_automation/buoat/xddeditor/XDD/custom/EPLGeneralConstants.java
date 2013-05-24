/**
 * @since 11.04.2013
 * @author Joris Lückenga, Bernecker + Rainer Industrie Elektronik Ges.m.b.H.
 */

package com.br_automation.buoat.xddeditor.XDD.custom;

/**
 * @brief Class containing constants of EPL Specification
 * 
 * @author Joris Lückenga
 */
public final class EPLGeneralConstants { // NOPMD by lueckengaj on 18.04.13 09:24

    public static final int FF_OFFESET_MULTIPLEXED_ACCESS = 9;
    public static final int FF_OFFSET_CONFIGURATION_MANAGER = 8;
    public static final int FF_OFFSET_MN_BASIC_ETHERNET_MODE = 11;
    public static final int FF_OFFSET_MULTIPLE_ASND = 16;
    public static final int FF_OFFSET_PRESP_CHAINING = 18;
    public static final int FF_OFFSET_ROUTING_TYPE1_SUPPORT = 12;
    public static final int FF_OFFSET_ROUTING_TYPE2_SUPPORT = 13;
    public static final int NMT_CYCLETIMING_REC = 0x1F98;
    public static final int NMT_DEVICETYPE = 0x1000;
    public static final int NMT_FEATUREFLAGS_U32 = 0x1F82;
    public static final int NMT_ISOCHSLOTASSIGN_AU8 = 0x1F9C;
    public static final int NMT_MNCYCLETIMING_REC = 0x1F8A;
    public static final int NMT_MULTIPLCYCLEASSIGN_AU8 = 0x1F9B;
    public static final int NMT_NODEASSIGNMENT_AU32 = 0x1F81;
    public static final int NMT_RELATIVELATENCYDIFF_AU32 = 0x1050;
    public static final int NMT_STARTUP_U32 = 0x1F80;
    public static final int NMT_STOREPARAM_REC = 0x1010;
    public static final int NWL_HOSTNAME_VSTR = 0x1F9A;
    public static final int NWL_IPADDRTABLE_REC_MAX = 0x1E49;
    public static final int NWL_IPADDRTABLE_REC_MIN = 0x1E40;
    public static final int NWL_IPGROUP_TYPE = 0x1E4A;
    public static final int PDO_RXMAPPPARAM_MAX = 0x16FF;
    public static final int PDO_RXMAPPPARAM_MIN = 0x1600;
    public static final int PDO_TXCOMMPARAM_MAX = 0x1AFF;
    public static final int PDO_TXCOMMPARAM_MIN = 0x1A00;

    /**
     * @brief EPLGeneralConstants provides only static constants.
     */
    private EPLGeneralConstants() {
    }

} //EPLGeneralConstants
