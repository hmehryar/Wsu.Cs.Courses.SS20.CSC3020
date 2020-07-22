package csc3020.lecture14.gg6997;

import csc3020.lecture14.gg6997.FlightCrewJob;
import java.util.Arrays;
import java.util.Iterator;

public class Lecture14Source {
    public static void main(String[] args) {
        csc3020.lecture14.gg6997.Passenger bob = new csc3020.lecture14.gg6997.Passenger();
        bob.setMemberLevelAndDays(1, 180);

        csc3020.lecture14.gg6997.Passenger jane = new csc3020.lecture14.gg6997.Passenger();
        jane.setMemberLevelAndDays(1, 90);

        csc3020.lecture14.gg6997.Passenger steve = new csc3020.lecture14.gg6997.Passenger();
        steve.setMemberLevelAndDays(2, 180);

        csc3020.lecture14.gg6997.Passenger lisa = new csc3020.lecture14.gg6997.Passenger();
        lisa.setMemberLevelAndDays(3, 730);

        csc3020.lecture14.gg6997.Passenger[] passengers = {bob, jane, steve, lisa};

        System.out.println("Passenger: Before sorting");
        for (csc3020.lecture14.gg6997.Passenger passenger : passengers) {
            System.out.println(passenger.toString());
        }

        Arrays.sort(passengers);

        System.out.println("Passenger: After sorting");
        for (csc3020.lecture14.gg6997.Passenger passenger : passengers) {
            System.out.println(passenger.toString());
        }

        csc3020.lecture14.gg6997.Flight lax045 = new csc3020.lecture14.gg6997.Flight();
        lax045.setFlightTime(45);

        csc3020.lecture14.gg6997.Flight slc015 = new csc3020.lecture14.gg6997.Flight();
        slc015.setFlightTime(15);

        csc3020.lecture14.gg6997.Flight nyc030 = new csc3020.lecture14.gg6997.Flight();
        nyc030.setFlightTime(30);

        csc3020.lecture14.gg6997.Flight[] flights = {lax045, slc015, nyc030};

        System.out.println("Flight: Before sorting");
        for (csc3020.lecture14.gg6997.Flight flight : flights) {
            System.out.println(flight.toString());
        }

        Arrays.sort(flights);

        System.out.println("Flight: After sorting");
        for (csc3020.lecture14.gg6997.Flight flight : flights) {
            System.out.println(flight.toString());
        }
/*
        csc3020.lecture14.gg6997.CrewMember pilot = new csc3020.lecture14.gg6997.CrewMember(FlightCrewJob.Pilot);
        pilot.setName("Patty");
        csc3020.lecture14.gg6997.CrewMember coPilot = new csc3020.lecture14.gg6997.CrewMember(FlightCrewJob.Copilot);
        coPilot.setName("Karl");
        csc3020.lecture14.gg6997.CrewMember marshal = new csc3020.lecture14.gg6997.CrewMember(FlightCrewJob.AirMarshal);
        marshal.setName("Mary");
*/
        bob.setName("Bob");
        jane.setName("Jane");
        steve.setName("Steve");
        lisa.setName("Lisa");

     //   csc3020.lecture14.gg6997.CrewMember[] crew = {pilot, coPilot, marshal};
   //     lax045.addCrewMembers(crew);
   //     lax045.addPassengers(passengers);

     //   for(csc3020.lecture14.gg6997.Person p:lax045) {
       //     System.out.println(p.getName());
       // }

//        Iterable<csc3020.lecture14.gg6997.Person> laxIterable = lax045;
//        Iterator<csc3020.lecture14.gg6997.Person> persons = laxIterable.iterator();
//        while(persons.hasNext()) {
//            csc3020.lecture14.gg6997.Person p = persons.next();
//            System.out.println(p.getName());
//        }
    }
}
