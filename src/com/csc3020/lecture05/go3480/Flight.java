package csc3020.lecture05.go3480;

public class Flight {
    public int passengers;
    public int seats;

    public Flight() {
        seats = 150;
        passengers = 0;
    }

    public void add1Passenger() {
        if (passengers < seats) {
            passengers++;
        }
        else {
            handleTooMany();
        }
    }

    // Applying Access Modifiers
    private void handleTooMany() {
        System.out.println("Too many!!");
    }

    public boolean hasRoom(csc3020.lecture05.he7891.Flight f2) {
        int total = passengers + f2.passengers;
        if (total <= seats) {
            return true;
        }
        else {
            return false;
        }
    }
}
