package csc3020.lecture14.gn2289;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Flight implements Comparable<Flight>, Iterator<Person>{
    private int passengers;
    private int seats;
    private Integer flightNumber;
    private Character flightClass;
    private boolean[] isSeatAvailable;
    private int maxCarryOns, totalCarryOns;
    private int totalCheckedBags;
    static final int   MAX_FAA_SEATS= 550;

    private CrewMember[] crew;
    private Passenger[] roster;
    public void addRoster(Passenger[] roster){
        this.roster = roster;
    }


    public void AddCrewMembers(CrewMember[] crew) {
        this.crew = crew;
    }



    private int flightTime; //min past midnight


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

    public Flight() {
        seats = 150;
        passengers = 0;

        isSeatAvailable = new boolean[seats];
        for (int i = 0; i < seats ;i++){
            isSeatAvailable[i] = true;

        }
        totalCarryOns = 0;
        totalCheckedBags = 0;

    }

    public Flight(int flightNumber) {
        this();
        this.flightNumber = flightNumber;

    }


    @Override
    public boolean equals(Object o) {

        if(super.equals(o)) {
            return true;
        }
        if(!(o instanceof Flight)) {
            return false;
        }

        Flight otherFlight = (Flight) o;
        return flightClass == otherFlight.flightClass &&
                flightNumber == otherFlight.flightNumber;

    }


    public int getSeats() {
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

    //some overloading
    public void add1Passenger() throws IOException {
        if (hasSeating())
            passengers += 1;
        else
            handleTooMany();
    }
    public void add1Passenger(int bags) {
        if(hasSeating()) {
            //add1Passenger();
            totalCheckedBags += bags;
        }
    }
    public void add1Passenger(Passenger p) {
        add1Passenger(p.getCheckBags());
    }
    public void add1Passenger(int bags, int carryOns) {

        if(hasSeating() && hasCarryOnSpace(carryOns)) {
            add1Passenger(bags);
            totalCarryOns += carryOns;
        }
    }
    public void add1Passenger(Passenger p, int carryOns) {
        add1Passenger(p.getCheckBags(),carryOns);
    }

    //files
    public void addPassengers(String fileName) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line = null;

            while ((line = reader.readLine()) != null){
                String[] parts = line.split(" ");
                passengers += Integer.valueOf(parts[0]);
            }
        }finally {
            if(reader !=  null) {
                reader.close();
            }

        }
    }

    private boolean hasSeating() {
        return passengers < seats;
    }

    private boolean hasCarryOnSpace(int carryOns) {
        return totalCarryOns + carryOns < maxCarryOns;
    }

    private void handleTooMany() {
        System.out.println("Too many!");
    }

    public boolean hasRoom(Flight f2) {
        int total = passengers + f2.passengers;
        return total <= seats;
    }


    public void print() {
        String str = "Flight [ seats="+this.seats+", passengers="+this.passengers+"]";
        System.out.println(str);
    }

    public int getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(int flightTime) {
        this.flightTime = flightTime;
    }

    @Override
    public int compareTo(Flight o) {
        return flightTime-o.flightTime;
//        Flight flight = (Flight)o;
//        if(flightTime < flight.flightTime) {
//            return -1;
//        }else if(flightTime > flight.flightTime){
//            return 1;
//        }else {
//            return 0;
//        }
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Person next() {
        return null;
    }


//    @Override
//    public int compareTo(Flight o) {
//        return 0;
//    }
}
