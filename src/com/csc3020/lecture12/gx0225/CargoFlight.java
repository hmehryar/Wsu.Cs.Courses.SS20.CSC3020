package com.csc3020.lecture12.gx0225;


import java.io.IOException;

public class CargoFlight extends Flight {
    public float usedCargoSpace;
    public float maxCargoSpace=1000.0f;
    //public int seat =12;

    public CargoFlight(int flightNumber){
        super(flightNumber);
    }
    public CargoFlight(int flghtNumber, float maxCargoSpace){
        this(flghtNumber);
        this.maxCargoSpace=maxCargoSpace;
    }
    public CargoFlight(float maxCargoSpace){
        this.maxCargoSpace=maxCargoSpace;
    }
    public CargoFlight(){
        //super();
    }

    @Override
    public int getSeats() {
        return 12;
    }


    //Test for Exceptions' compatibility
    @Override
    public void addPassengers(String fileName) throws IOException {
        super.addPassengers(fileName);
        throw new NullPointerException("It is pointing to no where");
    }

    final public void add1Package(float h, float w, float d){
        double size = h*w*d;
        if (hasCargoSpace(size)){
            usedCargoSpace+=size;
        }
        else {
            handleNoSpace();
        }
    }

    private void handleNoSpace() {
        System.out.println("No space");
    }

    private boolean hasCargoSpace(double size){
        //boolean result = usedCargoSpace+size<=maxCargoSpace;
        return usedCargoSpace+size<=maxCargoSpace;
    }
    public void print(){
        System.out.println(("Max Cargo Space= "+ maxCargoSpace+"Used Cargo Space= " +usedCargoSpace));
    }

}
