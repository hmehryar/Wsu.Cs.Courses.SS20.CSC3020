package com.csc3020.lecture07.gn2289;
public class Flight {
    private int passengers = 0;
    private int seats;
    private int flightNumber;
    private char flightClass;

    public Flight() {
        seats = 150;

        boolean[] isSeatAvailable = new boolean[seats];
        for (int i = 0; i < seats ;i++){
            isSeatAvailable[i] = true;

        }
    }

    public Flight(int flightNumber) {
        this();
        this.flightNumber = flightNumber;

    }

    public int getSeats() {
        return seats;
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

    //
//    void add1Passenger() {
//        if (passengers < seats)
//            passengers += 1;
//        else
//            handleTooMany();
//    }
//
//    private void handleTooMany() {
//        System.out.println("Too many!");
//    }
//
//    public boolean hasRoom(com.csc3020.lecture06.gn2289.Flight f2) {
//        int total = passengers + f2.passengers;
//        return total <= seats;
//    }
//
////    public com.csc3020.lecture06.gn2289.Flight createFlightWithBoth(com.csc3020.lecture06.gn2289.Flight flight2) {
////        com.csc3020.lecture06.gn2289.Flight newFlight = new com.csc3020.lecture06.gn2289.Flight();
////        newFlight.seats = seats;
////        newFlight.passengers = this.passengers + flight2.passengers;
////        return newFlight;
////    }
//    public void print() {
//        String str = "Flight [ seats="+this.seats+", passengers="+this.passengers+"]";
//        System.out.println(str);
//    }

}
