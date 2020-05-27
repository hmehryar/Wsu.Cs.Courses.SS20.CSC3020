package com.csc3020.lecture07.gz0715;

public class Earth {
    long circumferenceInMiles = 24901;
    long circumferenceInKilometers = convertToKm(circumferenceInMiles);

    long convertToKm(double input) {
        return (long) Math.ceil(input * (1.6d));
    }
}
