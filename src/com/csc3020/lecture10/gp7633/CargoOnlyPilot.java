package csc3020.lecture10.gp7633;

public class CargoOnlyPilot extends Pilot {
    @Override
    public boolean canAccept(Flight flight) {
        return flight.getPassengers() == 0;
    }
}
