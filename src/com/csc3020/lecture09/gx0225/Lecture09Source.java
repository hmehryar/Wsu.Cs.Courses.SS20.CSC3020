package com.csc3020.lecture09.gx0225;

public class Lecture09Source {
    public static void main(String[] args) {
        CargoFlight cf = new CargoFlight();
        cf.add1Passenger();
        cf.print();

        cf.add1Package(1.0f,2.0f,3.0f);
        cf.print();
        Flight f = new CargoFlight();
        Passenger janet = new Passenger(0,1);
        f.add1Passenger(janet);
        Flight[] squadron=new Flight[5];
        squadron[0] = new Flight();
        squadron[1] = new CargoFlight();
        squadron[2] = new CargoFlight();
        squadron[3] = new Flight();
        squadron[4] = new CargoFlight();
        Flight regularFlight = new Flight();
        System.out.println(regularFlight.getSeats());

        CargoFlight cargoFlight1= new CargoFlight();
        System.out.println(cargoFlight1.getSeats());

        CargoFlight castedCargoFlight= new CargoFlight();
        System.out.println(castedCargoFlight.getSeats());

        int seatCount=0;
        for (int index=0;index<squadron.length; index++){
           seatCount+=squadron[index].getSeats();
        }
        System.out.println(seatCount);
        Object[] stuff= new Object[3];
        stuff[0] = new Flight();
        stuff[1]=new CargoFlight();
        stuff[2]=new Passenger(0,2);

        Object o=new Passenger();
        o=new Flight[5];
        o=new CargoFlight();

        if (o instanceof CargoFlight){
            CargoFlight oCargoFlight=(CargoFlight) o;
            oCargoFlight.add1Passenger(5);
        }

        //Equality
        Flight flight1=new Flight();
        Flight flight2=new Flight();
        if (flight1.equals(flight2)){
            System.out.println("yes");
        }

        Passenger passenger=new Passenger();
        if (flight1.equals(passenger)){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

    }
    /*@Override
    public static boolean==(Object o1,Object o2){
        return o1.equals(o2)
    }*/
}
