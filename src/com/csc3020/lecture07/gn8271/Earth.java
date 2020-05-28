package lecture07.gn8271;
//Lecture 07
// Author: Raisa Zaman
public class Earth {
    //long circumferenceInMiles;
    long circumferenceInMiles=24901;
    long circumferenceInKilometers= convertToKm();

    long convertToKm(){
        return  (long) Math.ceil( circumferenceInMiles*(1.6d));
    }
}
