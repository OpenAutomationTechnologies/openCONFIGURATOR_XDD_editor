/**
 * @brief Filters for TObjects with Index set to 0x1F80
 * @since 19.03.2013
 * @author Joris Lückenga, Bernecker + Rainer Industrie Elektronik Ges.m.b.H.
 */

package com.br_automation.buoat.xddeditor.XDD.custom;

import java.math.BigInteger;

import org.eclipse.jface.viewers.IFilter;

import com.br_automation.buoat.xddeditor.XDD.TObject;

/**
 * @brief Filters for TObjects with Index set to 0x1F80.
 */
public class Index1F80Filter implements IFilter {

    @Override
    public boolean select(Object toTest) {
        if (toTest instanceof TObject) {
            if (((TObject) toTest).getIndex() != null)
                return (new BigInteger(1, ((TObject) toTest).getIndex()).intValue() == 0x1F80);
        }
        return false;
    }

}
