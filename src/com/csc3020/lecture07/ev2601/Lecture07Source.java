package lecture07.ev2601;

public class Lecture07Source {
    public static void main(String[] args) {
        Earth oEarth=new Earth();
        System.out.println(oEarth.circumferenceInMiles);
        System.out.println(oEarth.circumferenceInKilometers);

        Flight oFlight=new Flight();

        Passenger bob = new Passenger();
        System.out.println(bob.getFreeBags());
        bob.setFreeBags(4);
        System.out.println(bob.getFreeBags());

        Passenger arsi=new Passenger(3);
        System.out.println(arsi.getFreeBags());

        Passenger jane=new Passenger(4);
        jane.setCheckedBags(3);
        System.out.println(jane.getFreeBags()+","+jane.getCheckedBags() );

        jane=new Passenger(4,3);
        System.out.println(jane.getFreeBags()+","+jane.getCheckedBags() );

        Passenger joe=new Passenger(2);
        System.out.println(joe.getFreeBags()+","+joe.getCheckedBags()+","+joe.getPerBagFee() );
        joe=new Passenger(1);
        System.out.println(joe.getFreeBags()+","+joe.getCheckedBags()+","+joe.getPerBagFee() );
    }
}
