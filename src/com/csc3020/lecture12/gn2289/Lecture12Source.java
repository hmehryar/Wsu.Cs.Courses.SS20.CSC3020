package com.csc3020.lecture12.gn2289;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.spec.ECField;

public class Lecture12Source {
    public static void main(String[] args)  {
        Flight oFlight = new Flight();
        System.out.println(oFlight.MAX_FAA_SEATS);

        Flight oFlight2 = new Flight();
        System.out.println(oFlight2.MAX_FAA_SEATS);

         Passenger oPassenger = new Passenger(3);
        System.out.println(oPassenger.getFreeBags());

        Passenger oPassenger1 = new Passenger();
        System.out.println(oPassenger1.getFreeBags());

        CrewMember judy = new CrewMember(FlightCrewJob.Copilot);

        System.out.println(judy.toString());

        judy.setJob(FlightCrewJob.Pilot);
        System.out.println(judy.toString());

//        int i = 12;
//        int j = 2;
//        try {
//            System.out.println(i/(j-2));
//        }catch (Exception e) {
//            System.out.println("error: "+e.getMessage());
//            e.printStackTrace();
//        }

        BufferedReader reader = null;
        int total = 0;
        try {
            reader = new BufferedReader(new FileReader("C:\\numbers.txt"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                total += Integer.valueOf(line);
                System.out.println("Total: "+total);
            }
        }catch (NumberFormatException oFormatException) {
            System.out.println("Error: "+oFormatException.getMessage());
        }catch (FileNotFoundException oFileNotFound) {
            System.out.println("Error: "+oFileNotFound.getMessage());
        }catch (IOException oIO) {
            System.out.println("Error: "+oIO.getMessage());
        }catch (Exception OException) {
            System.out.println("Error: "+OException.getMessage());
        }

        finally {
            try {
                if(reader != null){
                    reader.close();
                }

            }catch (Exception oReaderException) {
                System.out.println("Error: "+oReaderException.getMessage());
            }

        }






    }
}
