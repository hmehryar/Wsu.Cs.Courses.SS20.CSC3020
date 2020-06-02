package com.csc3020.lecture08.gp7633;
// Lecture 05: Class//
public class Flight {
    public int passengers;
    public int seats;
    private boolean[] isSeatAvailable;
    private int flightNumber;
    private char flightClass;
    private int maxCarryOns, totalCarryOns;
    private int totalCheckedBags;

    {
        isSeatAvailable = new boolean[seats];
        for (int index = 0; index < seats; index++) {
            isSeatAvailable[index] = true;
        }
        seats = 150;
        passengers = 0;
        totalCarryOns = 0;
        maxCarryOns = seats * 2;
        totalCheckedBags = 0;
    }


    public Flight() {
    }

    public Flight (int fNumber) {
        this();
        this.flightNumber = fNumber;
    }

    public Flight(char flightClass) {
        this();
        this.flightClass = flightClass;
    }

    public int getSeat(){
        return  seats;
    }
    public void setSeats(int seats){
        this.seats=seats;
    }
    public int getPassengers() {
        return passengers;
    }
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }


    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

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
        if (hasSeating())
            add1Passenger(p.getCheckedBags());
    }

    public void add1Passenger(int bags, int carryOns) {
       // System.out.println("Inside the method");
        if (hasSeating() && hasCarryOnSpace(carryOns)) {
          //  System.out.println("Inside the condition");
            add1Passenger(bags);
            totalCarryOns += carryOns;
        }
    }

    public void add1Passenger(Passenger p, int carryOns) {
        add1Passenger(p.getCheckedBags(), carryOns);
    }

    private boolean hasSeating() {
        return passengers < seats;
    }

    private boolean hasCarryOnSpace(int carryOns) {
        return  totalCarryOns + carryOns <= maxCarryOns;
    }
    private void handleTooMany() {
        System.out.println("Too many!");
    }

    public void print(){
        String str="Flight[ seats= "+this.seats+",passengers= "+this.passengers+"]";
        System.out.println(str);
    }
}
