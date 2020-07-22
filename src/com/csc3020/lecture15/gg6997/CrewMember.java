package csc3020.lecture15.gg6997;

public class CrewMember extends csc3020.lecture15.gg6997.Person {
    private csc3020.lecture15.gg6997.FlightCrewJob job;

    public CrewMember(csc3020.lecture15.gg6997.FlightCrewJob job) {
        this.job = job;
    }

    public void setJob(csc3020.lecture15.gg6997.FlightCrewJob job) {
        this.job = job;
    }

    public csc3020.lecture15.gg6997.FlightCrewJob getJob() {
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
