package csc3020.lecture13.gn8271;

import csc3020.lecture12.gn8271.CargoFlight;

import csc3020.lecture13.gn8271.rzaman.travel.Flight;
import csc3020.lecture13.gn8271.rzaman.travel.Passenger;

import csc3020.lecture13.gn8271.xyzcompany.bar.*;

//import csc3020.lecture13.gn8271.xyzcompany.bar.Beer;
//import csc3020.lecture13.gn8271.xyzcompany.bar.Wine;
import csc3020.lecture13.gn8271.xyzcompany.bar.*;

public class Lecture13Source {
    public static void main(String[] args) {
        //new lecture13.gn8271.Lecture13Source();
        Flight oFlight = new Flight();
        csc3020.lecture11.gn8271.Flight oLecture11Flight = new csc3020.lecture11.gn8271.Flight();
        CargoFlight oCargoFlight = new CargoFlight();

        Flight lax175 = new Flight(175);
        Beer liteBeer = new Beer();
        Passenger jane = new Passenger();
        Wine merlot = new Wine();

        //Lax175.flightNumber
        lax175.getFlightNumber();
    }
}
