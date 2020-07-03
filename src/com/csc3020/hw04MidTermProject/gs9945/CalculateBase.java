package com.csc3020.hw04MidTermProject.gs9945;

public abstract class CalculateBase {

    private double rightVal,
                    leftVal,
                    result;

    public double getRightVal() {
        return rightVal;
    }
    public double getLeftVal() {
        return leftVal;
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

    public CalculateBase(){

    }

    public CalculateBase(double rightVal, double leftVal){
        this.rightVal = rightVal;
        this.leftVal = leftVal;
    }

    public abstract void calculate();

}
