package com.csc3020.lecture10.em0608;

public abstract class Pilots {
    private Flight currentFlight;
    
    public void fly(Flight flight){
        if(canAccept(flight)){
            currentFlight = flight;
        }else{
            handleCantAccept();
        }
    }

    public abstract boolean canAccept(Flight flight);

    public void handleCantAccept(){
        System.out.println("Cannot Take Flight");
    }
}
