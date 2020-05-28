//package com.csc3020.lecture06.gg8219;
//
//    public class Flight {
//        public int passenger;
//        private int passengers;
//        private int seats;
//
//        public Flight() {
//            seats = 150;
//            passenger = 0;
//        }
//
//        public int getSeat(){
//            return  seats;
//        }
//        public void setSeats(int seats){
//            this.seats=seats;
//        }
//        public int getPassenger() {
//            return passenger;
//        }
//        public void setPassenger(int passenger) {
//            this.passenger = passenger;
//        }
//
//        void add1Passenger() {
//            if (passenger < seats)
//                passenger += 1;
//            else
//                handleTooMany();
//        }
//
//        private void handleTooMany() {
//            System.out.println("Too many!");
//        }
//
//        public boolean hasRoom(com.csc3020.lecture06.hm.Flight f2) {
//            int total = passenger + f2.passengers;
//            return total <= seats;
//        }
//        public com.csc3020.lecture06.hm.Flight createFlightWithBoth(com.csc3020.lecture06.hm.Flight flight2){
//            com.csc3020.lecture06.hm.Flight newFlight=new com.csc3020.lecture06.hm.Flight();
//            newFlight.seats=seats;
//            newFlight.passengers=this.passenger +flight2.passengers;
//            return newFlight;
//        }
//        public void print(){
//            String str="Flight[ seats= "+this.seats+",passengers= "+this.passenger +"]";
//            System.out.println(str);
//        }
//    }
//
//}
//
