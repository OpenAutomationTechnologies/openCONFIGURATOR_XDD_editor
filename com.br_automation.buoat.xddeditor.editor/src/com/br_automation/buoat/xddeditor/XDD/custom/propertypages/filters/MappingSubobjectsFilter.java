/**
 * @since 19.3.2013
 * @author Joris Lückenga, Bernecker + Rainer Industrie Elektronik Ges.m.b.H.
 */

package com.br_automation.buoat.xddeditor.XDD.custom.propertypages.filters;

import java.math.BigInteger;

import org.eclipse.jface.viewers.IFilter;

import com.br_automation.buoat.xddeditor.XDD.SubObjectType;
import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.custom.EPLGeneralConstants;

/**
 * @brief Filters for SubObjectTypes with parent having index of 0x1600 or
 *        0x1A00 and subindex not set to 0x0.
 * 
 * @author Joris Lückenga
 * */
public class MappingSubobjectsFilter implements IFilter {

    @Override
    public boolean select(Object toTest) {
        if (toTest instanceof SubObjectType) {
            SubObjectType subObject = (SubObjectType) toTest;
            TObject parentObject = (TObject) subObject.eContainer();

            if (parentObject.getIndex() != null) {
                int objectIndex = new BigInteger(1, parentObject.getIndex()).intValue();
                if ((objectIndex >= EPLGeneralConstants.PDO_RX_MAPP_PARAM_MIN && objectIndex <= EPLGeneralConstants.PDO_RX_MAPP_PARAM_MAX)
                    || (objectIndex >= EPLGeneralConstants.PDO_TX_COMM_PARAM_MIN && objectIndex <= EPLGeneralConstants.PDO_TX_COMM_PARAM_MAX)) {
                    if (subObject.getSubIndex() != null) {
                        int subIndex = new BigInteger(subObject.getSubIndex()).intValue();
                        return (subIndex != 0);
                    } //This statement ignores NumberOfEntries object 
                }
            }
        }
        return false;
    }

} //MappingSubobjectsFilter
