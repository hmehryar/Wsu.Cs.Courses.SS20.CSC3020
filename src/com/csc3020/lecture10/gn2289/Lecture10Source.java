package csc3020.lecture10.gn2289;

public class Lecture10Source {
    public static void main(String[] args) {
        //super
        Flight flight1 = new Flight();
        Flight flight2 = new Flight();
        if(flight1 == flight2) {
            System.out.println("Works");
        }

        if(flight1.equals(flight2)) {
            System.out.println("Yes");
        }

        Passenger passenger = new Passenger();
        if(flight1.equals(passenger)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        //final

        //abstracts
        //Person oPerson = new Person();
        Student oStudent = new Student();

       // Pilot oPilot = new Pilot() {
        CargoOnlyPilot oCargoOnlyPilot = new CargoOnlyPilot();
        CargoFlight oCargoFlight = new CargoFlight();
        boolean canAccept = oCargoOnlyPilot.canAccept(oCargoFlight);
        if(canAccept) {
            System.out.println("The pilot can accept the flight.");
        }
        oCargoFlight.add1Passenger();
        canAccept = oCargoOnlyPilot.canAccept(oCargoFlight);
        if(canAccept) {
            System.out.println("The oCargoOnlyPilot can accept the flight.");
        }else{
            System.out.println("oCargoOnlyPilot cannot accept");
        }
        FullLicensePilot oFullLicencePilot = new FullLicensePilot();
        canAccept = oFullLicencePilot.canAccept(oCargoFlight);
        if(canAccept) {
            System.out.println("The FullLicensePilot can accept the flight.");
        }else{
            System.out.println("FullLicensePilot cannot accept.");
        }

        Flight f175 = new Flight(175);
        CargoFlight cf = new CargoFlight();
        CargoFlight cf294 = new CargoFlight(294);
        CargoFlight cf85 = new CargoFlight(85, 200.0f);
        CargoFlight cfBig = new CargoFlight(5000.f);

    }
    //abstract class Person{}
}
