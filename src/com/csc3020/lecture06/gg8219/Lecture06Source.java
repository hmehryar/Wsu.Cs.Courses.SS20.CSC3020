//package com.csc3020.lecture06.gg8219;
//
//    public class Lecture06Source
//    {
//        public static class Flight<lax3, lax2>
//        {
//            private int passengers;
//            private int seats;
//            public Flight()
//            {
//                seats = 150;
//                passengers = 0;
//            }
//
//            private void handleTooMany()
//            {
//                System.out.println("Too Many");
//            }
//            public int getSeats()
//            {
//                return seats;
//            }
//            public void setSeats(int seats)
//            {
//                this.seats = seats;
//            }
//            public void add1Passenger()
//            {
//                if(passengers < seats)
//                    passengers += 1;
//                else
//                    handleTooMany();
//            }
//
//            public boolean hasRoom(Flight f2)
//            {
//                int total = passengers + f2.passengers;
//                return total <= seats;
//            }
//            public Flight createNewWithBoth(Flight f2)
//            {
//                Flight newFlight= new Flight();
//                newFlight.seats= seats;
//                newFlight.passengers= passengers + f2.passengers;
//                return newFlight;
//            }
//            Flight lax1 = new Flight();
//            Flight lax2 = new Flight();
//            // add passengers to both flights
//            Flight lax3 = null;
//
//        if(lax1.hasRoom(lax2))
//            {
//                lax3 =lax1.createNewWithBoth(lax2);
//            }
//            // do some other work
//        if(lax3 != null )
//            {
//             System.out.println("Flights combined");
//          }
//
//
//
//
//        }
//    }
//}
//
