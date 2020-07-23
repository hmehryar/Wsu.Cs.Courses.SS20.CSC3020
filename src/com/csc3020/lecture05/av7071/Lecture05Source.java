package csc3020.lecture05.av7071;

/**
 * Author: Kevin Kluka
 */
public class Lecture05Source {
    public static void main(String[] args) {
        /** if (args[0] == "log = true"){
            //do logging
        }**/

        //Using Class
        int intvar;

        com.cs3020.lecture05.av7071.Flight nycToSf;
        nycToSf= new com.cs3020.lecture05.av7071.Flight();
        System.out.println(nycToSf);
        System.out.println(nycToSf.passengers);
        System.out.println(nycToSf.seats);

        com.cs3020.lecture05.av7071.Flight slcToDallas = new com.cs3020.lecture05.av7071.Flight();
        System.out.println(nycToSf.passengers);
        System.out.println(nycToSf.seats);

        slcToDallas.add1Passenger();
        System.out.println(slcToDallas);
        System.out.println(nycToSf.passengers);
        System.out.println(nycToSf.seats);

        //Class are reference types
        com.cs3020.lecture05.av7071.Flight flight1 = new com.cs3020.lecture05.av7071.Flight();
        com.cs3020.lecture05.av7071.Flight flight2 = new com.cs3020.lecture05.av7071.Flight();

        flight2.add1Passenger();
        System.out.println("Flight 2: Passengers= " + flight2.passengers); //1

        flight2 = flight1;
        System.out.println("After Assigning - Flight 2: Passengers= " + flight2.passengers); //0

        flight1.add1Passenger();
        flight1.add1Passenger();

        System.out.println("After Assigning - Flight 2: Passengers= " + flight2.passengers); //2


        //Method return value
        com.cs3020.lecture05.av7071.Flight oMethodFlight1 = new com.cs3020.lecture05.av7071.Flight();
        for (int i = 1; i < 20; i++)
            oMethodFlight1.add1Passenger();

        com.cs3020.lecture05.av7071.Flight oMethodFlight2 = new com.cs3020.lecture05.av7071.Flight();
        for (int i = 1; i < 25; i++)
            oMethodFlight2.add1Passenger();
        boolean f1HasRoom = oMethodFlight1.hasRoom(oMethodFlight2);
        System.out.println(f1HasRoom);

        for (int i = 1; i < 140; i++)
            oMethodFlight2.add1Passenger();
        f1HasRoom = oMethodFlight1.hasRoom(oMethodFlight2);
        System.out.println(f1HasRoom);


        System.out.printf("showSum: CalculatorEngine Class");
        com.cs3020.lecture05.av7071.CalculatorEngine oCalculatorEngine = new com.cs3020.lecture05.av7071.CalculatorEngine();
        oCalculatorEngine.showSum(1.3f, 3.5f, 10);

        System.out.printf("showSum: Main Class");
        showSum(4.5f, 5.5f, 5);

        //Exiting from method
        showSum(1.2f, 3.5f, 10);
    }

    public static void showSum(float x, float y, int count){
        float sum = x + y;

        if (count > 1000){
            System.out.println(sum);
        }

        for(int i = 0; i < count; i++)
            System.out.println(sum);
    }
}
