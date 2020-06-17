package com.csc3020.lecture13.go5334;

import com.csc3020.lecture13.go5334.travel.*;
//import com.csc3020.lecture13.gn2289.xyzcompany.bar.Beer;
//import com.csc3020.lecture13.gn2289.xyzcompany.bar.Wine;
import com.csc3020.lecture13.go5334.xyzcompany.bar.*;

public class Lecture13Source {
    public static void main(String[] args) {
        //new Lecture13Source();
        Flight oFlight = new Flight();
        com.csc3020.lecture10.gn2289.Flight oLecture10Flight = new com.csc3020.lecture10.gn2289.Flight();
        //CargoFlight oCargoFlight = new CargoFlight();

        Flight dtw175 = new Flight(175);
        Beer liteBeer = new Beer();
        Passenger ryan = new Passenger();
        Wine merlot = new Wine();
    }
}