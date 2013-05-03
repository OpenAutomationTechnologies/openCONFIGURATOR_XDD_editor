/**
 * @since 16.4.2013
 * @author Joris Lückenga, Bernecker + Rainer Industrie Elektronik Ges.m.b.H.
 */

package com.br_automation.buoat.xddeditor.XDD.custom;

import java.math.BigInteger;
import java.util.Comparator;

import com.br_automation.buoat.xddeditor.XDD.SubObjectType;

/**
 * 
 * @brief A comparator for objects of type SubObjectType.
 * 
 *        Enables sorting of an XDD's SubObject-Elements.
 * 
 * @author Joris Lückenga
 */
public class SubObjectComparator implements Comparator<SubObjectType> {

    /**
     * @see Comparator#compare(Object, Object)
     */
    @Override
    public int compare(SubObjectType o1, SubObjectType o2) {
        return (new BigInteger(o1.getSubIndex()).intValue())
            - (new BigInteger(o2.getSubIndex()).intValue());
    }

}
