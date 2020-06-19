package com.csc3020.lecture13.gl1193;

//package com.hmehryar.travel;
import com.csc3020.lecture12.gl1193.CargoFlight;

//import com.csc3020.lecture13.gl1193.hmehryar.travel.Flight;
//import com.csc3020.lecture13.g1193.hmehryar.travel.Passenger;
import com.csc3020.lecture13.gl1193.hmehryar.travel.*;

//import com.csc3020.lecture13.gl1193.xyzcompany.bar.Beer;
//import com.csc3020.lecture13.gl1193.xyzcompany.bar.Wine;

import com.csc3020.lecture13.gl1193.xyzcompany.bar.*;

public class Lecture13Source {
    public static void main(String[] args) {
        new Lecture13Source();
        Flight oFlight = new Flight();
        com.csc3020.lecture11.gl1193.Flight oLecture11Flight = new com.csc3020.lecture11.gl1193.Flight();
        CargoFlight oCargoFlight = new CargoFlight();

        Flight lax175 = new Flight(175);
        Beer liteBeer = new Beer();
        Passenger jane = new Passenger();
        Wine merlot = new Wine();
        lax175.getFlightNumber();
    }
}
