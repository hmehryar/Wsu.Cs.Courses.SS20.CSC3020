package com.csc3020.lecture05.eu6179;
//*
//Author : Fatima Hashmi
// */
//Lecture 05

public class Lecture05Source {
    public static void main(String[] args) {
        //Using Class
        int intVar;
        Flight nycToSf; //Null Pointer to class until initialized

        nycToSf = new Flight();
        Flight slcToDallas = new Flight();
        slcToDallas.add1Passengers();

        System.out.println(nycToSf.passengers);
        System.out.println(nycToSf.seats);
        System.out.println(slcToDallas.passengers);
        System.out.println(slcToDallas.seats);

        Flight flight1 = new Flight();
        Flight flight2 = new Flight();
        flight2.add1Passengers();
        System.out.println("Flight 2: Passengers = " + flight2.passengers);

        flight2 = flight1;
        System.out.println("Flight 2: After Assigning Passengers = " + flight2.passengers);

        flight1.add1Passengers();
        flight1.add1Passengers();

        System.out.println("Flight 2: After Adding Passengers to Flight1 Object Passengers = " + flight2.passengers);
        CalculatorEngine oCalculatorEngine = new CalculatorEngine();
        oCalculatorEngine.showSum(1.3f, 3.5f, 10);
    }
}