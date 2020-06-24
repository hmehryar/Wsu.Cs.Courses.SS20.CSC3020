package csc3020.lecture15.gx0225;

public class Passenger extends Person implements Comparable{
    //final public class Passenger {
    private int checkedBags;
    private final int freeBags;
    private double perBagFee;

    public static class RewardProgram{
        private int memberLevel;

        private int memberDays;

        public void setMemberLevel(int memberLevel) {
            this.memberLevel = memberLevel;
        }

        public void setMemberDays(int memberDays) {
            this.memberDays = memberDays;
        }

        public int getMemberLevel() {
            return memberLevel;
        }

        public int getMemberDays() {
            return memberDays;
        }

        public void setMemberLevelAndDays(int memberLevel, int memberDays){
            setMemberLevel(memberLevel);
            setMemberDays(memberDays);
        }
    }
    private RewardProgram rewardProgram=new RewardProgram();
    public RewardProgram getRewardProgram(){
        return rewardProgram;
    }

    public void setCheckedBags(int checkedBags){
        this.checkedBags = checkedBags;
    }
    public int getCheckedBags() {
        return checkedBags;
    }
//    public void setFreeBags(int freeBags) {
//        this.freeBags = freeBags;
//    }
    public int getFreeBags() {
        return freeBags;
    }
    public void setPerBagFee(double perBagFee) {
        this.perBagFee = perBagFee;
    }
    public double getPerBagFee() {
        return perBagFee;
    }

    public Passenger(){
        freeBags=0;
    }
    public Passenger(int freeBags){
      //  this(freeBags > 1 ? 25.0d : 50.0d);
//        if (freeBags > 1){
//            perBagFee = 25.0d;
//        } else{
//            perBagFee = 50.0d;
//        }
        this.freeBags = freeBags;
    }
    public Passenger(int freeBags, int checkedBags){
        //this.freeBags = freeBags;
        this(freeBags); // chained constructor
        this.checkedBags = checkedBags;
    }

    @Override
    public int compareTo(Object o) {
        Passenger p=(Passenger)o;
        if(rewardProgram.memberLevel>p.rewardProgram.memberLevel){
            return -1;
        }else if(rewardProgram.memberLevel<p.rewardProgram.memberLevel){
            return 1;
        } else {
            if(rewardProgram.memberDays>p.rewardProgram.memberDays)
                return -1;
            else if(rewardProgram.memberDays<p.rewardProgram.memberDays)
                return 1;
            else {
                return 0;
            }
        }

    }
//    private Passenger(double perBagFee){
//        this.perBagFee = perBagFee;
//    }

    @Override
    public String toString() {
        return "Passenger{" +
                "checkedBags=" + checkedBags +
                ", freeBags=" + freeBags +
                ", perBagFee=" + perBagFee +
                ", memberLevel=" + rewardProgram.memberLevel +
                ", memberDays=" + rewardProgram.memberDays +
                '}';
    }


//    @Override
//    public String toString() {
//        return "Passenger{" +
//                "memberLevel=" + memberLevel +
//                ", memberDays=" + memberDays +
//                '}';
//    }
}
