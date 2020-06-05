package com.csc3020.lecture10.gz0715;

public class CargoOnlyPilot extends Pilot{
    @Override
    public boolean canAccept(Flight flight) {
        return flight.getPassengers() == 0;
    }
}
