package lecture14.gg6997;

import lecture12.gg6997.FlightCrewJob;

import java.util.Arrays;
import java.util.Iterator;

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

        System.out.println("Passenger: Before sorting");
        for (Passenger passenger : passengers) {
            System.out.println(passenger.toString());
        }

        Arrays.sort(passengers);

        System.out.println("Passenger: After sorting");
        for (Passenger passenger : passengers) {
            System.out.println(passenger.toString());
        }

        Flight lax045 = new Flight();
        lax045.setFlightTime(45);

        Flight slc015 = new Flight();
        slc015.setFlightTime(15);

        Flight nyc030 = new Flight();
        nyc030.setFlightTime(30);

        Flight[] flights = {lax045, slc015, nyc030};

        System.out.println("Flight: Before sorting");
        for (Flight flight : flights) {
            System.out.println(flight.toString());
        }

        Arrays.sort(flights);

        System.out.println("Flight: After sorting");
        for (Flight flight : flights) {
            System.out.println(flight.toString());
        }

        CrewMember pilot = new CrewMember(FlightCrewJob.Pilot);
        pilot.setName("Patty");
        CrewMember coPilot = new CrewMember(FlightCrewJob.Copilot);
        coPilot.setName("Karl");
        CrewMember marshal = new CrewMember(FlightCrewJob.AirMarshal);
        marshal.setName("Mary");

        bob.setName("Bob");
        jane.setName("Jane");
        steve.setName("Steve");
        lisa.setName("Lisa");

        CrewMember[] crew = {pilot, coPilot, marshal};
        lax045.addCrewMembers(crew);
        lax045.addPassengers(passengers);

        for(Person p:lax045) {
            System.out.println(p.getName());
        }

//        Iterable<Person> laxIterable = lax045;
//        Iterator<Person> persons = laxIterable.iterator();
//        while(persons.hasNext()) {
//            Person p = persons.next();
//            System.out.println(p.getName());
//        }
    }
}
