/**
 * @since 02.5.2013
 * @author Joris Lückenga, Bernecker + Rainer Industrie Elektronik Ges.m.b.H.
 */

package com.br_automation.buoat.xddeditor.XDD.custom;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.TGeneralFeatures;
import com.br_automation.buoat.xddeditor.XDD.provider.TGeneralFeaturesItemProvider;

/**
 * @brief Custom ItemProvider to set/unset GeneralFeatures in object 0x1F82
 *        correspondingly.
 * 
 * @author Joris Lückenga
 */
public class CustomTGeneralFeaturesItemProvider extends TGeneralFeaturesItemProvider {

    /**
     * @see TGeneralFeaturesItemProvider#TGeneralFeaturesItemProvider(AdapterFactory)
     */
    public CustomTGeneralFeaturesItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }


    @Override
    public Object getEditableValue(Object object) {
        XDDUtilities.setFeatureFlag(
            ((TGeneralFeatures) object).isCFMConfigManager(), 8,
            (DocumentRoot) EcoreUtil.getRootContainer((EObject) object));
        XDDUtilities.setFeatureFlag(
            ((TGeneralFeatures) object).isRT1RT1Support(), 12,
            (DocumentRoot) EcoreUtil.getRootContainer((EObject) object));
        XDDUtilities.setFeatureFlag(
            ((TGeneralFeatures) object).isRT2RT2Support(), 13,
            (DocumentRoot) EcoreUtil.getRootContainer((EObject) object));

        return object;
    }

} //CustomTGeneralFeaturesItemProvider
