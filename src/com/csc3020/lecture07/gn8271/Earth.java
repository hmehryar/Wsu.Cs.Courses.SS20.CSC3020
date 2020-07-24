package csc3020.lecture07.gn8271;
// *
// Author: Raisa Zaman
// Student ID: gn8271
// Lecture07
// *
public class Earth {
    //long circumferenceInMiles;
    long circumferenceInMiles=24901;
    long circumferenceInKilometers= convertToKm();

    long convertToKm(){
        return  (long) Math.ceil( circumferenceInMiles*(1.6d));
    }
}
