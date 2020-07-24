package csc3020.lecture10.gz0715;

public class Lecture10Source {
    public static void main(String[] args) {
        // Equality
        Flight flight1 = new Flight();
        Flight flight2 = new Flight();
        if (flight1 == flight2) { // does not output, needs operator override
            System.out.println("Yes");
        }
        if (flight1.equals(flight2)) {
            System.out.println("Yes");
        }

        Passenger passenger = new Passenger();
        if (flight1.equals(passenger)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Final

        // Abstract
        //Person oPerson = new Person(); // person is abstract, cannot be instantiated.
        Student oStudent = new Student();

        //Pilot oPilot = new Pilot(); // person is abstract, cannot be instantiated.
        CargoOnlyPilot oCargoOnlyPilot = new CargoOnlyPilot();
        CargoFlight oCargoFlight = new CargoFlight();
        boolean canAccept = oCargoOnlyPilot.canAccept(oCargoFlight);
        if (canAccept) {
            System.out.println("The pilot can accept the flight");
        } else {
            System.out.println("The pilot CANNOT accept the flight");
        }

        oCargoFlight.add1Passenger();
        canAccept = oCargoOnlyPilot.canAccept(oCargoFlight);
        if (canAccept) {
            System.out.println("The pilot can accept the flight");
        } else {
            System.out.println("The pilot CANNOT accept the flight");
        }

        FullLicensePilot oFullLicensePilot = new FullLicensePilot();
        canAccept = oFullLicensePilot.canAccept(oCargoFlight);
        if (canAccept) {
            System.out.println("The pilot can accept the flight");
        } else {
            System.out.println("The pilot CANNOT accept the flight");
        }

        Flight f175 = new Flight(175);
        CargoFlight cf = new CargoFlight();
        CargoFlight cd294 = new CargoFlight(294);
        CargoFlight cf85 = new CargoFlight(85, 200);
        CargoFlight cfBig = new CargoFlight(5000.0f);

    }
}
