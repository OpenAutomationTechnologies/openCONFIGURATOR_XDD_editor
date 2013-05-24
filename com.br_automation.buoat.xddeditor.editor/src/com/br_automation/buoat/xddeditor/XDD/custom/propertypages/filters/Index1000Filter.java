/**
 * @since 19.3.2013
 * @author Joris Lückenga, Bernecker + Rainer Industrie Elektronik Ges.m.b.H.
 */

package com.br_automation.buoat.xddeditor.XDD.custom.propertypages.filters;

import java.math.BigInteger;

import org.eclipse.jface.viewers.IFilter;

import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.custom.EPLGeneralConstants;

/**
 * @brief Filters for TObjects with Index set to 0x1000.
 * 
 * @author Joris Lückenga
 */
public class Index1000Filter implements IFilter {

    @Override
    public boolean select(Object toTest) {
        if (toTest instanceof TObject && (((TObject) toTest).getIndex() != null))
            return (new BigInteger(1, ((TObject) toTest).getIndex()).intValue() == EPLGeneralConstants.NMT_DEVICETYPE);
        return false;
    }

} //Index1000Filter
