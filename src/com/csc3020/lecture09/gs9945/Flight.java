package com.csc3020.lecture09.gs9945;//package com.csc3020.lecture06.hm;

// Lecture 05: Class//
public class Flight {
    private int passengers;
    //    public int seats;
    private int seats;
    private boolean[] isSeatAvailable;
    private int totalCarryOns;
    private int maxCarryOns;
    private int totalCheckedBags;
    private int flightNumber;
    private char flightClass;
    {
        seats = 150;
        maxCarryOns = 2 * seats;
        passengers = 0;
        isSeatAvailable = new boolean[seats];
        for (int index = 0; index < seats; index++) {
            isSeatAvailable[index] = true;
        }
        totalCarryOns = 0;
        totalCheckedBags = 0;
    } // initialization block

    public Flight() {

    }

    public Flight(int flightNumber){
        this();
        this.flightNumber = flightNumber;
    }
    public Flight(char flightClass){
        this();
        this.flightClass = flightClass;
    }

    @Override
    public boolean equals(Object o){
        if (!(o instanceof Flight)) {
            return false;
        }

        Flight other = (Flight) o;
        return flightClass == other.flightClass
                && flightNumber == other.flightNumber;

    }

    public int getSeats(){
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

    public void add1Passenger() {
        if (hasSeating())
            passengers += 1;
        else
            handleTooMany();
    }
    public void add1Passenger(int bags){
        if (hasSeating()){
            add1Passenger();
            totalCheckedBags += bags;
        }
    }
    public void add1Passenger(Passenger p){
        add1Passenger(p.getCheckedBags());
    }
    public void add1Passenger(int bags, int carryOns){
        if (hasSeating() && hasCarryOnSpace(carryOns)){
            add1Passenger(bags);
            totalCarryOns += carryOns;
        }
    }
    public void add1Passenger(Passenger p, int carryOns){
        add1Passenger(p.getCheckedBags(), carryOns);
    }



    private boolean hasSeating(){
        return passengers < seats;
    }
    private boolean hasCarryOnSpace(int carryOns){
        return totalCarryOns + carryOns <= maxCarryOns;
    }
    private void handleTooMany() {
        System.out.println("Too many!");
    }

    public boolean hasRoom(Flight f2) {
        int total = passengers + f2.passengers;
        return total <= seats;
    }
    public Flight createFlightWithBoth(Flight flight2){
        Flight oFlight = new Flight();
        oFlight.seats = seats;
        oFlight.passengers = passengers + flight2.passengers;
        return oFlight;
    }
    public void print(){
        String str = "Flight[seats = " + this.seats + ", passengers = " + this.passengers + "]";
        System.out.println(str);
    }
}
