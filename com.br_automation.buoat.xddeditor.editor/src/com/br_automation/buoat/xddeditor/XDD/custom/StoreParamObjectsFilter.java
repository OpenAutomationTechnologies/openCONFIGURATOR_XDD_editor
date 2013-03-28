package com.br_automation.buoat.xddeditor.XDD.custom;

import java.math.BigInteger;

import org.eclipse.jface.viewers.IFilter;

import com.br_automation.buoat.xddeditor.XDD.SubObjectType;
import com.br_automation.buoat.xddeditor.XDD.TObject;

/**
 * @author Joris Lückenga
 * @since 25.03.2013
 * @brief Filters for SubobjectTypes of Index 1010 and Subindex &gt; 1
 */
public class StoreParamObjectsFilter implements IFilter {

    @Override
    public boolean select(Object toTest) {

        if (toTest instanceof SubObjectType) {

            SubObjectType toTest2 = (SubObjectType) toTest;
            TObject parentObject = (TObject) toTest2.eContainer();
            int result;

            if (parentObject.getIndex() != null) {
                result = new BigInteger(1, parentObject.getIndex()).intValue();

                if (result == 0x1010) {
                    int test = new BigInteger(toTest2.getSubIndex()).intValue();
                    if (test != 0)
                        return true;
                }
            }

        }
        return false;
    }

}
