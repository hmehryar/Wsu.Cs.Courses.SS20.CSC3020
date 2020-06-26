package csc3020.lecture15.gz0715;
import static csc3020.lecture15.gz0715.Flight.resetAllPassengers;
import static csc3020.lecture15.gz0715.Flight.getAllPassengers;

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

        System.out.println("\nExtract Pilot:");
        CrewMember pilot = CrewManager.FindAvailable(FlightCrewJob.Pilot);
        System.out.println(pilot);

        System.out.println("\nList:");
        CrewMember[] pool = CrewManager.list();
        for (CrewMember crewMember: pool) {
            System.out.println(crewMember);
        }

        System.out.println("\nExtract Flight Attendant:");
        CrewMember flightAttendant = CrewManager.FindAvailable(FlightCrewJob.FlightAttendant);
        System.out.println(flightAttendant);

        System.out.println("\nList:");
        for (CrewMember crewMember: CrewManager.list()) {
            System.out.println(crewMember);
        }

        System.out.println("\nExtract CoPilot:");
        CrewMember coPilot = CrewManager.FindAvailable(FlightCrewJob.CoPilot);
        System.out.println(coPilot);

        System.out.println("Extract Air Marshal:");
        CrewMember airMarshal = CrewManager.FindAvailable(FlightCrewJob.AirMarshal);
        System.out.println(airMarshal);

        System.out.println("\nList:");
        for (CrewMember crewMember: CrewManager.list()) {
            System.out.println(crewMember);
        }

        // Nested Types case
        Passenger steve = new Passenger();
        steve.setName("Steve");
        steve.getRewardProgram().setMemberLevelAndDays(3, 180);

        Passenger.RewardProgram platinum = new Passenger.RewardProgram();
        platinum.setMemberLevel(3);

        if (steve.getRewardProgram().getMemberLevel() == platinum.getMemberLevel()) {
            System.out.println("Steve is platinum member");
        } else {
            System.out.println("Steve is a regular member");
        }
    }
}
