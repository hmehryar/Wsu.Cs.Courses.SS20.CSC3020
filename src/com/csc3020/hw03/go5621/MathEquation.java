package com.csc3020.hw03.go5621;
//*
// Author: Patricia Liu
// Homework 3: MathEquation Class
// */
public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    public MathEquation(double leftVal, double rightVal, char opCode) {
        this(leftVal, rightVal);
        this.opCode = opCode;
    }

    private MathEquation(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public void execute() throws Exception {
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                return;
            case 's':
                result = leftVal - rightVal;
                return;
            case 'd':
                if (rightVal != 0) {
                    result = leftVal / rightVal;
                } else {
                    throw new Exception("Undefined");
                }
                return;
            case 'm':
                result = leftVal * rightVal;
                return;
            default:
                throw new Exception("Invalid Operation");
        }
    }

    public double getResult() {
        return result;
    }
}
