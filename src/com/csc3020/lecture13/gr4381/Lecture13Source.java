package csc3020.lecture13.gr4381;

//import csc3020.lecture13.gr4381.travel.Flight; // single type import
//import csc3020.lecture13.gr4381.travel.Passenger;
import csc3020.lecture13.gr4381.travel.*; // import on demand

//import csc3020.lecture13.gr4381.xyzcompany.bar.Beer;
//import csc3020.lecture13.gr4381.xyzcompany.bar.Wine;
import csc3020.lecture13.gr4381.xyzcompany.bar.*;

// Author: Matthew Martin
public class Lecture13Source {
    public static void main(String[] args) {
        Flight oFlight = new Flight();
        csc3020.lecture11.gr4381.Flight oLecture11Flight = new csc3020.lecture11.gr4381.Flight();
        CargoFlight oCargoFlight = new CargoFlight();

        Flight lax175 = new Flight(175);
        Beer liteBeer = new Beer();
        Passenger jane = new Passenger();
        Wine merlot = new Wine();

        //lax175.flightNumber // private member - cannot be accessed
        lax175.getFlightNumber(); // public member
    }
}
