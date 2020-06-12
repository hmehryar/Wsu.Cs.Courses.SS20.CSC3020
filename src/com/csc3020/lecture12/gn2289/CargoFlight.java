package com.csc3020.lecture12.gn2289;

import java.io.IOException;

public class CargoFlight extends Flight {
    public float usedCargoSpace;
    public float maxCargoSpace = 1000.0f;
    public int seats = 12;
    public CargoFlight(){
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


    @Override
    public int getSeats() {
        return 12;
    }

    //test for exceptions compatibility
    @Override
    public void add1Passenger() throws IOException, NullPointerException {
        super.add1Passenger();
        throw new NullPointerException("It is a null pointing to no where");
    }

    final public void add1Package(float h, float w, float d){
        double size = h * w * d;
        if (hasCargoSpace(size)) {
            usedCargoSpace += size;
        }else{
            handleNpSpace();
        }
    }

    private void handleNpSpace() {
        System.out.println("Not enough space");
    }

    private boolean hasCargoSpace(double size) {
        boolean result = usedCargoSpace + size <= maxCargoSpace;
        return result;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("max cargo space= " +maxCargoSpace+" used cargo space = "+usedCargoSpace);
    }
}
