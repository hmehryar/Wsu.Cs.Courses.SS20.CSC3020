package csc3020.lecture15.he7891;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CrewManager {
    private final static String FILENAME = "C:\\Users\\Nathan\\Desktop\\CSC3020SS20Lectures\\src\\com\\csc3020\\lecture15\\he7891\\CrewMemberPool.txt";
    private static CrewMember[] pool;
    static {
        try {
            FileReader oFileReader = new FileReader(FILENAME);
            BufferedReader oBufferReader = new BufferedReader(oFileReader);
            String line = null;
            int index = 0;
            pool = new CrewMember[10];
            while ((line = oBufferReader.readLine()) != null) {
                String[] parts = line.split(",");
                FlightCrewJob job = FlightCrewJob.valueOf(parts[0]);
                pool[index] = new CrewMember(job);
                pool[index].setName(parts[1]);
                ++index;
            }
        }
        catch (NullPointerException oException) {
            System.out.println("Error: Not implemented exception");
        }
        catch (IOException oException) {
            System.out.println("Error: Not implemented exception");
        }
        catch (Exception oException) {
            System.out.println("Error: Not implemented exception");
        }
    }

    public static CrewMember FindAvailable(FlightCrewJob job) {
        CrewMember oCrewMember = null;
        for (int index = 0; index < pool.length; index++) {
            if (pool[index] != null && pool[index].getJob() == job) {
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
