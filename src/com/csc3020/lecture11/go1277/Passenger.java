package lecture11.go1277;
// *
// Author: Tia Gijo
// Student ID: go1277
// Lecture 11 Lab
// *

public class Passenger {

    private int checkedBags;
    private int freeBags;
    private double perBagFee;


    public Passenger() {}

    public Passenger(int freeBags) {
        this(freeBags > 1 ? 25.0d : 50.0d);

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


    public void setCheckedBags(int checkedBags) {
        this.checkedBags = checkedBags;
    }

    public void setFreeBags(int freeBags) {
        this.freeBags = freeBags;
    }

    public void setPerBagFee(double perBagFee) {
        this.perBagFee = perBagFee;
    }


    public int getCheckedBags() {
        return checkedBags;
    }

    public int getFreeBags() {
        return freeBags;
    }

    public double perBagFee() {
        return perBagFee;
    }




}
