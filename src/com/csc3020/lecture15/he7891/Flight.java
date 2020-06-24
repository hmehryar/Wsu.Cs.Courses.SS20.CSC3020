package com.csc3020.lecture15.he7891;

// *
// Author: Nathan Tattrie
// Student ID: he7891
// Lecture14
// *


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Flight implements Comparable<Flight>, Iterable<Person> {

    static final int MAX_FAA_SEATS = 550;
    private int passengers;
    private int seats;
    private boolean[] isSeatAvailable;
    private Integer flightNumber;
    private Character flightClass;
    private int maxCarryons = 2 * seats, totalCarryons;
    private int totalCheckedBags;
    private int flightTime; // minutes past midnight
    private CrewMember[] crew;
    private Passenger[] roster;


    // Initialization brackets for constructors
    // Have "this()" in every constructor to replicate this code
    {
        isSeatAvailable = new boolean[seats];
        for (int index = 0; index < seats; index++) {
            isSeatAvailable[index] = true;
        }
        seats = 150;
        passengers = 0;
        maxCarryons = 2 * seats;
        totalCarryons = 0;
        totalCheckedBags = 0;
    }

    //////////////////////////// CLASS FUNCTIONS ////////////////////////////
    public Flight() {
    }
    public Flight(int flightNumber) {
        this();
        this.flightNumber = flightNumber;
    }
    public Flight(char flightClass) {
        this();
        this.flightClass = flightClass;
    }



    ////////////////////////////// OVERRIDES ///////////////////////////////
    @Override
    public String toString() {
        return "Flight{" +
                "passengers=" + passengers +
                ", seats=" + seats +
                ", flightNumber=" + flightNumber +
                ", flightClass=" + flightClass +
                ", maxCarryons=" + maxCarryons +
                ", totalCarryons=" + totalCarryons +
                ", totalCheckedBags=" + totalCheckedBags +
                ", flightTime=" + flightTime +
                '}';
    }

    //    @Override
//    public String toString() {
//        return "Flight{" +
//                "flightNumber=" + flightNumber +
//                ", flightClass=" + flightClass +
//                '}';
//        if (flightNumber != null) {
//            return "Flight #" + flightNumber;
//        } else if (flightClass != null) {
//            return "Flight Class " + flightClass;
//        } else {
//            return "Flight identity is not set";
//        }
//
//    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            return true;
        }
        if (!(o instanceof Flight)) {
            return false;
        }
        Flight other = (Flight) o;
        return flightClass == other.flightClass && flightNumber == other.flightNumber;
    }

    //    @Override
//    public int compareTo(Object o) {
//        Flight flight = (Flight) o;
//        if (flightTime < flight.flightTime) {
//            return -1;
//        } else if (flightTime > flight.flightTime) {
//            return 1;
//        } else {
//            return 0;
//        }
//    }

    @Override
    public int compareTo(Flight o) {
        return flightTime - o.flightTime;
    }

    @Override
    public Iterator<Person> iterator() {
        //return new FlightIterator(crew, roster);
        return new Iterator<Person>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < (crew.length + roster.length);
            }

            @Override
            public Person next() {
                Person p = (index < crew.length) ? crew[index] : roster[index - crew.length];
                index++;
                return p;
            }
        };
    }

//    private class FlightIterator implements Iterator<Person> {
//        private int index = 0;
//        @Override
//        public boolean hasNext() {
//            return index < (crew.length + roster.length);
//        }
//
//        @Override
//        public Person next() {
//            Person p = (index < crew.length) ? crew[index] : roster[index - crew.length];
//            index++;
//            return p;
//        }
//    }

    /////////////////////////////// SETTERS ///////////////////////////////
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }
    public void setFlightClass(char flightClass) {
        this.flightClass = flightClass;
    }
    public void setSeats(int _seats) {
        this.seats = _seats;
    }
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
    public void setFlightTime(int flightTime) {
        this.flightTime = flightTime;
    }

    /////////////////////////////// GETTERS ///////////////////////////////
    public int getFlightNumber() {
        return flightNumber;
    }
    public char getFlightClass() {
        return flightClass;
    }
    public int getSeat() {
        return seats;
    }
    public int getPassengers() {
        return passengers;
    }
    public int getSeats() {
        return seats;
    }
    public int getFlightTime() {
        return flightTime;
    }

    ///////////////////////////// OTHER FUNCTIONS /////////////////////////////
    public void add1Passenger() {
        if (hasSeating()) {
            passengers += 1;
            allPassengers += 1;
        }
        else {
            handleTooMany();
        }
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
        if (hasSeating() && hasCarryonSpace(carryOns)) {
            add1Passenger(bags);
            totalCarryons += carryOns;
        }
    }
    public void add1Passenger(Passenger p, int carryOns) {
        add1Passenger(p.getCheckedBags(), carryOns);
    }
//    public void add1Passenger(Passenger p) {
//        add1Passenger(p);
//    }
    public void addPassengers(String fileName) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line = null;
            line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                passengers += Integer.valueOf(parts[0]);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
    private boolean hasSeating() {
        return passengers < seats;
    }
    private boolean hasCarryonSpace(int carryons) {
        return totalCarryons + carryons <= maxCarryons;
    }
    private void handleTooMany() {
        System.out.println("Too many!");
    }
    public boolean hasRoom(Flight f2) {
        int total = passengers + f2.passengers;
        return total <= seats;
    }
    public Flight createFlightWithBoth(Flight flight2) {
        Flight newFlight = new Flight();
        newFlight.seats = seats;
        newFlight.passengers = this.passengers + flight2.passengers;
        return newFlight;
    }
    public void print() {
        String str = "Flight[ seats = " + this.seats + ", passengers = " + this.passengers + " ]";
        System.out.println(str);
    }


    public void addCrewMembers(CrewMember[] crew) {
        this.crew = crew;
    }

    public void addRoster (Passenger[] roster) {
        this.roster = roster;
    }


    // Static variables and function Usually go at the end of a class
    static int allPassengers;
    static int getAllPassengers() {
        return allPassengers;
    }
    static int resetAllPassengers() {
        return allPassengers = 0;
    }

}
