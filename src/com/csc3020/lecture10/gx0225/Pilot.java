package com.csc3020.lecture10.gx0225;

public abstract class Pilot {
    private Flight currentFlight;
    public void fly(Flight flight){
        if (canAccept(flight)){
            currentFlight=flight;
        }else {
            handleCantAccept();
        }
    }

    protected abstract boolean canAccept(Flight flight);
    public void handleCantAccept(){
        System.out.println("Flight can't handle");
    }
}
