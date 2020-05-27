package com.csc3020.lecture06.hc7391;

public class Flight {
private int passengers;
private int seats;

public Flight()
{
    seats = 150;
    passengers = 0;
}
public int getSeats() {return seats;}
public void setSeats(int _seats) {this.seats = _seats;}
public int getPassengers(){return passengers;}
public void setPassengers(int _passengers){ passengers = _passengers;}

void add1Passenger()
{
if(passengers < seats)
    passengers += 1;
else
    handleToMany();

}

private void handleToMany()
{
    System.out.println("To many passengers");
}

public boolean hasRoom(Flight f2)
{
    int total = passengers + f2.passengers;
    return total <= seats;
}

public Flight createFlightWithBoth(Flight flight2)
{
    Flight newFlight = new Flight();
    newFlight.seats =seats;
    newFlight.passengers = this.passengers+flight2.passengers;
    return newFlight;
}

public void print()
{
    String str = "Flight[ seats= "+this.seats+",passengers: "+this.passengers+"]";
    System.out.println(str);
}

}//end class
