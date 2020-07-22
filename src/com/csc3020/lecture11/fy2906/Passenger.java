package csc3020.lecture11.fy2906;

final public class Passenger {
    private int checkedBags;
    private int freeBags;

    public void setCheckedBags(int checkedBags) {
        this.checkedBags = checkedBags;
    }

    public int getCheckedBags() {
        return checkedBags;
    }

    public void setFreeBags(int freeBags) {
        this.freeBags = freeBags;
    }

    public int getFreeBags() {
        return freeBags;
    }

    private double perBagFee;

    public void setPerBagFee(double perBagFee) {
        this.perBagFee = perBagFee;
    }

    public double getPerBagFee() {
        return perBagFee;
    }

    public Passenger() {

    }
    public Passenger(int freeBags) {
        this(freeBags > 1?25.0d:50.0d);
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
}
