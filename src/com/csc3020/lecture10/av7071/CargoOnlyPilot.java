package lecture10.av7071;

public class CargoOnlyPilot extends com.csc3020.lecture10.av7071.Pilot {
    @Override
    public boolean canAccept(Flight flight) {
        return flight.getPassengers() == 0;
    }
}
