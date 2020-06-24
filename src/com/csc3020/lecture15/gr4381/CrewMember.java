package csc3020.lecture15.gr4381;

public class CrewMember  extends Person {
    private FlightCrewJob job;

    public CrewMember(FlightCrewJob job){
        this.job = job;
    }

    public void setJob(FlightCrewJob job){
        this.job = job;
    }
    public FlightCrewJob getJob(){
        return job;
    }

    @Override
    public String toString() {
        return "CrewMember{" +
                "name=" + getName() +
                ", job=" + job +
                '}';
    }
}

