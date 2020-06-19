package csc3020.lecture13.gr4381.travel;

import java.io.IOException;

public class CargoFlight extends Flight {
    private float maxCargoSpace = 1000.0f;
    private float usedCargoSpace;
//    public int seats = 12;


    public CargoFlight(){
//        super();
    }
    public CargoFlight(int flightNumber){
        super(flightNumber);
    }
    public CargoFlight(int flightNumber, float maxCargoSpace){
        this(flightNumber);
        this.maxCargoSpace = maxCargoSpace;
    }

    public CargoFlight(float maxCargoSpace){
        this.maxCargoSpace = maxCargoSpace;
    }

    @Override
    public int getSeats(){
        return 12;
    }

    @Override
    public void addPassengers(String filename) throws IOException, NullPointerException {
        super.addPassengers(filename);
        throw new NullPointerException("It is pointing to nowhere!");
    }

    final public void add1Package(float height, float width, float depth){
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
