package csc3020.lecture10.gn8271;
// *
// Author: Raisa Zaman
// Student ID: gn8271
// Lecture10
// *
public class CargoOnlyPilot extends Pilot {
    @Override
    public boolean canAccept(Flight flight) {
        return flight.getPassengers()==0;
    }
}
