package com.csc3020.hw5.em0608;

//Base Class for 4 Operator Classes
public abstract class CalculateBase {
    double leftVal;
    double rightVal;
    double result;

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

    //Constructor for left and right Values
    public CalculateBase(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }


    public abstract void calculate() throws Exception;


}
