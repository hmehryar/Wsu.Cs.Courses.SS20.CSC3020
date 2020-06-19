package com.csc3020.lecture14.he7891;

import java.util.Iterator;

public class FlightIterator implements Iterator<Person> {
    private CrewMember[] crew;
    private Passenger[] roster;
    private int index = 0;

    public FlightIterator(CrewMember[] crew, Passenger[] roster) {
        this.crew = crew;
        this.roster = roster;
    }

    @Override
    public boolean hasNext() {
        return index < (crew.length + roster.length);
    }

    @Override
    public Person next() {
        Person p = (index < crew.length) ? crew[index] : roster[index - crew.length];
        index++;
        return p;
    }
}
