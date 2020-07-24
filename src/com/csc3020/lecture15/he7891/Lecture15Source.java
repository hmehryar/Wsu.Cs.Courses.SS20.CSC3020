package csc3020.lecture15.he7891;
/*
* Author: Nathan Tattrie
* Student ID: he7891
* Lecture 15: Static Members, Nested Types, and Anonymous Classes
* */

/* Static members are shared class-wide (not associated with an individual instance
* ~ Declared using the static keyword (accessible using the class name)
* ~~ Field
* ~~~ A value not associated with a specific instance
* ~~~ All instances access the same value
* ~~ Method
* ~~~ Performs an action not tied to a specific instance
* ~~~ Can access static fields only
* */

/* Static Members
* ~ Static initialization blocks
* ~ Static initialization blocks perform one-time type initialization (executed before type's first use)
* ~~ Statement enclosed in brackets outside any method or constructor
* ~~~ Cannot access instance members
* ~~~ Must handle all checked exceptions
* */

/* Nested Types
* ~ A nested type is a type declared within another type
* ~~ Classes can be declared within classes and interfaces
* ~~ Interfaces can be declared within classes and interfaces
* ~~~ Nested types are members of enclosing type (private members of the enclosing type are visible to the nested type)
* ~~~~ Nested types support all member access modifiers
* ~~~~~ public
* ~~~~~ package private
* ~~~~~ protected
* ~~~~~ private
* */


/* Anonymous Classes
* ~ Anonymous classes are declared as a part of their creation
* ~~ Useful for simple interface implementations or class extensions
* ~~ Anonymous classes are inner classes
* ~~~ Anonymous instance is associated with the containing class instance
* ~~~~ Create as if you are constructing an instance of the interface or base class
* ~~~~~ Place opening & closing brackets after the interface or base class
* ~~~~~ Place implementation code within the brackets
* */

import static csc3020.lecture15.he7891.Flight.resetAllPassengers;
import static csc3020.lecture15.he7891.Flight.getAllPassengers;

public class Lecture15Source {
    public static void main(String[] args) {

        //int allPassengers = 0;
        //Flight.allPassengers = 0;
        System.out.println(resetAllPassengers());
        //System.out.println(allPassengers);

        Flight lax045 = new Flight();
        lax045.add1Passenger();
        //allPassengers++;
        lax045.add1Passenger();
        //allPassengers++;
        System.out.println(getAllPassengers());

        Flight slc015 = new Flight();
        slc015.add1Passenger();
        //allPassengers++;
        System.out.println(getAllPassengers());


        // Static Initialization Block
        System.out.println("Extracting Pilot");
        CrewMember pilot = CrewManager.FindAvailable(FlightCrewJob.Pilot);
        System.out.println(pilot);

        CrewMember[] pool = CrewManager.List();
        for (CrewMember oCrewMember:pool) {
            System.out.println(oCrewMember);
        }

        System.out.println("Extracting Flight Attendant");
        CrewMember flightAttendant = CrewManager.FindAvailable(FlightCrewJob.FlightAttendant);
        System.out.println(flightAttendant);
        for (CrewMember oCrewMember:pool) {
            System.out.println(oCrewMember);
        }

        System.out.println("Extracting Air Marshal");
        CrewMember oCrewMember = CrewManager.FindAvailable(FlightCrewJob.AirMarshal);
        System.out.println(oCrewMember);
        for (CrewMember oCrewMemberItem:CrewManager.List()) {
            System.out.println(oCrewMemberItem);
        }

        // Nested Types Code
        Passenger steve = new Passenger();
        steve.setName("Steve");
        steve.getRewardProgram().setMemberLevelAndDays(3,180);

        Passenger.RewardProgram platinum = new Passenger.RewardProgram();
        platinum.setMemberLevel(3);

        if (steve.getRewardProgram().getMemberLevel() == platinum.getMemberLevel()) {
            System.out.println("Steve is platinum");
        } else {
            System.out.println("Steve is a regular member");
        }

    }
}
