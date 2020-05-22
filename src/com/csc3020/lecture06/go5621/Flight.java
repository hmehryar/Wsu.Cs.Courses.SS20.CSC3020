package com.csc3020.lecture06.go5621;
//Lecture 06: Class
public class Flight {
    private int passengers;
    private int seats;

    public Flight() {
        seats = 150;
        passengers = 0;
    }

    public void add1Passenger() {
        if (passengers < seats) {
            passengers += 1;
        } else {
            handleTooMany();
        }
    }

    private void handleTooMany() {
        System.out.println("Too Many");
    }

    public boolean hasRoom(Flight f2) {
        int total = passengers + f2.passengers;
        return total <= seats;
    }

    public Flight createFlightWithBoth(Flight flight2) {
        Flight newFlight = new Flight();
        newFlight.seats = seats;
        newFlight.passengers = this.passengers + flight2.passengers;
        return newFlight;
    }

    public void print() {
        String string = "Flight[ seats = " + this.seats + ", passengers = " + this.passengers + "]";
        System.out.println(string);
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}
