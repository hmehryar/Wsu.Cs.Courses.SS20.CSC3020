package com.csc3020.lecture06.go5334;

public class Lecture06SourceCode {
    public static void main(String[] args) {
        Flight01 oFlight1 = new Flight01();
        for (int count = 0; count < 20; count++) {
            oFlight1.add1Pass();
        }
        Flight01 oFlight2 = new Flight01();
        for (int count = 0; count < 30; count++) {
            oFlight1.add1Pass();
        }
        boolean flight1HasRoom = oFlight1.hasRoom(oFlight2);
        System.out.println(flight1HasRoom);

        oFlight2 = new Flight01();
        for (int count = 0; count < 131; count++) {
            oFlight2.add1Pass();
        }
        flight1HasRoom = oFlight1.hasRoom(oFlight2);
        System.out.println(flight1HasRoom);

        oFlight2 = new Flight01();
        oFlight2.add1Pass();
        oFlight1.print();
        Flight01 oMergedFlight = oFlight1.createFlightWithBoth(oFlight2);
        oFlight1.print();
        oMergedFlight.print();

        Flight01 lax1 = new Flight01();
        Flight01 lax2 = new Flight01();

        //Adding Passengers
        for (int count = 0; count < 20; count++) {
            lax1.add1Pass();
        }
//        for (int count = 0; count <30; count++) {
//            lax2.add1Passenger();
//        }
        for (int count = 0; count < 131; count++) {
            lax2.add1Pass();
        }
        lax1.print();
        lax2.print();
        //Flight lax3=Flight;
        Flight01 lax3 = null;
        if (lax1.hasRoom(lax2)) {
            lax3 = lax1.createFlightWithBoth(lax2);
        }
        if (lax3 != null)
            lax3.print();
        else
            System.out.println("The flights haven't merged!!");


        //Accessors and Mutator
        Flight01 slcToNyc = new Flight01();
        slcToNyc.setSeats(250);
        System.out.println(slcToNyc.getSeat());

    }
}
