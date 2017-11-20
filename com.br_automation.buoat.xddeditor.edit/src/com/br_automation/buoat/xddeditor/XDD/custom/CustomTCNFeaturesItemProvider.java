/**
 * @since 19.3.2013
 * @author Joris L�ckenga, B&R Industrial Automation GmbH
 */

package com.br_automation.buoat.xddeditor.XDD.custom;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.TCNFeatures;
import com.br_automation.buoat.xddeditor.XDD.provider.TCNFeaturesItemProvider;

/**
 * @brief Custom ItemProvider to set/unset CN-Features in object 0x1F82
 *        correspondingly.
 *
 * @author Joris L�ckenga
 */
public class CustomTCNFeaturesItemProvider extends TCNFeaturesItemProvider {

    /**
     * @see TCNFeaturesItemProvider#TCNFeaturesItemProvider(AdapterFactory)
     */
    public CustomTCNFeaturesItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    // TODO: Find out whether this is the correct way to do it.
    @Override
    public Object getEditableValue(Object object) {
        XDDUtilities.setFeatureFlag(((TCNFeatures) object).isDLLCNFeatureMultiplex(), 9,
                (DocumentRoot) EcoreUtil.getRootContainer((EObject) object));
        XDDUtilities.setFeatureFlag(((TCNFeatures) object).isDLLCNPResChaining(), 18,
                (DocumentRoot) EcoreUtil.getRootContainer((EObject) object));

        return object;
    }

} // CustomTCNFeaturesItemProvider
