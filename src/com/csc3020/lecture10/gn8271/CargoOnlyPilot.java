package lecture10.gn8271;
//Lecture 10
// Author: Raisa Zaman
public class CargoOnlyPilot extends Pilot{
    @Override
    public boolean canAccept(Flight flight) {
        return flight.getPassengers()==0;
    }
}
