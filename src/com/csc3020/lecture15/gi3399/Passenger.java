package com.csc3020.lecture15.gi3399;

public class Passenger extends Person implements Comparable<Passenger> {
    private int checkedBags;
    private final int freeBags;
    private double perBagFee;

    public static class RewardProgram {
        private int memberLevel; //3 (1st priority),2,1
        private int memberDays;

        public int getMemberLevel() {
            return memberLevel;
        }

        public void setMemberLevel(int memberLevel) {
            this.memberLevel = memberLevel;
        }

        public int getMemberDays() {
            return memberDays;
        }

        public void setMemberDays(int memberDays) {
            this.memberDays = memberDays;
        }

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
        this.freeBags = freeBags;
    }

//    public Passenger(int freeBags, int checkedBags){
//        //this.freeBags = freeBags;
//        this(freeBags);
//        this.checkedBags = checkedBags;
//    }

    public Passenger(int freeBags, double perBagFee) {
        this.freeBags = freeBags;
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

//    public void setFreeBags(int freeBags) {
//        this.freeBags = freeBags;
//    }

    public double getPerBagFee() {
        return perBagFee;
    }

    public void setPerBagFee(double perBagFee) {
        this.perBagFee = perBagFee;
    }

    @Override
    public int compareTo(Passenger o) {
        Passenger p = (Passenger) o;
        if (rewardProgram.memberLevel > p.rewardProgram.memberLevel)
            return -1;
        else if (rewardProgram.memberLevel < p.rewardProgram.memberLevel)
            return 1;
        else {
            if (rewardProgram.memberDays > p.rewardProgram.memberDays)
                return -1;
            else if (rewardProgram.memberDays < p.rewardProgram.memberDays)
                return 1;
            else
                return 0;
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
}
