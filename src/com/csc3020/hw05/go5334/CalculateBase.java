package com.csc3020.hw05.go5334;

public abstract class CalculateBase {
    private double leftVal;
    private double rightVal;
    private double result;

    public double getLeftValue() {
        return leftVal;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public double getRightValue() {
        return rightVal;
    }

    public void setRightValue(double rightVal) {
        this.rightVal = rightVal;
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