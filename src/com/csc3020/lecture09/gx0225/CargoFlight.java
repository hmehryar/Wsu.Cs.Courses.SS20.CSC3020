package com.csc3020.lecture09.gx0225;

public class CargoFlight extends Flight{
    public float usedCargoSpace;
    public float maxCargoSpace=1000.0f;
    //public int seat =12;

    @Override
    public int getSeats() {
        return 12;
    }

    public void add1Package(float h, float w, float d){
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
