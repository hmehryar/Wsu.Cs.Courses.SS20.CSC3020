package csc3020.lecture07.gr4381;
// Lecture 05: Class//
public class Flight {
    private int passengers;
    private int seats;
    private boolean[] isSeatAvailable;
    private int flightNumber;
    private char flightClass;
    {
        seats = 150;
        passengers = 0;
        isSeatAvailable = new boolean[seats];
        for (int index = 0; index < seats; index++) {
            isSeatAvailable[index] = true;
        }
    } // initialization block

    public Flight() {

    }

//    public Flight(int seats){
//        isSeatAvailable = new boolean[seats];
//        for (int index = 0; index < seats; index++) {
//            isSeatAvailable[index] = true;
//        }
//        //setSeats(seats);
//        this.seats = seats;
//        passengers = 0;
//    }

    public Flight(int flightNumber){
        this();
        this.flightNumber = flightNumber;
    }
    public Flight(char flightClass){
        this();
        this.flightClass = flightClass;
    }

    public int getSeats(){
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

    void add1Passenger() {
        if (passengers < seats)
            passengers += 1;
        else
            handleTooMany();
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
