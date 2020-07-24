package csc3020.lecture10.hc7391;

public class CargoOnlyPilot extends Pilot{
    @Override // must override method from abstract class
    public boolean canAccept(Flight flight) {
       return flight.getPassengers() ==0;
        //cargo flight is passengers are zero
    }
}
