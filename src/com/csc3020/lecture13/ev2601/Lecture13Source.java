package csc3020.lecture13.ev2601;

import csc3020.lecture12.ev2601.CargoFlight;

// Flight type
// Passenger type
import csc3020.lecture13.ev2601.lukebelinc.travel.Passenger;
import csc3020.lecture13.ev2601.lukebelinc.travel.Flight;

// Beer type
// Wine type
import csc3020.lecture13.ev2601.xyzcompany.bar.*;

public class Lecture13Source {

    public static void main (String[] args) {
        Flight oFlight = new Flight();
        csc3020.lecture11.ev2601.Flight lecture11Flight = new csc3020.lecture11.ev2601.Flight();
        CargoFlight cargoFlight = new CargoFlight();

        Flight lax175 = new Flight(175);
        Beer liteBeer = new Beer();
        Passenger oPassenger = new Passenger();
        Wine merlot = new Wine();
    }
}