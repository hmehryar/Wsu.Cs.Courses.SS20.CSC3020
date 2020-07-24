package com.csc3020.lecture05.gv7006;

//Lecture 05: Class
public class Flight {
    int passengers;
    int seats;

    public Flight() {
        seats = 150;
        passengers = 0;
        flightSecurityName = "George";
    }

    void add1Passengers() {
        if (passengers < seats)
            passengers += 1;
        else
            handleTooMany();
        Internal oInternal = new Internal();
    }

    private String flightSecurityName;

    class Internal {

    }

    private void handleTooMany() {
        System.out.println("Too many");
    }
}
