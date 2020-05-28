package com.csc3020.lecture07.gr4381;

public class Earth {
    long circumferenceInMiles = 24901;
    //long circumferenceInKilometers = (long)Math.ceil(circumferenceInMiles * (1.6d));
    long circumferenceInKilometers = (long) convertToKm(circumferenceInMiles);

    double convertToKm(double input){
        return Math.ceil(input * (1.6d));
    }

}
