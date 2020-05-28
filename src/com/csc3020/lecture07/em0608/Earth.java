package com.csc3020.lecture07.em0608;

public class Earth {
    //long circumferenceInMiles;
    long circumferenceInMiles =24901;
    long getCircumferenceInKilo = convertToKm();

    long convertToKm(){
        return (long) Math.ceil(circumferenceInMiles*1.6);
    }
}