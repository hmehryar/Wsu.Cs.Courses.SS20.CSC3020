package com.csc3020.lecture10.em0608;

public class CargoFlight extends Flight {
    public float usedCargoSpace;
    public float maxCargoSpace = 1000.0f;
    // public int seats = 12;


    public CargoFlight(int flightNumber){
        super(flightNumber);
    }

    public CargoFlight(){
        super();
    }

    public CargoFlight(int flightNumber, float maxCargoSpace){
        this(flightNumber);
        this.maxCargoSpace = maxCargoSpace;
    }

    public CargoFlight(float maxCargoSpace){
        this.maxCargoSpace = maxCargoSpace;
    }

    @Override
    public int getSeat() {
        return 12;
    }

   final public void add1Package(float h, float w, float d){
        double size = h * w *d;

        if(hasCargoSpace(size)) {
            usedCargoSpace += size;
        }else{
            handleNoSpace();
        }


    }

    private void handleNoSpace() {
        System.out.println("Not enough space!");
    }

    private boolean hasCargoSpace(double size) {

        return usedCargoSpace+size <=maxCargoSpace;
    }

    //override
    public void print(){
        super.print();
        System.out.println("Max Cargo: " +maxCargoSpace+ "Used Cargo:" + usedCargoSpace);

    }

}

