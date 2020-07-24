package csc3020.lecture08.he7891;

// *
// Author: Nathan Tattrie
// Student ID: he7891
// Lecture08
// *

public class Flight {

    private int passengers;
    private int seats;
    private boolean[] isSeatAvailable;
    private int flightNumber;
    private char flightClass;
    private int maxCarryons = 2 * seats, totalCarryons;
    private int totalCheckedBags;

    // Initialization brackets for constructors
    // Have "this()" in every constructor to replicate this code
    {
        isSeatAvailable = new boolean[seats];
        for (int index = 0; index < seats; index++) {
            isSeatAvailable[index] = true;
        }
        seats = 150;
        passengers = 0;
        maxCarryons = 2 * seats;
        totalCarryons = 0;
        totalCheckedBags = 0;
    }

    //////////////////////////// CLASS FUNCTIONS ////////////////////////////
    public Flight() {}

    public Flight(int flightNumber) {
        this();
        this.flightNumber = flightNumber;
    }

    public Flight(char flightClass) {
        this();
        this.flightClass = flightClass;
    }

    /////////////////////////////// SETTERS ///////////////////////////////
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setFlightClass(char flightClass) {
        this.flightClass = flightClass;
    }

    // Setter. Use underscore as a best practice.
    public void setSeats(int _seats) {
        this.seats = _seats;
    }

    // Setter
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    /////////////////////////////// GETTERS ///////////////////////////////
    public int getFlightNumber() {
        return flightNumber;
    }

    public char getFlightClass() {
        return flightClass;
    }

    // Use control+insert to pull up a menu for automatically making a getter and setter
    // Getter
    public int getSeat() {
        return seats;
    }

    // Getter
    public int getPassengers() {
        return passengers;
    }

    public int getSeats() {
        return seats;
    }


    ///////////////////////////// OTHER FUNCTIONS /////////////////////////////
    public void add1Passenger() {
        if (hasSeating())
            passengers += 1;
        else
            handleTooMany();
    }

    public void add1Passenger(int bags) {
        if (hasSeating()) {
            add1Passenger();
            totalCheckedBags += bags;
        }
    }

    public void add1Passenger(Passenger p) {
        add1Passenger(p.getCheckedBags());

    }

    public void add1Passenger(int bags, int carryOns) {
        if (hasSeating() && hasCarryonSpace(carryOns)) {
            add1Passenger(bags);
            totalCarryons += carryOns;
        }
    }

    public void add1Passenger(Passenger p, int carryOns) {
        add1Passenger(p.getCheckedBags(), carryOns);
    }

    private boolean hasSeating() {
        return passengers < seats;
    }

    private boolean hasCarryonSpace(int carryons) {
        return totalCarryons + carryons <= maxCarryons;
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
