package com.csc3020.lecture09.gn2289;

public class CargoFlight extends Flight {
    public float usedCargoSpace;
    public float maxCargoSpace = 1000.0f;
   // public int seats = 12;

    @Override
    public int getSeats() {
        return 12;
    }

    public void add1Package(float h, float w, float d){
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
