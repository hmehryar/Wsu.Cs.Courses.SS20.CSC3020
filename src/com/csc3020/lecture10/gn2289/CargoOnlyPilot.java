package com.csc3020.lecture10.gn2289;

public class CargoOnlyPilot extends Pilot{

    @Override
    public boolean canAccept(Flight flight) {
        return flight.getPassengers() == 0;
    }
}
