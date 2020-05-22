package com.csc3020.lecture04.gz0715;

public class Lecture04Source {
    public static void main(String[] args) {
        System.out.println("gz0715: Saim Beg");

        //While Loop
        int iVal = 1;
        while(iVal < 100) {
            System.out.println(iVal);
            iVal *= 2;
        }

        //For Loop
        for (iVal = 1; iVal < 100; iVal *= 2) {
            System.out.println(iVal);
        }

        //Arrays
        float[] theVals = {10.00f, 30.0f, 55.0f};

        float sum = 0;
        for (int i = 0; i < theVals.length; i++) {
            sum += theVals[i];
        }
        System.out.println(sum);

        sum = 0;
        for (float val : theVals) {
            sum += val;
        }
        System.out.println(sum);

        //Switch statements
        iVal = 21;
        switch (iVal){
            case 1:
                System.out.println("It is 1");
                break;
            case 2:
                System.out.println("It is 2");
                break;
            case 10:
                System.out.println("It is 10");
                break;
            case 20:
                System.out.println("It is 20");
                break;
            default:
                System.out.println("Invalid");
        }


    }
}
