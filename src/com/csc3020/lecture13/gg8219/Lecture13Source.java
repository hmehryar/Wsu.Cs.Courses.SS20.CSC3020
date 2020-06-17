package com.csc3020.lecture13.gg8219;

import com.csc3020.lecture13.gg8219.auddin.travel.Flight;
import com.csc3020.lecture13.gg8219.auddin.travel.Passenger;
import com.csc3020.lecture12.gg8219.CargoFlight;

//import com.csc3020.lecture13.gg8219.auddin.travel.Flight;
//import com.csc3020.lecture13.gg8219.auddin.travel.Passenger;

//import com.csc3020.lecture13.gg8219.xyzcompany.bar.Beer;
//import com.csc3020.lecture13.gg8219.xyzcompany.bar.Wine;
import com.csc3020.lecture13.gg8219.xyzcompany.bar.*;

public class Lecture13Source {
    public static void main(String[] args) {
        new com.csc3020.lecture13.gg8219.Lecture13Source();
        Flight oFlight = new Flight();
        com.csc3020.lecture11.gg8219.Flight oLecture11Flight = new com.csc3020.lecture11.gg8219.Flight();
        CargoFlight oCargoFlight = new CargoFlight();

        Flight lax175 = new Flight(175);
        Beer liteBeer = new Beer();
        Passenger jane = new Passenger();
        Wine merlot = new Wine();

    }
}