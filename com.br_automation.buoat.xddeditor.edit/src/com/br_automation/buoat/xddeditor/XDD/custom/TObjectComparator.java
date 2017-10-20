/**
 * @since 16.4.2013
 * @author Joris Lückenga, Bernecker + Rainer Industrie Elektronik Ges.m.b.H.
 */

package com.br_automation.buoat.xddeditor.XDD.custom;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Comparator;

import com.br_automation.buoat.xddeditor.XDD.TObject;

/**
 *
 * @brief A comparator for objects of type TObject.
 *
 *        Enables sorting of an XDD's TObject-Elements.
 *
 * @author Joris Lückenga
 */
public class TObjectComparator implements Comparator<TObject>, Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * @see Comparator#compare(Object, Object)
     */
    @Override
    public int compare(TObject o1, TObject o2) {
        return (new BigInteger(o1.getIndex()).intValue())
            - (new BigInteger(o2.getIndex()).intValue());
    }

}
