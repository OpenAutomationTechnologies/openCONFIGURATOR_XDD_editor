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

package com.br_automation.buoat.xddeditor.XDD.custom;

/**
 * @brief Representation of CANopen device-profiles.
 *
 * @author Joris Lückenga
 */
public enum CiADeviceProfile {

    CIA401(401, "CiA 401", "Generic I/O Modules"),
    CIA402(402, "CiA 402", "Drives and Motion Control"),
    CIA404(404, "CiA 404", "Measuring devices and Closed Loop Controllers"),
    CIA405(405, "CiA 405", "IEC 61131-3 Programmable Devices"),
    CIA406(406, "CiA 406", "Rotating and Linear Encoders"),
    CIA408(408, "CiA 408", "Hydraulic Drives and Proportional Valves"),
    CIA410(410, "CiA 410", "Inclinometers"),
    CIA412(412, "CiA 412", "Medical Devices"),
    CIA413(413, "CiA 413", "Truck Gateways"),
    CIA414(414, "CiA 414", "Yarn Feeding Units (Weaving Machines)"),
    CIA415(415, "CiA 415", "Road Construction Machinery"),
    CIA416(416, "CiA 416", "Building Door Control"),
    CIA417(417, "CiA 417", "Lift Control Systems"),
    CIA418(418, "CiA 418", "Battery Modules"),
    CIA419(419, "CiA 419", "Battery Chargers"),
    CIA420(420, "CiA 420", "Extruder Downstream Devices"),
    CIA422(422, "CiA 422", "Municipal Vehicles CleANopen"),
    CIA423(423, "CiA 423", "Railway Diesel Control Systems"),
    CIA424(424, "CiA 424", "Rail Vehicle Door Control Systems"),
    CIA425(425, "CiA 425", "Medical Diagnostic Add-on Modules"),
    CIA445(445, "CiA 445", "RFID Devices"),
    CIA000(000, "CiA 000", "Reset Device Type");

    private String profileDescription;
    private String profileName;
    private int value;

    /**
     * @param value
     *            Value of the Profile e.g 401,402 etc.
     * @param profileName
     *            Name of Profile e.g CiA 401.
     * @param profileDescription
     *            Description of Profile e.g "Battery Charger".
     */
    private CiADeviceProfile(int value, String profileName, String profileDescription) {
        this.value = value;
        this.profileName = profileName;
        this.profileDescription = profileDescription;
    }

    public String getProfileDescription() {
        return this.profileDescription;
    }

    public String getProfileName() {
        return this.profileName;
    }

    public int getValue() {
        return this.value;
    }

} // CiADeviceProfile
