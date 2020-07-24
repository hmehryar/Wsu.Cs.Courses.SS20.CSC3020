package csc3020.lecture06.he7891;
// *
// Author: Nathan Tattrie
// Student ID: he7891
// Lecture06
// *

public class Flight {

    public int seats;
    public int passengers;
    //private int passengers;
    //private int seats;

    public Flight() {
        seats = 150;
        passengers = 0;
    }

    // Use control+insert to pull up a menu for automatically making a getter and setter
    // Getter
    public int getSeat() {
        return seats;
    }
    // Setter. Use underscore as a best practice.
    public void setSeats(int _seats) {
        this.seats = _seats;
    }

    // Getter
    public int getPassengers() {
        return passengers;
    }

    // Setter
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getSeats() {
        return seats;
    }

    public void add1Passenger() {
        if (passengers < seats)
            passengers += 1;
        else
            handleTooMany();
    }

    private void handleTooMany() {
        System.out.println("Too many!");
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
        String str = "Flight[ seats = " + this.seats + ", passengers = " + this.passengers + " ]";
        System.out.println(str);
    }

}
