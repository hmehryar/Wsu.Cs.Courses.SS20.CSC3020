package com.csc3020.lecture13.gi3399;
//package com.hmehryar.travel;
import com.csc3020.lecture12.gi3399.CargoFlight;

//import com.csc3020.lecture13.gi3399.hmehryar.travel.Flight;
//import com.csc3020.lecture13.gi3399.hmehryar.travel.Passenger;
import com.csc3020.lecture13.gi3399.hmehryar.travel.*;

//import com.csc3020.lecture13.gi3399.xyzcompany.bar.Beer;
//import com.csc3020.lecture13.gi3399.xyzcompany.bar.Wine;

import com.csc3020.lecture13.gi3399.xyzcompany.bar.*;

public class Lecture13Source {
    public static void main(String[] args) {
        new Lecture13Source();
        Flight oFlight = new Flight();
        com.csc3020.lecture11.gi3399.Flight oLecture11Flight = new com.csc3020.lecture11.gi3399.Flight();
        CargoFlight oCargoFlight = new CargoFlight();

        Flight lax175 = new Flight(175);
        Beer liteBeer = new Beer();
        Passenger jane = new Passenger();
        Wine merlot = new Wine();
        lax175.getFlightNumber();
    }
}
