package csc3020.lecture13.gz0715;

import csc3020.lecture13.gz0715.xyzcompany.*;
import csc3020.lecture13.gz0715.mbeg.travel.*;

public class Lecture13Source {
    public static void main(String[] args) {
        //new csc3020.lecture13.hm.Lecture13Source();
        Flight oFlight=new Flight();
        //csc3020.lecture11.hm.Flight oLecture11Flight=new csc3020.lecture11.hm.Flight();
        CargoFlight oCargoFlight=new CargoFlight();

        Flight lax175=new Flight(175);
        Beer liteBeer=new Beer();
        Passenger oPassenger=new Passenger();
        Wine merlot=new Wine();

        //lax175.flightNumber
        lax175.getFlightNumber();
    }
}
