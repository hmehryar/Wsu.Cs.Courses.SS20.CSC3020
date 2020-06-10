package com.csc3020.hw02.go5621;
//*
// Author: Patricia Liu
// Homework 2: MathEquation Class
// */
public class MathEquation {
    public double leftVal;
    public double rightVal;
    public char opCode;

    public MathEquation(double leftVal, double rightVal, char opCode) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        this.opCode = opCode;
    }

    public double execute() throws Exception {
        switch (opCode) {
            case 'a':
                return leftVal + rightVal;
            case 's':
                return leftVal - rightVal;
            case 'd':
                if (rightVal != 0) {
                    return leftVal / rightVal;
                } else {
                    throw new Exception("Undefined");
                }
            case 'm':
                return leftVal * rightVal;
            default:
                throw new Exception("Invalid Operation");
        }
    }
}
