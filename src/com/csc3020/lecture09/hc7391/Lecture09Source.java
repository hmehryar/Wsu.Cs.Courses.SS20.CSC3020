package csc3020.lecture09.hc7391;
//CSC 3020
//Author Bryan Vinson
public class Lecture09Source {

    public static void main(String[]args)
    {
CargoFlight cf = new CargoFlight();
cf.add1Passenger();
cf.print();

cf.add1Package(1.0f, 2.5f, 3.0f);

cf.print();
Flight f = new CargoFlight(); //downcasted
Passenger janet = new Passenger(0,1);
f.add1Passenger(janet);

//f.add1Package() not available due to downcasting
Flight[] squadron = new Flight[5];
squadron[0] = new Flight();
squadron[1] = new CargoFlight();
squadron[2] = new CargoFlight();
squadron[3] = new Flight();
squadron[4] = new CargoFlight();

Flight regularFlight1 = new Flight();
System.out.println(regularFlight1.getSeats());

CargoFlight cargoFlight1 = new CargoFlight();
System.out.println(cargoFlight1.getSeats());

Flight castedCargoFlight = new CargoFlight();
System.out.println(castedCargoFlight.getSeats());
        int seatCount = 0;
        for (int i = 0; i < squadron.length ; i++) {
            seatCount+=squadron[i].getSeats();
        }
        System.out.println(seatCount);

        Object[] stuff = new Object[3];
        stuff[0] = new Flight();
        stuff[1] = new Passenger(0,2);
        stuff[2] = new CargoFlight();

        Object o = new Passenger(); // can put anything in Object
        o = new Flight[5];
        o = new CargoFlight();
//casting general object to a specific object
        if(o instanceof CargoFlight)
        {
            CargoFlight oCargoFlight = (CargoFlight) o;
            oCargoFlight.add1Package(1,2,3);
        }

//Equality
Flight flight1 = new Flight();
Flight flight2 = new Flight();

//wrong way to check equality
/*if(flight1 == flight2)
{
    System.out.println("Yes");
}
*/
        if(flight1.equals(flight2))
        {
            System.out.println("Yes");
        }

        Passenger passenger = new Passenger();
        if(flight1.equals(passenger))
        {
            System.out.println("yes");
        }else
        {
            System.out.println("no");
        }

    }// end public

}
