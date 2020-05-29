package com.csc3020.lecture08.go5621;

import com.csc3020.lecture07.go5621.Passenger;

public class Lecture08Source {
    static void swap(int i, int j) {
        int k = i;
        i = j;
        j = k;
        System.out.println(i);
        System.out.println(j);
    }

    static void swap(Flight i, Flight j) {
        Flight k = i;
        i = j;
        j = k;
        System.out.println(i.getFlightNumber());
        System.out.println(j.getFlightNumber());
    }

    static void swapNumbers(Flight i, Flight j) {
        int k = i.getFlightNumber();
        i.setFlightNumber(j.getFlightNumber());
        j.setFlightNumber(k);
        System.out.println(i.getFlightNumber());
        System.out.println(j.getFlightNumber());
    }

    public static void main(String[] args) {
        //parameter immutability: primitive types
        int val1 = 10;
        int val2 = 20;
        System.out.println(val1);
        System.out.println(val2);
        swap(val1, val2);
        System.out.println(val1);
        System.out.println(val2);

        //parameter immutability: class types
        Flight flight1 = new Flight(30);
        Flight flight2 = new Flight(40);
        System.out.println(flight1.getFlightNumber());
        System.out.println(flight2.getFlightNumber());
        swap(flight1, flight2);
        System.out.println(flight1.getFlightNumber());
        System.out.println(flight2.getFlightNumber());

        //visible changes outside of method
        swapNumbers(flight1, flight2);
        System.out.println(flight1.getFlightNumber());
        System.out.println(flight2.getFlightNumber());

        //overloading
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
}
