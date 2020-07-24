package csc3020.lecture12.gg6997;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import csc3020.lecture12.gg6997.Flight;
import csc3020.lecture12.gg6997.CrewMember;
import csc3020.lecture12.gg6997.Passenger;
import csc3020.lecture12.gg6997.FlightCrewJob;;

public class Flight {
    static final int MAX_FAA_SEATS = 550;
    private int passengers;
    public int seats;
    private boolean[] isSeatAvailable;
    private int flightNumber;
    private Character flightClass;
    private int maxCarryOns, totalCarryOns;
    private int totalCheckedBags;
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

    public Flight() {

    }

//    public Flight(int seats) {
//        //setSeats(seats);
//        this.seats = seats;
//        isSeatAvailable = new boolean[seats];
//        for (int i = 0; i < seats; i++) {
//            isSeatAvailable[i] = true;
//        }
//    }

    public Flight(int flightNumber) {
        this();
        this.flightNumber = flightNumber;
    }

    public Flight(char flightClass) {
        this();
        this.flightClass = flightClass;
    }

    @Override
    public String toString() {
//        return "Flight{" +
//                "flightNumber=" + flightNumber +
//                ", flightClass=" + flightClass +
//                '}';
        if (flightNumber > 0) {
            return "Flight #" + flightNumber;
        } else if (flightClass != null){
            return "Flight Class " + flightClass;
        }else {
            return "Flight identity is not set";
        }
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

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}
