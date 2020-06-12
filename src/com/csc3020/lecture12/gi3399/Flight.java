package com.csc3020.lecture12.gi3399;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

//Lecture 06: Class
//Author: George Esho
public class Flight {
    static final int MAX_FAA_SEATS = 550;
    private int flightNumber;
    private int passengers;
    private Character flightClass;
    public int seats;
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


    public void setSeats(int seats) {
       if(seats <= MAX_FAA_SEATS)
           this.seats= seats;
    }

    @Override
    public boolean equals(Object o) {
       if (super.equals(o)) {
           return true;
       }
       if (!(o instanceof Flight)) {
           return false;
       }
       Flight other = (Flight)o;
       return
               flightClass == other.flightClass &&
                       flightClass == other.flightNumber;
    }

    @Override
    public String toString() {
//           return "Flight{" +
//                   "flightNumber=" + flightNumber +
//                   ", flightClass=" + flightClass +
//                   '}';
       if (flightNumber > 0) {
           return "Flight #" + flightNumber;
       }
       else if (flightClass != null){
           return "Flight Class " + flightClass;
       }
       else {
           return "Flight identity is not set";
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
       return 150;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

//    public void setSeats(int seats) {
//        this.seats = seats;
//    }

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

//    public void add1Passengers(Passenger p) {
//        add1Passengers(p.getCheckedBags());
//    }

    public void add1Passengers(int bags, int carryOns) {
//        System.out.println("Inside the method");
        if (hasSeating() && hasCarryOnSpace(carryOns)){
            add1Passengers(bags);
            totalCarryOns += carryOns;
        }
    }

//    public void add1Passengers(Passenger p, int carryOns) {
//        add1Passengers(p.getCheckedBags(), carryOns);
//    }

    public void addPassengers(String fileName) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                passengers += Integer.valueOf(parts[0]);
            }
        }
        catch (Exception oException) {

        }
        finally {
            if (reader != null)
                reader.close();
        }
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
