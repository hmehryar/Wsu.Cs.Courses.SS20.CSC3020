package csc3020.lecture14.gg6997;

import lecture12.gg6997.FlightCrewJob;

public class CrewMember extends csc3020.lecture14.gg6997.Person{
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
                "name=" + this.getName() +
                "job=" + job +
                '}';
    }
}