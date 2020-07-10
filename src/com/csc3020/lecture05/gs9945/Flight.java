package com.csc3020.lecture05.gs9945;

public class Flight {
    int passengers;
    int seats;

    public Flight(){
        seats = 150;
        passengers = 0;
        flightSecurityName = "Kris";
    }

    void add1Passengers() {
        if (passengers < seats)
            passengers += 1;
        else
            handleTooMany();
        Flight.Internal oInternal = new Flight.Internal();
    }

    private String flightSecurityName;

    class Internal{

    }
    private void handleTooMany(){
        System.out.println("Too many");
    }
}
