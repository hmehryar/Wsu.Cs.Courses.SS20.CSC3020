package com.csc3020.lecture15.go5261;

public class Passenger extends Person implements Comparable<Passenger>{
    private int checkedBags;
    private final int freeBags;
    private double perBagFee;

//    private int memberLevel; //3 (1st priority), 2, 1
//    private int memberDays;

    public static class RewardProgram {
        private int memberLevel;
        private int memberDays;

        public int getMemberLevel() { return memberLevel; }
        public void setMemberLevel(int memberLevel) { this.memberLevel = memberLevel; }

        public int getMemberDays() { return memberDays; }
        public void setMemberDays(int memberDays) { this.memberDays = memberDays; }

        public void setMemberLevelAndDays(int memberLevel, int memberDays) {
            setMemberLevel(memberLevel);
            setMemberDays(memberDays);
        }
    }

    private RewardProgram rewardProgram = new RewardProgram();

    public RewardProgram getRewardProgram() {
        return rewardProgram;
    }


    public Passenger() {
        freeBags = 0;
    }

    public Passenger(int freeBags) {
        //this(freeBags <= 1 ? 25.0d : 50.0d);
//        if(freeBags>1) {
//            perBagFee = 25.0d;
//        }
//        else {
//            perBagFee = 50.0d;
//        }
        this.freeBags = freeBags;
    }

    public Passenger(int freeBags, int checkedBags) {
        this(freeBags);
        //this.freeBags = freeBags;
        this.checkedBags = checkedBags;
    }

//    private Passenger(double perBagFee) {
//        this.perBagFee = perBagFee;
//    }

    public double getPerBagFee() {
        return perBagFee;
    }

    public void setPerBagFee(double perBagFee) {
        this.perBagFee = perBagFee;
    }

    public int getCheckedBags() {
        return checkedBags;
    }

    public void setCheckedBags(int checkedBags) {
        this.checkedBags = checkedBags;
    }

    public int getFreeBags() {
        return freeBags;
    }
//
//    @Override
//    public int compareTo(Object o) { //for sorting array
//        Passenger p = (Passenger)o;
//        if (memberLevel > p.memberLevel) {
//            return -1;
//        }
//        else if (memberLevel < p.memberLevel){
//            return 1;
//        }
//        else {
//            if (memberDays > p.memberDays) {
//                return -1;
//            }
//            else if (memberDays < p.memberDays) {
//                return 1;
//            }
//        }
//        return 0;
//    }

    @Override
    public int compareTo(Passenger p) {

        if (rewardProgram.memberLevel > p.rewardProgram.memberLevel) {
            return -1;
        }
        else if (rewardProgram.memberLevel < p.rewardProgram.memberLevel){
            return 1;
        }
        else {
            if (rewardProgram.memberDays > p.rewardProgram.memberDays) {
                return -1;
            }
            else if (rewardProgram.memberDays < p.rewardProgram.memberDays) {
                return 1;
            }
            else {
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name=" + this.getName() +
                "checkedBags=" + checkedBags +
                ", freeBags=" + freeBags +
                ", perBagFee=" + perBagFee +
                ", memberLevel=" + rewardProgram.memberLevel +
                ", memberDays=" + rewardProgram.memberDays +
                '}';
    }

    //    public void setFreeBags(int freeBags) {
//        this.freeBags = freeBags;
//    }
}
