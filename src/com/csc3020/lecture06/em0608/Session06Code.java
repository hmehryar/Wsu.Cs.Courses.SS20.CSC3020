package com.csc3020.lecture06.em0608;

public class Session06Code {

    public static void main(String[] args){
        Flight oFlight1 = new Flight();
        for(int count = 0; count <20; count++){
            oFlight1.add1Passenger();
        }
        Flight oFlight2 = new Flight();
        for (int count = 0; count < 30; count ++){
            oFlight1.add1Passenger();
        }
        oFlight2 = new Flight();
        for (int count = 0; count < 131; count++){
            oFlight2.add1Passenger();
        }
        //  flight1HasRoom = oFlight1.hasRoom(oFlight2);
        // System.out.println(flight1HasRoom);


        oFlight2 = new Flight();
        oFlight2.add1Passenger();
        oFlight1.print();
        Flight oMergedFlight = oFlight1.createFlightWithBoth(oFlight2);
        oFlight1.print();
        oMergedFlight.print();

        //Accessors and Mutators
        Flight slcToNYC = new Flight();
        slcToNYC.setSeats(250);
        System.out.println(slcToNYC.getSeat());

    }

}

