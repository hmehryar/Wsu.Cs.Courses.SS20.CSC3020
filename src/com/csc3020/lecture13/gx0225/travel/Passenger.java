package csc3020.lecture13.gx0225.travel;

public class Passenger {
    private int checkedBags;

    private final int freeBags;

    private double perBagFee;

    private Flight relatedFlight;



    // Constructors

    public Passenger() {

        freeBags = 0;

        relatedFlight = new Flight();

        relatedFlight.legacyFlightNumber = 0;

    }

    public Passenger(int freeBags) {

//        this((freeBags > 1) ? 25.0d : 50.0d);

        this.freeBags = freeBags;

    }

    public Passenger(int freeBags, int checkBags) {

        //this.freeBags = freeBags;

        this(freeBags); // Constructor chaining

        this.checkedBags = checkedBags;

    }

    private Passenger(double perBagFee){

        this();

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
