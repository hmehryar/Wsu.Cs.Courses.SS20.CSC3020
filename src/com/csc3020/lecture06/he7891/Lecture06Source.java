package com.csc3020.lecture06.he7891;
// *
// Author: Nathan Tattrie
// Student ID: he7891
// Lecture06
// *

/* Special References: this and null
* ~ Java provides special references with predefined meanings
* ~~ This is an implicit  reference to the current object
* ~~~ Useful for reducing ambiguity
* ~~~ Allows an object to pass itself as a parameter
* ~~ null...
* */

/* Field Encapsulation
* ~ In most cases, a class's fields should not be directly accessible outside of the class
* ~~ Helps to hide implementation details
* ~~ Use methods to control field access
* */

/* Accessors and Mutators
* ~ Use the accessor/mutator patterns to control field access
* ~~ Accessor retrieves field value. Also called getter. Method name: getFieldName
* ~~ Mutator modifies field value. Also called setter. Method name: setFieldName
* */

/**/

public class Lecture06Source {
    public static void main(String[] args) {

        Flight oFlight1 = new Flight();
        for (int count = 0; count < 20; count++) {
            oFlight1.add1Passenger();
        }

        Flight oFlight2 = new Flight();
        for (int count = 0; count < 30; count++) {
            oFlight1.add1Passenger();
        }

        boolean flight1HasRoom = oFlight1.hasRoom(oFlight2);
        System.out.println(flight1HasRoom);

        oFlight2 = new Flight();
        for (int count = 0; count < 131; count++) {
            oFlight2.add1Passenger();
        }
        flight1HasRoom = oFlight1.hasRoom(oFlight2);
        System.out.println(flight1HasRoom);

        oFlight2 = new Flight();
        oFlight2.add1Passenger();
        oFlight1.print();
        Flight oMergedFlight = oFlight1.createFlightWithBoth(oFlight2);
        oFlight1.print();
        oMergedFlight.print();


        // NEW EXAMPLE
        Flight lax1 = new Flight();
        Flight lax2 = new Flight();

        // Adding Passengers
        for (int count = 0; count < 20; count++) {
            lax1.add1Passenger();
        }
        for (int count = 0; count < 30; count++) {
            lax2.add1Passenger();
        }
        lax1.print();
        lax2.print();
        Flight lax3 = new Flight();
        if (lax1.hasRoom(lax2)) {
            lax3 = lax1.createFlightWithBoth(lax2);
        }
        if (lax3 != null) {
            lax3.print();
        }
        else {
            System.out.println("The flights haven't been merged.");
        }

        // Accessors and Mutators
        Flight slcToNyc = new Flight();
        slcToNyc.setSeats(250);
        System.out.println(slcToNyc.getSeat());


    }
}