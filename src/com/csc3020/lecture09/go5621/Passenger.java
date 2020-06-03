package com.csc3020.lecture09.go5621;

public class Passenger {
    private int checkedBags;
    private int freeBags;
    private double perBagFee;

    public Passenger() {

    }

    public Passenger(int freeBags) {
        this(freeBags <= 1 ? 25.0d : 50.0d);
//        if(freeBags>1) {
//            perBagFee = 25.0d;
//        }
//        else {
//            perBagFee = 50.0d;
//        }
        this.freeBags = freeBags;
    }

    public Passenger(int freeBags, int checkedBags) {
        this(freeBags);
        //this.freeBags = freeBags;
        this.checkedBags = checkedBags;
    }

    private Passenger(double perBagFee) {
        this.perBagFee = perBagFee;
    }

    public double getPerBagFee() {
        return perBagFee;
    }

    public void setPerBagFee(double perBagFee) {
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
}
