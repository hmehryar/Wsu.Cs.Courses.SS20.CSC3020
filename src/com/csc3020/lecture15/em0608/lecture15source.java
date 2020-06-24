package csc3020.lecture15.em0608;

import static csc3020.lecture15.em0608.Flight.getAllPassengers;
import static csc3020.lecture15.em0608.Flight.resetAllPassengers;

public class lecture15source {
    public static void main(String[] args) {

        int allPassengers = 0;

        System.out.println(resetAllPassengers());

        // System.out.println(allPassengers);

        Flight lax045 = new Flight();
        lax045.add1Passenger();
        //   allPassengers++;
        lax045.add1Passenger();
        //    allPassengers++;

        Flight slc015 = new Flight();
        slc015.add1Passenger();
        //  allPassengers++;

        System.out.println(getAllPassengers());
        //  System.out.println(allPassengers);


        System.out.println("Extracting Pilot");
        CrewMember pilot = CrewManager.FindAvailable(FlightCrewJob.Pilot);
        System.out.println(pilot);

        CrewMember[] pool = CrewManager.List();
        for(CrewMember oCrewMember: pool){
            System.out.println(oCrewMember);
        }

        System.out.println("Extracting Flight Attendant");
        CrewMember flightAttendant = CrewManager.FindAvailable(FlightCrewJob.FlightAttendant);
        System.out.println(flightAttendant);

        for(CrewMember oCrewMember : CrewManager.List()) {
            System.out.println(oCrewMember);
        }

        System.out.println("Extracting Flight Co Pilot");
        CrewMember oCrewMember = CrewManager.FindAvailable(FlightCrewJob.CoPilot);
        System.out.println(oCrewMember);

        System.out.println("Extracting Air Marshall");
        oCrewMember = CrewManager.FindAvailable(FlightCrewJob.AirMarshal);
        System.out.println(oCrewMember);

        System.out.println("List of Crew Members");
        for (CrewMember oCrewMemberItem : CrewManager.List()){
            System.out.println(oCrewMemberItem);
        }

        //Nested Types Code
        Passenger Steve = new Passenger();
        Steve.setName("Steve");
        Steve.getRewardProgram().setMemberLevelAndDays(3,180);

        Passenger.RewardProgram platnium = new Passenger.RewardProgram();
        platnium.setMemberLevel(3);

        if(Steve.getRewardProgram().getMemberLevel() == platnium.getMemberLevel()){
            System.out.println("Steve is platinum member");
        }else{
            System.out.println("Steve is a regular member.");
        }


    }
}
