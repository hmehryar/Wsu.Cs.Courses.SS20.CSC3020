package csc3020.lecture15.gn2289;

public class Passenger extends Person implements Comparable<Passenger> {
    private int checkBags;
    private final int freeBags;

    //lecture 15 stuff
    public static class RewardProgram {
        private int memberLevel; //3 (1st priority), 2, 1
        public int getMemberLevel() {
            return memberLevel;
        }

        public void setMemberLevel(int memberLevel) {
            this.memberLevel = memberLevel;
        }

        private int memberDays;
        public int getMemberDays() {
            return memberDays;
        }

        public void setMemberDays(int memberDays) {
            this.memberDays = memberDays;
        }

        public void setMemberLevelAndDays(int memberLevel, int memberDays) {
            setMemberDays(memberDays);
            setMemberLevel(memberLevel);
        }
    }
    private RewardProgram rewardProgram = new RewardProgram();

    public RewardProgram getRewardProgram() {
        return rewardProgram;
    }

    public int getCheckBags() {
        return checkBags;
    }

    public void setCheckBags(int checkBags) {
        this.checkBags = checkBags;
    }

    public int getFreeBags() {
        return freeBags;
    }

//    public void setFreeBags(int freeBags) {
//        this.freeBags = freeBags;
//    }

    private double perBagFee;

    public double getPerBagFee() {
        return perBagFee;
    }

    public void setPerBagFee(double perBagFee) {
        this.perBagFee = perBagFee;
    }

    public Passenger() {
        freeBags = 0;
    }

    public Passenger(int freeBags) {
        this.freeBags = freeBags;
    }

    public Passenger(int freeBags, int checkBags) {
        // this.freeBags = freeBags;
        this(freeBags);
        this.checkBags = checkBags;
    }

    @Override
    public int compareTo(Passenger o) {
        Passenger p =(Passenger)o;
        if(rewardProgram.memberLevel > p.rewardProgram.memberLevel) {
            return -1;
        }else if(rewardProgram.memberLevel < p.rewardProgram.memberLevel) {
            return 1;
        }else {
          if (rewardProgram.memberDays > p.rewardProgram.memberDays) {
              return -1;
          }else if (rewardProgram.memberDays < p.rewardProgram.memberDays) {
              return 1;
          }else {
              return 0;
          }
        }
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name="+this.getName()+
                "checkBags=" + checkBags +
                ", freeBags=" + freeBags +
                ", memberLevel=" +rewardProgram.memberLevel +
                ", memberDays=" + rewardProgram.memberDays +
                ", perBagFee=" + perBagFee +
                '}';
    }
}
