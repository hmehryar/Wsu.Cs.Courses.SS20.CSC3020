package csc3020.lecture05.gp7633;

public class Lecture05Source {
    public static void main(String[] args) {
        // Using class
        int intVar;

        Flight nycToSf;
        nycToSf = new Flight();
        System.out.println(nycToSf.passengers);
        System.out.println(nycToSf.seats);

        Flight slctoDallas = new Flight();
        slctoDallas.add1Passengers();
        System.out.println(slctoDallas.passengers);
        System.out.println(slctoDallas.seats);
    }
}
