package com.csc3020.lecture09.gv7006;

class CargoFlight extends Flight {
    private float usedCargoSpace, maxCargoSpace = 1000;
    
    // Override for show
    @Override
    public int getSeats() {
        return 12;
    }
    
    private boolean hasCargoSpace(double size) {
        return maxCargoSpace - usedCargoSpace >= size;
    }
    
    private void handleNoSpace() {
        System.out.println("Not enough space");
    }
    
    public void add1Package(float l, float w, float h) {
        double size = l * w * h;
         if (hasCargoSpace(size)) {
             usedCargoSpace += size;
         } else {
             handleNoSpace();
         }
    }
    
    @Override
    public void print() {
        super.print();
        System.out.printf("[maxCargoSpace=%f, usedCargoSpace=%f\n", maxCargoSpace, usedCargoSpace);
    }
}
