package com.csc3020.lecture10.fy2906;

public class CargoOnlyPilot extends Pilot{
    @Override
    public boolean canAccept(Flight flight) {
        boolean canFly = flight.getPassengers()==0;
        return canFly;
    }
}
