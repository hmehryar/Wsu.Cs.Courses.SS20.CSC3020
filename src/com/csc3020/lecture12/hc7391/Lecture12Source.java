package com.csc3020.lecture12.hc7391;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lecture12Source {

    public static void main(String[] args) {
	// write your code here
        Flight oFlight = new Flight();
        System.out.println(oFlight.MAX_FAA_SEATS);

        Flight oFlight2 = new Flight();
        //oFlight2.MAX_FAA_SEATS = 660;
        System.out.println(oFlight2.MAX_FAA_SEATS);

        Passenger oPassenger = new Passenger(3);
        System.out.println(oPassenger.getFreeBags());

        Passenger oPassenger1 = new Passenger();
        System.out.println(oPassenger1.getFreeBags());

        //enum examples
        CrewMember judy = new CrewMember(FlightCrewJob.CoPilot);
        System.out.println((judy.toString()));
        judy.setJob(FlightCrewJob.Pilot);
        System.out.println(judy.toString());

        //exception handling
        int i =12;
        int j = 2;


        try {
            System.out.println(i/(j-2));
        }catch(Exception e)
        {
            System.out.println("Error: "+ e.getMessage());
            e.printStackTrace();
        }
//exception from file
        BufferedReader reader = null;
        int total = 0;
        try{
            reader = new BufferedReader(new FileReader("C:\\Numbers.txt"));
            String line = null;
            while((line = reader.readLine())!=null)
            {
                total+=Integer.valueOf(line);
            }
            System.out.println("Total: "+total);
        }catch(NumberFormatException oNumberFormatException)
        {
            System.out.println("Error: Invalid value: "+ oNumberFormatException.getMessage());
        }catch(FileNotFoundException oFileNotFoundException)
        {
            System.out.println("Error: "+oFileNotFoundException.getMessage());
        }catch(IOException oIOException)
        {
            System.out.println("Error: I/O Error" +oIOException.getMessage());
        }
        catch(Exception oException)
        {
        System.out.println("Error: " + oException.getMessage());
        }
        try{
                if(reader!=null)
                    reader.close();
            }catch(Exception oReaderException){
                System.out.println("Error: "+oReaderException.getMessage());
            }



        }//end public

    }//end main


