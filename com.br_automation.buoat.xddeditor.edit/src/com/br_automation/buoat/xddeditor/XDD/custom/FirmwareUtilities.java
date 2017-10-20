/*******************************************************************************
 * @file   FirmwareUtilities.java
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

package com.br_automation.buoat.xddeditor.XDD.custom;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

import FwSchema.DocumentRoot;
import FwSchema.util.FwSchemaResourceFactoryImpl;

/**
 * Class to load the firmware file from the file system and updates the model
 * data
 *
 * @author Sree Hari Vignesh
 *
 */
public class FirmwareUtilities {

    public FirmwareUtilities() {

    }

    /**
     * @brief Loads a new firmware file based on the given URL
     *
     * @param resourcePath
     *            URL of the firmware that should be loaded.
     * @return The DocumentRoot element of the Resource
     */

    public static DocumentRoot loadFirmware(URL resourcePath) {
        if (resourcePath == null)
            throw new IllegalArgumentException("Parameter 'resourcePath ' must not be null.");
        Map<Object, Object> options = new HashMap<Object, Object>();
        options.put(XMLResource.OPTION_ENCODING, "UTF-8"); //$NON-NLS-1$
        // get new Resource
        ResourceSet resSet = new ResourceSetImpl();
        resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("fw", new FwSchemaResourceFactoryImpl()); //$NON-NLS-1$

        // Get the File and root object
        URI fileuri = URI.createURI(resourcePath.toString());
        Resource resource = resSet.getResource(fileuri, true);
        return (DocumentRoot) resource.getContents().get(0);
    }

}
