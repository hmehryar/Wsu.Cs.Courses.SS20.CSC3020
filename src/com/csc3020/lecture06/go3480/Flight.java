package com.csc3020.lecture06.go3480;

public class Flight {

    private int seats;
    private int passengers;

    public Flight() {
        seats = 150;
        passengers = 0;
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
    void add1Passenger() {
        if (passengers < seats)
            passengers += 1;
        else
            handleTooMany();
    }
    private void handleTooMany() {
        System.out.println("Too many!!!");
    }
    public boolean hasRoom(Flight f2) {
        int total = passengers + f2.passengers;
        return total <= seats;
    }
    public Flight createFlightWithBoth(Flight f2) {
        Flight newFlight = new Flight();
        newFlight.seats = seats;
        newFlight.passengers = this.passengers+f2.passengers;
        return newFlight;
    }
    public void print(){
        String str = "Flight [seats = "+this.seats+", passengers = "+this.passengers+"]";
        System.out.println(str);
    }
}