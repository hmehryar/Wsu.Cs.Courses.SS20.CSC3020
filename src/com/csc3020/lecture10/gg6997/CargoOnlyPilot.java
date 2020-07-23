package csc3020.lecture10.gg6997;

import csc3020.lecture10.gg6997.Pilot;
import csc3020.lecture10.gg6997.Flight;

public class CargoOnlyPilot extends Pilot {
    @Override
    public boolean canAccept(Flight flight) {
        return flight.getPassengers()==0;
    }
}
