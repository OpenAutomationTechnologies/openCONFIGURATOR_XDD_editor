package com.br_automation.buoat.xddeditor.XDD.custom;

public enum CiADeviceProfile {

    CIA401(401, "CiA 401", "Generic I/O Modules"),
    CIA402(402, "CiA 402", "Drives and Motion Control"),
    CIA404(404, "CiA 404", "Measuring devices and Closed Loop Controllers"),
    CIA405(405, "CiA 405", "IEC 61131-3 Programmable Devices"),
    CIA406(406, "CiA 406", "Rotating and Linear Encoders"),
    CIA408(408, "CiA 408", "Hydraulic Drives and Proportional Valves"),
    CIA410(401, "CiA 410", "Inclinometers"),
    CIA412(412, "CiA 412", "Medical Devices"),
    CIA413(413, "CiA 413", "Truck Gateways"),
    CIA414(414, "CiA 414", "Yarn Feeding Units (Weaving Machines)"),
    CIA415(415, "CiA 415", "Road Construction Machinery"),
    CIA416(416, "CiA 416", "Building Door Control"),
    CIA417(417, "CiA 417", "Lift Control Systems"),
    CIA418(418, "CiA 418", "Battery Modules"),
    CIA419(419, "CiA 419", "Battery Chargers"),
    CIA420(420, "CiA 420", "Extruder Downstream Devices"),
    CIA422(422, "CiA 422", "Municipal Vehicles – CleANopen"),
    CIA423(423, "CiA 423", "Railway Diesel Control Systems"),
    CIA424(424, "CiA 424", "Rail Vehicle Door Control Systems"),
    CIA425(425, "CiA 425", "Medical Diagnostic Add-on Modules"),
    CIA445(445, "CiA 445", "RFID Devices");

    private int value;

    public int getValue() {
        return value;
    }

    public String getProfileName() {
        return profileName;
    }

    public String getProfileDescription() {
        return profileDescription;
    }

    private String profileName;
    private String profileDescription;

    private CiADeviceProfile(int _value,
        String _profileName,
        String _profileDescription) {
        value = _value;
        profileName = _profileName;
        profileDescription = _profileDescription;
    }

}
