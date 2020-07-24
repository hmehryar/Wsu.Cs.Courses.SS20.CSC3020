package csc3020.lecture05.go3480;

public class Lecture05Source {
    public static void main(String[] args) {
        int intVar;

       Flight nycToSf;

        nycToSf = new Flight();
        Flight slcToDallas = new Flight();
        slcToDallas.add1Passenger();

        System.out.println(nycToSf.passengers);
        System.out.println(nycToSf.seats);
        System.out.println(slcToDallas.passengers);
        System.out.println(slcToDallas.seats);

        Flight flight1 = new Flight();
        Flight flight2 = new Flight();
        flight2.add1Passenger();
        System.out.println("Flight 2: Passengers = " + flight2.passengers);

        flight2 = flight1;
        System.out.println("Flight 2: After Assigning Passengers = " + flight2.passengers);

        flight1.add1Passenger();
        flight1.add1Passenger();

        System.out.println("Flight 2: After Adding Passengers to Flight1 Object Passengers = " + flight2.passengers);

    }
}
