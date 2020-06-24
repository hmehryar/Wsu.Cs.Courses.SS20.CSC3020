package csc3020.lecture15.gr4381;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CrewManager {
    BufferedReader reader = null;
    private final static String FILENAME = "D:\\CrewMemberPool.txt";
    private static CrewMember[] pool;

    static {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(FILENAME));
            String line = null;
            int i = 0;
            pool = new CrewMember[10];
            while ((line = reader.readLine()) != null){
                String[] parts = line.split(",");
                FlightCrewJob job = FlightCrewJob.valueOf(parts[0]);
                pool[i] = new CrewMember(job);
                pool[i].setName(parts[1]);
                i++;
            }
        } catch (IOException oException) {
            System.out.println("Error: Not Implemented IOException");
        } catch (NullPointerException oException){
            System.out.println("Error: Not Implemented NullPointerException");
        } catch (Exception oException){
            System.out.println("Error: Not Implemented Exception");
        }

    }

    public static CrewMember FindAvailable(FlightCrewJob job){
        CrewMember oCrewMember = null;
        for (int i = 0; i < pool.length; i++) {
            if (pool[i] != null && pool[i].getJob() == job){
                oCrewMember = pool[i];
                pool[i] = null;
                break;
            }
        }
        return oCrewMember;
    }

    public static CrewMember[] List(){
        return pool;
    }



    public static void PrintPool(){
        for (int i = 0; i < pool.length; i++) {
            if (pool[i] != null) {
                System.out.println("Name=" + pool[i].getName() + ", job=" + pool[i].getJob());
            }
        }
    }
}
