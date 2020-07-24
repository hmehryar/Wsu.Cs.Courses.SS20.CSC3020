package csc3020.lecture13.go1277;


import csc3020.lecture13.go1277.gijo.travel.CargoFlight;
import csc3020.lecture13.go1277.gijo.travel.Flight;
import csc3020.lecture13.go1277.gijo.travel.Passenger;
import csc3020.lecture13.go1277.xyzcompany.bar.Beer;
import csc3020.lecture13.go1277.xyzcompany.bar.Wine;


public class Lecture13Source {
    public static void main(String[] args) {
        //new lecture13.gn8271.Lecture13Source();
        Flight oFlight = new Flight();
        Flight oLecture11Flight = new Flight();
        CargoFlight oCargoFlight = new CargoFlight();

        Flight lax175 = new Flight(175);
        Beer liteBeer = new Beer ();
        Passenger jane = new Passenger();
        Wine merlot = new Wine();

        //Lax175.flightNumber
        lax175.getFlightNumber();
    }
}
