package com.csc3020.hw02.go5621;
//*
// Author: Patricia Liu
// Homework 2
// */
public class Hw02Source {
    public static MathEquation create(double l, double r, char op) {
        return new MathEquation(l, r, op);
    }

    public static void main(String[] args) {
        int size = 4;
        double[] leftValArray = {100, 25, 225, 11};
        double[] rightValArray = {50, 0, 17, 1};
        char[] opCodeArray = {'a', 'd', 'm', 's'};
        double[] resultArray = new double[size];

        MathEquation[] mathEquationArray = new MathEquation[size];

        //Use create() to fill array with instances of MathEquation
        for (int i = 0; i < size; i++) {
            mathEquationArray[i] = create(leftValArray[i], rightValArray[i], opCodeArray[i]);
        }

        //call MathEquation.execute(), store and print result
        for (int i = 0; i < size; i++) {
            try{
                resultArray[i] = mathEquationArray[i].execute();
                System.out.println(resultArray[i]);
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}
