package com.csc3020.lecture06.go1277;
import com.csc3020.lecture06.go1277.Lecture06Source;

public static void main(String[] args)
    {

        com.csc3020.lecture05.go1277.Flight flight1 = new com.csc3020.lecture05.go1277.Flight();
        com.csc3020.lecture05.go1277.Flight flight2 = new com.csc3020.lecture05.go1277.Flight();
        flight2.add1Passenger();

        System.out.println(flight2.passengers);
        flight2 = flight1;
        System.out.println(flight2.passengers);

        flight1.add1Passenger();
        flight1.add1Passenger();

        System.out.println(flight2.passengers);


    }

