package csc3020.lecture05.gg6997;

public class Flight {
    int passengers;
    int seats;

    public Flight(){
        seats = 150;
        passengers = 0;
        flightSecurityName = "Manraj";
    }

    void add1Passengers() {
        if (passengers < seats)
            passengers += 1;
        else
            handleTooMany();
        csc3020.lecture05.gg6997.Flight.Internal oInternal = new csc3020.lecture05.gg6997.Flight.Internal();
    }

    private String flightSecurityName;

    class Internal{

    }
    private void handleTooMany(){
        System.out.println("Too many");
    }
}
