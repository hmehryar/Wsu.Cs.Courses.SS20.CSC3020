package com.csc3020.lecture07.he7891;

// *
// Author: Nathan Tattrie
// Student ID: he7891
// Lecture07: Class Initializers and Constructors
// *

/* Establishing Initial State
* ~ When an object is created, it is expected to be in a useful state
* ~~ Often the default state established by Java is not enough
* ~~ The object may need to set values or execute code
* */

/* Field Initial State
* ~ A field's initial state is established as a part of object construction
* ~~ Fields receive a "zero" value by default
* ~ byte/short/int/long: 0
* ~ double: 0.0
* */

/* Field Initializers
* ~ Allow you to specify a fields initial value as part of its declaration
* ~~ Can be a simple assignment
* ~~ Can be a simple equation
* ~~ Can reference other fields
* ~~ Can be a method call
* */

/* Constructor
* ~ Executable code used during object creation to set the initial state
* ~~ Have no return type
* ~~ Every class has at least one constructor
* */

/* Chaining Constructors
* ~ One constructor can call another
* ~~ Use the this keyword followed by parameter list
* ~~ Must be the first line of the constructor
* */

/* Constructor Visibility
* ~ Use access modifiers to control constructor visibility
* ~~ Limits what code can perform specific creations
* */

/* Initialization Blocks
* ~ Initializtion blocks shared across all constructors
* ~~ Executed as if the code wre placed at the start of each constructor
* ~~ Enclosed statements in brackets outside of any method or constructor
* */

public class Lecture07Source {
    public static void main(String[] args) {
        Earth oEarth = new Earth();
        System.out.println(oEarth.circumferenceInMiles);
        System.out.println(oEarth.circumferenceInKilometers);

        Flight oFlight = new Flight();
        Passenger bob = new Passenger();
        System.out.println(bob.getFreeBags());
        bob.setFreeBags(4);
        System.out.println(bob.getFreeBags());


        Passenger arsi = new Passenger(3);
        System.out.println(arsi.getFreeBags());

        Passenger jane = new Passenger(4);
        jane.setCheckedBags(3);
        System.out.println(jane.getFreeBags() + ", " + jane.getCheckedBags());

        jane = new Passenger(4, 3);
        System.out.println(jane.getFreeBags() + ", " + jane.getCheckedBags());

//        Passenger cheapJoe = new Passenger(0.01d);
//        cheapJoe.setFreeBags(4);
//        cheapJoe.setCheckedBags(7);
//        System.out.println(cheapJoe.getFreeBags() + ", " + cheapJoe.getCheckedBags() + ", " + cheapJoe.perBagFee());

        Passenger joe = new Passenger(2);
        System.out.println(joe.getFreeBags() + ", " + joe.getCheckedBags() + ", " + joe.perBagFee());
        joe = new Passenger(1);
        System.out.println(joe.getFreeBags() + ", " + joe.getCheckedBags() + ", " + joe.perBagFee());


    }
}