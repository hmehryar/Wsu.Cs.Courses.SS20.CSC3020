package com.csc3020.lecture08.gi3399;

public class Lecture08Source {
    public static void main(String[] args) {
//        Flight val1 = new Flight(10);
//        System.out.println(val1.getFlightNumber());
        //Parameter Immutability: Primitive Types
        int val1 = 10;
        int val2 = 20;
        System.out.println(val1);
        System.out.println(val2);
        swap(val1, val2);
        System.out.println(val1);
        System.out.println(val2);

        //Parameter Immutability: Class Types
        Flight flight1 = new Flight(10);
        Flight flight2 = new Flight(20);
        System.out.println(flight1.getFlightNumber());
        System.out.println(flight2.getFlightNumber());
        swap(flight1, flight2);
        System.out.println(flight1.getFlightNumber());
        System.out.println(flight2.getFlightNumber());

        //Parameter Immutability: Class Types -> Visible Changes outside the method
        flight1 = new Flight(10);
        flight2 = new Flight(20);
        System.out.println(flight1.getFlightNumber());
        System.out.println(flight2.getFlightNumber());
        swapNumbers(flight1, flight2);
        System.out.println(flight1.getFlightNumber());
        System.out.println(flight2.getFlightNumber());

        //Overloading
        Flight oFlight1 = new Flight();
        Passenger oPassenger1 = new Passenger(0, 1);
        Passenger oPassenger2 = new Passenger(0, 2);

        oFlight1.add1Passengers();
        oFlight1.print();
        oFlight1.add1Passengers(2);
        oFlight1.print();
        oFlight1.add1Passengers(oPassenger1);
        oFlight1.print();

        short threeBags = 3;
        oFlight1.add1Passengers(threeBags, 2);
        oFlight1.print();
        oFlight1.add1Passengers(oPassenger2, 1);
        oFlight1.print();
    }

    public static void swapNumbers(Flight i, Flight j){
        int k = i.getFlightNumber();
        i.setFlightNumber(j.getFlightNumber());
        j.setFlightNumber(k);
        System.out.println(i.getFlightNumber());
        System.out.println(j.getFlightNumber());
    }

    public static void swap(Flight i, Flight j){
        Flight k = i;
        i = j;
        j = k;
        System.out.println(i.getFlightNumber());
        System.out.println(j.getFlightNumber());
    }

    public static void swap(int i, int j){
        int k = i;
        i = j;
        j = k;
        System.out.println(i);
        System.out.println(j);
    }
}
