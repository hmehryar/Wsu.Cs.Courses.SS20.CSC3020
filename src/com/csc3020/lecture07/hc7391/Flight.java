package com.csc3020.lecture07.hc7391;

public class Flight {
    public int passengers;
    public int seats;
    private boolean[] isSeatsAvailable;
    private int flightNumber;
    private char flightClass;
    {
        seats =150;
        passengers = 0;
        isSeatsAvailable= new boolean[seats];
        for (int i = 0; i < seats ; i++) {
            isSeatsAvailable[i]=true;

        }
    }

    public Flight(){};

    public Flight(int flightNumber)
    {
        this();
        this.flightNumber=flightNumber;
    }

    public Flight(char flightClass)
    {
        this();
        this.flightClass=flightClass;
    }

    public int getSeats(){return seats;}
    public void setSeats(){this.seats = seats;}

    public int getFlightNumber(){return flightNumber;}

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

    public void Add1Passenger()
    {
        if(passengers < seats)
            passengers += 1;
        else
            handleToMany();
    }

    private void handleToMany()
    {
        System.out.println("Too Many!");
    }

    public boolean hasRoom(Flight f2)
    {
    int total = passengers + f2.passengers;
    return total <= seats;
    }

    public Flight createCombineFlight(Flight f2)
    {
        Flight newFlight = new Flight();
        newFlight.passengers = this.passengers + f2.passengers;
        newFlight.seats = seats;
        return newFlight;
    }

    public void print()
    {
        String str = "Flight: " + this.seats + " " + this.passengers;
        System.out.println(str);
    }

}
