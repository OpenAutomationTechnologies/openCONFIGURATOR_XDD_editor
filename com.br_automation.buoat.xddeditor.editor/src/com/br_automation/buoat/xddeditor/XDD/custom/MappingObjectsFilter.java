package com.br_automation.buoat.xddeditor.XDD.custom;

import java.math.BigInteger;

import org.eclipse.jface.viewers.IFilter;

import com.br_automation.buoat.xddeditor.XDD.SubObjectType;
import com.br_automation.buoat.xddeditor.XDD.TObject;

//Filters for SubObjectTypes with Parent having Index of "1600" oder "1A00"
public class MappingObjectsFilter implements IFilter {

    @Override
    public boolean select(Object toTest) {

        if (toTest instanceof SubObjectType) {

            SubObjectType toTest2 = (SubObjectType) toTest;
            TObject parentObject = (TObject) toTest2.eContainer();
            int result;

            if (parentObject.getIndex() != null)
                result = new BigInteger(1, parentObject.getIndex()).intValue();
            else
                return false;
            if (result >= 0x1600 && result <= 0x16FF || result >= 0x1A00 && result <= 0x1AFF)
                return true;
            else
                return false;

        } else
            return false;
    }//select

}//MappingObjectsFilter
