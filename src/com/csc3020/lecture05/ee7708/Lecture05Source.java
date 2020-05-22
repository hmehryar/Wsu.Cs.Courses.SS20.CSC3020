package com.csc3020.lecture05.ee7708;

//___________________
//Author: Ian Kwiotek
//Access ID: ee7708
//Date: May 19, 2020
//___________________

public class Lecture05Source {

    public static void main(String[] args) {
        Flight slcToDallas = new Flight();
        slcToDallas.add1Passenger();

        Flight flight1 = new Flight();
        Flight flight2 = new Flight();

        flight2.add1Passenger();
        System.out.println(flight2.passengers);

        flight2 = flight1;
        System.out.println(flight2.passengers);

        flight1.add1Passenger();
        flight1.add1Passenger();

        System.out.println(flight2.passengers);

        CalculateEngine oCalculatorEngine = new CalculateEngine();
        oCalculatorEngine.showSum(1.3f, 3.5f, 10);

        System.out.println("showSum: Main Class");
        oCalculatorEngine.showSum(4.5f, 5.5f, 5);
    }

}
