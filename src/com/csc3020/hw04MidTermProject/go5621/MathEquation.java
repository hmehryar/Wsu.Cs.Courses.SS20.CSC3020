package com.csc3020.hw04MidTermProject.go5621;
//*
// Author: Patricia Liu
// Homework 4: MathEquation Class
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

    public MathEquation(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    public double execute() throws Exception{
        result = execute(this.leftVal, this.rightVal);
        return result;
    }

    public double execute(int leftVal, int rightVal) throws Exception {
        //does not store the value in result since it uses external left and right values
        return (int)execute((double)leftVal, (double)rightVal);
    }

    public double execute(double leftVal, double rightVal) throws Exception{
        //does not store the value in result since it uses external left and right values
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

    public double getResult() {
        return result;
    }
}
