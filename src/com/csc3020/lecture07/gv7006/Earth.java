package com.csc3020.lecture07.gv7006;

public class Earth {
    //long circumferenceInMiles;
    long circumferenceInMiles = 24901;
    long circumferenceInKilometers = convertToKm();

    long convertToKm() {
        return (long) Math.ceil(circumferenceInMiles * (1.6d));
    }
}
