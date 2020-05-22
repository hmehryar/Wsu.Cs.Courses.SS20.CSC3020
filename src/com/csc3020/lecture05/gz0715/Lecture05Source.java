package com.csc3020.lecture05.gz0715;
//*
//Author: Mirza Saim Saqib Beg
// */
//Lecture 05//
public class Lecture05Source {
    public static void main(String[] args) {
        // Using Class
        int intVar;

        Flight nycToSc;
        nycToSc = new Flight();
//        System.out.println(nycToSc.passengers);
//        System.out.println(nycToSc.seats);

        Flight slcToDallas = new Flight();
//        System.out.println(slcToDallas.passengers);
//        System.out.println(slcToDallas.seats);

        slcToDallas.add1Passenger();
//        System.out.println(slcToDallas.passengers);
//        System.out.println(slcToDallas.seats);

        // Class are reference type
        Flight flight1 = new Flight();
        Flight flight2 = new Flight();

        flight2.add1Passenger();
//        System.out.println("Flight 2: passengers = " + flight2.passengers);

        flight2 = flight1;
//        System.out.println("Flight 2: After Assigning: passengers = " + flight2.passengers);

        flight1.add1Passenger();
        flight1.add1Passenger();
//        System.out.println("Flight 2: After adding passengers to flight 1: passengers = " + flight2.passengers);

//        flight1.handleTooMany();
        // InputOutputException
        System.out.println("showSum: CalculateEngine Class");
        CalculateEngine oCalculateEngine = new CalculateEngine();
        oCalculateEngine.showSum(1.3f, 3.5f, 5);

        System.out.println("showSum: Main Class");
        showSum(1.3f, 3.5f, 5);

        // Exiting from method
        System.out.println("showSum return statement: CalculateEngine Class");
        CalculateEngine oCalculateEngine1 = new CalculateEngine();
        oCalculateEngine1.showSum(1.3f, 3.5f, 11);

        Flight oMethodFlight1 = new Flight();
        for (int i = 0; i < 20; i++)
            oMethodFlight1.add1Passenger();

        Flight oMethodFlight2 = new Flight();
        for (int i = 0; i < 25; i++)
            oMethodFlight2.add1Passenger();
        boolean f1HasRoom = oMethodFlight1.hasRoom(oMethodFlight2);
        System.out.println(f1HasRoom);

        for (int i = 0; i < 140; i++)
            oMethodFlight2.add1Passenger();
        f1HasRoom = oMethodFlight1.hasRoom(oMethodFlight2);
        System.out.println(f1HasRoom);

    }

    public static void showSum(float x, float y, int count) {
        float sum = x + y;
        for(int i = 0; i < count; i++)
            System.out.println(sum);
    }
}
