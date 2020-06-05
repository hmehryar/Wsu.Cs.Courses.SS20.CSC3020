package com.csc3020.lecture10.gi3399;

abstract public class Pilot {
    private Flight currenntFlight;

    public void fly(Flight flight) {
        if (canAccept(flight))
            currenntFlight = flight;
        else
            handleCantAccept();
    }

    public abstract boolean canAccept(Flight flight);

    public void handleCantAccept() {
        System.out.println("Can't accept");
    }
}
