package com.csc3020.lecture09.gv7006;

class Flight {
    public int passengers;
    public int seats;
    private boolean[] isSeatAvailable;
    private int flightNumber;
    private char flightClass;
    private int maxCarryOns, totalCarryOns;
    private int totalCheckedBags;

//    {
//        seats = 150;
//        passengers = 0;
//        isSeatAvailable = new boolean[seats];
//        for (int index = 0; index < seats; index++) {
//            isSeatAvailable[index] = true;
//        }
//        maxCarryOns = seats * 2;
//        totalCarryOns = 0;
//        totalCheckedBags = 0;
//    }
    
    
    public Flight() {
        passengers = 0;
        seats = 150;
        isSeatAvailable = new boolean[seats];
        for (int i = 0; i < seats; i++) isSeatAvailable[i] = true;
        totalCarryOns = 0;
        totalCheckedBags = 0;
        maxCarryOns = seats * 2;
    }
    
    public Flight(int flightNumber) {
        this();
        this.flightNumber = flightNumber;
    }
    
    public Flight(char flightClass) {
        this();
        this.flightClass = flightClass;
    }
    
    public Flight createFlightWithBoth(Flight flight2) {
        Flight newFlight = new Flight();
        newFlight.seats = seats;
        newFlight.passengers = this.passengers + flight2.passengers;
        return newFlight;
    }
    
    public int getPassengers() {
        return passengers;
    }
    
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
    
    public int getSeats() {
        return seats;
    }
    
    public void setSeats(int seats) {
        this.seats = seats;
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
            ++passengers;
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
        add1Passenger(p.getCheckedBags());
    }
    
    public void add1Passenger(int bags, int carryOns) {
        if (hasSeating() && hasCarryOnSpace(carryOns)) {
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
        return totalCarryOns + carryOns <= maxCarryOns;
    }
    
    public boolean hasRoom(Flight f2) {
        int total = passengers + f2.passengers;
        return total <= seats;
    }
    
    private void handleTooMany() {
        System.out.println("Too many!");
    }
    
    public void print() {
        System.out.printf("Flight[seats=%d, passengers=%d]\n", seats, passengers);
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof Flight) {
            Flight oFlight = (Flight) o;
            return flightClass == oFlight.flightClass && flightNumber == oFlight.flightNumber;
        }
        return false;
    }
}
