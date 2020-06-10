package lecture10.av7071;

import com.csc3020.lecture09.av7071.Flight;

public class Lecture10Source {
    public static void main(String[] args) {
        // Super
        Flight flight1 = new com.csc3020.lecture09.av7071.Flight();
        Flight flight2 = new Flight();
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

        // Final

        // Abstract
        //Person oPerson = new Person();
        com.csc3020.lecture10.av7071.Student oStudent = new com.csc3020.lecture10.av7071.Student();

        // Pilot oPilot = new Pilot();
        com.csc3020.lecture10.av7071.CargoOnlyPilot oCargoOnlyPilot = new com.csc3020.lecture10.av7071.CargoOnlyPilot();
        com.csc3020.lecture10.av7071.CargoFlight oCargoFlight = new com.csc3020.lecture10.av7071.CargoFlight();
        boolean canAccept = oCargoOnlyPilot.canAccept(oCargoFlight);
        if (canAccept) {
            System.out.println("The pilot can accept the flight");
        }
        oCargoFlight.add1Passenger();
        canAccept = oCargoOnlyPilot.canAccept(oCargoFlight);
        if (canAccept) {
            System.out.println("The CargoOnlyPilot can accept the flight");
        } else {
            System.out.println("The CargoOnlyPilot can't accept the flight");
        }
        com.csc3020.lecture10.av7071.FullLicensePilot oFullLicensePilot = new com.csc3020.lecture10.av7071.FullLicensePilot();
        canAccept = oFullLicensePilot.canAccept(oCargoFlight);
        if (canAccept) {
            System.out.println("The FullLicensePilot can accept the flight");
        } else {
            System.out.println("The FullLicensePilot can't accept the flight");
        }
        Flight f175 = new Flight(175);
        com.csc3020.lecture10.av7071.CargoFlight cf = new com.csc3020.lecture10.av7071.CargoFlight();
        com.csc3020.lecture10.av7071.CargoFlight cf294 = new com.csc3020.lecture10.av7071.CargoFlight(294);
        com.csc3020.lecture10.av7071.CargoFlight cf85 = new com.csc3020.lecture10.av7071.CargoFlight(85, 200.0f);
        com.csc3020.lecture10.av7071.CargoFlight cfBig = new com.csc3020.lecture10.av7071.CargoFlight(5000.0f);

    }
}
