package com.csc3020.hw04MidTermProject.gl1193;

public class CalculateBase {
double leftVal;
double rightVal;
double result;

    public double getLeftVal() {
        return leftVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public double getResult() {
        return result;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public CalculateBase(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    double calculate() {
        return 0;
    }
}
