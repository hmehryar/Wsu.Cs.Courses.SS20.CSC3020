package csc3020.lecture13.av7071;

import lecture12.av7071.CargoFlight;
import lecture13.av7071.travel.Flight;
import lecture13.av7071.travel.Passenger;
import lecture13.av7071.xyzcompany.bar.*;

public class Lecture13Source {
    public static void main(String[] args) {
        //new csc3020.lecture13.av7071.Lecture13Source();
        Flight oFlight = new Flight();
        Flight oLecture11Flight = new Flight();
        CargoFlight oCargoFlight = new CargoFlight();

        Flight lax175 = new Flight(175);
        Beer liteBeer = new Beer();
        Passenger oPassenger = new Passenger();
        Wine merlot = new Wine();

        //lax175.flightNumber
        lax175.getFlightNumber();

    }
}
