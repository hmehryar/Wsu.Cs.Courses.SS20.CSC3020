package com.csc3020.lecture10.em0608;

public class CargoOnlyPilot extends Pilots {
    @Override
    public boolean canAccept(Flight flight) {
        return flight.getPassengers() == 0;
    }
}
