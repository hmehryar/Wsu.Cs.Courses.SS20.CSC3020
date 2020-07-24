package csc3020.lecture13.gg6997.msingh.travel;

public class Passenger {
    private int checkedBags;
    private final int freeBags;
    private csc3020.lecture13.gg6997.msingh.travel.Flight relatedFlight;

    private double perBagFee;
    public Passenger() {
        freeBags = 0;
        relatedFlight = new csc3020.lecture13.gg6997.msingh.travel.Flight();
        relatedFlight.legacyFlightNumber = 0;
    }

    public Passenger(int freeBags) {

//        if (freeBags > 1){
//            perBagFee = 25.0d;
//        }
//        else{
//            perBagFee = 50.0d;
//        }
//        this(freeBags > 1 ? 25.0d: 50.0d);
        this.freeBags = freeBags;
    }

//    public Passenger(int freeBags, int checkedBags){
//        //this.freeBags = freeBags;
//        this(freeBags);
//        this.checkedBags = checkedBags;
//    }

//    private Passenger(double perBagFee){
//        this.perBagFee = perBagFee;
//    }

//    public int getCheckedBags() {
//        return checkedBags;
//    }
//
//    public void setCheckedBags(int checkedBags) {
//        this.checkedBags = checkedBags;
//    }

    public int getFreeBags() {
        return freeBags;
    }

//    public void setFreeBags(int freeBags) {
//        this.freeBags = freeBags;
//    }

    public double getPerBagFee() {
        return perBagFee;
    }

    public void setPerBagFee(double perBagFee) {
        this.perBagFee = perBagFee;
    }
}
