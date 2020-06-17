package csc3020.lecture06.ev2601;

import csc3020.lecture05.ev2601.Flight;

public class Lecture06Source {
    public static void main(String[] args) {
        Flight lax1 = new Flight("lax1");
        Flight lax2 = new Flight("lax2");

        for (int i = 0; i < 30; i++) lax1.addPassenger();
        for (int i = 0; i < 30; i++) lax2.addPassenger();

        lax1.printStats();
        lax2.printStats();

        Flight lax3 = null;
        if (lax1.hasRoom(lax2)) {
            lax3 = lax1.createNewWithBoth(lax2, "lax3");
        }

        if (lax3 != null) {
            lax3.printStats();
        } else System.out.println("The flights could not be merged");

        //Accessors and Mutator
        Flight slcToNyc = new Flight("slcToNyc");
        slcToNyc.setSeats(250);
        System.out.println(slcToNyc.getSeats());
    }
}
