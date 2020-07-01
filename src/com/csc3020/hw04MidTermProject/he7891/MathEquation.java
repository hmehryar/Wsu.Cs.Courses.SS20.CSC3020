package com.csc3020.hw04MidTermProject.he7891;
/*
 * Author: Nathan Tattrie
 * Student ID: he7891
 * Homework Assignment 04
 * MathEquation.java
 * */

public class MathEquation {

    private double leftValDouble;
    private double rightValDouble;
    private int leftValInt;
    private int rightValInt;
    private char opCode;

    // MathEquation Classes
    public MathEquation() {}

    // Overload Item Step 1
    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    public MathEquation(double leftVal, double rightVal, char opCode) {
        this.leftValDouble = leftVal;
        this.rightValDouble = rightVal;
        this.opCode = opCode;
    }
    public MathEquation(int leftVal, int rightVal, char opCode) {
        this.leftValInt = leftVal;
        this.rightValInt = rightVal;
        this.opCode = opCode;
    }

    // GETTERS
    public double getLeftValDouble() {
        return leftValDouble;
    }
    public double getRightValDouble() {
        return rightValDouble;
    }
    public double getLeftValInt() {
        return leftValInt;
    }
    public double getRightValInt() {
        return rightValInt;
    }

    // Overload Item Step 2
    // MathEquation execute function with doubles
    public void execute(double leftVal, double rightVal) {
        switch (opCode) {
            case 'd':
                if (rightVal != 0) {
                    System.out.print("result = " + (leftVal / rightVal));
                } else {
                    System.out.println("DIVIDE BY 0 ERROR!");
                }
                break;
            case 'a':
                System.out.print("result = " + (leftVal + rightVal));
                break;
            case 's':
                System.out.print("result = " + (leftVal - rightVal));
                break;
            case 'm':
                System.out.print("result = " + (leftVal * rightVal));
                break;
            default:
                System.out.println("Incorrect or no operation set.");
        }
        System.out.println();
    }

    // Overload Item Step 3
    // MathEquation execute function with integers
    public void execute(int leftVal, int rightVal) {
        switch (opCode) {
            case 'd':
                if (rightVal != 0) {
                    System.out.println("result = " + (int)(leftVal / (int)rightVal));
                } else {
                    System.out.println("DIVIDE BY 0 ERROR!");
                }
                break;
            case 'a':
                System.out.println("result = " + (int)(leftVal + (int)rightVal));
                break;
            case 's':
                System.out.println("result = " + (int)(leftVal - (int)rightVal));
                break;
            case 'm':
                System.out.println("result = " + (int)(leftVal * (int)rightVal));
                break;
            default:
                System.out.println("Incorrect or no operation set.");
        }
        System.out.println();
    }
}
