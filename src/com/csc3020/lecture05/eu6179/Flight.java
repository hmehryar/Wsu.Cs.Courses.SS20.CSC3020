package com.csc3020.lecture05.eu6179;

public class Flight {
    int passengers;
    int seats;

    public Flight(){
        seats = 150;
        passengers = 0;
        flightSecurityName = "George";
    }

    void add1Passengers() {
        if (passengers < seats)
            passengers += 1;
        else
            handleTooMany();
        com.csc3020.lecture05.eu6179.Flight.Internal oInternal = new com.csc3020.lecture05.eu6179.Flight.Internal();
    }

    private String flightSecurityName;

    class Internal{

    }
    private void handleTooMany(){
        System.out.println("Too many");
    }
}



