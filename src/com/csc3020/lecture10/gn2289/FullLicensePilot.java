package csc3020.lecture10.gn2289;

public class FullLicensePilot extends Pilot{
    @Override
    public boolean canAccept(Flight flight) {
        return false;
    }
}
