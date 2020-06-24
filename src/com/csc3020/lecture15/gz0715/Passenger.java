package csc3020.lecture15.gz0715;

public class Passenger extends Person implements Comparable<Passenger> {
    // Variables
    private int checkedBags;
    private final int freeBags;
    private double perBagFee;

    // nested class
    public static class RewardProgram {
        private int memberLevel; // 3 (1st priority), 2, 1
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
    // instance of RewardProgram
    private RewardProgram rewardProgram = new RewardProgram();

    public RewardProgram getRewardProgram() {
        return rewardProgram;
    }

    // Constructors
    public Passenger() {
        freeBags = 0;
    }
    public Passenger(int freeBags) {
//        this((freeBags > 1) ? 25.0d : 50.0d);
        this.freeBags = freeBags;
    }
    public Passenger(int freeBags, int checkBags) {
        //this.freeBags = freeBags;
        this(freeBags); // Constructor chaining
        this.checkedBags = checkedBags;
    }
    private Passenger(double perBagFee){
        this();
        this.perBagFee = perBagFee;
    }

    // Getter and Setter Functions
    public int getCheckedBags() {
        return checkedBags;
    }
    public void setCheckBags(int checkBags) {
        this.checkedBags = checkBags;
    }
    public int getFreeBags() {
        return freeBags;
    }
    public double getPerBagFee() {
        return perBagFee;
    }
    public void setPerBagFee(double perBagFee) {
        this.perBagFee = perBagFee;
    }


    // Functions
    @Override
    public int compareTo(Passenger p) {
        if (rewardProgram.memberLevel > p.rewardProgram.memberLevel)
            return -1;
        else if (rewardProgram.memberLevel < p.rewardProgram.memberLevel)
            return 1;
        else {
            if (rewardProgram.memberDays > p.rewardProgram.memberDays)
                return -1;
            else if (rewardProgram.memberDays < p.rewardProgram.memberDays)
                return 1;
            else {
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name=" + super.getName() +
                ", checkedBags=" + checkedBags +
                ", freeBags=" + freeBags +
                ", perBagFee=" + perBagFee +
                ", memberLevel=" + rewardProgram.memberLevel +
                ", memberDays=" + rewardProgram.memberDays +
                '}';
    }
}
