/**
 * @since 02.5.2013
 * @author Joris Lückenga, B&R Industrial Automation GmbH
 */

package com.br_automation.buoat.xddeditor.XDD.custom;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.TMNFeatures;
import com.br_automation.buoat.xddeditor.XDD.provider.TMNFeaturesItemProvider;

/**
 * @brief Custom ItemProvider to set/unset MNFeatures in object 0x1F82
 *        correspondingly.
 *
 * @author Joris Lückenga
 */
public class CustomTMNFeaturesItemProvider extends TMNFeaturesItemProvider {

    /**
     * @see TMNFeaturesItemProvider#TMNFeaturesItemProvider(AdapterFactory)
     */
    public CustomTMNFeaturesItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    @Override
    public Object getEditableValue(Object object) {
        XDDUtilities.setFeatureFlag(((TMNFeatures) object).isNMTMNBasicEthernet(), 11,
                (DocumentRoot) EcoreUtil.getRootContainer((EObject) object));
        return object;
    }

} // CustomTMNFeaturesItemProvider
