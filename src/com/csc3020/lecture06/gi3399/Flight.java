package com.csc3020.lecture06.gi3399;
//Lecture 06: Class
//Author: George Esho
public class Flight {
    private int passengers;
    private int seats;

   public Flight(){
        seats = 150;
        passengers = 0;
    }
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

    void add1Passengers() {
       if (passengers < seats)
           passengers += 1;
       else
           handleTooMany();
    }

   private void handleTooMany(){
       System.out.println("Too many");
   }
}
