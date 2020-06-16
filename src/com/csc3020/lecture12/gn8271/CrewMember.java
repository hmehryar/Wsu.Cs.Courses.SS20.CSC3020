package lecture12.gn8271;
//Lecture 12
// Author: Raisa Zaman
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

