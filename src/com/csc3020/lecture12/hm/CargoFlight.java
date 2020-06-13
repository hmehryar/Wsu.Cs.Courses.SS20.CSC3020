package csc3020.lecture12.hm;

import java.io.IOException;

public class CargoFlight extends Flight {
    public float maxCargoSpace=1000.0f;
    public float usedCargoSpace;
    //public int seats=12;

    public CargoFlight(int flightNumber){
        super(flightNumber);
    }
    public CargoFlight(int flightNumber, float maxCargoSpace){
        this(flightNumber);
        this.maxCargoSpace=maxCargoSpace;
    }
    public CargoFlight(){
        //super();
    }
    public CargoFlight(float maxCargoSpace){
        this.maxCargoSpace=maxCargoSpace;
    }

    @Override
    public int getSeat() {
        return 12;
    }

    //Test for Exceptions' compatibility
    @Override
    public void addPassengers(String fileName) throws IOException,NullPointerException {
        super.addPassengers(fileName);
        throw new NullPointerException("It is pointing to no where!!!!");
    }

    final public void add1Package(float h, float w, float d){

        double size=h*w*d;
        if(hasCargoSpace(size)){
            usedCargoSpace+=size;
        }else{
            handleNoSpace();
        }
    }

    private void handleNoSpace() {
        System.out.println("Not enough space");
    }

    private boolean hasCargoSpace(double size) {
        return usedCargoSpace+size<=maxCargoSpace;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Max Cargo Space= "+maxCargoSpace+", Used Cargo Space= "+usedCargoSpace);
    }
}
