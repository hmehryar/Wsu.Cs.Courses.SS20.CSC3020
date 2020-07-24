package csc3020.lecture08.he7891;
// *
// Author: Nathan Tattrie
// Student ID: he7891
// Lecture08: A Closer Look At Parameters
// *

/* Parameter Immutability
* ~ Parameters are passed by making a copy of the value (known as passing by value)
* ~ Changes made to passed value are not visible outside of method
* ~ Changes made to members of passed class instances are visible outside of method
* */

/* Overloading
* ~ A class may have multiple versions of its constructor or methods
* ~ Each constructor and method must have a unique signature (Signature is made up of 3 parts)
*   1. Number of parameters
*   2. Type of each parameter
*   3. Name of parameters
* */

public class Lecture08Source {
    public static void main(String[] args) {
        // Parameter Immutability: Primative Types
        int val1 = 10;
        int val2 = 20;
        System.out.println(val1);
        System.out.println(val2);
        swap(val1, val2);
        System.out.println(val1);
        System.out.println(val2);

        // Parameter Immutability: Class Types
        Flight flight1 = new Flight(10);
        Flight flight2 = new Flight(20);
        System.out.println(flight1.getFlightNumber());
        System.out.println(flight2.getFlightNumber());
        swap(flight1, flight2);
        System.out.println(flight1.getFlightNumber());
        System.out.println(flight2.getFlightNumber());

        // Parameter Immutability: Class Types -> Visible changes outside of the method
        flight1 = new Flight(10);
        flight2 = new Flight(20);
        System.out.println(flight1.getFlightNumber());
        System.out.println(flight2.getFlightNumber());
        swapNumbers(flight1, flight2);
        System.out.println(flight1.getFlightNumber());
        System.out.println(flight2.getFlightNumber());

        // Overloading
        Flight oFlight = new Flight();
        Passenger oPassenger1 = new Passenger(0, 1);
        Passenger oPassenger2 = new Passenger(0, 2);

        oFlight.add1Passenger();
        oFlight.print();
        oFlight.add1Passenger(2);
        oFlight.print();
        oFlight.add1Passenger(oPassenger1);
        oFlight.print();

        short threeBags = 3;
        oFlight.add1Passenger(threeBags, 2);
        oFlight.print();
        oFlight.add1Passenger(oPassenger2, 1);
        oFlight.print();

    }

    // Parameter Immutability: Primative Types
    static void swap(int i, int j) {
        int k = i;
        i = j;
        j = k;
        System.out.println(i);
        System.out.println(j);
    }

    // Parameter Immutability: Class Types
    static void swap(Flight i, Flight j) {
        Flight k = i;
        i = j;
        j = k;
        System.out.println(i.getFlightNumber());
        System.out.println(j.getFlightNumber());
    }

    // Parameter Immutability: Class Types -> Visible changes outside of the method
    static void swapNumbers(Flight i, Flight j) {
        int k = i.getFlightNumber();
        i.setFlightNumber(j.getFlightNumber());
        j.setFlightNumber(k);
        System.out.println(i.getFlightNumber());
        System.out.println(j.getFlightNumber());
    }
}
