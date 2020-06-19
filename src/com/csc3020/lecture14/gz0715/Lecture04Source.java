package csc3020.lecture14.gz0715;

import java.util.Arrays;

public class Lecture04Source {
    public static void main(String[] args) {
        Passenger bob = new Passenger();
        bob.setMemberLevelAndDays(1, 180);

        Passenger jane = new Passenger();
        jane.setMemberLevelAndDays(1, 90);

        Passenger steve = new Passenger();
        steve.setMemberLevelAndDays(2, 100);

        Passenger lisa = new Passenger();
        lisa.setMemberLevelAndDays(3, 730);

        Passenger[] passengers = {bob, jane, steve, lisa};

        System.out.println("\nPassenger: Before sort:");
        for (Passenger passenger: passengers) {
            System.out.println(passenger.toString());
        }

        Arrays.sort(passengers);

        System.out.println("\nPassenger: After sort:");
        for (Passenger passenger: passengers) {
            System.out.println(passenger.toString());
        }

        Flight lax845 = new Flight();
        lax845.setFlightTime(45);

        Flight slc015 = new Flight();
        slc015.setFlightTime(15);

        Flight nyc030 = new Flight();
        nyc030.setFlightTime(30);

        Flight[] flights = {lax845, slc015, nyc030};

        System.out.println("\nFlights: Before sort:");
        for (Flight flight: flights) {
            System.out.println(flight.toString());
        }

        Arrays.sort(flights);

        System.out.println("\nFlights: After sort:");
        for (Flight flight: flights) {
            System.out.println(flight.toString());
        }

        CrewMember pilot = new CrewMember(FlightCrewJob.Pilot);
        pilot.setName("Patty");

        CrewMember coPilot = new CrewMember(FlightCrewJob.CoPilot);
        coPilot.setName("Karl");

        CrewMember marshal = new CrewMember(FlightCrewJob.AirMarshal);
        marshal.setName("Mary");

        CrewMember[] crew = {pilot, coPilot, marshal};

        passengers[0].setName("bob");
        passengers[1].setName("jane");
        passengers[2].setName("steve");
        passengers[3].setName("lisa");

        lax845.addCrewMembers(crew);
        lax845.addRoster(passengers);

        for (Person person : lax845) {
            System.out.println(person.getName());
        }
    }
}
