package csc3020.lecture10.gg6997;

import csc3020.lecture10.gg6997.Pilot;

public class FullLicensePilot extends Pilot{
    @Override
    public boolean canAccept(csc3020.lecture10.gg6997.Flight flight) {
        return true;
    }
}

