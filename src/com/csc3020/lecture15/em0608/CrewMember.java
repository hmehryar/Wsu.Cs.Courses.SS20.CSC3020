package csc3020.lecture15.em0608;

public class CrewMember extends com.csc3020.lecture15.Person {
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
                "name= " + this.getName() +
                " job= " + job +
                '}';
    }


}
