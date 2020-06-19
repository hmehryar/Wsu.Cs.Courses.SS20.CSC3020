package csc3020.lecture13.go1527;


import com.csc3020.lecture12.go1527.CargoFlight;

import csc3020.lecture13.go1527.ahaque.travel.Flight;
import csc3020.lecture13.go1527.ahaque.travel.Passenger;
//import csc3020.lecture13.go1527.ahaque.travel.*;

//import csc3020.lecture13.go1527.xyzcompany.bar.Beer;
//import csc3020.lecture13.go1527.xyzcompany.bar.Wine;
import csc3020.lecture13.go1527.xyzcompany.bar.*;

public class Lecture13Source {
    public static void main(String[] args) {
//        new csc3020.lecture13.go1527.Lecture13Source();
        Flight oFlight = new Flight();
        com.csc3020.lecture11.go1527.Flight oLecture11Flight = new com.csc3020.lecture11.go1527.Flight();
        CargoFlight oCargoFlight = new CargoFlight();

        Flight lax175 = new Flight(175);
        Beer liteBeer = new Beer();
        Passenger jane = new Passenger();
        Wine merlot = new Wine();

        //lax175.flightNumber;
        lax175.getFlightNumber();

    }
}