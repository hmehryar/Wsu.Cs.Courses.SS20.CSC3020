package csc3020.lecture05.ev2601;

public class Flight {
    int passengers;
    int seats;
    String name;

    public Flight(String name) {
        seats = 150;
        passengers = 0;
        this.name = name;
    }

    public void addPassenger() {
        if (passengers < seats) passengers += 1;
        else handleTooMany();
    }

    private void handleTooMany() {
        System.out.println("Too many passengers");
    }

    public boolean hasRoom(Flight f2) {
        int total = passengers + f2.passengers;
        return total <= seats;
    }

    public Flight createNewWithBoth(Flight f2, String name) {
        Flight newFlight = new Flight(name);
        newFlight.seats = this.seats;
        newFlight.passengers = this.passengers + f2.passengers;
        return newFlight;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void printStats() {
        System.out.println(
                "\nFLIGHT STATS: " + this.name
                + "\n\tTotal Passengers: " + this.passengers
                + "\n\tRemaining Seats: " + (this.seats - this.passengers)
        );
    }
}
