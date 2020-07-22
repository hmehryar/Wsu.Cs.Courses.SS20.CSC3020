package csc3020.lecture05.gp7633;

public class Flight {
    int passengers;
    int seats;

    public Flight() {
        seats = 150;
        passengers = 0;
    }

    public void add1Passengers() {
        if (passengers < seats) {
            passengers++;
        }

    }
}
