package com.csc3020.lecture13.em0608;

import com.csc3020.lecture13.em0608.travel.CargoFlight;
import com.csc3020.lecture13.em0608.travel.Flight;
import com.csc3020.lecture13.em0608.travel.Passenger;
import com.csc3020.lecture13.em0608.xyzcompany.bar.*;

//import com.csc3020.lecture13.em0608.travel.Flight;
//import com.csc3020.lecture13.em0608.travel.Passenger;
//import com.csc3020.lecture13.em0608.xyzcompany.bar.Beer;
//import com.csc3020.lecture13.em0608.xyzcompany.bar.Wine;

public class Lecture13Source {
    public static void main(String[] args) {
      //  new com.csc3020.lecture13.em0608.Lecture13Source();
        Flight oFlight = new Flight();
        com.csc3020.lecture11.Flight oLecture11Flight = new com.csc3020.lecture11.Flight();
        CargoFlight cargoFlight = new CargoFlight();

        Flight lax175 = new Flight(175);
        Beer liteBeer = new Beer();
        Passenger oPassenger = new Passenger();
        Wine merlot = new Wine();

      //  lax175.flightnumber
        lax175.getFlightNumber();

    }
}
