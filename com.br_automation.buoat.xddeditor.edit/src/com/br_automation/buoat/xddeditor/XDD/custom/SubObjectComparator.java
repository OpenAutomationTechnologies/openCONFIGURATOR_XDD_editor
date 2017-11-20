/**
 * @since 16.4.2013
 * @author Joris L�ckenga, B&R Industrial Automation GmbH
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

package com.br_automation.buoat.xddeditor.XDD.custom;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Comparator;

import com.br_automation.buoat.xddeditor.XDD.SubObjectType;

/**
 *
 * @brief A comparator for objects of type SubObjectType.
 *
 *        Enables sorting of an XDD's SubObject-Elements.
 *
 * @author Joris L�ckenga
 */
public class SubObjectComparator implements Comparator<SubObjectType>, Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * @see Comparator#compare(Object, Object)
     */
    @Override
    public int compare(SubObjectType o1, SubObjectType o2) {
        return (new BigInteger(o1.getSubIndex()).intValue()) - (new BigInteger(o2.getSubIndex()).intValue());
    }

}
