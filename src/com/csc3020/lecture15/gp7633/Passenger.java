package csc3020.lecture15.gp7633;

 public class Passenger extends Person implements Comparable<Passenger>
 {
    private int checkedBags;
    private final int freeBags ;

    public static class RewardProgram {
        private int memberDays;
        public int getMemberDays() {
            return memberDays;
        }
        public void setMemberDays(int memberDays) {
            this.memberDays = memberDays;
        }

        private int memberLevel; // 3 (1st priority),2,1
        public void setMemberLevel(int memberLevel) {
            this.memberLevel = memberLevel;
        }
        public int getMemberLevel() {
            return memberLevel;
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

    public Passenger(){
        freeBags = 0;
    }
    public Passenger(int freeBags){
        //this(freeBags>1?25.0d:50.0d);
//          if(freeBags>1){
//
//              perBagFee=25.0d;
//          }else{
//              perBagFee=50.0d;
//          }

        this.freeBags=freeBags;

    }
    public Passenger(int freeBags, int checkedBags){
        //this.freeBags=freeBags;
        this(freeBags);
        this.checkedBags=checkedBags;
    }
    private Passenger(double perBagFee){
        this();
        this.perBagFee=perBagFee;
    }

//     @Override
//     public int compareTo(Object o) {
//
//        Passenger p = (Passenger)o;
//        if (memberLevel > p.memberLevel)
//            return -1;
//        else if (memberLevel < p.memberLevel)
//            return 1;
//        else {
//            if (memberDays > p.memberDays)
//                return -1;
//            else if (memberDays < p.memberDays)
//                return 1;
//            else
//                return 0;
//        }
//     }

     @Override
     public String toString() {
         return "Passenger{" +
                 "name =" + this.getName()+
                 ", =checkedBags=" + checkedBags +
                 ", freeBags=" + freeBags +
                 ", memberLevel=" + rewardProgram.memberLevel +
                 ", memberDays=" + rewardProgram.memberDays +
                 ", perBagFee=" + perBagFee +
                 '}';
     }

     @Override
     public int compareTo(Passenger o) {
         if (rewardProgram.memberLevel > o.rewardProgram.memberLevel)
             return -1;
         else if (rewardProgram.memberLevel < o.rewardProgram.memberLevel)
             return 1;
         else {
             if (rewardProgram.memberDays > o.rewardProgram.memberDays)
                 return -1;
             else if (rewardProgram.memberDays < o.rewardProgram.memberDays)
                 return 1;
             else
                 return 0;
         }
     }
 }
