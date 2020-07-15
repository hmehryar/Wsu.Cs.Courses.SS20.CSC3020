package csc3020.lecture10.go3480;

public class Passenger {
    private int checkedBags;
    private int freeBags;

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

    private double perBagFee;

    public double getPerBagFee() {
        return perBagFee;
    }
    public void setPerBagFee(double perBagFee) {
        this.perBagFee = perBagFee;
    }

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
}
