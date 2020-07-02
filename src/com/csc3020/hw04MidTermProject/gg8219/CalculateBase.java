package com.csc3020.hw04MidTermProject.gg8219;

//This class is going to be the base for all 4 type of operations of your calculator
abstract class CalculateBase {
    //Add three properties leftVal,rightVal, and result which are double
    double leftVal;
    double rightVal;
    double result;

    //Implement Accessors and Mutators for all three properties
    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public void setResult(double result) {
        this.result = result;
    }


    public double getLeftVal() {
        return leftVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public double getResult() {
        return result;
    }


    //Implement a Constructor which takes two inputs (leftVal, and rightVal)
    CalculateBase(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    //Implement a void abstract method and name it calculate
    abstract double calculate();
}
