package com.csc3020.lecture06.gs9945;

import com.csc3020.lecture06.hm.Flight;

//Edited by Kristopher Covert (GS9945)
//Flight Class Modification and Demonstration

public class lecture06source {

    public static void main(String[] args){
        Flight oFlight1=new Flight();

        for (int count = 0; count <20 ; count++) {
            oFlight1.add1Pass();
        }


        Flight oFlight2=new Flight();

        for (int count = 0; count <30 ; count++) {
            oFlight1.add1Pass();
        }


        boolean flight1HasRoom= oFlight1.hasRoom(oFlight2);
        System.out.println(flight1HasRoom);

        oFlight2=new Flight();

        for (int count = 0; count < 131; count++) {
            oFlight2.add1Pass();
        }


        flight1HasRoom= oFlight1.hasRoom(oFlight2);
        System.out.println(flight1HasRoom);

        oFlight2=new Flight();
        oFlight2.add1Pass();
        oFlight1.print();
        Flight oMergedFlight= oFlight1.createFlightWithBoth(oFlight2);
        oFlight1.print();
        oMergedFlight.print();

        Flight lax1=new Flight();
        Flight lax2=new Flight();

        //Adding Passengers to the object
        for (int count = 0; count <20; count++) {
            lax1.add1Pass();
        }
//        for (int count = 0; count <30; count++) {
//            lax2.add1Passenger();
//        }


        for (int count = 0; count <131; count++) {
            lax2.add1Pass();
        }
        lax1.print();
        lax2.print();


        //Flight lax3=Flight;
        Flight lax3=null;
        if(lax1.hasRoom(lax2)){
            lax3=lax1.createFlightWithBoth(lax2);
        }
        if(lax3!=null)
            lax3.print();
        else
            System.out.println("The Flights have not been Merged");


        //Accessors and Mutator
        Flight slcToNyc=new Flight();
        slcToNyc.setSeats(250);
        System.out.println(slcToNyc.getSeat());

    }

}
