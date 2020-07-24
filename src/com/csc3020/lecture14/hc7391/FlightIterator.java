package csc3020.lecture14.hc7391;

import java.util.Iterator;

public class FlightIterator implements Iterator<Person> {

    private CrewMember[] crew;
    private Passenger[] roster;
    private int index = 0;

    public FlightIterator(CrewMember[] crew, Passenger[] roster){
        this.crew = crew;
        this.roster = roster;
    }

    @Override
    public boolean hasNext() {
        return index<(crew.length +roster.length);
    }
// increases index
    @Override
    public Person next() {
        Person person = (index<crew.length)?crew[index]:roster[index-crew.length];
        index++;
        return person;
    }
}
