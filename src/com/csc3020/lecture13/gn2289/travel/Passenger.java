package com.csc3020.lecture13.gn2289.travel;

public class Passenger {
    private int checkBags;
    private final int freeBags;
    private Flight relatedFlight;

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
        relatedFlight = new Flight();
        relatedFlight.legacyFlightNumber = 0;
    }

    public Passenger(int freeBags) {
        this.freeBags = freeBags;
    }

    public Passenger(int freeBags, int checkBags) {
       // this.freeBags = freeBags;
        this(freeBags);
        this.checkBags = checkBags;
    }



}
