package com.csc3020.lecture06.gs9945;

public class Flight {

    public int passengers;
    public int seats;

    public Flight() {
        seats = 150;
        passengers = 0;
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

    public void add1Pass() {
        if (passengers < seats)
            passengers += 1;
        else
            handleTooMany();
    }

    private void handleTooMany() {
        System.out.println("Too many!");
    }

    public boolean hasRoom(com.csc3020.lecture06.hm.Flight f2) {
        int total = passengers + f2.passengers;
        return total <= seats;
    }
    public com.csc3020.lecture06.hm.Flight createFlightWithBoth(com.csc3020.lecture06.hm.Flight flight2){
        com.csc3020.lecture06.hm.Flight newFlight=new com.csc3020.lecture06.hm.Flight();
        newFlight.seats=seats;
        newFlight.passengers=this.passengers+flight2.passengers;
        return newFlight;
    }
    public void print(){
        String str="Flight[ seats= "+this.seats+",passengers= "+this.passengers+"]";
        System.out.println(str);
    }
}
