package com.csc3020.lecture05.eu6179;
//*
//Author : Fatima Hashmi
// */
//Lecture 05


import java.io.IOException;

public class Lecture05Source {
    public static void main(String[] args) {
        //Using Class
        int intvar;

        Flight ncyTosc;
        ncyTosc = new Flight();
        //System.out.println(ncyTosc.passengers);
        //System.out.println(ncyTosc.seats);


        Flight sclToDallas = new Flight();
        //System.out.println(sclToDallas.passengers);
        //System.out.println(sclToDallas.seats);

        sclToDallas.add1Passenger();
        //System.out.println(sclToDallas.passengers);
        //System.out.println(sclToDallas.seats);

        //Class are reference types
        Flight flight1 = new Flight();
        Flight flight2 = new Flight();

        flight2.add1Passenger();
        //  System.out.println("Flight 2: Passengers = "+ flight2.passengers);

        flight2 = flight1;
        //   System.out.println("Flight 2 After Assigning: Passengers= "+ flight2.passengers);

        flight1.add1Passenger();
        flight1.add1Passenger();

        // System.out.println("Flight 2 After Adding passengers to flight 1 object= "+ flight2.passengers);
        //flight1.handletooMany();
        //  InputOutputException
        CalculatorEngine oCalculatorEngine = new CalculatorEngine();
        oCalculatorEngine.showSum(1.3f, 3.5f, 11);

        System.out.println("showSum: Main Class");
        //showSum(4.5f, 5.5f,5);

        //Exiting from method

        oCalculatorEngine.showSum(1.2f, 3.5f, 10);

            // Method return value
        Flight oMethodFlight1 = new Flight();
        for(int i=1;i<20;i++ )
             oMethodFlight1.add1Passenger();

        Flight oMethodFlight2 = new Flight();
        for(int i=1;i<25;i++ )
            oMethodFlight1.add1Passenger();

        boolean f1hasRoom = oMethodFlight1.hasRoom(oMethodFlight2);
        System.out.println(f1hasRoom);

        for(int i=1;i<140;i++ )
            oMethodFlight1.add1Passenger();
        f1hasRoom = oMethodFlight1.hasRoom(oMethodFlight2);
        System.out.println(f1hasRoom);
    }

}
