package com.csc3020.lecture06.eu6179;

public class Flight {
    // Lecture 05: Class//
        private int passengers;
        private int seats;

        public Flight() {
            seats = 150;
            passengers = 0;
        }

        public int getSeat() {
            return seats;
        }

        public void setSeats(int seats) {
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

        public boolean hasRoom(com.csc3020.lecture06.eu6179.Flight f2) {
            int total = passengers + f2.passengers;
            return total <= seats;
        }

        public com.csc3020.lecture06.eu6179.Flight createFlightWithBoth(com.csc3020.lecture06.eu6179.Flight flight2) {
            com.csc3020.lecture06.eu6179.Flight newFlight = new com.csc3020.lecture06.eu6179.Flight();
            newFlight.seats = seats;
            newFlight.passengers = this.passengers + flight2.passengers;
            return newFlight;

        }

        public void print() {
            String str = "Flight[ seats= " + this.seats + ",passengers= " + this.passengers + "]";
            System.out.println(str);
        }
    }