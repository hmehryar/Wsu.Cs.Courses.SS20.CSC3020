package csc3020.lecture15.gz0715;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CrewManager {
    private final static String FILENAME = "E:\\CSC3020Files\\CrewMemberPool.txt";
    private static CrewMember[] pool;

    static {
        BufferedReader oBufferedReader = null;
        try {
            FileReader oFileReader = new FileReader(FILENAME);
            oBufferedReader = new BufferedReader(oFileReader);

            String line = null;
            int index = 0;
            pool = new CrewMember[10];

            while ((line = oBufferedReader.readLine()) != null) {
                String[] parts = line.split(",");
                FlightCrewJob job = FlightCrewJob.valueOf(parts[0]);
                pool[index] = new CrewMember(job);
                pool[index].setName(parts[1]);
                index++;
            }
        } catch (NullPointerException e) {
            System.out.println("ERROR: Not Implemented Exception");
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Not Implemented Exception");
        }catch (IOException e) {
            System.out.println("ERROR: Not Implemented Exception");
        } catch (Exception e) {
            System.out.println("ERROR: Not Implemented Exception");
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

    public  static CrewMember[] list() {
        return pool;
    }
}
