package com.csc3020.lecture12.gn2289;

public class Passenger {
    private int checkBags;
    private final int freeBags;

    public int getCheckBags() {
        return checkBags;
    }

    public void setCheckBags(int checkBags) {
        this.checkBags = checkBags;
    }

    public int getFreeBags() {
        return freeBags;
    }

//    public void setFreeBags(int freeBags) {
//        this.freeBags = freeBags;
//    }

    private double perBagFee;

    public double getPerBagFee() {
        return perBagFee;
    }

    public void setPerBagFee(double perBagFee) {
        this.perBagFee = perBagFee;
    }

    public Passenger() {
        freeBags = 0;
    }

    public Passenger(int freeBags) {
        this.freeBags = freeBags;
    }

    public Passenger(int freeBags, int checkBags) {
       // this.freeBags = freeBags;
        this(freeBags);
        this.checkBags = checkBags;
    }

//    public Passenger(double perBagFee) {
//        this.perBagFee = perBagFee;
//    }

//    public Passenger(int freeBags) {
//        this(freeBags > 1?25.0d:50.0d);
////        if (freeBags > 1) {
////            perBagFee = 25.0d;
////        }else{
////            perBagFee = 50.0d;
////        }
//    }





}
