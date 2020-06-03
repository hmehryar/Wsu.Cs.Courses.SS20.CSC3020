package lecture09.av7071;

public class Lecture09Source {
    public static void main(String[] args) {
        com.csc3020.lecture09.av7071.CargoFlight cf = new com.csc3020.lecture09.av7071.CargoFlight();
        cf.add1Passenger();
        cf.print();

        cf.add1Package(1.0f, 2.5f, 3.0f);
        cf.print();

        com.csc3020.lecture09.av7071.Flight f = new com.csc3020.lecture09.av7071.CargoFlight();
        Passenger janet = new Passenger(0,1);
        f.add1Passenger(janet);
//        f.add1Package(1.0f, 2.5f, 3.0f);

        com.csc3020.lecture09.av7071.Flight[] squadron = new com.csc3020.lecture09.av7071.Flight[5];
        squadron[0] = new com.csc3020.lecture09.av7071.Flight();
        squadron[1] = new com.csc3020.lecture09.av7071.CargoFlight();
        squadron[2] = new com.csc3020.lecture09.av7071.CargoFlight();
        squadron[3] = new com.csc3020.lecture09.av7071.Flight();
        squadron[4] = new com.csc3020.lecture09.av7071.CargoFlight();

        com.csc3020.lecture09.av7071.Flight regularFlight1 = new com.csc3020.lecture09.av7071.Flight();
        System.out.println(regularFlight1.getSeat());

        com.csc3020.lecture09.av7071.CargoFlight cargoFlight1 = new com.csc3020.lecture09.av7071.CargoFlight();
        System.out.println(cargoFlight1.getSeat());

        com.csc3020.lecture09.av7071.Flight castedCargoFlight = new com.csc3020.lecture09.av7071.CargoFlight();
        System.out.println(castedCargoFlight.getSeat());

        int seatCount = 0;
        for (int index = 0; index < squadron.length; index++) {
            seatCount += squadron[index].getSeat();
        }
        System.out.println(seatCount);

        Object[] stuff = new Object[3];
        stuff[0] = new com.csc3020.lecture09.av7071.Flight();
        stuff[1] = new Passenger(0,2);
        stuff[2] = new com.csc3020.lecture09.av7071.CargoFlight();

        Object o = new Passenger();
        o = new com.csc3020.lecture09.av7071.Flight[5];
        o = new com.csc3020.lecture09.av7071.CargoFlight();

//        o.add1Package(1,2,3);
        if (o instanceof com.csc3020.lecture09.av7071.CargoFlight) {
            com.csc3020.lecture09.av7071.CargoFlight oCargoFlight = (com.csc3020.lecture09.av7071.CargoFlight) o;
            oCargoFlight.add1Package(1,2,3);
        }

        //Equality
        com.csc3020.lecture09.av7071.Flight flight1 = new com.csc3020.lecture09.av7071.Flight();
        com.csc3020.lecture09.av7071.Flight flight2 = new com.csc3020.lecture09.av7071.Flight();
        if (flight1 == flight2) {
            System.out.println("Yes");
        }

        if (flight1.equals(flight2)) {
            System.out.println("Yes");
        }
        Passenger passenger = new Passenger();
        if(flight1.equals(passenger)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
