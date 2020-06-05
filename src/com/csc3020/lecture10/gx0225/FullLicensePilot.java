package com.csc3020.lecture10.gx0225;

public class FullLicensePilot extends Pilot{
    @Override
    protected boolean canAccept(Flight flight) {
        return true;
    }
}
