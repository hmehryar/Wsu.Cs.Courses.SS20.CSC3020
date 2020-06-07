package lecture10.ee7708;

public class FullLicensePilot extends Pilot{
    @Override
    public boolean canAccept(Flight flight) {
        return true;
    }
}
