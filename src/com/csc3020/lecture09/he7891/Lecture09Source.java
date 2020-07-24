package csc3020.lecture09.he7891;
// *
// Author: Nathan Tattrie
// Student ID: he7891
// Lecture09: Class Inheritance
// *

/* Class Inheritance
* ~ A class can be declared to inherit *AKA derive) from another class (Use the "extends" keyword)
* ~~ Derived class has characteristics of base class (can add specialization)
* ~~ Can be assigned to base class type references
* ~~ Methods override base class method signatures
* ~~
* */

/* Object Class
* ~ The Object class is the root of the java class hierarchy
* ~~ Every class has the characteristics of the object class
* ~ Useful for declaring variables, fields and parameters that can reference any class or array instance
* ~ Defines a number of methods that are inherent ...
* */

/* Inheriting from Object
* ~ Every class inherits directly from the object class
* */

/* Object Class Methods
* ~ clone: Create a new object instance that duplicates the current instance
* ~ hashCode: Get a hash code fro the current instance
* ~ getClass: Return type information for the current instance
* ~ finalize: Handle special resource cleanup scenarios
* ~ toString: Return string of characters representing the current instance
* ~ equals: Compare another object to the current instance for equality
* */

/**/

public class Lecture09Source {
    public static void main(String[] args) {
        CargoFlight cf = new CargoFlight();
        cf.add1Passenger();
        cf.print();

        cf.add1Package(1.0f, 2.5f,3.0f);
        cf.print();

        Flight f = new CargoFlight();
        Passenger janet = new Passenger(0, 1);
        //f.add1Passenger(janet);
        //f.add1Package(1.0f, 2.5f,3.0f);
        Flight[] squadron = new Flight[5];
        squadron[0] = new Flight();
        squadron[1] = new CargoFlight();
        squadron[2] = new CargoFlight();
        squadron[3] = new Flight();
        squadron[4] = new Flight();

        CargoFlight cargoFlight1 = new CargoFlight();
        System.out.println(cargoFlight1.getSeat());

        Flight regularCargoFlight = new Flight();
        System.out.println(regularCargoFlight.getSeat());

        Object[] stuff = new Object[3];
        stuff[0] = new Flight();
        stuff[1] = new Passenger(0, 2);
        stuff[2] = new CargoFlight();

        Object o = new Passenger();
        o = new Flight[5];
        o = new CargoFlight();

        if (o instanceof CargoFlight) {
            CargoFlight oCargoFlight = (CargoFlight) o;
            oCargoFlight.add1Package(1,2,3);
        }

        // Equality
        Flight flight1 = new Flight();
        Flight flight2 = new Flight();
        if (flight1 == flight2) {
            System.out.println("Yes");
        }
        if (flight1.equals(flight2)) {
            System.out.println("Yes");
        }

//        Passenger p = new Passenger();
//        if (flight1.equals(p)) {
//            System.out.println("Yes");
//        }

    }

//    @Override
//    public static boolean ==(Object o1, Object o2) {
//        return o1.equals(o2);
//    }
}
