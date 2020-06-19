package com.csc3020.lecture13.fy2906;

import com.csc3020.lecture12.fy2906.CargoFlight;
import com.csc3020.lecture13.fy2906.travel.Flight;
import com.csc3020.lecture13.fy2906.travel.Passenger;
import com.csc3020.lecture13.fy2906.xyzcompany.bar.*;

public class Lecture13Source {
    public static void main(String[] args) {
        Flight oFlight = new Flight();
        Flight oLecture11Flight = new Flight();
        CargoFlight oCargoFlight = new CargoFlight();

        Flight lax175 = new Flight(175);
        Beer liteBeer = new Beer();
        Passenger oPassenger = new Passenger();
        Wine merlot = new Wine();

        lax175.getFlightNumber();
        
    }
}
