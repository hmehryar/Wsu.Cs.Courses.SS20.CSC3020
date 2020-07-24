package csc3020.lecture11.gz0715;

public class Passenger {
    // Variables
    private int checkedBags;
    private int freeBags;
    private double perBagFee;

    // Constructors
    public Passenger() {}
    public Passenger(int freeBags) {
        this((freeBags > 1) ? 25.0d : 50.0d);
        this.freeBags = freeBags;
    }
    public Passenger(int freeBags, int checkBags) {
        //this.freeBags = freeBags;
        this(freeBags); // Constructor chaining
        this.checkedBags = checkedBags;
    }
    private Passenger(double perBagFee){
        this.perBagFee = perBagFee;
    }

    // Getter and Setter Functions
    public int getCheckedBags() {
        return checkedBags;
    }
    public void setCheckBags(int checkBags) {
        this.checkedBags = checkBags;
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

    // Functions

}
