package com.csc3020.hw04MidTermProject.go5621;
//*
// Author: Patricia Liu
// Homework 4 Midterm Project
// */
public class Hw04MidTermSource {
    public static void printFormattedLine() {
        System.out.println("\n---------------------------\n");
    }

    public static void main(String[] args) {
        printFormattedLine();

        //Overload
        System.out.println("Using Overloads\n");
        MathEquation oMathEquation1 = new MathEquation('d');
        try {
            System.out.println("result = " + oMathEquation1.execute(9.0d,4.0d));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        MathEquation oMathEquation2 = new MathEquation('d');
        try {
            System.out.println("result = " + oMathEquation2.execute(9,4));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        printFormattedLine();

        //Inheritance
        System.out.println("Using Inheritance\n");
        CalculateBase[] oCalculateBase = new CalculateBase[4];
        oCalculateBase[0] = new Divider(100, 50);
        oCalculateBase[1] = new Adder(25, 92);
        oCalculateBase[2] = new Subtractor(225, 17);
        oCalculateBase[3] = new Multiplier(11, 3);

        for (int i = 0; i < oCalculateBase.length; i++) {
            try {
                oCalculateBase[i].calculate();
                System.out.println("result = " + oCalculateBase[i].getResult());
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }

        printFormattedLine();

    }
}
