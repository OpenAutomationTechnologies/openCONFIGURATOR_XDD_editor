package com.br_automation.buoat.xddeditor.XDD.custom;

import java.math.BigInteger;

import org.eclipse.jface.viewers.IFilter;

import com.br_automation.buoat.xddeditor.XDD.SubObjectType;
import com.br_automation.buoat.xddeditor.XDD.TObject;

/**
 * @author Joris Lückenga
 * @brief Filters for SubObjectTypes with Parent having Index of "1600" oder
 *        "1A00"
 * @since 19.3.2013
 * */
public class MappingObjectsFilter implements IFilter {

    @Override
    public boolean select(Object toTest) {

        if (toTest instanceof SubObjectType) {
            SubObjectType toTest2 = (SubObjectType) toTest;
            TObject parentObject = (TObject) toTest2.eContainer();
            int result;

            if (parentObject.getIndex() != null) {
                result = new BigInteger(1, parentObject.getIndex()).intValue();
                if (result >= 0x1600 && result <= 0x16FF || result >= 0x1A00 && result <= 0x1AFF) {
                    int test = new BigInteger(toTest2.getSubIndex()).intValue();
                    if (test != 0)
                        return true;
                }
            }
        }
        return false;
    } //select
} //MappingObjectsFilter
