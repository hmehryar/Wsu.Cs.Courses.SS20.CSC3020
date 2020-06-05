package com.csc3020.lecture10.he7891;
// *
// Author: Nathan Tattrie
// Student ID: he7891
// Lecture10: Class Inheritance
// *

public class CargoFlight extends Flight {

    public float maxCargoSpace = 1000.0f;
    public float usedCargoSpace;
//    public int seats = 12;


    public CargoFlight(int flightNumber) {
        super(flightNumber);
    }

    public CargoFlight(int flightNumber, float maxCargoSpace) {
        this(flightNumber);
        this.maxCargoSpace = maxCargoSpace;
    }

    public CargoFlight(float maxCargoSpace) {
        this.maxCargoSpace = maxCargoSpace;
    }

    public CargoFlight() {
        //super();
    }

    @Override
    public int getSeat() {
        return 12;
    }

    final public void add1Package(float h, float w, float d) {
        double size = h * w * d;
        if (hasCargoSpace(size)) {
            usedCargoSpace += size;
        }
        else {
            handleNoSpace();
        }
    }

    private boolean hasCargoSpace(double size) {
        return usedCargoSpace + size <= maxCargoSpace;
    }

    private void handleNoSpace() {
        System.out.println("Not Enough Space.");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Max Cargo Space = " + maxCargoSpace + ", Used Cargo Space = " + usedCargoSpace);
    }
}
