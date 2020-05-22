package com.cs3020.lecture05.av7071;
/**Lecture 05: Class**/
public class Flight {
    public int passengers;
    public int seats;

    public Flight() {
        seats = 150;
        passengers = 0;
    }

    public void add1Passenger(){
        if(passengers < seats) {
            passengers += 1;
            //passengers++;
        }else{
            handleTooMany();
        }
    }
    private void handleTooMany(){
        System.out.println("Too Many");
    }
    public boolean hasRoom(Flight f2){
        int total = passengers + f2.passengers;
        if (total <= seats)
            return true;
        else
            return false;
    }
}
