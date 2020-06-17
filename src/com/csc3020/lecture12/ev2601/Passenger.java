package csc3020.lecture12.ev2601;

 public class Passenger {
    private int checkedBags;
    private final int freeBags ;

    public int getCheckedBags() {
        return checkedBags;
    }

    public void setCheckedBags(int checkedBags) {
        this.checkedBags = checkedBags;
    }

    public int getFreeBags() {
        return freeBags;
    }

    private double perBagFee;

    public double getPerBagFee() {
        return perBagFee;
    }

    public void setPerBagFee(double perBagFee) {
        this.perBagFee = perBagFee;
    }

    public Passenger(){
        freeBags = 0;
    }

    public Passenger(int freeBags){
        this.freeBags=freeBags;
    }

    public Passenger(int freeBags, int checkedBags){
        this(freeBags);
        this.checkedBags=checkedBags;
    }

    private Passenger(double perBagFee){
        this();
        this.perBagFee=perBagFee;
    }
}
