package com.csc3020.hw03.he7891;
/*
 * Author: Nathan Tattrie
 * Student ID: he7891
 * Homework Assignment 03
 * MathEquation.java
 * */

public class MathEquation {
    /*
     * 1. Implement the accessors and mutators for the class properties, if it is needed.
     * 2. Implement the required constructor(s), and chain them together.
     *    You shall pay attention to the constructors access modifier (public or private)
     *    when you are implementing them.
     * */

    private char op;
    private float leftVal;
    private float rightVal;

    // MathEquation Classes
    public MathEquation() {}
    public MathEquation(float leftVal, float rightVal, char op) {
        this();
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        this.op = op;
    }

    // No no accessors or mutators (getters or setters) needed for this implementation.

    // MathEquation Method function
    public void execute(MathEquation oMathEquation) {
        switch (oMathEquation.op) {
            case 'd':
                if (oMathEquation.rightVal != 0) {
                    System.out.print("result = " + (oMathEquation.leftVal / oMathEquation.rightVal));
                } else {
                    System.out.println("DIVIDE BY 0 ERROR!");
                }
                break;
            case 'a':
                System.out.print("result = " + (oMathEquation.leftVal + oMathEquation.rightVal));
                break;
            case 's':
                System.out.print("result = " + (oMathEquation.leftVal - oMathEquation.rightVal));
                break;
            case 'm':
                System.out.print("result = " + (oMathEquation.leftVal * oMathEquation.rightVal));
                break;
            default:
                System.out.println("Incorrect or no operation set.");
        }
        System.out.println();
    }
}
