package com.csc3020.lecture08.gi3399;
//Lecture 06: Class
//Author: George Esho
public class Flight {
    private int flightNumber;
    private int passengers;
    private char flightClass;
    private int seats;
    private int totalCarryOns, totalCheckedBags;
    private int maxCarryOns = seats * 2;
    private boolean[] isSeatAvailable;

   public Flight(){
       seats = 150;
       passengers = 0;
       totalCarryOns = 0;
       totalCheckedBags = 0;
       maxCarryOns = seats * 2;
       isSeatAvailable = new boolean[seats];
       for (int index = 0; index < seats; index++) {
           isSeatAvailable[index] = true;
       }
    }

    public char getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(char flightClass) {
        this.flightClass = flightClass;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Flight(int flightNumber) {
        this();
        this.flightNumber= flightNumber;
    }

    public Flight(char flightClass) {
       this();
       this.flightClass = flightClass;
    }

    public int getTotalCarryOns() {
        return totalCarryOns;
    }

    public void setTotalCarryOns(int totalCarryOns) {
        this.totalCarryOns = totalCarryOns;
    }

    public int getTotalCheckedBags() {
        return totalCheckedBags;
    }

    public void setTotalCheckedBags(int totalCheckedBags) {
        this.totalCheckedBags = totalCheckedBags;
    }

    public int getMaxCarryOns() {
        return maxCarryOns;
    }

    public void setMaxCarryOns(int maxCarryOns) {
        this.maxCarryOns = maxCarryOns;
    }

    //    public Flight(int seats){
////       setSeats(seats);
//        this.seats = seats; //one or the other
//    }

    public int getSeats(){
       return seats;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean hasRoom(Flight f2){
       int total = passengers +f2.passengers;
       if (total <= seats)
           return true;
       else
           return false;
    }

    public Flight createNewWithBoth(Flight f2){
       Flight newFlight = new Flight();
       newFlight.seats = seats;
       newFlight.passengers = this.passengers + f2.passengers;
       return newFlight;
    }

    public void print(){
       String str = "Flight[ seats= "+ this.seats+ ", passengers= " + this.passengers+"]";
        System.out.println(str);
    }

    public void add1Passengers() {
       if (hasSeating())
           passengers += 1;
       else
           handleTooMany();
    }

    public void add1Passengers(int bags) {
        if (hasSeating()) {
            add1Passengers();
            totalCheckedBags += bags;
        }
        else
            handleTooMany();
    }

    public void add1Passengers(Passenger p) {
        add1Passengers(p.getCheckedBags());
    }

    public void add1Passengers(int bags, int carryOns) {
//        System.out.println("Inside the method");
        if (hasSeating() && hasCarryOnSpace(carryOns)){
            add1Passengers(bags);
            totalCarryOns += carryOns;
        }
    }

    public void add1Passengers(Passenger p, int carryOns) {
        add1Passengers(p.getCheckedBags(), carryOns);
    }

    private boolean hasSeating(){
       return passengers < seats;
    }

    private boolean hasCarryOnSpace(int carryOns){
       return totalCarryOns + carryOns <= maxCarryOns;
    }

    private void handleTooMany(){
       System.out.println("Too many");
   }
}
