package csc3020.lecture10.hm;

public class CargoOnlyPilot extends Pilot{
    @Override
    public boolean canAccept(Flight flight) {
        return flight.getPassengers()==0;
    }
}
