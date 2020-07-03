package com.csc3020.hw04MidTermProject.gi3399;
//Author: George Esho

public abstract class CalculateBase {
    public double leftVal;
    public double rightVal;
    public double result;

    public double getLeftVal() {
        return leftVal;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public CalculateBase(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public abstract void calculate();
}
