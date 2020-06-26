package csc3020.lecture15.hc7391;

import static csc3020.lecture15.hc7391.Flight.getAllPassengers;
import static csc3020.lecture15.hc7391.Flight.resetAllPassengers;

public class Lecture15Source {

    public static void main(String[] args) {
        // write your code here
        //int allPassengers = 0;
        System.out.println(resetAllPassengers()); // see importation
        //System.out.println(allPassengers);

        Flight lax045 = new Flight();
        lax045.add1Passenger();
        //allPassengers++;
        lax045.add1Passenger();
        // allPassengers++;

        Flight slc015 = new Flight();
        slc015.add1Passenger();
        //allPassengers++;

        System.out.println(getAllPassengers()); // do not need to use Flight.getAllPassengers
        //System.out.println(allPassengers);

        //initialization block
        CrewMember pilot = CrewManager.FindAvailable(FlightCrewJob.Pilot);
        System.out.println("Extracting Pilot");
        System.out.println(pilot);

        System.out.println("Printing the pool");
        CrewMember[] pool = CrewManager.List();
        for (CrewMember oCrewMember : pool) {
            System.out.println(oCrewMember);
        }
        System.out.println();
        System.out.println();
        System.out.println("With Flight Attendant Selected");
        CrewMember flightAttendant = CrewManager.FindAvailable(FlightCrewJob.FlightAttendant);
        System.out.println(flightAttendant);

        System.out.println("Pool with Flight Attendant Extracted");
        for (CrewMember oCrewMember : pool) {
            System.out.println(oCrewMember);
        }

        System.out.println("CoPilot");
        CrewMember oCrewMember = CrewManager.FindAvailable(FlightCrewJob.CoPilot);
        System.out.println(oCrewMember);

        System.out.println("Air Marshal");
        oCrewMember = CrewManager.FindAvailable(FlightCrewJob.AirMarshal);
        System.out.println(oCrewMember);

        for (CrewMember oCrewMemberItem : CrewManager.List()) {
            System.out.println(oCrewMemberItem);
        }
        System.out.println();
        //Nested Types Code
        Passenger steve = new Passenger();
        steve.setName("Set Name");
        steve.getRewardProgram().setMemberLevelAndDays(3, 180);

        Passenger.RewardProgram platinum = new Passenger.RewardProgram();
        platinum.setMemberLevel(3);

        if(steve.getRewardProgram().getMemberLevel()==platinum.getMemberLevel()){
            System.out.println("Steve is platinum");
        }else{
            System.out.println("Steve is a regular member");
        }


    }
}//end Lecture15 source
