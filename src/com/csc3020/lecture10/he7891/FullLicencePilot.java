package com.csc3020.lecture10.he7891;
// *
// Author: Nathan Tattrie
// Student ID: he7891
// Lecture10: Class Inheritance
// *

public class FullLicencePilot extends Pilot {
    @Override
    public boolean canAccept(Flight flight) {
        return true;
    }
}
