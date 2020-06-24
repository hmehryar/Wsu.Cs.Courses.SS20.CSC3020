package csc3020.lecture15.em0608;

import java.util.Iterator;

public class FlightIterator implements Iterator<com.csc3020.lecture15.Person> {

    private com.csc3020.lecture15.CrewMember[] crew;
    private com.csc3020.lecture15.Passenger[] roster;
    private int index = 0;

    public FlightIterator(com.csc3020.lecture15.CrewMember[] crew, com.csc3020.lecture15.Passenger[] roster){
        this.crew = crew;
        this.roster = roster;
    }

    @Override
    public boolean hasNext() {
        return index<(crew.length + roster.length);
    }

    @Override
    public com.csc3020.lecture15.Person next() {
        com.csc3020.lecture15.Person person = (index<crew.length)?crew[index]:roster[index - crew.length];
        index++;
        return person;
    }
}
