package lecture07.av7071;//package com.csc3020.lecture07.av7071;
// Lecture 07: Class//
public class Flight {
    public int passengers;
    public int seats;
    private boolean[] isSeatAvailable;
    private int flightNumber;
    private char flightClass;

    {
        seats = 150;
        passengers = 0;
        isSeatAvailable=new boolean[seats];
        for (int index = 0; index <seats ; index++) {
            isSeatAvailable[index]=true;
        }
    }


    public Flight() {
    }

    public Flight(int flightNumber){
        this();
        this.flightNumber=flightNumber;
    }

    public  Flight(char flightClass){
        this();
        this.flightClass=flightClass;
    }
    public int getSeat(){
        return  seats;
    }
    public void setSeats(int seats){
        this.seats=seats;
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

    public int getPassengers() {
        return passengers;
    }
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public void add1Pass() {
        if (passengers < seats)
            passengers += 1;
        else
            handleTooMany();
    }

    private void handleTooMany() {
        System.out.println("Too many!");
    }

    public boolean hasRoom(com.csc3020.lecture07.av7071.Flight f2) {
        int total = passengers + f2.passengers;
        return total <= seats;
    }
    public com.csc3020.lecture07.av7071.Flight createFlightWithBoth(com.csc3020.lecture07.av7071.Flight flight2){
        com.csc3020.lecture07.av7071.Flight newFlight=new com.csc3020.lecture07.av7071.Flight();
        newFlight.seats=seats;
        newFlight.passengers=this.passengers+flight2.passengers;
        return newFlight;
    }
    public void print(){
        String str="Flight[ seats= "+this.seats+",passengers= "+this.passengers+"]";
        System.out.println(str);
    }
}
