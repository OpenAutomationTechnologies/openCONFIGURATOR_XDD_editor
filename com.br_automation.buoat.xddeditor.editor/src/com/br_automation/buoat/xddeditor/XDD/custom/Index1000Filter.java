package com.br_automation.buoat.xddeditor.XDD.custom;

import java.math.BigInteger;

import org.eclipse.jface.viewers.IFilter;

import com.br_automation.buoat.xddeditor.XDD.TObject;

//Filters for TObjects with Index set to "1F82"
public class Index1000Filter implements IFilter {

    @Override
    public boolean select(Object toTest) {
        if (toTest instanceof TObject) {
            TObject tobject = (TObject) toTest;
            String result;

            if (tobject.getIndex() != null)
                result = new BigInteger(1, tobject.getIndex()).toString(16);
            else
                return false;
            return (result.contentEquals("1000"));
        } else
            return false;
    }//select

}//Index1F82Filter