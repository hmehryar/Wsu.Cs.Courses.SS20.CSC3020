package csc3020.lecture08.gh9893;

public class Passengers {
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
    public Passengers(){}
    public Passengers(int freeBags){
        this(freeBags>1?25.0d:50.0d);

        this.freeBags=freeBags;

    }
    public Passengers(int freeBags,int checkedBags){
  
        this(freeBags);
        this.checkedBags=checkedBags;
    }
    private Passengers(double perBagFee){
        this.perBagFee=perBagFee;
    }
}