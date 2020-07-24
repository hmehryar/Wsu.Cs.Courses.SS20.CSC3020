package com.csc3020.lecture15.go5261;

import static com.csc3020.lecture15.go5261.Flight.getAllPassengers;
import static com.csc3020.lecture15.go5261.Flight.resetAllPassengers;

public class Lecture15Source {
    public static void main(String[] args) {
        resetAllPassengers();
        System.out.println(getAllPassengers());

        Flight lax045 = new Flight();
        lax045.add1Passenger();
        lax045.add1Passenger();

        Flight slc015 = new Flight();
        slc015.add1Passenger();

        System.out.println(getAllPassengers());

        System.out.println("Extracting Pilot");
        CrewMember pilot = CrewManager.FindAvailable(FlightCrewJob.Pilot);
        System.out.println(pilot);

        System.out.println("Extracting Copilot");
        CrewMember copilot = CrewManager.FindAvailable(FlightCrewJob.Copilot);
        System.out.println(copilot);

        System.out.println("Extracting Air Marshal");
        CrewMember airMarshal = CrewManager.FindAvailable(FlightCrewJob.AirMarshal);
        System.out.println(airMarshal);

        System.out.println("List of Crew Members");
        CrewMember[] pool = CrewManager.List();
        for (CrewMember oCrewMember:pool) {
            System.out.println(oCrewMember);
        }

        System.out.println("Extracting Flight Attendant");
        CrewMember flightAttendant = CrewManager.FindAvailable(FlightCrewJob.FlightAttendant);
        System.out.println(flightAttendant);

        Passenger steve = new Passenger();
        steve.setName("Steve");
        steve.getRewardProgram().setMemberLevel(3);
        steve.getRewardProgram().setMemberDays(180);

        Passenger.RewardProgram platinum = new Passenger.RewardProgram();
        platinum.setMemberLevel(3);

        if (steve.getRewardProgram().getMemberLevel() == platinum.getMemberLevel()) {
            System.out.println("Steve is platinum");
        }

    }
}
