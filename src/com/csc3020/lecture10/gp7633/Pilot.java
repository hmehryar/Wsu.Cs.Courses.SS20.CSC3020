package com.csc3020.lecture10.gp7633;

public abstract class Pilot {
    private Flight currentFlight;
    
    public void fly(Flight flight) {
        if (canAccept(flight)) {
            currentFlight = flight;
        } 
        else {
            handleCantAccept();
        }
    }

    public abstract boolean canAccept(Flight flight);

    public void handleCantAccept() {
        System.out.println("Flight Can't accept the flight");
    }
}
