package com.br_automation.buoat.xddeditor.XDD.custom;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.TCNFeatures;
import com.br_automation.buoat.xddeditor.XDD.provider.TCNFeaturesItemProvider;

public class CustomTCNFeaturesItemProvider extends TCNFeaturesItemProvider {

    public CustomTCNFeaturesItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    //Override because this Event is fired when selections are made
    // TODO: Find out whether this is the correct way to do it.
    @Override
    public Object getEditableValue(Object object) {
        XDDUtilities.setMultiplexFeature(
            ((TCNFeatures) object).isDLLCNFeatureMultiplex(),
            (DocumentRoot) EcoreUtil.getRootContainer((EObject) object));
        return object;
    }

}// CustomTCNFeaturesItemProvider