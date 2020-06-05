package com.csc3020.lecture10.gx0225;

public class CargoOnlyPilot extends Pilot{

    @Override
    public boolean canAccept(Flight flight) {
//        boolean  canFly=flight.getPassengers()==0;
//        return canFly;
        return flight.getPassengers()==0;
    }
}
