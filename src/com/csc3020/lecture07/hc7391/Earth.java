package com.csc3020.lecture07.hc7391;

public class Earth {

    long circumferenceInMiles = 24901;
    long circumferenceInKilometers = convertToKm(circumferenceInMiles);


    long convertToKm(double input) {
        return (long) Math.ceil(circumferenceInMiles*(1.6d));
    }
}
