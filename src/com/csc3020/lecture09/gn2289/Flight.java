package com.csc3020.lecture09.gn2289;

import com.csc3020.lecture08.gn2289.Passenger;

public class Flight extends Object{
    private int passengers;
    private int seats;
    private int flightNumber;
    private char flightClass;
    private boolean[] isSeatAvailable;
    private int maxCarryOns, totalCarryOns;
    private int totalCheckedBags;

    public Flight() {
        seats = 150;
        passengers = 0;

        isSeatAvailable = new boolean[seats];
        for (int i = 0; i < seats ;i++){
            isSeatAvailable[i] = true;

        }
        totalCarryOns = 0;
        totalCheckedBags = 0;

    }

    public Flight(int flightNumber) {
        this();
        this.flightNumber = flightNumber;

    }

    @Override
    public boolean equals(Object o) {
        Flight otherFlight = (Flight) o;
        return flightClass == otherFlight.flightClass &&
                flightNumber == otherFlight.flightNumber;


    }


    public int getSeats() {
        return 150;
    }

    public void setSeats(int seats){
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

    //some overloading
    public void add1Passenger() {
        if (hasSeating())
            passengers += 1;
        else
            handleTooMany();
    }
    public void add1Passenger(int bags) {
        if(hasSeating()) {
            add1Passenger();
            totalCheckedBags += bags;
        }
    }
    public void add1Passenger(Passenger p) {
        add1Passenger(p.getCheckBags());
    }
    public void add1Passenger(int bags, int carryOns) {

        if(hasSeating() && hasCarryOnSpace(carryOns)) {
            add1Passenger(bags);
            totalCarryOns += carryOns;
        }
    }
    public void add1Passenger(Passenger p, int carryOns) {
        add1Passenger(p.getCheckBags(),carryOns);
    }

    private boolean hasSeating() {
        return passengers < seats;
    }

    private boolean hasCarryOnSpace(int carryOns) {
        return totalCarryOns + carryOns < maxCarryOns;
    }

    private void handleTooMany() {
        System.out.println("Too many!");
    }

    public boolean hasRoom(Flight f2) {
        int total = passengers + f2.passengers;
        return total <= seats;
    }

//    public com.csc3020.lecture06.gn2289.Flight createFlightWithBoth(com.csc3020.lecture06.gn2289.Flight flight2) {
//        com.csc3020.lecture06.gn2289.Flight newFlight = new com.csc3020.lecture06.gn2289.Flight();
//        newFlight.seats = seats;
//        newFlight.passengers = this.passengers + flight2.passengers;
//        return newFlight;
//    }
    public void print() {
        String str = "Flight [ seats="+this.seats+", passengers="+this.passengers+"]";
        System.out.println(str);
    }


}
