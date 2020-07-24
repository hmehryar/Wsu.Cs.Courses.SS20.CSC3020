package csc3020.lecture14.he7891;
/*
 * Author: Nathan Tattrie
 * Student ID: he7891
 * Lecture 14: Creating Abstract Relationships with Interfaces
*/


/* What is an Interface?
* ~ An interface determines a contract (provides no implementation)
* ~~ Classes implement interfaces (Expresses that the class conforms to the contract)
* ~~~ Interfaces don't limit other aspects of the class' implementation
* ~~~ Some interfaces require additional type information (uses a concept known as generics)
* ~~~ Classes are free to implement multiple interfaces
* */

/* Implementing an Interface
* ~ java.lang.Comparable (used for determining relative order
* ~~ One method: compareTo (receives item to compare to)
* ~~~ Return indicates current instance relative sequence
* ~~~~ Negative value: before
* ~~~~ Positive value: after
* ~~~~ Zero value: equal
* */

/**/

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
        lisa.setMemberLevelAndDays(3,730);

        Passenger[] passengers = {bob, jane, steve, lisa};

        System.out.println("Passengers Before sorting");
        for (Passenger passenger:passengers) {
            System.out.println(passenger.toString());
        }

        Arrays.sort(passengers);

        System.out.println("Passengers After sorting");
        for (Passenger passenger:passengers) {
            System.out.println(passenger.toString());
        }


        Flight lax045 = new Flight();
        lax045.setFlightTime(45);

        Flight slc015 = new Flight();
        slc015.setFlightTime(15);

        Flight nyc030 = new Flight();
        nyc030.setFlightTime(30);

        Flight[] flights = { lax045, slc015, nyc030 };

        System.out.println("Flights Before sorting");
        for (Flight flight:flights) {
            System.out.println(flight.toString());
        }

        Arrays.sort(flights);

        System.out.println("Flights After sorting");
        for (Flight flight:flights) {
            System.out.println(flight.toString());
        }

        CrewMember pilot = new CrewMember(FlightCrewJob.Pilot);
        pilot.setName("Patty");

        CrewMember coPilot = new CrewMember(FlightCrewJob.CoPilot);
        coPilot.setName("Karl");

        CrewMember marshal = new CrewMember(FlightCrewJob.AirMarshal);
        marshal.setName("Mary");

        CrewMember[] crew = {pilot, coPilot, marshal};
        lax045.addCrewMembers(crew);

        passengers[0].setName("bob");
        passengers[1].setName("jane");
        passengers[2].setName("steve");
        passengers[3].setName("lisa");
        lax045.addRoster(passengers);

        for (Person person : lax045) {
            System.out.println(person.getName());
        }


    }
}
