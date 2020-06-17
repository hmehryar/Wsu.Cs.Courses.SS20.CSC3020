package csc3020.lecture13.go3480;

import csc3020.lecture12.go3480.CargoFlight;

//import csc3020.lecture13.go3480.ahasan.travel.Flight;
//import csc3020.lecture13.go3480.ahasan.travel.Passenger;
import csc3020.lecture13.go3480.ahasan.travel.*;

//import csc3020.lecture13.go3480.xyzcompany.bar.Beer;
//import csc3020.lecture13.go3480.xyzcompany.bar.Wine;
import csc3020.lecture13.go3480.xyzcompany.bar.*;

public class Lecture13Source {
    public static void main(String[] args) {
        new csc3020.lecture13.go3480.Lecture13Source();
        Flight oFlight = new Flight();
        csc3020.lecture11.go3480.Flight oLecture11Flight = new csc3020.lecture11.go3480.Flight();
        CargoFlight oCargoFlight = new CargoFlight();

        Flight lax175 = new Flight(175);
        Beer liteBeer = new Beer();
        Passenger jane = new Passenger();
        Wine merlot = new Wine();

    }
}
