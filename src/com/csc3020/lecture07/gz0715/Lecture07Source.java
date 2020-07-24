package csc3020.lecture07.gz0715;

public class Lecture07Source {
    public static void main(String[] args) {
        Earth oEarth = new Earth();
        System.out.println(oEarth.circumferenceInMiles);
        System.out.println(oEarth.circumferenceInKilometers);

        Flight oFlight = new Flight();
        // Object obj = new Object();

        Passenger bob = new Passenger();
        System.out.println(bob.getFreeBags());
        bob.setFreeBags(4);
        System.out.println(bob.getFreeBags());

        Passenger arsi = new Passenger(3);
        System.out.println(arsi.getFreeBags());

        Passenger jane = new Passenger(4);
        jane.setCheckBags(3);
        System.out.println(jane.getFreeBags() + ", " + jane.getCheckBags());

        jane = new Passenger(4, 3);
        System.out.println(jane.getFreeBags() + ", " + jane.getCheckBags());

//        Passenger cheapJoe = new Passenger(.01d); // perBagFee Constructor was set to private
//        cheapJoe.setFreeBags(4);
//        cheapJoe.setCheckBags(7);
//        System.out.println(cheapJoe.getFreeBags() + ", " + cheapJoe.getCheckBags() + ", " + cheapJoe.getPerBagFee());

        Passenger joe = new Passenger(2);
        System.out.println(joe.getFreeBags() + ", " + joe.getCheckBags() + ", " + joe.getPerBagFee());
    }
}
