package com.csc3020.lecture07.em0608;

public class session07source {
    public static void main(String[] args) {
        Earth oEarth = new Earth();
        System.out.println(oEarth.circumferenceInMiles);
        System.out.println(oEarth.getCircumferenceInKilo);

        Flight oFlight = new Flight();

        Passenger bob = new Passenger();
        System.out.println(bob.getFreeBags());
        bob.setFreeBags(4);
        System.out.println(bob.getFreeBags());

        Passenger arsi = new Passenger(3);
        System.out.println(arsi.getFreeBags());

        Passenger jane = new Passenger(4);
        jane.setCheckedBags(3);
        System.out.println(jane.getFreeBags()+ ", " + jane.getCheckedBags());

        jane = new Passenger(4, 3);
        System.out.println(jane.getFreeBags()+ ", " + jane.getCheckedBags());

//        Passenger cheapjoe = new Passenger(.01d);
//        cheapjoe.setFreeBags(4);
//        cheapjoe.setCheckedBags(7);
//        System.out.println(cheapjoe.getFreeBags()+ ", " + cheapjoe.getCheckedBags() + ", " +cheapjoe.getPerBagFee());


        Passenger Joe = new Passenger(2);
        System.out.println(Joe.getFreeBags()+ ", " + Joe.getCheckedBags() + ", " +Joe.getPerBagFee());

        Passenger joe = new Passenger(1);
        System.out.println(joe.getFreeBags()+ ", " + joe.getCheckedBags() + ", " +joe.getPerBagFee());

    }


}

