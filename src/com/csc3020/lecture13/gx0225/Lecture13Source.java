package csc3020.lecture13.gx0225;

//import csc3020.lecture13.gx0225.xyzcompany.*;

import csc3020.lecture13.gx0225.travel.*;
import csc3020.lecture13.gx0225.xyzcompany.bar.Beer;
import csc3020.lecture13.gx0225.xyzcompany.bar.Wine;


public class Lecture13Source {

    public static void main(String[] args) {



        Flight oFlight=new Flight();



        CargoFlight oCargoFlight=new CargoFlight();



        Flight lax175=new Flight(175);

        Beer liteBeer=new Beer();

        Passenger oPassenger=new Passenger();

        Wine merlot=new Wine();





        lax175.getFlightNumber();

    }
}
