package csc3020.lecture15.gn2289;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class CrewManager {
    private final static String FILENAME = "E\\CrewMemberPool.txt";
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
                FlightCrewJob job = FlightCrewJob.valueOf(parts[0]);
                pool[index] = new CrewMember(job);
                pool[index].setName(parts[1]);
                index++;
        }




        }catch (NullPointerException oException) {
            System.out.println("Error: NUll pointer exception");
        } catch (FileNotFoundException oException) {
            System.out.println("Error: Not Implemented Exception");
        } catch (IOException oException) {
            System.out.println("Error, IO exception");

        } catch (Exception oException) {
            System.out.println("error");
        }
    }
    public static CrewMember FindAvailable(FlightCrewJob job) {
        CrewMember oCrewMember = null;
        for (int index = 0; index < pool.length; index++) {
            if(pool[index] != null && pool[index].getJob() == job) {
                oCrewMember = pool[index];
                pool[index] = null;
                break;
            }
        }
        return oCrewMember;
    }

    public static CrewMember[] List() {
        return pool;
    }
}
