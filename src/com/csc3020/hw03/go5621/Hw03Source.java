package com.csc3020.hw03.go5621;
//*
// Author: Patricia Liu
// Homework 3
// */
public class Hw03Source {
   public static void main(String[] args) {
        MathEquation mathEquation1 = new MathEquation(100, 50, 'd');
        MathEquation mathEquation2 = new MathEquation(25, 92, 'a');
        MathEquation mathEquation3 = new MathEquation(225, 17, 's');
        MathEquation mathEquation4 = new MathEquation(11, 3, 'm');

        MathEquation[] mathEquationArray = {mathEquation1,
                                            mathEquation2,
                                            mathEquation3,
                                            mathEquation4};

        //call execute for each MathEquation object
        for (int i = 0; i < mathEquationArray.length; i++) {
            try{
                mathEquationArray[i].execute();
            } catch(Exception e) {
                System.out.println(e);
            }
        }

        //print results
        for (int i = 0; i < mathEquationArray.length; i++) {
            System.out.print("result = ");
            System.out.println(mathEquationArray[i].getResult());
        }
    }
}
