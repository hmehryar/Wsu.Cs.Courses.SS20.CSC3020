package csc3020.lecture13.hm;

import csc3020.lecture12.hm.CargoFlight;

import csc3020.lecture13.hm.hmehryar.travel.Flight;
import csc3020.lecture13.hm.hmehryar.travel.Passenger;

//import csc3020.lecture13.hm.hmehryar.travel.*;


//import csc3020.lecture13.hm.xyzcompany.bar.Beer;
//import csc3020.lecture13.hm.xyzcompany.bar.Wine;

import csc3020.lecture13.hm.xyzcompany.bar.*;


public class Lecture13Source {
    public static void main(String[] args) {
       //new csc3020.lecture13.hm.Lecture13Source();
         Flight oFlight=new Flight();
         csc3020.lecture11.hm.Flight oLecture11Flight=new csc3020.lecture11.hm.Flight();
         CargoFlight oCargoFlight=new CargoFlight();

         Flight lax175=new Flight(175);
         Beer liteBeer=new Beer();
         Passenger oPassenger=new Passenger();
         Wine merlot=new Wine();

         //lax175.flightNumber
        lax175.getFlightNumber();

    }
}
