package com.csc3020.lecture14.he7891;
// *
// Author: Nathan Tattrie
// Student ID: he7891
// Lecture14
// *

public class Passenger extends Person implements Comparable<Passenger> {

    private int checkedBags;
    private final int freeBags;
    private double perBagFee;
    private int memberLevel; // 3 (1st priority), 2, 1
    private int memberDays;  //

    //////////////////////////// CLASS FUNCTIONS ////////////////////////////
    public Passenger() {
        freeBags = 0;
    }
    public Passenger(int freeBags) {
//        this(freeBags > 1 ? 25.0d : 50.0d);
//        if (freeBags > 1) {
//            perBagFee = 25.0d;
//        }
//        else {
//            perBagFee = 50.0d;
//        }
        this.freeBags = freeBags;
    }
    public Passenger(int freeBags, int checkedBags) {
        //this.freeBags = freeBags;
        this(freeBags);
        this.checkedBags = checkedBags;

    }
//    public Passenger(double perBagFee) {
//        this.perBagFee = perBagFee;
//    }

//    @Override
//    public int compareTo(Object o) {
//        Passenger p = (Passenger) o;
//        if (memberLevel > p.memberLevel) {
//            return -1;
//        } else if (memberLevel < p.memberLevel) {
//            return 1;
//        } else {
//            if (memberDays > p.memberDays) {
//                return -1;
//            } else if (memberDays < p.memberDays) {
//                return 1;
//            } else {
//                return 0;
//            }
//        }
//    }

    @Override
    public int compareTo(Passenger o) {
        if (memberLevel > o.memberLevel) {
            return -1;
        } else if (memberLevel < o.memberLevel) {
            return 1;
        } else {
            if (memberDays > o.memberDays) {
                return -1;
            } else if (memberDays < o.memberDays) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    /////////////////////////////// SETTERS ///////////////////////////////
    public void setCheckedBags(int checkedBags) {
        this.checkedBags = checkedBags;
    }
    public void setPerBagFee(double perBagFee) {
        this.perBagFee = perBagFee;
    }
    public void setMemberLevel(int memberLevel) { this.memberLevel = memberLevel; }
    public void setMemberDays(int memberDays) { this.memberDays = memberDays; }
    public void setMemberLevelAndDays(int memberLevel, int memberDays) {
        setMemberLevel(memberLevel);
        setMemberDays(memberDays);
    }
//    public void setFreeBags(int freeBags) {
//        this.freeBags = freeBags;
//    }

    /////////////////////////////// GETTERS ///////////////////////////////
    public int getCheckedBags() {
        return checkedBags;
    }
    public int getFreeBags() {
        return freeBags;
    }
    public double perBagFee() {
        return perBagFee;
    }
    public int getMemberLevel() { return memberLevel; }
    public int getMemberDays() { return memberDays; }

    ///////////////////////////// OTHER FUNCTIONS /////////////////////////////


    @Override
    public String toString() {
        return "Passenger{" +
                "name" + getName() +
                "checkedBags=" + checkedBags +
                ", freeBags=" + freeBags +
                ", perBagFee=" + perBagFee +
                ", memberLevel=" + memberLevel +
                ", memberDays=" + memberDays +
                '}';
    }
}
