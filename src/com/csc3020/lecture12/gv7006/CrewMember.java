package com.csc3020.lecture12.gv7006;

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
