/**
 * @since 19.3.2013
 * @author Joris Lückenga, B&R Industrial Automation GmbH
 *
 * @copyright (c) 2017, B&R Industrial Automation GmbH
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

package com.br_automation.buoat.xddeditor.XDD.custom.propertypages.filters;

import java.math.BigInteger;

import org.eclipse.jface.viewers.IFilter;

import com.br_automation.buoat.xddeditor.XDD.SubObjectType;
import com.br_automation.buoat.xddeditor.XDD.TObject;
import com.br_automation.buoat.xddeditor.XDD.custom.EPLGeneralConstants;

/**
 * @brief Filters for subObjects of Object 0x1010 with subIndex != 0.
 *
 * @author Joris Lückenga
 */
public class StoreParamSubobjectsFilter implements IFilter {

    @Override
    public boolean select(Object toTest) {
        if (toTest instanceof SubObjectType) {
            SubObjectType subObject = (SubObjectType) toTest;
            TObject parentObject = (TObject) subObject.eContainer();

            if (parentObject.getIndex() != null) {
                if (new BigInteger(1, parentObject.getIndex()).intValue() == EPLGeneralConstants.NMT_STOREPARAM_REC) { // NOPMD
                                                                                                                        // by
                                                                                                                        // lueckengaj
                                                                                                                        // on
                                                                                                                        // 21.05.13
                                                                                                                        // 08:33
                    if (subObject.getSubIndex() == null || subObject.getSubIndex().length == 0)
                        return true;
                    int subIndex = new BigInteger(subObject.getSubIndex()).intValue();
                    return (subIndex != 0);
                }
            }
        }
        return false;
    }

} // StoreParamSubobjectsFilter
