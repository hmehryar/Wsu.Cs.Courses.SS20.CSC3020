package com.csc3020.lecture09.gr4381;

public class CargoFlight extends Flight{
    private float maxCargoSpace = 1000.0f;
    private float usedCargoSpace;
//    public int seats = 12;

    @Override
    public int getSeats(){
        return 12;
    }

    public void add1Package(float height, float width, float depth){
        double size = height * width * depth;
        if (hasCargoSpace(size)){
            usedCargoSpace += size;
        } else {
            handleNoSpace();
        }
    }

    private boolean hasCargoSpace(double size){
        return usedCargoSpace + size <= maxCargoSpace;
    }

    private void handleNoSpace(){
        System.out.println("Not enough space!");
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Max Cargo Space= " + maxCargoSpace + ", Used Cargo Space= " + usedCargoSpace);
    }

}
