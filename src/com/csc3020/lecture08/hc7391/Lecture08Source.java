package csc3020.lecture08.hc7391;

public class Lecture08Source {

    public static void main(String[]args)
    {
        int val1 = 10;
        int val2 = 20;
        //parameter immutability primitive types
        System.out.println(val1);
        System.out.println(val2);
        swap(val1,val2);
        System.out.println(val1);
        System.out.println(val2);

        //Parameter Immutability Class Types
        Flight oflight1 = new Flight(10);
        Flight oflight2 = new Flight(20);
        System.out.println(oflight1.getFlightNumber());
        System.out.println(oflight2.getFlightNumber());
        swap(oflight1,oflight2);
        System.out.println(oflight1.getFlightNumber());
        System.out.println(oflight2.getFlightNumber());

        //Parameter Immutability Changing The Member
        oflight1 = new Flight(10);
        oflight2 = new Flight(20);
        System.out.println(oflight1.getFlightNumber());
        System.out.println(oflight2.getFlightNumber());
        swapNumbers(oflight1,oflight2);
        System.out.println(oflight1.getFlightNumber());
        System.out.println(oflight2.getFlightNumber());

        //Overloading
        Flight oFlight = new Flight();
        Passenger oPassenger1 = new Passenger(0,1);
        Passenger oPassenger2 = new Passenger(0,2);

        oFlight.add1Passenger();
        oFlight.print();
        oFlight.add1Passenger(2);
        oFlight.print();
        oFlight.add1Passenger(oPassenger1);
        oFlight.print();
        short threeBags = 3;
        oFlight.add1Passenger(threeBags, 2);
        oFlight.print();
        oFlight.add1Passenger(oPassenger2,1);
        oFlight.print();

    }// end public

    public static void swap(int i, int j)
    {
        int k = i;
        i = j;
        j=k;
        System.out.println(i);
        System.out.println(j);
    }

    public static void swap(Flight i, Flight j)
    {
        Flight k = i;
        i = j;
        j=k;
        System.out.println(i.getFlightNumber());
        System.out.println(j.getFlightNumber());
    }

    public static void swapNumbers(Flight i, Flight j){
        int k = i.getFlightNumber();
        i.setFlightNumber(j.getFlightNumber());
        j.setFlightNumber(k);

        System.out.println(i.getFlightNumber());
        System.out.println(j.getFlightNumber());
    }
}
