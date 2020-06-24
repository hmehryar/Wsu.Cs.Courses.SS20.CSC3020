package csc3020.lecture14.gp7633;

import java.util.Iterator;

public class FlightIterator implements Iterator<Person> {
    private CrewMember[] crew;
    private  Passenger[] roster;
    private int index=0;

    public FlightIterator(CrewMember[] crew, Passenger[] roster){
        this.crew=crew;
        this.roster=roster;
    }

    @Override
    public boolean hasNext() {
        return index<(crew.length+roster.length);
    }

    @Override
    public Person next() {
        Person person=(index<crew.length)?crew[index]:roster[index-crew.length];
        index++;
        return person;
    }
}
