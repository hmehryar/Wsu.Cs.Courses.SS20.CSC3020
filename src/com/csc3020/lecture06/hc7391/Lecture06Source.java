package csc3020.lecture06.hc7391;

public class Lecture06Source {

    public static void main(String[] args)
    {
Flight oFlight1 = new Flight();

for(int count = 0; count < 20; count++)
{
    oFlight1.add1Passenger();
}

Flight oFlight2 = new Flight();

for(int count = 0; count < 30; count++)
{
    oFlight1.add1Passenger();
}

boolean flight1HasRoom = oFlight1.hasRoom(oFlight2);
System.out.println(flight1HasRoom);

oFlight2 = new Flight();
oFlight2.add1Passenger();
oFlight1.print();
Flight oMerged = oFlight1.createFlightWithBoth(oFlight2);

oFlight1.print();
oMerged.print();

Flight lax1 = new Flight();
Flight lax2 = new Flight();

for (int i = 0; i < 20 ; i++)
{
        lax1.add1Passenger();
}

for (int i = 0; i < 131 ; i++)
{
    lax2.add1Passenger();
}

lax1.print();
lax2.print();

Flight lax3 = null;
if(lax1.hasRoom(lax2))
{
lax3 = lax1.createFlightWithBoth(lax2);
}

if(lax3 != null)
{
    lax3.print();
}else
    {
        System.out.println("The flights haven't merged!!");
    }
Flight toNyc = new Flight();
toNyc.setSeats(250);
System.out.println(toNyc.getSeats());
    }//public class
}//end Lecture06Source
