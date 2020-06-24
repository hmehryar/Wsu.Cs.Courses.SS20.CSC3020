package csc3020.lecture15.hc7391;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CrewManager {
    private final static String FILENAME = "C:\\CrewMemberPool.txt";
    private static CrewMember[] pool;
    static {
        BufferedReader oBufferReader = null;
        try {
            FileReader oFileReader = new FileReader(FILENAME);
            oBufferReader = new BufferedReader(oFileReader);
            String line = null;
            int index = 0;
            pool = new CrewMember[10];
            while ((line = oBufferReader.readLine()) != null) {
            String[] parts = line.split(",");
            FlightCrewJob job = FlightCrewJob.Pilot.valueOf((parts[0]));
            pool[index] = new CrewMember(job);
            pool[index].setName(parts[1]);
            index++;
            }
        }
        catch(NullPointerException oException){
            System.out.println("Null");
        }
        catch(FileNotFoundException oException){
            System.out.println("File Not Found");
        }
        catch(IOException oException){
            System.out.println("IO ");
        }catch(Exception oException){
            System.out.println("general exception");
        }
    }
    public static CrewMember FindAvailable(FlightCrewJob job){
        CrewMember oCrewMember = null; // nothing to put in yet

        for (int index = 0; index < pool.length ; index++) {
            if(pool[index] != null && pool[index].getJob()==job){
                oCrewMember=pool[index];
                pool[index] = null;
                break;
            }
        }
        return oCrewMember;
    }
public static CrewMember[] List(){
        return pool;
}
}//end class
