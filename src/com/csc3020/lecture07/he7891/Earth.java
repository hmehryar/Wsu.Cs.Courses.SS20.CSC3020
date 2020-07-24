package csc3020.lecture07.he7891;

public class Earth {

    long circumferenceInMiles = 24901;
    // long circumferenceInKilometers = (long) Math.ceil(circumferenceInMiles*(1.6d));
    long circumferenceInKilometers = convertToKm(circumferenceInMiles);

    //long cirInK = (long) convertToKm(circumferenceInMiles);

    long convertToKm(double input) {
        return (long) Math.ceil(circumferenceInMiles*(1.6d));
    }

}


