package com.csc3020.hw01.gh9893;

public class HW01Source {

    public static void main(String[] args) {

        double LVal[] = { 100.0, 25.0, 225.0, 11.0 };
        double RVal[] = { 50.0, 92.0, 17.0, 3.0 };
        double ans;

        System.out.print("LVal=");
        for (int i = 0; i < LVal.length; i++) {
            System.out.printf("  " + LVal[i]);
        }
        System.out.println();
        System.out.print("RVal=");
        for (int i = 0; i < RVal.length; i++) {
            System.out.printf("  " + RVal[i]);
        }
        System.out.println();
        char val = '+';
        System.out.print("Addition Result=");

        for (int i = 0; i < LVal.length; i++) {
            ans = op(val, LVal[i], RVal[i]);
            System.out.printf(ans + "   ");
        }
        System.out.println();

        val='-';
        System.out.print("Subtraction Result=");

        for (int i = 0; i < LVal.length; i++) {
            ans = op(val, LVal[i], RVal[i]);
            System.out.printf(ans + "   ");
        }
        System.out.println();

        val='/';
        System.out.print("Division Result=");

        for (int i = 0; i < LVal.length; i++) {
            ans = op(val, LVal[i], RVal[i]);
            System.out.printf(ans + "   ");
        }
        System.out.println();
        val='*';
        System.out.print("Multiplication Result=");

        for (int i = 0; i < LVal.length; i++) {
            ans = op(val, LVal[i], RVal[i]);
            System.out.printf(ans + "   ");
        }
        System.out.println();
    }

    private static double op(char c, double d, double e) {
        double ans = 0.0;
        switch (c) {
            case '+': {
                ans = d + e;
                break;
            }
            case '-': {
                ans = d - e;
                break;
            }
            case '*': {
                ans = d * e;
                break;
            }
            case '/': {
                ans = d / e;
                break;
            }
        }
        return ans;

    }

}

