package com.csc3020.lecture15.go5334;

import static com.csc3020.lecture15.go5334.Flight.resetAllPassengers;
import static com.csc3020.lecture15.go5334.Flight.getAllPassengers;

public class Lecture15Source {
    public static void main(String[] args) {


        System.out.println( resetAllPassengers());

        Flight lax045=new Flight();
        lax045.add1Passenger();

        lax045.add1Passenger();

        Flight slc015=new Flight();
        slc015.add1Passenger();

        System.out.println(getAllPassengers());

        System.out.println("Extracting Pilot");
        CrewMember pilot=CrewManager.FindAvailable(FlightCrewJob.Pilot);
        System.out.println(pilot);

        CrewMember[] pool=CrewManager.List();
        for (CrewMember oCrewMember:pool) {
            System.out.println(oCrewMember);
        }

        System.out.println("Extracting Flight Attendant");
        CrewMember flightAttendant=CrewManager.FindAvailable(FlightCrewJob.FlightAttendant);
        System.out.println(flightAttendant);


        for (CrewMember oCrewMember : CrewManager.List()) {
            System.out.println(oCrewMember);
        }

        System.out.println("Extracting Flight Attendant");
        CrewMember oCrewMember=CrewManager.FindAvailable(FlightCrewJob.CoPilot);
        System.out.println(oCrewMember);

        System.out.println("Extracting Air Marshal");
        oCrewMember=CrewManager.FindAvailable(FlightCrewJob.AirMarshal);
        System.out.println(oCrewMember);

        System.out.println("List of Crew Members");
        for (CrewMember oCrewMemberItem : CrewManager.List()) {
            System.out.println(oCrewMemberItem);
        }

        Passenger steve=new Passenger();
        steve.setName("Steve");
        steve.getRewardProgram().setMemberLevelAndDays(3,180);

        Passenger.RewardProgram platinum=new Passenger.RewardProgram();
        platinum.setMemberLevel(3);

        if (steve.getRewardProgram().getMemberLevel()==platinum.getMemberLevel()){
            System.out.println("Steve is platinum member");
        }else{
            System.out.println("Steve is a regular member");
        }

    }
}
