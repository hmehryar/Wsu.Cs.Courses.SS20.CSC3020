package csc3020.lecture10.he7891;
// *
// Author: Nathan Tattrie
// Student ID: he7891
// Lecture09
// *

public class Passenger {

    private int checkedBags;
    private int freeBags;
    private double perBagFee;

    //////////////////////////// CLASS FUNCTIONS ////////////////////////////
    public Passenger() {}

    public Passenger(int freeBags) {
        this(freeBags > 1 ? 25.0d : 50.0d);
//        if (freeBags > 1) {
//            perBagFee = 25.0d;
//        }
//        else {
//            perBagFee = 50.0d;
//        }
        this.freeBags = freeBags;
    }

    public Passenger(int freeBags, int checkedBags) {
        //this.freeBags = freeBags;
        this(freeBags);
        this.checkedBags = checkedBags;

    }

    public Passenger(double perBagFee) {
        this.perBagFee = perBagFee;
    }

    /////////////////////////////// SETTERS ///////////////////////////////
    public void setCheckedBags(int checkedBags) {
        this.checkedBags = checkedBags;
    }

    public void setFreeBags(int freeBags) {
        this.freeBags = freeBags;
    }

    public void setPerBagFee(double perBagFee) {
        this.perBagFee = perBagFee;
    }

    /////////////////////////////// GETTERS ///////////////////////////////
    public int getCheckedBags() {
        return checkedBags;
    }

    public int getFreeBags() {
        return freeBags;
    }

    public double perBagFee() {
        return perBagFee;
    }

    ///////////////////////////// OTHER FUNCTIONS /////////////////////////////


}
