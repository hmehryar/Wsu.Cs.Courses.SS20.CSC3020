package lecture13.gn8271;

import lecture12.gn8271.CargoFlight;

import lecture13.gn8271.rzaman.travel.Flight;
import lecture13.gn8271.rzaman.travel.Passenger;

//import lecture13.gn8271.rzaman.travel.*;

//import lecture13.gn8271.xyzcompany.bar.Beer;
//import lecture13.gn8271.xyzcompany.bar.Wine;
import lecture13.gn8271.xyzcompany.bar.*;

public class Lecture13Source {
    public static void main(String[] args) {
        //new lecture13.gn8271.Lecture13Source();
        Flight oFlight = new Flight();
        lecture11.gn8271.Flight oLecture11Flight = new lecture11.gn8271.Flight();
        CargoFlight oCargoFlight = new CargoFlight();

        Flight lax175 = new Flight(175);
        Beer liteBeer = new Beer ();
        Passenger jane = new Passenger();
        Wine merlot = new Wine();

        //Lax175.flightNumber
        lax175.getFlightNumber();
    }
}
