package csc3020.lecture15.gn2289;

import java.io.IOException;
import java.sql.SQLOutput;

import static csc3020.lecture15.gn2289.Flight.resetAllPassengers;
import static csc3020.lecture15.gn2289.Flight.getAllPassengers;

public class Lecture15Source {
    public static void main(String[] args) throws IOException {

        System.out.println(Flight.resetAllPassengers());

        Flight lax = new Flight();
        lax.add1Passenger();
        lax.add1Passenger();
        Flight slc = new Flight();
        slc.add1Passenger();

        System.out.println(Flight.getAllPassengers());
        System.out.println(Flight.resetAllPassengers());

        CrewMember pilot = CrewManager.FindAvailable(FlightCrewJob.Pilot);
        System.out.println(pilot);

        CrewMember[] pool = CrewManager.List();
        for (CrewMember oCrewMember:pool) {
            System.out.println(oCrewMember);
        }

        System.out.println("flight attendant:");
        CrewMember flightAttendant = CrewManager.FindAvailable(FlightCrewJob.FlightAttendant);
        System.out.println(flightAttendant);

        for (CrewMember oCrewMember : CrewManager.List()) {
            System.out.println(oCrewMember);
        }

        System.out.println("co pilots");
        CrewMember oCrewMember = CrewManager.FindAvailable(FlightCrewJob.Copilot);
        System.out.println(oCrewMember);

        System.out.println("list of crew members");
        for (CrewMember oCrewMemberItem : CrewManager.List()) {
            System.out.println(oCrewMemberItem);
        }

        //nested type code
        Passenger steve = new Passenger();
        steve.setName("steve");
        steve.getRewardProgram().setMemberLevelAndDays(3, 180);
        Passenger.RewardProgram platinum = new Passenger.RewardProgram();
        platinum.setMemberLevel(3);

        if(steve.getRewardProgram().getMemberLevel() == platinum.getMemberLevel()) {
            System.out.println("Steve is platinum");
        }else{
            System.out.println("steve isn't platinum");
        }


    }
}
