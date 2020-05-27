package com.csc3020.lecture07.go5621;

public class Earth {
    //long circumferenceInMiles;
    long circumferenceInMiles = 24901;
    long circumferenceInKilometers = convertToKm(circumferenceInMiles);

    long convertToKm(double input) {
        return (long) Math.ceil(circumferenceInMiles * (1.6d));
    }
}
