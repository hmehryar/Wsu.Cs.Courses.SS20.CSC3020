package csc3020.lecture15.av7071;

public class Passenger extends Person implements Comparable<Passenger>
{
    private int checkedBags;
    private final int freeBags;

    public static  class RewardProgram{
        private int memberLevel;//3 (1st priority),2,1
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
        private void setMemberDays(int memberDays) {
            this.memberDays = memberDays;
        }

        public void setMemberLevelAndDays(int memberLevel,int memberDays){
            setMemberLevel(memberLevel);
            setMemberDays(memberDays);
        }
    }
    private RewardProgram rewardProgram=new RewardProgram();

    public RewardProgram getRewardProgram() {
        return rewardProgram;
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
        //this(freeBags>1?25.0d:50.0d);
//          if(freeBags>1){
//
//              perBagFee=25.0d;
//          }else{
//              perBagFee=50.0d;
//          }

        this.freeBags = freeBags;

    }

    public Passenger(int freeBags, int checkedBags) {
        //this.freeBags=freeBags;
        this(freeBags);
        this.checkedBags = checkedBags;
    }

    private Passenger(double perBagFee) {
        this();
        this.perBagFee = perBagFee;
    }

    @Override
    public int compareTo(Passenger p) {

        //Passenger p = (Passenger) o;
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
                "name="+this.getName()+
                "checkedBags=" + checkedBags +
                ", freeBags=" + freeBags +
                ", memberLevel=" + rewardProgram.memberLevel +
                ", memberDays=" + rewardProgram.memberDays +
                ", perBagFee=" + perBagFee +
                '}';
    }
}
