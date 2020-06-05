package lecture08.ev2601;

public class Lecture08Source {
    public static void main(String[] args) {
        //Parameter Immutability: Primitive Types
        int val1 = 10;
        int val2 = 20;
        System.out.println(val1);
        System.out.println(val2);
        swap(val1,val2);
        System.out.println(val1);
        System.out.println(val2);

        //Parameter Immutability: Class Types
        Flight flight1 = new Flight(10);
        Flight flight2 = new Flight(20);
        System.out.println(flight1.getFlightNumber());
        System.out.println(flight2.getFlightNumber());
        swap(flight1,flight2);
        System.out.println(flight1.getFlightNumber());
        System.out.println(flight2.getFlightNumber());

        //Parameter Immutability: Class Types -> Visible Changes outside of the method
         flight1 = new Flight(10);
         flight2 = new Flight(20);
        System.out.println(flight1.getFlightNumber());
        System.out.println(flight2.getFlightNumber());
        swapNumbers(flight1,flight2);
        System.out.println(flight1.getFlightNumber());
        System.out.println(flight2.getFlightNumber());

        //Overloading
        Flight oFlight=new Flight();
        Passenger oPassenger1=new Passenger(0,1);
        Passenger oPassenger2=new Passenger(0,2);

        oFlight.add1Passenger();
        oFlight.print();
        oFlight.add1Passenger(2);
        oFlight.print();
        oFlight.add1Passenger(oPassenger1);
        oFlight.print();
        short threeBags=3;
        oFlight.add1Passenger(threeBags,2);
        oFlight.print();
        oFlight.add1Passenger(oPassenger2,1);
        oFlight.print();
    }
    static void swapNumbers(Flight i, Flight j) {
        int k=i.getFlightNumber();
        i.setFlightNumber(j.getFlightNumber());
        j.setFlightNumber(k);
        System.out.println(i.getFlightNumber());
        System.out.println(j.getFlightNumber());
    }

    static void swap(Flight i, Flight j) {
        Flight k=i;
        i=j;
        j=k;
        System.out.println(i.getFlightNumber());
        System.out.println(j.getFlightNumber());;
    }
    static void swap(int i, int j) {
        int k=i;
        i=j;
        j=k;
        System.out.println(i);
        System.out.println(j);;
    }
}
