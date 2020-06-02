package com.csc3020.lecture07.gs9945;

public class lecture07source {

    public static void main(String[] args) {
        System.out.println(" ");


        Earth oEarth=new Earth();
        System.out.println("Default State of Earth Class; Circumference in Miles and Kilometers.");
        System.out.println(oEarth.circumferenceInMiles);
        System.out.println(oEarth.circumferenceInKilometers);

        //Creating a new flight object
        Flight oFlight=new Flight();

        //Creating a new Passenger object
        Passenger bob = new Passenger();

        System.out.println("Changing the value in the get free bags member variables of the bob Passenger class.");
        System.out.println(bob.getFreeBags());
        bob.setFreeBags(4);
        System.out.println(bob.getFreeBags());


        System.out.println("Using the constructor to instantiate a new object with 3 as a value inside freeBags variable");
        Passenger arsi=new Passenger(3);
        System.out.println(arsi.getFreeBags());

        Passenger jane=new Passenger(4);
        jane.setCheckedBags(3);
        System.out.println(jane.getFreeBags()+","+jane.getCheckedBags() );

        jane=new Passenger(4,3);
        System.out.println(jane.getFreeBags()+","+jane.getCheckedBags() );


        System.out.println("Changing values of perBagFee.");
        Passenger joe=new Passenger(2);
        System.out.println(joe.getFreeBags()+","+joe.getCheckedBags()+","+joe.getPerBagFee() );
        joe=new Passenger(1);
        System.out.println(joe.getFreeBags()+","+joe.getCheckedBags()+","+joe.getPerBagFee() );
    }
}
