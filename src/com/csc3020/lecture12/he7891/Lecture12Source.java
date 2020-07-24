package csc3020.lecture12.he7891;
/*
 * Author: Nathan Tattrie
 * Student ID: he7891
 * Lecture 12: Role of Exceptions
 * */


/* Final Fields
 * ~ Making a field as final prevents it from being changed once assigned
 * ~~ A simple final field must be set during creation of an object instance
 * ~~~ Can be3 set with field initializer, initialization block, or constructor
 * ~~ Adding a static modifier makes a final field a named constant
 * ~~~ Cannot be set by an object instance
 * */

/* Enumeration Types
* ~ Enumeration types useful for defining a type with a finite list of valid values
* ~~ Declare with enum keyword
* ~~ Provide a comma-separated value list*/

/* SUMMARY
* ~ String class stores an immutable sequence of Unicode characters
* ~~ Implement toString methods to provide conversion to a string
* ~ StringBuilder class provides an efficient way to manipulate string values
* ~ Primitive wrapper classes bring class capabilities to primitive values
* ~~ Wrapper classes much less efficient than primitive types
* ~ Final fields prevent a value from being changed once assigned
* ~~ Simple final fields must be stu during object instance creation
* ~~ Static fields...
* */

/* Error Handling with Exceptions
* ~ Error handling needs to be implicit in application development
* ~~ The traditional approach of checking error codes/flags is too intrusive
* ~~~ Exceptions provide a non-intrusive way to signal errors
* ~~~~ try/catch/finally provides a structured way to handle exceptions
* ~~~~ The try block contains the "normal" code to execute
* ~~~~~ Block executes to completion unless an exception is thrown
* ~~~~ The catch block contains the error handling code
* ~~~~~ Block executes only if matching exception is thrown
* ~~~~ The finally block contains cleanup code if needed
* ~~~~~ Runs in all cases following try or catch block
* */

/* Typed Exceptions
* ~ Exceptions can be handled by type
* ~~ Each exception type can have a separate catch block
* ~~ Each catch is tested in order from top to bottom
* ~~ First assignable catch is selected
* ~~ Start catch blocks with most specific exception types
* */

/* Exceptions and Methods
* ~ Exceptions propagate up the callstack (Can cross method boundaries)
* ~~ Exceptions are part of a method's contract
* ~~ Method is responsible for any checked exceptions that might occur
* ~~~ Catch the exception
* ~~~ Document that the exception might occur
* ~~~~ Use the throws clause
* */

/* Exceptions and Methods Overriding
* ~ The throws clause of an overriding method must be compatible with the throws clause of the overridden method
* ~~ Can exclude exceptions
* ~~ Can have the same exception
* ~~ Can have a derived exception
* */

/* Creating a Custom Exception Type
* ~ You can create your own custom exception types (in most cases better to use existing exception type)
* ~~ Normally inherit directly from Exception class (makes them checked exceptions)
* ~~~ Constructors are often their only members (Most required functionally is inherited
* ~~~~ Constructor that accepts required detail
* ~~~~ Constructor that accepts required detail and originating exception*/

/* Summary
* ~ Exceptions provide a non-intrusive way to signal errors
* ~ try/catch/finally provide a structured way to handle exceptions
* ~ Exceptions are caught by type
* ~~ Can have separate catch statement for differing exception types
* ~~ Catch from most specific type to least specific type
* ~ Raise exceptions using throw
* ~ Methods must declare any unhandled checks exceptions using throws
* ~ Can create custom exception types
* ~~ Normally inherit from Exception
* */


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lecture12Source {
    public static void main(String[] args) {

        Flight oFlight1 = new Flight();
        System.out.println(oFlight1.MAX_FAA_SEATS);

        Flight oFlight2 = new Flight();
        System.out.println(oFlight2.MAX_FAA_SEATS);

        Flight oFlight3 = new Flight();
        //oFlight3.MAX_FAA_SEATS = 660;

        Passenger oPassenger = new Passenger(3);
        System.out.println(oPassenger.getFreeBags());

        Passenger oPassenger1 = new Passenger();
        System.out.println(oPassenger1.getFreeBags());

        CrewMember judy = new CrewMember(FlightCrewJob.CoPilot);

        System.out.println(judy.toString());

        judy.setJob(FlightCrewJob.Pilot);

        System.out.println(judy.toString());

        int i = 12;
        int j = 4;
        try {
            System.out.println(i/(j-2));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }

        BufferedReader reader = null;
        int total = 0;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\Nathan\\Desktop\\CSC3020SS20Lectures\\src\\com\\csc3020\\lecture12\\he7891\\Numbers.txt"));
            String line = null;
            while((line = reader.readLine()) != null) {
                //total += Integer.parseInt(line);
                total += Integer.valueOf(line);
            }
            System.out.println("Total: " + total);
        } catch (Exception oException) {
            System.out.println("Error: " + oException.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            }
            catch (NumberFormatException oNumberFormatException) {
                System.out.println("Error: Invalid value: " + oNumberFormatException.getMessage());
            }
            catch (FileNotFoundException oFileNotFoundException) {
                System.out.println("Error: Invalid path: " + oFileNotFoundException.getMessage());
            }
            catch (IOException oIOException) {
                System.out.println("Error: Invalid path: " + oIOException.getMessage());
            }
            catch (Exception oReaderException) {
                System.out.println("Error: " + oReaderException.getMessage());
            }
        }

    }
}
