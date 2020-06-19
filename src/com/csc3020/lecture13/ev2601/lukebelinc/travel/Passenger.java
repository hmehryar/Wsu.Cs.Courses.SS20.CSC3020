package csc3020.lecture13.ev2601.lukebelinc.travel;

public class Passenger {
    private int checkedBags;
    private final int freeBags ;
    private Flight relatedFlight;

    public int getCheckedBags() {
        return checkedBags;
    }
    public void setCheckedBags(int checkedBags) {
        this.checkedBags = checkedBags;
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
    public Passenger(){
        freeBags = 0;
        relatedFlight = new Flight();
        relatedFlight.legacyFlightNumber=0;
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
