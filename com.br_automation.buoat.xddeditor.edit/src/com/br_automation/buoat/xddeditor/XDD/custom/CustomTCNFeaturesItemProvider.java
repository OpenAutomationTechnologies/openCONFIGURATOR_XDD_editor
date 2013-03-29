package com.br_automation.buoat.xddeditor.XDD.custom;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.TCNFeatures;
import com.br_automation.buoat.xddeditor.XDD.provider.TCNFeaturesItemProvider;

/**
 * @author Joris Lückenga
 * @since 19.3.2013
 * @brief extended class from TCNFeaturesItemProvider to enable Modification in
 *        TObject (FeatureFlag) an TCNFeatures at the same time
 */
public class CustomTCNFeaturesItemProvider extends TCNFeaturesItemProvider {
    /**
     * @brief CustomTCNFeaturesItemProvider constructor
     * @param adapterFactory
     */
    public CustomTCNFeaturesItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * TODO: Find out whether this is the correct way to do it.
     * 
     * @return returns the Object that was edited
     */
    @Override
    public Object getEditableValue(Object object) {
        XDDUtilities.setMultiplexFeature(
            ((TCNFeatures) object).isDLLCNFeatureMultiplex(),
            (DocumentRoot) EcoreUtil.getRootContainer((EObject) object));
        return object;
    }
} // CustomTCNFeaturesItemProvider
