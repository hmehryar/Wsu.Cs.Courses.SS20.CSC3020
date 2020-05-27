package com.csc3020.lecture07.go5621;
//Lecture 07: Class
public class Flight {
    private int passengers;
    private int seats;
    private boolean[] isSeatAvailable;
    private int flightNumber;
    private char flightClass;

    {
        seats = 150;
        passengers = 0;
        isSeatAvailable = new boolean[seats];
        for (int i = 0; i < seats; i++) {
            isSeatAvailable[i] = true;
        }
    }

    public Flight() {

    }

//    public Flight(int seats) {
//        //setSeats(seats);
//        this.seats = seats;
//        isSeatAvailable = new boolean[seats];
//        for (int i = 0; i < seats; i++) {
//            isSeatAvailable[i] = true;
//        }
//    }

    public Flight(int flightNumber) {
        this();
        this.flightNumber = flightNumber;
    }

    public Flight(char flightClass) {
        this();
        this.flightClass = flightClass;
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
