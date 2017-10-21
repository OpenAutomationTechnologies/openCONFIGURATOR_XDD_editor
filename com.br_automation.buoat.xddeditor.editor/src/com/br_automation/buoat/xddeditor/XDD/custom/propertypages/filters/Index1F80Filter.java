/**
 * @since 19.3.2013
 * @author Joris L�ckenga, B&R Industrial Automation GmbH
 */

package com.br_automation.buoat.xddeditor.XDD.custom.propertypages.filters;

import java.math.BigInteger;

import org.eclipse.jface.viewers.IFilter;

import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.custom.EPLGeneralConstants;

/**
 * @brief Filters for TObjects with Index set to 0x1F80.
 *
 * @author Joris L�ckenga
 */
public class Index1F80Filter implements IFilter {

    @Override
    public boolean select(Object toTest) {
        if (toTest instanceof TObject && (((TObject) toTest).getIndex() != null))
            return (new BigInteger(1, ((TObject) toTest).getIndex()).intValue() == EPLGeneralConstants.NMT_STARTUP_U32);
        return false;
    }

} // Index1F80Filter
