package com.csc3020.lecture12.em0608;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lecture12Source {
    public static void main(String[] args) throws IOException {

        Flight oFlight = new Flight();
        System.out.println(oFlight.MAX_FFA_SEATS);

        Flight oFlight2 = new Flight();
        System.out.println(oFlight2.MAX_FFA_SEATS);

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
            System.out.println(i / (j - 2));
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
            //    e.printStackTrace();
        }

        BufferedReader reader = null;
        int total = 0;
        try {
            reader = new BufferedReader(new FileReader("/Users/kellymaisel/Desktop/Numbers.txt"));
            String line = null;
            while((line = reader.readLine())!=null)
                total+=Integer.valueOf(line);
            System.out.println("Total: "+ total);
        }
        catch(NumberFormatException oNumberFormatException){
            System.out.println("Error: invalid value " + oNumberFormatException.getMessage());
        }

        catch (FileNotFoundException oFileNotFoundException){
            System.out.println("Not found " + oFileNotFoundException.getMessage());
        }

        catch(IOException oIOException){
            System.out.println("Error: Input/Output Error" + oIOException.getMessage());
        }

        catch (Exception oException) {
            System.out.println("error:" + oException.getMessage());
        }

        finally{
            try{
                reader.close();
           }catch (Exception oReaderException){
              System.out.println("Error: " + oReaderException.getMessage());
            }


        }
    }
}
