package com.csc3020.lecture14.go5621;

import com.csc3020.lecture12.go5621.FlightCrewJob;

public class CrewMember extends Person{
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
