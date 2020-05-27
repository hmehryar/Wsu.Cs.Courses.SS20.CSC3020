package com.csc3020.lecture07.gn2289;

public class Earth {
    long circumferenceInMiles = 24901;

    long circumferenceInKilo = (long) Math.ceil(circumferenceInMiles * (1.6d));



    double convertToKM() {
        return (long) Math.ceil(circumferenceInMiles * (1.6d));
    }
}
