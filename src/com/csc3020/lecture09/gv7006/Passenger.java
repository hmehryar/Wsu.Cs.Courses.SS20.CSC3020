package com.csc3020.lecture09.gv7006;

class Passenger {
    private int checkedBags;
    private int freeBags;
    private double perBagFee;
    
    public Passenger() {}
    
    public Passenger(int freeBags) {
        this(freeBags > 1 ? 25.0d : 50.0d);
        this.freeBags = freeBags;
    }
    
    public Passenger(int freeBags, int checkedBags) {
        this(freeBags);
        this.checkedBags = checkedBags;
    }
    
    private Passenger(double perBagFee) {
        this.perBagFee = perBagFee;
    }
    
    public int getCheckedBags() {
        return checkedBags;
    }
    
    public void setCheckedBags(int checkedBags) {
        this.checkedBags = checkedBags;
    }
    
    public int getFreeBags() {
        return freeBags;
    }
    
    public void setFreeBags(int freeBags) {
        this.freeBags = freeBags;
    }
    
    public double getPerBagFee() {
        return perBagFee;
    }
    
    public void setPerBagFee(double perBagFee) {
        this.perBagFee = perBagFee;
    }
}
