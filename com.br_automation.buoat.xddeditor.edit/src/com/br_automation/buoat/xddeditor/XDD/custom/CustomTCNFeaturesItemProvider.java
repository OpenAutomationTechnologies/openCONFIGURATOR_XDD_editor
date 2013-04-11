/**
 * @since 19.3.2013
 * @author Joris Lückenga, Bernecker + Rainer Industrie Elektronik Ges.m.b.H.
 */

package com.br_automation.buoat.xddeditor.XDD.custom;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.TCNFeatures;
import com.br_automation.buoat.xddeditor.XDD.provider.TCNFeaturesItemProvider;

/**
 * @brief Custom ItemProvider to set/unset Multiplexing-Feature in object 0x1F82
 *        correspondingly.
 * 
 *        This extended class uses the setMultiplexFeature-Method in XDDUtilites
 *        to set or unset the multiplex feature. To achieve this, an override of
 *        the getEditableValue-Method (which is triggered when the property is
 *        selected/changed) is needed.
 * 
 * @author Joris Lückenga
 */
public class CustomTCNFeaturesItemProvider extends TCNFeaturesItemProvider {

    /**
     * @see TCNFeaturesItemProvider#TCNFeaturesItemProvider(AdapterFactory)
     */
    public CustomTCNFeaturesItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    //  TODO: Find out whether this is the correct way to do it.
    @Override
    public Object getEditableValue(Object object) {
        XDDUtilities.setMultiplexFeature(
            ((TCNFeatures) object).isDLLCNFeatureMultiplex(),
            (DocumentRoot) EcoreUtil.getRootContainer((EObject) object));
        return object;
    }

} //CustomTCNFeaturesItemProvider
