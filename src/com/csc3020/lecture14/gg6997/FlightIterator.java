package csc3020.lecture14.gg6997;

import java.util.Iterator;

public class FlightIterator implements Iterator<csc3020.lecture14.gg6997.Person> {
    private csc3020.lecture14.gg6997.CrewMember[] crew;
    private csc3020.lecture14.gg6997.Passenger[] roster;
    private int index;

    public FlightIterator(csc3020.lecture14.gg6997.CrewMember[] crew, csc3020.lecture14.gg6997.Passenger[] roster) {
        this.crew = crew;
        this.roster = roster;
    }

    @Override
    public boolean hasNext() {
        return index < (crew.length + roster.length);
    }

    @Override
    public csc3020.lecture14.gg6997.Person next() {
        csc3020.lecture14.gg6997.Person person = (index >= crew.length) ? roster[index - crew.length] : crew[index];
        index++;
        return person;
    }
}
