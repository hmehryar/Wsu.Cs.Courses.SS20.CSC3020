package com.csc3020.lecture05.eu6179;

public class Flight {
    //Lecture 05
    private int passengers;
    private int seats;

    public Flight() {

        seats = 150;
        passengers = 0;
    }

    public void add1Passenger() {
        if (passengers < seats) {
            passengers += 1;
            //passengers++
        } else {
            handleTooMany();

        }
    }
        private void handleTooMany () {
            System.out.println("That's Too Many");
        }
        public boolean hasRoom(Flight f2){

        int total = passengers + f2.passengers;
        return total <= seats;

        }
    }



