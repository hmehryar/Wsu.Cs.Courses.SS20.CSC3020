package com.csc3020.lecture13.hc7391;

//package com.hmehryar.travel;
import com.csc3020.lecture12.hc7391.CargoFlight; // gets rid of directory
import com.csc3020.lecture13.hc7391.vinson.travel.Flight;
import com.csc3020.lecture13.hc7391.vinson.travel.Passenger;
//import com.company.lecture13.hc7391.vinson.travel.*;

//import com.company.lecture13.hc7391.xyzcompany.bar.Beer;
//import com.company.lecture13.hc7391.xyzcompany.bar.Wine;
import com.csc3020.lecture13.hc7391.xyzcompany.bar.*;
public class Lecture13Source {

    public static void main(String[] args)
    {
        Flight oFlight = new Flight();
        com.csc3020.lecture11.hc7391.Flight oLecture11Flight = new com.csc3020.lecture11.hc7391.Flight();
        CargoFlight oCargoFlight = new CargoFlight();

        Flight lax175 = new Flight(175);
        Beer liteBeer = new Beer();
        Passenger jane = new Passenger();
        Wine merlot = new Wine();

        System.out.println("Test, is everything ok?");
    }
}
