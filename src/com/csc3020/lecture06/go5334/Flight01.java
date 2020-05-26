package com.csc3020.lecture06.go5334;

public class Flight01 {
    public int passengers;

    public int seats;

    public Flight01() {
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

    public boolean hasRoom(Flight01 f2) {
        int total = passengers + f2.passengers;
        return total <= seats;
    }
    public  Flight01 createFlightWithBoth(Flight01 flight2){
        Flight01 newFlight=new Flight01();
        newFlight.seats=seats;
        newFlight.passengers=this.passengers+flight2.passengers;
        return newFlight;
    }
    public void print(){
        String str="Flight[ seats= "+this.seats+",passengers= "+this.passengers+"]";
        System.out.println(str);
    }
}
