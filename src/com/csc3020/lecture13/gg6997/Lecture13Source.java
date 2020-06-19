package lecture13.gg6997;

//package com.msingh.travel;

import lecture12.gg6997.CargoFlight;

import lecture13.gg6997.msingh.travel.*;
//import lecture13.gg6997.msingh.travel.Flight;
//import lecture13.gg6997.msingh.travel.Passenger;

//import lecture13.gg6997.xyzcompany.*;
import lecture13.gg6997.xyzcompany.bar.Beer;
import lecture13.gg6997.xyzcompany.bar.Wine;

//import lecture13.gg6997.msingh.travel.Flight;
//import lecture13.gg6997.msingh.travel.Passenger;
//import lecture13.gg6997.xyzcompany.bar.Beer;
//import lecture13.gg6997.xyzcompany.bar.Wine;

public class Lecture13Source {
    public static void main(String[] args) {
        new Lecture13Source();
        Flight oFlight = new Flight();
        com.csc3020.lecture11.gg6997.Flight oLecture11Flight = new com.csc3020.lecture11.gg6997.Flight();
        CargoFlight oCargoFlight = new CargoFlight();

        Flight lax175 = new Flight(175);
        Beer liteBeer = new Beer();
        Passenger jane = new Passenger();
        Wine merlot = new Wine();
        lax175.getFlightNumber();
    }
}