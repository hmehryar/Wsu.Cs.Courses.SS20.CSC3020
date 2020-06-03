package lecture09.go1277;

public class Lecture09Source
{
    public static void main(String[] args)
    {

        CargoFlight cf = new CargoFlight();
        cf.add1Passenger();
        cf.print();
        cf.add1Package(1.0f, 2.5f, 3.0f);
        cf.print();
        Flight f = new CargoFlight();
        Passenger  jane = new Passenger(0,2);
        f.add1Passenger();
        Flight[] squadron = new Flight[5];
        squadron[0] = new Flight();
        squadron[1] = new CargoFlight();
        squadron[2] = new CargoFlight();
        squadron[3] = new Flight();
        squadron[4] = new CargoFlight();
    }
}
