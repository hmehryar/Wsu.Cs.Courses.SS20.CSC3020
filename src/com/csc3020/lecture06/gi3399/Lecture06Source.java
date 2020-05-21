package com.csc3020.lecture06.gi3399;

public class Lecture06Source {
    public static void main(String[] args) {
        Flight oFlight1 = new Flight();
        for (int count = 0; count < 30; count++){
            oFlight1.add1Passengers();
        }
        Flight oFlight2 = new Flight();
        for (int count = 0; count < 20; count++){
            oFlight1.add1Passengers();
        }
        boolean flight1HasRoom = oFlight1.hasRoom(oFlight2);
        System.out.println(flight1HasRoom);

        for (int count = 0; count < 131; count++) {
            oFlight2.add1Passengers();
        }
        flight1HasRoom = oFlight1.hasRoom(oFlight2);
        System.out.println(flight1HasRoom);

        oFlight2 = new Flight();
        oFlight2.add1Passengers();
        oFlight1.print();
        Flight oMergedFlight = oFlight1.createNewWithBoth(oFlight2);
        oFlight1.print();
        oMergedFlight.print();

        Flight lax1 = new Flight();
        Flight lax2 = new Flight();

        //Adding Passengers
        for (int count = 0; count < 20; count++) {
            lax1.add1Passengers();
        }
        for (int count = 0; count < 131; count++) {
            lax2.add1Passengers();
        }
        lax1.print();
        lax2.print();
        Flight lax3 = null;
        //Flight lax3 = new Flight();
        if (lax1.hasRoom(lax2))
            lax3 = lax1.createNewWithBoth(lax2);

        if (lax3 != null)
            lax3.print();
        else
            System.out.println("The flights haven't merged");

        //Accessors and Mutators
        Flight slcToNyc = new Flight();
        slcToNyc.setSeats(250);
        System.out.println(slcToNyc.getSeats());
    }
}
