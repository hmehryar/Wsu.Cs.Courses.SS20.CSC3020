package com.csc3020.lecture05.go1277;

public class Lecture05Source
{
        class Flight
        {
            int passengers;
            int seats;
            Flight()
            {
                seats = 150;
                passengers = 0;
            }
            void addPassengers()
            {
                if(passengers < seats)
                    passengers += 1;
            }
        }

}
