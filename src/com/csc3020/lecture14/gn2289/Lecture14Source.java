package csc3020.lecture14.gn2289;



import java.lang.reflect.Array;
import java.util.Arrays;

public class Lecture14Source {
    public static void main(String[] args) {
        Passenger bob = new Passenger();
        bob.setMemberLevelAndDays(1,180);

        Passenger jane = new Passenger();
        jane.setMemberLevelAndDays(1, 90);

        Passenger steve = new Passenger();
        steve.setMemberLevelAndDays(2, 180);

        Passenger lisa = new Passenger();
        lisa.setMemberLevelAndDays(3,730);

        Passenger[] passengers = {bob, jane, steve, lisa};

        Arrays.sort(passengers);

        for (Passenger passenger:passengers) {
            System.out.println(passenger.toString());
        }

        Flight d123 = new Flight();
        d123.setFlightTime(15);

        Flight dl132 = new Flight();
        dl132.setFlightTime(30);

        Flight nyc030 = new Flight();
        nyc030.setFlightTime(45);

        Flight[] flights = {d123, dl132, nyc030};

        Arrays.sort(flights);

        for (Flight flight : flights) {
            System.out.println(flight.toString());
        }

        CrewMember pilot = new CrewMember(FlightCrewJob.Pilot);
        pilot.setName("Patty");
        CrewMember copilot = new CrewMember(FlightCrewJob.Copilot);
        pilot.setName("Karl");
        CrewMember marshall = new CrewMember(FlightCrewJob.AirMarshal);
        pilot.setName("Marshall");

        CrewMember[] crew = {pilot, copilot, marshall};
        dl132.AddCrewMembers(crew);
        passengers[0].setName("bob");
        passengers[1].setName("jane");
        passengers[2].setName("steve");
        passengers[3].setName("lisa");
        dl132.addRoster(passengers);

//        for (Person person:dl132) {
//            System.out.println(person.getName());
//        }






    }
}
