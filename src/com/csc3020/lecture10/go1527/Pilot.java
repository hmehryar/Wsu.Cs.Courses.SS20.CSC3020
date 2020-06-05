package com.csc3020.lecture10.go1527;

public abstract class Pilot {
    private Flight currentFlight;
    public void fly (Flight flight) {
        if (canAccept(flight)) {
            currentFlight = flight;
        } else {
            handleCantAccept();
        }
    }

    public abstract boolean canAccept(Flight flight);
    public void handleCantAccept() {
        System.out.println("Pilot can't accept the flight");
    }
}
