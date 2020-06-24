package csc3020.lecture15.gr4381;

import static csc3020.lecture15.gr4381.Flight.resetAllPassengers;
import static csc3020.lecture15.gr4381.Flight.getAllPassengers;

public class Lecture15Source {
    public static void main(String[] args) {
//        int allPassengers = 0;

        resetAllPassengers();
//        System.out.println(allPassengers);
        System.out.println(getAllPassengers());

        Flight lax045 = new Flight();
        lax045.add1Passenger();
//        allPassengers++;
        lax045.add1Passenger();
//        allPassengers++;

        Flight slc015 = new Flight();
        slc015.add1Passenger();
//        allPassengers++;

//        System.out.println(allPassengers);
        System.out.println(getAllPassengers());

//        CrewManager.PrintPool();

        System.out.println("Extracting Pilot");
        CrewMember pilot = CrewManager.FindAvailable(FlightCrewJob.Pilot);
        System.out.println(pilot);

//        CrewManager.PrintPool();

        CrewMember[] pool = CrewManager.List();

        for (CrewMember oCrewMember:pool){
            System.out.println(oCrewMember);
        }

        System.out.println("Extracting Flight Attendant");
        CrewMember flightAttendant = CrewManager.FindAvailable((FlightCrewJob.FlightAttendant));
        System.out.println(flightAttendant);
        System.out.println();

        for (CrewMember oCrewMember:pool){
            System.out.println(oCrewMember);
        }
        System.out.println();

        System.out.println("Extracting CoPilot");
        CrewMember coPilot = CrewManager.FindAvailable((FlightCrewJob.CoPilot));
        System.out.println(coPilot);
        System.out.println();

        System.out.println("Extracting Air Marshall");
        CrewMember airMarshall = CrewManager.FindAvailable((FlightCrewJob.AirMarshall));
        System.out.println(airMarshall);
        System.out.println();

        System.out.println("List of Crew Members");
        for (CrewMember oCrewMemberItem:CrewManager.List()){
            System.out.println(oCrewMemberItem);
        }
        System.out.println();

        // Nested Types
        System.out.println("Nested Types examples:");
        Passenger steve = new Passenger();
        steve.setName("Steve");
        steve.getRewardProgram().setMemberLevelAndDays(3, 180);

        Passenger.RewardProgram platinum = new Passenger.RewardProgram();
        platinum.setMemberLevel(3);

        if (steve.getRewardProgram().getMemberLevel() == platinum.getMemberLevel()){
            System.out.println("Steve is a platinum member");
        } else {
            System.out.println("Steve is not a platinum member");
        }



    }
}
