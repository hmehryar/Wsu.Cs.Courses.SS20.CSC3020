package com.csc3020.hw06.go5334;

public abstract class CalculateBase {
    private double leftVal;
    private double rightVal;
    private double result;

    public double getLeftVal() {
        return leftVal;
    }

    public void setLeftValue(double leftValue) {
        this.leftVal = leftValue;
    }

    public double getRightVal() {
        return rightVal;
    }

    public void setRightValue(double rightValue) {
        this.rightVal = rightValue;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public CalculateBase() {
    }

    public CalculateBase(double leftVal, double rightVal) {
        this();
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public abstract void calculate();
}