package csc3020.lecture12.gg6997;

import csc3020.lecture12.gg6997.Flight;
import csc3020.lecture12.gg6997.Passenger;
import csc3020.lecture12.gg6997.FlightCrewJob;;

public class CrewMember {
    private FlightCrewJob job;

    public CrewMember(FlightCrewJob job) {
        this.job = job;
    }

    public void setJob(FlightCrewJob job) {
        this.job = job;
    }

    public FlightCrewJob getJob() {
        return job;
    }

    @Override
    public String toString() {
        return "CrewMember{" +
                "job=" + job +
                '}';
    }
}


