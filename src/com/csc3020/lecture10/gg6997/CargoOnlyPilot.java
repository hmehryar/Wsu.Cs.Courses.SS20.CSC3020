package com.csc3020.lecture10.gg6997;

public class CargoOnlyPilot extends Pilot{
    @Override
    public boolean canAccept(Flight flight) {
        return flight.getPassengers()==0;
    }
}
