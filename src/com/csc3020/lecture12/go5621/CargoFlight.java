package com.csc3020.lecture12.go5621;

import java.io.File;
import java.io.IOException;

public class CargoFlight extends Flight {
    public float maxCargoSpace = 1000.0f;
    public float usedCargoSpace;
    public int seats = 12;

    public CargoFlight() {
        //super();
    }

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

    //Test for Exception compatibility
    @Override
    public void addPassengers(String fileName) throws IOException, NullPointerException{
        super.addPassengers(fileName);
        throw new NullPointerException();
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

    private void handleNoSpace() {
        System.out.println("Not enough space");
    }

    private boolean hasCargoSpace(double size) {
        return usedCargoSpace + size <= maxCargoSpace;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Max Cargo Space = " + maxCargoSpace + ", Used cargo space = " + usedCargoSpace);
    }

    @Override
    public int getSeats() {
        return seats;
    }
}
