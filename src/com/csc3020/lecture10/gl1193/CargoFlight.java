package com.csc3020.lecture10.gl1193;

import com.csc3020.lecture09.gl1193.Flight;

public class CargoFlight extends Flight {
    float maxCargoSpace=1000.0f;
    float usedCargoSpace;
    //public int seats = 12;

    public CargoFlight(int flightNumber) {
        super(flightNumber);
    }

    public CargoFlight(int flightNumber, float maxCargoSpace) {
        this(flightNumber);
        this.maxCargoSpace = maxCargoSpace;
    }

    public CargoFlight() {

    }

//    public CargoFlight() {
////        super();
//    }
   public CargoFlight(float maxCargoSpace) {
        this.maxCargoSpace = maxCargoSpace;
    }

    @Override
    public int getSeats(){
        return 12;
    }

    public void add1Package(float h, float w, float d){
        double size=h*w*d;
        if(hasCargoSpace(size)){
            usedCargoSpace+=size;
        }
        else
            handleNoSpace();
        }

    private boolean hasCargoSpace(double size) {
        return usedCargoSpace + size <= maxCargoSpace;
    }

    private void handleNoSpace(){
        System.out.println("Not enough space");
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Max Cargo Space = " + maxCargoSpace + ", Used Cargo Space = " + usedCargoSpace);

    }


}
