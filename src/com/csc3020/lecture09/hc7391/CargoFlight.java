package com.csc3020.lecture09.hc7391;
// extends allows inheritance
public class CargoFlight extends Flight {
   public float maximumCargoSpace = 1000.0f;
   public float usedCargoSpace;
   //public int seats = 12; don't override variable


    @Override //overide the method
    public int getSeats() {
        return 12;
    }
// override method inside a class need not @override
    public void add1Package(float h, float w, float d)//float must be smaller than total size (double)
    {
    double size = h*w*d;
    if(hasCargoSpace(size))
    {
        usedCargoSpace+=size;
    }else
    {
        handleNoSpace();
    }
    }//add1Packaged

    private void handleNoSpace() {
        System.out.println("Not Enough space");
    }

    private boolean hasCargoSpace(double size) {
        return usedCargoSpace+size <=maximumCargoSpace;
    }

    public void print()
    {
        super.print();
        System.out.println("Max Cargo Space: " + maximumCargoSpace + " Used Cargo Space: " + usedCargoSpace);
    }
}
