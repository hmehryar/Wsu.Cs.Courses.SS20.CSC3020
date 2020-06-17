package com.csc3020.hw01.gv7006;

public class Hw01Source {
    public static void main(String[] args) {
        double[] arrL = { 3, 7, 4, 5 };
        double[] arrR = { 1, 6, 8, 2 };

        System.out.print("Left Values = ");
        for (double val : arrL) {
            System.out.printf("%f\t", val);
        }
        System.out.println();

        System.out.print("Right Values = ");
        for (double val : arrR) {
            System.out.printf("%f\t", val);
        }
        System.out.println();

        System.out.print("Addition Result = ");
        for (int i = 0; i < arrL.length; i++) {
            System.out.printf("%f\t", arrL[i] + arrR[i]);
        }
        System.out.println();

        System.out.print("Subtraction Result = ");
        for (int i = 0; i < arrL.length; i++) {
            System.out.printf("%f\t", arrL[i] - arrR[i]);
        }
        System.out.println();

        System.out.print("Division Result = ");
        for (int i = 0; i < arrL.length; i++) {
            if (arrR[i] == 0) {
                System.out.print("undef\t");
            }
            else {
                System.out.printf("%f\t", arrL[i] + arrR[i]);
            }
        }
        System.out.println();

        System.out.print("Multiplication Result = ");
        for (int i = 0; i < arrL.length; i++) {
            System.out.printf("%f\t", arrL[i] * arrR[i]);
        }
        System.out.println();
    }
}
