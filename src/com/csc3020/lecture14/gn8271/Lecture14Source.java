package csc3020.lecture14.gn8271;
// *
// Author: Raisa Zaman
// Student ID: gn8271
// Lecture14
// *
import java.util.Arrays;

public class Lecture14Source {
    public static void main(String[] args) {
        Passenger bob = new Passenger();
        bob.setMemberLevelAndDays(1, 180);

        Passenger jane = new Passenger();
        jane.setMemberLevelAndDays(1, 90);

        Passenger steve = new Passenger();
        steve.setMemberLevelAndDays(2, 180);

        Passenger lisa = new Passenger();
        lisa.setMemberLevelAndDays(3, 730);

        Passenger[] passengers = {bob, jane, steve, lisa};
        System.out.println("Passenger: Before Sorting");
        for (Passenger passenger : passengers) {
            System.out.println(passenger.toString());
        }

        Arrays.sort(passengers);

        System.out.println("Passenger: After Sorting");
        for (Passenger passenger : passengers) {
            System.out.println(passenger.toString());
        }

        Flight lax045 = new Flight();
        lax045.setFlightTime(45);

        Flight slc015 = new Flight();
        slc015.setFlightTime(15);

        Flight nyc030 = new Flight();
        nyc030.setFlightTime(30);

        Flight[] flights={lax045,slc015,nyc030};

        System.out.println("Flights: Before Sorting");
        for (Flight flight : flights) {
            System.out.println(flight.toString());
        }

        Arrays.sort(flights);

        System.out.println("Flights: After Sorting");
        for (Flight flight : flights) {
            System.out.println(flight.toString());
        }
        CrewMember pilot=new CrewMember(FlightCrewJob.Pilot);
        pilot.setName("Patty");

        CrewMember coPilot=new CrewMember(FlightCrewJob.CoPilot);
        coPilot.setName("Karl");

        CrewMember marshal=new CrewMember(FlightCrewJob.AirMarshal);
        marshal.setName("Mary");

        CrewMember[] crew={pilot,coPilot,marshal};
        lax045.addCrewMembers(crew);


        passengers[0].setName("bob");
        passengers[1].setName("jane");
        passengers[2].setName("steve");
        passengers[3].setName("lisa");
        lax045.addRoster(passengers);

        for (Person person:lax045) {
            System.out.println(person.getName());
        }


    }
}
