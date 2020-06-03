package com.csc3020.lecture09.gv7006;

public class Lecture09Source {
    public static void main(String[] args) {
        CargoFlight cf = new CargoFlight();
        cf.add1Passenger();
        cf.print();
        
        cf.add1Package(1.0f, 2.5f, 3f);
        cf.print();
        
        Flight f = new CargoFlight();
        Passenger janet = new Passenger(0, 1);
        f.add1Passenger();
        // note: cannot use subclass-only methods when using base class reference
        
        Flight[] squadron = {
            new Flight(),
            new CargoFlight(),
            new CargoFlight(),
            new Flight(),
            new CargoFlight()
        };
        
        Flight regularFlight = new Flight();
        System.out.println(regularFlight.getSeats());
        
        CargoFlight cargoFlight = new CargoFlight();
        System.out.println(cargoFlight.getSeats());
        
        Flight castCargoFlight = new CargoFlight();
        System.out.println(castCargoFlight.getSeats());
        
        int seatCount = 0;
        for (int i = 0; i < squadron.length; ++i) {
            seatCount += squadron[i].getSeats();
        }
        System.out.println(seatCount);
        
        Object[] stuff = {
            new Flight(),
            new Passenger(0, 2),
            new CargoFlight()
        };
        
        Object o = new Passenger();
        o = new Flight[5];
        o = new CargoFlight();
        
        // Instance of
        if (o instanceof CargoFlight) {
            CargoFlight oCargoFlight = (CargoFlight) o;
            oCargoFlight.add1Package(1, 2, 3);
        }
        
        // Deep equals check
        Flight f1 = new Flight();
        Flight f2 = new Flight();
        if (f1 == f2) System.out.println("Equivalent");
        if (f1.equals(f2)) System.out.println("Equivalent");
        
        Passenger passenger = new Passenger();
        if (f1.equals(passenger)) {
            System.out.println("Equivalent");
        } else {
            System.out.println("Not equivalent");
        }
    }
}
