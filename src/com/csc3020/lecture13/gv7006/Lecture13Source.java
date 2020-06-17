package com.csc3020.lecture13.gv7006;

import com.csc3020.lecture13.gv7006.ssafwaan.travel.*;
import com.csc3020.lecture13.gv7006.xyzcompany.bar.*;

public class Lecture13Source {
    public static void main(String[] args) {
        Flight oFlight = new Flight();
        com.csc3020.lecture11.gv7006.Flight o11Flight = new com.csc3020.lecture11.gv7006.Flight();
        CargoFlight oCargoFlight = new CargoFlight();
    
        Flight lax175 = new Flight(175);
        Passenger jane = new Passenger();
        Beer liteBeer = new Beer();
        Wine marlot = new Wine();
    
        System.out.println(lax175.getFlightNumber());
    }
}
