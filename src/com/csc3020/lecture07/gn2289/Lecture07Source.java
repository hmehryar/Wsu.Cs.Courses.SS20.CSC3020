package csc3020.lecture07.gn2289;

public class Lecture07Source {
    public static void main(String[] args) {
        Earth oEarth = new Earth();
        System.out.println(oEarth.circumferenceInMiles);
        System.out.println(oEarth.circumferenceInKilo);

        Flight oFlight = new Flight();
        Passenger jacob = new Passenger();
        jacob.setFreeBags(4);
        Passenger ryan = new Passenger();
        ryan.setFreeBags(4);

        System.out.println(jacob.getFreeBags());

        System.out.println(ryan.getFreeBags());

        Passenger jane = new Passenger(4);

        jane.setCheckBags(3);

        System.out.println(jane.getFreeBags()+","+jane.getCheckBags());

        jane = new Passenger(4,3);
        System.out.println(jane.getFreeBags()+","+jane.getCheckBags());

//        Passenger cheapJoe = new Passenger(.01d);
//        System.out.println(cheapJoe.getFreeBags()+","+cheapJoe.getCheckBags()+","+cheapJoe.getPerBagFee());

        Passenger Joe = new Passenger(2);
        System.out.println(Joe.getFreeBags()+","+Joe.getCheckBags()+","+Joe.getPerBagFee());










    }
}
