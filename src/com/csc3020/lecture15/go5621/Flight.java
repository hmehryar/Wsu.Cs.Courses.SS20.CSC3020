package com.csc3020.lecture15.go5261;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Flight implements Comparable<Flight>, Iterable<Person>{
    static final int MAX_FAA_SEATS = 550;
    private int passengers;
    public int seats;
    private boolean[] isSeatAvailable;
    private int flightNumber;
    private Character flightClass;
    private int maxCarryOns, totalCarryOns;
    private int totalCheckedBags;
    private int flightTime; //minutes past midnight
    private CrewMember[] crew;
    private Passenger[] roster;
    static int allPassengers;

    {
        seats = 150;
        passengers = 0;
        isSeatAvailable = new boolean[seats];
        for (int i = 0; i < seats; i++) {
            isSeatAvailable[i] = true;
        }
        totalCarryOns = 0;
        totalCheckedBags = 0;
        maxCarryOns = seats * 2;
    }

    @Override
    public Iterator<Person> iterator() {
        //return new FlightIterator();
        return new Iterator<Person>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < (crew.length + roster.length);
            }

            @Override
            public Person next() {
                Person person = (index < crew.length) ?
                        crew[index] : roster[index-crew.length];
                index++;
                return person;
            }
        };
    }

//    private class FlightIterator implements Iterator<Person> {
//        private int index = 0;
//
//        @Override
//        public boolean hasNext() {
//            return index < (crew.length + roster.length);
//        }
//
//        @Override
//        public Person next() {
//            Person person = (index < crew.length) ?
//                    crew[index] : roster[index-crew.length];
//            index++;
//            return person;
//        }
//    }

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

    @Override
    public int compareTo(Flight f) {
        return flightTime - f.flightTime;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "passengers=" + passengers +
                ", seats=" + seats +
                ", flightNumber=" + flightNumber +
                ", flightClass=" + flightClass +
                ", maxCarryOns=" + maxCarryOns +
                ", totalCarryOns=" + totalCarryOns +
                ", totalCheckedBags=" + totalCheckedBags +
                ", flightTime=" + flightTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            return true;
        }
        if (!(o instanceof Flight)){
            return false;
        }
        Flight other = (Flight) o;
        return flightClass == other.flightClass &&
                flightNumber == other.flightNumber;
    }

    public void print() {
        System.out.println("Flight[ seats = " + seats + ", passengers = " + passengers + "]");
    }

    public void addCrewMembers(CrewMember[] crew) {
        this.crew = crew;
    }

    public void addPassengers(Passenger[] roster) {
        this.roster = roster;
    }

    public void addPassengers(String fileName) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line = null;
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

    public void add1Passenger() {
        if (hasSeating()) {
            passengers++;
            allPassengers++;
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

    public void handleTooMany() {
        System.out.println("Has too many!");
    }

    private boolean hasCarryOnSpace(int carryOns) {
        return totalCarryOns + carryOns <= maxCarryOns;
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

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats <= MAX_FAA_SEATS) {
            this.seats = seats;
        } else {
            //handle error
        }

    }

    public int getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(int flightTime) {
        this.flightTime = flightTime;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    static int getAllPassengers() {
        return allPassengers;
    }

    static void resetAllPassengers() {
        allPassengers = 0;
    }

}
