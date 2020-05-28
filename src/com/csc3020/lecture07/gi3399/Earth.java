package com.csc3020.lecture07.gi3399;

public class Earth {
    long circumferenceInMiles = 24901;
    long circumferenceInKilometers = convertToKm();

    long convertToKm(){
        return  (long) Math.ceil(circumferenceInMiles*(1.6d));
    }
}
