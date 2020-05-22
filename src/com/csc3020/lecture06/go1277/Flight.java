package com.csc3020.lecture06.go1277;

public class Flight
{
    private int passengers;
    private int seats;
    public Flight()
    {
        seats = 150;
        passengers = 0;
    }

    private void handleTooMany()
    {
        System.out.println("Too Many");
    }
    public int getSeats()
    {
        return seats;
    }
    public void setSeats(int seats)
    {
        this.seats = seats;
    }
    public void add1Passenger()
    {
        if(passengers < seats)
            passengers += 1;
        else
            handleTooMany();
    }

    public boolean hasRoom(Flight f2)
    {
        int total = this.passengers + f2.passengers;
        return total <= seats;
    }
    public Flight createNewWithBoth(Flight f2)
    {
        Flight newFlight= new Flight();
        newFlight.seats= seats;
        newFlight.passengers= passengers + f2.passengers;
        return newFlight;
    }
    public void print(){
        String str="Flight[ seats= "+this.seats+",passengers= "+this.passengers+"]";
        System.out.println(str);
    }
    
}


