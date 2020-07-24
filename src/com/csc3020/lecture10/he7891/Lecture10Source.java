package csc3020.lecture10.he7891;
// *
// Author: Nathan Tattrie
// Student ID: he7891
// Lecture10: Class Inheritance
// *

/* Special Reference: super
* ~ Similar to this, super is an implicit reference to the current object
* ~~ Super treats object as if it is an instance of its base class
* ~~ Useful for accessing base class members that have been overridden
* */

/* Controlling Inheritance and Overriding
* ~ By default all classes can be extended and derived classes have the option to use or override inherited methods
* ~~ A class can change these defaults
* ~~ Use final to prevent inheriting and/or overriding
* ~~ Use abstract to require inheriting and/or overriding
* */

/* Inheritance and Constructors
* ~ Constructors are not inherited
* ~ A Base Class constructor must always be called
* ~~ By default, base class's no-argument constructor is called
* ~~ Can explicitly call a base class constructor using super followed by parameter list
* ~~~ must be first line of constructor*/

/* SUMMARY
* ~ Inheritance allows a new class to be defined with the characteristics of another
* ~~ Use the extend keyword
* ~ Derived class can override base class methods
* ~~ Optionally use @Override annotation
* ~ All classes derive from Object class either directly or indirectly
* ~ By default object references are only equal when referencing the same instance
* ~~ Can override Object.equals to provide new behavior
* ~ Super Access current object as if instance of base class
* ~ final and abstract provide control over class inheritance and method overriding
* ~ Constructors are not inherited
* ~ */



public class Lecture10Source {
    public static void main(String[] args) {

        // Super
        Flight flight1 = new Flight();
        Flight flight2 = new Flight();
        if (flight1 == flight2) {
            System.out.println("Yes");
        }
        if (flight1.equals(flight2)) {
            System.out.println("Yes");
        }
        Passenger passenger = new Passenger();
        if (flight1.equals(passenger)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        // Final

        // Abstract
        //Person oPerson = new Person();
        Student oStudent = new Student();

        //Pilot oPilot = new Pilot();
        CargoOnlyPilot oCargoOnlyPilot = new CargoOnlyPilot();
        CargoFlight oCargoFlight = new CargoFlight();
        boolean canAccept =oCargoOnlyPilot.canAccept(oCargoFlight);
        if (canAccept) {
            System.out.println("The pilot can accept the flight.");
        }

        oCargoFlight.add1Passenger();
        canAccept= oCargoOnlyPilot.canAccept(oCargoFlight);
        if (canAccept){
            System.out.println("The CargoOnlyPilot can accept the flight");
        }else {
            System.out.println("The CargoOnlyPilot can't accept the flight");
        }

        FullLicencePilot oFullLicensePilot = new FullLicencePilot();
        canAccept = oFullLicensePilot.canAccept(oCargoFlight);
        if (canAccept) {
            System.out.println("The pilot can accept the flight.");
        }
        else {
            System.out.println("The pilot can't accept the flight.");
        }

        Flight f175 = new Flight(175);
        CargoFlight cf = new CargoFlight();
        CargoFlight cf294 = new CargoFlight(294);
        CargoFlight cf85 = new CargoFlight(85, 2000.0f);
        CargoFlight cfBig = new CargoFlight(5000.0f);


    }

}
