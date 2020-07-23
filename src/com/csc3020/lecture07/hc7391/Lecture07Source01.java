package csc3020.lecture07.hc7391;

public class Lecture07Source01 {
    public static void main(String[] args) {
        Earth oEarth = new Earth();
        System.out.println(oEarth.circumferenceInMiles);
        System.out.println(oEarth.circumferenceInKilometers);

        Flight oFlight = new Flight();
        Passenger bob = new Passenger();
        System.out.println(bob.getFreeBags());
        bob.setFreeBags(4);
        System.out.println(bob.getFreeBags());

        Passenger andy = new Passenger(3);
        System.out.println(andy.getFreeBags());


        Passenger jane = new Passenger(4);
        jane.setCheckBags(3);
        System.out.println(jane.getFreeBags() + " " + jane.getCheckedBags());

        jane = new Passenger(4, 3);
        System.out.println(jane.getFreeBags() + " " + jane.getCheckedBags());

        Passenger cheapJoe = new Passenger(0.1d);
        cheapJoe.setFreeBags(4);
        cheapJoe.setCheckBags(7);
        System.out.println(cheapJoe.getFreeBags() + " " + cheapJoe.getCheckedBags());

        Passenger joe = new Passenger(2);
        System.out.println(joe.getFreeBags()+ " "+joe.getCheckedBags()+" "+joe.getPerBagFee());
        joe = new Passenger(1);
        System.out.println(joe.getFreeBags()+ " "+joe.getCheckedBags()+" "+joe.getPerBagFee());

    }
}
