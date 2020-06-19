package com.csc3020.hw2.gn2289;

/*
Cs 3020 Homework 2
Ryan Kaszubski
 */

public class Hw2Source {
    public static void main(String[] args) {

        double[] leftVals = {100, 25, 225, 11};
        double[] rightVals = {50, 92, 17, 3};
        char op = 0;

        //I loop through the left and right values
        //put them into the create function
        //then load the results into another array

        //add the array values
        System.out.println("Addition");
        MathEquation[] add = new MathEquation[4];
        double[] addResults = new double[4];

        for (int i = 0; i < leftVals.length; i++) {
            add[i] = create(leftVals[i], rightVals[i], 'a');
        }

        for (int i = 0; i < 4; i++) {
            addResults[i] = add[i].solve();
            System.out.println(addResults[i]);
        }

        //subtraction results
        System.out.println("Subtraction");
        MathEquation[] sub = new MathEquation[4];
        double[] subResults = new double[4];

        for (int i = 0; i < leftVals.length; i++) {
            sub[i] = create(leftVals[i], rightVals[i], 's');
        }

        for (int i = 0; i < 4; i++) {
            subResults[i] = sub[i].solve();
            System.out.println(subResults[i]);
        }

        //mult results
        System.out.println("Multiplication");
        MathEquation[] mult = new MathEquation[4];
        double[] multResults = new double[4];

        for (int i = 0; i < leftVals.length; i++) {
            mult[i] = create(leftVals[i], rightVals[i], 'm');
        }

        for (int i = 0; i < 4; i++) {
            multResults[i] = mult[i].solve();
            System.out.println(multResults[i]);
        }

        //division results
        System.out.println("Division");
        MathEquation[] div = new MathEquation[4];
        double[] divResults = new double[4];

        for (int i = 0; i < leftVals.length; i++) {
            div[i] = create(leftVals[i], rightVals[i], 'd');
        }

        for (int i = 0; i < 4; i++) {
            divResults[i] = div[i].solve();
            System.out.println(divResults[i]);
        }

    }


    public static MathEquation create(double leftVals, double rightVals, char opCode) {
        //declare new object
        MathEquation oMathEquation = new MathEquation();
        //set everything up
        oMathEquation.setLeftValues(leftVals);
        oMathEquation.setRightValues(rightVals);
        oMathEquation.setOpCode(opCode);

        return oMathEquation;


    }
}
