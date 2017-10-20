/**
 * @since 16.5.2013
 * @author Joris Lückenga, Bernecker + Rainer Industrie Elektronik Ges.m.b.H.
 *
 *  @copyright (c) 2017, Bernecker + Rainer Industrie Elektronik Ges.m.b.H.
 *            All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *   * Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *   * Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *   * Neither the name of the copyright holders nor the
 *     names of its contributors may be used to endorse or promote products
 *     derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL COPYRIGHT HOLDERS BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *******************************************************************************/

package com.br_automation.buoat.xddeditor.XDD.custom.propertypages;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.eef.runtime.ui.properties.sections.EEFAdvancedPropertySection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPart;

import com.br_automation.buoat.xddeditor.XDD.SubObjectType;
import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;
import com.br_automation.buoat.xddeditor.XDD.custom.Messages;
import com.br_automation.buoat.xddeditor.XDD.custom.ModelLoader;
import com.br_automation.buoat.xddeditor.XDD.custom.XDDUtilities;

/**
 * @brief BasicViewSection for TabbedPropertySheetPage
 *
 *        Enables adding adapters/listeners to selected objects, provides a list
 *        viewer for element properties.
 *
 * @author Joris Lückenga
 */
public class BasicViewSection extends EEFAdvancedPropertySection {

    private static final EContentAdapter indexListenerAdapter = new EContentAdapter() {

        /**
         * @brief Adapter to listen for index-changes to perform template-lookup
         *        and auto-completion.
         * @see EContentAdapter#notifyChanged(Notification)
         */
        @Override
        public void notifyChanged(Notification msg) {
            super.notifyChanged(msg);
            // A "change of index"-event has FeatureID 7
            if (msg.getFeatureID(this.getClass()) == XDDPackage.TOBJECT__INDEX) {
                if (msg.getNotifier() instanceof TObject) {
                    TObject currentObject = ((TObject) msg.getNotifier());
                    if (currentObject.getIndex() != null
                            && new BigInteger(currentObject.getIndex()).intValue() >= 0x1000
                            && new BigInteger(currentObject.getIndex()).intValue() <= 0x1FFF) {
                        List<Integer> lookupObject = new ArrayList<Integer>(1);
                        lookupObject.add(new BigInteger(currentObject.getIndex()).intValue());
                        List<TObject> foundObjectList = XDDUtilities.getTObjectsFromResource(ModelLoader.class
                                .getResource(Messages.basicViewSection_resourceTemplate_defaultObjects), lookupObject);
                        if (foundObjectList != null && !foundObjectList.isEmpty()) {
                            TObject templateObject = foundObjectList.get(0);
                            // Copy attributes from templateObject
                            currentObject.setAccessType(templateObject.getAccessType());
                            currentObject.setDefaultValue(templateObject.getDefaultValue());
                            currentObject.setName(templateObject.getName());
                            currentObject.setPDOmapping(templateObject.getPDOmapping());
                            currentObject.setObjectType(templateObject.getObjectType());
                            currentObject.setDataType(templateObject.getDataType());
                        }
                    }
                }
            }
        }

    };

    private static final EContentAdapter subIndexListenerAdapter = new EContentAdapter() {

        /**
         * @brief Adapter to listen for subindex-changes to perform
         *        template-lookup and auto-completion.
         * @see EContentAdapter#notifyChanged(Notification)
         */
        @Override
        public void notifyChanged(Notification msg) {
            super.notifyChanged(msg);
            // A "change of subindex"-event has FeatureID 11
            if (msg.getFeatureID(this.getClass()) == XDDPackage.SUB_OBJECT_TYPE__SUB_INDEX) {
                if (msg.getNotifier() instanceof SubObjectType) {
                    SubObjectType currentSubObject = ((SubObjectType) msg.getNotifier());
                    if (currentSubObject.getSubIndex() != null) {
                        List<Integer> lookupParentObject = new ArrayList<Integer>(1);
                        // find index of parent and get the subobject
                        TObject parentObject = (TObject) currentSubObject.eContainer();
                        if (parentObject.getIndex() != null
                                && new BigInteger(parentObject.getIndex()).intValue() >= 0x1000
                                && new BigInteger(parentObject.getIndex()).intValue() >= 0x1FFF) {
                            lookupParentObject.add(new BigInteger(parentObject.getIndex()).intValue());
                            // Check if template should be used
                            List<TObject> foundObjectList = XDDUtilities.getTObjectsFromResource(
                                    ModelLoader.class
                                            .getResource(Messages.basicViewSection_resourceTemplate_defaultObjects),
                                    lookupParentObject);
                            if (foundObjectList != null && !foundObjectList.isEmpty()) {
                                TObject templateObject = foundObjectList.get(0);
                                if (!templateObject.getSubObject().isEmpty()) {
                                    // get setted Index -> search for index in
                                    // template -> copy from templateObject
                                    int currentSubIndex = new BigInteger(currentSubObject.getSubIndex()).intValue();
                                    for (SubObjectType templateSubObject : templateObject.getSubObject()) {
                                        int templateSubObjectIndex = new BigInteger(templateSubObject.getSubIndex())
                                                .intValue();
                                        if (templateSubObjectIndex == currentSubIndex) {
                                            currentSubObject.setName(templateSubObject.getName());
                                            currentSubObject.setObjectType(templateSubObject.getObjectType());
                                            currentSubObject.setDataType(templateSubObject.getDataType());
                                            currentSubObject.setAccessType(templateSubObject.getAccessType());
                                            currentSubObject.setPDOmapping(templateSubObject.getPDOmapping());
                                            currentSubObject.setDefaultValue(templateSubObject.getDefaultValue());
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } // notifyChanged

    };

    /**
     * @see EEFAdvancedPropertySection#setInput(IWorkbenchPart, ISelection)
     */
    @Override
    public void setInput(IWorkbenchPart part, ISelection selection) {
        super.setInput(part, selection);
        if (this.page != null)
            this.page.setPropertySourceProvider(this);
        if (selection instanceof IStructuredSelection) {
            Object input = ((IStructuredSelection) selection).getFirstElement();
            if (input instanceof TObject) {
                if (!((TObject) input).eAdapters().contains(BasicViewSection.indexListenerAdapter))
                    ((TObject) input).eAdapters().add(BasicViewSection.indexListenerAdapter);
            } else if (input instanceof SubObjectType)
                if (!(((SubObjectType) input).eAdapters().contains(BasicViewSection.subIndexListenerAdapter)))
                    ((SubObjectType) input).eAdapters().add(BasicViewSection.subIndexListenerAdapter);
        }
    }
} // BasicViewSection
