package com.csc3020.lecture07.fy2906;

public class Earth {
    //long circumferenceInMiles;
    long circumferenceInMiles = 24901;
    long getCircumferenceInKilometers = convertToKm();

    long convertToKm() {
        return (long) Math.ceil(circumferenceInMiles * 1.6d);
    }
}
