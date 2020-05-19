package com.csc3020.lecture04;

public class lecture04source01 {
    public static void main(String[]args){

        System.out.println("hm: Haydar Mehryar");

        //While Loop
        System.out.println("While Loop");
        int iVal = 1;
        while(iVal < 100) {
            System.out.println(iVal);
            iVal *= 2;
        }
        //For Loop
        System.out.println("For Loop");
        for (int iVal1 = 1; iVal1 < 100; iVal1*=2) {
            System.out.println(iVal1);
        }
        //Arrays
        float[] theVals={10.5f,30.0f, 55.0f};
        float sum=0;
        for (int index = 0; index < theVals.length; index++) {
            sum+=theVals[index];
        }

        System.out.println(sum);

        //ForEach
        sum=0;
        for(float val:theVals){
            sum+=val;
        }
        System.out.println(sum);

        int val=21;
        switch (val%2){
            case 0:
                System.out.print(val);
                System.out.println(" is even");
                break;
            case 1:
                System.out.print(val);
                System.out.println(" is odd");
                break;
            default:
                System.out.println("None of conditions happened");
                break;
        }
    }
}
