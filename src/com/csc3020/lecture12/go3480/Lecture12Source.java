package csc3020.lecture12.go3480;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lecture12Source {
    public static void main(String[] args) {
        Flight oFlight = new Flight();
        System.out.println(oFlight.MAX_FAA_SEATS);

        Flight oFlight2 = new Flight();
        System.out.println(oFlight2.MAX_FAA_SEATS);

        Passenger oPassenger = new Passenger(3);
        System.out.println(oPassenger.getFreeBags());

        Passenger oPassenger1 = new Passenger();
        System.out.println(oPassenger1.getFreeBags());

        CrewMember judy = new CrewMember(FlightCrewJob.CoPilot);
        System.out.println(judy.toString());

        judy.setJob(FlightCrewJob.Pilot);
        System.out.println(judy.toString());

        int i = 12;
        int j = 2;
        try {
            System.out.println(i/(j-2));
        } catch(Exception e) {
            System.out.println("Error: "+e.getMessage());
            //e.printStackTrace();
        }

        BufferedReader reader = null;
        int total = 0;
        try{
            reader = new BufferedReader(new FileReader("C:\\Numbers.tct"));
            String line = null;
            while((line = reader.readLine()) != null)
                total += Integer.parseInt(line);
            System.out.println("Total: "+total);
        } catch(NumberFormatException oNumberFormatException) {
            System.out.println("Error: Invalid value: "+oNumberFormatException.getMessage());
        } catch(FileNotFoundException oFileNotFoundException) {
            System.out.println("Error: Invalid value: "+oFileNotFoundException.getMessage());
        } catch(IOException oIOException) {
            System.out.println("Error: Invalid value: " + oIOException.getMessage());
        } catch(Exception oException) {
            System.out.println("Error: "+oException.getMessage());
        }

        finally {
            try {
                if (reader != null)
                    reader.close();
            } catch(Exception oReaderException) {
                System.out.println("Error: "+oReaderException.getMessage());
            }
        }
    }
}
