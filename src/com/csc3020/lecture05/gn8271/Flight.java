package csc3020.lecture05.gn8271;
// *
// Author: Raisa Zaman
// Student ID: gn8271
// Lecture05
// *
public class Flight{
    private int passengers;
    private int seats;

    public Flight() {
        seats = 150;
        passengers = 0;
    }

    public void add1Passenger() {
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
}
