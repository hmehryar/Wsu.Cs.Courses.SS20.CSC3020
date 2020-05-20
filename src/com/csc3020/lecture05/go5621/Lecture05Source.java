package com.csc3020.lecture05.go5621;

import java.sql.SQLOutput;

//*
//Author: Patricia Liu
// */
//Lecture 05
public class Lecture05Source {
    public static void showSum(float x, float y, int count) {
        float sum = x + y;
        for (int i = 0; i < count; i++) {
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        //Using class
        int intVar;

        Flight nycToSf;
        nycToSf = new Flight();
        //System.out.println(nycToSf.passengers);
        //System.out.println(nycToSf.seats);

        Flight slcToDallas = new Flight();
        //System.out.println(slcToDallas.passengers);
        //System.out.println(slcToDallas.seats);

        slcToDallas.add1Passenger();
        //System.out.println(slcToDallas.passengers);
        //System.out.println(slcToDallas.seats);

        //Classes are Reference Types
        Flight flight1 = new Flight();
        Flight flight2 = new Flight();

        flight2.add1Passenger();
        //System.out.println("Flight 2: Passengers = " + flight2.passengers);

        flight2 = flight1;
        //System.out.println("Flight 2: After assigning: Passenger = " + flight2.passengers);

        flight1.add1Passenger();
        flight1.add1Passenger();

        //System.out.println("Flight 2: After adding passengers to flight 1: Passengers = " + flight2.passengers);

        //flight1.handleTooMany();

        System.out.println("showSum: CalculateEngine Class");
        CalculateEngine oCalculatorEngine = new CalculateEngine();
        oCalculatorEngine.showSum(1.3f, 3.5f, 9);

        System.out.println("showSum: Main Class");
        showSum(4.5f, 5.5f, 5);

        //Exiting from method
        oCalculatorEngine.showSum(1.2f, 3.5f, 11);

        //Method return value
        Flight oMethodFlight1 = new Flight();
        for (int i = 1; i < 20; i++) {
            oMethodFlight1.add1Passenger();
        }
        Flight oMethodFlight2 = new Flight();
        for (int i = 1; i < 25; i++) {
            oMethodFlight2.add1Passenger();
        }
        boolean f1HasRoom = oMethodFlight1.hasRoom(oMethodFlight2);
        System.out.println(f1HasRoom);

        for (int i = 1; i < 140; i++) {
            oMethodFlight2.add1Passenger();
        }
        f1HasRoom = oMethodFlight1.hasRoom(oMethodFlight2);
        System.out.println(f1HasRoom);

    }
}
