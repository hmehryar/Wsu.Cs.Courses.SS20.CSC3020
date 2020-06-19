package csc3020.lecture14.gx0225;


import java.lang.reflect.Array;
import java.util.Arrays;


public class Lecture14Source {
    public static void main(String[] args) {
        Passenger bob=new Passenger();
        bob.setMemberLevelAndDays(1,180);

        Passenger jane=new Passenger();
        jane.setMemberLevelAndDays(1,90);

        Passenger lisa=new Passenger();
        lisa.setMemberLevelAndDays(3,730);

        Passenger steve=new Passenger();
        steve.setMemberLevelAndDays(2,180);

        Passenger[] passengers= {bob,jane,steve,lisa};
        System.out.println("Before Sorting");
        for(Passenger passenger:passengers){
            System.out.println(passenger.toString());
        }


        Arrays.sort(passengers);
        System.out.println("After Sorting");
        for(Passenger passenger:passengers){
            System.out.println(passenger.toString());
        }


        Flight lax045=new Flight();
        lax045.setFlightTime(45);

        Flight slc015=new Flight();
        slc015.setFlightTime(15);

        Flight nyc030=new Flight();
        nyc030.setFlightTime(30);

        Flight[] flights={lax045,slc015,nyc030};

        System.out.println("Flight: Before Sorting");
        for(Flight flight:flights){
            System.out.println(flight.toString());
        }


        Arrays.sort(flights);

        System.out.println("Flights: After sorting:");

        for (Flight flight:flights) {

            System.out.println(flight.toString());

        }



        CrewMember pilot = new CrewMember(FlightCrewJob.Pilot);

        pilot.setName("Patty");

        CrewMember copilot = new CrewMember(FlightCrewJob.CoPilot);

        copilot.setName("Karl");

        CrewMember marshall = new CrewMember(FlightCrewJob.AirMarshall);

        marshall.setName("Marshall");



        CrewMember[] crew = {pilot, copilot, marshall};

        lax045.AddCrewMembers(crew);

        passengers[0].setName("bob");

        passengers[1].setName("jane");

        passengers[2].setName("steve");

        passengers[3].setName("lisa");

        lax045.addRoster(passengers);



        for (Person person:lax045){

            System.out.println(person.getName());

        }
    }
}
