package com.csc3020.lecture09.eu6179;

public class CargoFlight extends Flight{
    public float maxCargoSpace = 1000.0f;
    public float usedCargoSpace;
    // public int seats= 12;


    @Override
    public int getSeat() {
        return 12;
    }

    public void add1Package(float h, float w, float d){
        double size = h*w*d;
        if(hasCargoSpace(size)){
            usedCargoSpace+=size;
        }else{
            handelNoSpace();
        }
    }

    private void handelNoSpace() {
        System.out.println("Not Enough Space");
    }

    private boolean hasCargoSpace(double size) {
       return  usedCargoSpace +size <= maxCargoSpace;
    }

    @Override
    public void print() {
        super.print();
        //System.out.println("")+maxCargoSpace;
    }
}
