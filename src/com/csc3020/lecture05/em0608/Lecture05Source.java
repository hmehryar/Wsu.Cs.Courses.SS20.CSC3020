package csc3020.lecture05.em0608;

public class Lecture05Source {
    public static void main(String[] args) {
        //using class
        int intVar;


        Flight nycToSc;
        nycToSc = new Flight();
        // System.out.println(nycToSc.passengers);
        // System.out.println(nycToSc.seats);

        Flight slcToDallas = new Flight();
//        System.out.println(slcToDallas.passengers);
//        System.out.println(slcToDallas.seats);
        slcToDallas.add1Passenger();
//        System.out.println(slcToDallas.passengers);
//        System.out.println(slcToDallas.seats);

        //Classes are reference Types
        Flight flight1 = new Flight();
        Flight flight2 = new Flight();

        flight2.add1Passenger();
        // System.out.println("Flight 2 passengers: " + flight2.passengers);

        flight2 = flight1;
        // System.out.println("Flight 2 passengers: " + flight2.passengers);

        flight1.add1Passenger();
        flight1.add1Passenger();

        //  System.out.println("Flight 2 passengers: " + flight2.passengers);

        // flight1.handleTooMany();

        System.out.println("showSum: Calculator Engine Class");
        CalculatorEngine oCalculatorEngine = new CalculatorEngine();
        oCalculatorEngine.showSum(1.3f, 3.f, 3);

        //Exiting from method
        System.out.println("showSum: Calcualtor Engine Class");
        CalculatorEngine oCalculateEngine1 = new CalculatorEngine();
        oCalculatorEngine.showSum(1.2f, 2.3f, 11);


        //Method return value
        Flight oMethodFlight1 = new Flight();
        for (int i = 1; i < 20; i++)
            oMethodFlight1.add1Passenger();

        Flight oMethodFlight2 = new Flight();
        for (int i = 1; i < 20; i++)
            oMethodFlight2.add1Passenger();

        boolean f1HasRoom = oMethodFlight1.hasRoom(oMethodFlight2);
        System.out.println(f1HasRoom);

        for (int i = 0; i < 140; i++)
            oMethodFlight2.add1Passenger();
        f1HasRoom = oMethodFlight1.hasRoom(oMethodFlight2);
        System.out.println(f1HasRoom);

    }
}

