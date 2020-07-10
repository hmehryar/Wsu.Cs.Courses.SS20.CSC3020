package csc3020.lecture08.go3480;

public class Lecture08Source {
    public static void main(String[] args) {

        // Primitive types
        int val1 = 10;
        int val2 = 20;
        System.out.println(val1);
        System.out.println(val2);
        swap(val1, val2);
        System.out.println(val1);
        System.out.println(val2);

        // Class Types
        Flight flight1 = new Flight(10);
        Flight flight2 = new Flight(20);
        System.out.println(flight1.getFlightNumber());
        System.out.println(flight2.getFlightNumber());
        swap(flight1,flight2);
        System.out.println(flight1.getFlightNumber());
        System.out.println(flight2.getFlightNumber());

        flight1 = new Flight(10);
        flight2 = new Flight(20);
        System.out.println(flight1.getFlightNumber());
        System.out.println(flight2.getFlightNumber());
        swapNumbers(flight1, flight2);
        System.out.println(flight1.getFlightNumber());
        System.out.println(flight2.getFlightNumber());

        // Overloading
        Flight oFLight = new Flight();
        Passenger oPassenger1 = new Passenger(0,1);
        Passenger oPassenger2 = new Passenger(0,2);

        oFLight.add1Passenger();
        oFLight.print();
        oFLight.add1Passenger(2);
        oFLight.print();
        oFLight.add1Passenger(oPassenger1);
        oFLight.print();
        short threeBags = 3;
        oFLight.add1Passenger(threeBags, 2);
        oFLight.print();
        oFLight.add1Passenger(oPassenger2);
        oFLight.print();
    }

    static void swapNumbers(Flight i, Flight j) {
        int k = i.getFlightNumber();
        i.setFlightNumber(j.getFlightNumber());
        j.setFlightNumber(k);
        System.out.println(i);
        System.out.println(j);
    }
    static void swap(int i, int j) {
        int k = i;
        i = j;
        j = k;
        System.out.println(i);
        System.out.println(j);
    }
    static void swap(Flight i, Flight j) {
        Flight k=i;
        i=j;
        j=k;
        System.out.println(i.getFlightNumber());
        System.out.println(j.getFlightNumber());
    }
}