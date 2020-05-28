package com.csc3020.lecture07.gs9945;

public class Earth {
    //long circumferenceInMiles;
    long circumferenceInMiles=24901;
    long circumferenceInKilometers= convertToKm();

    //Function to convert miles to kilometers
    long convertToKm(){
        return  (long) Math.ceil( circumferenceInMiles*(1.6d));
    }
}

