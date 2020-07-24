package csc3020.lecture14.gn8271;
// *
// Author: Raisa Zaman
// Student ID: gn8271
// Lecture14
// *
public class CrewMember extends Person {
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
                "name="+this.getName()+
                "job=" + job +
                '}';
    }
}
