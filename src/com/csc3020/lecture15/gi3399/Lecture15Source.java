package com.csc3020.lecture15.gi3399;

import javax.swing.*;
import java.util.Arrays;

import static com.csc3020.lecture15.gi3399.Flight.resetAllPassengers;
import static com.csc3020.lecture15.gi3399.Flight.getAllPassengers;

public class Lecture15Source {
    public static void main(String[] args) {

//        int allPassengers = 0;

        System.out.println(resetAllPassengers());

//        System.out.println(allPassengers);

        Flight lax045 = new Flight();
        lax045.add1Passengers();
//        allPassengers++;
        lax045.add1Passengers();
//        allPassengers++;

        Flight slc105 = new Flight();
        slc105.add1Passengers();
//        allPassengers++;
        System.out.println(getAllPassengers());
//        System.out.println(allPassengers);

        //Static Initialization Block
        System.out.println("Extracting Pilot");
        CrewMember pilot = CrewManager.FindAvailable(FlightCrewJob.Pilot);
        System.out.println(pilot);

        CrewMember[] pool = CrewManager.List();
        for (CrewMember oCrewMember : pool) {
            System.out.println(oCrewMember);
        }

        System.out.println("Extracting Flight Attendent");
        CrewMember flightAttendent = CrewManager.FindAvailable(FlightCrewJob.FlightAttendent);
        System.out.println(flightAttendent);

        for (CrewMember oCrewMember : CrewManager.List()) {
            System.out.println(oCrewMember);
        }

        System.out.println("Extracting CoPilot");
        CrewMember oCrewMember = CrewManager.FindAvailable(FlightCrewJob.CoPilot);
        System.out.println(oCrewMember);

        System.out.println("Extracting Air Marshal");
        oCrewMember = CrewManager.FindAvailable(FlightCrewJob.AirMarshal);
        System.out.println(oCrewMember);

        System.out.println("List of Crew Members");
        for (CrewMember oCrewMemberItem : CrewManager.List()) {
            System.out.println(oCrewMemberItem);
        }

        //Nested Types Code
        Passenger steve = new Passenger();
        steve.setName("Steve");
        steve.getRewardProgram().setMemberLevelAndDays(3, 180);

        Passenger.RewardProgram platinum = new Passenger.RewardProgram();
        platinum.setMemberLevel(3);

        if (steve.getRewardProgram().getMemberLevel() == platinum.getMemberLevel()) {
            System.out.println("Steve is platinum");
        } else
            System.out.println("Steve is a regular member");
    }
}
