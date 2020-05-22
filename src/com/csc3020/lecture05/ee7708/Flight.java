package com.csc3020.lecture05.ee7708;

public class Flight {

    int passengers;
    int seats;

    Flight()
    {
        seats = 150;
        passengers = 0;
    }

    public void add1Passenger() {
        if (passengers < seats)
            passengers += 1;
    }
}
