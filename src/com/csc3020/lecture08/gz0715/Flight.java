package com.csc3020.lecture08.gz0715;

// Lecture 05: Class//
public class Flight {
    public int passengers;
    public int seats;
    private boolean[] isSeatAvailable;
    private int flightNumber;
    private char flightClass;
    private int maxCarryOns, totalCarryOn;
    private int totalCheckedBags;

    //initialization block
    {
        seats = 150;
        passengers = 0;

        isSeatAvailable = new boolean[seats];
        for (int index = 0; index < seats; index++) {
            isSeatAvailable[index] = true;
        }

        totalCarryOn = 0;
        totalCheckedBags = 0;
        maxCarryOns = seats * 2;
    }

    // Constructors
    public Flight() {

    }

    public Flight(int flightNumber) {
        this();
        this.flightNumber = flightNumber;
    }

    public Flight(char flightClass) {
        this();
        this.flightClass = flightClass;
    }


    // Getter and Setter Functions
    public int getSeat() {
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

    public int getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public char getFlightClass() {
        return flightClass;
    }
    public void setFlightClass(char flightClass) {
        this.flightClass = flightClass;
    }

    // Functions
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
        if (hasSeating() && hasCarryOnSpace(carryOns)) {
            add1Passenger(bags);
            totalCarryOn += carryOns;
        }
    }
    public void add1Passenger(Passenger p, int carryOns)
    {
        add1Passenger(p.getCheckedBags(), carryOns);
    }

    public void print() {
        String str = "Flight[ seats= " + this.seats + ",passengers= " + this.passengers + "]";
        System.out.println(str);
    }

    public Flight createFlightWithBoth(Flight flight2) {
        Flight newFlight = new Flight();
        newFlight.seats = seats;
        newFlight.passengers = this.passengers + flight2.passengers;
        return newFlight;
    }

    public boolean hasRoom(Flight f2) {
        int total = passengers + f2.passengers;
        return total <= seats;
    }

    private void handleTooMany() {
        System.out.println("Too many!");
    }

    private boolean hasSeating() {
        return passengers < seats;
    }

    private boolean hasCarryOnSpace(int carryOns) {
        return totalCarryOn + carryOns <= maxCarryOns;
    }
}
