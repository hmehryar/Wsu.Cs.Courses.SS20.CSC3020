package csc3020.lecture06.gr4381;
// Lecture 05: Class//
public class Flight {
    private int passengers;
    private int seats;

    public Flight() {
        seats = 150;
        passengers = 0;
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
