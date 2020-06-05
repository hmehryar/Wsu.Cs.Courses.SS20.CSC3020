package com.csc3020.lecture10.gz0715;

public abstract class Pilot {
    // variables
    private Flight currentFlight;

    // Functions
    public void fly(Flight flight) {
        if (canAccept(flight)) {
            currentFlight = flight;
        } else {
            handleCantAccept();
        }
    }

    // Abstract Functions
    public abstract boolean canAccept(Flight flight);
    public void handleCantAccept() {
        System.out.println("Can't accept the flight");
    }
}
