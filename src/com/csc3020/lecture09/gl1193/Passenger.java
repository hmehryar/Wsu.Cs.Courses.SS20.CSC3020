package com.csc3020.lecture09.gl1193;

public class Passenger {


    private int checkedBags;
    private int freeBags;

    private double perBagFee;
    public Passenger() {

    }

    public Passenger(int freeBags) {
//        if (freeBags > 1){
//            perBagFee = 25.0d;
//        }
//        else{
//            perBagFee = 50.0d;
//        }
        this(freeBags > 1 ? 25.0d: 50.0d);
        this.freeBags = freeBags;
    }

    public Passenger(int freeBags, int checkedBags){
        //this.freeBags = freeBags;
        this(freeBags);
        this.checkedBags = checkedBags;
    }

    private Passenger(double perBagFee){
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
