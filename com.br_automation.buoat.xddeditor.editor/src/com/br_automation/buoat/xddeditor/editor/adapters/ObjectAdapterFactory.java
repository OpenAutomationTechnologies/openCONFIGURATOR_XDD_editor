/*******************************************************************************
 * @file   ObjectAdapterFactory.java
 *
 * @author Sree Hari Vignesh, Kalycito Infotech Private Limited.
 *
 * @copyright (c) 2017, Kalycito Infotech Private Limited
 *                    All rights reserved.
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

package com.br_automation.buoat.xddeditor.editor.adapters;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.properties.IPropertySource;

import com.br_automation.buoat.xddeditor.XDD.SubObjectType;
import com.br_automation.buoat.xddeditor.XDD.impl.TObjectImpl;

/**
 * Factory implementation of property sources for POWERLNK Objects available in
 * device description file.
 *
 * @author Sree Hari Vignesh
 *
 */
public class ObjectAdapterFactory extends AbstractObjectPropertySource implements IAdapterFactory {

    /**
     * Property source for objects.
     */
    private ObjectPropertySource objectPropertySource;

    /**
     * Property source for sub-objects.
     */
    private SubObjectPropertySource subObjectPropertySource;

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.core.runtime.IAdapterFactory#getAdapter(java.lang.Object,
     * java.lang.Class)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getAdapter(final Object adaptableObject, @SuppressWarnings("rawtypes") Class adapterType) {
        if (adapterType == IPropertySource.class) {

            if (adaptableObject instanceof TObjectImpl) {

                if (objectPropertySource == null) {
                    objectPropertySource = new ObjectPropertySource((TObjectImpl) adaptableObject);
                } else {
                    objectPropertySource.setObjectData((TObjectImpl) adaptableObject);
                }

                return objectPropertySource;
            } else if (adaptableObject instanceof SubObjectType) {
                if (subObjectPropertySource == null) {
                    subObjectPropertySource = new SubObjectPropertySource((SubObjectType) adaptableObject);
                } else {
                    subObjectPropertySource.setSubObjectData((SubObjectType) adaptableObject);
                }

                return subObjectPropertySource;
            } else {
                System.err.println("Invalid Selection adapter.");
            }
        }
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.core.runtime.IAdapterFactory#getAdapterList()
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public Class[] getAdapterList() {
        return new Class[] { IPropertySource.class };
    }
}
